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
import static com.google.gson.stream.EqualityUtils.*;

public class JsonWriter_push_1969917633444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267158;
     Object term267808;

    public JsonWriter_push_1969917633444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267158 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term266603 = (int[]) newIntArray(232);
        setIntField(term267158, term267158.getClass(), "stackSize", 7);
        setField(term267158, term267158.getClass(), "stack", term266603);
        term267808 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term267809 = (int[]) newIntArray(232);
        setField(term267808, term267808.getClass(), "out", null);
        setField(term267808, term267808.getClass(), "stack", term267809);
        setIntField(term267808, term267808.getClass(), "stackSize", 8);
        setField(term267808, term267808.getClass(), "indent", null);
        setField(term267808, term267808.getClass(), "separator", null);
        setBooleanField(term267808, term267808.getClass(), "lenient", false);
        setBooleanField(term267808, term267808.getClass(), "htmlSafe", false);
        setField(term267808, term267808.getClass(), "deferredName", null);
        setBooleanField(term267808, term267808.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "push", argTypes, term267158, args);
        assertTrue(recursiveEquals(term267158, term267808));
    }

};


