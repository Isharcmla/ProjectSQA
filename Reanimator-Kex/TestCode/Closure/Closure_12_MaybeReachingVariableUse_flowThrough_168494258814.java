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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class MaybeReachingVariableUse_flowThrough_168494258814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term167;
     Object term194;

    public MaybeReachingVariableUse_flowThrough_168494258814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151 = new HashMap();
        term149 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse"));
        Object term150 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term159 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term150, term150.getClass(), "vars", term151);
        setField(term159, term159.getClass(), "vars", null);
        setField(term159, term159.getClass(), "parent", null);
        setIntField(term159, term159.getClass(), "depth", 0);
        setField(term159, term159.getClass(), "rootNode", null);
        setField(term159, term159.getClass(), "thisType", null);
        setBooleanField(term159, term159.getClass(), "isBottom", false);
        setField(term159, term159.getClass(), "arguments", null);
        setField(term150, term150.getClass(), "parent", term159);
        setIntField(term150, term150.getClass(), "depth", -1048298087);
        setIntField(term163, term163.getClass(), "type", 0);
        setField(term163, term163.getClass(), "next", null);
        setField(term163, term163.getClass(), "first", null);
        setField(term163, term163.getClass(), "last", null);
        setField(term163, term163.getClass(), "propListHead", null);
        setIntField(term163, term163.getClass(), "sourcePosition", 0);
        setField(term163, term163.getClass(), "jsType", null);
        setField(term163, term163.getClass(), "parent", null);
        setField(term150, term150.getClass(), "rootNode", term163);
        setField(term150, term150.getClass(), "thisType", null);
        setBooleanField(term150, term150.getClass(), "isBottom", false);
        setField(term150, term150.getClass(), "arguments", null);
        setField(term149, term149.getClass(), "jsScope", term150);
        setField(term149, term149.getClass(), "escaped", null);
        setField(term149, term149.getClass(), "cfg", null);
        setField(term149, term149.getClass(), "joinOp", null);
        setField(term149, term149.getClass(), "orderedWorkSet", null);
        term167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term167, term167.getClass(), "type", 292681826);
        setIntField(term169, term169.getClass(), "type", 458147407);
        setIntField(term171, term171.getClass(), "type", -184153539);
        setIntField(term173, term173.getClass(), "type", 493620644);
        setIntField(term175, term175.getClass(), "type", 1328271830);
        setField(term175, term175.getClass(), "next", null);
        setField(term175, term175.getClass(), "first", null);
        setField(term175, term175.getClass(), "last", null);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        setField(term173, term173.getClass(), "next", term175);
        setIntField(term178, term178.getClass(), "type", 1596070772);
        setField(term178, term178.getClass(), "next", null);
        setField(term178, term178.getClass(), "first", null);
        setField(term178, term178.getClass(), "last", term175);
        setField(term178, term178.getClass(), "propListHead", null);
        setIntField(term178, term178.getClass(), "sourcePosition", 0);
        setField(term178, term178.getClass(), "jsType", null);
        setField(term178, term178.getClass(), "parent", null);
        setField(term173, term173.getClass(), "first", term178);
        setField(term173, term173.getClass(), "last", term171);
        setField(term173, term173.getClass(), "propListHead", null);
        setIntField(term173, term173.getClass(), "sourcePosition", 0);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        setField(term171, term171.getClass(), "next", term173);
        setField(term171, term171.getClass(), "first", term175);
        setIntField(term182, term182.getClass(), "type", -1371869594);
        setIntField(term184, term184.getClass(), "type", -2095575670);
        setField(term184, term184.getClass(), "next", null);
        setField(term184, term184.getClass(), "first", term178);
        setField(term184, term184.getClass(), "last", term173);
        setField(term184, term184.getClass(), "propListHead", null);
        setIntField(term184, term184.getClass(), "sourcePosition", 0);
        setField(term184, term184.getClass(), "jsType", null);
        setField(term184, term184.getClass(), "parent", null);
        setField(term182, term182.getClass(), "next", term184);
        setField(term182, term182.getClass(), "first", term169);
        setField(term182, term182.getClass(), "last", term169);
        setField(term182, term182.getClass(), "propListHead", null);
        setIntField(term182, term182.getClass(), "sourcePosition", 0);
        setField(term182, term182.getClass(), "jsType", null);
        setField(term182, term182.getClass(), "parent", null);
        setField(term171, term171.getClass(), "last", term182);
        setField(term171, term171.getClass(), "propListHead", null);
        setIntField(term171, term171.getClass(), "sourcePosition", 0);
        setField(term171, term171.getClass(), "jsType", null);
        setField(term171, term171.getClass(), "parent", null);
        setField(term169, term169.getClass(), "next", term171);
        setIntField(term189, term189.getClass(), "type", 1225272962);
        setField(term189, term189.getClass(), "next", term182);
        setField(term189, term189.getClass(), "first", term184);
        setField(term189, term189.getClass(), "last", term167);
        setField(term189, term189.getClass(), "propListHead", null);
        setIntField(term189, term189.getClass(), "sourcePosition", 0);
        setField(term189, term189.getClass(), "jsType", null);
        setField(term189, term189.getClass(), "parent", null);
        setField(term169, term169.getClass(), "first", term189);
        setField(term169, term169.getClass(), "last", term189);
        setField(term169, term169.getClass(), "propListHead", null);
        setIntField(term169, term169.getClass(), "sourcePosition", 0);
        setField(term169, term169.getClass(), "jsType", null);
        setField(term169, term169.getClass(), "parent", null);
        setField(term167, term167.getClass(), "next", term169);
        setField(term167, term167.getClass(), "first", term173);
        setField(term167, term167.getClass(), "last", term175);
        setField(term167, term167.getClass(), "propListHead", null);
        setIntField(term167, term167.getClass(), "sourcePosition", 0);
        setField(term167, term167.getClass(), "jsType", null);
        setField(term167, term167.getClass(), "parent", null);
        HashMap term197 = new HashMap();
        term194 = newInstance(Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses"));
        Object term195 = newInstance(Class.forName("com.google.common.collect.HashMultimap"));
        setIntField(term195, term195.getClass(), "expectedValuesPerKey", 8);
        setField(term195, term195.getClass(), "map", term197);
        setIntField(term195, term195.getClass(), "totalSize", 0);
        setField(term195, term195.getClass(), "keySet", null);
        setField(term195, term195.getClass(), "multiset", null);
        setField(term195, term195.getClass(), "valuesCollection", null);
        setField(term195, term195.getClass(), "entries", null);
        setField(term195, term195.getClass(), "asMap", null);
        setField(term194, term194.getClass(), "mayUseMap", term195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.MaybeReachingVariableUse$ReachingUses");
        Object[] args = new Object[2];
        args[0] = term167;
        args[1] = term194;
        try {
            callMethod(klass, "flowThrough", argTypes, term149, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


