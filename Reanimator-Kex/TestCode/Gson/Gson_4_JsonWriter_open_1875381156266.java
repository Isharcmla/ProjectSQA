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

public class JsonWriter_open_1875381156266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118271;

    public JsonWriter_open_1875381156266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118271 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term118049 = (int[]) newIntArray(128);
        Object term118315 = newInstance(Class.forName("java.io.PipedWriter"));
        setIntField(term118271, term118271.getClass(), "stackSize", -2147483536);
        setIntElement(term118049, 0, 2);
        setIntElement(term118049, 1, 2);
        setIntElement(term118049, 2, 2);
        setIntElement(term118049, 3, 2);
        setIntElement(term118049, 4, 2);
        setIntElement(term118049, 5, 2);
        setIntElement(term118049, 6, 2);
        setIntElement(term118049, 7, 2);
        setIntElement(term118049, 8, 2);
        setIntElement(term118049, 9, 2);
        setIntElement(term118049, 10, 2);
        setIntElement(term118049, 11, 2);
        setIntElement(term118049, 12, 2);
        setIntElement(term118049, 13, 2);
        setIntElement(term118049, 14, 2);
        setIntElement(term118049, 15, 2);
        setIntElement(term118049, 16, 2);
        setIntElement(term118049, 17, 2);
        setIntElement(term118049, 18, 2);
        setIntElement(term118049, 19, 2);
        setIntElement(term118049, 20, 2);
        setIntElement(term118049, 21, 2);
        setIntElement(term118049, 22, 2);
        setIntElement(term118049, 23, 2);
        setIntElement(term118049, 24, 2);
        setIntElement(term118049, 25, 2);
        setIntElement(term118049, 26, 2);
        setIntElement(term118049, 27, 2);
        setIntElement(term118049, 28, 2);
        setIntElement(term118049, 29, 2);
        setIntElement(term118049, 30, 2);
        setIntElement(term118049, 31, 2);
        setIntElement(term118049, 32, 2);
        setIntElement(term118049, 33, 2);
        setIntElement(term118049, 34, 2);
        setIntElement(term118049, 35, 2);
        setIntElement(term118049, 36, 2);
        setIntElement(term118049, 37, 2);
        setIntElement(term118049, 38, 2);
        setIntElement(term118049, 39, 2);
        setIntElement(term118049, 40, 2);
        setIntElement(term118049, 41, 2);
        setIntElement(term118049, 42, 2);
        setIntElement(term118049, 43, 2);
        setIntElement(term118049, 44, 2);
        setIntElement(term118049, 45, 2);
        setIntElement(term118049, 46, 2);
        setIntElement(term118049, 47, 2);
        setIntElement(term118049, 48, 2);
        setIntElement(term118049, 49, 2);
        setIntElement(term118049, 50, 2);
        setIntElement(term118049, 51, 2);
        setIntElement(term118049, 52, 2);
        setIntElement(term118049, 53, 2);
        setIntElement(term118049, 54, 2);
        setIntElement(term118049, 55, 2);
        setIntElement(term118049, 56, 2);
        setIntElement(term118049, 57, 2);
        setIntElement(term118049, 58, 2);
        setIntElement(term118049, 59, 2);
        setIntElement(term118049, 60, 2);
        setIntElement(term118049, 61, 2);
        setIntElement(term118049, 62, 2);
        setIntElement(term118049, 63, 2);
        setIntElement(term118049, 64, 2);
        setIntElement(term118049, 65, 2);
        setIntElement(term118049, 66, 2);
        setIntElement(term118049, 67, 2);
        setIntElement(term118049, 68, 2);
        setIntElement(term118049, 69, 2);
        setIntElement(term118049, 70, 2);
        setIntElement(term118049, 71, 2);
        setIntElement(term118049, 72, 2);
        setIntElement(term118049, 73, 2);
        setIntElement(term118049, 74, 2);
        setIntElement(term118049, 75, 2);
        setIntElement(term118049, 76, 2);
        setIntElement(term118049, 77, 2);
        setIntElement(term118049, 78, 2);
        setIntElement(term118049, 79, 2);
        setIntElement(term118049, 80, 2);
        setIntElement(term118049, 81, 2);
        setIntElement(term118049, 82, 2);
        setIntElement(term118049, 83, 2);
        setIntElement(term118049, 84, 2);
        setIntElement(term118049, 85, 2);
        setIntElement(term118049, 86, 2);
        setIntElement(term118049, 87, 2);
        setIntElement(term118049, 88, 2);
        setIntElement(term118049, 89, 2);
        setIntElement(term118049, 90, 2);
        setIntElement(term118049, 91, 2);
        setIntElement(term118049, 92, 2);
        setIntElement(term118049, 93, 2);
        setIntElement(term118049, 94, 2);
        setIntElement(term118049, 95, 2);
        setIntElement(term118049, 96, 2);
        setIntElement(term118049, 97, 2);
        setIntElement(term118049, 98, 2);
        setIntElement(term118049, 99, 2);
        setIntElement(term118049, 100, 2);
        setIntElement(term118049, 101, 2);
        setIntElement(term118049, 102, 2);
        setIntElement(term118049, 103, 2);
        setIntElement(term118049, 104, 2);
        setIntElement(term118049, 105, 2);
        setIntElement(term118049, 106, 2);
        setIntElement(term118049, 107, 2);
        setIntElement(term118049, 108, 2);
        setIntElement(term118049, 109, 2);
        setIntElement(term118049, 110, 2);
        setIntElement(term118049, 111, 2);
        setIntElement(term118049, 112, 2);
        setIntElement(term118049, 113, 2);
        setIntElement(term118049, 114, 2);
        setIntElement(term118049, 115, 2);
        setIntElement(term118049, 116, 2);
        setIntElement(term118049, 117, 2);
        setIntElement(term118049, 118, 2);
        setIntElement(term118049, 119, 2);
        setIntElement(term118049, 120, 2);
        setIntElement(term118049, 121, 2);
        setIntElement(term118049, 122, 2);
        setIntElement(term118049, 123, 2);
        setIntElement(term118049, 124, 2);
        setIntElement(term118049, 125, 2);
        setIntElement(term118049, 126, 2);
        setIntElement(term118049, 127, 2);
        setIntElement(term118049, -2147483537, 2);
        setField(term118271, term118271.getClass(), "stack", term118049);
        setField(term118271, term118271.getClass(), "out", term118315);
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
        callMethod(klass, "open", argTypes, term118271, args);
    }

};


