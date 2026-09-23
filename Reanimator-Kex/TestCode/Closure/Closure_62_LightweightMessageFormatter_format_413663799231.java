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

public class LightweightMessageFormatter_format_413663799231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203703;
     Object term203781;
     Object term203909;
     Object term203910;

    public LightweightMessageFormatter_format_413663799231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203703 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term203703, term203703.getClass(), "source", null);
        term203781 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term203781, term203781.getClass(), "sourceName", "");
        setIntField(term203781, term203781.getClass(), "lineNumber", 0);
        term203909 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term203909, term203909.getClass(), "excerpt", null);
        setField(term203909, term203909.getClass(), "source", null);
        setBooleanField(term203909, term203909.getClass(), "colorize", false);
        term203910 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term203910, term203910.getClass(), "type", null);
        setField(term203910, term203910.getClass(), "description", null);
        setField(term203910, term203910.getClass(), "sourceName", "");
        setField(term203910, term203910.getClass(), "node", null);
        setIntField(term203910, term203910.getClass(), "lineNumber", 0);
        setField(term203910, term203910.getClass(), "level", null);
        setIntField(term203910, term203910.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term203781;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term203703, args);
        assertTrue(recursiveEquals(term203703, term203909));
        assertTrue(recursiveEquals(term203781, term203910));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


