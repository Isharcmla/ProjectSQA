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

public class JsonReader_syntaxError_824930160440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545604;

    public JsonReader_syntaxError_824930160440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545604 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term537960 = (int[]) newIntArray(495);
        setIntField(term545604, term545604.getClass(), "lineNumber", 0);
        setIntField(term545604, term545604.getClass(), "pos", 0);
        setIntField(term545604, term545604.getClass(), "lineStart", 0);
        setIntField(term545604, term545604.getClass(), "stackSize", 15);
        setIntElement(term537960, 0, -752870423);
        setIntElement(term537960, 1, -1698809299);
        setIntElement(term537960, 2, 401512128);
        setIntElement(term537960, 3, -2069930777);
        setIntElement(term537960, 4, 7);
        setIntElement(term537960, 11, 7);
        setIntElement(term537960, 14, 5);
        setField(term545604, term545604.getClass(), "stack", term537960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term545604, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


