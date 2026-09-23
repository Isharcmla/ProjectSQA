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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104124;
     Object term104216;
     Object term104817;
     Object term104818;
     Object term104789;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104124 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term104216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104308 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term104216, term104216.getClass(), "first", term104216);
        setField(term104216, term104216.getClass(), "next", term104308);
        setIntField(term104216, term104216.getClass(), "type", 33);
        term104817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term104817, term104817.getClass(), "currentTraversal", null);
        term104818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104819 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term104818, term104818.getClass(), "str", null);
        setIntField(term104818, term104818.getClass(), "type", 33);
        setDoubleField(term104819, term104819.getClass(), "number", 0.0);
        setIntField(term104819, term104819.getClass(), "type", 0);
        setField(term104819, term104819.getClass(), "next", null);
        setField(term104819, term104819.getClass(), "first", null);
        setField(term104819, term104819.getClass(), "last", null);
        setField(term104819, term104819.getClass(), "propListHead", null);
        setIntField(term104819, term104819.getClass(), "sourcePosition", 0);
        setField(term104819, term104819.getClass(), "jsType", null);
        setField(term104819, term104819.getClass(), "parent", null);
        setField(term104818, term104818.getClass(), "next", term104819);
        setField(term104818, term104818.getClass(), "first", term104818);
        setField(term104818, term104818.getClass(), "last", null);
        setField(term104818, term104818.getClass(), "propListHead", null);
        setIntField(term104818, term104818.getClass(), "sourcePosition", 0);
        setField(term104818, term104818.getClass(), "jsType", null);
        setField(term104818, term104818.getClass(), "parent", null);
        term104789 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term104791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term104789, term104789.getClass(), "str", null);
        setIntField(term104789, term104789.getClass(), "type", 33);
        setDoubleField(term104791, term104791.getClass(), "number", 0.0);
        setIntField(term104791, term104791.getClass(), "type", 0);
        setField(term104791, term104791.getClass(), "next", null);
        setField(term104791, term104791.getClass(), "first", null);
        setField(term104791, term104791.getClass(), "last", null);
        setField(term104791, term104791.getClass(), "propListHead", null);
        setIntField(term104791, term104791.getClass(), "sourcePosition", 0);
        setField(term104791, term104791.getClass(), "jsType", null);
        setField(term104791, term104791.getClass(), "parent", null);
        setField(term104789, term104789.getClass(), "next", term104791);
        setField(term104789, term104789.getClass(), "first", term104789);
        setField(term104789, term104789.getClass(), "last", null);
        setField(term104789, term104789.getClass(), "propListHead", null);
        setIntField(term104789, term104789.getClass(), "sourcePosition", 0);
        setField(term104789, term104789.getClass(), "jsType", null);
        setField(term104789, term104789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term104216;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term104124, args);
        assertTrue(recursiveEquals(term104124, term104817));
        assertTrue(recursiveEquals(term104216, term104818));
        assertTrue(recursiveEquals(retValue, term104789));
    }

};


