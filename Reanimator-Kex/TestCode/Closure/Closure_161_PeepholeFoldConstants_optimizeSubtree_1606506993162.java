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

public class PeepholeFoldConstants_optimizeSubtree_1606506993162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26199;
     Object term26269;
     Object term26482;
     Object term26483;
     Object term26473;

    public PeepholeFoldConstants_optimizeSubtree_1606506993162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26269, term26269.getClass(), "type", 17);
        term26482 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26482, term26482.getClass(), "currentTraversal", null);
        term26483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26483, term26483.getClass(), "type", 17);
        setField(term26483, term26483.getClass(), "next", null);
        setField(term26483, term26483.getClass(), "first", null);
        setField(term26483, term26483.getClass(), "last", null);
        setField(term26483, term26483.getClass(), "propListHead", null);
        setIntField(term26483, term26483.getClass(), "sourcePosition", 0);
        setField(term26483, term26483.getClass(), "jsType", null);
        setField(term26483, term26483.getClass(), "parent", null);
        term26473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26473, term26473.getClass(), "type", 17);
        setField(term26473, term26473.getClass(), "next", null);
        setField(term26473, term26473.getClass(), "first", null);
        setField(term26473, term26473.getClass(), "last", null);
        setField(term26473, term26473.getClass(), "propListHead", null);
        setIntField(term26473, term26473.getClass(), "sourcePosition", 0);
        setField(term26473, term26473.getClass(), "jsType", null);
        setField(term26473, term26473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26269;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26199, args);
        assertTrue(recursiveEquals(term26199, term26482));
        assertTrue(recursiveEquals(term26269, term26483));
        assertTrue(recursiveEquals(retValue, term26473));
    }

};


