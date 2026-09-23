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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248950;
     Object term249042;
     Object term249244;
     Object term249245;
     Object term249223;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248950 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term249042 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249042, term249042.getClass(), "first", term249042);
        setField(term249042, term249042.getClass(), "next", term249112);
        setIntField(term249042, term249042.getClass(), "type", 19);
        term249244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term249244, term249244.getClass(), "currentTraversal", null);
        term249245 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249245, term249245.getClass(), "str", null);
        setIntField(term249245, term249245.getClass(), "type", 19);
        setIntField(term249246, term249246.getClass(), "type", 0);
        setField(term249246, term249246.getClass(), "next", null);
        setField(term249246, term249246.getClass(), "first", null);
        setField(term249246, term249246.getClass(), "last", null);
        setField(term249246, term249246.getClass(), "propListHead", null);
        setIntField(term249246, term249246.getClass(), "sourcePosition", 0);
        setField(term249246, term249246.getClass(), "jsType", null);
        setField(term249246, term249246.getClass(), "parent", null);
        setField(term249245, term249245.getClass(), "next", term249246);
        setField(term249245, term249245.getClass(), "first", term249245);
        setField(term249245, term249245.getClass(), "last", null);
        setField(term249245, term249245.getClass(), "propListHead", null);
        setIntField(term249245, term249245.getClass(), "sourcePosition", 0);
        setField(term249245, term249245.getClass(), "jsType", null);
        setField(term249245, term249245.getClass(), "parent", null);
        term249223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term249225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term249223, term249223.getClass(), "str", null);
        setIntField(term249223, term249223.getClass(), "type", 19);
        setIntField(term249225, term249225.getClass(), "type", 0);
        setField(term249225, term249225.getClass(), "next", null);
        setField(term249225, term249225.getClass(), "first", null);
        setField(term249225, term249225.getClass(), "last", null);
        setField(term249225, term249225.getClass(), "propListHead", null);
        setIntField(term249225, term249225.getClass(), "sourcePosition", 0);
        setField(term249225, term249225.getClass(), "jsType", null);
        setField(term249225, term249225.getClass(), "parent", null);
        setField(term249223, term249223.getClass(), "next", term249225);
        setField(term249223, term249223.getClass(), "first", term249223);
        setField(term249223, term249223.getClass(), "last", null);
        setField(term249223, term249223.getClass(), "propListHead", null);
        setIntField(term249223, term249223.getClass(), "sourcePosition", 0);
        setField(term249223, term249223.getClass(), "jsType", null);
        setField(term249223, term249223.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term249042;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term248950, args);
        assertTrue(recursiveEquals(term248950, term249244));
        assertTrue(recursiveEquals(term249042, term249245));
        assertTrue(recursiveEquals(retValue, term249223));
    }

};


