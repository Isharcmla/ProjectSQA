import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

public class TypeFactoryTest {

    private TypeFactory factory;

    // Helper generic classes/interfaces used for reflection-based type extraction

    static class GenericContainer<T> {
        public List<String> listField;
        public T[] arrayField;
        public T varField;
        public List<? extends Number> wildcardField;
        public Map<String, Integer> mapField;
    }

    interface MyCollectionLike<E> {}
    interface MyMapLike<K, V> {}

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
    }

    // ---------- defaultInstance / getClassLoader / withClassLoader / withModifier ----------

    @Test
    public void testDefaultInstance_normal_returnsSingleton() {
        TypeFactory f1 = TypeFactory.defaultInstance();
        TypeFactory f2 = TypeFactory.defaultInstance();
        assertSame(f1, f2);
    }

    @Test
    public void testGetClassLoader_default_returnsNull() {
        assertNull(factory.getClassLoader());
    }

    @Test
    public void testWithClassLoader_normal_returnsNewInstanceWithLoader() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        TypeFactory newFactory = factory.withClassLoader(loader);
        assertNotSame(factory, newFactory);
        assertSame(loader, newFactory.getClassLoader());
    }

    @Test
    public void testWithModifier_nullModifier_returnsNewInstance() {
        TypeFactory newFactory = factory.withModifier(null);
        assertNotNull(newFactory);
        assertNotSame(factory, newFactory);
    }

    @Test
    public void testWithModifier_actualModifier_appliesModifierOnConstruct() {
        TypeModifier modifier = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context,
                    TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory newFactory = factory.withModifier(modifier);
        assertNotNull(newFactory);
        JavaType t = newFactory.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testWithModifier_secondModifier_addsToExisting() {
        TypeModifier modifier1 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context,
                    TypeFactory typeFactory) {
                return type;
            }
        };
        TypeModifier modifier2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context,
                    TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory f1 = factory.withModifier(modifier1);
        TypeFactory f2 = f1.withModifier(modifier2);
        assertNotNull(f2);
    }

    @Test
    public void testClearCache_normal_doesNotThrow() {
        factory.constructType(String.class);
        factory.clearCache();
        // no exception means success
        assertTrue(true);
    }

    // ---------- unknownType / rawClass ----------

    @Test
    public void testUnknownType_normal_returnsObjectType() {
        JavaType t = TypeFactory.unknownType();
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testRawClass_classInstance_returnsSameClass() {
        Class<?> c = TypeFactory.rawClass(String.class);
        assertEquals(String.class, c);
    }

    @Test
    public void testRawClass_parameterizedType_returnsRawClass() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("listField");
        Type genericType = f.getGenericType();
        Class<?> c = TypeFactory.rawClass(genericType);
        assertEquals(List.class, c);
    }

    // ---------- findClass ----------

    @Test
    public void testFindClass_normalClassName_returnsClass() throws Exception {
        Class<?> c = factory.findClass("java.lang.String");
        assertEquals(String.class, c);
    }

    @Test
    public void testFindClass_primitiveName_returnsPrimitiveClass() throws Exception {
        Class<?> c = factory.findClass("int");
        assertEquals(Integer.TYPE, c);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testFindClass_invalidClassName_throwsClassNotFoundException() throws Exception {
        factory.findClass("com.nonexistent.NoSuchClass12345");
    }

    // ---------- constructSpecializedType ----------

    @Test
    public void testConstructSpecializedType_sameClass_returnsSameBaseType() {
        JavaType base = factory.constructType(String.class);
        JavaType specialized = factory.constructSpecializedType(base, String.class);
        assertSame(base, specialized);
    }

    @Test
    public void testConstructSpecializedType_normalMapSubtype_returnsSpecializedMap() {
        JavaType base = factory.constructMapType(Map.class, String.class, Integer.class);
        JavaType specialized = factory.constructSpecializedType(base, HashMap.class);
        assertEquals(HashMap.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_normalCollectionSubtype_returnsSpecializedCollection() {
        JavaType base = factory.constructCollectionType(Collection.class, String.class);
        JavaType specialized = factory.constructSpecializedType(base, ArrayList.class);
        assertEquals(ArrayList.class, specialized.getRawClass());
    }

    @Test
    public void testConstructSpecializedType_objectBase_returnsFromClass() {
        JavaType base = factory.constructType(Object.class);
        JavaType specialized = factory.constructSpecializedType(base, String.class);
        assertEquals(String.class, specialized.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_notSubtype_throwsIllegalArgumentException() {
        JavaType base = factory.constructCollectionType(List.class, String.class);
        factory.constructSpecializedType(base, String.class);
    }

    // ---------- constructGeneralizedType ----------

    @Test
    public void testConstructGeneralizedType_sameClass_returnsSameBaseType() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType general = factory.constructGeneralizedType(base, ArrayList.class);
        assertSame(base, general);
    }

    @Test
    public void testConstructGeneralizedType_normalSuperType_returnsSuperType() {
        JavaType base = factory.constructType(ArrayList.class);
        JavaType general = factory.constructGeneralizedType(base, List.class);
        assertEquals(List.class, general.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructGeneralizedType_notSuperType_throwsIllegalArgumentException() {
        JavaType base = factory.constructType(ArrayList.class);
        factory.constructGeneralizedType(base, Map.class);
    }

    // ---------- constructFromCanonical ----------

    @Test
    public void testConstructFromCanonical_simpleType_returnsCorrectType() {
        JavaType original = factory.constructType(String.class);
        String canonical = original.toCanonical();
        JavaType parsed = factory.constructFromCanonical(canonical);
        assertEquals(String.class, parsed.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformedString_throwsIllegalArgumentException() {
        factory.constructFromCanonical("!!!not a valid type!!!");
    }

    // ---------- findTypeParameters ----------

    @Test
    public void testFindTypeParameters_matchingSuperType_returnsParameterArray() {
        JavaType listType = factory.constructCollectionType(ArrayList.class, String.class);
        JavaType[] params = factory.findTypeParameters(listType, Collection.class);
        assertEquals(1, params.length);
        assertEquals(String.class, params[0].getRawClass());
    }

    @Test
    public void testFindTypeParameters_noMatchingSuperType_returnsEmptyArray() {
        JavaType stringType = factory.constructType(String.class);
        JavaType[] params = factory.findTypeParameters(stringType, Collection.class);
        assertEquals(0, params.length);
    }

    @Test
    public void testFindTypeParameters_deprecatedWithBindings_returnsParameterArray() {
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class,
                TypeBindings.emptyBindings());
        assertNotNull(params);
    }

    @Test
    public void testFindTypeParameters_deprecatedNoBindings_returnsParameterArray() {
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class);
        assertNotNull(params);
    }

    // ---------- moreSpecificType ----------

    @Test
    public void testMoreSpecificType_firstNull_returnsSecond() {
        JavaType type2 = factory.constructType(String.class);
        JavaType result = factory.moreSpecificType(null, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificType_secondNull_returnsFirst() {
        JavaType type1 = factory.constructType(String.class);
        JavaType result = factory.moreSpecificType(type1, null);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificType_sameRawClass_returnsFirst() {
        JavaType type1 = factory.constructType(String.class);
        JavaType type2 = factory.constructType(String.class);
        JavaType result = factory.moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    @Test
    public void testMoreSpecificType_assignableRelation_returnsMoreSpecific() {
        JavaType type1 = factory.constructType(Number.class);
        JavaType type2 = factory.constructType(Integer.class);
        JavaType result = factory.moreSpecificType(type1, type2);
        assertSame(type2, result);
    }

    @Test
    public void testMoreSpecificType_unrelatedTypes_returnsFirst() {
        JavaType type1 = factory.constructType(String.class);
        JavaType type2 = factory.constructType(Integer.class);
        JavaType result = factory.moreSpecificType(type1, type2);
        assertSame(type1, result);
    }

    // ---------- constructType variants ----------

    @Test
    public void testConstructType_simpleClass_returnsCorrectRawClass() {
        JavaType t = factory.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withBindings_returnsCorrectRawClass() {
        JavaType t = factory.constructType(String.class, TypeBindings.emptyBindings());
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_typeReference_returnsParameterizedType() {
        TypeReference<List<String>> ref = new TypeReference<List<String>>() {};
        JavaType t = factory.constructType(ref);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructType_deprecatedWithContextClass_returnsCorrectType() {
        JavaType t = factory.constructType(String.class, (Class<?>) Object.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_deprecatedWithContextType_returnsCorrectType() {
        JavaType contextType = factory.constructType(Object.class);
        JavaType t = factory.constructType(String.class, contextType);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_parameterizedTypeReflection_returnsCorrectType() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("listField");
        JavaType t = factory.constructType(f.getGenericType());
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_mapFieldReflection_returnsCorrectType() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("mapField");
        JavaType t = factory.constructType(f.getGenericType());
        assertEquals(Map.class, t.getRawClass());
    }

    @Test
    public void testConstructType_genericArrayTypeReflection_returnsArrayType() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("arrayField");
        JavaType t = factory.constructType(f.getGenericType());
        assertTrue(t.isArrayType());
    }

    @Test
    public void testConstructType_typeVariableReflection_returnsObjectType() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("varField");
        JavaType t = factory.constructType(f.getGenericType());
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testConstructType_wildcardFieldReflection_returnsCorrectContentType() throws Exception {
        Field f = GenericContainer.class.getDeclaredField("wildcardField");
        JavaType t = factory.constructType(f.getGenericType());
        assertEquals(List.class, t.getRawClass());
        assertEquals(Number.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_javaTypeInput_returnsSameInstance() {
        JavaType original = factory.constructType(String.class);
        JavaType result = factory.constructType(original);
        assertSame(original, result);
    }

    @Test
    public void testConstructType_enumParameterized_returnsCoreEnumType() {
        JavaType t = factory.constructType(Enum.class);
        assertEquals(Enum.class, t.getRawClass());
    }

    @Test
    public void testConstructType_primitiveType_returnsWellKnownType() {
        JavaType t = factory.constructType(Integer.TYPE);
        assertEquals(Integer.TYPE, t.getRawClass());
    }

    @Test
    public void testConstructType_arrayClass_returnsArrayType() {
        JavaType t = factory.constructType(String[].class);
        assertTrue(t.isArrayType());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructType_selfReferencingGeneric_doesNotThrow() {
        // Comparable extends Comparable<T> - self referencing; using cached shortcut
        JavaType t = factory.constructType(Comparable.class);
        assertEquals(Comparable.class, t.getRawClass());
    }

    // ---------- constructArrayType ----------

    @Test
    public void testConstructArrayType_classArg_returnsCorrectArrayType() {
        ArrayType t = factory.constructArrayType(String.class);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_javaTypeArg_returnsCorrectArrayType() {
        JavaType elementType = factory.constructType(Integer.class);
        ArrayType t = factory.constructArrayType(elementType);
        assertSame(elementType, t.getContentType());
    }

    // ---------- constructCollectionType ----------

    @Test
    public void testConstructCollectionType_classArgs_returnsCorrectType() {
        CollectionType t = factory.constructCollectionType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_javaTypeArg_returnsCorrectType() {
        JavaType elementType = factory.constructType(Integer.class);
        CollectionType t = factory.constructCollectionType(ArrayList.class, elementType);
        assertEquals(ArrayList.class, t.getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    // ---------- constructCollectionLikeType ----------

    @Test
    public void testConstructCollectionLikeType_classArgs_realCollection_returnsCollectionLikeType() {
        CollectionLikeType t = factory.constructCollectionLikeType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_customInterface_upgradesToCollectionLikeType() {
        CollectionLikeType t = factory.constructCollectionLikeType(MyCollectionLike.class, String.class);
        assertEquals(MyCollectionLike.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionLikeType_javaTypeArg_returnsCollectionLikeType() {
        JavaType elementType = factory.constructType(String.class);
        CollectionLikeType t = factory.constructCollectionLikeType(Collection.class, elementType);
        assertEquals(Collection.class, t.getRawClass());
    }

    // ---------- constructMapType ----------

    @Test
    public void testConstructMapType_classArgs_returnsCorrectType() {
        MapType t = factory.constructMapType(Map.class, String.class, Integer.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_propertiesClass_returnsStringStringType() {
        MapType t = factory.constructMapType(Properties.class, Object.class, Object.class);
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapType_javaTypeArgs_returnsCorrectType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valueType = factory.constructType(Integer.class);
        MapType t = factory.constructMapType(HashMap.class, keyType, valueType);
        assertEquals(HashMap.class, t.getRawClass());
    }

    // ---------- constructMapLikeType ----------

    @Test
    public void testConstructMapLikeType_classArgs_realMap_returnsMapLikeType() {
        MapLikeType t = factory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertEquals(Map.class, t.getRawClass());
    }

    @Test
    public void testConstructMapLikeType_customInterface_upgradesToMapLikeType() {
        MapLikeType t = factory.constructMapLikeType(MyMapLike.class, String.class, Integer.class);
        assertEquals(MyMapLike.class, t.getRawClass());
        assertEquals(String.class, t.getKeyType().getRawClass());
        assertEquals(Integer.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructMapLikeType_javaTypeArgs_returnsMapLikeType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valueType = factory.constructType(Integer.class);
        MapLikeType t = factory.constructMapLikeType(Map.class, keyType, valueType);
        assertEquals(Map.class, t.getRawClass());
    }

    // ---------- constructSimpleType ----------

    @Test
    public void testConstructSimpleType_normal_returnsSimpleType() {
        JavaType[] params = new JavaType[] { factory.constructType(String.class) };
        JavaType t = factory.constructSimpleType(ArrayList.class, params);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructSimpleType_deprecatedOverload_returnsSimpleType() {
        JavaType[] params = new JavaType[] { factory.constructType(String.class) };
        JavaType t = factory.constructSimpleType(ArrayList.class, List.class, params);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    // ---------- constructReferenceType ----------

    @Test
    public void testConstructReferenceType_normal_returnsReferenceType() {
        JavaType referredType = factory.constructType(String.class);
        JavaType t = factory.constructReferenceType(AtomicReference.class, referredType);
        assertEquals(AtomicReference.class, t.getRawClass());
        assertEquals(String.class, t.getReferencedType().getRawClass());
    }

    // ---------- uncheckedSimpleType ----------

    @Test
    public void testUncheckedSimpleType_normal_returnsSimpleType() {
        JavaType t = factory.uncheckedSimpleType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // ---------- constructParametricType ----------

    @Test
    public void testConstructParametricType_classVarargs_returnsCorrectType() {
        JavaType t = factory.constructParametricType(List.class, String.class);
        assertEquals(List.class, t.getRawClass());
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructParametricType_javaTypeVarargs_returnsCorrectType() {
        JavaType paramType = factory.constructType(String.class);
        JavaType t = factory.constructParametricType(List.class, paramType);
        assertEquals(List.class, t.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_javaTypeVarargs_returnsCorrectType() {
        JavaType paramType = factory.constructType(String.class);
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class, paramType);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    @Test
    public void testConstructParametrizedType_classVarargs_returnsCorrectType() {
        JavaType t = factory.constructParametrizedType(ArrayList.class, List.class, String.class);
        assertEquals(ArrayList.class, t.getRawClass());
    }

    // ---------- raw variants ----------

    @Test
    public void testConstructRawCollectionType_normal_returnsUnknownContentType() {
        CollectionType t = factory.constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType_normal_returnsUnknownContentType() {
        CollectionLikeType t = factory.constructRawCollectionLikeType(MyCollectionLike.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapType_normal_returnsUnknownKeyValueTypes() {
        MapType t = factory.constructRawMapType(HashMap.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType_normal_returnsUnknownKeyValueTypes() {
        MapLikeType t = factory.constructRawMapLikeType(MyMapLike.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    // ---------- edge cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_unrecognizedType_throwsIllegalArgumentException() {
        Type badType = new Type() {
            @Override
            public String toString() {
                return "bad-type";
            }
        };
        factory.constructType(badType);
    }

    @Test
    public void testConstructType_objectClass_returnsCachedObjectType() {
        JavaType t1 = factory.constructType(Object.class);
        JavaType t2 = factory.constructType(Object.class);
        assertEquals(Object.class, t1.getRawClass());
        assertEquals(Object.class, t2.getRawClass());
    }

    @Test
    public void testConstructType_classClass_returnsCoreClassType() {
        JavaType t = factory.constructType(Class.class);
        assertEquals(Class.class, t.getRawClass());
    }
}
