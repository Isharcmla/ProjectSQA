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

public class PeepholeFoldConstants_optimizeSubtree_1606506993166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27361;
     Object term27431;
     Object term27632;
     Object term27633;
     Object term27623;

    public PeepholeFoldConstants_optimizeSubtree_1606506993166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term27431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27431, term27431.getClass(), "type", 49);
        term27632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term27632, term27632.getClass(), "currentTraversal", null);
        term27633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27633, term27633.getClass(), "type", 49);
        setField(term27633, term27633.getClass(), "next", null);
        setField(term27633, term27633.getClass(), "first", null);
        setField(term27633, term27633.getClass(), "last", null);
        setField(term27633, term27633.getClass(), "propListHead", null);
        setIntField(term27633, term27633.getClass(), "sourcePosition", 0);
        setField(term27633, term27633.getClass(), "jsType", null);
        setField(term27633, term27633.getClass(), "parent", null);
        term27623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27623, term27623.getClass(), "type", 49);
        setField(term27623, term27623.getClass(), "next", null);
        setField(term27623, term27623.getClass(), "first", null);
        setField(term27623, term27623.getClass(), "last", null);
        setField(term27623, term27623.getClass(), "propListHead", null);
        setIntField(term27623, term27623.getClass(), "sourcePosition", 0);
        setField(term27623, term27623.getClass(), "jsType", null);
        setField(term27623, term27623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27431;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term27361, args);
        assertTrue(recursiveEquals(term27361, term27632));
        assertTrue(recursiveEquals(term27431, term27633));
        assertTrue(recursiveEquals(retValue, term27623));
    }

};


