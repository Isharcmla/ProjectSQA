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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424112;
     Object term424204;
     Object term424433;
     Object term424434;
     Object term424397;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term424204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424388 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term424296, term424296.getClass(), "next", term424388);
        setIntField(term424296, term424296.getClass(), "type", 39);
        setField(term424204, term424204.getClass(), "first", term424296);
        setIntField(term424204, term424204.getClass(), "type", 19);
        term424433 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term424433, term424433.getClass(), "currentTraversal", null);
        term424434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424435 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term424434, term424434.getClass(), "number", 0.0);
        setIntField(term424434, term424434.getClass(), "type", 19);
        setField(term424434, term424434.getClass(), "next", null);
        setDoubleField(term424435, term424435.getClass(), "number", 0.0);
        setIntField(term424435, term424435.getClass(), "type", 39);
        setDoubleField(term424436, term424436.getClass(), "number", 0.0);
        setIntField(term424436, term424436.getClass(), "type", 0);
        setField(term424436, term424436.getClass(), "next", null);
        setField(term424436, term424436.getClass(), "first", null);
        setField(term424436, term424436.getClass(), "last", null);
        setField(term424436, term424436.getClass(), "propListHead", null);
        setIntField(term424436, term424436.getClass(), "sourcePosition", 0);
        setField(term424436, term424436.getClass(), "jsType", null);
        setField(term424436, term424436.getClass(), "parent", null);
        setField(term424435, term424435.getClass(), "next", term424436);
        setField(term424435, term424435.getClass(), "first", null);
        setField(term424435, term424435.getClass(), "last", null);
        setField(term424435, term424435.getClass(), "propListHead", null);
        setIntField(term424435, term424435.getClass(), "sourcePosition", 0);
        setField(term424435, term424435.getClass(), "jsType", null);
        setField(term424435, term424435.getClass(), "parent", null);
        setField(term424434, term424434.getClass(), "first", term424435);
        setField(term424434, term424434.getClass(), "last", null);
        setField(term424434, term424434.getClass(), "propListHead", null);
        setIntField(term424434, term424434.getClass(), "sourcePosition", 0);
        setField(term424434, term424434.getClass(), "jsType", null);
        setField(term424434, term424434.getClass(), "parent", null);
        term424397 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424400 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term424403 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term424397, term424397.getClass(), "number", 0.0);
        setIntField(term424397, term424397.getClass(), "type", 19);
        setField(term424397, term424397.getClass(), "next", null);
        setDoubleField(term424400, term424400.getClass(), "number", 0.0);
        setIntField(term424400, term424400.getClass(), "type", 39);
        setDoubleField(term424403, term424403.getClass(), "number", 0.0);
        setIntField(term424403, term424403.getClass(), "type", 0);
        setField(term424403, term424403.getClass(), "next", null);
        setField(term424403, term424403.getClass(), "first", null);
        setField(term424403, term424403.getClass(), "last", null);
        setField(term424403, term424403.getClass(), "propListHead", null);
        setIntField(term424403, term424403.getClass(), "sourcePosition", 0);
        setField(term424403, term424403.getClass(), "jsType", null);
        setField(term424403, term424403.getClass(), "parent", null);
        setField(term424400, term424400.getClass(), "next", term424403);
        setField(term424400, term424400.getClass(), "first", null);
        setField(term424400, term424400.getClass(), "last", null);
        setField(term424400, term424400.getClass(), "propListHead", null);
        setIntField(term424400, term424400.getClass(), "sourcePosition", 0);
        setField(term424400, term424400.getClass(), "jsType", null);
        setField(term424400, term424400.getClass(), "parent", null);
        setField(term424397, term424397.getClass(), "first", term424400);
        setField(term424397, term424397.getClass(), "last", null);
        setField(term424397, term424397.getClass(), "propListHead", null);
        setIntField(term424397, term424397.getClass(), "sourcePosition", 0);
        setField(term424397, term424397.getClass(), "jsType", null);
        setField(term424397, term424397.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term424204;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term424112, args);
        assertTrue(recursiveEquals(term424112, term424433));
        assertTrue(recursiveEquals(term424204, term424434));
        assertTrue(recursiveEquals(retValue, term424397));
    }

};


