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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_newQualifiedNameNode_128645923269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2520;

    public NodeUtil_newQualifiedNameNode_128645923269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2520, term2520.getClass(), "type", -1270258033);
        setIntField(term2522, term2522.getClass(), "type", 1302110708);
        setIntField(term2524, term2524.getClass(), "type", 0);
        setField(term2524, term2524.getClass(), "next", null);
        setField(term2524, term2524.getClass(), "first", null);
        setField(term2524, term2524.getClass(), "last", null);
        setField(term2524, term2524.getClass(), "propListHead", null);
        setIntField(term2524, term2524.getClass(), "sourcePosition", 0);
        setField(term2524, term2524.getClass(), "jsType", null);
        setField(term2524, term2524.getClass(), "parent", null);
        setField(term2522, term2522.getClass(), "next", term2524);
        setIntField(term2527, term2527.getClass(), "type", 0);
        setField(term2527, term2527.getClass(), "next", null);
        setField(term2527, term2527.getClass(), "first", null);
        setField(term2527, term2527.getClass(), "last", null);
        setField(term2527, term2527.getClass(), "propListHead", null);
        setIntField(term2527, term2527.getClass(), "sourcePosition", 0);
        setField(term2527, term2527.getClass(), "jsType", null);
        setField(term2527, term2527.getClass(), "parent", null);
        setField(term2522, term2522.getClass(), "first", term2527);
        setIntField(term2530, term2530.getClass(), "type", 0);
        setField(term2530, term2530.getClass(), "next", null);
        setField(term2530, term2530.getClass(), "first", null);
        setField(term2530, term2530.getClass(), "last", null);
        setField(term2530, term2530.getClass(), "propListHead", null);
        setIntField(term2530, term2530.getClass(), "sourcePosition", 0);
        setField(term2530, term2530.getClass(), "jsType", null);
        setField(term2530, term2530.getClass(), "parent", null);
        setField(term2522, term2522.getClass(), "last", term2530);
        setField(term2522, term2522.getClass(), "propListHead", null);
        setIntField(term2522, term2522.getClass(), "sourcePosition", 0);
        setField(term2522, term2522.getClass(), "jsType", null);
        setField(term2522, term2522.getClass(), "parent", null);
        setField(term2520, term2520.getClass(), "next", term2522);
        setIntField(term2534, term2534.getClass(), "type", 0);
        setField(term2534, term2534.getClass(), "next", null);
        setField(term2534, term2534.getClass(), "first", null);
        setField(term2534, term2534.getClass(), "last", null);
        setField(term2534, term2534.getClass(), "propListHead", null);
        setIntField(term2534, term2534.getClass(), "sourcePosition", 0);
        setField(term2534, term2534.getClass(), "jsType", null);
        setField(term2534, term2534.getClass(), "parent", null);
        setField(term2520, term2520.getClass(), "first", term2534);
        setIntField(term2537, term2537.getClass(), "type", 0);
        setField(term2537, term2537.getClass(), "next", null);
        setField(term2537, term2537.getClass(), "first", null);
        setField(term2537, term2537.getClass(), "last", null);
        setField(term2537, term2537.getClass(), "propListHead", null);
        setIntField(term2537, term2537.getClass(), "sourcePosition", 0);
        setField(term2537, term2537.getClass(), "jsType", null);
        setField(term2537, term2537.getClass(), "parent", null);
        setField(term2520, term2520.getClass(), "last", term2537);
        setField(term2520, term2520.getClass(), "propListHead", null);
        setIntField(term2520, term2520.getClass(), "sourcePosition", 0);
        setField(term2520, term2520.getClass(), "jsType", null);
        setField(term2520, term2520.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "ZiaGIbnzTs";
        args[2] = term2520;
        args[3] = "tbcdzjIfER";
        try {
            callMethod(klass, "newQualifiedNameNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


