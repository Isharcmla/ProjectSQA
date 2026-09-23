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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProcessCommonJSModules_process_627866047319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165368;
     Object term165438;

    public ProcessCommonJSModules_process_627866047319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165368 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term165368, term165368.getClass(), "compiler", null);
        term165438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165530 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165622 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term165784 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165876 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165968 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term165438, term165438.getClass(), "type", 0);
        setField(term165438, term165438.getClass(), "parent", null);
        setField(term165622, term165622.getClass(), "next", term165692);
        setIntField(term165622, term165622.getClass(), "type", 33);
        setField(term165622, term165622.getClass(), "first", null);
        setField(term165530, term165530.getClass(), "next", term165622);
        setIntField(term165530, term165530.getClass(), "type", 0);
        setField(term165968, term165968.getClass(), "next", null);
        setIntField(term165968, term165968.getClass(), "type", 0);
        setField(term165968, term165968.getClass(), "first", null);
        setField(term165876, term165876.getClass(), "next", term165968);
        setIntField(term165876, term165876.getClass(), "type", 37);
        setField(term165876, term165876.getClass(), "first", null);
        setField(term165784, term165784.getClass(), "next", term165876);
        setIntField(term165784, term165784.getClass(), "type", 0);
        setField(term165784, term165784.getClass(), "first", null);
        setField(term165530, term165530.getClass(), "first", term165784);
        setField(term165438, term165438.getClass(), "first", term165530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term165438;
        try {
            callMethod(klass, "process", argTypes, term165368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


