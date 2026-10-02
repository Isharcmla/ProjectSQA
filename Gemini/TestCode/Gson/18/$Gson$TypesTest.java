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
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.junit.Assert.*;

public class $Gson$TypesTest {

  static class NonStaticOuter {
    class NonStaticInner<T> {}
  }

  static class StaticOuter {
    static class StaticInner<T> {}
  }

  interface CustomGenericInterface<T> {}
  static class GenericSuper<T> implements CustomGenericInterface<T> {}
  static class ConcreteSub extends GenericSuper<String> {}
  static class GenericSub<E> extends GenericSuper<E> {}
  static class RecursiveGeneric<T extends RecursiveGeneric<T>> {}

  @Test(expected = UnsupportedOperationException.class)
  public void testConstructor_private_throwsException() throws Throwable {
    Constructor<$Gson$Types> constructor = $Gson$Types.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  @Test
  public void testNewParameterizedTypeWithOwner_normal_success() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertNull(pt.getOwnerType());
    assertEquals(List.class, pt.getRawType());
    assertArrayEquals(new Type[] { String.class }, pt.getActualTypeArguments());
    assertEquals("java.util.List<java.lang.String>", pt.toString());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_multipleArgs_success() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    assertEquals("java.util.Map<java.lang.String, java.lang.Integer>", pt.toString());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_nestedClass_success() {
    ParameterizedType owner = $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticOuter.class);
    ParameterizedType inner = $Gson$Types.newParameterizedTypeWithOwner(owner, NonStaticOuter.NonStaticInner.class, String.class);
    assertEquals(owner, inner.getOwnerType());
    assertEquals(NonStaticOuter.NonStaticInner.class, inner.getRawType());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_missingOwnerForInner_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticOuter.NonStaticInner.class, String.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewParameterizedTypeWithOwner_primitiveTypeArg_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
  }

  @Test(expected = NullPointerException.class)
  public void testNewParameterizedTypeWithOwner_nullTypeArg_throwsException() {
    $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
  }

