package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.ErrorReporter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit tests for {@link NamedType}.
 *
 * หมายเหตุ: NamedType เป็น package-private class ใน com.google.javascript.rhino.jstype
 * ดังนั้น test class นี้ต้องอยู่ใน package เดียวกันเพื่อสามารถเข้าถึง constructor
 * และ package-private method ต่าง ๆ ได้
 *
 * บาง method (resolveInternal, resolveViaProperties, getTypedefType) ต้องใช้
 * StaticScope/StaticSlot ซึ่งไม่มีข้อมูล API ที่ชัดเจนใน source ที่ให้มา
 * จึงหลีกเลี่ยงการเรียกใช้ method เหล่านั้นโดยตรง เพื่อไม่ต้องเดา API ที่ไม่ได้ให้มา
 */
public class NamedTypeTest {

  private JSTypeRegistry registry;
  private TestErrorReporter errorReporter;

  /**
   * Simple hand-written implementation of ErrorReporter (ไม่ใช่ mocking framework)
   * เพื่อใช้สร้าง JSTypeRegistry สำหรับทดสอบ
   */
  private static class TestErrorReporter implements ErrorReporter {
    List<String> warnings = new ArrayList<String>();
    List<String> errors = new ArrayList<String>();

    @Override
    public void warning(String message, String sourceName, int line, int lineOffset) {
      warnings.add(message);
    }

    @Override
    public void error(String message, String sourceName, int line, int lineOffset) {
      errors.add(message);
    }
  }

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    registry = new JSTypeRegistry(errorReporter);
  }

  private NamedType createNamedType(String reference) {
    return new NamedType(registry, reference, "source.js", 1, 1);
  }

  // ---------- Constructor tests ----------

  @Test
  public void testConstructor_validReference_createsNamedType() {
    NamedType type = createNamedType("Foo");
    assertNotNull(type);
    assertEquals("Foo", type.getReferenceName());
  }

  @Test(expected = NullPointerException.class)
  public void testConstructor_nullReference_throwsException() {
    new NamedType(registry, null, "source.js", 1, 1);
  }

  @Test
  public void testConstructor_nullReference_throwsExceptionCaught() {
    boolean caught = false;
    try {
      new NamedType(registry, null, "source.js", 1, 1);
    } catch (NullPointerException e) {
      caught = true;
    }
    assertTrue(caught);
  }

  @Test
  public void testConstructor_emptyReference_noExceptionThrown() {
    NamedType type = createNamedType("");
    assertNotNull(type);
    assertEquals("", type.getReferenceName());
  }

  @Test
  public void testConstructor_negativeLineAndChar_noExceptionThrown() {
    NamedType type = new NamedType(registry, "Foo", "source.js", -1, -1);
    assertNotNull(type);
  }

  @Test
  public void testConstructor_nullSourceName_noExceptionThrown() {
    NamedType type = new NamedType(registry, "Foo", null, 0, 0);
    assertNotNull(type);
  }

  @Test
  public void testConstructor_zeroLineAndChar_boundaryValue() {
    NamedType type = new NamedType(registry, "Foo", "source.js", 0, 0);
    assertNotNull(type);
    assertEquals("Foo", type.getReferenceName());
  }

  // ---------- getReferenceName tests ----------

  @Test
  public void testGetReferenceName_returnsGivenReference() {
    NamedType type = createNamedType("my.Type");
    assertEquals("my.Type", type.getReferenceName());
  }

  @Test
  public void testGetReferenceName_emptyString_returnsEmptyString() {
    NamedType type = createNamedType("");
    assertEquals("", type.getReferenceName());
  }

  // ---------- hasReferenceName tests ----------

  @Test
  public void testHasReferenceName_alwaysTrue() {
    NamedType type = createNamedType("Foo");
    assertTrue(type.hasReferenceName());
  }

  // ---------- isNominalType tests ----------

  @Test
  public void testIsNominalType_alwaysTrue() {
    NamedType type = createNamedType("Foo");
    assertTrue(type.isNominalType());
  }

  // ---------- isNamedType tests (package-private) ----------

  @Test
  public void testIsNamedType_alwaysTrue() {
    NamedType type = createNamedType("Foo");
    assertTrue(type.isNamedType());
  }

  // ---------- hashCode tests ----------

  @Test
  public void testHashCode_matchesReferenceHashCode() {
    NamedType type = createNamedType("Foo");
    assertEquals("Foo".hashCode(), type.hashCode());
  }

  @Test
  public void testHashCode_emptyReference_matchesEmptyStringHashCode() {
    NamedType type = createNamedType("");
    assertEquals("".hashCode(), type.hashCode());
  }

  // ---------- toStringHelper tests (package-private) ----------

  @Test
  public void testToStringHelper_forAnnotationsTrue_returnsReference() {
    NamedType type = createNamedType("Foo.Bar");
    assertEquals("Foo.Bar", type.toStringHelper(true));
  }

  @Test
  public void testToStringHelper_forAnnotationsFalse_returnsReference() {
    NamedType type = createNamedType("Foo.Bar");
    assertEquals("Foo.Bar", type.toStringHelper(false));
  }

  // ---------- getReferencedType tests ----------

  @Test
  public void testGetReferencedType_beforeResolution_returnsUnknownType() {
    NamedType type = createNamedType("Foo");
    JSType referenced = type.getReferencedType();
    assertNotNull(referenced);
    assertTrue(referenced.isUnknownType());
  }

  // ---------- setValidator tests ----------

  @Test
  public void testSetValidator_beforeResolution_storesValidatorAndReturnsTrue() {
    NamedType type = createNamedType("Foo");
    Predicate<JSType> validator = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    };
    boolean result = type.setValidator(validator);
    assertTrue(result);
  }

  @Test
  public void testSetValidator_calledTwice_returnsTrueBothTimes() {
    NamedType type = createNamedType("Foo");
    Predicate<JSType> validator1 = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return true;
      }
    };
    Predicate<JSType> validator2 = new Predicate<JSType>() {
      @Override
      public boolean apply(JSType input) {
        return false;
      }
    };
    assertTrue(type.setValidator(validator1));
    assertTrue(type.setValidator(validator2));
  }

  // ---------- defineProperty tests (package-private) ----------

  @Test
  public void testDefineProperty_unresolvedType_storesContinuationAndReturnsTrue() {
    NamedType type = createNamedType("Foo");
    JSType propType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    boolean result = type.defineProperty("bar", propType, true, null);
    assertTrue(result);
  }

  @Test
  public void testDefineProperty_multipleProperties_allStoredSuccessfully() {
    NamedType type = createNamedType("Foo");
    JSType propType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    assertTrue(type.defineProperty("bar", propType, true, null));
    assertTrue(type.defineProperty("baz", propType, false, null));
  }

  @Test
  public void testDefineProperty_inferredFalse_returnsTrue() {
    NamedType type = createNamedType("Foo");
    JSType propType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    boolean result = type.defineProperty("qux", propType, false, null);
    assertTrue(result);
  }

  @Test
  public void testDefineProperty_emptyPropertyName_returnsTrue() {
    NamedType type = createNamedType("Foo");
    JSType propType = registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
    boolean result = type.defineProperty("", propType, true, null);
    assertTrue(result);
  }
}
