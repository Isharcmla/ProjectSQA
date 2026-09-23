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

public class PeepholeFoldConstants_optimizeSubtree_1606506993202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32947;
     Object term33017;
     Object term33218;
     Object term33219;
     Object term33209;

    public PeepholeFoldConstants_optimizeSubtree_1606506993202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32947 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term33017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33017, term33017.getClass(), "type", 13);
        term33218 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term33218, term33218.getClass(), "currentTraversal", null);
        term33219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33219, term33219.getClass(), "type", 13);
        setField(term33219, term33219.getClass(), "next", null);
        setField(term33219, term33219.getClass(), "first", null);
        setField(term33219, term33219.getClass(), "last", null);
        setField(term33219, term33219.getClass(), "propListHead", null);
        setIntField(term33219, term33219.getClass(), "sourcePosition", 0);
        setField(term33219, term33219.getClass(), "jsType", null);
        setField(term33219, term33219.getClass(), "parent", null);
        term33209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33209, term33209.getClass(), "type", 13);
        setField(term33209, term33209.getClass(), "next", null);
        setField(term33209, term33209.getClass(), "first", null);
        setField(term33209, term33209.getClass(), "last", null);
        setField(term33209, term33209.getClass(), "propListHead", null);
        setIntField(term33209, term33209.getClass(), "sourcePosition", 0);
        setField(term33209, term33209.getClass(), "jsType", null);
        setField(term33209, term33209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term33017;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term32947, args);
        assertTrue(recursiveEquals(term32947, term33218));
        assertTrue(recursiveEquals(term33017, term33219));
        assertTrue(recursiveEquals(retValue, term33209));
    }

};


