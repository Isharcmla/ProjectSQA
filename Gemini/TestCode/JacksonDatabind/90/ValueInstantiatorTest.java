package com.fasterxml.jackson.databind.deser;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

import static org.junit.Assert.*;

public class ValueInstantiatorTest {

    private ObjectMapper mapper;
    private DeserializationContext ctxt;

    static class DefaultTestInstantiator extends ValueInstantiator {
    }

    static class NullClassInstantiator extends ValueInstantiator {
        @Override
        public Class<?> getValueClass() {
            return null;
        }
    }

    static class CustomBooleanInstantiator extends ValueInstantiator {
        @Override
        public boolean canCreateFromBoolean() {
            return true;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) {
            return Boolean.valueOf(value);
        }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        JsonParser parser = mapper.getFactory().createParser("{}");
        ctxt = ((DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), parser, mapper.getInjectableValues());
    }

    @Test
    public void testGetValueClass_default_returnsObjectClass() {
        ValueInstantiator instantiator = new DefaultTestInstantiator();
        assertEquals(Object.class, instantiator.getValueClass());
    }

    @Test
    public void testGetValueTypeDesc_default_returnsObjectClassName() {
        ValueInstantiator instantiator = new DefaultTestInstantiator();
        assertEquals(Object.class.getName(), instantiator.getValueTypeDesc());
    }

    @Test
    public void testGetValueTypeDesc_nullValueClass_returnsUnknown() {
        ValueInstantiator instantiator = new NullClassInstantiator();
        assertEquals("UNKNOWN", instantiator.getValueTypeDesc());
    }

    @Test
    public void testCanCreateCapabilities_default_allReturnFalse() {
        ValueInstantiator instantiator = new DefaultTestInstantiator();
        assertFalse(instantiator.canCreateFromString());
        assertFalse(instantiator.canCreateFromInt());
        assertFalse(instantiator.canCreateFromLong());
        assertFalse(instantiator.canCreateFromDouble());
        assertFalse(instantiator.canCreateFromBoolean());
        assertFalse(instantiator.canCreateUsingDefault());
        assertFalse(instantiator.canCreateUsingDelegate());
        assertFalse(instantiator.canCreateUsingArrayDelegate());
        assertFalse(instantiator.canCreateFromObjectWith());
        assertFalse(instantiator.canInstantiate());
    }

    @Test
    public void testCanCreateUsingDefault_withNonNullCreator_returnsTrue() {
        ValueInstantiator instantiator = new ValueInstantiator() {
            @Override
            public AnnotatedWithParams getDefaultCreator() {
                // Return a non-null dummy reference to simulate an existing default creator
                return new AnnotatedWithParams(null, null, null) {
                    @Override
                    public int getParameterCount() { return 0; }
                    @Override
                    public Class<?> getRawParameterType(int index) { return null; }
                    @Override
                    public JavaType getParameterType(int index) { return null; }
                    @Override
                    public Object call() { return null; }
                    @Override
                    public Object call(Object[] args) { return null; }
                    @Override
                    public Object call1(Object arg) { return null; }
                    @Override
                    public Class<?> getDeclaringClass() { return Object.class; }
                    @Override
                    public java.lang.reflect.Member getMember() { return null; }
                    @Override
                    public Object getValue(Object pojo) { return null; }
                    @Override
                    public void setValue(Object pojo, Object value) {}
                    @Override
                    public AnnotatedWithParams withAnnotations(com.fasterxml.jackson.databind.introspect.AnnotationMap fallback) { return this; }
                    @Override
                    public java.lang.reflect.AnnotatedElement getAnnotated() { return null; }
                    @Override
                    public int getModifiers() { return 0; }
                    @Override
                    public String getName() { return ""; }
                    @Override
                    public Class<?> getRawType() { return Object.class; }
                    @Override
                    public JavaType getType() { return null; }
                    @Override
                    public boolean equals(Object o) { return false; }
                    @Override
                    public int hashCode() { return 0; }
                    @Override
                    public String toString() { return ""; }
                };
            }
        };
        assertTrue(instantiator.canCreateUsingDefault());
        assertTrue(instantiator.canInstantiate());
    }

