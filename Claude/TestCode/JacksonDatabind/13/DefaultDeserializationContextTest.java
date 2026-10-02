package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;

public class DefaultDeserializationContextTest
{
    private ObjectMapper mapper;
    private DeserializerFactory factory;
    private DefaultDeserializationContext.Impl blueprint;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = BeanDeserializerFactory.instance;
        blueprint = new DefaultDeserializationContext.Impl(factory);
    }

    private DefaultDeserializationContext createRealContext(DeserializationConfig config) throws IOException {
        JsonParser jp = mapper.getFactory().createParser("{}");
        return blueprint.createInstance(config, jp, null);
    }

    /*
    /**********************************************************
    /* Simple test helper classes
    /**********************************************************
     */

    public static class DummyDeserializer extends JsonDeserializer<Object> {
        public DummyDeserializer() { }
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return null;
        }
    }

    public static class DummyKeyDeserializer extends KeyDeserializer {
        public DummyKeyDeserializer() { }
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) {
            return key;
        }
    }

    static class TestIdGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;

        @Override
        public Class<?> getScope() {
            return Object.class;
        }

        @Override
        public boolean canUseFor(ObjectIdGenerator<?> gen) {
            return true;
        }

        @Override
        public Object generateId(Object forPojo) {
            return forPojo;
        }

        @Override
        public ObjectIdGenerator<Object> forScope(Class<?> scope) {
            return this;
        }

        @Override
        public ObjectIdGenerator<Object> newForSerialization(Object context) {
            return this;
        }
    }

    /*
    /**********************************************************
    /* Constructor / factory method tests
    /**********************************************************
     */

    @Test
    public void testConstructor_withFactory_notNull() {
        assertNotNull(blueprint);
    }

    @Test
    public void testCopy_implClass_returnsNewInstance() {
        DefaultDeserializationContext copied = blueprint.copy();
        assertNotNull(copied);
        assertNotSame(blueprint, copied);
        assertTrue(copied instanceof DefaultDeserializationContext.Impl);
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_subclassNotOverriding_throwsException() {
        DefaultDeserializationContext ctx = new DefaultDeserializationContext(factory, null) {
            @Override
            public DefaultDeserializationContext with(DeserializerFactory f) {
                return this;
            }

            @Override
            public DefaultDeserializationContext createInstance(DeserializationConfig config,
                    JsonParser jp, InjectableValues values) {
                return this;
            }
        };
        ctx.copy();
    }

    @Test
    public void testWith_newFactory_returnsNewInstance() {
        DefaultDeserializationContext result = blueprint.with(factory);
        assertNotNull(result);
        assertNotSame(blueprint, result);
        assertTrue(result instanceof DefaultDeserializationContext.Impl);
    }

    @Test
    public void testCreateInstance_validArgs_returnsNewInstance() throws IOException {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JsonParser jp = mapper.getFactory().createParser("{}");
        DefaultDeserializationContext ctx = blueprint.createInstance(config, jp, null);
        assertNotNull(ctx);
        assertNotSame(blueprint, ctx);
    }

    /*
    /**********************************************************
    /* findObjectId tests
    /**********************************************************
     */

    @Test
    public void testFindObjectId_newId_returnsNewEntry() {
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        Object id = "first-id";

        ReadableObjectId roid = blueprint.findObjectId(id, gen, resolver);
        assertNotNull(roid);
    }

    @Test
    public void testFindObjectId_sameId_returnsSameEntry() {
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        Object id = "second-id";

        ReadableObjectId roid1 = blueprint.findObjectId(id, gen, resolver);
        ReadableObjectId roid2 = blueprint.findObjectId(id, gen, resolver);
        assertSame(roid1, roid2);
    }

    @Test
    public void testFindObjectId_existingResolverType_reusesResolver() {
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ObjectIdResolver resolverA = new SimpleObjectIdResolver();
        ObjectIdResolver resolverB = new SimpleObjectIdResolver();

        ReadableObjectId roid1 = blueprint.findObjectId("id-A", gen, resolverA);
        ReadableObjectId roid2 = blueprint.findObjectId("id-B", gen, resolverB);

        assertNotNull(roid1);
        assertNotNull(roid2);
        assertNotSame(roid1, roid2);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testFindObjectId_deprecatedTwoArgVersion_returnsEntry() {
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ReadableObjectId roid = blueprint.findObjectId("deprecated-id", gen);
        assertNotNull(roid);
    }

    /*
    /**********************************************************
    /* checkUnresolvedObjectId tests
    /**********************************************************
     */

    @Test
    public void testCheckUnresolvedObjectId_noObjectIds_noException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        // _objectIds is null initially - should simply return
        ctx.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_withObjectIdNoReferring_noException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ctx.findObjectId("some-id", gen, resolver);
        // no referring properties registered -> should not throw
        ctx.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_featureDisabled_noException() throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig()
                .without(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext ctx = createRealContext(config);
        ObjectIdGenerator<Object> gen = new TestIdGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        ctx.findObjectId("disabled-feature-id", gen, resolver);
        ctx.checkUnresolvedObjectId();
    }

    /*
    /**********************************************************
    /* deserializerInstance tests
    /**********************************************************
     */

    @Test
    public void testDeserializerInstance_nullDeserDef_returnsNull() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        JsonDeserializer<Object> result = ctx.deserializerInstance(null, null);
        assertNull(result);
    }

    @Test
    public void testDeserializerInstance_deserializerInstanceGiven_returnsSame() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        DummyDeserializer dummy = new DummyDeserializer();
        JsonDeserializer<Object> result = ctx.deserializerInstance(null, dummy);
        assertSame(dummy, result);
    }

    @Test
    public void testDeserializerInstance_classGiven_returnsNewInstance() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        JsonDeserializer<Object> result = ctx.deserializerInstance(null, DummyDeserializer.class);
        assertNotNull(result);
        assertTrue(result instanceof DummyDeserializer);
    }

    @Test
    public void testDeserializerInstance_noneClassGiven_returnsNull() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        JsonDeserializer<Object> result = ctx.deserializerInstance(null, JsonDeserializer.None.class);
        assertNull(result);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_invalidTypeString_throwsException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        ctx.deserializerInstance(null, "not a valid deser def");
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_classNotAssignable_throwsException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        ctx.deserializerInstance(null, String.class);
    }

    /*
    /**********************************************************
    /* keyDeserializerInstance tests
    /**********************************************************
     */

    @Test
    public void testKeyDeserializerInstance_nullDeserDef_returnsNull() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        KeyDeserializer result = ctx.keyDeserializerInstance(null, null);
        assertNull(result);
    }

    @Test
    public void testKeyDeserializerInstance_keyDeserializerInstanceGiven_returnsSame() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        DummyKeyDeserializer dummy = new DummyKeyDeserializer();
        KeyDeserializer result = ctx.keyDeserializerInstance(null, dummy);
        assertSame(dummy, result);
    }

    @Test
    public void testKeyDeserializerInstance_classGiven_returnsNewInstance() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        KeyDeserializer result = ctx.keyDeserializerInstance(null, DummyKeyDeserializer.class);
        assertNotNull(result);
        assertTrue(result instanceof DummyKeyDeserializer);
    }

    @Test
    public void testKeyDeserializerInstance_noneClassGiven_returnsNull() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        KeyDeserializer result = ctx.keyDeserializerInstance(null, KeyDeserializer.None.class);
        assertNull(result);
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_invalidTypeString_throwsException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        ctx.keyDeserializerInstance(null, "not a valid key deser def");
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_classNotAssignable_throwsException() throws Exception {
        DefaultDeserializationContext ctx = createRealContext(mapper.getDeserializationConfig());
        ctx.keyDeserializerInstance(null, String.class);
    }
}
