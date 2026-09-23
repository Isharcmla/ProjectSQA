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

public class PeepholeFoldConstants_optimizeSubtree_160650699366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10479;
     Object term10549;
     Object term10923;
     Object term10924;
     Object term10914;

    public PeepholeFoldConstants_optimizeSubtree_160650699366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10549, term10549.getClass(), "type", 45);
        term10923 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term10923, term10923.getClass(), "currentTraversal", null);
        term10924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10924, term10924.getClass(), "type", 45);
        setField(term10924, term10924.getClass(), "next", null);
        setField(term10924, term10924.getClass(), "first", null);
        setField(term10924, term10924.getClass(), "last", null);
        setField(term10924, term10924.getClass(), "propListHead", null);
        setIntField(term10924, term10924.getClass(), "sourcePosition", 0);
        setField(term10924, term10924.getClass(), "jsType", null);
        setField(term10924, term10924.getClass(), "parent", null);
        term10914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10914, term10914.getClass(), "type", 45);
        setField(term10914, term10914.getClass(), "next", null);
        setField(term10914, term10914.getClass(), "first", null);
        setField(term10914, term10914.getClass(), "last", null);
        setField(term10914, term10914.getClass(), "propListHead", null);
        setIntField(term10914, term10914.getClass(), "sourcePosition", 0);
        setField(term10914, term10914.getClass(), "jsType", null);
        setField(term10914, term10914.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10549;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term10479, args);
        assertTrue(recursiveEquals(term10479, term10923));
        assertTrue(recursiveEquals(term10549, term10924));
        assertTrue(recursiveEquals(retValue, term10914));
    }

};


