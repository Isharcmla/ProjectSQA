package com.fasterxml.jackson.databind.introspect;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
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
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
    }

    private AnnotatedClass getAnnotatedClass(Class<?> cls) {
        return mapper.getSerializationConfig().introspectClassAnnotations(cls);
    }

    private AnnotatedField getAnnotatedField(Class<?> cls, String fieldName) {
        AnnotatedClass ac = getAnnotatedClass(cls);
        for (AnnotatedField f : ac.fields()) {
            if (f.getName().equals(fieldName)) {
                return f;
            }
        }
        return null;
    }

    private AnnotatedMethod getAnnotatedMethod(Class<?> cls, String methodName) {
        AnnotatedClass ac = getAnnotatedClass(cls);
        for (AnnotatedMethod m : ac.memberMethods()) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }

    private AnnotatedConstructor getAnnotatedConstructor(Class<?> cls, int paramCount) {
        AnnotatedClass ac = getAnnotatedClass(cls);
        for (AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == paramCount) {
                return c;
            }
        }
        return null;
    }

    // =========================================================================
    // Test helper classes / annotations
    // =========================================================================

    @JacksonAnnotationsInside
    @Retention(RetentionPolicy.RUNTIME)
    @interface BundleAnn { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface NonBundleAnn { }

    @JsonRootName(value = "root", namespace = "http://example.com")
    static class RootWithNamespace { }

    @JsonRootName(value = "rootEmptyNs", namespace = "")
    static class RootWithEmptyNamespace { }

    static class NoRoot { }

    @JsonIgnoreProperties(value = {"prop1", "prop2"}, ignoreUnknown = true, allowGetters = true, allowSetters = false)
    static class IgnorePropertiesAllowGetters { }

    @JsonIgnoreProperties(value = {"prop3"}, allowGetters = false, allowSetters = true)
    static class IgnorePropertiesAllowSetters { }

    @JsonIgnoreType(true)
    static class IgnorableTypeClass { }

    @JsonIgnoreType(false)
    static class NonIgnorableTypeClass { }

    @JsonFilter("filter123")
    static class FilteredClass { }

    @JsonFilter("")
    static class EmptyFilterClass { }

    static class DummyNamingStrategy extends PropertyNamingStrategy { }

    @JsonNaming(DummyNamingStrategy.class)
    static class NamingStrategyClass { }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class AutoDetectClass { }

    static class PropertyFeaturesClass {
        @JsonProperty(value = "propA", required = true, index = 3, defaultValue = "defaultA", access = JsonProperty.Access.READ_ONLY)
        @JsonPropertyDescription("Description for propA")
        public String propA;

        @JsonProperty(value = "propB", required = false, index = JsonProperty.INDEX_UNKNOWN, defaultValue = "")
        public String propB;

        @JsonIgnore(true)
        public String ignoredField;

        @JsonIgnore(false)
        public String notIgnoredField;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        public Date dateField;

        @JsonManagedReference("ref-name")
        public PropertyFeaturesClass managedRef;

        @JsonBackReference("ref-name")
        public PropertyFeaturesClass backRef;

        @JsonUnwrapped(enabled = true, prefix = "pre_", suffix = "_post")
        public PropertyFeaturesClass unwrappedField;

        @JsonUnwrapped(enabled = false)
        public PropertyFeaturesClass unwrappedDisabled;

        @JacksonInject("injectId")
        public String injectedNamed;

        @JacksonInject("")
        public String injectedEmptyField;

        @JacksonInject("")
        public void setInjectedEmptyMethod(String val) { }

        @JacksonInject("")
        public String getInjectedEmptyGetter() { return ""; }

        @JsonView({String.class, Integer.class})
        public String viewedField;

        @JsonTypeId
        public String typeIdField;
    }

    static class DummySerializer extends StdSerializer<Object> {
        public DummySerializer() { super(Object.class); }
        @Override
        public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider provider) { }
    }

    static class DummyDeserializer extends StdDeserializer<Object> {
        public DummyDeserializer() { super(Object.class); }
        @Override
        public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
    }

    static class DummyKeyDeserializer extends StdKeyDeserializer {
        protected DummyKeyDeserializer() { super(0, String.class); }
    }

    static class DummyConverter implements Converter<String, Integer> {
        @Override public Integer convert(String value) { return 0; }
        @Override public JavaType getInputType(TypeFactory typeFactory) { return typeFactory.constructType(String.class); }
        @Override public JavaType getOutputType(TypeFactory typeFactory) { return typeFactory.constructType(Integer.class); }
    }

    static class SerializationFeaturesClass {
        @JsonSerialize(
            using = DummySerializer.class,
            keyUsing = DummySerializer.class,
            contentUsing = DummySerializer.class,
            nullsUsing = DummySerializer.class,
            as = String.class,
            keyAs = Integer.class,
            contentAs = Long.class,
            typing = JsonSerialize.Typing.STATIC,
            converter = DummyConverter.class,
            contentConverter = DummyConverter.class
        )
        public Map<Integer, Long> serializedField;

        @JsonRawValue(true)
        public String rawField;

        @JsonRawValue(false)
        public String nonRawField;

        @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
        public List<String> inclusionField;

        @SuppressWarnings("deprecation")
        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
        public String includeAlways;

        @SuppressWarnings("deprecation")
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
        public String includeNonNull;

        @SuppressWarnings("deprecation")
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
        public String includeNonDefault;

        @SuppressWarnings("deprecation")
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
        public String includeNonEmpty;

        @SuppressWarnings("deprecation")
        @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION)
        public String includeDefault;

        @JsonGetter("getterName")
        public String getGetterName() { return null; }

        @JsonValue(true)
        public String asValueMethod() { return "val"; }

        @JsonValue(false)
        public String asValueDisabledMethod() { return "val"; }
    }

    static class DeserializationFeaturesClass {
        @JsonDeserialize(
            using = DummyDeserializer.class,
            keyUsing = DummyKeyDeserializer.class,
            contentUsing = DummyDeserializer.class,
            as = String.class,
            keyAs = Integer.class,
            contentAs = Long.class,
            converter = DummyConverter.class,
            contentConverter = DummyConverter.class
        )
        public Map<Integer, Long> deserializedField;

        @JsonSetter("setterCustomName")
        public void setCustom(String s) { }

        @JsonAnySetter
        public void anySetterMethod(String key, Object value) { }

        @JsonAnyGetter
        public Map<String, Object> anyGetterMethod() { return null; }

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public DeserializationFeaturesClass(@JsonProperty("param") String param) { }

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public static DeserializationFeaturesClass createDisabled() { return null; }

        public DeserializationFeaturesClass() { }
    }

    @JsonPropertyOrder(value = {"b", "a"}, alphabetic = true)
    static class OrderedClass { }

    static class DummyVirtualWriter extends VirtualBeanPropertyWriter {
        public DummyVirtualWriter() { super(); }
        public DummyVirtualWriter(BeanPropertyDefinition propDef, com.fasterxml.jackson.databind.util.Annotations contextAnnotations, JavaType declaredType) {
            super(propDef, contextAnnotations, declaredType);
        }
        @Override
        protected Object value(Object bean, com.fasterxml.jackson.core.JsonGenerator gen, SerializerProvider prov) { return null; }
        @Override
        public VirtualBeanPropertyWriter withConfig(MapperConfig<?> config, AnnotatedClass declaringClass, BeanPropertyDefinition propDef, JavaType type) {
            return new DummyVirtualWriter(propDef, declaringClass.getAnnotations(), type);
        }
    }

    @JsonAppend(
        prepend = true,
        attrs = {
            @JsonAppend.Attr(value = "attr1", propName = "propAttr1", propNamespace = "ns1", required = true, include = JsonInclude.Include.NON_EMPTY),
            @JsonAppend.Attr(value = "attr2", propName = "", required = false)
        },
        props = {
            @JsonAppend.Prop(value = DummyVirtualWriter.class, name = "virtProp", namespace = "", type = String.class, required = true, include = JsonInclude.Include.ALWAYS)
        }
    )
    static class AppendPrependClass { }

    @JsonAppend(
        prepend = false,
        attrs = {
            @JsonAppend.Attr(value = "attrPost")
        },
        props = {
            @JsonAppend.Prop(value = DummyVirtualWriter.class, name = "virtPropPost", type = int.class)
        }
    )
    static class AppendAppendClass { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({
        @JsonSubTypes.Type(value = SubTypeA.class, name = "subA"),
        @JsonSubTypes.Type(value = SubTypeB.class, name = "subB")
    })
    @JsonTypeName("baseTypeName")
    static class PolymorphicBase { }

    static class SubTypeA extends PolymorphicBase { }
    static class SubTypeB extends PolymorphicBase { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    static class NoTypeInfoClass { }

    static class CustomTypeIdResolver implements TypeIdResolver {
        @Override public void init(JavaType baseType) { }
        @Override public String idFromValue(Object value) { return "id"; }
        @Override public String idFromValueAndType(Object value, Class<?> suggestedType) { return "id"; }
        @Override public String idFromBaseType() { return "id"; }
        @Override public JavaType typeFromId(DatabindContext context, String id) { return null; }
        @Override public String getDescForKnownTypeIds() { return null; }
        @Override public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CUSTOM; }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, defaultImpl = SubTypeA.class, visible = true)
    @JsonTypeIdResolver(CustomTypeIdResolver.class)
    static class CustomResolvedClass { }

    static class DummyTypeResolverBuilder extends StdTypeResolverBuilder { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
    @JsonTypeResolver(DummyTypeResolverBuilder.class)
    static class CustomBuilderClass { }

    @JsonTypeResolver(DummyTypeResolverBuilder.class)
    static class CustomBuilderWithoutInfoClass { }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = ObjectIdInfoClass.class, resolver = SimpleObjectIdResolver.class)
    @JsonIdentityReference(alwaysAsId = true)
    static class ObjectIdInfoClass {
        public int id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class NoneObjectIdClass { }

    @JsonValueInstantiator(ValueInstantiator.class)
    static class ValueInstantiatorClass { }

    @JsonPOJOBuilder(buildMethodName = "constructPojo", withPrefix = "create")
    static class CustomPOJOBuilderConfig { }

    @JsonDeserialize(builder = CustomPOJOBuilderConfig.class)
    static class POJOBuilderClass { }

    // =========================================================================
    // Test Methods
    // =========================================================================

    @Test
    public void testVersionAndSerialization() throws Exception {
        Version v = introspector.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(introspector);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof JacksonAnnotationIntrospector);
    }

    @Test
    public void testIsAnnotationBundle() {
        Annotation bundle = BundleAnn.class.getAnnotation(Retention.class);
        Annotation inside = BundleAnn.class.getAnnotation(JacksonAnnotationsInside.class);
        Assert.assertNotNull(inside);
        Assert.assertTrue(introspector.isAnnotationBundle(inside));
        Assert.assertFalse(introspector.isAnnotationBundle(bundle));
    }

    @Test
    public void testFindRootName() {
        AnnotatedClass acNs = getAnnotatedClass(RootWithNamespace.class);
        PropertyName pn = introspector.findRootName(acNs);
        Assert.assertNotNull(pn);
        Assert.assertEquals("root", pn.getSimpleName());
        Assert.assertEquals("http://example.com", pn.getNamespace());

        AnnotatedClass acEmptyNs = getAnnotatedClass(RootWithEmptyNamespace.class);
        PropertyName pnEmpty = introspector.findRootName(acEmptyNs);
        Assert.assertNotNull(pnEmpty);
        Assert.assertEquals("rootEmptyNs", pnEmpty.getSimpleName());
        Assert.assertNull(pnEmpty.getNamespace());

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findRootName(acNone));
    }

    @Test
    public void testFindPropertiesToIgnoreDeprecated() {
        AnnotatedClass ac = getAnnotatedClass(IgnorePropertiesAllowGetters.class);
        @SuppressWarnings("deprecation")
        String[] ignores = introspector.findPropertiesToIgnore(ac);
        Assert.assertNotNull(ignores);
        Assert.assertEquals(2, ignores.length);

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        @SuppressWarnings("deprecation")
        String[] none = introspector.findPropertiesToIgnore(acNone);
        Assert.assertNull(none);
    }

    @Test
    public void testFindPropertiesToIgnore() {
        AnnotatedClass acGetters = getAnnotatedClass(IgnorePropertiesAllowGetters.class);
        // for serialization, allowGetters = true -> returns null
        Assert.assertNull(introspector.findPropertiesToIgnore(acGetters, true));
        // for deserialization, allowSetters = false -> returns list
        String[] deserIgnores = introspector.findPropertiesToIgnore(acGetters, false);
        Assert.assertNotNull(deserIgnores);
        Assert.assertEquals(2, deserIgnores.length);

        AnnotatedClass acSetters = getAnnotatedClass(IgnorePropertiesAllowSetters.class);
        // for serialization, allowGetters = false -> returns list
        String[] serIgnores = introspector.findPropertiesToIgnore(acSetters, true);
        Assert.assertNotNull(serIgnores);
        Assert.assertEquals(1, serIgnores.length);
        // for deserialization, allowSetters = true -> returns null
        Assert.assertNull(introspector.findPropertiesToIgnore(acSetters, false));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findPropertiesToIgnore(acNone, true));
        Assert.assertNull(introspector.findPropertiesToIgnore(acNone, false));
    }

    @Test
    public void testFindIgnoreUnknownProperties() {
        AnnotatedClass ac = getAnnotatedClass(IgnorePropertiesAllowGetters.class);
        Assert.assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(ac));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findIgnoreUnknownProperties(acNone));
    }

    @Test
    public void testIsIgnorableType() {
        AnnotatedClass acIgnorable = getAnnotatedClass(IgnorableTypeClass.class);
        Assert.assertEquals(Boolean.TRUE, introspector.isIgnorableType(acIgnorable));

        AnnotatedClass acNonIgnorable = getAnnotatedClass(NonIgnorableTypeClass.class);
        Assert.assertEquals(Boolean.FALSE, introspector.isIgnorableType(acNonIgnorable));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.isIgnorableType(acNone));
    }

    @Test
    public void testFindFilterId() {
        AnnotatedClass acFiltered = getAnnotatedClass(FilteredClass.class);
        Assert.assertEquals("filter123", introspector.findFilterId(acFiltered));
        @SuppressWarnings("deprecation")
        Object deprecatedId = introspector.findFilterId((Annotated) acFiltered);
        Assert.assertEquals("filter123", deprecatedId);

        AnnotatedClass acEmpty = getAnnotatedClass(EmptyFilterClass.class);
        Assert.assertNull(introspector.findFilterId(acEmpty));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findFilterId(acNone));
    }

    @Test
    public void testFindNamingStrategy() {
        AnnotatedClass ac = getAnnotatedClass(NamingStrategyClass.class);
        Assert.assertEquals(DummyNamingStrategy.class, introspector.findNamingStrategy(ac));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findNamingStrategy(acNone));
    }

    @Test
    public void testFindAutoDetectVisibility() {
        AnnotatedClass ac = getAnnotatedClass(AutoDetectClass.class);
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> result = introspector.findAutoDetectVisibility(ac, checker);
        Assert.assertNotNull(result);

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertSame(checker, introspector.findAutoDetectVisibility(acNone, checker));
    }

    @Test
    public void testMemberPropertyAnnotations() {
        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertNull(introspector.findImplicitPropertyName(fieldA));
        Assert.assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(fieldA));
        Assert.assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(fieldA));
        Assert.assertEquals("Description for propA", introspector.findPropertyDescription(fieldA));
        Assert.assertEquals(Integer.valueOf(3), introspector.findPropertyIndex(fieldA));
        Assert.assertEquals("defaultA", introspector.findPropertyDefaultValue(fieldA));

        AnnotatedField fieldB = getAnnotatedField(PropertyFeaturesClass.class, "propB");
        Assert.assertEquals(Boolean.FALSE, introspector.hasRequiredMarker(fieldB));
        Assert.assertEquals(JsonProperty.Access.AUTO, introspector.findPropertyAccess(fieldB));
        Assert.assertNull(introspector.findPropertyDescription(fieldB));
        Assert.assertNull(introspector.findPropertyIndex(fieldB));
        Assert.assertNull(introspector.findPropertyDefaultValue(fieldB));

        AnnotatedField fieldIgnored = getAnnotatedField(PropertyFeaturesClass.class, "ignoredField");
        Assert.assertTrue(introspector.hasIgnoreMarker(fieldIgnored));

        AnnotatedField fieldNotIgnored = getAnnotatedField(PropertyFeaturesClass.class, "notIgnoredField");
        Assert.assertFalse(introspector.hasIgnoreMarker(fieldNotIgnored));

        AnnotatedField dateField = getAnnotatedField(PropertyFeaturesClass.class, "dateField");
        JsonFormat.Value formatValue = introspector.findFormat(dateField);
        Assert.assertNotNull(formatValue);
        Assert.assertEquals("yyyy-MM-dd", formatValue.getPattern());
        Assert.assertEquals(JsonFormat.Shape.STRING, formatValue.getShape());
        Assert.assertNull(introspector.findFormat(fieldA));

        AnnotatedField managedRef = getAnnotatedField(PropertyFeaturesClass.class, "managedRef");
        AnnotationIntrospector.ReferenceProperty ref1 = introspector.findReferenceType(managedRef);
        Assert.assertNotNull(ref1);
        Assert.assertTrue(ref1.isManagedReference());
        Assert.assertEquals("ref-name", ref1.getName());

        AnnotatedField backRef = getAnnotatedField(PropertyFeaturesClass.class, "backRef");
        AnnotationIntrospector.ReferenceProperty ref2 = introspector.findReferenceType(backRef);
        Assert.assertNotNull(ref2);
        Assert.assertTrue(ref2.isBackReference());
        Assert.assertEquals("ref-name", ref2.getName());

        Assert.assertNull(introspector.findReferenceType(fieldA));
    }

    @Test
    public void testFindUnwrappingNameTransformer() {
        AnnotatedField unwrappedField = getAnnotatedField(PropertyFeaturesClass.class, "unwrappedField");
        NameTransformer transformer = introspector.findUnwrappingNameTransformer(unwrappedField);
        Assert.assertNotNull(transformer);
        Assert.assertEquals("pre_name_post", transformer.transform("name"));

        AnnotatedField unwrappedDisabled = getAnnotatedField(PropertyFeaturesClass.class, "unwrappedDisabled");
        Assert.assertNull(introspector.findUnwrappingNameTransformer(unwrappedDisabled));

        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertNull(introspector.findUnwrappingNameTransformer(fieldA));
    }

    @Test
    public void testFindInjectableValueId() {
        AnnotatedField injectedNamed = getAnnotatedField(PropertyFeaturesClass.class, "injectedNamed");
        Assert.assertEquals("injectId", introspector.findInjectableValueId(injectedNamed));

        AnnotatedField injectedEmptyField = getAnnotatedField(PropertyFeaturesClass.class, "injectedEmptyField");
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(injectedEmptyField));

        AnnotatedMethod setterMethod = getAnnotatedMethod(PropertyFeaturesClass.class, "setInjectedEmptyMethod");
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(setterMethod));

        AnnotatedMethod getterMethod = getAnnotatedMethod(PropertyFeaturesClass.class, "getInjectedEmptyGetter");
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(getterMethod));

        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertNull(introspector.findInjectableValueId(fieldA));
    }

    @Test
    public void testFindViewsAndTypeId() {
        AnnotatedField viewedField = getAnnotatedField(PropertyFeaturesClass.class, "viewedField");
        Class<?>[] views = introspector.findViews(viewedField);
        Assert.assertNotNull(views);
        Assert.assertEquals(2, views.length);

        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertNull(introspector.findViews(fieldA));

        AnnotatedField typeIdField = getAnnotatedField(PropertyFeaturesClass.class, "typeIdField");
        Assert.assertTrue(introspector.isTypeId(typeIdField));
        Assert.assertFalse(introspector.isTypeId(fieldA));
    }

    @Test
    public void testFindTypeNameAndSubtypes() {
        AnnotatedClass ac = getAnnotatedClass(PolymorphicBase.class);
        Assert.assertEquals("baseTypeName", introspector.findTypeName(ac));

        List<NamedType> subtypes = introspector.findSubtypes(ac);
        Assert.assertNotNull(subtypes);
        Assert.assertEquals(2, subtypes.size());
        Assert.assertEquals(SubTypeA.class, subtypes.get(0).getType());
        Assert.assertEquals("subA", subtypes.get(0).getName());

        AnnotatedClass acNoRoot = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findTypeName(acNoRoot));
        Assert.assertNull(introspector.findSubtypes(acNoRoot));
    }

    @Test
    public void testFindObjectIdInfoAndReference() {
        AnnotatedClass ac = getAnnotatedClass(ObjectIdInfoClass.class);
        ObjectIdInfo info = introspector.findObjectIdInfo(ac);
        Assert.assertNotNull(info);
        Assert.assertEquals(PropertyName.construct("id"), info.getPropertyName());
        Assert.assertEquals(ObjectIdInfoClass.class, info.getScope());
        Assert.assertEquals(ObjectIdGenerators.PropertyGenerator.class, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());

        ObjectIdInfo updated = introspector.findObjectReferenceInfo(ac, info);
        Assert.assertTrue(updated.getAlwaysAsId());

        AnnotatedClass acNone = getAnnotatedClass(NoneObjectIdClass.class);
        Assert.assertNull(introspector.findObjectIdInfo(acNone));

        AnnotatedClass acNoRoot = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findObjectIdInfo(acNoRoot));
    }

    @Test
    public void testSerializationAnnotations() {
        AnnotatedField sf = getAnnotatedField(SerializationFeaturesClass.class, "serializedField");
        Assert.assertEquals(DummySerializer.class, introspector.findSerializer(sf));
        Assert.assertEquals(DummySerializer.class, introspector.findKeySerializer(sf));
        Assert.assertEquals(DummySerializer.class, introspector.findContentSerializer(sf));
        Assert.assertEquals(DummySerializer.class, introspector.findNullSerializer(sf));
        Assert.assertEquals(String.class, introspector.findSerializationType(sf));
        Assert.assertEquals(Integer.class, introspector.findSerializationKeyType(sf, null));
        Assert.assertEquals(Long.class, introspector.findSerializationContentType(sf, null));
        Assert.assertEquals(JsonSerialize.Typing.STATIC, introspector.findSerializationTyping(sf));
        Assert.assertEquals(DummyConverter.class, introspector.findSerializationConverter(sf));
        Assert.assertEquals(DummyConverter.class, introspector.findSerializationContentConverter(sf));

        AnnotatedField rawField = getAnnotatedField(SerializationFeaturesClass.class, "rawField");
        Object rawSer = introspector.findSerializer(rawField);
        Assert.assertTrue(rawSer instanceof RawSerializer);

        AnnotatedField nonRawField = getAnnotatedField(SerializationFeaturesClass.class, "nonRawField");
        Assert.assertNull(introspector.findSerializer(nonRawField));

        AnnotatedField incField = getAnnotatedField(SerializationFeaturesClass.class, "inclusionField");
        Assert.assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusion(incField, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusionForContent(incField, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField alwaysF = getAnnotatedField(SerializationFeaturesClass.class, "includeAlways");
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(alwaysF, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField nonNullF = getAnnotatedField(SerializationFeaturesClass.class, "includeNonNull");
        Assert.assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusion(nonNullF, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField nonDefF = getAnnotatedField(SerializationFeaturesClass.class, "includeNonDefault");
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findSerializationInclusion(nonDefF, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField nonEmptyF = getAnnotatedField(SerializationFeaturesClass.class, "includeNonEmpty");
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusion(nonEmptyF, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField defF = getAnnotatedField(SerializationFeaturesClass.class, "includeDefault");
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, introspector.findSerializationInclusion(defF, JsonInclude.Include.USE_DEFAULTS));

        AnnotatedField plainField = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, introspector.findSerializationInclusion(plainField, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, introspector.findSerializationInclusionForContent(plainField, JsonInclude.Include.USE_DEFAULTS));
        Assert.assertNull(introspector.findKeySerializer(plainField));
        Assert.assertNull(introspector.findContentSerializer(plainField));
        Assert.assertNull(introspector.findNullSerializer(plainField));
        Assert.assertNull(introspector.findSerializationType(plainField));
        Assert.assertNull(introspector.findSerializationKeyType(plainField, null));
        Assert.assertNull(introspector.findSerializationContentType(plainField, null));
        Assert.assertNull(introspector.findSerializationTyping(plainField));
        Assert.assertNull(introspector.findSerializationConverter(plainField));
        Assert.assertNull(introspector.findSerializationContentConverter(plainField));
    }

    @Test
    public void testSerializationOrderingAndAlphabetical() {
        AnnotatedClass ac = getAnnotatedClass(OrderedClass.class);
        String[] order = introspector.findSerializationPropertyOrder(ac);
        Assert.assertNotNull(order);
        Assert.assertArrayEquals(new String[]{"b", "a"}, order);
        Assert.assertEquals(Boolean.TRUE, introspector.findSerializationSortAlphabetically(ac));
        @SuppressWarnings("deprecation")
        Boolean deprecatedSort = introspector.findSerializationSortAlphabetically((Annotated) ac);
        Assert.assertEquals(Boolean.TRUE, deprecatedSort);

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findSerializationPropertyOrder(acNone));
        Assert.assertNull(introspector.findSerializationSortAlphabetically(acNone));
    }

    @Test
    public void testFindNameForSerialization() {
        AnnotatedMethod getter = getAnnotatedMethod(SerializationFeaturesClass.class, "getGetterName");
        PropertyName pnGetter = introspector.findNameForSerialization(getter);
        Assert.assertNotNull(pnGetter);
        Assert.assertEquals("getterName", pnGetter.getSimpleName());

        AnnotatedField propA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        PropertyName pnPropA = introspector.findNameForSerialization(propA);
        Assert.assertNotNull(pnPropA);
        Assert.assertEquals("propA", pnPropA.getSimpleName());

        AnnotatedField rawField = getAnnotatedField(SerializationFeaturesClass.class, "rawField");
        PropertyName pnRaw = introspector.findNameForSerialization(rawField);
        Assert.assertNotNull(pnRaw);
        Assert.assertEquals("", pnRaw.getSimpleName());

        AnnotatedField viewedField = getAnnotatedField(PropertyFeaturesClass.class, "viewedField");
        PropertyName pnView = introspector.findNameForSerialization(viewedField);
        Assert.assertNotNull(pnView);
        Assert.assertEquals("", pnView.getSimpleName());

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findNameForSerialization(acNone));
    }

    @Test
    public void testHasAsValueAnnotation() {
        AnnotatedMethod asValMethod = getAnnotatedMethod(SerializationFeaturesClass.class, "asValueMethod");
        Assert.assertTrue(introspector.hasAsValueAnnotation(asValMethod));

        AnnotatedMethod asValDisabled = getAnnotatedMethod(SerializationFeaturesClass.class, "asValueDisabledMethod");
        Assert.assertFalse(introspector.hasAsValueAnnotation(asValDisabled));

        AnnotatedMethod getter = getAnnotatedMethod(SerializationFeaturesClass.class, "getGetterName");
        Assert.assertFalse(introspector.hasAsValueAnnotation(getter));
    }

    @Test
    public void testDeserializationAnnotations() {
        AnnotatedField df = getAnnotatedField(DeserializationFeaturesClass.class, "deserializedField");
        Assert.assertEquals(DummyDeserializer.class, introspector.findDeserializer(df));
        Assert.assertEquals(DummyKeyDeserializer.class, introspector.findKeyDeserializer(df));
        Assert.assertEquals(DummyDeserializer.class, introspector.findContentDeserializer(df));
        Assert.assertEquals(String.class, introspector.findDeserializationType(df, null));
        Assert.assertEquals(Integer.class, introspector.findDeserializationKeyType(df, null));
        Assert.assertEquals(Long.class, introspector.findDeserializationContentType(df, null));
        Assert.assertEquals(DummyConverter.class, introspector.findDeserializationConverter(df));
        Assert.assertEquals(DummyConverter.class, introspector.findDeserializationContentConverter(df));

        AnnotatedField plainField = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        Assert.assertNull(introspector.findDeserializer(plainField));
        Assert.assertNull(introspector.findKeyDeserializer(plainField));
        Assert.assertNull(introspector.findContentDeserializer(plainField));
        Assert.assertNull(introspector.findDeserializationType(plainField, null));
        Assert.assertNull(introspector.findDeserializationKeyType(plainField, null));
        Assert.assertNull(introspector.findDeserializationContentType(plainField, null));
        Assert.assertNull(introspector.findDeserializationConverter(plainField));
        Assert.assertNull(introspector.findDeserializationContentConverter(plainField));
    }

    @Test
    public void testClassDeserializationAnnotations() {
        AnnotatedClass acInstantiator = getAnnotatedClass(ValueInstantiatorClass.class);
        Assert.assertEquals(ValueInstantiator.class, introspector.findValueInstantiator(acInstantiator));

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findValueInstantiator(acNone));

        AnnotatedClass acPojo = getAnnotatedClass(POJOBuilderClass.class);
        Assert.assertEquals(CustomPOJOBuilderConfig.class, introspector.findPOJOBuilder(acPojo));

        AnnotatedClass acConfig = getAnnotatedClass(CustomPOJOBuilderConfig.class);
        JsonPOJOBuilder.Value builderConfig = introspector.findPOJOBuilderConfig(acConfig);
        Assert.assertNotNull(builderConfig);
        Assert.assertEquals("constructPojo", builderConfig.buildMethodName);
        Assert.assertEquals("create", builderConfig.withPrefix);

        Assert.assertNull(introspector.findPOJOBuilder(acNone));
        Assert.assertNull(introspector.findPOJOBuilderConfig(acNone));
    }

    @Test
    public void testFindNameForDeserialization() {
        AnnotatedMethod setter = getAnnotatedMethod(DeserializationFeaturesClass.class, "setCustom");
        PropertyName pnSetter = introspector.findNameForDeserialization(setter);
        Assert.assertNotNull(pnSetter);
        Assert.assertEquals("setterCustomName", pnSetter.getSimpleName());

        AnnotatedField propA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        PropertyName pnPropA = introspector.findNameForDeserialization(propA);
        Assert.assertNotNull(pnPropA);
        Assert.assertEquals("propA", pnPropA.getSimpleName());

        AnnotatedField df = getAnnotatedField(DeserializationFeaturesClass.class, "deserializedField");
        PropertyName pnDf = introspector.findNameForDeserialization(df);
        Assert.assertNotNull(pnDf);
        Assert.assertEquals("", pnDf.getSimpleName());

        AnnotatedField unwrapped = getAnnotatedField(PropertyFeaturesClass.class, "unwrappedField");
        PropertyName pnUnwrapped = introspector.findNameForDeserialization(unwrapped);
        Assert.assertNotNull(pnUnwrapped);
        Assert.assertEquals("", pnUnwrapped.getSimpleName());

        AnnotatedField backRef = getAnnotatedField(PropertyFeaturesClass.class, "backRef");
        PropertyName pnBackRef = introspector.findNameForDeserialization(backRef);
        Assert.assertNotNull(pnBackRef);
        Assert.assertEquals("", pnBackRef.getSimpleName());

        AnnotatedField managedRef = getAnnotatedField(PropertyFeaturesClass.class, "managedRef");
        PropertyName pnManagedRef = introspector.findNameForDeserialization(managedRef);
        Assert.assertNotNull(pnManagedRef);
        Assert.assertEquals("", pnManagedRef.getSimpleName());

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        Assert.assertNull(introspector.findNameForDeserialization(acNone));
    }

    @Test
    public void testAnyGetterSetterAndCreator() {
        AnnotatedMethod anySetter = getAnnotatedMethod(DeserializationFeaturesClass.class, "anySetterMethod");
        Assert.assertTrue(introspector.hasAnySetterAnnotation(anySetter));

        AnnotatedMethod anyGetter = getAnnotatedMethod(DeserializationFeaturesClass.class, "anyGetterMethod");
        Assert.assertTrue(introspector.hasAnyGetterAnnotation(anyGetter));

        AnnotatedConstructor ctor = getAnnotatedConstructor(DeserializationFeaturesClass.class, 1);
        Assert.assertTrue(introspector.hasCreatorAnnotation(ctor));
        Assert.assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(ctor));

        AnnotatedMethod creatorDisabled = getAnnotatedMethod(DeserializationFeaturesClass.class, "createDisabled");
        Assert.assertFalse(introspector.hasCreatorAnnotation(creatorDisabled));
        Assert.assertEquals(JsonCreator.Mode.DISABLED, introspector.findCreatorBinding(creatorDisabled));

        AnnotatedMethod getter = getAnnotatedMethod(SerializationFeaturesClass.class, "getGetterName");
        Assert.assertFalse(introspector.hasAnySetterAnnotation(getter));
        Assert.assertFalse(introspector.hasAnyGetterAnnotation(getter));
        Assert.assertFalse(introspector.hasCreatorAnnotation(getter));
        Assert.assertNull(introspector.findCreatorBinding(getter));
    }

    @Test
    public void testFindAndAddVirtualProperties() {
        AnnotatedClass acPrepend = getAnnotatedClass(AppendPrependClass.class);
        List<BeanPropertyWriter> propsPrepend = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(mapper.getSerializationConfig(), acPrepend, propsPrepend);
        Assert.assertEquals(3, propsPrepend.size());
        Assert.assertEquals("propAttr1", propsPrepend.get(0).getName());
        Assert.assertEquals("attr2", propsPrepend.get(1).getName());
        Assert.assertEquals("virtProp", propsPrepend.get(2).getName());

        AnnotatedClass acAppend = getAnnotatedClass(AppendAppendClass.class);
        List<BeanPropertyWriter> propsAppend = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(mapper.getSerializationConfig(), acAppend, propsAppend);
        Assert.assertEquals(2, propsAppend.size());
        Assert.assertEquals("attrPost", propsAppend.get(0).getName());
        Assert.assertEquals("virtPropPost", propsAppend.get(1).getName());

        AnnotatedClass acNone = getAnnotatedClass(NoRoot.class);
        List<BeanPropertyWriter> propsEmpty = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(mapper.getSerializationConfig(), acNone, propsEmpty);
        Assert.assertTrue(propsEmpty.isEmpty());
    }

    @Test
    public void testTypeResolvers() {
        JavaType baseType = mapper.constructType(PolymorphicBase.class);
        AnnotatedClass acPoly = getAnnotatedClass(PolymorphicBase.class);
        TypeResolverBuilder<?> b1 = introspector.findTypeResolver(mapper.getSerializationConfig(), acPoly, baseType);
        Assert.assertNotNull(b1);

        AnnotatedClass acNoType = getAnnotatedClass(NoTypeInfoClass.class);
        TypeResolverBuilder<?> bNoType = introspector.findTypeResolver(mapper.getSerializationConfig(), acNoType, baseType);
        Assert.assertNotNull(bNoType);

        AnnotatedClass acCustom = getAnnotatedClass(CustomResolvedClass.class);
        TypeResolverBuilder<?> bCustom = introspector.findTypeResolver(mapper.getSerializationConfig(), acCustom, baseType);
        Assert.assertNotNull(bCustom);

        AnnotatedClass acBuilder = getAnnotatedClass(CustomBuilderClass.class);
        TypeResolverBuilder<?> bBuilder = introspector.findTypeResolver(mapper.getSerializationConfig(), acBuilder, baseType);
        Assert.assertNotNull(bBuilder);

        AnnotatedClass acBuilderNoInfo = getAnnotatedClass(CustomBuilderWithoutInfoClass.class);
        TypeResolverBuilder<?> bBuilderNoInfo = introspector.findTypeResolver(mapper.getSerializationConfig(), acBuilderNoInfo, baseType);
        Assert.assertNull(bBuilderNoInfo);

        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        JavaType stringType = mapper.constructType(String.class);
        TypeResolverBuilder<?> bProp = introspector.findPropertyTypeResolver(mapper.getSerializationConfig(), fieldA, stringType);
        Assert.assertNull(bProp);

        JavaType listType = mapper.constructType(List.class);
        TypeResolverBuilder<?> bPropContainer = introspector.findPropertyTypeResolver(mapper.getSerializationConfig(), fieldA, listType);
        Assert.assertNull(bPropContainer);

        TypeResolverBuilder<?> bContent = introspector.findPropertyContentTypeResolver(mapper.getSerializationConfig(), fieldA, listType);
        Assert.assertNull(bContent);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolverWithNonContainerType() {
        AnnotatedField fieldA = getAnnotatedField(PropertyFeaturesClass.class, "propA");
        JavaType stringType = mapper.constructType(String.class);
        introspector.findPropertyContentTypeResolver(mapper.getSerializationConfig(), fieldA, stringType);
    }

    @Test
    public void testHelperMethods() {
        Assert.assertNull(introspector._classIfExplicit(null));
        Assert.assertNull(introspector._classIfExplicit(com.fasterxml.jackson.databind.annotation.NoClass.class));
        Assert.assertEquals(String.class, introspector._classIfExplicit(String.class));

        Assert.assertNull(introspector._classIfExplicit(Converter.None.class, Converter.None.class));
        Assert.assertNull(introspector._classIfExplicit(null, Converter.None.class));
        Assert.assertEquals(DummyConverter.class, introspector._classIfExplicit(DummyConverter.class, Converter.None.class));

        PropertyName pnDef = introspector._propertyName("", null);
        Assert.assertSame(PropertyName.USE_DEFAULT, pnDef);

        PropertyName pnSimple = introspector._propertyName("simple", null);
        Assert.assertEquals("simple", pnSimple.getSimpleName());
        Assert.assertNull(pnSimple.getNamespace());

        PropertyName pnNs = introspector._propertyName("simple", "ns");
        Assert.assertEquals("simple", pnNs.getSimpleName());
        Assert.assertEquals("ns", pnNs.getNamespace());
    }
}
