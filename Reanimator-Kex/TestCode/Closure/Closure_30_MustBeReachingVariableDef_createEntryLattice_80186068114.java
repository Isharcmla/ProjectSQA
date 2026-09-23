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

public class MustBeReachingVariableDef_createEntryLattice_80186068114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term1422;
     Object term1390;

    public MustBeReachingVariableDef_createEntryLattice_80186068114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term115 = new HashMap();
        term113 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
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
        setField(term113, term113.getClass(), "compiler", null);
        setField(term113, term113.getClass(), "escaped", null);
        setField(term113, term113.getClass(), "cfg", null);
        setField(term113, term113.getClass(), "joinOp", null);
        setField(term113, term113.getClass(), "orderedWorkSet", null);
        HashMap term1424 = new HashMap();
        term1422 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term1423 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1426 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1423, term1423.getClass(), "vars", term1424);
        setField(term1426, term1426.getClass(), "vars", null);
        setField(term1426, term1426.getClass(), "parent", null);
        setIntField(term1426, term1426.getClass(), "depth", 0);
        setField(term1426, term1426.getClass(), "rootNode", null);
        setField(term1426, term1426.getClass(), "thisType", null);
        setBooleanField(term1426, term1426.getClass(), "isBottom", false);
        setField(term1426, term1426.getClass(), "arguments", null);
        setField(term1423, term1423.getClass(), "parent", term1426);
        setIntField(term1423, term1423.getClass(), "depth", -1145578966);
        setIntField(term1427, term1427.getClass(), "type", 0);
        setField(term1427, term1427.getClass(), "next", null);
        setField(term1427, term1427.getClass(), "first", null);
        setField(term1427, term1427.getClass(), "last", null);
        setField(term1427, term1427.getClass(), "propListHead", null);
        setIntField(term1427, term1427.getClass(), "sourcePosition", 0);
        setField(term1427, term1427.getClass(), "jsType", null);
        setField(term1427, term1427.getClass(), "parent", null);
        setField(term1423, term1423.getClass(), "rootNode", term1427);
        setField(term1423, term1423.getClass(), "thisType", null);
        setBooleanField(term1423, term1423.getClass(), "isBottom", false);
        setField(term1423, term1423.getClass(), "arguments", null);
        setField(term1422, term1422.getClass(), "jsScope", term1423);
        setField(term1422, term1422.getClass(), "compiler", null);
        setField(term1422, term1422.getClass(), "escaped", null);
        setField(term1422, term1422.getClass(), "cfg", null);
        setField(term1422, term1422.getClass(), "joinOp", null);
        setField(term1422, term1422.getClass(), "orderedWorkSet", null);
        HashMap term1391 = new HashMap();
        term1390 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef"));
        setField(term1390, term1390.getClass(), "reachingDef", term1391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createEntryLattice", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term1422));
        assertTrue(recursiveEquals(retValue, term1390));
    }

};


