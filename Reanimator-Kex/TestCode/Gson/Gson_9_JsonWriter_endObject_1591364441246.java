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

public class JsonWriter_endObject_1591364441246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97901;

    public JsonWriter_endObject_1591364441246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97901 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term97677 = (int[]) newIntArray(128);
        setIntField(term97901, term97901.getClass(), "stackSize", -2147483536);
        setIntElement(term97677, 0, 3);
        setIntElement(term97677, 1, 3);
        setIntElement(term97677, 2, 3);
        setIntElement(term97677, 3, 3);
        setIntElement(term97677, 4, 3);
        setIntElement(term97677, 5, 3);
        setIntElement(term97677, 6, 3);
        setIntElement(term97677, 7, 3);
        setIntElement(term97677, 8, 3);
        setIntElement(term97677, 9, 3);
        setIntElement(term97677, 10, 3);
        setIntElement(term97677, 11, 3);
        setIntElement(term97677, 12, 3);
        setIntElement(term97677, 13, 3);
        setIntElement(term97677, 14, 3);
        setIntElement(term97677, 15, 3);
        setIntElement(term97677, 16, 3);
        setIntElement(term97677, 17, 3);
        setIntElement(term97677, 18, 3);
        setIntElement(term97677, 19, 3);
        setIntElement(term97677, 20, 3);
        setIntElement(term97677, 21, 3);
        setIntElement(term97677, 22, 3);
        setIntElement(term97677, 23, 3);
        setIntElement(term97677, 24, 3);
        setIntElement(term97677, 25, 3);
        setIntElement(term97677, 26, 3);
        setIntElement(term97677, 27, 3);
        setIntElement(term97677, 28, 3);
        setIntElement(term97677, 29, 3);
        setIntElement(term97677, 30, 3);
        setIntElement(term97677, 31, 3);
        setIntElement(term97677, 32, 3);
        setIntElement(term97677, 33, 3);
        setIntElement(term97677, 34, 3);
        setIntElement(term97677, 35, 3);
        setIntElement(term97677, 36, 3);
        setIntElement(term97677, 37, 3);
        setIntElement(term97677, 38, 3);
        setIntElement(term97677, 39, 3);
        setIntElement(term97677, 40, 3);
        setIntElement(term97677, 41, 3);
        setIntElement(term97677, 42, 3);
        setIntElement(term97677, 43, 3);
        setIntElement(term97677, 44, 3);
        setIntElement(term97677, 45, 3);
        setIntElement(term97677, 46, 3);
        setIntElement(term97677, 47, 3);
        setIntElement(term97677, 48, 3);
        setIntElement(term97677, 49, 3);
        setIntElement(term97677, 50, 3);
        setIntElement(term97677, 51, 3);
        setIntElement(term97677, 52, 3);
        setIntElement(term97677, 53, 3);
        setIntElement(term97677, 54, 3);
        setIntElement(term97677, 55, 3);
        setIntElement(term97677, 56, 3);
        setIntElement(term97677, 57, 3);
        setIntElement(term97677, 58, 3);
        setIntElement(term97677, 59, 3);
        setIntElement(term97677, 60, 3);
        setIntElement(term97677, 61, 3);
        setIntElement(term97677, 62, 3);
        setIntElement(term97677, 63, 3);
        setIntElement(term97677, 64, 3);
        setIntElement(term97677, 65, 3);
        setIntElement(term97677, 66, 3);
        setIntElement(term97677, 67, 3);
        setIntElement(term97677, 68, 3);
        setIntElement(term97677, 69, 3);
        setIntElement(term97677, 70, 3);
        setIntElement(term97677, 71, 3);
        setIntElement(term97677, 72, 3);
        setIntElement(term97677, 73, 3);
        setIntElement(term97677, 74, 3);
        setIntElement(term97677, 75, 3);
        setIntElement(term97677, 76, 3);
        setIntElement(term97677, 77, 3);
        setIntElement(term97677, 78, 3);
        setIntElement(term97677, 79, 3);
        setIntElement(term97677, 80, 3);
        setIntElement(term97677, 81, 3);
        setIntElement(term97677, 82, 3);
        setIntElement(term97677, 83, 3);
        setIntElement(term97677, 84, 3);
        setIntElement(term97677, 85, 3);
        setIntElement(term97677, 86, 3);
        setIntElement(term97677, 87, 3);
        setIntElement(term97677, 88, 3);
        setIntElement(term97677, 89, 3);
        setIntElement(term97677, 90, 3);
        setIntElement(term97677, 91, 3);
        setIntElement(term97677, 92, 3);
        setIntElement(term97677, 93, 3);
        setIntElement(term97677, 94, 3);
        setIntElement(term97677, 95, 3);
        setIntElement(term97677, 96, 3);
        setIntElement(term97677, 97, 3);
        setIntElement(term97677, 98, 3);
        setIntElement(term97677, 99, 3);
        setIntElement(term97677, 100, 3);
        setIntElement(term97677, 101, 3);
        setIntElement(term97677, 102, 3);
        setIntElement(term97677, 103, 3);
        setIntElement(term97677, 104, 3);
        setIntElement(term97677, 105, 3);
        setIntElement(term97677, 106, 3);
        setIntElement(term97677, 107, 3);
        setIntElement(term97677, 108, 3);
        setIntElement(term97677, 109, 3);
        setIntElement(term97677, 110, 3);
        setIntElement(term97677, 111, 3);
        setIntElement(term97677, 112, 3);
        setIntElement(term97677, 113, 3);
        setIntElement(term97677, 114, 3);
        setIntElement(term97677, 115, 3);
        setIntElement(term97677, 116, 3);
        setIntElement(term97677, 117, 3);
        setIntElement(term97677, 118, 3);
        setIntElement(term97677, 119, 3);
        setIntElement(term97677, 120, 3);
        setIntElement(term97677, 121, 3);
        setIntElement(term97677, 122, 3);
        setIntElement(term97677, 123, 3);
        setIntElement(term97677, 124, 3);
        setIntElement(term97677, 125, 3);
        setIntElement(term97677, 126, 3);
        setIntElement(term97677, 127, 3);
        setIntElement(term97677, -2147483537, 3);
        setField(term97901, term97901.getClass(), "stack", term97677);
        setField(term97901, term97901.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term97901, args);
    }

};


