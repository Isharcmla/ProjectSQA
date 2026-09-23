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

public class LightweightMessageFormatter_format_41366379954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29956;
     Object term30034;
     Object term31029;
     Object term31030;

    public LightweightMessageFormatter_format_41366379954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29956 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term29956, term29956.getClass(), "source", null);
        term30034 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term30034, term30034.getClass(), "sourceName", "");
        setIntField(term30034, term30034.getClass(), "lineNumber", 1);
        term31029 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term31029, term31029.getClass(), "excerpt", null);
        setField(term31029, term31029.getClass(), "source", null);
        setBooleanField(term31029, term31029.getClass(), "colorize", false);
        term31030 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term31030, term31030.getClass(), "type", null);
        setField(term31030, term31030.getClass(), "description", null);
        setField(term31030, term31030.getClass(), "sourceName", "");
        setField(term31030, term31030.getClass(), "node", null);
        setIntField(term31030, term31030.getClass(), "lineNumber", 1);
        setField(term31030, term31030.getClass(), "level", null);
        setIntField(term31030, term31030.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term30034;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term29956, args);
        assertTrue(recursiveEquals(term29956, term31029));
        assertTrue(recursiveEquals(term30034, term31030));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


