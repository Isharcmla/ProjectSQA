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

public class PeepholeFoldConstants_optimizeSubtree_1606506993163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26389;
     Object term26459;
     Object term26503;
     Object term26504;
     Object term26494;

    public PeepholeFoldConstants_optimizeSubtree_1606506993163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26389 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term26459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26459, term26459.getClass(), "type", 44);
        term26503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term26503, term26503.getClass(), "currentTraversal", null);
        term26504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26504, term26504.getClass(), "type", 44);
        setField(term26504, term26504.getClass(), "next", null);
        setField(term26504, term26504.getClass(), "first", null);
        setField(term26504, term26504.getClass(), "last", null);
        setField(term26504, term26504.getClass(), "propListHead", null);
        setIntField(term26504, term26504.getClass(), "sourcePosition", 0);
        setField(term26504, term26504.getClass(), "jsType", null);
        setField(term26504, term26504.getClass(), "parent", null);
        term26494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26494, term26494.getClass(), "type", 44);
        setField(term26494, term26494.getClass(), "next", null);
        setField(term26494, term26494.getClass(), "first", null);
        setField(term26494, term26494.getClass(), "last", null);
        setField(term26494, term26494.getClass(), "propListHead", null);
        setIntField(term26494, term26494.getClass(), "sourcePosition", 0);
        setField(term26494, term26494.getClass(), "jsType", null);
        setField(term26494, term26494.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26459;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term26389, args);
        assertTrue(recursiveEquals(term26389, term26503));
        assertTrue(recursiveEquals(term26459, term26504));
        assertTrue(recursiveEquals(retValue, term26494));
    }

};


