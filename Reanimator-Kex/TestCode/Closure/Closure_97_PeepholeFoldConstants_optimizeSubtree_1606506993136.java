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

public class PeepholeFoldConstants_optimizeSubtree_1606506993136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26396;
     Object term26466;
     Object term26476;
     Object term26477;
     Object term26468;

    public PeepholeFoldConstants_optimizeSubtree_1606506993136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26396 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26466, term26466.getClass(), "type", 34);
        term26476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26476, term26476.getClass(), "currentTraversal", null);
        term26477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26477, term26477.getClass(), "type", 34);
        setField(term26477, term26477.getClass(), "next", null);
        setField(term26477, term26477.getClass(), "first", null);
        setField(term26477, term26477.getClass(), "last", null);
        setField(term26477, term26477.getClass(), "propListHead", null);
        setIntField(term26477, term26477.getClass(), "sourcePosition", 0);
        setField(term26477, term26477.getClass(), "jsType", null);
        setField(term26477, term26477.getClass(), "parent", null);
        term26468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26468, term26468.getClass(), "type", 34);
        setField(term26468, term26468.getClass(), "next", null);
        setField(term26468, term26468.getClass(), "first", null);
        setField(term26468, term26468.getClass(), "last", null);
        setField(term26468, term26468.getClass(), "propListHead", null);
        setIntField(term26468, term26468.getClass(), "sourcePosition", 0);
        setField(term26468, term26468.getClass(), "jsType", null);
        setField(term26468, term26468.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26466;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26396, args);
        assertTrue(recursiveEquals(term26396, term26476));
        assertTrue(recursiveEquals(term26466, term26477));
        assertTrue(recursiveEquals(retValue, term26468));
    }

};


