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

public class JsonReader_syntaxError_824930160399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452024;

    public JsonReader_syntaxError_824930160399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452024 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term449416 = (int[]) newIntArray(491);
        setIntField(term452024, term452024.getClass(), "lineNumber", 0);
        setIntField(term452024, term452024.getClass(), "pos", 0);
        setIntField(term452024, term452024.getClass(), "lineStart", 0);
        setIntField(term452024, term452024.getClass(), "stackSize", 7);
        setIntElement(term449416, 0, -752870423);
        setIntElement(term449416, 1, -1698809299);
        setIntElement(term449416, 2, 2);
        setIntElement(term449416, 3, 5);
        setField(term452024, term452024.getClass(), "stack", term449416);
        setField(term452024, term452024.getClass(), "pathIndices", term449416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term452024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


