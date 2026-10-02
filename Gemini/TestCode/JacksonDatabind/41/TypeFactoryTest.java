package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

public class TypeFactoryTest {

    enum TestEnum { A, B }

    static class GenericHolder<T, E extends Number> {
        public T[] genericArray;
        public List<?> wildcardList;
        public List<? extends Number> boundedWildcardList;
        public List<? super Integer> lowerBoundedWildcardList;
        public T typeVarField;
        public E boundedTypeVarField;
    }

    static class SelfRef<T extends SelfRef<T>> {
        public T self;
    }

    static class CustomMapLike<K, V> {
        public K key;
        public V value;
    }

    static class CustomCollectionLike<E> {
        public E element;
    }

    interface CustomInterface<T> {}

    static class CustomClassImpl implements CustomInterface<String> {}

    static class UnrelatedClass {}

    static class SubList<E> extends ArrayList<E> {}

    static class SubMap<K, V> extends HashMap<K, V> {}

    @Test
    public void testDefaultInstanceAndClearCache() {
        TypeFactory tf = TypeFactory.defaultInstance();
        Assert.assertNotNull(tf);
        tf.clearCache();
    }

    @Test
    public void testWithModifier() {
        TypeFactory tf = TypeFactory.defaultInstance();
        TypeModifier mod1 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeModifier mod2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };

        TypeFactory tfNull = tf.withModifier(null);
        Assert.assertNotNull(tfNull);

        TypeFactory tf1 = tf.withModifier(mod1);
        Assert.assertNotNull(tf1);
        Assert.assertNotNull(tf1._modifiers);
        Assert.assertEquals(1, tf1._modifiers.length);

        TypeFactory tf2 = tf1.withModifier(mod2);
        Assert.assertNotNull(tf2);
        Assert.assertEquals(2, tf2._modifiers.length);

