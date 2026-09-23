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

public class PeepholeFoldConstants_optimizeSubtree_1606506993107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19819;
     Object term19889;
     Object term20233;
     Object term20234;
     Object term20225;

    public PeepholeFoldConstants_optimizeSubtree_1606506993107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19819 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19889, term19889.getClass(), "type", 36);
        term20233 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20233, term20233.getClass(), "currentTraversal", null);
        term20234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20234, term20234.getClass(), "type", 36);
        setField(term20234, term20234.getClass(), "next", null);
        setField(term20234, term20234.getClass(), "first", null);
        setField(term20234, term20234.getClass(), "last", null);
        setField(term20234, term20234.getClass(), "propListHead", null);
        setIntField(term20234, term20234.getClass(), "sourcePosition", 0);
        setField(term20234, term20234.getClass(), "jsType", null);
        setField(term20234, term20234.getClass(), "parent", null);
        term20225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20225, term20225.getClass(), "type", 36);
        setField(term20225, term20225.getClass(), "next", null);
        setField(term20225, term20225.getClass(), "first", null);
        setField(term20225, term20225.getClass(), "last", null);
        setField(term20225, term20225.getClass(), "propListHead", null);
        setIntField(term20225, term20225.getClass(), "sourcePosition", 0);
        setField(term20225, term20225.getClass(), "jsType", null);
        setField(term20225, term20225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19889;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term19819, args);
        assertTrue(recursiveEquals(term19819, term20233));
        assertTrue(recursiveEquals(term19889, term20234));
        assertTrue(recursiveEquals(retValue, term20225));
    }

};


