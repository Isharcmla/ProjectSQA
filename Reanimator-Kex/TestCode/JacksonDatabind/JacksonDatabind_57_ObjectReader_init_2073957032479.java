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

public class ObjectReader_init_2073957032479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275990;
     Object term276223;
     Object term276329;
     Object term274351;
     Object term276475;

    public ObjectReader_init_2073957032479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term275450 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term275560 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term275708 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term276113 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term275089 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term275898 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term275450, term275450.getClass(), "_config", term275560);
        setField(term275450, term275450.getClass(), "_context", term275708);
        setField(term275450, term275450.getClass(), "_rootDeserializers", null);
        setField(term275450, term275450.getClass(), "_parserFactory", term276113);
        setField(term275450, term275450.getClass(), "_valueType", null);
        setField(term275450, term275450.getClass(), "_valueToUpdate", null);
        setField(term275450, term275450.getClass(), "_schema", term275089);
        setField(term275450, term275450.getClass(), "_injectableValues", term275898);
        setBooleanField(term275450, term275450.getClass(), "_unwrapRoot", false);
        term275990 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term276072 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term275990, term275990.getClass(), "_deserializationContext", null);
        setField(term275990, term275990.getClass(), "_rootDeserializers", term276072);
        setField(term275990, term275990.getClass(), "_jsonFactory", term276113);
        term276223 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term276223, term276223.getClass(), "_rootName", null);
        setIntField(term276223, term276223.getClass(), "_deserFeatures", -1);
        term276329 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term274351 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term276475 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term275990;
        args[1] = term276223;
        args[2] = term276329;
        args[3] = "";
        args[4] = term274351;
        args[5] = term276475;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


