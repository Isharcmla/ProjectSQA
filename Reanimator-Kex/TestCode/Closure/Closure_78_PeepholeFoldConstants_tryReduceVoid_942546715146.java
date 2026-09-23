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

public class PeepholeFoldConstants_tryReduceVoid_942546715146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23932;
     Object term24092;
     Object term24394;
     Object term24396;
     Object term24367;

    public PeepholeFoldConstants_tryReduceVoid_942546715146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23932 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24022 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24022, term24022.getClass(), "compiler", null);
        setField(term23932, term23932.getClass(), "currentTraversal", term24022);
        term24092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24162, term24162.getClass(), "type", 79);
        setField(term24092, term24092.getClass(), "first", term24162);
        setIntField(term24092, term24092.getClass(), "type", 79);
        term24394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term24395 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24395, term24395.getClass(), "compiler", null);
        setField(term24395, term24395.getClass(), "callback", null);
        setField(term24395, term24395.getClass(), "curNode", null);
        setField(term24395, term24395.getClass(), "scopes", null);
        setField(term24395, term24395.getClass(), "scopeRoots", null);
        setField(term24395, term24395.getClass(), "cfgs", null);
        setField(term24395, term24395.getClass(), "sourceName", null);
        setField(term24395, term24395.getClass(), "scopeCreator", null);
        setField(term24395, term24395.getClass(), "scopeCallback", null);
        setField(term24394, term24394.getClass(), "currentTraversal", term24395);
        term24396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24396, term24396.getClass(), "type", 79);
        setField(term24396, term24396.getClass(), "next", null);
        setIntField(term24397, term24397.getClass(), "type", 79);
        setField(term24397, term24397.getClass(), "next", null);
        setField(term24397, term24397.getClass(), "first", null);
        setField(term24397, term24397.getClass(), "last", null);
        setField(term24397, term24397.getClass(), "propListHead", null);
        setIntField(term24397, term24397.getClass(), "sourcePosition", 0);
        setField(term24397, term24397.getClass(), "jsType", null);
        setField(term24397, term24397.getClass(), "parent", null);
        setField(term24396, term24396.getClass(), "first", term24397);
        setField(term24396, term24396.getClass(), "last", null);
        setField(term24396, term24396.getClass(), "propListHead", null);
        setIntField(term24396, term24396.getClass(), "sourcePosition", 0);
        setField(term24396, term24396.getClass(), "jsType", null);
        setField(term24396, term24396.getClass(), "parent", null);
        term24367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24367, term24367.getClass(), "type", 79);
        setField(term24367, term24367.getClass(), "next", null);
        setIntField(term24369, term24369.getClass(), "type", 79);
        setField(term24369, term24369.getClass(), "next", null);
        setField(term24369, term24369.getClass(), "first", null);
        setField(term24369, term24369.getClass(), "last", null);
        setField(term24369, term24369.getClass(), "propListHead", null);
        setIntField(term24369, term24369.getClass(), "sourcePosition", 0);
        setField(term24369, term24369.getClass(), "jsType", null);
        setField(term24369, term24369.getClass(), "parent", null);
        setField(term24367, term24367.getClass(), "first", term24369);
        setField(term24367, term24367.getClass(), "last", null);
        setField(term24367, term24367.getClass(), "propListHead", null);
        setIntField(term24367, term24367.getClass(), "sourcePosition", 0);
        setField(term24367, term24367.getClass(), "jsType", null);
        setField(term24367, term24367.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24092;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term23932, args);
        assertTrue(recursiveEquals(term23932, term24394));
        assertTrue(recursiveEquals(term24092, term24396));
        assertTrue(recursiveEquals(retValue, term24367));
    }

};


