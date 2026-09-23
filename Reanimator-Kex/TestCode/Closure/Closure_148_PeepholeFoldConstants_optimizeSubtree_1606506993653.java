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

public class PeepholeFoldConstants_optimizeSubtree_1606506993653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144118;
     Object term144188;
     Object term144625;
     Object term144626;
     Object term144613;

    public PeepholeFoldConstants_optimizeSubtree_1606506993653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144118 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term144188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144188, term144188.getClass(), "type", 32);
        term144625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term144625, term144625.getClass(), "currentTraversal", null);
        term144626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144626, term144626.getClass(), "type", 32);
        setField(term144626, term144626.getClass(), "next", null);
        setField(term144626, term144626.getClass(), "first", null);
        setField(term144626, term144626.getClass(), "last", null);
        setField(term144626, term144626.getClass(), "propListHead", null);
        setIntField(term144626, term144626.getClass(), "sourcePosition", 0);
        setField(term144626, term144626.getClass(), "jsType", null);
        setField(term144626, term144626.getClass(), "parent", null);
        term144613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144613, term144613.getClass(), "type", 32);
        setField(term144613, term144613.getClass(), "next", null);
        setField(term144613, term144613.getClass(), "first", null);
        setField(term144613, term144613.getClass(), "last", null);
        setField(term144613, term144613.getClass(), "propListHead", null);
        setIntField(term144613, term144613.getClass(), "sourcePosition", 0);
        setField(term144613, term144613.getClass(), "jsType", null);
        setField(term144613, term144613.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term144188;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term144118, args);
        assertTrue(recursiveEquals(term144118, term144625));
        assertTrue(recursiveEquals(term144188, term144626));
        assertTrue(recursiveEquals(retValue, term144613));
    }

};


