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

public class Scope_getParent_79653443132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;
     Object term1655;
     Object term1641;

    public Scope_getParent_79653443132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term153 = new HashMap();
        term152 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term166 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term152, term152.getClass(), "vars", term153);
        setField(term166, term166.getClass(), "vars", null);
        setField(term166, term166.getClass(), "parent", null);
        setIntField(term166, term166.getClass(), "depth", 0);
        setField(term166, term166.getClass(), "rootNode", null);
        setField(term166, term166.getClass(), "thisType", null);
        setBooleanField(term166, term166.getClass(), "isBottom", false);
        setField(term166, term166.getClass(), "arguments", null);
        setField(term152, term152.getClass(), "parent", term166);
        setIntField(term152, term152.getClass(), "depth", 335112684);
        setIntField(term170, term170.getClass(), "type", 0);
        setField(term170, term170.getClass(), "next", null);
        setField(term170, term170.getClass(), "first", null);
        setField(term170, term170.getClass(), "last", null);
        setField(term170, term170.getClass(), "propListHead", null);
        setIntField(term170, term170.getClass(), "sourcePosition", 0);
        setField(term170, term170.getClass(), "jsType", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term152, term152.getClass(), "rootNode", term170);
        setField(term152, term152.getClass(), "thisType", null);
        setBooleanField(term152, term152.getClass(), "isBottom", false);
        setField(term152, term152.getClass(), "arguments", null);
        HashMap term1656 = new HashMap();
        term1655 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1657 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1655, term1655.getClass(), "vars", term1656);
        setField(term1657, term1657.getClass(), "vars", null);
        setField(term1657, term1657.getClass(), "parent", null);
        setIntField(term1657, term1657.getClass(), "depth", 0);
        setField(term1657, term1657.getClass(), "rootNode", null);
        setField(term1657, term1657.getClass(), "thisType", null);
        setBooleanField(term1657, term1657.getClass(), "isBottom", false);
        setField(term1657, term1657.getClass(), "arguments", null);
        setField(term1655, term1655.getClass(), "parent", term1657);
        setIntField(term1655, term1655.getClass(), "depth", 335112684);
        setIntField(term1658, term1658.getClass(), "type", 0);
        setField(term1658, term1658.getClass(), "next", null);
        setField(term1658, term1658.getClass(), "first", null);
        setField(term1658, term1658.getClass(), "last", null);
        setField(term1658, term1658.getClass(), "propListHead", null);
        setIntField(term1658, term1658.getClass(), "sourcePosition", 0);
        setField(term1658, term1658.getClass(), "jsType", null);
        setField(term1658, term1658.getClass(), "parent", null);
        setField(term1655, term1655.getClass(), "rootNode", term1658);
        setField(term1655, term1655.getClass(), "thisType", null);
        setBooleanField(term1655, term1655.getClass(), "isBottom", false);
        setField(term1655, term1655.getClass(), "arguments", null);
        term1641 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term1641, term1641.getClass(), "vars", null);
        setField(term1641, term1641.getClass(), "parent", null);
        setIntField(term1641, term1641.getClass(), "depth", 0);
        setField(term1641, term1641.getClass(), "rootNode", null);
        setField(term1641, term1641.getClass(), "thisType", null);
        setBooleanField(term1641, term1641.getClass(), "isBottom", false);
        setField(term1641, term1641.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParent", argTypes, term152, args);
        assertTrue(recursiveEquals(term152, term1655));
        assertTrue(recursiveEquals(retValue, term1641));
    }

};


