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

public class PeepholeFoldConstants_optimizeSubtree_1606506993121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20727;
     Object term20797;
     Object term20820;
     Object term20821;
     Object term20811;

    public PeepholeFoldConstants_optimizeSubtree_1606506993121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20727 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20797, term20797.getClass(), "type", 54);
        term20820 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20820, term20820.getClass(), "currentTraversal", null);
        term20821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20821, term20821.getClass(), "type", 54);
        setField(term20821, term20821.getClass(), "next", null);
        setField(term20821, term20821.getClass(), "first", null);
        setField(term20821, term20821.getClass(), "last", null);
        setField(term20821, term20821.getClass(), "propListHead", null);
        setIntField(term20821, term20821.getClass(), "sourcePosition", 0);
        setField(term20821, term20821.getClass(), "jsType", null);
        setField(term20821, term20821.getClass(), "parent", null);
        term20811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20811, term20811.getClass(), "type", 54);
        setField(term20811, term20811.getClass(), "next", null);
        setField(term20811, term20811.getClass(), "first", null);
        setField(term20811, term20811.getClass(), "last", null);
        setField(term20811, term20811.getClass(), "propListHead", null);
        setIntField(term20811, term20811.getClass(), "sourcePosition", 0);
        setField(term20811, term20811.getClass(), "jsType", null);
        setField(term20811, term20811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20797;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term20727, args);
        assertTrue(recursiveEquals(term20727, term20820));
        assertTrue(recursiveEquals(term20797, term20821));
        assertTrue(recursiveEquals(retValue, term20811));
    }

};


