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

public class Scope_getRootNode_122832040931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term1637;
     Object term1623;

    public Scope_getRootNode_122832040931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term131 = new HashMap();
        term130 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term144 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130, term130.getClass(), "vars", term131);
        setField(term144, term144.getClass(), "vars", null);
        setField(term144, term144.getClass(), "parent", null);
        setIntField(term144, term144.getClass(), "depth", 0);
        setField(term144, term144.getClass(), "rootNode", null);
        setField(term144, term144.getClass(), "thisType", null);
        setBooleanField(term144, term144.getClass(), "isBottom", false);
        setField(term144, term144.getClass(), "arguments", null);
        setField(term130, term130.getClass(), "parent", term144);
        setIntField(term130, term130.getClass(), "depth", 1324040357);
        setIntField(term148, term148.getClass(), "type", 0);
        setField(term148, term148.getClass(), "next", null);
        setField(term148, term148.getClass(), "first", null);
        setField(term148, term148.getClass(), "last", null);
        setField(term148, term148.getClass(), "propListHead", null);
        setIntField(term148, term148.getClass(), "sourcePosition", 0);
        setField(term148, term148.getClass(), "jsType", null);
        setField(term148, term148.getClass(), "parent", null);
        setField(term130, term130.getClass(), "rootNode", term148);
        setField(term130, term130.getClass(), "thisType", null);
        setBooleanField(term130, term130.getClass(), "isBottom", false);
        setField(term130, term130.getClass(), "arguments", null);
        HashMap term1638 = new HashMap();
        term1637 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1639 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1637, term1637.getClass(), "vars", term1638);
        setField(term1639, term1639.getClass(), "vars", null);
        setField(term1639, term1639.getClass(), "parent", null);
        setIntField(term1639, term1639.getClass(), "depth", 0);
        setField(term1639, term1639.getClass(), "rootNode", null);
        setField(term1639, term1639.getClass(), "thisType", null);
        setBooleanField(term1639, term1639.getClass(), "isBottom", false);
        setField(term1639, term1639.getClass(), "arguments", null);
        setField(term1637, term1637.getClass(), "parent", term1639);
        setIntField(term1637, term1637.getClass(), "depth", 1324040357);
        setIntField(term1640, term1640.getClass(), "type", 0);
        setField(term1640, term1640.getClass(), "next", null);
        setField(term1640, term1640.getClass(), "first", null);
        setField(term1640, term1640.getClass(), "last", null);
        setField(term1640, term1640.getClass(), "propListHead", null);
        setIntField(term1640, term1640.getClass(), "sourcePosition", 0);
        setField(term1640, term1640.getClass(), "jsType", null);
        setField(term1640, term1640.getClass(), "parent", null);
        setField(term1637, term1637.getClass(), "rootNode", term1640);
        setField(term1637, term1637.getClass(), "thisType", null);
        setBooleanField(term1637, term1637.getClass(), "isBottom", false);
        setField(term1637, term1637.getClass(), "arguments", null);
        term1623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1623, term1623.getClass(), "type", 0);
        setField(term1623, term1623.getClass(), "next", null);
        setField(term1623, term1623.getClass(), "first", null);
        setField(term1623, term1623.getClass(), "last", null);
        setField(term1623, term1623.getClass(), "propListHead", null);
        setIntField(term1623, term1623.getClass(), "sourcePosition", 0);
        setField(term1623, term1623.getClass(), "jsType", null);
        setField(term1623, term1623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRootNode", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term1637));
        assertTrue(recursiveEquals(retValue, term1623));
    }

};


