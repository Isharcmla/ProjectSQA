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

public class JsonReader_syntaxError_824930160592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1177121;

    public JsonReader_syntaxError_824930160592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1177121 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1163539 = (int[]) newIntArray(511);
        setIntField(term1177121, term1177121.getClass(), "lineNumber", 0);
        setIntField(term1177121, term1177121.getClass(), "pos", 0);
        setIntField(term1177121, term1177121.getClass(), "lineStart", 0);
        setIntField(term1177121, term1177121.getClass(), "stackSize", 31);
        setIntElement(term1163539, 0, -752870423);
        setIntElement(term1163539, 1, -1698809299);
        setIntElement(term1163539, 2, 401512128);
        setIntElement(term1163539, 3, -2069930777);
        setIntElement(term1163539, 4, 7);
        setIntElement(term1163539, 22, 6);
        setIntElement(term1163539, 25, 4);
        setField(term1177121, term1177121.getClass(), "stack", term1163539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1177121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


