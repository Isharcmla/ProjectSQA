package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class TypeValidatorTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private TypeValidator validator;
  private NodeTraversal t;

  @Before
  public void setUp() {
    compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    validator = new TypeValidator(compiler);
    t = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {}
    });
  }

  @Test
  public void testTypeMismatch_equalsAndHashCodeAndToString() {
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSError error = JSError.make("test.js", 1, 0, TypeValidator.TYPE_MISMATCH_WARNING, "mismatch");

    TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(numType, strType, error);
    TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(strType, numType, null);
    TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(numType, numType, null);

    assertEquals(mismatch1, mismatch1);
    assertEquals(mismatch1, mismatch2);
    assertFalse(mismatch1.equals(mismatch3));
    assertFalse(mismatch1.equals(null));
    assertFalse(mismatch1.equals("NotATypeMismatch"));

    assertEquals(mismatch1.hashCode(), mismatch1.hashCode());
    assertEquals("(" + numType + ", " + strType + ")", mismatch1.toString());
  }

  @Test
  public void testSetShouldReport() {
    validator.setShouldReport(false);
    Node n = IR.name("x");
    validator.expectValidTypeofName(t, n, "bad_type");
    assertEquals(0, compiler.getWarningCount());

    validator.setShouldReport(true);
    validator.expectValidTypeofName(t, n, "bad_type");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectValidTypeofName() {
    Node n = IR.name("x");
    validator.expectValidTypeofName(t, n, "invalid_type");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectObject() {
    Node n = IR.name("x");
    JSType objType = registry.getNativeType(OBJECT_TYPE);
    JSType numType = registry.getNativeType(NUMBER_TYPE);

    assertTrue(validator.expectObject(t, n, objType, "expected object"));
    assertFalse(validator.expectObject(t, n, numType, "expected object"));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectActualObject() {
    Node n = IR.name("x");
    JSType objType = registry.getNativeType(OBJECT_TYPE);
    JSType numType = registry.getNativeType(NUMBER_TYPE);

    validator.expectActualObject(t, n, objType, "expected actual object");
    assertEquals(0, compiler.getWarningCount());

    validator.expectActualObject(t, n, numType, "expected actual object");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectAnyObject() {
    Node n = IR.name("x");
    JSType objType = registry.getNativeType(OBJECT_TYPE);
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType emptyType = registry.getNativeType(NO_OBJECT_TYPE);

    validator.expectAnyObject(t, n, objType, "expected any object");
    assertEquals(0, compiler.getWarningCount());

    validator.expectAnyObject(t, n, emptyType, "expected any object");
    assertEquals(0, compiler.getWarningCount());

    validator.expectAnyObject(t, n, numType, "expected any object");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectString() {
    Node n = IR.name("x");
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSType objType = registry.getNativeType(OBJECT_TYPE);

    validator.expectString(t, n, strType, "expected string");
    assertEquals(0, compiler.getWarningCount());

    validator.expectString(t, n, objType, "expected string");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNumber() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType objType = registry.getNativeType(OBJECT_TYPE);

    validator.expectNumber(t, n, numType, "expected number");
    assertEquals(0, compiler.getWarningCount());

    validator.expectNumber(t, n, objType, "expected number");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectBitwiseable() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);
    JSType objType = registry.getNativeType(OBJECT_TYPE);

    validator.expectBitwiseable(t, n, numType, "expected bitwiseable");
    validator.expectBitwiseable(t, n, strType, "expected bitwiseable");
    validator.expectBitwiseable(t, n, boolType, "expected bitwiseable");
    assertEquals(0, compiler.getWarningCount());

    validator.expectBitwiseable(t, n, objType, "expected bitwiseable");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectStringOrNumber() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSType boolType = registry.getNativeType(BOOLEAN_TYPE);

    validator.expectStringOrNumber(t, n, numType, "expected str or num");
    validator.expectStringOrNumber(t, n, strType, "expected str or num");
    assertEquals(0, compiler.getWarningCount());

    validator.expectStringOrNumber(t, n, boolType, "expected str or num");
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectNotNullOrUndefined() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType nullType = registry.getNativeType(NULL_TYPE);
    JSType voidType = registry.getNativeType(VOID_TYPE);
    JSType noResolvedType = registry.getNativeType(NO_RESOLVED_TYPE);
    JSType unknownType = registry.getNativeType(UNKNOWN_TYPE);

    assertTrue(validator.expectNotNullOrUndefined(t, n, numType, "msg", numType));
    assertTrue(validator.expectNotNullOrUndefined(t, n, unknownType, "msg", numType));
    assertTrue(validator.expectNotNullOrUndefined(t, n, noResolvedType, "msg", numType));

    UnionType unionWithForward = registry.createUnionType(nullType, noResolvedType);
    assertTrue(validator.expectNotNullOrUndefined(t, n, unionWithForward, "msg", numType));

    assertFalse(validator.expectNotNullOrUndefined(t, n, nullType, "msg", numType));
    assertFalse(validator.expectNotNullOrUndefined(t, n, voidType, "msg", numType));
  }

  @Test
  public void testExpectNotNullOrUndefined_getPropInLocalScope() {
    Node getPropNode = IR.getprop(IR.name("this"), IR.string("x"));
    JSType nullType = registry.getNativeType(NULL_TYPE);
    JSType numType = registry.getNativeType(NUMBER_TYPE);

    Node root = IR.root(IR.function(IR.name("fn"), IR.paramList(), IR.block(IR.exprResult(getPropNode))));
    final boolean[] visited = new boolean[1];
    NodeTraversal localTraversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
        if (n.isGetProp()) {
          visited[0] = true;
          assertTrue(validator.expectNotNullOrUndefined(t, n, nullType, "msg", numType));
        }
      }
    });
    localTraversal.traverse(root);
    assertTrue(visited[0]);
  }

  @Test
  public void testExpectSwitchMatchesCase() {
    Node switchNode = IR.switchSelect(IR.name("a"), IR.caseNode(IR.name("b"), IR.block()));
    Node caseNode = switchNode.getLastChild();

    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);

    validator.expectSwitchMatchesCase(t, caseNode, numType, numType);
    assertEquals(0, compiler.getWarningCount());

    validator.expectSwitchMatchesCase(t, caseNode, numType, strType);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_structAccess() {
    Node getElem = IR.getelem(IR.name("obj"), IR.string("prop"));
    ObjectType structType = registry.createObjectType("StructType", null, null);
    structType.setStruct();

    validator.expectIndexMatch(t, getElem, structType, registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_unknownType() {
    Node getElem = IR.getelem(IR.name("obj"), IR.name("idx"));
    validator.expectIndexMatch(t, getElem, registry.getNativeType(UNKNOWN_TYPE), registry.getNativeType(STRING_TYPE));
    assertEquals(0, compiler.getWarningCount());

    validator.expectIndexMatch(t, getElem, registry.getNativeType(UNKNOWN_TYPE), registry.getNativeType(BOOLEAN_TYPE));
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectIndexMatch_arrayAndRestrictedIndex() {
    Node getElem = IR.getelem(IR.name("arr"), IR.number(0));
    ObjectType arrayType = (ObjectType) registry.getNativeType(ARRAY_TYPE);
    validator.expectIndexMatch(t, getElem, arrayType, registry.getNativeType(NUMBER_TYPE));
    assertEquals(0, compiler.getWarningCount());

    validator.expectIndexMatch(t, getElem, arrayType, registry.getNativeType(STRING_TYPE));
    assertEquals(1, compiler.getWarningCount());

    ObjectType restrictedObj = registry.createObjectType("Restricted", null, null);
    restrictedObj.setIndexType(registry.getNativeType(NUMBER_TYPE));
    validator.expectIndexMatch(t, getElem, restrictedObj, registry.getNativeType(NUMBER_TYPE));
    validator.expectIndexMatch(t, getElem, restrictedObj, registry.getNativeType(STRING_TYPE));
  }

  @Test
  public void testExpectIndexMatch_objectAndNonObject() {
    Node getElem = IR.getelem(IR.name("obj"), IR.string("k"));
    ObjectType objType = (ObjectType) registry.getNativeType(OBJECT_TYPE);
    validator.expectIndexMatch(t, getElem, objType, registry.getNativeType(STRING_TYPE));

    JSType numType = registry.getNativeType(NUMBER_TYPE);
    validator.expectIndexMatch(t, getElem, numType, registry.getNativeType(STRING_TYPE));
    assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void testExpectCanAssignToPropertyOf() {
    Node owner = IR.name("myObj");
    owner.setJSType(registry.getNativeType(OBJECT_TYPE));
    Node n = IR.name("val");

    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);

    assertTrue(validator.expectCanAssignToPropertyOf(t, n, numType, numType, owner, "prop"));
    assertFalse(validator.expectCanAssignToPropertyOf(t, n, strType, numType, owner, "prop"));

    FunctionType interfaceCtor = registry.createInterfaceType("MyInterface", null);
    ObjectType ifaceProto = interfaceCtor.getPrototype();
    Node ifaceOwner = IR.name("iface");
    ifaceOwner.setJSType(ifaceProto);

    FunctionType fnType1 = registry.createFunctionType(numType);
    FunctionType fnType2 = registry.createFunctionType(strType);

    assertTrue(validator.expectCanAssignToPropertyOf(t, n, fnType1, fnType2, ifaceOwner, "fn"));
  }

  @Test
  public void testExpectCanAssignToPropertyOf_constructorOrEnum() {
    Node owner = IR.name("myObj");
    owner.setJSType(registry.getNativeType(OBJECT_TYPE));
    Node n = IR.name("val");

    FunctionType ctor1 = registry.createConstructorType("Ctor1", null, null, null);
    FunctionType ctor2 = registry.createConstructorType("Ctor2", null, null, null);

    assertFalse(validator.expectCanAssignToPropertyOf(t, n, ctor1, ctor2, owner, "ctorProp"));
  }

  @Test
  public void testExpectCanAssignTo() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);

    assertTrue(validator.expectCanAssignTo(t, n, numType, numType, "msg"));
    assertFalse(validator.expectCanAssignTo(t, n, strType, numType, "msg"));

    EnumType enum1 = registry.createEnumType("Enum1", null, numType);
    EnumType enum2 = registry.createEnumType("Enum2", null, strType);
    assertFalse(validator.expectCanAssignTo(t, n, enum1, enum2, "msg"));
  }

  @Test
  public void testExpectArgumentMatchesParameter() {
    Node callNode = IR.call(IR.name("foo"), IR.name("arg1"));
    callNode.getFirstChild().setJSType(registry.getNativeType(UNKNOWN_TYPE));
    Node argNode = callNode.getLastChild();

    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);

    validator.expectArgumentMatchesParameter(t, argNode, numType, numType, callNode, 1);
    assertEquals(0, compiler.getWarningCount());

    validator.expectArgumentMatchesParameter(t, argNode, strType, numType, callNode, 1);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectCanOverride() {
    Node n = IR.name("prop");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSType objType = registry.getNativeType(OBJECT_TYPE);

    validator.expectCanOverride(t, n, numType, numType, "p", objType);
    assertEquals(0, compiler.getWarningCount());

    validator.expectCanOverride(t, n, strType, numType, "p", objType);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectSuperType() {
    Node n = IR.name("SubClass");
    FunctionType superCtor = registry.createConstructorType("SuperClass", null, null, null);
    FunctionType subCtor = registry.createConstructorType("SubClass", null, null, null);

    subCtor.setPrototypeBasedOn(superCtor.getInstanceType());

    validator.expectSuperType(t, n, superCtor.getInstanceType(), subCtor.getInstanceType());
    assertEquals(0, compiler.getWarningCount());

    FunctionType otherSuperCtor = registry.createConstructorType("OtherSuper", null, null, null);
    validator.expectSuperType(t, n, otherSuperCtor.getInstanceType(), subCtor.getInstanceType());
    assertEquals(1, compiler.getWarningCount());

    FunctionType noExtendsCtor = registry.createConstructorType("NoExtends", null, null, null);
    validator.expectSuperType(t, n, superCtor.getInstanceType(), noExtendsCtor.getInstanceType());
  }

  @Test
  public void testExpectCanCast() {
    Node n = IR.name("x");
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    JSType allType = registry.getNativeType(UNKNOWN_TYPE);

    validator.expectCanCast(t, n, numType, numType);
    validator.expectCanCast(t, n, numType, allType);
    assertEquals(0, compiler.getWarningCount());

    validator.expectCanCast(t, n, numType, strType);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectUndeclaredVariable_nativeVariableRedeclare() {
    Node root = IR.root(IR.var(IR.name("x", 1, 0)));
    Scope scope = Scope.createGlobalScope(root);
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    Var var = scope.declare("x", root.getFirstChild().getFirstChild(), numType, null);

    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", ""));
    Node newVarNode = IR.name("x");
    Node parent = IR.var(newVarNode);
    Var result = validator.expectUndeclaredVariable("test.js", input, newVarNode, parent, var, "x", numType);

    assertNotNull(result);
    assertNotSame(var, result);
    assertEquals(numType, newVarNode.getJSType());
  }

  @Test
  public void testExpectUndeclaredVariable_parentIsFunction() {
    Node fn = IR.function(IR.name("x", 1, 0), IR.paramList(), IR.block());
    Node root = IR.root(fn);
    Scope scope = Scope.createGlobalScope(root);
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    Var var = scope.declare("x", fn.getFirstChild(), numType, null);

    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", ""));
    Node newFnName = IR.name("x");
    Node parentFn = IR.function(newFnName, IR.paramList(), IR.block());
    Var result = validator.expectUndeclaredVariable("test.js", input, newFnName, parentFn, var, "x", numType);

    assertNotNull(result);
    assertEquals(numType, parentFn.getJSType());
  }

  @Test
  public void testExpectUndeclaredVariable_duplicateWithWarning() {
    Node root = IR.root(IR.var(IR.name("x", 1, 0)));
    Scope scope = Scope.createGlobalScope(root);
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    JSType strType = registry.getNativeType(STRING_TYPE);
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", ""));
    Var var = scope.declare("x", root.getFirstChild().getFirstChild(), numType, input);

    Node n = IR.name("x");
    Node parent = IR.var(n);
    Var result = validator.expectUndeclaredVariable("test.js", input, n, parent, var, "x", strType);

    assertSame(var, result);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testExpectUndeclaredVariable_duplicateSuppressed() {
    Node root = IR.root(IR.exprResult(IR.getprop(IR.name("a"), IR.string("b"))));
    Scope scope = Scope.createGlobalScope(root);
    JSType numType = registry.getNativeType(NUMBER_TYPE);
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", ""));
    Var var = scope.declare("x", root.getFirstChild(), numType, input);

    Node getprop = IR.getprop(IR.name("a"), IR.string("b"));
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordSuppressions(ImmutableList.of("duplicate"));
    JSDocInfo info = builder.build(getprop);
    getprop.setJSDocInfo(info);

    Node parent = IR.exprResult(getprop);
    Var result = validator.expectUndeclaredVariable("test.js", input, getprop, parent, var, "x", numType);

    assertSame(var, result);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testExpectAllInterfaceProperties_implementedAndNotImplemented() {
    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    iface.getPrototype().defineDeclaredProperty("m1", registry.getNativeType(NUMBER_TYPE), null);
    iface.getPrototype().defineDeclaredProperty("m2", registry.getNativeType(STRING_TYPE), null);

    FunctionType impl = registry.createConstructorType("MyClass", null, null, null);
    impl.setImplementedInterfaces(ImmutableList.of(iface.getInstanceType()));

    impl.getPrototype().defineDeclaredProperty("m1", registry.getNativeType(BOOLEAN_TYPE), null);

    Node n = IR.name("MyClass");
    validator.expectAllInterfaceProperties(t, n, impl);

    assertEquals(2, compiler.getWarningCount());
  }

  @Test
  public void testGetReadableJSTypeName() {
    Node plainName = IR.name("myVar");
    plainName.setJSType(registry.getNativeType(NUMBER_TYPE));
    assertEquals("myVar", validator.getReadableJSTypeName(plainName, false));

    Node noTypeName = IR.name("unknownVar");
    assertEquals("unknownVar", validator.getReadableJSTypeName(noTypeName, false));

    FunctionType fnType = registry.createFunctionType(registry.getNativeType(NUMBER_TYPE));
    Node fnNode = IR.name("fn");
    fnNode.setJSType(fnType);
    assertEquals("fn", validator.getReadableJSTypeName(fnNode, false));

    Node getprop = IR.getprop(IR.name("a"), IR.string("b"));
    FunctionType ctor = registry.createConstructorType("MyClass", null, null, null);
    ctor.getPrototype().defineDeclaredProperty("b", registry.getNativeType(NUMBER_TYPE), null);
    getprop.getFirstChild().setJSType(ctor.getInstanceType());
    getprop.setJSType(registry.getNativeType(NUMBER_TYPE));
    assertEquals("MyClass.prototype.b", validator.getReadableJSTypeName(getprop, true));

    FunctionType iface = registry.createInterfaceType("MyInterface", null);
    iface.getPrototype().defineDeclaredProperty("b", registry.getNativeType(NUMBER_TYPE), null);
    getprop.getFirstChild().setJSType(iface.getInstanceType());
    assertEquals("MyInterface.prototype.b", validator.getReadableJSTypeName(getprop, true));
  }

  @Test
  public void testGetMismatches_functionTypeRecursion() {
    FunctionType fnA = registry.createFunctionType(
        registry.getNativeType(NUMBER_TYPE),
        registry.getNativeType(STRING_TYPE)
    );
    FunctionType fnB = registry.createFunctionType(
        registry.getNativeType(BOOLEAN_TYPE),
        registry.getNativeType(OBJECT_TYPE)
    );

    Node n = IR.name("fn");
    validator.expectCanAssignTo(t, n, fnA, fnB, "mismatch fn");

    Iterator<TypeValidator.TypeMismatch> it = validator.getMismatches().iterator();
    assertTrue(it.hasNext());
    TypeValidator.TypeMismatch mismatch = it.next();
    assertNotNull(mismatch);
  }
}
