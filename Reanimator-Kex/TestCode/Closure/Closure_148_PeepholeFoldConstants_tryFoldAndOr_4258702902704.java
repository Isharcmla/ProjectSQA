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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775366;
     Object term775458;
     Object term775642;
     Object term775734;
     Object term775812;
     Object term775813;
     Object term775815;
     Object term775816;
     Object term775739;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term775458 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term775550 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term775550, term775550.getClass(), "type", 114);
        setField(term775458, term775458.getClass(), "parent", term775550);
        setIntField(term775458, term775458.getClass(), "type", 0);
        term775642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term775642, term775642.getClass(), "type", 102);
        term775734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term775734, term775734.getClass(), "type", 47);
        term775812 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term775812, term775812.getClass(), "currentTraversal", null);
        term775813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term775814 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term775813, term775813.getClass(), "number", 0.0);
        setIntField(term775813, term775813.getClass(), "type", 0);
        setField(term775813, term775813.getClass(), "next", null);
        setField(term775813, term775813.getClass(), "first", null);
        setField(term775813, term775813.getClass(), "last", null);
        setField(term775813, term775813.getClass(), "propListHead", null);
        setIntField(term775813, term775813.getClass(), "sourcePosition", 0);
        setField(term775813, term775813.getClass(), "jsType", null);
        setDoubleField(term775814, term775814.getClass(), "number", 0.0);
        setIntField(term775814, term775814.getClass(), "type", 114);
        setField(term775814, term775814.getClass(), "next", null);
        setField(term775814, term775814.getClass(), "first", null);
        setField(term775814, term775814.getClass(), "last", null);
        setField(term775814, term775814.getClass(), "propListHead", null);
        setIntField(term775814, term775814.getClass(), "sourcePosition", 0);
        setField(term775814, term775814.getClass(), "jsType", null);
        setField(term775814, term775814.getClass(), "parent", null);
        setField(term775813, term775813.getClass(), "parent", term775814);
        term775815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term775815, term775815.getClass(), "number", 0.0);
        setIntField(term775815, term775815.getClass(), "type", 102);
        setField(term775815, term775815.getClass(), "next", null);
        setField(term775815, term775815.getClass(), "first", null);
        setField(term775815, term775815.getClass(), "last", null);
        setField(term775815, term775815.getClass(), "propListHead", null);
        setIntField(term775815, term775815.getClass(), "sourcePosition", 0);
        setField(term775815, term775815.getClass(), "jsType", null);
        setField(term775815, term775815.getClass(), "parent", null);
        term775816 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term775816, term775816.getClass(), "str", null);
        setIntField(term775816, term775816.getClass(), "type", 47);
        setField(term775816, term775816.getClass(), "next", null);
        setField(term775816, term775816.getClass(), "first", null);
        setField(term775816, term775816.getClass(), "last", null);
        setField(term775816, term775816.getClass(), "propListHead", null);
        setIntField(term775816, term775816.getClass(), "sourcePosition", 0);
        setField(term775816, term775816.getClass(), "jsType", null);
        setField(term775816, term775816.getClass(), "parent", null);
        term775739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term775743 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term775739, term775739.getClass(), "number", 0.0);
        setIntField(term775739, term775739.getClass(), "type", 0);
        setField(term775739, term775739.getClass(), "next", null);
        setField(term775739, term775739.getClass(), "first", null);
        setField(term775739, term775739.getClass(), "last", null);
        setField(term775739, term775739.getClass(), "propListHead", null);
        setIntField(term775739, term775739.getClass(), "sourcePosition", 0);
        setField(term775739, term775739.getClass(), "jsType", null);
        setDoubleField(term775743, term775743.getClass(), "number", 0.0);
        setIntField(term775743, term775743.getClass(), "type", 114);
        setField(term775743, term775743.getClass(), "next", null);
        setField(term775743, term775743.getClass(), "first", null);
        setField(term775743, term775743.getClass(), "last", null);
        setField(term775743, term775743.getClass(), "propListHead", null);
        setIntField(term775743, term775743.getClass(), "sourcePosition", 0);
        setField(term775743, term775743.getClass(), "jsType", null);
        setField(term775743, term775743.getClass(), "parent", null);
        setField(term775739, term775739.getClass(), "parent", term775743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term775458;
        args[1] = term775642;
        args[2] = term775734;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term775366, args);
        assertTrue(recursiveEquals(term775366, term775812));
        assertTrue(recursiveEquals(term775458, term775813));
        assertTrue(recursiveEquals(term775642, term775815));
        assertTrue(recursiveEquals(term775734, term775816));
        assertTrue(recursiveEquals(retValue, term775739));
    }

};


