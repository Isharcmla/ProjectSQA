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

public class ObjectReader_init_2073957032280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79775;
     Object term79967;
     Object term80059;

    public ObjectReader_init_2073957032280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79573 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term79683 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term79573, term79573.getClass(), "_config", term79683);
        setField(term79573, term79573.getClass(), "_context", null);
        setField(term79573, term79573.getClass(), "_rootDeserializers", null);
        setField(term79573, term79573.getClass(), "_parserFactory", null);
        setField(term79573, term79573.getClass(), "_rootNames", null);
        setField(term79573, term79573.getClass(), "_valueType", null);
        setField(term79573, term79573.getClass(), "_valueToUpdate", null);
        setField(term79573, term79573.getClass(), "_schema", null);
        setField(term79573, term79573.getClass(), "_injectableValues", null);
        setBooleanField(term79573, term79573.getClass(), "_unwrapRoot", false);
        term79775 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term79857 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term79775, term79775.getClass(), "_deserializationContext", null);
        setField(term79775, term79775.getClass(), "_rootDeserializers", term79857);
        setField(term79775, term79775.getClass(), "_jsonFactory", null);
        setField(term79775, term79775.getClass(), "_rootNames", null);
        term79967 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term79967, term79967.getClass(), "_rootName", null);
        setIntField(term79967, term79967.getClass(), "_deserFeatures", -1);
        term80059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term79775;
        args[1] = term79967;
        args[2] = term80059;
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


