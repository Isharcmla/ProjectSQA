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

public class PeepholeFoldConstants_optimizeSubtree_1606506993144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23523;
     Object term23593;
     Object term23979;
     Object term23980;
     Object term23970;

    public PeepholeFoldConstants_optimizeSubtree_1606506993144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23523 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23593, term23593.getClass(), "type", 74);
        term23979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23979, term23979.getClass(), "currentTraversal", null);
        term23980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23980, term23980.getClass(), "type", 74);
        setField(term23980, term23980.getClass(), "next", null);
        setField(term23980, term23980.getClass(), "first", null);
        setField(term23980, term23980.getClass(), "last", null);
        setField(term23980, term23980.getClass(), "propListHead", null);
        setIntField(term23980, term23980.getClass(), "sourcePosition", 0);
        setField(term23980, term23980.getClass(), "jsType", null);
        setField(term23980, term23980.getClass(), "parent", null);
        term23970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23970, term23970.getClass(), "type", 74);
        setField(term23970, term23970.getClass(), "next", null);
        setField(term23970, term23970.getClass(), "first", null);
        setField(term23970, term23970.getClass(), "last", null);
        setField(term23970, term23970.getClass(), "propListHead", null);
        setIntField(term23970, term23970.getClass(), "sourcePosition", 0);
        setField(term23970, term23970.getClass(), "jsType", null);
        setField(term23970, term23970.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23593;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23523, args);
        assertTrue(recursiveEquals(term23523, term23979));
        assertTrue(recursiveEquals(term23593, term23980));
        assertTrue(recursiveEquals(retValue, term23970));
    }

};


