package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    public static class SimpleBean {
        public int id;
        public String name;

        public SimpleBean() {}

        @JsonCreator
        public SimpleBean(@JsonProperty("id") int id, @JsonProperty("name") String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SimpleBean that = (SimpleBean) o;
            return id == that.id && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class ViewClass {
        public interface PublicView {}
        public interface InternalView extends PublicView {}

        @com.fasterxml.jackson.annotation.JsonView(PublicView.class)
        public String pub = "pubVal";

        @com.fasterxml.jackson.annotation.JsonView(InternalView.class)
        public String internal = "privVal";
    }

    public static class CloseableBean implements Closeable {
        public int x = 1;
        public boolean closed = false;

        @Override
        public void close() throws IOException {
            this.closed = true;
        }
    }

    public static class InjectedBean {
        @JacksonInject("injectId")
        public String injectedVal;
        public int regularVal;
    }

    public static abstract class AbstractBase {
        public int a;
    }

    public static class ConcreteSub extends AbstractBase {
        public int b;
    }

    public static class MixInTarget {
        public String ignoredField = "keep";
        public String regularField = "show";
    }

    public abstract static class MixInSource {
        @com.fasterxml.jackson.annotation.JsonIgnore
        public String ignoredField;
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testConstructors_validInitialization() {
        ObjectMapper m1 = new ObjectMapper();
        Assert.assertNotNull(m1.getFactory());

        JsonFactory jf = new JsonFactory();
        ObjectMapper m2 = new ObjectMapper(jf);
        Assert.assertSame(jf, m2.getFactory());
        Assert.assertSame(m2, jf.getCodec());

        DefaultSerializerProvider.Impl sp = new DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl dc =
                new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(
                        com.fasterxml.jackson.databind.deser.BeanDeserializerFactory.instance);
        ObjectMapper m3 = new ObjectMapper(jf, sp, dc);
        Assert.assertNotNull(m3.getSerializerProvider());
        Assert.assertNotNull(m3.getDeserializationContext());
    }

    @Test
    public void testCopy_clonedMapperConfigurationPreserved() throws Exception {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.addMixIn(MixInTarget.class, MixInSource.class);
        ObjectMapper copy = mapper.copy();
        Assert.assertNotSame(mapper, copy);
        Assert.assertNotSame(mapper.getFactory(), copy.getFactory());
        Assert.assertEquals(1, copy.mixInCount());
        Assert.assertFalse(copy.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testVersion_returnsValidPackageVersion() {
        Version v = mapper.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testRegisterModule_andSetupContextInteractions() {
        SimpleModule module = new SimpleModule("TestModule", new Version(1, 0, 0, null, "grp", "art"));
        final AtomicBoolean setupRan = new AtomicBoolean(false);
        Module custom = new Module() {
            @Override
            public String getModuleName() { return "Custom"; }

            @Override
            public Version version() { return Version.unknownVersion(); }

            @Override
            public void setupModule(SetupContext context) {
                setupRan.set(true);
                Assert.assertNotNull(context.getMapperVersion());
                Assert.assertNotNull(context.getOwner());
                Assert.assertNotNull(context.getTypeFactory());
                Assert.assertTrue(context.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
                Assert.assertTrue(context.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
                Assert.assertTrue(context.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS));
                Assert.assertFalse(context.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
                Assert.assertFalse(context.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
                Assert.assertFalse(context.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));

                context.configOverride(SimpleBean.class);
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
                context.addAbstractTypeResolver(new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver());
                context.addTypeModifier(new TypeModifier() {
                    @Override
                    public JavaType modifyType(JavaType type, java.lang.reflect.Type jdkType, TypeBindings contextType, TypeFactory typeFactory) {
                        return type;
                    }
                });
                context.addValueInstantiators(new ValueInstantiators.Base());
                context.setClassIntrospector(new BasicClassIntrospector());
                context.insertAnnotationIntrospector(new JacksonAnnotationIntrospector());
                context.appendAnnotationIntrospector(new JacksonAnnotationIntrospector());
                context.registerSubtypes(ConcreteSub.class);
                context.registerSubtypes(new NamedType(ConcreteSub.class, "concreteSub"));
                context.setMixInAnnotations(MixInTarget.class, MixInSource.class);
                context.addDeserializationProblemHandler(new DeserializationProblemHandler() {});
                context.setNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            }
        };

        mapper.registerModule(custom);
        Assert.assertTrue(setupRan.get());
        Assert.assertEquals(PropertyNamingStrategy.SNAKE_CASE, mapper.getPropertyNamingStrategy());

        mapper.configure(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS, true);
        mapper.registerModule(module);
        mapper.registerModule(module);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_nullName_throwsException() {
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
    public void testRegisterModule_nullVersion_throwsException() {
        mapper.registerModule(new Module() {
            @Override
            public String getModuleName() { return "NoVer"; }
            @Override
            public Version version() { return null; }
            @Override
            public void setupModule(SetupContext context) {}
        });
    }

    @Test
    public void testRegisterModules_varargsAndIterable() {
        SimpleModule m1 = new SimpleModule("m1", Version.unknownVersion());
        SimpleModule m2 = new SimpleModule("m2", Version.unknownVersion());
        mapper.registerModules(m1, m2);
        mapper.registerModules(Arrays.<Module>asList(new SimpleModule("m3", Version.unknownVersion())));
        Assert.assertNotNull(ObjectMapper.findModules());
        Assert.assertNotNull(ObjectMapper.findModules(getClass().getClassLoader()));
        mapper.findAndRegisterModules();
    }

    @Test
    public void testGetAndSetConfigs_andFactories() {
        Assert.assertNotNull(mapper.getSerializationConfig());
        Assert.assertNotNull(mapper.getDeserializationConfig());
        Assert.assertNotNull(mapper.getDeserializationContext());

        SerializerFactory sf = mapper.getSerializerFactory();
        mapper.setSerializerFactory(sf);
        Assert.assertSame(sf, mapper.getSerializerFactory());

        DefaultSerializerProvider sp = (DefaultSerializerProvider) mapper.getSerializerProvider();
        mapper.setSerializerProvider(sp);
        Assert.assertSame(sp, mapper.getSerializerProvider());
        Assert.assertNotNull(mapper.getSerializerProviderInstance());

        mapper.setConfig(mapper.getDeserializationConfig());
        mapper.setConfig(mapper.getSerializationConfig());
    }

    @Test
    public void testMixIns_addSetFind() throws Exception {
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(MixInTarget.class, MixInSource.class);
        mapper.setMixIns(mixins);
        Assert.assertEquals(MixInSource.class, mapper.findMixInClassFor(MixInTarget.class));
        Assert.assertEquals(1, mapper.mixInCount());

        mapper.addMixIn(SimpleBean.class, MixInSource.class);
        Assert.assertEquals(2, mapper.mixInCount());

        mapper.setMixInAnnotations(mixins);
        mapper.addMixInAnnotations(SimpleBean.class, MixInSource.class);

        MixInTarget target = new MixInTarget();
        String json = mapper.writeValueAsString(target);
        Assert.assertFalse(json.contains("ignoredField"));
        Assert.assertTrue(json.contains("regularField"));

        mapper.setMixInResolver(new ClassIntrospector.MixInResolver() {
            @Override
            public Class<?> findMixInClassFor(Class<?> cls) {
                return null;
            }

            @Override
            public ClassIntrospector.MixInResolver copy() {
                return this;
            }
        });
    }

    @Test
    public void testVisibility_getAndSet() {
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        Assert.assertNotNull(vc);
        mapper.setVisibility(vc);
        mapper.setVisibilityChecker(vc);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Assert.assertNotNull(mapper.getVisibilityChecker());
    }

    @Test
    public void testSubtypeResolver_andSubtypesRegistration() {
        SubtypeResolver str = new StdSubtypeResolver();
        mapper.setSubtypeResolver(str);
        Assert.assertSame(str, mapper.getSubtypeResolver());

        mapper.registerSubtypes(ConcreteSub.class);
        mapper.registerSubtypes(new NamedType(ConcreteSub.class, "subName"));
    }

    @Test
    public void testAnnotationIntrospectors_andPropertyNaming() {
        JacksonAnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(ai);
        mapper.setAnnotationIntrospectors(ai, ai);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        Assert.assertEquals(PropertyNamingStrategy.UPPER_CAMEL_CASE, mapper.getPropertyNamingStrategy());
    }

    @Test
    public void testInclusionAndPrettyPrinter() {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setPropertyInclusion(JsonInclude.Value.construct(JsonInclude.Include.NON_EMPTY, JsonInclude.Include.ALWAYS));
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        mapper.setDefaultPrettyPrinter(pp);
    }

    @Test
    public void testDefaultTyping_configuration() {
        mapper.enableDefaultTyping();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.WRAPPER_OBJECT);
        mapper.enableDefaultTypingAsProperty(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, "_type");
        mapper.disableDefaultTyping();

        ObjectMapper.DefaultTypeResolverBuilder builder = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        JavaType strType = mapper.constructType(String.class);
        JavaType objType = mapper.constructType(Object.class);
        JavaType arrType = mapper.constructType(Object[].class);
        JavaType nodeType = mapper.constructType(JsonNode.class);

        Assert.assertFalse(builder.useForType(strType));
        Assert.assertTrue(builder.useForType(objType));
        Assert.assertTrue(builder.useForType(arrType));
        Assert.assertFalse(builder.useForType(nodeType));

        ObjectMapper.DefaultTypeResolverBuilder nonConcreteBuilder = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        Assert.assertTrue(nonConcreteBuilder.useForType(mapper.constructType(AbstractBase[].class)));
        Assert.assertTrue(nonConcreteBuilder.useForType(mapper.constructType(AbstractBase.class)));
        Assert.assertFalse(nonConcreteBuilder.useForType(strType));

        ObjectMapper.DefaultTypeResolverBuilder javaLangObjBuilder = new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        Assert.assertTrue(javaLangObjBuilder.useForType(objType));
        Assert.assertFalse(javaLangObjBuilder.useForType(strType));

        mapper.setDefaultTyping(builder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTyping_externalProperty_throwsException() {
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL, JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    @Test
    public void testConfigOverride_typeFactory_andNodeFactory() {
        MutableConfigOverride override = mapper.configOverride(Date.class);
        Assert.assertNotNull(override);

        TypeFactory tf = TypeFactory.defaultInstance();
        mapper.setTypeFactory(tf);
        Assert.assertSame(tf, mapper.getTypeFactory());
        Assert.assertEquals(tf.constructType(String.class), mapper.constructType(String.class));

        JsonNodeFactory nf = JsonNodeFactory.instance;
        mapper.setNodeFactory(nf);
        Assert.assertSame(nf, mapper.getNodeFactory());

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        mapper.addHandler(handler);
        mapper.clearProblemHandlers();
    }

    @Test
    public void testFilters_base64_date_locale_timezone_handlers() {
        SimpleFilterProvider fp = new SimpleFilterProvider();
        mapper.setFilterProvider(fp);
        mapper.setFilters(fp);

        mapper.setBase64Variant(Base64Variants.MIME);
        Assert.assertSame(mapper.getFactory(), mapper.getJsonFactory());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        Assert.assertEquals(df, mapper.getDateFormat());

        mapper.setHandlerInstantiator(new HandlerInstantiator() {
            @Override public JsonDeserializer<?> deserializerInstance(DeserializationConfig c, Annotated a, Class<?> deserClass) { return null; }
            @Override public KeyDeserializer keyDeserializerInstance(DeserializationConfig c, Annotated a, Class<?> deserClass) { return null; }
            @Override public JsonSerializer<?> serializerInstance(SerializationConfig c, Annotated a, Class<?> serClass) { return null; }
            @Override public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> c, Annotated a, Class<?> builderClass) { return null; }
            @Override public TypeIdResolver typeIdResolverInstance(MapperConfig<?> c, Annotated a, Class<?> resolverClass) { return null; }
        });

        InjectableValues.Std iv = new InjectableValues.Std();
        mapper.setInjectableValues(iv);
        Assert.assertSame(iv, mapper.getInjectableValues());

        mapper.setLocale(Locale.GERMANY);
        mapper.setTimeZone(TimeZone.getTimeZone("GMT+2"));
    }

    @Test
    public void testFeatures_configuration() {
        mapper.configure(MapperFeature.USE_ANNOTATIONS, false);
        Assert.assertFalse(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
        mapper.enable(MapperFeature.USE_ANNOTATIONS);
        Assert.assertTrue(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));
        mapper.disable(MapperFeature.USE_ANNOTATIONS);
        Assert.assertFalse(mapper.isEnabled(MapperFeature.USE_ANNOTATIONS));

        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        Assert.assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        Assert.assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.enable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.disable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS);

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        Assert.assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES));
        mapper.enable(JsonParser.Feature.ALLOW_COMMENTS);
        mapper.disable(JsonParser.Feature.ALLOW_COMMENTS);

        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        Assert.assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        mapper.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);

        Assert.assertTrue(mapper.isEnabled(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
    }

    @Test
    public void testReadValue_fromVariousSources() throws Exception {
        String json = "{\"id\":10,\"name\":\"foo\"}";
        byte[] bytes = json.getBytes("UTF-8");
        JavaType javaType = mapper.constructType(SimpleBean.class);
        TypeReference<SimpleBean> typeRef = new TypeReference<SimpleBean>() {};

        JsonParser parser = mapper.getFactory().createParser(json);
        SimpleBean res1 = mapper.readValue(parser, SimpleBean.class);
        Assert.assertEquals(10, res1.id);

        parser = mapper.getFactory().createParser(json);
        SimpleBean res2 = mapper.readValue(parser, typeRef);
        Assert.assertEquals("foo", res2.name);

        parser = mapper.getFactory().createParser(json);
        SimpleBean res3 = mapper.readValue(parser, (com.fasterxml.jackson.core.type.ResolvedType) javaType);
        Assert.assertEquals(10, res3.id);

        parser = mapper.getFactory().createParser(json);
        SimpleBean res4 = mapper.readValue(parser, javaType);
        Assert.assertEquals(10, res4.id);

        Assert.assertEquals(10, mapper.readValue(json, SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(json, typeRef).id);
        Assert.assertEquals(10, mapper.readValue(json, javaType).id);

        Assert.assertEquals(10, mapper.readValue(new StringReader(json), SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(new StringReader(json), typeRef).id);
        Assert.assertEquals(10, mapper.readValue(new StringReader(json), javaType).id);

        Assert.assertEquals(10, mapper.readValue(new ByteArrayInputStream(bytes), SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(new ByteArrayInputStream(bytes), typeRef).id);
        Assert.assertEquals(10, mapper.readValue(new ByteArrayInputStream(bytes), javaType).id);

        Assert.assertEquals(10, mapper.readValue(bytes, SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(bytes, typeRef).id);
        Assert.assertEquals(10, mapper.readValue(bytes, javaType).id);
        Assert.assertEquals(10, mapper.readValue(bytes, 0, bytes.length, SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(bytes, 0, bytes.length, typeRef).id);
        Assert.assertEquals(10, mapper.readValue(bytes, 0, bytes.length, javaType).id);

        DataInput dataInput = new DataInputStream(new ByteArrayInputStream(bytes));
        Assert.assertEquals(10, mapper.readValue(dataInput, SimpleBean.class).id);
        dataInput = new DataInputStream(new ByteArrayInputStream(bytes));
        Assert.assertEquals(10, mapper.readValue(dataInput, javaType).id);

        File tempFile = File.createTempFile("jackson-test", ".json");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bytes);
        fos.close();

        Assert.assertEquals(10, mapper.readValue(tempFile, SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(tempFile, typeRef).id);
        Assert.assertEquals(10, mapper.readValue(tempFile, javaType).id);

        URL fileUrl = tempFile.toURI().toURL();
        Assert.assertEquals(10, mapper.readValue(fileUrl, SimpleBean.class).id);
        Assert.assertEquals(10, mapper.readValue(fileUrl, typeRef).id);
        Assert.assertEquals(10, mapper.readValue(fileUrl, javaType).id);
    }

    @Test
    public void testReadTree_fromVariousSources() throws Exception {
        String json = "{\"id\":10,\"name\":\"tree\"}";
        byte[] bytes = json.getBytes("UTF-8");

        JsonParser parser = mapper.getFactory().createParser(json);
        JsonNode node = mapper.readTree(parser);
        Assert.assertEquals(10, node.get("id").asInt());

        Assert.assertEquals(10, mapper.readTree(json).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(new StringReader(json)).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(new ByteArrayInputStream(bytes)).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(bytes).get("id").asInt());

        File tempFile = File.createTempFile("jackson-tree", ".json");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bytes);
        fos.close();

        Assert.assertEquals(10, mapper.readTree(tempFile).get("id").asInt());
        Assert.assertEquals(10, mapper.readTree(tempFile.toURI().toURL()).get("id").asInt());

        Assert.assertTrue(mapper.readTree("null") instanceof NullNode);
        JsonParser emptyParser = mapper.getFactory().createParser("");
        Assert.assertNull(mapper.readTree(emptyParser));
    }

    @Test
    public void testReadValues_mappingIterator() throws Exception {
        String json = "{\"id\":1}{\"id\":2}";
        JsonParser parser = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it1 = mapper.readValues(parser, SimpleBean.class);
        Assert.assertTrue(it1.hasNext());
        Assert.assertEquals(1, it1.next().id);
        Assert.assertEquals(2, it1.next().id);

        parser = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it2 = mapper.readValues(parser, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(1, it2.next().id);

        parser = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it3 = mapper.readValues(parser, mapper.constructType(SimpleBean.class));
        Assert.assertEquals(1, it3.next().id);

        parser = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it4 = mapper.readValues(parser, (com.fasterxml.jackson.core.type.ResolvedType) mapper.constructType(SimpleBean.class));
        Assert.assertEquals(1, it4.next().id);
    }

    @Test
    public void testWriteValue_variousTargets() throws Exception {
        SimpleBean bean = new SimpleBean(5, "write");

        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(g, bean);
        Assert.assertTrue(sw.toString().contains("\"id\":5"));

        String str = mapper.writeValueAsString(bean);
        Assert.assertTrue(str.contains("\"name\":\"write\""));

        byte[] bytes = mapper.writeValueAsBytes(bean);
        Assert.assertTrue(new String(bytes, "UTF-8").contains("\"id\":5"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        mapper.writeValue(baos, bean);
        Assert.assertTrue(baos.toString("UTF-8").contains("\"id\":5"));

        StringWriter sw2 = new StringWriter();
        mapper.writeValue(sw2, bean);
        Assert.assertTrue(sw2.toString().contains("\"id\":5"));

        ByteArrayOutputStream dataBaos = new ByteArrayOutputStream();
        DataOutput dataOut = new DataOutputStream(dataBaos);
        mapper.writeValue(dataOut, bean);
        Assert.assertTrue(dataBaos.toString("UTF-8").contains("\"id\":5"));

        File tempFile = File.createTempFile("jackson-write", ".json");
        tempFile.deleteOnExit();
        mapper.writeValue(tempFile, bean);
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void testWriteCloseable_handlesCloseOnWrite() throws Exception {
        CloseableBean cb1 = new CloseableBean();
        mapper.enable(SerializationFeature.CLOSE_CLOSEABLE);

        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, cb1);
        Assert.assertTrue(cb1.closed);

        CloseableBean cb2 = new CloseableBean();
        JsonGenerator g = mapper.getFactory().createGenerator(new StringWriter());
        mapper.writeValue(g, cb2);
        Assert.assertTrue(cb2.closed);
    }

    @Test
    public void testTreeOperations_createConvertAndWrite() throws Exception {
        ObjectNode objNode = mapper.createObjectNode();
        objNode.put("id", 100);
        objNode.put("name", "treeVal");
        ArrayNode arrNode = mapper.createArrayNode();
        arrNode.add(objNode);

        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(g, objNode);
        Assert.assertTrue(sw.toString().contains("100"));

        StringWriter sw2 = new StringWriter();
        JsonGenerator g2 = mapper.getFactory().createGenerator(sw2);
        mapper.writeTree(g2, (TreeNode) arrNode);
        Assert.assertTrue(sw2.toString().contains("100"));

        JsonParser treeParser = mapper.treeAsTokens(objNode);
        Assert.assertNotNull(treeParser);

        SimpleBean bean = mapper.treeToValue(objNode, SimpleBean.class);
        Assert.assertEquals(100, bean.id);
        Assert.assertEquals("treeVal", bean.name);

        ObjectNode directNode = mapper.treeToValue(objNode, ObjectNode.class);
        Assert.assertSame(objNode, directNode);

        POJONode pojoNode = new POJONode(bean);
        SimpleBean extractedBean = mapper.treeToValue(pojoNode, SimpleBean.class);
        Assert.assertSame(bean, extractedBean);

        JsonNode convertedNode = mapper.valueToTree(bean);
        Assert.assertEquals(100, convertedNode.get("id").asInt());
        Assert.assertNull(mapper.valueToTree(null));
    }

    @Test
    public void testCanSerialize_andCanDeserialize() {
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class));
        AtomicReference<Throwable> serCause = new AtomicReference<Throwable>();
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class, serCause));
        Assert.assertNull(serCause.get());

        JavaType type = mapper.constructType(SimpleBean.class);
        Assert.assertTrue(mapper.canDeserialize(type));
        AtomicReference<Throwable> deserCause = new AtomicReference<Throwable>();
        Assert.assertTrue(mapper.canDeserialize(type, deserCause));
        Assert.assertNull(deserCause.get());
    }

    @Test
    public void testObjectWriter_fluentFactories() throws Exception {
        Assert.assertNotNull(mapper.writer());
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.FAIL_ON_EMPTY_BEANS));
        Assert.assertNotNull(mapper.writer(new SimpleDateFormat("yyyy")));
        Assert.assertNotNull(mapper.writerWithView(ViewClass.PublicView.class));
        Assert.assertNotNull(mapper.writerFor(SimpleBean.class));
        Assert.assertNotNull(mapper.writerFor(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.writerFor(mapper.constructType(SimpleBean.class)));
        Assert.assertNotNull(mapper.writer((PrettyPrinter) null));
        Assert.assertNotNull(mapper.writerWithDefaultPrettyPrinter());
        Assert.assertNotNull(mapper.writer(new SimpleFilterProvider()));
        Assert.assertNotNull(mapper.writer(Base64Variants.MODIFIED_FOR_URL));
        Assert.assertNotNull(mapper.writer(new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return standardAsciiEscapesForJSON(); }
            @Override public com.fasterxml.jackson.core.SerializableString getEscapeSequence(int ch) { return null; }
        }));
        Assert.assertNotNull(mapper.writer(ContextAttributes.getEmpty()));

        Assert.assertNotNull(mapper.writerWithType(SimpleBean.class));
        Assert.assertNotNull(mapper.writerWithType(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.writerWithType(mapper.constructType(SimpleBean.class)));

        ViewClass viewObj = new ViewClass();
        String publicJson = mapper.writerWithView(ViewClass.PublicView.class).writeValueAsString(viewObj);
        Assert.assertTrue(publicJson.contains("pubVal"));
        Assert.assertFalse(publicJson.contains("privVal"));
    }

    @Test
    public void testObjectReader_fluentFactories() throws Exception {
        Assert.assertNotNull(mapper.reader());
        Assert.assertNotNull(mapper.reader(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
        Assert.assertNotNull(mapper.reader(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        Assert.assertNotNull(mapper.readerFor(SimpleBean.class));
        Assert.assertNotNull(mapper.readerFor(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.readerFor(mapper.constructType(SimpleBean.class)));
        Assert.assertNotNull(mapper.reader(JsonNodeFactory.instance));
        Assert.assertNotNull(mapper.reader(new InjectableValues.Std()));
        Assert.assertNotNull(mapper.readerWithView(ViewClass.PublicView.class));
        Assert.assertNotNull(mapper.reader(Base64Variants.MIME));
        Assert.assertNotNull(mapper.reader(ContextAttributes.getEmpty()));

        Assert.assertNotNull(mapper.reader(SimpleBean.class));
        Assert.assertNotNull(mapper.reader(new TypeReference<SimpleBean>() {}));
        Assert.assertNotNull(mapper.reader(mapper.constructType(SimpleBean.class)));

        SimpleBean target = new SimpleBean(1, "orig");
        ObjectReader updatingReader = mapper.readerForUpdating(target);
        updatingReader.readValue("{\"name\":\"updated\"}");
        Assert.assertEquals("updated", target.name);
        Assert.assertEquals(1, target.id);
    }

    @Test
    public void testConvertValue_variousScenarios() {
        SimpleBean bean = new SimpleBean(42, "convert");
        Map<?, ?> map = mapper.convertValue(bean, Map.class);
        Assert.assertEquals(42, map.get("id"));
        Assert.assertEquals("convert", map.get("name"));

        SimpleBean fromMap = mapper.convertValue(map, SimpleBean.class);
        Assert.assertEquals(bean, fromMap);

        SimpleBean fromMapRef = mapper.convertValue(map, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(bean, fromMapRef);

        SimpleBean fromMapType = mapper.convertValue(map, mapper.constructType(SimpleBean.class));
        Assert.assertEquals(bean, fromMapType);

        Assert.assertNull(mapper.convertValue(null, SimpleBean.class));
        Assert.assertNull(mapper.convertValue(null, new TypeReference<SimpleBean>() {}));
        Assert.assertNull(mapper.convertValue(null, mapper.constructType(SimpleBean.class)));

        String sameStr = mapper.convertValue("plain", String.class);
        Assert.assertEquals("plain", sameStr);
    }

    @Test
    public void testConvertValue_nullNodeAndEmptyNodes() {
        Object resNull = mapper.convertValue(NullNode.instance, Object.class);
        Assert.assertNull(resNull);
    }

    @Test
    public void testRootWrappingDeserialization_successAndFailures() throws Exception {
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        SimpleBean bean = new SimpleBean(7, "wrapped");
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"SimpleBean\":{"));

        SimpleBean readBack = mapper.readValue(json, SimpleBean.class);
        Assert.assertEquals(7, readBack.id);

        try {
            mapper.readValue("{\"WrongRoot\":{\"id\":7,\"name\":\"wrapped\"}}", SimpleBean.class);
            Assert.fail("Expected JsonMappingException due to root mismatch");
        } catch (JsonMappingException ignored) {}

        try {
            mapper.readValue("[]", SimpleBean.class);
            Assert.fail("Expected JsonMappingException due to non-object root token");
        } catch (JsonMappingException ignored) {}
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValue_emptyContent_throwsJsonMappingException() throws Exception {
        mapper.readValue("", SimpleBean.class);
    }

    @Test
    public void testAcceptJsonFormatVisitor_andJsonSchema() throws Exception {
        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base();
        mapper.acceptJsonFormatVisitor(SimpleBean.class, visitor);
        mapper.acceptJsonFormatVisitor(mapper.constructType(SimpleBean.class), visitor);

        JsonSchema schema = mapper.generateJsonSchema(SimpleBean.class);
        Assert.assertNotNull(schema);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_nullType_throwsException() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, new JsonFormatVisitorWrapper.Base());
    }

    @Test(expected = IllegalStateException.class)
    public void testCheckInvalidCopy_throwsIfSubclassDoesNotOverride() {
        class CustomMapper extends ObjectMapper {}
        CustomMapper cm = new CustomMapper();
        cm.copy();
    }

    @Test
    public void testInjectableValues_deserialization() throws Exception {
        InjectableValues.Std iv = new InjectableValues.Std();
        iv.addValue("injectId", "injectedString");
        mapper.setInjectableValues(iv);

        String json = "{\"regularVal\":123}";
        InjectedBean bean = mapper.readValue(json, InjectedBean.class);
        Assert.assertEquals(123, bean.regularVal);
        Assert.assertEquals("injectedString", bean.injectedVal);
    }
}
