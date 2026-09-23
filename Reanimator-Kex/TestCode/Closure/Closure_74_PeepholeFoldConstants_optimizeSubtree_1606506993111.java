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

public class PeepholeFoldConstants_optimizeSubtree_1606506993111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20192;
     Object term20262;
     Object term20273;
     Object term20274;
     Object term20264;

    public PeepholeFoldConstants_optimizeSubtree_1606506993111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20262, term20262.getClass(), "type", 53);
        term20273 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20273, term20273.getClass(), "currentTraversal", null);
        term20274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20274, term20274.getClass(), "type", 53);
        setField(term20274, term20274.getClass(), "next", null);
        setField(term20274, term20274.getClass(), "first", null);
        setField(term20274, term20274.getClass(), "last", null);
        setField(term20274, term20274.getClass(), "propListHead", null);
        setIntField(term20274, term20274.getClass(), "sourcePosition", 0);
        setField(term20274, term20274.getClass(), "jsType", null);
        setField(term20274, term20274.getClass(), "parent", null);
        term20264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20264, term20264.getClass(), "type", 53);
        setField(term20264, term20264.getClass(), "next", null);
        setField(term20264, term20264.getClass(), "first", null);
        setField(term20264, term20264.getClass(), "last", null);
        setField(term20264, term20264.getClass(), "propListHead", null);
        setIntField(term20264, term20264.getClass(), "sourcePosition", 0);
        setField(term20264, term20264.getClass(), "jsType", null);
        setField(term20264, term20264.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20262;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term20192, args);
        assertTrue(recursiveEquals(term20192, term20273));
        assertTrue(recursiveEquals(term20262, term20274));
        assertTrue(recursiveEquals(retValue, term20264));
    }

};


