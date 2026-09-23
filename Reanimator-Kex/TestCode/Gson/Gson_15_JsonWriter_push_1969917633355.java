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

public class JsonWriter_push_1969917633355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165142;
     Object term165615;

    public JsonWriter_push_1969917633355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165142 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term164587 = (int[]) newIntArray(232);
        setIntField(term165142, term165142.getClass(), "stackSize", 7);
        setField(term165142, term165142.getClass(), "stack", term164587);
        term165615 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term165616 = (int[]) newIntArray(232);
        setField(term165615, term165615.getClass(), "out", null);
        setField(term165615, term165615.getClass(), "stack", term165616);
        setIntField(term165615, term165615.getClass(), "stackSize", 8);
        setField(term165615, term165615.getClass(), "indent", null);
        setField(term165615, term165615.getClass(), "separator", null);
        setBooleanField(term165615, term165615.getClass(), "lenient", false);
        setBooleanField(term165615, term165615.getClass(), "htmlSafe", false);
        setField(term165615, term165615.getClass(), "deferredName", null);
        setBooleanField(term165615, term165615.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "push", argTypes, term165142, args);
        assertTrue(recursiveEquals(term165142, term165615));
    }

};


