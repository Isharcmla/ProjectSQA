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

public class MustBeReachingVariableDef_computeMustDef_1796935056158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44201;
     Object term44271;
     Object term45171;
     Object term45172;

    public MustBeReachingVariableDef_computeMustDef_1796935056158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44201 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term44271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44271, term44271.getClass(), "type", 1265463001);
        setIntField(term44341, term44341.getClass(), "type", -2027534003);
        setIntField(term44411, term44411.getClass(), "type", 1375330971);
        setField(term44411, term44411.getClass(), "first", null);
        setField(term44411, term44411.getClass(), "next", null);
        setField(term44341, term44341.getClass(), "first", term44411);
        setIntField(term44481, term44481.getClass(), "type", 110);
        setField(term44481, term44481.getClass(), "first", null);
        setField(term44481, term44481.getClass(), "next", term44551);
        setField(term44341, term44341.getClass(), "next", term44481);
        setField(term44271, term44271.getClass(), "first", term44341);
        term45171 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term45171, term45171.getClass(), "jsScope", null);
        setField(term45171, term45171.getClass(), "compiler", null);
        setField(term45171, term45171.getClass(), "escaped", null);
        setField(term45171, term45171.getClass(), "cfg", null);
        setField(term45171, term45171.getClass(), "joinOp", null);
        setField(term45171, term45171.getClass(), "orderedWorkSet", null);
        term45172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45172, term45172.getClass(), "type", 1265463001);
        setField(term45172, term45172.getClass(), "next", null);
        setIntField(term45173, term45173.getClass(), "type", -2027534003);
        setIntField(term45174, term45174.getClass(), "type", 110);
        setIntField(term45175, term45175.getClass(), "type", 0);
        setField(term45175, term45175.getClass(), "next", null);
        setField(term45175, term45175.getClass(), "first", null);
        setField(term45175, term45175.getClass(), "last", null);
        setField(term45175, term45175.getClass(), "propListHead", null);
        setIntField(term45175, term45175.getClass(), "sourcePosition", 0);
        setField(term45175, term45175.getClass(), "jsType", null);
        setField(term45175, term45175.getClass(), "parent", null);
        setField(term45174, term45174.getClass(), "next", term45175);
        setField(term45174, term45174.getClass(), "first", null);
        setField(term45174, term45174.getClass(), "last", null);
        setField(term45174, term45174.getClass(), "propListHead", null);
        setIntField(term45174, term45174.getClass(), "sourcePosition", 0);
        setField(term45174, term45174.getClass(), "jsType", null);
        setField(term45174, term45174.getClass(), "parent", null);
        setField(term45173, term45173.getClass(), "next", term45174);
        setIntField(term45176, term45176.getClass(), "type", 1375330971);
        setField(term45176, term45176.getClass(), "next", null);
        setField(term45176, term45176.getClass(), "first", null);
        setField(term45176, term45176.getClass(), "last", null);
        setField(term45176, term45176.getClass(), "propListHead", null);
        setIntField(term45176, term45176.getClass(), "sourcePosition", 0);
        setField(term45176, term45176.getClass(), "jsType", null);
        setField(term45176, term45176.getClass(), "parent", null);
        setField(term45173, term45173.getClass(), "first", term45176);
        setField(term45173, term45173.getClass(), "last", null);
        setField(term45173, term45173.getClass(), "propListHead", null);
        setIntField(term45173, term45173.getClass(), "sourcePosition", 0);
        setField(term45173, term45173.getClass(), "jsType", null);
        setField(term45173, term45173.getClass(), "parent", null);
        setField(term45172, term45172.getClass(), "first", term45173);
        setField(term45172, term45172.getClass(), "last", null);
        setField(term45172, term45172.getClass(), "propListHead", null);
        setIntField(term45172, term45172.getClass(), "sourcePosition", 0);
        setField(term45172, term45172.getClass(), "jsType", null);
        setField(term45172, term45172.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term44271;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term44201, args);
        assertTrue(recursiveEquals(term44201, term45171));
        assertTrue(recursiveEquals(term44271, term45172));
    }

};


