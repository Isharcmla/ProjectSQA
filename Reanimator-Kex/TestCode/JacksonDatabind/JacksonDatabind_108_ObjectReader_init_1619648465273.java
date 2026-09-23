package com.fasterxml.jackson.databind;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_1619648465273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44486;
     Object term45042;

    public ObjectReader_init_1619648465273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43678 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term43788 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term43936 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term44018 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term44851 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term44932 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$ByteDeser"));
        Object term43557 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term44394 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term43678, term43678.getClass(), "_config", term43788);
        setField(term43678, term43678.getClass(), "_context", term43936);
        setField(term43678, term43678.getClass(), "_rootDeserializers", null);
        setField(term43678, term43678.getClass(), "_parserFactory", term44018);
        setField(term43678, term43678.getClass(), "_valueType", term44851);
        setField(term43678, term43678.getClass(), "_rootDeserializer", term44932);
        setField(term43678, term43678.getClass(), "_valueToUpdate", term44851);
        setField(term43678, term43678.getClass(), "_schema", term43557);
        setField(term43678, term43678.getClass(), "_injectableValues", term44394);
        term44486 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term44634 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term44716 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term44798 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term44486, term44486.getClass(), "_context", term44634);
        setField(term44486, term44486.getClass(), "_rootDeserializers", term44716);
        setField(term44486, term44486.getClass(), "_parserFactory", term44798);
        setField(term44486, term44486.getClass(), "_valueType", term44851);
        setField(term44486, term44486.getClass(), "_rootDeserializer", term44932);
        setField(term44486, term44486.getClass(), "_valueToUpdate", term44851);
        setField(term44486, term44486.getClass(), "_schema", term43557);
        setField(term44486, term44486.getClass(), "_injectableValues", null);
        term45042 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term45134 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term45042, term45042.getClass(), "_rootName", term45134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term44486;
        args[1] = term45042;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


