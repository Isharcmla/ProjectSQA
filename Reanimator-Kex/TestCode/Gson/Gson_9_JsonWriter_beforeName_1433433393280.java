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

public class JsonWriter_beforeName_1433433393280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119564;

    public JsonWriter_beforeName_1433433393280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119564 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term119340 = (int[]) newIntArray(128);
        setIntField(term119564, term119564.getClass(), "stackSize", -2147483536);
        setIntElement(term119340, 0, 3);
        setIntElement(term119340, 1, 3);
        setIntElement(term119340, 2, 3);
        setIntElement(term119340, 3, 3);
        setIntElement(term119340, 4, 3);
        setIntElement(term119340, 5, 3);
        setIntElement(term119340, 6, 3);
        setIntElement(term119340, 7, 3);
        setIntElement(term119340, 8, 3);
        setIntElement(term119340, 9, 3);
        setIntElement(term119340, 10, 3);
        setIntElement(term119340, 11, 3);
        setIntElement(term119340, 12, 3);
        setIntElement(term119340, 13, 3);
        setIntElement(term119340, 14, 3);
        setIntElement(term119340, 15, 3);
        setIntElement(term119340, 16, 3);
        setIntElement(term119340, 17, 3);
        setIntElement(term119340, 18, 3);
        setIntElement(term119340, 19, 3);
        setIntElement(term119340, 20, 3);
        setIntElement(term119340, 21, 3);
        setIntElement(term119340, 22, 3);
        setIntElement(term119340, 23, 3);
        setIntElement(term119340, 24, 3);
        setIntElement(term119340, 25, 3);
        setIntElement(term119340, 26, 3);
        setIntElement(term119340, 27, 3);
        setIntElement(term119340, 28, 3);
        setIntElement(term119340, 29, 3);
        setIntElement(term119340, 30, 3);
        setIntElement(term119340, 31, 3);
        setIntElement(term119340, 32, 3);
        setIntElement(term119340, 33, 3);
        setIntElement(term119340, 34, 3);
        setIntElement(term119340, 35, 3);
        setIntElement(term119340, 36, 3);
        setIntElement(term119340, 37, 3);
        setIntElement(term119340, 38, 3);
        setIntElement(term119340, 39, 3);
        setIntElement(term119340, 40, 3);
        setIntElement(term119340, 41, 3);
        setIntElement(term119340, 42, 3);
        setIntElement(term119340, 43, 3);
        setIntElement(term119340, 44, 3);
        setIntElement(term119340, 45, 3);
        setIntElement(term119340, 46, 3);
        setIntElement(term119340, 47, 3);
        setIntElement(term119340, 48, 3);
        setIntElement(term119340, 49, 3);
        setIntElement(term119340, 50, 3);
        setIntElement(term119340, 51, 3);
        setIntElement(term119340, 52, 3);
        setIntElement(term119340, 53, 3);
        setIntElement(term119340, 54, 3);
        setIntElement(term119340, 55, 3);
        setIntElement(term119340, 56, 3);
        setIntElement(term119340, 57, 3);
        setIntElement(term119340, 58, 3);
        setIntElement(term119340, 59, 3);
        setIntElement(term119340, 60, 3);
        setIntElement(term119340, 61, 3);
        setIntElement(term119340, 62, 3);
        setIntElement(term119340, 63, 3);
        setIntElement(term119340, 64, 3);
        setIntElement(term119340, 65, 3);
        setIntElement(term119340, 66, 3);
        setIntElement(term119340, 67, 3);
        setIntElement(term119340, 68, 3);
        setIntElement(term119340, 69, 3);
        setIntElement(term119340, 70, 3);
        setIntElement(term119340, 71, 3);
        setIntElement(term119340, 72, 3);
        setIntElement(term119340, 73, 3);
        setIntElement(term119340, 74, 3);
        setIntElement(term119340, 75, 3);
        setIntElement(term119340, 76, 3);
        setIntElement(term119340, 77, 3);
        setIntElement(term119340, 78, 3);
        setIntElement(term119340, 79, 3);
        setIntElement(term119340, 80, 3);
        setIntElement(term119340, 81, 3);
        setIntElement(term119340, 82, 3);
        setIntElement(term119340, 83, 3);
        setIntElement(term119340, 84, 3);
        setIntElement(term119340, 85, 3);
        setIntElement(term119340, 86, 3);
        setIntElement(term119340, 87, 3);
        setIntElement(term119340, 88, 3);
        setIntElement(term119340, 89, 3);
        setIntElement(term119340, 90, 3);
        setIntElement(term119340, 91, 3);
        setIntElement(term119340, 92, 3);
        setIntElement(term119340, 93, 3);
        setIntElement(term119340, 94, 3);
        setIntElement(term119340, 95, 3);
        setIntElement(term119340, 96, 3);
        setIntElement(term119340, 97, 3);
        setIntElement(term119340, 98, 3);
        setIntElement(term119340, 99, 3);
        setIntElement(term119340, 100, 3);
        setIntElement(term119340, 101, 3);
        setIntElement(term119340, 102, 3);
        setIntElement(term119340, 103, 3);
        setIntElement(term119340, 104, 3);
        setIntElement(term119340, 105, 3);
        setIntElement(term119340, 106, 3);
        setIntElement(term119340, 107, 3);
        setIntElement(term119340, 108, 3);
        setIntElement(term119340, 109, 3);
        setIntElement(term119340, 110, 3);
        setIntElement(term119340, 111, 3);
        setIntElement(term119340, 112, 3);
        setIntElement(term119340, 113, 3);
        setIntElement(term119340, 114, 3);
        setIntElement(term119340, 115, 3);
        setIntElement(term119340, 116, 3);
        setIntElement(term119340, 117, 3);
        setIntElement(term119340, 118, 3);
        setIntElement(term119340, 119, 3);
        setIntElement(term119340, 120, 3);
        setIntElement(term119340, 121, 3);
        setIntElement(term119340, 122, 3);
        setIntElement(term119340, 123, 3);
        setIntElement(term119340, 124, 3);
        setIntElement(term119340, 125, 3);
        setIntElement(term119340, 126, 3);
        setIntElement(term119340, 127, 3);
        setIntElement(term119340, -2147483537, 3);
        setField(term119564, term119564.getClass(), "stack", term119340);
        setField(term119564, term119564.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term119564, args);
    }

};


