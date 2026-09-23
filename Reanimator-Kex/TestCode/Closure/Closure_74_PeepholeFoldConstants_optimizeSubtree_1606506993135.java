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

public class PeepholeFoldConstants_optimizeSubtree_1606506993135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24009;
     Object term24079;
     Object term24643;
     Object term24644;
     Object term24634;

    public PeepholeFoldConstants_optimizeSubtree_1606506993135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24079, term24079.getClass(), "type", 17);
        term24643 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24643, term24643.getClass(), "currentTraversal", null);
        term24644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24644, term24644.getClass(), "type", 17);
        setField(term24644, term24644.getClass(), "next", null);
        setField(term24644, term24644.getClass(), "first", null);
        setField(term24644, term24644.getClass(), "last", null);
        setField(term24644, term24644.getClass(), "propListHead", null);
        setIntField(term24644, term24644.getClass(), "sourcePosition", 0);
        setField(term24644, term24644.getClass(), "jsType", null);
        setField(term24644, term24644.getClass(), "parent", null);
        term24634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24634, term24634.getClass(), "type", 17);
        setField(term24634, term24634.getClass(), "next", null);
        setField(term24634, term24634.getClass(), "first", null);
        setField(term24634, term24634.getClass(), "last", null);
        setField(term24634, term24634.getClass(), "propListHead", null);
        setIntField(term24634, term24634.getClass(), "sourcePosition", 0);
        setField(term24634, term24634.getClass(), "jsType", null);
        setField(term24634, term24634.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24079;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term24009, args);
        assertTrue(recursiveEquals(term24009, term24643));
        assertTrue(recursiveEquals(term24079, term24644));
        assertTrue(recursiveEquals(retValue, term24634));
    }

};


