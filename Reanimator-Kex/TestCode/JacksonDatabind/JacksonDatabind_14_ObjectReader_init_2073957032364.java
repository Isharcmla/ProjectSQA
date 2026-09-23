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

public class ObjectReader_init_2073957032364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165883;
     Object term166163;
     Object term166269;

    public ObjectReader_init_2073957032364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165247 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term165357 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term165439 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term165545 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term165645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term165683 = newInstance(Class.forName("java.lang.Object"));
        Object term165791 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term165247, term165247.getClass(), "_config", term165357);
        setField(term165247, term165247.getClass(), "_context", null);
        setField(term165247, term165247.getClass(), "_rootDeserializers", term165439);
        setField(term165247, term165247.getClass(), "_parserFactory", null);
        setField(term165247, term165247.getClass(), "_rootNames", term165545);
        setField(term165247, term165247.getClass(), "_valueType", term165645);
        setField(term165247, term165247.getClass(), "_valueToUpdate", term165683);
        setField(term165247, term165247.getClass(), "_schema", null);
        setField(term165247, term165247.getClass(), "_injectableValues", term165791);
        term165883 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term165965 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term166071 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term165883, term165883.getClass(), "_deserializationContext", null);
        setField(term165883, term165883.getClass(), "_rootDeserializers", null);
        setField(term165883, term165883.getClass(), "_jsonFactory", term165965);
        setField(term165883, term165883.getClass(), "_rootNames", term166071);
        term166163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term166269 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
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
        args[0] = term165883;
        args[1] = null;
        args[2] = term166163;
        args[3] = term166269;
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


