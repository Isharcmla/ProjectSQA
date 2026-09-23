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
import java.lang.Boolean;

public class JsonWriter_value_123905805089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22236;
     Object term22322;

    public JsonWriter_value_123905805089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22236 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        setField(term22236, term22236.getClass(), "deferredName", "");
        setIntField(term22236, term22236.getClass(), "stackSize", 0);
        term22322 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term22322;
        try {
            callMethod(klass, "value", argTypes, term22236, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


