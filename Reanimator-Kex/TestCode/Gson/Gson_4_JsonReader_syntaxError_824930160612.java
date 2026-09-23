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

public class JsonReader_syntaxError_824930160612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334169;

    public JsonReader_syntaxError_824930160612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334169 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term333554 = (int[]) newIntArray(489);
        setIntField(term334169, term334169.getClass(), "lineNumber", 0);
        setIntField(term334169, term334169.getClass(), "pos", 0);
        setIntField(term334169, term334169.getClass(), "lineStart", 0);
        setIntField(term334169, term334169.getClass(), "stackSize", 2);
        setField(term334169, term334169.getClass(), "stack", term333554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term334169, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


