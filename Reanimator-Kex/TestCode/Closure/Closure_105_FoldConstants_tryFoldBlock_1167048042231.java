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

public class FoldConstants_tryFoldBlock_1167048042231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60535;
     Object term60605;
     Object term61196;
     Object term61197;

    public FoldConstants_tryFoldBlock_1167048042231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60535 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term60605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60675, term60675.getClass(), "next", term60605);
        setIntField(term60675, term60675.getClass(), "type", 31);
        setField(term60605, term60605.getClass(), "first", term60675);
        setField(term60605, term60605.getClass(), "next", term60745);
        setIntField(term60605, term60605.getClass(), "type", 67);
        term61196 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term61196, term61196.getClass(), "compiler", null);
        term61197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61197, term61197.getClass(), "type", 67);
        setIntField(term61198, term61198.getClass(), "type", 0);
        setField(term61198, term61198.getClass(), "next", null);
        setField(term61198, term61198.getClass(), "first", null);
        setField(term61198, term61198.getClass(), "last", null);
        setField(term61198, term61198.getClass(), "propListHead", null);
        setIntField(term61198, term61198.getClass(), "sourcePosition", 0);
        setField(term61198, term61198.getClass(), "jsType", null);
        setField(term61198, term61198.getClass(), "parent", null);
        setField(term61197, term61197.getClass(), "next", term61198);
        setIntField(term61199, term61199.getClass(), "type", 31);
        setField(term61199, term61199.getClass(), "next", term61197);
        setField(term61199, term61199.getClass(), "first", null);
        setField(term61199, term61199.getClass(), "last", null);
        setField(term61199, term61199.getClass(), "propListHead", null);
        setIntField(term61199, term61199.getClass(), "sourcePosition", 0);
        setField(term61199, term61199.getClass(), "jsType", null);
        setField(term61199, term61199.getClass(), "parent", null);
        setField(term61197, term61197.getClass(), "first", term61199);
        setField(term61197, term61197.getClass(), "last", null);
        setField(term61197, term61197.getClass(), "propListHead", null);
        setIntField(term61197, term61197.getClass(), "sourcePosition", 0);
        setField(term61197, term61197.getClass(), "jsType", null);
        setField(term61197, term61197.getClass(), "parent", null);
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
        args[1] = term60605;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term60535, args);
        assertTrue(recursiveEquals(term60535, term61196));
        assertTrue(recursiveEquals(term60605, null));
    }

};


