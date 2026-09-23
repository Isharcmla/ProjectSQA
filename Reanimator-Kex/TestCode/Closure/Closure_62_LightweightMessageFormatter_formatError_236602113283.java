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

public class LightweightMessageFormatter_formatError_236602113283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242219;
     Object term242297;
     Object term243257;
     Object term243258;

    public LightweightMessageFormatter_formatError_236602113283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242219 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term242219, term242219.getClass(), "source", null);
        term242297 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term242297, term242297.getClass(), "sourceName", "");
        setIntField(term242297, term242297.getClass(), "lineNumber", 0);
        term243257 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term243257, term243257.getClass(), "excerpt", null);
        setField(term243257, term243257.getClass(), "source", null);
        setBooleanField(term243257, term243257.getClass(), "colorize", false);
        term243258 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term243258, term243258.getClass(), "type", null);
        setField(term243258, term243258.getClass(), "description", null);
        setField(term243258, term243258.getClass(), "sourceName", "");
        setField(term243258, term243258.getClass(), "node", null);
        setIntField(term243258, term243258.getClass(), "lineNumber", 0);
        setField(term243258, term243258.getClass(), "level", null);
        setIntField(term243258, term243258.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term242297;
        Object retValue = callMethod(klass, "formatError", argTypes, term242219, args);
        assertTrue(recursiveEquals(term242219, term243257));
        assertTrue(recursiveEquals(term242297, term243258));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


