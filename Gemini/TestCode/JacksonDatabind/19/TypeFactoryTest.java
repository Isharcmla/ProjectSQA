package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory tf;

    @Before
    public void setUp() {
        tf = TypeFactory.defaultInstance();
        tf.clearCache();
    }

    // Helper classes for testing
    static class CustomMap<K, V> extends HashMap<K, V> {
        private static final long serialVersionUID = 1L;
    }

    static class StringIntMap extends HashMap<String, Integer> {
        private static final long serialVersionUID = 1L;
    }

    static class StringList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    static class NonGenericSuper {}
    static class NonGenericSub extends NonGenericSuper {}

    static class GenericHolder<T> {
        public T genericField;
        public T[] genericArrayField;
        public List<? extends Number> wildcardField;
        public List<? super Integer> superWildcardField;
        public List<T> listField;
    }

    static class RecursiveHolder<T extends Comparable<T>> {
        public T recursiveField;
    }

    static class CustomAtomic<T> extends AtomicReference<T> {
        private static final long serialVersionUID = 1L;
    }

    static class CustomEntry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;
        public CustomEntry(K k, V v) { this.key = k; this.value = v; }
        @Override public K getKey() { return key; }
        @Override public V getValue() { return value; }
        @Override public V setValue(V value) { this.value = value; return value; }
    }

    static class RawEntry implements Map.Entry {
        @Override public Object getKey() { return null; }
        @Override public Object getValue() { return null; }
        @Override public Object setValue(Object value) { return null; }
    }

    static class NestedGeneric<A, B> {
        public Map<A, List<B>> map;
    }

    static class MultiBoundHolder<T extends Number & Comparable<T>> {
        public T field;
    }

    enum TestEnum { A, B }

    // ==========================================
    // 1. Singleton & Lifecycle
    // ==========================================

    @Test
    public void testDefaultInstance_notNull() {
        TypeFactory instance = TypeFactory.defaultInstance();
        assertNotNull(instance);
        assertSame(TypeFactory.instance, instance);
    }

    @Test
    public void testClearCache_clearsEntries() {
        tf.constructType(String.class);
        tf.constructType(Integer.class);
        assertEquals(2, tf._typeCache.size());
        tf.clearCache();
        assertEquals(0, tf._typeCache.size());
    }

    @Test
    public void testWithModifier_nullModifier_returnsSameOrEquivalent() {
        TypeFactory custom = tf.withModifier(null);
        assertNotNull(custom);
    }

    @Test
    public void testWithModifier_singleAndMultipleModifiers() {
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
        assertNotNull(tfWithOne);
        assertNotNull(tfWithOne._modifiers);
        assertEquals(1, tfWithOne._modifiers.length);

        TypeFactory tfWithTwo = tfWithOne.withModifier(mod2);
        assertNotNull(tfWithTwo);
        assertEquals(2, tfWithTwo._modifiers.length);
    }

    // ==========================================
    // 2. Static Methods
    // ==========================================

    @Test
    public void testUnknownType_returnsObjectType() {
        JavaType unknown = TypeFactory.unknownType();
        assertNotNull(unknown);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testRawClass_withClassAndType() throws Exception {
        assertEquals(String.class, TypeFactory.rawClass(String.class));

        Field field = GenericHolder.class.getField("listField");
        Type genericType = field.getGenericType();
        assertEquals(List.class, TypeFactory.rawClass(genericType));
    }

    // ==========================================
    // 3. constructSpecializedType
    // ==========================================

    @Test
    public void testConstructSpecializedType_sameClass_returnsBaseType() {
        JavaType base = tf.constructType(List.class);
        JavaType specialized = tf.constructSpecializedType(base, List.class);
        assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_simpleToArrayMapCollection() {
        JavaType objType = tf.constructType(Object.class);

        JavaType arraySpecialized = tf.constructSpecializedType(objType, String[].class);
        assertTrue(arraySpecialized.isArrayType());
        assertEquals(String[].class, arraySpecialized.getRawClass());

        JavaType mapSpecialized = tf.constructSpecializedType(objType, HashMap.class);
        assertTrue(mapSpecialized.isMapLikeType());
        assertEquals(HashMap.class, mapSpecialized.getRawClass());

        JavaType listSpecialized = tf.constructSpecializedType(objType, ArrayList.class);
        assertTrue(listSpecialized.isCollectionLikeType());
        assertEquals(ArrayList.class, listSpecialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_withHandlersPreserved() {
        JavaType base = tf.constructType(Object.class).withValueHandler("vh").withTypeHandler("th");
        JavaType specialized = tf.constructSpecializedType(base, ArrayList.class);

        assertEquals("vh", specialized.getValueHandler());
        assertEquals("th", specialized.getTypeHandler());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_invalidSubtype_throwsException() {
        JavaType stringType = tf.constructType(String.class);
        tf.constructSpecializedType(stringType, ArrayList.class);
    }

    @Test
    public void testConstructSpecializedType_narrowBy() {
        JavaType superType = tf.constructType(NonGenericSuper.class);
        JavaType subType = tf.constructSpecializedType(superType, NonGenericSub.class);
        assertEquals(NonGenericSub.class, subType.getRawClass());
    }

    // ==========================================
    // 4. constructFromCanonical
    // ==========================================

    @Test
    public void testConstructFromCanonical_valid() {
        JavaType type = tf.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());

        JavaType listType = tf.constructFromCanonical("java.util.List<java.lang.Integer>");
        assertEquals(List.class, listType.getRawClass());
        assertEquals(Integer.class, listType.getContentType().getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_invalid_throwsException() {
        tf.constructFromCanonical("com.nonexistent.ClassDoesNotExist");
    }

    // ==========================================
    // 5. findTypeParameters
    // ==========================================

    @Test
    public void testFindTypeParameters_withDirectTypeInfo() {
        JavaType mapType = tf.constructParametrizedType(HashMap.class, HashMap.class, String.class, Integer.class);
        JavaType[] params = tf.findTypeParameters(mapType, HashMap.class);
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());

        JavaType rawMapType = tf.constructType(HashMap.class);
        JavaType[] noParams = tf.findTypeParameters(rawMapType, HashMap.class);
        assertNull(noParams);
    }

    @Test
    public void testFindTypeParameters_inheritanceChain() {
        JavaType[] paramsMap = tf.findTypeParameters(StringIntMap.class, Map.class);
        assertNotNull(paramsMap);
        assertEquals(2, paramsMap.length);
        assertEquals(String.class, paramsMap[0].getRawClass());
        assertEquals(Integer.class, paramsMap[1].getRawClass());

        JavaType[] paramsList = tf.findTypeParameters(StringList.class, List.class);
        assertNotNull(paramsList);
        assertEquals(1, paramsList.length);
        assertEquals(String.class, paramsList[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_nonGenericSuperType_returnsNull() {
        JavaType[] params = tf.findTypeParameters(NonGenericSub.class, NonGenericSuper.class);
        assertNull(params);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParameters_notSubtype_throwsException() {
        tf.findTypeParameters(String.class, List.class);
    }

    // ==========================================
    // 6. moreSpecificType
    // ==========================================

    @Test
    public void testMoreSpecificType() {
        JavaType strType = tf.constructType(String.class);
        JavaType objType = tf.constructType(Object.class);
        JavaType intType = tf.constructType(Integer.class);

        assertSame(strType, tf.moreSpecificType(strType, null));
        assertSame(strType, tf.moreSpecificType(null, strType));
        assertSame(strType, tf.moreSpecificType(strType, strType));

        // Object vs String -> String is more specific
        assertSame(strType, tf.moreSpecificType(objType, strType));
        assertSame(strType, tf.moreSpecificType(strType, objType));

        // Unrelated types -> primary is returned
        assertSame(strType, tf.moreSpecificType(strType, intType));
    }

    // ==========================================
    // 7. constructType Overloads
    // ==========================================

    @Test
    public void testConstructType_withTypeReference() {
        JavaType type = tf.constructType(new TypeReference<List<String>>() {});
        assertTrue(type.isCollectionLikeType());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_withClassContext() {
        JavaType type1 = tf.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, type1.getRawClass());

        JavaType type2 = tf.constructType(String.class, List.class);
        assertEquals(String.class, type2.getRawClass());
    }

    @Test
    public void testConstructType_withJavaTypeContext() {
        JavaType ctx = tf.constructType(List.class);
        JavaType type1 = tf.constructType(String.class, (JavaType) null);
        assertEquals(String.class, type1.getRawClass());

        JavaType type2 = tf.constructType(String.class, ctx);
        assertEquals(String.class, type2.getRawClass());
    }

    @Test
    public void testConstructType_javaTypePassThrough() {
        JavaType custom = tf.constructType(String.class);
        assertSame(custom, tf.constructType(custom));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType_throwsException() {
        tf._constructType(null, null);
    }

    // ==========================================
    // 8. Direct Factory Methods (Array, Collection, Map, Reference, etc.)
    // ==========================================

    @Test
    public void testConstructArrayType() {
        ArrayType arr1 = tf.constructArrayType(String.class);
        assertEquals(String.class, arr1.getContentType().getRawClass());

        ArrayType arr2 = tf.constructArrayType(arr1.getContentType());
        assertEquals(String.class, arr2.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_andCollectionLikeType() {
        CollectionType col1 = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, col1.getRawClass());
        assertEquals(String.class, col1.getContentType().getRawClass());

        CollectionType col2 = tf.constructCollectionType(ArrayList.class, tf.constructType(Integer.class));
        assertEquals(Integer.class, col2.getContentType().getRawClass());

        CollectionLikeType colLike1 = tf.constructCollectionLikeType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, colLike1.getRawClass());
        assertEquals(String.class, colLike1.getContentType().getRawClass());

        CollectionLikeType colLike2 = tf.constructCollectionLikeType(ArrayList.class, tf.constructType(Integer.class));
        assertEquals(Integer.class, colLike2.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_andMapLikeType() {
        MapType map1 = tf.constructMapType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, map1.getKeyType().getRawClass());
        assertEquals(Integer.class, map1.getContentType().getRawClass());

        MapType map2 = tf.constructMapType(HashMap.class, tf.constructType(String.class), tf.constructType(Integer.class));
        assertEquals(String.class, map2.getKeyType().getRawClass());
        assertEquals(Integer.class, map2.getContentType().getRawClass());

        MapLikeType mapLike1 = tf.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertEquals(String.class, mapLike1.getKeyType().getRawClass());
        assertEquals(Integer.class, mapLike1.getContentType().getRawClass());

        MapLikeType mapLike2 = tf.constructMapLikeType(HashMap.class, tf.constructType(String.class), tf.constructType(Integer.class));
        assertEquals(String.class, mapLike2.getKeyType().getRawClass());
        assertEquals(Integer.class, mapLike2.getContentType().getRawClass());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructSimpleType_deprecatedAndTarget() {
        JavaType[] pt = new JavaType[] { tf.constructType(String.class) };
        JavaType type = tf.constructSimpleType(ArrayList.class, pt);
        assertEquals(ArrayList.class, type.getRawClass());

        JavaType type2 = tf.constructSimpleType(ArrayList.class, ArrayList.class, pt);
        assertEquals(ArrayList.class, type2.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_paramMismatch_throwsException() {
        JavaType[] pt = new JavaType[] { tf.constructType(String.class) };
        // HashMap requires 2 parameters, passing 1
        tf.constructSimpleType(HashMap.class, HashMap.class, pt);
    }

    @Test
    public void testConstructReferenceType() {
        JavaType ref = tf.constructReferenceType(AtomicReference.class, tf.constructType(String.class));
        assertTrue(ref instanceof ReferenceType);
        assertEquals(AtomicReference.class, ref.getRawClass());
        assertEquals(String.class, ref.getContentType().getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() {
        JavaType simple = tf.uncheckedSimpleType(String.class);
        assertTrue(simple instanceof SimpleType);
        assertEquals(String.class, simple.getRawClass());
    }

    // ==========================================
    // 9. constructParametrizedType and constructParametricType
    // ==========================================

    @Test
    public void testConstructParametrizedType_validTypes() {
        JavaType arr = tf.constructParametrizedType(String[].class, String[].class, String.class);
        assertTrue(arr.isArrayType());

        JavaType map = tf.constructParametrizedType(HashMap.class, HashMap.class, String.class, Integer.class);
        assertTrue(map.isMapLikeType());

        JavaType col = tf.constructParametrizedType(ArrayList.class, ArrayList.class, String.class);
        assertTrue(col.isCollectionLikeType());

        JavaType simple = tf.constructParametrizedType(CustomAtomic.class, CustomAtomic.class, String.class);
        assertNotNull(simple);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_arrayMismatch_throwsException() {
        tf.constructParametrizedType(String[].class, String[].class, String.class, Integer.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_mapMismatch_throwsException() {
        tf.constructParametrizedType(HashMap.class, HashMap.class, String.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_collectionMismatch_throwsException() {
        tf.constructParametrizedType(ArrayList.class, ArrayList.class, String.class, Integer.class);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructParametricType_deprecatedVariants() {
        JavaType type1 = tf.constructParametricType(ArrayList.class, String.class);
        assertEquals(ArrayList.class, type1.getRawClass());

        JavaType type2 = tf.constructParametricType(ArrayList.class, tf.constructType(String.class));
        assertEquals(ArrayList.class, type2.getRawClass());
    }

    // ==========================================
    // 10. Raw Variants
    // ==========================================

    @Test
    public void testConstructRawVariants() {
        CollectionType rawCol = tf.constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, rawCol.getContentType().getRawClass());

        CollectionLikeType rawColLike = tf.constructRawCollectionLikeType(ArrayList.class);
        assertEquals(Object.class, rawColLike.getContentType().getRawClass());

        MapType rawMap = tf.constructRawMapType(HashMap.class);
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());

        MapLikeType rawMapLike = tf.constructRawMapLikeType(HashMap.class);
        assertEquals(Object.class, rawMapLike.getKeyType().getRawClass());
        assertEquals(Object.class, rawMapLike.getContentType().getRawClass());
    }

    // ==========================================
    // 11. Internal / Core Type Resolution (_fromClass, _fromParamType, etc.)
    // ==========================================

    @Test
    public void testConstructType_corePrimitivesAndBasic() {
        assertSame(TypeFactory.CORE_TYPE_STRING, tf.constructType(String.class));
        assertSame(TypeFactory.CORE_TYPE_BOOL, tf.constructType(Boolean.TYPE));
        assertSame(TypeFactory.CORE_TYPE_INT, tf.constructType(Integer.TYPE));
        assertSame(TypeFactory.CORE_TYPE_LONG, tf.constructType(Long.TYPE));

        // Test cache hit
        JavaType t1 = tf.constructType(Double.class);
        JavaType t2 = tf.constructType(Double.class);
        assertSame(t1, t2);
    }

    @Test
    public void testConstructType_enums() {
        JavaType enumType = tf.constructType(TestEnum.class);
        assertTrue(enumType.isEnumType());
    }

    @Test
    public void testConstructType_atomicReference() {
        JavaType refType = tf.constructType(AtomicReference.class);
        assertEquals(AtomicReference.class, refType.getRawClass());

        JavaType customRef = tf.constructType(new TypeReference<CustomAtomic<String>>() {});
        assertEquals(CustomAtomic.class, customRef.getRawClass());
        assertEquals(String.class, customRef.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_mapEntry() {
        JavaType entryType = tf.constructType(Map.Entry.class);
        assertEquals(Map.Entry.class, entryType.getRawClass());

        JavaType customEntry = tf.constructType(new TypeReference<CustomEntry<String, Integer>>() {});
        assertEquals(CustomEntry.class, customEntry.getRawClass());
        assertEquals(String.class, customEntry.containedType(0).getRawClass());
        assertEquals(Integer.class, customEntry.containedType(1).getRawClass());

        JavaType rawEntry = tf.constructType(RawEntry.class);
        assertEquals(RawEntry.class, rawEntry.getRawClass());
    }

    @Test
    public void testConstructType_genericArrayAndWildcardAndTypeVariable() throws Exception {
        Field genField = GenericHolder.class.getField("genericField");
        Field arrField = GenericHolder.class.getField("genericArrayField");
        Field wildField = GenericHolder.class.getField("wildcardField");
        Field superWildField = GenericHolder.class.getField("superWildcardField");

        TypeBindings bindings = new TypeBindings(tf, GenericHolder.class);
        bindings.addBinding("T", tf.constructType(String.class));

        // Generic field
        JavaType genType = tf._constructType(genField.getGenericType(), bindings);
        assertEquals(String.class, genType.getRawClass());

        // Generic array field
        JavaType arrType = tf._constructType(arrField.getGenericType(), bindings);
        assertTrue(arrType.isArrayType());
        assertEquals(String.class, arrType.getContentType().getRawClass());

        // Wildcard <? extends Number>
        JavaType wildType = tf._constructType(wildField.getGenericType(), bindings);
        assertEquals(Number.class, wildType.getContentType().getRawClass());

        // Wildcard <? super Integer>
        JavaType superWildType = tf._constructType(superWildField.getGenericType(), bindings);
        assertEquals(Object.class, superWildType.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_typeVariableWithoutContext_resolvesBounds() throws Exception {
        Field genField = GenericHolder.class.getField("genericField");
        JavaType genType = tf._constructType(genField.getGenericType(), null);
        assertEquals(Object.class, genType.getRawClass());

        Field recField = RecursiveHolder.class.getField("recursiveField");
        JavaType recType = tf._constructType(recField.getGenericType(), null);
        assertEquals(Comparable.class, recType.getRawClass());
    }

    @Test
    public void testConstructType_multiBoundTypeVariable() throws Exception {
        Field mbField = MultiBoundHolder.class.getField("field");
        JavaType mbType = tf._constructType(mbField.getGenericType(), null);
        assertEquals(Number.class, mbType.getRawClass());
    }

    // ==========================================
    // 12. _fromParameterizedClass Coverage
    // ==========================================

    @Test
    public void testFromParameterizedClass() {
        // Array
        JavaType arr = tf._fromParameterizedClass(String[].class, Collections.<JavaType>emptyList());
        assertTrue(arr.isArrayType());

        // Enum
        JavaType en = tf._fromParameterizedClass(TestEnum.class, Collections.<JavaType>emptyList());
        assertTrue(en.isEnumType());

        // Map with 0, 1, 2 params
        JavaType map0 = tf._fromParameterizedClass(HashMap.class, Collections.<JavaType>emptyList());
        assertTrue(map0.isMapLikeType());

        JavaType map1 = tf._fromParameterizedClass(HashMap.class, Collections.singletonList(tf.constructType(String.class)));
        assertTrue(map1.isMapLikeType());
        assertEquals(String.class, map1.getKeyType().getRawClass());
        assertEquals(Object.class, map1.getContentType().getRawClass());

        JavaType map2 = tf._fromParameterizedClass(HashMap.class, Arrays.asList(tf.constructType(String.class), tf.constructType(Integer.class)));
        assertEquals(String.class, map2.getKeyType().getRawClass());
        assertEquals(Integer.class, map2.getContentType().getRawClass());

        // Collection with 0, 1 params
        JavaType col0 = tf._fromParameterizedClass(ArrayList.class, Collections.<JavaType>emptyList());
        assertTrue(col0.isCollectionLikeType());

        JavaType col1 = tf._fromParameterizedClass(ArrayList.class, Collections.singletonList(tf.constructType(String.class)));
        assertEquals(String.class, col1.getContentType().getRawClass());

        // Non-container with 0 params
        JavaType nonContainer0 = tf._fromParameterizedClass(NonGenericSuper.class, Collections.<JavaType>emptyList());
        assertEquals(NonGenericSuper.class, nonContainer0.getRawClass());

        // Non-container with params
        JavaType nonContainerN = tf._fromParameterizedClass(GenericHolder.class, Collections.singletonList(tf.constructType(String.class)));
        assertEquals(GenericHolder.class, nonContainerN.getRawClass());
    }

    // ==========================================
    // 13. Hierarchy & Caching Verification
    // ==========================================

    @Test
    public void testHierarchyCaching_hashMapAndArrayList() {
        // Multiple resolutions trigger and reuse _cachedHashMapType and _cachedArrayListType
        JavaType t1 = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});
        JavaType t2 = tf.constructType(new TypeReference<HashMap<String, Integer>>() {});
        assertNotNull(t1);
        assertNotNull(t2);

        JavaType t3 = tf.constructType(new TypeReference<ArrayList<String>>() {});
        JavaType t4 = tf.constructType(new TypeReference<ArrayList<String>>() {});
        assertNotNull(t3);
        assertNotNull(t4);
    }

    @Test
    public void testResolveVariableViaSubTypes() throws Exception {
        HierarchicType sub = tf._findSuperTypeChain(StringIntMap.class, Map.class);
        assertNotNull(sub);

        JavaType resolvedKey = tf._resolveVariableViaSubTypes(sub, "K", new TypeBindings(tf, StringIntMap.class));
        assertEquals(String.class, resolvedKey.getRawClass());

        JavaType unknown = tf._resolveVariableViaSubTypes(null, "X", null);
        assertEquals(Object.class, unknown.getRawClass());
    }

    @Test
    public void testTypeModifier_modifiesSimpleType() {
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
        JavaType modified = customTf.constructType(Integer.class);
        assertEquals(Long.class, modified.getRawClass());
    }
}
