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

public class MaybeReachingVariableUse_createEntryLattice_134581203612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term1262;
     Object term1238;

    public MaybeReachingVariableUse_createEntryLattice_134581203612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term115 = new HashMap();
        term113 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term114 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term123 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term114, term114.getClass(), "vars", term115);
        setField(term123, term123.getClass(), "vars", null);
        setField(term123, term123.getClass(), "parent", null);
        setIntField(term123, term123.getClass(), "depth", 0);
        setField(term123, term123.getClass(), "rootNode", null);
        setField(term123, term123.getClass(), "thisType", null);
        setBooleanField(term123, term123.getClass(), "isBottom", false);
        setField(term123, term123.getClass(), "arguments", null);
        setField(term114, term114.getClass(), "parent", term123);
        setIntField(term114, term114.getClass(), "depth", -1145578966);
        setIntField(term127, term127.getClass(), "type", 0);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", null);
        setField(term127, term127.getClass(), "last", null);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term114, term114.getClass(), "rootNode", term127);
        setField(term114, term114.getClass(), "thisType", null);
        setBooleanField(term114, term114.getClass(), "isBottom", false);
        setField(term114, term114.getClass(), "arguments", null);
        setField(term113, term113.getClass(), "jsScope", term114);
        setField(term113, term113.getClass(), "escaped", null);
        setField(term113, term113.getClass(), "cfg", null);
        setField(term113, term113.getClass(), "joinOp", null);
        setField(term113, term113.getClass(), "orderedWorkSet", null);
        HashMap term1264 = new HashMap();
        term1262 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term1263 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1265 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1263, term1263.getClass(), "vars", term1264);
        setField(term1265, term1265.getClass(), "vars", null);
        setField(term1265, term1265.getClass(), "parent", null);
        setIntField(term1265, term1265.getClass(), "depth", 0);
        setField(term1265, term1265.getClass(), "rootNode", null);
        setField(term1265, term1265.getClass(), "thisType", null);
        setBooleanField(term1265, term1265.getClass(), "isBottom", false);
        setField(term1265, term1265.getClass(), "arguments", null);
        setField(term1263, term1263.getClass(), "parent", term1265);
        setIntField(term1263, term1263.getClass(), "depth", -1145578966);
        setIntField(term1266, term1266.getClass(), "type", 0);
        setField(term1266, term1266.getClass(), "next", null);
        setField(term1266, term1266.getClass(), "first", null);
        setField(term1266, term1266.getClass(), "last", null);
        setField(term1266, term1266.getClass(), "propListHead", null);
        setIntField(term1266, term1266.getClass(), "sourcePosition", 0);
        setField(term1266, term1266.getClass(), "jsType", null);
        setField(term1266, term1266.getClass(), "parent", null);
        setField(term1263, term1263.getClass(), "rootNode", term1266);
        setField(term1263, term1263.getClass(), "thisType", null);
        setBooleanField(term1263, term1263.getClass(), "isBottom", false);
        setField(term1263, term1263.getClass(), "arguments", null);
        setField(term1262, term1262.getClass(), "jsScope", term1263);
        setField(term1262, term1262.getClass(), "escaped", null);
        setField(term1262, term1262.getClass(), "cfg", null);
        setField(term1262, term1262.getClass(), "joinOp", null);
        setField(term1262, term1262.getClass(), "orderedWorkSet", null);
        HashMap term1241 = new HashMap();
        term1238 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term1239 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term1239, term1239.getClass(), "expectedValuesPerKey", 8);
        setField(term1239, term1239.getClass(), "map", term1241);
        setIntField(term1239, term1239.getClass(), "totalSize", 0);
        setField(term1239, term1239.getClass(), "keySet", null);
        setField(term1239, term1239.getClass(), "multiset", null);
        setField(term1239, term1239.getClass(), "valuesCollection", null);
        setField(term1239, term1239.getClass(), "entries", null);
        setField(term1239, term1239.getClass(), "asMap", null);
        setField(term1238, term1238.getClass(), "mayUseMap", term1239);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createEntryLattice", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term1262));
        assertTrue(recursiveEquals(retValue, term1238));
    }

};


