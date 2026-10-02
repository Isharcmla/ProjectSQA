package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.cfg.MapperConfig;

public class POJOPropertiesCollectorTest {

    // ----------------------------------------------------------------------
    // Helper POJOs for testing various features and edge cases
    // ----------------------------------------------------------------------

    static class SimpleBean {
        private int x;
        public String y;

        public SimpleBean() { }

        public SimpleBean(int x, String y) {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public void setX(int x) { this.x = x; }
        public boolean isVisible() { return true; }
        public void setVisible(boolean v) { }
    }

    static class SingleJsonValueBean {
        @JsonValue
        public String value() { return "test"; }
    }

    static class MultipleJsonValueBean {
        @JsonValue
        public String value1() { return "1"; }
        @JsonValue
        public String value2() { return "2"; }
    }

    static class SingleAnyGetterBean {
        @JsonAnyGetter
        public Map<String, Object> any() { return Collections.emptyMap(); }
    }

    static class MultipleAnyGetterBean {
        @JsonAnyGetter
        public Map<String, Object> any1() { return Collections.emptyMap(); }
        @JsonAnyGetter
        public Map<String, Object> any2() { return Collections.emptyMap(); }
    }

    static class SingleAnySetterBean {
        @JsonAnySetter
        public void setAny(String name, Object value) { }
    }

    static class MultipleAnySetterBean {
        @JsonAnySetter
        public void setAny1(String name, Object value) { }
        @JsonAnySetter
        public void setAny2(String name, Object value) { }
    }

    static class SingleAnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> anyField = new HashMap<String, Object>();
    }

