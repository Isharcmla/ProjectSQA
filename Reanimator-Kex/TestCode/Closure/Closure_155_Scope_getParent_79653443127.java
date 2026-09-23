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

public class Scope_getParent_79653443127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term1512;
     Object term1498;

    public Scope_getParent_79653443127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term171 = new HashMap();
        term170 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term184 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term170, term170.getClass(), "vars", term171);
        setField(term184, term184.getClass(), "vars", null);
        setField(term184, term184.getClass(), "parent", null);
        setIntField(term184, term184.getClass(), "depth", 0);
        setField(term184, term184.getClass(), "rootNode", null);
        setField(term184, term184.getClass(), "thisType", null);
        setBooleanField(term184, term184.getClass(), "isBottom", false);
        setField(term170, term170.getClass(), "parent", term184);
        setIntField(term170, term170.getClass(), "depth", -1772434990);
        setIntField(term188, term188.getClass(), "type", 0);
        setField(term188, term188.getClass(), "next", null);
        setField(term188, term188.getClass(), "first", null);
        setField(term188, term188.getClass(), "last", null);
        setField(term188, term188.getClass(), "propListHead", null);
        setIntField(term188, term188.getClass(), "sourcePosition", 0);
        setField(term188, term188.getClass(), "jsType", null);
        setField(term188, term188.getClass(), "parent", null);
        setField(term170, term170.getClass(), "rootNode", term188);
        setField(term170, term170.getClass(), "thisType", null);
        setBooleanField(term170, term170.getClass(), "isBottom", false);
        HashMap term1513 = new HashMap();
        term1512 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1514 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1512, term1512.getClass(), "vars", term1513);
        setField(term1514, term1514.getClass(), "vars", null);
        setField(term1514, term1514.getClass(), "parent", null);
        setIntField(term1514, term1514.getClass(), "depth", 0);
        setField(term1514, term1514.getClass(), "rootNode", null);
        setField(term1514, term1514.getClass(), "thisType", null);
        setBooleanField(term1514, term1514.getClass(), "isBottom", false);
        setField(term1512, term1512.getClass(), "parent", term1514);
        setIntField(term1512, term1512.getClass(), "depth", -1772434990);
        setIntField(term1515, term1515.getClass(), "type", 0);
        setField(term1515, term1515.getClass(), "next", null);
        setField(term1515, term1515.getClass(), "first", null);
        setField(term1515, term1515.getClass(), "last", null);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1512, term1512.getClass(), "rootNode", term1515);
        setField(term1512, term1512.getClass(), "thisType", null);
        setBooleanField(term1512, term1512.getClass(), "isBottom", false);
        term1498 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term1498, term1498.getClass(), "vars", null);
        setField(term1498, term1498.getClass(), "parent", null);
        setIntField(term1498, term1498.getClass(), "depth", 0);
        setField(term1498, term1498.getClass(), "rootNode", null);
        setField(term1498, term1498.getClass(), "thisType", null);
        setBooleanField(term1498, term1498.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getParent", argTypes, term170, args);
        assertTrue(recursiveEquals(term170, term1512));
        assertTrue(recursiveEquals(retValue, term1498));
    }

};


