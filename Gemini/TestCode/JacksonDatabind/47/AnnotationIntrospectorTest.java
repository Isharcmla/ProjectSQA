package com.fasterxml.jackson.databind;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AnnotationIntrospectorTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnn1 {}

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnn2 {}

    @TestAnn1
    private static class DummyAnnotatedClass {
        @TestAnn2
        public String property;

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public void setterConflict1(String val) {}
        public void setterConflict2(String val) {}
    }

    private enum TestEnum {
        VALUE1, VALUE2
    }

    private static class TestAnnotationIntrospector extends AnnotationIntrospector {
        private static final long serialVersionUID = 1L;

        private Class<?> _serType;
        private Class<?> _serKeyType;
        private Class<?> _serContentType;

        private Class<?> _deserType;
        private Class<?> _deserKeyType;
        private Class<?> _deserContentType;

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        public void setSerType(Class<?> cls) { _serType = cls; }
        public void setSerKeyType(Class<?> cls) { _serKeyType = cls; }
        public void setSerContentType(Class<?> cls) { _serContentType = cls; }

        public void setDeserType(Class<?> cls) { _deserType = cls; }
        public void setDeserKeyType(Class<?> cls) { _deserKeyType = cls; }
        public void setDeserContentType(Class<?> cls) { _deserContentType = cls; }

        @Override
        public Class<?> findSerializationType(Annotated a) {
            return _serType;
        }

        @Override
        public Class<?> findSerializationKeyType(Annotated am, JavaType baseType) {
            return _serKeyType;
        }

        @Override
        public Class<?> findSerializationContentType(Annotated am, JavaType baseType) {
            return _serContentType;
        }

        @Override
        public Class<?> findDeserializationType(Annotated am, JavaType baseType) {
            return _deserType;
        }

        @Override
        public Class<?> findDeserializationKeyType(Annotated am, JavaType baseKeyType) {
            return _deserKeyType;
        }

        @Override
        public Class<?> findDeserializationContentType(Annotated am, JavaType baseContentType) {
            return _deserContentType;
        }

        public <A extends Annotation> A callFindAnnotation(Annotated ann, Class<A> cls) {
            return _findAnnotation(ann, cls);
        }

        public boolean callHasAnnotation(Annotated ann, Class<? extends Annotation> cls) {
            return _hasAnnotation(ann, cls);
        }

        public boolean callHasOneOf(Annotated ann, Class<? extends Annotation>[] classes) {
            return _hasOneOf(ann, classes);
        }
    }

    @Test
    public void testReferenceProperty_managedAndBack_getterAndFlags() {
        AnnotationIntrospector.ReferenceProperty managed = AnnotationIntrospector.ReferenceProperty.managed("refName");
        Assert.assertNotNull(managed);
        Assert.assertEquals("refName", managed.getName());
        Assert.assertEquals(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, managed.getType());
        Assert.assertTrue(managed.isManagedReference());
        Assert.assertFalse(managed.isBackReference());

        AnnotationIntrospector.ReferenceProperty back = AnnotationIntrospector.ReferenceProperty.back("backRef");
        Assert.assertNotNull(back);
        Assert.assertEquals("backRef", back.getName());
        Assert.assertEquals(AnnotationIntrospector.ReferenceProperty.Type.BACK_REFERENCE, back.getType());
        Assert.assertFalse(back.isManagedReference());
        Assert.assertTrue(back.isBackReference());
    }

    @Test
    public void testFactoryMethods_nopInstanceAndPair() {
        AnnotationIntrospector nop = AnnotationIntrospector.nopInstance();
        Assert.assertNotNull(nop);
        Assert.assertSame(NopAnnotationIntrospector.instance, nop);

        TestAnnotationIntrospector ai1 = new TestAnnotationIntrospector();
        TestAnnotationIntrospector ai2 = new TestAnnotationIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospector.pair(ai1, ai2);
        Assert.assertNotNull(pair);
        Assert.assertTrue(pair instanceof AnnotationIntrospectorPair);
    }

    @Test
    public void testAllIntrospectors_defaultImplementations() {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        Collection<AnnotationIntrospector> list = ai.allIntrospectors();
        Assert.assertEquals(1, list.size());
        Assert.assertTrue(list.contains(ai));

        List<AnnotationIntrospector> target = new ArrayList<AnnotationIntrospector>();
        Collection<AnnotationIntrospector> result = ai.allIntrospectors(target);
        Assert.assertSame(target, result);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(ai));
    }

    @Test
    public void testDefaultMethodImplementations_returnNullFalseOrDefaults() {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig serConfig = mapper.getSerializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType strType = tf.constructType(String.class);

        AnnotatedClass ac = serConfig.introspectClassAnnotations(DummyAnnotatedClass.class);
        AnnotatedMember fieldMember = null;
        AnnotatedMethod methodMember = null;
        for (AnnotatedField f : ac.fields()) {
            if ("property".equals(f.getName())) {
                fieldMember = f;
                break;
            }
        }
        for (AnnotatedMethod m : ac.memberMethods()) {
            if ("getProperty".equals(m.getName())) {
                methodMember = m;
                break;
            }
        }

        Assert.assertFalse(ai.isAnnotationBundle(ac.getAnnotation(TestAnn1.class)));
        Assert.assertNull(ai.findObjectIdInfo(ac));
        ObjectIdInfo objectIdInfo = new ObjectIdInfo(PropertyName.construct("id"), Object.class, null, null);
        Assert.assertSame(objectIdInfo, ai.findObjectReferenceInfo(ac, objectIdInfo));

        Assert.assertNull(ai.findRootName(ac));
        Assert.assertNull(ai.findPropertiesToIgnore(ac, true));
        Assert.assertNull(ai.findPropertiesToIgnore(ac, false));
        Assert.assertNull(ai.findPropertiesToIgnore(ac));
        Assert.assertNull(ai.findIgnoreUnknownProperties(ac));
        Assert.assertNull(ai.isIgnorableType(ac));
        Assert.assertNull(ai.findFilterId(ac));
        Assert.assertNull(ai.findNamingStrategy(ac));
        Assert.assertNull(ai.findClassDescription(ac));

        VisibilityChecker<?> checker = VisibilityChecker.Std.defaultInstance();
        Assert.assertSame(checker, ai.findAutoDetectVisibility(ac, checker));

        Assert.assertNull(ai.findTypeResolver(serConfig, ac, strType));
        Assert.assertNull(ai.findPropertyTypeResolver(serConfig, fieldMember, strType));
        Assert.assertNull(ai.findPropertyContentTypeResolver(serConfig, fieldMember, strType));
        Assert.assertNull(ai.findSubtypes(ac));
        Assert.assertNull(ai.findTypeName(ac));
        Assert.assertNull(ai.isTypeId(fieldMember));

        Assert.assertNull(ai.findReferenceType(fieldMember));
        Assert.assertNull(ai.findUnwrappingNameTransformer(fieldMember));
        Assert.assertFalse(ai.hasIgnoreMarker(fieldMember));
        Assert.assertNull(ai.findInjectableValueId(fieldMember));
        Assert.assertNull(ai.hasRequiredMarker(fieldMember));
        Assert.assertNull(ai.findViews(fieldMember));
        Assert.assertNull(ai.findFormat(fieldMember));
        Assert.assertNull(ai.findWrapperName(fieldMember));
        Assert.assertNull(ai.findPropertyDefaultValue(fieldMember));
        Assert.assertNull(ai.findPropertyDescription(fieldMember));
        Assert.assertNull(ai.findPropertyIndex(fieldMember));
        Assert.assertNull(ai.findImplicitPropertyName(fieldMember));
        Assert.assertNull(ai.findPropertyAccess(fieldMember));
        Assert.assertNull(ai.resolveSetterConflict(serConfig, methodMember, methodMember));

        Assert.assertNull(ai.findSerializer(fieldMember));
        Assert.assertNull(ai.findKeySerializer(fieldMember));
        Assert.assertNull(ai.findContentSerializer(fieldMember));
        Assert.assertNull(ai.findNullSerializer(fieldMember));
        Assert.assertNull(ai.findSerializationTyping(fieldMember));
        Assert.assertNull(ai.findSerializationConverter(fieldMember));
        Assert.assertNull(ai.findSerializationContentConverter(fieldMember));
        Assert.assertEquals(JsonInclude.Include.ALWAYS, ai.findSerializationInclusion(ac, JsonInclude.Include.ALWAYS));
        Assert.assertEquals(JsonInclude.Include.NON_NULL, ai.findSerializationInclusionForContent(ac, JsonInclude.Include.NON_NULL));
        Assert.assertEquals(JsonInclude.Value.empty(), ai.findPropertyInclusion(ac));

        Assert.assertNull(ai.findSerializationPropertyOrder(ac));
        Assert.assertNull(ai.findSerializationSortAlphabetically(ac));
        List<BeanPropertyWriter> props = new ArrayList<BeanPropertyWriter>();
        ai.findAndAddVirtualProperties(serConfig, ac, props);
        Assert.assertTrue(props.isEmpty());

        Assert.assertNull(ai.findNameForSerialization(fieldMember));
        Assert.assertFalse(ai.hasAsValueAnnotation(methodMember));

        Assert.assertNull(ai.findDeserializer(fieldMember));
        Assert.assertNull(ai.findKeyDeserializer(fieldMember));
        Assert.assertNull(ai.findContentDeserializer(fieldMember));
        Assert.assertNull(ai.findDeserializationConverter(fieldMember));
        Assert.assertNull(ai.findDeserializationContentConverter(fieldMember));

        Assert.assertNull(ai.findValueInstantiator(ac));
        Assert.assertNull(ai.findPOJOBuilder(ac));
        Assert.assertNull(ai.findPOJOBuilderConfig(ac));
        Assert.assertNull(ai.findNameForDeserialization(fieldMember));
        Assert.assertFalse(ai.hasAnySetterAnnotation(methodMember));
        Assert.assertFalse(ai.hasAnyGetterAnnotation(methodMember));
        Assert.assertFalse(ai.hasCreatorAnnotation(methodMember));
        Assert.assertNull(ai.findCreatorBinding(methodMember));
    }

    @Test
    public void testFindEnumValues_delegationAndExplicitValues() {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        Assert.assertEquals("VALUE1", ai.findEnumValue(TestEnum.VALUE1));

        Enum<?>[] enumValues = TestEnum.values();
        String[] names = new String[2];
        names[1] = "EXPLICIT_VALUE2";

        String[] result = ai.findEnumValues(TestEnum.class, enumValues, names);
        Assert.assertEquals("VALUE1", result[0]);
        Assert.assertEquals("EXPLICIT_VALUE2", result[1]);

        String[] emptyNames = ai.findEnumValues(TestEnum.class, new Enum<?>[0], new String[0]);
        Assert.assertEquals(0, emptyNames.length);
    }

    @Test
    public void testProtectedAnnotationHelpers() {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        AnnotatedClass ac = mapper.getSerializationConfig().introspectClassAnnotations(DummyAnnotatedClass.class);
        AnnotatedField fieldMember = null;
        for (AnnotatedField f : ac.fields()) {
            if ("property".equals(f.getName())) {
                fieldMember = f;
                break;
            }
        }
        Assert.assertNotNull(fieldMember);

        Assert.assertNotNull(ai.callFindAnnotation(ac, TestAnn1.class));
        Assert.assertNull(ai.callFindAnnotation(ac, TestAnn2.class));
        Assert.assertTrue(ai.callHasAnnotation(ac, TestAnn1.class));
        Assert.assertFalse(ai.callHasAnnotation(ac, TestAnn2.class));

        @SuppressWarnings("unchecked")
        Class<? extends Annotation>[] classes1 = new Class[] { TestAnn1.class, TestAnn2.class };
        @SuppressWarnings("unchecked")
        Class<? extends Annotation>[] classes2 = new Class[] { TestAnn2.class };

        Assert.assertTrue(ai.callHasOneOf(ac, classes1));
        Assert.assertFalse(ai.callHasOneOf(ac, classes2));

        Assert.assertTrue(ai.callHasAnnotation(fieldMember, TestAnn2.class));
        Assert.assertFalse(ai.callHasAnnotation(fieldMember, TestAnn1.class));
    }

    @Test
    public void testRefineSerializationType_noRefinement() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        JavaType refined = ai.refineSerializationType(config, ac, baseType);
        Assert.assertSame(baseType, refined);
    }

    @Test
    public void testRefineSerializationType_mainType_sameClassStaticTyping() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        ai.setSerType(String.class);
        JavaType refined = ai.refineSerializationType(config, ac, baseType);
        Assert.assertTrue(refined.useStaticType());
        Assert.assertEquals(String.class, refined.getRawClass());
    }

    @Test
    public void testRefineSerializationType_mainType_generalized() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(ArrayList.class);
        AnnotatedClass ac = config.introspectClassAnnotations(ArrayList.class);

        ai.setSerType(List.class);
        JavaType refined = ai.refineSerializationType(config, ac, baseType);
        Assert.assertEquals(List.class, refined.getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_mainType_illegalGeneralizationThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        ai.setSerType(Integer.class);
        ai.refineSerializationType(config, ac, baseType);
    }

    @Test
    public void testRefineSerializationType_mapLikeKeyAndContentType_generalizeAndSpecialize() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType mapType = tf.constructMapType(HashMap.class, String.class, ArrayList.class);
        AnnotatedClass ac = config.introspectClassAnnotations(HashMap.class);

        // Static typing key
        ai.setSerKeyType(String.class);
        JavaType refinedKeyStatic = ai.refineSerializationType(config, ac, mapType);
        Assert.assertTrue(refinedKeyStatic.getKeyType().useStaticType());

        // Generalize key (String -> CharSequence)
        ai.setSerKeyType(CharSequence.class);
        JavaType refinedKeyGen = ai.refineSerializationType(config, ac, mapType);
        Assert.assertEquals(CharSequence.class, refinedKeyGen.getKeyType().getRawClass());

        // Specialize key (CharSequence -> String)
        JavaType charSeqMap = tf.constructMapType(HashMap.class, CharSequence.class, Object.class);
        ai.setSerKeyType(String.class);
        JavaType refinedKeySpec = ai.refineSerializationType(config, ac, charSeqMap);
        Assert.assertEquals(String.class, refinedKeySpec.getKeyType().getRawClass());

        // Static typing content
        ai.setSerKeyType(null);
        ai.setSerContentType(ArrayList.class);
        JavaType refinedContentStatic = ai.refineSerializationType(config, ac, mapType);
        Assert.assertTrue(refinedContentStatic.getContentType().useStaticType());

        // Generalize content (ArrayList -> List)
        ai.setSerContentType(List.class);
        JavaType refinedContentGen = ai.refineSerializationType(config, ac, mapType);
        Assert.assertEquals(List.class, refinedContentGen.getContentType().getRawClass());

        // Specialize content (List -> ArrayList)
        JavaType listContentMap = tf.constructMapType(HashMap.class, String.class, List.class);
        ai.setSerContentType(ArrayList.class);
        JavaType refinedContentSpec = ai.refineSerializationType(config, ac, listContentMap);
        Assert.assertEquals(ArrayList.class, refinedContentSpec.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_mapLikeKeyUnrelatedThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType mapType = tf.constructMapType(HashMap.class, String.class, String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(HashMap.class);

        ai.setSerKeyType(Integer.class);
        ai.refineSerializationType(config, ac, mapType);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineSerializationType_contentTypeUnrelatedThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType listType = tf.constructCollectionType(ArrayList.class, String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(ArrayList.class);

        ai.setSerContentType(Integer.class);
        ai.refineSerializationType(config, ac, listType);
    }

    @Test
    public void testRefineDeserializationType_noRefinement() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        JavaType refined = ai.refineDeserializationType(config, ac, baseType);
        Assert.assertSame(baseType, refined);
    }

    @Test
    public void testRefineDeserializationType_mainType_sameClassNoChange() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        ai.setDeserType(String.class);
        JavaType refined = ai.refineDeserializationType(config, ac, baseType);
        Assert.assertEquals(String.class, refined.getRawClass());
    }

    @Test
    public void testRefineDeserializationType_mainType_specialized() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(List.class);
        AnnotatedClass ac = config.introspectClassAnnotations(List.class);

        ai.setDeserType(ArrayList.class);
        JavaType refined = ai.refineDeserializationType(config, ac, baseType);
        Assert.assertEquals(ArrayList.class, refined.getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_mainType_incompatibleThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType baseType = mapper.getTypeFactory().constructType(String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(String.class);

        ai.setDeserType(Integer.class);
        ai.refineDeserializationType(config, ac, baseType);
    }

    @Test
    public void testRefineDeserializationType_mapLikeKeyAndContentType_specialized() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType mapType = tf.constructMapType(Map.class, Object.class, Object.class);
        AnnotatedClass ac = config.introspectClassAnnotations(Map.class);

        ai.setDeserKeyType(String.class);
        ai.setDeserContentType(Integer.class);

        JavaType refined = ai.refineDeserializationType(config, ac, mapType);
        Assert.assertEquals(String.class, refined.getKeyType().getRawClass());
        Assert.assertEquals(Integer.class, refined.getContentType().getRawClass());
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_mapKeyIncompatibleThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType mapType = tf.constructMapType(Map.class, String.class, Object.class);
        AnnotatedClass ac = config.introspectClassAnnotations(Map.class);

        ai.setDeserKeyType(Integer.class);
        ai.refineDeserializationType(config, ac, mapType);
    }

    @Test(expected = JsonMappingException.class)
    public void testRefineDeserializationType_contentTypeIncompatibleThrows() throws Exception {
        TestAnnotationIntrospector ai = new TestAnnotationIntrospector();
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        TypeFactory tf = mapper.getTypeFactory();
        JavaType listType = tf.constructCollectionType(List.class, String.class);
        AnnotatedClass ac = config.introspectClassAnnotations(List.class);

        ai.setDeserContentType(Integer.class);
        ai.refineDeserializationType(config, ac, listType);
    }
}
