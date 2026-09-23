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

public class ObjectReader_init_2073957032433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214598;
     Object term214938;
     Object term215174;

    public ObjectReader_init_2073957032433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term214396 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term214506 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term214396, term214396.getClass(), "_config", term214506);
        setField(term214396, term214396.getClass(), "_context", null);
        setField(term214396, term214396.getClass(), "_rootDeserializers", null);
        setField(term214396, term214396.getClass(), "_parserFactory", null);
        setField(term214396, term214396.getClass(), "_valueType", null);
        setField(term214396, term214396.getClass(), "_valueToUpdate", null);
        setField(term214396, term214396.getClass(), "_schema", null);
        setField(term214396, term214396.getClass(), "_injectableValues", null);
        setBooleanField(term214396, term214396.getClass(), "_unwrapRoot", false);
        term214598 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term214746 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term214828 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term214598, term214598.getClass(), "_deserializationContext", term214746);
        setField(term214598, term214598.getClass(), "_rootDeserializers", term214828);
        setField(term214598, term214598.getClass(), "_jsonFactory", null);
        term214938 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term215030 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term215030, term215030.getClass(), "_namespace", "");
        setField(term214938, term214938.getClass(), "_rootName", term215030);
        setIntField(term214938, term214938.getClass(), "_deserFeatures", -1);
        term215174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term214598;
        args[1] = term214938;
        args[2] = term215174;
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


