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

public class JsonWriter_open_1875381156308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134858;

    public JsonWriter_open_1875381156308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134858 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term134636 = (int[]) newIntArray(128);
        Object term134902 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term134858, term134858.getClass(), "stackSize", -2147483536);
        setIntElement(term134636, 0, 2);
        setIntElement(term134636, 1, 2);
        setIntElement(term134636, 2, 2);
        setIntElement(term134636, 3, 2);
        setIntElement(term134636, 4, 2);
        setIntElement(term134636, 5, 2);
        setIntElement(term134636, 6, 2);
        setIntElement(term134636, 7, 2);
        setIntElement(term134636, 8, 2);
        setIntElement(term134636, 9, 2);
        setIntElement(term134636, 10, 2);
        setIntElement(term134636, 11, 2);
        setIntElement(term134636, 12, 2);
        setIntElement(term134636, 13, 2);
        setIntElement(term134636, 14, 2);
        setIntElement(term134636, 15, 2);
        setIntElement(term134636, 16, 2);
        setIntElement(term134636, 17, 2);
        setIntElement(term134636, 18, 2);
        setIntElement(term134636, 19, 2);
        setIntElement(term134636, 20, 2);
        setIntElement(term134636, 21, 2);
        setIntElement(term134636, 22, 2);
        setIntElement(term134636, 23, 2);
        setIntElement(term134636, 24, 2);
        setIntElement(term134636, 25, 2);
        setIntElement(term134636, 26, 2);
        setIntElement(term134636, 27, 2);
        setIntElement(term134636, 28, 2);
        setIntElement(term134636, 29, 2);
        setIntElement(term134636, 30, 2);
        setIntElement(term134636, 31, 2);
        setIntElement(term134636, 32, 2);
        setIntElement(term134636, 33, 2);
        setIntElement(term134636, 34, 2);
        setIntElement(term134636, 35, 2);
        setIntElement(term134636, 36, 2);
        setIntElement(term134636, 37, 2);
        setIntElement(term134636, 38, 2);
        setIntElement(term134636, 39, 2);
        setIntElement(term134636, 40, 2);
        setIntElement(term134636, 41, 2);
        setIntElement(term134636, 42, 2);
        setIntElement(term134636, 43, 2);
        setIntElement(term134636, 44, 2);
        setIntElement(term134636, 45, 2);
        setIntElement(term134636, 46, 2);
        setIntElement(term134636, 47, 2);
        setIntElement(term134636, 48, 2);
        setIntElement(term134636, 49, 2);
        setIntElement(term134636, 50, 2);
        setIntElement(term134636, 51, 2);
        setIntElement(term134636, 52, 2);
        setIntElement(term134636, 53, 2);
        setIntElement(term134636, 54, 2);
        setIntElement(term134636, 55, 2);
        setIntElement(term134636, 56, 2);
        setIntElement(term134636, 57, 2);
        setIntElement(term134636, 58, 2);
        setIntElement(term134636, 59, 2);
        setIntElement(term134636, 60, 2);
        setIntElement(term134636, 61, 2);
        setIntElement(term134636, 62, 2);
        setIntElement(term134636, 63, 2);
        setIntElement(term134636, 64, 2);
        setIntElement(term134636, 65, 2);
        setIntElement(term134636, 66, 2);
        setIntElement(term134636, 67, 2);
        setIntElement(term134636, 68, 2);
        setIntElement(term134636, 69, 2);
        setIntElement(term134636, 70, 2);
        setIntElement(term134636, 71, 2);
        setIntElement(term134636, 72, 2);
        setIntElement(term134636, 73, 2);
        setIntElement(term134636, 74, 2);
        setIntElement(term134636, 75, 2);
        setIntElement(term134636, 76, 2);
        setIntElement(term134636, 77, 2);
        setIntElement(term134636, 78, 2);
        setIntElement(term134636, 79, 2);
        setIntElement(term134636, 80, 2);
        setIntElement(term134636, 81, 2);
        setIntElement(term134636, 82, 2);
        setIntElement(term134636, 83, 2);
        setIntElement(term134636, 84, 2);
        setIntElement(term134636, 85, 2);
        setIntElement(term134636, 86, 2);
        setIntElement(term134636, 87, 2);
        setIntElement(term134636, 88, 2);
        setIntElement(term134636, 89, 2);
        setIntElement(term134636, 90, 2);
        setIntElement(term134636, 91, 2);
        setIntElement(term134636, 92, 2);
        setIntElement(term134636, 93, 2);
        setIntElement(term134636, 94, 2);
        setIntElement(term134636, 95, 2);
        setIntElement(term134636, 96, 2);
        setIntElement(term134636, 97, 2);
        setIntElement(term134636, 98, 2);
        setIntElement(term134636, 99, 2);
        setIntElement(term134636, 100, 2);
        setIntElement(term134636, 101, 2);
        setIntElement(term134636, 102, 2);
        setIntElement(term134636, 103, 2);
        setIntElement(term134636, 104, 2);
        setIntElement(term134636, 105, 2);
        setIntElement(term134636, 106, 2);
        setIntElement(term134636, 107, 2);
        setIntElement(term134636, 108, 2);
        setIntElement(term134636, 109, 2);
        setIntElement(term134636, 110, 2);
        setIntElement(term134636, 111, 2);
        setIntElement(term134636, 112, 2);
        setIntElement(term134636, 113, 2);
        setIntElement(term134636, 114, 2);
        setIntElement(term134636, 115, 2);
        setIntElement(term134636, 116, 2);
        setIntElement(term134636, 117, 2);
        setIntElement(term134636, 118, 2);
        setIntElement(term134636, 119, 2);
        setIntElement(term134636, 120, 2);
        setIntElement(term134636, 121, 2);
        setIntElement(term134636, 122, 2);
        setIntElement(term134636, 123, 2);
        setIntElement(term134636, 124, 2);
        setIntElement(term134636, 125, 2);
        setIntElement(term134636, 126, 2);
        setIntElement(term134636, 127, 2);
        setIntElement(term134636, -2147483537, 2);
        setField(term134858, term134858.getClass(), "stack", term134636);
        setField(term134858, term134858.getClass(), "out", term134902);
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
        callMethod(klass, "open", argTypes, term134858, args);
    }

};


