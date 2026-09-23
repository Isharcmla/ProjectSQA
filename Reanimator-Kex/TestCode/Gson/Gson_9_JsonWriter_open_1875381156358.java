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

public class JsonWriter_open_1875381156358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186676;

    public JsonWriter_open_1875381156358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186676 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term186572 = (int[]) newIntArray(8);
        Object term186774 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        setIntField(term186676, term186676.getClass(), "stackSize", 8);
        setIntElement(term186572, 0, 4);
        setIntElement(term186572, 1, 4);
        setIntElement(term186572, 2, 4);
        setIntElement(term186572, 3, 4);
        setIntElement(term186572, 4, 4);
        setIntElement(term186572, 5, 4);
        setIntElement(term186572, 6, 4);
        setIntElement(term186572, 7, 4);
        setField(term186676, term186676.getClass(), "stack", term186572);
        setField(term186676, term186676.getClass(), "out", term186774);
        setField(term186676, term186676.getClass(), "separator", null);
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
            callMethod(klass, "open", argTypes, term186676, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


