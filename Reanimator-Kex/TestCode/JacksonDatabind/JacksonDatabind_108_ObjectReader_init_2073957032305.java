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

public class ObjectReader_init_2073957032305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72655;
     Object term72913;
     Object term73019;

    public ObjectReader_init_2073957032305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72453 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term72563 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term72453, term72453.getClass(), "_config", term72563);
        setField(term72453, term72453.getClass(), "_context", null);
        setField(term72453, term72453.getClass(), "_rootDeserializers", null);
        setField(term72453, term72453.getClass(), "_parserFactory", null);
        setField(term72453, term72453.getClass(), "_valueType", null);
        setField(term72453, term72453.getClass(), "_valueToUpdate", null);
        setField(term72453, term72453.getClass(), "_schema", null);
        setField(term72453, term72453.getClass(), "_injectableValues", null);
        setBooleanField(term72453, term72453.getClass(), "_unwrapRoot", false);
        term72655 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term72803 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term72655, term72655.getClass(), "_deserializationContext", term72803);
        setField(term72655, term72655.getClass(), "_rootDeserializers", null);
        setField(term72655, term72655.getClass(), "_jsonFactory", null);
        term72913 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term72913, term72913.getClass(), "_rootName", null);
        setIntField(term72913, term72913.getClass(), "_deserFeatures", -1);
        term73019 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term72655;
        args[1] = term72913;
        args[2] = term73019;
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


