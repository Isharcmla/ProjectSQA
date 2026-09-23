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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49486;
     Object term49578;
     Object term63237;
     Object term63238;
     Object term63191;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49486 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term49578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term49670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49578, term49578.getClass(), "first", term49578);
        setField(term49578, term49578.getClass(), "next", term49670);
        setIntField(term49578, term49578.getClass(), "type", 23);
        term63237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term63237, term63237.getClass(), "currentTraversal", null);
        term63238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63239 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63238, term63238.getClass(), "str", null);
        setIntField(term63238, term63238.getClass(), "type", 23);
        setField(term63239, term63239.getClass(), "str", null);
        setIntField(term63239, term63239.getClass(), "type", 0);
        setField(term63239, term63239.getClass(), "next", null);
        setField(term63239, term63239.getClass(), "first", null);
        setField(term63239, term63239.getClass(), "last", null);
        setField(term63239, term63239.getClass(), "propListHead", null);
        setIntField(term63239, term63239.getClass(), "sourcePosition", 0);
        setField(term63239, term63239.getClass(), "jsType", null);
        setField(term63239, term63239.getClass(), "parent", null);
        setField(term63238, term63238.getClass(), "next", term63239);
        setField(term63238, term63238.getClass(), "first", term63238);
        setField(term63238, term63238.getClass(), "last", null);
        setField(term63238, term63238.getClass(), "propListHead", null);
        setIntField(term63238, term63238.getClass(), "sourcePosition", 0);
        setField(term63238, term63238.getClass(), "jsType", null);
        setField(term63238, term63238.getClass(), "parent", null);
        term63191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term63193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term63191, term63191.getClass(), "str", null);
        setIntField(term63191, term63191.getClass(), "type", 23);
        setField(term63193, term63193.getClass(), "str", null);
        setIntField(term63193, term63193.getClass(), "type", 0);
        setField(term63193, term63193.getClass(), "next", null);
        setField(term63193, term63193.getClass(), "first", null);
        setField(term63193, term63193.getClass(), "last", null);
        setField(term63193, term63193.getClass(), "propListHead", null);
        setIntField(term63193, term63193.getClass(), "sourcePosition", 0);
        setField(term63193, term63193.getClass(), "jsType", null);
        setField(term63193, term63193.getClass(), "parent", null);
        setField(term63191, term63191.getClass(), "next", term63193);
        setField(term63191, term63191.getClass(), "first", term63191);
        setField(term63191, term63191.getClass(), "last", null);
        setField(term63191, term63191.getClass(), "propListHead", null);
        setIntField(term63191, term63191.getClass(), "sourcePosition", 0);
        setField(term63191, term63191.getClass(), "jsType", null);
        setField(term63191, term63191.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49578;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term49486, args);
        assertTrue(recursiveEquals(term49486, term63237));
        assertTrue(recursiveEquals(term49578, term63238));
        assertTrue(recursiveEquals(retValue, term63191));
    }

};


