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

public class ObjectReader_init_2073957032370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160345;
     Object term160619;
     Object term160849;

    public ObjectReader_init_2073957032370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term159913 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term160023 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term160171 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term160253 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term159913, term159913.getClass(), "_config", term160023);
        setField(term159913, term159913.getClass(), "_context", term160171);
        setField(term159913, term159913.getClass(), "_rootDeserializers", term160253);
        setField(term159913, term159913.getClass(), "_parserFactory", null);
        setField(term159913, term159913.getClass(), "_valueType", null);
        setField(term159913, term159913.getClass(), "_valueToUpdate", null);
        setField(term159913, term159913.getClass(), "_schema", null);
        setField(term159913, term159913.getClass(), "_injectableValues", null);
        setBooleanField(term159913, term159913.getClass(), "_unwrapRoot", false);
        term160345 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term160427 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term160509 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term160345, term160345.getClass(), "_deserializationContext", null);
        setField(term160345, term160345.getClass(), "_rootDeserializers", term160427);
        setField(term160345, term160345.getClass(), "_jsonFactory", term160509);
        term160619 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term160711 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term160711, term160711.getClass(), "_namespace", "");
        setField(term160619, term160619.getClass(), "_rootName", term160711);
        setIntField(term160619, term160619.getClass(), "_deserFeatures", -1);
        term160849 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term160345;
        args[1] = term160619;
        args[2] = term160849;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


