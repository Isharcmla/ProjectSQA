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

public class ObjectReader_init_2073957032264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61128;
     Object term61238;
     Object term61352;

    public ObjectReader_init_2073957032264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60778 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term60888 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term61036 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term60778, term60778.getClass(), "_config", term60888);
        setField(term60778, term60778.getClass(), "_context", term61036);
        setField(term60778, term60778.getClass(), "_rootDeserializers", null);
        setField(term60778, term60778.getClass(), "_parserFactory", null);
        setField(term60778, term60778.getClass(), "_rootNames", null);
        setField(term60778, term60778.getClass(), "_valueType", null);
        setField(term60778, term60778.getClass(), "_valueToUpdate", null);
        setField(term60778, term60778.getClass(), "_schema", null);
        setField(term60778, term60778.getClass(), "_injectableValues", null);
        setBooleanField(term60778, term60778.getClass(), "_unwrapRoot", false);
        term61128 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term61128, term61128.getClass(), "_deserializationContext", null);
        setField(term61128, term61128.getClass(), "_rootDeserializers", null);
        setField(term61128, term61128.getClass(), "_jsonFactory", null);
        setField(term61128, term61128.getClass(), "_rootNames", null);
        term61238 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term61238, term61238.getClass(), "_rootName", null);
        setIntField(term61238, term61238.getClass(), "_deserFeatures", -1);
        term61352 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term61128;
        args[1] = term61238;
        args[2] = term61352;
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


