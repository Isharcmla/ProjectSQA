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

public class JsonReader_syntaxError_824930160511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843914;

    public JsonReader_syntaxError_824930160511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843914 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term840292 = (int[]) newIntArray(495);
        int[] term843269 = (int[]) newIntArray(489);
        setIntField(term843914, term843914.getClass(), "lineNumber", 0);
        setIntField(term843914, term843914.getClass(), "pos", 0);
        setIntField(term843914, term843914.getClass(), "lineStart", 0);
        setIntField(term843914, term843914.getClass(), "stackSize", 7);
        setIntElement(term840292, 0, -752870423);
        setIntElement(term840292, 1, -1698809299);
        setIntElement(term840292, 2, 401512128);
        setIntElement(term840292, 3, 8);
        setIntElement(term840292, 5, 1);
        setField(term843914, term843914.getClass(), "stack", term840292);
        setIntElement(term843269, 0, -752870423);
        setIntElement(term843269, 1, -1698809299);
        setIntElement(term843269, 2, 401512128);
        setIntElement(term843269, 3, 8);
        setIntElement(term843269, 5, 1);
        setField(term843914, term843914.getClass(), "pathIndices", term843269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term843914, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


