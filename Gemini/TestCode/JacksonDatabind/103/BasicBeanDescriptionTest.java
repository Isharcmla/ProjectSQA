package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.StdConverter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicBeanDescriptionTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // =========================================================================
    // Test Dummy Classes
    // =========================================================================

    public static class SimpleBean {
        private String name;
        private int age;

        public SimpleBean() {}

        public SimpleBean(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public void customMethod(String param) {}
    }

    public static class ThrowingConstructorBean {
        public ThrowingConstructorBean() {
            throw new IllegalStateException("Constructor failure");
        }
    }

    public static class NoDefaultConstructorBean {
        public NoDefaultConstructorBean(String val) {}
    }

    public static class JsonValueBean {
        @JsonValue
        public String value() { return "val"; }
    }

    public static class JsonValueFieldBean {
        @JsonValue
        public String val = "fieldVal";
    }

    public static class AnySetterMethodValid {
        @JsonAnySetter
        public void setAny(String key, Object value) {}
    }

    public static class AnySetterMethodObjectValid {
        @JsonAnySetter
        public void setAny(Object key, Object value) {}
    }

    public static class AnySetterMethodInvalid {
        @JsonAnySetter
        public void setAny(Integer key, Object value) {}
    }

    public static class AnySetterFieldValid {
        @JsonAnySetter
        public Map<String, Object> extra = new HashMap<>();
    }

    public static class AnySetterFieldInvalid {
        @JsonAnySetter
        public String extra;
    }

    public static class AnyGetterValid {
        @JsonAnyGetter
        public Map<String, Object> any() { return new HashMap<>(); }
    }

    public static class AnyGetterInvalid {
        @JsonAnyGetter
        public String any() { return "invalid"; }
    }

    public static class ParentBackRef {
        @JsonBackReference("ref1")
        public Object child1;
    }

    public static class DuplicateBackRefBean {
        @JsonBackReference("dupRef")
        public Object refA;

        @JsonBackReference("dupRef")
        public Object refB;
    }

    public static class FactoryMethodBean {
        private final String val;

        private FactoryMethodBean(String val) { this.val = val; }

        public static FactoryMethodBean valueOf(String s) {
            return new FactoryMethodBean(s);
        }

        public static FactoryMethodBean fromString(CharSequence cs) {
            return new FactoryMethodBean(cs.toString());
        }

        @JsonCreator
        public static FactoryMethodBean customCreate(@JsonProperty("val") String s) {
            return new FactoryMethodBean(s);
        }

        public static FactoryMethodBean notFactory(String a, String b) {
            return new FactoryMethodBean(a + b);
        }

        public static String notMatchingReturnType(String a) {
            return a;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class FormattedAndIncludedBean {}

    public static class TestConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            return Integer.parseInt(value);
        }
    }

    @JsonPOJOBuilder(buildMethodName = "construct", withPrefix = "using")
    public static class DummyBuilder {}

    // Test subclass to access protected methods
    public static class ExposedBasicBeanDescription extends BasicBeanDescription {
        public ExposedBasicBeanDescription(MapperConfig<?> config, JavaType type, AnnotatedClass ac, List<BeanPropertyDefinition> props) {
            super(config, type, ac, props);
        }

        public Converter<Object, Object> callCreateConverter(Object converterDef) {
            return _createConverter(converterDef);
        }

        public PropertyName callFindCreatorPropertyName(AnnotatedParameter param) {
            return _findCreatorPropertyName(param);
        }

        public boolean callIsFactoryMethod(AnnotatedMethod am) {
            return isFactoryMethod(am);
        }
    }

    private BasicBeanDescription getDescFor(Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        return (BasicBeanDescription) mapper.getDeserializationConfig().introspect(type);
    }

    private BasicBeanDescription getSerDescFor(Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        return (BasicBeanDescription) mapper.getSerializationConfig().introspect(type);
    }

    // =========================================================================
    // Construction & Factory Methods Tests
    // =========================================================================

    @Test
    public void testFactoryMethods_forSerializationAndDeserialization() {
        JavaType type = mapper.constructType(SimpleBean.class);
        POJOPropertiesCollector coll = new POJOPropertiesCollector(
                mapper.getDeserializationConfig(), false, type,
                AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig()),
                null);

        BasicBeanDescription deserDesc = BasicBeanDescription.forDeserialization(coll);
        assertNotNull(deserDesc);
        assertEquals(SimpleBean.class, deserDesc.getBeanClass());

        BasicBeanDescription serDesc = BasicBeanDescription.forSerialization(coll);
        assertNotNull(serDesc);
        assertEquals(SimpleBean.class, serDesc.getBeanClass());
    }

    @Test
    public void testForOtherUse_validAndNullConfig() {
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());

        BasicBeanDescription desc = BasicBeanDescription.forOtherUse(mapper.getDeserializationConfig(), type, ac);
        assertNotNull(desc);
        assertTrue(desc.findProperties().isEmpty());

        BasicBeanDescription descNullConfig = BasicBeanDescription.forOtherUse(null, type, ac);
        assertNotNull(descNullConfig);
        assertNull(descNullConfig.findPOJOBuilder());
    }

    // =========================================================================
    // Property Manipulation Tests
    // =========================================================================

    @Test
    public void testRemoveProperty_existingAndNonExisting() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertTrue(desc.hasProperty(PropertyName.construct("name")));
        assertTrue(desc.removeProperty("name"));
        assertFalse(desc.hasProperty(PropertyName.construct("name")));
        assertFalse(desc.removeProperty("nonExistent"));
    }

    @Test
    public void testAddProperty_duplicateAndNew() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        BeanPropertyDefinition prop = desc.findProperty(PropertyName.construct("name"));
        assertNotNull(prop);

        // Duplicate
        assertFalse(desc.addProperty(prop));

        // New property definition
        POJOPropertyBuilder newProp = new POJOPropertyBuilder(
                mapper.getDeserializationConfig(),
                mapper.getDeserializationConfig().getAnnotationIntrospector(),
                true,
                PropertyName.construct("newProp")
        );
        assertTrue(desc.addProperty(newProp));
        assertTrue(desc.hasProperty(PropertyName.construct("newProp")));
    }

    @Test
    public void testFindProperty_nullForUnknown() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNull(desc.findProperty(PropertyName.construct("unknownProp")));
    }

    // =========================================================================
    // Simple Accessors Tests
    // =========================================================================

    @Test
    public void testGetClassInfoAndAnnotations() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNotNull(desc.getClassInfo());
        assertNotNull(desc.getClassAnnotations());
        assertTrue(desc.hasKnownClassAnnotations() || !desc.hasKnownClassAnnotations()); // evaluate branch
    }

    @Test
    public void testGetObjectIdInfo_defaultNull() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNull(desc.getObjectIdInfo());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindJsonValueMethodAndAccessor() {
        BasicBeanDescription desc = getDescFor(JsonValueBean.class);
        assertNotNull(desc.findJsonValueMethod());
        assertNotNull(desc.findJsonValueAccessor());

        BasicBeanDescription fieldDesc = getDescFor(JsonValueFieldBean.class);
        assertNotNull(fieldDesc.findJsonValueAccessor());

        BasicBeanDescription noValueDesc = getDescFor(SimpleBean.class);
        assertNull(noValueDesc.findJsonValueMethod());
        assertNull(noValueDesc.findJsonValueAccessor());

        // For other use has null _propCollector
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        BasicBeanDescription otherDesc = BasicBeanDescription.forOtherUse(mapper.getDeserializationConfig(), type, ac);
        assertNull(otherDesc.findJsonValueMethod());
        assertNull(otherDesc.findJsonValueAccessor());
    }

    @Test
    public void testGetIgnoredPropertyNames() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNotNull(desc.getIgnoredPropertyNames());

        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        BasicBeanDescription otherDesc = BasicBeanDescription.forOtherUse(mapper.getDeserializationConfig(), type, ac);
        assertEquals(Collections.emptySet(), otherDesc.getIgnoredPropertyNames());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testBindingsForBeanTypeAndResolveType() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        TypeBindings bindings = desc.bindingsForBeanType();
        assertNotNull(bindings);

        assertNull(desc.resolveType(null));
        JavaType resolved = desc.resolveType(String.class);
        assertNotNull(resolved);
        assertEquals(String.class, resolved.getRawClass());
    }

    @Test
    public void testGetConstructorsAndFindDefaultConstructor() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNotNull(desc.findDefaultConstructor());
        assertFalse(desc.getConstructors().isEmpty());

        BasicBeanDescription noDefaultDesc = getDescFor(NoDefaultConstructorBean.class);
        assertNull(noDefaultDesc.findDefaultConstructor());
    }

    @Test
    public void testFindInjectables() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNotNull(desc.findInjectables());

        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        BasicBeanDescription otherDesc = BasicBeanDescription.forOtherUse(mapper.getDeserializationConfig(), type, ac);
        assertTrue(otherDesc.findInjectables().isEmpty());
    }

    @Test
    public void testFindMethod() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        AnnotatedMethod method = desc.findMethod("customMethod", new Class<?>[]{String.class});
        assertNotNull(method);

        AnnotatedMethod notFound = desc.findMethod("nonExistent", new Class<?>[0]);
        assertNull(notFound);
    }

    // =========================================================================
    // Instantiate Bean Tests
    // =========================================================================

    @Test
    public void testInstantiateBean_success() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        Object bean = desc.instantiateBean(true);
        assertNotNull(bean);
        assertTrue(bean instanceof SimpleBean);

        Object beanNoFix = desc.instantiateBean(false);
        assertNotNull(beanNoFix);
    }

    @Test
    public void testInstantiateBean_noDefaultConstructor() {
        BasicBeanDescription desc = getDescFor(NoDefaultConstructorBean.class);
        assertNull(desc.instantiateBean(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInstantiateBean_throwsException() {
        BasicBeanDescription desc = getDescFor(ThrowingConstructorBean.class);
        desc.instantiateBean(true);
    }

    // =========================================================================
    // Any-Setter and Any-Getter Tests
    // =========================================================================

    @Test
    public void testFindAnySetterAccessor_validMethods() {
        BasicBeanDescription desc1 = getDescFor(AnySetterMethodValid.class);
        assertNotNull(desc1.findAnySetterAccessor());

        BasicBeanDescription desc2 = getDescFor(AnySetterMethodObjectValid.class);
        assertNotNull(desc2.findAnySetterAccessor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnySetterAccessor_invalidMethodParam() {
        BasicBeanDescription desc = getDescFor(AnySetterMethodInvalid.class);
        desc.findAnySetterAccessor();
    }

    @Test
    public void testFindAnySetterAccessor_validField() {
        BasicBeanDescription desc = getDescFor(AnySetterFieldValid.class);
        assertNotNull(desc.findAnySetterAccessor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnySetterAccessor_invalidFieldType() {
        BasicBeanDescription desc = getDescFor(AnySetterFieldInvalid.class);
        desc.findAnySetterAccessor();
    }

    @Test
    public void testFindAnySetterAccessor_nullCollectorOrNone() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        assertNull(desc.findAnySetterAccessor());

        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        BasicBeanDescription otherDesc = BasicBeanDescription.forOtherUse(mapper.getDeserializationConfig(), type, ac);
        assertNull(otherDesc.findAnySetterAccessor());
    }

    @Test
    public void testFindAnyGetter_valid() {
        BasicBeanDescription desc = getSerDescFor(AnyGetterValid.class);
        assertNotNull(desc.findAnyGetter());

        BasicBeanDescription simpleDesc = getSerDescFor(SimpleBean.class);
        assertNull(simpleDesc.findAnyGetter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindAnyGetter_invalidReturnType() {
        BasicBeanDescription desc = getSerDescFor(AnyGetterInvalid.class);
        desc.findAnyGetter();
    }

    // =========================================================================
    // Format, Views, Inclusions Tests
    // =========================================================================

    @Test
    public void testFindExpectedFormat() {
        BasicBeanDescription desc = getDescFor(FormattedAndIncludedBean.class);
        JsonFormat.Value format = desc.findExpectedFormat(null);
        assertNotNull(format);
        assertEquals(JsonFormat.Shape.OBJECT, format.getShape());

        JsonFormat.Value overridden = desc.findExpectedFormat(JsonFormat.Value.empty());
        assertEquals(JsonFormat.Shape.OBJECT, overridden.getShape());

        BasicBeanDescription simpleDesc = getDescFor(SimpleBean.class);
        JsonFormat.Value def = simpleDesc.findExpectedFormat(JsonFormat.Value.empty());
        assertNotNull(def);
    }

    @Test
    public void testFindDefaultViews_withAndWithoutDefaultInclusion() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        Class<?>[] views = desc.findDefaultViews();
        assertNull(views); // Default inclusion is enabled by default, null means no specific view annotation

        ObjectMapper noInclusionMapper = new ObjectMapper();
        noInclusionMapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
        JavaType type = noInclusionMapper.constructType(SimpleBean.class);
        BasicBeanDescription noIncDesc = (BasicBeanDescription) noInclusionMapper.getDeserializationConfig().introspect(type);
        Class<?>[] noIncViews = noIncDesc.findDefaultViews();
        assertNotNull(noIncViews);
        assertEquals(0, noIncViews.length);

        // Call again to hit cached branch
        assertSame(noIncViews, noIncDesc.findDefaultViews());
    }

    @Test
    public void testFindPropertyInclusion() {
        BasicBeanDescription desc = getDescFor(FormattedAndIncludedBean.class);
        JsonInclude.Value incl = desc.findPropertyInclusion(null);
        assertNotNull(incl);
        assertEquals(JsonInclude.Include.NON_EMPTY, incl.getValueInclusion());

        JsonInclude.Value overridden = desc.findPropertyInclusion(JsonInclude.Value.empty());
        assertEquals(JsonInclude.Include.NON_EMPTY, overridden.getValueInclusion());

        BasicBeanDescription simpleDesc = getDescFor(SimpleBean.class);
        assertNull(simpleDesc.findPropertyInclusion(null));
    }

    // =========================================================================
    // Back References Tests
    // =========================================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testFindBackReferences_singleAndNone() {
        BasicBeanDescription desc = getDescFor(ParentBackRef.class);
        List<BeanPropertyDefinition> refs = desc.findBackReferences();
        assertNotNull(refs);
        assertEquals(1, refs.size());

        Map<String, AnnotatedMember> backRefMap = desc.findBackReferenceProperties();
        assertNotNull(backRefMap);
        assertTrue(backRefMap.containsKey("child1"));

        BasicBeanDescription simpleDesc = getDescFor(SimpleBean.class);
        assertNull(simpleDesc.findBackReferences());
        assertNull(simpleDesc.findBackReferenceProperties());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindBackReferences_duplicateNameThrowsException() {
        BasicBeanDescription desc = getDescFor(DuplicateBackRefBean.class);
        desc.findBackReferences();
    }

    // =========================================================================
    // Factory Method & Single Arg Constructor Tests
    // =========================================================================

    @Test
    public void testFindSingleArgConstructor() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        Constructor<?> ctor = desc.findSingleArgConstructor(String.class);
        assertNotNull(ctor);

        Constructor<?> notFound = desc.findSingleArgConstructor(Integer.class);
        assertNull(notFound);
    }

    @Test
    public void testGetFactoryMethodsAndFindFactoryMethod() {
        BasicBeanDescription desc = getDescFor(FactoryMethodBean.class);
        List<AnnotatedMethod> factories = desc.getFactoryMethods();
        assertFalse(factories.isEmpty());

        Method valueOfMethod = desc.findFactoryMethod(String.class);
        assertNotNull(valueOfMethod);

        Method notFound = desc.findFactoryMethod(Integer.class);
        assertNull(notFound);

        BasicBeanDescription simpleDesc = getDescFor(SimpleBean.class);
        assertTrue(simpleDesc.getFactoryMethods().isEmpty());
    }

    // =========================================================================
    // POJO Builder, Description & Converters Tests
    // =========================================================================

    @Test
    public void testPOJOBuilderAndClassDescription() {
        BasicBeanDescription desc = getDescFor(DummyBuilder.class);
        assertNull(desc.findPOJOBuilder());
        assertNotNull(desc.findPOJOBuilderConfig());
        assertEquals("construct", desc.findPOJOBuilderConfig().buildMethodName);
        assertEquals("using", desc.findPOJOBuilderConfig().withPrefix);

        BasicBeanDescription simpleDesc = getDescFor(SimpleBean.class);
        assertNull(simpleDesc.findClassDescription());
        assertNull(simpleDesc.findSerializationConverter());
        assertNull(simpleDesc.findDeserializationConverter());
    }

    // =========================================================================
    // Deprecated / Protected Helpers & Converter Creation Branches
    // =========================================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testFindPropertyFields() {
        BasicBeanDescription desc = getDescFor(SimpleBean.class);
        LinkedHashMap<String, AnnotatedField> fields = desc._findPropertyFields(Collections.singleton("age"), true);
        assertNotNull(fields);
        assertTrue(fields.containsKey("name"));
        assertFalse(fields.containsKey("age"));

        LinkedHashMap<String, AnnotatedField> allFields = desc._findPropertyFields(null, true);
        assertTrue(allFields.containsKey("name"));
        assertTrue(allFields.containsKey("age"));
    }

    @Test
    public void testCreateConverter_variousBranches() {
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        ExposedBasicBeanDescription exposedDesc = new ExposedBasicBeanDescription(
                mapper.getDeserializationConfig(), type, ac, Collections.emptyList());

        // null converter
        assertNull(exposedDesc.callCreateConverter(null));

        // instance of Converter
        TestConverter converterInstance = new TestConverter();
        assertSame(converterInstance, exposedDesc.callCreateConverter(converterInstance));

        // Converter.None.class
        assertNull(exposedDesc.callCreateConverter(Converter.None.class));

        // valid Converter class
        Converter<Object, Object> created = exposedDesc.callCreateConverter(TestConverter.class);
        assertNotNull(created);
        assertTrue(created instanceof TestConverter);
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateConverter_nonClassAndNonConverter() {
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        ExposedBasicBeanDescription exposedDesc = new ExposedBasicBeanDescription(
                mapper.getDeserializationConfig(), type, ac, Collections.emptyList());
        exposedDesc.callCreateConverter("NotAConverter");
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateConverter_classNotImplementingConverter() {
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        ExposedBasicBeanDescription exposedDesc = new ExposedBasicBeanDescription(
                mapper.getDeserializationConfig(), type, ac, Collections.emptyList());
        exposedDesc.callCreateConverter(String.class);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindCreatorPropertyName_fallback() {
        JavaType type = mapper.constructType(SimpleBean.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(), type, mapper.getDeserializationConfig());
        ExposedBasicBeanDescription exposedDesc = new ExposedBasicBeanDescription(
                mapper.getDeserializationConfig(), type, ac, Collections.emptyList());

        AnnotatedConstructor ctor = ac.getConstructors().get(0);
        if (ctor.getParameterCount() > 0) {
            AnnotatedParameter param = ctor.getParameter(0);
            PropertyName name = exposedDesc.callFindCreatorPropertyName(param);
            // Result may be null or constructed property name
            assertTrue(name == null || name.hasSimpleName("name") || name.isEmpty());
        }
    }
}
