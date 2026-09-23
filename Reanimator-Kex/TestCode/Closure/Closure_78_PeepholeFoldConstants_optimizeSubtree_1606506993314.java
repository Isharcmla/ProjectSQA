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

public class PeepholeFoldConstants_optimizeSubtree_1606506993314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48509;
     Object term48579;
     Object term62883;
     Object term62884;
     Object term62874;

    public PeepholeFoldConstants_optimizeSubtree_1606506993314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48579, term48579.getClass(), "type", 17);
        term62883 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62883, term62883.getClass(), "currentTraversal", null);
        term62884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62884, term62884.getClass(), "type", 17);
        setField(term62884, term62884.getClass(), "next", null);
        setField(term62884, term62884.getClass(), "first", null);
        setField(term62884, term62884.getClass(), "last", null);
        setField(term62884, term62884.getClass(), "propListHead", null);
        setIntField(term62884, term62884.getClass(), "sourcePosition", 0);
        setField(term62884, term62884.getClass(), "jsType", null);
        setField(term62884, term62884.getClass(), "parent", null);
        term62874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62874, term62874.getClass(), "type", 17);
        setField(term62874, term62874.getClass(), "next", null);
        setField(term62874, term62874.getClass(), "first", null);
        setField(term62874, term62874.getClass(), "last", null);
        setField(term62874, term62874.getClass(), "propListHead", null);
        setIntField(term62874, term62874.getClass(), "sourcePosition", 0);
        setField(term62874, term62874.getClass(), "jsType", null);
        setField(term62874, term62874.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48579;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term48509, args);
        assertTrue(recursiveEquals(term48509, term62883));
        assertTrue(recursiveEquals(term48579, term62884));
        assertTrue(recursiveEquals(retValue, term62874));
    }

};


