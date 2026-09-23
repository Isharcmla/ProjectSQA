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
     Object term18169;
     Object term18239;
     Object term18521;
     Object term18522;
     Object term18511;

    public PeepholeFoldConstants_optimizeSubtree_1606506993100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18169 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term18239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18239, term18239.getClass(), "type", 18);
        term18521 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term18521, term18521.getClass(), "currentTraversal", null);
        term18522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18522, term18522.getClass(), "type", 18);
        setField(term18522, term18522.getClass(), "next", null);
        setField(term18522, term18522.getClass(), "first", null);
        setField(term18522, term18522.getClass(), "last", null);
        setField(term18522, term18522.getClass(), "propListHead", null);
        setIntField(term18522, term18522.getClass(), "sourcePosition", 0);
        setField(term18522, term18522.getClass(), "jsType", null);
        setField(term18522, term18522.getClass(), "parent", null);
        term18511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18511, term18511.getClass(), "type", 18);
        setField(term18511, term18511.getClass(), "next", null);
        setField(term18511, term18511.getClass(), "first", null);
        setField(term18511, term18511.getClass(), "last", null);
        setField(term18511, term18511.getClass(), "propListHead", null);
        setIntField(term18511, term18511.getClass(), "sourcePosition", 0);
        setField(term18511, term18511.getClass(), "jsType", null);
        setField(term18511, term18511.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18239;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term18169, args);
        assertTrue(recursiveEquals(term18169, term18521));
        assertTrue(recursiveEquals(term18239, term18522));
        assertTrue(recursiveEquals(retValue, term18511));
    }

};


