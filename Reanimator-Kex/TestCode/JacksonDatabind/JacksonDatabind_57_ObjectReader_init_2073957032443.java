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

public class ObjectReader_init_2073957032443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230447;
     Object term230787;
     Object term230891;

    public ObjectReader_init_2073957032443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term230245 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term230355 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term230245, term230245.getClass(), "_config", term230355);
        setField(term230245, term230245.getClass(), "_context", null);
        setField(term230245, term230245.getClass(), "_rootDeserializers", null);
        setField(term230245, term230245.getClass(), "_parserFactory", null);
        setField(term230245, term230245.getClass(), "_valueType", null);
        setField(term230245, term230245.getClass(), "_valueToUpdate", null);
        setField(term230245, term230245.getClass(), "_schema", null);
        setField(term230245, term230245.getClass(), "_injectableValues", null);
        setBooleanField(term230245, term230245.getClass(), "_unwrapRoot", false);
        term230447 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term230595 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term230677 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term230447, term230447.getClass(), "_deserializationContext", term230595);
        setField(term230447, term230447.getClass(), "_rootDeserializers", term230677);
        setField(term230447, term230447.getClass(), "_jsonFactory", null);
        term230787 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term230787, term230787.getClass(), "_rootName", null);
        setIntField(term230787, term230787.getClass(), "_deserFeatures", -1);
        term230891 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term230447;
        args[1] = term230787;
        args[2] = term230891;
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


