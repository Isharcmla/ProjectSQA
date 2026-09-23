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

public class PeepholeFoldConstants_optimizeSubtree_1606506993182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29415;
     Object term29485;
     Object term29686;
     Object term29687;
     Object term29677;

    public PeepholeFoldConstants_optimizeSubtree_1606506993182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29415 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29485, term29485.getClass(), "type", 75);
        term29686 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29686, term29686.getClass(), "currentTraversal", null);
        term29687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29687, term29687.getClass(), "type", 75);
        setField(term29687, term29687.getClass(), "next", null);
        setField(term29687, term29687.getClass(), "first", null);
        setField(term29687, term29687.getClass(), "last", null);
        setField(term29687, term29687.getClass(), "propListHead", null);
        setIntField(term29687, term29687.getClass(), "sourcePosition", 0);
        setField(term29687, term29687.getClass(), "jsType", null);
        setField(term29687, term29687.getClass(), "parent", null);
        term29677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29677, term29677.getClass(), "type", 75);
        setField(term29677, term29677.getClass(), "next", null);
        setField(term29677, term29677.getClass(), "first", null);
        setField(term29677, term29677.getClass(), "last", null);
        setField(term29677, term29677.getClass(), "propListHead", null);
        setIntField(term29677, term29677.getClass(), "sourcePosition", 0);
        setField(term29677, term29677.getClass(), "jsType", null);
        setField(term29677, term29677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29485;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29415, args);
        assertTrue(recursiveEquals(term29415, term29686));
        assertTrue(recursiveEquals(term29485, term29687));
        assertTrue(recursiveEquals(retValue, term29677));
    }

};


