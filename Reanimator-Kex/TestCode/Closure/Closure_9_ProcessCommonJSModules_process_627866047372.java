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

public class ProcessCommonJSModules_process_627866047372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199331;
     Object term199503;

    public ProcessCommonJSModules_process_627866047372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199331 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object term199411 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term199331, term199331.getClass(), "compiler", term199411);
        term199503 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term199687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term199503, term199503.getClass(), "type", 0);
        setField(term199503, term199503.getClass(), "parent", null);
        setField(term199687, term199687.getClass(), "next", null);
        setIntField(term199687, term199687.getClass(), "type", 33);
        setField(term199687, term199687.getClass(), "first", null);
        setField(term199595, term199595.getClass(), "next", term199687);
        setIntField(term199595, term199595.getClass(), "type", 0);
        setField(term199595, term199595.getClass(), "first", null);
        setField(term199503, term199503.getClass(), "first", term199595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term199503;
        try {
            callMethod(klass, "process", argTypes, term199331, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


