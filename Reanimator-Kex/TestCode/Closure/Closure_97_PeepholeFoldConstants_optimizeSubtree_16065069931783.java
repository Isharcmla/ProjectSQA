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

public class PeepholeFoldConstants_optimizeSubtree_16065069931783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696157;
     Object term696249;
     Object term696649;
     Object term696650;
     Object term696628;

    public PeepholeFoldConstants_optimizeSubtree_16065069931783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696157 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term696249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term696249, term696249.getClass(), "type", 37);
        term696649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term696649, term696649.getClass(), "currentTraversal", null);
        term696650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term696650, term696650.getClass(), "str", null);
        setIntField(term696650, term696650.getClass(), "type", 37);
        setField(term696650, term696650.getClass(), "next", null);
        setField(term696650, term696650.getClass(), "first", null);
        setField(term696650, term696650.getClass(), "last", null);
        setField(term696650, term696650.getClass(), "propListHead", null);
        setIntField(term696650, term696650.getClass(), "sourcePosition", 0);
        setField(term696650, term696650.getClass(), "jsType", null);
        setField(term696650, term696650.getClass(), "parent", null);
        term696628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term696628, term696628.getClass(), "str", null);
        setIntField(term696628, term696628.getClass(), "type", 37);
        setField(term696628, term696628.getClass(), "next", null);
        setField(term696628, term696628.getClass(), "first", null);
        setField(term696628, term696628.getClass(), "last", null);
        setField(term696628, term696628.getClass(), "propListHead", null);
        setIntField(term696628, term696628.getClass(), "sourcePosition", 0);
        setField(term696628, term696628.getClass(), "jsType", null);
        setField(term696628, term696628.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term696249;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term696157, args);
        assertTrue(recursiveEquals(term696157, term696649));
        assertTrue(recursiveEquals(term696249, term696650));
        assertTrue(recursiveEquals(retValue, term696628));
    }

};


