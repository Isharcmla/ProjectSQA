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

public class PeepholeFoldConstants_optimizeSubtree_160650699374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13083;
     Object term13153;
     Object term13354;
     Object term13355;
     Object term13345;

    public PeepholeFoldConstants_optimizeSubtree_160650699374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13083 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13153, term13153.getClass(), "type", 76);
        term13354 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term13354, term13354.getClass(), "currentTraversal", null);
        term13355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13355, term13355.getClass(), "type", 76);
        setField(term13355, term13355.getClass(), "next", null);
        setField(term13355, term13355.getClass(), "first", null);
        setField(term13355, term13355.getClass(), "last", null);
        setField(term13355, term13355.getClass(), "propListHead", null);
        setIntField(term13355, term13355.getClass(), "sourcePosition", 0);
        setField(term13355, term13355.getClass(), "jsType", null);
        setField(term13355, term13355.getClass(), "parent", null);
        term13345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13345, term13345.getClass(), "type", 76);
        setField(term13345, term13345.getClass(), "next", null);
        setField(term13345, term13345.getClass(), "first", null);
        setField(term13345, term13345.getClass(), "last", null);
        setField(term13345, term13345.getClass(), "propListHead", null);
        setIntField(term13345, term13345.getClass(), "sourcePosition", 0);
        setField(term13345, term13345.getClass(), "jsType", null);
        setField(term13345, term13345.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13153;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13083, args);
        assertTrue(recursiveEquals(term13083, term13354));
        assertTrue(recursiveEquals(term13153, term13355));
        assertTrue(recursiveEquals(retValue, term13345));
    }

};


