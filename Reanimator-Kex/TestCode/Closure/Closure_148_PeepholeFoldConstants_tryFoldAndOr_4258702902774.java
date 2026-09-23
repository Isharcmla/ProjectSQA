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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799905;
     Object term799997;
     Object term800181;
     Object term800273;
     Object term801457;
     Object term801458;
     Object term801460;
     Object term801461;
     Object term801386;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799905 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term799997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term800089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term800089, term800089.getClass(), "type", 108);
        setField(term799997, term799997.getClass(), "parent", term800089);
        setIntField(term799997, term799997.getClass(), "type", 0);
        term800181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term800181, term800181.getClass(), "type", 80);
        term800273 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term800273, term800273.getClass(), "type", 44);
        term801457 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term801457, term801457.getClass(), "currentTraversal", null);
        term801458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term801459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term801458, term801458.getClass(), "number", 0.0);
        setIntField(term801458, term801458.getClass(), "type", 0);
        setField(term801458, term801458.getClass(), "next", null);
        setField(term801458, term801458.getClass(), "first", null);
        setField(term801458, term801458.getClass(), "last", null);
        setField(term801458, term801458.getClass(), "propListHead", null);
        setIntField(term801458, term801458.getClass(), "sourcePosition", 0);
        setField(term801458, term801458.getClass(), "jsType", null);
        setDoubleField(term801459, term801459.getClass(), "number", 0.0);
        setIntField(term801459, term801459.getClass(), "type", 108);
        setField(term801459, term801459.getClass(), "next", null);
        setField(term801459, term801459.getClass(), "first", null);
        setField(term801459, term801459.getClass(), "last", null);
        setField(term801459, term801459.getClass(), "propListHead", null);
        setIntField(term801459, term801459.getClass(), "sourcePosition", 0);
        setField(term801459, term801459.getClass(), "jsType", null);
        setField(term801459, term801459.getClass(), "parent", null);
        setField(term801458, term801458.getClass(), "parent", term801459);
        term801460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term801460, term801460.getClass(), "str", null);
        setIntField(term801460, term801460.getClass(), "type", 80);
        setField(term801460, term801460.getClass(), "next", null);
        setField(term801460, term801460.getClass(), "first", null);
        setField(term801460, term801460.getClass(), "last", null);
        setField(term801460, term801460.getClass(), "propListHead", null);
        setIntField(term801460, term801460.getClass(), "sourcePosition", 0);
        setField(term801460, term801460.getClass(), "jsType", null);
        setField(term801460, term801460.getClass(), "parent", null);
        term801461 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term801461, term801461.getClass(), "number", 0.0);
        setIntField(term801461, term801461.getClass(), "type", 44);
        setField(term801461, term801461.getClass(), "next", null);
        setField(term801461, term801461.getClass(), "first", null);
        setField(term801461, term801461.getClass(), "last", null);
        setField(term801461, term801461.getClass(), "propListHead", null);
        setIntField(term801461, term801461.getClass(), "sourcePosition", 0);
        setField(term801461, term801461.getClass(), "jsType", null);
        setField(term801461, term801461.getClass(), "parent", null);
        term801386 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term801390 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term801386, term801386.getClass(), "number", 0.0);
        setIntField(term801386, term801386.getClass(), "type", 0);
        setField(term801386, term801386.getClass(), "next", null);
        setField(term801386, term801386.getClass(), "first", null);
        setField(term801386, term801386.getClass(), "last", null);
        setField(term801386, term801386.getClass(), "propListHead", null);
        setIntField(term801386, term801386.getClass(), "sourcePosition", 0);
        setField(term801386, term801386.getClass(), "jsType", null);
        setDoubleField(term801390, term801390.getClass(), "number", 0.0);
        setIntField(term801390, term801390.getClass(), "type", 108);
        setField(term801390, term801390.getClass(), "next", null);
        setField(term801390, term801390.getClass(), "first", null);
        setField(term801390, term801390.getClass(), "last", null);
        setField(term801390, term801390.getClass(), "propListHead", null);
        setIntField(term801390, term801390.getClass(), "sourcePosition", 0);
        setField(term801390, term801390.getClass(), "jsType", null);
        setField(term801390, term801390.getClass(), "parent", null);
        setField(term801386, term801386.getClass(), "parent", term801390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term799997;
        args[1] = term800181;
        args[2] = term800273;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term799905, args);
        assertTrue(recursiveEquals(term799905, term801457));
        assertTrue(recursiveEquals(term799997, term801458));
        assertTrue(recursiveEquals(term800181, term801460));
        assertTrue(recursiveEquals(term800273, term801461));
        assertTrue(recursiveEquals(retValue, term801386));
    }

};


