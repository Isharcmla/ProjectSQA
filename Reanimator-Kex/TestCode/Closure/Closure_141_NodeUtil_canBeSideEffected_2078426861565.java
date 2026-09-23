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

public class NodeUtil_canBeSideEffected_2078426861565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48906;
     Object term49136;

    public NodeUtil_canBeSideEffected_2078426861565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48906 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term48998 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term48906, term48906.getClass(), "type", 389427431);
        setIntField(term48998, term48998.getClass(), "type", 0);
        setField(term48998, term48998.getClass(), "first", null);
        setField(term48998, term48998.getClass(), "next", term49090);
        setField(term48906, term48906.getClass(), "first", term48998);
        term49136 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term49138 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term49136, term49136.getClass(), "number", 0.0);
        setIntField(term49136, term49136.getClass(), "type", 389427431);
        setField(term49136, term49136.getClass(), "next", null);
        setDoubleField(term49137, term49137.getClass(), "number", 0.0);
        setIntField(term49137, term49137.getClass(), "type", 0);
        setDoubleField(term49138, term49138.getClass(), "number", 0.0);
        setIntField(term49138, term49138.getClass(), "type", 0);
        setField(term49138, term49138.getClass(), "next", null);
        setField(term49138, term49138.getClass(), "first", null);
        setField(term49138, term49138.getClass(), "last", null);
        setField(term49138, term49138.getClass(), "propListHead", null);
        setIntField(term49138, term49138.getClass(), "sourcePosition", 0);
        setField(term49138, term49138.getClass(), "jsType", null);
        setField(term49138, term49138.getClass(), "parent", null);
        setField(term49137, term49137.getClass(), "next", term49138);
        setField(term49137, term49137.getClass(), "first", null);
        setField(term49137, term49137.getClass(), "last", null);
        setField(term49137, term49137.getClass(), "propListHead", null);
        setIntField(term49137, term49137.getClass(), "sourcePosition", 0);
        setField(term49137, term49137.getClass(), "jsType", null);
        setField(term49137, term49137.getClass(), "parent", null);
        setField(term49136, term49136.getClass(), "first", term49137);
        setField(term49136, term49136.getClass(), "last", null);
        setField(term49136, term49136.getClass(), "propListHead", null);
        setIntField(term49136, term49136.getClass(), "sourcePosition", 0);
        setField(term49136, term49136.getClass(), "jsType", null);
        setField(term49136, term49136.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term48906;
        args[1] = null;
        Object retValue = callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term48906, term49136));
        assertTrue(recursiveEquals(retValue, false));
    }

};


