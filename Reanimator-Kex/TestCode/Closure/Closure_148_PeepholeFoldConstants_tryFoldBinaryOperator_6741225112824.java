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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821018;
     Object term821110;
     Object term821475;
     Object term821476;
     Object term821395;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term821018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term821110 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821202 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821294 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term821294, term821294.getClass(), "type", 63);
        setField(term821202, term821202.getClass(), "next", term821294);
        setIntField(term821202, term821202.getClass(), "type", 0);
        setField(term821110, term821110.getClass(), "first", term821202);
        setIntField(term821110, term821110.getClass(), "type", 101);
        setIntField(term821386, term821386.getClass(), "type", 98);
        setField(term821110, term821110.getClass(), "parent", term821386);
        term821475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term821475, term821475.getClass(), "currentTraversal", null);
        term821476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821477 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term821476, term821476.getClass(), "number", 0.0);
        setIntField(term821476, term821476.getClass(), "type", 101);
        setField(term821476, term821476.getClass(), "next", null);
        setDoubleField(term821477, term821477.getClass(), "number", 0.0);
        setIntField(term821477, term821477.getClass(), "type", 0);
        setDoubleField(term821478, term821478.getClass(), "number", 0.0);
        setIntField(term821478, term821478.getClass(), "type", 63);
        setField(term821478, term821478.getClass(), "next", null);
        setField(term821478, term821478.getClass(), "first", null);
        setField(term821478, term821478.getClass(), "last", null);
        setField(term821478, term821478.getClass(), "propListHead", null);
        setIntField(term821478, term821478.getClass(), "sourcePosition", 0);
        setField(term821478, term821478.getClass(), "jsType", null);
        setField(term821478, term821478.getClass(), "parent", null);
        setField(term821477, term821477.getClass(), "next", term821478);
        setField(term821477, term821477.getClass(), "first", null);
        setField(term821477, term821477.getClass(), "last", null);
        setField(term821477, term821477.getClass(), "propListHead", null);
        setIntField(term821477, term821477.getClass(), "sourcePosition", 0);
        setField(term821477, term821477.getClass(), "jsType", null);
        setField(term821477, term821477.getClass(), "parent", null);
        setField(term821476, term821476.getClass(), "first", term821477);
        setField(term821476, term821476.getClass(), "last", null);
        setField(term821476, term821476.getClass(), "propListHead", null);
        setIntField(term821476, term821476.getClass(), "sourcePosition", 0);
        setField(term821476, term821476.getClass(), "jsType", null);
        setDoubleField(term821479, term821479.getClass(), "number", 0.0);
        setIntField(term821479, term821479.getClass(), "type", 98);
        setField(term821479, term821479.getClass(), "next", null);
        setField(term821479, term821479.getClass(), "first", null);
        setField(term821479, term821479.getClass(), "last", null);
        setField(term821479, term821479.getClass(), "propListHead", null);
        setIntField(term821479, term821479.getClass(), "sourcePosition", 0);
        setField(term821479, term821479.getClass(), "jsType", null);
        setField(term821479, term821479.getClass(), "parent", null);
        setField(term821476, term821476.getClass(), "parent", term821479);
        term821395 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term821407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term821395, term821395.getClass(), "number", 0.0);
        setIntField(term821395, term821395.getClass(), "type", 101);
        setField(term821395, term821395.getClass(), "next", null);
        setDoubleField(term821398, term821398.getClass(), "number", 0.0);
        setIntField(term821398, term821398.getClass(), "type", 0);
        setDoubleField(term821401, term821401.getClass(), "number", 0.0);
        setIntField(term821401, term821401.getClass(), "type", 63);
        setField(term821401, term821401.getClass(), "next", null);
        setField(term821401, term821401.getClass(), "first", null);
        setField(term821401, term821401.getClass(), "last", null);
        setField(term821401, term821401.getClass(), "propListHead", null);
        setIntField(term821401, term821401.getClass(), "sourcePosition", 0);
        setField(term821401, term821401.getClass(), "jsType", null);
        setField(term821401, term821401.getClass(), "parent", null);
        setField(term821398, term821398.getClass(), "next", term821401);
        setField(term821398, term821398.getClass(), "first", null);
        setField(term821398, term821398.getClass(), "last", null);
        setField(term821398, term821398.getClass(), "propListHead", null);
        setIntField(term821398, term821398.getClass(), "sourcePosition", 0);
        setField(term821398, term821398.getClass(), "jsType", null);
        setField(term821398, term821398.getClass(), "parent", null);
        setField(term821395, term821395.getClass(), "first", term821398);
        setField(term821395, term821395.getClass(), "last", null);
        setField(term821395, term821395.getClass(), "propListHead", null);
        setIntField(term821395, term821395.getClass(), "sourcePosition", 0);
        setField(term821395, term821395.getClass(), "jsType", null);
        setDoubleField(term821407, term821407.getClass(), "number", 0.0);
        setIntField(term821407, term821407.getClass(), "type", 98);
        setField(term821407, term821407.getClass(), "next", null);
        setField(term821407, term821407.getClass(), "first", null);
        setField(term821407, term821407.getClass(), "last", null);
        setField(term821407, term821407.getClass(), "propListHead", null);
        setIntField(term821407, term821407.getClass(), "sourcePosition", 0);
        setField(term821407, term821407.getClass(), "jsType", null);
        setField(term821407, term821407.getClass(), "parent", null);
        setField(term821395, term821395.getClass(), "parent", term821407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term821110;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term821018, args);
        assertTrue(recursiveEquals(term821018, term821475));
        assertTrue(recursiveEquals(term821110, term821476));
        assertTrue(recursiveEquals(retValue, term821395));
    }

};


