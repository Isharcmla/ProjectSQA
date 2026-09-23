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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248548;
     Object term248640;
     Object term249213;
     Object term249214;
     Object term249173;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248548 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term248640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term248824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term248732, term248732.getClass(), "next", term248824);
        setIntField(term248732, term248732.getClass(), "type", 63);
        setField(term248640, term248640.getClass(), "first", term248732);
        setIntField(term248640, term248640.getClass(), "type", 35);
        term249213 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term249213, term249213.getClass(), "currentTraversal", null);
        term249214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249215 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249216 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term249214, term249214.getClass(), "number", 0.0);
        setIntField(term249214, term249214.getClass(), "type", 35);
        setField(term249214, term249214.getClass(), "next", null);
        setDoubleField(term249215, term249215.getClass(), "number", 0.0);
        setIntField(term249215, term249215.getClass(), "type", 63);
        setDoubleField(term249216, term249216.getClass(), "number", 0.0);
        setIntField(term249216, term249216.getClass(), "type", 0);
        setField(term249216, term249216.getClass(), "next", null);
        setField(term249216, term249216.getClass(), "first", null);
        setField(term249216, term249216.getClass(), "last", null);
        setField(term249216, term249216.getClass(), "propListHead", null);
        setIntField(term249216, term249216.getClass(), "sourcePosition", 0);
        setField(term249216, term249216.getClass(), "jsType", null);
        setField(term249216, term249216.getClass(), "parent", null);
        setField(term249215, term249215.getClass(), "next", term249216);
        setField(term249215, term249215.getClass(), "first", null);
        setField(term249215, term249215.getClass(), "last", null);
        setField(term249215, term249215.getClass(), "propListHead", null);
        setIntField(term249215, term249215.getClass(), "sourcePosition", 0);
        setField(term249215, term249215.getClass(), "jsType", null);
        setField(term249215, term249215.getClass(), "parent", null);
        setField(term249214, term249214.getClass(), "first", term249215);
        setField(term249214, term249214.getClass(), "last", null);
        setField(term249214, term249214.getClass(), "propListHead", null);
        setIntField(term249214, term249214.getClass(), "sourcePosition", 0);
        setField(term249214, term249214.getClass(), "jsType", null);
        setField(term249214, term249214.getClass(), "parent", null);
        term249173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249176 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term249179 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term249173, term249173.getClass(), "number", 0.0);
        setIntField(term249173, term249173.getClass(), "type", 35);
        setField(term249173, term249173.getClass(), "next", null);
        setDoubleField(term249176, term249176.getClass(), "number", 0.0);
        setIntField(term249176, term249176.getClass(), "type", 63);
        setDoubleField(term249179, term249179.getClass(), "number", 0.0);
        setIntField(term249179, term249179.getClass(), "type", 0);
        setField(term249179, term249179.getClass(), "next", null);
        setField(term249179, term249179.getClass(), "first", null);
        setField(term249179, term249179.getClass(), "last", null);
        setField(term249179, term249179.getClass(), "propListHead", null);
        setIntField(term249179, term249179.getClass(), "sourcePosition", 0);
        setField(term249179, term249179.getClass(), "jsType", null);
        setField(term249179, term249179.getClass(), "parent", null);
        setField(term249176, term249176.getClass(), "next", term249179);
        setField(term249176, term249176.getClass(), "first", null);
        setField(term249176, term249176.getClass(), "last", null);
        setField(term249176, term249176.getClass(), "propListHead", null);
        setIntField(term249176, term249176.getClass(), "sourcePosition", 0);
        setField(term249176, term249176.getClass(), "jsType", null);
        setField(term249176, term249176.getClass(), "parent", null);
        setField(term249173, term249173.getClass(), "first", term249176);
        setField(term249173, term249173.getClass(), "last", null);
        setField(term249173, term249173.getClass(), "propListHead", null);
        setIntField(term249173, term249173.getClass(), "sourcePosition", 0);
        setField(term249173, term249173.getClass(), "jsType", null);
        setField(term249173, term249173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term248640;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term248548, args);
        assertTrue(recursiveEquals(term248548, term249213));
        assertTrue(recursiveEquals(term248640, term249214));
        assertTrue(recursiveEquals(retValue, term249173));
    }

};


