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

public class PeepholeFoldConstants_tryReduceVoid_942546715307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46764;
     Object term46924;
     Object term62182;
     Object term62184;
     Object term62155;

    public PeepholeFoldConstants_tryReduceVoid_942546715307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46764 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term46854 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term46854, term46854.getClass(), "compiler", null);
        setField(term46764, term46764.getClass(), "currentTraversal", term46854);
        term46924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46994, term46994.getClass(), "type", 120);
        setField(term46924, term46924.getClass(), "first", term46994);
        setIntField(term46924, term46924.getClass(), "type", 120);
        term62182 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term62183 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term62183, term62183.getClass(), "compiler", null);
        setField(term62183, term62183.getClass(), "callback", null);
        setField(term62183, term62183.getClass(), "curNode", null);
        setField(term62183, term62183.getClass(), "scopes", null);
        setField(term62183, term62183.getClass(), "scopeRoots", null);
        setField(term62183, term62183.getClass(), "cfgs", null);
        setField(term62183, term62183.getClass(), "sourceName", null);
        setField(term62183, term62183.getClass(), "scopeCreator", null);
        setField(term62183, term62183.getClass(), "scopeCallback", null);
        setField(term62182, term62182.getClass(), "currentTraversal", term62183);
        term62184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62184, term62184.getClass(), "type", 120);
        setField(term62184, term62184.getClass(), "next", null);
        setIntField(term62185, term62185.getClass(), "type", 120);
        setField(term62185, term62185.getClass(), "next", null);
        setField(term62185, term62185.getClass(), "first", null);
        setField(term62185, term62185.getClass(), "last", null);
        setField(term62185, term62185.getClass(), "propListHead", null);
        setIntField(term62185, term62185.getClass(), "sourcePosition", 0);
        setField(term62185, term62185.getClass(), "jsType", null);
        setField(term62185, term62185.getClass(), "parent", null);
        setField(term62184, term62184.getClass(), "first", term62185);
        setField(term62184, term62184.getClass(), "last", null);
        setField(term62184, term62184.getClass(), "propListHead", null);
        setIntField(term62184, term62184.getClass(), "sourcePosition", 0);
        setField(term62184, term62184.getClass(), "jsType", null);
        setField(term62184, term62184.getClass(), "parent", null);
        term62155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62155, term62155.getClass(), "type", 120);
        setField(term62155, term62155.getClass(), "next", null);
        setIntField(term62157, term62157.getClass(), "type", 120);
        setField(term62157, term62157.getClass(), "next", null);
        setField(term62157, term62157.getClass(), "first", null);
        setField(term62157, term62157.getClass(), "last", null);
        setField(term62157, term62157.getClass(), "propListHead", null);
        setIntField(term62157, term62157.getClass(), "sourcePosition", 0);
        setField(term62157, term62157.getClass(), "jsType", null);
        setField(term62157, term62157.getClass(), "parent", null);
        setField(term62155, term62155.getClass(), "first", term62157);
        setField(term62155, term62155.getClass(), "last", null);
        setField(term62155, term62155.getClass(), "propListHead", null);
        setIntField(term62155, term62155.getClass(), "sourcePosition", 0);
        setField(term62155, term62155.getClass(), "jsType", null);
        setField(term62155, term62155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46924;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term46764, args);
        assertTrue(recursiveEquals(term46764, term62182));
        assertTrue(recursiveEquals(term46924, term62184));
        assertTrue(recursiveEquals(retValue, term62155));
    }

};


