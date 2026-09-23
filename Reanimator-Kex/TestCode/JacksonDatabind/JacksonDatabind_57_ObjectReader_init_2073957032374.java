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

public class ObjectReader_init_2073957032374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145919;
     Object term146177;
     Object term146413;

    public ObjectReader_init_2073957032374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145827 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term145827, term145827.getClass(), "_config", null);
        setField(term145827, term145827.getClass(), "_context", null);
        setField(term145827, term145827.getClass(), "_rootDeserializers", null);
        setField(term145827, term145827.getClass(), "_parserFactory", null);
        setField(term145827, term145827.getClass(), "_valueType", null);
        setField(term145827, term145827.getClass(), "_valueToUpdate", null);
        setField(term145827, term145827.getClass(), "_schema", null);
        setField(term145827, term145827.getClass(), "_injectableValues", null);
        setBooleanField(term145827, term145827.getClass(), "_unwrapRoot", false);
        term145919 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term146067 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term145919, term145919.getClass(), "_deserializationContext", term146067);
        setField(term145919, term145919.getClass(), "_rootDeserializers", null);
        setField(term145919, term145919.getClass(), "_jsonFactory", null);
        term146177 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term146269 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term146269, term146269.getClass(), "_namespace", "");
        setField(term146177, term146177.getClass(), "_rootName", term146269);
        setIntField(term146177, term146177.getClass(), "_deserFeatures", -1);
        term146413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term145919;
        args[1] = term146177;
        args[2] = term146413;
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


