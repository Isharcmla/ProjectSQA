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

public class JsonWriter_endObject_1591364441313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140505;

    public JsonWriter_endObject_1591364441313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140505 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term140281 = (int[]) newIntArray(128);
        setIntField(term140505, term140505.getClass(), "stackSize", -2147483536);
        setIntElement(term140281, 0, 5);
        setIntElement(term140281, 1, 5);
        setIntElement(term140281, 2, 5);
        setIntElement(term140281, 3, 5);
        setIntElement(term140281, 4, 5);
        setIntElement(term140281, 5, 5);
        setIntElement(term140281, 6, 5);
        setIntElement(term140281, 7, 5);
        setIntElement(term140281, 8, 5);
        setIntElement(term140281, 9, 5);
        setIntElement(term140281, 10, 5);
        setIntElement(term140281, 11, 5);
        setIntElement(term140281, 12, 5);
        setIntElement(term140281, 13, 5);
        setIntElement(term140281, 14, 5);
        setIntElement(term140281, 15, 5);
        setIntElement(term140281, 16, 5);
        setIntElement(term140281, 17, 5);
        setIntElement(term140281, 18, 5);
        setIntElement(term140281, 19, 5);
        setIntElement(term140281, 20, 5);
        setIntElement(term140281, 21, 5);
        setIntElement(term140281, 22, 5);
        setIntElement(term140281, 23, 5);
        setIntElement(term140281, 24, 5);
        setIntElement(term140281, 25, 5);
        setIntElement(term140281, 26, 5);
        setIntElement(term140281, 27, 5);
        setIntElement(term140281, 28, 5);
        setIntElement(term140281, 29, 5);
        setIntElement(term140281, 30, 5);
        setIntElement(term140281, 31, 5);
        setIntElement(term140281, 32, 5);
        setIntElement(term140281, 33, 5);
        setIntElement(term140281, 34, 5);
        setIntElement(term140281, 35, 5);
        setIntElement(term140281, 36, 5);
        setIntElement(term140281, 37, 5);
        setIntElement(term140281, 38, 5);
        setIntElement(term140281, 39, 5);
        setIntElement(term140281, 40, 5);
        setIntElement(term140281, 41, 5);
        setIntElement(term140281, 42, 5);
        setIntElement(term140281, 43, 5);
        setIntElement(term140281, 44, 5);
        setIntElement(term140281, 45, 5);
        setIntElement(term140281, 46, 5);
        setIntElement(term140281, 47, 5);
        setIntElement(term140281, 48, 5);
        setIntElement(term140281, 49, 5);
        setIntElement(term140281, 50, 5);
        setIntElement(term140281, 51, 5);
        setIntElement(term140281, 52, 5);
        setIntElement(term140281, 53, 5);
        setIntElement(term140281, 54, 5);
        setIntElement(term140281, 55, 5);
        setIntElement(term140281, 56, 5);
        setIntElement(term140281, 57, 5);
        setIntElement(term140281, 58, 5);
        setIntElement(term140281, 59, 5);
        setIntElement(term140281, 60, 5);
        setIntElement(term140281, 61, 5);
        setIntElement(term140281, 62, 5);
        setIntElement(term140281, 63, 5);
        setIntElement(term140281, 64, 5);
        setIntElement(term140281, 65, 5);
        setIntElement(term140281, 66, 5);
        setIntElement(term140281, 67, 5);
        setIntElement(term140281, 68, 5);
        setIntElement(term140281, 69, 5);
        setIntElement(term140281, 70, 5);
        setIntElement(term140281, 71, 5);
        setIntElement(term140281, 72, 5);
        setIntElement(term140281, 73, 5);
        setIntElement(term140281, 74, 5);
        setIntElement(term140281, 75, 5);
        setIntElement(term140281, 76, 5);
        setIntElement(term140281, 77, 5);
        setIntElement(term140281, 78, 5);
        setIntElement(term140281, 79, 5);
        setIntElement(term140281, 80, 5);
        setIntElement(term140281, 81, 5);
        setIntElement(term140281, 82, 5);
        setIntElement(term140281, 83, 5);
        setIntElement(term140281, 84, 5);
        setIntElement(term140281, 85, 5);
        setIntElement(term140281, 86, 5);
        setIntElement(term140281, 87, 5);
        setIntElement(term140281, 88, 5);
        setIntElement(term140281, 89, 5);
        setIntElement(term140281, 90, 5);
        setIntElement(term140281, 91, 5);
        setIntElement(term140281, 92, 5);
        setIntElement(term140281, 93, 5);
        setIntElement(term140281, 94, 5);
        setIntElement(term140281, 95, 5);
        setIntElement(term140281, 96, 5);
        setIntElement(term140281, 97, 5);
        setIntElement(term140281, 98, 5);
        setIntElement(term140281, 99, 5);
        setIntElement(term140281, 100, 5);
        setIntElement(term140281, 101, 5);
        setIntElement(term140281, 102, 5);
        setIntElement(term140281, 103, 5);
        setIntElement(term140281, 104, 5);
        setIntElement(term140281, 105, 5);
        setIntElement(term140281, 106, 5);
        setIntElement(term140281, 107, 5);
        setIntElement(term140281, 108, 5);
        setIntElement(term140281, 109, 5);
        setIntElement(term140281, 110, 5);
        setIntElement(term140281, 111, 5);
        setIntElement(term140281, 112, 5);
        setIntElement(term140281, 113, 5);
        setIntElement(term140281, 114, 5);
        setIntElement(term140281, 115, 5);
        setIntElement(term140281, 116, 5);
        setIntElement(term140281, 117, 5);
        setIntElement(term140281, 118, 5);
        setIntElement(term140281, 119, 5);
        setIntElement(term140281, 120, 5);
        setIntElement(term140281, 121, 5);
        setIntElement(term140281, 122, 5);
        setIntElement(term140281, 123, 5);
        setIntElement(term140281, 124, 5);
        setIntElement(term140281, 125, 5);
        setIntElement(term140281, 126, 5);
        setIntElement(term140281, 127, 5);
        setIntElement(term140281, -2147483537, 5);
        setField(term140505, term140505.getClass(), "stack", term140281);
        setField(term140505, term140505.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term140505, args);
    }

};


