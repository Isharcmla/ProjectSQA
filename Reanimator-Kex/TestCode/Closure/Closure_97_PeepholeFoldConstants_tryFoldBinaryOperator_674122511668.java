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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173022;
     Object term173114;
     Object term173345;
     Object term173346;
     Object term173307;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term173114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173206 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173298 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term173206, term173206.getClass(), "next", term173298);
        setField(term173114, term173114.getClass(), "first", term173206);
        setIntField(term173114, term173114.getClass(), "type", 35);
        term173345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term173345, term173345.getClass(), "currentTraversal", null);
        term173346 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173348 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term173346, term173346.getClass(), "number", 0.0);
        setIntField(term173346, term173346.getClass(), "type", 35);
        setField(term173346, term173346.getClass(), "next", null);
        setDoubleField(term173347, term173347.getClass(), "number", 0.0);
        setIntField(term173347, term173347.getClass(), "type", 0);
        setDoubleField(term173348, term173348.getClass(), "number", 0.0);
        setIntField(term173348, term173348.getClass(), "type", 0);
        setField(term173348, term173348.getClass(), "next", null);
        setField(term173348, term173348.getClass(), "first", null);
        setField(term173348, term173348.getClass(), "last", null);
        setField(term173348, term173348.getClass(), "propListHead", null);
        setIntField(term173348, term173348.getClass(), "sourcePosition", 0);
        setField(term173348, term173348.getClass(), "jsType", null);
        setField(term173348, term173348.getClass(), "parent", null);
        setField(term173347, term173347.getClass(), "next", term173348);
        setField(term173347, term173347.getClass(), "first", null);
        setField(term173347, term173347.getClass(), "last", null);
        setField(term173347, term173347.getClass(), "propListHead", null);
        setIntField(term173347, term173347.getClass(), "sourcePosition", 0);
        setField(term173347, term173347.getClass(), "jsType", null);
        setField(term173347, term173347.getClass(), "parent", null);
        setField(term173346, term173346.getClass(), "first", term173347);
        setField(term173346, term173346.getClass(), "last", null);
        setField(term173346, term173346.getClass(), "propListHead", null);
        setIntField(term173346, term173346.getClass(), "sourcePosition", 0);
        setField(term173346, term173346.getClass(), "jsType", null);
        setField(term173346, term173346.getClass(), "parent", null);
        term173307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173310 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173313 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term173307, term173307.getClass(), "number", 0.0);
        setIntField(term173307, term173307.getClass(), "type", 35);
        setField(term173307, term173307.getClass(), "next", null);
        setDoubleField(term173310, term173310.getClass(), "number", 0.0);
        setIntField(term173310, term173310.getClass(), "type", 0);
        setDoubleField(term173313, term173313.getClass(), "number", 0.0);
        setIntField(term173313, term173313.getClass(), "type", 0);
        setField(term173313, term173313.getClass(), "next", null);
        setField(term173313, term173313.getClass(), "first", null);
        setField(term173313, term173313.getClass(), "last", null);
        setField(term173313, term173313.getClass(), "propListHead", null);
        setIntField(term173313, term173313.getClass(), "sourcePosition", 0);
        setField(term173313, term173313.getClass(), "jsType", null);
        setField(term173313, term173313.getClass(), "parent", null);
        setField(term173310, term173310.getClass(), "next", term173313);
        setField(term173310, term173310.getClass(), "first", null);
        setField(term173310, term173310.getClass(), "last", null);
        setField(term173310, term173310.getClass(), "propListHead", null);
        setIntField(term173310, term173310.getClass(), "sourcePosition", 0);
        setField(term173310, term173310.getClass(), "jsType", null);
        setField(term173310, term173310.getClass(), "parent", null);
        setField(term173307, term173307.getClass(), "first", term173310);
        setField(term173307, term173307.getClass(), "last", null);
        setField(term173307, term173307.getClass(), "propListHead", null);
        setIntField(term173307, term173307.getClass(), "sourcePosition", 0);
        setField(term173307, term173307.getClass(), "jsType", null);
        setField(term173307, term173307.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term173114;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term173022, args);
        assertTrue(recursiveEquals(term173022, term173345));
        assertTrue(recursiveEquals(term173114, term173346));
        assertTrue(recursiveEquals(retValue, term173307));
    }

};


