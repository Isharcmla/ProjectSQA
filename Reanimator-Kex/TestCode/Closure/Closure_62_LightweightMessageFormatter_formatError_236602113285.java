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

public class LightweightMessageFormatter_formatError_236602113285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243997;
     Object term244075;
     Object term244163;
     Object term244164;

    public LightweightMessageFormatter_formatError_236602113285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243997 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term243997, term243997.getClass(), "source", null);
        term244075 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term244075, term244075.getClass(), "sourceName", null);
        term244163 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term244163, term244163.getClass(), "excerpt", null);
        setField(term244163, term244163.getClass(), "source", null);
        setBooleanField(term244163, term244163.getClass(), "colorize", false);
        term244164 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term244164, term244164.getClass(), "type", null);
        setField(term244164, term244164.getClass(), "description", null);
        setField(term244164, term244164.getClass(), "sourceName", null);
        setField(term244164, term244164.getClass(), "node", null);
        setIntField(term244164, term244164.getClass(), "lineNumber", 0);
        setField(term244164, term244164.getClass(), "level", null);
        setIntField(term244164, term244164.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term244075;
        Object retValue = callMethod(klass, "formatError", argTypes, term243997, args);
        assertTrue(recursiveEquals(term243997, term244163));
        assertTrue(recursiveEquals(term244075, term244164));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


