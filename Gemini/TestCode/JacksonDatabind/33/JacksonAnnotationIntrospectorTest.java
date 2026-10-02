package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;
    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
    }

    private AnnotatedClass getAnnotatedClass(Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        BeanDescription desc = serConfig.introspect(type);
        return desc.getClassInfo();
    }

    // ==========================================
    // Annotations and Classes for Testing
    // ==========================================

    @JacksonAnnotationsInside
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    @interface BundleAnn {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    @interface NonBundleAnn {}

    enum TestEnum {
        @JsonProperty("explicit_a")
        A,
        @JsonProperty("")
        EMPTY_PROP,
        DEFAULT_VAL
    }

    @JsonRootName(value = "root", namespace = "http://example.com")
    static class RootWithNamespace {}

    @JsonRootName(value = "rootEmptyNs", namespace = "")
    static class RootWithEmptyNamespace {}

    static class PlainClass {}

    @JsonIgnoreProperties(value = {"ignored1", "ignored2"}, ignoreUnknown = true, allowGetters = true, allowSetters = false)
    static class IgnorePropertiesClass {}

    @JsonIgnoreProperties(value = {"ignored3"}, allowGetters = false, allowSetters = true)
    static class IgnorePropertiesSetterClass {}

    @JsonIgnoreType(true)
    static class IgnorableTypeClass {}

    @JsonFilter("filter123")
    static class FilteredClass {}

    @JsonFilter("")
    static class EmptyFilterClass {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    static class NamingClass {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectClass {}

    static class GeneralMemberClass {
        @JsonProperty(value = "customName", index = 3, defaultValue = "defVal", required = true, access = JsonProperty.Access.READ_ONLY)
        @JsonPropertyDescription("desc text")
        public String field1;

        @JsonProperty(index = JsonProperty.INDEX_UNKNOWN, defaultValue = "")
        public String fieldDefault;

        @JsonIgnore(true)
        public String fieldIgnored;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        public Date formatField;

        @JsonManagedReference("ref")
        public GeneralMemberClass managedRef;

        @JsonBackReference("ref")
        public GeneralMemberClass backRef;

        @JsonUnwrapped(prefix = "pre_", suffix = "_post", enabled = true)
        public PlainClass unwrappedEnabled;

        @JsonUnwrapped(enabled = false)
        public PlainClass unwrappedDisabled;

        @JacksonInject("injectNamed")
        public String injectField;

        @JacksonInject("")
        public String injectUnnamedField;

        @JsonView({String.class, Integer.class})
        public String viewField;

        @JacksonInject("")
        public String getInjectMethod0() { return null; }

        @JacksonInject("")
        public void setInjectMethod1(Long val) {}
    }

    // Type resolution classes
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", defaultImpl = ConcreteType.class, visible = true)
    @JsonSubTypes({@JsonSubTypes.Type(value = ConcreteType.class, name = "concrete")})
    @JsonTypeName("baseTypeName")
    static class BasePolymorphic {}

    static class ConcreteType extends BasePolymorphic {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    static class NoneTypeInfoClass {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY)
    static class ExternalPropClass {}

    static class DummyTypeResolverBuilder extends StdTypeResolverBuilder {}
    static class DummyTypeIdResolver implements TypeIdResolver {
        @Override public void init(JavaType baseType) {}
        @Override public String idFromValue(Object value) { return null; }
        @Override public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }
        @Override public String idFromBaseType() { return null; }
        @Override public JavaType typeFromId(DatabindContext context, String id) { return null; }
        @Override public String getDescForKnownTypeIds() { return null; }
        @Override public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
    @JsonTypeResolver(DummyTypeResolverBuilder.class)
    @JsonTypeIdResolver(DummyTypeIdResolver.class)
    static class CustomResolverClass {}

    @JsonTypeResolver(DummyTypeResolverBuilder.class)
    static class CustomResolverNoInfoClass {}

    static class ContainerHolder {
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
        public List<String> list;

        @JsonTypeId
        public String typeIdField;
    }

    // Identity info
    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id", scope = ObjectIdInfoClass.class, resolver = SimpleObjectIdResolver.class)
    @JsonIdentityReference(alwaysAsId = true)
    static class ObjectIdInfoClass {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class ObjectIdNoneClass {}

    // Serialization / Deserialization
    static class CustomSerializer extends StdSerializer<Object> {
        public CustomSerializer() { super(Object.class); }
        @Override public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider provider) {}
    }
    static class CustomDeserializer extends StdDeserializer<Object> {
        public CustomDeserializer() { super(Object.class); }
        @Override public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
    }
    static class CustomKeyDeserializer extends StdKeyDeserializer {
        public CustomKeyDeserializer() { super(0, String.class); }
    }
    static class DummyConverter extends StdConverter<Object, Object> {
        @Override public Object convert(Object value) { return value; }
    }

    @JsonSerialize(
        using = CustomSerializer.class,
        keyUsing = CustomSerializer.class,
        contentUsing = CustomSerializer.class,
        nullsUsing = CustomSerializer.class,
        as = Object.class,
        keyAs = Object.class,
        contentAs = Object.class,
        typing = JsonSerialize.Typing.STATIC,
        converter = DummyConverter.class,
        contentConverter = DummyConverter.class,
        include = JsonSerialize.Inclusion.NON_NULL
    )
    @JsonDeserialize(
        using = CustomDeserializer.class,
        keyUsing = CustomKeyDeserializer.class,
        contentUsing = CustomDeserializer.class,
        as = Object.class,
        keyAs = Object.class,
        contentAs = Object.class,
        converter = DummyConverter.class,
        contentConverter = DummyConverter.class,
        builder = CustomBuilder.class
    )
    static class FullSerDeserClass {}

    static class CustomBuilder {}

    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    static class POJOBuilderConfigClass {}

    @JsonValueInstantiator(com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.class)
    static class ValueInstantiatorClass {}

    @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
    static class SerAlways {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
    static class SerNonDefault {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
    static class SerNonEmpty {}
    @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION)
    static class SerDefaultInc {}

    @JsonInclude(value = JsonInclude.Include.NON_EMPTY, content = JsonInclude.Include.NON_NULL)
    static class IncludeClass {}

    @JsonPropertyOrder(value = {"b", "a"}, alphabetic = true)
    static class OrderClass {
        public String a;
        public String b;
    }

    @JsonPropertyOrder(alphabetic = false)
    static class NonAlphaOrderClass {}

    static class CustomVirtualWriter extends VirtualBeanPropertyWriter {
        public CustomVirtualWriter() { super(); }
        public CustomVirtualWriter(BeanPropertyDefinition propDef, Annotations contextAnnotations, JavaType declaredType) {
            super(propDef, contextAnnotations, declaredType);
        }
        @Override protected Object value(Object bean, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider prov) { return "val"; }
        @Override public VirtualBeanPropertyWriter withConfig(MapperConfig<?> config, AnnotatedClass declaringClass, BeanPropertyDefinition propDef, JavaType type) {
            return new CustomVirtualWriter(propDef, declaringClass.getAnnotations(), type);
        }
    }

    @JsonAppend(
        attrs = {
            @JsonAppend.Attr(value = "attr1", propName = "propAttr1", propNamespace = "ns1", required = true, include = JsonInclude.Include.NON_NULL),
            @JsonAppend.Attr(value = "attr2", propName = "", propNamespace = "")
        },
        props = {
            @JsonAppend.Prop(value = CustomVirtualWriter.class, name = "vprop1", namespace = "vns1", type = String.class, required = true, include = JsonInclude.Include.ALWAYS)
        },
        prepend = true
    )
    static class VirtualAppendPrependClass {}

    @JsonAppend(
        attrs = {
            @JsonAppend.Attr(value = "attrPost")
        },
        props = {
            @JsonAppend.Prop(value = CustomVirtualWriter.class, name = "vpropPost", type = int.class)
        },
        prepend = false
    )
    static class VirtualAppendPostClass {}

    static class NameSerializationClass {
        @JsonGetter("customGetter")
        public String getA() { return null; }

        @JsonProperty("customProp")
        public String getB() { return null; }

        @JsonRawValue
        public String getC() { return null; }

        @JsonValue(true)
        public String getAsValue() { return null; }

        @JsonValue(false)
        public String getNotAsValue() { return null; }

        @JsonAnyGetter
        public Map<String, Object> anyGetter() { return null; }
    }

    static class NameDeserializationClass {
        @JsonSetter("customSetter")
        public void setA(String a) {}

        @JsonProperty("customPropSet")
        public void setB(String b) {}

        @JsonDeserialize
        public void setC(String c) {}

        @JsonAnySetter
        public void anySetter(String k, Object v) {}

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public static NameDeserializationClass create(@JsonProperty("x") String x) {
            return new NameDeserializationClass();
        }

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static NameDeserializationClass disabledCreator() {
            return new NameDeserializationClass();
        }
    }

    // ==========================================
    // Tests
    // ==========================================

    @Test
    public void testVersion_notNull() {
        Version v = introspector.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testIsAnnotationBundle_trueAndFalse() {
        Annotation bundle = BundleAnn.class.getAnnotations()[0];
        Assert.assertTrue(introspector.isAnnotationBundle(bundle));

        Annotation nonBundle = RootWithNamespace.class.getAnnotation(JsonRootName.class);
        Assert.assertFalse(introspector.isAnnotationBundle(nonBundle));
    }

    @Test
    public void testFindEnumValue_explicitAndEmptyAndDefault() {
        Assert.assertEquals("explicit_a", introspector.findEnumValue(TestEnum.A));
        Assert.assertEquals("EMPTY_PROP", introspector.findEnumValue(TestEnum.EMPTY_PROP));
        Assert.assertEquals("DEFAULT_VAL", introspector.findEnumValue(TestEnum.DEFAULT_VAL));
    }

    @Test
    public void testFindRootName_withAndWithoutNamespace() {
        AnnotatedClass ac = getAnnotatedClass(RootWithNamespace.class);
        PropertyName pn = introspector.findRootName(ac);
        Assert.assertNotNull(pn);
        Assert.assertEquals("root", pn.getSimpleName());
        Assert.assertEquals("http://example.com", pn.getNamespace());

        AnnotatedClass acEmptyNs = getAnnotatedClass(RootWithEmptyNamespace.class);
        PropertyName pnEmpty = introspector.findRootName(acEmptyNs);
        Assert.assertNotNull(pnEmpty);
        Assert.assertEquals("rootEmptyNs", pnEmpty.getSimpleName());
        Assert.assertNull(pnEmpty.getNamespace());

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findRootName(acPlain));
    }

    @Test
    public void testFindPropertiesToIgnore_variousModes() {
        AnnotatedClass ac = getAnnotatedClass(IgnorePropertiesClass.class);
        
        @SuppressWarnings("deprecation")
        String[] deprecatedProps = introspector.findPropertiesToIgnore(ac);
        Assert.assertArrayEquals(new String[]{"ignored1", "ignored2"}, deprecatedProps);

        // For serialization: allowGetters is true -> returns null
        Assert.assertNull(introspector.findPropertiesToIgnore(ac, true));
        // For deserialization: allowSetters is false -> returns values
        Assert.assertArrayEquals(new String[]{"ignored1", "ignored2"}, introspector.findPropertiesToIgnore(ac, false));

        AnnotatedClass acSetter = getAnnotatedClass(IgnorePropertiesSetterClass.class);
        // For serialization: allowGetters is false -> returns values
        Assert.assertArrayEquals(new String[]{"ignored3"}, introspector.findPropertiesToIgnore(acSetter, true));
        // For deserialization: allowSetters is true -> returns null
        Assert.assertNull(introspector.findPropertiesToIgnore(acSetter, false));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findPropertiesToIgnore(acPlain, true));
    }

    @Test
    public void testFindIgnoreUnknownProperties_trueAndNull() {
        AnnotatedClass ac = getAnnotatedClass(IgnorePropertiesClass.class);
        Assert.assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(ac));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findIgnoreUnknownProperties(acPlain));
    }

    @Test
    public void testIsIgnorableType_trueAndNull() {
        AnnotatedClass ac = getAnnotatedClass(IgnorableTypeClass.class);
        Assert.assertEquals(Boolean.TRUE, introspector.isIgnorableType(ac));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.isIgnorableType(acPlain));
    }

    @Test
    public void testFindFilterId_validAndEmptyAndNull() {
        AnnotatedClass ac = getAnnotatedClass(FilteredClass.class);
        Assert.assertEquals("filter123", introspector.findFilterId(ac));
        @SuppressWarnings("deprecation")
        Object filterIdDep = introspector.findFilterId((AnnotatedClass) ac);
        Assert.assertEquals("filter123", filterIdDep);

        AnnotatedClass acEmpty = getAnnotatedClass(EmptyFilterClass.class);
        Assert.assertNull(introspector.findFilterId(acEmpty));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findFilterId(acPlain));
    }

    @Test
    public void testFindNamingStrategy_classAndNull() {
        AnnotatedClass ac = getAnnotatedClass(NamingClass.class);
        Assert.assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, introspector.findNamingStrategy(ac));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findNamingStrategy(acPlain));
    }

    @Test
    public void testFindAutoDetectVisibility_customAndNull() {
        AnnotatedClass ac = getAnnotatedClass(AutoDetectClass.class);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> modified = introspector.findAutoDetectVisibility(ac, checker);
        Assert.assertNotEquals(checker, modified);

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertSame(checker, introspector.findAutoDetectVisibility(acPlain, checker));
    }

    @Test
    public void testMemberGeneralAnnotations() throws Exception {
        AnnotatedClass ac = getAnnotatedClass(GeneralMemberClass.class);
        AnnotatedField field1 = null;
        AnnotatedField fieldDefault = null;
        AnnotatedField fieldIgnored = null;
        AnnotatedField formatField = null;
        AnnotatedField managedRef = null;
        AnnotatedField backRef = null;
        AnnotatedField unwrappedEnabled = null;
        AnnotatedField unwrappedDisabled = null;
        AnnotatedField injectField = null;
        AnnotatedField injectUnnamedField = null;
        AnnotatedField viewField = null;

        for (AnnotatedField f : ac.fields()) {
            if ("field1".equals(f.getName())) field1 = f;
            else if ("fieldDefault".equals(f.getName())) fieldDefault = f;
            else if ("fieldIgnored".equals(f.getName())) fieldIgnored = f;
            else if ("formatField".equals(f.getName())) formatField = f;
            else if ("managedRef".equals(f.getName())) managedRef = f;
            else if ("backRef".equals(f.getName())) backRef = f;
            else if ("unwrappedEnabled".equals(f.getName())) unwrappedEnabled = f;
            else if ("unwrappedDisabled".equals(f.getName())) unwrappedDisabled = f;
            else if ("injectField".equals(f.getName())) injectField = f;
            else if ("injectUnnamedField".equals(f.getName())) injectUnnamedField = f;
            else if ("viewField".equals(f.getName())) viewField = f;
        }

        Assert.assertNull(introspector.findImplicitPropertyName(field1));

        Assert.assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(field1));
        Assert.assertNull(introspector.hasRequiredMarker(unwrappedEnabled));

        Assert.assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(field1));
        Assert.assertNull(introspector.findPropertyAccess(unwrappedEnabled));

        Assert.assertEquals("desc text", introspector.findPropertyDescription(field1));
        Assert.assertNull(introspector.findPropertyDescription(unwrappedEnabled));

        Assert.assertEquals(Integer.valueOf(3), introspector.findPropertyIndex(field1));
        Assert.assertNull(introspector.findPropertyIndex(fieldDefault));
        Assert.assertNull(introspector.findPropertyIndex(unwrappedEnabled));

        Assert.assertEquals("defVal", introspector.findPropertyDefaultValue(field1));
        Assert.assertNull(introspector.findPropertyDefaultValue(fieldDefault));
        Assert.assertNull(introspector.findPropertyDefaultValue(unwrappedEnabled));

        Assert.assertTrue(introspector.hasIgnoreMarker(fieldIgnored));
        Assert.assertFalse(introspector.hasIgnoreMarker(field1));

        JsonFormat.Value fmt = introspector.findFormat(formatField);
        Assert.assertNotNull(fmt);
        Assert.assertEquals(JsonFormat.Shape.STRING, fmt.getShape());
        Assert.assertNull(introspector.findFormat(field1));

        AnnotationIntrospector.ReferenceProperty refManaged = introspector.findReferenceType(managedRef);
        Assert.assertTrue(refManaged.isManagedReference());
        Assert.assertEquals("ref", refManaged.getName());

        AnnotationIntrospector.ReferenceProperty refBack = introspector.findReferenceType(backRef);
        Assert.assertTrue(refBack.isBackReference());
        Assert.assertEquals("ref", refBack.getName());

        Assert.assertNull(introspector.findReferenceType(field1));

        NameTransformer transformer = introspector.findUnwrappingNameTransformer(unwrappedEnabled);
        Assert.assertNotNull(transformer);
        Assert.assertEquals("pre_name_post", transformer.transform("name"));

        Assert.assertNull(introspector.findUnwrappingNameTransformer(unwrappedDisabled));
        Assert.assertNull(introspector.findUnwrappingNameTransformer(field1));

        Assert.assertEquals("injectNamed", introspector.findInjectableValueId(injectField));
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(injectUnnamedField));

        Class<?>[] views = introspector.findViews(viewField);
        Assert.assertArrayEquals(new Class<?>[]{String.class, Integer.class}, views);
        Assert.assertNull(introspector.findViews(field1));

        AnnotatedMethod method0 = null;
        AnnotatedMethod method1 = null;
        for (AnnotatedMethod m : ac.memberMethods()) {
            if ("getInjectMethod0".equals(m.getName())) method0 = m;
            else if ("setInjectMethod1".equals(m.getName())) method1 = m;
        }
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(method0));
        Assert.assertEquals(Long.class.getName(), introspector.findInjectableValueId(method1));
    }

    @Test
    public void testPolymorphicTypeHandling() {
        AnnotatedClass ac = getAnnotatedClass(BasePolymorphic.class);
        JavaType baseType = mapper.constructType(BasePolymorphic.class);

        TypeResolverBuilder<?> builder = introspector.findTypeResolver(serConfig, ac, baseType);
        Assert.assertNotNull(builder);

        List<NamedType> subtypes = introspector.findSubtypes(ac);
        Assert.assertEquals(1, subtypes.size());
        Assert.assertEquals(ConcreteType.class, subtypes.get(0).getType());
        Assert.assertEquals("concrete", subtypes.get(0).getName());

        Assert.assertEquals("baseTypeName", introspector.findTypeName(ac));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSubtypes(acPlain));
        Assert.assertNull(introspector.findTypeName(acPlain));

        AnnotatedClass acNone = getAnnotatedClass(NoneTypeInfoClass.class);
        TypeResolverBuilder<?> noneBuilder = introspector.findTypeResolver(serConfig, acNone, baseType);
        Assert.assertNotNull(noneBuilder);

        AnnotatedClass acExt = getAnnotatedClass(ExternalPropClass.class);
        TypeResolverBuilder<?> extBuilder = introspector.findTypeResolver(serConfig, acExt, baseType);
        Assert.assertNotNull(extBuilder);

        AnnotatedClass acCustom = getAnnotatedClass(CustomResolverClass.class);
        TypeResolverBuilder<?> customBuilder = introspector.findTypeResolver(serConfig, acCustom, baseType);
        Assert.assertNotNull(customBuilder);

        AnnotatedClass acNoInfo = getAnnotatedClass(CustomResolverNoInfoClass.class);
        Assert.assertNull(introspector.findTypeResolver(serConfig, acNoInfo, baseType));
    }

    @Test
    public void testPropertyTypeResolver() {
        AnnotatedClass ac = getAnnotatedClass(ContainerHolder.class);
        AnnotatedField listField = null;
        AnnotatedField typeIdField = null;
        for (AnnotatedField f : ac.fields()) {
            if ("list".equals(f.getName())) listField = f;
            else if ("typeIdField".equals(f.getName())) typeIdField = f;
        }

        JavaType listType = mapper.constructType(List.class);
        JavaType stringType = mapper.constructType(String.class);

        Assert.assertNull(introspector.findPropertyTypeResolver(serConfig, listField, listType));
        Assert.assertNotNull(introspector.findPropertyTypeResolver(serConfig, listField, stringType));

        TypeResolverBuilder<?> contentBuilder = introspector.findPropertyContentTypeResolver(serConfig, listField, listType);
        Assert.assertNotNull(contentBuilder);

        Assert.assertTrue(introspector.isTypeId(typeIdField));
        Assert.assertFalse(introspector.isTypeId(listField));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyContentTypeResolver_nonContainerThrows() {
        AnnotatedClass ac = getAnnotatedClass(ContainerHolder.class);
        AnnotatedField listField = ac.fields().iterator().next();
        introspector.findPropertyContentTypeResolver(serConfig, listField, mapper.constructType(String.class));
    }

    @Test
    public void testObjectIdInfo() {
        AnnotatedClass ac = getAnnotatedClass(ObjectIdInfoClass.class);
        ObjectIdInfo info = introspector.findObjectIdInfo(ac);
        Assert.assertNotNull(info);
        Assert.assertEquals("id", info.getPropertyName().getSimpleName());
        Assert.assertEquals(ObjectIdInfoClass.class, info.getScope());
        Assert.assertEquals(ObjectIdGenerators.IntSequenceGenerator.class, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());

        ObjectIdInfo withRef = introspector.findObjectReferenceInfo(ac, info);
        Assert.assertTrue(withRef.getAlwaysAsId());

        AnnotatedClass acNone = getAnnotatedClass(ObjectIdNoneClass.class);
        Assert.assertNull(introspector.findObjectIdInfo(acNone));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findObjectIdInfo(acPlain));
        Assert.assertSame(info, introspector.findObjectReferenceInfo(acPlain, info));
    }

    @Test
    public void testSerializationAnnotations() {
        AnnotatedClass ac = getAnnotatedClass(FullSerDeserClass.class);
        JavaType baseType = mapper.constructType(Object.class);

        Assert.assertEquals(CustomSerializer.class, introspector.findSerializer(ac));
        Assert.assertEquals(CustomSerializer.class, introspector.findKeySerializer(ac));
        Assert.assertEquals(CustomSerializer.class, introspector.findContentSerializer(ac));
        Assert.assertEquals(CustomSerializer.class, introspector.findNullSerializer(ac));
        Assert.assertEquals(Object.class, introspector.findSerializationType(ac));
        Assert.assertEquals(Object.class, introspector.findSerializationKeyType(ac, baseType));
        Assert.assertEquals(Object.class, introspector.findSerializationContentType(ac, baseType));
        Assert.assertEquals(JsonSerialize.Typing.STATIC, introspector.findSerializationTyping(ac));
        Assert.assertEquals(DummyConverter.class, introspector.findSerializationConverter(ac));
        Assert.assertEquals(DummyConverter.class, introspector.findSerializationContentConverter(ac.fields().iterator().next()));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSerializer(acPlain));
        Assert.assertNull(introspector.findKeySerializer(acPlain));
        Assert.assertNull(introspector.findContentSerializer(acPlain));
        Assert.assertNull(introspector.findNullSerializer(acPlain));
        Assert.assertNull(introspector.findSerializationType(acPlain));
        Assert.assertNull(introspector.findSerializationKeyType(acPlain, baseType));
        Assert.assertNull(introspector.findSerializationContentType(acPlain, baseType));
        Assert.assertNull(introspector.findSerializationTyping(acPlain));
        Assert.assertNull(introspector.findSerializationConverter(acPlain));
    }

    @Test
    public void testSerializationInclusion() {
        AnnotatedClass acInc = getAnnotatedClass(IncludeClass.class);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusion(acInc, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusionForContent(acInc, JsonInclude.Include.ALWAYS));
        JsonInclude.Value propInc = introspector.findPropertyInclusion(acInc);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, propInc.getValueInclusion());
        Assert.assertEquals(JsonInclude.Include.NON_NULL, propInc.getContentInclusion());

        AnnotatedClass acAlways = getAnnotatedClass(SerAlways.class);
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(acAlways, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findPropertyInclusion(acAlways).getValueInclusion());

        AnnotatedClass acNonDef = getAnnotatedClass(SerNonDefault.class);
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findSerializationInclusion(acNonDef, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findPropertyInclusion(acNonDef).getValueInclusion());

        AnnotatedClass acNonEmp = getAnnotatedClass(SerNonEmpty.class);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusion(acNonEmp, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findPropertyInclusion(acNonEmp).getValueInclusion());

        AnnotatedClass acDef = getAnnotatedClass(SerDefaultInc.class);
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, introspector.findSerializationInclusion(acDef, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(acPlain, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusionForContent(acPlain, JsonInclude.Include.ALWAYS));
    }

    @Test
    public void testPropertyOrderAndAlphabetical() {
        AnnotatedClass acOrder = getAnnotatedClass(OrderClass.class);
        Assert.assertArrayEquals(new String[]{"b", "a"}, introspector.findSerializationPropertyOrder(acOrder));
        Assert.assertEquals(Boolean.TRUE, introspector.findSerializationSortAlphabetically(acOrder));

        AnnotatedClass acNonAlpha = getAnnotatedClass(NonAlphaOrderClass.class);
        Assert.assertNull(introspector.findSerializationSortAlphabetically(acNonAlpha));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findSerializationPropertyOrder(acPlain));
        Assert.assertNull(introspector.findSerializationSortAlphabetically(acPlain));
    }

    @Test
    public void testVirtualProperties_appendAndPrepend() {
        AnnotatedClass acPrepend = getAnnotatedClass(VirtualAppendPrependClass.class);
        List<BeanPropertyWriter> propsPrepend = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(serConfig, acPrepend, propsPrepend);
        Assert.assertEquals(3, propsPrepend.size());
        Assert.assertEquals("propAttr1", propsPrepend.get(0).getName());
        Assert.assertEquals("attr2", propsPrepend.get(1).getName());
        Assert.assertEquals("vprop1", propsPrepend.get(2).getName());

        AnnotatedClass acPost = getAnnotatedClass(VirtualAppendPostClass.class);
        List<BeanPropertyWriter> propsPost = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(serConfig, acPost, propsPost);
        Assert.assertEquals(2, propsPost.size());
        Assert.assertEquals("attrPost", propsPost.get(0).getName());
        Assert.assertEquals("vpropPost", propsPost.get(1).getName());

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        List<BeanPropertyWriter> propsPlain = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(serConfig, acPlain, propsPlain);
        Assert.assertTrue(propsPlain.isEmpty());
    }

    @Test
    public void testVirtualProperties_withHandlerInstantiator() {
        final VirtualBeanPropertyWriter mockWriter = new CustomVirtualWriter();
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.setHandlerInstantiator(new HandlerInstantiator() {
            @Override public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) { return null; }
            @Override public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) { return null; }
            @Override public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) { return null; }
            @Override public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) { return null; }
            @Override public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) { return null; }
            @Override public VirtualBeanPropertyWriter virtualPropertyWriterInstance(MapperConfig<?> config, Class<?> writerClass) {
                return mockWriter;
            }
        });

        AnnotatedClass acPost = getAnnotatedClass(VirtualAppendPostClass.class);
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(customMapper.getSerializationConfig(), acPost, props);
        Assert.assertEquals(2, props.size());
    }

    @Test
    public void testFindNameForSerializationAndJsonValue() {
        AnnotatedClass ac = getAnnotatedClass(NameSerializationClass.class);
        for (AnnotatedMethod m : ac.memberMethods()) {
            if ("getA".equals(m.getName())) {
                Assert.assertEquals("customGetter", introspector.findNameForSerialization(m).getSimpleName());
            } else if ("getB".equals(m.getName())) {
                Assert.assertEquals("customProp", introspector.findNameForSerialization(m).getSimpleName());
            } else if ("getC".equals(m.getName())) {
                Assert.assertEquals("", introspector.findNameForSerialization(m).getSimpleName());
                Object rawSer = introspector.findSerializer(m);
                Assert.assertTrue(rawSer instanceof RawSerializer);
            } else if ("getAsValue".equals(m.getName())) {
                Assert.assertTrue(introspector.hasAsValueAnnotation(m));
            } else if ("getNotAsValue".equals(m.getName())) {
                Assert.assertFalse(introspector.hasAsValueAnnotation(m));
            } else if ("anyGetter".equals(m.getName())) {
                Assert.assertTrue(introspector.hasAnyGetterAnnotation(m));
            }
        }
    }

    @Test
    public void testDeserializationAnnotations() {
        AnnotatedClass ac = getAnnotatedClass(FullSerDeserClass.class);
        JavaType baseType = mapper.constructType(Object.class);

        Assert.assertEquals(CustomDeserializer.class, introspector.findDeserializer(ac));
        Assert.assertEquals(CustomKeyDeserializer.class, introspector.findKeyDeserializer(ac));
        Assert.assertEquals(CustomDeserializer.class, introspector.findContentDeserializer(ac));
        Assert.assertEquals(Object.class, introspector.findDeserializationType(ac, baseType));
        Assert.assertEquals(Object.class, introspector.findDeserializationKeyType(ac, baseType));
        Assert.assertEquals(Object.class, introspector.findDeserializationContentType(ac, baseType));
        Assert.assertEquals(DummyConverter.class, introspector.findDeserializationConverter(ac));
        Assert.assertEquals(DummyConverter.class, introspector.findDeserializationContentConverter(ac.fields().iterator().next()));
        Assert.assertEquals(CustomBuilder.class, introspector.findPOJOBuilder(ac));

        AnnotatedClass acBuilder = getAnnotatedClass(POJOBuilderConfigClass.class);
        JsonPOJOBuilder.Value bConfig = introspector.findPOJOBuilderConfig(acBuilder);
        Assert.assertNotNull(bConfig);
        Assert.assertEquals("create", bConfig.buildMethodName);
        Assert.assertEquals("set", bConfig.withPrefix);

        AnnotatedClass acValInst = getAnnotatedClass(ValueInstantiatorClass.class);
        Assert.assertEquals(com.fasterxml.jackson.databind.deser.std.StdValueInstantiator.class, introspector.findValueInstantiator(acValInst));

        AnnotatedClass acPlain = getAnnotatedClass(PlainClass.class);
        Assert.assertNull(introspector.findDeserializer(acPlain));
        Assert.assertNull(introspector.findKeyDeserializer(acPlain));
        Assert.assertNull(introspector.findContentDeserializer(acPlain));
        Assert.assertNull(introspector.findDeserializationType(acPlain, baseType));
        Assert.assertNull(introspector.findDeserializationKeyType(acPlain, baseType));
        Assert.assertNull(introspector.findDeserializationContentType(acPlain, baseType));
        Assert.assertNull(introspector.findDeserializationConverter(acPlain));
        Assert.assertNull(introspector.findPOJOBuilder(acPlain));
        Assert.assertNull(introspector.findPOJOBuilderConfig(acPlain));
        Assert.assertNull(introspector.findValueInstantiator(acPlain));
    }

    @Test
    public void testFindNameForDeserializationAndCreators() {
        AnnotatedClass ac = getAnnotatedClass(NameDeserializationClass.class);
        for (AnnotatedMethod m : ac.memberMethods()) {
            if ("setA".equals(m.getName())) {
                Assert.assertEquals("customSetter", introspector.findNameForDeserialization(m).getSimpleName());
            } else if ("setB".equals(m.getName())) {
                Assert.assertEquals("customPropSet", introspector.findNameForDeserialization(m).getSimpleName());
            } else if ("setC".equals(m.getName())) {
                Assert.assertEquals("", introspector.findNameForDeserialization(m).getSimpleName());
            } else if ("anySetter".equals(m.getName())) {
                Assert.assertTrue(introspector.hasAnySetterAnnotation(m));
            } else if ("create".equals(m.getName())) {
                Assert.assertTrue(introspector.hasCreatorAnnotation(m));
                Assert.assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(m));
            } else if ("disabledCreator".equals(m.getName())) {
                Assert.assertFalse(introspector.hasCreatorAnnotation(m));
                Assert.assertEquals(JsonCreator.Mode.DISABLED, introspector.findCreatorBinding(m));
            }
        }
    }
}
