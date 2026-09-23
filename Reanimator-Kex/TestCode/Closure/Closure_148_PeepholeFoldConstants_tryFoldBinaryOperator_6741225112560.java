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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724771;
     Object term724863;
     Object term725197;
     Object term725198;
     Object term725125;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724771 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term724863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term724955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725047 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term725047, term725047.getClass(), "type", 63);
        setField(term724955, term724955.getClass(), "next", term725047);
        setIntField(term724955, term724955.getClass(), "type", 0);
        setField(term724863, term724863.getClass(), "first", term724955);
        setIntField(term724863, term724863.getClass(), "type", 101);
        setField(term724863, term724863.getClass(), "parent", term725117);
        term725197 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term725197, term725197.getClass(), "currentTraversal", null);
        term725198 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725200 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term725198, term725198.getClass(), "number", 0.0);
        setIntField(term725198, term725198.getClass(), "type", 101);
        setField(term725198, term725198.getClass(), "next", null);
        setDoubleField(term725199, term725199.getClass(), "number", 0.0);
        setIntField(term725199, term725199.getClass(), "type", 0);
        setField(term725200, term725200.getClass(), "str", null);
        setIntField(term725200, term725200.getClass(), "type", 63);
        setField(term725200, term725200.getClass(), "next", null);
        setField(term725200, term725200.getClass(), "first", null);
        setField(term725200, term725200.getClass(), "last", null);
        setField(term725200, term725200.getClass(), "propListHead", null);
        setIntField(term725200, term725200.getClass(), "sourcePosition", 0);
        setField(term725200, term725200.getClass(), "jsType", null);
        setField(term725200, term725200.getClass(), "parent", null);
        setField(term725199, term725199.getClass(), "next", term725200);
        setField(term725199, term725199.getClass(), "first", null);
        setField(term725199, term725199.getClass(), "last", null);
        setField(term725199, term725199.getClass(), "propListHead", null);
        setIntField(term725199, term725199.getClass(), "sourcePosition", 0);
        setField(term725199, term725199.getClass(), "jsType", null);
        setField(term725199, term725199.getClass(), "parent", null);
        setField(term725198, term725198.getClass(), "first", term725199);
        setField(term725198, term725198.getClass(), "last", null);
        setField(term725198, term725198.getClass(), "propListHead", null);
        setIntField(term725198, term725198.getClass(), "sourcePosition", 0);
        setField(term725198, term725198.getClass(), "jsType", null);
        setIntField(term725201, term725201.getClass(), "type", 0);
        setField(term725201, term725201.getClass(), "next", null);
        setField(term725201, term725201.getClass(), "first", null);
        setField(term725201, term725201.getClass(), "last", null);
        setField(term725201, term725201.getClass(), "propListHead", null);
        setIntField(term725201, term725201.getClass(), "sourcePosition", 0);
        setField(term725201, term725201.getClass(), "jsType", null);
        setField(term725201, term725201.getClass(), "parent", null);
        setField(term725198, term725198.getClass(), "parent", term725201);
        term725125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725128 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term725131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term725136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term725125, term725125.getClass(), "number", 0.0);
        setIntField(term725125, term725125.getClass(), "type", 101);
        setField(term725125, term725125.getClass(), "next", null);
        setDoubleField(term725128, term725128.getClass(), "number", 0.0);
        setIntField(term725128, term725128.getClass(), "type", 0);
        setField(term725131, term725131.getClass(), "str", null);
        setIntField(term725131, term725131.getClass(), "type", 63);
        setField(term725131, term725131.getClass(), "next", null);
        setField(term725131, term725131.getClass(), "first", null);
        setField(term725131, term725131.getClass(), "last", null);
        setField(term725131, term725131.getClass(), "propListHead", null);
        setIntField(term725131, term725131.getClass(), "sourcePosition", 0);
        setField(term725131, term725131.getClass(), "jsType", null);
        setField(term725131, term725131.getClass(), "parent", null);
        setField(term725128, term725128.getClass(), "next", term725131);
        setField(term725128, term725128.getClass(), "first", null);
        setField(term725128, term725128.getClass(), "last", null);
        setField(term725128, term725128.getClass(), "propListHead", null);
        setIntField(term725128, term725128.getClass(), "sourcePosition", 0);
        setField(term725128, term725128.getClass(), "jsType", null);
        setField(term725128, term725128.getClass(), "parent", null);
        setField(term725125, term725125.getClass(), "first", term725128);
        setField(term725125, term725125.getClass(), "last", null);
        setField(term725125, term725125.getClass(), "propListHead", null);
        setIntField(term725125, term725125.getClass(), "sourcePosition", 0);
        setField(term725125, term725125.getClass(), "jsType", null);
        setIntField(term725136, term725136.getClass(), "type", 0);
        setField(term725136, term725136.getClass(), "next", null);
        setField(term725136, term725136.getClass(), "first", null);
        setField(term725136, term725136.getClass(), "last", null);
        setField(term725136, term725136.getClass(), "propListHead", null);
        setIntField(term725136, term725136.getClass(), "sourcePosition", 0);
        setField(term725136, term725136.getClass(), "jsType", null);
        setField(term725136, term725136.getClass(), "parent", null);
        setField(term725125, term725125.getClass(), "parent", term725136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term724863;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term724771, args);
        assertTrue(recursiveEquals(term724771, term725197));
        assertTrue(recursiveEquals(term724863, term725198));
        assertTrue(recursiveEquals(retValue, term725125));
    }

};


