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
import com.google.gson.stream.MalformedJsonException;
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_syntaxError_824930160521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879737;

    public JsonReader_syntaxError_824930160521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term879737 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term879481 = (int[]) newIntArray(11);
        Object[] term879566 = (Object[]) newArray("java.lang.String", 7);
        setIntField(term879737, term879737.getClass(), "lineNumber", 0);
        setIntField(term879737, term879737.getClass(), "pos", 0);
        setIntField(term879737, term879737.getClass(), "lineStart", 0);
        setIntField(term879737, term879737.getClass(), "stackSize", 7);
        setIntElement(term879481, 0, -752870423);
        setIntElement(term879481, 1, -1698809299);
        setIntElement(term879481, 2, 401512128);
        setIntElement(term879481, 3, -2069930777);
        setIntElement(term879481, 4, 1543696412);
        setIntElement(term879481, 5, -1385748168);
        setIntElement(term879481, 6, 3);
        setField(term879737, term879737.getClass(), "stack", term879481);
        setField(term879737, term879737.getClass(), "pathNames", term879566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term879737, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


