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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132048;
     Object term132140;
     Object term132873;
     Object term132874;
     Object term132823;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term132140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132324 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term132324, term132324.getClass(), "type", 42);
        setField(term132232, term132232.getClass(), "next", term132324);
        setIntField(term132232, term132232.getClass(), "type", 42);
        setField(term132140, term132140.getClass(), "first", term132232);
        setIntField(term132140, term132140.getClass(), "type", 14);
        term132873 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term132873, term132873.getClass(), "currentTraversal", null);
        term132874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132875 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132876 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term132874, term132874.getClass(), "number", 0.0);
        setIntField(term132874, term132874.getClass(), "type", 14);
        setField(term132874, term132874.getClass(), "next", null);
        setDoubleField(term132875, term132875.getClass(), "number", 0.0);
        setIntField(term132875, term132875.getClass(), "type", 42);
        setField(term132876, term132876.getClass(), "str", null);
        setIntField(term132876, term132876.getClass(), "type", 42);
        setField(term132876, term132876.getClass(), "next", null);
        setField(term132876, term132876.getClass(), "first", null);
        setField(term132876, term132876.getClass(), "last", null);
        setField(term132876, term132876.getClass(), "propListHead", null);
        setIntField(term132876, term132876.getClass(), "sourcePosition", 0);
        setField(term132876, term132876.getClass(), "jsType", null);
        setField(term132876, term132876.getClass(), "parent", null);
        setField(term132875, term132875.getClass(), "next", term132876);
        setField(term132875, term132875.getClass(), "first", null);
        setField(term132875, term132875.getClass(), "last", null);
        setField(term132875, term132875.getClass(), "propListHead", null);
        setIntField(term132875, term132875.getClass(), "sourcePosition", 0);
        setField(term132875, term132875.getClass(), "jsType", null);
        setField(term132875, term132875.getClass(), "parent", null);
        setField(term132874, term132874.getClass(), "first", term132875);
        setField(term132874, term132874.getClass(), "last", null);
        setField(term132874, term132874.getClass(), "propListHead", null);
        setIntField(term132874, term132874.getClass(), "sourcePosition", 0);
        setField(term132874, term132874.getClass(), "jsType", null);
        setField(term132874, term132874.getClass(), "parent", null);
        term132823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term132829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term132823, term132823.getClass(), "number", 0.0);
        setIntField(term132823, term132823.getClass(), "type", 14);
        setField(term132823, term132823.getClass(), "next", null);
        setDoubleField(term132826, term132826.getClass(), "number", 0.0);
        setIntField(term132826, term132826.getClass(), "type", 42);
        setField(term132829, term132829.getClass(), "str", null);
        setIntField(term132829, term132829.getClass(), "type", 42);
        setField(term132829, term132829.getClass(), "next", null);
        setField(term132829, term132829.getClass(), "first", null);
        setField(term132829, term132829.getClass(), "last", null);
        setField(term132829, term132829.getClass(), "propListHead", null);
        setIntField(term132829, term132829.getClass(), "sourcePosition", 0);
        setField(term132829, term132829.getClass(), "jsType", null);
        setField(term132829, term132829.getClass(), "parent", null);
        setField(term132826, term132826.getClass(), "next", term132829);
        setField(term132826, term132826.getClass(), "first", null);
        setField(term132826, term132826.getClass(), "last", null);
        setField(term132826, term132826.getClass(), "propListHead", null);
        setIntField(term132826, term132826.getClass(), "sourcePosition", 0);
        setField(term132826, term132826.getClass(), "jsType", null);
        setField(term132826, term132826.getClass(), "parent", null);
        setField(term132823, term132823.getClass(), "first", term132826);
        setField(term132823, term132823.getClass(), "last", null);
        setField(term132823, term132823.getClass(), "propListHead", null);
        setIntField(term132823, term132823.getClass(), "sourcePosition", 0);
        setField(term132823, term132823.getClass(), "jsType", null);
        setField(term132823, term132823.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term132140;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term132048, args);
        assertTrue(recursiveEquals(term132048, term132873));
        assertTrue(recursiveEquals(term132140, term132874));
        assertTrue(recursiveEquals(retValue, term132823));
    }

};


