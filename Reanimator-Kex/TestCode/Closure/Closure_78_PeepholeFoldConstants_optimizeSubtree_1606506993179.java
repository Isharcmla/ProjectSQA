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

public class PeepholeFoldConstants_optimizeSubtree_1606506993179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29179;
     Object term29249;
     Object term29294;
     Object term29295;
     Object term29285;

    public PeepholeFoldConstants_optimizeSubtree_1606506993179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29179 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29249, term29249.getClass(), "type", 58);
        term29294 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29294, term29294.getClass(), "currentTraversal", null);
        term29295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29295, term29295.getClass(), "type", 58);
        setField(term29295, term29295.getClass(), "next", null);
        setField(term29295, term29295.getClass(), "first", null);
        setField(term29295, term29295.getClass(), "last", null);
        setField(term29295, term29295.getClass(), "propListHead", null);
        setIntField(term29295, term29295.getClass(), "sourcePosition", 0);
        setField(term29295, term29295.getClass(), "jsType", null);
        setField(term29295, term29295.getClass(), "parent", null);
        term29285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29285, term29285.getClass(), "type", 58);
        setField(term29285, term29285.getClass(), "next", null);
        setField(term29285, term29285.getClass(), "first", null);
        setField(term29285, term29285.getClass(), "last", null);
        setField(term29285, term29285.getClass(), "propListHead", null);
        setIntField(term29285, term29285.getClass(), "sourcePosition", 0);
        setField(term29285, term29285.getClass(), "jsType", null);
        setField(term29285, term29285.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29249;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29179, args);
        assertTrue(recursiveEquals(term29179, term29294));
        assertTrue(recursiveEquals(term29249, term29295));
        assertTrue(recursiveEquals(retValue, term29285));
    }

};


