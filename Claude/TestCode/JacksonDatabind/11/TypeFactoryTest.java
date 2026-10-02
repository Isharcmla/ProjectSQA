import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;
import java.lang.reflect.Type;

public class TypeFactoryTest {

    private TypeFactory factory;

    @Before
    public void setUp() {
        factory = TypeFactory.defaultInstance();
    }

    // ---------- defaultInstance / unknownType / rawClass ----------

    @Test
    public void testDefaultInstance_returnsSingleton() {
        TypeFactory f1 = TypeFactory.defaultInstance();
        TypeFactory f2 = TypeFactory.defaultInstance();
        assertSame(f1, f2);
    }

    @Test
    public void testUnknownType_returnsObjectRawType() {
        JavaType t = TypeFactory.unknownType();
        assertNotNull(t);
        assertEquals(Object.class, t.getRawClass());
    }

    @Test
    public void testRawClass_withClassType_returnsSameClass() {
        Class<?> c = TypeFactory.rawClass(String.class);
        assertEquals(String.class, c);
    }

    @Test
    public void testRawClass_withParameterizedType_returnsRawClass() {
        Type t = new TypeReference<List<String>>() {}.getType();
        Class<?> c = TypeFactory.rawClass(t);
        assertEquals(List.class, c);
    }

    // ---------- constructType variants ----------

