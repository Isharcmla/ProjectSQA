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
import java.lang.Object;

public class JsonWriter_open_1875381156365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215648;

    public JsonWriter_open_1875381156365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215648 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term213567 = (int[]) newIntArray(245);
        Object term215688 = newInstance(Class.forName("java.io.Console$3"));
        setIntField(term215648, term215648.getClass(), "stackSize", 245);
        setIntElement(term213567, 244, 1);
        setField(term215648, term215648.getClass(), "stack", term213567);
        setField(term215648, term215648.getClass(), "indent", null);
        setField(term215648, term215648.getClass(), "out", term215688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonWriter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        try {
            callMethod(klass, "open", argTypes, term215648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


