package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class $Gson$TypesTest {

  // ---------- Helper generic classes for reflection based tests ----------

  static class GenericBox<T> {
    T value;
    T[] array;
    List<T> list;
    List<? extends T> wildcardList;
    Map<String, T> map;
  }

  static class StringBox extends GenericBox<String> {}

  static class StringList extends ArrayList<String> {}

  static class StringIntMap extends HashMap<String, Integer> {}

  static class OuterClass {
    class InnerNonStatic {}
    static class InnerStatic {}
  }

  static class CustomType implements Type {}

  // ---------- Constructor test ----------

  @Test
  public void testConstructor_throwsUnsupportedOperationException() throws Exception {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
      fail("Expected InvocationTargetException wrapping UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  // ---------- newParameterizedTypeWithOwner ----------

  @Test
  public void testNewParameterizedTypeWithOwner_typical_returnsParameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, pt.getRawType());
    assertNull(pt.getOwnerType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_nonStaticInnerWithoutOwner_throwsException() {
    try {
      $Gson$Types.newParameterizedTypeWithOwner(null, OuterClass.InnerNonStatic.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // expected
    }
  }

  @Test
  public void testNewParameterizedTypeWithOwner_nonStaticInnerWithOwner_succeeds() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(
        OuterClass.class, OuterClass.InnerNonStatic.class);
    assertNotNull(pt);
  }

  @Test
  public void testNewParameterizedTypeWithOwner_staticInnerWithoutOwner_succeeds() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(
        null, OuterClass.InnerStatic.class);
    assertNotNull(pt);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_primitiveTypeArgument_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test(expected = NullPointerException.class)
  public void testNewParameterizedTypeWithOwner_nullTypeArgument_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
  }

  // ---------- arrayOf ----------

  @Test
  public void testArrayOf_typical_returnsGenericArrayType() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, arrayType.getGenericComponentType());
  }

  // ---------- subtypeOf ----------

  @Test
  public void testSubtypeOf_typical_returnsWildcardTypeWithUpperBound() {
    WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
    assertArrayEquals(new Type[] { Number.class }, wildcard.getUpperBounds());
    assertArrayEquals(new Type[] {}, wildcard.getLowerBounds());
  }

  @Test
  public void testSubtypeOf_objectBound_toStringReturnsQuestionMark() {
    WildcardType wildcard = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", wildcard.toString());
  }

  // ---------- supertypeOf ----------

  @Test
  public void testSupertypeOf_typical_returnsWildcardTypeWithLowerBound() {
    WildcardType wildcard = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[] { String.class }, wildcard.getLowerBounds());
    assertArrayEquals(new Type[] { Object.class }, wildcard.getUpperBounds());
    assertEquals("? super java.lang.String", wildcard.toString());
  }

  // ---------- canonicalize ----------

  @Test
  public void testCanonicalize_class_returnsSameClass() {
    Type result = $Gson$Types.canonicalize(String.class);
    assertEquals(String.class, result);
  }

  @Test
  public void testCanonicalize_arrayClass_returnsGenericArrayType() {
    Type result = $Gson$Types.canonicalize(String[].class);
    assertTrue(result instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) result).getGenericComponentType());
  }

  @Test
  public void testCanonicalize_parameterizedType_returnsEquivalentType() throws Exception {
    Field field = GenericBox.class.getDeclaredField("list");
    Type genericType = field.getGenericType();
    Type result = $Gson$Types.canonicalize(genericType);
    assertTrue(result instanceof ParameterizedType);
  }

  @Test
  public void testCanonicalize_genericArrayType_returnsEquivalentType() throws Exception {
    Field field = GenericBox.class.getDeclaredField("array");
    Type genericType = field.getGenericType();
    Type result = $Gson$Types.canonicalize(genericType);
    assertTrue(result instanceof GenericArrayType);
  }

  @Test
  public void testCanonicalize_wildcardType_returnsEquivalentType() throws Exception {
    Field field = GenericBox.class.getDeclaredField("wildcardList");
    ParameterizedType pt = (ParameterizedType) field.getGenericType();
    Type wildcard = pt.getActualTypeArguments()[0];
    Type result = $Gson$Types.canonicalize(wildcard);
    assertTrue(result instanceof WildcardType);
  }

  @Test
  public void testCanonicalize_typeVariable_returnsSameInstance() {
    TypeVariable<?> typeVar = GenericBox.class.getTypeParameters()[0];
    Type result = $Gson$Types.canonicalize(typeVar);
    assertEquals(typeVar, result);
  }

  // ---------- getRawType ----------

  @Test
  public void testGetRawType_class_returnsSameClass() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void testGetRawType_parameterizedType_returnsRawClass() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test
  public void testGetRawType_genericArrayType_returnsArrayClass() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    Class<?> raw = $Gson$Types.getRawType(arrayType);
    assertTrue(raw.isArray());
    assertEquals(String.class, raw.getComponentType());
  }

  @Test
  public void testGetRawType_typeVariable_returnsObjectClass() {
    TypeVariable<?> typeVar = GenericBox.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(typeVar));
  }

  @Test
  public void testGetRawType_wildcardType_returnsUpperBoundRawType() {
    WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
    assertEquals(Number.class, $Gson$Types.getRawType(wildcard));
  }

  @Test
  public void testGetRawType_unsupportedType_throwsIllegalArgumentException() {
    try {
      $Gson$Types.getRawType(new CustomType());
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // expected
    }
  }

  @Test
  public void testGetRawType_nullType_throwsIllegalArgumentException() {
    try {
      $Gson$Types.getRawType(null);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // expected
    }
  }

  // ---------- equals ----------

  @Test
  public void testEquals_sameInstance_returnsTrue() {
    assertTrue($Gson$Types.equals(String.class, String.class));
  }

  @Test
  public void testEquals_bothNull_returnsTrue() {
    assertTrue($Gson$Types.equals(null, null));
  }

  @Test
  public void testEquals_differentClasses_returnsFalse() {
    assertFalse($Gson$Types.equals(String.class, Integer.class));
  }

  @Test
  public void testEquals_parameterizedTypes_equal_returnsTrue() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertTrue($Gson$Types.equals(pt1, pt2));
  }

  @Test
  public void testEquals_parameterizedTypeVsNonParameterized_returnsFalse() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertFalse($Gson$Types.equals(pt1, String.class));
  }

  @Test
  public void testEquals_genericArrayTypes_equal_returnsTrue() {
    GenericArrayType a1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType a2 = $Gson$Types.arrayOf(String.class);
    assertTrue($Gson$Types.equals(a1, a2));
  }

  @Test
  public void testEquals_genericArrayTypeVsOther_returnsFalse() {
    GenericArrayType a1 = $Gson$Types.arrayOf(String.class);
    assertFalse($Gson$Types.equals(a1, String.class));
  }

  @Test
  public void testEquals_wildcardTypes_equal_returnsTrue() {
    WildcardType w1 = $Gson$Types.subtypeOf(Number.class);
    WildcardType w2 = $Gson$Types.subtypeOf(Number.class);
    assertTrue($Gson$Types.equals(w1, w2));
  }

  @Test
  public void testEquals_wildcardTypeVsOther_returnsFalse() {
    WildcardType w1 = $Gson$Types.subtypeOf(Number.class);
    assertFalse($Gson$Types.equals(w1, String.class));
  }

  @Test
  public void testEquals_typeVariables_sameDeclarationAndName_returnsTrue() {
    TypeVariable<?> v1 = GenericBox.class.getTypeParameters()[0];
    TypeVariable<?> v2 = GenericBox.class.getTypeParameters()[0];
    assertTrue($Gson$Types.equals(v1, v2));
  }

  @Test
  public void testEquals_typeVariableVsOther_returnsFalse() {
    TypeVariable<?> v1 = GenericBox.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(v1, String.class));
  }

  @Test
  public void testEquals_unsupportedTypeCombination_returnsFalse() {
    CustomType c1 = new CustomType();
    CustomType c2 = new CustomType();
    assertFalse($Gson$Types.equals(c1, c2));
  }

  // ---------- typeToString ----------

  @Test
  public void testTypeToString_class_returnsClassName() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
  }

  @Test
  public void testTypeToString_nonClassType_returnsToString() {
    WildcardType wildcard = $Gson$Types.subtypeOf(Number.class);
    String result = $Gson$Types.typeToString(wildcard);
    assertEquals(wildcard.toString(), result);
  }

  // ---------- getArrayComponentType ----------

  @Test
  public void testGetArrayComponentType_classArray_returnsComponentType() {
    Type result = $Gson$Types.getArrayComponentType(String[].class);
    assertEquals(String.class, result);
  }

  @Test
  public void testGetArrayComponentType_genericArrayType_returnsComponentType() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    Type result = $Gson$Types.getArrayComponentType(arrayType);
    assertEquals(String.class, result);
  }

  // ---------- getCollectionElementType ----------

  @Test
  public void testGetCollectionElementType_typical_returnsElementType() {
    Type elementType = $Gson$Types.getCollectionElementType(StringList.class, StringList.class);
    assertEquals(String.class, elementType);
  }

  // ---------- getMapKeyAndValueTypes ----------

  @Test
  public void testGetMapKeyAndValueTypes_typical_returnsKeyAndValueTypes() {
    Type[] types = $Gson$Types.getMapKeyAndValueTypes(StringIntMap.class, StringIntMap.class);
    assertEquals(String.class, types[0]);
    assertEquals(Integer.class, types[1]);
  }

  @Test
  public void testGetMapKeyAndValueTypes_propertiesClass_returnsStringStringWorkaround() {
    Type[] types = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertEquals(String.class, types[0]);
    assertEquals(String.class, types[1]);
  }

  // ---------- resolve ----------

  @Test
  public void testResolve_typeVariable_resolvesToConcreteType() throws Exception {
    Field field = GenericBox.class.getDeclaredField("value");
    Type toResolve = field.getGenericType();
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, toResolve);
    assertEquals(String.class, resolved);
  }

  @Test
  public void testResolve_classArrayWithNoChange_returnsSameInstance() {
    Type toResolve = String[].class;
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, toResolve);
    assertEquals(toResolve, resolved);
  }

  @Test
  public void testResolve_genericArrayType_resolvesComponentType() throws Exception {
    Field field = GenericBox.class.getDeclaredField("array");
    Type toResolve = field.getGenericType();
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, toResolve);
    assertTrue(resolved instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) resolved).getGenericComponentType());
  }

  @Test
  public void testResolve_parameterizedType_resolvesTypeArguments() throws Exception {
    Field field = GenericBox.class.getDeclaredField("list");
    Type toResolve = field.getGenericType();
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, toResolve);
    assertTrue(resolved instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) resolved;
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
  }

  @Test
  public void testResolve_wildcardType_resolvesUpperBound() throws Exception {
    Field field = GenericBox.class.getDeclaredField("wildcardList");
    ParameterizedType listType = (ParameterizedType) field.getGenericType();
    Type wildcard = listType.getActualTypeArguments()[0];
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, wildcard);
    assertTrue(resolved instanceof WildcardType);
    WildcardType resolvedWildcard = (WildcardType) resolved;
    assertEquals(String.class, resolvedWildcard.getUpperBounds()[0]);
  }

  @Test
  public void testResolve_plainClass_returnsSameType() {
    Type resolved = $Gson$Types.resolve(StringBox.class, StringBox.class, Integer.class);
    assertEquals(Integer.class, resolved);
  }

  // ---------- package-private helper methods (same package) ----------

  @Test
  public void testEqual_bothNull_returnsTrue() {
    assertTrue($Gson$Types.equal(null, null));
  }

  @Test
  public void testEqual_oneNull_returnsFalse() {
    assertFalse($Gson$Types.equal(null, "x"));
  }

  @Test
  public void testEqual_sameValue_returnsTrue() {
    assertTrue($Gson$Types.equal("x", "x"));
  }

  @Test
  public void testHashCodeOrZero_null_returnsZero() {
    assertEquals(0, $Gson$Types.hashCodeOrZero(null));
  }

  @Test
  public void testHashCodeOrZero_nonNull_returnsHashCode() {
    assertEquals("abc".hashCode(), $Gson$Types.hashCodeOrZero("abc"));
  }

  @Test
  public void testGetGenericSupertype_sameType_returnsContext() {
    Type result = $Gson$Types.getGenericSupertype(StringList.class, StringList.class, StringList.class);
    assertEquals(StringList.class, result);
  }

  @Test
  public void testGetGenericSupertype_interfaceSupertype_returnsGenericInterface() {
    Type result = $Gson$Types.getGenericSupertype(StringList.class, StringList.class, Collection.class);
    assertNotNull(result);
  }

  @Test
  public void testGetGenericSupertype_notResolvable_returnsToResolve() {
    Type result = $Gson$Types.getGenericSupertype(Object.class, Object.class, Runnable.class);
    assertEquals(Runnable.class, result);
  }

  @Test
  public void testGetSupertype_typical_returnsResolvedSupertype() {
    Type result = $Gson$Types.getSupertype(StringList.class, StringList.class, Collection.class);
    assertNotNull(result);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSupertype_notAssignable_throwsIllegalArgumentException() {
    $Gson$Types.getSupertype(StringList.class, StringList.class, Map.class);
  }

  @Test
  public void testCheckNotPrimitive_nonPrimitiveClass_doesNotThrow() {
    $Gson$Types.checkNotPrimitive(String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCheckNotPrimitive_primitiveClass_throwsIllegalArgumentException() {
    $Gson$Types.checkNotPrimitive(int.class);
  }
}
