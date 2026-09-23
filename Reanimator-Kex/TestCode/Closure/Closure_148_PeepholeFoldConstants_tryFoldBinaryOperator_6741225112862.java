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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833225;
     Object term833317;
     Object term833763;
     Object term833764;
     Object term833721;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term833225 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term833317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833501 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term833409, term833409.getClass(), "next", term833501);
        setIntField(term833409, term833409.getClass(), "type", 39);
        setField(term833317, term833317.getClass(), "first", term833409);
        setIntField(term833317, term833317.getClass(), "type", 9);
        term833763 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term833763, term833763.getClass(), "currentTraversal", null);
        term833764 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833765 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833766 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term833764, term833764.getClass(), "number", 0.0);
        setIntField(term833764, term833764.getClass(), "type", 9);
        setField(term833764, term833764.getClass(), "next", null);
        setDoubleField(term833765, term833765.getClass(), "number", 0.0);
        setIntField(term833765, term833765.getClass(), "type", 39);
        setDoubleField(term833766, term833766.getClass(), "number", 0.0);
        setIntField(term833766, term833766.getClass(), "type", 0);
        setField(term833766, term833766.getClass(), "next", null);
        setField(term833766, term833766.getClass(), "first", null);
        setField(term833766, term833766.getClass(), "last", null);
        setField(term833766, term833766.getClass(), "propListHead", null);
        setIntField(term833766, term833766.getClass(), "sourcePosition", 0);
        setField(term833766, term833766.getClass(), "jsType", null);
        setField(term833766, term833766.getClass(), "parent", null);
        setField(term833765, term833765.getClass(), "next", term833766);
        setField(term833765, term833765.getClass(), "first", null);
        setField(term833765, term833765.getClass(), "last", null);
        setField(term833765, term833765.getClass(), "propListHead", null);
        setIntField(term833765, term833765.getClass(), "sourcePosition", 0);
        setField(term833765, term833765.getClass(), "jsType", null);
        setField(term833765, term833765.getClass(), "parent", null);
        setField(term833764, term833764.getClass(), "first", term833765);
        setField(term833764, term833764.getClass(), "last", null);
        setField(term833764, term833764.getClass(), "propListHead", null);
        setIntField(term833764, term833764.getClass(), "sourcePosition", 0);
        setField(term833764, term833764.getClass(), "jsType", null);
        setField(term833764, term833764.getClass(), "parent", null);
        term833721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833724 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term833727 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term833721, term833721.getClass(), "number", 0.0);
        setIntField(term833721, term833721.getClass(), "type", 9);
        setField(term833721, term833721.getClass(), "next", null);
        setDoubleField(term833724, term833724.getClass(), "number", 0.0);
        setIntField(term833724, term833724.getClass(), "type", 39);
        setDoubleField(term833727, term833727.getClass(), "number", 0.0);
        setIntField(term833727, term833727.getClass(), "type", 0);
        setField(term833727, term833727.getClass(), "next", null);
        setField(term833727, term833727.getClass(), "first", null);
        setField(term833727, term833727.getClass(), "last", null);
        setField(term833727, term833727.getClass(), "propListHead", null);
        setIntField(term833727, term833727.getClass(), "sourcePosition", 0);
        setField(term833727, term833727.getClass(), "jsType", null);
        setField(term833727, term833727.getClass(), "parent", null);
        setField(term833724, term833724.getClass(), "next", term833727);
        setField(term833724, term833724.getClass(), "first", null);
        setField(term833724, term833724.getClass(), "last", null);
        setField(term833724, term833724.getClass(), "propListHead", null);
        setIntField(term833724, term833724.getClass(), "sourcePosition", 0);
        setField(term833724, term833724.getClass(), "jsType", null);
        setField(term833724, term833724.getClass(), "parent", null);
        setField(term833721, term833721.getClass(), "first", term833724);
        setField(term833721, term833721.getClass(), "last", null);
        setField(term833721, term833721.getClass(), "propListHead", null);
        setIntField(term833721, term833721.getClass(), "sourcePosition", 0);
        setField(term833721, term833721.getClass(), "jsType", null);
        setField(term833721, term833721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term833317;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term833225, args);
        assertTrue(recursiveEquals(term833225, term833763));
        assertTrue(recursiveEquals(term833317, term833764));
        assertTrue(recursiveEquals(retValue, term833721));
    }

};


