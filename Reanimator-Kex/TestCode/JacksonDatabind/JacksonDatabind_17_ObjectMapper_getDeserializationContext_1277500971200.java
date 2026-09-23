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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ObjectMapper_getDeserializationContext_1277500971200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22519;

    public ObjectMapper_getDeserializationContext_1277500971200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22519 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term22519, term22519.getClass(), "_jsonFactory", null);
        setField(term22519, term22519.getClass(), "_typeFactory", null);
        setField(term22519, term22519.getClass(), "_injectableValues", null);
        setField(term22519, term22519.getClass(), "_subtypeResolver", null);
        setField(term22519, term22519.getClass(), "_rootNames", null);
        setField(term22519, term22519.getClass(), "_mixInAnnotations", null);
        setField(term22519, term22519.getClass(), "_serializationConfig", null);
        setField(term22519, term22519.getClass(), "_serializerProvider", null);
        setField(term22519, term22519.getClass(), "_serializerFactory", null);
        setField(term22519, term22519.getClass(), "_deserializationConfig", null);
        setField(term22519, term22519.getClass(), "_deserializationContext", null);
        setField(term22519, term22519.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeserializationContext", argTypes, term22519, args);
    }

};


