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

public class JsonWriter_endObject_1591364441208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76377;

    public JsonWriter_endObject_1591364441208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76377 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term76153 = (int[]) newIntArray(128);
        setIntField(term76377, term76377.getClass(), "stackSize", -2147483536);
        setIntElement(term76153, 0, 5);
        setIntElement(term76153, 1, 5);
        setIntElement(term76153, 2, 5);
        setIntElement(term76153, 3, 5);
        setIntElement(term76153, 4, 5);
        setIntElement(term76153, 5, 5);
        setIntElement(term76153, 6, 5);
        setIntElement(term76153, 7, 5);
        setIntElement(term76153, 8, 5);
        setIntElement(term76153, 9, 5);
        setIntElement(term76153, 10, 5);
        setIntElement(term76153, 11, 5);
        setIntElement(term76153, 12, 5);
        setIntElement(term76153, 13, 5);
        setIntElement(term76153, 14, 5);
        setIntElement(term76153, 15, 5);
        setIntElement(term76153, 16, 5);
        setIntElement(term76153, 17, 5);
        setIntElement(term76153, 18, 5);
        setIntElement(term76153, 19, 5);
        setIntElement(term76153, 20, 5);
        setIntElement(term76153, 21, 5);
        setIntElement(term76153, 22, 5);
        setIntElement(term76153, 23, 5);
        setIntElement(term76153, 24, 5);
        setIntElement(term76153, 25, 5);
        setIntElement(term76153, 26, 5);
        setIntElement(term76153, 27, 5);
        setIntElement(term76153, 28, 5);
        setIntElement(term76153, 29, 5);
        setIntElement(term76153, 30, 5);
        setIntElement(term76153, 31, 5);
        setIntElement(term76153, 32, 5);
        setIntElement(term76153, 33, 5);
        setIntElement(term76153, 34, 5);
        setIntElement(term76153, 35, 5);
        setIntElement(term76153, 36, 5);
        setIntElement(term76153, 37, 5);
        setIntElement(term76153, 38, 5);
        setIntElement(term76153, 39, 5);
        setIntElement(term76153, 40, 5);
        setIntElement(term76153, 41, 5);
        setIntElement(term76153, 42, 5);
        setIntElement(term76153, 43, 5);
        setIntElement(term76153, 44, 5);
        setIntElement(term76153, 45, 5);
        setIntElement(term76153, 46, 5);
        setIntElement(term76153, 47, 5);
        setIntElement(term76153, 48, 5);
        setIntElement(term76153, 49, 5);
        setIntElement(term76153, 50, 5);
        setIntElement(term76153, 51, 5);
        setIntElement(term76153, 52, 5);
        setIntElement(term76153, 53, 5);
        setIntElement(term76153, 54, 5);
        setIntElement(term76153, 55, 5);
        setIntElement(term76153, 56, 5);
        setIntElement(term76153, 57, 5);
        setIntElement(term76153, 58, 5);
        setIntElement(term76153, 59, 5);
        setIntElement(term76153, 60, 5);
        setIntElement(term76153, 61, 5);
        setIntElement(term76153, 62, 5);
        setIntElement(term76153, 63, 5);
        setIntElement(term76153, 64, 5);
        setIntElement(term76153, 65, 5);
        setIntElement(term76153, 66, 5);
        setIntElement(term76153, 67, 5);
        setIntElement(term76153, 68, 5);
        setIntElement(term76153, 69, 5);
        setIntElement(term76153, 70, 5);
        setIntElement(term76153, 71, 5);
        setIntElement(term76153, 72, 5);
        setIntElement(term76153, 73, 5);
        setIntElement(term76153, 74, 5);
        setIntElement(term76153, 75, 5);
        setIntElement(term76153, 76, 5);
        setIntElement(term76153, 77, 5);
        setIntElement(term76153, 78, 5);
        setIntElement(term76153, 79, 5);
        setIntElement(term76153, 80, 5);
        setIntElement(term76153, 81, 5);
        setIntElement(term76153, 82, 5);
        setIntElement(term76153, 83, 5);
        setIntElement(term76153, 84, 5);
        setIntElement(term76153, 85, 5);
        setIntElement(term76153, 86, 5);
        setIntElement(term76153, 87, 5);
        setIntElement(term76153, 88, 5);
        setIntElement(term76153, 89, 5);
        setIntElement(term76153, 90, 5);
        setIntElement(term76153, 91, 5);
        setIntElement(term76153, 92, 5);
        setIntElement(term76153, 93, 5);
        setIntElement(term76153, 94, 5);
        setIntElement(term76153, 95, 5);
        setIntElement(term76153, 96, 5);
        setIntElement(term76153, 97, 5);
        setIntElement(term76153, 98, 5);
        setIntElement(term76153, 99, 5);
        setIntElement(term76153, 100, 5);
        setIntElement(term76153, 101, 5);
        setIntElement(term76153, 102, 5);
        setIntElement(term76153, 103, 5);
        setIntElement(term76153, 104, 5);
        setIntElement(term76153, 105, 5);
        setIntElement(term76153, 106, 5);
        setIntElement(term76153, 107, 5);
        setIntElement(term76153, 108, 5);
        setIntElement(term76153, 109, 5);
        setIntElement(term76153, 110, 5);
        setIntElement(term76153, 111, 5);
        setIntElement(term76153, 112, 5);
        setIntElement(term76153, 113, 5);
        setIntElement(term76153, 114, 5);
        setIntElement(term76153, 115, 5);
        setIntElement(term76153, 116, 5);
        setIntElement(term76153, 117, 5);
        setIntElement(term76153, 118, 5);
        setIntElement(term76153, 119, 5);
        setIntElement(term76153, 120, 5);
        setIntElement(term76153, 121, 5);
        setIntElement(term76153, 122, 5);
        setIntElement(term76153, 123, 5);
        setIntElement(term76153, 124, 5);
        setIntElement(term76153, 125, 5);
        setIntElement(term76153, 126, 5);
        setIntElement(term76153, 127, 5);
        setIntElement(term76153, -2147483537, 5);
        setField(term76377, term76377.getClass(), "stack", term76153);
        setField(term76377, term76377.getClass(), "deferredName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endObject", argTypes, term76377, args);
    }

};


