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

public class JsonReader_syntaxError_824930160104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31200;

    public JsonReader_syntaxError_824930160104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31200 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term29088 = (int[]) newIntArray(491);
        setIntField(term31200, term31200.getClass(), "lineNumber", 0);
        setIntField(term31200, term31200.getClass(), "pos", 0);
        setIntField(term31200, term31200.getClass(), "lineStart", 0);
        setIntField(term31200, term31200.getClass(), "stackSize", 7);
        setIntElement(term29088, 0, -752870423);
        setIntElement(term29088, 1, -1698809299);
        setIntElement(term29088, 2, 401512128);
        setIntElement(term29088, 3, 3);
        setField(term31200, term31200.getClass(), "stack", term29088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term31200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