        // Test modifier execution on simple type
        JavaType modified = tf1.constructType(String.class);
        Assert.assertNotNull(modified);
    }

    @Test
    public void testWithClassLoaderAndGetClassLoader() {
        TypeFactory tf = TypeFactory.defaultInstance();
        Assert.assertNull(tf.getClassLoader());

        ClassLoader cl = getClass().getClassLoader();
        TypeFactory tfWithCl = tf.withClassLoader(cl);
        Assert.assertSame(cl, tfWithCl.getClassLoader());
    }

    @Test
    public void testUnknownType() {
        JavaType ut = TypeFactory.unknownType();
        Assert.assertNotNull(ut);
        Assert.assertEquals(Object.class, ut.getRawClass());
    }

    @Test
    public void testRawClass() {
        Assert.assertEquals(String.class, TypeFactory.rawClass(String.class));
        Type listType = new TypeReference<List<String>>() {}.getType();
        Assert.assertEquals(List.class, TypeFactory.rawClass(listType));
    }

    @Test
    public void testFindClassPrimitives() throws ClassNotFoundException {
        TypeFactory tf = TypeFactory.defaultInstance();
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
    public void testFindClassStandard() throws ClassNotFoundException {
        TypeFactory tf = TypeFactory.defaultInstance();
        Assert.assertEquals(String.class, tf.findClass("java.lang.String"));
        Assert.assertEquals(ArrayList.class, tf.findClass("java.util.ArrayList"));

        TypeFactory tfWithCl = tf.withClassLoader(getClass().getClassLoader());
        Assert.assertEquals(String.class, tfWithCl.findClass("java.lang.String"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClassNotFound() throws ClassNotFoundException {
        TypeFactory.defaultInstance().findClass("com.nonexistent.NoSuchClass");
    }

    @Test
    public void testConstructSpecializedType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listType = tf.constructType(new TypeReference<List<String>>() {});

        // Same raw class
        Assert.assertSame(listType, tf.constructSpecializedType(listType, List.class));

        // From Object base
        JavaType objType = tf.constructType(Object.class);
        JavaType fromObj = tf.constructSpecializedType(objType, String.class);
        Assert.assertEquals(String.class, fromObj.getRawClass());

        // Empty bindings base
        JavaType rawList = tf.constructType(List.class);
        JavaType specializedRaw = tf.constructSpecializedType(rawList, ArrayList.class);
        Assert.assertEquals(ArrayList.class, specializedRaw.getRawClass());

        // Map short-cuts
        JavaType mapType = tf.constructType(new TypeReference<Map<String, Integer>>() {});
        Assert.assertEquals(HashMap.class, tf.constructSpecializedType(mapType, HashMap.class).getRawClass());
        Assert.assertEquals(LinkedHashMap.class, tf.constructSpecializedType(mapType, LinkedHashMap.class).getRawClass());
        Assert.assertEquals(TreeMap.class, tf.constructSpecializedType(mapType, TreeMap.class).getRawClass());
        JavaType enumMapBase = tf.constructType(new TypeReference<Map<TestEnum, Integer>>() {});
        Assert.assertEquals(EnumMap.class, tf.constructSpecializedType(enumMapBase, EnumMap.class).getRawClass());

        // Collection short-cuts
        Assert.assertEquals(ArrayList.class, tf.constructSpecializedType(listType, ArrayList.class).getRawClass());
        Assert.assertEquals(LinkedList.class, tf.constructSpecializedType(listType, LinkedList.class).getRawClass());
        JavaType setType = tf.constructType(new TypeReference<Set<String>>() {});
        Assert.assertEquals(HashSet.class, tf.constructSpecializedType(setType, HashSet.class).getRawClass());
        Assert.assertEquals(TreeSet.class, tf.constructSpecializedType(setType, TreeSet.class).getRawClass());

        // EnumSet shortcut
        JavaType enumSetType = tf.constructType(new TypeReference<EnumSet<TestEnum>>() {});
        Assert.assertSame(enumSetType, tf.constructSpecializedType(enumSetType, EnumSet.class));

        // Subclass without type parameters
        JavaType customInterfaceType = tf.constructType(new TypeReference<CustomInterface<String>>() {});
        JavaType specializedNonGeneric = tf.constructSpecializedType(customInterfaceType, CustomClassImpl.class);
        Assert.assertEquals(CustomClassImpl.class, specializedNonGeneric.getRawClass());

        // Interface / class refine
        JavaType subListType = tf.constructSpecializedType(listType, SubList.class);
        Assert.assertEquals(SubList.class, subListType.getRawClass());
        Assert.assertEquals(String.class, subListType.findSuperType(List.class).getBindings().getBoundType(0).getRawClass());

        JavaType subMapType = tf.constructSpecializedType(mapType, SubMap.class);
        Assert.assertEquals(SubMap.class, subMapType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedTypeNotSubtype() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listType = tf.constructType(List.class);
        tf.constructSpecializedType(listType, String.class);
    }

    @Test
    public void testConstructGeneralizedType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType arrayListType = tf.constructType(new TypeReference<ArrayList<String>>() {});

        Assert.assertSame(arrayListType, tf.constructGeneralizedType(arrayListType, ArrayList.class));

        JavaType listType = tf.constructGeneralizedType(arrayListType, List.class);
        Assert.assertEquals(List.class, listType.getRawClass());
        Assert.assertEquals(String.class, listType.getBindings().getBoundType(0).getRawClass());

        JavaType collectionType = tf.constructGeneralizedType(arrayListType, Collection.class);
        Assert.assertEquals(Collection.class, collectionType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedTypeNotSuperType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listType = tf.constructType(List.class);
        tf.constructGeneralizedType(listType, ArrayList.class);
    }

    @Test
    public void testConstructFromCanonical() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType type = tf.constructFromCanonical("java.util.List<java.lang.String>");
        Assert.assertEquals(List.class, type.getRawClass());
        Assert.assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonicalInvalid() {
        TypeFactory.defaultInstance().constructFromCanonical("java.util.List<invalid.Class");
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindTypeParameters() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType mapType = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});

        JavaType[] params = tf.findTypeParameters(mapType, Map.class);
        Assert.assertEquals(2, params.length);
        Assert.assertEquals(String.class, params[0].getRawClass());
        Assert.assertEquals(Integer.class, params[1].getRawClass());

        JavaType[] noParams = tf.findTypeParameters(mapType, List.class);
        Assert.assertEquals(0, noParams.length);

        JavaType[] deprecated1 = tf.findTypeParameters(HashMap.class, Map.class, TypeBindings.emptyBindings());
        Assert.assertNotNull(deprecated1);

        JavaType[] deprecated2 = tf.findTypeParameters(HashMap.class, Map.class);
        Assert.assertNotNull(deprecated2);
    }

    @Test
    public void testMoreSpecificType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType listType = tf.constructType(List.class);
        JavaType arrayListType = tf.constructType(ArrayList.class);
        JavaType strType = tf.constructType(String.class);

        Assert.assertSame(listType, tf.moreSpecificType(listType, null));
        Assert.assertSame(listType, tf.moreSpecificType(null, listType));
        Assert.assertSame(listType, tf.moreSpecificType(listType, listType));
        Assert.assertSame(arrayListType, tf.moreSpecificType(listType, arrayListType));
        Assert.assertSame(arrayListType, tf.moreSpecificType(arrayListType, listType));
        Assert.assertSame(listType, tf.moreSpecificType(listType, strType));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructTypeVariants() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType t1 = tf.constructType(String.class);
        Assert.assertEquals(String.class, t1.getRawClass());

        JavaType t2 = tf.constructType(String.class, TypeBindings.emptyBindings());
        Assert.assertEquals(String.class, t2.getRawClass());

        JavaType t3 = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertEquals(List.class, t3.getRawClass());

        JavaType t4 = tf.constructType(List.class, ArrayList.class);
        Assert.assertEquals(List.class, t4.getRawClass());

        JavaType t5 = tf.constructType(List.class, tf.constructType(ArrayList.class));
        Assert.assertEquals(List.class, t5.getRawClass());
    }

    @Test
    public void testConstructArrayType() {
        TypeFactory tf = TypeFactory.defaultInstance();

        ArrayType at1 = tf.constructArrayType(String.class);
        Assert.assertEquals(String.class, at1.getContentType().getRawClass());
        Assert.assertTrue(at1.isArrayType());

        ArrayType at2 = tf.constructArrayType(tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, at2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        CollectionType ct1 = tf.constructCollectionType(List.class, String.class);
        Assert.assertEquals(List.class, ct1.getRawClass());
        Assert.assertEquals(String.class, ct1.getContentType().getRawClass());

        CollectionType ct2 = tf.constructCollectionType(ArrayList.class, tf.constructType(Integer.class));
        Assert.assertEquals(ArrayList.class, ct2.getRawClass());
        Assert.assertEquals(Integer.class, ct2.getContentType().getRawClass());

        CollectionLikeType clt1 = tf.constructCollectionLikeType(CustomCollectionLike.class, String.class);
        Assert.assertEquals(CustomCollectionLike.class, clt1.getRawClass());

        CollectionLikeType clt2 = tf.constructCollectionLikeType(CustomCollectionLike.class, tf.constructType(Integer.class));
        Assert.assertEquals(CustomCollectionLike.class, clt2.getRawClass());

        CollectionType rawCt = tf.constructRawCollectionType(ArrayList.class);
        Assert.assertEquals(Object.class, rawCt.getContentType().getRawClass());

        CollectionLikeType rawClt = tf.constructRawCollectionLikeType(CustomCollectionLike.class);
        Assert.assertEquals(Object.class, rawClt.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        MapType mt1 = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(Map.class, mt1.getRawClass());
        Assert.assertEquals(String.class, mt1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mt1.getContentType().getRawClass());

        MapType mtProps = tf.constructMapType(Properties.class, Object.class, Object.class);
        Assert.assertEquals(String.class, mtProps.getKeyType().getRawClass());
        Assert.assertEquals(String.class, mtProps.getContentType().getRawClass());

        MapType mt2 = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Long.class));
        Assert.assertEquals(HashMap.class, mt2.getRawClass());

        MapLikeType mlt1 = tf.constructMapLikeType(CustomMapLike.class, String.class, Integer.class);
        Assert.assertEquals(CustomMapLike.class, mlt1.getRawClass());

        MapLikeType mlt2 = tf.constructMapLikeType(CustomMapLike.class, tf.constructType(String.class), tf.constructType(Long.class));
        Assert.assertEquals(CustomMapLike.class, mlt2.getRawClass());

        MapType rawMt = tf.constructRawMapType(HashMap.class);
        Assert.assertEquals(Object.class, rawMt.getKeyType().getRawClass());

        MapLikeType rawMlt = tf.constructRawMapLikeType(CustomMapLike.class);
        Assert.assertEquals(Object.class, rawMlt.getKeyType().getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructSimpleAndReferenceTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType simpleType = tf.constructSimpleType(CustomInterface.class, new JavaType[] { tf.constructType(String.class) });
        Assert.assertEquals(CustomInterface.class, simpleType.getRawClass());

        JavaType simpleDeprecated = tf.constructSimpleType(CustomInterface.class, CustomInterface.class, new JavaType[] { tf.constructType(String.class) });
        Assert.assertEquals(CustomInterface.class, simpleDeprecated.getRawClass());

        JavaType refType = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        Assert.assertTrue(refType.isReferenceType());
        Assert.assertEquals(AtomicReference.class, refType.getRawClass());

        JavaType unchecked = tf.uncheckedSimpleType(String.class);
        Assert.assertEquals(String.class, unchecked.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructParametricAndParametrizedTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType pt1 = tf.constructParametricType(List.class, String.class);
        Assert.assertEquals(List.class, pt1.getRawClass());

        JavaType pt2 = tf.constructParametricType(Map.class, tf.constructType(String.class), tf.constructType(Integer.class));
        Assert.assertEquals(Map.class, pt2.getRawClass());

        JavaType pt3 = tf.constructParametrizedType(List.class, List.class, tf.constructType(String.class));
        Assert.assertEquals(List.class, pt3.getRawClass());

        JavaType pt4 = tf.constructParametrizedType(List.class, List.class, String.class);
        Assert.assertEquals(List.class, pt4.getRawClass());
    }

    @Test
    public void testWellKnownTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        Assert.assertEquals(boolean.class, tf.constructType(boolean.class).getRawClass());
        Assert.assertEquals(int.class, tf.constructType(int.class).getRawClass());
        Assert.assertEquals(long.class, tf.constructType(long.class).getRawClass());
        Assert.assertEquals(String.class, tf.constructType(String.class).getRawClass());
        Assert.assertEquals(Object.class, tf.constructType(Object.class).getRawClass());

        Assert.assertEquals(Enum.class, tf.constructType(Enum.class).getRawClass());
        Assert.assertEquals(Comparable.class, tf.constructType(Comparable.class).getRawClass());
        Assert.assertEquals(Class.class, tf.constructType(Class.class).getRawClass());

        Assert.assertEquals(Properties.class, tf.constructType(Properties.class).getRawClass());
        Assert.assertEquals(AtomicReference.class, tf.constructType(AtomicReference.class).getRawClass());
        Assert.assertEquals(Collection.class, tf.constructType(Collection.class).getRawClass());
        Assert.assertEquals(Map.class, tf.constructType(Map.class).getRawClass());
    }

    @Test
    public void testReflectiveTypesResolution() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();

        Field arrayField = GenericHolder.class.getField("genericArray");
        Type genericArrayType = arrayField.getGenericType();
        Assert.assertTrue(genericArrayType instanceof GenericArrayType);
        JavaType jtArray = tf.constructType(genericArrayType);
        Assert.assertTrue(jtArray.isArrayType());

        Field wildcardField = GenericHolder.class.getField("wildcardList");
        ParameterizedType ptWildcard = (ParameterizedType) wildcardField.getGenericType();
        Type wildcardType = ptWildcard.getActualTypeArguments()[0];
        Assert.assertTrue(wildcardType instanceof WildcardType);
        JavaType jtWildcard = tf.constructType(wildcardType);
        Assert.assertEquals(Object.class, jtWildcard.getRawClass());

        Field boundedWildcardField = GenericHolder.class.getField("boundedWildcardList");
        ParameterizedType ptBoundedWildcard = (ParameterizedType) boundedWildcardField.getGenericType();
        JavaType jtBoundedWildcard = tf.constructType(ptBoundedWildcard.getActualTypeArguments()[0]);
        Assert.assertEquals(Number.class, jtBoundedWildcard.getRawClass());

        Field lowerWildcardField = GenericHolder.class.getField("lowerBoundedWildcardList");
        ParameterizedType ptLowerWildcard = (ParameterizedType) lowerWildcardField.getGenericType();
        JavaType jtLowerWildcard = tf.constructType(ptLowerWildcard.getActualTypeArguments()[0]);
        Assert.assertEquals(Object.class, jtLowerWildcard.getRawClass());

        Field typeVarField = GenericHolder.class.getField("typeVarField");
        Type typeVar = typeVarField.getGenericType();
        Assert.assertTrue(typeVar instanceof TypeVariable);
        JavaType jtVar = tf.constructType(typeVar);
        Assert.assertEquals(Object.class, jtVar.getRawClass());

        Field boundedTypeVarField = GenericHolder.class.getField("boundedTypeVarField");
        Type boundedVar = boundedTypeVarField.getGenericType();
        JavaType jtBoundedVar = tf.constructType(boundedVar);
        Assert.assertEquals(Number.class, jtBoundedVar.getRawClass());

        // Recursive type resolution
        JavaType selfRefType = tf.constructType(SelfRef.class);
        Assert.assertEquals(SelfRef.class, selfRefType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromAnyWithNull() {
        TypeFactory.defaultInstance()._fromAny(null, null, TypeBindings.emptyBindings());
    }
}
