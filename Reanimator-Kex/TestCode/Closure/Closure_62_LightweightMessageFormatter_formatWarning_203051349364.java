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

public class LightweightMessageFormatter_formatWarning_203051349364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37291;
     Object term37369;
     Object term38883;
     Object term38884;

    public LightweightMessageFormatter_formatWarning_203051349364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37291 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term37291, term37291.getClass(), "source", null);
        term37369 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term37369, term37369.getClass(), "sourceName", "");
        setIntField(term37369, term37369.getClass(), "lineNumber", 1);
        term38883 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term38883, term38883.getClass(), "excerpt", null);
        setField(term38883, term38883.getClass(), "source", null);
        setBooleanField(term38883, term38883.getClass(), "colorize", false);
        term38884 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term38884, term38884.getClass(), "type", null);
        setField(term38884, term38884.getClass(), "description", null);
        setField(term38884, term38884.getClass(), "sourceName", "");
        setField(term38884, term38884.getClass(), "node", null);
        setIntField(term38884, term38884.getClass(), "lineNumber", 1);
        setField(term38884, term38884.getClass(), "level", null);
        setIntField(term38884, term38884.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term37369;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term37291, args);
        assertTrue(recursiveEquals(term37291, term38883));
        assertTrue(recursiveEquals(term37369, term38884));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


