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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1972807;
     Object term1972899;
     Object term1973534;
     Object term1973535;
     Object term1973491;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1972807 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1972899 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1972991 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term1972899, term1972899.getClass(), "type", 37);
        setIntField(term1972991, term1972991.getClass(), "type", 33);
        setField(term1972991, term1972991.getClass(), "first", term1973083);
        setField(term1972899, term1972899.getClass(), "first", term1972991);
        term1973534 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term1973534, term1973534.getClass(), "currentTraversal", null);
        term1973535 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1973535, term1973535.getClass(), "number", 0.0);
        setIntField(term1973535, term1973535.getClass(), "type", 37);
        setField(term1973535, term1973535.getClass(), "next", null);
        setDoubleField(term1973536, term1973536.getClass(), "number", 0.0);
        setIntField(term1973536, term1973536.getClass(), "type", 33);
        setField(term1973536, term1973536.getClass(), "next", null);
        setDoubleField(term1973537, term1973537.getClass(), "number", 0.0);
        setIntField(term1973537, term1973537.getClass(), "type", 0);
        setField(term1973537, term1973537.getClass(), "next", null);
        setField(term1973537, term1973537.getClass(), "first", null);
        setField(term1973537, term1973537.getClass(), "last", null);
        setField(term1973537, term1973537.getClass(), "propListHead", null);
        setIntField(term1973537, term1973537.getClass(), "sourcePosition", 0);
        setField(term1973537, term1973537.getClass(), "jsType", null);
        setField(term1973537, term1973537.getClass(), "parent", null);
        setField(term1973536, term1973536.getClass(), "first", term1973537);
        setField(term1973536, term1973536.getClass(), "last", null);
        setField(term1973536, term1973536.getClass(), "propListHead", null);
        setIntField(term1973536, term1973536.getClass(), "sourcePosition", 0);
        setField(term1973536, term1973536.getClass(), "jsType", null);
        setField(term1973536, term1973536.getClass(), "parent", null);
        setField(term1973535, term1973535.getClass(), "first", term1973536);
        setField(term1973535, term1973535.getClass(), "last", null);
        setField(term1973535, term1973535.getClass(), "propListHead", null);
        setIntField(term1973535, term1973535.getClass(), "sourcePosition", 0);
        setField(term1973535, term1973535.getClass(), "jsType", null);
        setField(term1973535, term1973535.getClass(), "parent", null);
        term1973491 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973494 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term1973491, term1973491.getClass(), "number", 0.0);
        setIntField(term1973491, term1973491.getClass(), "type", 37);
        setField(term1973491, term1973491.getClass(), "next", null);
        setDoubleField(term1973494, term1973494.getClass(), "number", 0.0);
        setIntField(term1973494, term1973494.getClass(), "type", 33);
        setField(term1973494, term1973494.getClass(), "next", null);
        setDoubleField(term1973497, term1973497.getClass(), "number", 0.0);
        setIntField(term1973497, term1973497.getClass(), "type", 0);
        setField(term1973497, term1973497.getClass(), "next", null);
        setField(term1973497, term1973497.getClass(), "first", null);
        setField(term1973497, term1973497.getClass(), "last", null);
        setField(term1973497, term1973497.getClass(), "propListHead", null);
        setIntField(term1973497, term1973497.getClass(), "sourcePosition", 0);
        setField(term1973497, term1973497.getClass(), "jsType", null);
        setField(term1973497, term1973497.getClass(), "parent", null);
        setField(term1973494, term1973494.getClass(), "first", term1973497);
        setField(term1973494, term1973494.getClass(), "last", null);
        setField(term1973494, term1973494.getClass(), "propListHead", null);
        setIntField(term1973494, term1973494.getClass(), "sourcePosition", 0);
        setField(term1973494, term1973494.getClass(), "jsType", null);
        setField(term1973494, term1973494.getClass(), "parent", null);
        setField(term1973491, term1973491.getClass(), "first", term1973494);
        setField(term1973491, term1973491.getClass(), "last", null);
        setField(term1973491, term1973491.getClass(), "propListHead", null);
        setIntField(term1973491, term1973491.getClass(), "sourcePosition", 0);
        setField(term1973491, term1973491.getClass(), "jsType", null);
        setField(term1973491, term1973491.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1972899;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1972807, args);
        assertTrue(recursiveEquals(term1972807, term1973534));
        assertTrue(recursiveEquals(term1972899, term1973535));
        assertTrue(recursiveEquals(retValue, term1973491));
    }

};


