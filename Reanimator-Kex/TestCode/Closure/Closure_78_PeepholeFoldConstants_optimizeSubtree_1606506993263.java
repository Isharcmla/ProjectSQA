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

public class PeepholeFoldConstants_optimizeSubtree_1606506993263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42752;
     Object term42822;
     Object term42841;
     Object term42842;
     Object term42824;

    public PeepholeFoldConstants_optimizeSubtree_1606506993263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42752 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term42822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42822, term42822.getClass(), "type", 56);
        setField(term42822, term42822.getClass(), "first", term42822);
        setField(term42822, term42822.getClass(), "next", term42822);
        term42841 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term42841, term42841.getClass(), "currentTraversal", null);
        term42842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42842, term42842.getClass(), "type", 56);
        setField(term42842, term42842.getClass(), "next", term42842);
        setField(term42842, term42842.getClass(), "first", term42842);
        setField(term42842, term42842.getClass(), "last", null);
        setField(term42842, term42842.getClass(), "propListHead", null);
        setIntField(term42842, term42842.getClass(), "sourcePosition", 0);
        setField(term42842, term42842.getClass(), "jsType", null);
        setField(term42842, term42842.getClass(), "parent", null);
        term42824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42824, term42824.getClass(), "type", 56);
        setField(term42824, term42824.getClass(), "next", term42824);
        setField(term42824, term42824.getClass(), "first", term42824);
        setField(term42824, term42824.getClass(), "last", null);
        setField(term42824, term42824.getClass(), "propListHead", null);
        setIntField(term42824, term42824.getClass(), "sourcePosition", 0);
        setField(term42824, term42824.getClass(), "jsType", null);
        setField(term42824, term42824.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42822;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term42752, args);
        assertTrue(recursiveEquals(term42752, term42841));
        assertTrue(recursiveEquals(term42822, term42842));
        assertTrue(recursiveEquals(retValue, term42824));
    }

};


