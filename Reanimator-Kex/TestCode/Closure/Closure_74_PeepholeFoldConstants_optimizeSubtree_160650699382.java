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

public class PeepholeFoldConstants_optimizeSubtree_160650699382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14572;
     Object term14642;
     Object term15099;
     Object term15100;
     Object term15090;

    public PeepholeFoldConstants_optimizeSubtree_160650699382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14572 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term14642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14642, term14642.getClass(), "type", 43);
        term15099 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15099, term15099.getClass(), "currentTraversal", null);
        term15100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15100, term15100.getClass(), "type", 43);
        setField(term15100, term15100.getClass(), "next", null);
        setField(term15100, term15100.getClass(), "first", null);
        setField(term15100, term15100.getClass(), "last", null);
        setField(term15100, term15100.getClass(), "propListHead", null);
        setIntField(term15100, term15100.getClass(), "sourcePosition", 0);
        setField(term15100, term15100.getClass(), "jsType", null);
        setField(term15100, term15100.getClass(), "parent", null);
        term15090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15090, term15090.getClass(), "type", 43);
        setField(term15090, term15090.getClass(), "next", null);
        setField(term15090, term15090.getClass(), "first", null);
        setField(term15090, term15090.getClass(), "last", null);
        setField(term15090, term15090.getClass(), "propListHead", null);
        setIntField(term15090, term15090.getClass(), "sourcePosition", 0);
        setField(term15090, term15090.getClass(), "jsType", null);
        setField(term15090, term15090.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14642;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term14572, args);
        assertTrue(recursiveEquals(term14572, term15099));
        assertTrue(recursiveEquals(term14642, term15100));
        assertTrue(recursiveEquals(retValue, term15090));
    }

};


