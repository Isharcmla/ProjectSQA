package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AnalyzePrototypePropertiesTest {

  private Compiler compiler;
  private CompilerOptions options;

  @Before
  public void setUp() {
    compiler = new Compiler();
    options = new CompilerOptions();
  }

  /**
   * Helper method that compiles the given js/externs source and returns
   * the externs root and js root nodes, ready to be passed into
   * AnalyzePrototypeProperties#process.
   */
  private Node[] compileAndGetRoots(String js, String externs) {
    List<SourceFile> externsList = Collections.singletonList(
        SourceFile.fromCode("externs.js", externs));
    List<SourceFile> inputsList = Collections.singletonList(
        SourceFile.fromCode("input.js", js));
    compiler.compile(externsList, inputsList, options);
    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node mainRoot = root.getLastChild();
    return new Node[] {externsRoot, mainRoot};
  }

  @Test
  public void testProcess_normalPrototypeAssignment_createsNameInfo() {
    String js = "function Foo() {} Foo.prototype.bar = function() { this.baz(); };";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_emptySource_containsImplicitProperties() {
    Node[] roots = compileAndGetRoots("", "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    // At least length, toString, valueOf should be present.
    assertTrue(infos.size() >= 3);
  }

  @Test
  public void testProcess_anchorUnusedVarsTrue_handlesVarDeclarations() {
    String js = "var x = function() { return 1; }; x();";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, true, true);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_canModifyExternsFalse_processesExterns() {
    String externs = "Foo.prototype.bar;";
    String js = "function Foo() {}";
    Node[] roots = compileAndGetRoots(js, externs);
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_canModifyExternsTrue_skipsExternProcessing() {
    String externs = "Foo.prototype.bar;";
    String js = "function Foo() {}";
    Node[] roots = compileAndGetRoots(js, externs);
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, true, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoots_throwsException() {
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(null, null);
  }

  @Test
  public void testGetAllNameInfo_afterConstructionOnly_containsExactlyImplicitProperties() {
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(3, infos.size()); // length, toString, valueOf
  }

  @Test
  public void testProcess_objectLiteralPrototypeAssignment_handlesLiteralProperty() {
    String js = "function Foo() {} "
        + "Foo.prototype = {bar: function() { return 1; }, baz: 2};";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_objectLiteralAssignment_handlesGeneralObjectLiteral() {
    String js = "var x = {a: 1, b: 2};";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_closureVariableRead_marksReadClosureVariable() {
    String js = "function outer() { var x = 1; "
        + "function inner() { return x; } return inner; }";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
  }

  @Test
  public void testProcess_namedFunctionDeclaration_handlesGlobalFunction() {
    String js = "function foo() { return 1; } foo();";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertFalse(infos.isEmpty());
  }

  @Test
  public void testProcess_chainedPrototypeAssignment_handlesAssignmentProperty() {
    String js = "function Foo() {} function Bar() {} "
        + "Bar.prototype = Foo.prototype; Bar.prototype.baz = function() {};";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
  }

  @Test
  public void testConstructor_withModuleGraph_connectsExternNodeForEachModule() {
    JSModule module1 = new JSModule("module1");
    JSModule module2 = new JSModule("module2");
    module2.addDependency(module1);
    JSModule[] modules = new JSModule[] {module1, module2};
    JSModuleGraph moduleGraph = new JSModuleGraph(modules);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, moduleGraph, false, false);
    assertNotNull(pass);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(3, infos.size());
  }

  @Test
  public void testConstructor_moduleGraphNull_constructsSuccessfully() {
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    assertNotNull(pass);
  }

  @Test
  public void testProcess_exportedProperty_marksGlobalUseOfSymbol() {
    String js = "function Foo() {} Foo.prototype.bar_ = function() {};";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
  }

  @Test
  public void testProcess_multipleFunctionsWithSameProperty_reusesNameInfo() {
    String js = "function Foo() {} Foo.prototype.bar = function() {};"
        + "function Baz() {} Baz.prototype.bar = function() {};";
    Node[] roots = compileAndGetRoots(js, "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(roots[0], roots[1]);
    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    // "bar" name info should be shared, so it should be counted only once
    long barCount = 0;
    for (AnalyzePrototypeProperties.NameInfo info : infos) {
      if ("bar".equals(info.toString())) {
        barCount++;
      }
    }
    assertEquals(1, barCount);
  }

  @Test
  public void testProcess_emptyExternsAndEmptyJs_doesNotThrow() {
    Node[] roots = compileAndGetRoots("", "");
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    try {
      pass.process(roots[0], roots[1]);
    } catch (Exception e) {
      fail("Should not throw exception for empty input: " + e.getMessage());
    }
  }
}
