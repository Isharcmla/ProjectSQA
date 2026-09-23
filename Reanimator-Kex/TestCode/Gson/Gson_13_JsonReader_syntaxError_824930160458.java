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

public class JsonReader_syntaxError_824930160458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606632;

    public JsonReader_syntaxError_824930160458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606632 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term597197 = (int[]) newIntArray(511);
        setIntField(term606632, term606632.getClass(), "lineNumber", 0);
        setIntField(term606632, term606632.getClass(), "pos", 0);
        setIntField(term606632, term606632.getClass(), "lineStart", 0);
        setIntField(term606632, term606632.getClass(), "stackSize", 31);
        setIntElement(term597197, 0, -752870423);
        setIntElement(term597197, 1, -1698809299);
        setIntElement(term597197, 2, 401512128);
        setIntElement(term597197, 3, -2069930777);
        setIntElement(term597197, 4, 7);
        setIntElement(term597197, 17, 2);
        setField(term606632, term606632.getClass(), "stack", term597197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term606632, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


