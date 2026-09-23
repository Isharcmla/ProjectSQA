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

public class PeepholeFoldConstants_optimizeSubtree_1606506993218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43077;
     Object term43147;
     Object term43473;
     Object term43474;
     Object term43424;

    public PeepholeFoldConstants_optimizeSubtree_1606506993218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43147, term43147.getClass(), "type", 37);
        setField(term43147, term43147.getClass(), "first", term43147);
        setField(term43147, term43147.getClass(), "next", term43147);
        term43473 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term43473, term43473.getClass(), "currentTraversal", null);
        term43474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43474, term43474.getClass(), "type", 37);
        setField(term43474, term43474.getClass(), "next", term43474);
        setField(term43474, term43474.getClass(), "first", term43474);
        setField(term43474, term43474.getClass(), "last", null);
        setField(term43474, term43474.getClass(), "propListHead", null);
        setIntField(term43474, term43474.getClass(), "sourcePosition", 0);
        setField(term43474, term43474.getClass(), "jsType", null);
        setField(term43474, term43474.getClass(), "parent", null);
        term43424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43424, term43424.getClass(), "type", 37);
        setField(term43424, term43424.getClass(), "next", term43424);
        setField(term43424, term43424.getClass(), "first", term43424);
        setField(term43424, term43424.getClass(), "last", null);
        setField(term43424, term43424.getClass(), "propListHead", null);
        setIntField(term43424, term43424.getClass(), "sourcePosition", 0);
        setField(term43424, term43424.getClass(), "jsType", null);
        setField(term43424, term43424.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43147;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term43077, args);
        assertTrue(recursiveEquals(term43077, term43473));
        assertTrue(recursiveEquals(term43147, term43474));
        assertTrue(recursiveEquals(retValue, term43424));
    }

};


