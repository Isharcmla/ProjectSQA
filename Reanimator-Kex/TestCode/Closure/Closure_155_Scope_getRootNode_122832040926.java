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
import java.util.HashMap;
import java.lang.Object;

public class Scope_getRootNode_122832040926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term1494;
     Object term1480;

    public Scope_getRootNode_122832040926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term149 = new HashMap();
        term148 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term162 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term148, term148.getClass(), "vars", term149);
        setField(term162, term162.getClass(), "vars", null);
        setField(term162, term162.getClass(), "parent", null);
        setIntField(term162, term162.getClass(), "depth", 0);
        setField(term162, term162.getClass(), "rootNode", null);
        setField(term162, term162.getClass(), "thisType", null);
        setBooleanField(term162, term162.getClass(), "isBottom", false);
        setField(term148, term148.getClass(), "parent", term162);
        setIntField(term148, term148.getClass(), "depth", -478195677);
        setIntField(term166, term166.getClass(), "type", 0);
        setField(term166, term166.getClass(), "next", null);
        setField(term166, term166.getClass(), "first", null);
        setField(term166, term166.getClass(), "last", null);
        setField(term166, term166.getClass(), "propListHead", null);
        setIntField(term166, term166.getClass(), "sourcePosition", 0);
        setField(term166, term166.getClass(), "jsType", null);
        setField(term166, term166.getClass(), "parent", null);
        setField(term148, term148.getClass(), "rootNode", term166);
        setField(term148, term148.getClass(), "thisType", null);
        setBooleanField(term148, term148.getClass(), "isBottom", false);
        HashMap term1495 = new HashMap();
        term1494 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1496 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1494, term1494.getClass(), "vars", term1495);
        setField(term1496, term1496.getClass(), "vars", null);
        setField(term1496, term1496.getClass(), "parent", null);
        setIntField(term1496, term1496.getClass(), "depth", 0);
        setField(term1496, term1496.getClass(), "rootNode", null);
        setField(term1496, term1496.getClass(), "thisType", null);
        setBooleanField(term1496, term1496.getClass(), "isBottom", false);
        setField(term1494, term1494.getClass(), "parent", term1496);
        setIntField(term1494, term1494.getClass(), "depth", -478195677);
        setIntField(term1497, term1497.getClass(), "type", 0);
        setField(term1497, term1497.getClass(), "next", null);
        setField(term1497, term1497.getClass(), "first", null);
        setField(term1497, term1497.getClass(), "last", null);
        setField(term1497, term1497.getClass(), "propListHead", null);
        setIntField(term1497, term1497.getClass(), "sourcePosition", 0);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1494, term1494.getClass(), "rootNode", term1497);
        setField(term1494, term1494.getClass(), "thisType", null);
        setBooleanField(term1494, term1494.getClass(), "isBottom", false);
        term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1480, term1480.getClass(), "type", 0);
        setField(term1480, term1480.getClass(), "next", null);
        setField(term1480, term1480.getClass(), "first", null);
        setField(term1480, term1480.getClass(), "last", null);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRootNode", argTypes, term148, args);
        assertTrue(recursiveEquals(term148, term1494));
        assertTrue(recursiveEquals(retValue, term1480));
    }

};


