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

public class ObjectReader_init_2073957032477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273205;
     Object term273555;
     Object term273791;

    public ObjectReader_init_2073957032477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term273003 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term273113 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term273003, term273003.getClass(), "_config", term273113);
        setField(term273003, term273003.getClass(), "_context", null);
        setField(term273003, term273003.getClass(), "_rootDeserializers", null);
        setField(term273003, term273003.getClass(), "_parserFactory", null);
        setField(term273003, term273003.getClass(), "_valueType", null);
        setField(term273003, term273003.getClass(), "_valueToUpdate", null);
        setField(term273003, term273003.getClass(), "_schema", null);
        setField(term273003, term273003.getClass(), "_injectableValues", null);
        setBooleanField(term273003, term273003.getClass(), "_unwrapRoot", false);
        term273205 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term273353 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term273445 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term273205, term273205.getClass(), "_deserializationContext", term273353);
        setField(term273205, term273205.getClass(), "_rootDeserializers", term273445);
        setField(term273205, term273205.getClass(), "_jsonFactory", null);
        term273555 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term273647 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term273647, term273647.getClass(), "_namespace", null);
        setField(term273647, term273647.getClass(), "_simpleName", "");
        setField(term273555, term273555.getClass(), "_rootName", term273647);
        setIntField(term273555, term273555.getClass(), "_deserFeatures", -1);
        term273791 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term273205;
        args[1] = term273555;
        args[2] = term273791;
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


