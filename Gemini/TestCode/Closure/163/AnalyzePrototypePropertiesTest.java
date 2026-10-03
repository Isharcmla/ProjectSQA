package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Deque;

import static org.junit.Assert.*;

public class AnalyzePrototypePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    return compiler.parseTestCode(js);
  }

  private Node parseExterns(String js) {
    return compiler.parseSyntheticCode("externs", js);
  }

  @Test
  public void testProcess_basicPrototypeAssignmentAndUse() {
    String js = "function Foo() {}\n"
        + "Foo.prototype.bar = function() { return 1; };\n"
        + "var f = new Foo();\n"
        + "f.bar();\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
    assertFalse(allInfo.isEmpty());

    AnalyzePrototypeProperties.NameInfo barInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : allInfo) {
      if ("bar".equals(info.name)) {
        barInfo = info;
      }
    }

    assertNotNull(barInfo);
    assertTrue(barInfo.isReferenced());
    assertFalse(barInfo.readsClosureVariables());
    assertEquals("bar", barInfo.toString());
    assertEquals(1, barInfo.getDeclarations().size());
  }

  @Test
  public void testProcess_literalPrototypeProperty() {
    String js = "function Foo() {}\n"
        + "Foo.prototype = {\n"
        + "  bar: function() { return 2; },\n"
        + "  baz: 42\n"
        + "};\n"
        + "var f = new Foo();\n"
        + "f.bar();\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo barInfo = null;
    AnalyzePrototypeProperties.NameInfo bazInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("bar".equals(info.name)) {
        barInfo = info;
      } else if ("baz".equals(info.name)) {
        bazInfo = info;
      }
    }

    assertNotNull(barInfo);
    assertTrue(barInfo.isReferenced());
    assertEquals(1, barInfo.getDeclarations().size());

    assertNotNull(bazInfo);
    assertFalse(bazInfo.isReferenced());
    assertEquals(1, bazInfo.getDeclarations().size());
  }

  @Test
  public void testProcess_objectLiteralNonPrototype() {
    String js = "var obj = { x: 10, 'y': 20 };\n"
        + "function run() { return obj.x; }\n"
        + "run();\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo xInfo = null;
    AnalyzePrototypeProperties.NameInfo yInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("x".equals(info.name)) {
        xInfo = info;
      } else if ("y".equals(info.name)) {
        yInfo = info;
      }
    }

    assertNotNull(xInfo);
    assertTrue(xInfo.isReferenced());
  }

  @Test
  public void testProcess_globalFunctionDeclarationAndAnchorUnused() {
    String js = "function globalFunc() {}\n"
        + "var globalVarFunc = function() {};\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, true);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo funcInfo = null;
    AnalyzePrototypeProperties.NameInfo varFuncInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("globalFunc".equals(info.name)) {
        funcInfo = info;
      } else if ("globalVarFunc".equals(info.name)) {
        varFuncInfo = info;
      }
    }

    assertNotNull(funcInfo);
    assertTrue(funcInfo.isReferenced());
    assertEquals(1, funcInfo.getDeclarations().size());

    assertNotNull(varFuncInfo);
    assertTrue(varFuncInfo.isReferenced());
    assertEquals(1, varFuncInfo.getDeclarations().size());
  }

  @Test
  public void testProcess_closureVariableReading() {
    String js = "function outer() {\n"
        + "  var x = 1;\n"
        + "  function Foo() {}\n"
        + "  Foo.prototype.method = function() { return x; };\n"
        + "  return new Foo().method();\n"
        + "}\n"
        + "outer();\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo methodInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("method".equals(info.name)) {
        methodInfo = info;
      }
    }

    assertNotNull(methodInfo);
    assertTrue(methodInfo.readsClosureVariables());
  }

  @Test
  public void testProcess_modulesAndDependencyPropagation() {
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[]{m1, m2});

    Compiler moduleCompiler = new Compiler();
    moduleCompiler.initOptions(new CompilerOptions());

    String js1 = "function Foo() {}\n"
        + "Foo.prototype.propA = function() { return 1; };\n";
    String js2 = "var f = new Foo();\n"
        + "f.propA();\n";

    Node externs = moduleCompiler.parseSyntheticCode("externs", "");
    Node root = IR.block();

    Node root1 = moduleCompiler.parseSyntheticCode("m1.js", js1);
    Node root2 = moduleCompiler.parseSyntheticCode("m2.js", js2);
    root.addChildToBack(root1);
    root.addChildToBack(root2);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        moduleCompiler, moduleGraph, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo propAInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("propA".equals(info.name)) {
        propAInfo = info;
      }
    }

    assertNotNull(propAInfo);
    assertTrue(propAInfo.isReferenced());
  }

  @Test
  public void testProcess_canModifyExternsTrueAndFalse() {
    String externJs = "var externalObj; externalObj.extProp = 123;";
    String js = "function Foo() {}\n"
        + "Foo.prototype.bar = function() { return externalObj.extProp; };\n"
        + "new Foo().bar();\n";

    // canModifyExterns = false (traverses externs)
    Node externs1 = parseExterns(externJs);
    Node root1 = parse(js);
    AnalyzePrototypeProperties pass1 = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass1.process(externs1, root1);

    AnalyzePrototypeProperties.NameInfo extPropInfo1 = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass1.getAllNameInfo()) {
      if ("extProp".equals(info.name)) {
        extPropInfo1 = info;
      }
    }
    assertNotNull(extPropInfo1);
    assertTrue(extPropInfo1.isReferenced());

    // canModifyExterns = true (skips extern traversal)
    Node externs2 = parseExterns(externJs);
    Node root2 = parse(js);
    AnalyzePrototypeProperties pass2 = new AnalyzePrototypeProperties(
        compiler, null, true, false);
    pass2.process(externs2, root2);
    assertNotNull(pass2.getAllNameInfo());
  }

  @Test
  public void testProcess_nonFunctionPrototypePropertyAssign() {
    String js = "function Foo() {}\n"
        + "Foo.prototype.num = 123;\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo numInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("num".equals(info.name)) {
        numInfo = info;
      }
    }

    assertNotNull(numInfo);
    assertEquals(1, numInfo.getDeclarations().size());
  }

  @Test
  public void testProcess_anonymousFunctionAndNestedCalls() {
    String js = "(function() {\n"
        + "  var anon = function() { return 5; };\n"
        + "  anon();\n"
        + "})();\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    assertNotNull(pass.getAllNameInfo());
  }

  @Test
  public void testAssignmentProperty_methods() {
    String js = "function Foo() {}\n"
        + "Foo.prototype.bar = function() { return 1; };\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo barInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("bar".equals(info.name)) {
        barInfo = info;
      }
    }

    assertNotNull(barInfo);
    Deque<AnalyzePrototypeProperties.Symbol> decls = barInfo.getDeclarations();
    assertEquals(1, decls.size());

    AnalyzePrototypeProperties.AssignmentProperty prop =
        (AnalyzePrototypeProperties.AssignmentProperty) decls.getFirst();

    assertNull(prop.getModule());
    assertNotNull(prop.getPrototype());
    assertEquals(Token.GETPROP, prop.getPrototype().getType());
    assertNotNull(prop.getValue());
    assertEquals(Token.FUNCTION, prop.getValue().getType());

    prop.remove();
  }

  @Test
  public void testLiteralProperty_methods() {
    String js = "function Foo() {}\n"
        + "Foo.prototype = { bar: function() { return 1; } };\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo barInfo = null;
    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("bar".equals(info.name)) {
        barInfo = info;
      }
    }

    assertNotNull(barInfo);
    Deque<AnalyzePrototypeProperties.Symbol> decls = barInfo.getDeclarations();
    assertEquals(1, decls.size());

    AnalyzePrototypeProperties.LiteralProperty prop =
        (AnalyzePrototypeProperties.LiteralProperty) decls.getFirst();

    assertNull(prop.getModule());
    assertNotNull(prop.getPrototype());
    assertNotNull(prop.getValue());

    prop.remove();
  }

  @Test
  public void testGlobalFunction_declarationsAndRemoval() {
    String js = "function funcA() {}\n"
        + "var funcB = function() {};\n"
        + "var x = 1, funcC = function() {};\n";

    Node externs = parseExterns("");
    Node root = parse(js);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, false, true);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo aInfo = null;
    AnalyzePrototypeProperties.NameInfo bInfo = null;
    AnalyzePrototypeProperties.NameInfo cInfo = null;

    for (AnalyzePrototypeProperties.NameInfo info : pass.getAllNameInfo()) {
      if ("funcA".equals(info.name)) {
        aInfo = info;
      } else if ("funcB".equals(info.name)) {
        bInfo = info;
      } else if ("funcC".equals(info.name)) {
        cInfo = info;
      }
    }

    assertNotNull(aInfo);
    AnalyzePrototypeProperties.GlobalFunction funcADecl =
        (AnalyzePrototypeProperties.GlobalFunction) aInfo.getDeclarations().getFirst();
    assertNull(funcADecl.getModule());
    assertNotNull(funcADecl.getFunctionNode());
    funcADecl.remove();

    assertNotNull(bInfo);
    AnalyzePrototypeProperties.GlobalFunction funcBDecl =
        (AnalyzePrototypeProperties.GlobalFunction) bInfo.getDeclarations().getFirst();
    assertNotNull(funcBDecl.getFunctionNode());
    funcBDecl.remove();

    assertNotNull(cInfo);
    AnalyzePrototypeProperties.GlobalFunction funcCDecl =
        (AnalyzePrototypeProperties.GlobalFunction) cInfo.getDeclarations().getFirst();
    funcCDecl.remove();
  }

  @Test
  public void testNameInfo_markReferenceAndModules() {
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[]{m1, m2});

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, moduleGraph, false, false);

    AnalyzePrototypeProperties.NameInfo info = pass.new NameInfo("customProp");
    assertFalse(info.isReferenced());
    assertNull(info.getDeepestCommonModuleRef());

    boolean changed1 = info.markReference(m1);
    assertTrue(changed1);
    assertTrue(info.isReferenced());
    assertEquals(m1, info.getDeepestCommonModuleRef());

    boolean changed2 = info.markReference(m2);
    assertTrue(changed2);
    assertEquals(m1, info.getDeepestCommonModuleRef());

    boolean changed3 = info.markReference(m2);
    assertFalse(changed3);
  }
}
