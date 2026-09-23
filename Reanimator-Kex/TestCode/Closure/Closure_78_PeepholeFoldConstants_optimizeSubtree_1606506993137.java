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

public class PeepholeFoldConstants_optimizeSubtree_1606506993137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23107;
     Object term23177;
     Object term23188;
     Object term23189;
     Object term23179;

    public PeepholeFoldConstants_optimizeSubtree_1606506993137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23107 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term23177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23177, term23177.getClass(), "type", 62);
        term23188 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term23188, term23188.getClass(), "currentTraversal", null);
        term23189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23189, term23189.getClass(), "type", 62);
        setField(term23189, term23189.getClass(), "next", null);
        setField(term23189, term23189.getClass(), "first", null);
        setField(term23189, term23189.getClass(), "last", null);
        setField(term23189, term23189.getClass(), "propListHead", null);
        setIntField(term23189, term23189.getClass(), "sourcePosition", 0);
        setField(term23189, term23189.getClass(), "jsType", null);
        setField(term23189, term23189.getClass(), "parent", null);
        term23179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23179, term23179.getClass(), "type", 62);
        setField(term23179, term23179.getClass(), "next", null);
        setField(term23179, term23179.getClass(), "first", null);
        setField(term23179, term23179.getClass(), "last", null);
        setField(term23179, term23179.getClass(), "propListHead", null);
        setIntField(term23179, term23179.getClass(), "sourcePosition", 0);
        setField(term23179, term23179.getClass(), "jsType", null);
        setField(term23179, term23179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23177;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term23107, args);
        assertTrue(recursiveEquals(term23107, term23188));
        assertTrue(recursiveEquals(term23177, term23189));
        assertTrue(recursiveEquals(retValue, term23179));
    }

};


