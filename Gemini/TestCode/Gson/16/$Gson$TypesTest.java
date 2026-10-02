package com.google.gson.internal;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
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

  // Test helper classes and interfaces
  private static class Outer {
    class Inner<T> {}
    static class StaticNested<T> {}
  }

  private interface ParentInterface<T> {}
  private interface ChildInterface<T, U> extends ParentInterface<T> {}
  private interface UnrelatedInterface {}

  private static class GenericParent<T> {
    T field;
    T[] arrayField;
    List<T> listField;
  }

  private static class GenericChild<E> extends GenericParent<List<E>> implements ChildInterface<E, Integer> {
    E childField;
  }

  private static class RawChild extends GenericParent {}

  private static class MethodTypeVariableHolder {
    public <M> void genericMethod(M param) {}
  }

  private static class CustomType implements Type {
    @Override
    public String toString() {
      return "CustomType";
    }
  }

  private Object serializeAndDeserialize(Object obj) throws Exception {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(obj);
    oos.close();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    return ois.readObject();
  }

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
  public void testNewParameterizedTypeWithOwner_topLevelAndStatic() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertNull(pt1.getOwnerType());
    assertEquals(List.class, pt1.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt1.getActualTypeArguments());

    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, Outer.StaticNested.class, String.class);
    assertNull(pt2.getOwnerType());
    assertEquals(Outer.StaticNested.class, pt2.getRawType());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_innerClassWithOwner() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(Outer.class, Outer.Inner.class, String.class);
    assertEquals(Outer.class, pt.getOwnerType());
    assertEquals(Outer.Inner.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_innerClassWithoutOwner_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, Outer.Inner.class, String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_primitiveArgument_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test(expected = NullPointerException.class)
  public void testNewParameterizedTypeWithOwner_nullArgument_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, new Type[] { null });
  }

  @Test
  public void testNewParameterizedTypeWithOwner_zeroArgumentsToString() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, String.class);
    assertEquals("java.lang.String", pt.toString());
  }

  @Test
  public void testParameterizedType_immutabilityAndSerialization() throws Exception {
    Type[] args = new Type[] { String.class, Integer.class };
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, args);
    Type[] actualArgs = pt.getActualTypeArguments();
    actualArgs[0] = Double.class;
    assertEquals(String.class, pt.getActualTypeArguments()[0]);

    ParameterizedType deserialized = (ParameterizedType) serializeAndDeserialize(pt);
    assertEquals(pt, deserialized);
    assertEquals(pt.hashCode(), deserialized.hashCode());
  }

  @Test
  public void testArrayOf_and_GenericArrayType() throws Exception {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, arrayType.getGenericComponentType());
    assertEquals("java.lang.String[]", arrayType.toString());

    GenericArrayType listOfStringType = $Gson$Types.arrayOf($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class));
    assertEquals("java.util.List<java.lang.String>[]", listOfStringType.toString());

    GenericArrayType deserialized = (GenericArrayType) serializeAndDeserialize(arrayType);
    assertEquals(arrayType, deserialized);
    assertEquals(arrayType.hashCode(), deserialized.hashCode());
  }

  @Test
  public void testSubtypeOf() throws Exception {
    WildcardType subtype = $Gson$Types.subtypeOf(Number.class);
    assertArrayEquals(new Type[] { Number.class }, subtype.getUpperBounds());
    assertArrayEquals(new Type[] {}, subtype.getLowerBounds());
    assertEquals("? extends java.lang.Number", subtype.toString());

    WildcardType objectSubtype = $Gson$Types.subtypeOf(Object.class);
    assertEquals("?", objectSubtype.toString());

    WildcardType nestedSubtype = $Gson$Types.subtypeOf(subtype);
    assertEquals(subtype, nestedSubtype);

    WildcardType deserialized = (WildcardType) serializeAndDeserialize(subtype);
    assertEquals(subtype, deserialized);
    assertEquals(subtype.hashCode(), deserialized.hashCode());
  }

  @Test
  public void testSupertypeOf() throws Exception {
    WildcardType supertype = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[] { Object.class }, supertype.getUpperBounds());
    assertArrayEquals(new Type[] { String.class }, supertype.getLowerBounds());
    assertEquals("? super java.lang.String", supertype.toString());

    WildcardType nestedSupertype = $Gson$Types.supertypeOf(supertype);
    assertEquals(supertype, nestedSupertype);

    WildcardType deserialized = (WildcardType) serializeAndDeserialize(supertype);
    assertEquals(supertype, deserialized);
    assertEquals(supertype.hashCode(), deserialized.hashCode());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardType_primitiveLowerBound_throwsException() {
    $Gson$Types.supertypeOf(int.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWildcardType_primitiveUpperBound_throwsException() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test
  public void testCanonicalize() {
    assertEquals(String.class, $Gson$Types.canonicalize(String.class));

    Type canonicalArray = $Gson$Types.canonicalize(String[].class);
    assertTrue(canonicalArray instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) canonicalArray).getGenericComponentType());

    Type canonicalMultiArray = $Gson$Types.canonicalize(int[][].class);
    assertTrue(canonicalMultiArray instanceof GenericArrayType);

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt, $Gson$Types.canonicalize(pt));

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(gat, $Gson$Types.canonicalize(gat));

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    assertEquals(wt, $Gson$Types.canonicalize(wt));

    Type customType = new CustomType();
    assertSame(customType, $Gson$Types.canonicalize(customType));
  }

  @Test
  public void testGetRawType() throws Exception {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));

    GenericArrayType nestedGat = $Gson$Types.arrayOf(pt);
    assertEquals(List[].class, $Gson$Types.getRawType(nestedGat));

    TypeVariable<?> tv = GenericParent.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(tv));

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    assertEquals(Number.class, $Gson$Types.getRawType(wt));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_null_throwsException() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_unsupportedType_throwsException() {
    $Gson$Types.getRawType(new CustomType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_parameterizedTypeWithNonClassRawType_throwsException() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, new CustomType(), String.class);
    $Gson$Types.getRawType(pt);
  }

  @Test
  public void testEqual() {
    assertTrue($Gson$Types.equal(null, null));
    assertFalse($Gson$Types.equal(null, "test"));
    assertFalse($Gson$Types.equal("test", null));
    assertTrue($Gson$Types.equal("test", "test"));
    assertFalse($Gson$Types.equal("test1", "test2"));
  }

  @Test
  public void testEquals_sameInstanceAndNull() {
    assertTrue($Gson$Types.equals(null, null));
    assertFalse($Gson$Types.equals(null, String.class));
    assertFalse($Gson$Types.equals(String.class, null));
    assertTrue($Gson$Types.equals(String.class, String.class));
    assertFalse($Gson$Types.equals(String.class, Integer.class));
  }

  @Test
  public void testEquals_parameterizedType() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, String.class);
    ParameterizedType pt4 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    ParameterizedType pt5 = $Gson$Types.newParameterizedTypeWithOwner(Outer.class, Outer.Inner.class, String.class);
    ParameterizedType pt6 = $Gson$Types.newParameterizedTypeWithOwner(String.class, Outer.Inner.class, String.class);

    assertTrue($Gson$Types.equals(pt1, pt2));
    assertFalse($Gson$Types.equals(pt1, pt3));
    assertFalse($Gson$Types.equals(pt1, pt4));
    assertFalse($Gson$Types.equals(pt1, pt5));
    assertFalse($Gson$Types.equals(pt5, pt6));
    assertFalse($Gson$Types.equals(pt1, String.class));
    assertFalse(pt1.equals("not a type"));
  }

  @Test
  public void testEquals_genericArrayType() {
    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);

    assertTrue($Gson$Types.equals(gat1, gat2));
    assertFalse($Gson$Types.equals(gat1, gat3));
    assertFalse($Gson$Types.equals(gat1, String[].class));
    assertFalse($Gson$Types.equals(gat1, null));
    assertFalse(gat1.equals("not a type"));
  }

  @Test
  public void testEquals_wildcardType() {
    WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt3 = $Gson$Types.subtypeOf(Integer.class);
    WildcardType wt4 = $Gson$Types.supertypeOf(Number.class);

    assertTrue($Gson$Types.equals(wt1, wt2));
    assertFalse($Gson$Types.equals(wt1, wt3));
    assertFalse($Gson$Types.equals(wt1, wt4));
    assertFalse($Gson$Types.equals(wt1, Number.class));
    assertFalse(wt1.equals("not a type"));
  }

  @Test
  public void testEquals_typeVariable() throws Exception {
    TypeVariable<?> tv1 = GenericParent.class.getTypeParameters()[0];
    TypeVariable<?> tv2 = GenericParent.class.getTypeParameters()[0];
    TypeVariable<?> tv3 = GenericChild.class.getTypeParameters()[0];

    Method method = MethodTypeVariableHolder.class.getMethod("genericMethod", Object.class);
    TypeVariable<?> methodTv = method.getTypeParameters()[0];

    assertTrue($Gson$Types.equals(tv1, tv2));
    assertFalse($Gson$Types.equals(tv1, tv3));
    assertFalse($Gson$Types.equals(tv1, methodTv));
    assertFalse($Gson$Types.equals(tv1, String.class));
    assertFalse($Gson$Types.equals(new CustomType(), new CustomType()));
  }

  @Test
  public void testHashCodeOrZero() {
    assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    assertEquals("abc".hashCode(), $Gson$Types.hashCodeOrZero("abc"));
  }

  @Test
  public void testTypeToString() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    CustomType custom = new CustomType();
    assertEquals("CustomType", $Gson$Types.typeToString(custom));
  }

  @Test
  public void testGetGenericSupertype() {
    Type resolvedInterface = $Gson$Types.getGenericSupertype(
        GenericChild.class, GenericChild.class, ParentInterface.class);
    assertTrue(resolvedInterface instanceof ParameterizedType);
    assertEquals(ParentInterface.class, ((ParameterizedType) resolvedInterface).getRawType());

    Type resolvedClass = $Gson$Types.getGenericSupertype(
        GenericChild.class, GenericChild.class, GenericParent.class);
    assertTrue(resolvedClass instanceof ParameterizedType);
    assertEquals(GenericParent.class, ((ParameterizedType) resolvedClass).getRawType());

    Type sameType = $Gson$Types.getGenericSupertype(String.class, String.class, String.class);
    assertEquals(String.class, sameType);

    Type unresolved = $Gson$Types.getGenericSupertype(String.class, String.class, UnrelatedInterface.class);
    assertEquals(UnrelatedInterface.class, unresolved);

    Type rawSuper = $Gson$Types.getGenericSupertype(RawChild.class, RawChild.class, GenericParent.class);
    assertEquals(GenericParent.class, rawSuper);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetSupertype_notAssignable_throwsException() {
    $Gson$Types.getSupertype(String.class, String.class, Number.class);
  }

  @Test
  public void testGetSupertype_valid() {
    Type supertype = $Gson$Types.getSupertype(
        $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, String.class),
        ArrayList.class,
        List.class);
    assertTrue(supertype instanceof ParameterizedType);
    ParameterizedType pt = (ParameterizedType) supertype;
    assertEquals(List.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
  }

  @Test
  public void testGetArrayComponentType() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
    GenericArrayType gat = $Gson$Types.arrayOf(Integer.class);
    assertEquals(Integer.class, $Gson$Types.getArrayComponentType(gat));
    assertNull($Gson$Types.getArrayComponentType(String.class));
  }

  @Test
  public void testGetCollectionElementType() {
    Type listType = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(listType, List.class));

    assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));

    Type wildcardCollection = $Gson$Types.newParameterizedTypeWithOwner(
        null, Collection.class, $Gson$Types.subtypeOf(Number.class));
    assertEquals(Number.class, $Gson$Types.getCollectionElementType(wildcardCollection, Collection.class));
  }

  @Test
  public void testGetMapKeyAndValueTypes() {
    Type[] propTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[] { String.class, String.class }, propTypes);

    Type mapType = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapType, Map.class);
    assertArrayEquals(new Type[] { String.class, Integer.class }, mapTypes);

    Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
    assertArrayEquals(new Type[] { Object.class, Object.class }, rawMapTypes);
  }

  @Test
  public void testResolve_typeVariable() throws Exception {
    Field field = GenericParent.class.getDeclaredField("field");
    Type resolved = $Gson$Types.resolve(
        $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class),
        GenericParent.class,
        field.getGenericType());
    assertEquals(String.class, resolved);

    Type resolvedInherited = $Gson$Types.resolve(
        $Gson$Types.newParameterizedTypeWithOwner(null, GenericChild.class, String.class),
        GenericChild.class,
        field.getGenericType());
    ParameterizedType pt = (ParameterizedType) resolvedInherited;
    assertEquals(List.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());

    Type unresolvedTv = $Gson$Types.resolve(
        GenericParent.class,
        GenericParent.class,
        field.getGenericType());
    assertEquals(field.getGenericType(), unresolvedTv);
  }

  @Test
  public void testResolve_methodTypeVariable_returnsSame() throws Exception {
    Method method = MethodTypeVariableHolder.class.getMethod("genericMethod", Object.class);
    TypeVariable<?> methodTv = method.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(MethodTypeVariableHolder.class, MethodTypeVariableHolder.class, methodTv);
    assertEquals(methodTv, resolved);
  }

  @Test
  public void testResolve_arrays() throws Exception {
    Field arrayField = GenericParent.class.getDeclaredField("arrayField");
    Type resolvedArray = $Gson$Types.resolve(
        $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class),
        GenericParent.class,
        arrayField.getGenericType());
    assertEquals($Gson$Types.arrayOf(String.class), resolvedArray);

    Type resolvedNormalArray = $Gson$Types.resolve(Object.class, Object.class, String[].class);
    assertEquals(String[].class, resolvedNormalArray);

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type resolvedGat = $Gson$Types.resolve(Object.class, Object.class, gat);
    assertSame(gat, resolvedGat);
  }

  @Test
  public void testResolve_parameterizedType() throws Exception {
    Field listField = GenericParent.class.getDeclaredField("listField");
    Type resolvedList = $Gson$Types.resolve(
        $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class),
        GenericParent.class,
        listField.getGenericType());
    assertEquals($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class), resolvedList);

    ParameterizedType ptAlreadyResolved = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type resolvedSame = $Gson$Types.resolve(Object.class, Object.class, ptAlreadyResolved);
    assertSame(ptAlreadyResolved, resolvedSame);

    ParameterizedType innerPt = $Gson$Types.newParameterizedTypeWithOwner(
        $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class),
        Outer.Inner.class,
        Integer.class);
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class);
    Type resolvedOwner = $Gson$Types.resolve(context, GenericParent.class, innerPt);
    assertNotNull(resolvedOwner);
  }

  @Test
  public void testResolve_wildcardType() {
    TypeVariable<?> tv = GenericParent.class.getTypeParameters()[0];
    WildcardType subtypeWithTv = $Gson$Types.subtypeOf(tv);
    ParameterizedType context = $Gson$Types.newParameterizedTypeWithOwner(null, GenericParent.class, String.class);

    Type resolvedSubtype = $Gson$Types.resolve(context, GenericParent.class, subtypeWithTv);
    assertEquals($Gson$Types.subtypeOf(String.class), resolvedSubtype);

    WildcardType supertypeWithTv = $Gson$Types.supertypeOf(tv);
    Type resolvedSupertype = $Gson$Types.resolve(context, GenericParent.class, supertypeWithTv);
    assertEquals($Gson$Types.supertypeOf(String.class), resolvedSupertype);

    WildcardType fixedSubtype = $Gson$Types.subtypeOf(Number.class);
    assertSame(fixedSubtype, $Gson$Types.resolve(Object.class, Object.class, fixedSubtype));

    WildcardType fixedSupertype = $Gson$Types.supertypeOf(Number.class);
    assertSame(fixedSupertype, $Gson$Types.resolve(Object.class, Object.class, fixedSupertype));
  }

  @Test
  public void testResolve_unsupportedOrSimpleType() {
    CustomType custom = new CustomType();
    assertSame(custom, $Gson$Types.resolve(Object.class, Object.class, custom));
    assertSame(String.class, $Gson$Types.resolve(Object.class, Object.class, String.class));
  }

  @Test
  public void testCheckNotPrimitive() {
    $Gson$Types.checkNotPrimitive(String.class);
    $Gson$Types.checkNotPrimitive($Gson$Types.arrayOf(int.class));
    try {
      $Gson$Types.checkNotPrimitive(int.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }
}
