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

public class FoldConstants_tryFoldBlock_1167048042259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68961;
     Object term69031;
     Object term69447;
     Object term69448;

    public FoldConstants_tryFoldBlock_1167048042259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68961 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term69031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69241, term69241.getClass(), "next", term69311);
        setIntField(term69241, term69241.getClass(), "type", 128);
        setField(term69171, term69171.getClass(), "next", term69241);
        setIntField(term69171, term69171.getClass(), "type", 81);
        setField(term69101, term69101.getClass(), "next", term69171);
        setIntField(term69101, term69101.getClass(), "type", 60);
        setField(term69031, term69031.getClass(), "first", term69101);
        term69447 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term69447, term69447.getClass(), "compiler", null);
        term69448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69448, term69448.getClass(), "type", 0);
        setField(term69448, term69448.getClass(), "next", null);
        setIntField(term69449, term69449.getClass(), "type", 60);
        setIntField(term69450, term69450.getClass(), "type", 81);
        setIntField(term69451, term69451.getClass(), "type", 128);
        setIntField(term69452, term69452.getClass(), "type", 0);
        setField(term69452, term69452.getClass(), "next", null);
        setField(term69452, term69452.getClass(), "first", null);
        setField(term69452, term69452.getClass(), "last", null);
        setField(term69452, term69452.getClass(), "propListHead", null);
        setIntField(term69452, term69452.getClass(), "sourcePosition", 0);
        setField(term69452, term69452.getClass(), "jsType", null);
        setField(term69452, term69452.getClass(), "parent", null);
        setField(term69451, term69451.getClass(), "next", term69452);
        setField(term69451, term69451.getClass(), "first", null);
        setField(term69451, term69451.getClass(), "last", null);
        setField(term69451, term69451.getClass(), "propListHead", null);
        setIntField(term69451, term69451.getClass(), "sourcePosition", 0);
        setField(term69451, term69451.getClass(), "jsType", null);
        setField(term69451, term69451.getClass(), "parent", null);
        setField(term69450, term69450.getClass(), "next", term69451);
        setField(term69450, term69450.getClass(), "first", null);
        setField(term69450, term69450.getClass(), "last", null);
        setField(term69450, term69450.getClass(), "propListHead", null);
        setIntField(term69450, term69450.getClass(), "sourcePosition", 0);
        setField(term69450, term69450.getClass(), "jsType", null);
        setField(term69450, term69450.getClass(), "parent", null);
        setField(term69449, term69449.getClass(), "next", term69450);
        setField(term69449, term69449.getClass(), "first", null);
        setField(term69449, term69449.getClass(), "last", null);
        setField(term69449, term69449.getClass(), "propListHead", null);
        setIntField(term69449, term69449.getClass(), "sourcePosition", 0);
        setField(term69449, term69449.getClass(), "jsType", null);
        setField(term69449, term69449.getClass(), "parent", null);
        setField(term69448, term69448.getClass(), "first", term69449);
        setField(term69448, term69448.getClass(), "last", null);
        setField(term69448, term69448.getClass(), "propListHead", null);
        setIntField(term69448, term69448.getClass(), "sourcePosition", 0);
        setField(term69448, term69448.getClass(), "jsType", null);
        setField(term69448, term69448.getClass(), "parent", null);
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
        args[1] = term69031;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term68961, args);
        assertTrue(recursiveEquals(term68961, term69447));
        assertTrue(recursiveEquals(term69031, null));
    }

};


