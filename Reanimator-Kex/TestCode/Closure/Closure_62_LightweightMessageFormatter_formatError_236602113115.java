package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class LightweightMessageFormatter_formatError_236602113115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82192;
     Object term82270;
     Object term82574;
     Object term82575;

    public LightweightMessageFormatter_formatError_236602113115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82192 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term82192, term82192.getClass(), "source", null);
        setBooleanField(term82192, term82192.getClass(), "colorize", true);
        term82270 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term82270, term82270.getClass(), "sourceName", "");
        setIntField(term82270, term82270.getClass(), "lineNumber", 1);
        term82574 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term82574, term82574.getClass(), "excerpt", null);
        setField(term82574, term82574.getClass(), "source", null);
        setBooleanField(term82574, term82574.getClass(), "colorize", true);
        term82575 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term82575, term82575.getClass(), "type", null);
        setField(term82575, term82575.getClass(), "description", null);
        setField(term82575, term82575.getClass(), "sourceName", "");
        setField(term82575, term82575.getClass(), "node", null);
        setIntField(term82575, term82575.getClass(), "lineNumber", 1);
        setField(term82575, term82575.getClass(), "level", null);
        setIntField(term82575, term82575.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term82270;
        Object retValue = callMethod(klass, "formatError", argTypes, term82192, args);
        assertTrue(recursiveEquals(term82192, term82574));
        assertTrue(recursiveEquals(term82270, term82575));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[31mERROR\u001B[39m - null\n"));
    }

};


