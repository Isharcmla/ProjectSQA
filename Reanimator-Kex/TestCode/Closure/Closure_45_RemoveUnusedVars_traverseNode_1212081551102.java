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

public class RemoveUnusedVars_traverseNode_1212081551102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28158;
     Object term28250;

    public RemoveUnusedVars_traverseNode_1212081551102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28158 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term28250 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28342 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term28526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28250, term28250.getClass(), "type", 64);
        setIntField(term28342, term28342.getClass(), "type", 64);
        setIntField(term28434, term28434.getClass(), "type", 64);
        setField(term28434, term28434.getClass(), "first", null);
        setField(term28434, term28434.getClass(), "next", null);
        setField(term28342, term28342.getClass(), "first", term28434);
        setField(term28342, term28342.getClass(), "next", term28526);
        setField(term28250, term28250.getClass(), "first", term28342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term28250;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term28158, args);
    }

};


