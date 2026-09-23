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

public class MaybeReachingVariableUse_createInitialEstimateLattice_114951785413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term1306;
     Object term1282;

    public MaybeReachingVariableUse_createInitialEstimateLattice_114951785413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term133 = new HashMap();
        term131 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
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
        setField(term131, term131.getClass(), "escaped", null);
        setField(term131, term131.getClass(), "cfg", null);
        setField(term131, term131.getClass(), "joinOp", null);
        setField(term131, term131.getClass(), "orderedWorkSet", null);
        HashMap term1308 = new HashMap();
        term1306 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term1307 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1309 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1307, term1307.getClass(), "vars", term1308);
        setField(term1309, term1309.getClass(), "vars", null);
        setField(term1309, term1309.getClass(), "parent", null);
        setIntField(term1309, term1309.getClass(), "depth", 0);
        setField(term1309, term1309.getClass(), "rootNode", null);
        setField(term1309, term1309.getClass(), "thisType", null);
        setBooleanField(term1309, term1309.getClass(), "isBottom", false);
        setField(term1309, term1309.getClass(), "arguments", null);
        setField(term1307, term1307.getClass(), "parent", term1309);
        setIntField(term1307, term1307.getClass(), "depth", -1016503459);
        setIntField(term1310, term1310.getClass(), "type", 0);
        setField(term1310, term1310.getClass(), "next", null);
        setField(term1310, term1310.getClass(), "first", null);
        setField(term1310, term1310.getClass(), "last", null);
        setField(term1310, term1310.getClass(), "propListHead", null);
        setIntField(term1310, term1310.getClass(), "sourcePosition", 0);
        setField(term1310, term1310.getClass(), "jsType", null);
        setField(term1310, term1310.getClass(), "parent", null);
        setField(term1307, term1307.getClass(), "rootNode", term1310);
        setField(term1307, term1307.getClass(), "thisType", null);
        setBooleanField(term1307, term1307.getClass(), "isBottom", false);
        setField(term1307, term1307.getClass(), "arguments", null);
        setField(term1306, term1306.getClass(), "jsScope", term1307);
        setField(term1306, term1306.getClass(), "escaped", null);
        setField(term1306, term1306.getClass(), "cfg", null);
        setField(term1306, term1306.getClass(), "joinOp", null);
        setField(term1306, term1306.getClass(), "orderedWorkSet", null);
        HashMap term1285 = new HashMap();
        term1282 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term1283 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term1283, term1283.getClass(), "expectedValuesPerKey", 8);
        setField(term1283, term1283.getClass(), "map", term1285);
        setIntField(term1283, term1283.getClass(), "totalSize", 0);
        setField(term1283, term1283.getClass(), "keySet", null);
        setField(term1283, term1283.getClass(), "multiset", null);
        setField(term1283, term1283.getClass(), "valuesCollection", null);
        setField(term1283, term1283.getClass(), "entries", null);
        setField(term1283, term1283.getClass(), "asMap", null);
        setField(term1282, term1282.getClass(), "mayUseMap", term1283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createInitialEstimateLattice", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term1306));
        assertTrue(recursiveEquals(retValue, term1282));
    }

};


