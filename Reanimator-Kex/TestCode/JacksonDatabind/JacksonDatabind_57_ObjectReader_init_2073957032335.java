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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106113;
     Object term106387;
     Object term106617;

    public ObjectReader_init_2073957032335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105601 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term105711 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term105793 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term105875 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term105913 = newInstance(Class.forName("java.lang.Object"));
        Object term105307 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term106021 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term105601, term105601.getClass(), "_config", term105711);
        setField(term105601, term105601.getClass(), "_context", null);
        setField(term105601, term105601.getClass(), "_rootDeserializers", term105793);
        setField(term105601, term105601.getClass(), "_parserFactory", term105875);
        setField(term105601, term105601.getClass(), "_valueType", null);
        setField(term105601, term105601.getClass(), "_valueToUpdate", term105913);
        setField(term105601, term105601.getClass(), "_schema", term105307);
        setField(term105601, term105601.getClass(), "_injectableValues", term106021);
        setBooleanField(term105601, term105601.getClass(), "_unwrapRoot", false);
        term106113 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term106195 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term106277 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term106113, term106113.getClass(), "_deserializationContext", null);
        setField(term106113, term106113.getClass(), "_rootDeserializers", term106195);
        setField(term106113, term106113.getClass(), "_jsonFactory", term106277);
        term106387 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term106479 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term106479, term106479.getClass(), "_namespace", null);
        setField(term106479, term106479.getClass(), "_simpleName", "");
        setField(term106387, term106387.getClass(), "_rootName", term106479);
        setIntField(term106387, term106387.getClass(), "_deserFeatures", -1);
        term106617 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term106113;
        args[1] = term106387;
        args[2] = term106617;
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


