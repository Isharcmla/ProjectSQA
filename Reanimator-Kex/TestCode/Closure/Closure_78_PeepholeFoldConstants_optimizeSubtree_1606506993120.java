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

public class PeepholeFoldConstants_optimizeSubtree_1606506993120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20537;
     Object term20607;
     Object term20808;
     Object term20809;
     Object term20799;

    public PeepholeFoldConstants_optimizeSubtree_1606506993120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20537 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20607, term20607.getClass(), "type", 38);
        term20808 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20808, term20808.getClass(), "currentTraversal", null);
        term20809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20809, term20809.getClass(), "type", 38);
        setField(term20809, term20809.getClass(), "next", null);
        setField(term20809, term20809.getClass(), "first", null);
        setField(term20809, term20809.getClass(), "last", null);
        setField(term20809, term20809.getClass(), "propListHead", null);
        setIntField(term20809, term20809.getClass(), "sourcePosition", 0);
        setField(term20809, term20809.getClass(), "jsType", null);
        setField(term20809, term20809.getClass(), "parent", null);
        term20799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20799, term20799.getClass(), "type", 38);
        setField(term20799, term20799.getClass(), "next", null);
        setField(term20799, term20799.getClass(), "first", null);
        setField(term20799, term20799.getClass(), "last", null);
        setField(term20799, term20799.getClass(), "propListHead", null);
        setIntField(term20799, term20799.getClass(), "sourcePosition", 0);
        setField(term20799, term20799.getClass(), "jsType", null);
        setField(term20799, term20799.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20607;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term20537, args);
        assertTrue(recursiveEquals(term20537, term20808));
        assertTrue(recursiveEquals(term20607, term20809));
        assertTrue(recursiveEquals(retValue, term20799));
    }

};


