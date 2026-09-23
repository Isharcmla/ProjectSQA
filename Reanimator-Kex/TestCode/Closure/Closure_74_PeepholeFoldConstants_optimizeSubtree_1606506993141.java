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

public class PeepholeFoldConstants_optimizeSubtree_1606506993141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25054;
     Object term25124;
     Object term25511;
     Object term25512;
     Object term25502;

    public PeepholeFoldConstants_optimizeSubtree_1606506993141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25054 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term25124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25124, term25124.getClass(), "type", 80);
        term25511 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term25511, term25511.getClass(), "currentTraversal", null);
        term25512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25512, term25512.getClass(), "type", 80);
        setField(term25512, term25512.getClass(), "next", null);
        setField(term25512, term25512.getClass(), "first", null);
        setField(term25512, term25512.getClass(), "last", null);
        setField(term25512, term25512.getClass(), "propListHead", null);
        setIntField(term25512, term25512.getClass(), "sourcePosition", 0);
        setField(term25512, term25512.getClass(), "jsType", null);
        setField(term25512, term25512.getClass(), "parent", null);
        term25502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25502, term25502.getClass(), "type", 80);
        setField(term25502, term25502.getClass(), "next", null);
        setField(term25502, term25502.getClass(), "first", null);
        setField(term25502, term25502.getClass(), "last", null);
        setField(term25502, term25502.getClass(), "propListHead", null);
        setIntField(term25502, term25502.getClass(), "sourcePosition", 0);
        setField(term25502, term25502.getClass(), "jsType", null);
        setField(term25502, term25502.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25124;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term25054, args);
        assertTrue(recursiveEquals(term25054, term25511));
        assertTrue(recursiveEquals(term25124, term25512));
        assertTrue(recursiveEquals(retValue, term25502));
    }

};


