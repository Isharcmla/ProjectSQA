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

public class JsonReader_syntaxError_824930160450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574677;

    public JsonReader_syntaxError_824930160450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574677 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term569542 = (int[]) newIntArray(495);
        setIntField(term574677, term574677.getClass(), "lineNumber", 0);
        setIntField(term574677, term574677.getClass(), "pos", 0);
        setIntField(term574677, term574677.getClass(), "lineStart", 0);
        setIntField(term574677, term574677.getClass(), "stackSize", 15);
        setIntElement(term569542, 0, -752870423);
        setIntElement(term569542, 1, -1698809299);
        setIntElement(term569542, 2, 401512128);
        setIntElement(term569542, 3, -2069930777);
        setIntElement(term569542, 4, 7);
        setIntElement(term569542, 9, 4);
        setField(term574677, term574677.getClass(), "stack", term569542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term574677, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


