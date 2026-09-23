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

public class PeepholeFoldConstants_tryReduceVoid_94254671594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17058;
     Object term17218;
     Object term17508;
     Object term17510;
     Object term17481;

    public PeepholeFoldConstants_tryReduceVoid_94254671594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17058 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17148 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term17148, term17148.getClass(), "compiler", null);
        setField(term17058, term17058.getClass(), "currentTraversal", term17148);
        term17218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17288, term17288.getClass(), "type", 129);
        setField(term17218, term17218.getClass(), "first", term17288);
        setIntField(term17218, term17218.getClass(), "type", 129);
        term17508 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term17509 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term17509, term17509.getClass(), "compiler", null);
        setField(term17509, term17509.getClass(), "callback", null);
        setField(term17509, term17509.getClass(), "curNode", null);
        setField(term17509, term17509.getClass(), "scopes", null);
        setField(term17509, term17509.getClass(), "scopeRoots", null);
        setField(term17509, term17509.getClass(), "cfgs", null);
        setField(term17509, term17509.getClass(), "sourceName", null);
        setField(term17509, term17509.getClass(), "scopeCreator", null);
        setField(term17509, term17509.getClass(), "scopeCallback", null);
        setField(term17508, term17508.getClass(), "currentTraversal", term17509);
        term17510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17510, term17510.getClass(), "type", 129);
        setField(term17510, term17510.getClass(), "next", null);
        setIntField(term17511, term17511.getClass(), "type", 129);
        setField(term17511, term17511.getClass(), "next", null);
        setField(term17511, term17511.getClass(), "first", null);
        setField(term17511, term17511.getClass(), "last", null);
        setField(term17511, term17511.getClass(), "propListHead", null);
        setIntField(term17511, term17511.getClass(), "sourcePosition", 0);
        setField(term17511, term17511.getClass(), "jsType", null);
        setField(term17511, term17511.getClass(), "parent", null);
        setField(term17510, term17510.getClass(), "first", term17511);
        setField(term17510, term17510.getClass(), "last", null);
        setField(term17510, term17510.getClass(), "propListHead", null);
        setIntField(term17510, term17510.getClass(), "sourcePosition", 0);
        setField(term17510, term17510.getClass(), "jsType", null);
        setField(term17510, term17510.getClass(), "parent", null);
        term17481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17481, term17481.getClass(), "type", 129);
        setField(term17481, term17481.getClass(), "next", null);
        setIntField(term17483, term17483.getClass(), "type", 129);
        setField(term17483, term17483.getClass(), "next", null);
        setField(term17483, term17483.getClass(), "first", null);
        setField(term17483, term17483.getClass(), "last", null);
        setField(term17483, term17483.getClass(), "propListHead", null);
        setIntField(term17483, term17483.getClass(), "sourcePosition", 0);
        setField(term17483, term17483.getClass(), "jsType", null);
        setField(term17483, term17483.getClass(), "parent", null);
        setField(term17481, term17481.getClass(), "first", term17483);
        setField(term17481, term17481.getClass(), "last", null);
        setField(term17481, term17481.getClass(), "propListHead", null);
        setIntField(term17481, term17481.getClass(), "sourcePosition", 0);
        setField(term17481, term17481.getClass(), "jsType", null);
        setField(term17481, term17481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17218;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term17058, args);
        assertTrue(recursiveEquals(term17058, term17508));
        assertTrue(recursiveEquals(term17218, term17510));
        assertTrue(recursiveEquals(retValue, term17481));
    }

};


