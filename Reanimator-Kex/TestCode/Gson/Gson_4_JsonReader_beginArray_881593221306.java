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

public class JsonReader_beginArray_881593221306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99992;

    public JsonReader_beginArray_881593221306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99992 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term99796 = (int[]) newIntArray(1);
        setIntField(term99992, term99992.getClass(), "peeked", 6);
        setIntField(term99992, term99992.getClass(), "lineNumber", 0);
        setIntField(term99992, term99992.getClass(), "pos", 0);
        setIntField(term99992, term99992.getClass(), "lineStart", 0);
        setIntField(term99992, term99992.getClass(), "stackSize", 1);
        setIntElement(term99796, 0, 66);
        setField(term99992, term99992.getClass(), "stack", term99796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginArray", argTypes, term99992, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


