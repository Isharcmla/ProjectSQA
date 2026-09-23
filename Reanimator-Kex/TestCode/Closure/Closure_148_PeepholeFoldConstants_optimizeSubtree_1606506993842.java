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

public class PeepholeFoldConstants_optimizeSubtree_1606506993842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192174;
     Object term192244;
     Object term192262;
     Object term192263;
     Object term192246;

    public PeepholeFoldConstants_optimizeSubtree_1606506993842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term192244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192244, term192244.getClass(), "type", 30);
        setField(term192244, term192244.getClass(), "first", term192244);
        setField(term192244, term192244.getClass(), "next", term192244);
        term192262 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term192262, term192262.getClass(), "currentTraversal", null);
        term192263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192263, term192263.getClass(), "type", 30);
        setField(term192263, term192263.getClass(), "next", term192263);
        setField(term192263, term192263.getClass(), "first", term192263);
        setField(term192263, term192263.getClass(), "last", null);
        setField(term192263, term192263.getClass(), "propListHead", null);
        setIntField(term192263, term192263.getClass(), "sourcePosition", 0);
        setField(term192263, term192263.getClass(), "jsType", null);
        setField(term192263, term192263.getClass(), "parent", null);
        term192246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192246, term192246.getClass(), "type", 30);
        setField(term192246, term192246.getClass(), "next", term192246);
        setField(term192246, term192246.getClass(), "first", term192246);
        setField(term192246, term192246.getClass(), "last", null);
        setField(term192246, term192246.getClass(), "propListHead", null);
        setIntField(term192246, term192246.getClass(), "sourcePosition", 0);
        setField(term192246, term192246.getClass(), "jsType", null);
        setField(term192246, term192246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term192244;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term192174, args);
        assertTrue(recursiveEquals(term192174, term192262));
        assertTrue(recursiveEquals(term192244, term192263));
        assertTrue(recursiveEquals(retValue, term192246));
    }

};


