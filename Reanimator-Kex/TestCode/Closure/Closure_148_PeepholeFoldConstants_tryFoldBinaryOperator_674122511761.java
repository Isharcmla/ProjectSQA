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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171241;
     Object term171333;
     Object term172116;
     Object term172117;
     Object term172060;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171241 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term171333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term171425, term171425.getClass(), "next", term171517);
        setIntField(term171425, term171425.getClass(), "type", 0);
        setField(term171333, term171333.getClass(), "first", term171425);
        setIntField(term171333, term171333.getClass(), "type", 101);
        setField(term171333, term171333.getClass(), "parent", null);
        term172116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term172116, term172116.getClass(), "currentTraversal", null);
        term172117 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172119 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term172117, term172117.getClass(), "str", null);
        setIntField(term172117, term172117.getClass(), "type", 101);
        setField(term172117, term172117.getClass(), "next", null);
        setField(term172118, term172118.getClass(), "str", null);
        setIntField(term172118, term172118.getClass(), "type", 0);
        setDoubleField(term172119, term172119.getClass(), "number", 0.0);
        setIntField(term172119, term172119.getClass(), "type", 0);
        setField(term172119, term172119.getClass(), "next", null);
        setField(term172119, term172119.getClass(), "first", null);
        setField(term172119, term172119.getClass(), "last", null);
        setField(term172119, term172119.getClass(), "propListHead", null);
        setIntField(term172119, term172119.getClass(), "sourcePosition", 0);
        setField(term172119, term172119.getClass(), "jsType", null);
        setField(term172119, term172119.getClass(), "parent", null);
        setField(term172118, term172118.getClass(), "next", term172119);
        setField(term172118, term172118.getClass(), "first", null);
        setField(term172118, term172118.getClass(), "last", null);
        setField(term172118, term172118.getClass(), "propListHead", null);
        setIntField(term172118, term172118.getClass(), "sourcePosition", 0);
        setField(term172118, term172118.getClass(), "jsType", null);
        setField(term172118, term172118.getClass(), "parent", null);
        setField(term172117, term172117.getClass(), "first", term172118);
        setField(term172117, term172117.getClass(), "last", null);
        setField(term172117, term172117.getClass(), "propListHead", null);
        setIntField(term172117, term172117.getClass(), "sourcePosition", 0);
        setField(term172117, term172117.getClass(), "jsType", null);
        setField(term172117, term172117.getClass(), "parent", null);
        term172060 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172062 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term172064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term172060, term172060.getClass(), "str", null);
        setIntField(term172060, term172060.getClass(), "type", 101);
        setField(term172060, term172060.getClass(), "next", null);
        setField(term172062, term172062.getClass(), "str", null);
        setIntField(term172062, term172062.getClass(), "type", 0);
        setDoubleField(term172064, term172064.getClass(), "number", 0.0);
        setIntField(term172064, term172064.getClass(), "type", 0);
        setField(term172064, term172064.getClass(), "next", null);
        setField(term172064, term172064.getClass(), "first", null);
        setField(term172064, term172064.getClass(), "last", null);
        setField(term172064, term172064.getClass(), "propListHead", null);
        setIntField(term172064, term172064.getClass(), "sourcePosition", 0);
        setField(term172064, term172064.getClass(), "jsType", null);
        setField(term172064, term172064.getClass(), "parent", null);
        setField(term172062, term172062.getClass(), "next", term172064);
        setField(term172062, term172062.getClass(), "first", null);
        setField(term172062, term172062.getClass(), "last", null);
        setField(term172062, term172062.getClass(), "propListHead", null);
        setIntField(term172062, term172062.getClass(), "sourcePosition", 0);
        setField(term172062, term172062.getClass(), "jsType", null);
        setField(term172062, term172062.getClass(), "parent", null);
        setField(term172060, term172060.getClass(), "first", term172062);
        setField(term172060, term172060.getClass(), "last", null);
        setField(term172060, term172060.getClass(), "propListHead", null);
        setIntField(term172060, term172060.getClass(), "sourcePosition", 0);
        setField(term172060, term172060.getClass(), "jsType", null);
        setField(term172060, term172060.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171333;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term171241, args);
        assertTrue(recursiveEquals(term171241, term172116));
        assertTrue(recursiveEquals(term171333, term172117));
        assertTrue(recursiveEquals(retValue, term172060));
    }

};


