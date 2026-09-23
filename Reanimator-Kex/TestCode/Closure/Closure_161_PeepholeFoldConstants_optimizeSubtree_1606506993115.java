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

public class PeepholeFoldConstants_optimizeSubtree_1606506993115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19004;
     Object term19074;
     Object term19383;
     Object term19384;
     Object term19374;

    public PeepholeFoldConstants_optimizeSubtree_1606506993115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19004 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19074, term19074.getClass(), "type", 83);
        term19383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term19383, term19383.getClass(), "currentTraversal", null);
        term19384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19384, term19384.getClass(), "type", 83);
        setField(term19384, term19384.getClass(), "next", null);
        setField(term19384, term19384.getClass(), "first", null);
        setField(term19384, term19384.getClass(), "last", null);
        setField(term19384, term19384.getClass(), "propListHead", null);
        setIntField(term19384, term19384.getClass(), "sourcePosition", 0);
        setField(term19384, term19384.getClass(), "jsType", null);
        setField(term19384, term19384.getClass(), "parent", null);
        term19374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19374, term19374.getClass(), "type", 83);
        setField(term19374, term19374.getClass(), "next", null);
        setField(term19374, term19374.getClass(), "first", null);
        setField(term19374, term19374.getClass(), "last", null);
        setField(term19374, term19374.getClass(), "propListHead", null);
        setIntField(term19374, term19374.getClass(), "sourcePosition", 0);
        setField(term19374, term19374.getClass(), "jsType", null);
        setField(term19374, term19374.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19074;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term19004, args);
        assertTrue(recursiveEquals(term19004, term19383));
        assertTrue(recursiveEquals(term19074, term19384));
        assertTrue(recursiveEquals(retValue, term19374));
    }

};


