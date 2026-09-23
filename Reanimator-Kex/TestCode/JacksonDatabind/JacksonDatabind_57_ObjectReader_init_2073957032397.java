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

public class ObjectReader_init_2073957032397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173757;
     Object term174097;
     Object term174203;

    public ObjectReader_init_2073957032397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term173555 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term173665 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term173555, term173555.getClass(), "_config", term173665);
        setField(term173555, term173555.getClass(), "_context", null);
        setField(term173555, term173555.getClass(), "_rootDeserializers", null);
        setField(term173555, term173555.getClass(), "_parserFactory", null);
        setField(term173555, term173555.getClass(), "_valueType", null);
        setField(term173555, term173555.getClass(), "_valueToUpdate", null);
        setField(term173555, term173555.getClass(), "_schema", null);
        setField(term173555, term173555.getClass(), "_injectableValues", null);
        setBooleanField(term173555, term173555.getClass(), "_unwrapRoot", false);
        term173757 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term173905 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term173987 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term173757, term173757.getClass(), "_deserializationContext", term173905);
        setField(term173757, term173757.getClass(), "_rootDeserializers", term173987);
        setField(term173757, term173757.getClass(), "_jsonFactory", null);
        term174097 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term174097, term174097.getClass(), "_rootName", null);
        setIntField(term174097, term174097.getClass(), "_deserFeatures", -1);
        term174203 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term173757;
        args[1] = term174097;
        args[2] = term174203;
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


