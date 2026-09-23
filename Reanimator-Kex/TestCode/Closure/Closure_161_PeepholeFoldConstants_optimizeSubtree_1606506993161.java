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

public class PeepholeFoldConstants_optimizeSubtree_1606506993161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26009;
     Object term26079;
     Object term26470;
     Object term26471;
     Object term26461;

    public PeepholeFoldConstants_optimizeSubtree_1606506993161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26079, term26079.getClass(), "type", 72);
        term26470 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26470, term26470.getClass(), "currentTraversal", null);
        term26471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26471, term26471.getClass(), "type", 72);
        setField(term26471, term26471.getClass(), "next", null);
        setField(term26471, term26471.getClass(), "first", null);
        setField(term26471, term26471.getClass(), "last", null);
        setField(term26471, term26471.getClass(), "propListHead", null);
        setIntField(term26471, term26471.getClass(), "sourcePosition", 0);
        setField(term26471, term26471.getClass(), "jsType", null);
        setField(term26471, term26471.getClass(), "parent", null);
        term26461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26461, term26461.getClass(), "type", 72);
        setField(term26461, term26461.getClass(), "next", null);
        setField(term26461, term26461.getClass(), "first", null);
        setField(term26461, term26461.getClass(), "last", null);
        setField(term26461, term26461.getClass(), "propListHead", null);
        setIntField(term26461, term26461.getClass(), "sourcePosition", 0);
        setField(term26461, term26461.getClass(), "jsType", null);
        setField(term26461, term26461.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26079;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26009, args);
        assertTrue(recursiveEquals(term26009, term26470));
        assertTrue(recursiveEquals(term26079, term26471));
        assertTrue(recursiveEquals(retValue, term26461));
    }

};


