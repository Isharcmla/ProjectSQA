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

public class PeepholeFoldConstants_tryReduceVoid_942546715283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46019;
     Object term46179;
     Object term46300;
     Object term46302;
     Object term46273;

    public PeepholeFoldConstants_tryReduceVoid_942546715283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46019 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term46109 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term46109, term46109.getClass(), "compiler", null);
        setField(term46019, term46019.getClass(), "currentTraversal", term46109);
        term46179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46249, term46249.getClass(), "type", 126);
        setField(term46179, term46179.getClass(), "first", term46249);
        setIntField(term46179, term46179.getClass(), "type", 126);
        term46300 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term46301 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term46301, term46301.getClass(), "compiler", null);
        setField(term46301, term46301.getClass(), "callback", null);
        setField(term46301, term46301.getClass(), "curNode", null);
        setField(term46301, term46301.getClass(), "scopes", null);
        setField(term46301, term46301.getClass(), "scopeRoots", null);
        setField(term46301, term46301.getClass(), "cfgs", null);
        setField(term46301, term46301.getClass(), "sourceName", null);
        setField(term46301, term46301.getClass(), "scopeCreator", null);
        setField(term46301, term46301.getClass(), "scopeCallback", null);
        setField(term46300, term46300.getClass(), "currentTraversal", term46301);
        term46302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46302, term46302.getClass(), "type", 126);
        setField(term46302, term46302.getClass(), "next", null);
        setIntField(term46303, term46303.getClass(), "type", 126);
        setField(term46303, term46303.getClass(), "next", null);
        setField(term46303, term46303.getClass(), "first", null);
        setField(term46303, term46303.getClass(), "last", null);
        setField(term46303, term46303.getClass(), "propListHead", null);
        setIntField(term46303, term46303.getClass(), "sourcePosition", 0);
        setField(term46303, term46303.getClass(), "jsType", null);
        setField(term46303, term46303.getClass(), "parent", null);
        setField(term46302, term46302.getClass(), "first", term46303);
        setField(term46302, term46302.getClass(), "last", null);
        setField(term46302, term46302.getClass(), "propListHead", null);
        setIntField(term46302, term46302.getClass(), "sourcePosition", 0);
        setField(term46302, term46302.getClass(), "jsType", null);
        setField(term46302, term46302.getClass(), "parent", null);
        term46273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46273, term46273.getClass(), "type", 126);
        setField(term46273, term46273.getClass(), "next", null);
        setIntField(term46275, term46275.getClass(), "type", 126);
        setField(term46275, term46275.getClass(), "next", null);
        setField(term46275, term46275.getClass(), "first", null);
        setField(term46275, term46275.getClass(), "last", null);
        setField(term46275, term46275.getClass(), "propListHead", null);
        setIntField(term46275, term46275.getClass(), "sourcePosition", 0);
        setField(term46275, term46275.getClass(), "jsType", null);
        setField(term46275, term46275.getClass(), "parent", null);
        setField(term46273, term46273.getClass(), "first", term46275);
        setField(term46273, term46273.getClass(), "last", null);
        setField(term46273, term46273.getClass(), "propListHead", null);
        setIntField(term46273, term46273.getClass(), "sourcePosition", 0);
        setField(term46273, term46273.getClass(), "jsType", null);
        setField(term46273, term46273.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46179;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term46019, args);
        assertTrue(recursiveEquals(term46019, term46300));
        assertTrue(recursiveEquals(term46179, term46302));
        assertTrue(recursiveEquals(retValue, term46273));
    }

};


