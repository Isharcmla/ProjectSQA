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

public class JsonWriter_push_1969917633344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196843;
     Object term197431;

    public JsonWriter_push_1969917633344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196843 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term196288 = (int[]) newIntArray(232);
        setIntField(term196843, term196843.getClass(), "stackSize", 7);
        setField(term196843, term196843.getClass(), "stack", term196288);
        term197431 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term197432 = (int[]) newIntArray(232);
        setField(term197431, term197431.getClass(), "out", null);
        setField(term197431, term197431.getClass(), "stack", term197432);
        setIntField(term197431, term197431.getClass(), "stackSize", 8);
        setField(term197431, term197431.getClass(), "indent", null);
        setField(term197431, term197431.getClass(), "separator", null);
        setBooleanField(term197431, term197431.getClass(), "lenient", false);
        setBooleanField(term197431, term197431.getClass(), "htmlSafe", false);
        setField(term197431, term197431.getClass(), "deferredName", null);
        setBooleanField(term197431, term197431.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "push", argTypes, term196843, args);
        assertTrue(recursiveEquals(term196843, term197431));
    }

};


