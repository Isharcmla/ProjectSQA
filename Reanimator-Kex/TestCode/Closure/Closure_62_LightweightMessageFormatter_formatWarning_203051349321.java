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

public class LightweightMessageFormatter_formatWarning_203051349321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13158;
     Object term13236;
     Object term14026;
     Object term14027;

    public LightweightMessageFormatter_formatWarning_203051349321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13158 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term13158, term13158.getClass(), "source", null);
        term13236 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term13236, term13236.getClass(), "sourceName", "");
        setIntField(term13236, term13236.getClass(), "lineNumber", 0);
        term14026 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term14026, term14026.getClass(), "excerpt", null);
        setField(term14026, term14026.getClass(), "source", null);
        setBooleanField(term14026, term14026.getClass(), "colorize", false);
        term14027 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term14027, term14027.getClass(), "type", null);
        setField(term14027, term14027.getClass(), "description", null);
        setField(term14027, term14027.getClass(), "sourceName", "");
        setField(term14027, term14027.getClass(), "node", null);
        setIntField(term14027, term14027.getClass(), "lineNumber", 0);
        setField(term14027, term14027.getClass(), "level", null);
        setIntField(term14027, term14027.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term13236;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term13158, args);
        assertTrue(recursiveEquals(term13158, term14026));
        assertTrue(recursiveEquals(term13236, term14027));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


