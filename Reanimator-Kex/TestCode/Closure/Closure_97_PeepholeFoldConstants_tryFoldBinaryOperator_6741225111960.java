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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743252;
     Object term743344;
     Object term743578;
     Object term743579;
     Object term743537;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743252 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term743344 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743528 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term743436, term743436.getClass(), "next", term743528);
        setField(term743344, term743344.getClass(), "first", term743436);
        setIntField(term743344, term743344.getClass(), "type", 52);
        term743578 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term743578, term743578.getClass(), "currentTraversal", null);
        term743579 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743580 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743581 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term743579, term743579.getClass(), "number", 0.0);
        setIntField(term743579, term743579.getClass(), "type", 52);
        setField(term743579, term743579.getClass(), "next", null);
        setDoubleField(term743580, term743580.getClass(), "number", 0.0);
        setIntField(term743580, term743580.getClass(), "type", 0);
        setDoubleField(term743581, term743581.getClass(), "number", 0.0);
        setIntField(term743581, term743581.getClass(), "type", 0);
        setField(term743581, term743581.getClass(), "next", null);
        setField(term743581, term743581.getClass(), "first", null);
        setField(term743581, term743581.getClass(), "last", null);
        setField(term743581, term743581.getClass(), "propListHead", null);
        setIntField(term743581, term743581.getClass(), "sourcePosition", 0);
        setField(term743581, term743581.getClass(), "jsType", null);
        setField(term743581, term743581.getClass(), "parent", null);
        setField(term743580, term743580.getClass(), "next", term743581);
        setField(term743580, term743580.getClass(), "first", null);
        setField(term743580, term743580.getClass(), "last", null);
        setField(term743580, term743580.getClass(), "propListHead", null);
        setIntField(term743580, term743580.getClass(), "sourcePosition", 0);
        setField(term743580, term743580.getClass(), "jsType", null);
        setField(term743580, term743580.getClass(), "parent", null);
        setField(term743579, term743579.getClass(), "first", term743580);
        setField(term743579, term743579.getClass(), "last", null);
        setField(term743579, term743579.getClass(), "propListHead", null);
        setIntField(term743579, term743579.getClass(), "sourcePosition", 0);
        setField(term743579, term743579.getClass(), "jsType", null);
        setField(term743579, term743579.getClass(), "parent", null);
        term743537 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term743543 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term743537, term743537.getClass(), "number", 0.0);
        setIntField(term743537, term743537.getClass(), "type", 52);
        setField(term743537, term743537.getClass(), "next", null);
        setDoubleField(term743540, term743540.getClass(), "number", 0.0);
        setIntField(term743540, term743540.getClass(), "type", 0);
        setDoubleField(term743543, term743543.getClass(), "number", 0.0);
        setIntField(term743543, term743543.getClass(), "type", 0);
        setField(term743543, term743543.getClass(), "next", null);
        setField(term743543, term743543.getClass(), "first", null);
        setField(term743543, term743543.getClass(), "last", null);
        setField(term743543, term743543.getClass(), "propListHead", null);
        setIntField(term743543, term743543.getClass(), "sourcePosition", 0);
        setField(term743543, term743543.getClass(), "jsType", null);
        setField(term743543, term743543.getClass(), "parent", null);
        setField(term743540, term743540.getClass(), "next", term743543);
        setField(term743540, term743540.getClass(), "first", null);
        setField(term743540, term743540.getClass(), "last", null);
        setField(term743540, term743540.getClass(), "propListHead", null);
        setIntField(term743540, term743540.getClass(), "sourcePosition", 0);
        setField(term743540, term743540.getClass(), "jsType", null);
        setField(term743540, term743540.getClass(), "parent", null);
        setField(term743537, term743537.getClass(), "first", term743540);
        setField(term743537, term743537.getClass(), "last", null);
        setField(term743537, term743537.getClass(), "propListHead", null);
        setIntField(term743537, term743537.getClass(), "sourcePosition", 0);
        setField(term743537, term743537.getClass(), "jsType", null);
        setField(term743537, term743537.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term743344;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term743252, args);
        assertTrue(recursiveEquals(term743252, term743578));
        assertTrue(recursiveEquals(term743344, term743579));
        assertTrue(recursiveEquals(retValue, term743537));
    }

};


