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

public class PeepholeFoldConstants_optimizeSubtree_160650699358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10132;
     Object term10202;
     Object term10592;
     Object term10593;
     Object term10584;

    public PeepholeFoldConstants_optimizeSubtree_160650699358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term10202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10202, term10202.getClass(), "type", 35);
        term10592 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term10592, term10592.getClass(), "currentTraversal", null);
        term10593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10593, term10593.getClass(), "type", 35);
        setField(term10593, term10593.getClass(), "next", null);
        setField(term10593, term10593.getClass(), "first", null);
        setField(term10593, term10593.getClass(), "last", null);
        setField(term10593, term10593.getClass(), "propListHead", null);
        setIntField(term10593, term10593.getClass(), "sourcePosition", 0);
        setField(term10593, term10593.getClass(), "jsType", null);
        setField(term10593, term10593.getClass(), "parent", null);
        term10584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10584, term10584.getClass(), "type", 35);
        setField(term10584, term10584.getClass(), "next", null);
        setField(term10584, term10584.getClass(), "first", null);
        setField(term10584, term10584.getClass(), "last", null);
        setField(term10584, term10584.getClass(), "propListHead", null);
        setIntField(term10584, term10584.getClass(), "sourcePosition", 0);
        setField(term10584, term10584.getClass(), "jsType", null);
        setField(term10584, term10584.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10202;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term10132, args);
        assertTrue(recursiveEquals(term10132, term10592));
        assertTrue(recursiveEquals(term10202, term10593));
        assertTrue(recursiveEquals(retValue, term10584));
    }

};