  @Test
  public void testNewParameterizedTypeWithOwner_emptyArgs_success() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, String.class);
    assertEquals("java.lang.String", pt.toString());
  }

  @Test
  public void testArrayOf_classComponent_success() {
    GenericArrayType arrayType = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, arrayType.getGenericComponentType());
    assertEquals("java.lang.String[]", arrayType.toString());
    assertEquals(String.class.hashCode(), arrayType.hashCode());
  }

  @Test
  public void testArrayOf_parameterizedComponent_success() {
    ParameterizedType listString = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    GenericArrayType arrayType = $Gson$Types.arrayOf(listString);
    assertEquals(listString, arrayType.getGenericComponentType());
    assertEquals("java.util.List<java.lang.String>[]", arrayType.toString());
  }

  @Test
  public void testSubtypeOf_class_success() {
    WildcardType wt = $Gson$Types.subtypeOf(CharSequence.class);
    assertArrayEquals(new Type[] { CharSequence.class }, wt.getUpperBounds());
    assertArrayEquals($Gson$Types.EMPTY_TYPE_ARRAY, wt.getLowerBounds());
    assertEquals("? extends java.lang.CharSequence", wt.toString());
  }

  @Test
  public void testSubtypeOf_object_success() {
    WildcardType wt = $Gson$Types.subtypeOf(Object.class);
    assertArrayEquals(new Type[] { Object.class }, wt.getUpperBounds());
    assertArrayEquals($Gson$Types.EMPTY_TYPE_ARRAY, wt.getLowerBounds());
    assertEquals("?", wt.toString());
  }

  @Test
  public void testSubtypeOf_wildcardInput_success() {
    WildcardType first = $Gson$Types.subtypeOf(Number.class);
    WildcardType second = $Gson$Types.subtypeOf(first);
    assertArrayEquals(new Type[] { Number.class }, second.getUpperBounds());
    assertEquals("? extends java.lang.Number", second.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSubtypeOf_primitive_throwsException() {
    $Gson$Types.subtypeOf(int.class);
  }

  @Test
  public void testSupertypeOf_class_success() {
    WildcardType wt = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[] { Object.class }, wt.getUpperBounds());
    assertArrayEquals(new Type[] { String.class }, wt.getLowerBounds());
    assertEquals("? super java.lang.String", wt.toString());
  }

  @Test
  public void testSupertypeOf_wildcardInput_success() {
    WildcardType first = $Gson$Types.supertypeOf(Number.class);
    WildcardType second = $Gson$Types.supertypeOf(first);
    assertArrayEquals(new Type[] { Number.class }, second.getLowerBounds());
    assertEquals("? super java.lang.Number", second.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testSupertypeOf_primitive_throwsException() {
    $Gson$Types.supertypeOf(int.class);
  }

  @Test
  public void testCanonicalize_variousTypes() {
    assertEquals(String.class, $Gson$Types.canonicalize(String.class));

    Type arrayClassCanonical = $Gson$Types.canonicalize(String[].class);
    assertTrue(arrayClassCanonical instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) arrayClassCanonical).getGenericComponentType());

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type ptCanonical = $Gson$Types.canonicalize(pt);
    assertEquals(pt, ptCanonical);

    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    Type gatCanonical = $Gson$Types.canonicalize(gat);
    assertEquals(gat, gatCanonical);

    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    Type wtCanonical = $Gson$Types.canonicalize(wt);
    assertEquals(wt, wtCanonical);

    Type customType = new Type() {
      @Override
      public String getTypeName() {
        return "custom";
      }
    };
    assertEquals(customType, $Gson$Types.canonicalize(customType));
  }

  @Test
  public void testGetRawType_class() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void testGetRawType_parameterizedType() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test
  public void testGetRawType_genericArrayType() {
    GenericArrayType gat = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(gat));

    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    GenericArrayType nestedGat = $Gson$Types.arrayOf(pt);
    assertEquals(List[].class, $Gson$Types.getRawType(nestedGat));
  }

  @Test
  public void testGetRawType_typeVariable() {
    TypeVariable<?>[] typeParameters = List.class.getTypeParameters();
    assertEquals(Object.class, $Gson$Types.getRawType(typeParameters[0]));
  }

  @Test
  public void testGetRawType_wildcardType() {
    WildcardType wt = $Gson$Types.subtypeOf(Number.class);
    assertEquals(Number.class, $Gson$Types.getRawType(wt));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_null_throwsException() {
    $Gson$Types.getRawType(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetRawType_unsupportedCustomType_throwsException() {
    Type customType = new Type() {};
    $Gson$Types.getRawType(customType);
  }

  @Test
  public void testEquals_allBranches() {
    assertTrue($Gson$Types.equals(null, null));
    assertFalse($Gson$Types.equals(String.class, null));
    assertFalse($Gson$Types.equals(null, String.class));
    assertTrue($Gson$Types.equals(String.class, String.class));
    assertFalse($Gson$Types.equals(String.class, Integer.class));

    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    ParameterizedType pt4 = $Gson$Types.newParameterizedTypeWithOwner(null, Set.class, String.class);
    ParameterizedType ptOwner = $Gson$Types.newParameterizedTypeWithOwner(String.class, List.class, String.class);

    assertTrue($Gson$Types.equals(pt1, pt2));
    assertFalse($Gson$Types.equals(pt1, pt3));
    assertFalse($Gson$Types.equals(pt1, pt4));
    assertFalse($Gson$Types.equals(pt1, ptOwner));
    assertFalse($Gson$Types.equals(pt1, String.class));

    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat3 = $Gson$Types.arrayOf(Integer.class);
    assertTrue($Gson$Types.equals(gat1, gat2));
    assertFalse($Gson$Types.equals(gat1, gat3));
    assertFalse($Gson$Types.equals(gat1, String.class));

    WildcardType wt1 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(Number.class);
    WildcardType wt3 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt4 = $Gson$Types.supertypeOf(Number.class);
    assertTrue($Gson$Types.equals(wt1, wt2));
    assertFalse($Gson$Types.equals(wt1, wt3));
    assertFalse($Gson$Types.equals(wt1, wt4));
    assertFalse($Gson$Types.equals(wt1, String.class));

    TypeVariable<?> tv1 = List.class.getTypeParameters()[0];
    TypeVariable<?> tv2 = List.class.getTypeParameters()[0];
    TypeVariable<?> tv3 = Set.class.getTypeParameters()[0];
    assertTrue($Gson$Types.equals(tv1, tv2));
    assertFalse($Gson$Types.equals(tv1, tv3));
    assertFalse($Gson$Types.equals(tv1, String.class));

    Type custom1 = new Type() {};
    Type custom2 = new Type() {};
    assertFalse($Gson$Types.equals(custom1, custom2));
  }

  @Test
  public void testTypeToString() {
    assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals("java.util.List<java.lang.String>", $Gson$Types.typeToString(pt));
  }

  @Test
  public void testGetGenericSupertype() {
    Type superType = $Gson$Types.getGenericSupertype(ConcreteSub.class, ConcreteSub.class, GenericSuper.class);
    assertTrue(superType instanceof ParameterizedType);
    assertEquals(GenericSuper.class, ((ParameterizedType) superType).getRawType());
    assertArrayEquals(new Type[] { String.class }, ((ParameterizedType) superType).getActualTypeArguments());

    Type ifaceType = $Gson$Types.getGenericSupertype(ConcreteSub.class, ConcreteSub.class, CustomGenericInterface.class);
    assertTrue(ifaceType instanceof ParameterizedType);
    assertEquals(CustomGenericInterface.class, ((ParameterizedType) ifaceType).getRawType());

    Type unresolved = $Gson$Types.getGenericSupertype(String.class, String.class, List.class);
    assertEquals(List.class, unresolved);
  }

  @Test
  public void testGetSupertype() {
    Type supertype = $Gson$Types.getSupertype(ConcreteSub.class, ConcreteSub.class, CustomGenericInterface.class);
    ParameterizedType pt = (ParameterizedType) supertype;
    assertEquals(CustomGenericInterface.class, pt.getRawType());
    assertEquals(String.class, pt.getActualTypeArguments()[0]);
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

  @Test(expected = ClassCastException.class)
  public void testGetArrayComponentType_nonArray_throwsException() {
    $Gson$Types.getArrayComponentType(String.class);
  }

  @Test
  public void testGetCollectionElementType() {
    ParameterizedType listString = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(listString, List.class));

    ParameterizedType concreteList = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, Integer.class);
    assertEquals(Integer.class, $Gson$Types.getCollectionElementType(concreteList, ArrayList.class));

    assertEquals(Object.class, $Gson$Types.getCollectionElementType(Collection.class, Collection.class));

    WildcardType wildcardCollection = $Gson$Types.subtypeOf(listString);
    assertEquals(String.class, $Gson$Types.getCollectionElementType(wildcardCollection, List.class));
  }

  @Test
  public void testGetMapKeyAndValueTypes() {
    Type[] propTypes = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[] { String.class, String.class }, propTypes);

    ParameterizedType mapStringInt = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] mapTypes = $Gson$Types.getMapKeyAndValueTypes(mapStringInt, Map.class);
    assertArrayEquals(new Type[] { String.class, Integer.class }, mapTypes);

    Type[] rawMapTypes = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
    assertArrayEquals(new Type[] { Object.class, Object.class }, rawMapTypes);
  }

  @Test
  public void testResolve() {
    TypeVariable<?> typeVar = GenericSuper.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, typeVar);
    assertEquals(String.class, resolved);

    Type unresolved = $Gson$Types.resolve(GenericSuper.class, GenericSuper.class, typeVar);
    assertEquals(typeVar, unresolved);

    Type resolvedClassArray = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, String[].class);
    assertEquals(String[].class, resolvedClassArray);

    GenericArrayType genericArrayOfVar = $Gson$Types.arrayOf(typeVar);
    Type resolvedGat = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, genericArrayOfVar);
    assertEquals($Gson$Types.arrayOf(String.class), resolvedGat);

    Type unchangedGat = $Gson$Types.resolve(String.class, String.class, $Gson$Types.arrayOf(String.class));
    assertEquals($Gson$Types.arrayOf(String.class), unchangedGat);

    ParameterizedType ptWithVar = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, typeVar);
    Type resolvedPt = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, ptWithVar);
    assertEquals($Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class), resolvedPt);

    Type unchangedPt = $Gson$Types.resolve(String.class, String.class, ptWithVar);
    assertEquals(ptWithVar, unchangedPt);

    WildcardType wtSub = $Gson$Types.subtypeOf(typeVar);
    Type resolvedWtSub = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, wtSub);
    assertEquals($Gson$Types.subtypeOf(String.class), resolvedWtSub);

    WildcardType wtSuper = $Gson$Types.supertypeOf(typeVar);
    Type resolvedWtSuper = $Gson$Types.resolve(ConcreteSub.class, ConcreteSub.class, wtSuper);
    assertEquals($Gson$Types.supertypeOf(String.class), resolvedWtSuper);

    WildcardType wtUnchanged = $Gson$Types.subtypeOf(String.class);
    Type resolvedWtUnchanged = $Gson$Types.resolve(String.class, String.class, wtUnchanged);
    assertEquals(wtUnchanged, resolvedWtUnchanged);

    TypeVariable<?> recVar = RecursiveGeneric.class.getTypeParameters()[0];
    Type resolvedRec = $Gson$Types.resolve(RecursiveGeneric.class, RecursiveGeneric.class, recVar);
    assertEquals(recVar, resolvedRec);
  }

  public <T> void methodWithTypeVariable(T param) {}

  @Test
  public void testResolveTypeVariable_notDeclaredByClass() throws Exception {
    TypeVariable<?> methodTypeVar = $Gson$TypesTest.class.getMethod("methodWithTypeVariable", Object.class).getTypeParameters()[0];
    Type resolved = $Gson$Types.resolveTypeVariable(String.class, String.class, methodTypeVar);
    assertEquals(methodTypeVar, resolved);
  }

  @Test
  public void testCheckNotPrimitive() {
    $Gson$Types.checkNotPrimitive(String.class);
    $Gson$Types.checkNotPrimitive(List.class);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCheckNotPrimitive_primitive_throwsException() {
    $Gson$Types.checkNotPrimitive(int.class);
  }

  @Test
  public void testInnerTypesEqualsAndHashCode() {
    ParameterizedType pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    ParameterizedType pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt1.hashCode(), pt2.hashCode());
    assertTrue(pt1.equals(pt1));
    assertFalse(pt1.equals(null));
    assertFalse(pt1.equals("string"));

    GenericArrayType gat1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType gat2 = $Gson$Types.arrayOf(String.class);
    assertEquals(gat1.hashCode(), gat2.hashCode());
    assertTrue(gat1.equals(gat1));
    assertFalse(gat1.equals(null));
    assertFalse(gat1.equals("string"));

    WildcardType wt1 = $Gson$Types.subtypeOf(String.class);
    WildcardType wt2 = $Gson$Types.subtypeOf(String.class);
    assertEquals(wt1.hashCode(), wt2.hashCode());
    assertTrue(wt1.equals(wt1));
    assertFalse(wt1.equals(null));
    assertFalse(wt1.equals("string"));

    WildcardType wtSuper1 = $Gson$Types.supertypeOf(String.class);
    WildcardType wtSuper2 = $Gson$Types.supertypeOf(String.class);
    assertEquals(wtSuper1.hashCode(), wtSuper2.hashCode());
  }
}
