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

public class RemoveUnusedVars_traverseNode_121208155174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16151;
     Object term16243;

    public RemoveUnusedVars_traverseNode_121208155174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16151 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term16243 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term16519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term16243, term16243.getClass(), "type", 64);
        setIntField(term16335, term16335.getClass(), "type", 64);
        setIntField(term16427, term16427.getClass(), "type", 0);
        setField(term16427, term16427.getClass(), "first", null);
        setField(term16427, term16427.getClass(), "next", null);
        setField(term16335, term16335.getClass(), "first", term16427);
        setIntField(term16519, term16519.getClass(), "type", 105);
        setField(term16335, term16335.getClass(), "next", term16519);
        setField(term16243, term16243.getClass(), "first", term16335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term16243;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term16151, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


