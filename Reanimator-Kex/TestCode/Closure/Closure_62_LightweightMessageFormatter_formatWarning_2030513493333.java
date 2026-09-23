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

public class LightweightMessageFormatter_formatWarning_2030513493333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282778;
     Object term282856;
     Object term282958;
     Object term282959;

    public LightweightMessageFormatter_formatWarning_2030513493333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282778 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term282778, term282778.getClass(), "source", null);
        term282856 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term282856, term282856.getClass(), "sourceName", null);
        term282958 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term282958, term282958.getClass(), "excerpt", null);
        setField(term282958, term282958.getClass(), "source", null);
        setBooleanField(term282958, term282958.getClass(), "colorize", false);
        term282959 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term282959, term282959.getClass(), "type", null);
        setField(term282959, term282959.getClass(), "description", null);
        setField(term282959, term282959.getClass(), "sourceName", null);
        setField(term282959, term282959.getClass(), "node", null);
        setIntField(term282959, term282959.getClass(), "lineNumber", 0);
        setField(term282959, term282959.getClass(), "level", null);
        setIntField(term282959, term282959.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term282856;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term282778, args);
        assertTrue(recursiveEquals(term282778, term282958));
        assertTrue(recursiveEquals(term282856, term282959));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


