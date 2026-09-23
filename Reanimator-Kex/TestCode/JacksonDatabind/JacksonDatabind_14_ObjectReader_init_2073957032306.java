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
import java.lang.String;
import org.mockito.Mockito;

public class ObjectReader_init_2073957032306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104824;
     Object term105122;
     Object term105274;
     Object term105382;

    public ObjectReader_init_2073957032306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108286 = Class.forName((String) "com.fasterxml.jackson.databind.DeserializationFeature");
        Field term108285 = ((Class) term108286).getDeclaredField((String) "USE_BIG_DECIMAL_FOR_FLOATS");
        ((Field) term108285).setAccessible(true);
        Object enum7 = ((Field) term108285).get((Object) null);
        Object term104324 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term104434 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term104582 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term103574 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term104324, term104324.getClass(), "_config", term104434);
        setField(term104324, term104324.getClass(), "_context", term104582);
        setField(term104324, term104324.getClass(), "_rootDeserializers", null);
        setField(term104324, term104324.getClass(), "_parserFactory", null);
        setField(term104324, term104324.getClass(), "_rootNames", null);
        setField(term104324, term104324.getClass(), "_valueType", null);
        setField(term104324, term104324.getClass(), "_valueToUpdate", enum7);
        setField(term104324, term104324.getClass(), "_schema", term103574);
        setField(term104324, term104324.getClass(), "_injectableValues", null);
        setBooleanField(term104324, term104324.getClass(), "_unwrapRoot", false);
        term104824 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term104906 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term105012 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term104824, term104824.getClass(), "_deserializationContext", null);
        setField(term104824, term104824.getClass(), "_rootDeserializers", term104906);
        setField(term104824, term104824.getClass(), "_jsonFactory", null);
        setField(term104824, term104824.getClass(), "_rootNames", term105012);
        term105122 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term105122, term105122.getClass(), "_rootName", "READ_DATE_TIMESTAMPS_AS_NANOSECONDS                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        setIntField(term105122, term105122.getClass(), "_deserFeatures", -1);
        term105274 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term105382 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term104824;
        args[1] = term105122;
        args[2] = term105274;
        args[3] = null;
        args[4] = null;
        args[5] = term105382;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


