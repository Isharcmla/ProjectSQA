package com.fasterxml.jackson.databind;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;

public class ObjectMapperTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // Helper classes for testing
    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SimpleBean that = (SimpleBean) o;
            return age == that.age && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static class GenericBean<T> {
        public T item;
        public GenericBean() {}
        public GenericBean(T item) { this.item = item; }
    }

    @JsonRootName("wrapped")
    public static class RootWrappedBean {
        public String id;
        public RootWrappedBean() {}
        public RootWrappedBean(String id) { this.id = id; }
    }

    public static class CloseableBean implements Closeable {
        public String value;
        public boolean closed = false;

        public CloseableBean() {}
        public CloseableBean(String val) { this.value = val; }

        @Override
        public void close() throws IOException {
            this.closed = true;
        }
    }

    public static class TargetBean {
        public String a;
        public String b;
    }

    public abstract static class MixInSource {
        @JsonIgnore
        public String b;
    }

    @JsonFilter("testFilter")
    public static class FilteredBean {
        public String included = "inc";
        public String excluded = "exc";
    }

    public interface Animal {}
    public static class Dog implements Animal {
        public String breed = "Labrador";
    }

    public static class CustomExceptionSubclassMapper extends ObjectMapper {
        public CustomExceptionSubclassMapper() { super(); }
    }

    // ==========================================
    // Constructor & Copy tests
    // ==========================================

    @Test
    public void testConstructors_allVariants_instantiatedCorrectly() {
        ObjectMapper m1 = new ObjectMapper();
        Assert.assertNotNull(m1.getFactory());

        JsonFactory jf = new JsonFactory();
        ObjectMapper m2 = new ObjectMapper(jf);
        Assert.assertSame(jf, m2.getFactory());

        DefaultSerializerProvider sp = new DefaultSerializerProvider.Impl();
        DefaultDeserializationContext dc = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
        ObjectMapper m3 = new ObjectMapper(jf, sp, dc);
        Assert.assertNotNull(m3.getSerializerProvider());
        Assert.assertNotNull(m3.getDeserializationContext());
    }

    @Test
    public void testCopy_validInstance_createsDistinctClone() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setInjectableValues(new InjectableValues.Std());
        mapper.registerModule(new Module() {
            @Override public String getModuleName() { return "TestMod"; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) {}
            @Override public Object getTypeId() { return "TestMod"; }
        });

        ObjectMapper copy = mapper.copy();
        Assert.assertNotSame(mapper, copy);
        Assert.assertFalse(copy.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertNotNull(copy.getInjectableValues());
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_unimplementedSubclass_throwsException() {
        CustomExceptionSubclassMapper custom = new CustomExceptionSubclassMapper();
        custom.copy();
    }

    @Test
    public void testVersion_default_notNull() {
        Assert.assertNotNull(mapper.version());
    }

    // ==========================================
    // DefaultTyping and TypeResolverBuilder tests
    // ==========================================

    @Test
    public void testDefaultTypeResolverBuilder_useForType_allEnums() {
        TypeFactory tf = TypeFactory.defaultInstance();
        JavaType objType = tf.constructType(Object.class);
        JavaType animalType = tf.constructType(Animal.class);
        JavaType dogType = tf.constructType(Dog.class);
        JavaType stringType = tf.constructType(String.class);
        JavaType treeNodeType = tf.constructType(JsonNode.class);
        JavaType objArrayType = tf.constructType(Object[].class);
        JavaType animalArrayType = tf.constructType(Animal[].class);

        // JAVA_LANG_OBJECT
        DefaultTypeResolverBuilder bObj = new DefaultTypeResolverBuilder(DefaultTyping.JAVA_LANG_OBJECT);
        Assert.assertTrue(bObj.useForType(objType));
        Assert.assertFalse(bObj.useForType(animalType));
        Assert.assertFalse(bObj.useForType(dogType));
        Assert.assertNull(bObj.buildTypeDeserializer(mapper.getDeserializationConfig(), dogType, null));
        Assert.assertNull(bObj.buildTypeSerializer(mapper.getSerializationConfig(), dogType, null));

        // OBJECT_AND_NON_CONCRETE
        DefaultTypeResolverBuilder bNonConc = new DefaultTypeResolverBuilder(DefaultTyping.OBJECT_AND_NON_CONCRETE);
        Assert.assertTrue(bNonConc.useForType(objType));
        Assert.assertTrue(bNonConc.useForType(animalType));
        Assert.assertFalse(bNonConc.useForType(dogType));
        Assert.assertFalse(bNonConc.useForType(treeNodeType));

        // NON_CONCRETE_AND_ARRAYS
        DefaultTypeResolverBuilder bNonConcArr = new DefaultTypeResolverBuilder(DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        Assert.assertTrue(bNonConcArr.useForType(animalArrayType));
        Assert.assertTrue(bNonConcArr.useForType(objArrayType));
        Assert.assertFalse(bNonConcArr.useForType(treeNodeType));

        // NON_FINAL
        DefaultTypeResolverBuilder bNonFinal = new DefaultTypeResolverBuilder(DefaultTyping.NON_FINAL);
        Assert.assertTrue(bNonFinal.useForType(dogType));
        Assert.assertFalse(bNonFinal.useForType(stringType)); // final
        Assert.assertFalse(bNonFinal.useForType(treeNodeType));
    }

    @Test
    public void testEnableDefaultTyping_variousOptions() throws Exception {
        mapper.enableDefaultTyping();
        mapper.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT);
        mapper.enableDefaultTyping(DefaultTyping.NON_FINAL, JsonTypeInfo.As.WRAPPER_OBJECT);
        mapper.enableDefaultTypingAsProperty(DefaultTyping.OBJECT_AND_NON_CONCRETE, "@type");
        mapper.disableDefaultTyping();
        mapper.setDefaultTyping(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableDefaultTyping_externalProperty_throwsException() {
        mapper.enableDefaultTyping(DefaultTyping.NON_FINAL, JsonTypeInfo.As.EXTERNAL_PROPERTY);
    }

    // ==========================================
    // Module registration tests
    // ==========================================

    @Test
    public void testRegisterModules_singleAndMultiple() {
        Module m1 = new SimpleModule("Mod1", Version.unknownVersion()) {
            @Override
            public void setupModule(SetupContext context) {
                super.setupModule(context);
                Assert.assertNotNull(context.getMapperVersion());
                Assert.assertNotNull(context.getOwner());
                Assert.assertNotNull(context.getTypeFactory());
                Assert.assertTrue(context.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
                Assert.assertFalse(context.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
                Assert.assertFalse(context.isEnabled(SerializationFeature.INDENT_OUTPUT));
                Assert.assertFalse(context.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
                Assert.assertFalse(context.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
                Assert.assertFalse(context.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));

                context.addDeserializers(new SimpleDeserializers());
                context.addKeyDeserializers(new SimpleKeyDeserializers());
                context.addBeanDeserializerModifier(new BeanDeserializerModifier() {});
                context.addSerializers(new SimpleSerializers());
                context.addKeySerializers(new SimpleSerializers());
                context.addBeanSerializerModifier(new BeanSerializerModifier() {});
                context.addAbstractTypeResolver(new SimpleAbstractTypeResolver());
                context.addTypeModifier(new TypeModifier() {
                    @Override
                    public JavaType modifyType(JavaType type, Type jdkType, TypeBindings context, TypeFactory typeFactory) {
                        return type;
                    }
                });
                context.addValueInstantiators(new SimpleValueInstantiators());
                context.setClassIntrospector(new BasicClassIntrospector());
                context.insertAnnotationIntrospector(new JacksonAnnotationIntrospector());
                context.appendAnnotationIntrospector(new JacksonAnnotationIntrospector());
                context.registerSubtypes(Dog.class);
                context.registerSubtypes(new NamedType(Dog.class, "dog"));
                context.setMixInAnnotations(TargetBean.class, MixInSource.class);
                context.addDeserializationProblemHandler(new DeserializationProblemHandler() {});
                context.setNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            }
        };

        Module m2 = new SimpleModule("Mod2", Version.unknownVersion());
        mapper.registerModule(m1);
        mapper.registerModules(m2);
        mapper.registerModules(Collections.singletonList(m2));
        Assert.assertNotNull(ObjectMapper.findModules());
        Assert.assertNotNull(ObjectMapper.findModules(getClass().getClassLoader()));
        mapper.findAndRegisterModules();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_nullName_throwsException() {
        mapper.registerModule(new Module() {
            @Override public String getModuleName() { return null; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) {}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_nullVersion_throwsException() {
        mapper.registerModule(new Module() {
            @Override public String getModuleName() { return "Test"; }
            @Override public Version version() { return null; }
            @Override public void setupModule(SetupContext context) {}
        });
    }

    // ==========================================
    // Configuration & Getter/Setter tests
    // ==========================================

    @SuppressWarnings("deprecation")
    @Test
    public void testConfigurationGettersSetters() {
        Assert.assertNotNull(mapper.getSerializationConfig());
        Assert.assertNotNull(mapper.getDeserializationConfig());
        Assert.assertNotNull(mapper.getDeserializationContext());

        SerializerFactory sf = BeanSerializerFactory.instance;
        mapper.setSerializerFactory(sf);
        Assert.assertSame(sf, mapper.getSerializerFactory());

        DefaultSerializerProvider sp = new DefaultSerializerProvider.Impl();
        mapper.setSerializerProvider(sp);
        Assert.assertNotNull(mapper.getSerializerProvider());

        // MixIns
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(TargetBean.class, MixInSource.class);
        mapper.setMixIns(mixins);
        mapper.setMixInAnnotations(mixins);
        mapper.addMixIn(TargetBean.class, MixInSource.class);
        mapper.addMixInAnnotations(TargetBean.class, MixInSource.class);
        Assert.assertEquals(1, mapper.mixInCount());
        Assert.assertEquals(MixInSource.class, mapper.findMixInClassFor(TargetBean.class));
        mapper.setMixInResolver(new SimpleMixInResolver(null));

        // Visibility
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        mapper.setVisibility(vc);
        mapper.setVisibilityChecker(vc);
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        // Subtypes & AnnotationIntrospector
        SubtypeResolver str = new StdSubtypeResolver();
        mapper.setSubtypeResolver(str);
        Assert.assertSame(str, mapper.getSubtypeResolver());
        mapper.registerSubtypes(Dog.class);
        mapper.registerSubtypes(new NamedType(Dog.class, "d"));

        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        mapper.setAnnotationIntrospector(ai);
        mapper.setAnnotationIntrospectors(ai, ai);

        // Naming Strategy & Inclusion & PrettyPrinter
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE);
        Assert.assertEquals(PropertyNamingStrategy.LOWER_CASE, mapper.getPropertyNamingStrategy());
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setDefaultPrettyPrinter(new DefaultPrettyPrinter());

        // TypeFactory & NodeFactory
        TypeFactory tf = TypeFactory.defaultInstance();
        mapper.setTypeFactory(tf);
        Assert.assertSame(tf, mapper.getTypeFactory());
        Assert.assertNotNull(mapper.constructType(SimpleBean.class));

        JsonNodeFactory nf = JsonNodeFactory.instance;
        mapper.setNodeFactory(nf);
        Assert.assertSame(nf, mapper.getNodeFactory());

        // Problem Handlers
        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        mapper.addHandler(h);
        mapper.clearProblemHandlers();

        // Config overrides
        mapper.setConfig(mapper.getDeserializationConfig());
        mapper.setConfig(mapper.getSerializationConfig());

        // FilterProvider
        FilterProvider fp = new SimpleFilterProvider().addFilter("testFilter", SimpleBeanPropertyFilter.serializeAll());
        mapper.setFilters(fp);
        mapper.setFilterProvider(fp);

        // Base64 & JsonFactory
        mapper.setBase64Variant(Base64Variants.MIME);
        Assert.assertSame(mapper.getFactory(), mapper.getJsonFactory());

        // DateFormat, Instantiator, InjectableValues, Locale, TimeZone
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(df);
        Assert.assertNotNull(mapper.getDateFormat());
        mapper.setHandlerInstantiator(new HandlerInstantiator() {
            @Override public JsonDeserializer<?> deserializerInstance(DeserializationConfig c, Annotated a, Class<?> d) { return null; }
            @Override public KeyDeserializer keyDeserializerInstance(DeserializationConfig c, Annotated a, Class<?> d) { return null; }
            @Override public JsonSerializer<?> serializerInstance(SerializationConfig c, Annotated a, Class<?> s) { return null; }
            @Override public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> c, Annotated a, Class<?> b) { return null; }
            @Override public com.fasterxml.jackson.databind.jsontype.TypeIdResolver typeIdResolverInstance(MapperConfig<?> c, Annotated a, Class<?> r) { return null; }
        });
        InjectableValues iv = new InjectableValues.Std();
        mapper.setInjectableValues(iv);
        Assert.assertSame(iv, mapper.getInjectableValues());

        mapper.setLocale(Locale.GERMANY);
        mapper.setTimeZone(TimeZone.getTimeZone("GMT+1"));
    }

    // ==========================================
    // Feature Configuration tests
    // ==========================================

    @Test
    public void testFeatureConfigurations_allFeatureTypes() {
        // MapperFeature
        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        Assert.assertTrue(mapper.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        mapper.enable(MapperFeature.USE_ANNOTATIONS);
        mapper.disable(MapperFeature.USE_ANNOTATIONS);

        // SerializationFeature
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        Assert.assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        mapper.disable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.disable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);

        // DeserializationFeature
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Assert.assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        mapper.disable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.disable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);

        // JsonParser.Feature
        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        Assert.assertTrue(mapper.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        mapper.enable(JsonParser.Feature.ALLOW_YAML_COMMENTS);
        mapper.disable(JsonParser.Feature.ALLOW_YAML_COMMENTS);

        // JsonGenerator.Feature
        mapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        Assert.assertTrue(mapper.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
        mapper.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        mapper.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);

        // JsonFactory.Feature
        Assert.assertTrue(mapper.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES));
    }

    // ==========================================
    // Serialization & Deserialization Public APIs
    // ==========================================

    @Test
    public void testReadWriteValue_basicPOJO_success() throws Exception {
        SimpleBean bean = new SimpleBean("Alice", 25);
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("Alice"));

        byte[] bytes = mapper.writeValueAsBytes(bean);
        Assert.assertTrue(bytes.length > 0);

        // read from String
        SimpleBean rStr = mapper.readValue(json, SimpleBean.class);
        Assert.assertEquals(bean, rStr);

        // read from bytes
        SimpleBean rByte = mapper.readValue(bytes, SimpleBean.class);
        Assert.assertEquals(bean, rByte);

        SimpleBean rByteOffset = mapper.readValue(bytes, 0, bytes.length, SimpleBean.class);
        Assert.assertEquals(bean, rByteOffset);

        // read from stream / reader
        SimpleBean rStream = mapper.readValue(new ByteArrayInputStream(bytes), SimpleBean.class);
        Assert.assertEquals(bean, rStream);

        SimpleBean rReader = mapper.readValue(new StringReader(json), SimpleBean.class);
        Assert.assertEquals(bean, rReader);

        // write to OutputStream / Writer / File
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        mapper.writeValue(out, bean);
        Assert.assertTrue(out.toByteArray().length > 0);

        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, bean);
        Assert.assertTrue(sw.toString().contains("Alice"));

        File tmp = File.createTempFile("jackson_test", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, bean);
        SimpleBean rFile = mapper.readValue(tmp, SimpleBean.class);
        Assert.assertEquals(bean, rFile);

        URL url = tmp.toURI().toURL();
        SimpleBean rUrl = mapper.readValue(url, SimpleBean.class);
        Assert.assertEquals(bean, rUrl);
    }

    @Test
    public void testReadWriteValue_typeReferenceAndJavaType() throws Exception {
        GenericBean<String> bean = new GenericBean<String>("hello");
        String json = mapper.writeValueAsString(bean);

        TypeReference<GenericBean<String>> typeRef = new TypeReference<GenericBean<String>>() {};
        JavaType javaType = mapper.getTypeFactory().constructType(typeRef);

        // TypeReference overloads
        GenericBean<String> r1 = mapper.readValue(json, typeRef);
        Assert.assertEquals("hello", r1.item);

        GenericBean<String> r2 = mapper.readValue(new StringReader(json), typeRef);
        Assert.assertEquals("hello", r2.item);

        GenericBean<String> r3 = mapper.readValue(new ByteArrayInputStream(json.getBytes("UTF-8")), typeRef);
        Assert.assertEquals("hello", r3.item);

        GenericBean<String> r4 = mapper.readValue(json.getBytes("UTF-8"), typeRef);
        Assert.assertEquals("hello", r4.item);

        GenericBean<String> r5 = mapper.readValue(json.getBytes("UTF-8"), 0, json.length(), typeRef);
        Assert.assertEquals("hello", r5.item);

        File tmp = File.createTempFile("jackson_ref", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, bean);
        GenericBean<String> r6 = mapper.readValue(tmp, typeRef);
        Assert.assertEquals("hello", r6.item);
        GenericBean<String> r7 = mapper.readValue(tmp.toURI().toURL(), typeRef);
        Assert.assertEquals("hello", r7.item);

        // JavaType overloads
        GenericBean<String> j1 = mapper.readValue(json, javaType);
        Assert.assertEquals("hello", j1.item);

        GenericBean<String> j2 = mapper.readValue(new StringReader(json), javaType);
        Assert.assertEquals("hello", j2.item);

        GenericBean<String> j3 = mapper.readValue(new ByteArrayInputStream(json.getBytes("UTF-8")), javaType);
        Assert.assertEquals("hello", j3.item);

        GenericBean<String> j4 = mapper.readValue(json.getBytes("UTF-8"), javaType);
        Assert.assertEquals("hello", j4.item);

        GenericBean<String> j5 = mapper.readValue(json.getBytes("UTF-8"), 0, json.length(), javaType);
        Assert.assertEquals("hello", j5.item);

        GenericBean<String> j6 = mapper.readValue(tmp, javaType);
        Assert.assertEquals("hello", j6.item);
        GenericBean<String> j7 = mapper.readValue(tmp.toURI().toURL(), javaType);
        Assert.assertEquals("hello", j7.item);

        // ResolvedType & Parser overloads
        JsonParser jp = mapper.getFactory().createParser(json);
        GenericBean<String> p1 = mapper.readValue(jp, (ResolvedType) javaType);
        Assert.assertEquals("hello", p1.item);

        JsonParser jp2 = mapper.getFactory().createParser(json);
        GenericBean<String> p2 = mapper.readValue(jp2, javaType);
        Assert.assertEquals("hello", p2.item);

        JsonParser jp3 = mapper.getFactory().createParser(json);
        GenericBean<String> p3 = mapper.readValue(jp3, typeRef);
        Assert.assertEquals("hello", p3.item);
    }

    @Test
    public void testReadValues_mappingIterator() throws Exception {
        String json = "{\"name\":\"A\",\"age\":1}{\"name\":\"B\",\"age\":2}";
        JsonParser jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it = mapper.readValues(jp, SimpleBean.class);
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("A", it.next().name);
        Assert.assertEquals("B", it.next().name);

        jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> itTypeRef = mapper.readValues(jp, new TypeReference<SimpleBean>() {});
        Assert.assertTrue(itTypeRef.hasNext());
        Assert.assertEquals("A", itTypeRef.next().name);

        jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> itJavaType = mapper.readValues(jp, mapper.constructType(SimpleBean.class));
        Assert.assertTrue(itJavaType.hasNext());
        Assert.assertEquals("A", itJavaType.next().name);

        jp = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> itResType = mapper.readValues(jp, (ResolvedType) mapper.constructType(SimpleBean.class));
        Assert.assertTrue(itResType.hasNext());
        Assert.assertEquals("A", itResType.next().name);
    }

    // ==========================================
    // Tree Model & Node operations
    // ==========================================

    @Test
    public void testTreeModel_readWriteAndConversions() throws Exception {
        ObjectNode objNode = mapper.createObjectNode();
        objNode.put("key", "value");
        ArrayNode arrNode = mapper.createArrayNode();
        arrNode.add("elem");

        Assert.assertNotNull(objNode);
        Assert.assertNotNull(arrNode);

        // writeTree
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(g, objNode);
        Assert.assertTrue(sw.toString().contains("value"));

        sw = new StringWriter();
        g = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(g, (TreeNode) arrNode);
        Assert.assertTrue(sw.toString().contains("elem"));

        // readTree from different sources
        String json = "{\"name\":\"Test\"}";
        JsonNode nodeStr = mapper.readTree(json);
        Assert.assertEquals("Test", nodeStr.get("name").asText());

        JsonNode nodeBytes = mapper.readTree(json.getBytes("UTF-8"));
        Assert.assertEquals("Test", nodeBytes.get("name").asText());

        JsonNode nodeStream = mapper.readTree(new ByteArrayInputStream(json.getBytes("UTF-8")));
        Assert.assertEquals("Test", nodeStream.get("name").asText());

        JsonNode nodeReader = mapper.readTree(new StringReader(json));
        Assert.assertEquals("Test", nodeReader.get("name").asText());

        JsonParser jp = mapper.getFactory().createParser(json);
        JsonNode nodeParser = mapper.readTree(jp);
        Assert.assertEquals("Test", nodeParser.get("name").asText());

        File tmp = File.createTempFile("tree_test", ".json");
        tmp.deleteOnExit();
        mapper.writeValue(tmp, objNode);
        JsonNode nodeFile = mapper.readTree(tmp);
        Assert.assertEquals("value", nodeFile.get("key").asText());
        JsonNode nodeUrl = mapper.readTree(tmp.toURI().toURL());
        Assert.assertEquals("value", nodeUrl.get("key").asText());

        // treeAsTokens & treeToValue
        JsonParser tokens = mapper.treeAsTokens(nodeStr);
        Assert.assertNotNull(tokens);
        SimpleBean bean = mapper.treeToValue(nodeStr, SimpleBean.class);
        Assert.assertEquals("Test", bean.name);

        // Short cut: treeToValue on same type
        ObjectNode convertedObj = mapper.treeToValue(objNode, ObjectNode.class);
        Assert.assertSame(objNode, convertedObj);

        // valueToTree
        JsonNode convertedNode = mapper.valueToTree(new SimpleBean("TreeBean", 10));
        Assert.assertEquals("TreeBean", convertedNode.get("name").asText());
        Assert.assertNull(mapper.valueToTree(null));
    }

    @Test
    public void testReadTree_emptyAndNullInputs() throws Exception {
        JsonNode nullNode1 = mapper.readTree("");
        Assert.assertTrue(nullNode1.isNull());

        JsonParser jp = mapper.getFactory().createParser("");
        JsonNode nullNode2 = mapper.readTree(jp);
        Assert.assertNull(nullNode2);
    }

    // ==========================================
    // convertValue API tests
    // ==========================================

    @Test
    public void testConvertValue_variousTypes() {
        SimpleBean bean = new SimpleBean("Bob", 40);

        // same class (short-circuit path)
        SimpleBean same = mapper.convertValue(bean, SimpleBean.class);
        Assert.assertSame(bean, same);

        // null handling
        Assert.assertNull(mapper.convertValue(null, SimpleBean.class));
        Assert.assertNull(mapper.convertValue(null, new TypeReference<SimpleBean>() {}));
        Assert.assertNull(mapper.convertValue(null, mapper.constructType(SimpleBean.class)));

        // conversion to Map
        @SuppressWarnings("unchecked")
        Map<String, Object> map = mapper.convertValue(bean, Map.class);
        Assert.assertEquals("Bob", map.get("name"));
        Assert.assertEquals(40, map.get("age"));

        // TypeReference & JavaType overloads
        Map<String, Object> mapRef = mapper.convertValue(bean, new TypeReference<Map<String, Object>>() {});
        Assert.assertEquals("Bob", mapRef.get("name"));

        JavaType mapJavaType = mapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class);
        Map<String, Object> mapJT = mapper.convertValue(bean, mapJavaType);
        Assert.assertEquals("Bob", mapJT.get("name"));
    }

    // ==========================================
    // canSerialize & canDeserialize tests
    // ==========================================

    @Test
    public void testCanSerializeAndDeserialize() {
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class));
        AtomicReference<Throwable> cause = new AtomicReference<Throwable>();
        Assert.assertTrue(mapper.canSerialize(SimpleBean.class, cause));
        Assert.assertNull(cause.get());

        JavaType type = mapper.constructType(SimpleBean.class);
        Assert.assertTrue(mapper.canDeserialize(type));
        Assert.assertTrue(mapper.canDeserialize(type, cause));
        Assert.assertNull(cause.get());
    }

    // ==========================================
    // Serialization & Deserialization Edge Cases
    // ==========================================

    @Test
    public void testCloseableSerialization() throws Exception {
        mapper.enable(SerializationFeature.CLOSE_CLOSEABLE);
        CloseableBean cb = new CloseableBean("closeMe");
        String json = mapper.writeValueAsString(cb);
        Assert.assertTrue(json.contains("closeMe"));
        Assert.assertTrue(cb.closed);

        CloseableBean cb2 = new CloseableBean("closeMe2");
        StringWriter sw = new StringWriter();
        JsonGenerator g = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(g, cb2);
        Assert.assertTrue(cb2.closed);
    }

    @Test
    public void testRootWrappingSerializationAndDeserialization() throws Exception {
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);

        RootWrappedBean bean = new RootWrappedBean("root123");
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"wrapped\":"));

        RootWrappedBean read = mapper.readValue(json, RootWrappedBean.class);
        Assert.assertEquals("root123", read.id);
    }

    @Test(expected = JsonMappingException.class)
    public void testRootUnwrapping_mismatchedRootName_throwsException() throws Exception {
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        String json = "{\"wrongName\":{\"id\":\"123\"}}";
        mapper.readValue(json, RootWrappedBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testReadValue_emptyString_throwsJsonMappingException() throws Exception {
        mapper.readValue("", SimpleBean.class);
    }

    // ==========================================
    // ObjectWriter & ObjectReader Factory tests
    // ==========================================

    @SuppressWarnings("deprecation")
    @Test
    public void testObjectWriterAndReader_factories() {
        JavaType jt = mapper.constructType(SimpleBean.class);
        TypeReference<SimpleBean> tr = new TypeReference<SimpleBean>() {};

        // ObjectWriter factories
        Assert.assertNotNull(mapper.writer());
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
        Assert.assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.WRAP_ROOT_VALUE));
        Assert.assertNotNull(mapper.writer(new SimpleDateFormat("yyyy")));
        Assert.assertNotNull(mapper.writerWithView(Object.class));
        Assert.assertNotNull(mapper.writerFor(SimpleBean.class));
        Assert.assertNotNull(mapper.writerFor(tr));
        Assert.assertNotNull(mapper.writerFor(jt));
        Assert.assertNotNull(mapper.writer((PrettyPrinter) null));
        Assert.assertNotNull(mapper.writer(new DefaultPrettyPrinter()));
        Assert.assertNotNull(mapper.writerWithDefaultPrettyPrinter());
        Assert.assertNotNull(mapper.writer(new SimpleFilterProvider()));
        Assert.assertNotNull(mapper.writer(Base64Variants.MODIFIED_FOR_URL));
        Assert.assertNotNull(mapper.writer(new CharacterEscapes() {
            @Override public int[] getEscapeCodesForAscii() { return standardAsciiEscapesForJSON(); }
            @Override public SerializableString getEscapeSequence(int ch) { return new SerializedString(""); }
        }));
        Assert.assertNotNull(mapper.writer(ContextAttributes.getEmpty()));
        Assert.assertNotNull(mapper.writerWithType(SimpleBean.class));
        Assert.assertNotNull(mapper.writerWithType(tr));
        Assert.assertNotNull(mapper.writerWithType(jt));

        // ObjectReader factories
        Assert.assertNotNull(mapper.reader());
        Assert.assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertNotNull(mapper.readerForUpdating(new SimpleBean()));
        Assert.assertNotNull(mapper.readerFor(SimpleBean.class));
        Assert.assertNotNull(mapper.readerFor(tr));
        Assert.assertNotNull(mapper.readerFor(jt));
        Assert.assertNotNull(mapper.reader(JsonNodeFactory.instance));
        Assert.assertNotNull(mapper.reader(new InjectableValues.Std()));
        Assert.assertNotNull(mapper.readerWithView(Object.class));
        Assert.assertNotNull(mapper.reader(Base64Variants.MODIFIED_FOR_URL));
        Assert.assertNotNull(mapper.reader(ContextAttributes.getEmpty()));
        Assert.assertNotNull(mapper.reader(jt));
        Assert.assertNotNull(mapper.reader(SimpleBean.class));
        Assert.assertNotNull(mapper.reader(tr));
    }

    // ==========================================
    // Schema & Format Visitor tests
    // ==========================================

    @SuppressWarnings("deprecation")
    @Test
    public void testSchemaAndVisitor() throws Exception {
        Assert.assertNotNull(mapper.generateJsonSchema(SimpleBean.class));

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base();
        mapper.acceptJsonFormatVisitor(SimpleBean.class, visitor);
        mapper.acceptJsonFormatVisitor(mapper.constructType(SimpleBean.class), visitor);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_nullType_throwsException() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, new JsonFormatVisitorWrapper.Base());
    }
}
