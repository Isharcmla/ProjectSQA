package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    // --- Helper classes for reflection & generic test cases ---

    public static class StringList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    public static class StringIntMap extends HashMap<String, Integer> {
        private static final long serialVersionUID = 1L;
    }

    public static class NonGenericList extends ArrayList {
        private static final long serialVersionUID = 1L;
    }

    public static class GenericHolder<T> {
        public T single;
        public T[] genericArray;
        public List<? extends Number> wildcardExtends;
        public List<? super Integer> wildcardSuper;
        public List<String> stringList;

        public <E extends Comparable<E>> void genericMethod(E param) {}
    }

    public static class BaseGeneric<A, B> {
        public A fieldA;
        public B fieldB;
    }

    public static class SubGeneric<X> extends BaseGeneric<X, Long> {}

    public static class LeafGeneric extends SubGeneric<Boolean> {}

    public static class CustomMapEntry implements Map.Entry<String, Integer> {
        @Override
        public String getKey() { return "key"; }
        @Override
        public Integer getValue() { return 1; }
        @Override
        public Integer setValue(Integer value) { return value; }
    }

    public static class RawMapEntry implements Map.Entry {
        @Override
        public Object getKey() { return null; }
        @Override
        public Object getValue() { return null; }
        @Override
        public Object setValue(Object value) { return null; }
    }

    public enum SampleEnum {
        ONE, TWO
    }

    public static class CustomType implements Type {
        @Override
        public String getTypeName() {
            return "CustomType";
        }
    }

    public static class DummyCollectionLike<T> {}

    public static class DummyMapLike<K, V> {}

    // --- Life-cycle & Cache tests ---

    @Test
    public void testDefaultInstance_always_returnsNonNullSingleton() {
        TypeFactory instance = TypeFactory.defaultInstance();
        Assert.assertNotNull(instance);
        Assert.assertSame(instance, TypeFactory.defaultInstance());
    }

    @Test
    public void testClearCache_always_succeeds() {
        tf.constructType(String.class);
        tf.clearCache();
        Assert.assertEquals(0, tf._typeCache.size());
    }

    @Test
    public void testWithModifier_nullModifier_returnsSameConfigurationCopy() {
        TypeFactory customTf = tf.withModifier(null);
        Assert.assertNotNull(customTf);
        Assert.assertNull(customTf._modifiers);
    }

    @Test
    public void testWithModifier_validModifiers_appliesSuccessfully() {
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

        TypeFactory tfWith1 = tf.withModifier(mod1);
        Assert.assertNotNull(tfWith1._modifiers);
        Assert.assertEquals(1, tfWith1._modifiers.length);

        TypeFactory tfWith2 = tfWith1.withModifier(mod2);
        Assert.assertEquals(2, tfWith2._modifiers.length);

        // Duplicate modifier should not be added twice
        TypeFactory tfWithDup = tfWith2.withModifier(mod1);
        Assert.assertEquals(2, tfWithDup._modifiers.length);
    }

    // --- Static Utility methods ---

    @Test
    public void testUnknownType_always_returnsObjectSimpleType() {
        JavaType unknown = TypeFactory.unknownType();
        Assert.assertNotNull(unknown);
        Assert.assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClass_withClass_returnsSameClass() {
        Class<?> clazz = TypeFactory.rawClass(String.class);
        Assert.assertEquals(String.class, clazz);
    }

    @Test
    public void testRawClass_withParameterizedType_returnsRawClass() throws Exception {
        Field field = GenericHolder.class.getField("stringList");
        Class<?> clazz = TypeFactory.rawClass(field.getGenericType());
        Assert.assertEquals(List.class, clazz);
    }

    // --- Specialized and Canonical Type construction ---

    @Test
    public void testConstructSpecializedType_sameRawClass_returnsSameType() {
        JavaType base = tf.constructType(Number.class);
        JavaType specialized = tf.constructSpecializedType(base, Number.class);
        Assert.assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_simpleTypeToCollectionAndMapAndArray_returnsSpecialized() {
        JavaType baseObj = tf.constructType(Object.class);

        JavaType specializedList = tf.constructSpecializedType(baseObj, ArrayList.class);
        Assert.assertTrue(specializedList.isCollectionLikeType());
        Assert.assertEquals(ArrayList.class, specializedList.getRawClass());

        JavaType specializedMap = tf.constructSpecializedType(baseObj, HashMap.class);
        Assert.assertTrue(specializedMap.isMapLikeType());
        Assert.assertEquals(HashMap.class, specializedMap.getRawClass());

        JavaType specializedArr = tf.constructSpecializedType(baseObj, String[].class);
        Assert.assertTrue(specializedArr.isArrayType());
        Assert.assertEquals(String[].class, specializedArr.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_withHandlers_preservesHandlers() {
        JavaType baseObj = tf.constructType(Object.class).withValueHandler("valH").withTypeHandler("typeH");
        JavaType specialized = tf.constructSpecializedType(baseObj, ArrayList.class);
        Assert.assertEquals("valH", specialized.getValueHandler());
        Assert.assertEquals("typeH", specialized.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_incompatibleTarget_throwsException() {
        JavaType baseList = tf.constructType(List.class);
        tf.constructSpecializedType(baseList, Set.class);
    }

    @Test
    public void testConstructSpecializedType_regularNarrowing_narrowsSuccessfully() {
        JavaType base = tf.constructType(Number.class);
        JavaType specialized = tf.constructSpecializedType(base, Integer.class);
        Assert.assertEquals(Integer.class, specialized.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_validStrings_parsesSuccessfully() {
        JavaType strType = tf.constructFromCanonical("java.lang.String");
        Assert.assertEquals(String.class, strType.getRawClass());

        JavaType mapType = tf.constructFromCanonical("java.util.HashMap<java.lang.String,java.lang.Integer>");
        Assert.assertTrue(mapType.isMapLikeType());
        Assert.assertEquals(String.class, mapType.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, mapType.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformedString_throwsException() {
        tf.constructFromCanonical("java.util.List<broken");
    }

    // --- Type parameter finding methods ---

    @Test
    public void testFindTypeParameters_directParameterSource_returnsParameters() {
        JavaType mapType = tf.constructParametricType(Map.class, String.class, Integer.class);
        JavaType[] params = tf.findTypeParameters(mapType, Map.class);
        Assert.assertNotNull(params);
        Assert.assertEquals(2, params.length);
        Assert.assertEquals(String.class, params[0].getRawClass());
        Assert.assertEquals(Integer.class, params[1].getRawClass());

        JavaType simpleType = tf.constructType(String.class);
        Assert.assertNull(tf.findTypeParameters(simpleType, String.class));
    }

    @Test
    public void testFindTypeParameters_classSubtypes_resolvesHierarchy() {
        JavaType[] listParams = tf.findTypeParameters(StringList.class, List.class);
        Assert.assertNotNull(listParams);
        Assert.assertEquals(1, listParams.length);
        Assert.assertEquals(String.class, listParams[0].getRawClass());

        JavaType[] mapParams = tf.findTypeParameters(StringIntMap.class, Map.class);
        Assert.assertNotNull(mapParams);
        Assert.assertEquals(2, mapParams.length);
        Assert.assertEquals(String.class, mapParams[0].getRawClass());
        Assert.assertEquals(Integer.class, mapParams[1].getRawClass());

        JavaType[] chainedParams = tf.findTypeParameters(LeafGeneric.class, BaseGeneric.class);
        Assert.assertNotNull(chainedParams);
        Assert.assertEquals(2, chainedParams.length);
        Assert.assertEquals(Boolean.class, chainedParams[0].getRawClass());
        Assert.assertEquals(Long.class, chainedParams[1].getRawClass());

        JavaType[] nonGenParams = tf.findTypeParameters(NonGenericList.class, List.class);
        Assert.assertNull(nonGenParams);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParameters_notSubtype_throwsException() {
        tf.findTypeParameters(String.class, List.class);
    }

    // --- More specific type resolution ---

    @Test
    public void testMoreSpecificType_variousConditions_resolvesCorrectly() {
        JavaType str = tf.constructType(String.class);
        JavaType num = tf.constructType(Number.class);
        JavaType integer = tf.constructType(Integer.class);

        Assert.assertSame(str, tf.moreSpecificType(null, str));
        Assert.assertSame(str, tf.moreSpecificType(str, null));
        Assert.assertSame(str, tf.moreSpecificType(str, str));
        Assert.assertSame(integer, tf.moreSpecificType(num, integer));
        Assert.assertSame(integer, tf.moreSpecificType(integer, num));
        Assert.assertSame(str, tf.moreSpecificType(str, num));
    }

    // --- constructType variations ---

    @Test
    public void testConstructType_typeReference_resolvesCorrectly() {
        JavaType type = tf.constructType(new TypeReference<List<String>>() {});
        Assert.assertTrue(type.isCollectionLikeType());
        Assert.assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_withClassContext_resolvesCorrectly() throws Exception {
        Field f = GenericHolder.class.getField("single");
        JavaType typeWithContext = tf.constructType(f.getGenericType(), GenericHolder.class);
        Assert.assertEquals(Object.class, typeWithContext.getRawClass());

        JavaType typeNullContext = tf.constructType(f.getGenericType(), (Class<?>) null);
        Assert.assertEquals(Object.class, typeNullContext.getRawClass());
    }

    @Test
    public void testConstructType_withJavaTypeContext_resolvesCorrectly() throws Exception {
        Field f = GenericHolder.class.getField("single");
        JavaType context = tf.constructParametricType(GenericHolder.class, String.class);
        JavaType resolved = tf.constructType(f.getGenericType(), context);
        Assert.assertEquals(String.class, resolved.getRawClass());

        JavaType resolvedNull = tf.constructType(f.getGenericType(), (JavaType) null);
        Assert.assertEquals(Object.class, resolvedNull.getRawClass());
    }

    @Test
    public void testConstructType_primitivesAndCoreTypes_returnsCachedCoreInstances() {
        Assert.assertSame(TypeFactory.CORE_TYPE_STRING, tf.constructType(String.class));
        Assert.assertSame(TypeFactory.CORE_TYPE_BOOL, tf.constructType(Boolean.TYPE));
        Assert.assertSame(TypeFactory.CORE_TYPE_INT, tf.constructType(Integer.TYPE));
        Assert.assertSame(TypeFactory.CORE_TYPE_LONG, tf.constructType(Long.TYPE));
    }

    @Test
    public void testConstructType_javaTypeInput_returnsSameJavaType() {
        JavaType type = tf.constructType(String.class);
        Assert.assertSame(type, tf.constructType(type));
    }

    @Test
    public void testConstructType_enumAndArrayAndMapEntry_resolvesCorrectly() {
        JavaType enumType = tf.constructType(SampleEnum.class);
        Assert.assertTrue(enumType.isEnumType());

        JavaType arrayType = tf.constructType(int[].class);
        Assert.assertTrue(arrayType.isArrayType());

        JavaType customEntry = tf.constructType(CustomMapEntry.class);
        Assert.assertEquals(2, customEntry.containedTypeCount());
        Assert.assertEquals(String.class, customEntry.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, customEntry.containedType(1).getRawClass());

        JavaType rawEntry = tf.constructType(RawMapEntry.class);
        Assert.assertEquals(2, rawEntry.containedTypeCount());
        Assert.assertEquals(Object.class, rawEntry.containedType(0).getRawClass());
    }

    @Test
    public void testConstructType_reflectionTypes_genericArrayWildcardTypeVariable() throws Exception {
        Field arrField = GenericHolder.class.getField("genericArray");
        JavaType arrType = tf.constructType(arrField.getGenericType(), new TypeBindings(tf, tf.constructParametricType(GenericHolder.class, String.class)));
        Assert.assertTrue(arrType.isArrayType());
        Assert.assertEquals(String.class, arrType.getContentType().getRawClass());

        Field wildExtends = GenericHolder.class.getField("wildcardExtends");
        JavaType wildExtendsType = tf.constructType(wildExtends.getGenericType());
        Assert.assertTrue(wildExtendsType.isCollectionLikeType());
        Assert.assertEquals(Number.class, wildExtendsType.getContentType().getRawClass());

        Field wildSuper = GenericHolder.class.getField("wildcardSuper");
        JavaType wildSuperType = tf.constructType(wildSuper.getGenericType());
        Assert.assertTrue(wildSuperType.isCollectionLikeType());
        Assert.assertEquals(Object.class, wildSuperType.getContentType().getRawClass());

        Method method = GenericHolder.class.getMethod("genericMethod", Comparable.class);
        JavaType varType = tf.constructType(method.getGenericParameterTypes()[0]);
        Assert.assertEquals(Comparable.class, varType.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType_throwsException() {
        tf.constructType(new CustomType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_nullType_throwsException() {
        tf.constructType((Type) null);
    }

    @Test
    public void testConstructType_withTypeModifier_modifiesSimpleType() {
        TypeModifier modifier = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                if (type.getRawClass() == Integer.class) {
                    return typeFactory.constructType(Long.class);
                }
                return type;
            }
        };
        TypeFactory customTf = tf.withModifier(modifier);
        JavaType type = customTf.constructType(Integer.class);
        Assert.assertEquals(Long.class, type.getRawClass());
    }

    // --- Direct factory methods for arrays, collections, maps ---

    @Test
    public void testConstructArrayType_byClassAndJavaType() {
        ArrayType arr1 = tf.constructArrayType(String.class);
        Assert.assertEquals(String.class, arr1.getContentType().getRawClass());

        ArrayType arr2 = tf.constructArrayType(tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, arr2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_byClassAndJavaType() {
        CollectionType col1 = tf.constructCollectionType(List.class, String.class);
        Assert.assertEquals(String.class, col1.getContentType().getRawClass());

        CollectionType col2 = tf.constructCollectionType(Set.class, tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, col2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_byClassAndJavaType() {
        CollectionLikeType col1 = tf.constructCollectionLikeType(DummyCollectionLike.class, String.class);
        Assert.assertEquals(String.class, col1.getContentType().getRawClass());

        CollectionLikeType col2 = tf.constructCollectionLikeType(DummyCollectionLike.class, tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, col2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_byClassAndJavaType() {
        MapType map1 = tf.constructMapType(Map.class, String.class, Integer.class);
        Assert.assertEquals(String.class, map1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, map1.getContentType().getRawClass());

        MapType map2 = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Double.class));
        Assert.assertEquals(String.class, map2.getKeyType().getRawClass());
        Assert.assertEquals(Double.class, map2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType_byClassAndJavaType() {
        MapLikeType map1 = tf.constructMapLikeType(DummyMapLike.class, String.class, Integer.class);
        Assert.assertEquals(String.class, map1.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, map1.getContentType().getRawClass());

        MapLikeType map2 = tf.constructMapLikeType(DummyMapLike.class, tf.constructType(String.class), tf.constructType(Double.class));
        Assert.assertEquals(String.class, map2.getKeyType().getRawClass());
        Assert.assertEquals(Double.class, map2.getContentType().getRawClass());
    }

    // --- Simple and Parametric construction tests ---

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructSimpleType_deprecatedVariant_succeeds() {
        JavaType jt = tf.constructSimpleType(BaseGeneric.class, new JavaType[] {
                tf.constructType(String.class), tf.constructType(Integer.class)
        });
        Assert.assertEquals(2, jt.containedTypeCount());
        Assert.assertEquals(String.class, jt.containedType(0).getRawClass());
        Assert.assertEquals(Integer.class, jt.containedType(1).getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_paramCountMismatch_throwsException() {
        tf.constructSimpleType(BaseGeneric.class, BaseGeneric.class, new JavaType[] {
                tf.constructType(String.class)
        });
    }

    @Test
    public void testUncheckedSimpleType_always_returnsSimpleTypeDirectly() {
        JavaType jt = tf.uncheckedSimpleType(List.class);
        Assert.assertTrue(jt instanceof SimpleType);
        Assert.assertEquals(List.class, jt.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_arrayCollectionMapSimpleTypes() {
        JavaType arr = tf.constructParametrizedType(String[].class, String[].class, String.class);
        Assert.assertTrue(arr.isArrayType());

        JavaType list = tf.constructParametrizedType(ArrayList.class, ArrayList.class, String.class);
        Assert.assertTrue(list.isCollectionLikeType());
        Assert.assertEquals(String.class, list.getContentType().getRawClass());

        JavaType map = tf.constructParametrizedType(HashMap.class, HashMap.class, String.class, Integer.class);
        Assert.assertTrue(map.isMapLikeType());
        Assert.assertEquals(String.class, map.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, map.getContentType().getRawClass());

        JavaType simple = tf.constructParametrizedType(BaseGeneric.class, BaseGeneric.class, String.class, Boolean.class);
        Assert.assertEquals(2, simple.containedTypeCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_arrayWithInvalidCount_throwsException() {
        tf.constructParametrizedType(String[].class, String[].class, String.class, Integer.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_collectionWithInvalidCount_throwsException() {
        tf.constructParametrizedType(ArrayList.class, ArrayList.class, String.class, Integer.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_mapWithInvalidCount_throwsException() {
        tf.constructParametrizedType(HashMap.class, HashMap.class, String.class);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructParametricType_deprecatedVariants_succeed() {
        JavaType list1 = tf.constructParametricType(ArrayList.class, String.class);
        Assert.assertEquals(String.class, list1.getContentType().getRawClass());

        JavaType list2 = tf.constructParametricType(ArrayList.class, tf.constructType(Integer.class));
        Assert.assertEquals(Integer.class, list2.getContentType().getRawClass());
    }

    // --- Raw variants construction ---

    @Test
    public void testRawVariants_allConstructCorrectTypes() {
        CollectionType rawCol = tf.constructRawCollectionType(ArrayList.class);
        Assert.assertEquals(Object.class, rawCol.getContentType().getRawClass());

        CollectionLikeType rawColLike = tf.constructRawCollectionLikeType(DummyCollectionLike.class);
        Assert.assertEquals(Object.class, rawColLike.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(HashMap.class);
        Assert.assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMap.getContentType().getRawClass());

        MapLikeType rawMapLike = tf.constructRawMapLikeType(DummyMapLike.class);
        Assert.assertEquals(Object.class, rawMapLike.getKeyType().getRawClass());
        Assert.assertEquals(Object.class, rawMapLike.getContentType().getRawClass());
    }

    // --- Internal branch & helper tests ---

    @Test
    public void testFromParameterizedClass_variousCombinations() {
        List<JavaType> emptyList = new ArrayList<JavaType>();
        List<JavaType> singleList = new ArrayList<JavaType>();
        singleList.add(tf.constructType(String.class));

        List<JavaType> doubleList = new ArrayList<JavaType>();
        doubleList.add(tf.constructType(String.class));
        doubleList.add(tf.constructType(Integer.class));

        JavaType arr = tf._fromParameterizedClass(String[].class, singleList);
        Assert.assertTrue(arr.isArrayType());

        JavaType en = tf._fromParameterizedClass(SampleEnum.class, singleList);
        Assert.assertTrue(en.isEnumType());

        JavaType mapEmpty = tf._fromParameterizedClass(HashMap.class, emptyList);
        Assert.assertTrue(mapEmpty.isMapLikeType());

        JavaType mapSingle = tf._fromParameterizedClass(HashMap.class, singleList);
        Assert.assertTrue(mapSingle.isMapLikeType());
        Assert.assertEquals(Object.class, mapSingle.getContentType().getRawClass());

        JavaType mapDouble = tf._fromParameterizedClass(HashMap.class, doubleList);
        Assert.assertEquals(Integer.class, mapDouble.getContentType().getRawClass());

        JavaType colEmpty = tf._fromParameterizedClass(ArrayList.class, emptyList);
        Assert.assertTrue(colEmpty.isCollectionLikeType());

        JavaType colSingle = tf._fromParameterizedClass(ArrayList.class, singleList);
        Assert.assertTrue(colSingle.isCollectionLikeType());

        JavaType nonGenEmpty = tf._fromParameterizedClass(String.class, emptyList);
        Assert.assertEquals(String.class, nonGenEmpty.getRawClass());

        JavaType customGen = tf._fromParameterizedClass(BaseGeneric.class, doubleList);
        Assert.assertEquals(2, customGen.containedTypeCount());
    }

    @Test
    public void testFromParamType_edgeCases() throws Exception {
        Field f = GenericHolder.class.getField("stringList");
        ParameterizedType pt = (ParameterizedType) f.getGenericType();
        JavaType jt = tf._fromParamType(pt, null);
        Assert.assertTrue(jt.isCollectionLikeType());

        ParameterizedType dummyNoArgs = new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() { return new Type[0]; }
            @Override
            public Type getRawType() { return String.class; }
            @Override
            public Type getOwnerType() { return null; }
        };
        JavaType noArgsType = tf._fromParamType(dummyNoArgs, null);
        Assert.assertEquals(String.class, noArgsType.getRawClass());
    }

    @Test
    public void testHierarchyChainCaching_hitMultipleTimes() {
        // Trigger and verify HashMap & ArrayList fast-path hierarchy caching
        HierarchicType htMap1 = tf._findSuperTypeChain(HashMap.class, Map.class);
        HierarchicType htMap2 = tf._findSuperTypeChain(HashMap.class, Map.class);
        Assert.assertNotNull(htMap1);
        Assert.assertNotNull(htMap2);

        HierarchicType htList1 = tf._findSuperTypeChain(ArrayList.class, List.class);
        HierarchicType htList2 = tf._findSuperTypeChain(ArrayList.class, List.class);
        Assert.assertNotNull(htList1);
        Assert.assertNotNull(htList2);
    }

    @Test
    public void testResolveVariableViaSubTypes_resolvesCorrectly() {
        HierarchicType leaf = tf._findSuperTypeChain(LeafGeneric.class, BaseGeneric.class);
        TypeBindings bindings = new TypeBindings(tf, LeafGeneric.class);

        JavaType resolvedA = tf._resolveVariableViaSubTypes(leaf, "A", bindings);
        Assert.assertNotNull(resolvedA);

        JavaType unresolved = tf._resolveVariableViaSubTypes(null, "NonExistent", bindings);
        Assert.assertEquals(Object.class, unresolved.getRawClass());
    }
}