    static class MultipleAnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> any1 = new HashMap<String, Object>();
        @JsonAnySetter
        public Map<String, Object> any2 = new HashMap<String, Object>();
    }

    static class InjectBean {
        @JacksonInject("injectId1")
        public String fieldInject;

        @JacksonInject("injectId2")
        public void setMethodInject(String s) { }

        public void invalidInjectMethod(String a, String b) { }
    }

    static class DuplicateInjectBean {
        @JacksonInject("dupId")
        public String field1;

        @JacksonInject("dupId")
        public void setField2(String val) { }
    }

    static class IgnoredBean {
        @JsonIgnore
        public String ignoredField;

        public transient String transientField;

        @JsonProperty("explicitTransient")
        public transient String explicitTransient;

        public String normalField;

        @JsonIgnore
        public String getIgnoredGetter() { return null; }

        public void setIgnoredGetter(String val) { }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    static class IdentityBean {
        public int id;
    }

    @JsonDeserialize(builder = SimpleBuilder.class)
    static class BuiltBean { }

    static class SimpleBuilder {
        public BuiltBean build() { return new BuiltBean(); }
    }

    @JsonPropertyOrder({"propB", "propA", "propC"})
    static class OrderedBean {
        public int propA;
        public int propB;
        public int propC;
    }

    static class CreatorBean {
        public int a;
        public String b;

        @JsonCreator
        public CreatorBean(@JsonProperty("a") int a, @JsonProperty("b") String b) {
            this.a = a;
            this.b = b;
        }

        @JsonCreator
        public static CreatorBean create(@JsonProperty("b") String b) {
            return new CreatorBean(0, b);
        }
    }

    class NonStaticInnerClass {
        public int a;
        public NonStaticInnerClass(int a) { this.a = a; }
    }

    static class FinalFieldBean {
        public final String finalField = "final";
        public String normalField;
    }

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class SnakeCaseBean {
        public String someProperty;
        public String anotherProperty;
    }

    static class InvalidNamingStrategyBean {
        public String val;
    }

    static class CustomAnnotationNamingBean {
        @JsonProperty("")
        public String emptyNameField;

        @JsonProperty("")
        public String getEmptyNameProp() { return "empty"; }

        @JsonProperty("")
        public void setEmptyNameProp(String v) { }
    }

    // ----------------------------------------------------------------------
    // Helper method to create POJOPropertiesCollector
    // ----------------------------------------------------------------------

    private POJOPropertiesCollector collectorFor(ObjectMapper mapper, Class<?> cls, boolean forSerialization) {
        JavaType type = mapper.constructType(cls);
        MapperConfig<?> config = forSerialization ? mapper.getSerializationConfig() : mapper.getDeserializationConfig();
        AnnotatedClass ac = config.introspectClassAnnotations(cls).getClassInfo();
        return new POJOPropertiesCollector(config, forSerialization, type, ac, "set");
    }

    private POJOPropertiesCollector collectorFor(MapperConfig<?> config, Class<?> cls, boolean forSerialization, String prefix) {
        JavaType type = config.constructType(cls);
        AnnotatedClass ac = config.introspectClassAnnotations(cls).getClassInfo();
        return new POJOPropertiesCollector(config, forSerialization, type, ac, prefix);
    }

    // ----------------------------------------------------------------------
    // Tests
    // ----------------------------------------------------------------------

    @Test
    public void testBasicGettersAndLifecycle_normal_success() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);

        Assert.assertNotNull(coll.getConfig());
        Assert.assertNotNull(coll.getType());
        Assert.assertNotNull(coll.getClassDef());
        Assert.assertNotNull(coll.getAnnotationIntrospector());
        Assert.assertSame(coll, coll.collect());

        List<BeanPropertyDefinition> props = coll.getProperties();
        Assert.assertNotNull(props);
        Assert.assertFalse(props.isEmpty());
        Assert.assertNotNull(coll.getPropertyMap());
    }

    @Test
    public void testCollectAll_serializationAndDeserialization_propertiesFound() {
        ObjectMapper mapper = new ObjectMapper();

        POJOPropertiesCollector serColl = collectorFor(mapper, SimpleBean.class, true);
        Map<String, POJOPropertyBuilder> serProps = serColl.getPropertyMap();
        Assert.assertTrue(serProps.containsKey("x"));
        Assert.assertTrue(serProps.containsKey("y"));
        Assert.assertTrue(serProps.containsKey("visible"));

        POJOPropertiesCollector deserColl = collectorFor(mapper, SimpleBean.class, false);
        Map<String, POJOPropertyBuilder> deserProps = deserColl.getPropertyMap();
        Assert.assertTrue(deserProps.containsKey("x"));
        Assert.assertTrue(deserProps.containsKey("y"));
        Assert.assertTrue(deserProps.containsKey("visible"));
    }

    @Test
    public void testJsonValueMethod_single_returnsMethod() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SingleJsonValueBean.class, true);
        AnnotatedMethod m = coll.getJsonValueMethod();
        Assert.assertNotNull(m);
        Assert.assertEquals("value", m.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJsonValueMethod_multiple_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, MultipleJsonValueBean.class, true);
        coll.getJsonValueMethod();
    }

    @Test
    public void testJsonValueMethod_none_returnsNull() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        Assert.assertNull(coll.getJsonValueMethod());
    }

    @Test
    public void testAnyGetter_single_returnsMember() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SingleAnyGetterBean.class, true);
        AnnotatedMember anyGetter = coll.getAnyGetter();
        Assert.assertNotNull(anyGetter);
        Assert.assertEquals("any", anyGetter.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnyGetter_multiple_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, MultipleAnyGetterBean.class, true);
        coll.getAnyGetter();
    }

    @Test
    public void testAnyGetter_none_returnsNull() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        Assert.assertNull(coll.getAnyGetter());
    }

    @Test
    public void testAnySetterMethod_single_returnsMethod() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SingleAnySetterBean.class, false);
        AnnotatedMethod anySetter = coll.getAnySetterMethod();
        Assert.assertNotNull(anySetter);
        Assert.assertEquals("setAny", anySetter.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnySetterMethod_multiple_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, MultipleAnySetterBean.class, false);
        coll.getAnySetterMethod();
    }

    @Test
    public void testAnySetterMethod_none_returnsNull() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, false);
        Assert.assertNull(coll.getAnySetterMethod());
    }

    @Test
    public void testAnySetterField_single_returnsField() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SingleAnySetterFieldBean.class, false);
        AnnotatedMember field = coll.getAnySetterField();
        Assert.assertNotNull(field);
        Assert.assertEquals("anyField", field.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAnySetterField_multiple_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, MultipleAnySetterFieldBean.class, false);
        coll.getAnySetterField();
    }

    @Test
    public void testAnySetterField_none_returnsNull() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, false);
        Assert.assertNull(coll.getAnySetterField());
    }

    @Test
    public void testInjectables_normal_success() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, InjectBean.class, false);
        Map<Object, AnnotatedMember> injectables = coll.getInjectables();
        Assert.assertNotNull(injectables);
        Assert.assertEquals(2, injectables.size());
        Assert.assertTrue(injectables.containsKey("injectId1"));
        Assert.assertTrue(injectables.containsKey("injectId2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInjectables_duplicateId_throwsException() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, DuplicateInjectBean.class, false);
        coll.getInjectables();
    }

    @Test
    public void testIgnoredProperties_andTransient_collectedProperly() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        POJOPropertiesCollector coll = collectorFor(mapper, IgnoredBean.class, false);
        coll.getProperties();

        Set<String> ignored = coll.getIgnoredPropertyNames();
        Assert.assertNotNull(ignored);
        Assert.assertTrue(ignored.contains("ignoredField"));
        Assert.assertTrue(ignored.contains("transientField"));

        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertFalse(props.containsKey("ignoredField"));
        Assert.assertTrue(props.containsKey("explicitTransient"));
        Assert.assertTrue(props.containsKey("normalField"));
    }

    @Test
    public void testObjectIdInfo_defined_returnsInfo() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, IdentityBean.class, true);
        ObjectIdInfo info = coll.getObjectIdInfo();
        Assert.assertNotNull(info);
        Assert.assertEquals("id", info.getPropertyName().getSimpleName());
        Assert.assertTrue(info.getAlwaysAsId());
    }

    @Test
    public void testObjectIdInfo_none_returnsNull() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        Assert.assertNull(coll.getObjectIdInfo());
    }

    @Test
    public void testFindPOJOBuilderClass_definedAndNone() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector withBuilder = collectorFor(mapper, BuiltBean.class, false);
        Assert.assertEquals(SimpleBuilder.class, withBuilder.findPOJOBuilderClass());

        POJOPropertiesCollector noBuilder = collectorFor(mapper, SimpleBean.class, false);
        Assert.assertNull(noBuilder.findPOJOBuilderClass());
    }

    @Test
    public void testSortingProperties_withExplicitOrder_sortedCorrectly() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, OrderedBean.class, true);
        List<BeanPropertyDefinition> props = coll.getProperties();
        Assert.assertEquals(3, props.size());
        Assert.assertEquals("propB", props.get(0).getName());
        Assert.assertEquals("propA", props.get(1).getName());
        Assert.assertEquals("propC", props.get(2).getName());
    }

    @Test
    public void testSortingProperties_alphabetical_sortedCorrectly() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        List<BeanPropertyDefinition> props = coll.getProperties();
        List<String> names = new ArrayList<String>();
        for (BeanPropertyDefinition p : props) {
            names.add(p.getName());
        }
        List<String> sortedNames = new ArrayList<String>(names);
        Collections.sort(sortedNames);
        Assert.assertEquals(sortedNames, names);
    }

    @Test
    public void testCreators_constructorAndFactoryMethod_recognized() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, CreatorBean.class, false);
        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertTrue(props.containsKey("a"));
        Assert.assertTrue(props.containsKey("b"));
        Assert.assertTrue(props.get("a").hasConstructorParameter());
        Assert.assertTrue(props.get("b").hasConstructorParameter());
    }

    @Test
    public void testNonStaticInnerClass_skipsCreators() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, NonStaticInnerClass.class, false);
        List<BeanPropertyDefinition> props = coll.getProperties();
        Assert.assertNotNull(props);
    }

    @Test
    public void testFinalFields_pruningOnDeserialization() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS);

        POJOPropertiesCollector deserColl = collectorFor(mapper, FinalFieldBean.class, false);
        Map<String, POJOPropertyBuilder> deserProps = deserColl.getPropertyMap();
        Assert.assertFalse(deserProps.containsKey("finalField"));
        Assert.assertTrue(deserProps.containsKey("normalField"));

        POJOPropertiesCollector serColl = collectorFor(mapper, FinalFieldBean.class, true);
        Map<String, POJOPropertyBuilder> serProps = serColl.getPropertyMap();
        Assert.assertTrue(serProps.containsKey("finalField"));
    }

    @Test
    public void testNamingStrategy_viaAnnotation_renamedProperly() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, SnakeCaseBean.class, true);
        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertTrue(props.containsKey("some_property"));
        Assert.assertTrue(props.containsKey("another_property"));
    }

    @Test
    public void testNamingStrategy_viaConfig_renamedProperly() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, false);
        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertTrue(props.containsKey("visible") || props.containsKey("is_visible"));
    }

    @Test
    public void testEmptyPropertyNames_handledGracefully() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper, CustomAnnotationNamingBean.class, true);
        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertTrue(props.containsKey("emptyNameField"));
        Assert.assertTrue(props.containsKey("emptyNameProp"));
    }

    @Test
    public void testWrapperRenaming_featureEnabled() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME);
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        Assert.assertNotNull(coll.getProperties());
    }

    @Test
    public void testDisabledAnnotationProcessing_handledGracefully() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        POJOPropertiesCollector coll = collectorFor(mapper, IgnoredBean.class, true);

        Assert.assertNull(coll.getAnnotationIntrospector());
        Assert.assertNull(coll.getObjectIdInfo());
        Assert.assertNull(coll.findPOJOBuilderClass());

        Map<String, POJOPropertyBuilder> props = coll.getPropertyMap();
        Assert.assertTrue(props.containsKey("ignoredField"));
    }

    @Test
    public void testCustomMutatorPrefix_handledCorrectly() {
        ObjectMapper mapper = new ObjectMapper();
        POJOPropertiesCollector coll = collectorFor(mapper.getDeserializationConfig(), SimpleBean.class, false, "with");
        Assert.assertNotNull(coll.getProperties());
    }

    @Test
    public void testStdBeanNaming_featureEnabled() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
        POJOPropertiesCollector coll = collectorFor(mapper, SimpleBean.class, true);
        Assert.assertNotNull(coll.getProperties());
    }
}
