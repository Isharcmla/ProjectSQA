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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182558;
     Object term182650;
     Object term182780;
     Object term182781;
     Object term182733;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182558 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term182650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term182720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term182650, term182650.getClass(), "first", term182650);
        setField(term182650, term182650.getClass(), "next", term182720);
        setIntField(term182650, term182650.getClass(), "type", 100);
        term182780 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term182780, term182780.getClass(), "currentTraversal", null);
        term182781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term182782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term182781, term182781.getClass(), "str", null);
        setIntField(term182781, term182781.getClass(), "type", 100);
        setIntField(term182782, term182782.getClass(), "type", 0);
        setField(term182782, term182782.getClass(), "next", null);
        setField(term182782, term182782.getClass(), "first", null);
        setField(term182782, term182782.getClass(), "last", null);
        setField(term182782, term182782.getClass(), "propListHead", null);
        setIntField(term182782, term182782.getClass(), "sourcePosition", 0);
        setField(term182782, term182782.getClass(), "jsType", null);
        setField(term182782, term182782.getClass(), "parent", null);
        setField(term182781, term182781.getClass(), "next", term182782);
        setField(term182781, term182781.getClass(), "first", term182781);
        setField(term182781, term182781.getClass(), "last", null);
        setField(term182781, term182781.getClass(), "propListHead", null);
        setIntField(term182781, term182781.getClass(), "sourcePosition", 0);
        setField(term182781, term182781.getClass(), "jsType", null);
        setField(term182781, term182781.getClass(), "parent", null);
        term182733 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term182735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term182733, term182733.getClass(), "str", null);
        setIntField(term182733, term182733.getClass(), "type", 100);
        setIntField(term182735, term182735.getClass(), "type", 0);
        setField(term182735, term182735.getClass(), "next", null);
        setField(term182735, term182735.getClass(), "first", null);
        setField(term182735, term182735.getClass(), "last", null);
        setField(term182735, term182735.getClass(), "propListHead", null);
        setIntField(term182735, term182735.getClass(), "sourcePosition", 0);
        setField(term182735, term182735.getClass(), "jsType", null);
        setField(term182735, term182735.getClass(), "parent", null);
        setField(term182733, term182733.getClass(), "next", term182735);
        setField(term182733, term182733.getClass(), "first", term182733);
        setField(term182733, term182733.getClass(), "last", null);
        setField(term182733, term182733.getClass(), "propListHead", null);
        setIntField(term182733, term182733.getClass(), "sourcePosition", 0);
        setField(term182733, term182733.getClass(), "jsType", null);
        setField(term182733, term182733.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term182650;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term182558, args);
        assertTrue(recursiveEquals(term182558, term182780));
        assertTrue(recursiveEquals(term182650, term182781));
        assertTrue(recursiveEquals(retValue, term182733));
    }

};


