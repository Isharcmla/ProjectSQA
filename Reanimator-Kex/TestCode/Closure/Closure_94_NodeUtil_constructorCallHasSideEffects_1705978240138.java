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
import java.lang.Object;

public class NodeUtil_constructorCallHasSideEffects_1705978240138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;

    public NodeUtil_constructorCallHasSideEffects_1705978240138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term489, term489.getClass(), "type", 318591690);
        setIntField(term491, term491.getClass(), "type", 548228925);
        setIntField(term493, term493.getClass(), "type", 0);
        setField(term493, term493.getClass(), "next", null);
        setField(term493, term493.getClass(), "first", null);
        setField(term493, term493.getClass(), "last", null);
        setField(term493, term493.getClass(), "propListHead", null);
        setIntField(term493, term493.getClass(), "sourcePosition", 0);
        setField(term493, term493.getClass(), "jsType", null);
        setField(term493, term493.getClass(), "parent", null);
        setField(term491, term491.getClass(), "next", term493);
        setIntField(term496, term496.getClass(), "type", 0);
        setField(term496, term496.getClass(), "next", null);
        setField(term496, term496.getClass(), "first", null);
        setField(term496, term496.getClass(), "last", null);
        setField(term496, term496.getClass(), "propListHead", null);
        setIntField(term496, term496.getClass(), "sourcePosition", 0);
        setField(term496, term496.getClass(), "jsType", null);
        setField(term496, term496.getClass(), "parent", null);
        setField(term491, term491.getClass(), "first", term496);
        setIntField(term499, term499.getClass(), "type", 0);
        setField(term499, term499.getClass(), "next", null);
        setField(term499, term499.getClass(), "first", null);
        setField(term499, term499.getClass(), "last", null);
        setField(term499, term499.getClass(), "propListHead", null);
        setIntField(term499, term499.getClass(), "sourcePosition", 0);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
        setField(term491, term491.getClass(), "last", term499);
        setField(term502, term502.getClass(), "next", null);
        setIntField(term502, term502.getClass(), "type", 0);
        setIntField(term502, term502.getClass(), "intValue", 0);
        setField(term502, term502.getClass(), "objectValue", null);
        setField(term491, term491.getClass(), "propListHead", term502);
        setIntField(term491, term491.getClass(), "sourcePosition", 937859191);
        setField(term491, term491.getClass(), "jsType", null);
        setField(term491, term491.getClass(), "parent", null);
        setField(term489, term489.getClass(), "next", term491);
        setIntField(term506, term506.getClass(), "type", 0);
        setField(term506, term506.getClass(), "next", null);
        setField(term506, term506.getClass(), "first", null);
        setField(term506, term506.getClass(), "last", null);
        setField(term506, term506.getClass(), "propListHead", null);
        setIntField(term506, term506.getClass(), "sourcePosition", 0);
        setField(term506, term506.getClass(), "jsType", null);
        setField(term506, term506.getClass(), "parent", null);
        setField(term489, term489.getClass(), "first", term506);
        setIntField(term509, term509.getClass(), "type", 0);
        setField(term509, term509.getClass(), "next", null);
        setField(term509, term509.getClass(), "first", null);
        setField(term509, term509.getClass(), "last", null);
        setField(term509, term509.getClass(), "propListHead", null);
        setIntField(term509, term509.getClass(), "sourcePosition", 0);
        setField(term509, term509.getClass(), "jsType", null);
        setField(term509, term509.getClass(), "parent", null);
        setField(term489, term489.getClass(), "last", term509);
        setField(term512, term512.getClass(), "next", null);
        setIntField(term512, term512.getClass(), "type", 0);
        setIntField(term512, term512.getClass(), "intValue", 0);
        setField(term512, term512.getClass(), "objectValue", null);
        setField(term489, term489.getClass(), "propListHead", term512);
        setIntField(term489, term489.getClass(), "sourcePosition", -916584829);
        setField(term489, term489.getClass(), "jsType", null);
        setField(term489, term489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term489;
        args[1] = null;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


