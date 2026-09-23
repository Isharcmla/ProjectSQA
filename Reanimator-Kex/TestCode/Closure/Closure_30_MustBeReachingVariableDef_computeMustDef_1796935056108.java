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

public class MustBeReachingVariableDef_computeMustDef_1796935056108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29353;
     Object term29423;
     Object term30004;
     Object term30005;

    public MustBeReachingVariableDef_computeMustDef_1796935056108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29353 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term29423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29423, term29423.getClass(), "type", 1265463001);
        setIntField(term29493, term29493.getClass(), "type", -2027534003);
        setIntField(term29563, term29563.getClass(), "type", 109);
        setField(term29493, term29493.getClass(), "first", term29563);
        setField(term29423, term29423.getClass(), "first", term29493);
        term30004 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term30004, term30004.getClass(), "jsScope", null);
        setField(term30004, term30004.getClass(), "compiler", null);
        setField(term30004, term30004.getClass(), "escaped", null);
        setField(term30004, term30004.getClass(), "cfg", null);
        setField(term30004, term30004.getClass(), "joinOp", null);
        setField(term30004, term30004.getClass(), "orderedWorkSet", null);
        term30005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30005, term30005.getClass(), "type", 1265463001);
        setField(term30005, term30005.getClass(), "next", null);
        setIntField(term30006, term30006.getClass(), "type", -2027534003);
        setField(term30006, term30006.getClass(), "next", null);
        setIntField(term30007, term30007.getClass(), "type", 109);
        setField(term30007, term30007.getClass(), "next", null);
        setField(term30007, term30007.getClass(), "first", null);
        setField(term30007, term30007.getClass(), "last", null);
        setField(term30007, term30007.getClass(), "propListHead", null);
        setIntField(term30007, term30007.getClass(), "sourcePosition", 0);
        setField(term30007, term30007.getClass(), "jsType", null);
        setField(term30007, term30007.getClass(), "parent", null);
        setField(term30006, term30006.getClass(), "first", term30007);
        setField(term30006, term30006.getClass(), "last", null);
        setField(term30006, term30006.getClass(), "propListHead", null);
        setIntField(term30006, term30006.getClass(), "sourcePosition", 0);
        setField(term30006, term30006.getClass(), "jsType", null);
        setField(term30006, term30006.getClass(), "parent", null);
        setField(term30005, term30005.getClass(), "first", term30006);
        setField(term30005, term30005.getClass(), "last", null);
        setField(term30005, term30005.getClass(), "propListHead", null);
        setIntField(term30005, term30005.getClass(), "sourcePosition", 0);
        setField(term30005, term30005.getClass(), "jsType", null);
        setField(term30005, term30005.getClass(), "parent", null);
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
        args[0] = term29423;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term29353, args);
        assertTrue(recursiveEquals(term29353, term30004));
        assertTrue(recursiveEquals(term29423, term30005));
    }

};


