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

public class LightweightMessageFormatter_format_413663799369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314449;
     Object term314527;
     Object term314600;
     Object term314601;

    public LightweightMessageFormatter_format_413663799369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314449 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term314449, term314449.getClass(), "source", null);
        term314527 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term314527, term314527.getClass(), "sourceName", null);
        term314600 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term314600, term314600.getClass(), "excerpt", null);
        setField(term314600, term314600.getClass(), "source", null);
        setBooleanField(term314600, term314600.getClass(), "colorize", false);
        term314601 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term314601, term314601.getClass(), "type", null);
        setField(term314601, term314601.getClass(), "description", null);
        setField(term314601, term314601.getClass(), "sourceName", null);
        setField(term314601, term314601.getClass(), "node", null);
        setIntField(term314601, term314601.getClass(), "lineNumber", 0);
        setField(term314601, term314601.getClass(), "level", null);
        setIntField(term314601, term314601.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term314527;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term314449, args);
        assertTrue(recursiveEquals(term314449, term314600));
        assertTrue(recursiveEquals(term314527, term314601));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


