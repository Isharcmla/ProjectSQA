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

public class CheckSideEffects_process_152266774642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15409;
     Object term15559;

    public CheckSideEffects_process_152266774642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15409 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term15489 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15409, term15409.getClass(), "compiler", term15489);
        term15559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15559, term15559.getClass(), "type", 0);
        setField(term15559, term15559.getClass(), "parent", null);
        setField(term15629, term15629.getClass(), "next", term15629);
        setIntField(term15629, term15629.getClass(), "type", 0);
        setField(term15629, term15629.getClass(), "first", term15559);
        setField(term15559, term15559.getClass(), "first", term15629);
        setField(term15559, term15559.getClass(), "next", term15699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15559;
        try {
            callMethod(klass, "process", argTypes, term15409, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


