package com.google.javascript.rhino.jstype;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.javascript.rhino.ErrorReporter;

public class RecordTypeBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    ErrorReporter reporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int lineNumber) {
        // no-op for testing purposes
      }

      @Override
      public void error(String message, String sourceName, int lineNumber) {
        // no-op for testing purposes
      }
    };
    registry = new JSTypeRegistry(reporter);
  }

  @Test
  public void testAddProperty_normalInput_returnsBuilderInstance() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder result = builder.addProperty("foo", numberType, null);

    assertSame(builder, result);
  }

  @Test
  public void testAddProperty_duplicateProperty_returnsNull() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    builder.addProperty("foo", numberType, null);
    RecordTypeBuilder result = builder.addProperty("foo", numberType, null);

    assertNull(result);
  }

  @Test
  public void testAddProperty_nullTypeAndNode_addsSuccessfully() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    RecordTypeBuilder result = builder.addProperty("bar", null, null);

    assertSame(builder, result);
  }

  @Test
  public void testAddProperty_emptyStringName_addsSuccessfully() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder result = builder.addProperty("", numberType, null);

    assertSame(builder, result);
  }

  @Test
  public void testAddProperty_nullName_addsSuccessfully() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder result = builder.addProperty(null, numberType, null);

    assertSame(builder, result);
  }

  @Test
  public void testAddProperty_nullNameCalledTwice_returnsNullOnSecondCall() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    RecordTypeBuilder firstResult = builder.addProperty(null, numberType, null);
    RecordTypeBuilder secondResult = builder.addProperty(null, numberType, null);

    assertSame(builder, firstResult);
    assertNull(secondResult);
  }

  @Test
  public void testBuild_noPropertiesAdded_returnsObjectType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    JSType result = builder.build();
    JSType expected = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    assertSame(expected, result);
  }

  @Test
  public void testBuild_withSingleProperty_returnsRecordType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    builder.addProperty("foo", numberType, null);
    JSType result = builder.build();

    assertNotNull(result);
    assertTrue(result instanceof RecordType);
  }

  @Test
  public void testBuild_withMultipleProperties_returnsRecordType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    builder.addProperty("foo", numberType, null);
    builder.addProperty("bar", stringType, null);
    JSType result = builder.build();

    assertNotNull(result);
    assertTrue(result instanceof RecordType);
  }

  @Test
  public void testBuild_withDuplicatePropertyAttempt_stillBuildsWithOriginalProperty() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);

    builder.addProperty("foo", numberType, null);
    RecordTypeBuilder duplicateResult = builder.addProperty("foo", stringType, null);

    assertNull(duplicateResult);

    JSType result = builder.build();
    assertTrue(result instanceof RecordType);
  }

  @Test(expected = NullPointerException.class)
  public void testBuild_nullRegistryWithEmptyRecord_throwsNullPointerException() {
    RecordTypeBuilder builder = new RecordTypeBuilder(null);
    builder.build();
  }

  @Test
  public void testConstructor_validRegistry_createsBuilderSuccessfully() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    assertNotNull(builder);
  }

  @Test
  public void testConstructor_nullRegistry_doesNotThrowImmediately() {
    RecordTypeBuilder builder = new RecordTypeBuilder(null);

    assertNotNull(builder);
  }

  @Test
  public void testAddProperty_calledMultipleTimesWithDifferentNames_allSucceed() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    RecordTypeBuilder result1 = builder.addProperty("a", numberType, null);
    RecordTypeBuilder result2 = builder.addProperty("b", stringType, null);
    RecordTypeBuilder result3 = builder.addProperty("c", booleanType, null);

    assertSame(builder, result1);
    assertSame(builder, result2);
    assertSame(builder, result3);
  }
}
