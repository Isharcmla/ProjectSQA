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

public class LightweightMessageFormatter_formatWarning_203051349358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31897;
     Object term31975;
     Object term33501;
     Object term33502;

    public LightweightMessageFormatter_formatWarning_203051349358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31897 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term31897, term31897.getClass(), "source", null);
        term31975 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term31975, term31975.getClass(), "sourceName", null);
        term33501 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term33501, term33501.getClass(), "excerpt", null);
        setField(term33501, term33501.getClass(), "source", null);
        setBooleanField(term33501, term33501.getClass(), "colorize", false);
        term33502 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term33502, term33502.getClass(), "type", null);
        setField(term33502, term33502.getClass(), "description", null);
        setField(term33502, term33502.getClass(), "sourceName", null);
        setField(term33502, term33502.getClass(), "node", null);
        setIntField(term33502, term33502.getClass(), "lineNumber", 0);
        setField(term33502, term33502.getClass(), "level", null);
        setIntField(term33502, term33502.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term31975;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term31897, args);
        assertTrue(recursiveEquals(term31897, term33501));
        assertTrue(recursiveEquals(term31975, term33502));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


