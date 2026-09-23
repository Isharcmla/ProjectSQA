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

public class ObjectReader_init_2073957032366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168113;
     Object term168518;
     Object term168662;
     Object term168762;

    public ObjectReader_init_2073957032366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term167613 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term167761 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term167843 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term168302 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term168021 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term167339 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term167613, term167613.getClass(), "_config", null);
        setField(term167613, term167613.getClass(), "_context", term167761);
        setField(term167613, term167613.getClass(), "_rootDeserializers", term167843);
        setField(term167613, term167613.getClass(), "_parserFactory", term168302);
        setField(term167613, term167613.getClass(), "_rootNames", null);
        setField(term167613, term167613.getClass(), "_valueType", term168021);
        setField(term167613, term167613.getClass(), "_valueToUpdate", null);
        setField(term167613, term167613.getClass(), "_schema", term167339);
        setField(term167613, term167613.getClass(), "_injectableValues", null);
        setBooleanField(term167613, term167613.getClass(), "_unwrapRoot", false);
        term168113 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term168261 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term168408 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term168113, term168113.getClass(), "_deserializationContext", term168261);
        setField(term168113, term168113.getClass(), "_rootDeserializers", null);
        setField(term168113, term168113.getClass(), "_jsonFactory", term168302);
        setField(term168113, term168113.getClass(), "_rootNames", term168408);
        term168518 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term168518, term168518.getClass(), "_rootName", "");
        setIntField(term168518, term168518.getClass(), "_deserFeatures", -1);
        term168662 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term168762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term168113;
        args[1] = term168518;
        args[2] = term168662;
        args[3] = term168762;
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


