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

public class ObjectReader_init_2073957032348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127611;
     Object term127951;
     Object term128195;

    public ObjectReader_init_2073957032348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127409 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term127519 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term127409, term127409.getClass(), "_config", term127519);
        setField(term127409, term127409.getClass(), "_context", null);
        setField(term127409, term127409.getClass(), "_rootDeserializers", null);
        setField(term127409, term127409.getClass(), "_parserFactory", null);
        setField(term127409, term127409.getClass(), "_valueType", null);
        setField(term127409, term127409.getClass(), "_valueToUpdate", null);
        setField(term127409, term127409.getClass(), "_schema", null);
        setField(term127409, term127409.getClass(), "_injectableValues", null);
        setBooleanField(term127409, term127409.getClass(), "_unwrapRoot", false);
        term127611 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term127759 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term127841 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term127611, term127611.getClass(), "_deserializationContext", term127759);
        setField(term127611, term127611.getClass(), "_rootDeserializers", term127841);
        setField(term127611, term127611.getClass(), "_jsonFactory", null);
        term127951 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term128043 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term128043, term128043.getClass(), "_namespace", null);
        setField(term128043, term128043.getClass(), "_simpleName", "                                                                                                                                                                                                                                                 ");
        setField(term127951, term127951.getClass(), "_rootName", term128043);
        setIntField(term127951, term127951.getClass(), "_deserFeatures", -1);
        term128195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term127611;
        args[1] = term127951;
        args[2] = term128195;
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


