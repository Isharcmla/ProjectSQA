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

public class ProcessCommonJSModules_process_627866047391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211981;
     Object term212153;

    public ProcessCommonJSModules_process_627866047391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211981 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term212061 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term211981, term211981.getClass(), "compiler", term212061);
        term212153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term212499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term212153, term212153.getClass(), "type", 0);
        setField(term212153, term212153.getClass(), "parent", null);
        setField(term212407, term212407.getClass(), "next", null);
        setIntField(term212407, term212407.getClass(), "type", 33);
        setField(term212407, term212407.getClass(), "first", null);
        setField(term212337, term212337.getClass(), "next", term212407);
        setIntField(term212337, term212337.getClass(), "type", 37);
        setField(term212337, term212337.getClass(), "first", null);
        setField(term212245, term212245.getClass(), "next", term212337);
        setIntField(term212245, term212245.getClass(), "type", 0);
        setField(term212499, term212499.getClass(), "next", null);
        setIntField(term212499, term212499.getClass(), "type", 37);
        setField(term212499, term212499.getClass(), "first", null);
        setField(term212245, term212245.getClass(), "first", term212499);
        setField(term212153, term212153.getClass(), "first", term212245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term212153;
        try {
            callMethod(klass, "process", argTypes, term211981, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


