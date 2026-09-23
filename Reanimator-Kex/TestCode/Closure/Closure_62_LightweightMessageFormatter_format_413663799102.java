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

public class LightweightMessageFormatter_format_413663799102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68304;
     Object term68382;
     Object term70992;
     Object term70993;

    public LightweightMessageFormatter_format_413663799102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68304 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term68304, term68304.getClass(), "source", null);
        setBooleanField(term68304, term68304.getClass(), "colorize", true);
        term68382 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term68382, term68382.getClass(), "sourceName", null);
        term70992 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term70992, term70992.getClass(), "excerpt", null);
        setField(term70992, term70992.getClass(), "source", null);
        setBooleanField(term70992, term70992.getClass(), "colorize", true);
        term70993 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term70993, term70993.getClass(), "type", null);
        setField(term70993, term70993.getClass(), "description", null);
        setField(term70993, term70993.getClass(), "sourceName", null);
        setField(term70993, term70993.getClass(), "node", null);
        setIntField(term70993, term70993.getClass(), "lineNumber", 0);
        setField(term70993, term70993.getClass(), "level", null);
        setIntField(term70993, term70993.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term68382;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term68304, args);
        assertTrue(recursiveEquals(term68304, term70992));
        assertTrue(recursiveEquals(term68382, term70993));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


