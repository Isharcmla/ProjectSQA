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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531035;
     Object term531127;
     Object term531736;
     Object term531737;
     Object term531702;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531035 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term531127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531219 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531311 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term531219, term531219.getClass(), "next", term531311);
        setField(term531127, term531127.getClass(), "first", term531219);
        setIntField(term531127, term531127.getClass(), "type", 12);
        term531736 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term531736, term531736.getClass(), "currentTraversal", null);
        term531737 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term531737, term531737.getClass(), "str", null);
        setIntField(term531737, term531737.getClass(), "type", 12);
        setField(term531737, term531737.getClass(), "next", null);
        setField(term531738, term531738.getClass(), "str", null);
        setIntField(term531738, term531738.getClass(), "type", 0);
        setField(term531739, term531739.getClass(), "str", null);
        setIntField(term531739, term531739.getClass(), "type", 0);
        setField(term531739, term531739.getClass(), "next", null);
        setField(term531739, term531739.getClass(), "first", null);
        setField(term531739, term531739.getClass(), "last", null);
        setField(term531739, term531739.getClass(), "propListHead", null);
        setIntField(term531739, term531739.getClass(), "sourcePosition", 0);
        setField(term531739, term531739.getClass(), "jsType", null);
        setField(term531739, term531739.getClass(), "parent", null);
        setField(term531738, term531738.getClass(), "next", term531739);
        setField(term531738, term531738.getClass(), "first", null);
        setField(term531738, term531738.getClass(), "last", null);
        setField(term531738, term531738.getClass(), "propListHead", null);
        setIntField(term531738, term531738.getClass(), "sourcePosition", 0);
        setField(term531738, term531738.getClass(), "jsType", null);
        setField(term531738, term531738.getClass(), "parent", null);
        setField(term531737, term531737.getClass(), "first", term531738);
        setField(term531737, term531737.getClass(), "last", null);
        setField(term531737, term531737.getClass(), "propListHead", null);
        setIntField(term531737, term531737.getClass(), "sourcePosition", 0);
        setField(term531737, term531737.getClass(), "jsType", null);
        setField(term531737, term531737.getClass(), "parent", null);
        term531702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term531706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term531702, term531702.getClass(), "str", null);
        setIntField(term531702, term531702.getClass(), "type", 12);
        setField(term531702, term531702.getClass(), "next", null);
        setField(term531704, term531704.getClass(), "str", null);
        setIntField(term531704, term531704.getClass(), "type", 0);
        setField(term531706, term531706.getClass(), "str", null);
        setIntField(term531706, term531706.getClass(), "type", 0);
        setField(term531706, term531706.getClass(), "next", null);
        setField(term531706, term531706.getClass(), "first", null);
        setField(term531706, term531706.getClass(), "last", null);
        setField(term531706, term531706.getClass(), "propListHead", null);
        setIntField(term531706, term531706.getClass(), "sourcePosition", 0);
        setField(term531706, term531706.getClass(), "jsType", null);
        setField(term531706, term531706.getClass(), "parent", null);
        setField(term531704, term531704.getClass(), "next", term531706);
        setField(term531704, term531704.getClass(), "first", null);
        setField(term531704, term531704.getClass(), "last", null);
        setField(term531704, term531704.getClass(), "propListHead", null);
        setIntField(term531704, term531704.getClass(), "sourcePosition", 0);
        setField(term531704, term531704.getClass(), "jsType", null);
        setField(term531704, term531704.getClass(), "parent", null);
        setField(term531702, term531702.getClass(), "first", term531704);
        setField(term531702, term531702.getClass(), "last", null);
        setField(term531702, term531702.getClass(), "propListHead", null);
        setIntField(term531702, term531702.getClass(), "sourcePosition", 0);
        setField(term531702, term531702.getClass(), "jsType", null);
        setField(term531702, term531702.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term531127;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term531035, args);
        assertTrue(recursiveEquals(term531035, term531736));
        assertTrue(recursiveEquals(term531127, term531737));
        assertTrue(recursiveEquals(retValue, term531702));
    }

};


