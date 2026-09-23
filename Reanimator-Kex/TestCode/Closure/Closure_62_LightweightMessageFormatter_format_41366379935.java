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

public class LightweightMessageFormatter_format_41366379935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20098;
     Object term20176;
     Object term20306;
     Object term20307;

    public LightweightMessageFormatter_format_41366379935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20098 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term20098, term20098.getClass(), "source", null);
        term20176 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term20176, term20176.getClass(), "sourceName", "");
        setIntField(term20176, term20176.getClass(), "lineNumber", 1);
        term20306 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term20306, term20306.getClass(), "excerpt", null);
        setField(term20306, term20306.getClass(), "source", null);
        setBooleanField(term20306, term20306.getClass(), "colorize", false);
        term20307 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term20307, term20307.getClass(), "type", null);
        setField(term20307, term20307.getClass(), "description", null);
        setField(term20307, term20307.getClass(), "sourceName", "");
        setField(term20307, term20307.getClass(), "node", null);
        setIntField(term20307, term20307.getClass(), "lineNumber", 1);
        setField(term20307, term20307.getClass(), "level", null);
        setIntField(term20307, term20307.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term20176;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term20098, args);
        assertTrue(recursiveEquals(term20098, term20306));
        assertTrue(recursiveEquals(term20176, term20307));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


