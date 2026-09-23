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

public class MustBeReachingVariableDef_isForward_8725232913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term1361;

    public MustBeReachingVariableDef_isForward_8725232913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term97 = new HashMap();
        term95 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term96 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term105 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96, term96.getClass(), "vars", term97);
        setField(term105, term105.getClass(), "vars", null);
        setField(term105, term105.getClass(), "parent", null);
        setIntField(term105, term105.getClass(), "depth", 0);
        setField(term105, term105.getClass(), "rootNode", null);
        setField(term105, term105.getClass(), "thisType", null);
        setBooleanField(term105, term105.getClass(), "isBottom", false);
        setField(term105, term105.getClass(), "arguments", null);
        setField(term96, term96.getClass(), "parent", term105);
        setIntField(term96, term96.getClass(), "depth", -203030934);
        setIntField(term109, term109.getClass(), "type", 0);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", null);
        setField(term109, term109.getClass(), "last", null);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term96, term96.getClass(), "rootNode", term109);
        setField(term96, term96.getClass(), "thisType", null);
        setBooleanField(term96, term96.getClass(), "isBottom", false);
        setField(term96, term96.getClass(), "arguments", null);
        setField(term95, term95.getClass(), "jsScope", term96);
        setField(term95, term95.getClass(), "compiler", null);
        setField(term95, term95.getClass(), "escaped", null);
        setField(term95, term95.getClass(), "cfg", null);
        setField(term95, term95.getClass(), "joinOp", null);
        setField(term95, term95.getClass(), "orderedWorkSet", null);
        HashMap term1363 = new HashMap();
        term1361 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term1362 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1364 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1362, term1362.getClass(), "vars", term1363);
        setField(term1364, term1364.getClass(), "vars", null);
        setField(term1364, term1364.getClass(), "parent", null);
        setIntField(term1364, term1364.getClass(), "depth", 0);
        setField(term1364, term1364.getClass(), "rootNode", null);
        setField(term1364, term1364.getClass(), "thisType", null);
        setBooleanField(term1364, term1364.getClass(), "isBottom", false);
        setField(term1364, term1364.getClass(), "arguments", null);
        setField(term1362, term1362.getClass(), "parent", term1364);
        setIntField(term1362, term1362.getClass(), "depth", -203030934);
        setIntField(term1365, term1365.getClass(), "type", 0);
        setField(term1365, term1365.getClass(), "next", null);
        setField(term1365, term1365.getClass(), "first", null);
        setField(term1365, term1365.getClass(), "last", null);
        setField(term1365, term1365.getClass(), "propListHead", null);
        setIntField(term1365, term1365.getClass(), "sourcePosition", 0);
        setField(term1365, term1365.getClass(), "jsType", null);
        setField(term1365, term1365.getClass(), "parent", null);
        setField(term1362, term1362.getClass(), "rootNode", term1365);
        setField(term1362, term1362.getClass(), "thisType", null);
        setBooleanField(term1362, term1362.getClass(), "isBottom", false);
        setField(term1362, term1362.getClass(), "arguments", null);
        setField(term1361, term1361.getClass(), "jsScope", term1362);
        setField(term1361, term1361.getClass(), "compiler", null);
        setField(term1361, term1361.getClass(), "escaped", null);
        setField(term1361, term1361.getClass(), "cfg", null);
        setField(term1361, term1361.getClass(), "joinOp", null);
        setField(term1361, term1361.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isForward", argTypes, term95, args);
        assertTrue(recursiveEquals(term95, term1361));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


