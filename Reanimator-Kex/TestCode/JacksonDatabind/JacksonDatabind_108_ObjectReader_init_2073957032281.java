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

public class ObjectReader_init_2073957032281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51562;
     Object term51902;
     Object term52108;
     Object term52200;
     Object term50667;
     Object term52308;

    public ObjectReader_init_2073957032281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50798 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term50908 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51056 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term51138 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term51220 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term51324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term51362 = newInstance(Class.forName("java.lang.Object"));
        Object term50677 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term51470 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term50798, term50798.getClass(), "_config", term50908);
        setField(term50798, term50798.getClass(), "_context", term51056);
        setField(term50798, term50798.getClass(), "_rootDeserializers", term51138);
        setField(term50798, term50798.getClass(), "_parserFactory", term51220);
        setField(term50798, term50798.getClass(), "_valueType", term51324);
        setField(term50798, term50798.getClass(), "_valueToUpdate", term51362);
        setField(term50798, term50798.getClass(), "_schema", term50677);
        setField(term50798, term50798.getClass(), "_injectableValues", term51470);
        term51562 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term51710 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term51792 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term51562, term51562.getClass(), "_deserializationContext", term51710);
        setField(term51562, term51562.getClass(), "_rootDeserializers", term51792);
        setField(term51562, term51562.getClass(), "_jsonFactory", null);
        term51902 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51994 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term51902, term51902.getClass(), "_rootName", term51994);
        term52108 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term52200 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term50667 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term52308 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        Object[] args = new Object[6];
        args[0] = term51562;
        args[1] = term51902;
        args[2] = term52108;
        args[3] = term52200;
        args[4] = term50667;
        args[5] = term52308;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


