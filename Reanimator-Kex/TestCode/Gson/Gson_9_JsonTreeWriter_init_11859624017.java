package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class JsonTreeWriter_init_11859624017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2438;

    public JsonTreeWriter_init_11859624017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2439 = new ArrayList();
        term2438 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter"));
        Object term2441 = newInstance(Class.forName("com.google.gson.JsonNull"));
        Object term2442 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeWriter$1"));
        int[] term2443 = (int[]) newIntArray(32);
        setField(term2438, term2438.getClass(), "stack", term2439);
        setField(term2438, term2438.getClass(), "pendingName", null);
        setField(term2438, term2438.getClass(), "product", term2441);
        setField(term2442, term2442.getClass(), "writeBuffer", null);
        setField(term2442, term2442.getClass(), "lock", term2442);
        setField(term2438, term2438.getClass(), "out", term2442);
        setIntElement(term2443, 0, 6);
        setField(term2438, term2438.getClass(), "stack", term2443);
        setIntField(term2438, term2438.getClass(), "stackSize", 1);
        setField(term2438, term2438.getClass(), "indent", null);
        setField(term2438, term2438.getClass(), "separator", ":");
        setBooleanField(term2438, term2438.getClass(), "lenient", false);
        setBooleanField(term2438, term2438.getClass(), "htmlSafe", false);
        setField(term2438, term2438.getClass(), "deferredName", null);
        setBooleanField(term2438, term2438.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2438));
    }

};


