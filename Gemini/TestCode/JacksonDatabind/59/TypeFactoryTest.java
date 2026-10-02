package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
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

    static class GenericHolder<T> {
        public List<String> stringList;
        public List<?> wildcardList;
        public List<? extends Number> boundedWildcardList;
        public T[] genericArray;
        public T typeVar;
        public <U> void genericMethod(U param) {}
    }

    static class RecursiveClass<T extends RecursiveClass<T>> {
        public T next;
    }

    static class SingleParam<A> {}
    static class TwoParam<A, B> {}
    static class ThreeParam<A, B, C> {}
    static class CustomMapLikeClass {}
    static class CustomCollectionLikeClass {}

    static class SubSingleParam<A> extends SingleParam<A> {}
    static class SubTwoParam<A, B> extends TwoParam<A, B> {}
    static class SubThreeParam<A, B, C> extends ThreeParam<A, B, C> {}

    @Test
    public void testDefaultInstance_notNull() {
        TypeFactory tf = TypeFactory.defaultInstance();
        Assert.assertNotNull(tf);
        Assert.assertSame(tf, TypeFactory.defaultInstance());
    }

    @Test
    public void testWithModifier_andClearModifier() {
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

        TypeFactory tfWithMod = tf.withModifier(mod1);
        Assert.assertNotSame(tf, tfWithMod);

        TypeFactory tfWithTwoMods = tfWithMod.withModifier(mod2);
        Assert.assertNotSame(tfWithMod, tfWithTwoMods);

        // Duplicate addition
        TypeFactory tfDup = tfWithTwoMods.withModifier(mod2);
        Assert.assertNotNull(tfDup);

        // Reset modifier with null
        TypeFactory tfReset = tfWithTwoMods.withModifier(null);
        Assert.assertNotNull(tfReset);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithModifier_returningNullThrowsException() {
        TypeModifier badMod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return null;
            }
        };
        TypeFactory tf = TypeFactory.defaultInstance().withModifier(badMod);
        tf.constructType(String.class);
    }

    @Test
    public void testWithClassLoader_andGetClassLoader() {
        ClassLoader cl = new ClassLoader(getClass().getClassLoader()) {};
        TypeFactory tf = TypeFactory.defaultInstance().withClassLoader(cl);
        Assert.assertSame(cl, tf.getClassLoader());
    }

    @Test
    public void testWithCache_andClearCache() {
        LRUMap<Object, JavaType> customCache = new LRUMap<Object, JavaType>(10, 50);
        TypeFactory tf = TypeFactory.defaultInstance().withCache(customCache);
        JavaType jt = tf.constructType(String.class);
        Assert.assertNotNull(jt);
        tf.clearCache();
        Assert.assertEquals(0, customCache.size());
    }

    @Test
    public void testUnknownType() {
        JavaType type = TypeFactory.unknownType();
        Assert.assertNotNull(type);
        Assert.assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testRawClass() throws Exception {
        Assert.assertEquals(String.class, TypeFactory.rawClass(String.class));
        Field f = GenericHolder.class.getField("stringList");
        Assert.assertEquals(List.class, TypeFactory.rawClass(f.getGenericType()));
    }

    @Test
    public void testFindClass_primitives() throws Exception {
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
    public void testFindClass_referenceClasses() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        Assert.assertEquals(String.class, tf.findClass("java.lang.String"));
        Assert.assertEquals(ArrayList.class, tf.findClass("java.util.ArrayList"));
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_nonExistentClass() throws Exception {
        TypeFactory.defaultInstance().findClass("com.fasterxml.jackson.nonexistent.FakeClass");
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_unknownPrimitiveLikeName() throws Exception {
        TypeFactory.defaultInstance().findClass("unknownPrimitive");
    }

    @Test
    public void testConstructSpecializedType_sameClass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType base = tf.constructType(String.class);
        JavaType specialized = tf.constructSpecializedType(base, String.class);
        Assert.assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_objectBase() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType base = tf.constructType(Object.class);
        JavaType specialized = tf.constructSpecializedType(base, String.class);
        Assert.assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_incompatibleSubclass() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType base = tf.constructType(List.class);
        tf.constructSpecializedType(base, Set.class);
    }

    @Test
    public void testConstructSpecializedType_emptyBindings() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType base = tf.constructType(CharSequence.class);
        JavaType specialized = tf.constructSpecializedType(base, String.class);
        Assert.assertEquals(String.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_containerShortcuts() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType mapBase = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(HashMap.class, tf.constructSpecializedType(mapBase, HashMap.class).getRawClass());
        Assert.assertEquals(LinkedHashMap.class, tf.constructSpecializedType(mapBase, LinkedHashMap.class).getRawClass());
        Assert.assertEquals(TreeMap.class, tf.constructSpecializedType(mapBase, TreeMap.class).getRawClass());

        JavaType enumMapBase = tf.constructMapType(Map.class, TestEnum.class, Integer.class);
        Assert.assertEquals(EnumMap.class, tf.constructSpecializedType(enumMapBase, EnumMap.class).getRawClass());

        JavaType listBase = tf.constructCollectionType(List.class, String.class);
        Assert.assertEquals(ArrayList.class, tf.constructSpecializedType(listBase, ArrayList.class).getRawClass());
        Assert.assertEquals(LinkedList.class, tf.constructSpecializedType(listBase, LinkedList.class).getRawClass());

        JavaType setBase = tf.constructCollectionType(Set.class, String.class);
        Assert.assertEquals(HashSet.class, tf.constructSpecializedType(setBase, HashSet.class).getRawClass());
        Assert.assertEquals(TreeSet.class, tf.constructSpecializedType(setBase, TreeSet.class).getRawClass());

        JavaType enumSet = tf.constructCollectionType(EnumSet.class, TestEnum.class);
        Assert.assertSame(enumSet, tf.constructSpecializedType(enumSet, EnumSet.class));
    }

    @Test
    public void testConstructSpecializedType_genericSubclasses() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType single = tf.constructParametricType(SingleParam.class, String.class);
        JavaType subSingle = tf.constructSpecializedType(single, SubSingleParam.class);
        Assert.assertEquals(SubSingleParam.class, subSingle.getRawClass());
        Assert.assertEquals(String.class, subSingle.containedType(0).getRawClass());

        JavaType two = tf.constructParametricType(TwoParam.class, String.class, Integer.class);
        JavaType subTwo = tf.constructSpecializedType(two, SubTwoParam.class);
        Assert.assertEquals(SubTwoParam.class, subTwo.getRawClass());
        Assert.assertEquals(String.class, subTwo.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, subTwo.containedType(1).getRawClass());

        JavaType three = tf.constructParametricType(ThreeParam.class, String.class, Integer.class, Boolean.class);
        JavaType subThree = tf.constructSpecializedType(three, SubThreeParam.class);
        Assert.assertEquals(SubThreeParam.class, subThree.getRawClass());
        Assert.assertEquals(3, subThree.containedTypeCount());
        Assert.assertEquals(Boolean.class, subThree.containedType(2).getRawClass());

        // Interface refinement
        JavaType comp = tf.constructParametricType(Comparable.class, String.class);
        JavaType specializedComp = tf.constructSpecializedType(comp, String.class);
        Assert.assertEquals(String.class, specializedComp.getRawClass());
    }

    @Test
    public void testConstructGeneralizedType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType arrayListType = tf.constructCollectionType(ArrayList.class, String.class);

        // Same class
        JavaType genSame = tf.constructGeneralizedType(arrayListType, ArrayList.class);
        Assert.assertSame(arrayListType, genSame);

        // Superclass
        JavaType genList = tf.constructGeneralizedType(arrayListType, List.class);
        Assert.assertEquals(List.class, genList.getRawClass());
        Assert.assertEquals(String.class, genList.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        tf.constructGeneralizedType(stringType, List.class);
    }

    @Test
    public void testConstructFromCanonical() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructFromCanonical("java.lang.String");
        Assert.assertEquals(String.class, stringType.getRawClass());

        JavaType listType = tf.constructFromCanonical("java.util.ArrayList<java.lang.String>");
        Assert.assertEquals(ArrayList.class, listType.getRawClass());
        Assert.assertEquals(String.class, listType.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_invalid() {
        TypeFactory.defaultInstance().constructFromCanonical("java.lang.String<invalid");
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testFindTypeParameters() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType subType = tf.constructMapType(HashMap.class, String.class, Integer.class);
        JavaType[] params = tf.findTypeParameters(subType, Map.class);
        Assert.assertEquals(2, params.length);
        Assert.assertEquals(String.class, params[0].getRawClass());
        Assert.assertEquals(Integer.class, params[1].getRawClass());

        JavaType[] noParams = tf.findTypeParameters(subType, Set.class);
        Assert.assertEquals(0, noParams.length);

        // Deprecated variants
        JavaType[] paramsDep1 = tf.findTypeParameters(HashMap.class, Map.class);
        Assert.assertEquals(2, paramsDep1.length);

        JavaType[] paramsDep2 = tf.findTypeParameters(HashMap.class, Map.class, TypeBindings.emptyBindings());
        Assert.assertEquals(2, paramsDep2.length);
    }

    @Test
    public void testMoreSpecificType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType stringType = tf.constructType(String.class);
        JavaType charSeqType = tf.constructType(CharSequence.class);
        JavaType intType = tf.constructType(Integer.class);

        Assert.assertSame(stringType, tf.moreSpecificType(null, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, null));
        Assert.assertNull(tf.moreSpecificType(null, null));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(charSeqType, stringType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, charSeqType));
        Assert.assertSame(stringType, tf.moreSpecificType(stringType, intType));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructType_variousSignatures() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType t1 = tf.constructType(String.class, TypeBindings.emptyBindings());
        Assert.assertEquals(String.class, t1.getRawClass());

        JavaType t2 = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertEquals(List.class, t2.getRawClass());
        Assert.assertEquals(String.class, t2.getContentType().getRawClass());

        JavaType t3 = tf.constructType(String.class, (Class<?>) null);
        Assert.assertEquals(String.class, t3.getRawClass());

        JavaType t4 = tf.constructType(String.class, ArrayList.class);
        Assert.assertEquals(String.class, t4.getRawClass());

        JavaType t5 = tf.constructType(String.class, (JavaType) null);
        Assert.assertEquals(String.class, t5.getRawClass());

        JavaType t6 = tf.constructType(String.class, t2);
        Assert.assertEquals(String.class, t6.getRawClass());
    }

    @Test
    public void testConstructArrayType() {
        TypeFactory tf = TypeFactory.defaultInstance();
        ArrayType a1 = tf.constructArrayType(String.class);
        Assert.assertEquals(String[].class, a1.getRawClass());

        ArrayType a2 = tf.constructArrayType(tf.constructType(Integer.class));
        Assert.assertEquals(Integer[].class, a2.getRawClass());
    }

    @Test
    public void testConstructCollectionTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        CollectionType ct1 = tf.constructCollectionType(ArrayList.class, String.class);
        Assert.assertEquals(ArrayList.class, ct1.getRawClass());
        Assert.assertEquals(String.class, ct1.getContentType().getRawClass());

        CollectionType ct2 = tf.constructCollectionType(ArrayList.class, tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, ct2.getContentType().getRawClass());

        CollectionType rawCt = tf.constructRawCollectionType(ArrayList.class);
        Assert.assertEquals(Object.class, rawCt.getContentType().getRawClass());

        CollectionLikeType clt1 = tf.constructCollectionLikeType(CustomCollectionLikeClass.class, String.class);
        Assert.assertEquals(CustomCollectionLikeClass.class, clt1.getRawClass());

        CollectionLikeType clt2 = tf.constructCollectionLikeType(CustomCollectionLikeClass.class, tf.constructType(String.class));
        Assert.assertEquals(CustomCollectionLikeClass.class, clt2.getRawClass());

        CollectionLikeType rawClt = tf.constructRawCollectionLikeType(CustomCollectionLikeClass.class);
        Assert.assertEquals(CustomCollectionLikeClass.class, rawClt.getRawClass());
    }

    @Test
    public void testConstructMapTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        MapType mt1 = tf.constructMapType(HashMap.class, String.class, Integer.class);
        Assert.assertEquals(HashMap.class, mt1.getRawClass());
        Assert.assertEquals(String.class, mt1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mt1.getContentType().getRawClass());

        MapType mt2 = tf.constructMapType(Properties.class, Object.class, Object.class);
        Assert.assertEquals(String.class, mt2.getKeyType().getRawClass());
        Assert.assertEquals(String.class, mt2.getContentType().getRawClass());

        MapType mt3 = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Integer.class));
        Assert.assertEquals(HashMap.class, mt3.getRawClass());

        MapType rawMt = tf.constructRawMapType(HashMap.class);
        Assert.assertEquals(Object.class, rawMt.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMt.getContentType().getRawClass());

        MapLikeType mlt1 = tf.constructMapLikeType(CustomMapLikeClass.class, String.class, Integer.class);
        Assert.assertEquals(CustomMapLikeClass.class, mlt1.getRawClass());

        MapLikeType mlt2 = tf.constructMapLikeType(CustomMapLikeClass.class, tf.constructType(String.class), tf.constructType(Integer.class));
        Assert.assertEquals(CustomMapLikeClass.class, mlt2.getRawClass());

        MapLikeType rawMlt = tf.constructRawMapLikeType(CustomMapLikeClass.class);
        Assert.assertEquals(CustomMapLikeClass.class, rawMlt.getRawClass());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructSimpleAndParametricTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();

        JavaType st1 = tf.constructSimpleType(String.class, new JavaType[0]);
        Assert.assertEquals(String.class, st1.getRawClass());

        JavaType st2 = tf.constructSimpleType(SingleParam.class, SingleParam.class, new JavaType[]{tf.constructType(String.class)});
        Assert.assertEquals(SingleParam.class, st2.getRawClass());

        JavaType refType = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        Assert.assertEquals(AtomicReference.class, refType.getRawClass());

        JavaType unchk = tf.uncheckedSimpleType(String.class);
        Assert.assertEquals(String.class, unchk.getRawClass());

        JavaType pt1 = tf.constructParametricType(SingleParam.class, String.class);
        Assert.assertEquals(SingleParam.class, pt1.getRawClass());
        Assert.assertEquals(String.class, pt1.containedType(0).getRawClass());

        JavaType pt2 = tf.constructParametricType(SingleParam.class, tf.constructType(String.class));
        Assert.assertEquals(SingleParam.class, pt2.getRawClass());

        JavaType pt3 = tf.constructParametrizedType(SingleParam.class, SingleParam.class, tf.constructType(String.class));
        Assert.assertEquals(SingleParam.class, pt3.getRawClass());

        JavaType pt4 = tf.constructParametrizedType(SingleParam.class, SingleParam.class, String.class);
        Assert.assertEquals(SingleParam.class, pt4.getRawClass());
    }

    @Test
    public void testFromWellKnownTypesAndSpecialParamTypes() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();

        Assert.assertEquals(boolean.class, tf.constructType(boolean.class).getRawClass());
        Assert.assertEquals(int.class, tf.constructType(int.class).getRawClass());
        Assert.assertEquals(long.class, tf.constructType(long.class).getRawClass());
        Assert.assertEquals(String.class, tf.constructType(String.class).getRawClass());
        Assert.assertEquals(Object.class, tf.constructType(Object.class).getRawClass());
        Assert.assertEquals(Properties.class, tf.constructType(Properties.class).getRawClass());
        Assert.assertEquals(Map.class, tf.constructType(Map.class).getRawClass());
        Assert.assertEquals(Collection.class, tf.constructType(Collection.class).getRawClass());
        Assert.assertEquals(AtomicReference.class, tf.constructType(AtomicReference.class).getRawClass());

        Field enumField = GenericHolder.class.getMethod("genericMethod", Object.class).getParameterTypes().getClass().getField("TYPE");
        Assert.assertNotNull(enumField);

        JavaType jt = tf.constructType(tf.constructType(String.class));
        Assert.assertEquals(String.class, jt.getRawClass());
    }

    @Test
    public void testGenericArrayWildcardAndTypeVariables() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();

        Field arrayField = GenericHolder.class.getField("genericArray");
        GenericArrayType gat = (GenericArrayType) arrayField.getGenericType();
        JavaType gatType = tf.constructType(gat);
        Assert.assertTrue(gatType.isArrayType());

        Field wildcardField = GenericHolder.class.getField("wildcardList");
        ParameterizedType ptWildcard = (ParameterizedType) wildcardField.getGenericType();
        WildcardType wt = (WildcardType) ptWildcard.getActualTypeArguments()[0];
        JavaType wtType = tf.constructType(wt);
        Assert.assertEquals(Object.class, wtType.getRawClass());

        Field boundedWildcardField = GenericHolder.class.getField("boundedWildcardList");
        ParameterizedType ptBoundedWildcard = (ParameterizedType) boundedWildcardField.getGenericType();
        WildcardType bwt = (WildcardType) ptBoundedWildcard.getActualTypeArguments()[0];
        JavaType bwtType = tf.constructType(bwt);
        Assert.assertEquals(Number.class, bwtType.getRawClass());

        Method method = GenericHolder.class.getMethod("genericMethod", Object.class);
        TypeVariable<?> tv = method.getTypeParameters()[0];
        JavaType tvType = tf.constructType(tv);
        Assert.assertEquals(Object.class, tvType.getRawClass());
    }

    @Test
    public void testRecursiveTypes() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType jt = tf.constructType(RecursiveClass.class);
        Assert.assertEquals(RecursiveClass.class, jt.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnrecognizedTypeThrowsException() {
        TypeFactory tf = TypeFactory.defaultInstance();
        Type customType = new Type() {
            @Override
            public String getTypeName() {
                return "CustomBogusType";
            }
        };
        tf.constructType(customType);
    }
}
