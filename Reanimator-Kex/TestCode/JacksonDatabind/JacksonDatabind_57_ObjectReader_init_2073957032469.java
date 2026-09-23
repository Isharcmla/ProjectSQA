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

public class ObjectReader_init_2073957032469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263672;
     Object term264012;
     Object term264248;

    public ObjectReader_init_2073957032469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term263322 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term263432 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term263580 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term263322, term263322.getClass(), "_config", term263432);
        setField(term263322, term263322.getClass(), "_context", term263580);
        setField(term263322, term263322.getClass(), "_rootDeserializers", null);
        setField(term263322, term263322.getClass(), "_parserFactory", null);
        setField(term263322, term263322.getClass(), "_valueType", null);
        setField(term263322, term263322.getClass(), "_valueToUpdate", null);
        setField(term263322, term263322.getClass(), "_schema", null);
        setField(term263322, term263322.getClass(), "_injectableValues", null);
        setBooleanField(term263322, term263322.getClass(), "_unwrapRoot", false);
        term263672 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term263820 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term263902 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term263672, term263672.getClass(), "_deserializationContext", term263820);
        setField(term263672, term263672.getClass(), "_rootDeserializers", term263902);
        setField(term263672, term263672.getClass(), "_jsonFactory", null);
        term264012 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term264104 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term264104, term264104.getClass(), "_namespace", null);
        setField(term264104, term264104.getClass(), "_simpleName", "");
        setField(term264012, term264012.getClass(), "_rootName", term264104);
        setIntField(term264012, term264012.getClass(), "_deserFeatures", -1);
        term264248 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term263672;
        args[1] = term264012;
        args[2] = term264248;
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


