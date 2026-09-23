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
import java.lang.Object;

public class JsonWriter_open_1875381156267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108810;

    public JsonWriter_open_1875381156267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108810 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term108588 = (int[]) newIntArray(128);
        Object term108854 = newInstance(Class.forName("java.io.PipedWriter"));
        setIntField(term108810, term108810.getClass(), "stackSize", -2147483536);
        setIntElement(term108588, 0, 2);
        setIntElement(term108588, 1, 2);
        setIntElement(term108588, 2, 2);
        setIntElement(term108588, 3, 2);
        setIntElement(term108588, 4, 2);
        setIntElement(term108588, 5, 2);
        setIntElement(term108588, 6, 2);
        setIntElement(term108588, 7, 2);
        setIntElement(term108588, 8, 2);
        setIntElement(term108588, 9, 2);
        setIntElement(term108588, 10, 2);
        setIntElement(term108588, 11, 2);
        setIntElement(term108588, 12, 2);
        setIntElement(term108588, 13, 2);
        setIntElement(term108588, 14, 2);
        setIntElement(term108588, 15, 2);
        setIntElement(term108588, 16, 2);
        setIntElement(term108588, 17, 2);
        setIntElement(term108588, 18, 2);
        setIntElement(term108588, 19, 2);
        setIntElement(term108588, 20, 2);
        setIntElement(term108588, 21, 2);
        setIntElement(term108588, 22, 2);
        setIntElement(term108588, 23, 2);
        setIntElement(term108588, 24, 2);
        setIntElement(term108588, 25, 2);
        setIntElement(term108588, 26, 2);
        setIntElement(term108588, 27, 2);
        setIntElement(term108588, 28, 2);
        setIntElement(term108588, 29, 2);
        setIntElement(term108588, 30, 2);
        setIntElement(term108588, 31, 2);
        setIntElement(term108588, 32, 2);
        setIntElement(term108588, 33, 2);
        setIntElement(term108588, 34, 2);
        setIntElement(term108588, 35, 2);
        setIntElement(term108588, 36, 2);
        setIntElement(term108588, 37, 2);
        setIntElement(term108588, 38, 2);
        setIntElement(term108588, 39, 2);
        setIntElement(term108588, 40, 2);
        setIntElement(term108588, 41, 2);
        setIntElement(term108588, 42, 2);
        setIntElement(term108588, 43, 2);
        setIntElement(term108588, 44, 2);
        setIntElement(term108588, 45, 2);
        setIntElement(term108588, 46, 2);
        setIntElement(term108588, 47, 2);
        setIntElement(term108588, 48, 2);
        setIntElement(term108588, 49, 2);
        setIntElement(term108588, 50, 2);
        setIntElement(term108588, 51, 2);
        setIntElement(term108588, 52, 2);
        setIntElement(term108588, 53, 2);
        setIntElement(term108588, 54, 2);
        setIntElement(term108588, 55, 2);
        setIntElement(term108588, 56, 2);
        setIntElement(term108588, 57, 2);
        setIntElement(term108588, 58, 2);
        setIntElement(term108588, 59, 2);
        setIntElement(term108588, 60, 2);
        setIntElement(term108588, 61, 2);
        setIntElement(term108588, 62, 2);
        setIntElement(term108588, 63, 2);
        setIntElement(term108588, 64, 2);
        setIntElement(term108588, 65, 2);
        setIntElement(term108588, 66, 2);
        setIntElement(term108588, 67, 2);
        setIntElement(term108588, 68, 2);
        setIntElement(term108588, 69, 2);
        setIntElement(term108588, 70, 2);
        setIntElement(term108588, 71, 2);
        setIntElement(term108588, 72, 2);
        setIntElement(term108588, 73, 2);
        setIntElement(term108588, 74, 2);
        setIntElement(term108588, 75, 2);
        setIntElement(term108588, 76, 2);
        setIntElement(term108588, 77, 2);
        setIntElement(term108588, 78, 2);
        setIntElement(term108588, 79, 2);
        setIntElement(term108588, 80, 2);
        setIntElement(term108588, 81, 2);
        setIntElement(term108588, 82, 2);
        setIntElement(term108588, 83, 2);
        setIntElement(term108588, 84, 2);
        setIntElement(term108588, 85, 2);
        setIntElement(term108588, 86, 2);
        setIntElement(term108588, 87, 2);
        setIntElement(term108588, 88, 2);
        setIntElement(term108588, 89, 2);
        setIntElement(term108588, 90, 2);
        setIntElement(term108588, 91, 2);
        setIntElement(term108588, 92, 2);
        setIntElement(term108588, 93, 2);
        setIntElement(term108588, 94, 2);
        setIntElement(term108588, 95, 2);
        setIntElement(term108588, 96, 2);
        setIntElement(term108588, 97, 2);
        setIntElement(term108588, 98, 2);
        setIntElement(term108588, 99, 2);
        setIntElement(term108588, 100, 2);
        setIntElement(term108588, 101, 2);
        setIntElement(term108588, 102, 2);
        setIntElement(term108588, 103, 2);
        setIntElement(term108588, 104, 2);
        setIntElement(term108588, 105, 2);
        setIntElement(term108588, 106, 2);
        setIntElement(term108588, 107, 2);
        setIntElement(term108588, 108, 2);
        setIntElement(term108588, 109, 2);
        setIntElement(term108588, 110, 2);
        setIntElement(term108588, 111, 2);
        setIntElement(term108588, 112, 2);
        setIntElement(term108588, 113, 2);
        setIntElement(term108588, 114, 2);
        setIntElement(term108588, 115, 2);
        setIntElement(term108588, 116, 2);
        setIntElement(term108588, 117, 2);
        setIntElement(term108588, 118, 2);
        setIntElement(term108588, 119, 2);
        setIntElement(term108588, 120, 2);
        setIntElement(term108588, 121, 2);
        setIntElement(term108588, 122, 2);
        setIntElement(term108588, 123, 2);
        setIntElement(term108588, 124, 2);
        setIntElement(term108588, 125, 2);
        setIntElement(term108588, 126, 2);
        setIntElement(term108588, 127, 2);
        setIntElement(term108588, -2147483537, 2);
        setField(term108810, term108810.getClass(), "stack", term108588);
        setField(term108810, term108810.getClass(), "out", term108854);
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
        callMethod(klass, "open", argTypes, term108810, args);
    }

};


