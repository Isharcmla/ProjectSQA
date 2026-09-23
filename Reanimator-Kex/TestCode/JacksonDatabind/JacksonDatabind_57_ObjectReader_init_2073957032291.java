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

public class ObjectReader_init_2073957032291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65186;
     Object term65378;
     Object term65576;
     Object term65658;
     Object term64487;

    public ObjectReader_init_2073957032291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64618 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term64728 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term64876 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term64958 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term65056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term65094 = newInstance(Class.forName("java.lang.Object"));
        setField(term64618, term64618.getClass(), "_config", term64728);
        setField(term64618, term64618.getClass(), "_context", term64876);
        setField(term64618, term64618.getClass(), "_rootDeserializers", term64958);
        setField(term64618, term64618.getClass(), "_parserFactory", null);
        setField(term64618, term64618.getClass(), "_valueType", term65056);
        setField(term64618, term64618.getClass(), "_valueToUpdate", term65094);
        setField(term64618, term64618.getClass(), "_schema", null);
        setField(term64618, term64618.getClass(), "_injectableValues", null);
        term65186 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term65268 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term65186, term65186.getClass(), "_deserializationContext", null);
        setField(term65186, term65186.getClass(), "_rootDeserializers", null);
        setField(term65186, term65186.getClass(), "_jsonFactory", term65268);
        term65378 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term65470 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term65378, term65378.getClass(), "_rootName", term65470);
        term65576 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term65658 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term64487 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term65186;
        args[1] = term65378;
        args[2] = term65576;
        args[3] = term65658;
        args[4] = term64487;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


