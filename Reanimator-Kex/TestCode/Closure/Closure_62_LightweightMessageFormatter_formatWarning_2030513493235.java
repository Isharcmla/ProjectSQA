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

public class LightweightMessageFormatter_formatWarning_2030513493235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206430;
     Object term206508;
     Object term206667;
     Object term206668;

    public LightweightMessageFormatter_formatWarning_2030513493235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206430 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term206430, term206430.getClass(), "source", null);
        term206508 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term206508, term206508.getClass(), "sourceName", ": ");
        setIntField(term206508, term206508.getClass(), "lineNumber", 1);
        term206667 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term206667, term206667.getClass(), "excerpt", null);
        setField(term206667, term206667.getClass(), "source", null);
        setBooleanField(term206667, term206667.getClass(), "colorize", false);
        term206668 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term206668, term206668.getClass(), "type", null);
        setField(term206668, term206668.getClass(), "description", null);
        setField(term206668, term206668.getClass(), "sourceName", ": ");
        setField(term206668, term206668.getClass(), "node", null);
        setIntField(term206668, term206668.getClass(), "lineNumber", 1);
        setField(term206668, term206668.getClass(), "level", null);
        setIntField(term206668, term206668.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term206508;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term206430, args);
        assertTrue(recursiveEquals(term206430, term206667));
        assertTrue(recursiveEquals(term206508, term206668));
        assertTrue(recursiveEquals(retValue, ": :1: WARNING - null\n"));
    }

};


