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

public class PeepholeFoldConstants_optimizeSubtree_160650699359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10322;
     Object term10392;
     Object term10603;
     Object term10604;
     Object term10595;

    public PeepholeFoldConstants_optimizeSubtree_160650699359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10392, term10392.getClass(), "type", 1725571209);
        setField(term10392, term10392.getClass(), "first", null);
        term10603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term10603, term10603.getClass(), "currentTraversal", null);
        term10604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10604, term10604.getClass(), "type", 1725571209);
        setField(term10604, term10604.getClass(), "next", null);
        setField(term10604, term10604.getClass(), "first", null);
        setField(term10604, term10604.getClass(), "last", null);
        setField(term10604, term10604.getClass(), "propListHead", null);
        setIntField(term10604, term10604.getClass(), "sourcePosition", 0);
        setField(term10604, term10604.getClass(), "jsType", null);
        setField(term10604, term10604.getClass(), "parent", null);
        term10595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10595, term10595.getClass(), "type", 1725571209);
        setField(term10595, term10595.getClass(), "next", null);
        setField(term10595, term10595.getClass(), "first", null);
        setField(term10595, term10595.getClass(), "last", null);
        setField(term10595, term10595.getClass(), "propListHead", null);
        setIntField(term10595, term10595.getClass(), "sourcePosition", 0);
        setField(term10595, term10595.getClass(), "jsType", null);
        setField(term10595, term10595.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10392;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term10322, args);
        assertTrue(recursiveEquals(term10322, term10603));
        assertTrue(recursiveEquals(term10392, term10604));
        assertTrue(recursiveEquals(retValue, term10595));
    }

};


