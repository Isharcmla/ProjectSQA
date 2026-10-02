import org.junit.Test;
import org.junit.Assert;

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

import static org.junit.Assert.*;

public class $Gson$TypesTest {

    // ---------- helper generic types for reflection based tests ----------

    static class StringList extends ArrayList<String> {
    }

    static class RawList extends ArrayList {
    }

    static class IntegerStringMap extends HashMap<Integer, String> {
    }

    static class RawMap extends HashMap {
    }

    static class Box<T> {
        T value;
    }

    static class StringBox extends Box<String> {
    }

    static class ArrayBox<T> {
        T[] arr;
    }

    static class StringArrayBox extends ArrayBox<String> {
    }

    static class Box2<T> {
        List<? super T> superList;
        List<? extends T> extendsList;
    }

    static class StringBox2 extends Box2<String> {
    }

    // a Type implementation that is none of Class/ParameterizedType/GenericArrayType/WildcardType/TypeVariable
    static class UnknownType implements Type {
    }

    // ---------------- private constructor ----------------

    @Test
    public void testPrivateConstructor_throwsUnsupportedOperationException() throws Exception {
        Constructor<?> constructor = Class.forName("com.google.gson.internal.$Gson$Types")
                .getDeclaredConstructor();
        constructor.setAccessible(true);
        try {
            constructor.newInstance();
            fail("Expected InvocationTargetException wrapping UnsupportedOperationException");
        } catch (InvocationTargetException e) {
            assertTrue(e.getCause() instanceof UnsupportedOperationException);
        }
    }

    // ---------------- newParameterizedTypeWithOwner ----------------

