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

public class PeepholeFoldConstants_optimizeSubtree_1606506993580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126754;
     Object term126824;
     Object term127361;
     Object term127362;
     Object term127346;

    public PeepholeFoldConstants_optimizeSubtree_1606506993580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126754 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term126824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126824, term126824.getClass(), "type", 34);
        setField(term126824, term126824.getClass(), "first", term126824);
        term127361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term127361, term127361.getClass(), "currentTraversal", null);
        term127362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127362, term127362.getClass(), "type", 34);
        setField(term127362, term127362.getClass(), "next", null);
        setField(term127362, term127362.getClass(), "first", term127362);
        setField(term127362, term127362.getClass(), "last", null);
        setField(term127362, term127362.getClass(), "propListHead", null);
        setIntField(term127362, term127362.getClass(), "sourcePosition", 0);
        setField(term127362, term127362.getClass(), "jsType", null);
        setField(term127362, term127362.getClass(), "parent", null);
        term127346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127346, term127346.getClass(), "type", 34);
        setField(term127346, term127346.getClass(), "next", null);
        setField(term127346, term127346.getClass(), "first", term127346);
        setField(term127346, term127346.getClass(), "last", null);
        setField(term127346, term127346.getClass(), "propListHead", null);
        setIntField(term127346, term127346.getClass(), "sourcePosition", 0);
        setField(term127346, term127346.getClass(), "jsType", null);
        setField(term127346, term127346.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term126824;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term126754, args);
        assertTrue(recursiveEquals(term126754, term127361));
        assertTrue(recursiveEquals(term126824, term127362));
        assertTrue(recursiveEquals(retValue, term127346));
    }

};


