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

public class LightweightMessageFormatter_formatError_23660211346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27252;
     Object term27330;
     Object term27677;
     Object term27678;

    public LightweightMessageFormatter_formatError_23660211346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27252 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term27252, term27252.getClass(), "source", null);
        term27330 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term27330, term27330.getClass(), "sourceName", null);
        term27677 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term27677, term27677.getClass(), "excerpt", null);
        setField(term27677, term27677.getClass(), "source", null);
        setBooleanField(term27677, term27677.getClass(), "colorize", false);
        term27678 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term27678, term27678.getClass(), "type", null);
        setField(term27678, term27678.getClass(), "description", null);
        setField(term27678, term27678.getClass(), "sourceName", null);
        setField(term27678, term27678.getClass(), "node", null);
        setIntField(term27678, term27678.getClass(), "lineNumber", 0);
        setField(term27678, term27678.getClass(), "level", null);
        setIntField(term27678, term27678.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term27330;
        Object retValue = callMethod(klass, "formatError", argTypes, term27252, args);
        assertTrue(recursiveEquals(term27252, term27677));
        assertTrue(recursiveEquals(term27330, term27678));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


