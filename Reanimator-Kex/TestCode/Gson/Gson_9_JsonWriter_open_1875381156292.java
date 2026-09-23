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

public class JsonWriter_open_1875381156292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128310;

    public JsonWriter_open_1875381156292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128310 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term128207 = (int[]) newIntArray(8);
        Object term128360 = newInstance(Class.forName("java.io.BufferedWriter"));
        setIntField(term128310, term128310.getClass(), "stackSize", 8);
        setIntElement(term128207, 0, 4);
        setIntElement(term128207, 1, 4);
        setIntElement(term128207, 2, 4);
        setIntElement(term128207, 3, 4);
        setIntElement(term128207, 4, 4);
        setIntElement(term128207, 5, 4);
        setIntElement(term128207, 6, 4);
        setIntElement(term128207, 7, 4);
        setField(term128310, term128310.getClass(), "stack", term128207);
        setField(term128310, term128310.getClass(), "out", term128360);
        setField(term128310, term128310.getClass(), "separator", null);
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
            callMethod(klass, "open", argTypes, term128310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


