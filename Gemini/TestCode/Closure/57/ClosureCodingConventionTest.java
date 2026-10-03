package com.google.javascript.jscomp;

import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class ClosureCodingConventionTest {

  private ClosureCodingConvention conv;

  @Before
  public void setUp() {
    conv = new ClosureCodingConvention();
  }

  @Test
  public void testApplySubclassRelationship_inherits() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    FunctionType parentCtor = registry.createConstructorType("Parent", null, null, null);
    FunctionType childCtor = registry.createConstructorType("Child", null, null, null);

    conv.applySubclassRelationship(parentCtor, childCtor, SubclassType.INHERITS);

    Assert.assertTrue(childCtor.hasProperty("superClass_"));
    Assert.assertTrue(childCtor.getPrototype().hasProperty("constructor"));
  }

  @Test
  public void testApplySubclassRelationship_mixin() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    FunctionType parentCtor = registry.createConstructorType("Parent", null, null, null);
    FunctionType childCtor = registry.createConstructorType("Child", null, null, null);

    conv.applySubclassRelationship(parentCtor, childCtor, SubclassType.MIXIN);

    Assert.assertFalse(childCtor.hasProperty("superClass_"));
  }

  @Test
  public void testGetClassesDefinedByCall_googInherits() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.inherits"),
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.NAME, "SuperClass"));

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.INHERITS, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_googDollarInherits() {
    Node call = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog$inherits"),
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.NAME, "SuperClass"));

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.INHERITS, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_deprecatedInherits() {
    Node callName = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.STRING, "inherits"));
    Node call = new Node(Token.CALL,
        callName,
        Node.newString(Token.NAME, "SuperClass"));

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.INHERITS, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_googMixin() {
    Node subProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.STRING, "prototype"));
    Node superProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SuperClass"),
        Node.newString(Token.STRING, "prototype"));

    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.mixin"),
        subProto,
        superProto);

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.MIXIN, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_googDollarMixin() {
    Node subProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.STRING, "prototype"));
    Node superProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SuperClass"),
        Node.newString(Token.STRING, "prototype"));

    Node call = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog$mixin"),
        subProto,
        superProto);

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.MIXIN, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_deprecatedMixin() {
    Node callName = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.STRING, "mixin"));
    Node superProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SuperClass"),
        Node.newString(Token.STRING, "prototype"));
    Node call = new Node(Token.CALL, callName, superProto);

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNotNull(rel);
    Assert.assertEquals(SubclassType.MIXIN, rel.type);
    Assert.assertEquals("SubClass", rel.subclassName);
    Assert.assertEquals("SuperClass", rel.superclassName);
  }

  @Test
  public void testGetClassesDefinedByCall_mixinSuperNotEndingWithPrototype() {
    Node subProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.STRING, "prototype"));
    Node superNotProto = Node.newString(Token.NAME, "SuperClass");

    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.mixin"),
        subProto,
        superNotProto);

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNull(rel);
  }

  @Test
  public void testGetClassesDefinedByCall_mixinSubNotEndingWithPrototype() {
    Node subNotProto = Node.newString(Token.NAME, "SubClass");
    Node superProto = new Node(Token.GETPROP,
        Node.newString(Token.NAME, "SuperClass"),
        Node.newString(Token.STRING, "prototype"));

    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.mixin"),
        subNotProto,
        superProto);

    SubclassRelationship rel = conv.getClassesDefinedByCall(call);
    Assert.assertNull(rel);
  }

  @Test
  public void testGetClassesDefinedByCall_invalidCallArgCount() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.inherits"),
        Node.newString(Token.NAME, "SubClass"));
    Assert.assertNull(conv.getClassesDefinedByCall(call));

    Node call4 = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.inherits"),
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.NAME, "SuperClass"),
        Node.newString(Token.NAME, "Extra"));
    Assert.assertNull(conv.getClassesDefinedByCall(call4));
  }

  @Test
  public void testGetClassesDefinedByCall_nonQualifiedNames() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.inherits"),
        new Node(Token.HOOK, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c")),
        Node.newString(Token.NAME, "SuperClass"));
    Assert.assertNull(conv.getClassesDefinedByCall(call));
  }

  @Test
  public void testGetClassesDefinedByCall_unrecognizedMethodName() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.foo"),
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.NAME, "SuperClass"));
    Assert.assertNull(conv.getClassesDefinedByCall(call));

    Node callNameWithoutDollar = new Node(Token.CALL,
        Node.newString(Token.NAME, "inherits"),
        Node.newString(Token.NAME, "SubClass"),
        Node.newString(Token.NAME, "SuperClass"));
    Assert.assertNull(conv.getClassesDefinedByCall(callNameWithoutDollar));
  }

  @Test
  public void testIsSuperClassReference() {
    Assert.assertTrue(conv.isSuperClassReference("superClass_"));
    Assert.assertFalse(conv.isSuperClassReference("superClass"));
    Assert.assertFalse(conv.isSuperClassReference(""));
    Assert.assertFalse(conv.isSuperClassReference(null));
  }

  @Test
  public void testExtractClassNameIfProvide() {
    Node callee = NodeUtil.newQualifiedNameNode(conv, "goog.provide");
    Node arg = Node.newString("my.Class");
    Node call = new Node(Token.CALL, callee, arg);
    Node expr = new Node(Token.EXPR_RESULT, call);

    Assert.assertEquals("my.Class", conv.extractClassNameIfProvide(call, expr));
    Assert.assertNull(conv.extractClassNameIfProvide(call, call)); // parent is not EXPR_RESULT

    Node emptyCall = new Node(Token.CALL, callee);
    Node exprEmpty = new Node(Token.EXPR_RESULT, emptyCall);
    Assert.assertNull(conv.extractClassNameIfProvide(emptyCall, exprEmpty));

    Node nonGetpropCallee = new Node(Token.CALL, Node.newString(Token.NAME, "provide"), arg.cloneNode());
    Node exprNonGetprop = new Node(Token.EXPR_RESULT, nonGetpropCallee);
    Assert.assertNull(conv.extractClassNameIfProvide(nonGetpropCallee, exprNonGetprop));
  }

  @Test
  public void testExtractClassNameIfRequire() {
    Node callee = NodeUtil.newQualifiedNameNode(conv, "goog.require");
    Node arg = Node.newString("my.OtherClass");
    Node call = new Node(Token.CALL, callee, arg);
    Node expr = new Node(Token.EXPR_RESULT, call);

    Assert.assertEquals("my.OtherClass", conv.extractClassNameIfRequire(call, expr));
    Assert.assertNull(conv.extractClassNameIfRequire(call, new Node(Token.VAR)));
  }

  @Test
  public void testGetExportPropertyFunction() {
    Assert.assertEquals("goog.exportProperty", conv.getExportPropertyFunction());
  }

  @Test
  public void testGetExportSymbolFunction() {
    Assert.assertEquals("goog.exportSymbol", conv.getExportSymbolFunction());
  }

  @Test
  public void testIdentifyTypeDeclarationCall() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.addDependency"),
        Node.newString("file.js"),
        new Node(Token.ARRAYLIT, Node.newString("TypeA"), new Node(Token.NUMBER, 1.0), Node.newString("TypeB")),
        new Node(Token.ARRAYLIT));

    List<String> types = conv.identifyTypeDeclarationCall(call);
    Assert.assertNotNull(types);
    Assert.assertEquals(2, types.size());
    Assert.assertEquals("TypeA", types.get(0));
    Assert.assertEquals("TypeB", types.get(1));

    Node invalidCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.other"),
        Node.newString("file.js"));
    Assert.assertNull(conv.identifyTypeDeclarationCall(invalidCall));

    Node callShort = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.addDependency"),
        Node.newString("file.js"));
    Assert.assertNull(conv.identifyTypeDeclarationCall(callShort));

    Node callNonArray = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.addDependency"),
        Node.newString("file.js"),
        Node.newString("notAnArray"));
    Assert.assertNull(conv.identifyTypeDeclarationCall(callNonArray));
  }

  @Test
  public void testGetAbstractMethodName() {
    Assert.assertEquals("goog.abstractMethod", conv.getAbstractMethodName());
  }

  @Test
  public void testGetSingletonGetterClassName() {
    Node call = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.addSingletonGetter"),
        NodeUtil.newQualifiedNameNode(conv, "my.SingletonClass"));
    Assert.assertEquals("my.SingletonClass", conv.getSingletonGetterClassName(call));

    Node dollarCall = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog$addSingletonGetter"),
        NodeUtil.newQualifiedNameNode(conv, "my.SingletonClass"));
    Assert.assertEquals("my.SingletonClass", conv.getSingletonGetterClassName(dollarCall));

    Node wrongCount = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.addSingletonGetter"));
    Assert.assertNull(conv.getSingletonGetterClassName(wrongCount));

    Node otherCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.otherMethod"),
        NodeUtil.newQualifiedNameNode(conv, "my.SingletonClass"));
    Assert.assertNull(conv.getSingletonGetterClassName(otherCall));
  }

  @Test
  public void testApplySingletonGetter() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    FunctionType functionType = registry.createConstructorType("Foo", null, null, null);
    FunctionType getterType = registry.createFunctionType(functionType, new Node(Token.PARAM_LIST));
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    conv.applySingletonGetter(functionType, getterType, objectType);

    Assert.assertTrue(functionType.hasProperty("getInstance"));
    Assert.assertTrue(functionType.hasProperty("instance_"));
  }

  @Test
  public void testGetGlobalObject() {
    Assert.assertEquals("goog.global", conv.getGlobalObject());
  }

  @Test
  public void testIsPropertyTestFunction() {
    String[] propertyTests = {
        "goog.isDef", "goog.isNull", "goog.isDefAndNotNull",
        "goog.isString", "goog.isNumber", "goog.isBoolean",
        "goog.isFunction", "goog.isArray", "goog.isObject"
    };

    for (String fn : propertyTests) {
      Node call = new Node(Token.CALL, NodeUtil.newQualifiedNameNode(conv, fn));
      Assert.assertTrue("Expected true for " + fn, conv.isPropertyTestFunction(call));
    }

    Node notPropTest = new Node(Token.CALL, NodeUtil.newQualifiedNameNode(conv, "goog.isCustom"));
    Assert.assertFalse(conv.isPropertyTestFunction(notPropTest));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIsPropertyTestFunction_notCallNode() {
    conv.isPropertyTestFunction(Node.newString(Token.NAME, "goog.isDef"));
  }

  @Test
  public void testGetObjectLiteralCast() {
    Compiler compiler = new Compiler();
    NodeTraversal t = new NodeTraversal(compiler, null);

    Node validObjLit = new Node(Token.OBJECTLIT);
    Node validCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.reflect.object"),
        Node.newString(Token.NAME, "Type"),
        validObjLit);

    ObjectLiteralCast cast = conv.getObjectLiteralCast(t, validCall);
    Assert.assertNotNull(cast);
    Assert.assertEquals("Type", cast.typeName);
    Assert.assertEquals(validObjLit, cast.objectNode);

    // Call wrong function name
    Node wrongNameCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.reflect.other"),
        Node.newString(Token.NAME, "Type"),
        validObjLit.cloneNode());
    Assert.assertNull(conv.getObjectLiteralCast(t, wrongNameCall));

    // Call wrong child count
    Node wrongCountCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.reflect.object"),
        Node.newString(Token.NAME, "Type"));
    Assert.assertNull(conv.getObjectLiteralCast(t, wrongCountCall));

    // Call non qualified name type argument
    Node nonQualTypeCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.reflect.object"),
        new Node(Token.HOOK, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"), Node.newString(Token.NAME, "c")),
        validObjLit.cloneNode());
    Assert.assertNull(conv.getObjectLiteralCast(t, nonQualTypeCall));

    // Non-object literal argument reports error and returns null
    Node invalidArgCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.reflect.object"),
        Node.newString(Token.NAME, "Type"),
        Node.newString("invalid"));
    Assert.assertNull(conv.getObjectLiteralCast(t, invalidArgCall));
    Assert.assertEquals(1, compiler.getErrorCount() + compiler.getWarningCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetObjectLiteralCast_notCallNode() {
    Compiler compiler = new Compiler();
    NodeTraversal t = new NodeTraversal(compiler, null);
    conv.getObjectLiteralCast(t, Node.newString(Token.NAME, "var"));
  }

  @Test
  public void testSimplePredicateProperties() {
    Node param = Node.newString(Token.NAME, "param");
    Assert.assertFalse(conv.isOptionalParameter(param));
    Assert.assertFalse(conv.isVarArgsParameter(param));
    Assert.assertFalse(conv.isPrivate("privateVar_"));
    Assert.assertFalse(conv.isPrivate("publicVar"));
  }

  @Test
  public void testGetAssertionFunctions() {
    Collection<AssertionFunctionSpec> assertions = conv.getAssertionFunctions();
    Assert.assertNotNull(assertions);
    Assert.assertEquals(7, assertions.size());
  }

  @Test
  public void testDescribeFunctionBind() {
    // Normal goog.bind
    Node fn = Node.newString(Token.NAME, "fn");
    Node thisValue = Node.newString(Token.NAME, "thisObj");
    Node arg1 = Node.newString(Token.NAME, "arg1");
    Node bindCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.bind"),
        fn, thisValue, arg1);

    Bind bind = conv.describeFunctionBind(bindCall);
    Assert.assertNotNull(bind);
    Assert.assertEquals(fn, bind.target);
    Assert.assertEquals(thisValue, bind.thisValue);
    Assert.assertEquals(arg1, bind.parameters);

    // goog$bind
    Node dollarBindCall = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog$bind"),
        fn.cloneNode(), thisValue.cloneNode(), arg1.cloneNode());
    Bind dollarBind = conv.describeFunctionBind(dollarBindCall);
    Assert.assertNotNull(dollarBind);

    // goog.bind without arguments
    Node bindNoArgs = new Node(Token.CALL, NodeUtil.newQualifiedNameNode(conv, "goog.bind"));
    Assert.assertNull(conv.describeFunctionBind(bindNoArgs));

    // goog.partial
    Node partialFn = Node.newString(Token.NAME, "fn");
    Node partialArg = Node.newString(Token.NAME, "arg1");
    Node partialCall = new Node(Token.CALL,
        NodeUtil.newQualifiedNameNode(conv, "goog.partial"),
        partialFn, partialArg);

    Bind partialBind = conv.describeFunctionBind(partialCall);
    Assert.assertNotNull(partialBind);
    Assert.assertEquals(partialFn, partialBind.target);
    Assert.assertNull(partialBind.thisValue);
    Assert.assertEquals(partialArg, partialBind.parameters);

    // goog$partial
    Node dollarPartialCall = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog$partial"),
        partialFn.cloneNode(), partialArg.cloneNode());
    Bind dollarPartialBind = conv.describeFunctionBind(dollarPartialCall);
    Assert.assertNotNull(dollarPartialBind);

    // goog.partial without arguments
    Node partialNoArgs = new Node(Token.CALL, NodeUtil.newQualifiedNameNode(conv, "goog.partial"));
    Assert.assertNull(conv.describeFunctionBind(partialNoArgs));

    // Non-bind call
    Node otherCall = new Node(Token.CALL, NodeUtil.newQualifiedNameNode(conv, "other.func"));
    Assert.assertNull(conv.describeFunctionBind(otherCall));

    // Non-call node
    Node nonCall = Node.newString(Token.NAME, "goog.bind");
    Assert.assertNull(conv.describeFunctionBind(nonCall));
  }
}
