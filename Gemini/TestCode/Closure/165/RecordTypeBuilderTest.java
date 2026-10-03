package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecordTypeBuilderTest {
  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private Node propertyNode;

  @Before
  public void setUp() {
    SimpleErrorReporter errorReporter = new SimpleErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    propertyNode = new Node(0);
  }

  @Test
  public void testBuild_emptyBuilder_returnsNativeObjectType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType result = builder.build();

    Assert.assertNotNull(result);
    Assert.assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), result);
    Assert.assertFalse(result.isRecordType());
  }

  @Test
  public void testAddProperty_singleProperty_returnsBuilderAndBuildsRecordType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder chained = builder.addProperty("age", numberType, propertyNode);

    Assert.assertSame(builder, chained);

    JSType result = builder.build();
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
    Assert.assertTrue(result instanceof RecordType);

    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty("age"));
    Assert.assertEquals(numberType, recordType.getPropertyType("age"));
    Assert.assertEquals(propertyNode, recordType.getPropertyNode("age"));
  }

  @Test
  public void testAddProperty_multipleDistinctProperties_allPropertiesPresent() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    Node secondNode = new Node(0);

    RecordTypeBuilder chained1 = builder.addProperty("age", numberType, propertyNode);
    RecordTypeBuilder chained2 = builder.addProperty("name", stringType, secondNode);

    Assert.assertSame(builder, chained1);
    Assert.assertSame(builder, chained2);

    JSType result = builder.build();
    Assert.assertTrue(result.isRecordType());

    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty("age"));
    Assert.assertTrue(recordType.hasProperty("name"));
    Assert.assertEquals(numberType, recordType.getPropertyType("age"));
    Assert.assertEquals(stringType, recordType.getPropertyType("name"));
  }

  @Test
  public void testAddProperty_duplicateProperty_returnsNull() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder firstAdd = builder.addProperty("duplicate", numberType, propertyNode);
    Assert.assertNotNull(firstAdd);

    RecordTypeBuilder secondAdd = builder.addProperty("duplicate", stringType, new Node(0));
    Assert.assertNull(secondAdd);

    JSType result = builder.build();
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertEquals(numberType, recordType.getPropertyType("duplicate"));
  }

  @Test
  public void testAddProperty_emptyPropertyName_success() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder chained = builder.addProperty("", stringType, propertyNode);

    Assert.assertSame(builder, chained);

    JSType result = builder.build();
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty(""));
    Assert.assertEquals(stringType, recordType.getPropertyType(""));
  }

  @Test
  public void testAddProperty_nullTypeAndNode_success() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder chained = builder.addProperty("nullableProp", null, null);

    Assert.assertSame(builder, chained);

    JSType result = builder.build();
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty("nullableProp"));
    Assert.assertNull(recordType.getPropertyNode("nullableProp"));
  }

  @Test
  public void testRecordProperty_constructorAndGetters_returnCorrectValues() {
    RecordTypeBuilder.RecordProperty recordProperty =
        new RecordTypeBuilder.RecordProperty(numberType, propertyNode);

    Assert.assertEquals(numberType, recordProperty.getType());
    Assert.assertEquals(propertyNode, recordProperty.getPropertyNode());
  }

  @Test
  public void testRecordProperty_nullValues_gettersReturnNull() {
    RecordTypeBuilder.RecordProperty recordProperty =
        new RecordTypeBuilder.RecordProperty(null, null);

    Assert.assertNull(recordProperty.getType());
    Assert.assertNull(recordProperty.getPropertyNode());
  }
}
