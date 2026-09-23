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

public class PeepholeFoldConstants_optimizeSubtree_16065069931612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624557;
     Object term624649;
     Object term651275;
     Object term651276;
     Object term651250;

    public PeepholeFoldConstants_optimizeSubtree_16065069931612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term624649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term624649, term624649.getClass(), "type", 37);
        term651275 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term651275, term651275.getClass(), "currentTraversal", null);
        term651276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term651276, term651276.getClass(), "number", 0.0);
        setIntField(term651276, term651276.getClass(), "type", 37);
        setField(term651276, term651276.getClass(), "next", null);
        setField(term651276, term651276.getClass(), "first", null);
        setField(term651276, term651276.getClass(), "last", null);
        setField(term651276, term651276.getClass(), "propListHead", null);
        setIntField(term651276, term651276.getClass(), "sourcePosition", 0);
        setField(term651276, term651276.getClass(), "jsType", null);
        setField(term651276, term651276.getClass(), "parent", null);
        term651250 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term651250, term651250.getClass(), "number", 0.0);
        setIntField(term651250, term651250.getClass(), "type", 37);
        setField(term651250, term651250.getClass(), "next", null);
        setField(term651250, term651250.getClass(), "first", null);
        setField(term651250, term651250.getClass(), "last", null);
        setField(term651250, term651250.getClass(), "propListHead", null);
        setIntField(term651250, term651250.getClass(), "sourcePosition", 0);
        setField(term651250, term651250.getClass(), "jsType", null);
        setField(term651250, term651250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term624649;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term624557, args);
        assertTrue(recursiveEquals(term624557, term651275));
        assertTrue(recursiveEquals(term624649, term651276));
        assertTrue(recursiveEquals(retValue, term651250));
    }

};


