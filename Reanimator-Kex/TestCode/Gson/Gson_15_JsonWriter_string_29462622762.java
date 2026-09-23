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

public class JsonWriter_string_29462622762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2395;

    public JsonWriter_string_29462622762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2395 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term2396 = (int[]) newIntArray(7);
        setField(term2395, term2395.getClass(), "out", null);
        setIntElement(term2396, 0, 9726679);
        setIntElement(term2396, 1, -25637976);
        setIntElement(term2396, 2, 1555897383);
        setIntElement(term2396, 3, 202001407);
        setIntElement(term2396, 4, 158873461);
        setIntElement(term2396, 5, -430151637);
        setIntElement(term2396, 6, -1697741339);
        setField(term2395, term2395.getClass(), "stack", term2396);
        setIntField(term2395, term2395.getClass(), "stackSize", 98922530);
        setField(term2395, term2395.getClass(), "indent", "swZVeJAxjt");
        setField(term2395, term2395.getClass(), "separator", "xOcJIiQQDu");
        setBooleanField(term2395, term2395.getClass(), "lenient", false);
        setBooleanField(term2395, term2395.getClass(), "htmlSafe", true);
        setField(term2395, term2395.getClass(), "deferredName", "GVizqqzXpy");
        setBooleanField(term2395, term2395.getClass(), "serializeNulls", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        try {
            callMethod(klass, "string", argTypes, term2395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


