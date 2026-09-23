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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonWriter_value_1025204622268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108500;

    public JsonWriter_value_1025204622268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108500 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term108394 = (int[]) newIntArray(8);
        setField(term108500, term108500.getClass(), "deferredName", "");
        setIntField(term108500, term108500.getClass(), "stackSize", 8);
        setIntElement(term108394, 0, 3);
        setIntElement(term108394, 1, 3);
        setIntElement(term108394, 2, 3);
        setIntElement(term108394, 3, 3);
        setIntElement(term108394, 4, 3);
        setIntElement(term108394, 5, 3);
        setIntElement(term108394, 6, 3);
        setIntElement(term108394, 7, 3);
        setField(term108500, term108500.getClass(), "stack", term108394);
        setField(term108500, term108500.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "value", argTypes, term108500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


