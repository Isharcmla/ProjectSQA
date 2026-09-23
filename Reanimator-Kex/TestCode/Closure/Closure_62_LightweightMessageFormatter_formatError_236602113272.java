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

public class LightweightMessageFormatter_formatError_236602113272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236706;
     Object term236784;
     Object term238034;
     Object term238035;

    public LightweightMessageFormatter_formatError_236602113272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236706 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term236706, term236706.getClass(), "source", null);
        term236784 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term236784, term236784.getClass(), "sourceName", ": ");
        setIntField(term236784, term236784.getClass(), "lineNumber", 0);
        term238034 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term238034, term238034.getClass(), "excerpt", null);
        setField(term238034, term238034.getClass(), "source", null);
        setBooleanField(term238034, term238034.getClass(), "colorize", false);
        term238035 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term238035, term238035.getClass(), "type", null);
        setField(term238035, term238035.getClass(), "description", null);
        setField(term238035, term238035.getClass(), "sourceName", ": ");
        setField(term238035, term238035.getClass(), "node", null);
        setIntField(term238035, term238035.getClass(), "lineNumber", 0);
        setField(term238035, term238035.getClass(), "level", null);
        setIntField(term238035, term238035.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term236784;
        Object retValue = callMethod(klass, "formatError", argTypes, term236706, args);
        assertTrue(recursiveEquals(term236706, term238034));
        assertTrue(recursiveEquals(term236784, term238035));
        assertTrue(recursiveEquals(retValue, ": : ERROR - null\n"));
    }

};


