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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203995;
     Object term204087;
     Object term204235;
     Object term204236;
     Object term204208;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203995 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term204087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term204087, term204087.getClass(), "first", term204087);
        setField(term204087, term204087.getClass(), "next", term204157);
        setIntField(term204087, term204087.getClass(), "type", 11);
        term204235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term204235, term204235.getClass(), "currentTraversal", null);
        term204236 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term204236, term204236.getClass(), "number", 0.0);
        setIntField(term204236, term204236.getClass(), "type", 11);
        setIntField(term204237, term204237.getClass(), "type", 0);
        setField(term204237, term204237.getClass(), "next", null);
        setField(term204237, term204237.getClass(), "first", null);
        setField(term204237, term204237.getClass(), "last", null);
        setField(term204237, term204237.getClass(), "propListHead", null);
        setIntField(term204237, term204237.getClass(), "sourcePosition", 0);
        setField(term204237, term204237.getClass(), "jsType", null);
        setField(term204237, term204237.getClass(), "parent", null);
        setField(term204236, term204236.getClass(), "next", term204237);
        setField(term204236, term204236.getClass(), "first", term204236);
        setField(term204236, term204236.getClass(), "last", null);
        setField(term204236, term204236.getClass(), "propListHead", null);
        setIntField(term204236, term204236.getClass(), "sourcePosition", 0);
        setField(term204236, term204236.getClass(), "jsType", null);
        setField(term204236, term204236.getClass(), "parent", null);
        term204208 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term204211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term204208, term204208.getClass(), "number", 0.0);
        setIntField(term204208, term204208.getClass(), "type", 11);
        setIntField(term204211, term204211.getClass(), "type", 0);
        setField(term204211, term204211.getClass(), "next", null);
        setField(term204211, term204211.getClass(), "first", null);
        setField(term204211, term204211.getClass(), "last", null);
        setField(term204211, term204211.getClass(), "propListHead", null);
        setIntField(term204211, term204211.getClass(), "sourcePosition", 0);
        setField(term204211, term204211.getClass(), "jsType", null);
        setField(term204211, term204211.getClass(), "parent", null);
        setField(term204208, term204208.getClass(), "next", term204211);
        setField(term204208, term204208.getClass(), "first", term204208);
        setField(term204208, term204208.getClass(), "last", null);
        setField(term204208, term204208.getClass(), "propListHead", null);
        setIntField(term204208, term204208.getClass(), "sourcePosition", 0);
        setField(term204208, term204208.getClass(), "jsType", null);
        setField(term204208, term204208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term204087;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term203995, args);
        assertTrue(recursiveEquals(term203995, term204235));
        assertTrue(recursiveEquals(term204087, term204236));
        assertTrue(recursiveEquals(retValue, term204208));
    }

};


