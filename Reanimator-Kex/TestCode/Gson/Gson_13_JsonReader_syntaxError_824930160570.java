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

public class JsonReader_syntaxError_824930160570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041336;

    public JsonReader_syntaxError_824930160570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041336 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term1037705 = (int[]) newIntArray(495);
        setIntField(term1041336, term1041336.getClass(), "lineNumber", 0);
        setIntField(term1041336, term1041336.getClass(), "pos", 0);
        setIntField(term1041336, term1041336.getClass(), "lineStart", 0);
        setIntField(term1041336, term1041336.getClass(), "stackSize", 7);
        setIntElement(term1037705, 0, -752870423);
        setIntElement(term1037705, 1, -1698809299);
        setIntElement(term1037705, 2, 401512128);
        setIntElement(term1037705, 3, 8);
        setIntElement(term1037705, 4, 7);
        setIntElement(term1037705, 6, 1);
        setField(term1041336, term1041336.getClass(), "stack", term1037705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term1041336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


