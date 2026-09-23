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

public class LightweightMessageFormatter_formatError_23660211329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16933;
     Object term17011;
     Object term17417;
     Object term17418;

    public LightweightMessageFormatter_formatError_23660211329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16933 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term16933, term16933.getClass(), "source", null);
        term17011 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term17011, term17011.getClass(), "sourceName", "");
        setIntField(term17011, term17011.getClass(), "lineNumber", 0);
        term17417 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term17417, term17417.getClass(), "excerpt", null);
        setField(term17417, term17417.getClass(), "source", null);
        setBooleanField(term17417, term17417.getClass(), "colorize", false);
        term17418 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term17418, term17418.getClass(), "type", null);
        setField(term17418, term17418.getClass(), "description", null);
        setField(term17418, term17418.getClass(), "sourceName", "");
        setField(term17418, term17418.getClass(), "node", null);
        setIntField(term17418, term17418.getClass(), "lineNumber", 0);
        setField(term17418, term17418.getClass(), "level", null);
        setIntField(term17418, term17418.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term17011;
        Object retValue = callMethod(klass, "formatError", argTypes, term16933, args);
        assertTrue(recursiveEquals(term16933, term17417));
        assertTrue(recursiveEquals(term17011, term17418));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


