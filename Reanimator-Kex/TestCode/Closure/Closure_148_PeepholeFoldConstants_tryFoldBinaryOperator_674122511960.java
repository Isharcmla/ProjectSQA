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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224132;
     Object term224224;
     Object term224516;
     Object term224517;
     Object term224482;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term224224 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term224316, term224316.getClass(), "next", term224408);
        setField(term224224, term224224.getClass(), "first", term224316);
        setIntField(term224224, term224224.getClass(), "type", 52);
        term224516 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term224516, term224516.getClass(), "currentTraversal", null);
        term224517 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224518 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224519 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term224517, term224517.getClass(), "str", null);
        setIntField(term224517, term224517.getClass(), "type", 52);
        setField(term224517, term224517.getClass(), "next", null);
        setField(term224518, term224518.getClass(), "str", null);
        setIntField(term224518, term224518.getClass(), "type", 0);
        setField(term224519, term224519.getClass(), "str", null);
        setIntField(term224519, term224519.getClass(), "type", 0);
        setField(term224519, term224519.getClass(), "next", null);
        setField(term224519, term224519.getClass(), "first", null);
        setField(term224519, term224519.getClass(), "last", null);
        setField(term224519, term224519.getClass(), "propListHead", null);
        setIntField(term224519, term224519.getClass(), "sourcePosition", 0);
        setField(term224519, term224519.getClass(), "jsType", null);
        setField(term224519, term224519.getClass(), "parent", null);
        setField(term224518, term224518.getClass(), "next", term224519);
        setField(term224518, term224518.getClass(), "first", null);
        setField(term224518, term224518.getClass(), "last", null);
        setField(term224518, term224518.getClass(), "propListHead", null);
        setIntField(term224518, term224518.getClass(), "sourcePosition", 0);
        setField(term224518, term224518.getClass(), "jsType", null);
        setField(term224518, term224518.getClass(), "parent", null);
        setField(term224517, term224517.getClass(), "first", term224518);
        setField(term224517, term224517.getClass(), "last", null);
        setField(term224517, term224517.getClass(), "propListHead", null);
        setIntField(term224517, term224517.getClass(), "sourcePosition", 0);
        setField(term224517, term224517.getClass(), "jsType", null);
        setField(term224517, term224517.getClass(), "parent", null);
        term224482 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224484 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term224486 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term224482, term224482.getClass(), "str", null);
        setIntField(term224482, term224482.getClass(), "type", 52);
        setField(term224482, term224482.getClass(), "next", null);
        setField(term224484, term224484.getClass(), "str", null);
        setIntField(term224484, term224484.getClass(), "type", 0);
        setField(term224486, term224486.getClass(), "str", null);
        setIntField(term224486, term224486.getClass(), "type", 0);
        setField(term224486, term224486.getClass(), "next", null);
        setField(term224486, term224486.getClass(), "first", null);
        setField(term224486, term224486.getClass(), "last", null);
        setField(term224486, term224486.getClass(), "propListHead", null);
        setIntField(term224486, term224486.getClass(), "sourcePosition", 0);
        setField(term224486, term224486.getClass(), "jsType", null);
        setField(term224486, term224486.getClass(), "parent", null);
        setField(term224484, term224484.getClass(), "next", term224486);
        setField(term224484, term224484.getClass(), "first", null);
        setField(term224484, term224484.getClass(), "last", null);
        setField(term224484, term224484.getClass(), "propListHead", null);
        setIntField(term224484, term224484.getClass(), "sourcePosition", 0);
        setField(term224484, term224484.getClass(), "jsType", null);
        setField(term224484, term224484.getClass(), "parent", null);
        setField(term224482, term224482.getClass(), "first", term224484);
        setField(term224482, term224482.getClass(), "last", null);
        setField(term224482, term224482.getClass(), "propListHead", null);
        setIntField(term224482, term224482.getClass(), "sourcePosition", 0);
        setField(term224482, term224482.getClass(), "jsType", null);
        setField(term224482, term224482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term224224;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term224132, args);
        assertTrue(recursiveEquals(term224132, term224516));
        assertTrue(recursiveEquals(term224224, term224517));
        assertTrue(recursiveEquals(retValue, term224482));
    }

};


