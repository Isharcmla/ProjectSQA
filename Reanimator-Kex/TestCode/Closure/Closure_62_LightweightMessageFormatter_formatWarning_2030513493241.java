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

public class LightweightMessageFormatter_formatWarning_2030513493241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211405;
     Object term211483;
     Object term211640;
     Object term211641;

    public LightweightMessageFormatter_formatWarning_2030513493241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211405 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term211405, term211405.getClass(), "source", null);
        term211483 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term211483, term211483.getClass(), "sourceName", "");
        setIntField(term211483, term211483.getClass(), "lineNumber", 0);
        term211640 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term211640, term211640.getClass(), "excerpt", null);
        setField(term211640, term211640.getClass(), "source", null);
        setBooleanField(term211640, term211640.getClass(), "colorize", false);
        term211641 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term211641, term211641.getClass(), "type", null);
        setField(term211641, term211641.getClass(), "description", null);
        setField(term211641, term211641.getClass(), "sourceName", "");
        setField(term211641, term211641.getClass(), "node", null);
        setIntField(term211641, term211641.getClass(), "lineNumber", 0);
        setField(term211641, term211641.getClass(), "level", null);
        setIntField(term211641, term211641.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term211483;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term211405, args);
        assertTrue(recursiveEquals(term211405, term211640));
        assertTrue(recursiveEquals(term211483, term211641));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


