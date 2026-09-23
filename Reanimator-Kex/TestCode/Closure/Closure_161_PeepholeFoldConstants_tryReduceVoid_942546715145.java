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

public class PeepholeFoldConstants_tryReduceVoid_942546715145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23726;
     Object term23886;
     Object term24011;
     Object term24013;
     Object term23984;

    public PeepholeFoldConstants_tryReduceVoid_942546715145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term23816 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term23816, term23816.getClass(), "compiler", null);
        setField(term23726, term23726.getClass(), "currentTraversal", term23816);
        term23886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23956, term23956.getClass(), "type", 115);
        setField(term23886, term23886.getClass(), "first", term23956);
        setIntField(term23886, term23886.getClass(), "type", 115);
        term24011 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24012 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24012, term24012.getClass(), "compiler", null);
        setField(term24012, term24012.getClass(), "callback", null);
        setField(term24012, term24012.getClass(), "curNode", null);
        setField(term24012, term24012.getClass(), "scopes", null);
        setField(term24012, term24012.getClass(), "scopeRoots", null);
        setField(term24012, term24012.getClass(), "cfgs", null);
        setField(term24012, term24012.getClass(), "sourceName", null);
        setField(term24012, term24012.getClass(), "scopeCreator", null);
        setField(term24012, term24012.getClass(), "scopeCallback", null);
        setField(term24011, term24011.getClass(), "currentTraversal", term24012);
        term24013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24013, term24013.getClass(), "type", 115);
        setField(term24013, term24013.getClass(), "next", null);
        setIntField(term24014, term24014.getClass(), "type", 115);
        setField(term24014, term24014.getClass(), "next", null);
        setField(term24014, term24014.getClass(), "first", null);
        setField(term24014, term24014.getClass(), "last", null);
        setField(term24014, term24014.getClass(), "propListHead", null);
        setIntField(term24014, term24014.getClass(), "sourcePosition", 0);
        setField(term24014, term24014.getClass(), "jsType", null);
        setField(term24014, term24014.getClass(), "parent", null);
        setField(term24013, term24013.getClass(), "first", term24014);
        setField(term24013, term24013.getClass(), "last", null);
        setField(term24013, term24013.getClass(), "propListHead", null);
        setIntField(term24013, term24013.getClass(), "sourcePosition", 0);
        setField(term24013, term24013.getClass(), "jsType", null);
        setField(term24013, term24013.getClass(), "parent", null);
        term23984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23984, term23984.getClass(), "type", 115);
        setField(term23984, term23984.getClass(), "next", null);
        setIntField(term23986, term23986.getClass(), "type", 115);
        setField(term23986, term23986.getClass(), "next", null);
        setField(term23986, term23986.getClass(), "first", null);
        setField(term23986, term23986.getClass(), "last", null);
        setField(term23986, term23986.getClass(), "propListHead", null);
        setIntField(term23986, term23986.getClass(), "sourcePosition", 0);
        setField(term23986, term23986.getClass(), "jsType", null);
        setField(term23986, term23986.getClass(), "parent", null);
        setField(term23984, term23984.getClass(), "first", term23986);
        setField(term23984, term23984.getClass(), "last", null);
        setField(term23984, term23984.getClass(), "propListHead", null);
        setIntField(term23984, term23984.getClass(), "sourcePosition", 0);
        setField(term23984, term23984.getClass(), "jsType", null);
        setField(term23984, term23984.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23886;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term23726, args);
        assertTrue(recursiveEquals(term23726, term24011));
        assertTrue(recursiveEquals(term23886, term24013));
        assertTrue(recursiveEquals(retValue, term23984));
    }

};


