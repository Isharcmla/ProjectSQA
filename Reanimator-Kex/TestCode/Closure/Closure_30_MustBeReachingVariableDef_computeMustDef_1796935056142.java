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

public class MustBeReachingVariableDef_computeMustDef_1796935056142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38871;
     Object term38941;
     Object term39868;
     Object term39869;

    public MustBeReachingVariableDef_computeMustDef_1796935056142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38871 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term38941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38941, term38941.getClass(), "type", 1265463001);
        setIntField(term39011, term39011.getClass(), "type", -2027534003);
        setIntField(term39081, term39081.getClass(), "type", 1375330971);
        setField(term39081, term39081.getClass(), "first", null);
        setField(term39081, term39081.getClass(), "next", null);
        setField(term39011, term39011.getClass(), "first", term39081);
        setIntField(term39151, term39151.getClass(), "type", 99);
        setField(term39151, term39151.getClass(), "first", null);
        setField(term39151, term39151.getClass(), "next", term39221);
        setField(term39011, term39011.getClass(), "next", term39151);
        setField(term38941, term38941.getClass(), "first", term39011);
        term39868 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term39868, term39868.getClass(), "jsScope", null);
        setField(term39868, term39868.getClass(), "compiler", null);
        setField(term39868, term39868.getClass(), "escaped", null);
        setField(term39868, term39868.getClass(), "cfg", null);
        setField(term39868, term39868.getClass(), "joinOp", null);
        setField(term39868, term39868.getClass(), "orderedWorkSet", null);
        term39869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39869, term39869.getClass(), "type", 1265463001);
        setField(term39869, term39869.getClass(), "next", null);
        setIntField(term39870, term39870.getClass(), "type", -2027534003);
        setIntField(term39871, term39871.getClass(), "type", 99);
        setIntField(term39872, term39872.getClass(), "type", 0);
        setField(term39872, term39872.getClass(), "next", null);
        setField(term39872, term39872.getClass(), "first", null);
        setField(term39872, term39872.getClass(), "last", null);
        setField(term39872, term39872.getClass(), "propListHead", null);
        setIntField(term39872, term39872.getClass(), "sourcePosition", 0);
        setField(term39872, term39872.getClass(), "jsType", null);
        setField(term39872, term39872.getClass(), "parent", null);
        setField(term39871, term39871.getClass(), "next", term39872);
        setField(term39871, term39871.getClass(), "first", null);
        setField(term39871, term39871.getClass(), "last", null);
        setField(term39871, term39871.getClass(), "propListHead", null);
        setIntField(term39871, term39871.getClass(), "sourcePosition", 0);
        setField(term39871, term39871.getClass(), "jsType", null);
        setField(term39871, term39871.getClass(), "parent", null);
        setField(term39870, term39870.getClass(), "next", term39871);
        setIntField(term39873, term39873.getClass(), "type", 1375330971);
        setField(term39873, term39873.getClass(), "next", null);
        setField(term39873, term39873.getClass(), "first", null);
        setField(term39873, term39873.getClass(), "last", null);
        setField(term39873, term39873.getClass(), "propListHead", null);
        setIntField(term39873, term39873.getClass(), "sourcePosition", 0);
        setField(term39873, term39873.getClass(), "jsType", null);
        setField(term39873, term39873.getClass(), "parent", null);
        setField(term39870, term39870.getClass(), "first", term39873);
        setField(term39870, term39870.getClass(), "last", null);
        setField(term39870, term39870.getClass(), "propListHead", null);
        setIntField(term39870, term39870.getClass(), "sourcePosition", 0);
        setField(term39870, term39870.getClass(), "jsType", null);
        setField(term39870, term39870.getClass(), "parent", null);
        setField(term39869, term39869.getClass(), "first", term39870);
        setField(term39869, term39869.getClass(), "last", null);
        setField(term39869, term39869.getClass(), "propListHead", null);
        setIntField(term39869, term39869.getClass(), "sourcePosition", 0);
        setField(term39869, term39869.getClass(), "jsType", null);
        setField(term39869, term39869.getClass(), "parent", null);
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
        args[0] = term38941;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term38871, args);
        assertTrue(recursiveEquals(term38871, term39868));
        assertTrue(recursiveEquals(term38941, term39869));
    }

};


