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

public class JsonWriter_endObject_1591364441214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81658;

    public JsonWriter_endObject_1591364441214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81658 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term81434 = (int[]) newIntArray(128);
        setIntField(term81658, term81658.getClass(), "stackSize", -2147483536);
        setIntElement(term81434, 0, 3);
        setIntElement(term81434, 1, 3);
        setIntElement(term81434, 2, 3);
        setIntElement(term81434, 3, 3);
        setIntElement(term81434, 4, 3);
        setIntElement(term81434, 5, 3);
        setIntElement(term81434, 6, 3);
        setIntElement(term81434, 7, 3);
        setIntElement(term81434, 8, 3);
        setIntElement(term81434, 9, 3);
        setIntElement(term81434, 10, 3);
        setIntElement(term81434, 11, 3);
        setIntElement(term81434, 12, 3);
        setIntElement(term81434, 13, 3);
        setIntElement(term81434, 14, 3);
        setIntElement(term81434, 15, 3);
        setIntElement(term81434, 16, 3);
        setIntElement(term81434, 17, 3);
        setIntElement(term81434, 18, 3);
        setIntElement(term81434, 19, 3);
        setIntElement(term81434, 20, 3);
        setIntElement(term81434, 21, 3);
        setIntElement(term81434, 22, 3);
        setIntElement(term81434, 23, 3);
        setIntElement(term81434, 24, 3);
        setIntElement(term81434, 25, 3);
        setIntElement(term81434, 26, 3);
        setIntElement(term81434, 27, 3);
        setIntElement(term81434, 28, 3);
        setIntElement(term81434, 29, 3);
        setIntElement(term81434, 30, 3);
        setIntElement(term81434, 31, 3);
        setIntElement(term81434, 32, 3);
        setIntElement(term81434, 33, 3);
        setIntElement(term81434, 34, 3);
        setIntElement(term81434, 35, 3);
        setIntElement(term81434, 36, 3);
        setIntElement(term81434, 37, 3);
        setIntElement(term81434, 38, 3);
        setIntElement(term81434, 39, 3);
        setIntElement(term81434, 40, 3);
        setIntElement(term81434, 41, 3);
        setIntElement(term81434, 42, 3);
        setIntElement(term81434, 43, 3);
        setIntElement(term81434, 44, 3);
        setIntElement(term81434, 45, 3);
        setIntElement(term81434, 46, 3);
        setIntElement(term81434, 47, 3);
        setIntElement(term81434, 48, 3);
        setIntElement(term81434, 49, 3);
        setIntElement(term81434, 50, 3);
        setIntElement(term81434, 51, 3);
        setIntElement(term81434, 52, 3);
        setIntElement(term81434, 53, 3);
        setIntElement(term81434, 54, 3);
        setIntElement(term81434, 55, 3);
        setIntElement(term81434, 56, 3);
        setIntElement(term81434, 57, 3);
        setIntElement(term81434, 58, 3);
        setIntElement(term81434, 59, 3);
        setIntElement(term81434, 60, 3);
        setIntElement(term81434, 61, 3);
        setIntElement(term81434, 62, 3);
        setIntElement(term81434, 63, 3);
        setIntElement(term81434, 64, 3);
        setIntElement(term81434, 65, 3);
        setIntElement(term81434, 66, 3);
        setIntElement(term81434, 67, 3);
        setIntElement(term81434, 68, 3);
        setIntElement(term81434, 69, 3);
        setIntElement(term81434, 70, 3);
        setIntElement(term81434, 71, 3);
        setIntElement(term81434, 72, 3);
        setIntElement(term81434, 73, 3);
        setIntElement(term81434, 74, 3);
        setIntElement(term81434, 75, 3);
        setIntElement(term81434, 76, 3);
        setIntElement(term81434, 77, 3);
        setIntElement(term81434, 78, 3);
        setIntElement(term81434, 79, 3);
        setIntElement(term81434, 80, 3);
        setIntElement(term81434, 81, 3);
        setIntElement(term81434, 82, 3);
        setIntElement(term81434, 83, 3);
        setIntElement(term81434, 84, 3);
        setIntElement(term81434, 85, 3);
        setIntElement(term81434, 86, 3);
        setIntElement(term81434, 87, 3);
        setIntElement(term81434, 88, 3);
        setIntElement(term81434, 89, 3);
        setIntElement(term81434, 90, 3);
        setIntElement(term81434, 91, 3);
        setIntElement(term81434, 92, 3);
        setIntElement(term81434, 93, 3);
        setIntElement(term81434, 94, 3);
        setIntElement(term81434, 95, 3);
        setIntElement(term81434, 96, 3);
        setIntElement(term81434, 97, 3);
        setIntElement(term81434, 98, 3);
        setIntElement(term81434, 99, 3);
        setIntElement(term81434, 100, 3);
        setIntElement(term81434, 101, 3);
        setIntElement(term81434, 102, 3);
        setIntElement(term81434, 103, 3);
        setIntElement(term81434, 104, 3);
        setIntElement(term81434, 105, 3);
        setIntElement(term81434, 106, 3);
        setIntElement(term81434, 107, 3);
        setIntElement(term81434, 108, 3);
        setIntElement(term81434, 109, 3);
        setIntElement(term81434, 110, 3);
        setIntElement(term81434, 111, 3);
        setIntElement(term81434, 112, 3);
        setIntElement(term81434, 113, 3);
        setIntElement(term81434, 114, 3);
        setIntElement(term81434, 115, 3);
        setIntElement(term81434, 116, 3);
        setIntElement(term81434, 117, 3);
        setIntElement(term81434, 118, 3);
        setIntElement(term81434, 119, 3);
        setIntElement(term81434, 120, 3);
        setIntElement(term81434, 121, 3);
        setIntElement(term81434, 122, 3);
        setIntElement(term81434, 123, 3);
        setIntElement(term81434, 124, 3);
        setIntElement(term81434, 125, 3);
        setIntElement(term81434, 126, 3);
        setIntElement(term81434, 127, 3);
        setIntElement(term81434, -2147483537, 3);
        setField(term81658, term81658.getClass(), "stack", term81434);
        setField(term81658, term81658.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term81658, args);
    }

};


