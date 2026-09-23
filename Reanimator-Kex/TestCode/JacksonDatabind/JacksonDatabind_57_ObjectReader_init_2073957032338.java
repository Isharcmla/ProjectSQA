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

public class ObjectReader_init_2073957032338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107668;
     Object term107888;

    public ObjectReader_init_2073957032338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107172 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term107282 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term107364 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term107446 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term107538 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term107576 = newInstance(Class.forName("java.lang.Object"));
        setField(term107172, term107172.getClass(), "_config", term107282);
        setField(term107172, term107172.getClass(), "_context", null);
        setField(term107172, term107172.getClass(), "_rootDeserializers", term107364);
        setField(term107172, term107172.getClass(), "_parserFactory", term107446);
        setField(term107172, term107172.getClass(), "_valueType", term107538);
        setField(term107172, term107172.getClass(), "_valueToUpdate", term107576);
        term107668 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term107750 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term107668, term107668.getClass(), "_deserializationContext", null);
        setField(term107668, term107668.getClass(), "_rootDeserializers", term107750);
        setField(term107668, term107668.getClass(), "_jsonFactory", null);
        term107888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term107668;
        args[1] = null;
        args[2] = term107888;
        args[3] = term107888;
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


