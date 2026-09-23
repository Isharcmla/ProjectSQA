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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263842;
     Object term263934;
     Object term264229;
     Object term264230;
     Object term264202;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263842 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term263934 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264026 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term264026, term264026.getClass(), "next", term264118);
        setField(term263934, term263934.getClass(), "first", term264026);
        setIntField(term263934, term263934.getClass(), "type", 20);
        term264229 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term264229, term264229.getClass(), "currentTraversal", null);
        term264230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264231 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264232 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term264230, term264230.getClass(), "str", null);
        setIntField(term264230, term264230.getClass(), "type", 20);
        setField(term264230, term264230.getClass(), "next", null);
        setField(term264231, term264231.getClass(), "str", null);
        setIntField(term264231, term264231.getClass(), "type", 0);
        setField(term264232, term264232.getClass(), "str", null);
        setIntField(term264232, term264232.getClass(), "type", 0);
        setField(term264232, term264232.getClass(), "next", null);
        setField(term264232, term264232.getClass(), "first", null);
        setField(term264232, term264232.getClass(), "last", null);
        setField(term264232, term264232.getClass(), "propListHead", null);
        setIntField(term264232, term264232.getClass(), "sourcePosition", 0);
        setField(term264232, term264232.getClass(), "jsType", null);
        setField(term264232, term264232.getClass(), "parent", null);
        setField(term264231, term264231.getClass(), "next", term264232);
        setField(term264231, term264231.getClass(), "first", null);
        setField(term264231, term264231.getClass(), "last", null);
        setField(term264231, term264231.getClass(), "propListHead", null);
        setIntField(term264231, term264231.getClass(), "sourcePosition", 0);
        setField(term264231, term264231.getClass(), "jsType", null);
        setField(term264231, term264231.getClass(), "parent", null);
        setField(term264230, term264230.getClass(), "first", term264231);
        setField(term264230, term264230.getClass(), "last", null);
        setField(term264230, term264230.getClass(), "propListHead", null);
        setIntField(term264230, term264230.getClass(), "sourcePosition", 0);
        setField(term264230, term264230.getClass(), "jsType", null);
        setField(term264230, term264230.getClass(), "parent", null);
        term264202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264204 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term264206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term264202, term264202.getClass(), "str", null);
        setIntField(term264202, term264202.getClass(), "type", 20);
        setField(term264202, term264202.getClass(), "next", null);
        setField(term264204, term264204.getClass(), "str", null);
        setIntField(term264204, term264204.getClass(), "type", 0);
        setField(term264206, term264206.getClass(), "str", null);
        setIntField(term264206, term264206.getClass(), "type", 0);
        setField(term264206, term264206.getClass(), "next", null);
        setField(term264206, term264206.getClass(), "first", null);
        setField(term264206, term264206.getClass(), "last", null);
        setField(term264206, term264206.getClass(), "propListHead", null);
        setIntField(term264206, term264206.getClass(), "sourcePosition", 0);
        setField(term264206, term264206.getClass(), "jsType", null);
        setField(term264206, term264206.getClass(), "parent", null);
        setField(term264204, term264204.getClass(), "next", term264206);
        setField(term264204, term264204.getClass(), "first", null);
        setField(term264204, term264204.getClass(), "last", null);
        setField(term264204, term264204.getClass(), "propListHead", null);
        setIntField(term264204, term264204.getClass(), "sourcePosition", 0);
        setField(term264204, term264204.getClass(), "jsType", null);
        setField(term264204, term264204.getClass(), "parent", null);
        setField(term264202, term264202.getClass(), "first", term264204);
        setField(term264202, term264202.getClass(), "last", null);
        setField(term264202, term264202.getClass(), "propListHead", null);
        setIntField(term264202, term264202.getClass(), "sourcePosition", 0);
        setField(term264202, term264202.getClass(), "jsType", null);
        setField(term264202, term264202.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term263934;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term263842, args);
        assertTrue(recursiveEquals(term263842, term264229));
        assertTrue(recursiveEquals(term263934, term264230));
        assertTrue(recursiveEquals(retValue, term264202));
    }

};


