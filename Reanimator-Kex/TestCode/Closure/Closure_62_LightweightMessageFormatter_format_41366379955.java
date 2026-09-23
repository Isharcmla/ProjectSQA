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

public class LightweightMessageFormatter_format_41366379955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30821;
     Object term30899;
     Object term31141;
     Object term31142;

    public LightweightMessageFormatter_format_41366379955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30821 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term30821, term30821.getClass(), "source", null);
        term30899 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term30899, term30899.getClass(), "sourceName", "");
        setIntField(term30899, term30899.getClass(), "lineNumber", 0);
        term31141 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term31141, term31141.getClass(), "excerpt", null);
        setField(term31141, term31141.getClass(), "source", null);
        setBooleanField(term31141, term31141.getClass(), "colorize", false);
        term31142 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term31142, term31142.getClass(), "type", null);
        setField(term31142, term31142.getClass(), "description", null);
        setField(term31142, term31142.getClass(), "sourceName", "");
        setField(term31142, term31142.getClass(), "node", null);
        setIntField(term31142, term31142.getClass(), "lineNumber", 0);
        setField(term31142, term31142.getClass(), "level", null);
        setIntField(term31142, term31142.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term30899;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term30821, args);
        assertTrue(recursiveEquals(term30821, term31141));
        assertTrue(recursiveEquals(term30899, term31142));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


