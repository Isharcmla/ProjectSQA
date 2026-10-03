package com.google.javascript.jscomp;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GlobalNamespaceTest {

  private Compiler compiler = new Compiler();

  private GlobalNamespace createNamespace(String js) {
    Node root = compiler.parseTestCode(js);
    return new GlobalNamespace(compiler, root);
  }

  private GlobalNamespace createNamespaceWithExterns(String externsJs, String js) {
    Node externs = compiler.parseTestCode(externsJs);
    Node root = compiler.parseTestCode(js);
    return new GlobalNamespace(compiler, externs, root);
  }

  @Test
  public void testGetNameForestAndIndex_simpleVar_createdCorrectly() {
    GlobalNamespace gn = createNamespace("var a = 1;");
    List<GlobalNamespace.Name> forest = gn.getNameForest();
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertEquals(1, forest.size());
    assertEquals("a", forest.get(0).name);
    assertTrue(index.containsKey("a"));
    assertEquals(1, index.get("a").globalSets);
    assertEquals(0, index.get("a").totalGets);
    assertEquals(GlobalNamespace.Name.Type.OTHER, index.get("a").type);
    assertTrue(index.get("a").isSimpleName());
  }

  @Test
  public void testGetNameForest_lazyProcessing_processesOnlyOnce() {
    GlobalNamespace gn = createNamespace("var a = 1;");
    List<GlobalNamespace.Name> forest1 = gn.getNameForest();
    List<GlobalNamespace.Name> forest2 = gn.getNameForest();
    assertSame(forest1, forest2);
  }

  @Test
  public void testGetNameIndex_lazyProcessing_processesOnlyOnce() {
    GlobalNamespace gn = createNamespace("var a = 1;");
    Map<String, GlobalNamespace.Name> index1 = gn.getNameIndex();
    Map<String, GlobalNamespace.Name> index2 = gn.getNameIndex();
    assertSame(index1, index2);
  }

  @Test
  public void testObjectLiteralAndNestedProperties() {
    String js = "var a = { b: { c: 1, 'invalid-ident': 2 } };";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertTrue(index.containsKey("a"));
    assertTrue(index.containsKey("a.b"));
    assertTrue(index.containsKey("a.b.c"));
    assertFalse(index.containsKey("a.b.invalid-ident"));
    assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("a").type);
    assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("a.b").type);
    assertEquals(GlobalNamespace.Name.Type.OTHER, index.get("a.b.c").type);
    assertFalse(index.get("a.b").isSimpleName());
  }

  @Test
  public void testObjectLiteralAssignedToProperty() {
    String js = "var a = {}; a.b = { c: function() {} };";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertTrue(index.containsKey("a"));
    assertTrue(index.containsKey("a.b"));
    assertTrue(index.containsKey("a.b.c"));
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("a.b.c").type);
  }

  @Test
  public void testFunctionDeclarations() {
    String js = "function foo() {} var bar = function() {};";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertTrue(index.containsKey("foo"));
    assertTrue(index.containsKey("bar"));
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("foo").type);
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("bar").type);
  }

  @Test
  public void testGetOperations_variousContexts() {
    String js = ""
        + "var a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;\n"
        + "if (a) {}\n"
        + "typeof b;\n"
        + "void c;\n"
        + "!d;\n"
        + "~e;\n"
        + "+f;\n"
        + "-g;\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    for (String varName : new String[]{"a", "b", "c", "d", "e", "f", "g"}) {
      assertTrue(index.containsKey(varName));
      assertEquals(1, index.get(varName).totalGets);
      assertEquals(0, index.get(varName).aliasingGets);
    }
  }

  @Test
  public void testCallAndNewGet() {
    String js = "var a = function() {}; var b = function() {}; var c = 1;\n"
        + "a(c);\n"
        + "new b(c);\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertEquals(1, index.get("a").callGets);
    assertEquals(1, index.get("b").totalGets);
    assertEquals(0, index.get("b").callGets);
    assertEquals(2, index.get("c").aliasingGets);
  }

  @Test
  public void testHookAndBooleanExpressions() {
    String js = ""
        + "var a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;\n"
        + "var a = a || {};\n"
        + "var b = b && {};\n"
        + "var c = c ? c : {};\n"
        + "var other = d || {};\n"
        + "var other2 = e ? e : {};\n"
        + "while (f || false) {}\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertTrue(index.containsKey("a"));
    assertTrue(index.containsKey("b"));
    assertTrue(index.containsKey("c"));
    assertTrue(index.containsKey("d"));
    assertTrue(index.containsKey("e"));
    assertTrue(index.containsKey("f"));

    assertTrue(index.get("d").aliasingGets > 0);
    assertTrue(index.get("e").aliasingGets > 0);
  }

  @Test
  public void testHookAndOrExpressions_inAncestors() {
    String js = ""
        + "var a = 1, b = 2, c = 3, d = 4, e = 5;\n"
        + "if (a || b) {}\n"
        + "for (; c || false; ) {}\n"
        + "typeof (d ? 1 : 2);\n"
        + "!(e || false);\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertEquals(0, index.get("a").aliasingGets);
    assertEquals(0, index.get("b").aliasingGets);
    assertEquals(0, index.get("c").aliasingGets);
  }

  @Test
  public void testHookConditionDirectGet() {
    String js = "var a = true; var b = 1; var c = 2; var res = (a ? b : c);";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertEquals(1, index.get("a").totalGets);
    assertEquals(0, index.get("a").aliasingGets);
  }

  @Test
  public void testNestedAssigns_createsTwinRef() {
    String js = "var a; var b; a = b = 1;";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name bName = index.get("b");
    assertNotNull(bName);
    assertEquals(1, bName.aliasingGets);
    assertNotNull(bName.declaration);
    assertNotNull(bName.declaration.getTwin());
    assertTrue(bName.declaration.isSet());
  }

  @Test
  public void testLocalScopeSetsAndGets() {
    String js = "var a = 1;\n"
        + "function f() {\n"
        + "  a = 2;\n"
        + "  var local = a;\n"
        + "  var nested = b = 3;\n"
        + "}\n"
        + "var b;\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name aName = index.get("a");
    assertEquals(1, aName.globalSets);
    assertEquals(1, aName.localSets);
    assertEquals(1, aName.totalGets);

    GlobalNamespace.Name bName = index.get("b");
    assertEquals(1, bName.localSets);
  }

  @Test
  public void testPrototypeHandling() {
    String js = ""
        + "function Foo() {}\n"
        + "Foo.prototype.bar = function() {};\n"
        + "Foo.prototype.baz.qux = 1;\n"
        + "var obj = { prototype: 1 };\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name foo = index.get("Foo");
    assertNotNull(foo);
    assertTrue(foo.totalGets >= 2);
  }

  @Test
  public void testExternsHandling() {
    String externs = "var ext; ext.prop = 1;";
    String js = "var a = ext.prop;";
    GlobalNamespace gn = createNamespaceWithExterns(externs, js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertTrue(index.containsKey("ext"));
    assertTrue(index.get("ext").inExterns);
    assertTrue(index.containsKey("a"));
    assertFalse(index.get("a").inExterns);
  }

  @Test
  public void testConstructorAndEnumDeclarations() {
    String js = ""
        + "/** @constructor */ function ClassA() {}\n"
        + "/** @constructor */ var ClassB = function() {};\n"
        + "var ns = {};\n"
        + "/** @constructor */ ns.ClassC = function() {};\n"
        + "/** @enum */ var MyEnum = { A: 1, B: 2 };\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name classA = index.get("ClassA");
    assertTrue(classA.canCollapse());

    GlobalNamespace.Name classB = index.get("ClassB");
    assertTrue(classB.canCollapse());

    GlobalNamespace.Name ns = index.get("ns");
    assertTrue(ns.isNamespace());

    GlobalNamespace.Name myEnum = index.get("MyEnum");
    assertTrue(myEnum.canCollapse());
  }

  @Test
  public void testValueType_orAndHook() {
    String js = ""
        + "var a = x || {};\n"
        + "var b = x || function() {};\n"
        + "var c = x ? {} : 1;\n"
        + "var d = x ? 1 : function() {};\n"
        + "var e = 1;\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("a").type);
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("b").type);
    assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("c").type);
    assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("d").type);
    assertEquals(GlobalNamespace.Name.Type.OTHER, index.get("e").type);
  }

  @Test
  public void testScanNewNodes() {
    String js = "var a = 1;";
    Node root = compiler.parseTestCode(js);
    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    gn.getNameIndex();

    Node newNode = Node.newString(Token.NAME, "a");
    Node assignNode = new Node(Token.ASSIGN, newNode, Node.newNumber(2));
    Node exprNode = new Node(Token.EXPR_RESULT, assignNode);

    Set<Node> newNodes = Sets.newHashSet(newNode, assignNode, exprNode);
    Scope globalScope = new SyntacticScopeCreator(compiler).createScope(root, null);

    gn.scanNewNodes(globalScope, newNodes);
    GlobalNamespace.Name aName = gn.getNameIndex().get("a");
    assertTrue(aName.globalSets >= 1);
  }

  @Test
  public void testName_addAndRemoveRef_allRefTypes() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
    GlobalNamespace.Ref setGlobal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref setLocal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref protoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);
    GlobalNamespace.Ref aliasGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref callGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);

    name.addRef(setGlobal);
    assertEquals(1, name.globalSets);
    assertEquals(setGlobal, name.declaration);

    GlobalNamespace.Ref setGlobal2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(setGlobal2);
    assertEquals(2, name.globalSets);

    name.addRef(setLocal);
    assertEquals(1, name.localSets);

    name.addRef(directGet);
    assertEquals(1, name.totalGets);

    name.addRef(protoGet);
    assertEquals(2, name.totalGets);

    name.addRef(aliasGet);
    assertEquals(3, name.totalGets);
    assertEquals(1, name.aliasingGets);

    name.addRef(callGet);
    assertEquals(4, name.totalGets);
    assertEquals(1, name.callGets);

    name.removeRef(setGlobal);
    assertEquals(1, name.globalSets);
    assertEquals(setGlobal2, name.declaration);

    name.removeRef(setGlobal2);
    assertEquals(0, name.globalSets);
    assertNull(name.declaration);

    name.removeRef(setLocal);
    assertEquals(0, name.localSets);

    name.removeRef(directGet);
    assertEquals(3, name.totalGets);

    name.removeRef(protoGet);
    assertEquals(2, name.totalGets);

    name.removeRef(aliasGet);
    assertEquals(1, name.totalGets);
    assertEquals(0, name.aliasingGets);

    name.removeRef(callGet);
    assertEquals(0, name.totalGets);
    assertEquals(0, name.callGets);
  }

  @Test
  public void testName_canEliminateAndCollapseProperties() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("a", null, false);
    name.type = GlobalNamespace.Name.Type.OBJECTLIT;
    name.globalSets = 1;

    assertTrue(name.canCollapse());
    assertTrue(name.canCollapseUnannotatedChildNames());
    assertTrue(name.canEliminate());

    GlobalNamespace.Name child = name.addProperty("b", false);
    child.type = GlobalNamespace.Name.Type.OTHER;
    child.globalSets = 1;
    assertTrue(name.canEliminate());

    child.inExterns = true;
    assertFalse(name.canEliminate());
    child.inExterns = false;

    name.totalGets = 1;
    assertFalse(name.canEliminate());
    name.totalGets = 0;

    name.localSets = 1;
    assertFalse(name.canCollapseUnannotatedChildNames());
    name.localSets = 0;

    name.type = GlobalNamespace.Name.Type.OTHER;
    assertFalse(name.canCollapseUnannotatedChildNames());
    name.type = GlobalNamespace.Name.Type.FUNCTION;
    assertTrue(name.canCollapseUnannotatedChildNames());

    name.globalSets = 0;
    name.localSets = 1;
    assertTrue(name.needsToBeStubbed());
  }

  @Test
  public void testName_fullNameAndToString() {
    GlobalNamespace.Name parent = new GlobalNamespace.Name("foo", null, false);
    GlobalNamespace.Name child = parent.addProperty("bar", false);
    GlobalNamespace.Name grandChild = child.addProperty("baz", false);

    assertEquals("foo.bar.baz", grandChild.fullName());
    String str = grandChild.toString();
    assertTrue(str.contains("foo.bar.baz"));
    assertTrue(str.contains("globalSets=0"));
  }

  @Test
  public void testRef_markTwinsAndClone() {
    GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref aliasRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

    GlobalNamespace.Ref.markTwins(setRef, aliasRef);
    assertSame(aliasRef, setRef.getTwin());
    assertSame(setRef, aliasRef.getTwin());

    GlobalNamespace.Ref cloned = setRef.cloneAndReclassify(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    assertEquals(GlobalNamespace.Ref.Type.SET_FROM_LOCAL, cloned.type);
    assertEquals(setRef.sourceName, cloned.sourceName);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRef_markTwins_invalidPair_throwsException() {
    GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref.markTwins(ref1, ref2);
  }

  @Test
  public void testDocInfoForDeclaration_functionAndVar() {
    String js = ""
        + "/** @constructor */ function Foo() {}\n"
        + "/** @param {string} x */ var bar = function(x) {};\n";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    assertNotNull(index.get("Foo").docInfo);
    assertTrue(index.get("Foo").docInfo.isConstructor());

    assertNotNull(index.get("bar").docInfo);
    assertTrue(index.get("bar").docInfo.hasType());
  }
}
