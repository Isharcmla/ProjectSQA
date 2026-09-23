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

public class PeepholeFoldConstants_optimizeSubtree_1606506993256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41724;
     Object term41794;
     Object term42168;
     Object term42169;
     Object term42159;

    public PeepholeFoldConstants_optimizeSubtree_1606506993256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term41794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41794, term41794.getClass(), "type", 12);
        term42168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42168, term42168.getClass(), "currentTraversal", null);
        term42169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42169, term42169.getClass(), "type", 12);
        setField(term42169, term42169.getClass(), "next", null);
        setField(term42169, term42169.getClass(), "first", null);
        setField(term42169, term42169.getClass(), "last", null);
        setField(term42169, term42169.getClass(), "propListHead", null);
        setIntField(term42169, term42169.getClass(), "sourcePosition", 0);
        setField(term42169, term42169.getClass(), "jsType", null);
        setField(term42169, term42169.getClass(), "parent", null);
        term42159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42159, term42159.getClass(), "type", 12);
        setField(term42159, term42159.getClass(), "next", null);
        setField(term42159, term42159.getClass(), "first", null);
        setField(term42159, term42159.getClass(), "last", null);
        setField(term42159, term42159.getClass(), "propListHead", null);
        setIntField(term42159, term42159.getClass(), "sourcePosition", 0);
        setField(term42159, term42159.getClass(), "jsType", null);
        setField(term42159, term42159.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41794;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term41724, args);
        assertTrue(recursiveEquals(term41724, term42168));
        assertTrue(recursiveEquals(term41794, term42169));
        assertTrue(recursiveEquals(retValue, term42159));
    }

};


