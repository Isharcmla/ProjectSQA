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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157870;
     Object term157962;
     Object term158258;
     Object term158259;
     Object term158210;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157870 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term157962 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158054 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term158054, term158054.getClass(), "next", term158146);
        setIntField(term158054, term158054.getClass(), "type", 14);
        setField(term157962, term157962.getClass(), "first", term158054);
        setIntField(term157962, term157962.getClass(), "type", 14);
        term158258 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term158258, term158258.getClass(), "currentTraversal", null);
        term158259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158260 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term158259, term158259.getClass(), "number", 0.0);
        setIntField(term158259, term158259.getClass(), "type", 14);
        setField(term158259, term158259.getClass(), "next", null);
        setDoubleField(term158260, term158260.getClass(), "number", 0.0);
        setIntField(term158260, term158260.getClass(), "type", 14);
        setField(term158261, term158261.getClass(), "str", null);
        setIntField(term158261, term158261.getClass(), "type", 0);
        setField(term158261, term158261.getClass(), "next", null);
        setField(term158261, term158261.getClass(), "first", null);
        setField(term158261, term158261.getClass(), "last", null);
        setField(term158261, term158261.getClass(), "propListHead", null);
        setIntField(term158261, term158261.getClass(), "sourcePosition", 0);
        setField(term158261, term158261.getClass(), "jsType", null);
        setField(term158261, term158261.getClass(), "parent", null);
        setField(term158260, term158260.getClass(), "next", term158261);
        setField(term158260, term158260.getClass(), "first", null);
        setField(term158260, term158260.getClass(), "last", null);
        setField(term158260, term158260.getClass(), "propListHead", null);
        setIntField(term158260, term158260.getClass(), "sourcePosition", 0);
        setField(term158260, term158260.getClass(), "jsType", null);
        setField(term158260, term158260.getClass(), "parent", null);
        setField(term158259, term158259.getClass(), "first", term158260);
        setField(term158259, term158259.getClass(), "last", null);
        setField(term158259, term158259.getClass(), "propListHead", null);
        setIntField(term158259, term158259.getClass(), "sourcePosition", 0);
        setField(term158259, term158259.getClass(), "jsType", null);
        setField(term158259, term158259.getClass(), "parent", null);
        term158210 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158213 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term158216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term158210, term158210.getClass(), "number", 0.0);
        setIntField(term158210, term158210.getClass(), "type", 14);
        setField(term158210, term158210.getClass(), "next", null);
        setDoubleField(term158213, term158213.getClass(), "number", 0.0);
        setIntField(term158213, term158213.getClass(), "type", 14);
        setField(term158216, term158216.getClass(), "str", null);
        setIntField(term158216, term158216.getClass(), "type", 0);
        setField(term158216, term158216.getClass(), "next", null);
        setField(term158216, term158216.getClass(), "first", null);
        setField(term158216, term158216.getClass(), "last", null);
        setField(term158216, term158216.getClass(), "propListHead", null);
        setIntField(term158216, term158216.getClass(), "sourcePosition", 0);
        setField(term158216, term158216.getClass(), "jsType", null);
        setField(term158216, term158216.getClass(), "parent", null);
        setField(term158213, term158213.getClass(), "next", term158216);
        setField(term158213, term158213.getClass(), "first", null);
        setField(term158213, term158213.getClass(), "last", null);
        setField(term158213, term158213.getClass(), "propListHead", null);
        setIntField(term158213, term158213.getClass(), "sourcePosition", 0);
        setField(term158213, term158213.getClass(), "jsType", null);
        setField(term158213, term158213.getClass(), "parent", null);
        setField(term158210, term158210.getClass(), "first", term158213);
        setField(term158210, term158210.getClass(), "last", null);
        setField(term158210, term158210.getClass(), "propListHead", null);
        setIntField(term158210, term158210.getClass(), "sourcePosition", 0);
        setField(term158210, term158210.getClass(), "jsType", null);
        setField(term158210, term158210.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term157962;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term157870, args);
        assertTrue(recursiveEquals(term157870, term158258));
        assertTrue(recursiveEquals(term157962, term158259));
        assertTrue(recursiveEquals(retValue, term158210));
    }

};


