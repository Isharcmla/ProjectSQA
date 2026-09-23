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

public class PeepholeFoldConstants_optimizeSubtree_160650699347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8376;
     Object term8446;
     Object term8653;
     Object term8654;
     Object term8637;

    public PeepholeFoldConstants_optimizeSubtree_160650699347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8376 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term8446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8446, term8446.getClass(), "type", 1725571209);
        setField(term8446, term8446.getClass(), "first", term8446);
        setField(term8446, term8446.getClass(), "next", term8446);
        term8653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term8653, term8653.getClass(), "currentTraversal", null);
        term8654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8654, term8654.getClass(), "type", 1725571209);
        setField(term8654, term8654.getClass(), "next", term8654);
        setField(term8654, term8654.getClass(), "first", term8654);
        setField(term8654, term8654.getClass(), "last", null);
        setField(term8654, term8654.getClass(), "propListHead", null);
        setIntField(term8654, term8654.getClass(), "sourcePosition", 0);
        setField(term8654, term8654.getClass(), "jsType", null);
        setField(term8654, term8654.getClass(), "parent", null);
        term8637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8637, term8637.getClass(), "type", 1725571209);
        setField(term8637, term8637.getClass(), "next", term8637);
        setField(term8637, term8637.getClass(), "first", term8637);
        setField(term8637, term8637.getClass(), "last", null);
        setField(term8637, term8637.getClass(), "propListHead", null);
        setIntField(term8637, term8637.getClass(), "sourcePosition", 0);
        setField(term8637, term8637.getClass(), "jsType", null);
        setField(term8637, term8637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8446;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term8376, args);
        assertTrue(recursiveEquals(term8376, term8653));
        assertTrue(recursiveEquals(term8446, term8654));
        assertTrue(recursiveEquals(retValue, term8637));
    }

};


