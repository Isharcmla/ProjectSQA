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

public class ObjectReader_init_2073957032391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166093;
     Object term166285;
     Object term166469;
     Object term166551;
     Object term165388;

    public ObjectReader_init_2073957032391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165519 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term165629 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term165777 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term165859 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term165963 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term166001 = newInstance(Class.forName("java.lang.Object"));
        setField(term165519, term165519.getClass(), "_config", term165629);
        setField(term165519, term165519.getClass(), "_context", term165777);
        setField(term165519, term165519.getClass(), "_rootDeserializers", term165859);
        setField(term165519, term165519.getClass(), "_parserFactory", null);
        setField(term165519, term165519.getClass(), "_valueType", term165963);
        setField(term165519, term165519.getClass(), "_valueToUpdate", term166001);
        setField(term165519, term165519.getClass(), "_schema", null);
        setField(term165519, term165519.getClass(), "_injectableValues", null);
        term166093 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term166175 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term166093, term166093.getClass(), "_deserializationContext", null);
        setField(term166093, term166093.getClass(), "_rootDeserializers", null);
        setField(term166093, term166093.getClass(), "_jsonFactory", term166175);
        term166285 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term166377 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term166285, term166285.getClass(), "_rootName", term166377);
        term166469 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term166551 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term165388 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term166093;
        args[1] = term166285;
        args[2] = term166469;
        args[3] = term166551;
        args[4] = term165388;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


