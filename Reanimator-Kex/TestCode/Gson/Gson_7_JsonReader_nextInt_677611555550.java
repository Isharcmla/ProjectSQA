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

public class JsonReader_nextInt_677611555550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226612;

    public JsonReader_nextInt_677611555550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226612 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term226408 = (int[]) newIntArray(1);
        setIntField(term226612, term226612.getClass(), "peeked", 3);
        setIntField(term226612, term226612.getClass(), "lineNumber", 0);
        setIntField(term226612, term226612.getClass(), "pos", 0);
        setIntField(term226612, term226612.getClass(), "lineStart", 0);
        setIntField(term226612, term226612.getClass(), "stackSize", 1);
        setIntElement(term226408, 0, 8);
        setField(term226612, term226612.getClass(), "stack", term226408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextInt", argTypes, term226612, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


