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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399571;
     Object term399663;
     Object term400806;
     Object term400807;
     Object term400770;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term399571 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term399663 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term399755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term399847 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term399755, term399755.getClass(), "next", term399847);
        setIntField(term399755, term399755.getClass(), "type", 39);
        setField(term399663, term399663.getClass(), "first", term399755);
        setIntField(term399663, term399663.getClass(), "type", 24);
        term400806 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term400806, term400806.getClass(), "currentTraversal", null);
        term400807 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term400808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term400809 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term400807, term400807.getClass(), "number", 0.0);
        setIntField(term400807, term400807.getClass(), "type", 24);
        setField(term400807, term400807.getClass(), "next", null);
        setDoubleField(term400808, term400808.getClass(), "number", 0.0);
        setIntField(term400808, term400808.getClass(), "type", 39);
        setDoubleField(term400809, term400809.getClass(), "number", 0.0);
        setIntField(term400809, term400809.getClass(), "type", 0);
        setField(term400809, term400809.getClass(), "next", null);
        setField(term400809, term400809.getClass(), "first", null);
        setField(term400809, term400809.getClass(), "last", null);
        setField(term400809, term400809.getClass(), "propListHead", null);
        setIntField(term400809, term400809.getClass(), "sourcePosition", 0);
        setField(term400809, term400809.getClass(), "jsType", null);
        setField(term400809, term400809.getClass(), "parent", null);
        setField(term400808, term400808.getClass(), "next", term400809);
        setField(term400808, term400808.getClass(), "first", null);
        setField(term400808, term400808.getClass(), "last", null);
        setField(term400808, term400808.getClass(), "propListHead", null);
        setIntField(term400808, term400808.getClass(), "sourcePosition", 0);
        setField(term400808, term400808.getClass(), "jsType", null);
        setField(term400808, term400808.getClass(), "parent", null);
        setField(term400807, term400807.getClass(), "first", term400808);
        setField(term400807, term400807.getClass(), "last", null);
        setField(term400807, term400807.getClass(), "propListHead", null);
        setIntField(term400807, term400807.getClass(), "sourcePosition", 0);
        setField(term400807, term400807.getClass(), "jsType", null);
        setField(term400807, term400807.getClass(), "parent", null);
        term400770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term400773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term400776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term400770, term400770.getClass(), "number", 0.0);
        setIntField(term400770, term400770.getClass(), "type", 24);
        setField(term400770, term400770.getClass(), "next", null);
        setDoubleField(term400773, term400773.getClass(), "number", 0.0);
        setIntField(term400773, term400773.getClass(), "type", 39);
        setDoubleField(term400776, term400776.getClass(), "number", 0.0);
        setIntField(term400776, term400776.getClass(), "type", 0);
        setField(term400776, term400776.getClass(), "next", null);
        setField(term400776, term400776.getClass(), "first", null);
        setField(term400776, term400776.getClass(), "last", null);
        setField(term400776, term400776.getClass(), "propListHead", null);
        setIntField(term400776, term400776.getClass(), "sourcePosition", 0);
        setField(term400776, term400776.getClass(), "jsType", null);
        setField(term400776, term400776.getClass(), "parent", null);
        setField(term400773, term400773.getClass(), "next", term400776);
        setField(term400773, term400773.getClass(), "first", null);
        setField(term400773, term400773.getClass(), "last", null);
        setField(term400773, term400773.getClass(), "propListHead", null);
        setIntField(term400773, term400773.getClass(), "sourcePosition", 0);
        setField(term400773, term400773.getClass(), "jsType", null);
        setField(term400773, term400773.getClass(), "parent", null);
        setField(term400770, term400770.getClass(), "first", term400773);
        setField(term400770, term400770.getClass(), "last", null);
        setField(term400770, term400770.getClass(), "propListHead", null);
        setIntField(term400770, term400770.getClass(), "sourcePosition", 0);
        setField(term400770, term400770.getClass(), "jsType", null);
        setField(term400770, term400770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term399663;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term399571, args);
        assertTrue(recursiveEquals(term399571, term400806));
        assertTrue(recursiveEquals(term399663, term400807));
        assertTrue(recursiveEquals(retValue, term400770));
    }

};