    @Test
    public void testNewParameterizedTypeWithOwner_normal_createsParameterizedType() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(List.class, pt.getRawType());
        assertNull(pt.getOwnerType());
        assertArrayEquals(new Type[]{String.class}, pt.getActualTypeArguments());
        assertEquals("java.util.List<java.lang.String>", pt.toString());
    }

    @Test
    public void testNewParameterizedTypeWithOwner_noTypeArguments_toStringIsRawTypeName() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class);
        assertEquals("java.util.List", pt.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewParameterizedTypeWithOwner_primitiveTypeArgument_throwsException() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
    }

    @Test(expected = NullPointerException.class)
    public void testNewParameterizedTypeWithOwner_nullTypeArgument_throwsException() {
        $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
    }

    // ---------------- arrayOf ----------------

    @Test
    public void testArrayOf_normal_returnsGenericArrayType() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        assertEquals(String.class, gat.getGenericComponentType());
        assertEquals("java.lang.String[]", gat.toString());
    }

    // ---------------- subtypeOf ----------------

    @Test
    public void testSubtypeOf_normalClassBound_returnsUpperBound() {
        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        assertArrayEquals(new Type[]{String.class}, wt.getUpperBounds());
        assertEquals("? extends java.lang.String", wt.toString());
    }

    @Test
    public void testSubtypeOf_objectBound_toStringIsQuestionMark() {
        WildcardType wt = $Gson$Types.subtypeOf(Object.class);
        assertEquals("?", wt.toString());
    }

    @Test
    public void testSubtypeOf_wildcardBound_extractsUpperBounds() {
        WildcardType inner = $Gson$Types.subtypeOf(String.class);
        WildcardType outer = $Gson$Types.subtypeOf(inner);
        assertArrayEquals(new Type[]{String.class}, outer.getUpperBounds());
    }

    // ---------------- supertypeOf ----------------

    @Test
    public void testSupertypeOf_normalClassBound_returnsLowerBound() {
        WildcardType wt = $Gson$Types.supertypeOf(String.class);
        assertArrayEquals(new Type[]{String.class}, wt.getLowerBounds());
        assertEquals("? super java.lang.String", wt.toString());
    }

    @Test
    public void testSupertypeOf_wildcardBound_extractsLowerBounds() {
        WildcardType inner = $Gson$Types.supertypeOf(String.class);
        WildcardType outer = $Gson$Types.supertypeOf(inner);
        assertArrayEquals(new Type[]{String.class}, outer.getLowerBounds());
    }

    // ---------------- canonicalize ----------------

    @Test
    public void testCanonicalize_normalClass_returnsSameClass() {
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
    public void testCanonicalize_parameterizedType_returnsEquivalentParameterizedType() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        Type result = $Gson$Types.canonicalize(pt);
        assertTrue(result instanceof ParameterizedType);
        assertEquals(List.class, ((ParameterizedType) result).getRawType());
    }

    @Test
    public void testCanonicalize_genericArrayType_returnsEquivalentGenericArrayType() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Type result = $Gson$Types.canonicalize(gat);
        assertTrue(result instanceof GenericArrayType);
    }

    @Test
    public void testCanonicalize_wildcardType_returnsEquivalentWildcardType() {
        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        Type result = $Gson$Types.canonicalize(wt);
        assertTrue(result instanceof WildcardType);
    }

    @Test
    public void testCanonicalize_unsupportedType_returnsSameInstance() {
        UnknownType ut = new UnknownType();
        Type result = $Gson$Types.canonicalize(ut);
        assertSame(ut, result);
    }

    // ---------------- getRawType ----------------

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
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Class<?> rawType = $Gson$Types.getRawType(gat);
        assertEquals(String[].class, rawType);
    }

    @Test
    public void testGetRawType_typeVariable_returnsObjectClass() throws Exception {
        TypeVariable<?> tv = Box.class.getTypeParameters()[0];
        assertEquals(Object.class, $Gson$Types.getRawType(tv));
    }

    @Test
    public void testGetRawType_wildcardType_returnsUpperBoundRawType() {
        WildcardType wt = $Gson$Types.subtypeOf(String.class);
        assertEquals(String.class, $Gson$Types.getRawType(wt));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawType_nullType_throwsException() {
        $Gson$Types.getRawType(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRawType_unsupportedType_throwsException() {
        $Gson$Types.getRawType(new UnknownType());
    }

    // ---------------- equals ----------------

    @Test
    public void testEquals_sameReference_returnsTrue() {
        assertTrue($Gson$Types.equals(String.class, String.class));
    }

    @Test
    public void testEquals_classVsClass_notEqual_returnsFalse() {
        assertFalse($Gson$Types.equals(String.class, Integer.class));
    }

    @Test
    public void testEquals_parameterizedTypes_equal_returnsTrue() {
        ParameterizedType a = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType b = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertTrue($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_parameterizedVsNonParameterized_returnsFalse() {
        ParameterizedType a = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertFalse($Gson$Types.equals(a, String.class));
    }

    @Test
    public void testEquals_genericArrayTypes_equal_returnsTrue() {
        GenericArrayType a = $Gson$Types.arrayOf(String.class);
        GenericArrayType b = $Gson$Types.arrayOf(String.class);
        assertTrue($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_genericArrayVsNonGenericArray_returnsFalse() {
        GenericArrayType a = $Gson$Types.arrayOf(String.class);
        assertFalse($Gson$Types.equals(a, String.class));
    }

    @Test
    public void testEquals_wildcardTypes_equal_returnsTrue() {
        WildcardType a = $Gson$Types.subtypeOf(String.class);
        WildcardType b = $Gson$Types.subtypeOf(String.class);
        assertTrue($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_wildcardVsNonWildcard_returnsFalse() {
        WildcardType a = $Gson$Types.subtypeOf(String.class);
        assertFalse($Gson$Types.equals(a, String.class));
    }

    @Test
    public void testEquals_typeVariables_sameDeclarationAndName_returnsTrue() {
        TypeVariable<?> a = Box.class.getTypeParameters()[0];
        TypeVariable<?> b = Box.class.getTypeParameters()[0];
        assertTrue($Gson$Types.equals(a, b));
    }

    @Test
    public void testEquals_typeVariableVsNonTypeVariable_returnsFalse() {
        TypeVariable<?> a = Box.class.getTypeParameters()[0];
        assertFalse($Gson$Types.equals(a, String.class));
    }

    @Test
    public void testEquals_unsupportedTypes_returnsFalse() {
        UnknownType a = new UnknownType();
        UnknownType b = new UnknownType();
        assertFalse($Gson$Types.equals(a, b));
    }

    // ---------------- typeToString ----------------

    @Test
    public void testTypeToString_classType_returnsClassName() {
        assertEquals("java.lang.String", $Gson$Types.typeToString(String.class));
    }

    @Test
    public void testTypeToString_nonClassType_returnsToString() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
    }

    // ---------------- getArrayComponentType ----------------

    @Test
    public void testGetArrayComponentType_classArray_returnsComponentType() {
        Type result = $Gson$Types.getArrayComponentType(String[].class);
        assertEquals(String.class, result);
    }

    @Test
    public void testGetArrayComponentType_genericArrayType_returnsComponentType() {
        GenericArrayType gat = $Gson$Types.arrayOf(String.class);
        Type result = $Gson$Types.getArrayComponentType(gat);
        assertEquals(String.class, result);
    }

    @Test(expected = ClassCastException.class)
    public void testGetArrayComponentType_nonArrayNonGenericArrayType_throwsException() {
        ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        $Gson$Types.getArrayComponentType(pt);
    }

    // ---------------- getCollectionElementType ----------------

    @Test
    public void testGetCollectionElementType_parameterizedCollection_returnsElementType() {
        Type elementType = $Gson$Types.getCollectionElementType(StringList.class, StringList.class);
        assertEquals(String.class, elementType);
    }

    @Test
    public void testGetCollectionElementType_rawCollection_returnsObjectClass() {
        Type elementType = $Gson$Types.getCollectionElementType(RawList.class, RawList.class);
        assertEquals(Object.class, elementType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCollectionElementType_notCollection_throwsException() {
        $Gson$Types.getCollectionElementType(String.class, String.class);
    }

    // ---------------- getMapKeyAndValueTypes ----------------

    @Test
    public void testGetMapKeyAndValueTypes_propertiesContext_returnsStringString() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
        assertArrayEquals(new Type[]{String.class, String.class}, types);
    }

    @Test
    public void testGetMapKeyAndValueTypes_parameterizedMap_returnsKeyValueTypes() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(IntegerStringMap.class, IntegerStringMap.class);
        assertArrayEquals(new Type[]{Integer.class, String.class}, types);
    }

    @Test
    public void testGetMapKeyAndValueTypes_rawMap_returnsObjectObject() {
        Type[] types = $Gson$Types.getMapKeyAndValueTypes(RawMap.class, RawMap.class);
        assertArrayEquals(new Type[]{Object.class, Object.class}, types);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMapKeyAndValueTypes_notMap_throwsException() {
        $Gson$Types.getMapKeyAndValueTypes(String.class, String.class);
    }

    // ---------------- resolve ----------------

    @Test
    public void testResolve_typeVariable_resolvesToActualType() throws Exception {
        Type context = StringBox.class.getGenericSuperclass();
        TypeVariable<?> t = Box.class.getTypeParameters()[0];
        Type resolved = $Gson$Types.resolve(context, StringBox.class, t);
        assertEquals(String.class, resolved);
    }

    @Test
    public void testResolve_primitiveArrayClass_returnsUnchanged() {
        Type resolved = $Gson$Types.resolve(String.class, String.class, int[].class);
        assertEquals(int[].class, resolved);
    }

    @Test
    public void testResolve_genericArrayType_resolvesComponentType() throws Exception {
        Type context = StringArrayBox.class.getGenericSuperclass();
        Field field = ArrayBox.class.getDeclaredField("arr");
        Type toResolve = field.getGenericType();
        Type resolved = $Gson$Types.resolve(context, StringArrayBox.class, toResolve);
        Type componentType = $Gson$Types.getArrayComponentType(resolved);
        assertEquals(String.class, componentType);
    }

    @Test
    public void testResolve_parameterizedTypeWithSuperWildcard_resolvesLowerBound() throws Exception {
        Type context = StringBox2.class.getGenericSuperclass();
        Field field = Box2.class.getDeclaredField("superList");
        Type toResolve = field.getGenericType();
        Type resolved = $Gson$Types.resolve(context, StringBox2.class, toResolve);
        assertTrue(resolved instanceof ParameterizedType);
        Type arg = ((ParameterizedType) resolved).getActualTypeArguments()[0];
        assertTrue(arg instanceof WildcardType);
        assertEquals(String.class, ((WildcardType) arg).getLowerBounds()[0]);
    }

    @Test
    public void testResolve_parameterizedTypeWithExtendsWildcard_resolvesUpperBound() throws Exception {
        Type context = StringBox2.class.getGenericSuperclass();
        Field field = Box2.class.getDeclaredField("extendsList");
        Type toResolve = field.getGenericType();
        Type resolved = $Gson$Types.resolve(context, StringBox2.class, toResolve);
        assertTrue(resolved instanceof ParameterizedType);
        Type arg = ((ParameterizedType) resolved).getActualTypeArguments()[0];
        assertTrue(arg instanceof WildcardType);
        assertEquals(String.class, ((WildcardType) arg).getUpperBounds()[0]);
    }

    @Test
    public void testResolve_nonGenericType_returnsSameType() {
        Type resolved = $Gson$Types.resolve(String.class, String.class, Integer.class);
        assertEquals(Integer.class, resolved);
    }

    // ---------------- impl class equals/hashCode/toString extra coverage ----------------

    @Test
    public void testParameterizedTypeImpl_equalsAndHashCode() {
        ParameterizedType a = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        ParameterizedType b = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals("not a type"));
    }

    @Test
    public void testGenericArrayTypeImpl_equalsAndHashCode() {
        GenericArrayType a = $Gson$Types.arrayOf(String.class);
        GenericArrayType b = $Gson$Types.arrayOf(String.class);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals("not a type"));
    }

    @Test
    public void testWildcardTypeImpl_equalsAndHashCode() {
        WildcardType a = $Gson$Types.subtypeOf(String.class);
        WildcardType b = $Gson$Types.subtypeOf(String.class);
        assertTrue(a.equals(b));
        assertEquals(a.hashCode(), b.hashCode());
        assertFalse(a.equals("not a type"));
    }

    @Test
    public void testWildcardTypeImpl_lowerBoundNotEmpty() {
        WildcardType wt = $Gson$Types.supertypeOf(String.class);
        assertEquals(0, wt.getUpperBounds().length == 1 ? 0 : -1); // sanity, upperBounds always length1
        assertArrayEquals(new Type[]{String.class}, wt.getLowerBounds());
    }
}
