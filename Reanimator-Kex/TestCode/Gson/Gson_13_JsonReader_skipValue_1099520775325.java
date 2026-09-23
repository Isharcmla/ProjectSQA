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

public class JsonReader_skipValue_1099520775325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297802;

    public JsonReader_skipValue_1099520775325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297802 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term297716 = (int[]) newIntArray(0);
        setIntField(term297802, term297802.getClass(), "peeked", 3);
        setIntField(term297802, term297802.getClass(), "stackSize", 0);
        setField(term297802, term297802.getClass(), "stack", term297716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipValue", argTypes, term297802, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


