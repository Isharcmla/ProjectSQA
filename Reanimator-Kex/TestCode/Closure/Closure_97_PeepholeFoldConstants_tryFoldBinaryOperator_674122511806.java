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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232018;
     Object term232110;
     Object term232208;
     Object term232209;
     Object term232187;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term232110 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term232110, term232110.getClass(), "first", term232110);
        setField(term232110, term232110.getClass(), "next", term232180);
        setIntField(term232110, term232110.getClass(), "type", 24);
        term232208 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term232208, term232208.getClass(), "currentTraversal", null);
        term232209 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term232209, term232209.getClass(), "str", null);
        setIntField(term232209, term232209.getClass(), "type", 24);
        setIntField(term232210, term232210.getClass(), "type", 0);
        setField(term232210, term232210.getClass(), "next", null);
        setField(term232210, term232210.getClass(), "first", null);
        setField(term232210, term232210.getClass(), "last", null);
        setField(term232210, term232210.getClass(), "propListHead", null);
        setIntField(term232210, term232210.getClass(), "sourcePosition", 0);
        setField(term232210, term232210.getClass(), "jsType", null);
        setField(term232210, term232210.getClass(), "parent", null);
        setField(term232209, term232209.getClass(), "next", term232210);
        setField(term232209, term232209.getClass(), "first", term232209);
        setField(term232209, term232209.getClass(), "last", null);
        setField(term232209, term232209.getClass(), "propListHead", null);
        setIntField(term232209, term232209.getClass(), "sourcePosition", 0);
        setField(term232209, term232209.getClass(), "jsType", null);
        setField(term232209, term232209.getClass(), "parent", null);
        term232187 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term232187, term232187.getClass(), "str", null);
        setIntField(term232187, term232187.getClass(), "type", 24);
        setIntField(term232189, term232189.getClass(), "type", 0);
        setField(term232189, term232189.getClass(), "next", null);
        setField(term232189, term232189.getClass(), "first", null);
        setField(term232189, term232189.getClass(), "last", null);
        setField(term232189, term232189.getClass(), "propListHead", null);
        setIntField(term232189, term232189.getClass(), "sourcePosition", 0);
        setField(term232189, term232189.getClass(), "jsType", null);
        setField(term232189, term232189.getClass(), "parent", null);
        setField(term232187, term232187.getClass(), "next", term232189);
        setField(term232187, term232187.getClass(), "first", term232187);
        setField(term232187, term232187.getClass(), "last", null);
        setField(term232187, term232187.getClass(), "propListHead", null);
        setIntField(term232187, term232187.getClass(), "sourcePosition", 0);
        setField(term232187, term232187.getClass(), "jsType", null);
        setField(term232187, term232187.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term232110;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term232018, args);
        assertTrue(recursiveEquals(term232018, term232208));
        assertTrue(recursiveEquals(term232110, term232209));
        assertTrue(recursiveEquals(retValue, term232187));
    }

};


