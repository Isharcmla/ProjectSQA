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

public class PeepholeFoldConstants_optimizeSubtree_160650699373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11475;
     Object term11545;
     Object term12108;
     Object term12109;
     Object term12099;

    public PeepholeFoldConstants_optimizeSubtree_160650699373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11475 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term11545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11545, term11545.getClass(), "type", 52);
        term12108 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12108, term12108.getClass(), "currentTraversal", null);
        term12109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12109, term12109.getClass(), "type", 52);
        setField(term12109, term12109.getClass(), "next", null);
        setField(term12109, term12109.getClass(), "first", null);
        setField(term12109, term12109.getClass(), "last", null);
        setField(term12109, term12109.getClass(), "propListHead", null);
        setIntField(term12109, term12109.getClass(), "sourcePosition", 0);
        setField(term12109, term12109.getClass(), "jsType", null);
        setField(term12109, term12109.getClass(), "parent", null);
        term12099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12099, term12099.getClass(), "type", 52);
        setField(term12099, term12099.getClass(), "next", null);
        setField(term12099, term12099.getClass(), "first", null);
        setField(term12099, term12099.getClass(), "last", null);
        setField(term12099, term12099.getClass(), "propListHead", null);
        setIntField(term12099, term12099.getClass(), "sourcePosition", 0);
        setField(term12099, term12099.getClass(), "jsType", null);
        setField(term12099, term12099.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11545;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term11475, args);
        assertTrue(recursiveEquals(term11475, term12108));
        assertTrue(recursiveEquals(term11545, term12109));
        assertTrue(recursiveEquals(retValue, term12099));
    }

};


