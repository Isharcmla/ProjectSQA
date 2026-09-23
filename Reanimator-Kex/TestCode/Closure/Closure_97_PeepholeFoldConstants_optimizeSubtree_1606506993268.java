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

public class PeepholeFoldConstants_optimizeSubtree_1606506993268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53104;
     Object term53174;
     Object term53300;
     Object term53301;
     Object term53285;

    public PeepholeFoldConstants_optimizeSubtree_1606506993268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53104 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term53174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53174, term53174.getClass(), "type", 36);
        setField(term53174, term53174.getClass(), "first", term53174);
        term53300 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term53300, term53300.getClass(), "currentTraversal", null);
        term53301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53301, term53301.getClass(), "type", 36);
        setField(term53301, term53301.getClass(), "next", null);
        setField(term53301, term53301.getClass(), "first", term53301);
        setField(term53301, term53301.getClass(), "last", null);
        setField(term53301, term53301.getClass(), "propListHead", null);
        setIntField(term53301, term53301.getClass(), "sourcePosition", 0);
        setField(term53301, term53301.getClass(), "jsType", null);
        setField(term53301, term53301.getClass(), "parent", null);
        term53285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53285, term53285.getClass(), "type", 36);
        setField(term53285, term53285.getClass(), "next", null);
        setField(term53285, term53285.getClass(), "first", term53285);
        setField(term53285, term53285.getClass(), "last", null);
        setField(term53285, term53285.getClass(), "propListHead", null);
        setIntField(term53285, term53285.getClass(), "sourcePosition", 0);
        setField(term53285, term53285.getClass(), "jsType", null);
        setField(term53285, term53285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53174;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term53104, args);
        assertTrue(recursiveEquals(term53104, term53300));
        assertTrue(recursiveEquals(term53174, term53301));
        assertTrue(recursiveEquals(retValue, term53285));
    }

};


