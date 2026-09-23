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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280423;
     Object term280515;
     Object term303790;
     Object term303791;
     Object term303730;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280423 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term280515 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280607 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term280699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term280607, term280607.getClass(), "next", term280699);
        setIntField(term280607, term280607.getClass(), "type", 0);
        setField(term280515, term280515.getClass(), "first", term280607);
        setIntField(term280515, term280515.getClass(), "type", 101);
        setField(term280515, term280515.getClass(), "parent", null);
        term303790 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303790, term303790.getClass(), "currentTraversal", null);
        term303791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303792 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303793 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303791, term303791.getClass(), "number", 0.0);
        setIntField(term303791, term303791.getClass(), "type", 101);
        setField(term303791, term303791.getClass(), "next", null);
        setDoubleField(term303792, term303792.getClass(), "number", 0.0);
        setIntField(term303792, term303792.getClass(), "type", 0);
        setDoubleField(term303793, term303793.getClass(), "number", 0.0);
        setIntField(term303793, term303793.getClass(), "type", 0);
        setField(term303793, term303793.getClass(), "next", null);
        setField(term303793, term303793.getClass(), "first", null);
        setField(term303793, term303793.getClass(), "last", null);
        setField(term303793, term303793.getClass(), "propListHead", null);
        setIntField(term303793, term303793.getClass(), "sourcePosition", 0);
        setField(term303793, term303793.getClass(), "jsType", null);
        setField(term303793, term303793.getClass(), "parent", null);
        setField(term303792, term303792.getClass(), "next", term303793);
        setField(term303792, term303792.getClass(), "first", null);
        setField(term303792, term303792.getClass(), "last", null);
        setField(term303792, term303792.getClass(), "propListHead", null);
        setIntField(term303792, term303792.getClass(), "sourcePosition", 0);
        setField(term303792, term303792.getClass(), "jsType", null);
        setField(term303792, term303792.getClass(), "parent", null);
        setField(term303791, term303791.getClass(), "first", term303792);
        setField(term303791, term303791.getClass(), "last", null);
        setField(term303791, term303791.getClass(), "propListHead", null);
        setIntField(term303791, term303791.getClass(), "sourcePosition", 0);
        setField(term303791, term303791.getClass(), "jsType", null);
        setField(term303791, term303791.getClass(), "parent", null);
        term303730 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term303736 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303730, term303730.getClass(), "number", 0.0);
        setIntField(term303730, term303730.getClass(), "type", 101);
        setField(term303730, term303730.getClass(), "next", null);
        setDoubleField(term303733, term303733.getClass(), "number", 0.0);
        setIntField(term303733, term303733.getClass(), "type", 0);
        setDoubleField(term303736, term303736.getClass(), "number", 0.0);
        setIntField(term303736, term303736.getClass(), "type", 0);
        setField(term303736, term303736.getClass(), "next", null);
        setField(term303736, term303736.getClass(), "first", null);
        setField(term303736, term303736.getClass(), "last", null);
        setField(term303736, term303736.getClass(), "propListHead", null);
        setIntField(term303736, term303736.getClass(), "sourcePosition", 0);
        setField(term303736, term303736.getClass(), "jsType", null);
        setField(term303736, term303736.getClass(), "parent", null);
        setField(term303733, term303733.getClass(), "next", term303736);
        setField(term303733, term303733.getClass(), "first", null);
        setField(term303733, term303733.getClass(), "last", null);
        setField(term303733, term303733.getClass(), "propListHead", null);
        setIntField(term303733, term303733.getClass(), "sourcePosition", 0);
        setField(term303733, term303733.getClass(), "jsType", null);
        setField(term303733, term303733.getClass(), "parent", null);
        setField(term303730, term303730.getClass(), "first", term303733);
        setField(term303730, term303730.getClass(), "last", null);
        setField(term303730, term303730.getClass(), "propListHead", null);
        setIntField(term303730, term303730.getClass(), "sourcePosition", 0);
        setField(term303730, term303730.getClass(), "jsType", null);
        setField(term303730, term303730.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term280515;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term280423, args);
        assertTrue(recursiveEquals(term280423, term303790));
        assertTrue(recursiveEquals(term280515, term303791));
        assertTrue(recursiveEquals(retValue, term303730));
    }

};


