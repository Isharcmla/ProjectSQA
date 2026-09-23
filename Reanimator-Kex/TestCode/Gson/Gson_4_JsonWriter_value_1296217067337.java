package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class JsonWriter_value_1296217067337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183237;
     Object term183259;

    public JsonWriter_value_1296217067337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183237 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term183237, term183237.getClass(), "deferredName", null);
        setBooleanField(term183237, term183237.getClass(), "lenient", false);
        term183259 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Number");
        Object[] args = new Object[1];
        args[0] = term183259;
        try {
            callMethod(klass, "value", argTypes, term183237, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


