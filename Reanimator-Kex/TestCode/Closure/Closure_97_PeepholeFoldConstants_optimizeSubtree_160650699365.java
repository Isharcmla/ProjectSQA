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

public class PeepholeFoldConstants_optimizeSubtree_160650699365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11167;
     Object term11237;
     Object term11673;
     Object term11674;
     Object term11652;

    public PeepholeFoldConstants_optimizeSubtree_160650699365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term11237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11237, term11237.getClass(), "type", 37);
        term11673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term11673, term11673.getClass(), "currentTraversal", null);
        term11674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11674, term11674.getClass(), "type", 37);
        setField(term11674, term11674.getClass(), "next", null);
        setField(term11674, term11674.getClass(), "first", null);
        setField(term11674, term11674.getClass(), "last", null);
        setField(term11674, term11674.getClass(), "propListHead", null);
        setIntField(term11674, term11674.getClass(), "sourcePosition", 0);
        setField(term11674, term11674.getClass(), "jsType", null);
        setField(term11674, term11674.getClass(), "parent", null);
        term11652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11652, term11652.getClass(), "type", 37);
        setField(term11652, term11652.getClass(), "next", null);
        setField(term11652, term11652.getClass(), "first", null);
        setField(term11652, term11652.getClass(), "last", null);
        setField(term11652, term11652.getClass(), "propListHead", null);
        setIntField(term11652, term11652.getClass(), "sourcePosition", 0);
        setField(term11652, term11652.getClass(), "jsType", null);
        setField(term11652, term11652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11237;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term11167, args);
        assertTrue(recursiveEquals(term11167, term11673));
        assertTrue(recursiveEquals(term11237, term11674));
        assertTrue(recursiveEquals(retValue, term11652));
    }

};


