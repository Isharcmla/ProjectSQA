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

public class ObjectReader_init_2073957032316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118691;
     Object term118987;
     Object term119139;

    public ObjectReader_init_2073957032316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118223 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term118305 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term118824 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term118877 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term118599 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term118223, term118223.getClass(), "_config", null);
        setField(term118223, term118223.getClass(), "_context", null);
        setField(term118223, term118223.getClass(), "_rootDeserializers", term118305);
        setField(term118223, term118223.getClass(), "_parserFactory", term118824);
        setField(term118223, term118223.getClass(), "_rootNames", term118877);
        setField(term118223, term118223.getClass(), "_valueType", term118599);
        setField(term118223, term118223.getClass(), "_valueToUpdate", term118877);
        setField(term118223, term118223.getClass(), "_schema", null);
        setField(term118223, term118223.getClass(), "_injectableValues", null);
        setBooleanField(term118223, term118223.getClass(), "_unwrapRoot", false);
        term118691 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term118783 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term118691, term118691.getClass(), "_deserializationContext", null);
        setField(term118691, term118691.getClass(), "_rootDeserializers", term118783);
        setField(term118691, term118691.getClass(), "_jsonFactory", term118824);
        setField(term118691, term118691.getClass(), "_rootNames", term118877);
        term118987 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term118987, term118987.getClass(), "_rootName", "");
        setIntField(term118987, term118987.getClass(), "_deserFeatures", -1);
        term119139 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term118691;
        args[1] = term118987;
        args[2] = term119139;
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


