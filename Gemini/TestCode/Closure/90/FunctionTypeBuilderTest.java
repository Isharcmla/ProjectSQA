package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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

import java.util.Collections;

public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Scope globalScope;
  private Scope localScope;
  private Node errorRoot;
  private static final String SOURCE_NAME = "testcode";

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    Node scriptRoot = new Node(Token.SCRIPT);
    scriptRoot.setSourceName(SOURCE_NAME);
    errorRoot = new Node(Token.FUNCTION, Node.newString(Token.NAME, "fn"), new Node(Token.LP), new Node(Token.BLOCK));
    scriptRoot.addChildToBack(errorRoot);
    globalScope = Scope.createGlobalScope(scriptRoot);
    Node localBlock = new Node(Token.BLOCK);
    localScope = new Scope(globalScope, localBlock);
    
    // Register test file in compiler inputs to test extern/non-extern branches
    CompilerInput input = new CompilerInput(SourceFile.fromCode(SOURCE_NAME, ""));
    compiler.putCompilerInput(new CompilerInput.InputId(SOURCE_NAME), input);
  }

  private JSTypeExpression createTypeExpression(String typeName) {
    Node node = Node.newString(Token.NAME, typeName);
    return new JSTypeExpression(node, SOURCE_NAME);
  }

  private JSTypeExpression createTypeExpressionWithNode(Node node) {
    return new JSTypeExpression(node, SOURCE_NAME);
  }

  @Test
  public void testIsFunctionTypeDeclaration() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));

    builder = new JSDocInfoBuilder(false);
    builder.recordParameter("a", createTypeExpression("number"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));

    builder = new JSDocInfoBuilder(false);
    builder.recordReturnType(createTypeExpression("number"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));

    builder = new JSDocInfoBuilder(false);
    builder.recordThisType(createTypeExpression("Object"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));

    builder = new JSDocInfoBuilder(false);
    builder.recordConstructor();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));

    builder = new JSDocInfoBuilder(false);
    builder.recordInterface();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build(null)));
  }

  @Test
  public void testConstructor_nullName() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder(null, compiler, errorRoot, SOURCE_NAME, globalScope);
    assertNotNull(builder);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRootThrows() {
    new FunctionTypeBuilder("fn", compiler, null, SOURCE_NAME, globalScope);
  }

  @Test
  public void testBuild_withoutParametersThrows() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    try {
      builder.buildAndRegister();
      fail("Expected IllegalStateException");
    } catch (IllegalStateException expected) {
      assertEquals("All Function types must have params and a return type", expected.getMessage());
    }
  }

  @Test
  public void testBuild_basicFunction() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, SOURCE_NAME, globalScope);
    Node lp = new Node(Token.LP);
    builder.inferParameterTypes(lp, null);
    builder.setSourceNode(errorRoot);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
    assertEquals("myFunc", fn.getDisplayName());
    assertEquals(0, compiler.getWarningCount());
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testInferFromOverriddenFunction_null() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferFromOverriddenFunction(null, null);
    // Should do nothing gracefully
    Node lp = new Node(Token.LP);
    builder.inferParameterTypes(lp, null);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
  }

  @Test
  public void testInferFromOverriddenFunction_nullParamsParent() {
    FunctionType overridden = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferFromOverriddenFunction(overridden, null);
    FunctionType fn = builder.buildAndRegister();
    assertNotNull(fn);
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), fn.getReturnType());
    assertEquals(1, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferFromOverriddenFunction_withParamsParentAndVarargs() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    paramBuilder.addVarArgs(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node oldParams = paramBuilder.build();
    FunctionType overridden = registry.createFunctionType(
        registry.getNativeType(JSTypeNative.STRING_TYPE), oldParams);

    // Literal has two params: override var_args with individual args + extra arg
    Node newParams = new Node(Token.LP,
        Node.newString(Token.NAME, "a"),
        Node.newString(Token.NAME, "b"),
        Node.newString(Token.NAME, "extra"));

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferFromOverriddenFunction(overridden, newParams);
    FunctionType fn = builder.buildAndRegister();

    assertNotNull(fn);
    assertEquals(3, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferReturnType_fromJSDoc() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordReturnType(createTypeExpression("boolean"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferReturnType(info);
    Node lp = new Node(Token.LP);
    builder.inferParameterTypes(lp, null);
    FunctionType fn = builder.buildAndRegister();

    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), fn.getReturnType());
  }

  @Test
  public void testInferReturnStatementsAsLastResort_nullOrExtern() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferReturnStatementsAsLastResort(null);

    // Extern input check
    CompilerInput externInput = new CompilerInput(SourceFile.fromCode("externs.js", ""), true);
    compiler.putCompilerInput(new CompilerInput.InputId("externs.js"), externInput);
    FunctionTypeBuilder externBuilder = new FunctionTypeBuilder("fn", compiler, errorRoot, "externs.js", globalScope);
    Node block = new Node(Token.BLOCK);
    externBuilder.inferReturnStatementsAsLastResort(block);
  }

  @Test
  public void testInferReturnStatementsAsLastResort_withNonEmptyReturnAndThrow() {
    Node block1 = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newString(Token.NAME, "x")));
    FunctionTypeBuilder builder1 = new FunctionTypeBuilder("fn1", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder1.inferReturnStatementsAsLastResort(block1);
    builder1.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn1 = builder1.buildAndRegister();
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), fn1.getReturnType());

    Node block2 = new Node(Token.BLOCK, new Node(Token.IF, new Node(Token.NAME, "c"), new Node(Token.BLOCK, new Node(Token.THROW, Node.newString(Token.NAME, "e")))));
    FunctionTypeBuilder builder2 = new FunctionTypeBuilder("fn2", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder2.inferReturnStatementsAsLastResort(block2);
    builder2.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn2 = builder2.buildAndRegister();
    assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), fn2.getReturnType());
  }

  @Test
  public void testInferReturnStatementsAsLastResort_voidReturn() {
    Node block = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1)));
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferReturnStatementsAsLastResort(block);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();

    assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), fn.getReturnType());
    assertTrue(fn.isReturnTypeInferred());
  }

  @Test
  public void testInferInheritance_extendsWithoutConstructorOrInterface() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordBaseType(createTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.EXTENDS_WITHOUT_TYPEDEF.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructorOrInterface() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordImplementedInterface(createTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.IMPLEMENTS_WITHOUT_CONSTRUCTOR.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_constructorWithExtendsAndImplements() {
    FunctionType baseCtor = registry.createConstructorType("SuperClass", null, null, null);
    FunctionType iface = registry.createInterfaceType("AnInterface", null);
    baseCtor.setImplementedInterfaces(Collections.singletonList(iface.getInstanceType()));
    registry.declareType("SuperClass", baseCtor.getInstanceType());
    registry.declareType("AnInterface", iface.getInstanceType());

    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordConstructor();
    infoBuilder.recordBaseType(createTypeExpression("SuperClass"));
    infoBuilder.recordImplementedInterface(createTypeExpression("AnInterface"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("SubClass", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), info);
    FunctionType fn = builder.buildAndRegister();

    assertTrue(fn.isConstructor());
    assertNotNull(fn.getPrototype());
    assertTrue(fn.getImplementedInterfaces().iterator().hasNext());
  }

  @Test
  public void testInferInheritance_extendsNonObject() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordConstructor();
    infoBuilder.recordBaseType(createTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("SubClass", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.EXTENDS_NON_OBJECT.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_implementsNonObject() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordConstructor();
    infoBuilder.recordImplementedInterface(createTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("SubClass", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    assertEquals(1, compiler.getErrorCount());
    assertEquals(TypeCheck.BAD_IMPLEMENTED_TYPE.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferInheritance_interfaceTypeDeclaration() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordInterface();
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("MyInterface", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), info);
    FunctionType fn = builder.buildAndRegister();

    assertTrue(fn.isInterface());
    assertNotNull(registry.getType("MyInterface"));

    // Also test local scope interface
    FunctionTypeBuilder localBuilder = new FunctionTypeBuilder("LocalInterface", compiler, errorRoot, SOURCE_NAME, localScope);
    localBuilder.inferInheritance(info);
    localBuilder.inferParameterTypes(new Node(Token.LP), info);
    FunctionType localFn = localBuilder.buildAndRegister();
    assertTrue(localFn.isInterface());
  }

  @Test
  public void testInferThisType_fromTypeAndInfo() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferThisType(null, objType);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(objType, fn.getTypeOfThis());

    // If info has @type, it shouldn't overwrite
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordType(createTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder2 = new FunctionTypeBuilder("fn2", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder2.inferThisType(info, objType);
    builder2.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn2 = builder2.buildAndRegister();
    assertNull(fn2.getTypeOfThis());
  }

  @Test
  public void testInferThisType_fromOwnerAndDoc() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordThisType(createTypeExpression("Object"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferThisType(info, (Node) null);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), fn.getTypeOfThis());

    // Non-object this type warning
    JSDocInfoBuilder badInfoBuilder = new JSDocInfoBuilder(false);
    badInfoBuilder.recordThisType(createTypeExpression("number"));
    JSDocInfo badInfo = badInfoBuilder.build(null);

    FunctionTypeBuilder badBuilder = new FunctionTypeBuilder("fnBad", compiler, errorRoot, SOURCE_NAME, globalScope);
    badBuilder.inferThisType(badInfo, (Node) null);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.THIS_TYPE_NON_OBJECT.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferThisType_fromOwnerNode() {
    FunctionType ctor = registry.createConstructorType("OwnerClass", null, null, null);
    registry.declareType("OwnerClass", ctor.getInstanceType());

    Node owner = Node.newString(Token.NAME, "OwnerClass");
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferThisType(null, owner);
    builder.inferParameterTypes(new Node(Token.LP), null);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(ctor.getInstanceType(), fn.getTypeOfThis());
  }

  @Test
  public void testInferParameterTypes_fromDocOnly() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordParameter("a", createTypeExpression("number"));
    infoBuilder.recordParameter("b", createTypeExpression("string"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferParameterTypes(info);
    FunctionType fn = builder.buildAndRegister();
    assertEquals(2, fn.getParametersNode().getChildCount());
  }

  @Test
  public void testInferParameterTypes_withInexistentParamWarning() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordParameter("nonexistent", createTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "actual"));
    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferParameterTypes(lp, info);
    builder.buildAndRegister();

    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.INEXISTANT_PARAM.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_optionalAndVarArgsValidation() {
    // Optional argument before required argument
    Node optTypeNode = new Node(Token.EQUALS, Node.newString(Token.NAME, "number"));
    Node varArgsTypeNode = new Node(Token.ELLIPSIS, Node.newString(Token.NAME, "string"));

    JSDocInfoBuilder infoBuilder1 = new JSDocInfoBuilder(false);
    infoBuilder1.recordParameter("opt", createTypeExpressionWithNode(optTypeNode));
    infoBuilder1.recordParameter("req", createTypeExpression("number"));
    JSDocInfo info1 = infoBuilder1.build(null);

    Node lp1 = new Node(Token.LP, Node.newString(Token.NAME, "opt"), Node.newString(Token.NAME, "req"));
    FunctionTypeBuilder builder1 = new FunctionTypeBuilder("fn1", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder1.inferParameterTypes(lp1, info1);
    builder1.buildAndRegister();

    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.OPTIONAL_ARG_AT_END.key, compiler.getWarnings()[0].getType().key);

    // Varargs argument not last
    JSDocInfoBuilder infoBuilder2 = new JSDocInfoBuilder(false);
    infoBuilder2.recordParameter("va", createTypeExpressionWithNode(varArgsTypeNode));
    infoBuilder2.recordParameter("opt", createTypeExpressionWithNode(optTypeNode));
    JSDocInfo info2 = infoBuilder2.build(null);

    Node lp2 = new Node(Token.LP, Node.newString(Token.NAME, "va"), Node.newString(Token.NAME, "opt"));
    FunctionTypeBuilder builder2 = new FunctionTypeBuilder("fn2", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder2.inferParameterTypes(lp2, info2);
    builder2.buildAndRegister();

    assertTrue(compiler.getWarningCount() >= 2);
  }

  @Test
  public void testInferTemplateTypeName_andValidation() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameter("a", createTypeExpression("T"));
    infoBuilder.recordParameter("b", createTypeExpression("T"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferTemplateTypeName(info);
    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
    builder.inferParameterTypes(lp, info);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(FunctionTypeBuilder.TEMPLATE_TYPE_DUPLICATED.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferTemplateTypeName_expectedTemplateTypeNotUsed() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameter("a", createTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferTemplateTypeName(info);
    Node lp = new Node(Token.LP, Node.newString(Token.NAME, "a"));
    builder.inferParameterTypes(lp, info);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferTemplateTypeName_returnTypeCannotBeTemplateTypeDirectly() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordReturnType(createTypeExpression("T"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("fn", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferTemplateTypeName(info);
    builder.inferReturnType(info);

    assertEquals(1, compiler.getErrorCount());
    assertEquals(FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testGetOrCreateConstructor_redefinitionWarning() {
    FunctionType origCtor = registry.createConstructorType("ExistingType", null, null, null);
    registry.declareType("ExistingType", origCtor.getInstanceType());

    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordConstructor();
    infoBuilder.recordReturnType(createTypeExpression("number"));
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("ExistingType", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    builder.inferReturnType(info);
    builder.inferParameterTypes(new Node(Token.LP), info);
    FunctionType result = builder.buildAndRegister();

    assertNotNull(result);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(FunctionTypeBuilder.TYPE_REDEFINITION.key, compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testGetOrCreateConstructor_functionNativeRedefinition() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(false);
    infoBuilder.recordConstructor();
    JSDocInfo info = infoBuilder.build(null);

    FunctionTypeBuilder builder = new FunctionTypeBuilder("Function", compiler, errorRoot, SOURCE_NAME, globalScope);
    builder.inferInheritance(info);
    builder.inferParameterTypes(new Node(Token.LP), info);
    FunctionType result = builder.buildAndRegister();

    assertNotNull(result);
  }
}
