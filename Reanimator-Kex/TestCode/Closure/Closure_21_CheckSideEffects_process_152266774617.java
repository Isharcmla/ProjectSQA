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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckSideEffects_process_152266774617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7480;
     Object term7630;

    public CheckSideEffects_process_152266774617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7480 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        Object term7560 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7480, term7480.getClass(), "compiler", term7560);
        term7630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term7630, term7630.getClass(), "type", 0);
        setField(term7630, term7630.getClass(), "parent", null);
        setField(term7700, term7700.getClass(), "next", term7700);
        setIntField(term7700, term7700.getClass(), "type", 0);
        setField(term7700, term7700.getClass(), "first", term7792);
        setField(term7630, term7630.getClass(), "first", term7700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7630;
        try {
            callMethod(klass, "process", argTypes, term7480, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


