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

public class TypeFactoryTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
        tf.clearCache();
    }

    // Dummy helper classes for generic introspection
    public static class GenericHolder<T> {
        public T value;
        public T[] genericArray;
        public List<? extends Number> wildcardUpper;
        public List<? super Integer> wildcardLower;
    }

    public static class StringHolder extends GenericHolder<String> {}

    public static class SelfRef<T extends SelfRef<T>> {
        public T self;
    }

    public static class Node {
        public Node next;
    }

    public static class CustomCollection<E> extends ArrayList<E> {}
    public static class CustomMap<K, V> extends HashMap<K, V> {}
    public static class NonGenericList extends ArrayList<String> {}
    public static class SingleParamSub<E> extends ArrayList<E> {}
    public static class DualParamSub<K, V> extends HashMap<K, V> {}
    public static class CustomCollectionLike<T> {}
    public static class CustomMapLike<K, V> {}
    public interface CustomInterface<T> {}
    public static class CustomInterfaceImpl<T> implements CustomInterface<T> {}

    enum SampleEnum { A, B }

    @Test
    public void testDefaultInstance_notNull() {
        TypeFactory instance = TypeFactory.defaultInstance();
        Assert.assertNotNull(instance);
        Assert.assertSame(instance, TypeFactory.defaultInstance());
    }

    @Test
    public void testClearCache() {
        JavaType jt = tf.constructType(String.class);
        Assert.assertNotNull(jt);
        tf.clearCache();
        Assert.assertEquals(0, tf._typeCache.size());
    }

    @Test
    public void testClassLoader_getAndWith() {
        ClassLoader cl = getClass().getClassLoader();
        TypeFactory customTf = tf.withClassLoader(cl);
        Assert.assertNotNull(customTf);
        Assert.assertSame(cl, customTf.getClassLoader());
        Assert.assertNull(tf.getClassLoader());
    }

    @Test
    public void testWithModifier_nullAndMultiple() {
        TypeFactory customTf = tf.withModifier(null);
        Assert.assertNotNull(customTf);

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

        TypeFactory tfWithOne = tf.withModifier(mod1);
        Assert.assertNotNull(tfWithOne);
        TypeFactory tfWithTwo = tfWithOne.withModifier(mod2);
        Assert.assertNotNull(tfWithTwo);

        JavaType constructed = tfWithTwo.constructType(String.class);
        Assert.assertEquals(String.class, constructed.getRawClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithModifier_returnsNull_throwsException() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return null;
            }
        };
        TypeFactory customTf = tf.withModifier(mod);
        customTf.constructType(String.class);
    }

    @Test
    public void testUnknownType() {
        JavaType unknown = TypeFactory.unknownType();
        Assert.assertNotNull(unknown);
        Assert.assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClass() {
        Assert.assertEquals(String.class, TypeFactory.rawClass(String.class));
        JavaType jt = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertEquals(List.class, TypeFactory.rawClass(jt));
    }

    @Test
    public void testFindClass_primitives() throws Exception {
        Assert.assertEquals(Integer.TYPE, tf.findClass("int"));
        Assert.assertEquals(Long.TYPE, tf.findClass("long"));
        Assert.assertEquals(Float.TYPE, tf.findClass("float"));
        Assert.assertEquals(Double.TYPE, tf.findClass("double"));
        Assert.assertEquals(Boolean.TYPE, tf.findClass("boolean"));
        Assert.assertEquals(Byte.TYPE, tf.findClass("byte"));
        Assert.assertEquals(Character.TYPE, tf.findClass("char"));
        Assert.assertEquals(Short.TYPE, tf.findClass("short"));
        Assert.assertEquals(Void.TYPE, tf.findClass("void"));
    }

    @Test
    public void testFindClass_namedClass() throws Exception {
        Class<?> clazz = tf.findClass("java.lang.String");
        Assert.assertEquals(String.class, clazz);

        TypeFactory customTf = tf.withClassLoader(getClass().getClassLoader());
        Class<?> customClazz = customTf.findClass("java.lang.Integer");
        Assert.assertEquals(Integer.class, customClazz);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_notFound_throwsException() throws Exception {
        tf.findClass("com.nonexistent.Class12345");
    }

    @Test
    public void testConstructSpecializedType_sameClass() {
        JavaType base = tf.constructType(String.class);
        JavaType specialized = tf.constructSpecializedType(base, String.class);
        Assert.assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_objectBase() {
        JavaType base = tf.constructType(Object.class);
        JavaType specialized = tf.constructSpecializedType(base, String.class);
        Assert.assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubclass_throwsException() {
        JavaType base = tf.constructType(List.class);
        tf.constructSpecializedType(base, Map.class);
    }

    @Test
    public void testConstructSpecializedType_emptyBindings() {
        JavaType base = tf.constructType(Number.class);
        JavaType specialized = tf.constructSpecializedType(base, Integer.class);
        Assert.assertEquals(Integer.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapShortcuts() {
        JavaType baseMap = tf.constructMapType(Map.class, String.class, Integer.class);

        JavaType hm = tf.constructSpecializedType(baseMap, HashMap.class);
        Assert.assertEquals(HashMap.class, hm.getRawClass());
        Assert.assertEquals(String.class, hm.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, hm.getContentType().getRawClass());

        JavaType lhm = tf.constructSpecializedType(baseMap, LinkedHashMap.class);
        Assert.assertEquals(LinkedHashMap.class, lhm.getRawClass());

        JavaType tm = tf.constructSpecializedType(baseMap, TreeMap.class);
        Assert.assertEquals(TreeMap.class, tm.getRawClass());

        JavaType enumMapBase = tf.constructMapType(Map.class, SampleEnum.class, Integer.class);
        JavaType em = tf.constructSpecializedType(enumMapBase, EnumMap.class);
        Assert.assertEquals(EnumMap.class, em.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionShortcuts() {
        JavaType baseColl = tf.constructCollectionType(List.class, String.class);

        JavaType al = tf.constructSpecializedType(baseColl, ArrayList.class);
        Assert.assertEquals(ArrayList.class, al.getRawClass());
        Assert.assertEquals(String.class, al.getContentType().getRawClass());

        JavaType ll = tf.constructSpecializedType(baseColl, LinkedList.class);
        Assert.assertEquals(LinkedList.class, ll.getRawClass());

        JavaType setBase = tf.constructCollectionType(Set.class, String.class);
        JavaType hs = tf.constructSpecializedType(setBase, HashSet.class);
        Assert.assertEquals(HashSet.class, hs.getRawClass());

        JavaType ts = tf.constructSpecializedType(setBase, TreeSet.class);
        Assert.assertEquals(TreeSet.class, ts.getRawClass());

        JavaType enumSetBase = tf.constructCollectionType(EnumSet.class, SampleEnum.class);
        JavaType es = tf.constructSpecializedType(enumSetBase, EnumSet.class);
        Assert.assertSame(enumSetBase, es);
    }

    @Test
    public void testConstructSpecializedType_nonGenericSubclass() {
        JavaType base = tf.constructCollectionType(List.class, String.class);
        JavaType spec = tf.constructSpecializedType(base, NonGenericList.class);
        Assert.assertEquals(NonGenericList.class, spec.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_genericSubclasses() {
        JavaType baseColl = tf.constructCollectionType(Collection.class, String.class);
        JavaType singleParam = tf.constructSpecializedType(baseColl, SingleParamSub.class);
        Assert.assertEquals(SingleParamSub.class, singleParam.getRawClass());
        Assert.assertEquals(String.class, singleParam.containedType(0).getRawClass());

        JavaType baseMap = tf.constructMapType(Map.class, String.class, Integer.class);
        JavaType dualParam = tf.constructSpecializedType(baseMap, DualParamSub.class);
        Assert.assertEquals(DualParamSub.class, dualParam.getRawClass());
        Assert.assertEquals(String.class, dualParam.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, dualParam.containedType(1).getRawClass());

        JavaType ifaceBase = tf.constructType(new TypeReference<CustomInterface<String>>() {});
        JavaType ifaceImpl = tf.constructSpecializedType(ifaceBase, CustomInterfaceImpl.class);
        Assert.assertEquals(CustomInterfaceImpl.class, ifaceImpl.getRawClass());
    }

    @Test
    public void testConstructGeneralizedType() {
        JavaType mapType = tf.constructMapType(HashMap.class, String.class, Integer.class);
        JavaType generalized = tf.constructGeneralizedType(mapType, Map.class);
        Assert.assertEquals(Map.class, generalized.getRawClass());
        Assert.assertEquals(String.class, generalized.getKeyType().getRawClass());

        JavaType same = tf.constructGeneralizedType(mapType, HashMap.class);
        Assert.assertSame(mapType, same);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType_throwsException() {
        JavaType stringType = tf.constructType(String.class);
        tf.constructGeneralizedType(stringType, List.class);
    }

    @Test
    public void testConstructFromCanonical() {
        JavaType jt = tf.constructFromCanonical("java.util.List<java.lang.String>");
        Assert.assertEquals(List.class, jt.getRawClass());
        Assert.assertEquals(String.class, jt.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed_throwsException() {
        tf.constructFromCanonical("invalid[canonical");
    }

    @Test
    public void testFindTypeParameters() {
        JavaType mapType = tf.constructMapType(HashMap.class, String.class, Integer.class);
        JavaType[] params = tf.findTypeParameters(mapType, Map.class);
        Assert.assertEquals(2, params.length);
        Assert.assertEquals(String.class, params[0].getRawClass());
        Assert.assertEquals(Integer.class, params[1].getRawClass());

        JavaType[] noParams = tf.findTypeParameters(mapType, Collection.class);
        Assert.assertEquals(0, noParams.length);

        @SuppressWarnings("deprecation")
        JavaType[] depParams1 = tf.findTypeParameters(HashMap.class, Map.class, TypeBindings.emptyBindings());
        Assert.assertNotNull(depParams1);

        @SuppressWarnings("deprecation")
        JavaType[] depParams2 = tf.findTypeParameters(HashMap.class, Map.class);
        Assert.assertNotNull(depParams2);
    }

    @Test
    public void testMoreSpecificType() {
        JavaType stringType = tf.constructType(String.class);
        JavaType objType = tf.constructType(Object.class);
        JavaType intType = tf.constructType(Integer.class);

        Assert.assertNull(tf.moreSpecificType(null, null));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, null));
        Assert.assertSame(stringType, tf.moreSpecificType(null, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(objType, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, objType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, intType));
    }

    @Test
    public void testConstructType_variants() {
        JavaType jt1 = tf.constructType(String.class);
        Assert.assertEquals(String.class, jt1.getRawClass());

        JavaType jt2 = tf.constructType(String.class, TypeBindings.emptyBindings());
        Assert.assertEquals(String.class, jt2.getRawClass());

        JavaType jtRef = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertEquals(List.class, jtRef.getRawClass());
        Assert.assertEquals(String.class, jtRef.getContentType().getRawClass());

        @SuppressWarnings("deprecation")
        JavaType jtDep1 = tf.constructType(String.class, (Class<?>) null);
        Assert.assertEquals(String.class, jtDep1.getRawClass());

        @SuppressWarnings("deprecation")
        JavaType jtDep2 = tf.constructType(String.class, Object.class);
        Assert.assertEquals(String.class, jtDep2.getRawClass());

        @SuppressWarnings("deprecation")
        JavaType jtDep3 = tf.constructType(String.class, (JavaType) null);
        Assert.assertEquals(String.class, jtDep3.getRawClass());

        @SuppressWarnings("deprecation")
        JavaType jtDep4 = tf.constructType(String.class, jt1);
        Assert.assertEquals(String.class, jtDep4.getRawClass());

        JavaType passThrough = tf.constructType(jt1);
        Assert.assertSame(jt1, passThrough);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType_throwsException() {
        tf._fromAny(null, null, TypeBindings.emptyBindings());
    }

    @Test
    public void testConstructArrayType() {
        ArrayType at1 = tf.constructArrayType(String.class);
        Assert.assertEquals(String[].class, at1.getRawClass());
        Assert.assertEquals(String.class, at1.getContentType().getRawClass());

        JavaType elem = tf.constructType(Integer.class);
        ArrayType at2 = tf.constructArrayType(elem);
        Assert.assertEquals(Integer[].class, at2.getRawClass());
        Assert.assertEquals(Integer.class, at2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType() {
        CollectionType ct1 = tf.constructCollectionType(List.class, String.class);
        Assert.assertEquals(List.class, ct1.getRawClass());
        Assert.assertEquals(String.class, ct1.getContentType().getRawClass());

        JavaType elem = tf.constructType(Double.class);
        CollectionType ct2 = tf.constructCollectionType(ArrayList.class, elem);
        Assert.assertEquals(ArrayList.class, ct2.getRawClass());
        Assert.assertEquals(Double.class, ct2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType() {
        CollectionLikeType clt1 = tf.constructCollectionLikeType(CustomCollectionLike.class, String.class);
        Assert.assertEquals(CustomCollectionLike.class, clt1.getRawClass());
        Assert.assertEquals(String.class, clt1.getContentType().getRawClass());

        JavaType elem = tf.constructType(Long.class);
        CollectionLikeType clt2 = tf.constructCollectionLikeType(CustomCollectionLike.class, elem);
        Assert.assertEquals(CustomCollectionLike.class, clt2.getRawClass());
        Assert.assertEquals(Long.class, clt2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType() {
        MapType mt1 = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(Map.class, mt1.getRawClass());
        Assert.assertEquals(String.class, mt1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mt1.getContentType().getRawClass());

        MapType mtProp = tf.constructMapType(Properties.class, Object.class, Object.class);
        Assert.assertEquals(Properties.class, mtProp.getRawClass());
        Assert.assertEquals(String.class, mtProp.getKeyType().getRawClass());
        Assert.assertEquals(String.class, mtProp.getContentType().getRawClass());

        JavaType kt = tf.constructType(String.class);
        JavaType vt = tf.constructType(Boolean.class);
        MapType mt2 = tf.constructMapType(HashMap.class, kt, vt);
        Assert.assertEquals(HashMap.class, mt2.getRawClass());
        Assert.assertEquals(String.class, mt2.getKeyType().getRawClass());
        Assert.assertEquals(Boolean.class, mt2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType() {
        MapLikeType mlt1 = tf.constructMapLikeType(CustomMapLike.class, String.class, Integer.class);
        Assert.assertEquals(CustomMapLike.class, mlt1.getRawClass());
        Assert.assertEquals(String.class, mlt1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mlt1.getContentType().getRawClass());

        JavaType kt = tf.constructType(String.class);
        JavaType vt = tf.constructType(Long.class);
        MapLikeType mlt2 = tf.constructMapLikeType(CustomMapLike.class, kt, vt);
        Assert.assertEquals(CustomMapLike.class, mlt2.getRawClass());
        Assert.assertEquals(String.class, mlt2.getKeyType().getRawClass());
        Assert.assertEquals(Long.class, mlt2.getContentType().getRawClass());
    }

    @Test
    public void testConstructSimpleType_andUnchecked() {
        JavaType[] params = new JavaType[] { tf.constructType(String.class) };
        JavaType st = tf.constructSimpleType(ArrayList.class, params);
        Assert.assertEquals(ArrayList.class, st.getRawClass());

        @SuppressWarnings("deprecation")
        JavaType stDep = tf.constructSimpleType(ArrayList.class, List.class, params);
        Assert.assertEquals(ArrayList.class, stDep.getRawClass());

        JavaType unchecked = tf.uncheckedSimpleType(String.class);
        Assert.assertEquals(String.class, unchecked.getRawClass());
    }

    @Test
    public void testConstructReferenceType() {
        JavaType refType = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        Assert.assertTrue(refType.isReferenceType());
        Assert.assertEquals(AtomicReference.class, refType.getRawClass());
        Assert.assertEquals(String.class, refType.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType() {
        JavaType pt1 = tf.constructParametricType(ArrayList.class, String.class);
        Assert.assertEquals(ArrayList.class, pt1.getRawClass());
        Assert.assertEquals(String.class, pt1.getContentType().getRawClass());

        JavaType pt2 = tf.constructParametricType(HashMap.class, String.class, Integer.class);
        Assert.assertEquals(HashMap.class, pt2.getRawClass());
        Assert.assertEquals(String.class, pt2.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, pt2.getContentType().getRawClass());

        JavaType pt3 = tf.constructParametrizedType(ArrayList.class, List.class, tf.constructType(String.class));
        Assert.assertEquals(ArrayList.class, pt3.getRawClass());

        JavaType pt4 = tf.constructParametrizedType(HashMap.class, Map.class, String.class, Integer.class);
        Assert.assertEquals(HashMap.class, pt4.getRawClass());
    }

    @Test
    public void testConstructRawVariants() {
        CollectionType rawColl = tf.constructRawCollectionType(ArrayList.class);
        Assert.assertEquals(ArrayList.class, rawColl.getRawClass());
        Assert.assertEquals(Object.class, rawColl.getContentType().getRawClass());

        CollectionLikeType rawCollLike = tf.constructRawCollectionLikeType(CustomCollectionLike.class);
        Assert.assertEquals(CustomCollectionLike.class, rawCollLike.getRawClass());
        Assert.assertEquals(Object.class, rawCollLike.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(HashMap.class);
        Assert.assertEquals(HashMap.class, rawMap.getRawClass());
        Assert.assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMap.getContentType().getRawClass());

        MapLikeType rawMapLike = tf.constructRawMapLikeType(CustomMapLike.class);
        Assert.assertEquals(CustomMapLike.class, rawMapLike.getRawClass());
        Assert.assertEquals(Object.class, rawMapLike.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMapLike.getContentType().getRawClass());
    }

    @Test
    public void testWellKnownTypes() {
        Assert.assertSame(TypeFactory.CORE_TYPE_BOOL, tf.constructType(Boolean.TYPE));
        Assert.assertSame(TypeFactory.CORE_TYPE_INT, tf.constructType(Integer.TYPE));
        Assert.assertSame(TypeFactory.CORE_TYPE_LONG, tf.constructType(Long.TYPE));
        Assert.assertSame(TypeFactory.CORE_TYPE_STRING, tf.constructType(String.class));
        Assert.assertSame(TypeFactory.CORE_TYPE_OBJECT, tf.constructType(Object.class));
        Assert.assertSame(TypeFactory.CORE_TYPE_COMPARABLE, tf.constructType(Comparable.class));
        Assert.assertSame(TypeFactory.CORE_TYPE_ENUM, tf.constructType(Enum.class));
        Assert.assertSame(TypeFactory.CORE_TYPE_CLASS, tf.constructType(Class.class));
    }

    @Test
    public void testAtomicReference_wellKnown() {
        JavaType jt = tf.constructType(new TypeReference<AtomicReference<String>>() {});
        Assert.assertTrue(jt.isReferenceType());
        Assert.assertEquals(AtomicReference.class, jt.getRawClass());
        Assert.assertEquals(String.class, jt.getContentType().getRawClass());

        JavaType rawRef = tf.constructType(AtomicReference.class);
        Assert.assertTrue(rawRef.isReferenceType());
    }

    @Test
    public void testProperties_specialCase() {
        JavaType propType = tf.constructType(Properties.class);
        Assert.assertTrue(propType.isMapLikeType());
        Assert.assertEquals(String.class, propType.getKeyType().getRawClass());
        Assert.assertEquals(String.class, propType.getContentType().getRawClass());
    }

    @Test
    public void testSelfReferentialTypes() {
        JavaType nodeType = tf.constructType(Node.class);
        Assert.assertEquals(Node.class, nodeType.getRawClass());

        JavaType selfRefType = tf.constructType(SelfRef.class);
        Assert.assertEquals(SelfRef.class, selfRefType.getRawClass());
    }

    @Test
    public void testGenericFields_genericArray_wildcard_typeVar() throws Exception {
        Field genericArrayField = GenericHolder.class.getField("genericArray");
        JavaType arrayType = tf.constructType(genericArrayField.getGenericType());
        Assert.assertTrue(arrayType.isArrayType());

        Field wildcardUpperField = GenericHolder.class.getField("wildcardUpper");
        JavaType wildcardUpperType = tf.constructType(wildcardUpperField.getGenericType());
        Assert.assertEquals(List.class, wildcardUpperType.getRawClass());
        Assert.assertEquals(Number.class, wildcardUpperType.getContentType().getRawClass());

        JavaType holderType = tf.constructType(StringHolder.class);
        Assert.assertEquals(StringHolder.class, holderType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollectionType_invalidParameterCount_throwsException() {
        TypeBindings tb = TypeBindings.create(ArrayList.class, new JavaType[] {
                tf.constructType(String.class), tf.constructType(Integer.class)
        });
        tf._collectionType(ArrayList.class, tb, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapType_invalidParameterCount_throwsException() {
        TypeBindings tb = TypeBindings.create(HashMap.class, new JavaType[] {
                tf.constructType(String.class)
        });
        tf._mapType(HashMap.class, tb, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferenceType_invalidParameterCount_throwsException() {
        TypeBindings tb = TypeBindings.create(AtomicReference.class, new JavaType[] {
                tf.constructType(String.class), tf.constructType(Integer.class)
        });
        tf._referenceType(AtomicReference.class, tb, null, null);
    }
}
