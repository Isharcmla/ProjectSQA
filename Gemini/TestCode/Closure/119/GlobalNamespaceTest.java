package com.google.javascript.jscomp;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GlobalNamespaceTest {

  private Compiler compile(String js) {
    return compile("", js);
  }

  private Compiler compile(String externs, String js) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        Lists.newArrayList(SourceFile.fromCode("externs.js", externs)),
        Lists.newArrayList(SourceFile.fromCode("testcode.js", js)),
        options);
    compiler.parseInputs();
    return compiler;
  }

  @Test
  public void testConstructorsAndBasicGetters() {
    Compiler compiler = compile("var a = 1;");
    Node root = compiler.getRoot().getLastChild();
    Node externsRoot = compiler.getRoot().getFirstChild();

    GlobalNamespace gnNoExterns = new GlobalNamespace(compiler, root);
    Assert.assertFalse(gnNoExterns.hasExternsRoot());
    Assert.assertNull(gnNoExterns.getParentScope());
    Assert.assertEquals(root.getParent(), gnNoExterns.getRootNode());

    GlobalNamespace gnWithExterns = new GlobalNamespace(compiler, externsRoot, root);
    Assert.assertTrue(gnWithExterns.hasExternsRoot());
    Assert.assertEquals(gnWithExterns, gnWithExterns.getScope(null));
    Assert.assertNotNull(gnWithExterns.getTypeOfThis());
  }

  @Test
  public void testBasicVarAndProperties() {
    String js = "var a = {}; a.b = 1; a.b; a.c = function() {};";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameA = gn.getSlot("a");
    Assert.assertNotNull(nameA);
    Assert.assertEquals(nameA, gn.getOwnSlot("a"));
    Assert.assertEquals("a", nameA.getBaseName());
    Assert.assertEquals("a", nameA.getName());
    Assert.assertEquals("a", nameA.getFullName());
    Assert.assertFalse(nameA.isTypeInferred());
    Assert.assertNull(nameA.getType());
    Assert.assertTrue(nameA.isSimpleName());
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, nameA.type);

    GlobalNamespace.Name nameAB = gn.getSlot("a.b");
    Assert.assertNotNull(nameAB);
    Assert.assertEquals("b", nameAB.getBaseName());
    Assert.assertEquals("a.b", nameAB.getFullName());
    Assert.assertFalse(nameAB.isSimpleName());
    Assert.assertEquals(nameA, nameAB.parent);

    List<GlobalNamespace.Name> forest = gn.getNameForest();
    Assert.assertEquals(1, forest.size());
    Assert.assertEquals(nameA, forest.get(0));

    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
    Assert.assertTrue(index.containsKey("a"));
    Assert.assertTrue(index.containsKey("a.b"));
    Assert.assertTrue(index.containsKey("a.c"));

    Iterable<GlobalNamespace.Name> symbols = gn.getAllSymbols();
    int count = 0;
    for (GlobalNamespace.Name sym : symbols) {
      count++;
    }
    Assert.assertEquals(index.size(), count);

    Iterable<GlobalNamespace.Ref> refsA = gn.getReferences(nameA);
    Assert.assertNotNull(refsA);
    Assert.assertNotNull(nameA.getDeclaration());
  }

  @Test
  public void testObjectLitKeysAndGettersSetters() {
    String js = "var obj = { simple: 10, nested: { prop: 20 }, get g() { return 1; }, set s(v) {} };";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Map<String, GlobalNamespace.Name> map = gn.getNameIndex();

    Assert.assertTrue(map.containsKey("obj"));
    Assert.assertTrue(map.containsKey("obj.simple"));
    Assert.assertTrue(map.containsKey("obj.nested"));
    Assert.assertTrue(map.containsKey("obj.nested.prop"));
    Assert.assertTrue(map.containsKey("obj.g"));
    Assert.assertTrue(map.containsKey("obj.s"));

    GlobalNamespace.Name g = map.get("obj.g");
    Assert.assertEquals(GlobalNamespace.Name.Type.GET, g.type);
    Assert.assertTrue(g.isGetOrSetDefinition());

    GlobalNamespace.Name s = map.get("obj.s");
    Assert.assertEquals(GlobalNamespace.Name.Type.SET, s.type);
    Assert.assertTrue(s.isGetOrSetDefinition());
  }

  @Test
  public void testFunctionAndTypeDeclarations() {
    String js =
        "/** @constructor */ function Constr() {}\n" +
        "/** @interface */ function Iface() {}\n" +
        "/** @enum {number} */ var MyEnum = { A: 1, B: 2 };\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Map<String, GlobalNamespace.Name> map = gn.getNameIndex();

    GlobalNamespace.Name constr = map.get("Constr");
    Assert.assertNotNull(constr);
    Assert.assertTrue(constr.isDeclaredType());
    Assert.assertEquals(GlobalNamespace.Name.Type.FUNCTION, constr.type);

    GlobalNamespace.Name iface = map.get("Iface");
    Assert.assertNotNull(iface);
    Assert.assertTrue(iface.isDeclaredType());

    GlobalNamespace.Name myEnum = map.get("MyEnum");
    Assert.assertNotNull(myEnum);
    Assert.assertTrue(myEnum.isDeclaredType());
  }

  @Test
  public void testFunctionExpressionAndIncDecAssignOp() {
    String js =
        "var x = 1;\n" +
        "x++;\n" +
        "--x;\n" +
        "x += 5;\n" +
        "var f = function namedLocal() {};\n" +
        "var obj = { a: 1 };\n" +
        "obj.a++;\n" +
        "obj.a += 2;\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Assert.assertNotNull(gn.getSlot("x"));
    Assert.assertNotNull(gn.getSlot("f"));
    Assert.assertNotNull(gn.getSlot("obj.a"));
    Assert.assertNull(gn.getSlot("namedLocal"));
  }

  @Test
  public void testLocalScopeSetsAndGets() {
    String js =
        "var a = 0;\n" +
        "function localScope() {\n" +
        "  var local = 1;\n" +
        "  a = 2;\n" +
        "  a = local = 3;\n" +
        "}\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameA = gn.getSlot("a");
    Assert.assertNotNull(nameA);
    Assert.assertEquals(1, nameA.globalSets);
    Assert.assertEquals(2, nameA.localSets);
    Assert.assertNull(gn.getSlot("local"));
  }

  @Test
  public void testNestedAssignInGlobalScope() {
    String js = "var a; var b; var c = b = a = 1;";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameA = gn.getSlot("a");
    Assert.assertNotNull(nameA);
    Assert.assertTrue(nameA.aliasingGets > 0);
  }

  @Test
  public void testExpressionsAndGetRefTypes() {
    String js =
        "var a = {};\n" +
        "var b = {};\n" +
        "if (a) {}\n" +
        "typeof a;\n" +
        "void a;\n" +
        "!a;\n" +
        "~a;\n" +
        "+a;\n" +
        "-a;\n" +
        "a instanceof Object;\n" +
        "delete a.prop;\n" +
        "var callTarget = function() {};\n" +
        "callTarget();\n" +
        "callTarget(a);\n" +
        "new callTarget();\n" +
        "new callTarget(b);\n" +
        "var cond1 = a || b;\n" +
        "var cond2 = a && b;\n" +
        "var hook = true ? a : b;\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name nameA = gn.getSlot("a");
    Assert.assertNotNull(nameA);
    Assert.assertTrue(nameA.totalGets > 0);

    GlobalNamespace.Name callTargetName = gn.getSlot("callTarget");
    Assert.assertNotNull(callTargetName);
    Assert.assertTrue(callTargetName.callGets > 0);
  }

  @Test
  public void testHookAndBooleanExpressionsInVariousContexts() {
    String js =
        "var a = 1, b = 2, c = 3;\n" +
        "var a = a || {};\n" +
        "a = a || {};\n" +
        "if (a || b) {}\n" +
        "while (a || b) {}\n" +
        "for (; a || b ;) {}\n" +
        "!(a || b);\n" +
        "~(a || b);\n" +
        "+(a || b);\n" +
        "-(a || b);\n" +
        "typeof (a || b);\n" +
        "void (a || b);\n" +
        "(a || b) instanceof Object;\n" +
        "(a ? b : c) ? 1 : 2;\n" +
        "delete (a || b);\n" +
        "var d = a || b;\n" +
        "var other = 10;\n" +
        "other = a || b;\n" +
        "callFn(a || b);\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Assert.assertNotNull(gn.getSlot("a"));
    Assert.assertNotNull(gn.getSlot("b"));
    Assert.assertNotNull(gn.getSlot("c"));
  }

  @Test
  public void testPrototypePrefixHandling() {
    String js =
        "function Foo() {}\n" +
        "Foo.prototype = {};\n" +
        "Foo.prototype.bar = function() {};\n" +
        "Foo.prototype.bar.baz = 1;\n" +
        "var x = Foo.prototype.bar;\n" +
        "Foo.prototype = { method: function() {} };\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name foo = gn.getSlot("Foo");
    Assert.assertNotNull(foo);
    Assert.assertNull(gn.getSlot("Foo.prototype.bar"));
  }

  @Test
  public void testValueTypeDetection() {
    String js =
        "var orVal = null || {};\n" +
        "var hookVal = true ? {} : function() {};\n" +
        "var hookOther = true ? 1 : 'str';\n" +
        "var hookSecond = true ? 1 : {};\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, gn.getSlot("orVal").type);
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, gn.getSlot("hookVal").type);
    Assert.assertEquals(GlobalNamespace.Name.Type.OTHER, gn.getSlot("hookOther").type);
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, gn.getSlot("hookSecond").type);
  }

  @Test
  public void testExternsHandling() {
    String externs = "var window; window.document = {};";
    String js = "window.myProp = 10; function test() { window.myProp = 20; }";
    Compiler compiler = compile(externs, js);
    Node externsRoot = compiler.getRoot().getFirstChild();
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, externsRoot, root);
    Map<String, GlobalNamespace.Name> map = gn.getNameIndex();

    GlobalNamespace.Name windowName = map.get("window");
    Assert.assertNotNull(windowName);
    Assert.assertTrue(windowName.inExterns);

    GlobalNamespace.Name winProp = map.get("window.myProp");
    Assert.assertNotNull(winProp);
    Assert.assertFalse(winProp.inExterns);
  }

  @Test
  public void testScanNewNodes() {
    String js = "var a = {};";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    Assert.assertNotNull(gn.getSlot("a"));
    Assert.assertNull(gn.getSlot("a.b"));

    Node newGetProp = IR.getprop(IR.name("a"), IR.string("b"));
    Node newAssign = IR.assign(newGetProp, IR.number(1));
    Node newExpr = IR.exprResult(newAssign);
    root.getLastChild().addChildToBack(newExpr);

    Node nonQualName = IR.number(42);

    Scope globalScope = new SyntacticScopeCreator(compiler).createScope(root, null);
    List<GlobalNamespace.AstChange> changes = new ArrayList<GlobalNamespace.AstChange>();
    changes.add(new GlobalNamespace.AstChange(null, globalScope, nonQualName));
    changes.add(new GlobalNamespace.AstChange(null, globalScope, newGetProp));

    gn.scanNewNodes(changes);
    Assert.assertNotNull(gn.getSlot("a.b"));
  }

  @Test
  public void testNameClassMethods() {
    GlobalNamespace.Name root = new GlobalNamespace.Name("ns", null, false);
    Assert.assertEquals("ns", root.getBaseName());
    Assert.assertEquals("ns", root.getFullName());
    Assert.assertEquals("ns", root.getName());
    Assert.assertTrue(root.isSimpleName());
    Assert.assertFalse(root.isDeclaredType());
    Assert.assertFalse(root.isNamespace());
    Assert.assertEquals(0, root.getRefs().size());

    GlobalNamespace.Name child = root.addProperty("Sub", false);
    Assert.assertEquals("Sub", child.getBaseName());
    Assert.assertEquals("ns.Sub", child.getFullName());
    Assert.assertFalse(child.isSimpleName());
    Assert.assertEquals(root, child.parent);
    Assert.assertEquals(1, root.props.size());

    root.type = GlobalNamespace.Name.Type.OBJECTLIT;
    child.setDeclaredType();
    Assert.assertTrue(child.isDeclaredType());
    Assert.assertTrue(root.isNamespace());

    GlobalNamespace.Ref refGlobalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    root.addRef(refGlobalSet);
    Assert.assertEquals(1, root.globalSets);
    Assert.assertEquals(refGlobalSet, root.getDeclaration());

    GlobalNamespace.Ref refLocalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    root.addRef(refLocalSet);
    Assert.assertEquals(1, root.localSets);

    GlobalNamespace.Ref refDirectGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    root.addRef(refDirectGet);
    Assert.assertEquals(1, root.totalGets);

    GlobalNamespace.Ref refAliasGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    root.addRef(refAliasGet);
    Assert.assertEquals(2, root.totalGets);
    Assert.assertEquals(1, root.aliasingGets);

    GlobalNamespace.Ref refCallGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    root.addRef(refCallGet);
    Assert.assertEquals(3, root.totalGets);
    Assert.assertEquals(1, root.callGets);

    GlobalNamespace.Ref refProtoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);
    root.addRef(refProtoGet);
    Assert.assertEquals(4, root.totalGets);

    GlobalNamespace.Ref refDelete = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DELETE_PROP);
    root.addRef(refDelete);
    Assert.assertEquals(1, root.deleteProps);

    String toStr = root.toString();
    Assert.assertTrue(toStr.contains("ns"));
    Assert.assertTrue(toStr.contains("globalSets=1"));

    root.removeRef(refDelete);
    Assert.assertEquals(0, root.deleteProps);
    root.removeRef(refProtoGet);
    Assert.assertEquals(3, root.totalGets);
    root.removeRef(refCallGet);
    Assert.assertEquals(2, root.totalGets);
    root.removeRef(refAliasGet);
    Assert.assertEquals(1, root.totalGets);
    root.removeRef(refDirectGet);
    Assert.assertEquals(0, root.totalGets);
    root.removeRef(refLocalSet);
    Assert.assertEquals(0, root.localSets);
    root.removeRef(refGlobalSet);
    Assert.assertEquals(0, root.globalSets);
    Assert.assertNull(root.getDeclaration());

    GlobalNamespace.Name stubName = new GlobalNamespace.Name("stub", null, false);
    Assert.assertFalse(stubName.needsToBeStubbed());
    stubName.addRef(refLocalSet);
    Assert.assertTrue(stubName.needsToBeStubbed());
  }

  @Test
  public void testNameCanCollapseAndCanEliminate() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("item", null, false);
    name.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Node dummyVar = IR.var(IR.name("item"));
    Ref dummyRef = new Ref(null, null, dummyVar.getFirstChild(), name, Ref.Type.SET_FROM_GLOBAL, 0);
    name.addRef(dummyRef);

    Assert.assertTrue(name.canCollapse());
    Assert.assertTrue(name.canCollapseUnannotatedChildNames());
    Assert.assertTrue(name.canEliminate());

    GlobalNamespace.Name sub = name.addProperty("sub", false);
    sub.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Node subGetProp = IR.getprop(IR.name("item"), IR.string("sub"));
    Ref subRef = new Ref(null, null, subGetProp, sub, Ref.Type.SET_FROM_GLOBAL, 1);
    sub.addRef(subRef);
    Assert.assertTrue(name.canEliminate());

    GlobalNamespace.Ref getRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    name.addRef(getRef);
    Assert.assertFalse(name.canEliminate());
    name.removeRef(getRef);

    name.type = GlobalNamespace.Name.Type.GET;
    Assert.assertFalse(name.canCollapse());
    name.type = GlobalNamespace.Name.Type.OBJECTLIT;

    GlobalNamespace.Name externName = new GlobalNamespace.Name("ext", null, true);
    Assert.assertFalse(externName.canCollapse());
  }

  @Test
  public void testRefClassMethods() {
    Node node = IR.name("x");
    GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);
    Ref ref1 = new Ref(null, null, node, name, Ref.Type.SET_FROM_GLOBAL, 0);

    Assert.assertEquals(node, ref1.getNode());
    Assert.assertEquals(name, ref1.getSymbol());
    Assert.assertNull(ref1.getModule());
    Assert.assertNull(ref1.getSourceFile());
    Assert.assertEquals("", ref1.getSourceName());
    Assert.assertTrue(ref1.isSet());
    Assert.assertNull(ref1.getTwin());

    Ref ref2 = new Ref(null, null, node, name, Ref.Type.ALIASING_GET, 1);
    Assert.assertFalse(ref2.isSet());

    Ref.markTwins(ref1, ref2);
    Assert.assertEquals(ref2, ref1.getTwin());
    Assert.assertEquals(ref1, ref2.getTwin());

    Ref cloned = ref1.cloneAndReclassify(Ref.Type.DIRECT_GET);
    Assert.assertEquals(Ref.Type.DIRECT_GET, cloned.type);
    Assert.assertEquals(ref1.preOrderIndex, cloned.preOrderIndex);
    Assert.assertEquals(ref1.node, cloned.node);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRefMarkTwinsInvalid() {
    Ref r1 = Ref.createRefForTesting(Ref.Type.DIRECT_GET);
    Ref r2 = Ref.createRefForTesting(Ref.Type.CALL_GET);
    Ref.markTwins(r1, r2);
  }

  @Test
  public void testIsSimpleStubDeclaration() {
    Node nameNode = IR.name("stubVar");
    Node expr = IR.exprResult(nameNode);
    GlobalNamespace.Name name = new GlobalNamespace.Name("stubVar", null, false);
    Ref ref = new Ref(null, null, nameNode, name, Ref.Type.DIRECT_GET, 0);

    Assert.assertFalse(name.isSimpleStubDeclaration());
    name.addRef(ref);
    Assert.assertTrue(name.isSimpleStubDeclaration());

    Node varNode = IR.var(IR.name("stubVar"));
    Ref ref2 = new Ref(null, null, varNode.getFirstChild(), name, Ref.Type.SET_FROM_GLOBAL, 1);
    name.addRef(ref2);
    Assert.assertFalse(name.isSimpleStubDeclaration());
  }

  @Test
  public void testGetDocInfoForDeclaration() {
    String js =
        "/** @constructor */ var DeclClass = function() {};\n" +
        "/** @type {number} */ var num = 10, second = 20;\n" +
        "var myObj = {};\n" +
        "/** @suppress {checkTypes} */ myObj.prop = function() {};\n";
    Compiler compiler = compile(js);
    Node root = compiler.getRoot().getLastChild();

    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    GlobalNamespace.Name declClass = gn.getSlot("DeclClass");
    Assert.assertNotNull(declClass);
    Assert.assertNotNull(declClass.getJSDocInfo());

    GlobalNamespace.Name num = gn.getSlot("num");
    Assert.assertNotNull(num);
    Assert.assertNotNull(num.getJSDocInfo());

    GlobalNamespace.Name prop = gn.getSlot("myObj.prop");
    Assert.assertNotNull(prop);
    Assert.assertNotNull(prop.getJSDocInfo());
  }

  @Test
  public void testTracker() {
    Compiler compiler = compile("var a = 1;");
    Node externs = compiler.getRoot().getFirstChild();
    Node root = compiler.getRoot().getLastChild();

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(
        compiler, ps, Predicates.<String>alwaysTrue());

    tracker.process(externs, root);
    String output1 = out.toString();
    Assert.assertTrue(output1.contains("a: Added by [Unknown pass]"));

    out.reset();
    Node emptyRoot = IR.block();
    tracker.process(externs, emptyRoot);
    String output2 = out.toString();
    Assert.assertTrue(output2.contains("a: Removed by [Unknown pass]"));
  }
}
