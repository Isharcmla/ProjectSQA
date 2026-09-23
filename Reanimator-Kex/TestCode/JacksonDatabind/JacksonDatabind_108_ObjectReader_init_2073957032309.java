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

public class ObjectReader_init_2073957032309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76622;
     Object term76880;
     Object term76986;

    public ObjectReader_init_2073957032309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76272 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term76382 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term76530 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term76272, term76272.getClass(), "_config", term76382);
        setField(term76272, term76272.getClass(), "_context", term76530);
        setField(term76272, term76272.getClass(), "_rootDeserializers", null);
        setField(term76272, term76272.getClass(), "_parserFactory", null);
        setField(term76272, term76272.getClass(), "_valueType", null);
        setField(term76272, term76272.getClass(), "_valueToUpdate", null);
        setField(term76272, term76272.getClass(), "_schema", null);
        setField(term76272, term76272.getClass(), "_injectableValues", null);
        setBooleanField(term76272, term76272.getClass(), "_unwrapRoot", false);
        term76622 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term76770 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term76622, term76622.getClass(), "_deserializationContext", term76770);
        setField(term76622, term76622.getClass(), "_rootDeserializers", null);
        setField(term76622, term76622.getClass(), "_jsonFactory", null);
        term76880 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term76880, term76880.getClass(), "_rootName", null);
        setIntField(term76880, term76880.getClass(), "_deserFeatures", -1);
        term76986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term76622;
        args[1] = term76880;
        args[2] = term76986;
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


