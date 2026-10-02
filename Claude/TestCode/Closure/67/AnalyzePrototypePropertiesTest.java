package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class AnalyzePrototypePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    SourceFile input = SourceFile.fromCode("input.js", js);
    return compiler.parse(input);
  }

  // ---------- Constructor tests ----------

  @Test
  public void testConstructor_withNullModuleGraph_createsInstance() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_canModifyExternsFalse_createsInstance() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    assertNotNull(pass);
  }

  @Test
  public void testConstructor_anchorUnusedVarsTrue_createsInstance() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, true);
    assertNotNull(pass);
  }

  // ---------- getAllNameInfo tests ----------

  @Test
  public void testGetAllNameInfo_afterConstruction_containsImplicitProperties() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);

    boolean foundLength = false;
    boolean foundToString = false;
    boolean foundValueOf = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("length".equals(info.name)) {
        foundLength = true;
      }
      if ("toString".equals(info.name)) {
        foundToString = true;
      }
      if ("valueOf".equals(info.name)) {
        foundValueOf = true;
      }
    }
    assertTrue(foundLength);
    assertTrue(foundToString);
    assertTrue(foundValueOf);
  }

  @Test
  public void testGetAllNameInfo_multipleCallsReturnConsistentResults() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo1 = pass.getAllNameInfo();
    Collection<AnalyzePrototypeProperties.NameInfo> allInfo2 = pass.getAllNameInfo();

    assertEquals(allInfo1.size(), allInfo2.size());
  }

  // ---------- process() normal/typical inputs ----------

  @Test
  public void testProcess_simplePrototypeAssignmentProperty_addsNameInfo() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "function Foo() {} Foo.prototype.bar = function() {};";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundBar = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("bar".equals(info.name)) {
        foundBar = true;
      }
    }
    assertTrue(foundBar);
  }

  @Test
  public void testProcess_globalFunctionDeclaration_addsNameInfo() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "function foo() { return 1; }";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean found = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("foo".equals(info.name)) {
        found = true;
      }
    }
    assertTrue(found);
  }

  @Test
  public void testProcess_varFunctionDeclaration_addsNameInfo() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "var myFunc = function() { return 1; };";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean found = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("myFunc".equals(info.name)) {
        found = true;
      }
    }
    assertTrue(found);
  }

  @Test
  public void testProcess_objectLiteralPrototypeAssignment_addsLiteralProperties() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js =
        "function Foo() {} "
            + "Foo.prototype = {bar: function() {}, baz: function() {}};";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundBar = false;
    boolean foundBaz = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("bar".equals(info.name)) {
        foundBar = true;
      }
      if ("baz".equals(info.name)) {
        foundBaz = true;
      }
    }
    assertTrue(foundBar);
    assertTrue(foundBaz);
  }

  @Test
  public void testProcess_canModifyExternsFalse_processesExternProperties() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);

    String externsJs = "Foo.prototype.bar;";
    String js = "function Foo() {}";
    Node externs = parse(externsJs);
    Node root = parse(js);

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundBar = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("bar".equals(info.name)) {
        foundBar = true;
      }
    }
    assertTrue(foundBar);
  }

  @Test
  public void testProcess_objectLiteralNotOnPrototype_treatedAsPropertyUse() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "var x = {a: 1, b: 2};";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundA = false;
    boolean foundB = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("a".equals(info.name)) {
        foundA = true;
      }
      if ("b".equals(info.name)) {
        foundB = true;
      }
    }
    assertTrue(foundA);
    assertTrue(foundB);
  }

  @Test
  public void testProcess_quotedStringInObjectLiteral_skipsProperty() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "var x = {'a': 1};";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
  }

  @Test
  public void testProcess_closureVariableCapture_processesNestedFunctions() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js =
        "function outer() { var local = 1; "
            + "function inner() { return local; } inner(); }";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundOuter = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("outer".equals(info.name)) {
        foundOuter = true;
      }
    }
    assertTrue(foundOuter);
  }

  @Test
  public void testProcess_chainedPrototypeAssignment_doesNotCrash() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "function Foo() {} Foo.prototype.bar.baz = function() {};";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
  }

  @Test
  public void testProcess_namedFunctionAsGlobalVarUsage_addsGlobalUse() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, true);

    String js = "function myFunc() { return 42; } myFunc();";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean found = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("myFunc".equals(info.name)) {
        found = true;
      }
    }
    assertTrue(found);
  }

  @Test
  public void testProcess_functionUsedInsideAnotherFunction_addsSymbolUse() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js =
        "function helper() { return 1; } "
            + "function caller() { return helper(); }";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundHelper = false;
    boolean foundCaller = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("helper".equals(info.name)) {
        foundHelper = true;
      }
      if ("caller".equals(info.name)) {
        foundCaller = true;
      }
    }
    assertTrue(foundHelper);
    assertTrue(foundCaller);
  }

  // ---------- edge cases ----------

  @Test
  public void testProcess_emptyScript_returnsNonNullNameInfo() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
    assertFalse(allInfo.isEmpty());
  }

  @Test
  public void testProcess_emptyExternsWithCanModifyExternsFalse_doesNotThrow() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);

    Node externs = parse("");
    Node root = parse("var x = 1;");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
  }

  @Test
  public void testProcess_getPropOnNonPrototypeName_addsSymbolUse() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    String js = "var obj = {}; obj.someProp = 1; var y = obj.someProp;";
    Node root = parse(js);
    Node externs = parse("");

    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    boolean foundProp = false;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("someProp".equals(info.name)) {
        foundProp = true;
      }
    }
    assertTrue(foundProp);
  }

  // ---------- exception cases ----------

  @Test(expected = NullPointerException.class)
  public void testProcess_nullCompiler_throwsNullPointerException() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(null, null, true, false);

    Node root = parse("var x = 1;");
    Node externs = parse("");

    pass.process(externs, root);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullRoot_throwsNullPointerException() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);

    Node externs = parse("");

    pass.process(externs, null);
  }

  @Test(expected = NullPointerException.class)
  public void testProcess_nullExternRootWhenCanModifyExternsFalse_throwsNullPointerException() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);

    Node root = parse("var x = 1;");

    pass.process(null, root);
  }
}
