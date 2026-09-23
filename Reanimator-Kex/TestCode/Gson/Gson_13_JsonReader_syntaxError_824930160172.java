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

public class JsonReader_syntaxError_824930160172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81591;

    public JsonReader_syntaxError_824930160172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81591 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        int[] term80477 = (int[]) newIntArray(490);
        setIntField(term81591, term81591.getClass(), "lineNumber", 0);
        setIntField(term81591, term81591.getClass(), "pos", 0);
        setIntField(term81591, term81591.getClass(), "lineStart", 0);
        setIntField(term81591, term81591.getClass(), "stackSize", 2);
        setIntElement(term80477, 0, -752870423);
        setIntElement(term80477, 1, 1);
        setField(term81591, term81591.getClass(), "stack", term80477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "syntaxError", argTypes, term81591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


