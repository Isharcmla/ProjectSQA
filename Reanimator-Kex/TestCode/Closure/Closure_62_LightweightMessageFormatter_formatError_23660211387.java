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

public class LightweightMessageFormatter_formatError_23660211387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53947;
     Object term54025;
     Object term54162;
     Object term54163;

    public LightweightMessageFormatter_formatError_23660211387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53947 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term53947, term53947.getClass(), "source", null);
        term54025 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term54025, term54025.getClass(), "sourceName", "");
        setIntField(term54025, term54025.getClass(), "lineNumber", 1);
        term54162 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term54162, term54162.getClass(), "excerpt", null);
        setField(term54162, term54162.getClass(), "source", null);
        setBooleanField(term54162, term54162.getClass(), "colorize", false);
        term54163 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term54163, term54163.getClass(), "type", null);
        setField(term54163, term54163.getClass(), "description", null);
        setField(term54163, term54163.getClass(), "sourceName", "");
        setField(term54163, term54163.getClass(), "node", null);
        setIntField(term54163, term54163.getClass(), "lineNumber", 1);
        setField(term54163, term54163.getClass(), "level", null);
        setIntField(term54163, term54163.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term54025;
        Object retValue = callMethod(klass, "formatError", argTypes, term53947, args);
        assertTrue(recursiveEquals(term53947, term54162));
        assertTrue(recursiveEquals(term54025, term54163));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


