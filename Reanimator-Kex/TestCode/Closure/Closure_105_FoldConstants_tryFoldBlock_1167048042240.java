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

public class FoldConstants_tryFoldBlock_1167048042240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62686;
     Object term62756;
     Object term63386;
     Object term63387;

    public FoldConstants_tryFoldBlock_1167048042240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62686 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term62756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62826, term62826.getClass(), "next", term62756);
        setIntField(term62826, term62826.getClass(), "type", 31);
        setField(term62756, term62756.getClass(), "first", term62826);
        setField(term62756, term62756.getClass(), "next", term62896);
        setIntField(term62756, term62756.getClass(), "type", 88);
        term63386 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term63386, term63386.getClass(), "compiler", null);
        term63387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63387, term63387.getClass(), "type", 88);
        setIntField(term63388, term63388.getClass(), "type", 0);
        setField(term63388, term63388.getClass(), "next", null);
        setField(term63388, term63388.getClass(), "first", null);
        setField(term63388, term63388.getClass(), "last", null);
        setField(term63388, term63388.getClass(), "propListHead", null);
        setIntField(term63388, term63388.getClass(), "sourcePosition", 0);
        setField(term63388, term63388.getClass(), "jsType", null);
        setField(term63388, term63388.getClass(), "parent", null);
        setField(term63387, term63387.getClass(), "next", term63388);
        setIntField(term63389, term63389.getClass(), "type", 31);
        setField(term63389, term63389.getClass(), "next", term63387);
        setField(term63389, term63389.getClass(), "first", null);
        setField(term63389, term63389.getClass(), "last", null);
        setField(term63389, term63389.getClass(), "propListHead", null);
        setIntField(term63389, term63389.getClass(), "sourcePosition", 0);
        setField(term63389, term63389.getClass(), "jsType", null);
        setField(term63389, term63389.getClass(), "parent", null);
        setField(term63387, term63387.getClass(), "first", term63389);
        setField(term63387, term63387.getClass(), "last", null);
        setField(term63387, term63387.getClass(), "propListHead", null);
        setIntField(term63387, term63387.getClass(), "sourcePosition", 0);
        setField(term63387, term63387.getClass(), "jsType", null);
        setField(term63387, term63387.getClass(), "parent", null);
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
        args[1] = term62756;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term62686, args);
        assertTrue(recursiveEquals(term62686, term63386));
        assertTrue(recursiveEquals(term62756, null));
    }

};


