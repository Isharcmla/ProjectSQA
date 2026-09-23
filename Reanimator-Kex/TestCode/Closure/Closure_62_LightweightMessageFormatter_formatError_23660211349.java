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

public class LightweightMessageFormatter_formatError_23660211349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28097;
     Object term28175;
     Object term28312;
     Object term28313;

    public LightweightMessageFormatter_formatError_23660211349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28097 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term28097, term28097.getClass(), "source", null);
        term28175 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term28175, term28175.getClass(), "sourceName", "");
        setIntField(term28175, term28175.getClass(), "lineNumber", 1);
        term28312 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term28312, term28312.getClass(), "excerpt", null);
        setField(term28312, term28312.getClass(), "source", null);
        setBooleanField(term28312, term28312.getClass(), "colorize", false);
        term28313 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term28313, term28313.getClass(), "type", null);
        setField(term28313, term28313.getClass(), "description", null);
        setField(term28313, term28313.getClass(), "sourceName", "");
        setField(term28313, term28313.getClass(), "node", null);
        setIntField(term28313, term28313.getClass(), "lineNumber", 1);
        setField(term28313, term28313.getClass(), "level", null);
        setIntField(term28313, term28313.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term28175;
        Object retValue = callMethod(klass, "formatError", argTypes, term28097, args);
        assertTrue(recursiveEquals(term28097, term28312));
        assertTrue(recursiveEquals(term28175, term28313));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


