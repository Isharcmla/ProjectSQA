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

public class ObjectReader_init_2073957032435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217105;
     Object term217363;
     Object term217455;

    public ObjectReader_init_2073957032435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term216755 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term216865 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term217013 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term216755, term216755.getClass(), "_config", term216865);
        setField(term216755, term216755.getClass(), "_context", term217013);
        setField(term216755, term216755.getClass(), "_rootDeserializers", null);
        setField(term216755, term216755.getClass(), "_parserFactory", null);
        setField(term216755, term216755.getClass(), "_valueType", null);
        setField(term216755, term216755.getClass(), "_valueToUpdate", null);
        setField(term216755, term216755.getClass(), "_schema", null);
        setField(term216755, term216755.getClass(), "_injectableValues", null);
        setBooleanField(term216755, term216755.getClass(), "_unwrapRoot", false);
        term217105 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term217253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term217105, term217105.getClass(), "_deserializationContext", term217253);
        setField(term217105, term217105.getClass(), "_rootDeserializers", null);
        setField(term217105, term217105.getClass(), "_jsonFactory", null);
        term217363 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term217363, term217363.getClass(), "_rootName", null);
        setIntField(term217363, term217363.getClass(), "_deserFeatures", -1);
        term217455 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term217105;
        args[1] = term217363;
        args[2] = term217455;
        args[3] = "";
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


