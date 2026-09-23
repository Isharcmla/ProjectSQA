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

public class PeepholeFoldConstants_optimizeSubtree_160650699375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13273;
     Object term13343;
     Object term13366;
     Object term13367;
     Object term13357;

    public PeepholeFoldConstants_optimizeSubtree_160650699375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13343, term13343.getClass(), "type", 73);
        term13366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13366, term13366.getClass(), "currentTraversal", null);
        term13367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13367, term13367.getClass(), "type", 73);
        setField(term13367, term13367.getClass(), "next", null);
        setField(term13367, term13367.getClass(), "first", null);
        setField(term13367, term13367.getClass(), "last", null);
        setField(term13367, term13367.getClass(), "propListHead", null);
        setIntField(term13367, term13367.getClass(), "sourcePosition", 0);
        setField(term13367, term13367.getClass(), "jsType", null);
        setField(term13367, term13367.getClass(), "parent", null);
        term13357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13357, term13357.getClass(), "type", 73);
        setField(term13357, term13357.getClass(), "next", null);
        setField(term13357, term13357.getClass(), "first", null);
        setField(term13357, term13357.getClass(), "last", null);
        setField(term13357, term13357.getClass(), "propListHead", null);
        setIntField(term13357, term13357.getClass(), "sourcePosition", 0);
        setField(term13357, term13357.getClass(), "jsType", null);
        setField(term13357, term13357.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13343;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13273, args);
        assertTrue(recursiveEquals(term13273, term13366));
        assertTrue(recursiveEquals(term13343, term13367));
        assertTrue(recursiveEquals(retValue, term13357));
    }

};


