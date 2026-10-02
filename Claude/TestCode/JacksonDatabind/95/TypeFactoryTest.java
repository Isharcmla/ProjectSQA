import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
    }

    // ---------- defaultInstance / unknownType / rawClass ----------

    @Test
    public void testDefaultInstance_returnsSingleton() {
        TypeFactory instance1 = TypeFactory.defaultInstance();
        TypeFactory instance2 = TypeFactory.defaultInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testUnknownType_returnsObjectType() {
        JavaType type = TypeFactory.unknownType();
        assertNotNull(type);
        assertEquals(Object.class, type.getRawClass());
    }

    @Test
    public void testRawClass_withClassType_returnsSameClass() {
        Class<?> result = TypeFactory.rawClass(String.class);
        assertEquals(String.class, result);
    }

    @Test
    public void testRawClass_withParameterizedType_returnsRawClass() throws Exception {
        java.lang.reflect.Type type = List.class.getMethod("toString").getGenericReturnType();
        Class<?> result = TypeFactory.rawClass(type);
        assertNotNull(result);
    }

    // ---------- findClass ----------

    @Test
    public void testFindClass_normalClassName_returnsClass() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testFindClass_primitiveInt_returnsIntType() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("int");
        assertEquals(int.class, cls);
    }

    @Test
    public void testFindClass_primitiveBoolean_returnsBooleanType() throws ClassNotFoundException {
        Class<?> cls = typeFactory.findClass("boolean");
        assertEquals(boolean.class, cls);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_invalidClassName_throwsException() throws ClassNotFoundException {
        typeFactory.findClass("com.nonexistent.FakeClass12345");
    }

    // ---------- constructType variants ----------

    @Test
    public void testConstructType_withClass_returnsSimpleType() {
        JavaType type = typeFactory.constructType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withTypeReference_returnsCorrectType() {
        JavaType type = typeFactory.constructType(new TypeReference<List<String>>() {});
        assertTrue(type.isContainerType());
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withTypeAndBindings_returnsType() {
        JavaType type = typeFactory.constructType(Integer.class, com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings());
        assertEquals(Integer.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withGenericArrayType_returnsArrayType() {
        JavaType type = typeFactory.constructType(String[].class);
        assertTrue(type.isArrayType());
    }

    // ---------- constructSpecializedType ----------

    @Test
    public void testConstructSpecializedType_sameClass_returnsSameType() {
        JavaType baseType = typeFactory.constructType(List.class);
        JavaType specialized = typeFactory.constructSpecializedType(baseType, List.class);
        assertEquals(baseType.getRawClass(), specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_withSubclass_returnsSpecializedType() {
        JavaType baseType = typeFactory.constructType(List.class);
        JavaType specialized = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertEquals(ArrayList.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_fromObjectBase_returnsSpecialized() {
        JavaType baseType = typeFactory.constructType(Object.class);
        JavaType specialized = typeFactory.constructSpecializedType(baseType, String.class);
        assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubtype_throwsException() {
        JavaType baseType = typeFactory.constructType(List.class);
        typeFactory.constructSpecializedType(baseType, HashMap.class);
    }

    @Test
    public void testConstructSpecializedType_withHashMap_returnsMapType() {
        JavaType baseType = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JavaType specialized = typeFactory.constructSpecializedType(baseType, HashMap.class);
        assertEquals(HashMap.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_withArrayListCollection_returnsCollectionType() {
        JavaType baseType = typeFactory.constructCollectionType(List.class, String.class);
        JavaType specialized = typeFactory.constructSpecializedType(baseType, ArrayList.class);
        assertEquals(ArrayList.class, specialized.getRawClass());
    }

    // ---------- constructGeneralizedType ----------

    @Test
    public void testConstructGeneralizedType_sameClass_returnsSameType() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        JavaType general = typeFactory.constructGeneralizedType(baseType, ArrayList.class);
        assertEquals(baseType.getRawClass(), general.getRawClass());
    }

    @Test
    public void testConstructGeneralizedType_withSuperclass_returnsGeneralizedType() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        JavaType general = typeFactory.constructGeneralizedType(baseType, List.class);
        assertEquals(List.class, general.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType_throwsException() {
        JavaType baseType = typeFactory.constructType(ArrayList.class);
        typeFactory.constructGeneralizedType(baseType, HashMap.class);
    }

    // ---------- constructFromCanonical ----------

    @Test
    public void testConstructFromCanonical_simpleType_returnsCorrectType() {
        JavaType type = typeFactory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testConstructFromCanonical_parameterizedType_returnsCorrectType() {
        JavaType type = typeFactory.constructFromCanonical("java.util.List<java.lang.String>");
        assertEquals(List.class, type.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed_throwsException() {
        typeFactory.constructFromCanonical("this is not;; valid<<<");
    }

    // ---------- findTypeParameters ----------

    @Test
    public void testFindTypeParameters_withMatchingSuperType_returnsParameters() {
        JavaType type = typeFactory.constructType(ArrayList.class);
        JavaType[] params = typeFactory.findTypeParameters(type, List.class);
        assertNotNull(params);
    }

    @Test
    public void testFindTypeParameters_withNoMatch_returnsEmptyArray() {
        JavaType type = typeFactory.constructType(String.class);
        JavaType[] params = typeFactory.findTypeParameters(type, List.class);
        assertEquals(0, params.length);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindTypeParameters_deprecatedClassOverload_returnsParameters() {
        JavaType[] params = typeFactory.findTypeParameters(ArrayList.class, List.class);
        assertNotNull(params);
    }

    // ---------- moreSpecificType ----------

    @Test
    public void testMoreSpecificType_firstNull_returnsSecond() {
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(null, type2);
        assertEquals(type2, result);
    }

    @Test
    public void testMoreSpecificType_secondNull_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, null);
        assertEquals(type1, result);
    }

    @Test
    public void testMoreSpecificType_sameRawClass_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType type2 = typeFactory.constructType(String.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertEquals(type1, result);
    }

    @Test
    public void testMoreSpecificType_secondIsMoreSpecific_returnsSecond() {
        JavaType type1 = typeFactory.constructType(List.class);
        JavaType type2 = typeFactory.constructType(ArrayList.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMoreSpecificType_unrelatedTypes_returnsFirst() {
        JavaType type1 = typeFactory.constructType(String.class);
        JavaType type2 = typeFactory.constructType(Integer.class);
        JavaType result = typeFactory.moreSpecificType(type1, type2);
        assertEquals(type1, result);
    }

    // ---------- constructArrayType ----------

    @Test
    public void testConstructArrayType_withClass_returnsArrayType() {
        ArrayType type = typeFactory.constructArrayType(String.class);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_withJavaType_returnsArrayType() {
        JavaType elementType = typeFactory.constructType(Integer.class);
        ArrayType type = typeFactory.constructArrayType(elementType);
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    // ---------- constructCollectionType ----------

    @Test
    public void testConstructCollectionType_withClasses_returnsCollectionType() {
        CollectionType type = typeFactory.constructCollectionType(List.class, String.class);
        assertEquals(List.class, type.getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_withJavaType_returnsCollectionType() {
        JavaType elementType = typeFactory.constructType(Integer.class);
        CollectionType type = typeFactory.constructCollectionType(ArrayList.class, elementType);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    // ---------- constructCollectionLikeType ----------

    @Test
    public void testConstructCollectionLikeType_withClasses_returnsCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructCollectionLikeType(List.class, String.class);
        assertNotNull(type);
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_withJavaType_returnsCollectionLikeType() {
        JavaType elementType = typeFactory.constructType(String.class);
        CollectionLikeType type = typeFactory.constructCollectionLikeType(Iterable.class, elementType);
        assertNotNull(type);
    }

    // ---------- constructMapType ----------

    @Test
    public void testConstructMapType_withClasses_returnsMapType() {
        MapType type = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(Integer.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_withProperties_returnsStringStringMap() {
        MapType type = typeFactory.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(String.class, type.getKeyType().getRawClass());
        assertEquals(String.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_withJavaTypes_returnsMapType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);
        MapType type = typeFactory.constructMapType(HashMap.class, keyType, valueType);
        assertEquals(HashMap.class, type.getRawClass());
    }

    // ---------- constructMapLikeType ----------

    @Test
    public void testConstructMapLikeType_withClasses_returnsMapLikeType() {
        MapLikeType type = typeFactory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructMapLikeType_withJavaTypes_returnsMapLikeType() {
        JavaType keyType = typeFactory.constructType(String.class);
        JavaType valueType = typeFactory.constructType(Integer.class);
        MapLikeType type = typeFactory.constructMapLikeType(Map.class, keyType, valueType);
        assertNotNull(type);
    }

    // ---------- constructSimpleType ----------

    @Test
    public void testConstructSimpleType_withNoParams_returnsSimpleType() {
        JavaType type = typeFactory.constructSimpleType(String.class, new JavaType[0]);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructReferenceType ----------

    @Test
    public void testConstructReferenceType_withAtomicReference_returnsReferenceType() {
        JavaType referredType = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructReferenceType(AtomicReference.class, referredType);
        assertNotNull(type);
        assertEquals(AtomicReference.class, type.getRawClass());
    }

    // ---------- uncheckedSimpleType (deprecated) ----------

    @Test
    @SuppressWarnings("deprecation")
    public void testUncheckedSimpleType_withClass_returnsSimpleType() {
        JavaType type = typeFactory.uncheckedSimpleType(String.class);
        assertEquals(String.class, type.getRawClass());
    }

    // ---------- constructParametricType ----------

    @Test
    public void testConstructParametricType_withClassParameters_returnsParametricType() {
        JavaType type = typeFactory.constructParametricType(List.class, String.class);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    public void testConstructParametricType_withJavaTypeParameters_returnsParametricType() {
        JavaType paramType = typeFactory.constructType(Integer.class);
        JavaType type = typeFactory.constructParametricType(List.class, paramType);
        assertEquals(List.class, type.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructParametrizedType_withJavaTypeParams_returnsParametricType() {
        JavaType paramType = typeFactory.constructType(String.class);
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, List.class, paramType);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructParametrizedType_withClassParams_returnsParametricType() {
        JavaType type = typeFactory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, type.getRawClass());
    }

    // ---------- construct raw variants ----------

    @Test
    public void testConstructRawCollectionType_returnsCollectionTypeWithUnknownContent() {
        CollectionType type = typeFactory.constructRawCollectionType(List.class);
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType_returnsCollectionLikeType() {
        CollectionLikeType type = typeFactory.constructRawCollectionLikeType(Iterable.class);
        assertNotNull(type);
    }

    @Test
    public void testConstructRawMapType_returnsMapTypeWithUnknownTypes() {
        MapType type = typeFactory.constructRawMapType(Map.class);
        assertEquals(Object.class, type.getKeyType().getRawClass());
        assertEquals(Object.class, type.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType_returnsMapLikeType() {
        MapLikeType type = typeFactory.constructRawMapLikeType(Map.class);
        assertNotNull(type);
    }

    // ---------- withModifier / withClassLoader / withCache ----------

    @Test
    public void testWithModifier_withNull_returnsNewFactoryWithNoModifiers() {
        TypeFactory newFactory = typeFactory.withModifier(null);
        assertNotNull(newFactory);
        assertNotSame(typeFactory, newFactory);
    }

    @Test
    public void testWithClassLoader_returnsNewFactoryWithClassLoader() {
        ClassLoader loader = this.getClass().getClassLoader();
        TypeFactory newFactory = typeFactory.withClassLoader(loader);
        assertSame(loader, newFactory.getClassLoader());
    }

    @Test
    public void testWithCache_returnsNewFactoryInstance() {
        com.fasterxml.jackson.databind.util.LRUMap<Object, JavaType> cache =
                new com.fasterxml.jackson.databind.util.LRUMap<Object, JavaType>(8, 64);
        TypeFactory newFactory = typeFactory.withCache(cache);
        assertNotNull(newFactory);
        assertNotSame(typeFactory, newFactory);
    }

    // ---------- clearCache / getClassLoader ----------

    @Test
    public void testClearCache_doesNotThrowException() {
        typeFactory.constructType(String.class);
        typeFactory.clearCache();
        // no exception expected
        assertTrue(true);
    }

    @Test
    public void testGetClassLoader_defaultInstance_returnsNull() {
        assertNull(typeFactory.getClassLoader());
    }

    // ---------- Additional edge cases ----------

    @Test
    public void testConstructType_withPrimitiveInt_returnsPrimitiveType() {
        JavaType type = typeFactory.constructType(int.class);
        assertTrue(type.isPrimitive());
    }

    @Test
    public void testConstructType_withGenericInterface_returnsCorrectType() {
        JavaType type = typeFactory.constructType(Comparable.class);
        assertEquals(Comparable.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withEnumClass_returnsCorrectType() {
        JavaType type = typeFactory.constructType(Enum.class);
        assertEquals(Enum.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withClassClass_returnsCorrectType() {
        JavaType type = typeFactory.constructType(Class.class);
        assertEquals(Class.class, type.getRawClass());
    }

    @Test
    public void testConstructType_withSelfReferentialGeneric_doesNotThrow() {
        JavaType type = typeFactory.constructType(SelfRefClass.class);
        assertNotNull(type);
    }

    // Helper self-referential class for recursive type test
    static class SelfRefClass implements Comparable<SelfRefClass> {
        @Override
        public int compareTo(SelfRefClass o) {
            return 0;
        }
    }
}
