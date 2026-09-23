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

public class ObjectReader_init_2073957032491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292821;
     Object term293237;
     Object term293319;
     Object term293427;

    public ObjectReader_init_2073957032491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term292287 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term292397 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term292479 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term292583 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term292621 = newInstance(Class.forName("java.lang.Object"));
        Object term292165 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term292729 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term292287, term292287.getClass(), "_config", term292397);
        setField(term292287, term292287.getClass(), "_context", null);
        setField(term292287, term292287.getClass(), "_rootDeserializers", null);
        setField(term292287, term292287.getClass(), "_parserFactory", term292479);
        setField(term292287, term292287.getClass(), "_valueType", term292583);
        setField(term292287, term292287.getClass(), "_valueToUpdate", term292621);
        setField(term292287, term292287.getClass(), "_schema", term292165);
        setField(term292287, term292287.getClass(), "_injectableValues", term292729);
        term292821 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term292969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term293051 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term293133 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term292821, term292821.getClass(), "_deserializationContext", term292969);
        setField(term292821, term292821.getClass(), "_rootDeserializers", term293051);
        setField(term292821, term292821.getClass(), "_jsonFactory", term293133);
        term293237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term293319 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term293427 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term292821;
        args[1] = null;
        args[2] = term293237;
        args[3] = term293319;
        args[4] = null;
        args[5] = term293427;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


