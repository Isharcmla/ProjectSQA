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

public class PeepholeFoldConstants_optimizeSubtree_1606506993142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25244;
     Object term25314;
     Object term25523;
     Object term25524;
     Object term25514;

    public PeepholeFoldConstants_optimizeSubtree_1606506993142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25244 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25314, term25314.getClass(), "type", 47);
        term25523 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25523, term25523.getClass(), "currentTraversal", null);
        term25524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25524, term25524.getClass(), "type", 47);
        setField(term25524, term25524.getClass(), "next", null);
        setField(term25524, term25524.getClass(), "first", null);
        setField(term25524, term25524.getClass(), "last", null);
        setField(term25524, term25524.getClass(), "propListHead", null);
        setIntField(term25524, term25524.getClass(), "sourcePosition", 0);
        setField(term25524, term25524.getClass(), "jsType", null);
        setField(term25524, term25524.getClass(), "parent", null);
        term25514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25514, term25514.getClass(), "type", 47);
        setField(term25514, term25514.getClass(), "next", null);
        setField(term25514, term25514.getClass(), "first", null);
        setField(term25514, term25514.getClass(), "last", null);
        setField(term25514, term25514.getClass(), "propListHead", null);
        setIntField(term25514, term25514.getClass(), "sourcePosition", 0);
        setField(term25514, term25514.getClass(), "jsType", null);
        setField(term25514, term25514.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25314;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term25244, args);
        assertTrue(recursiveEquals(term25244, term25523));
        assertTrue(recursiveEquals(term25314, term25524));
        assertTrue(recursiveEquals(retValue, term25514));
    }

};


