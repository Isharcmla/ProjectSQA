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

public class ObjectReader_init_2073957032378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183181;
     Object term183373;
     Object term183465;
     Object term183611;

    public ObjectReader_init_2073957032378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term182605 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term183222 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term183263 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term182875 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term182981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term183089 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term182605, term182605.getClass(), "_config", null);
        setField(term182605, term182605.getClass(), "_context", null);
        setField(term182605, term182605.getClass(), "_rootDeserializers", term183222);
        setField(term182605, term182605.getClass(), "_parserFactory", term183263);
        setField(term182605, term182605.getClass(), "_rootNames", term182875);
        setField(term182605, term182605.getClass(), "_valueType", term182981);
        setField(term182605, term182605.getClass(), "_valueToUpdate", null);
        setField(term182605, term182605.getClass(), "_schema", null);
        setField(term182605, term182605.getClass(), "_injectableValues", term183089);
        setBooleanField(term182605, term182605.getClass(), "_unwrapRoot", false);
        term183181 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term183181, term183181.getClass(), "_deserializationContext", null);
        setField(term183181, term183181.getClass(), "_rootDeserializers", term183222);
        setField(term183181, term183181.getClass(), "_jsonFactory", term183263);
        setField(term183181, term183181.getClass(), "_rootNames", null);
        term183373 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term183373, term183373.getClass(), "_rootName", null);
        setIntField(term183373, term183373.getClass(), "_deserFeatures", -1);
        term183465 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term183611 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term183181;
        args[1] = term183373;
        args[2] = term183465;
        args[3] = "";
        args[4] = null;
        args[5] = term183611;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


