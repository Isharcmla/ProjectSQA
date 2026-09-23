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

public class JsonWriter_beforeName_1433433393280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129467;

    public JsonWriter_beforeName_1433433393280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129467 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term129243 = (int[]) newIntArray(128);
        Object term129519 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setIntField(term129467, term129467.getClass(), "stackSize", -2147483536);
        setIntElement(term129243, 0, 5);
        setIntElement(term129243, 1, 5);
        setIntElement(term129243, 2, 5);
        setIntElement(term129243, 3, 5);
        setIntElement(term129243, 4, 5);
        setIntElement(term129243, 5, 5);
        setIntElement(term129243, 6, 5);
        setIntElement(term129243, 7, 5);
        setIntElement(term129243, 8, 5);
        setIntElement(term129243, 9, 5);
        setIntElement(term129243, 10, 5);
        setIntElement(term129243, 11, 5);
        setIntElement(term129243, 12, 5);
        setIntElement(term129243, 13, 5);
        setIntElement(term129243, 14, 5);
        setIntElement(term129243, 15, 5);
        setIntElement(term129243, 16, 5);
        setIntElement(term129243, 17, 5);
        setIntElement(term129243, 18, 5);
        setIntElement(term129243, 19, 5);
        setIntElement(term129243, 20, 5);
        setIntElement(term129243, 21, 5);
        setIntElement(term129243, 22, 5);
        setIntElement(term129243, 23, 5);
        setIntElement(term129243, 24, 5);
        setIntElement(term129243, 25, 5);
        setIntElement(term129243, 26, 5);
        setIntElement(term129243, 27, 5);
        setIntElement(term129243, 28, 5);
        setIntElement(term129243, 29, 5);
        setIntElement(term129243, 30, 5);
        setIntElement(term129243, 31, 5);
        setIntElement(term129243, 32, 5);
        setIntElement(term129243, 33, 5);
        setIntElement(term129243, 34, 5);
        setIntElement(term129243, 35, 5);
        setIntElement(term129243, 36, 5);
        setIntElement(term129243, 37, 5);
        setIntElement(term129243, 38, 5);
        setIntElement(term129243, 39, 5);
        setIntElement(term129243, 40, 5);
        setIntElement(term129243, 41, 5);
        setIntElement(term129243, 42, 5);
        setIntElement(term129243, 43, 5);
        setIntElement(term129243, 44, 5);
        setIntElement(term129243, 45, 5);
        setIntElement(term129243, 46, 5);
        setIntElement(term129243, 47, 5);
        setIntElement(term129243, 48, 5);
        setIntElement(term129243, 49, 5);
        setIntElement(term129243, 50, 5);
        setIntElement(term129243, 51, 5);
        setIntElement(term129243, 52, 5);
        setIntElement(term129243, 53, 5);
        setIntElement(term129243, 54, 5);
        setIntElement(term129243, 55, 5);
        setIntElement(term129243, 56, 5);
        setIntElement(term129243, 57, 5);
        setIntElement(term129243, 58, 5);
        setIntElement(term129243, 59, 5);
        setIntElement(term129243, 60, 5);
        setIntElement(term129243, 61, 5);
        setIntElement(term129243, 62, 5);
        setIntElement(term129243, 63, 5);
        setIntElement(term129243, 64, 5);
        setIntElement(term129243, 65, 5);
        setIntElement(term129243, 66, 5);
        setIntElement(term129243, 67, 5);
        setIntElement(term129243, 68, 5);
        setIntElement(term129243, 69, 5);
        setIntElement(term129243, 70, 5);
        setIntElement(term129243, 71, 5);
        setIntElement(term129243, 72, 5);
        setIntElement(term129243, 73, 5);
        setIntElement(term129243, 74, 5);
        setIntElement(term129243, 75, 5);
        setIntElement(term129243, 76, 5);
        setIntElement(term129243, 77, 5);
        setIntElement(term129243, 78, 5);
        setIntElement(term129243, 79, 5);
        setIntElement(term129243, 80, 5);
        setIntElement(term129243, 81, 5);
        setIntElement(term129243, 82, 5);
        setIntElement(term129243, 83, 5);
        setIntElement(term129243, 84, 5);
        setIntElement(term129243, 85, 5);
        setIntElement(term129243, 86, 5);
        setIntElement(term129243, 87, 5);
        setIntElement(term129243, 88, 5);
        setIntElement(term129243, 89, 5);
        setIntElement(term129243, 90, 5);
        setIntElement(term129243, 91, 5);
        setIntElement(term129243, 92, 5);
        setIntElement(term129243, 93, 5);
        setIntElement(term129243, 94, 5);
        setIntElement(term129243, 95, 5);
        setIntElement(term129243, 96, 5);
        setIntElement(term129243, 97, 5);
        setIntElement(term129243, 98, 5);
        setIntElement(term129243, 99, 5);
        setIntElement(term129243, 100, 5);
        setIntElement(term129243, 101, 5);
        setIntElement(term129243, 102, 5);
        setIntElement(term129243, 103, 5);
        setIntElement(term129243, 104, 5);
        setIntElement(term129243, 105, 5);
        setIntElement(term129243, 106, 5);
        setIntElement(term129243, 107, 5);
        setIntElement(term129243, 108, 5);
        setIntElement(term129243, 109, 5);
        setIntElement(term129243, 110, 5);
        setIntElement(term129243, 111, 5);
        setIntElement(term129243, 112, 5);
        setIntElement(term129243, 113, 5);
        setIntElement(term129243, 114, 5);
        setIntElement(term129243, 115, 5);
        setIntElement(term129243, 116, 5);
        setIntElement(term129243, 117, 5);
        setIntElement(term129243, 118, 5);
        setIntElement(term129243, 119, 5);
        setIntElement(term129243, 120, 5);
        setIntElement(term129243, 121, 5);
        setIntElement(term129243, 122, 5);
        setIntElement(term129243, 123, 5);
        setIntElement(term129243, 124, 5);
        setIntElement(term129243, 125, 5);
        setIntElement(term129243, 126, 5);
        setIntElement(term129243, 127, 5);
        setIntElement(term129243, -2147483537, 5);
        setField(term129467, term129467.getClass(), "stack", term129243);
        setField(term129467, term129467.getClass(), "out", term129519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term129467, args);
    }

};


