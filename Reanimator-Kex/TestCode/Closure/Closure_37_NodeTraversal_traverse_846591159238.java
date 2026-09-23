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

public class NodeTraversal_traverse_846591159238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60268;
     Object term60338;
     Object term60626;

    public NodeTraversal_traverse_846591159238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60268 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term60338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60338, term60338.getClass(), "type", 0);
        setField(term60338, term60338.getClass(), "parent", null);
        setField(term60408, term60408.getClass(), "next", term60478);
        setIntField(term60408, term60408.getClass(), "type", 132);
        setField(term60338, term60338.getClass(), "first", term60408);
        term60626 = newInstance(Class.forName("com.google.javascript.jscomp.InlineSimpleMethods$InlineTrivialAccessors"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = term60268;
        args[1] = term60338;
        args[2] = term60626;
        callMethod(klass, "traverse", argTypes, null, args);
    }

};


