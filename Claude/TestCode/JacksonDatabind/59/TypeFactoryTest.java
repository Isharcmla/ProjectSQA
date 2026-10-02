import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.LRUMap;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    // ---------- defaultInstance ----------
    @Test
    public void testDefaultInstance_returnsSameSingleton() {
        TypeFactory instance1 = TypeFactory.defaultInstance();
        TypeFactory instance2 = TypeFactory.defaultInstance();
        assertSame(instance1, instance2);
    }

    // ---------- unknownType ----------
    @Test
    public void testUnknownType_returnsObjectType() {
        JavaType type = TypeFactory.unknownType();
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    // ---------- rawClass ----------
    @Test
    public void testRawClass_withClassType_returnsSameClass() {
        Class<?> result = TypeFactory.rawClass(String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testRawClass_withParameterizedType_returnsRawClass() throws Exception {
        Type type = TestGenericHolder.class.getDeclaredField("listField").getGenericType();
        Class<?> result = TypeFactory.rawClass(type);
        assertEquals(List.class, result);
    }

    // ---------- findClass ----------
    @Test
    public void testFindClass_primitiveInt_returnsIntegerType() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("int");
        assertEquals(Integer.TYPE, cls);
    }

    @Test
    public void testFindClass_primitiveLong_returnsLongType() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("long");
        assertEquals(Long.TYPE, cls);
    }

    @Test
    public void testFindClass_primitiveBoolean_returnsBooleanType() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("boolean");
        assertEquals(Boolean.TYPE, cls);
    }

    @Test
    public void testFindClass_regularClass_returnsClass() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_nonExistentClass_throwsException() throws ClassNotFoundException {
        typeFactory.findClass("com.nonexistent.NoSuchClass123");
    }

    // ---------- getClassLoader ----------
    @Test
    public void testGetClassLoader_defaultInstance_returnsNull() {
        assertNull(typeFactory.getClassLoader());
    }

    @Test
    public void testGetClassLoader_withClassLoader_returnsSetClassLoader() {
        ClassLoader cl = this.getClass().getClassLoader();
        TypeFactory tf = typeFactory.withClassLoader(cl);
        assertSame(cl, tf.getClassLoader());
    }

    // ---------- withModifier ----------
    @Test
    public void testWithModifier_nullModifier_returnsNewFactoryWithClearedCache() {
        TypeFactory tf = typeFactory.withModifier(null);
        assertNotNull(tf);
        assertNotSame(typeFactory, tf);
    }

    // ---------- withCache ----------
    @Test
    public void testWithCache_customCache_returnsNewFactory() {
        LRUMap<Object, JavaType> cache = new LRUMap<Object, JavaType>(8, 32);
        TypeFactory tf = typeFactory.withCache(cache);
        assertNotNull(tf);
        assertNotSame(typeFactory, tf);
    }

    // ---------- clearCache ----------
    @Test
    public void testClearCache_doesNotThrow() {
        typeFactory.constructType(String.class);
        typeFactory.clearCache();
        // no exception expected
    }

    // ---------- constructType(Type) ----------
    @Test
    public void testConstructType_simpleClass_returnsSimpleType() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructType_primitiveInt_returnsPrimitiveType() {
        JavaType type = typeFactory.constructType(Integer.TYPE);
        assertTrue(type.isPrimitive());
    }

    @Test
    public void testConstructType_javaTypeInstance_returnsSameInstance() {
        JavaType original = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructType(original);
        assertSame(original, result);
    }

    @Test
    public void testConstructType_genericArrayType_returnsArrayType() throws Exception {
        Type type = TestGenericHolder.class.getDeclaredField("genericArrayField").getGenericType();
        JavaType javaType = typeFactory.constructType(type);
        assertTrue(javaType.isArrayType());
    }

    @Test
    public void testConstructType_wildcardType_resolvesUpperBound() throws Exception {
        Type type = TestGenericHolder.class.getDeclaredField("wildcardListField").getGenericType();
        JavaType javaType = typeFactory.constructType(type);
        assertNotNull(javaType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_nullType_throwsException() {
        typeFactory.constructType((Type) null);
    }

    // ---------- constructType(Type, TypeBindings) ----------
    @Test
    public void testConstructType_withBindings_returnsType() {
        JavaType type = typeFactory.constructType(String.class, TypeBindings.emptyBindings());
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructType(TypeReference) ----------
    @Test
    public void testConstructType_typeReference_returnsListOfStringType() {
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        JavaType type = typeFactory.constructType(ref);
        assertTrue(type.isContainerType());
        assertEquals(List.class, type.getRawClass());
    }

    // ---------- constructType(Type, Class) deprecated ----------
    @Test
    public void testConstructType_typeWithContextClass_returnsType() {
        JavaType type = typeFactory.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructType_typeWithNonNullContextClass_returnsType() {
        JavaType type = typeFactory.constructType(String.class, ArrayList.class);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructType(Type, JavaType) deprecated ----------
    @Test
    public void testConstructType_typeWithContextType_returnsType() {
        JavaType contextType = typeFactory.constructType(ArrayList.class);
        JavaType type = typeFactory.constructType(String.class, contextType);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructType_typeWithNullContextType_returnsType() {
        JavaType type = typeFactory.constructType(String.class, (JavaType) null);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructFromCanonical ----------
    @Test
    public void testConstructFromCanonical_simpleType_returnsType() {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformedString_throwsException() {
        typeFactory.constructFromCanonical("this is not[[[ a valid canonical type");
    }

    // ---------- findTypeParameters ----------
    @Test
    public void testFindTypeParameters_typeAndExpType_returnsParams() {
        JavaType type = typeFactory.constructType(TestStringList.class);
        JavaType[] params = typeFactory.findTypeParameters(type, List.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_noMatchingSuperType_returnsEmptyArray() {
        JavaType type = typeFactory.constructType(String.class);
        JavaType[] params = typeFactory.findTypeParameters(type, List.class);
        assertEquals(0, params.length);
    }

    @Test
    public void testFindTypeParameters_classAndExpTypeWithBindings_deprecated() {
        JavaType[] params = typeFactory.findTypeParameters(TestStringList.class, List.class,
                TypeBindings.emptyBindings());
        assertEquals(1, params.length);
    }

    @Test
    public void testFindTypeParameters_classAndExpType_deprecated() {
        JavaType[] params = typeFactory.findTypeParameters(TestStringList.class, List.class);
        assertEquals(1, params.length);
    }

    // ---------- moreSpecificType ----------
    @Test
    public void testMoreSpecificType_bothNull_returnsNullEquivalent() {
        JavaType result = typeFactory.moreSpecificType(null, null);
        assertNull(result);
    }

    @Test
    public void testMoreSpecificType_firstNull_returnsSecond() {
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificType_secondNull_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificType_sameRawClass_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificType_type2MoreSpecific_returnsType2() {
        JavaType type1 = typeFactory.constructType(Number.class);
        JavaType type2 = typeFactory.constructType(Integer.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificType_unrelatedTypes_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType type2 = typeFactory.constructType(Integer.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    // ---------- constructSpecializedType ----------
    @Test
    public void testConstructSpecializedType_sameRawClass_returnsSameType() {
        JavaType baseType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, String.class);
        assertSame(baseType, result);
    }

    @Test
    public void testConstructSpecializedType_objectBaseType_returnsSubclassType() {
        JavaType baseType = typeFactory.constructType(Object.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, String.class);
        assertEquals(String.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_noGenericsBaseType_returnsSubtype() {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, Integer.class);
        assertEquals(Integer.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_mapLikeShortcut_returnsHashMap() {
        JavaType baseType = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, HashMap.class);
        assertEquals(HashMap.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_collectionLikeShortcut_returnsArrayList() {
        JavaType baseType = typeFactory.constructCollectionType(List.class, String.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_enumSetShortcut_returnsSameType() {
        JavaType baseType = typeFactory.constructCollectionType(EnumSet.class,
                typeFactory.constructType(TestEnum.class));
        JavaType result = typeFactory.constructSpecializedType(baseType, EnumSet.class);
        assertSame(baseType, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubtype_throwsException() {
        JavaType baseType = typeFactory.constructType(String.class);
        typeFactory.constructSpecializedType(baseType, Integer.class);
    }

    @Test
    public void testConstructSpecializedType_noTypeParamsSubclass_returnsResolved() {
        JavaType baseType = typeFactory.constructType(Number.class);
        JavaType result = typeFactory.constructSpecializedType(baseType, Long.class);
        assertEquals(Long.class, result.getRawClass());
    }

    // ---------- constructGeneralizedType ----------
    @Test
    public void testConstructGeneralizedType_sameRawClass_returnsSameType() {
        JavaType baseType = typeFactory.constructType(String.class);
        JavaType result = typeFactory.constructGeneralizedType(baseType, String.class);
        assertSame(baseType, result);
    }

    @Test
    public void testConstructGeneralizedType_validSuperClass_returnsSuperType() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.constructGeneralizedType(baseType, List.class);
        assertEquals(List.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType_throwsException() {
        JavaType baseType = typeFactory.constructType(String.class);
        typeFactory.constructGeneralizedType(baseType, Integer.class);
    }

    // ---------- constructArrayType(Class) ----------
    @Test
    public void testConstructArrayType_fromClass_returnsArrayType() {
        ArrayType type = typeFactory.constructArrayType(String.class);
        assertTrue(type.isArrayType());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    // ---------- constructArrayType(JavaType) ----------
    @Test
    public void testConstructArrayType_fromJavaType_returnsArrayType() {
        JavaType elementType = typeFactory.constructType(Integer.class);
        ArrayType type = typeFactory.constructArrayType(elementType);
        assertTrue(type.isArrayType());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    // ---------- constructCollectionType(Class, Class) ----------
    @Test
    public void testConstructCollectionType_classElement_returnsCollectionType() {
        CollectionType type = typeFactory.constructCollectionType(List.class, String.class);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    // ---------- constructCollectionType(Class, JavaType) ----------
    @Test
    public void testConstructCollectionType_javaTypeElement_returnsCollectionType() {
        JavaType elementType = typeFactory.constructType(Integer.class);
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, elementType);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    // ---------- constructCollectionLikeType(Class, Class) ----------
    @Test
    public void testConstructCollectionLikeType_classElement_returnsType() {
        CollectionLikeType type = typeFactory.constructCollectionLikeType(List.class, String.class);
        assertNotNull(type);
    }

    // ---------- constructCollectionLikeType(Class, JavaType) ----------
    @Test
    public void testConstructCollectionLikeType_javaTypeElement_returnsType() {
        JavaType elementType = typeFactory.constructType(String.class);
        CollectionLikeType type = typeFactory.constructCollectionLikeType(TestCollectionLike.class, elementType);
        assertNotNull(type);
    }

    // ---------- constructMapType(Class, Class, Class) ----------
    @Test
    public void testConstructMapType_classes_returnsMapType() {
        MapType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, type.getRawClass());
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_propertiesClass_returnsStringStringMap() {
        MapType type = typeFactory.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    // ---------- constructMapType(Class, JavaType, JavaType) ----------
    @Test
    public void testConstructMapType_javaTypes_returnsMapType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);
        MapType type = typeFactory.constructMapType(HashMap.class, keyType, valueType);
        assertEquals(HashMap.class, type.getRawClass());
    }

    // ---------- constructMapLikeType(Class, Class, Class) ----------
    @Test
    public void testConstructMapLikeType_classes_returnsType() {
        MapLikeType type = typeFactory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertNotNull(type);
    }

    // ---------- constructMapLikeType(Class, JavaType, JavaType) ----------
    @Test
    public void testConstructMapLikeType_javaTypes_returnsType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);
        MapLikeType type = typeFactory.constructMapLikeType(TestMapLike.class, keyType, valueType);
        assertNotNull(type);
    }

    // ---------- constructSimpleType(Class, JavaType[]) ----------
    @Test
    public void testConstructSimpleType_withParams_returnsType() {
        JavaType[] params = new JavaType[] { typeFactory.constructType(String.class) };
        JavaType type = typeFactory.constructSimpleType(TestGenericSimple.class, params);
        assertNotNull(type);
    }

    // ---------- constructSimpleType(Class, Class, JavaType[]) deprecated ----------
    @Test
    public void testConstructSimpleType_deprecatedVariant_returnsType() {
        JavaType[] params = new JavaType[] { typeFactory.constructType(String.class) };
        JavaType type = typeFactory.constructSimpleType(TestGenericSimple.class, Object.class, params);
        assertNotNull(type);
    }

    // ---------- constructReferenceType ----------
    @Test
    public void testConstructReferenceType_atomicReference_returnsReferenceType() {
        JavaType referredType = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructReferenceType(AtomicReference.class, referredType);
        assertNotNull(type);
        assertEquals(AtomicReference.class, type.getRawClass());
    }

    // ---------- uncheckedSimpleType ----------
    @Test
    public void testUncheckedSimpleType_returnsSimpleType() {
        JavaType type = typeFactory.uncheckedSimpleType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructParametricType(Class, Class...) ----------
    @Test
    public void testConstructParametricType_withClasses_returnsType() {
        JavaType type = typeFactory.constructParametricType(List.class, String.class);
        assertEquals(List.class, type.getRawClass());
    }

    // ---------- constructParametricType(Class, JavaType...) ----------
    @Test
    public void testConstructParametricType_withJavaTypes_returnsType() {
        JavaType inner = typeFactory.constructType(Integer.class);
        JavaType type = typeFactory.constructParametricType(List.class, inner);
        assertEquals(List.class, type.getRawClass());
    }

    // ---------- constructParametrizedType(Class, Class, JavaType...) ----------
    @Test
    public void testConstructParametrizedType_javaTypesVariant_returnsType() {
        JavaType inner = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, List.class, inner);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    // ---------- constructParametrizedType(Class, Class, Class...) ----------
    @Test
    public void testConstructParametrizedType_classesVariant_returnsType() {
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    // ---------- constructRawCollectionType ----------
    @Test
    public void testConstructRawCollectionType_returnsUnknownParamType() {
        CollectionType type = typeFactory.constructRawCollectionType(List.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    // ---------- constructRawCollectionLikeType ----------
    @Test
    public void testConstructRawCollectionLikeType_returnsType() {
        CollectionLikeType type = typeFactory.constructRawCollectionLikeType(TestCollectionLike.class);
        assertNotNull(type);
    }

    // ---------- constructRawMapType ----------
    @Test
    public void testConstructRawMapType_returnsUnknownParamsMapType() {
        MapType type = typeFactory.constructRawMapType(Map.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    // ---------- constructRawMapLikeType ----------
    @Test
    public void testConstructRawMapLikeType_returnsType() {
        MapLikeType type = typeFactory.constructRawMapLikeType(TestMapLike.class);
        assertNotNull(type);
    }

    // ---------- TypeVariable resolution ----------
    @Test
    public void testConstructType_typeVariable_resolvesToBound() throws Exception {
        Type type = TestGenericClass.class.getMethod("getValue").getGenericReturnType();
        JavaType javaType = typeFactory.constructType(type);
        assertNotNull(javaType);
    }

    // ---------- self-referencing generic type ----------
    @Test
    public void testConstructType_selfReferentialGeneric_doesNotThrow() {
        JavaType type = typeFactory.constructType(TestSelfRef.class);
        assertNotNull(type);
    }

    // ---------- primitive core types via findWellKnownSimple ----------
    @Test
    public void testConstructType_booleanPrimitive_returnsPrimitiveType() {
        JavaType type = typeFactory.constructType(Boolean.TYPE);
        assertTrue(type.isPrimitive());
    }

    @Test
    public void testConstructType_objectClass_returnsObjectType() {
        JavaType type = typeFactory.constructType(Object.class);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testConstructType_enumClass_returnsEnumType() {
        JavaType type = typeFactory.constructType(TestEnum.class);
        assertNotNull(type);
        assertTrue(type.isEnumType());
    }

    @Test
    public void testConstructType_arrayClass_returnsArrayType() {
        JavaType type = typeFactory.constructType(int[].class);
        assertTrue(type.isArrayType());
    }

    @Test
    public void testConstructType_interfaceClass_returnsType() {
        JavaType type = typeFactory.constructType(Runnable.class);
        assertEquals(Runnable.class, type.getRawClass());
    }

    @Test
    public void testConstructType_comparableParametrized_returnsCoreComparableType() throws Exception {
        Type type = TestGenericHolder.class.getDeclaredField("comparableField").getGenericType();
        JavaType javaType = typeFactory.constructType(type);
        assertEquals(Comparable.class, javaType.getRawClass());
    }

    @Test
    public void testConstructType_classParametrized_returnsCoreClassType() throws Exception {
        Type type = TestGenericHolder.class.getDeclaredField("classField").getGenericType();
        JavaType javaType = typeFactory.constructType(type);
        assertEquals(Class.class, javaType.getRawClass());
    }

    // ---------- helper test classes ----------
    static class TestGenericHolder {
        List<String> listField;
        List<String>[] genericArrayField;
        List<? extends Number> wildcardListField;
        Comparable<String> comparableField;
        Class<String> classField;
    }

    static class TestStringList extends ArrayList<String> {
        private static final long serialVersionUID = 1L;
    }

    enum TestEnum { A, B }

    static class TestCollectionLike {
        // just a plain class used to test collection-like construction
    }

    static class TestMapLike {
        // just a plain class used to test map-like construction
    }

    static class TestGenericSimple<T> {
        T value;
    }

    static class TestGenericClass<T extends Number> {
        public T getValue() {
            return null;
        }
    }

    static class TestSelfRef<T extends TestSelfRef<T>> {
        T self;
    }
}
