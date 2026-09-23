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

public class JsonReader_syntaxError_824930160447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562407;

    public JsonReader_syntaxError_824930160447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562407 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term560794 = (int[]) newIntArray(491);
        setIntField(term562407, term562407.getClass(), "lineNumber", 0);
        setIntField(term562407, term562407.getClass(), "pos", 0);
        setIntField(term562407, term562407.getClass(), "lineStart", 0);
        setIntField(term562407, term562407.getClass(), "stackSize", 3);
        setIntElement(term560794, 0, -752870423);
        setIntElement(term560794, 1, 8);
        setIntElement(term560794, 2, 6);
        setField(term562407, term562407.getClass(), "stack", term560794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term562407, args);
            assertTrue(false);
        }
        catch (MalformedJsonException e) {
        }

    }

};


