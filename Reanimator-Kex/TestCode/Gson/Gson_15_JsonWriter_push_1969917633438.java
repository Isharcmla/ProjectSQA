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

public class JsonWriter_push_1969917633438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232778;
     Object term233041;

    public JsonWriter_push_1969917633438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232778 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term232677 = (int[]) newIntArray(1);
        setIntField(term232778, term232778.getClass(), "stackSize", 1);
        setField(term232778, term232778.getClass(), "stack", term232677);
        term233041 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term233042 = (int[]) newIntArray(2);
        setField(term233041, term233041.getClass(), "out", null);
        setField(term233041, term233041.getClass(), "stack", term233042);
        setIntField(term233041, term233041.getClass(), "stackSize", 2);
        setField(term233041, term233041.getClass(), "indent", null);
        setField(term233041, term233041.getClass(), "separator", null);
        setBooleanField(term233041, term233041.getClass(), "lenient", false);
        setBooleanField(term233041, term233041.getClass(), "htmlSafe", false);
        setField(term233041, term233041.getClass(), "deferredName", null);
        setBooleanField(term233041, term233041.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "push", argTypes, term232778, args);
        assertTrue(recursiveEquals(term232778, term233041));
    }

};


