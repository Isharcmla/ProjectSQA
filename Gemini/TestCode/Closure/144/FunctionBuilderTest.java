package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
  }

  @Test
  public void testBuild_defaultValues_returnsDefaultFunctionType() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType functionType = builder.build();

    Assert.assertNotNull(functionType);
    Assert.assertNull(functionType.getReferenceName());
    Assert.assertNull(functionType.getSource());
    Assert.assertFalse(functionType.isConstructor());
    Assert.assertFalse(functionType.isNativeObjectType());
    Assert.assertFalse(functionType.isReturnTypeInferred());
    Assert.assertNull(functionType.getTemplateTypeName());
  }

  @Test
  public void testWithName_validAndEmptyAndNull_setsName() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType functionType = builder.withName("myFunction").build();
    Assert.assertEquals("myFunction", functionType.getReferenceName());

    functionType = new FunctionBuilder(registry).withName("").build();
    Assert.assertEquals("", functionType.getReferenceName());

    functionType = new FunctionBuilder(registry).withName(null).build();
    Assert.assertNull(functionType.getReferenceName());
  }

  @Test
  public void testWithSourceNode_validAndNull_setsSourceNode() {
    Node sourceNode = new Node(0);
    FunctionType functionType = new FunctionBuilder(registry)
        .withSourceNode(sourceNode)
        .build();
    Assert.assertSame(sourceNode, functionType.getSource());

    functionType = new FunctionBuilder(registry)
        .withSourceNode(null)
        .build();
    Assert.assertNull(functionType.getSource());
  }

  @Test
  public void testWithParams_usingParamBuilder_setsParameters() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    paramBuilder.addRequiredParams(stringType);

    FunctionType functionType = new FunctionBuilder(registry)
        .withParams(paramBuilder)
        .build();

    Assert.assertNotNull(functionType.getParametersNode());
    Assert.assertEquals(1, functionType.getParametersNode().getChildCount());
  }

  @Test
  public void testWithParamsNode_directNode_setsParametersNode() {
    Node paramsNode = new Node(0);
    FunctionType functionType = new FunctionBuilder(registry)
        .withParamsNode(paramsNode)
        .build();

    Assert.assertSame(paramsNode, functionType.getParametersNode());

    functionType = new FunctionBuilder(registry)
        .withParamsNode(null)
        .build();
    Assert.assertNull(functionType.getParametersNode());
  }

  @Test
  public void testWithReturnType_setsReturnTypeAndInferredFalse() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionType functionType = new FunctionBuilder(registry)
        .withReturnType(numberType)
        .build();

    Assert.assertEquals(numberType, functionType.getReturnType());
    Assert.assertFalse(functionType.isReturnTypeInferred());
  }

  @Test
  public void testWithInferredReturnType_setsReturnTypeAndInferredTrue() {
    JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    FunctionType functionType = new FunctionBuilder(registry)
        .withInferredReturnType(booleanType)
        .build();

    Assert.assertEquals(booleanType, functionType.getReturnType());
    Assert.assertTrue(functionType.isReturnTypeInferred());

    functionType = new FunctionBuilder(registry)
        .withInferredReturnType(null)
        .build();
    Assert.assertNull(functionType.getReturnType());
    Assert.assertTrue(functionType.isReturnTypeInferred());
  }

  @Test
  public void testWithTypeOfThis_setsTypeOfThis() {
    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionType functionType = new FunctionBuilder(registry)
        .withTypeOfThis(objectType)
        .build();

    Assert.assertSame(objectType, functionType.getTypeOfThis());

    functionType = new FunctionBuilder(registry)
        .withTypeOfThis(null)
        .build();
    Assert.assertNull(functionType.getTypeOfThis());
  }

  @Test
  public void testWithTemplateName_setsTemplateName() {
    FunctionType functionType = new FunctionBuilder(registry)
        .withTemplateName("T")
        .build();
    Assert.assertEquals("T", functionType.getTemplateTypeName());

    functionType = new FunctionBuilder(registry)
        .withTemplateName("")
        .build();
    Assert.assertEquals("", functionType.getTemplateTypeName());

    functionType = new FunctionBuilder(registry)
        .withTemplateName(null)
        .build();
    Assert.assertNull(functionType.getTemplateTypeName());
  }

  @Test
  public void testForConstructor_makesFunctionConstructor() {
    FunctionType functionType = new FunctionBuilder(registry)
        .forConstructor()
        .build();

    Assert.assertTrue(functionType.isConstructor());
  }

  @Test
  public void testForNativeType_makesFunctionNativeType() {
    FunctionType functionType = new FunctionBuilder(registry)
        .forNativeType()
        .build();

    Assert.assertTrue(functionType.isNativeObjectType());
  }

  @Test
  public void testCopyFromOtherFunction_copiesAllProperties() {
    Node sourceNode = new Node(0);
    Node paramsNode = new Node(0);
    JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    FunctionType original = new FunctionBuilder(registry)
        .withName("OriginalFunc")
        .withSourceNode(sourceNode)
        .withParamsNode(paramsNode)
        .withReturnType(returnType)
        .withTypeOfThis(thisType)
        .withTemplateName("T")
        .forConstructor()
        .forNativeType()
        .build();

    FunctionType copied = new FunctionBuilder(registry)
        .copyFromOtherFunction(original)
        .build();

    Assert.assertEquals(original.getReferenceName(), copied.getReferenceName());
    Assert.assertSame(original.getSource(), copied.getSource());
    Assert.assertSame(original.getParametersNode(), copied.getParametersNode());
    Assert.assertEquals(original.getReturnType(), copied.getReturnType());
    Assert.assertSame(original.getTypeOfThis(), copied.getTypeOfThis());
    Assert.assertEquals(original.getTemplateTypeName(), copied.getTemplateTypeName());
    Assert.assertEquals(original.isConstructor(), copied.isConstructor());
    Assert.assertEquals(original.isNativeObjectType(), copied.isNativeObjectType());
  }

  @Test
  public void testFluentChaining_allMethodsChained_buildsCorrectFunction() {
    Node sourceNode = new Node(0);
    Node paramsNode = new Node(0);
    JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    FunctionType functionType = new FunctionBuilder(registry)
        .withName("chainedFunction")
        .withSourceNode(sourceNode)
        .withParamsNode(paramsNode)
        .withReturnType(returnType)
        .withTypeOfThis(thisType)
        .withTemplateName("TypeParam")
        .forConstructor()
        .forNativeType()
        .build();

    Assert.assertEquals("chainedFunction", functionType.getReferenceName());
    Assert.assertSame(sourceNode, functionType.getSource());
    Assert.assertSame(paramsNode, functionType.getParametersNode());
    Assert.assertEquals(returnType, functionType.getReturnType());
    Assert.assertSame(thisType, functionType.getTypeOfThis());
    Assert.assertEquals("TypeParam", functionType.getTemplateTypeName());
    Assert.assertTrue(functionType.isConstructor());
    Assert.assertTrue(functionType.isNativeObjectType());
  }
}
