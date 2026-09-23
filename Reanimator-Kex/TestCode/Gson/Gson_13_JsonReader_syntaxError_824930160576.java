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

public class JsonReader_syntaxError_824930160576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1075203;

    public JsonReader_syntaxError_824930160576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1075203 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1071072 = (int[]) newIntArray(495);
        int[] term1072561 = (int[]) newIntArray(491);
        setIntField(term1075203, term1075203.getClass(), "lineNumber", 0);
        setIntField(term1075203, term1075203.getClass(), "pos", 0);
        setIntField(term1075203, term1075203.getClass(), "lineStart", 0);
        setIntField(term1075203, term1075203.getClass(), "stackSize", 7);
        setIntElement(term1071072, 0, -752870423);
        setIntElement(term1071072, 1, -1698809299);
        setIntElement(term1071072, 2, 2);
        setIntElement(term1071072, 3, 7);
        setIntElement(term1071072, 6, 4);
        setField(term1075203, term1075203.getClass(), "stack", term1071072);
        setIntElement(term1072561, 0, 32);
        setIntElement(term1072561, 1, 112);
        setIntElement(term1072561, 2, 97);
        setIntElement(term1072561, 3, 116);
        setIntElement(term1072561, 4, 104);
        setIntElement(term1072561, 5, 32);
        setField(term1075203, term1075203.getClass(), "pathIndices", term1072561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1075203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


