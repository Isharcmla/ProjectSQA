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

public class ObjectReader_init_1613963825325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94190;

    public ObjectReader_init_1613963825325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93536 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term93646 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term93794 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term93876 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term93990 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term93423 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term94098 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term93536, term93536.getClass(), "_config", term93646);
        setField(term93536, term93536.getClass(), "_context", term93794);
        setField(term93536, term93536.getClass(), "_rootDeserializers", null);
        setField(term93536, term93536.getClass(), "_parserFactory", term93876);
        setField(term93536, term93536.getClass(), "_valueType", term93990);
        setField(term93536, term93536.getClass(), "_valueToUpdate", term93990);
        setField(term93536, term93536.getClass(), "_schema", term93423);
        setField(term93536, term93536.getClass(), "_injectableValues", term94098);
        term94190 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term94338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term94420 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term94502 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term94190, term94190.getClass(), "_deserializationContext", term94338);
        setField(term94190, term94190.getClass(), "_rootDeserializers", term94420);
        setField(term94190, term94190.getClass(), "_jsonFactory", term94502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term94190;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


