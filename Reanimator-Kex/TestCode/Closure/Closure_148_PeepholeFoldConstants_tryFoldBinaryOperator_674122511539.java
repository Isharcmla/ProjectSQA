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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115273;
     Object term115365;
     Object term116024;
     Object term116025;
     Object term115976;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term115365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115457 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115549 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term115457, term115457.getClass(), "next", term115549);
        setIntField(term115457, term115457.getClass(), "type", 14);
        setField(term115365, term115365.getClass(), "first", term115457);
        setIntField(term115365, term115365.getClass(), "type", 14);
        term116024 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term116024, term116024.getClass(), "currentTraversal", null);
        term116025 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116026 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term116027 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term116025, term116025.getClass(), "number", 0.0);
        setIntField(term116025, term116025.getClass(), "type", 14);
        setField(term116025, term116025.getClass(), "next", null);
        setDoubleField(term116026, term116026.getClass(), "number", 0.0);
        setIntField(term116026, term116026.getClass(), "type", 14);
        setField(term116027, term116027.getClass(), "str", null);
        setIntField(term116027, term116027.getClass(), "type", 0);
        setField(term116027, term116027.getClass(), "next", null);
        setField(term116027, term116027.getClass(), "first", null);
        setField(term116027, term116027.getClass(), "last", null);
        setField(term116027, term116027.getClass(), "propListHead", null);
        setIntField(term116027, term116027.getClass(), "sourcePosition", 0);
        setField(term116027, term116027.getClass(), "jsType", null);
        setField(term116027, term116027.getClass(), "parent", null);
        setField(term116026, term116026.getClass(), "next", term116027);
        setField(term116026, term116026.getClass(), "first", null);
        setField(term116026, term116026.getClass(), "last", null);
        setField(term116026, term116026.getClass(), "propListHead", null);
        setIntField(term116026, term116026.getClass(), "sourcePosition", 0);
        setField(term116026, term116026.getClass(), "jsType", null);
        setField(term116026, term116026.getClass(), "parent", null);
        setField(term116025, term116025.getClass(), "first", term116026);
        setField(term116025, term116025.getClass(), "last", null);
        setField(term116025, term116025.getClass(), "propListHead", null);
        setIntField(term116025, term116025.getClass(), "sourcePosition", 0);
        setField(term116025, term116025.getClass(), "jsType", null);
        setField(term116025, term116025.getClass(), "parent", null);
        term115976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115979 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term115982 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term115976, term115976.getClass(), "number", 0.0);
        setIntField(term115976, term115976.getClass(), "type", 14);
        setField(term115976, term115976.getClass(), "next", null);
        setDoubleField(term115979, term115979.getClass(), "number", 0.0);
        setIntField(term115979, term115979.getClass(), "type", 14);
        setField(term115982, term115982.getClass(), "str", null);
        setIntField(term115982, term115982.getClass(), "type", 0);
        setField(term115982, term115982.getClass(), "next", null);
        setField(term115982, term115982.getClass(), "first", null);
        setField(term115982, term115982.getClass(), "last", null);
        setField(term115982, term115982.getClass(), "propListHead", null);
        setIntField(term115982, term115982.getClass(), "sourcePosition", 0);
        setField(term115982, term115982.getClass(), "jsType", null);
        setField(term115982, term115982.getClass(), "parent", null);
        setField(term115979, term115979.getClass(), "next", term115982);
        setField(term115979, term115979.getClass(), "first", null);
        setField(term115979, term115979.getClass(), "last", null);
        setField(term115979, term115979.getClass(), "propListHead", null);
        setIntField(term115979, term115979.getClass(), "sourcePosition", 0);
        setField(term115979, term115979.getClass(), "jsType", null);
        setField(term115979, term115979.getClass(), "parent", null);
        setField(term115976, term115976.getClass(), "first", term115979);
        setField(term115976, term115976.getClass(), "last", null);
        setField(term115976, term115976.getClass(), "propListHead", null);
        setIntField(term115976, term115976.getClass(), "sourcePosition", 0);
        setField(term115976, term115976.getClass(), "jsType", null);
        setField(term115976, term115976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term115365;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term115273, args);
        assertTrue(recursiveEquals(term115273, term116024));
        assertTrue(recursiveEquals(term115365, term116025));
        assertTrue(recursiveEquals(retValue, term115976));
    }

};


