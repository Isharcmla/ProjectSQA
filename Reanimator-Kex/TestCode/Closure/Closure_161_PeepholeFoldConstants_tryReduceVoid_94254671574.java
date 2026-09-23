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

public class PeepholeFoldConstants_tryReduceVoid_94254671574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11678;
     Object term11838;
     Object term12140;
     Object term12142;
     Object term12113;

    public PeepholeFoldConstants_tryReduceVoid_94254671574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11678 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term11768 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term11768, term11768.getClass(), "compiler", null);
        setField(term11678, term11678.getClass(), "currentTraversal", term11768);
        term11838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11908, term11908.getClass(), "type", 79);
        setField(term11838, term11838.getClass(), "first", term11908);
        setIntField(term11838, term11838.getClass(), "type", 79);
        term12140 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term12141 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term12141, term12141.getClass(), "compiler", null);
        setField(term12141, term12141.getClass(), "callback", null);
        setField(term12141, term12141.getClass(), "curNode", null);
        setField(term12141, term12141.getClass(), "scopes", null);
        setField(term12141, term12141.getClass(), "scopeRoots", null);
        setField(term12141, term12141.getClass(), "cfgs", null);
        setField(term12141, term12141.getClass(), "sourceName", null);
        setField(term12141, term12141.getClass(), "scopeCreator", null);
        setField(term12141, term12141.getClass(), "scopeCallback", null);
        setField(term12140, term12140.getClass(), "currentTraversal", term12141);
        term12142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12142, term12142.getClass(), "type", 79);
        setField(term12142, term12142.getClass(), "next", null);
        setIntField(term12143, term12143.getClass(), "type", 79);
        setField(term12143, term12143.getClass(), "next", null);
        setField(term12143, term12143.getClass(), "first", null);
        setField(term12143, term12143.getClass(), "last", null);
        setField(term12143, term12143.getClass(), "propListHead", null);
        setIntField(term12143, term12143.getClass(), "sourcePosition", 0);
        setField(term12143, term12143.getClass(), "jsType", null);
        setField(term12143, term12143.getClass(), "parent", null);
        setField(term12142, term12142.getClass(), "first", term12143);
        setField(term12142, term12142.getClass(), "last", null);
        setField(term12142, term12142.getClass(), "propListHead", null);
        setIntField(term12142, term12142.getClass(), "sourcePosition", 0);
        setField(term12142, term12142.getClass(), "jsType", null);
        setField(term12142, term12142.getClass(), "parent", null);
        term12113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12113, term12113.getClass(), "type", 79);
        setField(term12113, term12113.getClass(), "next", null);
        setIntField(term12115, term12115.getClass(), "type", 79);
        setField(term12115, term12115.getClass(), "next", null);
        setField(term12115, term12115.getClass(), "first", null);
        setField(term12115, term12115.getClass(), "last", null);
        setField(term12115, term12115.getClass(), "propListHead", null);
        setIntField(term12115, term12115.getClass(), "sourcePosition", 0);
        setField(term12115, term12115.getClass(), "jsType", null);
        setField(term12115, term12115.getClass(), "parent", null);
        setField(term12113, term12113.getClass(), "first", term12115);
        setField(term12113, term12113.getClass(), "last", null);
        setField(term12113, term12113.getClass(), "propListHead", null);
        setIntField(term12113, term12113.getClass(), "sourcePosition", 0);
        setField(term12113, term12113.getClass(), "jsType", null);
        setField(term12113, term12113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11838;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term11678, args);
        assertTrue(recursiveEquals(term11678, term12140));
        assertTrue(recursiveEquals(term11838, term12142));
        assertTrue(recursiveEquals(retValue, term12113));
    }

};


