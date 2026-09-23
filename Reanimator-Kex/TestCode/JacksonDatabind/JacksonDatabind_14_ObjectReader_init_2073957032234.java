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
import java.lang.IllegalArgumentException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectReader_init_2073957032234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37212;
     Object term37396;
     Object term37492;
     Object term37640;

    public ObjectReader_init_2073957032234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36972 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term37286 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term36972, term36972.getClass(), "_config", null);
        setField(term36972, term36972.getClass(), "_context", term37286);
        setField(term36972, term36972.getClass(), "_rootDeserializers", null);
        setField(term36972, term36972.getClass(), "_parserFactory", null);
        setField(term36972, term36972.getClass(), "_rootNames", null);
        setField(term36972, term36972.getClass(), "_valueType", null);
        setField(term36972, term36972.getClass(), "_valueToUpdate", term37286);
        term37212 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term37212, term37212.getClass(), "_deserializationContext", term37286);
        setField(term37212, term37212.getClass(), "_rootDeserializers", null);
        setField(term37212, term37212.getClass(), "_jsonFactory", null);
        setField(term37212, term37212.getClass(), "_rootNames", null);
        term37396 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term37492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term37640 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
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
        args[0] = term37212;
        args[1] = term37396;
        args[2] = term37492;
        args[3] = term37640;
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


