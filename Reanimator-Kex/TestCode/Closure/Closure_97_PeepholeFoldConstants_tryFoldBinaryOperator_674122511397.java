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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91882;
     Object term91974;
     Object term92591;
     Object term92592;
     Object term92535;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term91974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92158 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92066, term92066.getClass(), "next", term92158);
        setIntField(term92066, term92066.getClass(), "type", 0);
        setField(term91974, term91974.getClass(), "first", term92066);
        setIntField(term91974, term91974.getClass(), "type", 100);
        setField(term91974, term91974.getClass(), "parent", null);
        term92591 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term92591, term92591.getClass(), "currentTraversal", null);
        term92592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92592, term92592.getClass(), "str", null);
        setIntField(term92592, term92592.getClass(), "type", 100);
        setField(term92592, term92592.getClass(), "next", null);
        setField(term92593, term92593.getClass(), "str", null);
        setIntField(term92593, term92593.getClass(), "type", 0);
        setDoubleField(term92594, term92594.getClass(), "number", 0.0);
        setIntField(term92594, term92594.getClass(), "type", 0);
        setField(term92594, term92594.getClass(), "next", null);
        setField(term92594, term92594.getClass(), "first", null);
        setField(term92594, term92594.getClass(), "last", null);
        setField(term92594, term92594.getClass(), "propListHead", null);
        setIntField(term92594, term92594.getClass(), "sourcePosition", 0);
        setField(term92594, term92594.getClass(), "jsType", null);
        setField(term92594, term92594.getClass(), "parent", null);
        setField(term92593, term92593.getClass(), "next", term92594);
        setField(term92593, term92593.getClass(), "first", null);
        setField(term92593, term92593.getClass(), "last", null);
        setField(term92593, term92593.getClass(), "propListHead", null);
        setIntField(term92593, term92593.getClass(), "sourcePosition", 0);
        setField(term92593, term92593.getClass(), "jsType", null);
        setField(term92593, term92593.getClass(), "parent", null);
        setField(term92592, term92592.getClass(), "first", term92593);
        setField(term92592, term92592.getClass(), "last", null);
        setField(term92592, term92592.getClass(), "propListHead", null);
        setIntField(term92592, term92592.getClass(), "sourcePosition", 0);
        setField(term92592, term92592.getClass(), "jsType", null);
        setField(term92592, term92592.getClass(), "parent", null);
        term92535 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term92539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term92535, term92535.getClass(), "str", null);
        setIntField(term92535, term92535.getClass(), "type", 100);
        setField(term92535, term92535.getClass(), "next", null);
        setField(term92537, term92537.getClass(), "str", null);
        setIntField(term92537, term92537.getClass(), "type", 0);
        setDoubleField(term92539, term92539.getClass(), "number", 0.0);
        setIntField(term92539, term92539.getClass(), "type", 0);
        setField(term92539, term92539.getClass(), "next", null);
        setField(term92539, term92539.getClass(), "first", null);
        setField(term92539, term92539.getClass(), "last", null);
        setField(term92539, term92539.getClass(), "propListHead", null);
        setIntField(term92539, term92539.getClass(), "sourcePosition", 0);
        setField(term92539, term92539.getClass(), "jsType", null);
        setField(term92539, term92539.getClass(), "parent", null);
        setField(term92537, term92537.getClass(), "next", term92539);
        setField(term92537, term92537.getClass(), "first", null);
        setField(term92537, term92537.getClass(), "last", null);
        setField(term92537, term92537.getClass(), "propListHead", null);
        setIntField(term92537, term92537.getClass(), "sourcePosition", 0);
        setField(term92537, term92537.getClass(), "jsType", null);
        setField(term92537, term92537.getClass(), "parent", null);
        setField(term92535, term92535.getClass(), "first", term92537);
        setField(term92535, term92535.getClass(), "last", null);
        setField(term92535, term92535.getClass(), "propListHead", null);
        setIntField(term92535, term92535.getClass(), "sourcePosition", 0);
        setField(term92535, term92535.getClass(), "jsType", null);
        setField(term92535, term92535.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term91974;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term91882, args);
        assertTrue(recursiveEquals(term91882, term92591));
        assertTrue(recursiveEquals(term91974, term92592));
        assertTrue(recursiveEquals(retValue, term92535));
    }

};


