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

public class JsonWriter_open_1875381156244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88083;

    public JsonWriter_open_1875381156244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88083 = newInstance(Class.forName("com.google.gson.stream.JsonWriter"));
        int[] term87986 = (int[]) newIntArray(8);
        setIntField(term88083, term88083.getClass(), "stackSize", 8);
        setIntElement(term87986, 0, 2);
        setIntElement(term87986, 1, 2);
        setIntElement(term87986, 2, 2);
        setIntElement(term87986, 3, 2);
        setIntElement(term87986, 4, 2);
        setIntElement(term87986, 5, 2);
        setIntElement(term87986, 6, 2);
        setIntElement(term87986, 7, 2);
        setField(term88083, term88083.getClass(), "stack", term87986);
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
            callMethod(klass, "open", argTypes, term88083, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


