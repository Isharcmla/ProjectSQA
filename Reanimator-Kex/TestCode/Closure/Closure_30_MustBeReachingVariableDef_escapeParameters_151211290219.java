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
import java.util.HashMap;

public class MustBeReachingVariableDef_escapeParameters_151211290219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term398;
     Object term2214;
     Object term2220;

    public MustBeReachingVariableDef_escapeParameters_151211290219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term382 = new HashMap();
        term380 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term381 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term390 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term381, term381.getClass(), "vars", term382);
        setField(term390, term390.getClass(), "vars", null);
        setField(term390, term390.getClass(), "parent", null);
        setIntField(term390, term390.getClass(), "depth", 0);
        setField(term390, term390.getClass(), "rootNode", null);
        setField(term390, term390.getClass(), "thisType", null);
        setBooleanField(term390, term390.getClass(), "isBottom", false);
        setField(term390, term390.getClass(), "arguments", null);
        setField(term381, term381.getClass(), "parent", term390);
        setIntField(term381, term381.getClass(), "depth", 480137250);
        setIntField(term394, term394.getClass(), "type", 0);
        setField(term394, term394.getClass(), "next", null);
        setField(term394, term394.getClass(), "first", null);
        setField(term394, term394.getClass(), "last", null);
        setField(term394, term394.getClass(), "propListHead", null);
        setIntField(term394, term394.getClass(), "sourcePosition", 0);
        setField(term394, term394.getClass(), "jsType", null);
        setField(term394, term394.getClass(), "parent", null);
        setField(term381, term381.getClass(), "rootNode", term394);
        setField(term381, term381.getClass(), "thisType", null);
        setBooleanField(term381, term381.getClass(), "isBottom", false);
        setField(term381, term381.getClass(), "arguments", null);
        setField(term380, term380.getClass(), "jsScope", term381);
        setField(term380, term380.getClass(), "compiler", null);
        setField(term380, term380.getClass(), "escaped", null);
        setField(term380, term380.getClass(), "cfg", null);
        setField(term380, term380.getClass(), "joinOp", null);
        setField(term380, term380.getClass(), "orderedWorkSet", null);
        HashMap term399 = new HashMap();
        term398 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term398, term398.getClass(), "reachingDef", term399);
        HashMap term2216 = new HashMap();
        term2214 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term2215 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2218 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2215, term2215.getClass(), "vars", term2216);
        setField(term2218, term2218.getClass(), "vars", null);
        setField(term2218, term2218.getClass(), "parent", null);
        setIntField(term2218, term2218.getClass(), "depth", 0);
        setField(term2218, term2218.getClass(), "rootNode", null);
        setField(term2218, term2218.getClass(), "thisType", null);
        setBooleanField(term2218, term2218.getClass(), "isBottom", false);
        setField(term2218, term2218.getClass(), "arguments", null);
        setField(term2215, term2215.getClass(), "parent", term2218);
        setIntField(term2215, term2215.getClass(), "depth", 480137250);
        setIntField(term2219, term2219.getClass(), "type", 0);
        setField(term2219, term2219.getClass(), "next", null);
        setField(term2219, term2219.getClass(), "first", null);
        setField(term2219, term2219.getClass(), "last", null);
        setField(term2219, term2219.getClass(), "propListHead", null);
        setIntField(term2219, term2219.getClass(), "sourcePosition", 0);
        setField(term2219, term2219.getClass(), "jsType", null);
        setField(term2219, term2219.getClass(), "parent", null);
        setField(term2215, term2215.getClass(), "rootNode", term2219);
        setField(term2215, term2215.getClass(), "thisType", null);
        setBooleanField(term2215, term2215.getClass(), "isBottom", false);
        setField(term2215, term2215.getClass(), "arguments", null);
        setField(term2214, term2214.getClass(), "jsScope", term2215);
        setField(term2214, term2214.getClass(), "compiler", null);
        setField(term2214, term2214.getClass(), "escaped", null);
        setField(term2214, term2214.getClass(), "cfg", null);
        setField(term2214, term2214.getClass(), "joinOp", null);
        setField(term2214, term2214.getClass(), "orderedWorkSet", null);
        HashMap term2221 = new HashMap();
        term2220 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term2220, term2220.getClass(), "reachingDef", term2221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        Object[] args = new Object[1];
        args[0] = term398;
        callMethod(klass, "escapeParameters", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term2214));
        assertTrue(recursiveEquals(term398, term2220));
    }

};


