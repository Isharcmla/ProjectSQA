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

public class ObjectReader_init_2073957032421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204070;
     Object term204328;
     Object term204420;

    public ObjectReader_init_2073957032421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203868 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term203978 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term203868, term203868.getClass(), "_config", term203978);
        setField(term203868, term203868.getClass(), "_context", null);
        setField(term203868, term203868.getClass(), "_rootDeserializers", null);
        setField(term203868, term203868.getClass(), "_parserFactory", null);
        setField(term203868, term203868.getClass(), "_valueType", null);
        setField(term203868, term203868.getClass(), "_valueToUpdate", null);
        setField(term203868, term203868.getClass(), "_schema", null);
        setField(term203868, term203868.getClass(), "_injectableValues", null);
        term204070 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term204218 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term204070, term204070.getClass(), "_deserializationContext", term204218);
        setField(term204070, term204070.getClass(), "_rootDeserializers", null);
        setField(term204070, term204070.getClass(), "_jsonFactory", null);
        term204328 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term204328, term204328.getClass(), "_rootName", null);
        setIntField(term204328, term204328.getClass(), "_deserFeatures", -1);
        term204420 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term204070;
        args[1] = term204328;
        args[2] = term204420;
        args[3] = "";
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


