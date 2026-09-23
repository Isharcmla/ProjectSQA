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

public class PeepholeFoldConstants_tryReduceVoid_942546715352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81443;
     Object term81603;
     Object term93101;
     Object term93103;
     Object term93054;

    public PeepholeFoldConstants_tryReduceVoid_942546715352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term81533 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term81533, term81533.getClass(), "compiler", null);
        setField(term81443, term81443.getClass(), "currentTraversal", term81533);
        term81603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81673, term81673.getClass(), "type", 128);
        setField(term81603, term81603.getClass(), "first", term81673);
        setIntField(term81603, term81603.getClass(), "type", 128);
        term93101 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term93102 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term93102, term93102.getClass(), "compiler", null);
        setField(term93102, term93102.getClass(), "callback", null);
        setField(term93102, term93102.getClass(), "curNode", null);
        setField(term93102, term93102.getClass(), "scopes", null);
        setField(term93102, term93102.getClass(), "scopeRoots", null);
        setField(term93102, term93102.getClass(), "cfgs", null);
        setField(term93102, term93102.getClass(), "sourceName", null);
        setField(term93102, term93102.getClass(), "scopeCreator", null);
        setField(term93102, term93102.getClass(), "scopeCallback", null);
        setField(term93101, term93101.getClass(), "currentTraversal", term93102);
        term93103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93103, term93103.getClass(), "type", 128);
        setField(term93103, term93103.getClass(), "next", null);
        setIntField(term93104, term93104.getClass(), "type", 128);
        setField(term93104, term93104.getClass(), "next", null);
        setField(term93104, term93104.getClass(), "first", null);
        setField(term93104, term93104.getClass(), "last", null);
        setField(term93104, term93104.getClass(), "propListHead", null);
        setIntField(term93104, term93104.getClass(), "sourcePosition", 0);
        setField(term93104, term93104.getClass(), "jsType", null);
        setField(term93104, term93104.getClass(), "parent", null);
        setField(term93103, term93103.getClass(), "first", term93104);
        setField(term93103, term93103.getClass(), "last", null);
        setField(term93103, term93103.getClass(), "propListHead", null);
        setIntField(term93103, term93103.getClass(), "sourcePosition", 0);
        setField(term93103, term93103.getClass(), "jsType", null);
        setField(term93103, term93103.getClass(), "parent", null);
        term93054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93054, term93054.getClass(), "type", 128);
        setField(term93054, term93054.getClass(), "next", null);
        setIntField(term93056, term93056.getClass(), "type", 128);
        setField(term93056, term93056.getClass(), "next", null);
        setField(term93056, term93056.getClass(), "first", null);
        setField(term93056, term93056.getClass(), "last", null);
        setField(term93056, term93056.getClass(), "propListHead", null);
        setIntField(term93056, term93056.getClass(), "sourcePosition", 0);
        setField(term93056, term93056.getClass(), "jsType", null);
        setField(term93056, term93056.getClass(), "parent", null);
        setField(term93054, term93054.getClass(), "first", term93056);
        setField(term93054, term93054.getClass(), "last", null);
        setField(term93054, term93054.getClass(), "propListHead", null);
        setIntField(term93054, term93054.getClass(), "sourcePosition", 0);
        setField(term93054, term93054.getClass(), "jsType", null);
        setField(term93054, term93054.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81603;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term81443, args);
        assertTrue(recursiveEquals(term81443, term93101));
        assertTrue(recursiveEquals(term81603, term93103));
        assertTrue(recursiveEquals(retValue, term93054));
    }

};


