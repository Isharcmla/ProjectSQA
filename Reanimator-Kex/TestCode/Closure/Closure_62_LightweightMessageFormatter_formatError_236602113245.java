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

public class LightweightMessageFormatter_formatError_236602113245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213386;
     Object term213464;
     Object term214465;
     Object term214466;

    public LightweightMessageFormatter_formatError_236602113245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213386 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term213386, term213386.getClass(), "source", null);
        term213464 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term213464, term213464.getClass(), "sourceName", ": ");
        setIntField(term213464, term213464.getClass(), "lineNumber", 1);
        term214465 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term214465, term214465.getClass(), "excerpt", null);
        setField(term214465, term214465.getClass(), "source", null);
        setBooleanField(term214465, term214465.getClass(), "colorize", false);
        term214466 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term214466, term214466.getClass(), "type", null);
        setField(term214466, term214466.getClass(), "description", null);
        setField(term214466, term214466.getClass(), "sourceName", ": ");
        setField(term214466, term214466.getClass(), "node", null);
        setIntField(term214466, term214466.getClass(), "lineNumber", 1);
        setField(term214466, term214466.getClass(), "level", null);
        setIntField(term214466, term214466.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term213464;
        Object retValue = callMethod(klass, "formatError", argTypes, term213386, args);
        assertTrue(recursiveEquals(term213386, term214465));
        assertTrue(recursiveEquals(term213464, term214466));
        assertTrue(recursiveEquals(retValue, ": :1: ERROR - null\n"));
    }

};


