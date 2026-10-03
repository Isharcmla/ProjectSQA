package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TypeValidatorTest {

  private Compiler compiler;
  private TypeValidator validator;
  private JSTypeRegistry registry;
  private NodeTraversal traversal;
  private Node dummyNode;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    validator = new TypeValidator(compiler);
    registry = compiler.getTypeRegistry();
    traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    });
    dummyNode = Node.newString(Token.NAME, "dummyVar");
  }

  private JSType getNativeType(JSTypeNative nativeType) {
    return registry.getNativeType(nativeType);
  }

  @Test
  public void testExpectObject_matchingAndNonMatching() {
    JSType objType = getNativeType(OBJECT_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    Assert.assertTrue(validator.expectObject(traversal, dummyNode, objType, "msg"));
    Assert.assertEquals(0, compiler.getWarningCount());

    Assert.assertFalse(validator.expectObject(traversal, dummyNode, numType, "msg"));
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(1, Iterables.size(validator.getMismatches()));
  }

  @Test
  public void testExpectActualObject_objectAndNonObject() {
    JSType objType = getNativeType(OBJECT_TYPE);
    JSType strType = getNativeType(STRING_TYPE);

    validator.expectActualObject(traversal, dummyNode, objType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectActualObject(traversal, dummyNode, strType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectAnyObject_matchingSubtypeEmptyAndMismatch() {
    JSType noObjType = getNativeType(NO_OBJECT_TYPE);
    JSType noType = getNativeType(NO_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    validator.expectAnyObject(traversal, dummyNode, noObjType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectAnyObject(traversal, dummyNode, noType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectAnyObject(traversal, dummyNode, numType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectString_successAndFailure() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType nullType = getNativeType(NULL_TYPE);

    validator.expectString(traversal, dummyNode, strType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectString(traversal, dummyNode, nullType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNumber_successAndFailure() {
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType nullType = getNativeType(NULL_TYPE);

    validator.expectNumber(traversal, dummyNode, numType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectNumber(traversal, dummyNode, nullType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectBitwiseable_numberPrimitiveAndObject() {
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType strType = getNativeType(STRING_TYPE);
    JSType objType = getNativeType(OBJECT_TYPE);

    validator.expectBitwiseable(traversal, dummyNode, numType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectBitwiseable(traversal, dummyNode, strType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectBitwiseable(traversal, dummyNode, objType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectStringOrNumber_successAndFailure() {
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType strType = getNativeType(STRING_TYPE);
    JSType nullType = getNativeType(NULL_TYPE);

    validator.expectStringOrNumber(traversal, dummyNode, numType, "msg");
    validator.expectStringOrNumber(traversal, dummyNode, strType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectStringOrNumber(traversal, dummyNode, nullType, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNotNullOrUndefined_variousTypes() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType nullType = getNativeType(NULL_TYPE);
    JSType voidType = getNativeType(VOID_TYPE);
    JSType unknownType = getNativeType(UNKNOWN_TYPE);
    JSType noType = getNativeType(NO_TYPE);
    JSType forwardDeclared = getNativeType(NO_RESOLVED_TYPE);

    Assert.assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, strType, "msg", strType));
    Assert.assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, unknownType, "msg", strType));
    Assert.assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, noType, "msg", strType));
    Assert.assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, forwardDeclared, "msg", strType));

    // Union with forward declared unresolved type
    JSType unionWithForwardDeclared = registry.createUnionType(nullType, forwardDeclared);
    Assert.assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, unionWithForwardDeclared, "msg", strType));

    // Null type failure on simple node
    Assert.assertFalse(validator.expectNotNullOrUndefined(traversal, dummyNode, nullType, "msg", strType));
    Assert.assertEquals(1, compiler.getWarningCount());

    // Void type failure
    Assert.assertFalse(validator.expectNotNullOrUndefined(traversal, dummyNode, voidType, "msg", strType));
    Assert.assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testExpectNotNullOrUndefined_getPropInNonGlobalScopeIgnored() {
    Node getPropNode = new Node(Token.GETPROP, Node.newString(Token.NAME, "this"), Node.newString(Token.STRING, "x"));
    Node root = new Node(Token.FUNCTION, Node.newString(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
    NodeTraversal nonGlobalTraversal = new NodeTraversal(compiler, null, new SyntacticScopeCreator(compiler));
    nonGlobalTraversal.traverse(root);

    JSType nullType = getNativeType(NULL_TYPE);
    JSType strType = getNativeType(STRING_TYPE);
    boolean result = validator.expectNotNullOrUndefined(nonGlobalTraversal, getPropNode, nullType, "msg", strType);
    Assert.assertTrue(result);
  }

  @Test
  public void testExpectSwitchMatchesCase_canTestAndCannotTest() {
    Node switchNode = new Node(Token.SWITCH, dummyNode);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType strType = getNativeType(STRING_TYPE);

    validator.expectSwitchMatchesCase(traversal, switchNode, numType, numType);
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectSwitchMatchesCase(traversal, switchNode, numType, strType);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_allBranches() {
    JSType unknownType = getNativeType(UNKNOWN_TYPE);
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType arrType = getNativeType(ARRAY_TYPE);
    JSType objType = getNativeType(OBJECT_TYPE);
    JSType nullType = getNativeType(NULL_TYPE);

    // 1. Unknown objType -> expectStringOrNumber
    validator.expectIndexMatch(traversal, dummyNode, unknownType, strType);
    Assert.assertEquals(0, compiler.getWarningCount());
    validator.expectIndexMatch(traversal, dummyNode, unknownType, nullType);
    Assert.assertEquals(1, compiler.getWarningCount());

    // 2. ObjectType with restricted index type
    ObjectType objWithIndex = registry.createObjectType("CustomIndexObj", null);
    objWithIndex.defineDeclaredProperty("dummy", strType, null);
    objWithIndex.setPropertyJSType("0", numType);
    ObjectType restricted = registry.createAnonymousObjectType();
    restricted.setIndexType(numType);
    validator.expectIndexMatch(traversal, dummyNode, restricted, numType);
    Assert.assertEquals(1, compiler.getWarningCount());
    validator.expectIndexMatch(traversal, dummyNode, restricted, strType);
    Assert.assertEquals(2, compiler.getWarningCount());

    // 3. Array type -> expectNumber
    validator.expectIndexMatch(traversal, dummyNode, arrType, numType);
    Assert.assertEquals(2, compiler.getWarningCount());
    validator.expectIndexMatch(traversal, dummyNode, arrType, strType);
    Assert.assertEquals(3, compiler.getWarningCount());

    // 4. Object context -> expectString
    validator.expectIndexMatch(traversal, dummyNode, objType, strType);
    Assert.assertEquals(3, compiler.getWarningCount());
    validator.expectIndexMatch(traversal, dummyNode, objType, nullType);
    Assert.assertEquals(4, compiler.getWarningCount());

    // 5. Neither array nor object
    validator.expectIndexMatch(traversal, dummyNode, nullType, strType);
    Assert.assertEquals(5, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_regularAndIntrinsics() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType noType = getNativeType(NO_TYPE);

    // Matching types
    Assert.assertTrue(validator.expectCanAssignToPropertyOf(traversal, dummyNode, strType, strType, dummyNode, "prop"));

    // Left is NoType
    Assert.assertTrue(validator.expectCanAssignToPropertyOf(traversal, dummyNode, strType, noType, dummyNode, "prop"));

    // Mismatched normal types
    Assert.assertFalse(validator.expectCanAssignToPropertyOf(traversal, dummyNode, numType, strType, dummyNode, "prop"));
    Assert.assertEquals(1, compiler.getWarningCount());

    // Mismatched intrinsics (e.g. constructors)
    FunctionType ctor1 = registry.createConstructorType("Ctor1", null, null, null);
    FunctionType ctor2 = registry.createConstructorType("Ctor2", null, null, null);
    Assert.assertFalse(validator.expectCanAssignToPropertyOf(traversal, dummyNode, ctor1, ctor2, dummyNode, "prop"));
    // Intrinsics register mismatch without warning via this method
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanAssignTo_regularAndIntrinsics() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    Assert.assertTrue(validator.expectCanAssignTo(traversal, dummyNode, strType, strType, "msg"));

    Assert.assertFalse(validator.expectCanAssignTo(traversal, dummyNode, numType, strType, "msg"));
    Assert.assertEquals(1, compiler.getWarningCount());

    FunctionType ctor1 = registry.createConstructorType("CtorA", null, null, null);
    FunctionType ctor2 = registry.createConstructorType("CtorB", null, null, null);
    Assert.assertFalse(validator.expectCanAssignTo(traversal, dummyNode, ctor1, ctor2, "msg"));
  }

  @Test
  public void testExpectArgumentMatchesParameter_matchingAndMismatch() {
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fnName"), dummyNode);
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    validator.expectArgumentMatchesParameter(traversal, dummyNode, strType, strType, callNode, 1);
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectArgumentMatchesParameter(traversal, dummyNode, numType, strType, callNode, 1);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanOverride_successAndFailure() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType objType = getNativeType(OBJECT_TYPE);

    validator.expectCanOverride(traversal, dummyNode, strType, strType, "prop", objType);
    Assert.assertEquals(0, compiler.getWarningCount());

    validator.expectCanOverride(traversal, dummyNode, numType, strType, "prop", objType);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectSuperType_extendsTagAndMismatch() {
    ObjectType objectType = (ObjectType) getNativeType(OBJECT_TYPE);
    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null);
    ObjectType subInstance = subCtor.getInstanceType();

    // Default super class is Object -> triggers MISSING_EXTENDS_TAG_WARNING
    validator.expectSuperType(traversal, dummyNode, subInstance, subInstance);
    Assert.assertEquals(1, compiler.getWarningCount());

    // When super is not Object type -> triggers mismatch in declaration
    FunctionType otherSuperCtor = registry.createConstructorType("OtherSuper", null, null, null);
    ObjectType otherSuperInstance = otherSuperCtor.getInstanceType();
    subCtor.setPrototypeBasedOn(otherSuperInstance);

    FunctionType targetSuperCtor = registry.createConstructorType("TargetSuper", null, null, null);
    ObjectType targetSuperInstance = targetSuperCtor.getInstanceType();

    validator.expectSuperType(traversal, dummyNode, targetSuperInstance, subInstance);
    Assert.assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanCast_validAndInvalid() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType allType = getNativeType(ALL_TYPE);

    // Cast string to all
    validator.expectCanCast(traversal, dummyNode, strType, allType);
    Assert.assertEquals(0, compiler.getWarningCount());

    // Cast all to string
    validator.expectCanCast(traversal, dummyNode, allType, strType);
    Assert.assertEquals(0, compiler.getWarningCount());

    // Cast string to number -> invalid
    validator.expectCanCast(traversal, dummyNode, strType, numType);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectUndeclaredVariable_nativeScopeAndUserDuplicates() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    // 1. Native declaration: var.input == null with VAR parent
    Node nameNode = Node.newString(Token.NAME, "nativeVar");
    nameNode.setLineno(10);
    Node varParent = new Node(Token.VAR, nameNode);
    Scope.Var nativeVar = new Scope.Var(false, "nativeVar", nameNode, strType, null, 0, null);
    validator.expectUndeclaredVariable("src.js", nameNode, varParent, nativeVar, "nativeVar", strType);
    Assert.assertEquals(strType, nameNode.getJSType());
    Assert.assertEquals(0, compiler.getWarningCount());

    // 2. Native declaration with FUNCTION parent
    Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.LP), new Node(Token.BLOCK));
    Node fnNameNode = fnNode.getFirstChild();
    Scope.Var nativeFnVar = new Scope.Var(false, "fn", fnNameNode, strType, null, 0, null);
    validator.expectUndeclaredVariable("src.js", fnNameNode, fnNode, nativeFnVar, "fn", strType);
    Assert.assertEquals(strType, fnNode.getJSType());

    // 3. User duplicate declaration with mismatching type
    CompilerInput compInput = new CompilerInput(SourceFile.fromCode("input.js", "var x;"));
    Node userVarNode = Node.newString(Token.NAME, "userVar");
    userVarNode.setLineno(20);
    Node userParent = new Node(Token.VAR, userVarNode);
    Scope.Var userVar = new Scope.Var(false, "userVar", userVarNode, strType, compInput, 0, null);
    validator.expectUndeclaredVariable("src.js", userVarNode, userParent, userVar, "userVar", numType);
    Assert.assertEquals(1, compiler.getWarningCount());

    // 4. Duplicate suppression on GETPROP
    Node getPropNode = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString(Token.STRING, "dupProp"));
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordSuppression("duplicate");
    JSDocInfo info = docBuilder.build(getPropNode);
    getPropNode.setJSDocInfo(info);

    Node getPropParent = new Node(Token.EXPR_RESULT, getPropNode);
    Scope.Var propVar = new Scope.Var(false, "obj.dupProp", getPropNode, strType, compInput, 0, null);
    validator.expectUndeclaredVariable("src.js", getPropNode, getPropParent, propVar, "obj.dupProp", strType);
    // Suppressed, no new warning
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectAllInterfaceProperties_missingProperty() {
    FunctionType ifaceType = registry.createInterfaceType("MyInterface", null);
    ifaceType.getImplicitPrototype().defineDeclaredProperty("missingProp", getNativeType(STRING_TYPE), null);

    FunctionType classType = registry.createConstructorType("MyClass", null, null, null);
    classType.setImplementedInterfaces(ImmutableList.of(ifaceType.getInstanceType()));

    validator.expectAllInterfaceProperties(traversal, dummyNode, classType);
    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testGetReadableJSTypeName_variousNodes() {
    // 1. Simple name node without type -> Unknown
    String nameUnknown = validator.getReadableJSTypeName(dummyNode, false);
    Assert.assertEquals("dummyVar", nameUnknown);

    // 2. Function prototype type
    ObjectType objType = (ObjectType) getNativeType(OBJECT_TYPE);
    dummyNode.setJSType(objType.getPropertyType("prototype"));
    String nameProto = validator.getReadableJSTypeName(dummyNode, false);
    Assert.assertNotNull(nameProto);

    // 3. GETPROP node
    FunctionType ctor = registry.createConstructorType("MyClassType", null, null, null);
    ObjectType instance = ctor.getInstanceType();
    instance.defineDeclaredProperty("myProp", getNativeType(STRING_TYPE), null);

    Node ownerNode = Node.newString(Token.NAME, "instanceVar");
    ownerNode.setJSType(instance);
    Node getProp = new Node(Token.GETPROP, ownerNode, Node.newString(Token.STRING, "myProp"));
    getProp.setJSType(getNativeType(STRING_TYPE));

    String propName = validator.getReadableJSTypeName(getProp, false);
    Assert.assertEquals("MyClassType.myProp", propName);

    // 4. Anonymous Function
    FunctionType anonFn = registry.createFunctionType(getNativeType(VOID_TYPE));
    Node anonNode = new Node(Token.FUNCTION);
    anonNode.setJSType(anonFn);
    String fnName = validator.getReadableJSTypeName(anonNode, false);
    Assert.assertEquals("function", fnName);
  }

  @Test
  public void testFunctionTypeMismatch_parametersAndReturnTypeRegistration() {
    FunctionType fn1 = registry.createFunctionType(getNativeType(STRING_TYPE), getNativeType(NUMBER_TYPE));
    FunctionType fn2 = registry.createFunctionType(getNativeType(NUMBER_TYPE), getNativeType(STRING_TYPE));

    validator.expectCanAssignTo(traversal, dummyNode, fn1, fn2, "msg");
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertTrue(Iterables.size(validator.getMismatches()) > 1);
  }

  @Test
  public void testSetShouldReport_suppressesWarningEmission() {
    validator.setShouldReport(false);
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);

    validator.expectCanAssignTo(traversal, dummyNode, strType, numType, "msg");
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertEquals(1, Iterables.size(validator.getMismatches()));
  }

  @Test
  public void testTypeMismatch_equalsHashCodeToString() {
    JSType strType = getNativeType(STRING_TYPE);
    JSType numType = getNativeType(NUMBER_TYPE);
    JSType boolType = getNativeType(BOOLEAN_TYPE);

    TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(strType, numType);
    TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(numType, strType);
    TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(strType, boolType);

    Assert.assertEquals(mismatch1, mismatch2);
    Assert.assertEquals(mismatch2, mismatch1);
    Assert.assertNotEquals(mismatch1, mismatch3);
    Assert.assertNotEquals(mismatch1, "string");
    Assert.assertNotEquals(mismatch1, null);

    Assert.assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
    Assert.assertEquals("(" + strType + ", " + numType + ")", mismatch1.toString());
  }

  @Test
  public void testAllDiagnosticsGroup() {
    Assert.assertNotNull(TypeValidator.ALL_DIAGNOSTICS);
    Assert.assertNotNull(TypeValidator.INVALID_CAST);
    Assert.assertNotNull(TypeValidator.TYPE_MISMATCH_WARNING);
    Assert.assertNotNull(TypeValidator.MISSING_EXTENDS_TAG_WARNING);
    Assert.assertNotNull(TypeValidator.DUP_VAR_DECLARATION);
    Assert.assertNotNull(TypeValidator.HIDDEN_PROPERTY_MISMATCH);
    Assert.assertNotNull(TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED);
  }
}
