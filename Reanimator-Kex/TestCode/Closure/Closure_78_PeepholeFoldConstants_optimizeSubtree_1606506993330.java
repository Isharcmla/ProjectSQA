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

public class PeepholeFoldConstants_optimizeSubtree_1606506993330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63428;
     Object term63498;
     Object term79280;
     Object term79281;
     Object term79264;

    public PeepholeFoldConstants_optimizeSubtree_1606506993330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63498, term63498.getClass(), "type", 70);
        setField(term63498, term63498.getClass(), "first", term63498);
        term79280 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term79280, term79280.getClass(), "currentTraversal", null);
        term79281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79281, term79281.getClass(), "type", 70);
        setField(term79281, term79281.getClass(), "next", null);
        setField(term79281, term79281.getClass(), "first", term79281);
        setField(term79281, term79281.getClass(), "last", null);
        setField(term79281, term79281.getClass(), "propListHead", null);
        setIntField(term79281, term79281.getClass(), "sourcePosition", 0);
        setField(term79281, term79281.getClass(), "jsType", null);
        setField(term79281, term79281.getClass(), "parent", null);
        term79264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79264, term79264.getClass(), "type", 70);
        setField(term79264, term79264.getClass(), "next", null);
        setField(term79264, term79264.getClass(), "first", term79264);
        setField(term79264, term79264.getClass(), "last", null);
        setField(term79264, term79264.getClass(), "propListHead", null);
        setIntField(term79264, term79264.getClass(), "sourcePosition", 0);
        setField(term79264, term79264.getClass(), "jsType", null);
        setField(term79264, term79264.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63498;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term63428, args);
        assertTrue(recursiveEquals(term63428, term79280));
        assertTrue(recursiveEquals(term63498, term79281));
        assertTrue(recursiveEquals(retValue, term79264));
    }

};


