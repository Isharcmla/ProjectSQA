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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class MaybeReachingVariableUse_getUses_148420070819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;
     Object term496;

    public MaybeReachingVariableUse_getUses_148420070819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term468 = new HashMap();
        term466 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term467 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term476 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term467, term467.getClass(), "vars", term468);
        setField(term476, term476.getClass(), "vars", null);
        setField(term476, term476.getClass(), "parent", null);
        setIntField(term476, term476.getClass(), "depth", 0);
        setField(term476, term476.getClass(), "rootNode", null);
        setField(term476, term476.getClass(), "thisType", null);
        setBooleanField(term476, term476.getClass(), "isBottom", false);
        setField(term476, term476.getClass(), "arguments", null);
        setField(term467, term467.getClass(), "parent", term476);
        setIntField(term467, term467.getClass(), "depth", 9726679);
        setIntField(term480, term480.getClass(), "type", 0);
        setField(term480, term480.getClass(), "next", null);
        setField(term480, term480.getClass(), "first", null);
        setField(term480, term480.getClass(), "last", null);
        setField(term480, term480.getClass(), "propListHead", null);
        setIntField(term480, term480.getClass(), "sourcePosition", 0);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        setField(term467, term467.getClass(), "rootNode", term480);
        setField(term467, term467.getClass(), "thisType", null);
        setBooleanField(term467, term467.getClass(), "isBottom", false);
        setField(term467, term467.getClass(), "arguments", null);
        setField(term466, term466.getClass(), "jsScope", term467);
        setField(term466, term466.getClass(), "escaped", null);
        setField(term466, term466.getClass(), "cfg", null);
        setField(term466, term466.getClass(), "joinOp", null);
        setField(term466, term466.getClass(), "orderedWorkSet", null);
        term496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term496, term496.getClass(), "type", -25637976);
        setIntField(term498, term498.getClass(), "type", 1555897383);
        setIntField(term500, term500.getClass(), "type", 202001407);
        setIntField(term502, term502.getClass(), "type", 158873461);
        setIntField(term504, term504.getClass(), "type", -430151637);
        setField(term504, term504.getClass(), "next", null);
        setField(term504, term504.getClass(), "first", null);
        setField(term504, term504.getClass(), "last", null);
        setField(term504, term504.getClass(), "propListHead", null);
        setIntField(term504, term504.getClass(), "sourcePosition", 0);
        setField(term504, term504.getClass(), "jsType", null);
        setField(term504, term504.getClass(), "parent", null);
        setField(term502, term502.getClass(), "next", term504);
        setIntField(term507, term507.getClass(), "type", -1697741339);
        setField(term507, term507.getClass(), "next", null);
        setField(term507, term507.getClass(), "first", null);
        setField(term507, term507.getClass(), "last", term504);
        setField(term507, term507.getClass(), "propListHead", null);
        setIntField(term507, term507.getClass(), "sourcePosition", 0);
        setField(term507, term507.getClass(), "jsType", null);
        setField(term507, term507.getClass(), "parent", null);
        setField(term502, term502.getClass(), "first", term507);
        setField(term502, term502.getClass(), "last", term500);
        setField(term502, term502.getClass(), "propListHead", null);
        setIntField(term502, term502.getClass(), "sourcePosition", 0);
        setField(term502, term502.getClass(), "jsType", null);
        setField(term502, term502.getClass(), "parent", null);
        setField(term500, term500.getClass(), "next", term502);
        setField(term500, term500.getClass(), "first", term504);
        setIntField(term511, term511.getClass(), "type", -1388471422);
        setIntField(term513, term513.getClass(), "type", -1498296052);
        setField(term513, term513.getClass(), "next", null);
        setField(term513, term513.getClass(), "first", term507);
        setField(term513, term513.getClass(), "last", term502);
        setField(term513, term513.getClass(), "propListHead", null);
        setIntField(term513, term513.getClass(), "sourcePosition", 0);
        setField(term513, term513.getClass(), "jsType", null);
        setField(term513, term513.getClass(), "parent", null);
        setField(term511, term511.getClass(), "next", term513);
        setField(term511, term511.getClass(), "first", term498);
        setField(term511, term511.getClass(), "last", term498);
        setField(term511, term511.getClass(), "propListHead", null);
        setIntField(term511, term511.getClass(), "sourcePosition", 0);
        setField(term511, term511.getClass(), "jsType", null);
        setField(term511, term511.getClass(), "parent", null);
        setField(term500, term500.getClass(), "last", term511);
        setField(term500, term500.getClass(), "propListHead", null);
        setIntField(term500, term500.getClass(), "sourcePosition", 0);
        setField(term500, term500.getClass(), "jsType", null);
        setField(term500, term500.getClass(), "parent", null);
        setField(term498, term498.getClass(), "next", term500);
        setIntField(term518, term518.getClass(), "type", 2098647989);
        setField(term518, term518.getClass(), "next", term511);
        setField(term518, term518.getClass(), "first", term513);
        setField(term518, term518.getClass(), "last", term496);
        setField(term518, term518.getClass(), "propListHead", null);
        setIntField(term518, term518.getClass(), "sourcePosition", 0);
        setField(term518, term518.getClass(), "jsType", null);
        setField(term518, term518.getClass(), "parent", null);
        setField(term498, term498.getClass(), "first", term518);
        setField(term498, term498.getClass(), "last", term518);
        setField(term498, term498.getClass(), "propListHead", null);
        setIntField(term498, term498.getClass(), "sourcePosition", 0);
        setField(term498, term498.getClass(), "jsType", null);
        setField(term498, term498.getClass(), "parent", null);
        setField(term496, term496.getClass(), "next", term498);
        setField(term496, term496.getClass(), "first", term502);
        setField(term496, term496.getClass(), "last", term504);
        setField(term496, term496.getClass(), "propListHead", null);
        setIntField(term496, term496.getClass(), "sourcePosition", 0);
        setField(term496, term496.getClass(), "jsType", null);
        setField(term496, term496.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = term496;
        try {
            callMethod(klass, "getUses", argTypes, term466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


