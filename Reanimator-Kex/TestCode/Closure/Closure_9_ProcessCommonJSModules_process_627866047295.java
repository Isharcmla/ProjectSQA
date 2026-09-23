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

public class ProcessCommonJSModules_process_627866047295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151327;
     Object term151477;

    public ProcessCommonJSModules_process_627866047295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151327 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term151407 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term151327, term151327.getClass(), "compiler", term151407);
        term151477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term151477, term151477.getClass(), "type", 0);
        setField(term151477, term151477.getClass(), "parent", null);
        setField(term151757, term151757.getClass(), "next", term151827);
        setIntField(term151757, term151757.getClass(), "type", 33);
        setField(term151757, term151757.getClass(), "first", null);
        setField(term151687, term151687.getClass(), "next", term151757);
        setIntField(term151687, term151687.getClass(), "type", 37);
        setField(term151687, term151687.getClass(), "first", null);
        setField(term151617, term151617.getClass(), "next", term151687);
        setIntField(term151617, term151617.getClass(), "type", 37);
        setField(term151617, term151617.getClass(), "first", null);
        setField(term151547, term151547.getClass(), "next", term151617);
        setIntField(term151547, term151547.getClass(), "type", 0);
        setField(term151547, term151547.getClass(), "first", term151617);
        setField(term151477, term151477.getClass(), "first", term151547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term151477;
        try {
            callMethod(klass, "process", argTypes, term151327, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


