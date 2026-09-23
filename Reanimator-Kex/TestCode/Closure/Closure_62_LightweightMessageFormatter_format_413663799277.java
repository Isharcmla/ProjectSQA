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

public class LightweightMessageFormatter_format_413663799277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240059;
     Object term240137;
     Object term240273;
     Object term240274;

    public LightweightMessageFormatter_format_413663799277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240059 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term240059, term240059.getClass(), "source", null);
        term240137 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term240137, term240137.getClass(), "sourceName", ": ");
        setIntField(term240137, term240137.getClass(), "lineNumber", 1);
        term240273 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term240273, term240273.getClass(), "excerpt", null);
        setField(term240273, term240273.getClass(), "source", null);
        setBooleanField(term240273, term240273.getClass(), "colorize", false);
        term240274 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term240274, term240274.getClass(), "type", null);
        setField(term240274, term240274.getClass(), "description", null);
        setField(term240274, term240274.getClass(), "sourceName", ": ");
        setField(term240274, term240274.getClass(), "node", null);
        setIntField(term240274, term240274.getClass(), "lineNumber", 1);
        setField(term240274, term240274.getClass(), "level", null);
        setIntField(term240274, term240274.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term240137;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term240059, args);
        assertTrue(recursiveEquals(term240059, term240273));
        assertTrue(recursiveEquals(term240137, term240274));
        assertTrue(recursiveEquals(retValue, ": :1: WARNING - null\n"));
    }

};


