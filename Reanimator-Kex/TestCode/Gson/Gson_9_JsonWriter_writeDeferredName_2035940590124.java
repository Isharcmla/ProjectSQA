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

public class JsonWriter_writeDeferredName_2035940590124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29678;

    public JsonWriter_writeDeferredName_2035940590124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29678 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term28819 = (int[]) newIntArray(768);
        setField(term29678, term29678.getClass(), "deferredName", "");
        setIntField(term29678, term29678.getClass(), "stackSize", 360);
        setField(term29678, term29678.getClass(), "stack", term28819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term29678, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


