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

public class ObjectReader_init_1613963825283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53277;
     Object term53480;

    public ObjectReader_init_1613963825283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52945 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term53480 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term53526 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term53185 = newInstance(Class.forName("java.lang.Object"));
        Object term52830 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term53480, term53480.getClass(), "_rootName", term53526);
        setField(term52945, term52945.getClass(), "_config", term53480);
        setField(term52945, term52945.getClass(), "_context", null);
        setField(term52945, term52945.getClass(), "_rootDeserializers", null);
        setField(term52945, term52945.getClass(), "_parserFactory", null);
        setField(term52945, term52945.getClass(), "_valueType", null);
        setField(term52945, term52945.getClass(), "_valueToUpdate", term53185);
        setField(term52945, term52945.getClass(), "_schema", term52830);
        setField(term52945, term52945.getClass(), "_injectableValues", null);
        term53277 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term53425 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term53277, term53277.getClass(), "_deserializationContext", term53425);
        setField(term53277, term53277.getClass(), "_rootDeserializers", null);
        setField(term53277, term53277.getClass(), "_jsonFactory", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term53277;
        args[1] = term53480;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


