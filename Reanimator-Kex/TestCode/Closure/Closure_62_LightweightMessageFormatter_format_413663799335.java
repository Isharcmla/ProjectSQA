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

public class LightweightMessageFormatter_format_413663799335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283361;
     Object term283439;
     Object term283569;
     Object term283570;

    public LightweightMessageFormatter_format_413663799335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283361 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term283361, term283361.getClass(), "source", null);
        term283439 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term283439, term283439.getClass(), "sourceName", "");
        setIntField(term283439, term283439.getClass(), "lineNumber", 1);
        term283569 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term283569, term283569.getClass(), "excerpt", null);
        setField(term283569, term283569.getClass(), "source", null);
        setBooleanField(term283569, term283569.getClass(), "colorize", false);
        term283570 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term283570, term283570.getClass(), "type", null);
        setField(term283570, term283570.getClass(), "description", null);
        setField(term283570, term283570.getClass(), "sourceName", "");
        setField(term283570, term283570.getClass(), "node", null);
        setIntField(term283570, term283570.getClass(), "lineNumber", 1);
        setField(term283570, term283570.getClass(), "level", null);
        setIntField(term283570, term283570.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term283439;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term283361, args);
        assertTrue(recursiveEquals(term283361, term283569));
        assertTrue(recursiveEquals(term283439, term283570));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


