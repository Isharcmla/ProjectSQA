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

public class LightweightMessageFormatter_format_41366379983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52323;
     Object term52401;
     Object term52603;
     Object term52604;

    public LightweightMessageFormatter_format_41366379983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52323 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term52323, term52323.getClass(), "source", null);
        setBooleanField(term52323, term52323.getClass(), "colorize", true);
        term52401 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term52401, term52401.getClass(), "sourceName", "");
        setIntField(term52401, term52401.getClass(), "lineNumber", 1);
        term52603 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term52603, term52603.getClass(), "excerpt", null);
        setField(term52603, term52603.getClass(), "source", null);
        setBooleanField(term52603, term52603.getClass(), "colorize", true);
        term52604 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term52604, term52604.getClass(), "type", null);
        setField(term52604, term52604.getClass(), "description", null);
        setField(term52604, term52604.getClass(), "sourceName", "");
        setField(term52604, term52604.getClass(), "node", null);
        setIntField(term52604, term52604.getClass(), "lineNumber", 1);
        setField(term52604, term52604.getClass(), "level", null);
        setIntField(term52604, term52604.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term52401;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term52323, args);
        assertTrue(recursiveEquals(term52323, term52603));
        assertTrue(recursiveEquals(term52401, term52604));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


