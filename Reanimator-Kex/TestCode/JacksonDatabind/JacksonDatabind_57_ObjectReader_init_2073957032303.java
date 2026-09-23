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

public class ObjectReader_init_2073957032303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74749;
     Object term75007;
     Object term75111;

    public ObjectReader_init_2073957032303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74399 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term74509 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term74657 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term74399, term74399.getClass(), "_config", term74509);
        setField(term74399, term74399.getClass(), "_context", term74657);
        setField(term74399, term74399.getClass(), "_rootDeserializers", null);
        setField(term74399, term74399.getClass(), "_parserFactory", null);
        setField(term74399, term74399.getClass(), "_valueType", null);
        setField(term74399, term74399.getClass(), "_valueToUpdate", null);
        setField(term74399, term74399.getClass(), "_schema", null);
        setField(term74399, term74399.getClass(), "_injectableValues", null);
        setBooleanField(term74399, term74399.getClass(), "_unwrapRoot", false);
        term74749 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term74897 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term74749, term74749.getClass(), "_deserializationContext", term74897);
        setField(term74749, term74749.getClass(), "_rootDeserializers", null);
        setField(term74749, term74749.getClass(), "_jsonFactory", null);
        term75007 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term75007, term75007.getClass(), "_rootName", null);
        setIntField(term75007, term75007.getClass(), "_deserFeatures", -1);
        term75111 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term74749;
        args[1] = term75007;
        args[2] = term75111;
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


