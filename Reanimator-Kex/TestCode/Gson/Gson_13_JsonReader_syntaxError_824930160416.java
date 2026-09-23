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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_syntaxError_824930160416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476777;

    public JsonReader_syntaxError_824930160416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476777 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term476567 = (int[]) newIntArray(9);
        Object[] term476619 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term476777, term476777.getClass(), "lineNumber", 0);
        setIntField(term476777, term476777.getClass(), "pos", 0);
        setIntField(term476777, term476777.getClass(), "lineStart", 0);
        setIntField(term476777, term476777.getClass(), "stackSize", 8);
        setIntElement(term476567, 0, -752870423);
        setIntElement(term476567, 1, -1698809299);
        setIntElement(term476567, 2, 401512128);
        setIntElement(term476567, 3, -2069930777);
        setIntElement(term476567, 4, 4);
        setField(term476777, term476777.getClass(), "stack", term476567);
        setField(term476777, term476777.getClass(), "pathNames", term476619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term476777, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


