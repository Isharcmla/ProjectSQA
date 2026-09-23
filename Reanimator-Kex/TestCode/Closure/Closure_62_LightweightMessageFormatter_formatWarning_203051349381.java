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

public class LightweightMessageFormatter_formatWarning_203051349381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50898;
     Object term50976;
     Object term51272;
     Object term51273;

    public LightweightMessageFormatter_formatWarning_203051349381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50898 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term50898, term50898.getClass(), "source", null);
        setBooleanField(term50898, term50898.getClass(), "colorize", true);
        term50976 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term50976, term50976.getClass(), "sourceName", null);
        term51272 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term51272, term51272.getClass(), "excerpt", null);
        setField(term51272, term51272.getClass(), "source", null);
        setBooleanField(term51272, term51272.getClass(), "colorize", true);
        term51273 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term51273, term51273.getClass(), "type", null);
        setField(term51273, term51273.getClass(), "description", null);
        setField(term51273, term51273.getClass(), "sourceName", null);
        setField(term51273, term51273.getClass(), "node", null);
        setIntField(term51273, term51273.getClass(), "lineNumber", 0);
        setField(term51273, term51273.getClass(), "level", null);
        setIntField(term51273, term51273.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term50976;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term50898, args);
        assertTrue(recursiveEquals(term50898, term51272));
        assertTrue(recursiveEquals(term50976, term51273));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


