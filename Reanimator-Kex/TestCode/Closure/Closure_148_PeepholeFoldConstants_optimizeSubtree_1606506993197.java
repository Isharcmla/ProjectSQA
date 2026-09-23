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

public class PeepholeFoldConstants_optimizeSubtree_1606506993197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37464;
     Object term37534;
     Object term37992;
     Object term37993;
     Object term37984;

    public PeepholeFoldConstants_optimizeSubtree_1606506993197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37464 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term37534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37534, term37534.getClass(), "type", 30);
        term37992 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term37992, term37992.getClass(), "currentTraversal", null);
        term37993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37993, term37993.getClass(), "type", 30);
        setField(term37993, term37993.getClass(), "next", null);
        setField(term37993, term37993.getClass(), "first", null);
        setField(term37993, term37993.getClass(), "last", null);
        setField(term37993, term37993.getClass(), "propListHead", null);
        setIntField(term37993, term37993.getClass(), "sourcePosition", 0);
        setField(term37993, term37993.getClass(), "jsType", null);
        setField(term37993, term37993.getClass(), "parent", null);
        term37984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37984, term37984.getClass(), "type", 30);
        setField(term37984, term37984.getClass(), "next", null);
        setField(term37984, term37984.getClass(), "first", null);
        setField(term37984, term37984.getClass(), "last", null);
        setField(term37984, term37984.getClass(), "propListHead", null);
        setIntField(term37984, term37984.getClass(), "sourcePosition", 0);
        setField(term37984, term37984.getClass(), "jsType", null);
        setField(term37984, term37984.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37534;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term37464, args);
        assertTrue(recursiveEquals(term37464, term37992));
        assertTrue(recursiveEquals(term37534, term37993));
        assertTrue(recursiveEquals(retValue, term37984));
    }

};


