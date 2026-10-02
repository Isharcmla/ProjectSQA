import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;

public class SimpleAbstractTypeResolverTest
{
    private SimpleAbstractTypeResolver resolver;
    private ObjectMapper mapper;
    private DeserializationConfig config;

    // Helper concrete subclass of ArrayList (which is itself concrete)
    private static class MyArrayList extends ArrayList<Object> { }

    @Before
    public void setUp()
    {
        resolver = new SimpleAbstractTypeResolver();
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
    }

    // ---------------------------------------------------------------
    // addMapping() tests
    // ---------------------------------------------------------------

    @Test
    public void addMapping_normalAbstractSuperType_returnsSameResolverInstance()
    {
        SimpleAbstractTypeResolver returned = resolver.addMapping(List.class, ArrayList.class);
        assertSame("addMapping should return same instance for chaining", resolver, returned);
    }

    @Test
    public void addMapping_multipleMappings_chainingWorks()
    {
        SimpleAbstractTypeResolver returned = resolver
                .addMapping(List.class, ArrayList.class)
                .addMapping(Collection.class, ArrayList.class);
        assertSame(resolver, returned);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMapping_superTypeSameAsSubType_throwsIllegalArgumentException()
    {
        resolver.addMapping(List.class, List.class);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Test(expected = IllegalArgumentException.class)
    public void addMapping_subTypeNotAssignableFromSuperType_throwsIllegalArgumentException()
    {
        // Using raw types to bypass compile-time generic checks
        Class rawSuper = List.class;
        Class rawSub = String.class;
        resolver.addMapping(rawSuper, rawSub);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addMapping_superTypeNotAbstract_throwsIllegalArgumentException()
    {
        // ArrayList is concrete (not abstract), MyArrayList is a valid subtype
        resolver.addMapping(ArrayList.class, MyArrayList.class);
    }

    @Test(expected = NullPointerException.class)
    public void addMapping_nullSuperType_throwsNullPointerException()
    {
        resolver.addMapping(null, ArrayList.class);
    }

    // ---------------------------------------------------------------
    // findTypeMapping() tests
    // ---------------------------------------------------------------

    @Test
    public void findTypeMapping_mappingExists_returnsNarrowedJavaType()
    {
        resolver.addMapping(List.class, ArrayList.class);

        JavaType listType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = resolver.findTypeMapping(config, listType);

        assertNotNull("Expected a narrowed JavaType when mapping exists", result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void findTypeMapping_noMappingExists_returnsNull()
    {
        JavaType listType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = resolver.findTypeMapping(config, listType);

        assertNull("Expected null when no mapping exists for the type", result);
    }

    @Test
    public void findTypeMapping_mappingForDifferentAbstractType_returnsCorrectMapping()
    {
        resolver.addMapping(Collection.class, ArrayList.class);
        resolver.addMapping(List.class, MyArrayList.class);

        JavaType collectionType = mapper.getTypeFactory().constructType(Collection.class);
        JavaType listType = mapper.getTypeFactory().constructType(List.class);

        JavaType collectionResult = resolver.findTypeMapping(config, collectionType);
        JavaType listResult = resolver.findTypeMapping(config, listType);

        assertNotNull(collectionResult);
        assertEquals(ArrayList.class, collectionResult.getRawClass());

        assertNotNull(listResult);
        assertEquals(MyArrayList.class, listResult.getRawClass());
    }

    @Test
    public void findTypeMapping_concreteTypeWithoutMapping_returnsNull()
    {
        // Concrete type not registered at all
        JavaType arrayListType = mapper.getTypeFactory().constructType(ArrayList.class);
        JavaType result = resolver.findTypeMapping(config, arrayListType);
        assertNull(result);
    }

    // ---------------------------------------------------------------
    // resolveAbstractType() tests
    // ---------------------------------------------------------------

    @Test
    public void resolveAbstractType_anyInput_alwaysReturnsNull()
    {
        JavaType listType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = resolver.resolveAbstractType(config, listType);
        assertNull("resolveAbstractType should always return null", result);
    }

    @Test
    public void resolveAbstractType_withMappingsPresent_stillReturnsNull()
    {
        resolver.addMapping(List.class, ArrayList.class);
        JavaType listType = mapper.getTypeFactory().constructType(List.class);
        JavaType result = resolver.resolveAbstractType(config, listType);
        assertNull(result);
    }
}
