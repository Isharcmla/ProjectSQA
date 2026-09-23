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

public class PeepholeFoldConstants_optimizeSubtree_160650699389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10925;
     Object term10995;
     Object term11742;
     Object term11743;
     Object term11732;

    public PeepholeFoldConstants_optimizeSubtree_160650699389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10925 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10995, term10995.getClass(), "type", 53);
        term11742 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term11742, term11742.getClass(), "late", false);
        setField(term11742, term11742.getClass(), "compiler", null);
        term11743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11743, term11743.getClass(), "type", 53);
        setField(term11743, term11743.getClass(), "next", null);
        setField(term11743, term11743.getClass(), "first", null);
        setField(term11743, term11743.getClass(), "last", null);
        setField(term11743, term11743.getClass(), "propListHead", null);
        setIntField(term11743, term11743.getClass(), "sourcePosition", 0);
        setField(term11743, term11743.getClass(), "jsType", null);
        setField(term11743, term11743.getClass(), "parent", null);
        term11732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11732, term11732.getClass(), "type", 53);
        setField(term11732, term11732.getClass(), "next", null);
        setField(term11732, term11732.getClass(), "first", null);
        setField(term11732, term11732.getClass(), "last", null);
        setField(term11732, term11732.getClass(), "propListHead", null);
        setIntField(term11732, term11732.getClass(), "sourcePosition", 0);
        setField(term11732, term11732.getClass(), "jsType", null);
        setField(term11732, term11732.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10995;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term10925, args);
        assertTrue(recursiveEquals(term10925, term11742));
        assertTrue(recursiveEquals(term10995, term11743));
        assertTrue(recursiveEquals(retValue, term11732));
    }

};


