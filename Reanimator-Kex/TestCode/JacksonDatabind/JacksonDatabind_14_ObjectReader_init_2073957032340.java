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

public class ObjectReader_init_2073957032340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141432;
     Object term141782;
     Object term141880;
     Object term141986;

    public ObjectReader_init_2073957032340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141192 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term141302 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term141340 = newInstance(Class.forName("java.lang.Object"));
        setField(term141192, term141192.getClass(), "_config", term141302);
        setField(term141192, term141192.getClass(), "_context", null);
        setField(term141192, term141192.getClass(), "_rootDeserializers", null);
        setField(term141192, term141192.getClass(), "_parserFactory", null);
        setField(term141192, term141192.getClass(), "_rootNames", null);
        setField(term141192, term141192.getClass(), "_valueType", null);
        setField(term141192, term141192.getClass(), "_valueToUpdate", term141340);
        setField(term141192, term141192.getClass(), "_schema", null);
        setField(term141192, term141192.getClass(), "_injectableValues", null);
        setBooleanField(term141192, term141192.getClass(), "_unwrapRoot", false);
        term141432 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term141580 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term141672 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term141432, term141432.getClass(), "_deserializationContext", term141580);
        setField(term141432, term141432.getClass(), "_rootDeserializers", term141672);
        setField(term141432, term141432.getClass(), "_jsonFactory", null);
        setField(term141432, term141432.getClass(), "_rootNames", null);
        term141782 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term141782, term141782.getClass(), "_rootName", null);
        setIntField(term141782, term141782.getClass(), "_deserFeatures", -1);
        term141880 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term141986 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
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
        args[0] = term141432;
        args[1] = term141782;
        args[2] = term141880;
        args[3] = term141986;
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


