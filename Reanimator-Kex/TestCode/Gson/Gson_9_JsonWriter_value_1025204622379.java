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

public class JsonWriter_value_1025204622379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196496;

    public JsonWriter_value_1025204622379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196496 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term196269 = (int[]) newIntArray(128);
        Object term196574 = newInstance(Class.forName("java.io.Console$3"));
        setField(term196496, term196496.getClass(), "deferredName", "");
        setIntField(term196496, term196496.getClass(), "stackSize", 112);
        setIntElement(term196269, 0, 5);
        setIntElement(term196269, 1, 5);
        setIntElement(term196269, 2, 5);
        setIntElement(term196269, 3, 5);
        setIntElement(term196269, 4, 5);
        setIntElement(term196269, 5, 5);
        setIntElement(term196269, 6, 5);
        setIntElement(term196269, 7, 5);
        setIntElement(term196269, 8, 5);
        setIntElement(term196269, 9, 5);
        setIntElement(term196269, 10, 5);
        setIntElement(term196269, 11, 5);
        setIntElement(term196269, 12, 5);
        setIntElement(term196269, 13, 5);
        setIntElement(term196269, 14, 5);
        setIntElement(term196269, 15, 5);
        setIntElement(term196269, 16, 5);
        setIntElement(term196269, 17, 5);
        setIntElement(term196269, 18, 5);
        setIntElement(term196269, 19, 5);
        setIntElement(term196269, 20, 5);
        setIntElement(term196269, 21, 5);
        setIntElement(term196269, 22, 5);
        setIntElement(term196269, 23, 5);
        setIntElement(term196269, 24, 5);
        setIntElement(term196269, 25, 5);
        setIntElement(term196269, 26, 5);
        setIntElement(term196269, 27, 5);
        setIntElement(term196269, 28, 5);
        setIntElement(term196269, 29, 5);
        setIntElement(term196269, 30, 5);
        setIntElement(term196269, 31, 5);
        setIntElement(term196269, 32, 5);
        setIntElement(term196269, 33, 5);
        setIntElement(term196269, 34, 5);
        setIntElement(term196269, 35, 5);
        setIntElement(term196269, 36, 5);
        setIntElement(term196269, 37, 5);
        setIntElement(term196269, 38, 5);
        setIntElement(term196269, 39, 5);
        setIntElement(term196269, 40, 5);
        setIntElement(term196269, 41, 5);
        setIntElement(term196269, 42, 5);
        setIntElement(term196269, 43, 5);
        setIntElement(term196269, 44, 5);
        setIntElement(term196269, 45, 5);
        setIntElement(term196269, 46, 5);
        setIntElement(term196269, 47, 5);
        setIntElement(term196269, 48, 5);
        setIntElement(term196269, 49, 5);
        setIntElement(term196269, 50, 5);
        setIntElement(term196269, 51, 5);
        setIntElement(term196269, 52, 5);
        setIntElement(term196269, 53, 5);
        setIntElement(term196269, 54, 5);
        setIntElement(term196269, 55, 5);
        setIntElement(term196269, 56, 5);
        setIntElement(term196269, 57, 5);
        setIntElement(term196269, 58, 5);
        setIntElement(term196269, 59, 5);
        setIntElement(term196269, 60, 5);
        setIntElement(term196269, 61, 5);
        setIntElement(term196269, 62, 5);
        setIntElement(term196269, 63, 5);
        setIntElement(term196269, 64, 5);
        setIntElement(term196269, 65, 5);
        setIntElement(term196269, 66, 5);
        setIntElement(term196269, 67, 5);
        setIntElement(term196269, 68, 5);
        setIntElement(term196269, 69, 5);
        setIntElement(term196269, 70, 5);
        setIntElement(term196269, 71, 5);
        setIntElement(term196269, 72, 5);
        setIntElement(term196269, 73, 5);
        setIntElement(term196269, 74, 5);
        setIntElement(term196269, 75, 5);
        setIntElement(term196269, 76, 5);
        setIntElement(term196269, 77, 5);
        setIntElement(term196269, 78, 5);
        setIntElement(term196269, 79, 5);
        setIntElement(term196269, 80, 5);
        setIntElement(term196269, 81, 5);
        setIntElement(term196269, 82, 5);
        setIntElement(term196269, 83, 5);
        setIntElement(term196269, 84, 5);
        setIntElement(term196269, 85, 5);
        setIntElement(term196269, 86, 5);
        setIntElement(term196269, 87, 5);
        setIntElement(term196269, 88, 5);
        setIntElement(term196269, 89, 5);
        setIntElement(term196269, 90, 5);
        setIntElement(term196269, 91, 5);
        setIntElement(term196269, 92, 5);
        setIntElement(term196269, 93, 5);
        setIntElement(term196269, 94, 5);
        setIntElement(term196269, 95, 5);
        setIntElement(term196269, 96, 5);
        setIntElement(term196269, 97, 5);
        setIntElement(term196269, 98, 5);
        setIntElement(term196269, 99, 5);
        setIntElement(term196269, 100, 5);
        setIntElement(term196269, 101, 5);
        setIntElement(term196269, 102, 5);
        setIntElement(term196269, 103, 5);
        setIntElement(term196269, 104, 5);
        setIntElement(term196269, 105, 5);
        setIntElement(term196269, 106, 5);
        setIntElement(term196269, 107, 5);
        setIntElement(term196269, 108, 5);
        setIntElement(term196269, 109, 5);
        setIntElement(term196269, 110, 5);
        setIntElement(term196269, 111, 5);
        setIntElement(term196269, 112, 5);
        setIntElement(term196269, 113, 5);
        setIntElement(term196269, 114, 5);
        setIntElement(term196269, 115, 5);
        setIntElement(term196269, 116, 5);
        setIntElement(term196269, 117, 5);
        setIntElement(term196269, 118, 5);
        setIntElement(term196269, 119, 5);
        setIntElement(term196269, 120, 5);
        setIntElement(term196269, 121, 5);
        setIntElement(term196269, 122, 5);
        setIntElement(term196269, 123, 5);
        setIntElement(term196269, 124, 5);
        setIntElement(term196269, 125, 5);
        setIntElement(term196269, 126, 5);
        setIntElement(term196269, 127, 5);
        setField(term196496, term196496.getClass(), "stack", term196269);
        setField(term196496, term196496.getClass(), "out", term196574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        try {
            callMethod(klass, "value", argTypes, term196496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


