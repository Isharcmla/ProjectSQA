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
import java.lang.Integer;

public class ObjectMapper_readValue_463981516309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22638;
     Object term22639;
     Object term22641;

    public ObjectMapper_readValue_463981516309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22638 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term22638, term22638.getClass(), "_jsonFactory", null);
        setField(term22638, term22638.getClass(), "_typeFactory", null);
        setField(term22638, term22638.getClass(), "_injectableValues", null);
        setField(term22638, term22638.getClass(), "_subtypeResolver", null);
        setField(term22638, term22638.getClass(), "_rootNames", null);
        setField(term22638, term22638.getClass(), "_mixInAnnotations", null);
        setField(term22638, term22638.getClass(), "_serializationConfig", null);
        setField(term22638, term22638.getClass(), "_serializerProvider", null);
        setField(term22638, term22638.getClass(), "_serializerFactory", null);
        setField(term22638, term22638.getClass(), "_deserializationConfig", null);
        setField(term22638, term22638.getClass(), "_deserializationContext", null);
        setField(term22638, term22638.getClass(), "_rootDeserializers", null);
        term22639 = new Integer(0);
        term22641 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Class");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term22639;
        args[2] = term22641;
        args[3] = null;
        callMethod(klass, "readValue", argTypes, term22638, args);
    }

};


