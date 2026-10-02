package com.fasterxml.jackson.databind.introspect;

import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector introspector;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        introspector = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
    }

    // --- Helper Annotations & Dummy Classes ---

    @JacksonAnnotationsInside
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
    private @interface CustomBundle {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    private @interface NonBundleAnnotation {}

    public enum TestEnum {
        @JsonProperty("custom_first")
        FIRST,
        @JsonProperty("")
        SECOND,
        THIRD
    }

    public enum EmptyTestEnum {}

    @JsonRootName(value = "root", namespace = "http://example.com")
    private static class RootClassWithNs {}

    @JsonRootName(value = "root_no_ns", namespace = "")
    private static class RootClassNoNs {}

    private static class NoAnnotationClass {}

    @JsonIgnoreProperties(value = {"prop1", "prop2"}, allowGetters = true, allowSetters = false, ignoreUnknown = true)
    private static class IgnorePropertiesClass1 {}

    @JsonIgnoreProperties(value = {"prop3"}, allowGetters = false, allowSetters = true, ignoreUnknown = false)
    private static class IgnorePropertiesClass2 {}

    @JsonIgnoreType(true)
    private static class IgnorableTypeClass {}

    @JsonIgnoreType(false)
    private static class NonIgnorableTypeClass {}

    @JsonFilter("filter1")
    private static class FilterClass {}

    @JsonFilter("")
    private static class EmptyFilterClass {}

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    private static class NamingClass {}

    @JsonClassDescription("Class Description")
    private static class ClassDescClass {}

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    private static class AutoDetectClass {}

    private static class PropertyMetaClass {
        @JsonProperty(value = "field1", required = true, index = 2, defaultValue = "defaultVal", access = JsonProperty.Access.READ_ONLY)
        public String field1;

        @JsonProperty(value = "", required = false, index = JsonProperty.INDEX_UNKNOWN, defaultValue = "")
        public String field2;

        @JsonPropertyDescription("field desc")
        public String field3;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        public Date fieldDate;

        @JsonManagedReference("refName")
        public Object managedRef;

        @JsonBackReference("refName")
        public Object backRef;

        @JsonUnwrapped(prefix = "pre_", suffix = "_post", enabled = true)
        public Object unwrappedProp;

        @JsonUnwrapped(enabled = false)
        public Object disabledUnwrapped;

        @JacksonInject("injectId")
        public String injectedNamed;

        @JacksonInject("")
        public String injectedDefault;

        public void setterNoParam() {}
        public void setterWithParam(String s) {}

        @JsonView(String.class)
        public String viewField;
    }

    private static class SetterConflictClass {
        public void setPrimitive(int x) {}
        public void setWrapper(Integer x) {}
        public void setString(String x) {}
        public void setObject(Object x) {}
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SubTypeClass.class, visible = true)
    @JsonSubTypes({
        @JsonSubTypes.Type(value = SubTypeClass.class, name = "subType")
    })
    @JsonTypeName("baseTypeName")
    private static class TypeInfoBaseClass {}

    private static class SubTypeClass extends TypeInfoBaseClass {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    private static class NoTypeInfoClass {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.EXTERNAL_PROPERTY)
    @JsonTypeResolver(StdTypeResolverBuilder.class)
    @JsonTypeIdResolver(TypeIdResolver.class)
    private static class CustomTypeResolverClass {}

    @JsonTypeResolver(StdTypeResolverBuilder.class)
    private static class TypeResolverWithoutTypeInfoClass {}

    private static class TypeIdMemberClass {
        @JsonTypeId
        public String typeIdField;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = ObjectIdClass.class, resolver = SimpleObjectIdResolver.class)
    @JsonIdentityReference(alwaysAsId = true)
    private static class ObjectIdClass {
        public String id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    private static class NoneObjectIdClass {}

    private static class CustomJsonSerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
    }

    private static class CustomJsonDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
    }

    private static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
    }

    public static class CustomConverter implements Converter<Object, Object> {
        @Override
        public Object convert(Object value) { return value; }
        @Override
        public JavaType getInputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
        @Override
        public JavaType getOutputType(TypeFactory typeFactory) { return typeFactory.constructType(Object.class); }
    }

    private static class SerializationClass {
        @JsonSerialize(using = CustomJsonSerializer.class, keyUsing = CustomJsonSerializer.class, contentUsing = CustomJsonSerializer.class, nullsUsing = CustomJsonSerializer.class, as = Object.class, keyAs = Object.class, contentAs = Object.class, typing = JsonSerialize.Typing.DYNAMIC, converter = CustomConverter.class, contentConverter = CustomConverter.class)
        public Object serProp;

        @JsonSerialize(using = JsonSerializer.None.class, keyUsing = JsonSerializer.None.class, contentUsing = JsonSerializer.None.class, nullsUsing = JsonSerializer.None.class, as = Void.class, converter = Converter.None.class)
        public Object serDefaultProp;

        @JsonRawValue(true)
        public String rawVal;

        @JsonRawValue(false)
        public String nonRawVal;

        @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.NON_EMPTY)
        public Object includeProp;

        @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS, content = JsonInclude.Include.USE_DEFAULTS)
        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
        public Object serIncludeProp;

        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
        public Object serAlwaysProp;

        @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
        public Object serNonEmptyProp;

        @JsonPropertyOrder(value = {"b", "a"}, alphabetic = true)
        public String a;
        public String b;
    }

    public static class DummyVirtualWriter extends VirtualBeanPropertyWriter {
        public DummyVirtualWriter() { super(); }
        public DummyVirtualWriter(BeanPropertyDefinition propDef, Annotations contextAnnotations, JavaType declaredType) {
            super(propDef, contextAnnotations, declaredType);
        }
        @Override
        protected Object value(Object bean, JsonGenerator gen, SerializerProvider prov) { return "virtual"; }
        @Override
        public VirtualBeanPropertyWriter withConfig(MapperConfig<?> config, AnnotatedClass declaringClass, BeanPropertyDefinition propDef, JavaType type) {
            return new DummyVirtualWriter(propDef, declaringClass.getAnnotations(), type);
        }
    }

    @JsonAppend(
        prepend = true,
        attrs = {
            @JsonAppend.Attr(value = "attr1", propName = "prop1", propNamespace = "ns1", required = true, include = JsonInclude.Include.NON_NULL),
            @JsonAppend.Attr(value = "attr2", propName = "", propNamespace = "")
        },
        props = {
            @JsonAppend.Prop(value = DummyVirtualWriter.class, name = "vProp1", namespace = "ns2", type = String.class, required = false, include = JsonInclude.Include.ALWAYS)
        }
    )
    private static class AppendClassPrepend {}

    @JsonAppend(
        prepend = false,
        attrs = { @JsonAppend.Attr(value = "attr3") },
        props = { @JsonAppend.Prop(value = DummyVirtualWriter.class, name = "vProp2") }
    )
    private static class AppendClassAppend {}

    private static class GetterSetterClass {
        @JsonGetter("customGet")
        public String getCustom() { return "val"; }

        @JsonProperty("customProp")
        public String getCustomProp() { return "val"; }

        @JsonSerialize
        public String getInferred() { return "val"; }

        @JsonValue(true)
        public String asVal() { return "val"; }

        @JsonValue(false)
        public String notAsVal() { return "val"; }

        @JsonSetter("customSet")
        public void setCustom(String s) {}

        @JsonProperty("customPropSet")
        public void setCustomProp(String s) {}

        @JsonDeserialize
        public void setInferred(String s) {}

        @JsonAnySetter
        public void anySet(String key, Object val) {}

        @JsonAnyGetter
        public Map<String, Object> anyGet() { return null; }
    }

    private static class DeserializationClass {
        @JsonDeserialize(using = CustomJsonDeserializer.class, keyUsing = CustomKeyDeserializer.class, contentUsing = CustomJsonDeserializer.class, as = Object.class, keyAs = Object.class, contentAs = Object.class, converter = CustomConverter.class, contentConverter = CustomConverter.class, builder = SubTypeClass.class)
        public Object deserProp;

        @JsonDeserialize(using = JsonDeserializer.None.class, keyUsing = KeyDeserializer.None.class, contentUsing = JsonDeserializer.None.class, as = Void.class, converter = Converter.None.class)
        public Object deserDefaultProp;
    }

    @JsonValueInstantiator(Object.class)
    @JsonPOJOBuilder(buildMethodName = "buildIt", withPrefix = "withIt")
    private static class BuilderInstantiatorClass {}

    private static class CreatorClass {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public CreatorClass(@JsonProperty("a") String a) {}

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public CreatorClass(int a) {}

        @ConstructorProperties({"x", "y"})
        public CreatorClass(int x, int y) {}

        public CreatorClass(String a, String b) {}
    }

    private static class TransientClass {
        @JsonIgnore(true)
        public String ignored;

        @JsonIgnore(false)
        public String notIgnored;

        @Transient(true)
        public String javaTransient;

        @Transient(false)
        public String javaNonTransient;
    }

    // --- Tests ---

    private AnnotatedClass getAnnotatedClass(Class<?> cls) {
        return AnnotatedClass.constructWithoutSuperTypes(cls, introspector, null);
    }

    @Test
    public void testVersion_normal_notNull() {
        Version v = introspector.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator_toggle_reflectsState() {
        Assert.assertSame(introspector, introspector.setConstructorPropertiesImpliesCreator(false));
        Assert.assertSame(introspector, introspector.setConstructorPropertiesImpliesCreator(true));
    }

    @Test
    public void testReadResolve_afterSerialization_validCache() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(introspector);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        JacksonAnnotationIntrospector resolved = (JacksonAnnotationIntrospector) ois.readObject();
        Assert.assertNotNull(resolved);
        Assert.assertNotNull(resolved._annotationsInside);
    }

    @Test
    public void testIsAnnotationBundle_variousAnnotations_correctBoolean() {
        Annotation bundleAnn = CustomBundle.class.getAnnotations()[0];
        Assert.assertTrue(introspector.isAnnotationBundle(bundleAnn));

        Annotation nonBundleAnn = RootClassWithNs.class.getAnnotation(JsonRootName.class);
        Assert.assertFalse(introspector.isAnnotationBundle(nonBundleAnn));

        // Test caching branch (second invocation hit cache)
        Assert.assertTrue(introspector.isAnnotationBundle(bundleAnn));
        Assert.assertFalse(introspector.isAnnotationBundle(nonBundleAnn));
    }

    @Test
    public void testFindEnumValue_enumConstants_returnsExplicitOrName() {
        Assert.assertEquals("custom_first", introspector.findEnumValue(TestEnum.FIRST));
        Assert.assertEquals("SECOND", introspector.findEnumValue(TestEnum.SECOND));
        Assert.assertEquals("THIRD", introspector.findEnumValue(TestEnum.THIRD));
    }

    @Test
    public void testFindEnumValues_enumClass_populatesNamesCorrectly() {
        Enum<?>[] values = TestEnum.values();
        String[] names = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            names[i] = values[i].name();
        }

        String[] result = introspector.findEnumValues(TestEnum.class, values, names);
        Assert.assertEquals("custom_first", result[0]);
        Assert.assertEquals("SECOND", result[1]);
        Assert.assertEquals("THIRD", result[2]);

        String[] emptyResult = introspector.findEnumValues(EmptyTestEnum.class, new Enum<?>[0], new String[0]);
        Assert.assertEquals(0, emptyResult.length);
    }

    @Test
    public void testFindRootName_classWithAndWithoutNamespace_returnsPropertyName() {
        AnnotatedClass acWithNs = getAnnotatedClass(RootClassWithNs.class);
        PropertyName pn1 = introspector.findRootName(acWithNs);
        Assert.assertNotNull(pn1);
        Assert.assertEquals("root", pn1.getSimpleName());
        Assert.assertEquals("http://example.com", pn1.getNamespace());

        AnnotatedClass acNoNs = getAnnotatedClass(RootClassNoNs.class);
        PropertyName pn2 = introspector.findRootName(acNoNs);
        Assert.assertNotNull(pn2);
        Assert.assertEquals("root_no_ns", pn2.getSimpleName());
        Assert.assertNull(pn2.getNamespace());

        AnnotatedClass acNone = getAnnotatedClass(NoAnnotationClass.class);
        Assert.assertNull(introspector.findRootName(acNone));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testFindPropertiesToIgnore_deprecatedAndNewMethod_respectsRules() {
        AnnotatedClass ac1 = getAnnotatedClass(IgnorePropertiesClass1.class);
        AnnotatedClass ac2 = getAnnotatedClass(IgnorePropertiesClass2.class);
        AnnotatedClass acNone = getAnnotatedClass(NoAnnotationClass.class);

        // Deprecated
        Assert.assertArrayEquals(new String[]{"prop1", "prop2"}, introspector.findPropertiesToIgnore(ac1));
        Assert.assertNull(introspector.findPropertiesToIgnore(acNone));

        // For serialization
        Assert.assertNull(introspector.findPropertiesToIgnore(ac1, true)); // allowGetters = true
        Assert.assertArrayEquals(new String[]{"prop3"}, introspector.findPropertiesToIgnore(ac2, true));

        // For deserialization
        Assert.assertArrayEquals(new String[]{"prop1", "prop2"}, introspector.findPropertiesToIgnore(ac1, false));
        Assert.assertNull(introspector.findPropertiesToIgnore(ac2, false)); // allowSetters = true

        Assert.assertNull(introspector.findPropertiesToIgnore(acNone, true));
    }

    @Test
    public void testFindIgnoreUnknownProperties_variousClasses_returnsExpected() {
        Assert.assertEquals(Boolean.TRUE, introspector.findIgnoreUnknownProperties(getAnnotatedClass(IgnorePropertiesClass1.class)));
        Assert.assertEquals(Boolean.FALSE, introspector.findIgnoreUnknownProperties(getAnnotatedClass(IgnorePropertiesClass2.class)));
        Assert.assertNull(introspector.findIgnoreUnknownProperties(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testIsIgnorableType_classes_returnsExpected() {
        Assert.assertEquals(Boolean.TRUE, introspector.isIgnorableType(getAnnotatedClass(IgnorableTypeClass.class)));
        Assert.assertEquals(Boolean.FALSE, introspector.isIgnorableType(getAnnotatedClass(NonIgnorableTypeClass.class)));
        Assert.assertNull(introspector.isIgnorableType(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testFindFilterId_classes_returnsExpected() {
        Assert.assertEquals("filter1", introspector.findFilterId(getAnnotatedClass(FilterClass.class)));
        Assert.assertNull(introspector.findFilterId(getAnnotatedClass(EmptyFilterClass.class)));
        Assert.assertNull(introspector.findFilterId(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testFindNamingStrategy_class_returnsExpected() {
        Assert.assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, introspector.findNamingStrategy(getAnnotatedClass(NamingClass.class)));
        Assert.assertNull(introspector.findNamingStrategy(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testFindClassDescription_class_returnsExpected() {
        Assert.assertEquals("Class Description", introspector.findClassDescription(getAnnotatedClass(ClassDescClass.class)));
        Assert.assertNull(introspector.findClassDescription(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testFindAutoDetectVisibility_class_returnsModifiedChecker() {
        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        VisibilityChecker<?> modified = introspector.findAutoDetectVisibility(getAnnotatedClass(AutoDetectClass.class), checker);
        Assert.assertNotEquals(checker, modified);

        VisibilityChecker<?> unmod = introspector.findAutoDetectVisibility(getAnnotatedClass(NoAnnotationClass.class), checker);
        Assert.assertSame(checker, unmod);
    }

    @Test
    public void testFindImplicitPropertyName_andConstructorName() throws Exception {
        Constructor<CreatorClass> ctor = CreatorClass.class.getDeclaredConstructor(int.class, int.class);
        AnnotatedConstructor ac = new AnnotatedConstructor(null, ctor, null, null);
        AnnotatedParameter param0 = new AnnotatedParameter(ac, int.class, null, 0);
        AnnotatedParameter param1 = new AnnotatedParameter(ac, int.class, null, 1);
        AnnotatedParameter paramOut = new AnnotatedParameter(ac, int.class, null, 2);

        Assert.assertEquals("x", introspector.findImplicitPropertyName(param0));
        Assert.assertEquals("y", introspector.findImplicitPropertyName(param1));
        Assert.assertNull(introspector.findImplicitPropertyName(paramOut));

        Constructor<NoAnnotationClass> ctorNoAnn = NoAnnotationClass.class.getDeclaredConstructor();
        AnnotatedConstructor acNoAnn = new AnnotatedConstructor(null, ctorNoAnn, null, null);
        AnnotatedParameter paramNoAnn = new AnnotatedParameter(acNoAnn, Object.class, null, 0);
        Assert.assertNull(introspector.findImplicitPropertyName(paramNoAnn));

        AnnotatedField field = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);
        Assert.assertNull(introspector.findImplicitPropertyName(field));
    }

    @Test
    public void testPropertyAttributes_requiredAccessIndexDefaultValue() throws Exception {
        AnnotatedField field1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);
        AnnotatedField field2 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field2"), null);
        AnnotatedField field3 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field3"), null);

        Assert.assertEquals(Boolean.TRUE, introspector.hasRequiredMarker(field1));
        Assert.assertEquals(Boolean.FALSE, introspector.hasRequiredMarker(field2));
        Assert.assertNull(introspector.hasRequiredMarker(field3));

        Assert.assertEquals(JsonProperty.Access.READ_ONLY, introspector.findPropertyAccess(field1));
        Assert.assertEquals(JsonProperty.Access.AUTO, introspector.findPropertyAccess(field2));
        Assert.assertNull(introspector.findPropertyAccess(field3));

        Assert.assertEquals(Integer.valueOf(2), introspector.findPropertyIndex(field1));
        Assert.assertNull(introspector.findPropertyIndex(field2));
        Assert.assertNull(introspector.findPropertyIndex(field3));

        Assert.assertEquals("defaultVal", introspector.findPropertyDefaultValue(field1));
        Assert.assertNull(introspector.findPropertyDefaultValue(field2));
        Assert.assertNull(introspector.findPropertyDefaultValue(field3));

        Assert.assertEquals("field desc", introspector.findPropertyDescription(field3));
        Assert.assertNull(introspector.findPropertyDescription(field1));
    }

    @Test
    public void testFindFormat_field_returnsFormatValue() throws Exception {
        AnnotatedField fieldDate = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("fieldDate"), null);
        AnnotatedField field1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        JsonFormat.Value f = introspector.findFormat(fieldDate);
        Assert.assertNotNull(f);
        Assert.assertEquals("yyyy-MM-dd", f.getPattern());
        Assert.assertEquals(JsonFormat.Shape.STRING, f.getShape());

        Assert.assertNull(introspector.findFormat(field1));
    }

    @Test
    public void testFindReferenceType_fields_returnsManagedOrBack() throws Exception {
        AnnotatedField mRef = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("managedRef"), null);
        AnnotatedField bRef = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("backRef"), null);
        AnnotatedField f1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        AnnotationIntrospector.ReferenceProperty propM = introspector.findReferenceType(mRef);
        Assert.assertNotNull(propM);
        Assert.assertTrue(propM.isManagedReference());
        Assert.assertEquals("refName", propM.getName());

        AnnotationIntrospector.ReferenceProperty propB = introspector.findReferenceType(bRef);
        Assert.assertNotNull(propB);
        Assert.assertTrue(propB.isBackReference());
        Assert.assertEquals("refName", propB.getName());

        Assert.assertNull(introspector.findReferenceType(f1));
    }

    @Test
    public void testFindUnwrappingNameTransformer_fields_returnsTransformer() throws Exception {
        AnnotatedField unwrapped = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("unwrappedProp"), null);
        AnnotatedField disabled = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("disabledUnwrapped"), null);
        AnnotatedField f1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        NameTransformer t = introspector.findUnwrappingNameTransformer(unwrapped);
        Assert.assertNotNull(t);
        Assert.assertEquals("pre_name_post", t.transform("name"));

        Assert.assertNull(introspector.findUnwrappingNameTransformer(disabled));
        Assert.assertNull(introspector.findUnwrappingNameTransformer(f1));
    }

    @Test
    public void testFindInjectableValueId_fieldsAndMethods_returnsCorrectId() throws Exception {
        AnnotatedField injectedNamed = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("injectedNamed"), null);
        AnnotatedField injectedDefault = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("injectedDefault"), null);
        AnnotatedField f1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        Assert.assertEquals("injectId", introspector.findInjectableValueId(injectedNamed));
        Assert.assertEquals(String.class.getName(), introspector.findInjectableValueId(injectedDefault));
        Assert.assertNull(introspector.findInjectableValueId(f1));

        Method mNoParam = PropertyMetaClass.class.getDeclaredMethod("setterNoParam");
        Method mWithParam = PropertyMetaClass.class.getDeclaredMethod("setterWithParam", String.class);
        AnnotatedMethod amNoParam = new AnnotatedMethod(null, mNoParam, null, null);
        AnnotatedMethod amWithParam = new AnnotatedMethod(null, mWithParam, null, null);

        // JacksonInject dummy annotations on methods via sub-inspectors or direct mock
        JacksonAnnotationIntrospector subIntro = new JacksonAnnotationIntrospector() {
            @Override
            protected <A extends Annotation> A _findAnnotation(Annotated a, Class<A> annoClass) {
                if (annoClass == JacksonInject.class) {
                    return (A) new JacksonInject() {
                        @Override
                        public Class<? extends Annotation> annotationType() { return JacksonInject.class; }
                        @Override
                        public String value() { return ""; }
                    };
                }
                return super._findAnnotation(a, annoClass);
            }
        };

        Assert.assertEquals(void.class.getName(), subIntro.findInjectableValueId(amNoParam));
        Assert.assertEquals(String.class.getName(), subIntro.findInjectableValueId(amWithParam));
    }

    @Test
    public void testFindViews_annotated_returnsViewClasses() throws Exception {
        AnnotatedField fView = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("viewField"), null);
        AnnotatedField f1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        Class<?>[] views = introspector.findViews(fView);
        Assert.assertNotNull(views);
        Assert.assertEquals(1, views.length);
        Assert.assertEquals(String.class, views[0]);

        Assert.assertNull(introspector.findViews(f1));
    }

    @Test
    public void testResolveSetterConflict_variousParams_resolvesCorrectly() throws Exception {
        Method mPrim = SetterConflictClass.class.getDeclaredMethod("setPrimitive", int.class);
        Method mWrap = SetterConflictClass.class.getDeclaredMethod("setWrapper", Integer.class);
        Method mStr = SetterConflictClass.class.getDeclaredMethod("setString", String.class);
        Method mObj = SetterConflictClass.class.getDeclaredMethod("setObject", Object.class);

        AnnotatedMethod amPrim = new AnnotatedMethod(null, mPrim, null, null);
        AnnotatedMethod amWrap = new AnnotatedMethod(null, mWrap, null, null);
        AnnotatedMethod amStr = new AnnotatedMethod(null, mStr, null, null);
        AnnotatedMethod amObj = new AnnotatedMethod(null, mObj, null, null);

        Assert.assertSame(amPrim, introspector.resolveSetterConflict(null, amPrim, amWrap));
        Assert.assertSame(amPrim, introspector.resolveSetterConflict(null, amWrap, amPrim));

        Assert.assertSame(amStr, introspector.resolveSetterConflict(null, amStr, amObj));
        Assert.assertSame(amStr, introspector.resolveSetterConflict(null, amObj, amStr));

        Assert.assertNull(introspector.resolveSetterConflict(null, amWrap, amObj));
    }

    @Test
    public void testPolymorphicTypeResolvers_standardAndCustom() throws Exception {
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.constructType(TypeInfoBaseClass.class);
        JavaType mapType = mapper.constructType(Map.class);

        AnnotatedClass ac = getAnnotatedClass(TypeInfoBaseClass.class);
        TypeResolverBuilder<?> builder = introspector.findTypeResolver(config, ac, baseType);
        Assert.assertNotNull(builder);

        AnnotatedField tf = new AnnotatedField(null, TypeIdMemberClass.class.getDeclaredField("typeIdField"), null);
        TypeResolverBuilder<?> propBuilder = introspector.findPropertyTypeResolver(config, tf, baseType);
        Assert.assertNotNull(propBuilder);

        Assert.assertNull(introspector.findPropertyTypeResolver(config, tf, mapType));

        TypeResolverBuilder<?> contentBuilder = introspector.findPropertyContentTypeResolver(config, tf, mapType);
        Assert.assertNotNull(contentBuilder);

        AnnotatedClass acNo = getAnnotatedClass(NoTypeInfoClass.class);
        TypeResolverBuilder<?> noBuilder = introspector.findTypeResolver(config, acNo, mapper.constructType(NoTypeInfoClass.class));
        Assert.assertNotNull(noBuilder);

        AnnotatedClass acCust = getAnnotatedClass(CustomTypeResolverClass.class);
        TypeResolverBuilder<?> custBuilder = introspector.findTypeResolver(config, acCust, mapper.constructType(CustomTypeResolverClass.class));
        Assert.assertNotNull(custBuilder);

        AnnotatedClass acResWithoutInfo = getAnnotatedClass(TypeResolverWithoutTypeInfoClass.class);
        Assert.assertNull(introspector.findTypeResolver(config, acResWithoutInfo, mapper.constructType(TypeResolverWithoutTypeInfoClass.class)));

        AnnotatedClass acNone = getAnnotatedClass(NoAnnotationClass.class);
        Assert.assertNull(introspector.findTypeResolver(config, acNone, mapper.constructType(NoAnnotationClass.class)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolver_nonContainer_throwsException() throws Exception {
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType nonContainer = mapper.constructType(String.class);
        AnnotatedField tf = new AnnotatedField(null, TypeIdMemberClass.class.getDeclaredField("typeIdField"), null);
        introspector.findPropertyContentTypeResolver(config, tf, nonContainer);
    }

    @Test
    public void testSubtypesAndTypeNameAndTypeId() throws Exception {
        AnnotatedClass ac = getAnnotatedClass(TypeInfoBaseClass.class);
        List<NamedType> subtypes = introspector.findSubtypes(ac);
        Assert.assertNotNull(subtypes);
        Assert.assertEquals(1, subtypes.size());
        Assert.assertEquals(SubTypeClass.class, subtypes.get(0).getType());
        Assert.assertEquals("subType", subtypes.get(0).getName());

        Assert.assertNull(introspector.findSubtypes(getAnnotatedClass(NoAnnotationClass.class)));

        Assert.assertEquals("baseTypeName", introspector.findTypeName(ac));
        Assert.assertNull(introspector.findTypeName(getAnnotatedClass(NoAnnotationClass.class)));

        AnnotatedField tf = new AnnotatedField(null, TypeIdMemberClass.class.getDeclaredField("typeIdField"), null);
        Assert.assertEquals(Boolean.TRUE, introspector.isTypeId(tf));
        AnnotatedField f1 = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);
        Assert.assertEquals(Boolean.FALSE, introspector.isTypeId(f1));
    }

    @Test
    public void testFindObjectIdInfo_andObjectReferenceInfo() {
        AnnotatedClass acId = getAnnotatedClass(ObjectIdClass.class);
        ObjectIdInfo info = introspector.findObjectIdInfo(acId);
        Assert.assertNotNull(info);
        Assert.assertEquals(new PropertyName("id"), info.getPropertyName());
        Assert.assertEquals(ObjectIdClass.class, info.getScope());
        Assert.assertEquals(ObjectIdGenerators.PropertyGenerator.class, info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());

        ObjectIdInfo refInfo = introspector.findObjectReferenceInfo(acId, info);
        Assert.assertNotNull(refInfo);
        Assert.assertTrue(refInfo.getAlwaysAsId());

        AnnotatedClass acNoneId = getAnnotatedClass(NoneObjectIdClass.class);
        Assert.assertNull(introspector.findObjectIdInfo(acNoneId));
        Assert.assertNull(introspector.findObjectIdInfo(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testSerializersAndConverters() throws Exception {
        AnnotatedField serProp = new AnnotatedField(null, SerializationClass.class.getDeclaredField("serProp"), null);
        AnnotatedField serDefProp = new AnnotatedField(null, SerializationClass.class.getDeclaredField("serDefaultProp"), null);
        AnnotatedField rawVal = new AnnotatedField(null, SerializationClass.class.getDeclaredField("rawVal"), null);
        AnnotatedField nonRawVal = new AnnotatedField(null, SerializationClass.class.getDeclaredField("nonRawVal"), null);

        Assert.assertEquals(CustomJsonSerializer.class, introspector.findSerializer(serProp));
        Assert.assertNull(introspector.findSerializer(serDefProp));
        Object rawSer = introspector.findSerializer(rawVal);
        Assert.assertTrue(rawSer instanceof RawSerializer<?>);
        Assert.assertNull(introspector.findSerializer(nonRawVal));

        Assert.assertEquals(CustomJsonSerializer.class, introspector.findKeySerializer(serProp));
        Assert.assertNull(introspector.findKeySerializer(serDefProp));

        Assert.assertEquals(CustomJsonSerializer.class, introspector.findContentSerializer(serProp));
        Assert.assertNull(introspector.findContentSerializer(serDefProp));

        Assert.assertEquals(CustomJsonSerializer.class, introspector.findNullSerializer(serProp));
        Assert.assertNull(introspector.findNullSerializer(serDefProp));

        Assert.assertEquals(Object.class, introspector.findSerializationType(serProp));
        Assert.assertNull(introspector.findSerializationType(serDefProp));

        Assert.assertEquals(Object.class, introspector.findSerializationKeyType(serProp, null));
        Assert.assertNull(introspector.findSerializationKeyType(serDefProp, null));

        Assert.assertEquals(Object.class, introspector.findSerializationContentType(serProp, null));
        Assert.assertNull(introspector.findSerializationContentType(serDefProp, null));

        Assert.assertEquals(JsonSerialize.Typing.DYNAMIC, introspector.findSerializationTyping(serProp));
        Assert.assertNull(introspector.findSerializationTyping(serDefProp));

        Assert.assertEquals(CustomConverter.class, introspector.findSerializationConverter(serProp));
        Assert.assertNull(introspector.findSerializationConverter(serDefProp));

        Assert.assertEquals(CustomConverter.class, introspector.findSerializationContentConverter(serProp));
        Assert.assertNull(introspector.findSerializationContentConverter(serDefProp));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testInclusionMethods() throws Exception {
        AnnotatedField incProp = new AnnotatedField(null, SerializationClass.class.getDeclaredField("includeProp"), null);
        AnnotatedField serIncProp = new AnnotatedField(null, SerializationClass.class.getDeclaredField("serIncludeProp"), null);
        AnnotatedField serAlways = new AnnotatedField(null, SerializationClass.class.getDeclaredField("serAlwaysProp"), null);
        AnnotatedField serNonEmpty = new AnnotatedField(null, SerializationClass.class.getDeclaredField("serNonEmptyProp"), null);
        AnnotatedField plainField = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        Assert.assertEquals(JsonInclude.Include.NON_NULL, introspector.findSerializationInclusion(incProp, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, introspector.findSerializationInclusion(serIncProp, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(serAlways, JsonInclude.Include.NON_NULL));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusion(serNonEmpty, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusion(plainField, JsonInclude.Include.ALWAYS));

        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, introspector.findSerializationInclusionForContent(incProp, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, introspector.findSerializationInclusionForContent(serIncProp, JsonInclude.Include.ALWAYS));

        JsonInclude.Value incVal = introspector.findPropertyInclusion(incProp);
        Assert.assertEquals(JsonInclude.Include.NON_NULL, incVal.getValueInclusion());
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, incVal.getContentInclusion());

        JsonInclude.Value incVal2 = introspector.findPropertyInclusion(serIncProp);
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, incVal2.getValueInclusion());

        JsonInclude.Value incValAlways = introspector.findPropertyInclusion(serAlways);
        Assert.assertEquals(JsonInclude.Include.ALWAYS, incValAlways.getValueInclusion());

        JsonInclude.Value incValEmpty = introspector.findPropertyInclusion(serNonEmpty);
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, incValEmpty.getValueInclusion());

        JsonInclude.Value incValPlain = introspector.findPropertyInclusion(plainField);
        Assert.assertEquals(JsonInclude.Include.USE_DEFAULTS, incValPlain.getValueInclusion());
    }

    @Test
    public void testSerializationOrdering() {
        AnnotatedClass ac = getAnnotatedClass(SerializationClass.class);
        String[] order = introspector.findSerializationPropertyOrder(ac);
        Assert.assertArrayEquals(new String[]{"b", "a"}, order);
        Assert.assertEquals(Boolean.TRUE, introspector.findSerializationSortAlphabetically(ac));

        AnnotatedClass acNone = getAnnotatedClass(NoAnnotationClass.class);
        Assert.assertNull(introspector.findSerializationPropertyOrder(acNone));
        Assert.assertNull(introspector.findSerializationSortAlphabetically(acNone));
    }

    @Test
    public void testFindAndAddVirtualProperties_bothPrependAndAppend() {
        SerializationConfig config = mapper.getSerializationConfig();

        AnnotatedClass acPrepend = getAnnotatedClass(AppendClassPrepend.class);
        List<BeanPropertyWriter> propsPrepend = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(config, acPrepend, propsPrepend);
        Assert.assertEquals(3, propsPrepend.size());

        AnnotatedClass acAppend = getAnnotatedClass(AppendClassAppend.class);
        List<BeanPropertyWriter> propsAppend = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(config, acAppend, propsAppend);
        Assert.assertEquals(2, propsAppend.size());

        AnnotatedClass acNone = getAnnotatedClass(NoAnnotationClass.class);
        List<BeanPropertyWriter> propsNone = new ArrayList<BeanPropertyWriter>();
        introspector.findAndAddVirtualProperties(config, acNone, propsNone);
        Assert.assertEquals(0, propsNone.size());
    }

    @Test
    public void testSerializationPropertyAnnotations() throws Exception {
        Method mGetCustom = GetterSetterClass.class.getDeclaredMethod("getCustom");
        Method mGetCustomProp = GetterSetterClass.class.getDeclaredMethod("getCustomProp");
        Method mGetInferred = GetterSetterClass.class.getDeclaredMethod("getInferred");
        Method mPlain = NoAnnotationClass.class.getDeclaredMethod("toString");
        Method mAsVal = GetterSetterClass.class.getDeclaredMethod("asVal");
        Method mNotAsVal = GetterSetterClass.class.getDeclaredMethod("notAsVal");

        AnnotatedMethod amGetCustom = new AnnotatedMethod(null, mGetCustom, null, null);
        AnnotatedMethod amGetCustomProp = new AnnotatedMethod(null, mGetCustomProp, null, null);
        AnnotatedMethod amGetInferred = new AnnotatedMethod(null, mGetInferred, null, null);
        AnnotatedMethod amPlain = new AnnotatedMethod(null, mPlain, null, null);
        AnnotatedMethod amAsVal = new AnnotatedMethod(null, mAsVal, null, null);
        AnnotatedMethod amNotAsVal = new AnnotatedMethod(null, mNotAsVal, null, null);

        Assert.assertEquals("customGet", introspector.findNameForSerialization(amGetCustom).getSimpleName());
        Assert.assertEquals("customProp", introspector.findNameForSerialization(amGetCustomProp).getSimpleName());
        Assert.assertEquals(PropertyName.USE_DEFAULT, introspector.findNameForSerialization(amGetInferred));
        Assert.assertNull(introspector.findNameForSerialization(amPlain));

        Assert.assertTrue(introspector.hasAsValueAnnotation(amAsVal));
        Assert.assertFalse(introspector.hasAsValueAnnotation(amNotAsVal));
        Assert.assertFalse(introspector.hasAsValueAnnotation(amPlain));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeserializerAndTypeModifications() throws Exception {
        AnnotatedField deserProp = new AnnotatedField(null, DeserializationClass.class.getDeclaredField("deserProp"), null);
        AnnotatedField deserDefProp = new AnnotatedField(null, DeserializationClass.class.getDeclaredField("deserDefaultProp"), null);

        Assert.assertEquals(CustomJsonDeserializer.class, introspector.findDeserializer(deserProp));
        Assert.assertNull(introspector.findDeserializer(deserDefProp));

        Assert.assertEquals(CustomKeyDeserializer.class, introspector.findKeyDeserializer(deserProp));
        Assert.assertNull(introspector.findKeyDeserializer(deserDefProp));

        Assert.assertEquals(CustomJsonDeserializer.class, introspector.findContentDeserializer(deserProp));
        Assert.assertNull(introspector.findContentDeserializer(deserDefProp));

        Assert.assertEquals(CustomConverter.class, introspector.findDeserializationConverter(deserProp));
        Assert.assertNull(introspector.findDeserializationConverter(deserDefProp));

        Assert.assertEquals(CustomConverter.class, introspector.findDeserializationContentConverter(deserProp));
        Assert.assertNull(introspector.findDeserializationContentConverter(deserDefProp));

        Assert.assertEquals(Object.class, introspector.findDeserializationType(deserProp, null));
        Assert.assertNull(introspector.findDeserializationType(deserDefProp, null));

        Assert.assertEquals(Object.class, introspector.findDeserializationKeyType(deserProp, null));
        Assert.assertNull(introspector.findDeserializationKeyType(deserDefProp, null));

        Assert.assertEquals(Object.class, introspector.findDeserializationContentType(deserProp, null));
        Assert.assertNull(introspector.findDeserializationContentType(deserDefProp, null));

        AnnotatedClass acDeser = getAnnotatedClass(DeserializationClass.class);
        Assert.assertEquals(SubTypeClass.class, introspector.findPOJOBuilder(acDeser));
        Assert.assertNull(introspector.findPOJOBuilder(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testClassDeserializationAnnotations() {
        AnnotatedClass ac = getAnnotatedClass(BuilderInstantiatorClass.class);
        Assert.assertEquals(Object.class, introspector.findValueInstantiator(ac));
        Assert.assertNull(introspector.findValueInstantiator(getAnnotatedClass(NoAnnotationClass.class)));

        JsonPOJOBuilder.Value builderConfig = introspector.findPOJOBuilderConfig(ac);
        Assert.assertNotNull(builderConfig);
        Assert.assertEquals("buildIt", builderConfig.buildMethodName);
        Assert.assertEquals("withIt", builderConfig.withPrefix);
        Assert.assertNull(introspector.findPOJOBuilderConfig(getAnnotatedClass(NoAnnotationClass.class)));
    }

    @Test
    public void testDeserializationPropertyAnnotations() throws Exception {
        Method mSetCustom = GetterSetterClass.class.getDeclaredMethod("setCustom", String.class);
        Method mSetCustomProp = GetterSetterClass.class.getDeclaredMethod("setCustomProp", String.class);
        Method mSetInferred = GetterSetterClass.class.getDeclaredMethod("setInferred", String.class);
        Method mPlain = NoAnnotationClass.class.getDeclaredMethod("toString");
        Method mAnySet = GetterSetterClass.class.getDeclaredMethod("anySet", String.class, Object.class);
        Method mAnyGet = GetterSetterClass.class.getDeclaredMethod("anyGet");

        AnnotatedMethod amSetCustom = new AnnotatedMethod(null, mSetCustom, null, null);
        AnnotatedMethod amSetCustomProp = new AnnotatedMethod(null, mSetCustomProp, null, null);
        AnnotatedMethod amSetInferred = new AnnotatedMethod(null, mSetInferred, null, null);
        AnnotatedMethod amPlain = new AnnotatedMethod(null, mPlain, null, null);
        AnnotatedMethod amAnySet = new AnnotatedMethod(null, mAnySet, null, null);
        AnnotatedMethod amAnyGet = new AnnotatedMethod(null, mAnyGet, null, null);

        Assert.assertEquals("customSet", introspector.findNameForDeserialization(amSetCustom).getSimpleName());
        Assert.assertEquals("customPropSet", introspector.findNameForDeserialization(amSetCustomProp).getSimpleName());
        Assert.assertEquals(PropertyName.USE_DEFAULT, introspector.findNameForDeserialization(amSetInferred));
        Assert.assertNull(introspector.findNameForDeserialization(amPlain));

        Assert.assertTrue(introspector.hasAnySetterAnnotation(amAnySet));
        Assert.assertFalse(introspector.hasAnySetterAnnotation(amPlain));

        Assert.assertTrue(introspector.hasAnyGetterAnnotation(amAnyGet));
        Assert.assertFalse(introspector.hasAnyGetterAnnotation(amPlain));
    }

    @Test
    public void testCreatorAnnotations() throws Exception {
        Constructor<CreatorClass> ctorProp = CreatorClass.class.getDeclaredConstructor(String.class);
        Constructor<CreatorClass> ctorDisabled = CreatorClass.class.getDeclaredConstructor(int.class);
        Constructor<CreatorClass> ctorProps = CreatorClass.class.getDeclaredConstructor(int.class, int.class);
        Constructor<CreatorClass> ctorPlain = CreatorClass.class.getDeclaredConstructor(String.class, String.class);

        AnnotatedConstructor acProp = new AnnotatedConstructor(null, ctorProp, null, null);
        AnnotatedConstructor acDisabled = new AnnotatedConstructor(null, ctorDisabled, null, null);
        AnnotatedConstructor acProps = new AnnotatedConstructor(null, ctorProps, null, null);
        AnnotatedConstructor acPlain = new AnnotatedConstructor(null, ctorPlain, null, null);

        Assert.assertTrue(introspector.hasCreatorAnnotation(acProp));
        Assert.assertFalse(introspector.hasCreatorAnnotation(acDisabled));
        Assert.assertTrue(introspector.hasCreatorAnnotation(acProps));
        Assert.assertFalse(introspector.hasCreatorAnnotation(acPlain));

        Assert.assertEquals(JsonCreator.Mode.PROPERTIES, introspector.findCreatorBinding(acProp));
        Assert.assertEquals(JsonCreator.Mode.DISABLED, introspector.findCreatorBinding(acDisabled));
        Assert.assertNull(introspector.findCreatorBinding(acProps));

        introspector.setConstructorPropertiesImpliesCreator(false);
        Assert.assertFalse(introspector.hasCreatorAnnotation(acProps));
        introspector.setConstructorPropertiesImpliesCreator(true);
    }

    @Test
    public void testIgnorableAndTransientAnnotations() throws Exception {
        AnnotatedField fIgnored = new AnnotatedField(null, TransientClass.class.getDeclaredField("ignored"), null);
        AnnotatedField fNotIgnored = new AnnotatedField(null, TransientClass.class.getDeclaredField("notIgnored"), null);
        AnnotatedField fTrans = new AnnotatedField(null, TransientClass.class.getDeclaredField("javaTransient"), null);
        AnnotatedField fNonTrans = new AnnotatedField(null, TransientClass.class.getDeclaredField("javaNonTransient"), null);
        AnnotatedField fPlain = new AnnotatedField(null, PropertyMetaClass.class.getDeclaredField("field1"), null);

        Assert.assertTrue(introspector.hasIgnoreMarker(fIgnored));
        Assert.assertFalse(introspector.hasIgnoreMarker(fNotIgnored));
        Assert.assertTrue(introspector.hasIgnoreMarker(fTrans));
        Assert.assertFalse(introspector.hasIgnoreMarker(fNonTrans));
        Assert.assertFalse(introspector.hasIgnoreMarker(fPlain));
    }

    @Test
    public void testProtectedHelpersDirectly() {
        Assert.assertEquals(PropertyName.USE_DEFAULT, introspector._propertyName("", null));
        Assert.assertEquals(new PropertyName("name"), introspector._propertyName("name", null));
        Assert.assertEquals(new PropertyName("name"), introspector._propertyName("name", ""));
        Assert.assertEquals(new PropertyName("name", "ns"), introspector._propertyName("name", "ns"));

        Assert.assertNull(introspector._classIfExplicit(null));
        Assert.assertNull(introspector._classIfExplicit(Void.class));
        Assert.assertNull(introspector._classIfExplicit(NoClass.class));
        Assert.assertEquals(String.class, introspector._classIfExplicit(String.class));

        Assert.assertNull(introspector._classIfExplicit(String.class, String.class));
        Assert.assertEquals(String.class, introspector._classIfExplicit(String.class, Integer.class));
    }
}
