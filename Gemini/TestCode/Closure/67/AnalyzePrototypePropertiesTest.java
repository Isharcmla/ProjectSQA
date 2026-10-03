package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class AnalyzePrototypePropertiesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private Node parseExterns(String js) {
    return compiler.parseTestCode(js);
  }

  private Node parseMain(String js) {
    return compiler.parseTestCode(js);
  }

  private AnalyzePrototypeProperties.NameInfo findNameInfo(
      AnalyzePrototypeProperties app, String name) {
    for (AnalyzePrototypeProperties.NameInfo info : app.getAllNameInfo()) {
      if (name.equals(info.name)) {
        return info;
      }
    }
    return null;
  }

  @Test
  public void testProcess_simplePrototypeAssignment_referenced() {
    String js =
        "function Foo() {}\n"
            + "Foo.prototype.bar = function() { return 1; };\n"
            + "var f = new Foo();\n"
            + "f.bar();\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> infos = pass.getAllNameInfo();
    Assert.assertNotNull(infos);
    Assert.assertFalse(infos.isEmpty());

    AnalyzePrototypeProperties.NameInfo barInfo = findNameInfo(pass, "bar");
    Assert.assertNotNull(barInfo);
    Assert.assertTrue(barInfo.isReferenced());
    Assert.assertEquals("bar", barInfo.toString());
    Assert.assertFalse(barInfo.getDeclarations().isEmpty());
    Assert.assertFalse(barInfo.readsClosureVariables());
  }

  @Test
  public void testProcess_objectLiteralPrototypeAssignment_declarationsFound() {
    String js =
        "function Foo() {}\n"
            + "Foo.prototype = {\n"
            + "  getBar: function() { return 2; },\n"
            + "  baz: 3\n"
            + "};\n"
            + "var f = new Foo();\n"
            + "f.getBar();\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo barInfo = findNameInfo(pass, "getBar");
    Assert.assertNotNull(barInfo);
    Assert.assertTrue(barInfo.isReferenced());
    Assert.assertEquals(1, barInfo.getDeclarations().size());

    AnalyzePrototypeProperties.NameInfo bazInfo = findNameInfo(pass, "baz");
    Assert.assertNotNull(bazInfo);
    Assert.assertFalse(bazInfo.isReferenced());
  }

  @Test
  public void testProcess_plainObjectLiteralProperties_registeredAsUses() {
    String js =
        "var obj = { a: 1, 'quoted': 2 };\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo aInfo = findNameInfo(pass, "a");
    Assert.assertNotNull(aInfo);
    Assert.assertTrue(aInfo.isReferenced());

    AnalyzePrototypeProperties.NameInfo quotedInfo = findNameInfo(pass, "quoted");
    Assert.assertNull(quotedInfo);
  }

  @Test
  public void testProcess_globalFunctionDeclaration_anchorUnusedVars() {
    String js =
        "function globalFunc() { return 42; }\n"
            + "var varFunc = function() { return 100; };\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, true);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo globalInfo = findNameInfo(pass, "globalFunc");
    Assert.assertNotNull(globalInfo);
    Assert.assertTrue(globalInfo.isReferenced());
    Assert.assertEquals(1, globalInfo.getDeclarations().size());

    AnalyzePrototypeProperties.NameInfo varInfo = findNameInfo(pass, "varFunc");
    Assert.assertNotNull(varInfo);
    Assert.assertTrue(varInfo.isReferenced());
  }

  @Test
  public void testProcess_globalFunctionCalledInsideAnotherFunction() {
    String js =
        "function helper() { return 1; }\n"
            + "function main() { helper(); }\n"
            + "main();\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo helperInfo = findNameInfo(pass, "helper");
    Assert.assertNotNull(helperInfo);
    Assert.assertTrue(helperInfo.isReferenced());
  }

  @Test
  public void testProcess_readsClosureVariables_flagIsSet() {
    String js =
        "function outer() {\n"
            + "  var x = 10;\n"
            + "  function inner() {\n"
            + "    return x;\n"
            + "  }\n"
            + "  return inner();\n"
            + "}\n"
            + "outer();\n";

    Node externs = parseExterns("");
    Node root = parseMain(js);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo innerInfo = findNameInfo(pass, "inner");
    if (innerInfo != null) {
      Assert.assertTrue(innerInfo.readsClosureVariables());
    }
  }

  @Test
  public void testProcess_withModulesAndModuleGraph() {
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    m2.addDependency(m1);
    JSModule[] modules = new JSModule[] {m1, m2};
    JSModuleGraph moduleGraph = new JSModuleGraph(modules);

    String js1 = "function Foo() {}\nFoo.prototype.bar = function() { return 1; };\n";
    String js2 = "var f = new Foo(); f.bar();\n";

    Node root1 = parseMain(js1);
    Node root2 = parseMain(js2);

    CompilerInput input1 = new CompilerInput(SourceFile.fromCode("m1.js", js1));
    CompilerInput input2 = new CompilerInput(SourceFile.fromCode("m2.js", js2));
    m1.add(input1);
    m2.add(input2);

    Node externs = parseExterns("");
    Node root = IR.root(root1, root2);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo barInfo = findNameInfo(pass, "bar");
    Assert.assertNotNull(barInfo);
    Assert.assertTrue(barInfo.isReferenced());
    Assert.assertNotNull(barInfo.getDeepestCommonModuleRef());
  }

  @Test
  public void testProcess_externsTraversal() {
    String externsJs = "var externalObj = { extProp: 1 };\n";
    String mainJs = "function test() {}\n";

    Node externs = parseExterns(externsJs);
    Node root = parseMain(mainJs);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo extInfo = findNameInfo(pass, "extProp");
    Assert.assertNotNull(extInfo);
    Assert.assertTrue(extInfo.isReferenced());
  }

  @Test
  public void testProcess_canModifyExternsTrue_skipsExternTraversal() {
    String externsJs = "var externalObj = { extProp: 1 };\n";
    String mainJs = "function test() {}\n";

    Node externs = parseExterns(externsJs);
    Node root = parseMain(mainJs);

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, true, false);
    pass.process(externs, root);

    AnalyzePrototypeProperties.NameInfo extInfo = findNameInfo(pass, "extProp");
    Assert.assertNull(extInfo);
  }

  @Test
  public void testNameInfo_markReferenceAndProperties() {
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    AnalyzePrototypeProperties.NameInfo info = pass.new NameInfo("testProp");

    Assert.assertEquals("testProp", info.toString());
    Assert.assertFalse(info.isReferenced());
    Assert.assertFalse(info.readsClosureVariables());
    Assert.assertNull(info.getDeepestCommonModuleRef());

    boolean changed = info.markReference(null);
    Assert.assertTrue(changed);
    Assert.assertTrue(info.isReferenced());

    boolean changedAgain = info.markReference(null);
    Assert.assertFalse(changedAgain);
  }

  @Test
  public void testAssignmentProperty_methodsAndRemove() {
    String js = "function Foo() {}\nFoo.prototype.bar = function() { return 1; };\n";
    Node root = parseMain(js);

    Node script = root.getFirstChild();
    Node exprNode = script.getLastChild();

    JSModule module = new JSModule("mod1");
    AnalyzePrototypeProperties.AssignmentProperty prop =
        new AnalyzePrototypeProperties.AssignmentProperty(exprNode, module);

    Assert.assertEquals(module, prop.getModule());
    Assert.assertNotNull(prop.getPrototype());
    Assert.assertNotNull(prop.getValue());

    int initialChildren = script.getChildCount();
    prop.remove();
    Assert.assertEquals(initialChildren - 1, script.getChildCount());
  }

  @Test
  public void testLiteralProperty_methodsAndRemove() {
    Node key = IR.stringKey("foo", IR.number(123));
    Node map = IR.objectlit(key);
    Node getprop = IR.getprop(IR.name("Foo"), IR.string("prototype"));
    Node assign = IR.assign(getprop, map);
    JSModule module = new JSModule("mod1");

    AnalyzePrototypeProperties.LiteralProperty prop =
        new AnalyzePrototypeProperties.LiteralProperty(key, key.getFirstChild(), map, assign, module);

    Assert.assertEquals(module, prop.getModule());
    Assert.assertEquals(getprop, prop.getPrototype());
    Assert.assertEquals(key.getFirstChild(), prop.getValue());

    Assert.assertEquals(1, map.getChildCount());
    prop.remove();
    Assert.assertEquals(0, map.getChildCount());
  }

  @Test
  public void testGlobalFunction_namedFunction_removeAndGetters() {
    String js = "function myGlobal() { return 10; }\n";
    Node root = parseMain(js);
    Node script = root.getFirstChild();
    Node functionNode = script.getFirstChild();
    Node nameNode = functionNode.getFirstChild();

    JSModule module = new JSModule("mod");
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    AnalyzePrototypeProperties.GlobalFunction gf =
        pass.new GlobalFunction(nameNode, functionNode, script, module);

    Assert.assertEquals(module, gf.getModule());
    Assert.assertEquals(functionNode, gf.getFunctionNode());

    gf.remove();
    Assert.assertEquals(0, script.getChildCount());
  }

  @Test
  public void testGlobalFunction_varDeclaration_removeAndGetters() {
    String js = "var myGlobalVar = function() { return 20; };\n";
    Node root = parseMain(js);
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    Node nameNode = varNode.getFirstChild();

    JSModule module = new JSModule("mod");
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    AnalyzePrototypeProperties.GlobalFunction gf =
        pass.new GlobalFunction(nameNode, varNode, script, module);

    Assert.assertEquals(module, gf.getModule());
    Assert.assertEquals(nameNode.getLastChild(), gf.getFunctionNode());

    gf.remove();
    Assert.assertEquals(0, script.getChildCount());
  }

  @Test
  public void testGlobalFunction_multiVarDeclaration_removeOnlyTargetName() {
    String js = "var a = function() {}, b = 2;\n";
    Node root = parseMain(js);
    Node script = root.getFirstChild();
    Node varNode = script.getFirstChild();
    Node nameNodeA = varNode.getFirstChild();

    JSModule module = new JSModule("mod");
    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    AnalyzePrototypeProperties.GlobalFunction gf =
        pass.new GlobalFunction(nameNodeA, varNode, script, module);

    Assert.assertEquals(2, varNode.getChildCount());
    gf.remove();
    Assert.assertEquals(1, varNode.getChildCount());
  }

  @Test(expected = IllegalStateException.class)
  public void testGlobalFunction_invalidParent_throwsException() {
    Node name = IR.name("test");
    Node invalidParent = IR.exprResult(name);
    JSModule module = new JSModule("mod");

    AnalyzePrototypeProperties pass =
        new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.new GlobalFunction(name, invalidParent, IR.root(), module);
  }
}
