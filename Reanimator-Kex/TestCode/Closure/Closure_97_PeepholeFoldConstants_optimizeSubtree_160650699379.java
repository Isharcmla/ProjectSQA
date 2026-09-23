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

public class PeepholeFoldConstants_optimizeSubtree_160650699379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13671;
     Object term13741;
     Object term14229;
     Object term14230;
     Object term14217;

    public PeepholeFoldConstants_optimizeSubtree_160650699379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13671 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term13741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13741, term13741.getClass(), "type", 32);
        term14229 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term14229, term14229.getClass(), "currentTraversal", null);
        term14230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14230, term14230.getClass(), "type", 32);
        setField(term14230, term14230.getClass(), "next", null);
        setField(term14230, term14230.getClass(), "first", null);
        setField(term14230, term14230.getClass(), "last", null);
        setField(term14230, term14230.getClass(), "propListHead", null);
        setIntField(term14230, term14230.getClass(), "sourcePosition", 0);
        setField(term14230, term14230.getClass(), "jsType", null);
        setField(term14230, term14230.getClass(), "parent", null);
        term14217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14217, term14217.getClass(), "type", 32);
        setField(term14217, term14217.getClass(), "next", null);
        setField(term14217, term14217.getClass(), "first", null);
        setField(term14217, term14217.getClass(), "last", null);
        setField(term14217, term14217.getClass(), "propListHead", null);
        setIntField(term14217, term14217.getClass(), "sourcePosition", 0);
        setField(term14217, term14217.getClass(), "jsType", null);
        setField(term14217, term14217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13741;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term13671, args);
        assertTrue(recursiveEquals(term13671, term14229));
        assertTrue(recursiveEquals(term13741, term14230));
        assertTrue(recursiveEquals(retValue, term14217));
    }

};


