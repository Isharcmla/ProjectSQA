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

public class LightweightMessageFormatter_formatWarning_203051349385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52934;
     Object term53012;
     Object term53163;
     Object term53164;

    public LightweightMessageFormatter_formatWarning_203051349385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52934 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term52934, term52934.getClass(), "source", null);
        term53012 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term53012, term53012.getClass(), "sourceName", "");
        setIntField(term53012, term53012.getClass(), "lineNumber", 1);
        term53163 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term53163, term53163.getClass(), "excerpt", null);
        setField(term53163, term53163.getClass(), "source", null);
        setBooleanField(term53163, term53163.getClass(), "colorize", false);
        term53164 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term53164, term53164.getClass(), "type", null);
        setField(term53164, term53164.getClass(), "description", null);
        setField(term53164, term53164.getClass(), "sourceName", "");
        setField(term53164, term53164.getClass(), "node", null);
        setIntField(term53164, term53164.getClass(), "lineNumber", 1);
        setField(term53164, term53164.getClass(), "level", null);
        setIntField(term53164, term53164.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term53012;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term52934, args);
        assertTrue(recursiveEquals(term52934, term53163));
        assertTrue(recursiveEquals(term53012, term53164));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


