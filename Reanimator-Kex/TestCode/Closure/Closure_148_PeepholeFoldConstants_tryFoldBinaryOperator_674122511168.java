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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31071;
     Object term31141;
     Object term31317;
     Object term31318;
     Object term31288;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31071 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31211, term31211.getClass(), "next", term31281);
        setIntField(term31211, term31211.getClass(), "type", 39);
        setField(term31141, term31141.getClass(), "first", term31211);
        setIntField(term31141, term31141.getClass(), "type", 22);
        term31317 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term31317, term31317.getClass(), "currentTraversal", null);
        term31318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31318, term31318.getClass(), "type", 22);
        setField(term31318, term31318.getClass(), "next", null);
        setIntField(term31319, term31319.getClass(), "type", 39);
        setIntField(term31320, term31320.getClass(), "type", 0);
        setField(term31320, term31320.getClass(), "next", null);
        setField(term31320, term31320.getClass(), "first", null);
        setField(term31320, term31320.getClass(), "last", null);
        setField(term31320, term31320.getClass(), "propListHead", null);
        setIntField(term31320, term31320.getClass(), "sourcePosition", 0);
        setField(term31320, term31320.getClass(), "jsType", null);
        setField(term31320, term31320.getClass(), "parent", null);
        setField(term31319, term31319.getClass(), "next", term31320);
        setField(term31319, term31319.getClass(), "first", null);
        setField(term31319, term31319.getClass(), "last", null);
        setField(term31319, term31319.getClass(), "propListHead", null);
        setIntField(term31319, term31319.getClass(), "sourcePosition", 0);
        setField(term31319, term31319.getClass(), "jsType", null);
        setField(term31319, term31319.getClass(), "parent", null);
        setField(term31318, term31318.getClass(), "first", term31319);
        setField(term31318, term31318.getClass(), "last", null);
        setField(term31318, term31318.getClass(), "propListHead", null);
        setIntField(term31318, term31318.getClass(), "sourcePosition", 0);
        setField(term31318, term31318.getClass(), "jsType", null);
        setField(term31318, term31318.getClass(), "parent", null);
        term31288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31288, term31288.getClass(), "type", 22);
        setField(term31288, term31288.getClass(), "next", null);
        setIntField(term31290, term31290.getClass(), "type", 39);
        setIntField(term31292, term31292.getClass(), "type", 0);
        setField(term31292, term31292.getClass(), "next", null);
        setField(term31292, term31292.getClass(), "first", null);
        setField(term31292, term31292.getClass(), "last", null);
        setField(term31292, term31292.getClass(), "propListHead", null);
        setIntField(term31292, term31292.getClass(), "sourcePosition", 0);
        setField(term31292, term31292.getClass(), "jsType", null);
        setField(term31292, term31292.getClass(), "parent", null);
        setField(term31290, term31290.getClass(), "next", term31292);
        setField(term31290, term31290.getClass(), "first", null);
        setField(term31290, term31290.getClass(), "last", null);
        setField(term31290, term31290.getClass(), "propListHead", null);
        setIntField(term31290, term31290.getClass(), "sourcePosition", 0);
        setField(term31290, term31290.getClass(), "jsType", null);
        setField(term31290, term31290.getClass(), "parent", null);
        setField(term31288, term31288.getClass(), "first", term31290);
        setField(term31288, term31288.getClass(), "last", null);
        setField(term31288, term31288.getClass(), "propListHead", null);
        setIntField(term31288, term31288.getClass(), "sourcePosition", 0);
        setField(term31288, term31288.getClass(), "jsType", null);
        setField(term31288, term31288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31141;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term31071, args);
        assertTrue(recursiveEquals(term31071, term31317));
        assertTrue(recursiveEquals(term31141, term31318));
        assertTrue(recursiveEquals(retValue, term31288));
    }

};


