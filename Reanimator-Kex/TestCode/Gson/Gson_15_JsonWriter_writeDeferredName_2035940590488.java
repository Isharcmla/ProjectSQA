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
import java.lang.NullPointerException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonWriter_writeDeferredName_2035940590488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294431;

    public JsonWriter_writeDeferredName_2035940590488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294431 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term294204 = (int[]) newIntArray(128);
        Object term294511 = newInstance(Class.forName("java.io.FileWriter"));
        setField(term294431, term294431.getClass(), "deferredName", "");
        setIntField(term294431, term294431.getClass(), "stackSize", 112);
        setIntElement(term294204, 0, 5);
        setIntElement(term294204, 1, 5);
        setIntElement(term294204, 2, 5);
        setIntElement(term294204, 3, 5);
        setIntElement(term294204, 4, 5);
        setIntElement(term294204, 5, 5);
        setIntElement(term294204, 6, 5);
        setIntElement(term294204, 7, 5);
        setIntElement(term294204, 8, 5);
        setIntElement(term294204, 9, 5);
        setIntElement(term294204, 10, 5);
        setIntElement(term294204, 11, 5);
        setIntElement(term294204, 12, 5);
        setIntElement(term294204, 13, 5);
        setIntElement(term294204, 14, 5);
        setIntElement(term294204, 15, 5);
        setIntElement(term294204, 16, 5);
        setIntElement(term294204, 17, 5);
        setIntElement(term294204, 18, 5);
        setIntElement(term294204, 19, 5);
        setIntElement(term294204, 20, 5);
        setIntElement(term294204, 21, 5);
        setIntElement(term294204, 22, 5);
        setIntElement(term294204, 23, 5);
        setIntElement(term294204, 24, 5);
        setIntElement(term294204, 25, 5);
        setIntElement(term294204, 26, 5);
        setIntElement(term294204, 27, 5);
        setIntElement(term294204, 28, 5);
        setIntElement(term294204, 29, 5);
        setIntElement(term294204, 30, 5);
        setIntElement(term294204, 31, 5);
        setIntElement(term294204, 32, 5);
        setIntElement(term294204, 33, 5);
        setIntElement(term294204, 34, 5);
        setIntElement(term294204, 35, 5);
        setIntElement(term294204, 36, 5);
        setIntElement(term294204, 37, 5);
        setIntElement(term294204, 38, 5);
        setIntElement(term294204, 39, 5);
        setIntElement(term294204, 40, 5);
        setIntElement(term294204, 41, 5);
        setIntElement(term294204, 42, 5);
        setIntElement(term294204, 43, 5);
        setIntElement(term294204, 44, 5);
        setIntElement(term294204, 45, 5);
        setIntElement(term294204, 46, 5);
        setIntElement(term294204, 47, 5);
        setIntElement(term294204, 48, 5);
        setIntElement(term294204, 49, 5);
        setIntElement(term294204, 50, 5);
        setIntElement(term294204, 51, 5);
        setIntElement(term294204, 52, 5);
        setIntElement(term294204, 53, 5);
        setIntElement(term294204, 54, 5);
        setIntElement(term294204, 55, 5);
        setIntElement(term294204, 56, 5);
        setIntElement(term294204, 57, 5);
        setIntElement(term294204, 58, 5);
        setIntElement(term294204, 59, 5);
        setIntElement(term294204, 60, 5);
        setIntElement(term294204, 61, 5);
        setIntElement(term294204, 62, 5);
        setIntElement(term294204, 63, 5);
        setIntElement(term294204, 64, 5);
        setIntElement(term294204, 65, 5);
        setIntElement(term294204, 66, 5);
        setIntElement(term294204, 67, 5);
        setIntElement(term294204, 68, 5);
        setIntElement(term294204, 69, 5);
        setIntElement(term294204, 70, 5);
        setIntElement(term294204, 71, 5);
        setIntElement(term294204, 72, 5);
        setIntElement(term294204, 73, 5);
        setIntElement(term294204, 74, 5);
        setIntElement(term294204, 75, 5);
        setIntElement(term294204, 76, 5);
        setIntElement(term294204, 77, 5);
        setIntElement(term294204, 78, 5);
        setIntElement(term294204, 79, 5);
        setIntElement(term294204, 80, 5);
        setIntElement(term294204, 81, 5);
        setIntElement(term294204, 82, 5);
        setIntElement(term294204, 83, 5);
        setIntElement(term294204, 84, 5);
        setIntElement(term294204, 85, 5);
        setIntElement(term294204, 86, 5);
        setIntElement(term294204, 87, 5);
        setIntElement(term294204, 88, 5);
        setIntElement(term294204, 89, 5);
        setIntElement(term294204, 90, 5);
        setIntElement(term294204, 91, 5);
        setIntElement(term294204, 92, 5);
        setIntElement(term294204, 93, 5);
        setIntElement(term294204, 94, 5);
        setIntElement(term294204, 95, 5);
        setIntElement(term294204, 96, 5);
        setIntElement(term294204, 97, 5);
        setIntElement(term294204, 98, 5);
        setIntElement(term294204, 99, 5);
        setIntElement(term294204, 100, 5);
        setIntElement(term294204, 101, 5);
        setIntElement(term294204, 102, 5);
        setIntElement(term294204, 103, 5);
        setIntElement(term294204, 104, 5);
        setIntElement(term294204, 105, 5);
        setIntElement(term294204, 106, 5);
        setIntElement(term294204, 107, 5);
        setIntElement(term294204, 108, 5);
        setIntElement(term294204, 109, 5);
        setIntElement(term294204, 110, 5);
        setIntElement(term294204, 111, 5);
        setIntElement(term294204, 112, 5);
        setIntElement(term294204, 113, 5);
        setIntElement(term294204, 114, 5);
        setIntElement(term294204, 115, 5);
        setIntElement(term294204, 116, 5);
        setIntElement(term294204, 117, 5);
        setIntElement(term294204, 118, 5);
        setIntElement(term294204, 119, 5);
        setIntElement(term294204, 120, 5);
        setIntElement(term294204, 121, 5);
        setIntElement(term294204, 122, 5);
        setIntElement(term294204, 123, 5);
        setIntElement(term294204, 124, 5);
        setIntElement(term294204, 125, 5);
        setIntElement(term294204, 126, 5);
        setIntElement(term294204, 127, 5);
        setField(term294431, term294431.getClass(), "stack", term294204);
        setField(term294431, term294431.getClass(), "out", term294511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term294431, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


