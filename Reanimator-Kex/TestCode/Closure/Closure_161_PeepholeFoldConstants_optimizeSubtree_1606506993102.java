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

public class PeepholeFoldConstants_optimizeSubtree_1606506993102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15921;
     Object term15991;
     Object term16192;
     Object term16193;
     Object term16183;

    public PeepholeFoldConstants_optimizeSubtree_1606506993102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15921 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15991, term15991.getClass(), "type", 49);
        term16192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term16192, term16192.getClass(), "currentTraversal", null);
        term16193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16193, term16193.getClass(), "type", 49);
        setField(term16193, term16193.getClass(), "next", null);
        setField(term16193, term16193.getClass(), "first", null);
        setField(term16193, term16193.getClass(), "last", null);
        setField(term16193, term16193.getClass(), "propListHead", null);
        setIntField(term16193, term16193.getClass(), "sourcePosition", 0);
        setField(term16193, term16193.getClass(), "jsType", null);
        setField(term16193, term16193.getClass(), "parent", null);
        term16183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16183, term16183.getClass(), "type", 49);
        setField(term16183, term16183.getClass(), "next", null);
        setField(term16183, term16183.getClass(), "first", null);
        setField(term16183, term16183.getClass(), "last", null);
        setField(term16183, term16183.getClass(), "propListHead", null);
        setIntField(term16183, term16183.getClass(), "sourcePosition", 0);
        setField(term16183, term16183.getClass(), "jsType", null);
        setField(term16183, term16183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15991;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term15921, args);
        assertTrue(recursiveEquals(term15921, term16192));
        assertTrue(recursiveEquals(term15991, term16193));
        assertTrue(recursiveEquals(retValue, term16183));
    }

};


