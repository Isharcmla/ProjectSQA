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

public class ObjectReader_init_2073957032352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134852;
     Object term135054;
     Object term135284;
     Object term135376;

    public ObjectReader_init_2073957032352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134760 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term134760, term134760.getClass(), "_config", null);
        setField(term134760, term134760.getClass(), "_context", null);
        setField(term134760, term134760.getClass(), "_rootDeserializers", null);
        setField(term134760, term134760.getClass(), "_parserFactory", null);
        setField(term134760, term134760.getClass(), "_valueType", null);
        setField(term134760, term134760.getClass(), "_valueToUpdate", null);
        setField(term134760, term134760.getClass(), "_schema", null);
        setField(term134760, term134760.getClass(), "_injectableValues", null);
        setBooleanField(term134760, term134760.getClass(), "_unwrapRoot", false);
        term134852 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term134944 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term134852, term134852.getClass(), "_deserializationContext", null);
        setField(term134852, term134852.getClass(), "_rootDeserializers", term134944);
        setField(term134852, term134852.getClass(), "_jsonFactory", null);
        term135054 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term135146 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term135146, term135146.getClass(), "_namespace", "UNWRAP_SINGLE_VALUE_ARRAYS");
        setField(term135054, term135054.getClass(), "_rootName", term135146);
        setIntField(term135054, term135054.getClass(), "_deserFeatures", -1);
        term135284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term135376 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
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
        args[0] = term134852;
        args[1] = term135054;
        args[2] = term135284;
        args[3] = term135376;
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


