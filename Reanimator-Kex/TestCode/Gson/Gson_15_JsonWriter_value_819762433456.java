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

public class JsonWriter_value_819762433456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243798;

    public JsonWriter_value_819762433456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243798 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term243571 = (int[]) newIntArray(128);
        Object term243878 = newInstance(Class.forName("java.io.FileWriter"));
        setField(term243798, term243798.getClass(), "deferredName", "");
        setIntField(term243798, term243798.getClass(), "stackSize", 112);
        setIntElement(term243571, 0, 5);
        setIntElement(term243571, 1, 5);
        setIntElement(term243571, 2, 5);
        setIntElement(term243571, 3, 5);
        setIntElement(term243571, 4, 5);
        setIntElement(term243571, 5, 5);
        setIntElement(term243571, 6, 5);
        setIntElement(term243571, 7, 5);
        setIntElement(term243571, 8, 5);
        setIntElement(term243571, 9, 5);
        setIntElement(term243571, 10, 5);
        setIntElement(term243571, 11, 5);
        setIntElement(term243571, 12, 5);
        setIntElement(term243571, 13, 5);
        setIntElement(term243571, 14, 5);
        setIntElement(term243571, 15, 5);
        setIntElement(term243571, 16, 5);
        setIntElement(term243571, 17, 5);
        setIntElement(term243571, 18, 5);
        setIntElement(term243571, 19, 5);
        setIntElement(term243571, 20, 5);
        setIntElement(term243571, 21, 5);
        setIntElement(term243571, 22, 5);
        setIntElement(term243571, 23, 5);
        setIntElement(term243571, 24, 5);
        setIntElement(term243571, 25, 5);
        setIntElement(term243571, 26, 5);
        setIntElement(term243571, 27, 5);
        setIntElement(term243571, 28, 5);
        setIntElement(term243571, 29, 5);
        setIntElement(term243571, 30, 5);
        setIntElement(term243571, 31, 5);
        setIntElement(term243571, 32, 5);
        setIntElement(term243571, 33, 5);
        setIntElement(term243571, 34, 5);
        setIntElement(term243571, 35, 5);
        setIntElement(term243571, 36, 5);
        setIntElement(term243571, 37, 5);
        setIntElement(term243571, 38, 5);
        setIntElement(term243571, 39, 5);
        setIntElement(term243571, 40, 5);
        setIntElement(term243571, 41, 5);
        setIntElement(term243571, 42, 5);
        setIntElement(term243571, 43, 5);
        setIntElement(term243571, 44, 5);
        setIntElement(term243571, 45, 5);
        setIntElement(term243571, 46, 5);
        setIntElement(term243571, 47, 5);
        setIntElement(term243571, 48, 5);
        setIntElement(term243571, 49, 5);
        setIntElement(term243571, 50, 5);
        setIntElement(term243571, 51, 5);
        setIntElement(term243571, 52, 5);
        setIntElement(term243571, 53, 5);
        setIntElement(term243571, 54, 5);
        setIntElement(term243571, 55, 5);
        setIntElement(term243571, 56, 5);
        setIntElement(term243571, 57, 5);
        setIntElement(term243571, 58, 5);
        setIntElement(term243571, 59, 5);
        setIntElement(term243571, 60, 5);
        setIntElement(term243571, 61, 5);
        setIntElement(term243571, 62, 5);
        setIntElement(term243571, 63, 5);
        setIntElement(term243571, 64, 5);
        setIntElement(term243571, 65, 5);
        setIntElement(term243571, 66, 5);
        setIntElement(term243571, 67, 5);
        setIntElement(term243571, 68, 5);
        setIntElement(term243571, 69, 5);
        setIntElement(term243571, 70, 5);
        setIntElement(term243571, 71, 5);
        setIntElement(term243571, 72, 5);
        setIntElement(term243571, 73, 5);
        setIntElement(term243571, 74, 5);
        setIntElement(term243571, 75, 5);
        setIntElement(term243571, 76, 5);
        setIntElement(term243571, 77, 5);
        setIntElement(term243571, 78, 5);
        setIntElement(term243571, 79, 5);
        setIntElement(term243571, 80, 5);
        setIntElement(term243571, 81, 5);
        setIntElement(term243571, 82, 5);
        setIntElement(term243571, 83, 5);
        setIntElement(term243571, 84, 5);
        setIntElement(term243571, 85, 5);
        setIntElement(term243571, 86, 5);
        setIntElement(term243571, 87, 5);
        setIntElement(term243571, 88, 5);
        setIntElement(term243571, 89, 5);
        setIntElement(term243571, 90, 5);
        setIntElement(term243571, 91, 5);
        setIntElement(term243571, 92, 5);
        setIntElement(term243571, 93, 5);
        setIntElement(term243571, 94, 5);
        setIntElement(term243571, 95, 5);
        setIntElement(term243571, 96, 5);
        setIntElement(term243571, 97, 5);
        setIntElement(term243571, 98, 5);
        setIntElement(term243571, 99, 5);
        setIntElement(term243571, 100, 5);
        setIntElement(term243571, 101, 5);
        setIntElement(term243571, 102, 5);
        setIntElement(term243571, 103, 5);
        setIntElement(term243571, 104, 5);
        setIntElement(term243571, 105, 5);
        setIntElement(term243571, 106, 5);
        setIntElement(term243571, 107, 5);
        setIntElement(term243571, 108, 5);
        setIntElement(term243571, 109, 5);
        setIntElement(term243571, 110, 5);
        setIntElement(term243571, 111, 5);
        setIntElement(term243571, 112, 5);
        setIntElement(term243571, 113, 5);
        setIntElement(term243571, 114, 5);
        setIntElement(term243571, 115, 5);
        setIntElement(term243571, 116, 5);
        setIntElement(term243571, 117, 5);
        setIntElement(term243571, 118, 5);
        setIntElement(term243571, 119, 5);
        setIntElement(term243571, 120, 5);
        setIntElement(term243571, 121, 5);
        setIntElement(term243571, 122, 5);
        setIntElement(term243571, 123, 5);
        setIntElement(term243571, 124, 5);
        setIntElement(term243571, 125, 5);
        setIntElement(term243571, 126, 5);
        setIntElement(term243571, 127, 5);
        setField(term243798, term243798.getClass(), "stack", term243571);
        setField(term243798, term243798.getClass(), "out", term243878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = 0.0;
        try {
            callMethod(klass, "value", argTypes, term243798, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


