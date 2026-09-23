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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class InlineFunctions_findCalledFunctions_1759326424109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18099;
     Object term18191;
     Object term18331;

    public InlineFunctions_findCalledFunctions_1759326424109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18099 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term18191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term18283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term18191, term18191.getClass(), "type", 0);
        setIntField(term18283, term18283.getClass(), "type", 0);
        setField(term18283, term18283.getClass(), "first", null);
        setField(term18283, term18283.getClass(), "next", term18191);
        setField(term18191, term18191.getClass(), "first", term18283);
        term18331 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term18191;
        args[1] = term18331;
        try {
            callMethod(klass, "findCalledFunctions", argTypes, term18099, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


