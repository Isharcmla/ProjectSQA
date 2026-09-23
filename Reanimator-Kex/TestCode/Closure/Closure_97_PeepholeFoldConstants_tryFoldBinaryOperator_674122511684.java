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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176584;
     Object term176676;
     Object term176784;
     Object term176785;
     Object term176754;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176584 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term176676 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term176676, term176676.getClass(), "first", term176676);
        setField(term176676, term176676.getClass(), "next", term176746);
        setIntField(term176676, term176676.getClass(), "type", 52);
        term176784 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term176784, term176784.getClass(), "currentTraversal", null);
        term176785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term176785, term176785.getClass(), "number", 0.0);
        setIntField(term176785, term176785.getClass(), "type", 52);
        setIntField(term176786, term176786.getClass(), "type", 0);
        setField(term176786, term176786.getClass(), "next", null);
        setField(term176786, term176786.getClass(), "first", null);
        setField(term176786, term176786.getClass(), "last", null);
        setField(term176786, term176786.getClass(), "propListHead", null);
        setIntField(term176786, term176786.getClass(), "sourcePosition", 0);
        setField(term176786, term176786.getClass(), "jsType", null);
        setField(term176786, term176786.getClass(), "parent", null);
        setField(term176785, term176785.getClass(), "next", term176786);
        setField(term176785, term176785.getClass(), "first", term176785);
        setField(term176785, term176785.getClass(), "last", null);
        setField(term176785, term176785.getClass(), "propListHead", null);
        setIntField(term176785, term176785.getClass(), "sourcePosition", 0);
        setField(term176785, term176785.getClass(), "jsType", null);
        setField(term176785, term176785.getClass(), "parent", null);
        term176754 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term176754, term176754.getClass(), "number", 0.0);
        setIntField(term176754, term176754.getClass(), "type", 52);
        setIntField(term176757, term176757.getClass(), "type", 0);
        setField(term176757, term176757.getClass(), "next", null);
        setField(term176757, term176757.getClass(), "first", null);
        setField(term176757, term176757.getClass(), "last", null);
        setField(term176757, term176757.getClass(), "propListHead", null);
        setIntField(term176757, term176757.getClass(), "sourcePosition", 0);
        setField(term176757, term176757.getClass(), "jsType", null);
        setField(term176757, term176757.getClass(), "parent", null);
        setField(term176754, term176754.getClass(), "next", term176757);
        setField(term176754, term176754.getClass(), "first", term176754);
        setField(term176754, term176754.getClass(), "last", null);
        setField(term176754, term176754.getClass(), "propListHead", null);
        setIntField(term176754, term176754.getClass(), "sourcePosition", 0);
        setField(term176754, term176754.getClass(), "jsType", null);
        setField(term176754, term176754.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term176676;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term176584, args);
        assertTrue(recursiveEquals(term176584, term176784));
        assertTrue(recursiveEquals(term176676, term176785));
        assertTrue(recursiveEquals(retValue, term176754));
    }

};


