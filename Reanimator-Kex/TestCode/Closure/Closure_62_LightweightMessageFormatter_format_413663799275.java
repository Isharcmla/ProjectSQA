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

public class LightweightMessageFormatter_format_413663799275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239310;
     Object term239388;
     Object term239528;
     Object term239529;

    public LightweightMessageFormatter_format_413663799275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239310 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term239310, term239310.getClass(), "source", null);
        term239388 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term239388, term239388.getClass(), "sourceName", "");
        setIntField(term239388, term239388.getClass(), "lineNumber", 0);
        term239528 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term239528, term239528.getClass(), "excerpt", null);
        setField(term239528, term239528.getClass(), "source", null);
        setBooleanField(term239528, term239528.getClass(), "colorize", false);
        term239529 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term239529, term239529.getClass(), "type", null);
        setField(term239529, term239529.getClass(), "description", null);
        setField(term239529, term239529.getClass(), "sourceName", "");
        setField(term239529, term239529.getClass(), "node", null);
        setIntField(term239529, term239529.getClass(), "lineNumber", 0);
        setField(term239529, term239529.getClass(), "level", null);
        setIntField(term239529, term239529.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term239388;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term239310, args);
        assertTrue(recursiveEquals(term239310, term239528));
        assertTrue(recursiveEquals(term239388, term239529));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


