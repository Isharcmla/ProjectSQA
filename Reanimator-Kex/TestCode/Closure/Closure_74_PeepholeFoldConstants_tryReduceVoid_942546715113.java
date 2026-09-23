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
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20407;
     Object term20567;
     Object term20668;
     Object term20670;
     Object term20641;

    public PeepholeFoldConstants_tryReduceVoid_942546715113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term20497 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term20497, term20497.getClass(), "compiler", null);
        setField(term20407, term20407.getClass(), "currentTraversal", term20497);
        term20567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20637, term20637.getClass(), "type", 61);
        setField(term20567, term20567.getClass(), "first", term20637);
        setIntField(term20567, term20567.getClass(), "type", 61);
        term20668 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term20669 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term20669, term20669.getClass(), "compiler", null);
        setField(term20669, term20669.getClass(), "callback", null);
        setField(term20669, term20669.getClass(), "curNode", null);
        setField(term20669, term20669.getClass(), "scopes", null);
        setField(term20669, term20669.getClass(), "scopeRoots", null);
        setField(term20669, term20669.getClass(), "cfgs", null);
        setField(term20669, term20669.getClass(), "sourceName", null);
        setField(term20669, term20669.getClass(), "scopeCreator", null);
        setField(term20669, term20669.getClass(), "scopeCallback", null);
        setField(term20668, term20668.getClass(), "currentTraversal", term20669);
        term20670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20670, term20670.getClass(), "type", 61);
        setField(term20670, term20670.getClass(), "next", null);
        setIntField(term20671, term20671.getClass(), "type", 61);
        setField(term20671, term20671.getClass(), "next", null);
        setField(term20671, term20671.getClass(), "first", null);
        setField(term20671, term20671.getClass(), "last", null);
        setField(term20671, term20671.getClass(), "propListHead", null);
        setIntField(term20671, term20671.getClass(), "sourcePosition", 0);
        setField(term20671, term20671.getClass(), "jsType", null);
        setField(term20671, term20671.getClass(), "parent", null);
        setField(term20670, term20670.getClass(), "first", term20671);
        setField(term20670, term20670.getClass(), "last", null);
        setField(term20670, term20670.getClass(), "propListHead", null);
        setIntField(term20670, term20670.getClass(), "sourcePosition", 0);
        setField(term20670, term20670.getClass(), "jsType", null);
        setField(term20670, term20670.getClass(), "parent", null);
        term20641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20641, term20641.getClass(), "type", 61);
        setField(term20641, term20641.getClass(), "next", null);
        setIntField(term20643, term20643.getClass(), "type", 61);
        setField(term20643, term20643.getClass(), "next", null);
        setField(term20643, term20643.getClass(), "first", null);
        setField(term20643, term20643.getClass(), "last", null);
        setField(term20643, term20643.getClass(), "propListHead", null);
        setIntField(term20643, term20643.getClass(), "sourcePosition", 0);
        setField(term20643, term20643.getClass(), "jsType", null);
        setField(term20643, term20643.getClass(), "parent", null);
        setField(term20641, term20641.getClass(), "first", term20643);
        setField(term20641, term20641.getClass(), "last", null);
        setField(term20641, term20641.getClass(), "propListHead", null);
        setIntField(term20641, term20641.getClass(), "sourcePosition", 0);
        setField(term20641, term20641.getClass(), "jsType", null);
        setField(term20641, term20641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20567;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term20407, args);
        assertTrue(recursiveEquals(term20407, term20668));
        assertTrue(recursiveEquals(term20567, term20670));
        assertTrue(recursiveEquals(retValue, term20641));
    }

};


