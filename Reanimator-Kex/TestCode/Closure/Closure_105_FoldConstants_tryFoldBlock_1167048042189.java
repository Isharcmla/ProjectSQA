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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FoldConstants_tryFoldBlock_1167048042189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48286;
     Object term48356;
     Object term48603;
     Object term48604;

    public FoldConstants_tryFoldBlock_1167048042189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48286 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term48356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48426, term48426.getClass(), "next", term48356);
        setIntField(term48426, term48426.getClass(), "type", 103);
        setField(term48356, term48356.getClass(), "first", term48426);
        setField(term48356, term48356.getClass(), "next", term48496);
        setIntField(term48356, term48356.getClass(), "type", 127);
        term48603 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term48603, term48603.getClass(), "compiler", null);
        term48604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48604, term48604.getClass(), "type", 127);
        setIntField(term48605, term48605.getClass(), "type", 0);
        setField(term48605, term48605.getClass(), "next", null);
        setField(term48605, term48605.getClass(), "first", null);
        setField(term48605, term48605.getClass(), "last", null);
        setField(term48605, term48605.getClass(), "propListHead", null);
        setIntField(term48605, term48605.getClass(), "sourcePosition", 0);
        setField(term48605, term48605.getClass(), "jsType", null);
        setField(term48605, term48605.getClass(), "parent", null);
        setField(term48604, term48604.getClass(), "next", term48605);
        setIntField(term48606, term48606.getClass(), "type", 103);
        setField(term48606, term48606.getClass(), "next", term48604);
        setField(term48606, term48606.getClass(), "first", null);
        setField(term48606, term48606.getClass(), "last", null);
        setField(term48606, term48606.getClass(), "propListHead", null);
        setIntField(term48606, term48606.getClass(), "sourcePosition", 0);
        setField(term48606, term48606.getClass(), "jsType", null);
        setField(term48606, term48606.getClass(), "parent", null);
        setField(term48604, term48604.getClass(), "first", term48606);
        setField(term48604, term48604.getClass(), "last", null);
        setField(term48604, term48604.getClass(), "propListHead", null);
        setIntField(term48604, term48604.getClass(), "sourcePosition", 0);
        setField(term48604, term48604.getClass(), "jsType", null);
        setField(term48604, term48604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term48356;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term48286, args);
        assertTrue(recursiveEquals(term48286, term48603));
        assertTrue(recursiveEquals(term48356, null));
    }

};


