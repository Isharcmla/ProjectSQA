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

public class LightweightMessageFormatter_formatWarning_2030513493139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102673;
     Object term102751;
     Object term103945;
     Object term103946;

    public LightweightMessageFormatter_formatWarning_2030513493139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102673 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term102673, term102673.getClass(), "source", null);
        setBooleanField(term102673, term102673.getClass(), "colorize", true);
        term102751 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term102751, term102751.getClass(), "sourceName", "");
        setIntField(term102751, term102751.getClass(), "lineNumber", 0);
        term103945 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term103945, term103945.getClass(), "excerpt", null);
        setField(term103945, term103945.getClass(), "source", null);
        setBooleanField(term103945, term103945.getClass(), "colorize", true);
        term103946 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term103946, term103946.getClass(), "type", null);
        setField(term103946, term103946.getClass(), "description", null);
        setField(term103946, term103946.getClass(), "sourceName", "");
        setField(term103946, term103946.getClass(), "node", null);
        setIntField(term103946, term103946.getClass(), "lineNumber", 0);
        setField(term103946, term103946.getClass(), "level", null);
        setIntField(term103946, term103946.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term102751;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term102673, args);
        assertTrue(recursiveEquals(term102673, term103945));
        assertTrue(recursiveEquals(term102751, term103946));
        assertTrue(recursiveEquals(retValue, ": \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


