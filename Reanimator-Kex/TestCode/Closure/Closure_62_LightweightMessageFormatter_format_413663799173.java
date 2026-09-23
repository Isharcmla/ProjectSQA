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

public class LightweightMessageFormatter_format_413663799173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141295;
     Object term141373;
     Object term141518;
     Object term141519;

    public LightweightMessageFormatter_format_413663799173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141295 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term141295, term141295.getClass(), "source", null);
        setBooleanField(term141295, term141295.getClass(), "colorize", true);
        term141373 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term141373, term141373.getClass(), "sourceName", null);
        term141518 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term141518, term141518.getClass(), "excerpt", null);
        setField(term141518, term141518.getClass(), "source", null);
        setBooleanField(term141518, term141518.getClass(), "colorize", true);
        term141519 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term141519, term141519.getClass(), "type", null);
        setField(term141519, term141519.getClass(), "description", null);
        setField(term141519, term141519.getClass(), "sourceName", null);
        setField(term141519, term141519.getClass(), "node", null);
        setIntField(term141519, term141519.getClass(), "lineNumber", 0);
        setField(term141519, term141519.getClass(), "level", null);
        setIntField(term141519, term141519.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term141373;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term141295, args);
        assertTrue(recursiveEquals(term141295, term141518));
        assertTrue(recursiveEquals(term141373, term141519));
        assertTrue(recursiveEquals(retValue, "\u001B[35mWARNING\u001B[39m - null\n"));
    }

};


