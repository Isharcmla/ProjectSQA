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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718774;
     Object term718866;
     Object term719195;
     Object term719196;
     Object term719127;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718774 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term718866 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term718936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719028 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term719028, term719028.getClass(), "type", 44);
        setField(term718936, term718936.getClass(), "next", term719028);
        setIntField(term718936, term718936.getClass(), "type", 0);
        setField(term718866, term718866.getClass(), "first", term718936);
        setIntField(term718866, term718866.getClass(), "type", 101);
        setField(term718866, term718866.getClass(), "parent", term719120);
        term719195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term719195, term719195.getClass(), "currentTraversal", null);
        term719196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719198 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719199 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term719196, term719196.getClass(), "str", null);
        setIntField(term719196, term719196.getClass(), "type", 101);
        setField(term719196, term719196.getClass(), "next", null);
        setIntField(term719197, term719197.getClass(), "type", 0);
        setField(term719198, term719198.getClass(), "str", null);
        setIntField(term719198, term719198.getClass(), "type", 44);
        setField(term719198, term719198.getClass(), "next", null);
        setField(term719198, term719198.getClass(), "first", null);
        setField(term719198, term719198.getClass(), "last", null);
        setField(term719198, term719198.getClass(), "propListHead", null);
        setIntField(term719198, term719198.getClass(), "sourcePosition", 0);
        setField(term719198, term719198.getClass(), "jsType", null);
        setField(term719198, term719198.getClass(), "parent", null);
        setField(term719197, term719197.getClass(), "next", term719198);
        setField(term719197, term719197.getClass(), "first", null);
        setField(term719197, term719197.getClass(), "last", null);
        setField(term719197, term719197.getClass(), "propListHead", null);
        setIntField(term719197, term719197.getClass(), "sourcePosition", 0);
        setField(term719197, term719197.getClass(), "jsType", null);
        setField(term719197, term719197.getClass(), "parent", null);
        setField(term719196, term719196.getClass(), "first", term719197);
        setField(term719196, term719196.getClass(), "last", null);
        setField(term719196, term719196.getClass(), "propListHead", null);
        setIntField(term719196, term719196.getClass(), "sourcePosition", 0);
        setField(term719196, term719196.getClass(), "jsType", null);
        setField(term719199, term719199.getClass(), "str", null);
        setIntField(term719199, term719199.getClass(), "type", 0);
        setField(term719199, term719199.getClass(), "next", null);
        setField(term719199, term719199.getClass(), "first", null);
        setField(term719199, term719199.getClass(), "last", null);
        setField(term719199, term719199.getClass(), "propListHead", null);
        setIntField(term719199, term719199.getClass(), "sourcePosition", 0);
        setField(term719199, term719199.getClass(), "jsType", null);
        setField(term719199, term719199.getClass(), "parent", null);
        setField(term719196, term719196.getClass(), "parent", term719199);
        term719127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719131 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term719136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term719127, term719127.getClass(), "str", null);
        setIntField(term719127, term719127.getClass(), "type", 101);
        setField(term719127, term719127.getClass(), "next", null);
        setIntField(term719129, term719129.getClass(), "type", 0);
        setField(term719131, term719131.getClass(), "str", null);
        setIntField(term719131, term719131.getClass(), "type", 44);
        setField(term719131, term719131.getClass(), "next", null);
        setField(term719131, term719131.getClass(), "first", null);
        setField(term719131, term719131.getClass(), "last", null);
        setField(term719131, term719131.getClass(), "propListHead", null);
        setIntField(term719131, term719131.getClass(), "sourcePosition", 0);
        setField(term719131, term719131.getClass(), "jsType", null);
        setField(term719131, term719131.getClass(), "parent", null);
        setField(term719129, term719129.getClass(), "next", term719131);
        setField(term719129, term719129.getClass(), "first", null);
        setField(term719129, term719129.getClass(), "last", null);
        setField(term719129, term719129.getClass(), "propListHead", null);
        setIntField(term719129, term719129.getClass(), "sourcePosition", 0);
        setField(term719129, term719129.getClass(), "jsType", null);
        setField(term719129, term719129.getClass(), "parent", null);
        setField(term719127, term719127.getClass(), "first", term719129);
        setField(term719127, term719127.getClass(), "last", null);
        setField(term719127, term719127.getClass(), "propListHead", null);
        setIntField(term719127, term719127.getClass(), "sourcePosition", 0);
        setField(term719127, term719127.getClass(), "jsType", null);
        setField(term719136, term719136.getClass(), "str", null);
        setIntField(term719136, term719136.getClass(), "type", 0);
        setField(term719136, term719136.getClass(), "next", null);
        setField(term719136, term719136.getClass(), "first", null);
        setField(term719136, term719136.getClass(), "last", null);
        setField(term719136, term719136.getClass(), "propListHead", null);
        setIntField(term719136, term719136.getClass(), "sourcePosition", 0);
        setField(term719136, term719136.getClass(), "jsType", null);
        setField(term719136, term719136.getClass(), "parent", null);
        setField(term719127, term719127.getClass(), "parent", term719136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term718866;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term718774, args);
        assertTrue(recursiveEquals(term718774, term719195));
        assertTrue(recursiveEquals(term718866, term719196));
        assertTrue(recursiveEquals(retValue, term719127));
    }

};


