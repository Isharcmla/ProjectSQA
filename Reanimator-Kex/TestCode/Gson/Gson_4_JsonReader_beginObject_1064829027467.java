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

public class JsonReader_beginObject_1064829027467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197577;

    public JsonReader_beginObject_1064829027467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197577 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term196889 = (int[]) newIntArray(492);
        setIntField(term197577, term197577.getClass(), "peeked", 9);
        setIntField(term197577, term197577.getClass(), "lineNumber", 0);
        setIntField(term197577, term197577.getClass(), "pos", 0);
        setIntField(term197577, term197577.getClass(), "lineStart", 0);
        setIntField(term197577, term197577.getClass(), "stackSize", 1);
        setIntElement(term196889, 0, 2);
        setField(term197577, term197577.getClass(), "stack", term196889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "beginObject", argTypes, term197577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


