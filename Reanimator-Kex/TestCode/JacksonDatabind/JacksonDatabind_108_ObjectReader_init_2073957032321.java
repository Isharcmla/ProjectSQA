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

public class ObjectReader_init_2073957032321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90268;
     Object term90700;
     Object term90792;
     Object term89577;
     Object term90846;

    public ObjectReader_init_2073957032321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89702 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term89812 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term89894 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term89976 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term90068 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term90846 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        Object term89586 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term89702, term89702.getClass(), "_config", term89812);
        setField(term89702, term89702.getClass(), "_context", null);
        setField(term89702, term89702.getClass(), "_rootDeserializers", term89894);
        setField(term89702, term89702.getClass(), "_parserFactory", term89976);
        setField(term89702, term89702.getClass(), "_valueType", term90068);
        setField(term89702, term89702.getClass(), "_valueToUpdate", term90846);
        setField(term89702, term89702.getClass(), "_schema", term89586);
        setField(term89702, term89702.getClass(), "_injectableValues", null);
        term90268 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term90416 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term90498 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term90580 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term90268, term90268.getClass(), "_deserializationContext", term90416);
        setField(term90268, term90268.getClass(), "_rootDeserializers", term90498);
        setField(term90268, term90268.getClass(), "_jsonFactory", term90580);
        term90700 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        term90792 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term89577 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term90268;
        args[1] = null;
        args[2] = term90700;
        args[3] = term90792;
        args[4] = term89577;
        args[5] = term90846;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


