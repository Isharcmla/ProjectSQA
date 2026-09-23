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

public class ObjectReader_init_2073957032341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110937;
     Object term111277;
     Object term111383;

    public ObjectReader_init_2073957032341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110735 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term110845 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term110735, term110735.getClass(), "_config", term110845);
        setField(term110735, term110735.getClass(), "_context", null);
        setField(term110735, term110735.getClass(), "_rootDeserializers", null);
        setField(term110735, term110735.getClass(), "_parserFactory", null);
        setField(term110735, term110735.getClass(), "_valueType", null);
        setField(term110735, term110735.getClass(), "_valueToUpdate", null);
        setField(term110735, term110735.getClass(), "_schema", null);
        setField(term110735, term110735.getClass(), "_injectableValues", null);
        setBooleanField(term110735, term110735.getClass(), "_unwrapRoot", false);
        term110937 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term111085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term111167 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term110937, term110937.getClass(), "_deserializationContext", term111085);
        setField(term110937, term110937.getClass(), "_rootDeserializers", term111167);
        setField(term110937, term110937.getClass(), "_jsonFactory", null);
        term111277 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term111277, term111277.getClass(), "_rootName", null);
        setIntField(term111277, term111277.getClass(), "_deserFeatures", -1);
        term111383 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term110937;
        args[1] = term111277;
        args[2] = term111383;
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


