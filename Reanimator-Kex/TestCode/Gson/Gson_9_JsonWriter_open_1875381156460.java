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

public class JsonWriter_open_1875381156460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276521;

    public JsonWriter_open_1875381156460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276521 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term274439 = (int[]) newIntArray(245);
        Object term276561 = newInstance(Class.forName("java.io.Console$3"));
        setIntField(term276521, term276521.getClass(), "stackSize", 245);
        setIntElement(term274439, 244, 7);
        setField(term276521, term276521.getClass(), "stack", term274439);
        setBooleanField(term276521, term276521.getClass(), "lenient", true);
        setField(term276521, term276521.getClass(), "out", term276561);
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
            callMethod(klass, "open", argTypes, term276521, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


