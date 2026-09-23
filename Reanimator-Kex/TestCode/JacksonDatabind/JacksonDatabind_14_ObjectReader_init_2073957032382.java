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

public class ObjectReader_init_2073957032382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187748;
     Object term187993;
     Object term188099;
     Object term188245;

    public ObjectReader_init_2073957032382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term187164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term187789 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term187830 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term187883 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term187548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term186897 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term187656 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term187164, term187164.getClass(), "_config", null);
        setField(term187164, term187164.getClass(), "_context", null);
        setField(term187164, term187164.getClass(), "_rootDeserializers", term187789);
        setField(term187164, term187164.getClass(), "_parserFactory", term187830);
        setField(term187164, term187164.getClass(), "_rootNames", term187883);
        setField(term187164, term187164.getClass(), "_valueType", term187548);
        setField(term187164, term187164.getClass(), "_valueToUpdate", null);
        setField(term187164, term187164.getClass(), "_schema", term186897);
        setField(term187164, term187164.getClass(), "_injectableValues", term187656);
        setBooleanField(term187164, term187164.getClass(), "_unwrapRoot", false);
        term187748 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term187748, term187748.getClass(), "_deserializationContext", null);
        setField(term187748, term187748.getClass(), "_rootDeserializers", term187789);
        setField(term187748, term187748.getClass(), "_jsonFactory", term187830);
        setField(term187748, term187748.getClass(), "_rootNames", term187883);
        term187993 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term187993, term187993.getClass(), "_rootName", null);
        setIntField(term187993, term187993.getClass(), "_deserFeatures", -1);
        term188099 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term188245 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term187748;
        args[1] = term187993;
        args[2] = term188099;
        args[3] = "";
        args[4] = null;
        args[5] = term188245;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


