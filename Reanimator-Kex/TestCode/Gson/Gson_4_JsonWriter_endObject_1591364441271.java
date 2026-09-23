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

public class JsonWriter_endObject_1591364441271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124853;

    public JsonWriter_endObject_1591364441271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124853 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term124629 = (int[]) newIntArray(128);
        setIntField(term124853, term124853.getClass(), "stackSize", -2147483536);
        setIntElement(term124629, 0, 5);
        setIntElement(term124629, 1, 5);
        setIntElement(term124629, 2, 5);
        setIntElement(term124629, 3, 5);
        setIntElement(term124629, 4, 5);
        setIntElement(term124629, 5, 5);
        setIntElement(term124629, 6, 5);
        setIntElement(term124629, 7, 5);
        setIntElement(term124629, 8, 5);
        setIntElement(term124629, 9, 5);
        setIntElement(term124629, 10, 5);
        setIntElement(term124629, 11, 5);
        setIntElement(term124629, 12, 5);
        setIntElement(term124629, 13, 5);
        setIntElement(term124629, 14, 5);
        setIntElement(term124629, 15, 5);
        setIntElement(term124629, 16, 5);
        setIntElement(term124629, 17, 5);
        setIntElement(term124629, 18, 5);
        setIntElement(term124629, 19, 5);
        setIntElement(term124629, 20, 5);
        setIntElement(term124629, 21, 5);
        setIntElement(term124629, 22, 5);
        setIntElement(term124629, 23, 5);
        setIntElement(term124629, 24, 5);
        setIntElement(term124629, 25, 5);
        setIntElement(term124629, 26, 5);
        setIntElement(term124629, 27, 5);
        setIntElement(term124629, 28, 5);
        setIntElement(term124629, 29, 5);
        setIntElement(term124629, 30, 5);
        setIntElement(term124629, 31, 5);
        setIntElement(term124629, 32, 5);
        setIntElement(term124629, 33, 5);
        setIntElement(term124629, 34, 5);
        setIntElement(term124629, 35, 5);
        setIntElement(term124629, 36, 5);
        setIntElement(term124629, 37, 5);
        setIntElement(term124629, 38, 5);
        setIntElement(term124629, 39, 5);
        setIntElement(term124629, 40, 5);
        setIntElement(term124629, 41, 5);
        setIntElement(term124629, 42, 5);
        setIntElement(term124629, 43, 5);
        setIntElement(term124629, 44, 5);
        setIntElement(term124629, 45, 5);
        setIntElement(term124629, 46, 5);
        setIntElement(term124629, 47, 5);
        setIntElement(term124629, 48, 5);
        setIntElement(term124629, 49, 5);
        setIntElement(term124629, 50, 5);
        setIntElement(term124629, 51, 5);
        setIntElement(term124629, 52, 5);
        setIntElement(term124629, 53, 5);
        setIntElement(term124629, 54, 5);
        setIntElement(term124629, 55, 5);
        setIntElement(term124629, 56, 5);
        setIntElement(term124629, 57, 5);
        setIntElement(term124629, 58, 5);
        setIntElement(term124629, 59, 5);
        setIntElement(term124629, 60, 5);
        setIntElement(term124629, 61, 5);
        setIntElement(term124629, 62, 5);
        setIntElement(term124629, 63, 5);
        setIntElement(term124629, 64, 5);
        setIntElement(term124629, 65, 5);
        setIntElement(term124629, 66, 5);
        setIntElement(term124629, 67, 5);
        setIntElement(term124629, 68, 5);
        setIntElement(term124629, 69, 5);
        setIntElement(term124629, 70, 5);
        setIntElement(term124629, 71, 5);
        setIntElement(term124629, 72, 5);
        setIntElement(term124629, 73, 5);
        setIntElement(term124629, 74, 5);
        setIntElement(term124629, 75, 5);
        setIntElement(term124629, 76, 5);
        setIntElement(term124629, 77, 5);
        setIntElement(term124629, 78, 5);
        setIntElement(term124629, 79, 5);
        setIntElement(term124629, 80, 5);
        setIntElement(term124629, 81, 5);
        setIntElement(term124629, 82, 5);
        setIntElement(term124629, 83, 5);
        setIntElement(term124629, 84, 5);
        setIntElement(term124629, 85, 5);
        setIntElement(term124629, 86, 5);
        setIntElement(term124629, 87, 5);
        setIntElement(term124629, 88, 5);
        setIntElement(term124629, 89, 5);
        setIntElement(term124629, 90, 5);
        setIntElement(term124629, 91, 5);
        setIntElement(term124629, 92, 5);
        setIntElement(term124629, 93, 5);
        setIntElement(term124629, 94, 5);
        setIntElement(term124629, 95, 5);
        setIntElement(term124629, 96, 5);
        setIntElement(term124629, 97, 5);
        setIntElement(term124629, 98, 5);
        setIntElement(term124629, 99, 5);
        setIntElement(term124629, 100, 5);
        setIntElement(term124629, 101, 5);
        setIntElement(term124629, 102, 5);
        setIntElement(term124629, 103, 5);
        setIntElement(term124629, 104, 5);
        setIntElement(term124629, 105, 5);
        setIntElement(term124629, 106, 5);
        setIntElement(term124629, 107, 5);
        setIntElement(term124629, 108, 5);
        setIntElement(term124629, 109, 5);
        setIntElement(term124629, 110, 5);
        setIntElement(term124629, 111, 5);
        setIntElement(term124629, 112, 5);
        setIntElement(term124629, 113, 5);
        setIntElement(term124629, 114, 5);
        setIntElement(term124629, 115, 5);
        setIntElement(term124629, 116, 5);
        setIntElement(term124629, 117, 5);
        setIntElement(term124629, 118, 5);
        setIntElement(term124629, 119, 5);
        setIntElement(term124629, 120, 5);
        setIntElement(term124629, 121, 5);
        setIntElement(term124629, 122, 5);
        setIntElement(term124629, 123, 5);
        setIntElement(term124629, 124, 5);
        setIntElement(term124629, 125, 5);
        setIntElement(term124629, 126, 5);
        setIntElement(term124629, 127, 5);
        setIntElement(term124629, -2147483537, 5);
        setField(term124853, term124853.getClass(), "stack", term124629);
        setField(term124853, term124853.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term124853, args);
    }

};


