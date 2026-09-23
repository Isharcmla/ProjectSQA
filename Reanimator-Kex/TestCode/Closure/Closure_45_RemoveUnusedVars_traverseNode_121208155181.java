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
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18509;
     Object term18601;

    public RemoveUnusedVars_traverseNode_121208155181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18509 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term18601 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term18785 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term18601, term18601.getClass(), "type", -1679224431);
        setIntField(term18693, term18693.getClass(), "type", 1679224430);
        setIntField(term18785, term18785.getClass(), "type", 105);
        setField(term18693, term18693.getClass(), "first", term18785);
        setField(term18601, term18601.getClass(), "first", term18693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term18601;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term18509, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


