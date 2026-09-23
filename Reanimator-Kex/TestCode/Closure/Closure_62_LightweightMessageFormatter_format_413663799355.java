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

public class LightweightMessageFormatter_format_413663799355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301231;
     Object term301309;
     Object term301433;
     Object term301434;

    public LightweightMessageFormatter_format_413663799355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301231 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term301231, term301231.getClass(), "source", null);
        term301309 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term301309, term301309.getClass(), "sourceName", ": ");
        setIntField(term301309, term301309.getClass(), "lineNumber", 1);
        term301433 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term301433, term301433.getClass(), "excerpt", null);
        setField(term301433, term301433.getClass(), "source", null);
        setBooleanField(term301433, term301433.getClass(), "colorize", false);
        term301434 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term301434, term301434.getClass(), "type", null);
        setField(term301434, term301434.getClass(), "description", null);
        setField(term301434, term301434.getClass(), "sourceName", ": ");
        setField(term301434, term301434.getClass(), "node", null);
        setIntField(term301434, term301434.getClass(), "lineNumber", 1);
        setField(term301434, term301434.getClass(), "level", null);
        setIntField(term301434, term301434.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term301309;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term301231, args);
        assertTrue(recursiveEquals(term301231, term301433));
        assertTrue(recursiveEquals(term301309, term301434));
        assertTrue(recursiveEquals(retValue, ": :1: ERROR - null\n"));
    }

};


