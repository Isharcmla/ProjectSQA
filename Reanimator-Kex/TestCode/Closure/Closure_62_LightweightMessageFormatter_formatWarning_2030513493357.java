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

public class LightweightMessageFormatter_formatWarning_2030513493357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301823;
     Object term301901;
     Object term302052;
     Object term302053;

    public LightweightMessageFormatter_formatWarning_2030513493357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301823 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term301823, term301823.getClass(), "source", null);
        term301901 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term301901, term301901.getClass(), "sourceName", "");
        setIntField(term301901, term301901.getClass(), "lineNumber", 1);
        term302052 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term302052, term302052.getClass(), "excerpt", null);
        setField(term302052, term302052.getClass(), "source", null);
        setBooleanField(term302052, term302052.getClass(), "colorize", false);
        term302053 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term302053, term302053.getClass(), "type", null);
        setField(term302053, term302053.getClass(), "description", null);
        setField(term302053, term302053.getClass(), "sourceName", "");
        setField(term302053, term302053.getClass(), "node", null);
        setIntField(term302053, term302053.getClass(), "lineNumber", 1);
        setField(term302053, term302053.getClass(), "level", null);
        setIntField(term302053, term302053.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term301901;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term301823, args);
        assertTrue(recursiveEquals(term301823, term302052));
        assertTrue(recursiveEquals(term301901, term302053));
        assertTrue(recursiveEquals(retValue, ":1: WARNING - null\n"));
    }

};


