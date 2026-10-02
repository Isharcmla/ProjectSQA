package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class $Gson$TypesTest {

  private static class CustomType implements Type {}

  private static class Outer {
    class Inner<T> {}
  }

  private static class GenericHolder<T> {
    T field;
    T[] arrayField;
    List<T> listField;
    List<? extends T> wildcardExtendsField;
    List<? super T> wildcardSuperField;
  }

  private interface BaseInterface<T> {}
  private interface SubInterface<T> extends BaseInterface<T> {}
  private static class BaseClass<T> implements SubInterface<T> {}
  private static class SubClass<T> extends BaseClass<T> {}
  private static class StringSubClass extends BaseClass<String> {}

  @Test(expected = UnsupportedOperationException.class)
  public void testPrivateConstructor_throwsException() throws Throwable {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  @Test
  public void testNewParameterizedTypeWithOwner_topLevelClass() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertNull(pt.getOwnerType());
    assertEquals(List.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
    assertEquals("java.util.List<java.lang.String>", pt.toString());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_innerClassWithValidOwner() {
    ParameterizedType owner = $Gson$Types.newParameterizedTypeWithOwner(null, Outer.class);
    ParameterizedType inner = $Gson$Types.newParameterizedTypeWithOwner(owner, Outer.Inner.class, String.class);
    assertEquals(owner, inner.getOwnerType());
    assertEquals(Outer.Inner.class, inner.getRawType());
    assertArrayEquals(new Type[] { String.class }, inner.getActualTypeArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_innerClassWithoutOwner_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, Outer.Inner.class, String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_primitiveArgument_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test
  public void testNewParameterizedTypeWithOwner_zeroArgumentsToString() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, String.class);
    assertEquals("java.lang.String", pt.toString());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_multipleArgumentsToString() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", pt.toString());
  }

  @Test
  public void testArrayOf_validComponentType() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, arrayType.getGenericComponentType());
    assertEquals("java.lang.String[]", arrayType.toString());
  }

  @Test
  public void testSubtypeOf_wildcardExtends() {
    WildcardType wt = $Gson$Types.subtypeOf(CharSequence.class);
    assertArrayEquals(new Type[] { CharSequence.class }, wt.getUpperBounds());
    assertArrayEquals($Gson$Types.EMPTY_TYPE_ARRAY, wt.getLowerBounds());
    assertEquals("? extends java.lang.CharSequence", wt.toString());
  }

  @Test
  public void testSubtypeOf_objectBoundToString() {
    WildcardType wt = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", wt.toString());
  }

  @Test
  public void testSupertypeOf_wildcardSuper() {
    WildcardType wt = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[] { Object.class }, wt.getUpperBounds());
    assertArrayEquals(new Type[] { String.class }, wt.getLowerBounds());
    assertEquals("? super java.lang.String", wt.toString());
  }

  @Test
  public void testCanonicalize_variousTypes() {
    assertEquals(String.class, $Gson$Types.canonicalize(String.class));

    Type arrayType = $Gson$Types.canonicalize(String[].class);
    assertTrue(arrayType instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) arrayType).getGenericComponentType());

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt, $Gson$Types.canonicalize(pt));

    GenericArrayType gat = $Gson$Types.arrayOf(pt);
    assertEquals(gat, $Gson$Types.canonicalize(gat));

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    assertEquals(wt, $Gson$Types.canonicalize(wt));

    CustomType custom = new CustomType();
    assertSame(custom, $Gson$Types.canonicalize(custom));
  }

  @Test
  public void testGetRawType_allSupportedTypes() throws NoSuchFieldException {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    assertEquals(Number.class, $Gson$Types.getRawType(wt));

    TypeVariable<?> tv = GenericHolder.class.getDeclaredField("field").getGenericType().getClass().getTypeParameters().length > 0
        ? GenericHolder.class.getTypeParameters()[0]
        : GenericHolder.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(tv));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_null_throwsException() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_customType_throwsException() {
    $Gson$Types.getRawType(new CustomType());
  }

  @Test
  public void testEqual_utilityMethod() {
    assertTrue($Gson$Types.equal(null, null));
    assertFalse($Gson$Types.equal(null, "a"));
    assertFalse($Gson$Types.equal("a", null));
    assertTrue($Gson$Types.equal("a", "a"));
    assertFalse($Gson$Types.equal("a", "b"));
  }

  @Test
  public void testEquals_classTypes() {
    assertTrue($Gson$Types.equals(String.class, String.class));
    assertFalse($Gson$Types.equals(String.class, Integer.class));
    assertFalse($Gson$Types.equals(String.class, null));
    assertFalse($Gson$Types.equals(null, String.class));
    assertTrue($Gson$Types.equals((Type) null, (Type) null));
  }

  @Test
  public void testEquals_parameterizedTypes() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    ParameterizedType pt4 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, String.class);

    assertTrue($Gson$Types.equals(pt1, pt2));
    assertFalse($Gson$Types.equals(pt1, pt3));
    assertFalse($Gson$Types.equals(pt1, pt4));
    assertFalse($Gson$Types.equals(pt1, String.class));
    assertFalse($Gson$Types.equals(pt1, null));

    ParameterizedType owner1 = $Gson$Types.newParameterizedTypeWithOwner(null, Outer.class);
    ParameterizedType owner2 = $Gson$Types.newParameterizedTypeWithOwner(null, String.class);
    ParameterizedType inner1 = $Gson$Types.newParameterizedTypeWithOwner(owner1, Outer.Inner.class, String.class);
    ParameterizedType inner2 = $Gson$Types.newParameterizedTypeWithOwner(owner2, Outer.Inner.class, String.class);
    assertFalse($Gson$Types.equals(inner1, inner2));
  }

  @Test
  public void testEquals_genericArrayTypes() {
    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

    assertTrue($Gson$Types.equals(gat1, gat2));
    assertFalse($Gson$Types.equals(gat1, gat3));
    assertFalse($Gson$Types.equals(gat1, String.class));
    assertFalse($Gson$Types.equals(gat1, null));
  }

  @Test
  public void testEquals_wildcardTypes() {
    WildcardType wt1 = $Gson$Types.subtypeOf(CharSequence.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(CharSequence.class);
    WildcardType wt3 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt4 = $Gson$Types.supertypeOf(String.class);
    WildcardType wt5 = $Gson$Types.supertypeOf(String.class);
    WildcardType wt6 = $Gson$Types.supertypeOf(Integer.class);

    assertTrue($Gson$Types.equals(wt1, wt2));
    assertFalse($Gson$Types.equals(wt1, wt3));
    assertFalse($Gson$Types.equals(wt1, wt4));
    assertTrue($Gson$Types.equals(wt4, wt5));
    assertFalse($Gson$Types.equals(wt4, wt6));
    assertFalse($Gson$Types.equals(wt1, String.class));
    assertFalse($Gson$Types.equals(wt1, null));
  }

  @Test
  public void testEquals_typeVariables() {
    TypeVariable<?> tv1 = GenericHolder.class.getTypeParameters()[0];
    TypeVariable<?> tv2 = GenericHolder.class.getTypeParameters()[0];
    TypeVariable<?> tv3 = List.class.getTypeParameters()[0];

    assertTrue($Gson$Types.equals(tv1, tv2));
    assertFalse($Gson$Types.equals(tv1, tv3));
    assertFalse($Gson$Types.equals(tv1, String.class));
    assertFalse($Gson$Types.equals(tv1, null));
  }

  @Test
  public void testEquals_unsupportedTypes() {
    CustomType c1 = new CustomType();
    CustomType c2 = new CustomType();
    assertFalse($Gson$Types.equals(c1, c2));
  }

  @Test
  public void testHashCodeOrZero() {
    assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    assertEquals("test".hashCode(), $Gson$Types.hashCodeOrZero("test"));
  }

  @Test
  public void testTypeToString() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(pt));
  }

  @Test
  public void testGetGenericSupertype() {
    Type superType = $Gson$Types.getGenericSupertype(StringSubClass.class, StringSubClass.class, BaseInterface.class);
    assertTrue(superType instanceof ParameterizedType);
    assertEquals(BaseInterface.class, ((ParameterizedType) superType).getRawType());

    Type notFound = $Gson$Types.getGenericSupertype(StringSubClass.class, StringSubClass.class, Set.class);
    assertEquals(Set.class, notFound);

    Type selfMatch = $Gson$Types.getGenericSupertype(StringSubClass.class, StringSubClass.class, StringSubClass.class);
    assertEquals(StringSubClass.class, selfMatch);
  }

  @Test
  public void testGetSupertype() {
    Type supertype = $Gson$Types.getSupertype(new ArrayList<String>() {}.getClass(), ArrayList.class, Collection.class);
    assertTrue(supertype instanceof ParameterizedType);
    assertEquals(Collection.class, ((ParameterizedType) supertype).getRawType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSupertype_notAssignable_throwsException() {
    $Gson$Types.getSupertype(String.class, String.class, List.class);
  }

  @Test
  public void testGetArrayComponentType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    GenericArrayType gat = $Gson$Types.arrayOf(Integer.class);
    assertEquals(Integer.class, $Gson$Types.getArrayComponentType(gat));
  }

  @Test
  public void testGetCollectionElementType() {
    ParameterizedType listType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(listType, List.class));

    WildcardType wildcardCollection = $Gson$Types.subtypeOf(listType);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(wildcardCollection, Collection.class));

    assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));
  }

  @Test
  public void testGetMapKeyAndValueTypes() {
    Type[] propTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[] { String.class, String.class }, propTypes);

    ParameterizedType mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
    assertArrayEquals(new Type[] { String.class, Integer.class }, mapTypes);

    Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
    assertArrayEquals(new Type[] { Object.class, Object.class }, rawMapTypes);
  }

  @Test
  public void testResolve_typeVariable() throws NoSuchFieldException {
    Type toResolve = GenericHolder.class.getDeclaredField("field").getGenericType();
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericHolder.class, String.class);
    Type resolved = $Gson$Types.resolve(context, GenericHolder.class, toResolve);
    assertEquals(String.class, resolved);

    Type unresolved = $Gson$Types.resolve(Object.class, Object.class, toResolve);
    assertEquals(toResolve, unresolved);
  }

  @Test
  public void testResolve_classArray() throws NoSuchFieldException {
    assertEquals(String[].class, $Gson$Types.resolve(Object.class, Object.class, String[].class));

    Type arrayToResolve = GenericHolder.class.getDeclaredField("arrayField").getGenericType();
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericHolder.class, String.class);
    Type resolved = $Gson$Types.resolve(context, GenericHolder.class, arrayToResolve);
    assertEquals($Gson$Types.arrayOf(String.class), resolved);
  }

  @Test
  public void testResolve_genericArray() {
    TypeVariable<?> tv = GenericHolder.class.getTypeParameters()[0];
    GenericArrayType gat = $Gson$Types.arrayOf(tv);
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericHolder.class, String.class);
    Type resolved = $Gson$Types.resolve(context, GenericHolder.class, gat);
    assertEquals($Gson$Types.arrayOf(String.class), resolved);

    assertSame(gat, $Gson$Types.resolve(Object.class, Object.class, gat));
  }

  @Test
  public void testResolve_parameterizedType() throws NoSuchFieldException {
    Type toResolve = GenericHolder.class.getDeclaredField("listField").getGenericType();
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericHolder.class, String.class);
    Type resolved = $Gson$Types.resolve(context, GenericHolder.class, toResolve);
    ParameterizedType expected = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(expected, resolved);

    assertSame(expected, $Gson$Types.resolve(Object.class, Object.class, expected));
  }

  @Test
  public void testResolve_wildcardType() throws NoSuchFieldException {
    Type extendsToResolve = ((ParameterizedType) GenericHolder.class.getDeclaredField("wildcardExtendsField").getGenericType()).getActualTypeArguments()[0];
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericHolder.class, String.class);
    Type resolvedExtends = $Gson$Types.resolve(context, GenericHolder.class, extendsToResolve);
    assertEquals($Gson$Types.subtypeOf(String.class), resolvedExtends);

    Type superToResolve = ((ParameterizedType) GenericHolder.class.getDeclaredField("wildcardSuperField").getGenericType()).getActualTypeArguments()[0];
    Type resolvedSuper = $Gson$Types.resolve(context, GenericHolder.class, superToResolve);
    assertEquals($Gson$Types.supertypeOf(String.class), resolvedSuper);

    WildcardType wt = $Gson$Types.subtypeOf(Object.class);
    assertSame(wt, $Gson$Types.resolve(Object.class, Object.class, wt));
  }

  @Test
  public void testResolve_customUnsupportedType() {
    CustomType custom = new CustomType();
    assertSame(custom, $Gson$Types.resolve(Object.class, Object.class, custom));
  }

  @Test
  public void testCheckNotPrimitive() {
    $Gson$Types.checkNotPrimitive(String.class);
    $Gson$Types.checkNotPrimitive(new CustomType());
    try {
      $Gson$Types.checkNotPrimitive(int.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
    }
  }

  @Test
  public void testParameterizedTypeImpl_hashCodeAndEquals() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt1.hashCode(), pt2.hashCode());
    assertTrue(pt1.equals(pt2));
    assertTrue(pt1.equals(pt1));
    assertFalse(pt1.equals(null));
    assertFalse(pt1.equals("string"));
  }

  @Test
  public void testGenericArrayTypeImpl_hashCodeAndEquals() {
    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    assertEquals(gat1.hashCode(), gat2.hashCode());
    assertTrue(gat1.equals(gat2));
    assertTrue(gat1.equals(gat1));
    assertFalse(gat1.equals(null));
    assertFalse(gat1.equals("string"));
  }

  @Test
  public void testWildcardTypeImpl_hashCodeAndEquals() {
    WildcardType wt1 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(String.class);
    assertEquals(wt1.hashCode(), wt2.hashCode());
    assertTrue(wt1.equals(wt2));
    assertTrue(wt1.equals(wt1));
    assertFalse(wt1.equals(null));
    assertFalse(wt1.equals("string"));

    WildcardType super1 = $Gson$Types.supertypeOf(String.class);
    WildcardType super2 = $Gson$Types.supertypeOf(String.class);
    assertEquals(super1.hashCode(), super2.hashCode());
    assertTrue(super1.equals(super2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardTypeImpl_primitiveUpperBound_throwsException() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardTypeImpl_primitiveLowerBound_throwsException() {
    $Gson$Types.supertypeOf(int.class);
  }
}
