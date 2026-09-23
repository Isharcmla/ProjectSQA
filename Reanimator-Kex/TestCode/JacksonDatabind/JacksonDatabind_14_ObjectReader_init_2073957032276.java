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

public class ObjectReader_init_2073957032276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75251;
     Object term75591;
     Object term75691;

    public ObjectReader_init_2073957032276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74929 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term75077 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term75159 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term74929, term74929.getClass(), "_config", null);
        setField(term74929, term74929.getClass(), "_context", term75077);
        setField(term74929, term74929.getClass(), "_rootDeserializers", term75159);
        setField(term74929, term74929.getClass(), "_parserFactory", null);
        setField(term74929, term74929.getClass(), "_rootNames", null);
        setField(term74929, term74929.getClass(), "_valueType", null);
        setField(term74929, term74929.getClass(), "_valueToUpdate", null);
        setField(term74929, term74929.getClass(), "_schema", null);
        setField(term74929, term74929.getClass(), "_injectableValues", null);
        setBooleanField(term74929, term74929.getClass(), "_unwrapRoot", false);
        term75251 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term75399 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term75481 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term75251, term75251.getClass(), "_deserializationContext", term75399);
        setField(term75251, term75251.getClass(), "_rootDeserializers", term75481);
        setField(term75251, term75251.getClass(), "_jsonFactory", null);
        setField(term75251, term75251.getClass(), "_rootNames", null);
        term75591 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term75591, term75591.getClass(), "_rootName", null);
        setIntField(term75591, term75591.getClass(), "_deserFeatures", -1);
        term75691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term75251;
        args[1] = term75591;
        args[2] = term75691;
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


