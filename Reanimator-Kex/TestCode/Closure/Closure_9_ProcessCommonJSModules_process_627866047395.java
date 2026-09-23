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

public class ProcessCommonJSModules_process_627866047395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215182;
     Object term215274;

    public ProcessCommonJSModules_process_627866047395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215182 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term215182, term215182.getClass(), "compiler", null);
        term215274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term215712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term215274, term215274.getClass(), "type", 0);
        setField(term215274, term215274.getClass(), "parent", null);
        setField(term215366, term215366.getClass(), "next", term215458);
        setIntField(term215366, term215366.getClass(), "type", 0);
        setField(term215642, term215642.getClass(), "next", term215712);
        setIntField(term215642, term215642.getClass(), "type", 33);
        setField(term215642, term215642.getClass(), "first", null);
        setField(term215550, term215550.getClass(), "next", term215642);
        setIntField(term215550, term215550.getClass(), "type", 0);
        setField(term215550, term215550.getClass(), "first", null);
        setField(term215366, term215366.getClass(), "first", term215550);
        setField(term215274, term215274.getClass(), "first", term215366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term215274;
        try {
            callMethod(klass, "process", argTypes, term215182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


