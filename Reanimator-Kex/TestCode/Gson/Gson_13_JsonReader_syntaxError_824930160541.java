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

public class JsonReader_syntaxError_824930160541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921567;

    public JsonReader_syntaxError_824930160541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term921567 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term919511 = (int[]) newIntArray(234);
        Object[] term921392 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term921567, term921567.getClass(), "lineNumber", 0);
        setIntField(term921567, term921567.getClass(), "pos", 0);
        setIntField(term921567, term921567.getClass(), "lineStart", 0);
        setIntField(term921567, term921567.getClass(), "stackSize", 9);
        setIntElement(term919511, 0, -752870423);
        setIntElement(term919511, 1, -1698809299);
        setIntElement(term919511, 2, 401512128);
        setIntElement(term919511, 3, -2069930777);
        setIntElement(term919511, 4, 7);
        setIntElement(term919511, 7, 4);
        setField(term921567, term921567.getClass(), "stack", term919511);
        setField(term921567, term921567.getClass(), "pathNames", term921392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term921567, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


