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

public class JsonWriter_writeDeferredName_2035940590429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257309;

    public JsonWriter_writeDeferredName_2035940590429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257309 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term257082 = (int[]) newIntArray(128);
        Object term257387 = newInstance(Class.forName("java.io.Console$3"));
        setField(term257309, term257309.getClass(), "deferredName", "");
        setIntField(term257309, term257309.getClass(), "stackSize", 112);
        setIntElement(term257082, 0, 5);
        setIntElement(term257082, 1, 5);
        setIntElement(term257082, 2, 5);
        setIntElement(term257082, 3, 5);
        setIntElement(term257082, 4, 5);
        setIntElement(term257082, 5, 5);
        setIntElement(term257082, 6, 5);
        setIntElement(term257082, 7, 5);
        setIntElement(term257082, 8, 5);
        setIntElement(term257082, 9, 5);
        setIntElement(term257082, 10, 5);
        setIntElement(term257082, 11, 5);
        setIntElement(term257082, 12, 5);
        setIntElement(term257082, 13, 5);
        setIntElement(term257082, 14, 5);
        setIntElement(term257082, 15, 5);
        setIntElement(term257082, 16, 5);
        setIntElement(term257082, 17, 5);
        setIntElement(term257082, 18, 5);
        setIntElement(term257082, 19, 5);
        setIntElement(term257082, 20, 5);
        setIntElement(term257082, 21, 5);
        setIntElement(term257082, 22, 5);
        setIntElement(term257082, 23, 5);
        setIntElement(term257082, 24, 5);
        setIntElement(term257082, 25, 5);
        setIntElement(term257082, 26, 5);
        setIntElement(term257082, 27, 5);
        setIntElement(term257082, 28, 5);
        setIntElement(term257082, 29, 5);
        setIntElement(term257082, 30, 5);
        setIntElement(term257082, 31, 5);
        setIntElement(term257082, 32, 5);
        setIntElement(term257082, 33, 5);
        setIntElement(term257082, 34, 5);
        setIntElement(term257082, 35, 5);
        setIntElement(term257082, 36, 5);
        setIntElement(term257082, 37, 5);
        setIntElement(term257082, 38, 5);
        setIntElement(term257082, 39, 5);
        setIntElement(term257082, 40, 5);
        setIntElement(term257082, 41, 5);
        setIntElement(term257082, 42, 5);
        setIntElement(term257082, 43, 5);
        setIntElement(term257082, 44, 5);
        setIntElement(term257082, 45, 5);
        setIntElement(term257082, 46, 5);
        setIntElement(term257082, 47, 5);
        setIntElement(term257082, 48, 5);
        setIntElement(term257082, 49, 5);
        setIntElement(term257082, 50, 5);
        setIntElement(term257082, 51, 5);
        setIntElement(term257082, 52, 5);
        setIntElement(term257082, 53, 5);
        setIntElement(term257082, 54, 5);
        setIntElement(term257082, 55, 5);
        setIntElement(term257082, 56, 5);
        setIntElement(term257082, 57, 5);
        setIntElement(term257082, 58, 5);
        setIntElement(term257082, 59, 5);
        setIntElement(term257082, 60, 5);
        setIntElement(term257082, 61, 5);
        setIntElement(term257082, 62, 5);
        setIntElement(term257082, 63, 5);
        setIntElement(term257082, 64, 5);
        setIntElement(term257082, 65, 5);
        setIntElement(term257082, 66, 5);
        setIntElement(term257082, 67, 5);
        setIntElement(term257082, 68, 5);
        setIntElement(term257082, 69, 5);
        setIntElement(term257082, 70, 5);
        setIntElement(term257082, 71, 5);
        setIntElement(term257082, 72, 5);
        setIntElement(term257082, 73, 5);
        setIntElement(term257082, 74, 5);
        setIntElement(term257082, 75, 5);
        setIntElement(term257082, 76, 5);
        setIntElement(term257082, 77, 5);
        setIntElement(term257082, 78, 5);
        setIntElement(term257082, 79, 5);
        setIntElement(term257082, 80, 5);
        setIntElement(term257082, 81, 5);
        setIntElement(term257082, 82, 5);
        setIntElement(term257082, 83, 5);
        setIntElement(term257082, 84, 5);
        setIntElement(term257082, 85, 5);
        setIntElement(term257082, 86, 5);
        setIntElement(term257082, 87, 5);
        setIntElement(term257082, 88, 5);
        setIntElement(term257082, 89, 5);
        setIntElement(term257082, 90, 5);
        setIntElement(term257082, 91, 5);
        setIntElement(term257082, 92, 5);
        setIntElement(term257082, 93, 5);
        setIntElement(term257082, 94, 5);
        setIntElement(term257082, 95, 5);
        setIntElement(term257082, 96, 5);
        setIntElement(term257082, 97, 5);
        setIntElement(term257082, 98, 5);
        setIntElement(term257082, 99, 5);
        setIntElement(term257082, 100, 5);
        setIntElement(term257082, 101, 5);
        setIntElement(term257082, 102, 5);
        setIntElement(term257082, 103, 5);
        setIntElement(term257082, 104, 5);
        setIntElement(term257082, 105, 5);
        setIntElement(term257082, 106, 5);
        setIntElement(term257082, 107, 5);
        setIntElement(term257082, 108, 5);
        setIntElement(term257082, 109, 5);
        setIntElement(term257082, 110, 5);
        setIntElement(term257082, 111, 5);
        setIntElement(term257082, 112, 5);
        setIntElement(term257082, 113, 5);
        setIntElement(term257082, 114, 5);
        setIntElement(term257082, 115, 5);
        setIntElement(term257082, 116, 5);
        setIntElement(term257082, 117, 5);
        setIntElement(term257082, 118, 5);
        setIntElement(term257082, 119, 5);
        setIntElement(term257082, 120, 5);
        setIntElement(term257082, 121, 5);
        setIntElement(term257082, 122, 5);
        setIntElement(term257082, 123, 5);
        setIntElement(term257082, 124, 5);
        setIntElement(term257082, 125, 5);
        setIntElement(term257082, 126, 5);
        setIntElement(term257082, 127, 5);
        setField(term257309, term257309.getClass(), "stack", term257082);
        setField(term257309, term257309.getClass(), "out", term257387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term257309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


