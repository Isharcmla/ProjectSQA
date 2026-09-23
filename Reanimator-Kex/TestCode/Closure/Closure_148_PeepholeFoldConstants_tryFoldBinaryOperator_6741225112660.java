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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759748;
     Object term759840;
     Object term760179;
     Object term760180;
     Object term760102;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term759748 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term759840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term759910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term760002 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760094 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term760002, term760002.getClass(), "type", 47);
        setField(term759910, term759910.getClass(), "next", term760002);
        setIntField(term759910, term759910.getClass(), "type", 0);
        setField(term759840, term759840.getClass(), "first", term759910);
        setIntField(term759840, term759840.getClass(), "type", 101);
        setField(term759840, term759840.getClass(), "parent", term760094);
        term760179 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term760179, term760179.getClass(), "currentTraversal", null);
        term760180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term760182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term760180, term760180.getClass(), "number", 0.0);
        setIntField(term760180, term760180.getClass(), "type", 101);
        setField(term760180, term760180.getClass(), "next", null);
        setIntField(term760181, term760181.getClass(), "type", 0);
        setDoubleField(term760182, term760182.getClass(), "number", 0.0);
        setIntField(term760182, term760182.getClass(), "type", 47);
        setField(term760182, term760182.getClass(), "next", null);
        setField(term760182, term760182.getClass(), "first", null);
        setField(term760182, term760182.getClass(), "last", null);
        setField(term760182, term760182.getClass(), "propListHead", null);
        setIntField(term760182, term760182.getClass(), "sourcePosition", 0);
        setField(term760182, term760182.getClass(), "jsType", null);
        setField(term760182, term760182.getClass(), "parent", null);
        setField(term760181, term760181.getClass(), "next", term760182);
        setField(term760181, term760181.getClass(), "first", null);
        setField(term760181, term760181.getClass(), "last", null);
        setField(term760181, term760181.getClass(), "propListHead", null);
        setIntField(term760181, term760181.getClass(), "sourcePosition", 0);
        setField(term760181, term760181.getClass(), "jsType", null);
        setField(term760181, term760181.getClass(), "parent", null);
        setField(term760180, term760180.getClass(), "first", term760181);
        setField(term760180, term760180.getClass(), "last", null);
        setField(term760180, term760180.getClass(), "propListHead", null);
        setIntField(term760180, term760180.getClass(), "sourcePosition", 0);
        setField(term760180, term760180.getClass(), "jsType", null);
        setDoubleField(term760183, term760183.getClass(), "number", 0.0);
        setIntField(term760183, term760183.getClass(), "type", 0);
        setField(term760183, term760183.getClass(), "next", null);
        setField(term760183, term760183.getClass(), "first", null);
        setField(term760183, term760183.getClass(), "last", null);
        setField(term760183, term760183.getClass(), "propListHead", null);
        setIntField(term760183, term760183.getClass(), "sourcePosition", 0);
        setField(term760183, term760183.getClass(), "jsType", null);
        setField(term760183, term760183.getClass(), "parent", null);
        setField(term760180, term760180.getClass(), "parent", term760183);
        term760102 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term760107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term760113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term760102, term760102.getClass(), "number", 0.0);
        setIntField(term760102, term760102.getClass(), "type", 101);
        setField(term760102, term760102.getClass(), "next", null);
        setIntField(term760105, term760105.getClass(), "type", 0);
        setDoubleField(term760107, term760107.getClass(), "number", 0.0);
        setIntField(term760107, term760107.getClass(), "type", 47);
        setField(term760107, term760107.getClass(), "next", null);
        setField(term760107, term760107.getClass(), "first", null);
        setField(term760107, term760107.getClass(), "last", null);
        setField(term760107, term760107.getClass(), "propListHead", null);
        setIntField(term760107, term760107.getClass(), "sourcePosition", 0);
        setField(term760107, term760107.getClass(), "jsType", null);
        setField(term760107, term760107.getClass(), "parent", null);
        setField(term760105, term760105.getClass(), "next", term760107);
        setField(term760105, term760105.getClass(), "first", null);
        setField(term760105, term760105.getClass(), "last", null);
        setField(term760105, term760105.getClass(), "propListHead", null);
        setIntField(term760105, term760105.getClass(), "sourcePosition", 0);
        setField(term760105, term760105.getClass(), "jsType", null);
        setField(term760105, term760105.getClass(), "parent", null);
        setField(term760102, term760102.getClass(), "first", term760105);
        setField(term760102, term760102.getClass(), "last", null);
        setField(term760102, term760102.getClass(), "propListHead", null);
        setIntField(term760102, term760102.getClass(), "sourcePosition", 0);
        setField(term760102, term760102.getClass(), "jsType", null);
        setDoubleField(term760113, term760113.getClass(), "number", 0.0);
        setIntField(term760113, term760113.getClass(), "type", 0);
        setField(term760113, term760113.getClass(), "next", null);
        setField(term760113, term760113.getClass(), "first", null);
        setField(term760113, term760113.getClass(), "last", null);
        setField(term760113, term760113.getClass(), "propListHead", null);
        setIntField(term760113, term760113.getClass(), "sourcePosition", 0);
        setField(term760113, term760113.getClass(), "jsType", null);
        setField(term760113, term760113.getClass(), "parent", null);
        setField(term760102, term760102.getClass(), "parent", term760113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term759840;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term759748, args);
        assertTrue(recursiveEquals(term759748, term760179));
        assertTrue(recursiveEquals(term759840, term760180));
        assertTrue(recursiveEquals(retValue, term760102));
    }

};


