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

public class JsonWriter_open_1875381156151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40486;

    public JsonWriter_open_1875381156151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40486 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term40388 = (int[]) newIntArray(8);
        setIntField(term40486, term40486.getClass(), "stackSize", 8);
        setIntElement(term40388, 0, 4);
        setIntElement(term40388, 1, 4);
        setIntElement(term40388, 2, 4);
        setIntElement(term40388, 3, 4);
        setIntElement(term40388, 4, 4);
        setIntElement(term40388, 5, 4);
        setIntElement(term40388, 6, 4);
        setIntElement(term40388, 7, 4);
        setField(term40486, term40486.getClass(), "stack", term40388);
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
            callMethod(klass, "open", argTypes, term40486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


