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

public class LightweightMessageFormatter_format_413663799121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86184;
     Object term86262;
     Object term89412;
     Object term89413;

    public LightweightMessageFormatter_format_413663799121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86184 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term86184, term86184.getClass(), "source", null);
        setBooleanField(term86184, term86184.getClass(), "colorize", true);
        term86262 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term86262, term86262.getClass(), "sourceName", "");
        setIntField(term86262, term86262.getClass(), "lineNumber", 0);
        term89412 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term89412, term89412.getClass(), "excerpt", null);
        setField(term89412, term89412.getClass(), "source", null);
        setBooleanField(term89412, term89412.getClass(), "colorize", true);
        term89413 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term89413, term89413.getClass(), "type", null);
        setField(term89413, term89413.getClass(), "description", null);
        setField(term89413, term89413.getClass(), "sourceName", "");
        setField(term89413, term89413.getClass(), "node", null);
        setIntField(term89413, term89413.getClass(), "lineNumber", 0);
        setField(term89413, term89413.getClass(), "level", null);
        setIntField(term89413, term89413.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term86262;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term86184, args);
        assertTrue(recursiveEquals(term86184, term89412));
        assertTrue(recursiveEquals(term86262, term89413));
        assertTrue(recursiveEquals(retValue, ": \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


