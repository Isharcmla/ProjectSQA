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

public class PeepholeFoldConstants_optimizeSubtree_1606506993183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29605;
     Object term29675;
     Object term29698;
     Object term29699;
     Object term29689;

    public PeepholeFoldConstants_optimizeSubtree_1606506993183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29605 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term29675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29675, term29675.getClass(), "type", 68);
        term29698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term29698, term29698.getClass(), "currentTraversal", null);
        term29699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29699, term29699.getClass(), "type", 68);
        setField(term29699, term29699.getClass(), "next", null);
        setField(term29699, term29699.getClass(), "first", null);
        setField(term29699, term29699.getClass(), "last", null);
        setField(term29699, term29699.getClass(), "propListHead", null);
        setIntField(term29699, term29699.getClass(), "sourcePosition", 0);
        setField(term29699, term29699.getClass(), "jsType", null);
        setField(term29699, term29699.getClass(), "parent", null);
        term29689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29689, term29689.getClass(), "type", 68);
        setField(term29689, term29689.getClass(), "next", null);
        setField(term29689, term29689.getClass(), "first", null);
        setField(term29689, term29689.getClass(), "last", null);
        setField(term29689, term29689.getClass(), "propListHead", null);
        setIntField(term29689, term29689.getClass(), "sourcePosition", 0);
        setField(term29689, term29689.getClass(), "jsType", null);
        setField(term29689, term29689.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term29675;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term29605, args);
        assertTrue(recursiveEquals(term29605, term29698));
        assertTrue(recursiveEquals(term29675, term29699));
        assertTrue(recursiveEquals(retValue, term29689));
    }

};


