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

public class ObjectMapper_createArrayNode_1741595820285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22614;

    public ObjectMapper_createArrayNode_1741595820285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22614 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term22614, term22614.getClass(), "_jsonFactory", null);
        setField(term22614, term22614.getClass(), "_typeFactory", null);
        setField(term22614, term22614.getClass(), "_injectableValues", null);
        setField(term22614, term22614.getClass(), "_subtypeResolver", null);
        setField(term22614, term22614.getClass(), "_rootNames", null);
        setField(term22614, term22614.getClass(), "_mixInAnnotations", null);
        setField(term22614, term22614.getClass(), "_serializationConfig", null);
        setField(term22614, term22614.getClass(), "_serializerProvider", null);
        setField(term22614, term22614.getClass(), "_serializerFactory", null);
        setField(term22614, term22614.getClass(), "_deserializationConfig", null);
        setField(term22614, term22614.getClass(), "_deserializationContext", null);
        setField(term22614, term22614.getClass(), "_rootDeserializers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createArrayNode", argTypes, term22614, args);
    }

};


