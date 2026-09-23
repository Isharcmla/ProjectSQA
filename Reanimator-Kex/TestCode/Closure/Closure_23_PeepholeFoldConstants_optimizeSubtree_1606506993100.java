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

public class PeepholeFoldConstants_optimizeSubtree_1606506993100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13105;
     Object term13175;
     Object term13378;
     Object term13379;
     Object term13367;

    public PeepholeFoldConstants_optimizeSubtree_1606506993100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13105 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13175, term13175.getClass(), "type", 19);
        term13378 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term13378, term13378.getClass(), "late", false);
        setField(term13378, term13378.getClass(), "compiler", null);
        term13379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13379, term13379.getClass(), "type", 19);
        setField(term13379, term13379.getClass(), "next", null);
        setField(term13379, term13379.getClass(), "first", null);
        setField(term13379, term13379.getClass(), "last", null);
        setField(term13379, term13379.getClass(), "propListHead", null);
        setIntField(term13379, term13379.getClass(), "sourcePosition", 0);
        setField(term13379, term13379.getClass(), "jsType", null);
        setField(term13379, term13379.getClass(), "parent", null);
        term13367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13367, term13367.getClass(), "type", 19);
        setField(term13367, term13367.getClass(), "next", null);
        setField(term13367, term13367.getClass(), "first", null);
        setField(term13367, term13367.getClass(), "last", null);
        setField(term13367, term13367.getClass(), "propListHead", null);
        setIntField(term13367, term13367.getClass(), "sourcePosition", 0);
        setField(term13367, term13367.getClass(), "jsType", null);
        setField(term13367, term13367.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13175;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13105, args);
        assertTrue(recursiveEquals(term13105, term13378));
        assertTrue(recursiveEquals(term13175, term13379));
        assertTrue(recursiveEquals(retValue, term13367));
    }

};


