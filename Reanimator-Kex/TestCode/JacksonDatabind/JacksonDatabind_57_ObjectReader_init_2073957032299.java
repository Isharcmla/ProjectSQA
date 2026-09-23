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

public class ObjectReader_init_2073957032299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71247;
     Object term71587;
     Object term71691;

    public ObjectReader_init_2073957032299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71045 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term71155 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term71045, term71045.getClass(), "_config", term71155);
        setField(term71045, term71045.getClass(), "_context", null);
        setField(term71045, term71045.getClass(), "_rootDeserializers", null);
        setField(term71045, term71045.getClass(), "_parserFactory", null);
        setField(term71045, term71045.getClass(), "_valueType", null);
        setField(term71045, term71045.getClass(), "_valueToUpdate", null);
        setField(term71045, term71045.getClass(), "_schema", null);
        setField(term71045, term71045.getClass(), "_injectableValues", null);
        setBooleanField(term71045, term71045.getClass(), "_unwrapRoot", false);
        term71247 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term71395 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term71477 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term71247, term71247.getClass(), "_deserializationContext", term71395);
        setField(term71247, term71247.getClass(), "_rootDeserializers", term71477);
        setField(term71247, term71247.getClass(), "_jsonFactory", null);
        term71587 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term71587, term71587.getClass(), "_rootName", null);
        setIntField(term71587, term71587.getClass(), "_deserFeatures", -1);
        term71691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term71247;
        args[1] = term71587;
        args[2] = term71691;
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


