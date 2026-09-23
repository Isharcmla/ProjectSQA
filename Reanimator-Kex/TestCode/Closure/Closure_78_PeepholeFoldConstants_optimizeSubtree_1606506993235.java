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

public class PeepholeFoldConstants_optimizeSubtree_1606506993235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38049;
     Object term38119;
     Object term38447;
     Object term38448;
     Object term38438;

    public PeepholeFoldConstants_optimizeSubtree_1606506993235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term38119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38119, term38119.getClass(), "type", 60);
        term38447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term38447, term38447.getClass(), "currentTraversal", null);
        term38448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38448, term38448.getClass(), "type", 60);
        setField(term38448, term38448.getClass(), "next", null);
        setField(term38448, term38448.getClass(), "first", null);
        setField(term38448, term38448.getClass(), "last", null);
        setField(term38448, term38448.getClass(), "propListHead", null);
        setIntField(term38448, term38448.getClass(), "sourcePosition", 0);
        setField(term38448, term38448.getClass(), "jsType", null);
        setField(term38448, term38448.getClass(), "parent", null);
        term38438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38438, term38438.getClass(), "type", 60);
        setField(term38438, term38438.getClass(), "next", null);
        setField(term38438, term38438.getClass(), "first", null);
        setField(term38438, term38438.getClass(), "last", null);
        setField(term38438, term38438.getClass(), "propListHead", null);
        setIntField(term38438, term38438.getClass(), "sourcePosition", 0);
        setField(term38438, term38438.getClass(), "jsType", null);
        setField(term38438, term38438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term38119;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term38049, args);
        assertTrue(recursiveEquals(term38049, term38447));
        assertTrue(recursiveEquals(term38119, term38448));
        assertTrue(recursiveEquals(retValue, term38438));
    }

};


