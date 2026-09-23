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

public class JsonWriter_push_1969917633488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318642;
     Object term333159;

    public JsonWriter_push_1969917633488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318642 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term318541 = (int[]) newIntArray(1);
        setIntField(term318642, term318642.getClass(), "stackSize", 1);
        setField(term318642, term318642.getClass(), "stack", term318541);
        term333159 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term333160 = (int[]) newIntArray(2);
        setField(term333159, term333159.getClass(), "out", null);
        setField(term333159, term333159.getClass(), "stack", term333160);
        setIntField(term333159, term333159.getClass(), "stackSize", 2);
        setField(term333159, term333159.getClass(), "indent", null);
        setField(term333159, term333159.getClass(), "separator", null);
        setBooleanField(term333159, term333159.getClass(), "lenient", false);
        setBooleanField(term333159, term333159.getClass(), "htmlSafe", false);
        setField(term333159, term333159.getClass(), "deferredName", null);
        setBooleanField(term333159, term333159.getClass(), "serializeNulls", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "push", argTypes, term318642, args);
        assertTrue(recursiveEquals(term318642, term333159));
    }

};


