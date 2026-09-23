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

public class ObjectReader_init_2073957032368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170636;
     Object term170976;
     Object term171120;

    public ObjectReader_init_2073957032368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term170286 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term170396 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term170544 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term170286, term170286.getClass(), "_config", term170396);
        setField(term170286, term170286.getClass(), "_context", term170544);
        setField(term170286, term170286.getClass(), "_rootDeserializers", null);
        setField(term170286, term170286.getClass(), "_parserFactory", null);
        setField(term170286, term170286.getClass(), "_rootNames", null);
        setField(term170286, term170286.getClass(), "_valueType", null);
        setField(term170286, term170286.getClass(), "_valueToUpdate", null);
        setField(term170286, term170286.getClass(), "_schema", null);
        setField(term170286, term170286.getClass(), "_injectableValues", null);
        setBooleanField(term170286, term170286.getClass(), "_unwrapRoot", false);
        term170636 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term170784 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term170866 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term170636, term170636.getClass(), "_deserializationContext", term170784);
        setField(term170636, term170636.getClass(), "_rootDeserializers", term170866);
        setField(term170636, term170636.getClass(), "_jsonFactory", null);
        setField(term170636, term170636.getClass(), "_rootNames", null);
        term170976 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term170976, term170976.getClass(), "_rootName", "");
        setIntField(term170976, term170976.getClass(), "_deserFeatures", -1);
        term171120 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term170636;
        args[1] = term170976;
        args[2] = term171120;
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


