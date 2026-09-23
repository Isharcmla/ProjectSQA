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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257111;
     Object term257203;
     Object term257842;
     Object term257843;
     Object term257782;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257111 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term257203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term257295, term257295.getClass(), "next", term257387);
        setIntField(term257295, term257295.getClass(), "type", 0);
        setField(term257203, term257203.getClass(), "first", term257295);
        setIntField(term257203, term257203.getClass(), "type", 101);
        setField(term257203, term257203.getClass(), "parent", null);
        term257842 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term257842, term257842.getClass(), "currentTraversal", null);
        term257843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term257843, term257843.getClass(), "number", 0.0);
        setIntField(term257843, term257843.getClass(), "type", 101);
        setField(term257843, term257843.getClass(), "next", null);
        setDoubleField(term257844, term257844.getClass(), "number", 0.0);
        setIntField(term257844, term257844.getClass(), "type", 0);
        setDoubleField(term257845, term257845.getClass(), "number", 0.0);
        setIntField(term257845, term257845.getClass(), "type", 0);
        setField(term257845, term257845.getClass(), "next", null);
        setField(term257845, term257845.getClass(), "first", null);
        setField(term257845, term257845.getClass(), "last", null);
        setField(term257845, term257845.getClass(), "propListHead", null);
        setIntField(term257845, term257845.getClass(), "sourcePosition", 0);
        setField(term257845, term257845.getClass(), "jsType", null);
        setField(term257845, term257845.getClass(), "parent", null);
        setField(term257844, term257844.getClass(), "next", term257845);
        setField(term257844, term257844.getClass(), "first", null);
        setField(term257844, term257844.getClass(), "last", null);
        setField(term257844, term257844.getClass(), "propListHead", null);
        setIntField(term257844, term257844.getClass(), "sourcePosition", 0);
        setField(term257844, term257844.getClass(), "jsType", null);
        setField(term257844, term257844.getClass(), "parent", null);
        setField(term257843, term257843.getClass(), "first", term257844);
        setField(term257843, term257843.getClass(), "last", null);
        setField(term257843, term257843.getClass(), "propListHead", null);
        setIntField(term257843, term257843.getClass(), "sourcePosition", 0);
        setField(term257843, term257843.getClass(), "jsType", null);
        setField(term257843, term257843.getClass(), "parent", null);
        term257782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term257788 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term257782, term257782.getClass(), "number", 0.0);
        setIntField(term257782, term257782.getClass(), "type", 101);
        setField(term257782, term257782.getClass(), "next", null);
        setDoubleField(term257785, term257785.getClass(), "number", 0.0);
        setIntField(term257785, term257785.getClass(), "type", 0);
        setDoubleField(term257788, term257788.getClass(), "number", 0.0);
        setIntField(term257788, term257788.getClass(), "type", 0);
        setField(term257788, term257788.getClass(), "next", null);
        setField(term257788, term257788.getClass(), "first", null);
        setField(term257788, term257788.getClass(), "last", null);
        setField(term257788, term257788.getClass(), "propListHead", null);
        setIntField(term257788, term257788.getClass(), "sourcePosition", 0);
        setField(term257788, term257788.getClass(), "jsType", null);
        setField(term257788, term257788.getClass(), "parent", null);
        setField(term257785, term257785.getClass(), "next", term257788);
        setField(term257785, term257785.getClass(), "first", null);
        setField(term257785, term257785.getClass(), "last", null);
        setField(term257785, term257785.getClass(), "propListHead", null);
        setIntField(term257785, term257785.getClass(), "sourcePosition", 0);
        setField(term257785, term257785.getClass(), "jsType", null);
        setField(term257785, term257785.getClass(), "parent", null);
        setField(term257782, term257782.getClass(), "first", term257785);
        setField(term257782, term257782.getClass(), "last", null);
        setField(term257782, term257782.getClass(), "propListHead", null);
        setIntField(term257782, term257782.getClass(), "sourcePosition", 0);
        setField(term257782, term257782.getClass(), "jsType", null);
        setField(term257782, term257782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term257203;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term257111, args);
        assertTrue(recursiveEquals(term257111, term257842));
        assertTrue(recursiveEquals(term257203, term257843));
        assertTrue(recursiveEquals(retValue, term257782));
    }

};


