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

public class PeepholeFoldConstants_optimizeSubtree_160650699348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8565;
     Object term8635;
     Object term8664;
     Object term8665;
     Object term8656;

    public PeepholeFoldConstants_optimizeSubtree_160650699348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8565 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term8635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8635, term8635.getClass(), "type", 31);
        term8664 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term8664, term8664.getClass(), "currentTraversal", null);
        term8665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8665, term8665.getClass(), "type", 31);
        setField(term8665, term8665.getClass(), "next", null);
        setField(term8665, term8665.getClass(), "first", null);
        setField(term8665, term8665.getClass(), "last", null);
        setField(term8665, term8665.getClass(), "propListHead", null);
        setIntField(term8665, term8665.getClass(), "sourcePosition", 0);
        setField(term8665, term8665.getClass(), "jsType", null);
        setField(term8665, term8665.getClass(), "parent", null);
        term8656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8656, term8656.getClass(), "type", 31);
        setField(term8656, term8656.getClass(), "next", null);
        setField(term8656, term8656.getClass(), "first", null);
        setField(term8656, term8656.getClass(), "last", null);
        setField(term8656, term8656.getClass(), "propListHead", null);
        setIntField(term8656, term8656.getClass(), "sourcePosition", 0);
        setField(term8656, term8656.getClass(), "jsType", null);
        setField(term8656, term8656.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8635;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term8565, args);
        assertTrue(recursiveEquals(term8565, term8664));
        assertTrue(recursiveEquals(term8635, term8665));
        assertTrue(recursiveEquals(retValue, term8656));
    }

};


