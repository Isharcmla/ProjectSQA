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

public class JsonWriter_endObject_1591364441314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140899;

    public JsonWriter_endObject_1591364441314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140899 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term140675 = (int[]) newIntArray(128);
        setIntField(term140899, term140899.getClass(), "stackSize", -2147483536);
        setIntElement(term140675, 0, 3);
        setIntElement(term140675, 1, 3);
        setIntElement(term140675, 2, 3);
        setIntElement(term140675, 3, 3);
        setIntElement(term140675, 4, 3);
        setIntElement(term140675, 5, 3);
        setIntElement(term140675, 6, 3);
        setIntElement(term140675, 7, 3);
        setIntElement(term140675, 8, 3);
        setIntElement(term140675, 9, 3);
        setIntElement(term140675, 10, 3);
        setIntElement(term140675, 11, 3);
        setIntElement(term140675, 12, 3);
        setIntElement(term140675, 13, 3);
        setIntElement(term140675, 14, 3);
        setIntElement(term140675, 15, 3);
        setIntElement(term140675, 16, 3);
        setIntElement(term140675, 17, 3);
        setIntElement(term140675, 18, 3);
        setIntElement(term140675, 19, 3);
        setIntElement(term140675, 20, 3);
        setIntElement(term140675, 21, 3);
        setIntElement(term140675, 22, 3);
        setIntElement(term140675, 23, 3);
        setIntElement(term140675, 24, 3);
        setIntElement(term140675, 25, 3);
        setIntElement(term140675, 26, 3);
        setIntElement(term140675, 27, 3);
        setIntElement(term140675, 28, 3);
        setIntElement(term140675, 29, 3);
        setIntElement(term140675, 30, 3);
        setIntElement(term140675, 31, 3);
        setIntElement(term140675, 32, 3);
        setIntElement(term140675, 33, 3);
        setIntElement(term140675, 34, 3);
        setIntElement(term140675, 35, 3);
        setIntElement(term140675, 36, 3);
        setIntElement(term140675, 37, 3);
        setIntElement(term140675, 38, 3);
        setIntElement(term140675, 39, 3);
        setIntElement(term140675, 40, 3);
        setIntElement(term140675, 41, 3);
        setIntElement(term140675, 42, 3);
        setIntElement(term140675, 43, 3);
        setIntElement(term140675, 44, 3);
        setIntElement(term140675, 45, 3);
        setIntElement(term140675, 46, 3);
        setIntElement(term140675, 47, 3);
        setIntElement(term140675, 48, 3);
        setIntElement(term140675, 49, 3);
        setIntElement(term140675, 50, 3);
        setIntElement(term140675, 51, 3);
        setIntElement(term140675, 52, 3);
        setIntElement(term140675, 53, 3);
        setIntElement(term140675, 54, 3);
        setIntElement(term140675, 55, 3);
        setIntElement(term140675, 56, 3);
        setIntElement(term140675, 57, 3);
        setIntElement(term140675, 58, 3);
        setIntElement(term140675, 59, 3);
        setIntElement(term140675, 60, 3);
        setIntElement(term140675, 61, 3);
        setIntElement(term140675, 62, 3);
        setIntElement(term140675, 63, 3);
        setIntElement(term140675, 64, 3);
        setIntElement(term140675, 65, 3);
        setIntElement(term140675, 66, 3);
        setIntElement(term140675, 67, 3);
        setIntElement(term140675, 68, 3);
        setIntElement(term140675, 69, 3);
        setIntElement(term140675, 70, 3);
        setIntElement(term140675, 71, 3);
        setIntElement(term140675, 72, 3);
        setIntElement(term140675, 73, 3);
        setIntElement(term140675, 74, 3);
        setIntElement(term140675, 75, 3);
        setIntElement(term140675, 76, 3);
        setIntElement(term140675, 77, 3);
        setIntElement(term140675, 78, 3);
        setIntElement(term140675, 79, 3);
        setIntElement(term140675, 80, 3);
        setIntElement(term140675, 81, 3);
        setIntElement(term140675, 82, 3);
        setIntElement(term140675, 83, 3);
        setIntElement(term140675, 84, 3);
        setIntElement(term140675, 85, 3);
        setIntElement(term140675, 86, 3);
        setIntElement(term140675, 87, 3);
        setIntElement(term140675, 88, 3);
        setIntElement(term140675, 89, 3);
        setIntElement(term140675, 90, 3);
        setIntElement(term140675, 91, 3);
        setIntElement(term140675, 92, 3);
        setIntElement(term140675, 93, 3);
        setIntElement(term140675, 94, 3);
        setIntElement(term140675, 95, 3);
        setIntElement(term140675, 96, 3);
        setIntElement(term140675, 97, 3);
        setIntElement(term140675, 98, 3);
        setIntElement(term140675, 99, 3);
        setIntElement(term140675, 100, 3);
        setIntElement(term140675, 101, 3);
        setIntElement(term140675, 102, 3);
        setIntElement(term140675, 103, 3);
        setIntElement(term140675, 104, 3);
        setIntElement(term140675, 105, 3);
        setIntElement(term140675, 106, 3);
        setIntElement(term140675, 107, 3);
        setIntElement(term140675, 108, 3);
        setIntElement(term140675, 109, 3);
        setIntElement(term140675, 110, 3);
        setIntElement(term140675, 111, 3);
        setIntElement(term140675, 112, 3);
        setIntElement(term140675, 113, 3);
        setIntElement(term140675, 114, 3);
        setIntElement(term140675, 115, 3);
        setIntElement(term140675, 116, 3);
        setIntElement(term140675, 117, 3);
        setIntElement(term140675, 118, 3);
        setIntElement(term140675, 119, 3);
        setIntElement(term140675, 120, 3);
        setIntElement(term140675, 121, 3);
        setIntElement(term140675, 122, 3);
        setIntElement(term140675, 123, 3);
        setIntElement(term140675, 124, 3);
        setIntElement(term140675, 125, 3);
        setIntElement(term140675, 126, 3);
        setIntElement(term140675, 127, 3);
        setIntElement(term140675, -2147483537, 3);
        setField(term140899, term140899.getClass(), "stack", term140675);
        setField(term140899, term140899.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term140899, args);
    }

};


