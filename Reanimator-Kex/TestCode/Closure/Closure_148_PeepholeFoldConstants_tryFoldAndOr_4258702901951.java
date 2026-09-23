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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519484;
     Object term519576;
     Object term519668;
     Object term520204;
     Object term520205;
     Object term520206;
     Object term520172;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519484 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term519576 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term519576, term519576.getClass(), "parent", null);
        setIntField(term519576, term519576.getClass(), "type", 44);
        term519668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term519668, term519668.getClass(), "type", 44);
        term520204 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term520204, term520204.getClass(), "currentTraversal", null);
        term520205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term520205, term520205.getClass(), "number", 0.0);
        setIntField(term520205, term520205.getClass(), "type", 44);
        setField(term520205, term520205.getClass(), "next", null);
        setField(term520205, term520205.getClass(), "first", null);
        setField(term520205, term520205.getClass(), "last", null);
        setField(term520205, term520205.getClass(), "propListHead", null);
        setIntField(term520205, term520205.getClass(), "sourcePosition", 0);
        setField(term520205, term520205.getClass(), "jsType", null);
        setField(term520205, term520205.getClass(), "parent", null);
        term520206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term520206, term520206.getClass(), "str", null);
        setIntField(term520206, term520206.getClass(), "type", 44);
        setField(term520206, term520206.getClass(), "next", null);
        setField(term520206, term520206.getClass(), "first", null);
        setField(term520206, term520206.getClass(), "last", null);
        setField(term520206, term520206.getClass(), "propListHead", null);
        setIntField(term520206, term520206.getClass(), "sourcePosition", 0);
        setField(term520206, term520206.getClass(), "jsType", null);
        setField(term520206, term520206.getClass(), "parent", null);
        term520172 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term520172, term520172.getClass(), "number", 0.0);
        setIntField(term520172, term520172.getClass(), "type", 44);
        setField(term520172, term520172.getClass(), "next", null);
        setField(term520172, term520172.getClass(), "first", null);
        setField(term520172, term520172.getClass(), "last", null);
        setField(term520172, term520172.getClass(), "propListHead", null);
        setIntField(term520172, term520172.getClass(), "sourcePosition", 0);
        setField(term520172, term520172.getClass(), "jsType", null);
        setField(term520172, term520172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term519576;
        args[1] = term519668;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term519484, args);
        assertTrue(recursiveEquals(term519484, term520204));
        assertTrue(recursiveEquals(term519576, term520205));
        assertTrue(recursiveEquals(term519668, term520206));
        assertTrue(recursiveEquals(retValue, term520172));
    }

};


