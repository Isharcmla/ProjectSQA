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
import java.lang.Object;

public class JsonWriter_open_1875381156378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196218;

    public JsonWriter_open_1875381156378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196218 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term196114 = (int[]) newIntArray(8);
        Object term196256 = newInstance(Class.forName("java.io.Writer$1"));
        setIntField(term196218, term196218.getClass(), "stackSize", 8);
        setIntElement(term196114, 0, 4);
        setIntElement(term196114, 1, 4);
        setIntElement(term196114, 2, 4);
        setIntElement(term196114, 3, 4);
        setIntElement(term196114, 4, 4);
        setIntElement(term196114, 5, 4);
        setIntElement(term196114, 6, 4);
        setIntElement(term196114, 7, 4);
        setField(term196218, term196218.getClass(), "stack", term196114);
        setField(term196218, term196218.getClass(), "out", term196256);
        setField(term196218, term196218.getClass(), "separator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "open", argTypes, term196218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


