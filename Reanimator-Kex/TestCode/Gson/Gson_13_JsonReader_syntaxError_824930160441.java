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

public class JsonReader_syntaxError_824930160441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551275;

    public JsonReader_syntaxError_824930160441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551275 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term547144 = (int[]) newIntArray(495);
        int[] term548633 = (int[]) newIntArray(491);
        setIntField(term551275, term551275.getClass(), "lineNumber", 0);
        setIntField(term551275, term551275.getClass(), "pos", 0);
        setIntField(term551275, term551275.getClass(), "lineStart", 0);
        setIntField(term551275, term551275.getClass(), "stackSize", 7);
        setIntElement(term547144, 0, -752870423);
        setIntElement(term547144, 1, -1698809299);
        setIntElement(term547144, 2, 2);
        setIntElement(term547144, 6, 4);
        setField(term551275, term551275.getClass(), "stack", term547144);
        setIntElement(term548633, 0, 32);
        setIntElement(term548633, 1, 112);
        setIntElement(term548633, 2, 97);
        setIntElement(term548633, 3, 116);
        setIntElement(term548633, 4, 104);
        setIntElement(term548633, 5, 32);
        setField(term551275, term551275.getClass(), "pathIndices", term548633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term551275, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


