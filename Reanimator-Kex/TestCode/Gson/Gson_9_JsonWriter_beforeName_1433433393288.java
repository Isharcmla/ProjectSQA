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

public class JsonWriter_beforeName_1433433393288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124113;

    public JsonWriter_beforeName_1433433393288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124113 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term123889 = (int[]) newIntArray(128);
        Object term124157 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term124113, term124113.getClass(), "stackSize", -2147483536);
        setIntElement(term123889, 0, 5);
        setIntElement(term123889, 1, 5);
        setIntElement(term123889, 2, 5);
        setIntElement(term123889, 3, 5);
        setIntElement(term123889, 4, 5);
        setIntElement(term123889, 5, 5);
        setIntElement(term123889, 6, 5);
        setIntElement(term123889, 7, 5);
        setIntElement(term123889, 8, 5);
        setIntElement(term123889, 9, 5);
        setIntElement(term123889, 10, 5);
        setIntElement(term123889, 11, 5);
        setIntElement(term123889, 12, 5);
        setIntElement(term123889, 13, 5);
        setIntElement(term123889, 14, 5);
        setIntElement(term123889, 15, 5);
        setIntElement(term123889, 16, 5);
        setIntElement(term123889, 17, 5);
        setIntElement(term123889, 18, 5);
        setIntElement(term123889, 19, 5);
        setIntElement(term123889, 20, 5);
        setIntElement(term123889, 21, 5);
        setIntElement(term123889, 22, 5);
        setIntElement(term123889, 23, 5);
        setIntElement(term123889, 24, 5);
        setIntElement(term123889, 25, 5);
        setIntElement(term123889, 26, 5);
        setIntElement(term123889, 27, 5);
        setIntElement(term123889, 28, 5);
        setIntElement(term123889, 29, 5);
        setIntElement(term123889, 30, 5);
        setIntElement(term123889, 31, 5);
        setIntElement(term123889, 32, 5);
        setIntElement(term123889, 33, 5);
        setIntElement(term123889, 34, 5);
        setIntElement(term123889, 35, 5);
        setIntElement(term123889, 36, 5);
        setIntElement(term123889, 37, 5);
        setIntElement(term123889, 38, 5);
        setIntElement(term123889, 39, 5);
        setIntElement(term123889, 40, 5);
        setIntElement(term123889, 41, 5);
        setIntElement(term123889, 42, 5);
        setIntElement(term123889, 43, 5);
        setIntElement(term123889, 44, 5);
        setIntElement(term123889, 45, 5);
        setIntElement(term123889, 46, 5);
        setIntElement(term123889, 47, 5);
        setIntElement(term123889, 48, 5);
        setIntElement(term123889, 49, 5);
        setIntElement(term123889, 50, 5);
        setIntElement(term123889, 51, 5);
        setIntElement(term123889, 52, 5);
        setIntElement(term123889, 53, 5);
        setIntElement(term123889, 54, 5);
        setIntElement(term123889, 55, 5);
        setIntElement(term123889, 56, 5);
        setIntElement(term123889, 57, 5);
        setIntElement(term123889, 58, 5);
        setIntElement(term123889, 59, 5);
        setIntElement(term123889, 60, 5);
        setIntElement(term123889, 61, 5);
        setIntElement(term123889, 62, 5);
        setIntElement(term123889, 63, 5);
        setIntElement(term123889, 64, 5);
        setIntElement(term123889, 65, 5);
        setIntElement(term123889, 66, 5);
        setIntElement(term123889, 67, 5);
        setIntElement(term123889, 68, 5);
        setIntElement(term123889, 69, 5);
        setIntElement(term123889, 70, 5);
        setIntElement(term123889, 71, 5);
        setIntElement(term123889, 72, 5);
        setIntElement(term123889, 73, 5);
        setIntElement(term123889, 74, 5);
        setIntElement(term123889, 75, 5);
        setIntElement(term123889, 76, 5);
        setIntElement(term123889, 77, 5);
        setIntElement(term123889, 78, 5);
        setIntElement(term123889, 79, 5);
        setIntElement(term123889, 80, 5);
        setIntElement(term123889, 81, 5);
        setIntElement(term123889, 82, 5);
        setIntElement(term123889, 83, 5);
        setIntElement(term123889, 84, 5);
        setIntElement(term123889, 85, 5);
        setIntElement(term123889, 86, 5);
        setIntElement(term123889, 87, 5);
        setIntElement(term123889, 88, 5);
        setIntElement(term123889, 89, 5);
        setIntElement(term123889, 90, 5);
        setIntElement(term123889, 91, 5);
        setIntElement(term123889, 92, 5);
        setIntElement(term123889, 93, 5);
        setIntElement(term123889, 94, 5);
        setIntElement(term123889, 95, 5);
        setIntElement(term123889, 96, 5);
        setIntElement(term123889, 97, 5);
        setIntElement(term123889, 98, 5);
        setIntElement(term123889, 99, 5);
        setIntElement(term123889, 100, 5);
        setIntElement(term123889, 101, 5);
        setIntElement(term123889, 102, 5);
        setIntElement(term123889, 103, 5);
        setIntElement(term123889, 104, 5);
        setIntElement(term123889, 105, 5);
        setIntElement(term123889, 106, 5);
        setIntElement(term123889, 107, 5);
        setIntElement(term123889, 108, 5);
        setIntElement(term123889, 109, 5);
        setIntElement(term123889, 110, 5);
        setIntElement(term123889, 111, 5);
        setIntElement(term123889, 112, 5);
        setIntElement(term123889, 113, 5);
        setIntElement(term123889, 114, 5);
        setIntElement(term123889, 115, 5);
        setIntElement(term123889, 116, 5);
        setIntElement(term123889, 117, 5);
        setIntElement(term123889, 118, 5);
        setIntElement(term123889, 119, 5);
        setIntElement(term123889, 120, 5);
        setIntElement(term123889, 121, 5);
        setIntElement(term123889, 122, 5);
        setIntElement(term123889, 123, 5);
        setIntElement(term123889, 124, 5);
        setIntElement(term123889, 125, 5);
        setIntElement(term123889, 126, 5);
        setIntElement(term123889, 127, 5);
        setIntElement(term123889, -2147483537, 5);
        setField(term124113, term124113.getClass(), "stack", term123889);
        setField(term124113, term124113.getClass(), "out", term124157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term124113, args);
    }

};


