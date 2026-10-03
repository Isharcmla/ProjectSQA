package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Iterables;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.FunctionTypeBuilder.UnknownFunctionContents;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
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
  private Node errorRoot;
  private Scope scope;

  @Before
  public void setUp() {
    compiler = new Compiler();
    compiler.initCompilerOptionsIfTesting();
    registry = compiler.getTypeRegistry();
    errorRoot = IR.script();
    scope = SyntacticScopeCreator.generateUntypedTopScope(compiler);
  }

  @Test
  public void testConstructor_nullFnName_createsWithEmptyName() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder(null, compiler, errorRoot, "test.js", scope);
    assertNotNull(builder);
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullErrorRoot_throwsException() {
    new FunctionTypeBuilder("testFn", compiler, null, "test.js", scope);
  }

  @Test
  public void testSetContents_nullAndNonNull() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);

    // Passing null should be ignored without NPE
    builder.setContents(null);

    Node fnNode = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    AstFunctionContents astContents = new AstFunctionContents(fnNode);
    builder.setContents(astContents);

    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType type = builder.buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testUnknownFunctionContents_singletonProperties() {
    FunctionTypeBuilder.FunctionContents unknown = UnknownFunctionContents.get();
    assertNotNull(unknown);
    assertSame(unknown, UnknownFunctionContents.get());
    assertNull(unknown.getSourceNode());
    assertTrue(unknown.mayBeFromExterns());
    assertTrue(unknown.mayHaveNonEmptyReturns());
    assertFalse(unknown.getEscapedVarNames().iterator().hasNext());
  }

  @Test
  public void testAstFunctionContents_methods() {
    Node fnNode = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    AstFunctionContents contents = new AstFunctionContents(fnNode);

    assertSame(fnNode, contents.getSourceNode());
    assertFalse(contents.mayBeFromExterns());
    assertFalse(contents.mayHaveNonEmptyReturns());
    assertEquals(0, Iterables.size(contents.getEscapedVarNames()));

    contents.recordNonEmptyReturn();
    assertTrue(contents.mayHaveNonEmptyReturns());

    contents.recordEscapedVarName("var1");
    contents.recordEscapedVarName("var2");
    assertEquals(2, Iterables.size(contents.getEscapedVarNames()));
  }

  @Test
  public void testIsFunctionTypeDeclaration() {
    JSDocInfoBuilder builder = new JSDocInfoBuilder(true);
    JSDocInfo emptyInfo = builder.build();
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(emptyInfo));

    builder = new JSDocInfoBuilder(true);
    builder.recordConstructor();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build()));

    builder = new JSDocInfoBuilder(true);
    builder.recordInterface();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build()));

    builder = new JSDocInfoBuilder(true);
    builder.recordReturnType(new JSTypeExpression(IR.string("number"), "test.js"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build()));

    builder = new JSDocInfoBuilder(true);
    builder.recordThisType(new JSTypeExpression(IR.string("Object"), "test.js"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build()));

    builder = new JSDocInfoBuilder(true);
    builder.recordParameter("x", new JSTypeExpression(IR.string("number"), "test.js"));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(builder.build()));
  }

  @Test
  public void testInferFromOverriddenFunction_nullOldType_returnsThis() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    assertSame(builder, builder.inferFromOverriddenFunction(null, null));
  }

  @Test
  public void testInferFromOverriddenFunction_nullParamsParent_copiesOldParameters() {
    FunctionType oldType =
        registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            registry.getNativeType(JSTypeNative.STRING_TYPE));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferFromOverriddenFunction(oldType, null);

    FunctionType newType = builder.buildAndRegister();
    assertNotNull(newType);
    assertEquals(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE), newType.getReturnType());
  }

  @Test
  public void testInferFromOverriddenFunction_withParamsParent_normalAndVarArgs() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    paramBuilder.addVarArgs(registry.getNativeType(JSTypeNative.STRING_TYPE));
    FunctionType oldType =
        registry.createFunctionType(
            registry.getNativeType(JSTypeNative.NUMBER_TYPE),
            paramBuilder.build());

    Node param1 = IR.name("a");
    Node param2 = IR.name("b");
    Node paramsParent = IR.paramList(param1, param2);

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferFromOverriddenFunction(oldType, paramsParent);

    FunctionType newType = builder.buildAndRegister();
    assertNotNull(newType);
  }

  @Test
  public void testInferReturnType_nullAndNonNull() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);

    builder.inferReturnType(null);

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordReturnType(
        new JSTypeExpression(IR.string("number"), "test.js"));
    builder.inferReturnType(docBuilder.build());

    builder.inferParameterTypes(IR.paramList(), null);
    FunctionType type = builder.buildAndRegister();
    assertEquals(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE), type.getReturnType());
  }

  @Test
  public void testInferReturnType_templateTypeExpectedError() {
    JSDocInfoBuilder templateDoc = new JSDocInfoBuilder(true);
    templateDoc.recordTemplateTypeName("T");
    JSDocInfo info = templateDoc.build();

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferTemplateTypeName(info);

    JSDocInfoBuilder returnDoc = new JSDocInfoBuilder(true);
    returnDoc.recordReturnType(new JSTypeExpression(IR.string("T"), "test.js"));
    builder.inferReturnType(returnDoc.build());

    assertEquals(1, compiler.getErrorCount());
    assertEquals(
        FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferInheritance_extendsWithoutTypedefWarning() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordBaseType(
        new JSTypeExpression(IR.string("Object"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.EXTENDS_WITHOUT_TYPEDEF.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_implementsWithoutConstructorWarning() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordImplementedInterface(
        new JSTypeExpression(IR.string("Object"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.IMPLEMENTS_WITHOUT_CONSTRUCTOR.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_constructorWithBaseTypeAndImplements() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordConstructor();
    docBuilder.recordBaseType(
        new JSTypeExpression(IR.string("Object"), "test.js"));
    docBuilder.recordImplementedInterface(
        new JSTypeExpression(IR.string("Object"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("MyCtor", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType ctor = builder.buildAndRegister();
    assertTrue(ctor.isConstructor());
    assertNotNull(ctor.getImplementedInterfaces());
  }

  @Test
  public void testInferInheritance_interfaceWithExtendedInterfaces() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordInterface();
    docBuilder.recordExtendedInterface(
        new JSTypeExpression(IR.string("Object"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("MyInterface", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType iface = builder.buildAndRegister();
    assertTrue(iface.isInterface());
    assertNotNull(iface.getExtendedInterfaces());
  }

  @Test
  public void testInferInheritance_extendsNonObjectTypeWarning() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordConstructor();
    docBuilder.recordBaseType(
        new JSTypeExpression(IR.string("number"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("MyClass", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.EXTENDS_NON_OBJECT.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferInheritance_badImplementedType() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordConstructor();
    docBuilder.recordImplementedInterface(
        new JSTypeExpression(IR.string("number"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("MyClass", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(docBuilder.build());

    assertEquals(1, compiler.getErrorCount());
    assertEquals(TypeCheck.BAD_IMPLEMENTED_TYPE.key, compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferThisType_fromDocInfoAndDefault() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordThisType(
        new JSTypeExpression(IR.string("Object"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferThisType(docBuilder.build(), registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType.getTypeOfThis());
  }

  @Test
  public void testInferThisType_defaultWhenNoDocInfo() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferThisType(null, registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType.getTypeOfThis());
  }

  @Test
  public void testInferThisType_nonObjectWarning() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordThisType(
        new JSTypeExpression(IR.string("number"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferThisType(docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.THIS_TYPE_NON_OBJECT.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_fromDocOnly() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordParameter("a", new JSTypeExpression(IR.string("string"), "test.js"));
    docBuilder.recordParameter("b", new JSTypeExpression(IR.string("number"), "test.js"));
    JSDocInfo info = docBuilder.build();

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferParameterTypes(info);

    FunctionType fnType = builder.buildAndRegister();
    assertEquals(2, fnType.getParametersCount());
  }

  @Test
  public void testInferParameterTypes_nullArgsParentAndInfo() {
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferParameterTypes(null, null);

    try {
      builder.buildAndRegister();
      fail("Expected IllegalStateException when building without params");
    } catch (IllegalStateException e) {
      assertEquals(
          "All Function types must have params and a return type",
          e.getMessage());
    }
  }

  @Test
  public void testInferParameterTypes_inexistentParamWarning() {
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordParameter("missingParam", new JSTypeExpression(IR.string("string"), "test.js"));

    Node args = IR.paramList(IR.name("actualParam"));
    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferParameterTypes(args, docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.INEXISTANT_PARAM.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_templateType_duplicatedAndExpected() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameter("p1", new JSTypeExpression(IR.string("T"), "test.js"));
    infoBuilder.recordParameter("p2", new JSTypeExpression(IR.string("T"), "test.js"));

    Node args = IR.paramList(IR.name("p1"), IR.name("p2"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferTemplateTypeName(infoBuilder.build());
    builder.inferParameterTypes(args, infoBuilder.build());

    assertEquals(1, compiler.getErrorCount());
    assertEquals(
        FunctionTypeBuilder.TEMPLATE_TYPE_DUPLICATED.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_templateType_missingInParams() {
    JSDocInfoBuilder infoBuilder = new JSDocInfoBuilder(true);
    infoBuilder.recordTemplateTypeName("T");
    infoBuilder.recordParameter("p1", new JSTypeExpression(IR.string("number"), "test.js"));

    Node args = IR.paramList(IR.name("p1"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferTemplateTypeName(infoBuilder.build());
    builder.inferParameterTypes(args, infoBuilder.build());

    assertEquals(1, compiler.getErrorCount());
    assertEquals(
        FunctionTypeBuilder.TEMPLATE_TYPE_EXPECTED.key,
        compiler.getErrors()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_optionalAndVarArgsOrderingWarnings() {
    Node optParam = IR.name("opt");
    Node reqParam = IR.name("req");
    Node args = IR.paramList(optParam, reqParam);

    Node optTypeNode = new Node(com.google.javascript.rhino.Token.EQUALS, IR.string("number"));
    JSTypeExpression optExpr = new JSTypeExpression(optTypeNode, "test.js");

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordParameter("opt", optExpr);
    docBuilder.recordParameter("req", new JSTypeExpression(IR.string("number"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferParameterTypes(args, docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.OPTIONAL_ARG_AT_END.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testInferParameterTypes_varArgsNotLastWarning() {
    Node varParam = IR.name("varArgs");
    Node reqParam = IR.name("req");
    Node args = IR.paramList(varParam, reqParam);

    Node varTypeNode = new Node(com.google.javascript.rhino.Token.ELLIPSIS, IR.string("number"));
    JSTypeExpression varExpr = new JSTypeExpression(varTypeNode, "test.js");

    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(true);
    docBuilder.recordParameter("varArgs", varExpr);
    docBuilder.recordParameter("req", new JSTypeExpression(IR.string("number"), "test.js"));

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.inferParameterTypes(args, docBuilder.build());

    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.VAR_ARGS_MUST_BE_LAST.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testBuildAndRegister_voidReturnTypeInference() {
    Node fnNode = IR.function(IR.name("foo"), IR.paramList(), IR.block());
    AstFunctionContents astContents = new AstFunctionContents(fnNode);

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("foo", compiler, errorRoot, "test.js", scope);
    builder.setContents(astContents);
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType type = builder.buildAndRegister();
    assertEquals(
        registry.getNativeType(JSTypeNative.VOID_TYPE), type.getReturnType());
  }

  @Test
  public void testBuildAndRegister_constructorRedefinitionWarning() {
    Node fnNode = IR.function(IR.name("Function"), IR.paramList(), IR.block());
    AstFunctionContents astContents = new AstFunctionContents(fnNode);

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("Function", compiler, errorRoot, "test.js", scope);
    builder.setContents(astContents);

    JSDocInfoBuilder doc = new JSDocInfoBuilder(true);
    doc.recordConstructor();
    builder.inferInheritance(doc.build());

    Node args = IR.paramList(IR.name("arg1"));
    builder.inferParameterTypes(args, null);

    FunctionType ctor = builder.buildAndRegister();
    assertNotNull(ctor);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(
        FunctionTypeBuilder.TYPE_REDEFINITION.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void testBuildAndRegister_interfaceInGlobalScopeAndDottedName() {
    JSDocInfoBuilder doc = new JSDocInfoBuilder(true);
    doc.recordInterface();

    FunctionTypeBuilder builder =
        new FunctionTypeBuilder("ns.MyInterface", compiler, errorRoot, "test.js", scope);
    builder.inferInheritance(doc.build());
    builder.inferParameterTypes(IR.paramList(), null);

    FunctionType iface = builder.buildAndRegister();
    assertTrue(iface.isInterface());
  }
}
