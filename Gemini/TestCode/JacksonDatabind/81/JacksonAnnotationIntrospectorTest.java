package com.fasterxml.jackson.databind.introspect;

import java.io.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector ai;
    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;

    @Before
    public void setUp() {
        ai = new JacksonAnnotationIntrospector();
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
    }

    private AnnotatedClass constructAnnotatedClass(Class<?> cls) {
        return AnnotatedClassResolver.resolve(mapper.getDeserializationConfig(),
                mapper.constructType(cls), mapper.getDeserializationConfig());
    }

    private AnnotatedMember findField(AnnotatedClass ac, String name) {
        for (AnnotatedField f : ac.fields()) {
            if (f.getName().equals(name)) {
                return f;
            }
        }
        return null;
    }

    private AnnotatedMethod findMethod(AnnotatedClass ac, String name) {
        for (AnnotatedMethod m : ac.memberMethods()) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    // ==========================================
    // 1. Life-cycle, Version & Configuration
    // ==========================================

    @Test
    public void testVersion_notNull() {
        Version v = ai.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testSerialization_readResolve_recreatesCache() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(ai);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof JacksonAnnotationIntrospector);
    }

    @Test
    public void testSetConstructorPropertiesImpliesCreator_toggle() {
        JacksonAnnotationIntrospector result = ai.setConstructorPropertiesImpliesCreator(false);
        Assert.assertSame(ai, result);
        ai.setConstructorPropertiesImpliesCreator(true);
    }

    // ==========================================
    // 2. Annotation Bundle
    // ==========================================

    @JacksonAnnotationsInside
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyBundle { }

    @Retention(RetentionPolicy.RUNTIME)
    @interface NonBundle { }

    @MyBundle
    private static class BundledClass { }

    @NonBundle
    private static class NonBundledClass { }

    @Test
    public void testIsAnnotationBundle_trueForBundle_falseForNonBundle() {
        MyBundle bundleAnn = BundledClass.class.getAnnotation(MyBundle.class);
        Assert.assertTrue(ai.isAnnotationBundle(bundleAnn));
        // Test caching branch
        Assert.assertTrue(ai.isAnnotationBundle(bundleAnn));

        NonBundle nonBundleAnn = NonBundledClass.class.getAnnotation(NonBundle.class);
        Assert.assertFalse(ai.isAnnotationBundle(nonBundleAnn));
    }

    // ==========================================
    // 3. Enum Handling
    // ==========================================

    enum TestEnum {
        @JsonProperty("first_val")
        FIRST,
        @JsonProperty("")
        SECOND,
        THIRD,
        @JsonEnumDefaultValue
        DEFAULT_VAL
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindEnumValue_annotatedAndNotAnnotated() {
        Assert.assertEquals("first_val", ai.findEnumValue(TestEnum.FIRST));
        Assert.assertEquals("SECOND", ai.findEnumValue(TestEnum.SECOND));
        Assert.assertEquals("THIRD", ai.findEnumValue(TestEnum.THIRD));
    }

    @Test
    public void testFindEnumValues_arrayMapping() {
        TestEnum[] values = TestEnum.values();
        String[] names = new String[values.length];
        String[] result = ai.findEnumValues(TestEnum.class, values, names);

        Assert.assertEquals("first_val", result[0]);
        Assert.assertNull(result[1]); // empty annotation value ignored
        Assert.assertNull(result[2]);
        Assert.assertNull(result[3]);
    }

    @Test
    public void testFindDefaultEnumValue_foundAndNotFound() {
        @SuppressWarnings("unchecked")
        Class<Enum<?>> enumCls = (Class<Enum<?>>) (Class<?>) TestEnum.class;
        Enum<?> defaultVal = ai.findDefaultEnumValue(enumCls);
        Assert.assertEquals(TestEnum.DEFAULT_VAL, defaultVal);

        enum EmptyEnum {}
        @SuppressWarnings("unchecked")
        Class<Enum<?>> emptyCls = (Class<Enum<?>>) (Class<?>) EmptyEnum.class;
        Assert.assertNull(ai.findDefaultEnumValue(emptyCls));
    }

    // ==========================================
    // 4. Class Annotations
    // ==========================================

    @JsonRootName(value = "root", namespace = "http://example.com")
    private static class RootWithNs { }

    @JsonRootName(value = "rootSimple", namespace = "")
    private static class RootEmptyNs { }

    @JsonIgnoreProperties(value = {"prop1", "prop2"}, ignoreUnknown = true, allowGetters = true)
    @JsonIgnoreType(true)
    @JsonFilter("filter123")
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    @JsonClassDescription("A test class description")
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    private static class FullAnnotatedClass { }

    @JsonFilter("")
    private static class EmptyFilterClass { }

    private static class PlainClass { }

    @Test
    public void testFindRootName_withAndWithoutNamespace() {
        AnnotatedClass ac1 = constructAnnotatedClass(RootWithNs.class);
        PropertyName pn1 = ai.findRootName(ac1);
        Assert.assertEquals("root", pn1.getSimpleName());
        Assert.assertEquals("http://example.com", pn1.getNamespace());

        AnnotatedClass ac2 = constructAnnotatedClass(RootEmptyNs.class);
        PropertyName pn2 = ai.findRootName(ac2);
        Assert.assertEquals("rootSimple", pn2.getSimpleName());
        Assert.assertNull(pn2.getNamespace());

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findRootName(acPlain));
    }

    @Test
    public void testFindPropertyIgnorals_presentAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        JsonIgnoreProperties.Value val = ai.findPropertyIgnorals(ac);
        Assert.assertTrue(val.getIgnoreUnknown());
        Assert.assertTrue(val.getIgnored().contains("prop1"));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        JsonIgnoreProperties.Value emptyVal = ai.findPropertyIgnorals(acPlain);
        Assert.assertEquals(JsonIgnoreProperties.Value.empty(), emptyVal);
    }

    @Test
    public void testIsIgnorableType_presentAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        Assert.assertEquals(Boolean.TRUE, ai.isIgnorableType(ac));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.isIgnorableType(acPlain));
    }

    @Test
    public void testFindFilterId_presentEmptyAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        Assert.assertEquals("filter123", ai.findFilterId(ac));

        AnnotatedClass acEmpty = constructAnnotatedClass(EmptyFilterClass.class);
        Assert.assertNull(ai.findFilterId(acEmpty));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findFilterId(acPlain));
    }

    @Test
    public void testFindNamingStrategy_presentAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        Assert.assertEquals(PropertyNamingStrategy.SnakeCaseStrategy.class, ai.findNamingStrategy(ac));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findNamingStrategy(acPlain));
    }

    @Test
    public void testFindClassDescription_presentAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        Assert.assertEquals("A test class description", ai.findClassDescription(ac));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findClassDescription(acPlain));
    }

    @Test
    public void testFindAutoDetectVisibility_presentAndAbsent() {
        AnnotatedClass ac = constructAnnotatedClass(FullAnnotatedClass.class);
        VisibilityChecker<?> checker = ai.findAutoDetectVisibility(ac,
                serConfig.getDefaultVisibilityChecker());
        Assert.assertNotNull(checker);

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        VisibilityChecker<?> checkerPlain = ai.findAutoDetectVisibility(acPlain,
                serConfig.getDefaultVisibilityChecker());
        Assert.assertSame(serConfig.getDefaultVisibilityChecker(), checkerPlain);
    }

    // ==========================================
    // 5. Member Annotations
    // ==========================================

    private static class MemberAnnotatedBean {
        @JsonProperty(value = "field_val", required = true, access = JsonProperty.Access.READ_ONLY,
                      index = 3, defaultValue = "defaultX")
        @JsonPropertyDescription("Field description")
        @JsonAlias({"alias1", "alias2"})
        public String field1;

        @JsonAlias({})
        public String fieldEmptyAlias;

        @JsonProperty(index = JsonProperty.INDEX_UNKNOWN, defaultValue = "")
        public String field2;

        @JsonIgnore
        public String ignoredField;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        public Date dateField;

        @JsonManagedReference("parent-child")
        public MemberAnnotatedBean child;

        @JsonBackReference("parent-child")
        public MemberAnnotatedBean parent;

        @JsonUnwrapped(prefix = "un_", suffix = "_wrap", enabled = true)
        public MemberAnnotatedBean unwrappedProp;

        @JsonUnwrapped(enabled = false)
        public MemberAnnotatedBean unwrappedDisabled;

        @JacksonInject("injectId")
        public String injectedWithId;

        @JacksonInject
        public String injectedFieldNoId;

        @JacksonInject
        public String getInjectedGetterNoId() { return ""; }

        @JacksonInject
        public void setInjectedSetterNoId(Integer val) { }

        @JsonView({String.class, Integer.class})
        public String viewedField;
    }

    @Test
    public void testFindImplicitPropertyName_nullForRegularField() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        AnnotatedMember f = findField(ac, "field1");
        Assert.assertNull(ai.findImplicitPropertyName(f));
    }

    @Test
    public void testFindPropertyAliases_normalEmptyAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        AnnotatedMember f1 = findField(ac, "field1");
        List<PropertyName> aliases = ai.findPropertyAliases(f1);
        Assert.assertNotNull(aliases);
        Assert.assertEquals(2, aliases.size());
        Assert.assertEquals("alias1", aliases.get(0).getSimpleName());

        AnnotatedMember fEmpty = findField(ac, "fieldEmptyAlias");
        List<PropertyName> emptyAliases = ai.findPropertyAliases(fEmpty);
        Assert.assertNotNull(emptyAliases);
        Assert.assertTrue(emptyAliases.isEmpty());

        AnnotatedMember f2 = findField(ac, "field2");
        Assert.assertNull(ai.findPropertyAliases(f2));
    }

    @Test
    public void testHasIgnoreMarker() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertTrue(ai.hasIgnoreMarker(findField(ac, "ignoredField")));
        Assert.assertFalse(ai.hasIgnoreMarker(findField(ac, "field1")));
    }

    @Test
    public void testHasRequiredMarker_trueAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertEquals(Boolean.TRUE, ai.hasRequiredMarker(findField(ac, "field1")));
        Assert.assertNull(ai.hasRequiredMarker(findField(ac, "ignoredField")));
    }

    @Test
    public void testFindPropertyAccess_presentAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertEquals(JsonProperty.Access.READ_ONLY, ai.findPropertyAccess(findField(ac, "field1")));
        Assert.assertNull(ai.findPropertyAccess(findField(ac, "ignoredField")));
    }

    @Test
    public void testFindPropertyDescription_presentAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertEquals("Field description", ai.findPropertyDescription(findField(ac, "field1")));
        Assert.assertNull(ai.findPropertyDescription(findField(ac, "field2")));
    }

    @Test
    public void testFindPropertyIndex_presentUnknownAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertEquals(Integer.valueOf(3), ai.findPropertyIndex(findField(ac, "field1")));
        Assert.assertNull(ai.findPropertyIndex(findField(ac, "field2")));
        Assert.assertNull(ai.findPropertyIndex(findField(ac, "ignoredField")));
    }

    @Test
    public void testFindPropertyDefaultValue_presentEmptyAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Assert.assertEquals("defaultX", ai.findPropertyDefaultValue(findField(ac, "field1")));
        Assert.assertNull(ai.findPropertyDefaultValue(findField(ac, "field2")));
        Assert.assertNull(ai.findPropertyDefaultValue(findField(ac, "ignoredField")));
    }

    @Test
    public void testFindFormat_presentAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        JsonFormat.Value fmt = ai.findFormat(findField(ac, "dateField"));
        Assert.assertNotNull(fmt);
        Assert.assertEquals("yyyy-MM-dd", fmt.getPattern());
        Assert.assertNull(ai.findFormat(findField(ac, "field1")));
    }

    @Test
    public void testFindReferenceType_managedBackAndNone() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        AnnotationIntrospector.ReferenceProperty refManaged = ai.findReferenceType(findField(ac, "child"));
        Assert.assertNotNull(refManaged);
        Assert.assertTrue(refManaged.isManagedReference());
        Assert.assertEquals("parent-child", refManaged.getName());

        AnnotationIntrospector.ReferenceProperty refBack = ai.findReferenceType(findField(ac, "parent"));
        Assert.assertNotNull(refBack);
        Assert.assertTrue(refBack.isBackReference());
        Assert.assertEquals("parent-child", refBack.getName());

        Assert.assertNull(ai.findReferenceType(findField(ac, "field1")));
    }

    @Test
    public void testFindUnwrappingNameTransformer_enabledDisabledAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        NameTransformer nt = ai.findUnwrappingNameTransformer(findField(ac, "unwrappedProp"));
        Assert.assertNotNull(nt);
        Assert.assertEquals("un_name_wrap", nt.transform("name"));

        Assert.assertNull(ai.findUnwrappingNameTransformer(findField(ac, "unwrappedDisabled")));
        Assert.assertNull(ai.findUnwrappingNameTransformer(findField(ac, "field1")));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindInjectableValue_allBranches() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);

        // With explicit ID
        JacksonInject.Value v1 = ai.findInjectableValue(findField(ac, "injectedWithId"));
        Assert.assertNotNull(v1);
        Assert.assertEquals("injectId", v1.getId());
        Assert.assertEquals("injectId", ai.findInjectableValueId(findField(ac, "injectedWithId")));

        // Field with no ID (derives type name)
        JacksonInject.Value v2 = ai.findInjectableValue(findField(ac, "injectedFieldNoId"));
        Assert.assertNotNull(v2);
        Assert.assertEquals(String.class.getName(), v2.getId());

        // Getter with no ID
        JacksonInject.Value v3 = ai.findInjectableValue(findMethod(ac, "getInjectedGetterNoId"));
        Assert.assertNotNull(v3);
        Assert.assertEquals(String.class.getName(), v3.getId());

        // Setter with no ID
        JacksonInject.Value v4 = ai.findInjectableValue(findMethod(ac, "setInjectedSetterNoId"));
        Assert.assertNotNull(v4);
        Assert.assertEquals(Integer.class.getName(), v4.getId());

        // Null annotation
        Assert.assertNull(ai.findInjectableValue(findField(ac, "field1")));
        Assert.assertNull(ai.findInjectableValueId(findField(ac, "field1")));
    }

    @Test
    public void testFindViews_presentAndNull() {
        AnnotatedClass ac = constructAnnotatedClass(MemberAnnotatedBean.class);
        Class<?>[] views = ai.findViews(findField(ac, "viewedField"));
        Assert.assertNotNull(views);
        Assert.assertEquals(2, views.length);
        Assert.assertNull(ai.findViews(findField(ac, "field1")));
    }

    // ==========================================
    // 6. Setter Conflict Resolution
    // ==========================================

    private static class SetterConflictBean {
        public void setA(int x) {}
        public void setA(Integer x) {}
        public void setB(String x) {}
        public void setB(Object x) {}
        public void setC(Double x) {}
        public void setC(Float x) {}
    }

    @Test
    public void testResolveSetterConflict_primitiveVsWrapper_stringVsObject_andUnresolvable() {
        AnnotatedClass ac = constructAnnotatedClass(SetterConflictBean.class);
        AnnotatedMethod setInt = null;
        AnnotatedMethod setInteger = null;
        AnnotatedMethod setString = null;
        AnnotatedMethod setObject = null;
        AnnotatedMethod setDouble = null;
        AnnotatedMethod setFloat = null;

        for (AnnotatedMethod m : ac.memberMethods()) {
            if ("setA".equals(m.getName())) {
                if (m.getRawParameterType(0).isPrimitive()) setInt = m;
                else setInteger = m;
            } else if ("setB".equals(m.getName())) {
                if (m.getRawParameterType(0) == String.class) setString = m;
                else setObject = m;
            } else if ("setC".equals(m.getName())) {
                if (m.getRawParameterType(0) == Double.class) setDouble = m;
                else setFloat = m;
            }
        }

        // Primitive preferred
        Assert.assertSame(setInt, ai.resolveSetterConflict(serConfig, setInt, setInteger));
        Assert.assertSame(setInt, ai.resolveSetterConflict(serConfig, setInteger, setInt));

        // String preferred
        Assert.assertSame(setString, ai.resolveSetterConflict(serConfig, setString, setObject));
        Assert.assertSame(setString, ai.resolveSetterConflict(serConfig, setObject, setString));

        // Neither
        Assert.assertNull(ai.resolveSetterConflict(serConfig, setDouble, setFloat));
    }

    // ==========================================
    // 7. Polymorphic Typing & Type Resolvers
    // ==========================================

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = PolyChild.class, visible = true)
    @JsonSubTypes({
        @JsonSubTypes.Type(value = PolyChild.class, name = "child")
    })
    @JsonTypeName("polyBase")
    private static class PolyBase { }

    private static class PolyChild extends PolyBase { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
    private static class NoneTypeInfo { }

    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.EXTERNAL_PROPERTY)
    private static class ExternalPropClass { }

    @JsonTypeResolver(StdTypeResolverBuilder.class)
    @JsonTypeIdResolver(TypeNameIdResolver.class)
    @JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM)
    private static class CustomTypeResolverClass { }

    @JsonTypeResolver(StdTypeResolverBuilder.class)
    private static class CustomTypeResolverNoInfoClass { }

    private static class TypeIdMemberBean {
        @JsonTypeId
        public String myTypeId;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
        public PolyBase fieldPoly;

        public List<PolyBase> containerField;
    }

    @Test
    public void testFindTypeResolver_standardNoneAndCustom() {
        AnnotatedClass acPoly = constructAnnotatedClass(PolyBase.class);
        TypeResolverBuilder<?> b = ai.findTypeResolver(serConfig, acPoly, mapper.constructType(PolyBase.class));
        Assert.assertNotNull(b);

        AnnotatedClass acNone = constructAnnotatedClass(NoneTypeInfo.class);
        TypeResolverBuilder<?> bNone = ai.findTypeResolver(serConfig, acNone, mapper.constructType(NoneTypeInfo.class));
        Assert.assertNotNull(bNone);

        AnnotatedClass acExt = constructAnnotatedClass(ExternalPropClass.class);
        TypeResolverBuilder<?> bExt = ai.findTypeResolver(serConfig, acExt, mapper.constructType(ExternalPropClass.class));
        Assert.assertNotNull(bExt);

        AnnotatedClass acCustom = constructAnnotatedClass(CustomTypeResolverClass.class);
        TypeResolverBuilder<?> bCustom = ai.findTypeResolver(serConfig, acCustom, mapper.constructType(CustomTypeResolverClass.class));
        Assert.assertNotNull(bCustom);

        AnnotatedClass acCustomNoInfo = constructAnnotatedClass(CustomTypeResolverNoNoInfo.class);
        Assert.assertNull(ai.findTypeResolver(serConfig, acCustomNoInfo, mapper.constructType(CustomTypeResolverNoNoInfo.class)));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findTypeResolver(serConfig, acPlain, mapper.constructType(PlainClass.class)));
    }

    @JsonTypeResolver(StdTypeResolverBuilder.class)
    private static class CustomTypeResolverNoNoInfo {}

    @Test
    public void testFindPropertyTypeResolver_andContentTypeResolver() {
        AnnotatedClass ac = constructAnnotatedClass(TypeIdMemberBean.class);
        AnnotatedMember fPoly = findField(ac, "fieldPoly");
        JavaType baseType = mapper.constructType(PolyBase.class);
        TypeResolverBuilder<?> tb = ai.findPropertyTypeResolver(serConfig, fPoly, baseType);
        Assert.assertNotNull(tb);

        // Should return null if baseType is container
        JavaType listType = mapper.constructType(List.class);
        Assert.assertNull(ai.findPropertyTypeResolver(serConfig, fPoly, listType));

        // findPropertyContentTypeResolver
        AnnotatedMember fContainer = findField(ac, "containerField");
        JavaType containerType = mapper.getTypeFactory().constructCollectionType(List.class, PolyBase.class);
        TypeResolverBuilder<?> ctb = ai.findPropertyContentTypeResolver(serConfig, fContainer, containerType);
        Assert.assertNull(ctb); // TypeIdMemberBean has no @JsonTypeInfo on containerField member
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindPropertyContentTypeResolver_throwsOnNonContainerType() {
        AnnotatedClass ac = constructAnnotatedClass(TypeIdMemberBean.class);
        AnnotatedMember fPoly = findField(ac, "fieldPoly");
        ai.findPropertyContentTypeResolver(serConfig, fPoly, mapper.constructType(String.class));
    }

    @Test
    public void testFindSubtypes_andTypeName_andIsTypeId() {
        AnnotatedClass ac = constructAnnotatedClass(PolyBase.class);
        List<NamedType> subtypes = ai.findSubtypes(ac);
        Assert.assertNotNull(subtypes);
        Assert.assertEquals(1, subtypes.size());
        Assert.assertEquals(PolyChild.class, subtypes.get(0).getType());
        Assert.assertEquals("child", subtypes.get(0).getName());

        Assert.assertEquals("polyBase", ai.findTypeName(ac));

        AnnotatedClass acMember = constructAnnotatedClass(TypeIdMemberBean.class);
        Assert.assertEquals(Boolean.TRUE, ai.isTypeId(findField(acMember, "myTypeId")));
        Assert.assertFalse(ai.isTypeId(findField(acMember, "fieldPoly")));
    }

    // ==========================================
    // 8. Object Identity
    // ==========================================

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = ObjectIdBean.class)
    @JsonIdentityReference(alwaysAsId = true)
    private static class ObjectIdBean {
        public int id;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    private static class ObjectIdNoneBean { }

    @Test
    public void testFindObjectIdInfo_andFindObjectReferenceInfo() {
        AnnotatedClass ac = constructAnnotatedClass(ObjectIdBean.class);
        ObjectIdInfo info = ai.findObjectIdInfo(ac);
        Assert.assertNotNull(info);
        Assert.assertEquals(PropertyName.construct("id"), info.getPropertyName());
        Assert.assertEquals(ObjectIdGenerators.PropertyGenerator.class, info.getGeneratorType());

        ObjectIdInfo refInfo = ai.findObjectReferenceInfo(ac, info);
        Assert.assertTrue(refInfo.getAlwaysAsId());

        // Test passing null ObjectIdInfo into findObjectReferenceInfo
        ObjectIdInfo refInfoFromNull = ai.findObjectReferenceInfo(ac, null);
        Assert.assertTrue(refInfoFromNull.getAlwaysAsId());

        AnnotatedClass acNone = constructAnnotatedClass(ObjectIdNoneBean.class);
        Assert.assertNull(ai.findObjectIdInfo(acNone));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findObjectIdInfo(acPlain));
        Assert.assertNull(ai.findObjectReferenceInfo(acPlain, null));
    }

    // ==========================================
    // 9. Serialization: Annotations & Converters
    // ==========================================

    private static class DummySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
    }

    private static class DummyKeySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) {}
    }

    private static class DummyConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) { return 0; }
    }

    @JsonPropertyOrder(value = {"propB", "propA"}, alphabetic = true)
    private static class SerOrderBean {
        public String propA;
        public String propB;
    }

    @SuppressWarnings("deprecation")
    private static class SerAnnotatedBean {
        @JsonSerialize(using = DummySerializer.class,
                       keyUsing = DummyKeySerializer.class,
                       contentUsing = DummySerializer.class,
                       nullsUsing = DummySerializer.class,
                       typing = JsonSerialize.Typing.STATIC,
                       converter = DummyConverter.class,
                       contentConverter = DummyConverter.class,
                       include = JsonSerialize.Inclusion.NON_EMPTY)
        public Map<String, String> fullMap;

        @JsonRawValue(true)
        public String rawVal;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        public String includedProp;

        @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
        public String legacyAlways;

        @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
        public String legacyNonDefault;
    }

    @Test
    public void testFindSerializers_andConverters() {
        AnnotatedClass ac = constructAnnotatedClass(SerAnnotatedBean.class);
        AnnotatedMember mapField = findField(ac, "fullMap");

        Assert.assertEquals(DummySerializer.class, ai.findSerializer(mapField));
        Assert.assertEquals(DummyKeySerializer.class, ai.findKeySerializer(mapField));
        Assert.assertEquals(DummySerializer.class, ai.findContentSerializer(mapField));
        Assert.assertEquals(DummySerializer.class, ai.findNullSerializer(mapField));
        Assert.assertEquals(JsonSerialize.Typing.STATIC, ai.findSerializationTyping(mapField));
        Assert.assertEquals(DummyConverter.class, ai.findSerializationConverter(mapField));
        Assert.assertEquals(DummyConverter.class, ai.findSerializationContentConverter(mapField));

        AnnotatedMember rawField = findField(ac, "rawVal");
        Object rawSer = ai.findSerializer(rawField);
        Assert.assertTrue(rawSer instanceof RawSerializer);

        AnnotatedMember plainField = findField(ac, "includedProp");
        Assert.assertNull(ai.findKeySerializer(plainField));
        Assert.assertNull(ai.findContentSerializer(plainField));
        Assert.assertNull(ai.findNullSerializer(plainField));
        Assert.assertNull(ai.findSerializationTyping(plainField));
        Assert.assertNull(ai.findSerializationConverter(plainField));
        Assert.assertNull(ai.findSerializationContentConverter(plainField));
    }

    @Test
    public void testFindPropertyInclusion_modernAndLegacy() {
        AnnotatedClass ac = constructAnnotatedClass(SerAnnotatedBean.class);

        JsonInclude.Value v1 = ai.findPropertyInclusion(findField(ac, "includedProp"));
        Assert.assertEquals(JsonInclude.Include.NON_NULL, v1.getValueInclusion());

        JsonInclude.Value v2 = ai.findPropertyInclusion(findField(ac, "fullMap"));
        Assert.assertEquals(JsonInclude.Include.NON_EMPTY, v2.getValueInclusion());

        JsonInclude.Value vAlways = ai.findPropertyInclusion(findField(ac, "legacyAlways"));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, vAlways.getValueInclusion());

        JsonInclude.Value vNonDef = ai.findPropertyInclusion(findField(ac, "legacyNonDefault"));
        Assert.assertEquals(JsonInclude.Include.NON_DEFAULT, vNonDef.getValueInclusion());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedSerializationTypeMethods_returnNull() {
        AnnotatedClass ac = constructAnnotatedClass(SerAnnotatedBean.class);
        AnnotatedMember f = findField(ac, "fullMap");
        JavaType t = mapper.constructType(String.class);

        Assert.assertNull(ai.findSerializationType(f));
        Assert.assertNull(ai.findSerializationKeyType(f, t));
        Assert.assertNull(ai.findSerializationContentType(f, t));
    }

    @Test
    public void testFindSerializationPropertyOrder_andSortAlpha() {
        AnnotatedClass ac = constructAnnotatedClass(SerOrderBean.class);
        String[] order = ai.findSerializationPropertyOrder(ac);
        Assert.assertArrayEquals(new String[]{"propB", "propA"}, order);
        Assert.assertEquals(Boolean.TRUE, ai.findSerializationSortAlphabetically(ac));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findSerializationPropertyOrder(acPlain));
        Assert.assertNull(ai.findSerializationSortAlphabetically(acPlain));
    }

    // ==========================================
    // 10. Type Refinement (Serialization & Deserialization)
    // ==========================================

    private static class TypeRefineSerBean {
        @JsonSerialize(as = Number.class, keyAs = CharSequence.class, contentAs = Number.class)
        public Map<String, Integer> mapRefine;

        @JsonSerialize(as = Integer.class)
        public Number specializeNum;

        @JsonSerialize(as = String.class)
        public Integer invalidRefine;

        @JsonSerialize(as = Integer.class)
        public Integer sameType;

        @JsonSerialize(keyAs = String.class)
        public Map<CharSequence, Integer> keySpecialize;

        @JsonSerialize(keyAs = Integer.class)
        public Map<String, Integer> invalidKeyRefine;

        @JsonSerialize(contentAs = Integer.class)
        public List<Number> contentSpecialize;

        @JsonSerialize(contentAs = String.class)
        public List<Integer> invalidContentRefine;
    }

    private static class TypeRefineDeserBean {
        @JsonDeserialize(as = ArrayList.class, contentAs = Integer.class)
        public List<Number> listRefine;

        @JsonDeserialize(keyAs = String.class, contentAs = Integer.class)
        public Map<CharSequence, Number> mapRefine;

        @JsonDeserialize(as = String.class)
        public Integer invalidDeserRefine;

        @JsonDeserialize(keyAs = Integer.class)
        public Map<String, String> invalidKeyDeserRefine;

        @JsonDeserialize(contentAs = String.class)
        public List<Integer> invalidContentDeserRefine;
    }

    @Test
    public void testRefineSerializationType_generalizeSpecializeSameAndErrors() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineSerBean.class);

        // Generalize main type, key, content
        AnnotatedMember fMap = findField(ac, "mapRefine");
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Integer.class);
        JavaType refinedMap = ai.refineSerializationType(serConfig, fMap, mapType);
        Assert.assertEquals(Number.class, refinedMap.getContentType().getRawClass());

        // Specialize main type
        AnnotatedMember fSpec = findField(ac, "specializeNum");
        JavaType numType = mapper.constructType(Number.class);
        JavaType refinedSpec = ai.refineSerializationType(serConfig, fSpec, numType);
        Assert.assertEquals(Integer.class, refinedSpec.getRawClass());

        // Same type -> static typing
        AnnotatedMember fSame = findField(ac, "sameType");
        JavaType intType = mapper.constructType(Integer.class);
        JavaType refinedSame = ai.refineSerializationType(serConfig, fSame, intType);
        Assert.assertTrue(refinedSame.useStaticType());

        // Specialize key
        AnnotatedMember fKeySpec = findField(ac, "keySpecialize");
        JavaType keySpecType = mapper.getTypeFactory().constructMapType(Map.class, CharSequence.class, Integer.class);
        JavaType refinedKeySpec = ai.refineSerializationType(serConfig, fKeySpec, keySpecType);
        Assert.assertEquals(String.class, refinedKeySpec.getKeyType().getRawClass());

        // Specialize content
        AnnotatedMember fContSpec = findField(ac, "contentSpecialize");
        JavaType contSpecType = mapper.getTypeFactory().constructCollectionType(List.class, Number.class);
        JavaType refinedContSpec = ai.refineSerializationType(serConfig, fContSpec, contSpecType);
        Assert.assertEquals(Integer.class, refinedContSpec.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_throwsOnUnrelatedMainType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineSerBean.class);
        AnnotatedMember f = findField(ac, "invalidRefine");
        ai.refineSerializationType(serConfig, f, mapper.constructType(Integer.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_throwsOnUnrelatedKeyType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineSerBean.class);
        AnnotatedMember f = findField(ac, "invalidKeyRefine");
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Integer.class);
        ai.refineSerializationType(serConfig, f, mapType);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_throwsOnUnrelatedContentType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineSerBean.class);
        AnnotatedMember f = findField(ac, "invalidContentRefine");
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, Integer.class);
        ai.refineSerializationType(serConfig, f, listType);
    }

    @Test
    public void testRefineDeserializationType_successAndErrors() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineDeserBean.class);

        AnnotatedMember fList = findField(ac, "listRefine");
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, Number.class);
        JavaType refinedList = ai.refineDeserializationType(deserConfig, fList, listType);
        Assert.assertEquals(ArrayList.class, refinedList.getRawClass());
        Assert.assertEquals(Integer.class, refinedList.getContentType().getRawClass());

        AnnotatedMember fMap = findField(ac, "mapRefine");
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, CharSequence.class, Number.class);
        JavaType refinedMap = ai.refineDeserializationType(deserConfig, fMap, mapType);
        Assert.assertEquals(String.class, refinedMap.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, refinedMap.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_throwsOnInvalidMainType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineDeserBean.class);
        AnnotatedMember f = findField(ac, "invalidDeserRefine");
        ai.refineDeserializationType(deserConfig, f, mapper.constructType(Integer.class));
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_throwsOnInvalidKeyType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineDeserBean.class);
        AnnotatedMember f = findField(ac, "invalidKeyDeserRefine");
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class);
        ai.refineDeserializationType(deserConfig, f, mapType);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_throwsOnInvalidContentType() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineDeserBean.class);
        AnnotatedMember f = findField(ac, "invalidContentDeserRefine");
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, Integer.class);
        ai.refineDeserializationType(deserConfig, f, listType);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedDeserializationTypeMethods_returnNull() {
        AnnotatedClass ac = constructAnnotatedClass(TypeRefineDeserBean.class);
        AnnotatedMember f = findField(ac, "listRefine");
        JavaType t = mapper.constructType(String.class);

        Assert.assertNull(ai.findDeserializationType(f, t));
        Assert.assertNull(ai.findDeserializationKeyType(f, t));
        Assert.assertNull(ai.findDeserializationContentType(f, t));
    }

    // ==========================================
    // 11. Virtual Properties (@JsonAppend)
    // ==========================================

    public static class CustomVirtualProp extends VirtualBeanPropertyWriter {
        public CustomVirtualProp() { super(); }
        public CustomVirtualProp(BeanPropertyDefinition propDef, Annotations contextAnnotations, JavaType declaredType) {
            super(propDef, contextAnnotations, declaredType);
        }
        @Override
        protected Object value(Object bean, JsonGenerator gen, SerializerProvider prov) { return "virtual"; }
        @Override
        public VirtualBeanPropertyWriter withConfig(MapperConfig<?> config, AnnotatedClass declaringClass,
                                                    BeanPropertyDefinition propDef, JavaType type) {
            return new CustomVirtualProp(propDef, declaringClass.getAnnotations(), type);
        }
    }

    @JsonAppend(
        prepend = true,
        attrs = {
            @JsonAppend.Attr(value = "attr1", propName = "propAttr1", propNamespace = "http://ns.com", required = true),
            @JsonAppend.Attr(value = "attr2")
        },
        props = {
            @JsonAppend.Prop(value = CustomVirtualProp.class, name = "vProp", type = String.class, required = true)
        }
    )
    private static class VirtualAppendBean { }

    @Test
    public void testFindAndAddVirtualProperties_withAttrsAndProps() {
        AnnotatedClass ac = constructAnnotatedClass(VirtualAppendBean.class);
        List<BeanPropertyWriter> props = new ArrayList<>();
        ai.findAndAddVirtualProperties(serConfig, ac, props);

        Assert.assertEquals(3, props.size());
        // prepend=true puts attrs and props at front
        Assert.assertNotNull(props.get(0));
        Assert.assertNotNull(props.get(1));
        Assert.assertNotNull(props.get(2));

        // Test with no @JsonAppend
        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        List<BeanPropertyWriter> plainProps = new ArrayList<>();
        ai.findAndAddVirtualProperties(serConfig, acPlain, plainProps);
        Assert.assertTrue(plainProps.isEmpty());
    }

    // ==========================================
    // 12. Serialization & Deserialization Names & Property Inference
    // ==========================================

    private static class SerializationPropBean {
        @JsonGetter("customGetter")
        public String getA() { return "a"; }

        @JsonProperty("customProp")
        public String fieldB;

        @JsonView(String.class)
        public String inferredByView;

        @JsonValue
        public String asValueMethod() { return "val"; }

        @JsonAnyGetter
        public Map<String, Object> anyGetter() { return Collections.emptyMap(); }
    }

    private static class DeserializationPropBean {
        @JsonSetter("customSetter")
        public void setA(String a) {}

        @JsonProperty("customPropDeser")
        public String fieldB;

        @JsonMerge(OptBoolean.TRUE)
        public List<String> mergeList;

        @JsonAnySetter
        public void anySetter(String k, Object v) {}
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindNameForSerialization_andRelatedHelpers() {
        AnnotatedClass ac = constructAnnotatedClass(SerializationPropBean.class);

        Assert.assertEquals(PropertyName.construct("customGetter"),
                ai.findNameForSerialization(findMethod(ac, "getA")));
        Assert.assertEquals(PropertyName.construct("customProp"),
                ai.findNameForSerialization(findField(ac, "fieldB")));
        Assert.assertEquals(PropertyName.USE_DEFAULT,
                ai.findNameForSerialization(findField(ac, "inferredByView")));

        AnnotatedMethod valMethod = findMethod(ac, "asValueMethod");
        Assert.assertEquals(Boolean.TRUE, ai.hasAsValue(valMethod));
        Assert.assertTrue(ai.hasAsValueAnnotation(valMethod));

        AnnotatedMethod anyMethod = findMethod(ac, "anyGetter");
        Assert.assertEquals(Boolean.TRUE, ai.hasAnyGetter(anyMethod));
        Assert.assertTrue(ai.hasAnyGetterAnnotation(anyMethod));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findNameForSerialization(acPlain));
        Assert.assertNull(ai.hasAsValue(acPlain));
        Assert.assertNull(ai.hasAnyGetter(acPlain));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindNameForDeserialization_andRelatedHelpers() {
        AnnotatedClass ac = constructAnnotatedClass(DeserializationPropBean.class);

        Assert.assertEquals(PropertyName.construct("customSetter"),
                ai.findNameForDeserialization(findMethod(ac, "setA")));
        Assert.assertEquals(PropertyName.construct("customPropDeser"),
                ai.findNameForDeserialization(findField(ac, "fieldB")));
        Assert.assertEquals(PropertyName.USE_DEFAULT,
                ai.findNameForDeserialization(findField(ac, "mergeList")));

        AnnotatedMethod anySetMethod = findMethod(ac, "anySetter");
        Assert.assertEquals(Boolean.TRUE, ai.hasAnySetter(anySetMethod));
        Assert.assertTrue(ai.hasAnySetterAnnotation(anySetMethod));

        Assert.assertEquals(Boolean.TRUE, ai.findMergeInfo(findField(ac, "mergeList")));
        Assert.assertNotNull(ai.findSetterInfo(findMethod(ac, "setA")));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findNameForDeserialization(acPlain));
        Assert.assertNull(ai.hasAnySetter(acPlain));
        Assert.assertNull(ai.findMergeInfo(acPlain));
    }

    // ==========================================
    // 13. Deserializer Annotations & POJO Builder
    // ==========================================

    private static class DummyDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt) { return null; }
    }

    private static class DummyKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) { return null; }
    }

    private static class DummyInstantiator extends com.fasterxml.jackson.databind.deser.ValueInstantiator {
        @Override
        public String getValueTypeDesc() { return "dummy"; }
    }

    @JsonValueInstantiator(DummyInstantiator.class)
    @JsonDeserialize(builder = BuilderClass.class)
    @JsonPOJOBuilder(buildMethodName = "construct", withPrefix = "with")
    private static class PojoWithBuilder { }

    private static class BuilderClass {
        public PojoWithBuilder construct() { return new PojoWithBuilder(); }
    }

    private static class DeserAnnotatedBean {
        @JsonDeserialize(using = DummyDeserializer.class,
                         keyUsing = DummyKeyDeserializer.class,
                         contentUsing = DummyDeserializer.class,
                         converter = DummyConverter.class,
                         contentConverter = DummyConverter.class)
        public Map<String, String> deserMap;
    }

    @Test
    public void testFindDeserializers_andConverters() {
        AnnotatedClass ac = constructAnnotatedClass(DeserAnnotatedBean.class);
        AnnotatedMember f = findField(ac, "deserMap");

        Assert.assertEquals(DummyDeserializer.class, ai.findDeserializer(f));
        Assert.assertEquals(DummyKeyDeserializer.class, ai.findKeyDeserializer(f));
        Assert.assertEquals(DummyDeserializer.class, ai.findContentDeserializer(f));
        Assert.assertEquals(DummyConverter.class, ai.findDeserializationConverter(f));
        Assert.assertEquals(DummyConverter.class, ai.findDeserializationContentConverter(f));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findDeserializer(acPlain));
        Assert.assertNull(ai.findKeyDeserializer(acPlain));
        Assert.assertNull(ai.findContentDeserializer(acPlain));
        Assert.assertNull(ai.findDeserializationConverter(acPlain));
        Assert.assertNull(ai.findDeserializationContentConverter(findField(acPlain, "none")));
    }

    @Test
    public void testFindValueInstantiator_findPOJOBuilder_andConfig() {
        AnnotatedClass ac = constructAnnotatedClass(PojoWithBuilder.class);

        Assert.assertEquals(DummyInstantiator.class, ai.findValueInstantiator(ac));
        Assert.assertEquals(BuilderClass.class, ai.findPOJOBuilder(ac));

        JsonPOJOBuilder.Value bConfig = ai.findPOJOBuilderConfig(ac);
        Assert.assertNotNull(bConfig);
        Assert.assertEquals("construct", bConfig.buildMethodName);
        Assert.assertEquals("with", bConfig.withPrefix);

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        Assert.assertNull(ai.findValueInstantiator(acPlain));
        Assert.assertNull(ai.findPOJOBuilder(acPlain));
        Assert.assertNull(ai.findPOJOBuilderConfig(acPlain));
    }

    // ==========================================
    // 14. Creators & Constructors
    // ==========================================

    private static class CreatorBean {
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        public CreatorBean(@JsonProperty("param1") String param1) {}

        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        public CreatorBean(int a) {}
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testCreators_modesAndBindings() throws Exception {
        AnnotatedClass ac = constructAnnotatedClass(CreatorBean.class);

        AnnotatedConstructor propCtor = null;
        AnnotatedConstructor disabledCtor = null;
        for (AnnotatedConstructor c : ac.getConstructors()) {
            if (c.getParameterCount() == 1) {
                if (c.getRawParameterType(0) == String.class) propCtor = c;
                else if (c.getRawParameterType(0) == int.class) disabledCtor = c;
            }
        }

        Assert.assertNotNull(propCtor);
        Assert.assertTrue(ai.hasCreatorAnnotation(propCtor));
        Assert.assertEquals(JsonCreator.Mode.PROPERTIES, ai.findCreatorBinding(propCtor));
        Assert.assertEquals(JsonCreator.Mode.PROPERTIES, ai.findCreatorAnnotation(deserConfig, propCtor));

        Assert.assertNotNull(disabledCtor);
        Assert.assertFalse(ai.hasCreatorAnnotation(disabledCtor));
        Assert.assertEquals(JsonCreator.Mode.DISABLED, ai.findCreatorBinding(disabledCtor));
        Assert.assertEquals(JsonCreator.Mode.DISABLED, ai.findCreatorAnnotation(deserConfig, disabledCtor));

        AnnotatedClass acPlain = constructAnnotatedClass(PlainClass.class);
        AnnotatedConstructor defaultCtor = acPlain.getDefaultConstructor();
        Assert.assertFalse(ai.hasCreatorAnnotation(defaultCtor));
        Assert.assertNull(ai.findCreatorBinding(defaultCtor));
        Assert.assertNull(ai.findCreatorAnnotation(deserConfig, defaultCtor));
    }

    // ==========================================
    // 15. Helper Methods (_propertyName, etc.)
    // ==========================================

    @Test
    public void testPropertyNameHelper_emptyLocalAndNamespace() {
        PropertyName pn1 = ai._propertyName("", null);
        Assert.assertSame(PropertyName.USE_DEFAULT, pn1);

        PropertyName pn2 = ai._propertyName("localOnly", null);
        Assert.assertEquals("localOnly", pn2.getSimpleName());
        Assert.assertNull(pn2.getNamespace());

        PropertyName pn3 = ai._propertyName("localOnly", "");
        Assert.assertEquals("localOnly", pn3.getSimpleName());
        Assert.assertNull(pn3.getNamespace());

        PropertyName pn4 = ai._propertyName("local", "http://ns");
        Assert.assertEquals("local", pn4.getSimpleName());
        Assert.assertEquals("http://ns", pn4.getNamespace());
    }

    @Test
    public void testClassIfExplicit_bogusAndImplicit() {
        Assert.assertNull(ai._classIfExplicit(null));
        Assert.assertNull(ai._classIfExplicit(Void.class));
        Assert.assertNull(ai._classIfExplicit(NoClass.class));
        Assert.assertEquals(String.class, ai._classIfExplicit(String.class));

        Assert.assertNull(ai._classIfExplicit(Converter.None.class, Converter.None.class));
        Assert.assertEquals(DummyConverter.class, ai._classIfExplicit(DummyConverter.class, Converter.None.class));
    }
}
