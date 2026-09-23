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

public class JsonWriter_writeDeferredName_2035940590311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140171;

    public JsonWriter_writeDeferredName_2035940590311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140171 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term140065 = (int[]) newIntArray(8);
        setField(term140171, term140171.getClass(), "deferredName", "");
        setIntField(term140171, term140171.getClass(), "stackSize", 8);
        setIntElement(term140065, 0, 3);
        setIntElement(term140065, 1, 3);
        setIntElement(term140065, 2, 3);
        setIntElement(term140065, 3, 3);
        setIntElement(term140065, 4, 3);
        setIntElement(term140065, 5, 3);
        setIntElement(term140065, 6, 3);
        setIntElement(term140065, 7, 3);
        setField(term140171, term140171.getClass(), "stack", term140065);
        setField(term140171, term140171.getClass(), "indent", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeDeferredName", argTypes, term140171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


