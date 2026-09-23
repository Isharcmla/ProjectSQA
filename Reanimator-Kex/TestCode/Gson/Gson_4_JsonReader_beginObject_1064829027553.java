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

public class JsonReader_beginObject_1064829027553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286593;

    public JsonReader_beginObject_1064829027553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286593 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term285905 = (int[]) newIntArray(492);
        setIntField(term286593, term286593.getClass(), "peeked", 9);
        setIntField(term286593, term286593.getClass(), "lineNumber", 0);
        setIntField(term286593, term286593.getClass(), "pos", 0);
        setIntField(term286593, term286593.getClass(), "lineStart", 0);
        setIntField(term286593, term286593.getClass(), "stackSize", 1);
        setIntElement(term285905, 0, 6);
        setField(term286593, term286593.getClass(), "stack", term285905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term286593, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


