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

public class LightweightMessageFormatter_formatError_236602113329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279851;
     Object term279929;
     Object term280084;
     Object term280085;

    public LightweightMessageFormatter_formatError_236602113329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279851 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term279851, term279851.getClass(), "source", null);
        term279929 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term279929, term279929.getClass(), "sourceName", "");
        setIntField(term279929, term279929.getClass(), "lineNumber", 1);
        term280084 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term280084, term280084.getClass(), "excerpt", null);
        setField(term280084, term280084.getClass(), "source", null);
        setBooleanField(term280084, term280084.getClass(), "colorize", false);
        term280085 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term280085, term280085.getClass(), "type", null);
        setField(term280085, term280085.getClass(), "description", null);
        setField(term280085, term280085.getClass(), "sourceName", "");
        setField(term280085, term280085.getClass(), "node", null);
        setIntField(term280085, term280085.getClass(), "lineNumber", 1);
        setField(term280085, term280085.getClass(), "level", null);
        setIntField(term280085, term280085.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term279929;
        Object retValue = callMethod(klass, "formatError", argTypes, term279851, args);
        assertTrue(recursiveEquals(term279851, term280084));
        assertTrue(recursiveEquals(term279929, term280085));
        assertTrue(recursiveEquals(retValue, ":1: ERROR - null\n"));
    }

};


