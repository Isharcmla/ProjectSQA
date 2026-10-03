package com.google.javascript.jscomp;

import com.google.common.collect.Sets;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class GlobalNamespaceTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private GlobalNamespace createNamespace(String js) {
    Node root = compiler.parseTestCode(js);
    return new GlobalNamespace(compiler, root);
  }

  private GlobalNamespace createNamespaceWithExterns(String externsJs, String codeJs) {
    Node externsRoot = compiler.parseSyntheticCode("externs.js", externsJs);
    Node mainRoot = compiler.parseTestCode(codeJs);
    Node root = new Node(Token.BLOCK, externsRoot, mainRoot);
    return new GlobalNamespace(compiler, externsRoot, root);
  }

  @Test
  public void testGetNameForest_emptyCode_returnsEmptyList() {
    GlobalNamespace gn = createNamespace("");
    List<GlobalNamespace.Name> forest = gn.getNameForest();
    Assert.assertNotNull(forest);
    Assert.assertTrue(forest.isEmpty());
  }

  @Test
  public void testGetNameIndex_simpleVar_containsVariable() {
    GlobalNamespace gn = createNamespace("var a = 1;");
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();
    Assert.assertTrue(index.containsKey("a"));
    GlobalNamespace.Name aName = index.get("a");
    Assert.assertEquals(1, aName.globalSets);
    Assert.assertEquals(0, aName.totalGets);
    Assert.assertTrue(aName.isSimpleName());
  }

  @Test
  public void testGetNameIndex_propertiesAndNestedObjects_builtCorrectly() {
    String js = "var a = { b: { c: 10 } }; a.b.c = 20; a.d = function() {};";
    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertTrue(index.containsKey("a"));
    Assert.assertTrue(index.containsKey("a.b"));
    Assert.assertTrue(index.containsKey("a.b.c"));
    Assert.assertTrue(index.containsKey("a.d"));

    GlobalNamespace.Name abc = index.get("a.b.c");
    Assert.assertFalse(abc.isSimpleName());
    Assert.assertEquals("a.b.c", abc.fullName());
    Assert.assertEquals(GlobalNamespace.Name.Type.OTHER, abc.type);

    GlobalNamespace.Name ad = index.get("a.d");
    Assert.assertEquals(GlobalNamespace.Name.Type.FUNCTION, ad.type);
  }

  @Test
  public void testGetNameForest_multipleRoots_returnsTopLevelNames() {
    String js = "var a = 1; var b = 2;";
    GlobalNamespace gn = createNamespace(js);
    List<GlobalNamespace.Name> forest = gn.getNameForest();

    Assert.assertEquals(2, forest.size());
    Assert.assertEquals("a", forest.get(0).name);
    Assert.assertEquals("b", forest.get(1).name);
  }

  @Test
  public void testProcess_withExterns_handlesExternDefinitions() {
    String externs = "var extObj = {};";
    String code = "extObj.foo = 1; var myVar = extObj.foo;";
    GlobalNamespace gn = createNamespaceWithExterns(externs, code);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertTrue(index.containsKey("extObj"));
    Assert.assertTrue(index.containsKey("extObj.foo"));
    Assert.assertTrue(index.containsKey("myVar"));
  }

  @Test
  public void testHandleGet_variousGetContexts() {
    String js = ""
        + "var a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8;\n"
        + "if (a) {}\n"
        + "typeof b;\n"
        + "void c;\n"
        + "!d;\n"
        + "~e;\n"
        + "+f;\n"
        + "-g;\n"
        + "h();\n"
        + "new h();\n"
        + "var alias = h;\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertEquals(1, index.get("a").totalGets);
    Assert.assertEquals(0, index.get("a").aliasingGets);
    Assert.assertEquals(1, index.get("h").callGets);
    Assert.assertTrue(index.get("h").aliasingGets > 0);
  }

  @Test
  public void testHandleGet_hookAndBooleanExpressions() {
    String js = ""
        + "var a = 1, b = 2, c = 3, d = 4;\n"
        + "var x = a || b;\n"
        + "var y = c ? d : a;\n"
        + "a = a || {};\n"
        + "b = b ? b : {};\n"
        + "while (a && b) {}\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertNotNull(index.get("a"));
    Assert.assertNotNull(index.get("b"));
    Assert.assertTrue(index.get("a").totalGets > 0);
  }

  @Test
  public void testHandleSetFromLocal_andNestedAssign() {
    String js = ""
        + "var a = 1, b = 2;\n"
        + "function foo() {\n"
        + "  a = 10;\n"
        + "  var c = (b = 20);\n"
        + "}\n"
        + "var d = (a = 30);\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name aName = index.get("a");
    Assert.assertTrue(aName.localSets >= 1);
    Assert.assertTrue(aName.globalSets >= 1);
    Assert.assertTrue(aName.aliasingGets >= 1);

    GlobalNamespace.Name bName = index.get("b");
    Assert.assertTrue(bName.localSets >= 1);
    Assert.assertTrue(bName.aliasingGets >= 1);
  }

  @Test
  public void testPrototypePrefix_handledCorrectly() {
    String js = ""
        + "function Foo() {}\n"
        + "Foo.prototype.bar = function() {};\n"
        + "Foo.prototype.baz.qux = 1;\n"
        + "var lit = { key: Foo.prototype };\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name foo = index.get("Foo");
    Assert.assertNotNull(foo);
    Assert.assertTrue(foo.totalGets > 0);
  }

  @Test
  public void testConstructorAndEnumDeclarations() {
    String js = ""
        + "/** @constructor */ var MyClass = function() {};\n"
        + "/** @enum {number} */ var MyEnum = { A: 1, B: 2 };\n"
        + "/** @constructor */ var AssignedClass;\n"
        + "AssignedClass = function() {};\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    GlobalNamespace.Name myClass = index.get("MyClass");
    Assert.assertNotNull(myClass);
    Assert.assertTrue(myClass.canCollapse());

    GlobalNamespace.Name myEnum = index.get("MyEnum");
    Assert.assertNotNull(myEnum);
    Assert.assertTrue(myEnum.isNamespace() || myEnum.canCollapse());
  }

  @Test
  public void testScanNewNodes_addsReferences() {
    String js = "var a = 1;";
    Node root = compiler.parseTestCode(js);
    GlobalNamespace gn = new GlobalNamespace(compiler, root);
    gn.getNameIndex();

    Node newVar = Node.newString(Token.NAME, "a");
    Node expr = new Node(Token.EXPR_RESULT, newVar);
    root.addChildToBack(expr);

    Scope globalScope = new SyntacticScopeCreator(compiler).createScope(root, null);
    gn.scanNewNodes(globalScope, Sets.newHashSet(newVar));

    GlobalNamespace.Name aName = gn.getNameIndex().get("a");
    Assert.assertEquals(1, aName.totalGets);
  }

  @Test
  public void testName_addAndRemoveRefs_updatesCounters() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
    Assert.assertEquals("test", name.toString().substring(0, 4));

    GlobalNamespace.Ref globalSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref localSet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref aliasingGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref callGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    GlobalNamespace.Ref protoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);

    name.addRef(globalSet);
    name.addRef(localSet);
    name.addRef(directGet);
    name.addRef(aliasingGet);
    name.addRef(callGet);
    name.addRef(protoGet);

    Assert.assertEquals(1, name.globalSets);
    Assert.assertEquals(1, name.localSets);
    Assert.assertEquals(4, name.totalGets);
    Assert.assertEquals(1, name.aliasingGets);
    Assert.assertEquals(1, name.callGets);
    Assert.assertEquals(globalSet, name.declaration);

    // Add a second global set to test declaration != null branch
    GlobalNamespace.Ref globalSet2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(globalSet2);
    Assert.assertEquals(2, name.globalSets);

    // Remove primary declaration
    name.removeRef(globalSet);
    Assert.assertEquals(1, name.globalSets);
    Assert.assertEquals(globalSet2, name.declaration);

    name.removeRef(localSet);
    name.removeRef(directGet);
    name.removeRef(aliasingGet);
    name.removeRef(callGet);
    name.removeRef(protoGet);
    name.removeRef(globalSet2);

    Assert.assertEquals(0, name.globalSets);
    Assert.assertEquals(0, name.localSets);
    Assert.assertEquals(0, name.totalGets);
    Assert.assertEquals(0, name.aliasingGets);
    Assert.assertEquals(0, name.callGets);
    Assert.assertNull(name.declaration);
  }

  @Test
  public void testName_canEliminate_andCanCollapse() {
    GlobalNamespace.Name parent = new GlobalNamespace.Name("Parent", null, false);
    parent.type = GlobalNamespace.Name.Type.OBJECTLIT;
    GlobalNamespace.Ref decl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    parent.addRef(decl);

    GlobalNamespace.Name child = parent.addProperty("child", false);
    child.type = GlobalNamespace.Name.Type.OBJECTLIT;
    GlobalNamespace.Ref childDecl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    child.addRef(childDecl);

    Assert.assertTrue(child.canCollapse());
    Assert.assertTrue(parent.canEliminate());

    parent.addRef(GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET));
    Assert.assertFalse(parent.canEliminate());
  }

  @Test
  public void testName_needsToBeStubbed() {
    GlobalNamespace.Name name = new GlobalNamespace.Name("foo", null, false);
    Assert.assertFalse(name.needsToBeStubbed());

    name.addRef(GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL));
    Assert.assertTrue(name.needsToBeStubbed());

    name.addRef(GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL));
    Assert.assertFalse(name.needsToBeStubbed());
  }

  @Test
  public void testName_setIsClassOrEnum_andIsNamespace() {
    GlobalNamespace.Name rootName = new GlobalNamespace.Name("ns", null, false);
    rootName.type = GlobalNamespace.Name.Type.OBJECTLIT;
    GlobalNamespace.Name subName = rootName.addProperty("sub", false);
    subName.type = GlobalNamespace.Name.Type.OBJECTLIT;
    GlobalNamespace.Name className = subName.addProperty("MyClass", false);

    className.setIsClassOrEnum();
    Assert.assertTrue(rootName.isNamespace());
    Assert.assertTrue(subName.isNamespace());
    Assert.assertFalse(className.isNamespace());
  }

  @Test
  public void testName_shouldKeepKeys() {
    GlobalNamespace.Name obj = new GlobalNamespace.Name("obj", null, false);
    obj.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Assert.assertFalse(obj.shouldKeepKeys());

    obj.addRef(GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET));
    Assert.assertTrue(obj.shouldKeepKeys());
  }

  @Test
  public void testRef_markTwinsAndClone() {
    GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref aliasRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

    Assert.assertTrue(setRef.isSet());
    Assert.assertFalse(aliasRef.isSet());
    Assert.assertNull(setRef.getTwin());

    GlobalNamespace.Ref.markTwins(setRef, aliasRef);
    Assert.assertEquals(aliasRef, setRef.getTwin());
    Assert.assertEquals(setRef, aliasRef.getTwin());

    GlobalNamespace.Ref cloned = setRef.cloneAndReclassify(GlobalNamespace.Ref.Type.DIRECT_GET);
    Assert.assertEquals(GlobalNamespace.Ref.Type.DIRECT_GET, cloned.type);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testRef_markTwins_invalidTypes_throwsException() {
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref callGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    GlobalNamespace.Ref.markTwins(directGet, callGet);
  }

  @Test
  public void testGetValueType_nestedHookAndOr() {
    String js = ""
        + "var a = x || function() {};\n"
        + "var b = y ? {} : function() {};\n"
        + "var c = z ? 1 : 2;\n";

    GlobalNamespace gn = createNamespace(js);
    Map<String, GlobalNamespace.Name> index = gn.getNameIndex();

    Assert.assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("a").type);
    Assert.assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("b").type);
    Assert.assertEquals(GlobalNamespace.Name.Type.OTHER, index.get("c").type);
  }
}
