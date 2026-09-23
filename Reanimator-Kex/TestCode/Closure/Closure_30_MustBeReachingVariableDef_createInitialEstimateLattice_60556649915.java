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

public class MustBeReachingVariableDef_createInitialEstimateLattice_60556649915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term1454;
     Object term1433;

    public MustBeReachingVariableDef_createInitialEstimateLattice_60556649915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133 = new HashMap();
        term131 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term132 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term141 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term132, term132.getClass(), "vars", term133);
        setField(term141, term141.getClass(), "vars", null);
        setField(term141, term141.getClass(), "parent", null);
        setIntField(term141, term141.getClass(), "depth", 0);
        setField(term141, term141.getClass(), "rootNode", null);
        setField(term141, term141.getClass(), "thisType", null);
        setBooleanField(term141, term141.getClass(), "isBottom", false);
        setField(term141, term141.getClass(), "arguments", null);
        setField(term132, term132.getClass(), "parent", term141);
        setIntField(term132, term132.getClass(), "depth", -1016503459);
        setIntField(term145, term145.getClass(), "type", 0);
        setField(term145, term145.getClass(), "next", null);
        setField(term145, term145.getClass(), "first", null);
        setField(term145, term145.getClass(), "last", null);
        setField(term145, term145.getClass(), "propListHead", null);
        setIntField(term145, term145.getClass(), "sourcePosition", 0);
        setField(term145, term145.getClass(), "jsType", null);
        setField(term145, term145.getClass(), "parent", null);
        setField(term132, term132.getClass(), "rootNode", term145);
        setField(term132, term132.getClass(), "thisType", null);
        setBooleanField(term132, term132.getClass(), "isBottom", false);
        setField(term132, term132.getClass(), "arguments", null);
        setField(term131, term131.getClass(), "jsScope", term132);
        setField(term131, term131.getClass(), "compiler", null);
        setField(term131, term131.getClass(), "escaped", null);
        setField(term131, term131.getClass(), "cfg", null);
        setField(term131, term131.getClass(), "joinOp", null);
        setField(term131, term131.getClass(), "orderedWorkSet", null);
        HashMap term1456 = new HashMap();
        term1454 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term1455 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1457 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1455, term1455.getClass(), "vars", term1456);
        setField(term1457, term1457.getClass(), "vars", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setIntField(term1457, term1457.getClass(), "depth", 0);
        setField(term1457, term1457.getClass(), "rootNode", null);
        setField(term1457, term1457.getClass(), "thisType", null);
        setBooleanField(term1457, term1457.getClass(), "isBottom", false);
        setField(term1457, term1457.getClass(), "arguments", null);
        setField(term1455, term1455.getClass(), "parent", term1457);
        setIntField(term1455, term1455.getClass(), "depth", -1016503459);
        setIntField(term1458, term1458.getClass(), "type", 0);
        setField(term1458, term1458.getClass(), "next", null);
        setField(term1458, term1458.getClass(), "first", null);
        setField(term1458, term1458.getClass(), "last", null);
        setField(term1458, term1458.getClass(), "propListHead", null);
        setIntField(term1458, term1458.getClass(), "sourcePosition", 0);
        setField(term1458, term1458.getClass(), "jsType", null);
        setField(term1458, term1458.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "rootNode", term1458);
        setField(term1455, term1455.getClass(), "thisType", null);
        setBooleanField(term1455, term1455.getClass(), "isBottom", false);
        setField(term1455, term1455.getClass(), "arguments", null);
        setField(term1454, term1454.getClass(), "jsScope", term1455);
        setField(term1454, term1454.getClass(), "compiler", null);
        setField(term1454, term1454.getClass(), "escaped", null);
        setField(term1454, term1454.getClass(), "cfg", null);
        setField(term1454, term1454.getClass(), "joinOp", null);
        setField(term1454, term1454.getClass(), "orderedWorkSet", null);
        HashMap term1434 = new HashMap();
        term1433 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term1433, term1433.getClass(), "reachingDef", term1434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createInitialEstimateLattice", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term1454));
        assertTrue(recursiveEquals(retValue, term1433));
    }

};


