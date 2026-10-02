package com.fasterxml.jackson.databind;

import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    public static class SimpleBean {
        public int id;
        public String name;

        public SimpleBean() {}

        public SimpleBean(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class CloseableBean implements Closeable {
        public int value = 42;
        public boolean isClosed = false;

        public CloseableBean() {}

        @Override
        public void close() throws IOException {
            isClosed = true;
        }
    }

    public static class MixInTarget {
        public String stringValue;
    }

    public static abstract class MixInSource {
        @JsonProperty("renamed")
        public String stringValue;
    }

    public interface AbstractTypeInterface {
        int getVal();
    }

    public static class NonFinalType {
        public int num = 1;
    }

    public static final class FinalType {
        public int num = 2;
    }

    public static class CustomSubclassMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;
    }

    public static class DummySchema implements FormatSchema {
        @Override
        public String getSchemaType() {
            return "dummy";
        }
    }

    public static class TestModule extends Module {
        public boolean setupCalled = false;

        @Override
        public String getModuleName() {
            return "TestModule";
        }

        @Override
        public Version version() {
            return new Version(1, 0, 0, null, "group", "art");
        }

        @Override
        public void setupModule(SetupContext context) {
            setupCalled = true;
            Assert.assertNotNull(context.getMapperVersion());
            Assert.assertNotNull(context.getOwner());
            Assert.assertNotNull(context.getTypeFactory());
            Assert.assertTrue(context.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
            Assert.assertTrue(context.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
            Assert.assertTrue(context.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
            Assert.assertFalse(context.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES) == false && false);
            Assert.assertFalse(context.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
            Assert.assertFalse(context.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));

            context.addDeserializers(new Deserializers.Base());
            context.addKeyDeserializers(new KeyDeserializers() {
                @Override
                public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) {
                    return null;
                }
            });
            context.addBeanDeserializerModifier(new BeanDeserializerModifier());
            context.addSerializers(new Serializers.Base());
            context.addKeySerializers(new Serializers.Base());
            context.addBeanSerializerModifier(new BeanSerializerModifier());
            context.addAbstractTypeResolver(new AbstractTypeResolver() {});
            context.addTypeModifier(new TypeModifier() {
                @Override
                public JavaType modifyType(JavaType type, java.lang.reflect.Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                    return type;
                }
            });
            context.addValueInstantiators(new ValueInstantiators.Base());
            context.setClassIntrospector(BasicClassIntrospector.instance);
            context.insertAnnotationIntrospector(new JacksonAnnotationIntrospector());
            context.appendAnnotationIntrospector(new JacksonAnnotationIntrospector());
            context.registerSubtypes(SimpleBean.class);
            context.registerSubtypes(new NamedType(SimpleBean.class, "SimpleBean"));
            context.setMixInAnnotations(MixInTarget.class, MixInSource.class);
            context.addDeserializationProblemHandler(new DeserializationProblemHandler() {});
            context.setNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        }
    }

    @Test
    public void testConstructors_validInstances_createdCorrectly() {
        ObjectMapper m1 = new ObjectMapper();
        Assert.assertNotNull(m1.getFactory());
        Assert.assertNotNull(m1.getSerializerProvider());
        Assert.assertNotNull(m1.getDeserializationContext());

        JsonFactory jf = new JsonFactory();
        ObjectMapper m2 = new ObjectMapper(jf);
        Assert.assertSame(jf, m2.getFactory());

        ObjectMapper m3 = new ObjectMapper(null, null, null);
        Assert.assertNotNull(m3.getFactory());

        JsonFactory jf2 = new MappingJsonFactory();
        ObjectMapper m4 = new ObjectMapper(jf2, new DefaultSerializerProvider.Impl(), null);
        Assert.assertSame(jf2, m4.getFactory());
    }

    @Test
    public void testCopy_normalInstance_copiedSuccessfully() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ObjectMapper copy = mapper.copy();
        Assert.assertNotNull(copy);
        Assert.assertNotSame(mapper, copy);
        Assert.assertFalse(copy.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_subclassNotOverridingCopy_throwsException() {
        CustomSubclassMapper custom = new CustomSubclassMapper();
        custom.copy();
    }

    @Test
    public void testVersion_defaultMapper_returnsPackageVersion() {
        Version v = mapper.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUknownVersion());
    }

    @Test
    public void testRegisterModule_validModule_setupExecuted() {
        TestModule module = new TestModule();
        mapper.registerModule(module);
        Assert.assertTrue(module.setupCalled);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_nullModuleName_throwsException() {
        mapper.registerModule(new Module() {
            @Override
            public String getModuleName() { return null; }
            @Override
            public Version version() { return Version.unknownVersion(); }
            @Override
            public void setupModule(SetupContext context) {}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_nullModuleVersion_throwsException() {
        mapper.registerModule(new Module() {
            @Override
            public String getModuleName() { return "Test"; }
            @Override
            public Version version() { return null; }
            @Override
            public void setupModule(SetupContext context) {}
        });
    }

    @Test
    public void testRegisterModules_varargsAndIterable_registeredSuccessfully() {
        TestModule m1 = new TestModule();
        TestModule m2 = new TestModule();
        mapper.registerModules(m1, m2);
        Assert.assertTrue(m1.setupCalled);
        Assert.assertTrue(m2.setupCalled);

        TestModule m3 = new TestModule();
        mapper.registerModules(Collections.<Module>singletonList(m3));
        Assert.assertTrue(m3.setupCalled);

        Assert.assertNotNull(ObjectMapper.findModules());
        Assert.assertNotNull(ObjectMapper.findModules(getClass().getClassLoader()));
        Assert.assertNotNull(mapper.findAndRegisterModules());
    }

    @Test
    public void testConfigsAndFactories_gettersAndSetters_modifyState() {
        Assert.assertNotNull(mapper.getSerializationConfig());
        Assert.assertNotNull(mapper.getDeserializationConfig());
        Assert.assertNotNull(mapper.getDeserializationContext());
        Assert.assertNotNull(mapper.getSerializerFactory());
        Assert.assertNotNull(mapper.getSerializerProvider());

        mapper.setSerializerFactory(mapper.getSerializerFactory());
        mapper.setSerializerProvider(new DefaultSerializerProvider.Impl());
        mapper.setConfig(mapper.getDeserializationConfig());
        mapper.setConfig(mapper.getSerializationConfig());

        Assert.assertSame(mapper.getFactory(), mapper.getJsonFactory());
    }

    @Test
    public void testMixInAnnotations_addAndFind_registeredCorrectly() {
        Assert.assertEquals(0, mapper.mixInCount());
        mapper.addMixInAnnotations(MixInTarget.class, MixInSource.class);
        Assert.assertEquals(1, mapper.mixInCount());
        Assert.assertEquals(MixInSource.class, mapper.findMixInClassFor(MixInTarget.class));

        mapper.addMixIn(SimpleBean.class, MixInSource.class);
        Assert.assertEquals(2, mapper.mixInCount());

        Map<Class<?>, Class<?>> map = new HashMap<Class<?>, Class<?>>();
        map.put(MixInTarget.class, MixInSource.class);
        mapper.setMixInAnnotations(map);
        Assert.assertEquals(1, mapper.mixInCount());

        mapper.setMixInAnnotations(null);
        Assert.assertEquals(0, mapper.mixInCount());
    }

    @Test
    public void testVisibilityAndIntrospectors_configuration_appliedSuccessfully() {
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        Assert.assertNotNull(vc);
        mapper.setVisibilityChecker(vc);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        SubtypeResolver sr = mapper.getSubtypeResolver();
        Assert.assertNotNull(sr);
        mapper.setSubtypeResolver(new StdSubtypeResolver());

        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(ai);
        mapper.setAnnotationIntrospectors(ai, ai);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testDefaultTyping_variousOptions_configuredCorrectly() {
        mapper.enableDefaultTyping();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, JsonTypeInfo.As.WRAPPER_OBJECT);
        mapper.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, "@type");
        mapper.disableDefaultTyping();
        mapper.setDefaultTyping(new StdTypeResolverBuilder());

        mapper.registerSubtypes(SimpleBean.class);
        mapper.registerSubtypes(new NamedType(SimpleBean.class, "Simple"));
    }

    @Test
    public void testDefaultTypeResolverBuilder_useForType_checksBranches() {
        JavaType objType = SimpleType.constructUnsafe(Object.class);
        JavaType absType = SimpleType.constructUnsafe(AbstractTypeInterface.class);
        JavaType nonFinalType = SimpleType.constructUnsafe(NonFinalType.class);
        JavaType finalType = SimpleType.constructUnsafe(FinalType.class);
        JavaType treeNodeType = SimpleType.constructUnsafe(JsonNode.class);
        JavaType arrayNonFinalType = ArrayType.construct(nonFinalType, null, null);
        JavaType arrayAbsType = ArrayType.construct(absType, null, null);

        ObjectMapper.DefaultTypeResolverBuilder dtrb1 = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        Assert.assertTrue(dtrb1.useForType(objType));
        Assert.assertFalse(dtrb1.useForType(nonFinalType));

        ObjectMapper.DefaultTypeResolverBuilder dtrb2 = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        Assert.assertTrue(dtrb2.useForType(objType));
        Assert.assertTrue(dtrb2.useForType(absType));
        Assert.assertTrue(dtrb2.useForType(treeNodeType));
        Assert.assertFalse(dtrb2.useForType(finalType));

        ObjectMapper.DefaultTypeResolverBuilder dtrb3 = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        Assert.assertTrue(dtrb3.useForType(arrayAbsType));

        ObjectMapper.DefaultTypeResolverBuilder dtrb4 = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        Assert.assertTrue(dtrb4.useForType(nonFinalType));
        Assert.assertTrue(dtrb4.useForType(arrayNonFinalType));
        Assert.assertFalse(dtrb4.useForType(finalType));
        Assert.assertFalse(dtrb4.useForType(treeNodeType));

        TypeDeserializer td = dtrb1.buildTypeDeserializer(mapper.getDeserializationConfig(), objType, null);
        Assert.assertNotNull(td);
        Assert.assertNull(dtrb1.buildTypeDeserializer(mapper.getDeserializationConfig(), finalType, null));

        TypeSerializer ts = dtrb1.buildTypeSerializer(mapper.getSerializationConfig(), objType, null);
        Assert.assertNotNull(ts);
        Assert.assertNull(dtrb1.buildTypeSerializer(mapper.getSerializationConfig(), finalType, null));
    }

    @Test
    public void testTypeFactoryAndConstruction_construct_returnsJavaType() {
        TypeFactory tf = mapper.getTypeFactory();
        Assert.assertNotNull(tf);
        mapper.setTypeFactory(tf);
        JavaType jt = mapper.constructType(SimpleBean.class);
        Assert.assertEquals(SimpleBean.class, jt.getRawClass());
    }

    @Test
    public void testContextAndLocaleSettings_setAndGet_properlyAssigned() {
        JsonNodeFactory jnf = JsonNodeFactory.instance;
        mapper.setNodeFactory(jnf);
        Assert.assertSame(jnf, mapper.getNodeFactory());

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        mapper.addHandler(handler);
        mapper.clearProblemHandlers();

        FilterProvider fp = new SimpleFilterProvider();
        mapper.setFilters(fp);

        mapper.setBase64Variant(Base64Variants.MIME);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        mapper.setHandlerInstantiator(new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> deserClass) { return null; }
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> serClass) { return null; }
            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> builderClass) { return null; }
            @Override
            public com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolverInstance(com.fasterxml.jackson.databind.cfg.MapperConfig<?> config, com.fasterxml.jackson.databind.introspect.Annotated annotated, Class<?> resolverClass) { return null; }
        });
        mapper.setInjectableValues(new InjectableValues.Std());
        mapper.setLocale(Locale.US);
        mapper.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testFeatureConfigurations_allFeatureTypes_toggleState() {
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        Assert.assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.enable(MapperFeature.AUTO_DETECT_FIELDS);
        Assert.assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
        Assert.assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));

        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        Assert.assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        Assert.assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.enable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS);
        Assert.assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS);
        Assert.assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        Assert.assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
        Assert.assertTrue(mapper.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        Assert.assertTrue(mapper.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
    }

    @Test
    public void testReadValue_jsonParser_variousTypes_success() throws Exception {
        String json = "{\"id\":10,\"name\":\"test\"}";
        JsonParser jp = mapper.getFactory().createParser(json);
        SimpleBean b1 = mapper.readValue(jp, SimpleBean.class);
        Assert.assertEquals(10, b1.getId());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        SimpleBean b2 = mapper.readValue(jp, new TypeReference<SimpleBean>() {});
        Assert.assertEquals("test", b2.getName());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        JavaType jt = mapper.constructType(SimpleBean.class);
        SimpleBean b3 = mapper.readValue(jp, (com.fasterxml.jackson.core.type.ResolvedType) jt);
        Assert.assertEquals(10, b3.getId());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        SimpleBean b4 = mapper.readValue(jp, jt);
        Assert.assertEquals(10, b4.getId());
        jp.close();

        jp = mapper.getFactory().createParser("null");
        SimpleBean bNull = mapper.readValue(jp, SimpleBean.class);
        Assert.assertNull(bNull);
        jp.close();
    }

    @Test
    public void testReadTreeAndWriteTree_variousInputs_matchesJson() throws Exception {
        String json = "{\"id\":10,\"name\":\"node\"}";
        JsonParser jp = mapper.getFactory().createParser(json);
        JsonNode root = mapper.readTree(jp);
        Assert.assertEquals(10, root.get("id").asInt());
        jp.close();

        jp = mapper.getFactory().createParser("");
        Assert.assertNull(mapper.readTree(jp));
        jp.close();

        jp = mapper.getFactory().createParser("null");
        JsonNode nullNode = mapper.readTree(jp);
        Assert.assertTrue(nullNode.isNull());
        jp.close();

        Assert.assertEquals(10, mapper.readTree(json).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(new StringReader(json)).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(new ByteArrayInputStream(json.getBytes("UTF-8"))).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(json.getBytes("UTF-8")).get("id").asInt());

        File tmp = File.createTempFile("jackson-test", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, new SimpleBean(20, "file"));
        Assert.assertEquals(20, mapper.readTree(tmp).get("id").asInt());
        Assert.assertEquals(20, mapper.readTree(tmp.toURI().toURL()).get("id").asInt());

        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(jg, root);
        jg.close();
        Assert.assertTrue(sw.toString().contains("node"));

        sw = new StringWriter();
        jg = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(jg, (TreeNode) root);
        jg.close();
        Assert.assertTrue(sw.toString().contains("node"));
    }

    @Test
    public void testReadValues_mappingIterator_iteratesValues() throws Exception {
        String json = "{\"id\":1}{\"id\":2}";
        JsonParser jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it = mapper.readValues(jp, SimpleBean.class);
        List<SimpleBean> list = it.readAll();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(1, list.get(0).getId());
        Assert.assertEquals(2, list.get(1).getId());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it2 = mapper.readValues(jp, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(2, it2.readAll().size());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        JavaType jt = mapper.constructType(SimpleBean.class);
        MappingIterator<SimpleBean> it3 = mapper.readValues(jp, jt);
        Assert.assertEquals(2, it3.readAll().size());
        jp.close();

        jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it4 = mapper.readValues(jp, (com.fasterxml.jackson.core.type.ResolvedType) jt);
        Assert.assertEquals(2, it4.readAll().size());
        jp.close();
    }

    @Test
    public void testReadValue_fromVariousSources_deserializedCorrectly() throws Exception {
        String json = "{\"id\":5,\"name\":\"src\"}";
        byte[] bytes = json.getBytes("UTF-8");
        JavaType jt = mapper.constructType(SimpleBean.class);
        TypeReference<SimpleBean> tr = new TypeReference<SimpleBean>() {};

        File tmp = File.createTempFile("jackson-read-test", ".json");
        tmp.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tmp);
        fos.write(bytes);
        fos.close();

        Assert.assertEquals(5, mapper.readValue(tmp, SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(tmp, tr).getId());
        Assert.assertEquals(5, mapper.readValue(tmp, jt).getId());

        URL url = tmp.toURI().toURL();
        Assert.assertEquals(5, mapper.readValue(url, SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(url, tr).getId());
        Assert.assertEquals(5, mapper.readValue(url, jt).getId());

        Assert.assertEquals(5, mapper.readValue(json, SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(json, tr).getId());
        Assert.assertEquals(5, mapper.readValue(json, jt).getId());

        Assert.assertEquals(5, mapper.readValue(new StringReader(json), SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(new StringReader(json), tr).getId());
        Assert.assertEquals(5, mapper.readValue(new StringReader(json), jt).getId());

        Assert.assertEquals(5, mapper.readValue(new ByteArrayInputStream(bytes), SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(new ByteArrayInputStream(bytes), tr).getId());
        Assert.assertEquals(5, mapper.readValue(new ByteArrayInputStream(bytes), jt).getId());

        Assert.assertEquals(5, mapper.readValue(bytes, SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(bytes, tr).getId());
        Assert.assertEquals(5, mapper.readValue(bytes, jt).getId());

        Assert.assertEquals(5, mapper.readValue(bytes, 0, bytes.length, SimpleBean.class).getId());
        Assert.assertEquals(5, mapper.readValue(bytes, 0, bytes.length, tr).getId());
        Assert.assertEquals(5, mapper.readValue(bytes, 0, bytes.length, jt).getId());
    }

    @Test
    public void testWriteValue_variousTargetsAndFeatures_success() throws Exception {
        SimpleBean bean = new SimpleBean(1, "write");

        StringWriter sw = new StringWriter();
        JsonGenerator jg = mapper.getFactory().createGenerator(sw);
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.configure(SerializationFeature.FLUSH_AFTER_WRITE_VALUE, true);
        mapper.writeValue(jg, bean);
        Assert.assertTrue(sw.toString().contains("write"));

        File tmp = File.createTempFile("jackson-write", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, bean);
        Assert.assertTrue(tmp.length() > 0);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        mapper.writeValue(baos, bean);
        Assert.assertTrue(baos.size() > 0);

        StringWriter sw2 = new StringWriter();
        mapper.writeValue(sw2, bean);
        Assert.assertTrue(sw2.toString().contains("write"));

        String str = mapper.writeValueAsString(bean);
        Assert.assertTrue(str.contains("write"));

        byte[] b = mapper.writeValueAsBytes(bean);
        Assert.assertTrue(b.length > 0);

        mapper.configure(SerializationFeature.CLOSE_CLOSEABLE, true);
        CloseableBean cb = new CloseableBean();
        mapper.writeValue(new StringWriter(), cb);
        Assert.assertTrue(cb.isClosed);

        CloseableBean cb2 = new CloseableBean();
        StringWriter sw3 = new StringWriter();
        JsonGenerator jg2 = mapper.getFactory().createGenerator(sw3);
        mapper.writeValue(jg2, cb2);
        Assert.assertTrue(cb2.isClosed);
    }

    @Test
    public void testTreeOperations_createAndConvert_properMapping() throws Exception {
        ObjectNode on = mapper.createObjectNode();
        ArrayNode an = mapper.createArrayNode();
        Assert.assertNotNull(on);
        Assert.assertNotNull(an);

        on.put("id", 15);
        on.put("name", "tree");
        JsonParser p = mapper.treeAsTokens(on);
        Assert.assertNotNull(p);

        SimpleBean bean = mapper.treeToValue(on, SimpleBean.class);
        Assert.assertEquals(15, bean.getId());
        Assert.assertEquals("tree", bean.getName());

        ObjectNode sameNode = mapper.treeToValue(on, ObjectNode.class);
        Assert.assertSame(on, sameNode);

        JsonNode converted = mapper.valueToTree(bean);
        Assert.assertEquals(15, converted.get("id").asInt());
        Assert.assertNull(mapper.valueToTree(null));
    }

    @Test
    public void testCanSerializeAndDeserialize_typesChecked_returnsExpected() {
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class));
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class, cause));
        Assert.assertNull(cause.get());

        JavaType jt = mapper.constructType(SimpleBean.class);
        Assert.assertTrue(mapper.canDeserialize(jt));
        Assert.assertTrue(mapper.canDeserialize(jt, cause));
        Assert.assertNull(cause.get());
    }

    @Test
    public void testWriterVariants_allConfigurations_instantiated() {
        Assert.assertNotNull(mapper.writer());
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS));
        Assert.assertNotNull(mapper.writer(new SimpleDateFormat("yyyy-MM-dd")));
        Assert.assertNotNull(mapper.writerWithView(Object.class));
        Assert.assertNotNull(mapper.writerWithType(SimpleBean.class));
        Assert.assertNotNull(mapper.writerWithType((Class<?>) null));
        Assert.assertNotNull(mapper.writerWithType(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.writerWithType(mapper.constructType(SimpleBean.class)));
        Assert.assertNotNull(mapper.writer((PrettyPrinter) null));
        Assert.assertNotNull(mapper.writer(new DefaultPrettyPrinter()));
        Assert.assertNotNull(mapper.writerWithDefaultPrettyPrinter());
        Assert.assertNotNull(mapper.writer(new SimpleFilterProvider()));
        Assert.assertNotNull(mapper.writer(Base64Variants.MIME));
        Assert.assertNotNull(mapper.writer(new CharacterEscapes() {
            @Override
            public int[] getEscapeCodesForAscii() { return new int[128]; }
            @Override
            public SerializableString getEscapeSequence(int ch) { return null; }
        }));
        Assert.assertNotNull(mapper.writer(ContextAttributes.getEmpty()));
    }

    @Test
    public void testReaderVariants_allConfigurations_instantiated() {
        Assert.assertNotNull(mapper.reader());
        Assert.assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertNotNull(mapper.readerForUpdating(new SimpleBean()));
        Assert.assertNotNull(mapper.reader(mapper.constructType(SimpleBean.class)));
        Assert.assertNotNull(mapper.reader(SimpleBean.class));
        Assert.assertNotNull(mapper.reader(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.reader(JsonNodeFactory.instance));
        Assert.assertNotNull(mapper.reader(new InjectableValues.Std()));
        Assert.assertNotNull(mapper.readerWithView(Object.class));
        Assert.assertNotNull(mapper.reader(Base64Variants.MIME));
        Assert.assertNotNull(mapper.reader(ContextAttributes.getEmpty()));
    }

    @Test
    public void testConvertValue_variousInputs_convertedCorrectly() {
        SimpleBean b = new SimpleBean(7, "convert");
        SimpleBean same = mapper.convertValue(b, SimpleBean.class);
        Assert.assertSame(b, same);

        Map<?, ?> map = mapper.convertValue(b, Map.class);
        Assert.assertEquals(7, map.get("id"));

        SimpleBean fromMap = mapper.convertValue(map, SimpleBean.class);
        Assert.assertEquals(7, fromMap.getId());

        SimpleBean fromMapRef = mapper.convertValue(map, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(7, fromMapRef.getId());

        SimpleBean fromMapJavaType = mapper.convertValue(map, mapper.constructType(SimpleBean.class));
        Assert.assertEquals(7, fromMapJavaType.getId());

        Assert.assertNull(mapper.convertValue(null, SimpleBean.class));
        Assert.assertNull(mapper.convertValue(null, mapper.constructType(SimpleBean.class)));
    }

    @Test
    public void testSchemaAndVisitor_invocations_completeWithoutError() throws Exception {
        Assert.assertNotNull(mapper.generateJsonSchema(SimpleBean.class));
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base();
        mapper.acceptJsonFormatVisitor(SimpleBean.class, visitor);
        mapper.acceptJsonFormatVisitor(mapper.constructType(SimpleBean.class), visitor);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_nullType_throwsException() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, new JsonFormatVisitorWrapper.Base());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriterSchema_unsupportedSchema_throwsException() {
        mapper.writer(new DummySchema());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReaderSchema_unsupportedSchema_throwsException() {
        mapper.reader(new DummySchema());
    }

    @Test(expected = JsonMappingException.class)
    public void testInitForReading_emptyContent_throwsException() throws Exception {
        mapper.readValue("", SimpleBean.class);
    }

    @Test
    public void testRootWrappingAndUnwrapping_normalAndErrors_handledCorrectly() throws Exception {
        ObjectMapper wrapMapper = new ObjectMapper();
        wrapMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        wrapMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);

        SimpleBean b = new SimpleBean(99, "root");
        String json = wrapMapper.writeValueAsString(b);
        Assert.assertTrue(json.contains("SimpleBean"));

        SimpleBean deserialized = wrapMapper.readValue(json, SimpleBean.class);
        Assert.assertEquals(99, deserialized.getId());

        try {
            wrapMapper.readValue("{\"WrongName\":{\"id\":1}}", SimpleBean.class);
            Assert.fail("Expected JsonMappingException due to root name mismatch");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Root name 'WrongName' does not match expected"));
        }

        try {
            wrapMapper.readValue("[1, 2]", SimpleBean.class);
            Assert.fail("Expected JsonMappingException due to not START_OBJECT");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Current token not START_OBJECT"));
        }
    }
}
