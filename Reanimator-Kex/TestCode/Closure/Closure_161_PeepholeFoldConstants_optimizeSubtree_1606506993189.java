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

public class PeepholeFoldConstants_optimizeSubtree_1606506993189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29077;
     Object term29147;
     Object term29176;
     Object term29177;
     Object term29167;

    public PeepholeFoldConstants_optimizeSubtree_1606506993189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29147, term29147.getClass(), "type", 85);
        term29176 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29176, term29176.getClass(), "currentTraversal", null);
        term29177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29177, term29177.getClass(), "type", 85);
        setField(term29177, term29177.getClass(), "next", null);
        setField(term29177, term29177.getClass(), "first", null);
        setField(term29177, term29177.getClass(), "last", null);
        setField(term29177, term29177.getClass(), "propListHead", null);
        setIntField(term29177, term29177.getClass(), "sourcePosition", 0);
        setField(term29177, term29177.getClass(), "jsType", null);
        setField(term29177, term29177.getClass(), "parent", null);
        term29167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29167, term29167.getClass(), "type", 85);
        setField(term29167, term29167.getClass(), "next", null);
        setField(term29167, term29167.getClass(), "first", null);
        setField(term29167, term29167.getClass(), "last", null);
        setField(term29167, term29167.getClass(), "propListHead", null);
        setIntField(term29167, term29167.getClass(), "sourcePosition", 0);
        setField(term29167, term29167.getClass(), "jsType", null);
        setField(term29167, term29167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29147;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29077, args);
        assertTrue(recursiveEquals(term29077, term29176));
        assertTrue(recursiveEquals(term29147, term29177));
        assertTrue(recursiveEquals(retValue, term29167));
    }

};


