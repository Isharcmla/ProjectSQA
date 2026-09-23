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

public class PeepholeFoldConstants_optimizeSubtree_1606506993912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256834;
     Object term256904;
     Object term256922;
     Object term256923;
     Object term256906;

    public PeepholeFoldConstants_optimizeSubtree_1606506993912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256834 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term256904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256904, term256904.getClass(), "type", 30);
        setField(term256904, term256904.getClass(), "first", term256904);
        setField(term256904, term256904.getClass(), "next", term256904);
        term256922 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term256922, term256922.getClass(), "currentTraversal", null);
        term256923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256923, term256923.getClass(), "type", 30);
        setField(term256923, term256923.getClass(), "next", term256923);
        setField(term256923, term256923.getClass(), "first", term256923);
        setField(term256923, term256923.getClass(), "last", null);
        setField(term256923, term256923.getClass(), "propListHead", null);
        setIntField(term256923, term256923.getClass(), "sourcePosition", 0);
        setField(term256923, term256923.getClass(), "jsType", null);
        setField(term256923, term256923.getClass(), "parent", null);
        term256906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256906, term256906.getClass(), "type", 30);
        setField(term256906, term256906.getClass(), "next", term256906);
        setField(term256906, term256906.getClass(), "first", term256906);
        setField(term256906, term256906.getClass(), "last", null);
        setField(term256906, term256906.getClass(), "propListHead", null);
        setIntField(term256906, term256906.getClass(), "sourcePosition", 0);
        setField(term256906, term256906.getClass(), "jsType", null);
        setField(term256906, term256906.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term256904;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term256834, args);
        assertTrue(recursiveEquals(term256834, term256922));
        assertTrue(recursiveEquals(term256904, term256923));
        assertTrue(recursiveEquals(retValue, term256906));
    }

};