    @Test
    public void testCanInstantiate_whenIndividualCreatorsEnabled_returnsTrue() {
        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateUsingDefault() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateUsingDelegate() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromObjectWith() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromString() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromInt() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromLong() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromDouble() { return true; }
        }.canInstantiate());

        assertTrue(new ValueInstantiator() {
            @Override public boolean canCreateFromBoolean() { return true; }
        }.canInstantiate());
    }

    @Test
    public void testMetadataAndCreatorAccessors_default_returnsNull() {
        ValueInstantiator instantiator = new DefaultTestInstantiator();
        DeserializationConfig config = mapper.getDeserializationConfig();

        assertNull(instantiator.getFromObjectArguments(config));
        assertNull(instantiator.getDelegateType(config));
        assertNull(instantiator.getArrayDelegateType(config));
        assertNull(instantiator.getDefaultCreator());
        assertNull(instantiator.getDelegateCreator());
        assertNull(instantiator.getArrayDelegateCreator());
        assertNull(instantiator.getWithArgsCreator());
        assertNull(instantiator.getIncompleteParameter());
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDefault_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createUsingDefault(ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromObjectWith_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromObjectWith(ctxt, new Object[0]);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDelegate_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createUsingDelegate(ctxt, "delegate");
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingArrayDelegate_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createUsingArrayDelegate(ctxt, new Object[0]);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromInt_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromInt(ctxt, 42);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromLong_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromLong(ctxt, 42L);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromDouble_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromDouble(ctxt, 42.0);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromBoolean_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromBoolean(ctxt, true);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromString_unsupported_throwsException() throws IOException {
        new DefaultTestInstantiator().createFromString(ctxt, "test");
    }

    @Test
    public void testCreateFromString_booleanFallback_returnsBoolean() throws IOException {
        CustomBooleanInstantiator instantiator = new CustomBooleanInstantiator();

        Object resultTrue = instantiator.createFromString(ctxt, "true");
        assertEquals(Boolean.TRUE, resultTrue);

        Object resultTrueTrimmed = instantiator.createFromString(ctxt, "  true  ");
        assertEquals(Boolean.TRUE, resultTrueTrimmed);

        Object resultFalse = instantiator.createFromString(ctxt, "false");
        assertEquals(Boolean.FALSE, resultFalse);

        Object resultFalseTrimmed = instantiator.createFromString(ctxt, " false  ");
        assertEquals(Boolean.FALSE, resultFalseTrimmed);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromString_booleanFallbackInvalidValue_throwsException() throws IOException {
        CustomBooleanInstantiator instantiator = new CustomBooleanInstantiator();
        instantiator.createFromString(ctxt, "not_boolean");
    }

    @Test
    public void testCreateFromString_emptyStringAcceptedAsNull_returnsNull() throws IOException {
        ObjectMapper emptyOkMapper = new ObjectMapper();
        emptyOkMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        JsonParser parser = emptyOkMapper.getFactory().createParser("{}");
        DeserializationContext emptyCtxt = ((DefaultDeserializationContext) emptyOkMapper.getDeserializationContext())
                .createInstance(emptyOkMapper.getDeserializationConfig(), parser, emptyOkMapper.getInjectableValues());

        ValueInstantiator instantiator = new DefaultTestInstantiator();
        Object result = instantiator.createFromString(emptyCtxt, "");
        assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromString_emptyStringNotAcceptedAsNull_throwsException() throws IOException {
        ObjectMapper emptyNotOkMapper = new ObjectMapper();
        emptyNotOkMapper.disable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        JsonParser parser = emptyNotOkMapper.getFactory().createParser("{}");
        DeserializationContext emptyCtxt = ((DefaultDeserializationContext) emptyNotOkMapper.getDeserializationContext())
                .createInstance(emptyNotOkMapper.getDeserializationConfig(), parser, emptyNotOkMapper.getInjectableValues());

        ValueInstantiator instantiator = new DefaultTestInstantiator();
        instantiator.createFromString(emptyCtxt, "");
    }

    @Test
    public void testCreateFromObjectWithBuffer_delegatesToCreateFromObjectWithArgs() throws IOException {
        final Object[] receivedArgs = new Object[1];
        ValueInstantiator instantiator = new ValueInstantiator() {
            @Override
            public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
                receivedArgs[0] = args;
                return "created";
            }
        };

        PropertyValueBuffer buffer = new PropertyValueBuffer(ctxt.getParser(), ctxt, 0, null) {
            @Override
            public Object[] getParameters(SettableBeanProperty[] props) {
                return new Object[] { "arg1", 123 };
            }
        };

        Object result = instantiator.createFromObjectWith(ctxt, (SettableBeanProperty[]) null, buffer);
        assertEquals("created", result);
        assertNotNull(receivedArgs[0]);
        Object[] args = (Object[]) receivedArgs[0];
        assertEquals(2, args.length);
        assertEquals("arg1", args[0]);
        assertEquals(123, args[1]);
    }

    @Test
    public void testBase_classConstructor_returnsCorrectClassAndDesc() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(String.class);
        assertEquals(String.class, base.getValueClass());
        assertEquals(String.class.getName(), base.getValueTypeDesc());
    }

    @Test
    public void testBase_javaTypeConstructor_returnsCorrectClassAndDesc() {
        JavaType type = mapper.constructType(Integer.class);
        ValueInstantiator.Base base = new ValueInstantiator.Base(type);
        assertEquals(Integer.class, base.getValueClass());
        assertEquals(Integer.class.getName(), base.getValueTypeDesc());
    }
}
