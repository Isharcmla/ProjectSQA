package com.fasterxml.jackson.databind.type;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeFactoryTest {

    private TypeFactory tf;

    // Helper classes for testing
    static class StringListHolder {
        public List<String> stringList;
        public Map<String, Integer> stringIntMap;
        public String[] stringArray;
        public List<?> wildcardList;
        public List<? extends Number> boundedWildcardList;
        public List<? super Integer> lowerBoundedWildcardList;
    }

    static class GenericHolder<T, U extends List<T>, V extends Comparable<V>> {
        public T item;
        public U list;
        public V comparable;
        public T[] genericArray;
    }

    static class RecursiveHolder<T extends RecursiveHolder<T>> {
        public T self;
    }

    static class SingleGenericSub<E> extends ArrayList<E> {
        private static final long serialVersionUID = 1L;
    }

    static class StringOnlySub extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    static class CustomMap<K, V> extends HashMap<K, V> {
        private static final long serialVersionUID = 1L;
    }

    static class IntStringMap extends HashMap<Integer, String> {
        private static final long serialVersionUID = 1L;
    }

    static class NonGenericClass {
        public int val;
    }

    static class CustomCollectionLike<E> implements Iterable<E> {
        @Override
        public Iterator<E> iterator() {
            return Collections.emptyIterator();
        }
    }

    static class CustomMapLike<K, V> {
        public K key;
        public V value;
    }

    enum SampleEnum {
        A, B, C
    }

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
        tf.clearCache();
    }

    @Test
    public void testDefaultInstance_notNull() {
        TypeFactory instance = TypeFactory.defaultInstance();
        Assert.assertNotNull(instance);
        Assert.assertSame(instance, TypeFactory.defaultInstance());
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        Assert.assertNotNull(unknown);
        Assert.assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClass() throws Exception {
        Assert.assertEquals(String.class, TypeFactory.rawClass(String.class));

        Field field = StringListHolder.class.getField("stringList");
        Type genericType = field.getGenericType();
        Assert.assertEquals(List.class, TypeFactory.rawClass(genericType));
    }

    @Test
    public void testClearCache() {
        JavaType t1 = tf.constructType(String.class);
        Assert.assertNotNull(t1);
        tf.clearCache();
        JavaType t2 = tf.constructType(String.class);
        Assert.assertEquals(t1, t2);
    }

    @Test
    public void testWithClassLoader() {
        ClassLoader cl = getClass().getClassLoader();
        TypeFactory customTf = tf.withClassLoader(cl);
        Assert.assertNotNull(customTf);
        Assert.assertSame(cl, customTf.getClassLoader());
    }

    @Test
    public void testWithCache() {
        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(10, 50);
        TypeFactory customTf = tf.withCache(cache);
        Assert.assertNotNull(customTf);
        JavaType type = customTf.constructType(Integer.class);
        Assert.assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void testWithModifier_normalAndNull() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };

        TypeFactory modifiedTf = tf.withModifier(mod);
        Assert.assertNotNull(modifiedTf);

        TypeModifier mod2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory modifiedTwice = modifiedTf.withModifier(mod2);
        Assert.assertNotNull(modifiedTwice);

        TypeFactory resetTf = modifiedTwice.withModifier(null);
        Assert.assertNotNull(resetTf);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithModifier_nullReturnThrowsException() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return null;
            }
        };
        TypeFactory modifiedTf = tf.withModifier(mod);
        modifiedTf.constructType(String.class);
    }

    @Test
    public void testFindClass_primitives() throws Exception {
        Assert.assertEquals(int.class, tf.findClass("int"));
        Assert.assertEquals(long.class, tf.findClass("long"));
        Assert.assertEquals(float.class, tf.findClass("float"));
        Assert.assertEquals(double.class, tf.findClass("double"));
        Assert.assertEquals(boolean.class, tf.findClass("boolean"));
        Assert.assertEquals(byte.class, tf.findClass("byte"));
        Assert.assertEquals(char.class, tf.findClass("char"));
        Assert.assertEquals(short.class, tf.findClass("short"));
        Assert.assertEquals(void.class, tf.findClass("void"));
    }

    @Test
    public void testFindClass_standard() throws Exception {
        Class<?> clazz = tf.findClass("java.lang.String");
        Assert.assertEquals(String.class, clazz);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_notFound() throws Exception {
        tf.findClass("com.invalid.nonexistent.NoSuchClass");
    }

    @Test
    public void testConstructType_fromClass() {
        Assert.assertEquals(boolean.class, tf.constructType(boolean.class).getRawClass());
        Assert.assertEquals(int.class, tf.constructType(int.class).getRawClass());
        Assert.assertEquals(long.class, tf.constructType(long.class).getRawClass());
        Assert.assertEquals(String.class, tf.constructType(String.class).getRawClass());
        Assert.assertEquals(Object.class, tf.constructType(Object.class).getRawClass());
        Assert.assertEquals(Comparable.class, tf.constructType(Comparable.class).getRawClass());
        Assert.assertEquals(Enum.class, tf.constructType(Enum.class).getRawClass());
        Assert.assertEquals(Class.class, tf.constructType(Class.class).getRawClass());
        Assert.assertEquals(Properties.class, tf.constructType(Properties.class).getRawClass());
    }

    @Test
    public void testConstructType_fromTypeReference() {
        JavaType type = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertTrue(type.isCollectionLikeType());
        Assert.assertEquals(List.class, type.getRawClass());
        Assert.assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_withBindings() {
        TypeBindings bindings = TypeBindings.create(SingleGenericSub.class, tf.constructType(Integer.class));
        JavaType type = tf.constructType(SingleGenericSub.class, bindings);
        Assert.assertEquals(SingleGenericSub.class, type.getRawClass());
        Assert.assertEquals(Integer.class, type.getBindings().getBoundType(0).getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructType_withContextClassAndJavaType() {
        JavaType context = tf.constructType(StringListHolder.class);
        JavaType t1 = tf.constructType(String.class, StringListHolder.class);
        Assert.assertEquals(String.class, t1.getRawClass());

        JavaType t2 = tf.constructType(String.class, context);
        Assert.assertEquals(String.class, t2.getRawClass());

        JavaType t3 = tf.constructType(String.class, (JavaType) null);
        Assert.assertEquals(String.class, t3.getRawClass());

        JavaType t4 = tf.constructType(String.class, (Class<?>) null);
        Assert.assertEquals(String.class, t4.getRawClass());
    }

    @Test
    public void testConstructArrayType() {
        ArrayType fromClass = tf.constructArrayType(String.class);
        Assert.assertEquals(String.class, fromClass.getContentType().getRawClass());

        JavaType stringType = tf.constructType(String.class);
        ArrayType fromJavaType = tf.constructArrayType(stringType);
        Assert.assertEquals(stringType, fromJavaType.getContentType());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType type = tf.constructCollectionType(List.class, String.class);
        Assert.assertEquals(List.class, type.getRawClass());
        Assert.assertEquals(String.class, type.getContentType().getRawClass());

        JavaType intType = tf.constructType(Integer.class);
        CollectionType type2 = tf.constructCollectionType(ArrayList.class, intType);
        Assert.assertEquals(ArrayList.class, type2.getRawClass());
        Assert.assertEquals(intType, type2.getContentType());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType type = tf.constructCollectionLikeType(CustomCollectionLike.class, String.class);
        Assert.assertEquals(CustomCollectionLike.class, type.getRawClass());
        Assert.assertEquals(String.class, type.getContentType().getRawClass());

        CollectionLikeType type2 = tf.constructCollectionLikeType(CustomCollectionLike.class, tf.constructType(Long.class));
        Assert.assertEquals(CustomCollectionLike.class, type2.getRawClass());
        Assert.assertEquals(Long.class, type2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType mapType = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(Map.class, mapType.getRawClass());
        Assert.assertEquals(String.class, mapType.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mapType.getContentType().getRawClass());

        MapType propType = tf.constructMapType(Properties.class, Object.class, Object.class);
        Assert.assertEquals(Properties.class, propType.getRawClass());
        Assert.assertEquals(String.class, propType.getKeyType().getRawClass());
        Assert.assertEquals(String.class, propType.getContentType().getRawClass());

        MapType customMapType = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Double.class));
        Assert.assertEquals(HashMap.class, customMapType.getRawClass());
        Assert.assertEquals(Double.class, customMapType.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType mapLike = tf.constructMapLikeType(CustomMapLike.class, String.class, Integer.class);
        Assert.assertEquals(CustomMapLike.class, mapLike.getRawClass());
        Assert.assertEquals(String.class, mapLike.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mapLike.getContentType().getRawClass());

        MapLikeType mapLike2 = tf.constructMapLikeType(CustomMapLike.class, tf.constructType(String.class), tf.constructType(Long.class));
        Assert.assertEquals(CustomMapLike.class, mapLike2.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructSimpleType() {
        JavaType[] params = new JavaType[] { tf.constructType(String.class) };
        JavaType simple = tf.constructSimpleType(SingleGenericSub.class, params);
        Assert.assertEquals(SingleGenericSub.class, simple.getRawClass());

        JavaType simpleDepr = tf.constructSimpleType(SingleGenericSub.class, SingleGenericSub.class, params);
        Assert.assertEquals(SingleGenericSub.class, simpleDepr.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testUncheckedSimpleType() {
        JavaType type = tf.uncheckedSimpleType(String.class);
        Assert.assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType refType = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        Assert.assertTrue(refType.isReferenceType());
        Assert.assertEquals(String.class, refType.getContentType().getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructParametricType_andParametrizedType() {
        JavaType paramType = tf.constructParametricType(List.class, String.class);
        Assert.assertEquals(List.class, paramType.getRawClass());
        Assert.assertEquals(String.class, paramType.getContentType().getRawClass());

        JavaType paramType2 = tf.constructParametricType(Map.class, tf.constructType(String.class), tf.constructType(Integer.class));
        Assert.assertEquals(Map.class, paramType2.getRawClass());

        JavaType p3 = tf.constructParametrizedType(List.class, List.class, tf.constructType(String.class));
        Assert.assertEquals(List.class, p3.getRawClass());

        JavaType p4 = tf.constructParametrizedType(List.class, List.class, String.class);
        Assert.assertEquals(List.class, p4.getRawClass());
    }

    @Test
    public void testConstructRawVariants() {
        CollectionType rawColl = tf.constructRawCollectionType(List.class);
        Assert.assertEquals(Object.class, rawColl.getContentType().getRawClass());

        CollectionLikeType rawCollLike = tf.constructRawCollectionLikeType(CustomCollectionLike.class);
        Assert.assertEquals(Object.class, rawCollLike.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(Map.class);
        Assert.assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMap.getContentType().getRawClass());

        MapLikeType rawMapLike = tf.constructRawMapLikeType(CustomMapLike.class);
        Assert.assertEquals(Object.class, rawMapLike.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMapLike.getContentType().getRawClass());
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType t = tf.constructFromCanonical("java.util.List<java.lang.String>");
        Assert.assertEquals(List.class, t.getRawClass());
        Assert.assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_invalid() {
        tf.constructFromCanonical("java.util.List<invalid canonical string");
    }

    @Test
    public void testConstructSpecializedType_sameClass() {
        JavaType stringType = tf.constructType(String.class);
        JavaType specialized = tf.constructSpecializedType(stringType, String.class);
        Assert.assertSame(stringType, specialized);
    }

    @Test
    public void testConstructSpecializedType_fromObject() {
        JavaType objType = tf.constructType(Object.class);
        JavaType specialized = tf.constructSpecializedType(objType, String.class);
        Assert.assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubclass() {
        JavaType stringType = tf.constructType(String.class);
        tf.constructSpecializedType(stringType, Integer.class);
    }

    @Test
    public void testConstructSpecializedType_containerShortcuts() {
        JavaType mapType = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(HashMap.class, tf.constructSpecializedType(mapType, HashMap.class).getRawClass());
        Assert.assertEquals(LinkedHashMap.class, tf.constructSpecializedType(mapType, LinkedHashMap.class).getRawClass());
        Assert.assertEquals(TreeMap.class, tf.constructSpecializedType(mapType, TreeMap.class).getRawClass());

        JavaType collType = tf.constructCollectionType(Collection.class, String.class);
        Assert.assertEquals(ArrayList.class, tf.constructSpecializedType(collType, ArrayList.class).getRawClass());
        Assert.assertEquals(LinkedList.class, tf.constructSpecializedType(collType, LinkedList.class).getRawClass());
        Assert.assertEquals(HashSet.class, tf.constructSpecializedType(collType, HashSet.class).getRawClass());
        Assert.assertEquals(TreeSet.class, tf.constructSpecializedType(collType, TreeSet.class).getRawClass());

        JavaType enumSetType = tf.constructCollectionType(EnumSet.class, SampleEnum.class);
        JavaType specializedEnumSet = tf.constructSpecializedType(enumSetType, EnumSet.class);
        Assert.assertEquals(EnumSet.class, specializedEnumSet.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_noTypeParametersSubclass() {
        JavaType collType = tf.constructCollectionType(List.class, String.class);
        JavaType specialized = tf.constructSpecializedType(collType, StringOnlySub.class);
        Assert.assertEquals(StringOnlySub.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_genericSubclassWithPlaceholders() {
        JavaType collType = tf.constructCollectionType(List.class, String.class);
        JavaType specialized = tf.constructSpecializedType(collType, SingleGenericSub.class);
        Assert.assertEquals(SingleGenericSub.class, specialized.getRawClass());
        Assert.assertEquals(String.class, specialized.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_typeMismatch() {
        JavaType mapType = tf.constructMapType(Map.class, String.class, String.class);
        // IntStringMap expects key to be Integer, not String
        tf.constructSpecializedType(mapType, IntStringMap.class);
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType arrayListType = tf.constructCollectionType(ArrayList.class, String.class);
        JavaType sameType = tf.constructGeneralizedType(arrayListType, ArrayList.class);
        Assert.assertSame(arrayListType, sameType);

        JavaType generalized = tf.constructGeneralizedType(arrayListType, List.class);
        Assert.assertEquals(List.class, generalized.getRawClass());
        Assert.assertEquals(String.class, generalized.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperclass() {
        JavaType stringType = tf.constructType(String.class);
        tf.constructGeneralizedType(stringType, Integer.class);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindTypeParameters() {
        JavaType arrayListType = tf.constructCollectionType(ArrayList.class, String.class);
        JavaType[] params = tf.findTypeParameters(arrayListType, Collection.class);
        Assert.assertEquals(1, params.length);
        Assert.assertEquals(String.class, params[0].getRawClass());

        JavaType[] notFound = tf.findTypeParameters(arrayListType, Map.class);
        Assert.assertEquals(0, notFound.length);

        JavaType[] deprParams1 = tf.findTypeParameters(ArrayList.class, Collection.class);
        Assert.assertNotNull(deprParams1);

        JavaType[] deprParams2 = tf.findTypeParameters(ArrayList.class, Collection.class, TypeBindings.emptyBindings());
        Assert.assertNotNull(deprParams2);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType stringType = tf.constructType(String.class);
        JavaType objectType = tf.constructType(Object.class);
        JavaType intType = tf.constructType(Integer.class);

        Assert.assertEquals(stringType, tf.moreSpecificType(stringType, null));
        Assert.assertEquals(stringType, tf.moreSpecificType(null, stringType));
        Assert.assertEquals(stringType, tf.moreSpecificType(stringType, stringType));

        Assert.assertEquals(stringType, tf.moreSpecificType(objectType, stringType));
        Assert.assertEquals(stringType, tf.moreSpecificType(stringType, objectType));

        Assert.assertEquals(stringType, tf.moreSpecificType(stringType, intType));
    }

    @Test
    public void testResolvingGenericFieldsAndTypes() throws Exception {
        Field fList = StringListHolder.class.getField("stringList");
        JavaType tList = tf.constructType(fList.getGenericType());
        Assert.assertEquals(List.class, tList.getRawClass());
        Assert.assertEquals(String.class, tList.getContentType().getRawClass());

        Field fMap = StringListHolder.class.getField("stringIntMap");
        JavaType tMap = tf.constructType(fMap.getGenericType());
        Assert.assertEquals(Map.class, tMap.getRawClass());
        Assert.assertEquals(String.class, tMap.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, tMap.getContentType().getRawClass());

        Field fArr = StringListHolder.class.getField("stringArray");
        JavaType tArr = tf.constructType(fArr.getGenericType());
        Assert.assertTrue(tArr.isArrayType());

        Field fWildcard = StringListHolder.class.getField("wildcardList");
        JavaType tWildcard = tf.constructType(fWildcard.getGenericType());
        Assert.assertEquals(Object.class, tWildcard.getContentType().getRawClass());

        Field fBoundedWildcard = StringListHolder.class.getField("boundedWildcardList");
        JavaType tBounded = tf.constructType(fBoundedWildcard.getGenericType());
        Assert.assertEquals(Number.class, tBounded.getContentType().getRawClass());

        Field fLowerBounded = StringListHolder.class.getField("lowerBoundedWildcardList");
        JavaType tLowerBounded = tf.constructType(fLowerBounded.getGenericType());
        Assert.assertEquals(Object.class, tLowerBounded.getContentType().getRawClass());
    }

    @Test
    public void testResolvingGenericHolderWithVariables() throws Exception {
        JavaType type = tf.constructType(GenericHolder.class);
        Assert.assertEquals(GenericHolder.class, type.getRawClass());

        Field fArray = GenericHolder.class.getField("genericArray");
        Type gArrayType = fArray.getGenericType();
        Assert.assertTrue(gArrayType instanceof GenericArrayType);
        JavaType resolvedArray = tf.constructType(gArrayType);
        Assert.assertTrue(resolvedArray.isArrayType());
    }

    @Test
    public void testRecursiveGenericType() {
        JavaType recType = tf.constructType(RecursiveHolder.class);
        Assert.assertEquals(RecursiveHolder.class, recType.getRawClass());
    }

    @Test
    public void testAtomicReferenceHandling() {
        JavaType atomicType = tf.constructType(new TypeReference<AtomicReference<String>>() {});
        Assert.assertTrue(atomicType.isReferenceType());
        Assert.assertEquals(String.class, atomicType.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_alreadyJavaType() {
        JavaType orig = tf.constructType(String.class);
        JavaType res = tf.constructType(orig);
        Assert.assertSame(orig, res);
    }
}
