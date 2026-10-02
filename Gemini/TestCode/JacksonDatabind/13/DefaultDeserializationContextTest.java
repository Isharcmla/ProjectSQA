package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.UUID;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultDeserializationContextTest {

    private ObjectMapper _mapper;
    private DeserializationConfig _config;
    private JsonParser _parser;
    private InjectableValues _injectableValues;
    private DefaultDeserializationContext.Impl _context;

    @Before
    public void setUp() throws Exception {
        _mapper = new ObjectMapper();
        _config = _mapper.getDeserializationConfig();
        _parser = new JsonFactory().createParser("{}");
        _injectableValues = new InjectableValues.Std();
        _context = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
    }

    // =========================================================================
    // Stubs and Dummy Classes
    // =========================================================================

    public static class CustomTestDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }

    public static class ResolvableTestDeserializer extends JsonDeserializer<Object> implements ResolvableDeserializer {
        public boolean resolved = false;

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            this.resolved = true;
        }
    }

    public static class CustomKeyDeserializer extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    public static class ResolvableTestKeyDeserializer extends KeyDeserializer implements ResolvableDeserializer {
        public boolean resolved = false;

        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }

        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            this.resolved = true;
        }
    }

    public static class CustomResolverStub implements ObjectIdResolver {
        private final int _id;

        public CustomResolverStub() {
            this(0);
        }

        public CustomResolverStub(int id) {
            this._id = id;
        }

        @Override
        public void bindItem(ObjectIdGenerator.IdKey id, Object pojo) {}

        @Override
        public Object resolveId(ObjectIdGenerator.IdKey id) {
            return null;
        }

        @Override
        public ObjectIdResolver newForDeserialization(Object context) {
            return new CustomResolverStub(_id);
        }

        @Override
        public boolean canUseFor(ObjectIdResolver resolverType) {
            return resolverType != null && resolverType.getClass() == getClass();
        }
    }

    public static class SubclassedImplWithoutCopy extends DefaultDeserializationContext.Impl {
        private static final long serialVersionUID = 1L;

        public SubclassedImplWithoutCopy(DeserializerFactory df) {
            super(df);
        }
    }

    // =========================================================================
    // Tests for copy() and sub-classing
    // =========================================================================

    @Test
    public void testCopy_impl_returnsNewInstance() {
        DefaultDeserializationContext copy = _context.copy();
        Assert.assertNotNull(copy);
        Assert.assertNotSame(_context, copy);
        Assert.assertEquals(DefaultDeserializationContext.Impl.class, copy.getClass());
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_subclassNotOverriding_throwsIllegalStateException() {
        SubclassedImplWithoutCopy subContext = new SubclassedImplWithoutCopy(BeanDeserializerFactory.instance);
        subContext.copy();
    }

    // =========================================================================
    // Tests for Factory / Construction Methods
    // =========================================================================

    @Test
    public void testWith_customFactory_returnsNewContextWithFactory() {
        DeserializerFactory customFactory = new CustomDeserializerFactory(null);
        DefaultDeserializationContext ctxWithFactory = _context.with(customFactory);

        Assert.assertNotNull(ctxWithFactory);
        Assert.assertSame(customFactory, ctxWithFactory._factory);
    }

    @Test
    public void testCreateInstance_validParameters_createsUsableContext() {
        DefaultDeserializationContext instance = _context.createInstance(_config, _parser, _injectableValues);
        Assert.assertNotNull(instance);
        Assert.assertSame(_config, instance.getConfig());
        Assert.assertSame(_parser, instance.getParser());
    }

    // =========================================================================
    // Tests for findObjectId()
    // =========================================================================

    @Test
    public void testFindObjectId_newId_createsAndCachesReadableObjectId() {
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();

        ReadableObjectId roid1 = _context.findObjectId(1, gen, resolver);
        Assert.assertNotNull(roid1);
        Assert.assertEquals(1, roid1.getKey().key);

        // Fetching again with identical key returns cached instance
        ReadableObjectId roid2 = _context.findObjectId(1, gen, resolver);
        Assert.assertSame(roid1, roid2);
    }

    @Test
    public void testFindObjectId_multipleResolvers_reusesMatchingResolver() {
        ObjectIdGenerator<UUID> gen = new ObjectIdGenerators.UUIDGenerator();
        CustomResolverStub resolverType1 = new CustomResolverStub(1);
        CustomResolverStub resolverType2 = new CustomResolverStub(2);

        ReadableObjectId roid1 = _context.findObjectId(UUID.randomUUID(), gen, resolverType1);
        ReadableObjectId roid2 = _context.findObjectId(UUID.randomUUID(), gen, resolverType2);

        Assert.assertNotNull(roid1);
        Assert.assertNotNull(roid2);
        Assert.assertNotSame(roid1, roid2);
    }

    @Test
    public void testFindObjectId_deprecatedMethod_usesSimpleObjectIdResolver() {
        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ReadableObjectId roid = _context.findObjectId(100, gen);

        Assert.assertNotNull(roid);
        Assert.assertEquals(100, roid.getKey().key);
    }

    // =========================================================================
    // Tests for checkUnresolvedObjectId()
    // =========================================================================

    @Test
    public void testCheckUnresolvedObjectId_noObjectIds_doesNothing() throws UnresolvedForwardReference {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ctx.checkUnresolvedObjectId(); // _objectIds is null
    }

    @Test
    public void testCheckUnresolvedObjectId_featureDisabled_doesNotThrow() throws UnresolvedForwardReference {
        DeserializationConfig disabledConfig = _config.without(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext ctx = _context.createInstance(disabledConfig, _parser, _injectableValues);

        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ReadableObjectId roid = ctx.findObjectId(1, gen);

        roid.appendReferring(new Referring(null, String.class) {
            @Override
            public void handleResolvedId(Object id, Object value) throws IOException {}
        });

        // Should return silently because feature is disabled
        ctx.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_noReferringProperties_doesNotThrow() throws UnresolvedForwardReference {
        DeserializationConfig enabledConfig = _config.with(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext ctx = _context.createInstance(enabledConfig, _parser, _injectableValues);

        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ctx.findObjectId(1, gen);

        // Has an entry in _objectIds, but roid.hasReferringProperties() is false
        ctx.checkUnresolvedObjectId();
    }

    @Test(expected = UnresolvedForwardReference.class)
    public void testCheckUnresolvedObjectId_withUnresolvedReferences_throwsException() throws UnresolvedForwardReference {
        DeserializationConfig enabledConfig = _config.with(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext ctx = _context.createInstance(enabledConfig, _parser, _injectableValues);

        ObjectIdGenerator<Integer> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ReadableObjectId roid = ctx.findObjectId(123, gen);

        roid.appendReferring(new Referring(null, (Class<?>) String.class) {
            @Override
            public JsonLocation getLocation() {
                return new JsonLocation("src", 0, 1, 1);
            }

            @Override
            public void handleResolvedId(Object id, Object value) throws IOException {}
        });

        ctx.checkUnresolvedObjectId();
    }

    // =========================================================================
    // Tests for deserializerInstance()
    // =========================================================================

    @Test
    public void testDeserializerInstance_nullDefinition_returnsNull() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        Assert.assertNull(ctx.deserializerInstance(null, null));
    }

    @Test
    public void testDeserializerInstance_existingInstance_returnsSameInstance() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        CustomTestDeserializer deser = new CustomTestDeserializer();

        JsonDeserializer<Object> result = ctx.deserializerInstance(null, deser);
        Assert.assertSame(deser, result);
    }

    @Test
    public void testDeserializerInstance_resolvableInstance_invokesResolve() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ResolvableTestDeserializer deser = new ResolvableTestDeserializer();

        Assert.assertFalse(deser.resolved);
        JsonDeserializer<Object> result = ctx.deserializerInstance(null, deser);
        Assert.assertSame(deser, result);
        Assert.assertTrue(deser.resolved);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_invalidType_throwsIllegalStateException() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ctx.deserializerInstance(null, "NotAClassOrDeserializer");
    }

    @Test
    public void testDeserializerInstance_noneOrBogusClass_returnsNull() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);

        Assert.assertNull(ctx.deserializerInstance(null, JsonDeserializer.None.class));
        Assert.assertNull(ctx.deserializerInstance(null, NoClass.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_nonDeserializerClass_throwsIllegalStateException() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ctx.deserializerInstance(null, String.class);
    }

    @Test
    public void testDeserializerInstance_deserializerClass_createsInstance() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        JsonDeserializer<Object> deser = ctx.deserializerInstance(null, CustomTestDeserializer.class);

        Assert.assertNotNull(deser);
        Assert.assertEquals(CustomTestDeserializer.class, deser.getClass());
    }

    @Test
    public void testDeserializerInstance_resolvableClass_createsAndResolves() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        JsonDeserializer<Object> deser = ctx.deserializerInstance(null, ResolvableTestDeserializer.class);

        Assert.assertNotNull(deser);
        Assert.assertTrue(((ResolvableTestDeserializer) deser).resolved);
    }

    @Test
    public void testDeserializerInstance_handlerInstantiator_returnsCustomInstance() throws JsonMappingException {
        final CustomTestDeserializer customInstance = new CustomTestDeserializer();
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) {
                return (deserClass == CustomTestDeserializer.class) ? customInstance : null;
            }

            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) {
                return null;
            }

            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                return null;
            }

            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) {
                return null;
            }

            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return null;
            }
        };

        DeserializationConfig cfgWithHi = _config.with(hi);
        DefaultDeserializationContext ctx = _context.createInstance(cfgWithHi, _parser, _injectableValues);

        JsonDeserializer<Object> deser = ctx.deserializerInstance(null, CustomTestDeserializer.class);
        Assert.assertSame(customInstance, deser);
    }

    // =========================================================================
    // Tests for keyDeserializerInstance()
    // =========================================================================

    @Test
    public void testKeyDeserializerInstance_nullDefinition_returnsNull() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        Assert.assertNull(ctx.keyDeserializerInstance(null, null));
    }

    @Test
    public void testKeyDeserializerInstance_existingInstance_returnsSameInstance() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        CustomKeyDeserializer deser = new CustomKeyDeserializer();

        KeyDeserializer result = ctx.keyDeserializerInstance(null, deser);
        Assert.assertSame(deser, result);
    }

    @Test
    public void testKeyDeserializerInstance_resolvableInstance_invokesResolve() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ResolvableTestKeyDeserializer deser = new ResolvableTestKeyDeserializer();

        Assert.assertFalse(deser.resolved);
        KeyDeserializer result = ctx.keyDeserializerInstance(null, deser);
        Assert.assertSame(deser, result);
        Assert.assertTrue(deser.resolved);
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_invalidType_throwsIllegalStateException() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ctx.keyDeserializerInstance(null, 12345);
    }

    @Test
    public void testKeyDeserializerInstance_noneOrBogusClass_returnsNull() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);

        Assert.assertNull(ctx.keyDeserializerInstance(null, KeyDeserializer.None.class));
        Assert.assertNull(ctx.keyDeserializerInstance(null, NoClass.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_nonKeyDeserializerClass_throwsIllegalStateException() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        ctx.keyDeserializerInstance(null, Integer.class);
    }

    @Test
    public void testKeyDeserializerInstance_keyDeserializerClass_createsInstance() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        KeyDeserializer deser = ctx.keyDeserializerInstance(null, CustomKeyDeserializer.class);

        Assert.assertNotNull(deser);
        Assert.assertEquals(CustomKeyDeserializer.class, deser.getClass());
    }

    @Test
    public void testKeyDeserializerInstance_resolvableClass_createsAndResolves() throws JsonMappingException {
        DefaultDeserializationContext ctx = _context.createInstance(_config, _parser, _injectableValues);
        KeyDeserializer deser = ctx.keyDeserializerInstance(null, ResolvableTestKeyDeserializer.class);

        Assert.assertNotNull(deser);
        Assert.assertTrue(((ResolvableTestKeyDeserializer) deser).resolved);
    }

    @Test
    public void testKeyDeserializerInstance_handlerInstantiator_returnsCustomInstance() throws JsonMappingException {
        final CustomKeyDeserializer customInstance = new CustomKeyDeserializer();
        HandlerInstantiator hi = new HandlerInstantiator() {
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> deserClass) {
                return null;
            }

            @Override
            public KeyDeserializer keyDeserializerInstance(DeserializationConfig config, Annotated annotated, Class<?> keyDeserClass) {
                return (keyDeserClass == CustomKeyDeserializer.class) ? customInstance : null;
            }

            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config, Annotated annotated, Class<?> serClass) {
                return null;
            }

            @Override
            public TypeResolverBuilder<?> typeResolverBuilderInstance(MapperConfig<?> config, Annotated annotated, Class<?> builderClass) {
                return null;
            }

            @Override
            public TypeIdResolver typeIdResolverInstance(MapperConfig<?> config, Annotated annotated, Class<?> resolverClass) {
                return null;
            }
        };

        DeserializationConfig cfgWithHi = _config.with(hi);
        DefaultDeserializationContext ctx = _context.createInstance(cfgWithHi, _parser, _injectableValues);

        KeyDeserializer deser = ctx.keyDeserializerInstance(null, CustomKeyDeserializer.class);
        Assert.assertSame(customInstance, deser);
    }

    // Custom DeserializerFactory stub for testWith
    private static class CustomDeserializerFactory extends BasicDeserializerFactory {
        private static final long serialVersionUID = 1L;

        protected CustomDeserializerFactory(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        public DeserializerFactory withConfig(com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig config) {
            return this;
        }

        @Override
        public JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException {
            return type;
        }

        @Override
        public ValueInstantiator findValueInstantiator(DeserializationContext ctxt, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc, Class<?> builderClass) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createArrayDeserializer(DeserializationContext ctxt, com.fasterxml.jackson.databind.type.ArrayType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext ctxt, com.fasterxml.jackson.databind.type.CollectionType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext ctxt, com.fasterxml.jackson.databind.type.CollectionLikeType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createMapDeserializer(DeserializationContext ctxt, com.fasterxml.jackson.databind.type.MapType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext ctxt, com.fasterxml.jackson.databind.type.MapLikeType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig config, JavaType type, BeanDescription beanDesc) throws JsonMappingException {
            return null;
        }

        @Override
        public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) throws JsonMappingException {
            return null;
        }
    }
}
