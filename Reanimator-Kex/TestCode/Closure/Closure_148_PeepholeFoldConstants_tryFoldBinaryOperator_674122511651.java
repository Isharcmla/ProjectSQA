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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143723;
     Object term143815;
     Object term144237;
     Object term144238;
     Object term144197;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143723 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term143815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term143907, term143907.getClass(), "next", term143999);
        setIntField(term143907, term143907.getClass(), "type", 63);
        setField(term143815, term143815.getClass(), "first", term143907);
        setIntField(term143815, term143815.getClass(), "type", 35);
        term144237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term144237, term144237.getClass(), "currentTraversal", null);
        term144238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term144238, term144238.getClass(), "number", 0.0);
        setIntField(term144238, term144238.getClass(), "type", 35);
        setField(term144238, term144238.getClass(), "next", null);
        setDoubleField(term144239, term144239.getClass(), "number", 0.0);
        setIntField(term144239, term144239.getClass(), "type", 63);
        setDoubleField(term144240, term144240.getClass(), "number", 0.0);
        setIntField(term144240, term144240.getClass(), "type", 0);
        setField(term144240, term144240.getClass(), "next", null);
        setField(term144240, term144240.getClass(), "first", null);
        setField(term144240, term144240.getClass(), "last", null);
        setField(term144240, term144240.getClass(), "propListHead", null);
        setIntField(term144240, term144240.getClass(), "sourcePosition", 0);
        setField(term144240, term144240.getClass(), "jsType", null);
        setField(term144240, term144240.getClass(), "parent", null);
        setField(term144239, term144239.getClass(), "next", term144240);
        setField(term144239, term144239.getClass(), "first", null);
        setField(term144239, term144239.getClass(), "last", null);
        setField(term144239, term144239.getClass(), "propListHead", null);
        setIntField(term144239, term144239.getClass(), "sourcePosition", 0);
        setField(term144239, term144239.getClass(), "jsType", null);
        setField(term144239, term144239.getClass(), "parent", null);
        setField(term144238, term144238.getClass(), "first", term144239);
        setField(term144238, term144238.getClass(), "last", null);
        setField(term144238, term144238.getClass(), "propListHead", null);
        setIntField(term144238, term144238.getClass(), "sourcePosition", 0);
        setField(term144238, term144238.getClass(), "jsType", null);
        setField(term144238, term144238.getClass(), "parent", null);
        term144197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144200 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term144203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term144197, term144197.getClass(), "number", 0.0);
        setIntField(term144197, term144197.getClass(), "type", 35);
        setField(term144197, term144197.getClass(), "next", null);
        setDoubleField(term144200, term144200.getClass(), "number", 0.0);
        setIntField(term144200, term144200.getClass(), "type", 63);
        setDoubleField(term144203, term144203.getClass(), "number", 0.0);
        setIntField(term144203, term144203.getClass(), "type", 0);
        setField(term144203, term144203.getClass(), "next", null);
        setField(term144203, term144203.getClass(), "first", null);
        setField(term144203, term144203.getClass(), "last", null);
        setField(term144203, term144203.getClass(), "propListHead", null);
        setIntField(term144203, term144203.getClass(), "sourcePosition", 0);
        setField(term144203, term144203.getClass(), "jsType", null);
        setField(term144203, term144203.getClass(), "parent", null);
        setField(term144200, term144200.getClass(), "next", term144203);
        setField(term144200, term144200.getClass(), "first", null);
        setField(term144200, term144200.getClass(), "last", null);
        setField(term144200, term144200.getClass(), "propListHead", null);
        setIntField(term144200, term144200.getClass(), "sourcePosition", 0);
        setField(term144200, term144200.getClass(), "jsType", null);
        setField(term144200, term144200.getClass(), "parent", null);
        setField(term144197, term144197.getClass(), "first", term144200);
        setField(term144197, term144197.getClass(), "last", null);
        setField(term144197, term144197.getClass(), "propListHead", null);
        setIntField(term144197, term144197.getClass(), "sourcePosition", 0);
        setField(term144197, term144197.getClass(), "jsType", null);
        setField(term144197, term144197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term143815;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term143723, args);
        assertTrue(recursiveEquals(term143723, term144237));
        assertTrue(recursiveEquals(term143815, term144238));
        assertTrue(recursiveEquals(retValue, term144197));
    }

};


