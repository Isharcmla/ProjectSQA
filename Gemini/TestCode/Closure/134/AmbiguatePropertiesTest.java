package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

public class AmbiguatePropertiesTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private char[] reservedChars;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    reservedChars = new char[]{};
  }

  private Node createGetPropNode(String objName, String propName, JSType objType) {
    Node objNode = Node.newString(Token.NAME, objName);
    objNode.setJSType(objType);
    Node propNode = Node.newString(Token.STRING, propName);
    return new Node(Token.GETPROP, objNode, propNode);
  }

  private Node createObjectLitNode(String keyName, JSType objType, boolean quoted) {
    Node objLit = new Node(Token.OBJECTLIT);
    objLit.setJSType(objType);
    Node keyNode = Node.newString(Token.STRING, keyName);
    if (quoted) {
      keyNode.setQuotedString();
    }
    Node valueNode = Node.newNumber(0);
    objLit.addChildToBack(keyNode);
    objLit.addChildToBack(valueNode);
    return objLit;
  }

  private Node createGetElemNode(String objName, String propName, JSType objType) {
    Node objNode = Node.newString(Token.NAME, objName);
    objNode.setJSType(objType);
    Node keyNode = Node.newString(Token.STRING, propName);
    return new Node(Token.GETELEM, objNode, keyNode);
  }

  @Test
  public void testProcess_emptyRootAndExterns_renamingMapEmpty() {
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);

    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertNotNull(map);
    Assert.assertTrue(map.isEmpty());
  }

  @Test
  public void testProcess_basicAmbiguation_renamesPropertiesToShortest() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    FunctionType barCtor = registry.buildConstructor("Bar", null, null, null, null, false);
    ObjectType barType = barCtor.getInstanceType();

    Node root = new Node(Token.BLOCK);
    Node propFoo1 = createGetPropNode("foo", "propFoo", fooType);
    Node propBar1 = createGetPropNode("bar", "propBar", barType);
    root.addChildToBack(propFoo1);
    root.addChildToBack(propBar1);

    Node externs = new Node(Token.BLOCK);
    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("propFoo"));
    Assert.assertTrue(map.containsKey("propBar"));
    Assert.assertEquals("a", map.get("propFoo"));
    Assert.assertEquals("a", map.get("propBar"));
    Assert.assertEquals("a", propFoo1.getFirstChild().getNext().getString());
    Assert.assertEquals("a", propBar1.getFirstChild().getNext().getString());
  }

  @Test
  public void testProcess_sameTypeProperties_getDistinctNames() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node root = new Node(Token.BLOCK);
    Node propFoo1 = createGetPropNode("foo", "prop1", fooType);
    Node propFoo2 = createGetPropNode("foo", "prop2", fooType);
    root.addChildToBack(propFoo1);
    root.addChildToBack(propFoo2);

    Node externs = new Node(Token.BLOCK);
    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertEquals(2, map.size());
    Assert.assertNotEquals(map.get("prop1"), map.get("prop2"));
  }

  @Test
  public void testProcess_externProperties_notRenamed() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node extProp = createGetPropNode("window", "externProp", null);
    Node extObjLit = createObjectLitNode("externLitProp", null, false);
    externs.addChildToBack(extProp);
    externs.addChildToBack(extObjLit);

    Node root = new Node(Token.BLOCK);
    Node prop1 = createGetPropNode("foo", "externProp", fooType);
    Node prop2 = createGetPropNode("foo", "externLitProp", fooType);
    Node prop3 = createGetPropNode("foo", "localProp", fooType);
    root.addChildToBack(prop1);
    root.addChildToBack(prop2);
    root.addChildToBack(prop3);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey("externProp"));
    Assert.assertFalse(map.containsKey("externLitProp"));
    Assert.assertTrue(map.containsKey("localProp"));
  }

  @Test
  public void testProcess_quotedProperties_preventConflict() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node quotedLit = createObjectLitNode("a", fooType, true);
    Node getElem = createGetElemNode("foo", "b", fooType);
    Node propFoo = createGetPropNode("foo", "propFoo", fooType);

    root.addChildToBack(quotedLit);
    root.addChildToBack(getElem);
    root.addChildToBack(propFoo);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("propFoo"));
    Assert.assertNotEquals("a", map.get("propFoo"));
    Assert.assertNotEquals("b", map.get("propFoo"));
  }

  @Test
  public void testProcess_skipPrefixProperties_skipped() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node skipProp = createGetPropNode("foo", AmbiguateProperties.SKIP_PREFIX + "_test", fooType);
    Node normalProp = createGetPropNode("foo", "normalProp", fooType);
    root.addChildToBack(skipProp);
    root.addChildToBack(normalProp);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey(AmbiguateProperties.SKIP_PREFIX + "_test"));
    Assert.assertTrue(map.containsKey("normalProp"));
  }

  @Test
  public void testProcess_unquotedObjectLiteral_candidateForRenaming() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node objLit = createObjectLitNode("unquotedProp", fooType, false);
    root.addChildToBack(objLit);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("unquotedProp"));
  }

  @Test
  public void testProcess_invalidatingTypes_notRenamed() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    ObjectType anonymousType = registry.createAnonymousObjectType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node propUnknown = createGetPropNode("u", "propUnknown", unknownType);
    Node propObj = createGetPropNode("o", "propObj", objectType);
    Node propAnon = createGetPropNode("a", "propAnon", anonymousType);
    root.addChildToBack(propUnknown);
    root.addChildToBack(propObj);
    root.addChildToBack(propAnon);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey("propUnknown"));
    Assert.assertFalse(map.containsKey("propObj"));
    Assert.assertFalse(map.containsKey("propAnon"));
  }

  @Test
  public void testProcess_typeMismatchesInValidator_invalidatesTypes() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    FunctionType barCtor = registry.buildConstructor("Bar", null, null, null, null, false);
    ObjectType barType = barCtor.getInstanceType();

    compiler.getTypeValidator().addTypeMismatch(fooType, barType, null);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node propFoo = createGetPropNode("foo", "propFoo", fooType);
    root.addChildToBack(propFoo);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey("propFoo"));
  }

  @Test
  public void testProcess_typeMismatchWithUnionType_invalidatesUnionAlternates() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();
    FunctionType barCtor = registry.buildConstructor("Bar", null, null, null, null, false);
    ObjectType barType = barCtor.getInstanceType();

    UnionType union = (UnionType) registry.createUnionType(fooType, barType);
    FunctionType bazCtor = registry.buildConstructor("Baz", null, null, null, null, false);
    ObjectType bazType = bazCtor.getInstanceType();

    compiler.getTypeValidator().addTypeMismatch(union, bazType, null);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node propFoo = createGetPropNode("foo", "propFoo", fooType);
    root.addChildToBack(propFoo);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey("propFoo"));
  }

  @Test
  public void testProcess_inheritanceAndInterfaces_shareRelatedBitsets() {
    FunctionType ifaceCtor = registry.buildConstructor("MyInterface", null, null, null, null, true);
    ObjectType ifaceType = ifaceCtor.getInstanceType();

    FunctionType parentCtor = registry.buildConstructor("Parent", null, null, null, null, false);
    ObjectType parentType = parentCtor.getInstanceType();

    FunctionType childCtor = registry.buildConstructor("Child", null, null, null, null, false);
    childCtor.setPrototypeBasedOn(parentType);
    childCtor.setImplementedInterfaces(ImmutableList.of(ifaceType));
    ObjectType childType = childCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node prop1 = createGetPropNode("p", "parentProp", parentType);
    Node prop2 = createGetPropNode("c", "childProp", childType);
    Node prop3 = createGetPropNode("i", "ifaceProp", ifaceType);

    root.addChildToBack(prop1);
    root.addChildToBack(prop2);
    root.addChildToBack(prop3);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertEquals(3, map.size());
    Assert.assertNotEquals(map.get("parentProp"), map.get("childProp"));
    Assert.assertNotEquals(map.get("ifaceProp"), map.get("childProp"));
  }

  @Test
  public void testProcess_functionTypeAndPrototypeType_computedCorrectly() {
    FunctionType fnType = registry.buildConstructor("MyFn", null, null, null, null, false);
    ObjectType protoType = fnType.getPrototype();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node prop1 = createGetPropNode("fn", "fnProp", fnType);
    Node prop2 = createGetPropNode("proto", "protoProp", protoType);
    root.addChildToBack(prop1);
    root.addChildToBack(prop2);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("fnProp"));
    Assert.assertTrue(map.containsKey("protoProp"));
  }

  @Test
  public void testProcess_unionOfValidTypes_addsAlternates() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();
    FunctionType barCtor = registry.buildConstructor("Bar", null, null, null, null, false);
    ObjectType barType = barCtor.getInstanceType();

    UnionType unionType = (UnionType) registry.createUnionType(fooType, barType);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node propUnion = createGetPropNode("u", "unionProp", unionType);
    Node propFoo = createGetPropNode("f", "fooProp", fooType);
    root.addChildToBack(propUnion);
    root.addChildToBack(propFoo);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("unionProp"));
    Assert.assertTrue(map.containsKey("fooProp"));
    Assert.assertNotEquals(map.get("unionProp"), map.get("fooProp"));
  }

  @Test
  public void testProcess_nodeWithoutJSType_handledGracefully() {
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node objNode = Node.newString(Token.NAME, "foo");
    objNode.setJSType(null);
    Node propNode = Node.newString(Token.STRING, "noTypeProp");
    Node getProp = new Node(Token.GETPROP, objNode, propNode);
    root.addChildToBack(getProp);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertFalse(map.containsKey("noTypeProp"));
  }

  @Test
  public void testProcess_frequencyOrderingTieBreaking() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    // freq(zProp) = 2, freq(bProp) = 1, freq(aProp) = 1
    root.addChildToBack(createGetPropNode("foo", "zProp", fooType));
    root.addChildToBack(createGetPropNode("foo", "zProp", fooType));
    root.addChildToBack(createGetPropNode("foo", "bProp", fooType));
    root.addChildToBack(createGetPropNode("foo", "aProp", fooType));

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertEquals("a", map.get("zProp"));
    Assert.assertEquals("b", map.get("aProp"));
    Assert.assertEquals("c", map.get("bProp"));
  }

  @Test
  public void testProcess_reservedCharacters_respectedInNameGenerator() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    root.addChildToBack(createGetPropNode("foo", "prop1", fooType));

    char[] reserved = new char[]{'a'};
    AmbiguateProperties pass = new AmbiguateProperties(compiler, reserved);
    pass.process(externs, root);

    Map<String, String> map = pass.getRenamingMap();
    Assert.assertTrue(map.containsKey("prop1"));
    Assert.assertNotEquals("a", map.get("prop1"));
  }

  @Test
  public void testProcess_objectLitNonStringKey_ignored() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node extLit = new Node(Token.OBJECTLIT);
    extLit.addChildToBack(Node.newNumber(1));
    extLit.addChildToBack(Node.newNumber(100));
    externs.addChildToBack(extLit);

    Node root = new Node(Token.BLOCK);
    Node rootLit = new Node(Token.OBJECTLIT);
    rootLit.setJSType(fooType);
    rootLit.addChildToBack(Node.newNumber(2));
    rootLit.addChildToBack(Node.newNumber(200));
    root.addChildToBack(rootLit);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Assert.assertTrue(pass.getRenamingMap().isEmpty());
  }

  @Test
  public void testProcess_getElemNonStringChild_ignored() {
    FunctionType fooCtor = registry.buildConstructor("Foo", null, null, null, null, false);
    ObjectType fooType = fooCtor.getInstanceType();

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node objNode = Node.newString(Token.NAME, "foo");
    objNode.setJSType(fooType);
    Node elemIndex = Node.newNumber(0);
    Node getElem = new Node(Token.GETELEM, objNode, elemIndex);
    root.addChildToBack(getElem);

    AmbiguateProperties pass = new AmbiguateProperties(compiler, reservedChars);
    pass.process(externs, root);

    Assert.assertTrue(pass.getRenamingMap().isEmpty());
  }
}
