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

public class PeepholeFoldConstants_optimizeSubtree_1606506993238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38569;
     Object term38639;
     Object term39020;
     Object term39021;
     Object term39004;

    public PeepholeFoldConstants_optimizeSubtree_1606506993238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38569 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term38639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38639, term38639.getClass(), "type", 38);
        setField(term38639, term38639.getClass(), "first", term38639);
        term39020 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term39020, term39020.getClass(), "currentTraversal", null);
        term39021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39021, term39021.getClass(), "type", 38);
        setField(term39021, term39021.getClass(), "next", null);
        setField(term39021, term39021.getClass(), "first", term39021);
        setField(term39021, term39021.getClass(), "last", null);
        setField(term39021, term39021.getClass(), "propListHead", null);
        setIntField(term39021, term39021.getClass(), "sourcePosition", 0);
        setField(term39021, term39021.getClass(), "jsType", null);
        setField(term39021, term39021.getClass(), "parent", null);
        term39004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39004, term39004.getClass(), "type", 38);
        setField(term39004, term39004.getClass(), "next", null);
        setField(term39004, term39004.getClass(), "first", term39004);
        setField(term39004, term39004.getClass(), "last", null);
        setField(term39004, term39004.getClass(), "propListHead", null);
        setIntField(term39004, term39004.getClass(), "sourcePosition", 0);
        setField(term39004, term39004.getClass(), "jsType", null);
        setField(term39004, term39004.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38639;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term38569, args);
        assertTrue(recursiveEquals(term38569, term39020));
        assertTrue(recursiveEquals(term38639, term39021));
        assertTrue(recursiveEquals(retValue, term39004));
    }

};


