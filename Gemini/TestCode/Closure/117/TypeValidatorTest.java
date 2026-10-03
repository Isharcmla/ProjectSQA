package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;

public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;
  private NodeTraversal traversal;
  private Node dummyNode;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    });
    dummyNode = IR.name("testNode");
  }

  @Test
  public void testSetShouldReport_disabled_doesNotRecordCompilerErrors() {
    validator.setShouldReport(false);
    validator.expectValidTypeofName(traversal, dummyNode, "invalid_type");
    assertEquals(0, compiler.getWarningCount());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testExpectValidTypeofName_reportsWarning() {
    validator.expectValidTypeofName(traversal, dummyNode, "custom_unknown");
    assertEquals(1, compiler.getWarningCount());
    JSError warning = compiler.getWarnings()[0];
    assertEquals(TypeValidator.UNKNOWN_TYPEOF_VALUE, warning.getType());
  }

  @Test
  public void testExpectObject_withObjectType_returnsTrue() {
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    boolean result = validator.expectObject(traversal, dummyNode, objectType, "expected obj");
    assertTrue(result);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectObject_withNonObjectType_returnsFalseAndRegistersMismatch() {
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    boolean result = validator.expectObject(traversal, dummyNode, numberType, "expected obj");
    assertFalse(result);
    assertEquals(1, compiler.getWarningCount());
    assertTrue(validator.getMismatches().iterator().hasNext());
  }

  @Test
  public void testExpectActualObject_withObjectAndPrimitive() {
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    validator.expectActualObject(traversal, dummyNode, objectType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType stringType = registry.getNativeType(STRING_TYPE);
    validator.expectActualObject(traversal, dummyNode, stringType, "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectAnyObject_variousTypes() {
    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    validator.expectAnyObject(traversal, dummyNode, objectType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType noType = registry.getNativeType(NO_TYPE);
    validator.expectAnyObject(traversal, dummyNode, noType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    validator.expectAnyObject(traversal, dummyNode, numberType, "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectString_withStringAndNonString() {
    JSType stringType = registry.getNativeType(STRING_TYPE);
    validator.expectString(traversal, dummyNode, stringType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    validator.expectString(traversal, dummyNode, boolType, "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNumber_withNumberAndNonNumber() {
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    validator.expectNumber(traversal, dummyNode, numberType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    validator.expectNumber(traversal, dummyNode, boolType, "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectBitwiseable_primitivesAndObjects() {
    JSType numberType = registry.getNativeType(NUMBER_TYPE);
    validator.expectBitwiseable(traversal, dummyNode, numberType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType stringType = registry.getNativeType(STRING_TYPE);
    validator.expectBitwiseable(traversal, dummyNode, stringType, "msg");
    assertEquals(0, compiler.getWarningCount());

    JSType objectType = registry.getNativeType(OBJECT_TYPE);
    validator.expectBitwiseable(traversal, dummyNode, objectType, "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectStringOrNumber_validAndInvalid() {
    validator.expectStringOrNumber(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), "msg");
    validator.expectStringOrNumber(traversal, dummyNode, registry.getNativeType(STRING_TYPE), "msg");
    assertEquals(0, compiler.getWarningCount());

    validator.expectStringOrNumber(traversal, dummyNode, registry.getNativeType(OBJECT_TYPE), "msg");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNotNullOrUndefined_edgeCasesAndMismatches() {
    JSType expected = registry.getNativeType(OBJECT_TYPE);

    assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, registry.getNativeType(NO_TYPE), "msg", expected));
    assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, registry.getNativeType(UNKNOWN_TYPE), "msg", expected));
    assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), "msg", expected));

    Node getPropNode = IR.getprop(IR.name("this"), IR.string("x"));
    Node nonGlobalScopeRoot = IR.function(IR.name("fn"), IR.paramList(), IR.block());
    NodeTraversal localTraversal = new NodeTraversal(compiler, null, new SyntacticScopeCreator(compiler));
    localTraversal.traverseLocal(nonGlobalScopeRoot, new Scope(nonGlobalScopeRoot, compiler));
    assertTrue(validator.expectNotNullOrUndefined(localTraversal, getPropNode, registry.getNativeType(NULL_TYPE), "msg", expected));

    boolean result = validator.expectNotNullOrUndefined(traversal, dummyNode, registry.getNativeType(NULL_TYPE), "msg", expected);
    assertFalse(result);
    assertEquals(1, compiler.getWarningCount());

    JSType unresolved = registry.createNamedType("UnresolvedType", null, 0, 0);
    JSType unionWithUnresolved = registry.createUnionType(registry.getNativeType(NULL_TYPE), unresolved);
    assertTrue(validator.expectNotNullOrUndefined(traversal, dummyNode, unionWithUnresolved, "msg", expected));
  }

  @Test
  public void testExpectSwitchMatchesCase_shallowEqualityAndAutoboxing() {
    Node switchNode = IR.switchSelect(IR.name("s"), IR.caseNode(IR.name("c"), IR.block()));

    validator.expectSwitchMatchesCase(traversal, switchNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NUMBER_TYPE));
    assertEquals(0, compiler.getWarningCount());

    validator.expectSwitchMatchesCase(traversal, switchNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_structAccess() {
    Node getElemNode = IR.getelem(IR.name("obj"), IR.string("prop"));
    ObjectType structType = registry.createAnonymousObjectType(null);
    structType.setStruct();

    validator.expectIndexMatch(traversal, getElemNode, structType, registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeValidator.ILLEGAL_PROPERTY_ACCESS, compiler.getWarnings()[0].getType());
  }

  @Test
  public void testExpectIndexMatch_unknownType() {
    Node getElemNode = IR.getelem(IR.name("obj"), IR.string("prop"));
    validator.expectIndexMatch(traversal, getElemNode, registry.getNativeType(UNKNOWN_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_arrayType() {
    Node getElemNode = IR.getelem(IR.name("arr"), IR.number(0));
    validator.expectIndexMatch(traversal, getElemNode, registry.getNativeType(ARRAY_TYPE), registry.getNativeType(NUMBER_TYPE));
    assertEquals(0, compiler.getWarningCount());

    Node getElemInvalid = IR.getelem(IR.name("arr"), IR.string("zero"));
    validator.expectIndexMatch(traversal, getElemInvalid, registry.getNativeType(ARRAY_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_objectType() {
    Node getElemNode = IR.getelem(IR.name("obj"), IR.string("k"));
    validator.expectIndexMatch(traversal, getElemNode, registry.getNativeType(OBJECT_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_nonObjectNonArray() {
    Node getElemNode = IR.getelem(IR.name("num"), IR.string("k"));
    validator.expectIndexMatch(traversal, getElemNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanAssignToPropertyOf_interfaceMethodAssignment() {
    FunctionType ifaceCtor = registry.createInterfaceType("MyInterface", null);
    ObjectType ifaceProto = ifaceCtor.getPrototype();
    Node ownerNode = IR.name("iface");
    ownerNode.setJSType(ifaceProto);

    FunctionType fnType1 = registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    FunctionType fnType2 = registry.createFunctionType(registry.getNativeType(STRING_TYPE));

    boolean allowed = validator.expectCanAssignToPropertyOf(traversal, dummyNode, fnType1, fnType2, ownerNode, "method");
    assertTrue(allowed);
  }

  @Test
  public void testExpectCanAssignToPropertyOf_mismatch() {
    Node ownerNode = IR.name("obj");
    ownerNode.setJSType(registry.getNativeType(OBJECT_TYPE));

    boolean allowed = validator.expectCanAssignToPropertyOf(
        traversal, dummyNode, registry.getNativeType(STRING_TYPE), registry.getNativeType(NUMBER_TYPE), ownerNode, "prop");
    assertFalse(allowed);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanAssignTo_subtypesAndMismatches() {
    assertTrue(validator.expectCanAssignTo(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NUMBER_TYPE), "msg"));
    assertFalse(validator.expectCanAssignTo(traversal, dummyNode, registry.getNativeType(STRING_TYPE), registry.getNativeType(NUMBER_TYPE), "msg"));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectArgumentMatchesParameter_subtypesAndMismatches() {
    Node callNode = IR.call(IR.name("func"), IR.name("arg1"));
    validator.expectArgumentMatchesParameter(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NUMBER_TYPE), callNode, 1);
    assertEquals(0, compiler.getWarningCount());

    validator.expectArgumentMatchesParameter(traversal, dummyNode, registry.getNativeType(STRING_TYPE), registry.getNativeType(NUMBER_TYPE), callNode, 1);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanOverride_subtypesAndMismatches() {
    validator.expectCanOverride(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(NUMBER_TYPE), "foo", registry.getNativeType(OBJECT_TYPE));
    assertEquals(0, compiler.getWarningCount());

    validator.expectCanOverride(traversal, dummyNode, registry.getNativeType(STRING_TYPE), registry.getNativeType(NUMBER_TYPE), "foo", registry.getNativeType(OBJECT_TYPE));
    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeValidator.HIDDEN_PROPERTY_MISMATCH, compiler.getWarnings()[0].getType());
  }

  @Test
  public void testExpectSuperType_variousHierarchies() {
    FunctionType superCtor = registry.createConstructorType("Super", null, null, null, null);
    FunctionType subCtor = registry.createConstructorType("Sub", null, null, null, null);

    subCtor.setPrototypeBasedOn(registry.getNativeType(OBJECT_TYPE));
    validator.expectSuperType(traversal, dummyNode, superCtor.getInstanceType(), subCtor.getInstanceType());
    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeValidator.MISSING_EXTENDS_TAG_WARNING, compiler.getWarnings()[0].getType());

    FunctionType otherCtor = registry.createConstructorType("Other", null, null, null, null);
    subCtor.setPrototypeBasedOn(otherCtor.getInstanceType());
    validator.expectSuperType(traversal, dummyNode, superCtor.getInstanceType(), subCtor.getInstanceType());
    assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanCast_validAndInvalidCasts() {
    validator.expectCanCast(traversal, dummyNode, registry.getNativeType(OBJECT_TYPE), registry.getNativeType(ARRAY_TYPE));
    assertEquals(0, compiler.getWarningCount());

    validator.expectCanCast(traversal, dummyNode, registry.getNativeType(NUMBER_TYPE), registry.getNativeType(BOOLEAN_TYPE));
    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeValidator.INVALID_CAST, compiler.getWarnings()[0].getType());
  }

  @Test
  public void testExpectUndeclaredVariable_nativeVariableRedeclarationInVar() {
    Scope scope = Scope.createGlobalScope(dummyNode);
    Scope.Var nativeVar = scope.declare("nativeVar", dummyNode, registry.getNativeType(NUMBER_TYPE), null, false);

    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", ""));
    Node varNode = IR.var(IR.name("nativeVar", 1, 0));
    Node nameChild = varNode.getFirstChild();
    nameChild.addChildToBack(IR.number(42));

    Scope.Var result = validator.expectUndeclaredVariable(
        "input.js", input, nameChild, varNode, nativeVar, "nativeVar", registry.getNativeType(NUMBER_TYPE));

    assertNotNull(result);
    assertEquals(registry.getNativeType(NUMBER_TYPE), nameChild.getJSType());
    assertEquals(registry.getNativeType(NUMBER_TYPE), nameChild.getFirstChild().getJSType());
  }

  @Test
  public void testExpectUndeclaredVariable_nativeVariableRedeclarationInFunction() {
    Scope scope = Scope.createGlobalScope(dummyNode);
    Scope.Var nativeVar = scope.declare("fnVar", dummyNode, registry.getNativeType(NUMBER_TYPE), null, false);

    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", ""));
    Node fnNode = IR.function(IR.name("fnVar", 1, 0), IR.paramList(), IR.block());
    Node nameChild = fnNode.getFirstChild();

    Scope.Var result = validator.expectUndeclaredVariable(
        "input.js", input, nameChild, fnNode, nativeVar, "fnVar", registry.getNativeType(NUMBER_TYPE));

    assertNotNull(result);
    assertEquals(registry.getNativeType(NUMBER_TYPE), fnNode.getJSType());
  }

  @Test
  public void testExpectUndeclaredVariable_duplicateWarning() {
    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", ""));
    Scope scope = Scope.createGlobalScope(dummyNode);
    Node firstDecl = IR.name("x", 1, 0);
    Scope.Var var = scope.declare("x", firstDecl, registry.getNativeType(NUMBER_TYPE), input, false);

    Node secondDecl = IR.name("x", 2, 0);
    Node parent = IR.var(secondDecl);

    validator.expectUndeclaredVariable(
        "input.js", input, secondDecl, parent, var, "x", registry.getNativeType(STRING_TYPE));

    assertEquals(1, compiler.getWarningCount());
    assertEquals(TypeValidator.DUP_VAR_DECLARATION, compiler.getWarnings()[0].getType());
  }

  @Test
  public void testExpectUndeclaredVariable_suppressedDuplicate() {
    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", ""));
    Scope scope = Scope.createGlobalScope(dummyNode);
    Node firstDecl = IR.name("x", 1, 0);
    Scope.Var var = scope.declare("x", firstDecl, registry.getNativeType(NUMBER_TYPE), input, false);

    Node secondDecl = IR.getprop(IR.name("a"), IR.string("x"));
    JSDocInfoBuilder jsdoc = new JSDocInfoBuilder(true);
    jsdoc.recordSuppressions(Collections.singleton("duplicate"));
    secondDecl.setJSDocInfo(jsdoc.build(secondDecl));
    Node parent = IR.exprResult(secondDecl);

    validator.expectUndeclaredVariable(
        "input.js", input, secondDecl, parent, var, "x", registry.getNativeType(NUMBER_TYPE));

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectAllInterfaceProperties_missingAndMismatch() {
    FunctionType ifaceCtor = registry.createInterfaceType("Iface", null);
    ObjectType ifaceProto = ifaceCtor.getPrototype();
    ifaceProto.defineDeclaredProperty("propA", registry.getNativeType(NUMBER_TYPE), dummyNode);
    ifaceProto.defineDeclaredProperty("propB", registry.getNativeType(STRING_TYPE), dummyNode);

    FunctionType implCtor = registry.createConstructorType("Impl", null, null, null, null);
    implCtor.setImplementedInterfaces(ImmutableList.of(ifaceCtor.getInstanceType()));
    ObjectType implInstance = implCtor.getInstanceType();

    implInstance.defineDeclaredProperty("propB", registry.getNativeType(NUMBER_TYPE), dummyNode);

    validator.expectAllInterfaceProperties(traversal, dummyNode, implCtor);

    assertEquals(2, compiler.getWarningCount());
    boolean foundNotImpl = false;
    boolean foundMismatch = false;
    for (JSError err : compiler.getWarnings()) {
      if (err.getType() == TypeValidator.INTERFACE_METHOD_NOT_IMPLEMENTED) {
        foundNotImpl = true;
      }
      if (err.getType() == TypeValidator.HIDDEN_INTERFACE_PROPERTY_MISMATCH) {
        foundMismatch = true;
      }
    }
    assertTrue(foundNotImpl);
    assertTrue(foundMismatch);
  }

  @Test
  public void testRegisterMismatch_functionTypeHierarchyRegistration() {
    FunctionType fnTypeA = registry.createFunctionType(
        registry.getNativeType(NUMBER_TYPE),
        registry.createParameters(registry.getNativeType(STRING_TYPE)));
    FunctionType fnTypeB = registry.createFunctionType(
        registry.getNativeType(STRING_TYPE),
        registry.createParameters(registry.getNativeType(NUMBER_TYPE)));

    validator.expectCanAssignTo(traversal, dummyNode, fnTypeA, fnTypeB, "fn assign");

    int mismatchCount = 0;
    for (TypeValidator.TypeMismatch unused : validator.getMismatches()) {
      mismatchCount++;
    }
    assertTrue(mismatchCount >= 3);
  }

  @Test
  public void testGetReadableJSTypeName_variousNodes() {
    Node simpleName = IR.name("myVar");
    simpleName.setJSType(registry.getNativeType(NUMBER_TYPE));
    assertEquals("myVar", validator.getReadableJSTypeName(simpleName, false));

    Node anonymousNode = new Node(Token.EMPTY);
    anonymousNode.setJSType(registry.getNativeType(NUMBER_TYPE));
    assertEquals("number", validator.getReadableJSTypeName(anonymousNode, false));

    Node fnNode = new Node(Token.EMPTY);
    fnNode.setJSType(registry.createFunctionType(registry.getNativeType(NUMBER_TYPE)));
    assertEquals("function", validator.getReadableJSTypeName(fnNode, false));

    FunctionType ctor = registry.createConstructorType("MyClass", null, null, null, null);
    ObjectType proto = ctor.getPrototype();
    proto.defineDeclaredProperty("foo", registry.getNativeType(NUMBER_TYPE), dummyNode);

    Node target = IR.name("inst");
    target.setJSType(ctor.getInstanceType());
    Node getProp = IR.getprop(target, IR.string("foo"));
    getProp.setJSType(registry.getNativeType(NUMBER_TYPE));

    String readable = validator.getReadableJSTypeName(getProp, false);
    assertEquals("MyClass.foo", readable);

    Node nullTypeNode = IR.name("nullVal");
    assertEquals("?", validator.getReadableJSTypeName(nullTypeNode, false));
  }

  @Test
  public void testTypeMismatch_equalsHashCodeToString() {
    JSType num = registry.getNativeType(NUMBER_TYPE);
    JSType str = registry.getNativeType(STRING_TYPE);
    JSError error = JSError.make("test.js", 1, 0, TypeValidator.TYPE_MISMATCH_WARNING, "err");

    TypeValidator.TypeMismatch tm1 = new TypeValidator.TypeMismatch(num, str, error);
    TypeValidator.TypeMismatch tm2 = new TypeValidator.TypeMismatch(str, num, error);
    TypeValidator.TypeMismatch tm3 = new TypeValidator.TypeMismatch(num, registry.getNativeType(BOOLEAN_TYPE), error);

    assertEquals(tm1, tm2);
    assertEquals(tm2, tm1);
    assertNotEquals(tm1, tm3);
    assertNotEquals(tm1, null);
    assertNotEquals(tm1, "different type");

    assertEquals(tm1.hashCode(), new TypeValidator.TypeMismatch(num, str, error).hashCode());
    assertEquals("(number, string)", tm1.toString());
  }
}
