package com.google.javascript.jscomp;

import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class GlobalNamespaceTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node parse(String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }

  // ---------------------------------------------------------------------
  // Normal / typical cases
  // ---------------------------------------------------------------------

  @Test
  public void testGetNameForest_simpleVarDeclaration_returnsNameNode() {
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    List<Name> forest = namespace.getNameForest();
    assertNotNull(forest);
    assertEquals(1, forest.size());
    assertEquals("a", forest.get(0).name);
  }

  @Test
  public void testGetNameIndex_simpleVarDeclaration_containsName() {
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("a"));
  }

  @Test
  public void testGetNameForest_nestedProperty_buildsTree() {
    Node root = parse("var a = {}; a.b = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("a"));
    assertTrue(index.containsKey("a.b"));
  }

  @Test
  public void testGetNameForest_withExterns_includesRootNames() {
    Node externs = parse("var extern1;");
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, externs, root);
    List<Name> forest = namespace.getNameForest();
    assertNotNull(forest);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("a"));
  }

  @Test
  public void testGetNameForest_functionDeclaration_recognizesFunctionType() {
    Node root = parse("function foo() {}");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("foo"));
    Name fooName = index.get("foo");
    assertEquals(Name.Type.FUNCTION, fooName.type);
  }

  @Test
  public void testGetNameForest_objectLiteral_recognizesObjectLitType() {
    Node root = parse("var a = {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name aName = index.get("a");
    assertEquals(Name.Type.OBJECTLIT, aName.type);
  }

  @Test
  public void testGetNameForest_prototypeAssignment_handlesPrototype() {
    Node root = parse("function Foo() {} Foo.prototype.bar = function() {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("Foo"));
    assertTrue(index.containsKey("Foo.prototype.bar"));
  }

  @Test
  public void testGetNameForest_calledMultipleTimes_returnsCachedResult() {
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    List<Name> forest1 = namespace.getNameForest();
    List<Name> forest2 = namespace.getNameForest();
    assertSame(forest1, forest2);
  }

  @Test
  public void testGetNameIndex_calledMultipleTimes_returnsCachedResult() {
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index1 = namespace.getNameIndex();
    Map<String, Name> index2 = namespace.getNameIndex();
    assertSame(index1, index2);
  }

  @Test
  public void testGetNameIndex_localVariable_notInGlobalNamespace() {
    Node root = parse("function foo() { var localVar = 1; }");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertFalse(index.containsKey("localVar"));
  }

  @Test
  public void testGetNameForest_aliasingGet_marksAliasingGet() {
    Node root = parse("var a = {}; var b = a;");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name aName = index.get("a");
    assertTrue(aName.aliasingGets > 0);
  }

  @Test
  public void testGetNameForest_callGet_marksCallGet() {
    Node root = parse("function foo() {} foo();");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name fooName = index.get("foo");
    assertTrue(fooName.callGets > 0);
  }

  @Test
  public void testGetNameForest_constructorAnnotation_setsClassOrEnum() {
    Node root = parse("/** @constructor */ var Foo = function() {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name fooName = index.get("Foo");
    assertNotNull(fooName);
    assertTrue(fooName.canCollapse());
  }

  @Test
  public void testGetNameForest_nestedAssignment_marksAliasingGetForInner() {
    Node root = parse("var b = {}; var a = b = {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name bName = index.get("b");
    assertNotNull(bName);
    assertTrue(bName.aliasingGets > 0);
  }

  @Test
  public void testGetNameForest_objectLitKeyNested_buildsQualifiedName() {
    Node root = parse("var w = {x: {y: {z: 0}}};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("w"));
    assertTrue(index.containsKey("w.x"));
    assertTrue(index.containsKey("w.x.y"));
    assertTrue(index.containsKey("w.x.y.z"));
  }

  @Test
  public void testGetNameForest_orExpression_marksAliasingGet() {
    Node root = parse("var a = {}; var c = a || {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name aName = index.get("a");
    assertNotNull(aName);
    assertTrue(aName.aliasingGets > 0);
  }

  @Test
  public void testGetNameForest_hookExpression_marksAliasingGet() {
    Node root = parse("var cond = true; var a = {}; var b = cond ? a : {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name aName = index.get("a");
    assertNotNull(aName);
    assertTrue(aName.aliasingGets > 0);
  }

  @Test
  public void testGetNameForest_newExpression_marksDirectGet() {
    Node root = parse("function Foo() {} var f = new Foo();");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name fooName = index.get("Foo");
    assertNotNull(fooName);
    assertTrue(fooName.totalGets > 0);
  }

  @Test
  public void testGetNameForest_assignToProperty_handlesPropAssign() {
    Node root = parse("var a = {}; a.b = function() {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    Name abName = index.get("a.b");
    assertNotNull(abName);
    assertEquals(Name.Type.FUNCTION, abName.type);
  }

  // ---------------------------------------------------------------------
  // Edge cases
  // ---------------------------------------------------------------------

  @Test
  public void testGetNameForest_emptyScript_returnsEmptyList() {
    Node root = parse("");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    List<Name> forest = namespace.getNameForest();
    assertTrue(forest.isEmpty());
  }

  @Test
  public void testGetNameIndex_emptyScript_returnsEmptyMap() {
    Node root = parse("");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.isEmpty());
  }

  @Test
  public void testGetNameForest_stringLiteralNotObjectLitKey_notAdded() {
    Node root = parse("var x = 'hello';");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("x"));
    // The string literal itself should not create any additional name entries
    assertEquals(1, index.size());
  }

  @Test
  public void testGetNameForest_functionExpression_notTreatedAsSet() {
    Node root = parse("var f = function foo() {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("f"));
    // "foo" is the name of a function expression, should not be added
    assertFalse(index.containsKey("foo"));
  }

  @Test
  public void testScanNewNodes_withEmptyNodeSet_doesNotAlterNamespace() {
    Node root = parse("var a = {};");
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    // populate the namespace first
    namespace.getNameForest();

    ScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    Scope globalScope = scopeCreator.createScope(root, null);

    Set<Node> newNodes = new HashSet<Node>();
    // Should not throw an exception when given an empty set of new nodes.
    namespace.scanNewNodes(globalScope, newNodes);

    Map<String, Name> index = namespace.getNameIndex();
    assertTrue(index.containsKey("a"));
  }

  // ---------------------------------------------------------------------
  // Exception cases
  // ---------------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testGetNameForest_nullRoot_throwsNullPointerException() {
    GlobalNamespace namespace = new GlobalNamespace(compiler, null);
    namespace.getNameForest();
  }

  @Test(expected = NullPointerException.class)
  public void testGetNameForest_nullCompiler_throwsNullPointerException() {
    Node root = parse("var a = 1;");
    GlobalNamespace namespace = new GlobalNamespace(null, root);
    namespace.getNameForest();
  }

  @Test(expected = NullPointerException.class)
  public void testGetNameIndex_nullRoot_throwsNullPointerException() {
    GlobalNamespace namespace = new GlobalNamespace(compiler, null);
    namespace.getNameIndex();
  }
}
