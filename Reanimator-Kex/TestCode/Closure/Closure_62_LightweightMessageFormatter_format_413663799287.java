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

public class LightweightMessageFormatter_format_413663799287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245000;
     Object term245078;
     Object term245194;
     Object term245195;

    public LightweightMessageFormatter_format_413663799287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245000 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term245000, term245000.getClass(), "source", null);
        term245078 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term245078, term245078.getClass(), "sourceName", "");
        setIntField(term245078, term245078.getClass(), "lineNumber", 0);
        term245194 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term245194, term245194.getClass(), "excerpt", null);
        setField(term245194, term245194.getClass(), "source", null);
        setBooleanField(term245194, term245194.getClass(), "colorize", false);
        term245195 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term245195, term245195.getClass(), "type", null);
        setField(term245195, term245195.getClass(), "description", null);
        setField(term245195, term245195.getClass(), "sourceName", "");
        setField(term245195, term245195.getClass(), "node", null);
        setIntField(term245195, term245195.getClass(), "lineNumber", 0);
        setField(term245195, term245195.getClass(), "level", null);
        setIntField(term245195, term245195.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term245078;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term245000, args);
        assertTrue(recursiveEquals(term245000, term245194));
        assertTrue(recursiveEquals(term245078, term245195));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


