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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsonReader_syntaxError_824930160492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746935;

    public JsonReader_syntaxError_824930160492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term746935 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term743306 = (int[]) newIntArray(495);
        int[] term744795 = (int[]) newIntArray(491);
        setIntField(term746935, term746935.getClass(), "lineNumber", 0);
        setIntField(term746935, term746935.getClass(), "pos", 0);
        setIntField(term746935, term746935.getClass(), "lineStart", 0);
        setIntField(term746935, term746935.getClass(), "stackSize", 7);
        setIntElement(term743306, 0, -752870423);
        setIntElement(term743306, 1, -1698809299);
        setIntElement(term743306, 2, 2);
        setIntElement(term743306, 5, 6);
        setField(term746935, term746935.getClass(), "stack", term743306);
        setIntElement(term744795, 0, 32);
        setIntElement(term744795, 1, 97);
        setIntElement(term744795, 2, 116);
        setIntElement(term744795, 3, 32);
        setIntElement(term744795, 4, 108);
        setIntElement(term744795, 5, 105);
        setIntElement(term744795, 6, 110);
        setIntElement(term744795, 7, 101);
        setIntElement(term744795, 8, 32);
        setField(term746935, term746935.getClass(), "pathIndices", term744795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term746935, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


