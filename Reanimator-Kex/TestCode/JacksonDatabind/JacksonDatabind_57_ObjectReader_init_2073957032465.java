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

public class ObjectReader_init_2073957032465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258683;
     Object term259023;
     Object term259115;

    public ObjectReader_init_2073957032465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term258481 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term258591 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term258481, term258481.getClass(), "_config", term258591);
        setField(term258481, term258481.getClass(), "_context", null);
        setField(term258481, term258481.getClass(), "_rootDeserializers", null);
        setField(term258481, term258481.getClass(), "_parserFactory", null);
        setField(term258481, term258481.getClass(), "_valueType", null);
        setField(term258481, term258481.getClass(), "_valueToUpdate", null);
        setField(term258481, term258481.getClass(), "_schema", null);
        setField(term258481, term258481.getClass(), "_injectableValues", null);
        setBooleanField(term258481, term258481.getClass(), "_unwrapRoot", false);
        term258683 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term258831 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term258913 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term258683, term258683.getClass(), "_deserializationContext", term258831);
        setField(term258683, term258683.getClass(), "_rootDeserializers", term258913);
        setField(term258683, term258683.getClass(), "_jsonFactory", null);
        term259023 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term259023, term259023.getClass(), "_rootName", null);
        setIntField(term259023, term259023.getClass(), "_deserFeatures", -1);
        term259115 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term258683;
        args[1] = term259023;
        args[2] = term259115;
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


