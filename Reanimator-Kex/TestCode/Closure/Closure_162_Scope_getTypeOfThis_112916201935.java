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

public class Scope_getTypeOfThis_112916201935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term1728;

    public Scope_getTypeOfThis_112916201935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term219 = new HashMap();
        term218 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term232 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term218, term218.getClass(), "vars", term219);
        setField(term232, term232.getClass(), "vars", null);
        setField(term232, term232.getClass(), "parent", null);
        setIntField(term232, term232.getClass(), "depth", 0);
        setField(term232, term232.getClass(), "rootNode", null);
        setField(term232, term232.getClass(), "thisType", null);
        setBooleanField(term232, term232.getClass(), "isBottom", false);
        setField(term232, term232.getClass(), "arguments", null);
        setField(term218, term218.getClass(), "parent", term232);
        setIntField(term218, term218.getClass(), "depth", -1888585309);
        setIntField(term236, term236.getClass(), "type", 0);
        setField(term236, term236.getClass(), "next", null);
        setField(term236, term236.getClass(), "first", null);
        setField(term236, term236.getClass(), "last", null);
        setField(term236, term236.getClass(), "propListHead", null);
        setIntField(term236, term236.getClass(), "sourcePosition", 0);
        setField(term236, term236.getClass(), "jsType", null);
        setField(term236, term236.getClass(), "parent", null);
        setField(term218, term218.getClass(), "rootNode", term236);
        setField(term218, term218.getClass(), "thisType", null);
        setBooleanField(term218, term218.getClass(), "isBottom", false);
        setField(term218, term218.getClass(), "arguments", null);
        HashMap term1729 = new HashMap();
        term1728 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1730 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1728, term1728.getClass(), "vars", term1729);
        setField(term1730, term1730.getClass(), "vars", null);
        setField(term1730, term1730.getClass(), "parent", null);
        setIntField(term1730, term1730.getClass(), "depth", 0);
        setField(term1730, term1730.getClass(), "rootNode", null);
        setField(term1730, term1730.getClass(), "thisType", null);
        setBooleanField(term1730, term1730.getClass(), "isBottom", false);
        setField(term1730, term1730.getClass(), "arguments", null);
        setField(term1728, term1728.getClass(), "parent", term1730);
        setIntField(term1728, term1728.getClass(), "depth", -1888585309);
        setIntField(term1731, term1731.getClass(), "type", 0);
        setField(term1731, term1731.getClass(), "next", null);
        setField(term1731, term1731.getClass(), "first", null);
        setField(term1731, term1731.getClass(), "last", null);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1728, term1728.getClass(), "rootNode", term1731);
        setField(term1728, term1728.getClass(), "thisType", null);
        setBooleanField(term1728, term1728.getClass(), "isBottom", false);
        setField(term1728, term1728.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTypeOfThis", argTypes, term218, args);
        assertTrue(recursiveEquals(term218, term1728));
        assertTrue(recursiveEquals(retValue, null));
    }

};


