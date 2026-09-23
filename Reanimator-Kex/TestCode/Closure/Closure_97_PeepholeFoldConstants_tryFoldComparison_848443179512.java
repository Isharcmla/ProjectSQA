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

public class PeepholeFoldConstants_tryFoldComparison_848443179512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136823;
     Object term136915;
     Object term137007;
     Object term137099;
     Object term137200;
     Object term137201;
     Object term137202;
     Object term137203;
     Object term137179;

    public PeepholeFoldConstants_tryFoldComparison_848443179512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136823 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term136915 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term136915, term136915.getClass(), "type", 14);
        term137007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term137007, term137007.getClass(), "type", 14);
        term137099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term137200 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term137200, term137200.getClass(), "currentTraversal", null);
        term137201 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137201, term137201.getClass(), "number", 0.0);
        setIntField(term137201, term137201.getClass(), "type", 14);
        setField(term137201, term137201.getClass(), "next", null);
        setField(term137201, term137201.getClass(), "first", null);
        setField(term137201, term137201.getClass(), "last", null);
        setField(term137201, term137201.getClass(), "propListHead", null);
        setIntField(term137201, term137201.getClass(), "sourcePosition", 0);
        setField(term137201, term137201.getClass(), "jsType", null);
        setField(term137201, term137201.getClass(), "parent", null);
        term137202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137202, term137202.getClass(), "number", 0.0);
        setIntField(term137202, term137202.getClass(), "type", 14);
        setField(term137202, term137202.getClass(), "next", null);
        setField(term137202, term137202.getClass(), "first", null);
        setField(term137202, term137202.getClass(), "last", null);
        setField(term137202, term137202.getClass(), "propListHead", null);
        setIntField(term137202, term137202.getClass(), "sourcePosition", 0);
        setField(term137202, term137202.getClass(), "jsType", null);
        setField(term137202, term137202.getClass(), "parent", null);
        term137203 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term137203, term137203.getClass(), "str", null);
        setIntField(term137203, term137203.getClass(), "type", 0);
        setField(term137203, term137203.getClass(), "next", null);
        setField(term137203, term137203.getClass(), "first", null);
        setField(term137203, term137203.getClass(), "last", null);
        setField(term137203, term137203.getClass(), "propListHead", null);
        setIntField(term137203, term137203.getClass(), "sourcePosition", 0);
        setField(term137203, term137203.getClass(), "jsType", null);
        setField(term137203, term137203.getClass(), "parent", null);
        term137179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term137179, term137179.getClass(), "number", 0.0);
        setIntField(term137179, term137179.getClass(), "type", 14);
        setField(term137179, term137179.getClass(), "next", null);
        setField(term137179, term137179.getClass(), "first", null);
        setField(term137179, term137179.getClass(), "last", null);
        setField(term137179, term137179.getClass(), "propListHead", null);
        setIntField(term137179, term137179.getClass(), "sourcePosition", 0);
        setField(term137179, term137179.getClass(), "jsType", null);
        setField(term137179, term137179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term136915;
        args[1] = term137007;
        args[2] = term137099;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term136823, args);
        assertTrue(recursiveEquals(term136823, term137200));
        assertTrue(recursiveEquals(term136915, term137201));
        assertTrue(recursiveEquals(term137007, term137202));
        assertTrue(recursiveEquals(term137099, term137203));
        assertTrue(recursiveEquals(retValue, term137179));
    }

};


