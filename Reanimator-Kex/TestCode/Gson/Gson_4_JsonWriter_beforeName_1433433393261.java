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

public class JsonWriter_beforeName_1433433393261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117047;

    public JsonWriter_beforeName_1433433393261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117047 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term116823 = (int[]) newIntArray(128);
        setIntField(term117047, term117047.getClass(), "stackSize", -2147483536);
        setIntElement(term116823, 0, 3);
        setIntElement(term116823, 1, 3);
        setIntElement(term116823, 2, 3);
        setIntElement(term116823, 3, 3);
        setIntElement(term116823, 4, 3);
        setIntElement(term116823, 5, 3);
        setIntElement(term116823, 6, 3);
        setIntElement(term116823, 7, 3);
        setIntElement(term116823, 8, 3);
        setIntElement(term116823, 9, 3);
        setIntElement(term116823, 10, 3);
        setIntElement(term116823, 11, 3);
        setIntElement(term116823, 12, 3);
        setIntElement(term116823, 13, 3);
        setIntElement(term116823, 14, 3);
        setIntElement(term116823, 15, 3);
        setIntElement(term116823, 16, 3);
        setIntElement(term116823, 17, 3);
        setIntElement(term116823, 18, 3);
        setIntElement(term116823, 19, 3);
        setIntElement(term116823, 20, 3);
        setIntElement(term116823, 21, 3);
        setIntElement(term116823, 22, 3);
        setIntElement(term116823, 23, 3);
        setIntElement(term116823, 24, 3);
        setIntElement(term116823, 25, 3);
        setIntElement(term116823, 26, 3);
        setIntElement(term116823, 27, 3);
        setIntElement(term116823, 28, 3);
        setIntElement(term116823, 29, 3);
        setIntElement(term116823, 30, 3);
        setIntElement(term116823, 31, 3);
        setIntElement(term116823, 32, 3);
        setIntElement(term116823, 33, 3);
        setIntElement(term116823, 34, 3);
        setIntElement(term116823, 35, 3);
        setIntElement(term116823, 36, 3);
        setIntElement(term116823, 37, 3);
        setIntElement(term116823, 38, 3);
        setIntElement(term116823, 39, 3);
        setIntElement(term116823, 40, 3);
        setIntElement(term116823, 41, 3);
        setIntElement(term116823, 42, 3);
        setIntElement(term116823, 43, 3);
        setIntElement(term116823, 44, 3);
        setIntElement(term116823, 45, 3);
        setIntElement(term116823, 46, 3);
        setIntElement(term116823, 47, 3);
        setIntElement(term116823, 48, 3);
        setIntElement(term116823, 49, 3);
        setIntElement(term116823, 50, 3);
        setIntElement(term116823, 51, 3);
        setIntElement(term116823, 52, 3);
        setIntElement(term116823, 53, 3);
        setIntElement(term116823, 54, 3);
        setIntElement(term116823, 55, 3);
        setIntElement(term116823, 56, 3);
        setIntElement(term116823, 57, 3);
        setIntElement(term116823, 58, 3);
        setIntElement(term116823, 59, 3);
        setIntElement(term116823, 60, 3);
        setIntElement(term116823, 61, 3);
        setIntElement(term116823, 62, 3);
        setIntElement(term116823, 63, 3);
        setIntElement(term116823, 64, 3);
        setIntElement(term116823, 65, 3);
        setIntElement(term116823, 66, 3);
        setIntElement(term116823, 67, 3);
        setIntElement(term116823, 68, 3);
        setIntElement(term116823, 69, 3);
        setIntElement(term116823, 70, 3);
        setIntElement(term116823, 71, 3);
        setIntElement(term116823, 72, 3);
        setIntElement(term116823, 73, 3);
        setIntElement(term116823, 74, 3);
        setIntElement(term116823, 75, 3);
        setIntElement(term116823, 76, 3);
        setIntElement(term116823, 77, 3);
        setIntElement(term116823, 78, 3);
        setIntElement(term116823, 79, 3);
        setIntElement(term116823, 80, 3);
        setIntElement(term116823, 81, 3);
        setIntElement(term116823, 82, 3);
        setIntElement(term116823, 83, 3);
        setIntElement(term116823, 84, 3);
        setIntElement(term116823, 85, 3);
        setIntElement(term116823, 86, 3);
        setIntElement(term116823, 87, 3);
        setIntElement(term116823, 88, 3);
        setIntElement(term116823, 89, 3);
        setIntElement(term116823, 90, 3);
        setIntElement(term116823, 91, 3);
        setIntElement(term116823, 92, 3);
        setIntElement(term116823, 93, 3);
        setIntElement(term116823, 94, 3);
        setIntElement(term116823, 95, 3);
        setIntElement(term116823, 96, 3);
        setIntElement(term116823, 97, 3);
        setIntElement(term116823, 98, 3);
        setIntElement(term116823, 99, 3);
        setIntElement(term116823, 100, 3);
        setIntElement(term116823, 101, 3);
        setIntElement(term116823, 102, 3);
        setIntElement(term116823, 103, 3);
        setIntElement(term116823, 104, 3);
        setIntElement(term116823, 105, 3);
        setIntElement(term116823, 106, 3);
        setIntElement(term116823, 107, 3);
        setIntElement(term116823, 108, 3);
        setIntElement(term116823, 109, 3);
        setIntElement(term116823, 110, 3);
        setIntElement(term116823, 111, 3);
        setIntElement(term116823, 112, 3);
        setIntElement(term116823, 113, 3);
        setIntElement(term116823, 114, 3);
        setIntElement(term116823, 115, 3);
        setIntElement(term116823, 116, 3);
        setIntElement(term116823, 117, 3);
        setIntElement(term116823, 118, 3);
        setIntElement(term116823, 119, 3);
        setIntElement(term116823, 120, 3);
        setIntElement(term116823, 121, 3);
        setIntElement(term116823, 122, 3);
        setIntElement(term116823, 123, 3);
        setIntElement(term116823, 124, 3);
        setIntElement(term116823, 125, 3);
        setIntElement(term116823, 126, 3);
        setIntElement(term116823, 127, 3);
        setIntElement(term116823, -2147483537, 3);
        setField(term117047, term117047.getClass(), "stack", term116823);
        setField(term117047, term117047.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforeName", argTypes, term117047, args);
    }

};


