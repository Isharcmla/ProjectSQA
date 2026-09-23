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

public class PeepholeFoldConstants_optimizeSubtree_1606506993156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25349;
     Object term25419;
     Object term25632;
     Object term25633;
     Object term25623;

    public PeepholeFoldConstants_optimizeSubtree_1606506993156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25349 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25419, term25419.getClass(), "type", 84);
        term25632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25632, term25632.getClass(), "currentTraversal", null);
        term25633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25633, term25633.getClass(), "type", 84);
        setField(term25633, term25633.getClass(), "next", null);
        setField(term25633, term25633.getClass(), "first", null);
        setField(term25633, term25633.getClass(), "last", null);
        setField(term25633, term25633.getClass(), "propListHead", null);
        setIntField(term25633, term25633.getClass(), "sourcePosition", 0);
        setField(term25633, term25633.getClass(), "jsType", null);
        setField(term25633, term25633.getClass(), "parent", null);
        term25623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25623, term25623.getClass(), "type", 84);
        setField(term25623, term25623.getClass(), "next", null);
        setField(term25623, term25623.getClass(), "first", null);
        setField(term25623, term25623.getClass(), "last", null);
        setField(term25623, term25623.getClass(), "propListHead", null);
        setIntField(term25623, term25623.getClass(), "sourcePosition", 0);
        setField(term25623, term25623.getClass(), "jsType", null);
        setField(term25623, term25623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25419;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term25349, args);
        assertTrue(recursiveEquals(term25349, term25632));
        assertTrue(recursiveEquals(term25419, term25633));
        assertTrue(recursiveEquals(retValue, term25623));
    }

};


