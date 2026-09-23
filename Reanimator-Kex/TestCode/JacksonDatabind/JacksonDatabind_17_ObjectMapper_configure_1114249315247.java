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
import java.lang.Boolean;

public class ObjectMapper_configure_1114249315247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22572;
     Object term22573;

    public ObjectMapper_configure_1114249315247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22572 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term22572, term22572.getClass(), "_jsonFactory", null);
        setField(term22572, term22572.getClass(), "_typeFactory", null);
        setField(term22572, term22572.getClass(), "_injectableValues", null);
        setField(term22572, term22572.getClass(), "_subtypeResolver", null);
        setField(term22572, term22572.getClass(), "_rootNames", null);
        setField(term22572, term22572.getClass(), "_mixInAnnotations", null);
        setField(term22572, term22572.getClass(), "_serializationConfig", null);
        setField(term22572, term22572.getClass(), "_serializerProvider", null);
        setField(term22572, term22572.getClass(), "_serializerFactory", null);
        setField(term22572, term22572.getClass(), "_deserializationConfig", null);
        setField(term22572, term22572.getClass(), "_deserializationContext", null);
        setField(term22572, term22572.getClass(), "_rootDeserializers", null);
        term22573 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser$Feature");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22573;
        callMethod(klass, "configure", argTypes, term22572, args);
    }

};


