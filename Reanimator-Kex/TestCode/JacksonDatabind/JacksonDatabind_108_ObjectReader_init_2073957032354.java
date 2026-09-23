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

public class ObjectReader_init_2073957032354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137488;
     Object term137828;
     Object term138056;

    public ObjectReader_init_2073957032354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term137286 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term137396 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term137286, term137286.getClass(), "_config", term137396);
        setField(term137286, term137286.getClass(), "_context", null);
        setField(term137286, term137286.getClass(), "_rootDeserializers", null);
        setField(term137286, term137286.getClass(), "_parserFactory", null);
        setField(term137286, term137286.getClass(), "_valueType", null);
        setField(term137286, term137286.getClass(), "_valueToUpdate", null);
        setField(term137286, term137286.getClass(), "_schema", null);
        setField(term137286, term137286.getClass(), "_injectableValues", null);
        setBooleanField(term137286, term137286.getClass(), "_unwrapRoot", false);
        term137488 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term137636 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term137718 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term137488, term137488.getClass(), "_deserializationContext", term137636);
        setField(term137488, term137488.getClass(), "_rootDeserializers", term137718);
        setField(term137488, term137488.getClass(), "_jsonFactory", null);
        term137828 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term137920 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term137920, term137920.getClass(), "_namespace", null);
        setField(term137920, term137920.getClass(), "_simpleName", "");
        setField(term137828, term137828.getClass(), "_rootName", term137920);
        setIntField(term137828, term137828.getClass(), "_deserFeatures", -1);
        term138056 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term137488;
        args[1] = term137828;
        args[2] = term138056;
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


