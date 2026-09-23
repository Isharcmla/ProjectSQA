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

public class JsonWriter_newline_123838995961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2415;

    public JsonWriter_newline_123838995961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2415 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2416 = (int[]) newIntArray(7);
        setField(term2415, term2415.getClass(), "out", null);
        setIntElement(term2416, 0, 9726679);
        setIntElement(term2416, 1, -25637976);
        setIntElement(term2416, 2, 1555897383);
        setIntElement(term2416, 3, 202001407);
        setIntElement(term2416, 4, 158873461);
        setIntElement(term2416, 5, -430151637);
        setIntElement(term2416, 6, -1697741339);
        setField(term2415, term2415.getClass(), "stack", term2416);
        setIntField(term2415, term2415.getClass(), "stackSize", 98922530);
        setField(term2415, term2415.getClass(), "indent", "xOcJIiQQDu");
        setField(term2415, term2415.getClass(), "separator", "GVizqqzXpy");
        setBooleanField(term2415, term2415.getClass(), "lenient", false);
        setBooleanField(term2415, term2415.getClass(), "htmlSafe", true);
        setField(term2415, term2415.getClass(), "deferredName", "JqXGgAhZPl");
        setBooleanField(term2415, term2415.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "newline", argTypes, term2415, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