    @Test
    public void testConstructType_withSimpleClass_returnsSimpleType() {
        JavaType t = factory.constructType(String.class);
        assertNotNull(t);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withPrimitiveInt_returnsCachedCoreType() {
        JavaType t = factory.constructType(int.class);
        assertEquals(int.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withPrimitiveBoolean_returnsCachedCoreType() {
        JavaType t = factory.constructType(boolean.class);
        assertEquals(boolean.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withPrimitiveLong_returnsCachedCoreType() {
        JavaType t = factory.constructType(long.class);
        assertEquals(long.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withArrayClass_returnsArrayType() {
        JavaType t = factory.constructType(String[].class);
        assertTrue(t instanceof ArrayType);
    }

    @Test
    public void testConstructType_withEnumClass_returnsSimpleType() {
        JavaType t = factory.constructType(SampleEnum.class);
        assertEquals(SampleEnum.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withRawMapClass_returnsMapType() {
        JavaType t = factory.constructType(HashMap.class);
        assertTrue(t instanceof MapType);
    }

    @Test
    public void testConstructType_withRawCollectionClass_returnsCollectionType() {
        JavaType t = factory.constructType(ArrayList.class);
        assertTrue(t instanceof CollectionType);
    }

    @Test
    public void testConstructType_withParameterizedListType_returnsCollectionType() {
        Type t = new TypeReference<List<String>>() {}.getType();
        JavaType javaType = factory.constructType(t);
        assertTrue(javaType instanceof CollectionType);
        assertEquals(String.class, ((CollectionType) javaType).getContentType().getRawClass());
    }

    @Test
    public void testConstructType_withParameterizedMapType_returnsMapType() {
        Type t = new TypeReference<Map<String, Integer>>() {}.getType();
        JavaType javaType = factory.constructType(t);
        assertTrue(javaType instanceof MapType);
    }

    @Test
    public void testConstructType_withGenericArrayType_returnsArrayType() {
        Type t = new TypeReference<List<String>[]>() {}.getType();
        JavaType javaType = factory.constructType(t);
        assertTrue(javaType instanceof ArrayType);
    }

    @Test
    public void testConstructType_withWildcardType_resolvesUpperBound() {
        Type t = new TypeReference<List<? extends Number>>() {}.getType();
        JavaType javaType = factory.constructType(t);
        assertTrue(javaType instanceof CollectionType);
    }

    @Test
    public void testConstructType_withJavaTypeInput_returnsSameInstance() {
        JavaType original = factory.constructType(String.class);
        JavaType result = factory.constructType(original);
        assertSame(original, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructType_withNullType_throwsException() {
        factory.constructType((Type) null);
    }

    @Test
    public void testConstructType_withTypeReference() {
        JavaType t = factory.constructType(new TypeReference<List<String>>() {});
        assertTrue(t instanceof CollectionType);
    }

    @Test
    public void testConstructType_withNullClassContext_returnsSimpleType() {
        JavaType t = factory.constructType(String.class, (Class<?>) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withClassContext() {
        JavaType t = factory.constructType(String.class, Object.class);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withNullJavaTypeContext_returnsSimpleType() {
        JavaType t = factory.constructType(String.class, (JavaType) null);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withJavaTypeContext() {
        JavaType ctx = factory.constructType(Object.class);
        JavaType t = factory.constructType(String.class, ctx);
        assertEquals(String.class, t.getRawClass());
    }

    @Test
    public void testConstructType_withBindingsNull() {
        JavaType t = factory.constructType(String.class, (TypeBindings) null);
        assertEquals(String.class, t.getRawClass());
    }

    // ---------- constructSpecializedType ----------

    @Test
    public void testConstructSpecializedType_sameRawClass_returnsSameType() {
        JavaType baseType = factory.constructType(Object.class);
        JavaType result = factory.constructSpecializedType(baseType, Object.class);
        assertSame(baseType, result);
    }

    @Test
    public void testConstructSpecializedType_simpleTypeToCollectionSubclass_returnsSpecialized() {
        JavaType baseType = factory.constructType(Object.class);
        JavaType result = factory.constructSpecializedType(baseType, ArrayList.class);
        assertTrue(result instanceof CollectionType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSpecializedType_incompatibleSubclass_throwsException() {
        JavaType baseType = factory.constructType(String.class);
        factory.constructSpecializedType(baseType, ArrayList.class);
    }

    @Test
    public void testConstructSpecializedType_nonSimpleTypeNarrowBy_returnsNarrowedType() {
        JavaType baseType = factory.constructCollectionType(List.class, String.class);
        JavaType result = factory.constructSpecializedType(baseType, ArrayList.class);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    // ---------- constructFromCanonical ----------

    @Test
    public void testConstructFromCanonical_simpleType_returnsCorrectType() {
        JavaType t = factory.constructFromCanonical("java.lang.String");
        assertEquals(String.class, t.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructFromCanonical_malformed_throwsException() {
        factory.constructFromCanonical("this.class.does.not.Exist<>");
    }

    // ---------- findTypeParameters ----------

    @Test
    public void testFindTypeParameters_classAndExpType_returnsParams() {
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class);
        assertNotNull(params);
        assertEquals(1, params.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindTypeParameters_notSubtype_throwsException() {
        factory.findTypeParameters(String.class, List.class);
    }

    @Test
    public void testFindTypeParameters_withJavaTypeMatchingParameterSource_returnsContainedTypes() {
        JavaType stringType = factory.constructType(String.class);
        JavaType intType = factory.constructType(Integer.class);
        JavaType simple = factory.constructSimpleType(HashMap.class, Map.class,
                new JavaType[] { stringType, intType });
        JavaType[] params = factory.findTypeParameters(simple, Map.class);
        assertNotNull(params);
        assertEquals(2, params.length);
    }

    @Test
    public void testFindTypeParameters_withJavaTypeNotMatchingParameterSource_fallsBackToClass() {
        JavaType type = factory.constructType(ArrayList.class);
        JavaType[] params = factory.findTypeParameters(type, Collection.class);
        assertNotNull(params);
        assertEquals(1, params.length);
    }

    @Test
    public void testFindTypeParameters_withBindings_returnsParams() {
        TypeBindings bindings = new TypeBindings(factory, ArrayList.class);
        JavaType[] params = factory.findTypeParameters(ArrayList.class, Collection.class, bindings);
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
    public void testMoreSpecificType_secondMoreSpecific_returnsSecond() {
        JavaType type1 = factory.constructType(List.class);
        JavaType type2 = factory.constructType(ArrayList.class);
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

    // ---------- constructArrayType ----------

    @Test
    public void testConstructArrayType_withClass_returnsArrayType() {
        ArrayType t = factory.constructArrayType(String.class);
        assertNotNull(t);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructArrayType_withJavaType_returnsArrayType() {
        JavaType elem = factory.constructType(String.class);
        ArrayType t = factory.constructArrayType(elem);
        assertNotNull(t);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    // ---------- constructCollectionType ----------

    @Test
    public void testConstructCollectionType_withClassElement_returnsCollectionType() {
        CollectionType t = factory.constructCollectionType(List.class, String.class);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructCollectionType_withJavaTypeElement_returnsCollectionType() {
        JavaType elem = factory.constructType(String.class);
        CollectionType t = factory.constructCollectionType(List.class, elem);
        assertEquals(String.class, t.getContentType().getRawClass());
    }

    // ---------- constructCollectionLikeType ----------

    @Test
    public void testConstructCollectionLikeType_withClassElement() {
        CollectionLikeType t = factory.constructCollectionLikeType(List.class, String.class);
        assertNotNull(t);
    }

    @Test
    public void testConstructCollectionLikeType_withJavaTypeElement() {
        JavaType elem = factory.constructType(String.class);
        CollectionLikeType t = factory.constructCollectionLikeType(List.class, elem);
        assertNotNull(t);
    }

    // ---------- constructMapType ----------

    @Test
    public void testConstructMapType_withJavaTypeKeyValue() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        MapType t = factory.constructMapType(HashMap.class, keyType, valType);
        assertNotNull(t);
    }

    @Test
    public void testConstructMapType_withClassKeyValue() {
        MapType t = factory.constructMapType(HashMap.class, String.class, Integer.class);
        assertNotNull(t);
    }

    // ---------- constructMapLikeType ----------

    @Test
    public void testConstructMapLikeType_withJavaTypeKeyValue() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        MapLikeType t = factory.constructMapLikeType(HashMap.class, keyType, valType);
        assertNotNull(t);
    }

    @Test
    public void testConstructMapLikeType_withClassKeyValue() {
        MapLikeType t = factory.constructMapLikeType(HashMap.class, String.class, Integer.class);
        assertNotNull(t);
    }

    // ---------- constructSimpleType ----------

    @Test
    public void testConstructSimpleType_deprecatedVariant_returnsSimpleType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        JavaType t = factory.constructSimpleType(HashMap.class, new JavaType[] { keyType, valType });
        assertNotNull(t);
    }

    @Test
    public void testConstructSimpleType_withParameterTarget_returnsSimpleType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        JavaType t = factory.constructSimpleType(HashMap.class, Map.class, new JavaType[] { keyType, valType });
        assertNotNull(t);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructSimpleType_mismatchedParamCount_throwsException() {
        JavaType elem = factory.constructType(String.class);
        factory.constructSimpleType(ArrayList.class, ArrayList.class, new JavaType[] { elem, elem });
    }

    // ---------- uncheckedSimpleType ----------

    @Test
    public void testUncheckedSimpleType_returnsSimpleTypeForClass() {
        JavaType t = factory.uncheckedSimpleType(Object.class);
        assertEquals(Object.class, t.getRawClass());
    }

    // ---------- constructParametrizedType (Class...) ----------

    @Test
    public void testConstructParametrizedType_withClassesForList_returnsCollectionType() {
        JavaType t = factory.constructParametrizedType(List.class, List.class, String.class);
        assertTrue(t instanceof CollectionType);
    }

    @Test
    public void testConstructParametrizedType_withClassesForMap_returnsMapType() {
        JavaType t = factory.constructParametrizedType(Map.class, Map.class, String.class, Integer.class);
        assertTrue(t instanceof MapType);
    }

    @Test
    public void testConstructParametricType_deprecatedWithClasses_returnsCollectionType() {
        JavaType t = factory.constructParametricType(List.class, String.class);
        assertTrue(t instanceof CollectionType);
    }

    // ---------- constructParametrizedType (JavaType...) ----------

    @Test
    public void testConstructParametrizedType_withJavaTypesArray_returnsArrayType() {
        JavaType elem = factory.constructType(String.class);
        JavaType t = factory.constructParametrizedType(String[].class, String[].class, elem);
        assertTrue(t instanceof ArrayType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_arrayWrongParamCount_throwsException() {
        JavaType elem = factory.constructType(String.class);
        factory.constructParametrizedType(String[].class, String[].class, elem, elem);
    }

    @Test
    public void testConstructParametrizedType_withJavaTypesMap_returnsMapType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        JavaType t = factory.constructParametrizedType(HashMap.class, Map.class, keyType, valType);
        assertTrue(t instanceof MapType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_mapWrongParamCount_throwsException() {
        JavaType keyType = factory.constructType(String.class);
        factory.constructParametrizedType(HashMap.class, Map.class, keyType);
    }

    @Test
    public void testConstructParametrizedType_withJavaTypesCollection_returnsCollectionType() {
        JavaType elem = factory.constructType(String.class);
        JavaType t = factory.constructParametrizedType(ArrayList.class, Collection.class, elem);
        assertTrue(t instanceof CollectionType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructParametrizedType_collectionWrongParamCount_throwsException() {
        JavaType elem = factory.constructType(String.class);
        factory.constructParametrizedType(ArrayList.class, Collection.class, elem, elem);
    }

    @Test
    public void testConstructParametrizedType_withJavaTypesSimple_returnsSimpleType() {
        JavaType keyType = factory.constructType(String.class);
        JavaType valType = factory.constructType(Integer.class);
        JavaType t = factory.constructParametrizedType(HashMap.class, Map.class, keyType, valType);
        assertNotNull(t);
    }

    @Test
    public void testConstructParametricType_deprecatedWithJavaTypes_returnsCollectionType() {
        JavaType elem = factory.constructType(String.class);
        JavaType t = factory.constructParametricType(ArrayList.class, elem);
        assertTrue(t instanceof CollectionType);
    }

    // ---------- raw variants ----------

    @Test
    public void testConstructRawCollectionType_returnsCollectionTypeWithUnknownContent() {
        CollectionType t = factory.constructRawCollectionType(ArrayList.class);
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType_returnsCollectionLikeType() {
        CollectionLikeType t = factory.constructRawCollectionLikeType(ArrayList.class);
        assertNotNull(t);
    }

    @Test
    public void testConstructRawMapType_returnsMapTypeWithUnknownParams() {
        MapType t = factory.constructRawMapType(HashMap.class);
        assertEquals(Object.class, t.getKeyType().getRawClass());
        assertEquals(Object.class, t.getContentType().getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType_returnsMapLikeType() {
        MapLikeType t = factory.constructRawMapLikeType(HashMap.class);
        assertNotNull(t);
    }

    // ---------- withModifier ----------

    @Test
    public void testWithModifier_null_returnsNewFactoryInstance() {
        TypeFactory f2 = factory.withModifier(null);
        assertNotNull(f2);
        assertNotSame(factory, f2);
    }

    @Test
    public void testWithModifier_nonNull_addsModifierAndAppliesIt() {
        TypeModifier mod = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory f2 = factory.withModifier(mod);
        assertNotNull(f2);
        JavaType t = f2.constructType(String.class);
        assertNotNull(t);

        // add another modifier to hit branch where _modifiers already non-null
        TypeModifier mod2 = new TypeModifier() {
            @Override
            public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                return type;
            }
        };
        TypeFactory f3 = f2.withModifier(mod2);
        assertNotNull(f3);
        JavaType t2 = f3.constructType(Integer.class);
        assertNotNull(t2);
    }

    // ---------- clearCache ----------

    @Test
    public void testClearCache_doesNotThrow() {
        factory.constructType(String.class);
        factory.clearCache();
        JavaType t = factory.constructType(String.class);
        assertNotNull(t);
    }

    // helper enum for enum-type tests
    enum SampleEnum { A, B }
}
