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

public class ObjectReader_init_2073957032270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67930;
     Object term68122;
     Object term68220;
     Object term68366;

    public ObjectReader_init_2073957032270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67354 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term67971 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term68012 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term67624 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term67730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term67838 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term67354, term67354.getClass(), "_config", null);
        setField(term67354, term67354.getClass(), "_context", null);
        setField(term67354, term67354.getClass(), "_rootDeserializers", term67971);
        setField(term67354, term67354.getClass(), "_parserFactory", term68012);
        setField(term67354, term67354.getClass(), "_rootNames", term67624);
        setField(term67354, term67354.getClass(), "_valueType", term67730);
        setField(term67354, term67354.getClass(), "_valueToUpdate", null);
        setField(term67354, term67354.getClass(), "_schema", null);
        setField(term67354, term67354.getClass(), "_injectableValues", term67838);
        setBooleanField(term67354, term67354.getClass(), "_unwrapRoot", false);
        term67930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term67930, term67930.getClass(), "_deserializationContext", null);
        setField(term67930, term67930.getClass(), "_rootDeserializers", term67971);
        setField(term67930, term67930.getClass(), "_jsonFactory", term68012);
        setField(term67930, term67930.getClass(), "_rootNames", null);
        term68122 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term68122, term68122.getClass(), "_rootName", null);
        setIntField(term68122, term68122.getClass(), "_deserFeatures", -1);
        term68220 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term68366 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term67930;
        args[1] = term68122;
        args[2] = term68220;
        args[3] = "";
        args[4] = null;
        args[5] = term68366;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


