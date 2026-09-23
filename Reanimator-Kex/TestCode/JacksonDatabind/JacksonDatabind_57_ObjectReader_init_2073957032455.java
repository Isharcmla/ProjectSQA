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

public class ObjectReader_init_2073957032455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245025;
     Object term245283;
     Object term245519;

    public ObjectReader_init_2073957032455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term244741 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term244851 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term244933 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term244741, term244741.getClass(), "_config", term244851);
        setField(term244741, term244741.getClass(), "_context", null);
        setField(term244741, term244741.getClass(), "_rootDeserializers", term244933);
        setField(term244741, term244741.getClass(), "_parserFactory", null);
        setField(term244741, term244741.getClass(), "_valueType", null);
        setField(term244741, term244741.getClass(), "_valueToUpdate", null);
        setField(term244741, term244741.getClass(), "_schema", null);
        setField(term244741, term244741.getClass(), "_injectableValues", null);
        setBooleanField(term244741, term244741.getClass(), "_unwrapRoot", false);
        term245025 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term245173 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term245025, term245025.getClass(), "_deserializationContext", term245173);
        setField(term245025, term245025.getClass(), "_rootDeserializers", null);
        setField(term245025, term245025.getClass(), "_jsonFactory", null);
        term245283 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term245375 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term245375, term245375.getClass(), "_namespace", null);
        setField(term245375, term245375.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term245283, term245283.getClass(), "_rootName", term245375);
        setIntField(term245283, term245283.getClass(), "_deserFeatures", -1);
        term245519 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term245025;
        args[1] = term245283;
        args[2] = term245519;
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


