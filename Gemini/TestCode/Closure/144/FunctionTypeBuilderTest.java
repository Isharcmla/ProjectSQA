package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Scope globalScope;
  private Node errorRoot;

  @Before
  public void setUp() {
    compiler = new Compiler();
    registry = compiler.getTypeRegistry();
    Node root = new Node(Token.BLOCK);
    globalScope = Scope.createGlobalScope(root);
    errorRoot = new Node(Token.SCRIPT);
  }

  private FunctionTypeBuilder newBuilder(String name) {
    return new FunctionTypeBuilder(name, compiler, errorRoot, "test.js", globalScope);
  }

  private FunctionTypeBuilder newBuilder(String name, Scope scope) {
    return new FunctionTypeBuilder(name, compiler, errorRoot, "test.js", scope);
  }

  private JSTypeExpression createTypeExpression(Node typeNode) {
    return new JSTypeExpression(typeNode, "test.js");
  }

  private JSTypeExpression createNamedTypeExpression(String typeName) {
    return createTypeExpression(Node.newString(Token.NAME, typeName));
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsException() {
    new FunctionTypeBuilder("foo", compiler, null, "test.js", globalScope);
  }

  @Test
  public void testConstructor_nullFnName_initializesWithEmptyString() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder(null, compiler, errorRoot, "test.js", globalScope);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
    assertEquals("", fn.getDisplayName());
  }

  @Test(expected = IllegalStateException.class)
  public void testBuildAndRegister_noParametersInferred_throwsIllegalStateException() {
    FunctionTypeBuilder builder = newBuilder("test");
    builder.buildAndRegister();
  }

  @Test
  public void testSetSourceNode_setsSourceNodeCorrectly() {
    Node source = new Node(Token.FUNCTION);
    FunctionTypeBuilder builder = newBuilder("test");
    builder.setSourceNode(source);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertSame(source, fn.getSource());
  }

  @Test
  public void testIsFunctionTypeDeclaration() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));

    infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordConstructor();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));

    infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordInterface();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));

    infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordReturnType(createNamedTypeExpression("number"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));

    infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordThisType(createNamedTypeExpression("Object"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));

    infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordParameterDescription("x");
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(infoBuilder.build(null)));
  }

  @Test
  public void testInferReturnType_nullInfo_defaultsToUnknown() {
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferReturnType(null);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), fn.getReturnType());
  }

  @Test
  public void testInferReturnType_withValidReturnType() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordReturnType(createNamedTypeExpression("string"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferReturnType(info);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), fn.getReturnType());
  }

  @Test
  public void testInferReturnType_templateTypeInReturnType_reportsErrorWhenTemplateTypeExpected() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordReturnType(createNamedTypeExpression("T"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferTemplateTypeName(info);
    builder.inferReturnType(info);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInferInheritance_nullInfo_doesNothing() {
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferInheritance(null);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertFalse(fn.isConstructor());
    assertFalse(fn.isInterface());
  }

  @Test
  public void testInferInheritance_extendsWithoutConstructorOrInterface_warns() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordBaseType(createNamedTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferInheritance(info);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructor_warns() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordImplementedInterface(createNamedTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferInheritance(info);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testInferInheritance_constructorWithBaseTypeAndInterface() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.declareType("BaseType", objType);

    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordConstructor();
    infoBuilder.recordBaseType(createNamedTypeExpression("BaseType"));
    infoBuilder.recordImplementedInterface(createNamedTypeExpression("BaseType"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("SubClass");
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();

    assertTrue(fn.isConstructor());
    assertEquals(0, compiler.getWarningCount());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInferInheritance_interfaceExtendsInterface() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    registry.declareType("SuperInterface", objType);

    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordInterface();
    infoBuilder.recordBaseType(createNamedTypeExpression("SuperInterface"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("SubInterface");
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();

    assertTrue(fn.isInterface());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testInferInheritance_invalidImplementedType_reportsError() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordConstructor();
    infoBuilder.recordImplementedInterface(createNamedTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferInheritance(info);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInferThisType_fromJSType() {
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferThisType(null, thisType);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(thisType, fn.getTypeOfThis());
  }

  @Test
  public void testInferThisType_fromJSType_ignoredWhenInfoHasType() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordType(createNamedTypeExpression("Function"));
    JSDocInfo info = infoBuilder.build(null);

    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferThisType(info, thisType);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertNull(fn.getTypeOfThis());
  }

  @Test
  public void testInferThisType_fromDocInfo() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordThisType(createNamedTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferThisType(info, (Node) null);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), fn.getTypeOfThis());
  }

  @Test
  public void testInferThisType_fromOwnerNode() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    globalScope.declare("MyOwner", new Node(Token.NAME), objType, null);

    Node ownerNode = Node.newString(Token.NAME, "MyOwner");
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferThisType(null, ownerNode);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(objType, fn.getTypeOfThis());
  }

  @Test
  public void testInferFromOverriddenFunction_nullParamsParent() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    paramBuilder.addRequiredParams(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    FunctionType oldType = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE),
        paramBuilder.build());

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferFromOverriddenFunction(oldType, null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), fn.getReturnType());
    assertEquals(1, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferFromOverriddenFunction_withParamsParent_moreParamsThanOld() {
    FunctionType oldType = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        new Node(Token.LP));

    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "extraParam"));
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferFromOverriddenFunction(oldType, lp);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(1, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferParameterTypes_nullArgsParent_nullInfo() {
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(null, null);
    try {
      builder.buildAndRegister();
      fail("Should throw IllegalStateException because parametersNode is null");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testInferParameterTypes_fromInfoOnly() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordParameterDescription("param1");
    infoBuilder.recordParameterType("param1", createNamedTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(info);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(1, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferParameterTypes_inexistantParamInJSDoc_warns() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordParameterDescription("paramNotInArgs");
    infoBuilder.recordParameterType("paramNotInArgs", createNamedTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP, Node.newString(Token.NAME, "actualParam"));
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(args, info);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testInferParameterTypes_optionalAndVarArgsParams() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    Node optTypeNode = new Node(Token.EQUALS, Node.newString(Token.NAME, "number"));
    Node varargsTypeNode = new Node(Token.ELLIPSIS, Node.newString(Token.NAME, "string"));
    infoBuilder.recordParameterDescription("opt");
    infoBuilder.recordParameterType("opt", createTypeExpression(optTypeNode));
    infoBuilder.recordParameterDescription("rest");
    infoBuilder.recordParameterType("rest", createTypeExpression(varargsTypeNode));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP,
        Node.newString(Token.NAME, "opt"),
        Node.newString(Token.NAME, "rest"));

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(args, info);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testInferParameterTypes_optionalArgNotAtEnd_warns() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    Node optTypeNode = new Node(Token.EQUALS, Node.newString(Token.NAME, "number"));
    infoBuilder.recordParameterDescription("opt");
    infoBuilder.recordParameterType("opt", createTypeExpression(optTypeNode));
    infoBuilder.recordParameterDescription("req");
    infoBuilder.recordParameterType("req", createNamedTypeExpression("string"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP,
        Node.newString(Token.NAME, "opt"),
        Node.newString(Token.NAME, "req"));

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(args, info);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testInferParameterTypes_varArgsMustBeLast_warns() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    Node varargsTypeNode = new Node(Token.ELLIPSIS, Node.newString(Token.NAME, "string"));
    infoBuilder.recordParameterDescription("rest");
    infoBuilder.recordParameterType("rest", createTypeExpression(varargsTypeNode));
    infoBuilder.recordParameterDescription("req");
    infoBuilder.recordParameterType("req", createNamedTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP,
        Node.newString(Token.NAME, "rest"),
        Node.newString(Token.NAME, "req"));

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferParameterTypes(args, info);
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testInferTemplateTypeName_singleTemplateParam_success() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameterDescription("item");
    infoBuilder.recordParameterType("item", createNamedTypeExpression("T"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP, Node.newString(Token.NAME, "item"));
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferTemplateTypeName(info);
    builder.inferParameterTypes(args, info);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInferTemplateTypeName_duplicatedTemplateParam_reportsError() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameterDescription("item1");
    infoBuilder.recordParameterType("item1", createNamedTypeExpression("T"));
    infoBuilder.recordParameterDescription("item2");
    infoBuilder.recordParameterType("item2", createNamedTypeExpression("T"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP,
        Node.newString(Token.NAME, "item1"),
        Node.newString(Token.NAME, "item2"));

    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferTemplateTypeName(info);
    builder.inferParameterTypes(args, info);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testInferTemplateTypeName_templateExpectedButNotFound_reportsError() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameterDescription("item");
    infoBuilder.recordParameterType("item", createNamedTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    Node args = new Node(Token.LP, Node.newString(Token.NAME, "item"));
    FunctionTypeBuilder builder = newBuilder("test");
    builder.inferTemplateTypeName(info);
    builder.inferParameterTypes(args, info);
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testBuildAndRegister_constructorRedefinition_warns() {
    JSDocInfoBuilder info1 = new JSDocInfoBuilder(true);
    info1.recordConstructor();
    FunctionTypeBuilder builder1 = newBuilder("MyClass");
    builder1.inferInheritance(info1.build(null));
    builder1.inferParameterTypes(new Node(Token.LP), null);
    builder1.buildAndRegister();

    JSDocInfoBuilder info2 = new JSDocInfoBuilder(true);
    info2.recordConstructor();
    info2.recordParameterDescription("x");
    info2.recordParameterType("x", createNamedTypeExpression("number"));
    Node args2 = new Node(Token.LP, Node.newString(Token.NAME, "x"));

    FunctionTypeBuilder builder2 = newBuilder("MyClass");
    builder2.inferInheritance(info2.build(null));
    builder2.inferParameterTypes(args2, info2.build(null));
    builder2.buildAndRegister();

    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testBuildAndRegister_interfaceInLocalScope_doesNotDeclareGlobally() {
    Node script = new Node(Token.SCRIPT);
    Scope localScope = new Scope(script, globalScope);

    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordInterface();
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("LocalInterface", localScope);
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertTrue(fn.isInterface());
    assertNull(registry.getType("LocalInterface"));
  }

  @Test
  public void testBuildAndRegister_builtinFunctionConstructor() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordConstructor();
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = newBuilder("Function");
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
  }
}
