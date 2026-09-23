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

public class NodeUtil_getSourceName_466164534234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517;
     Object term20325;

    public NodeUtil_getSourceName_466164534234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3517, term3517.getClass(), "type", -1030167086);
        setIntField(term3519, term3519.getClass(), "type", 1701819905);
        setIntField(term3521, term3521.getClass(), "type", 0);
        setField(term3521, term3521.getClass(), "next", null);
        setField(term3521, term3521.getClass(), "first", null);
        setField(term3521, term3521.getClass(), "last", null);
        setField(term3521, term3521.getClass(), "propListHead", null);
        setIntField(term3521, term3521.getClass(), "sourcePosition", 0);
        setField(term3521, term3521.getClass(), "jsType", null);
        setField(term3521, term3521.getClass(), "parent", null);
        setField(term3519, term3519.getClass(), "next", term3521);
        setIntField(term3524, term3524.getClass(), "type", 0);
        setField(term3524, term3524.getClass(), "next", null);
        setField(term3524, term3524.getClass(), "first", null);
        setField(term3524, term3524.getClass(), "last", null);
        setField(term3524, term3524.getClass(), "propListHead", null);
        setIntField(term3524, term3524.getClass(), "sourcePosition", 0);
        setField(term3524, term3524.getClass(), "jsType", null);
        setField(term3524, term3524.getClass(), "parent", null);
        setField(term3519, term3519.getClass(), "first", term3524);
        setIntField(term3527, term3527.getClass(), "type", 0);
        setField(term3527, term3527.getClass(), "next", null);
        setField(term3527, term3527.getClass(), "first", null);
        setField(term3527, term3527.getClass(), "last", null);
        setField(term3527, term3527.getClass(), "propListHead", null);
        setIntField(term3527, term3527.getClass(), "sourcePosition", 0);
        setField(term3527, term3527.getClass(), "jsType", null);
        setField(term3527, term3527.getClass(), "parent", null);
        setField(term3519, term3519.getClass(), "last", term3527);
        setField(term3530, term3530.getClass(), "next", null);
        setIntField(term3530, term3530.getClass(), "type", 0);
        setIntField(term3530, term3530.getClass(), "intValue", 0);
        setField(term3530, term3530.getClass(), "objectValue", null);
        setField(term3519, term3519.getClass(), "propListHead", term3530);
        setIntField(term3519, term3519.getClass(), "sourcePosition", 1253334988);
        setField(term3519, term3519.getClass(), "jsType", null);
        setField(term3519, term3519.getClass(), "parent", null);
        setField(term3517, term3517.getClass(), "next", term3519);
        setIntField(term3534, term3534.getClass(), "type", 0);
        setField(term3534, term3534.getClass(), "next", null);
        setField(term3534, term3534.getClass(), "first", null);
        setField(term3534, term3534.getClass(), "last", null);
        setField(term3534, term3534.getClass(), "propListHead", null);
        setIntField(term3534, term3534.getClass(), "sourcePosition", 0);
        setField(term3534, term3534.getClass(), "jsType", null);
        setField(term3534, term3534.getClass(), "parent", null);
        setField(term3517, term3517.getClass(), "first", term3534);
        setIntField(term3537, term3537.getClass(), "type", 0);
        setField(term3537, term3537.getClass(), "next", null);
        setField(term3537, term3537.getClass(), "first", null);
        setField(term3537, term3537.getClass(), "last", null);
        setField(term3537, term3537.getClass(), "propListHead", null);
        setIntField(term3537, term3537.getClass(), "sourcePosition", 0);
        setField(term3537, term3537.getClass(), "jsType", null);
        setField(term3537, term3537.getClass(), "parent", null);
        setField(term3517, term3517.getClass(), "last", term3537);
        setField(term3540, term3540.getClass(), "next", null);
        setIntField(term3540, term3540.getClass(), "type", 0);
        setIntField(term3540, term3540.getClass(), "intValue", 0);
        setField(term3540, term3540.getClass(), "objectValue", null);
        setField(term3517, term3517.getClass(), "propListHead", term3540);
        setIntField(term3517, term3517.getClass(), "sourcePosition", 1086709736);
        setField(term3517, term3517.getClass(), "jsType", null);
        setField(term3517, term3517.getClass(), "parent", null);
        term20325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20330 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20333 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20325, term20325.getClass(), "type", -1030167086);
        setIntField(term20326, term20326.getClass(), "type", 1701819905);
        setIntField(term20327, term20327.getClass(), "type", 0);
        setField(term20327, term20327.getClass(), "next", null);
        setField(term20327, term20327.getClass(), "first", null);
        setField(term20327, term20327.getClass(), "last", null);
        setField(term20327, term20327.getClass(), "propListHead", null);
        setIntField(term20327, term20327.getClass(), "sourcePosition", 0);
        setField(term20327, term20327.getClass(), "jsType", null);
        setField(term20327, term20327.getClass(), "parent", null);
        setField(term20326, term20326.getClass(), "next", term20327);
        setIntField(term20328, term20328.getClass(), "type", 0);
        setField(term20328, term20328.getClass(), "next", null);
        setField(term20328, term20328.getClass(), "first", null);
        setField(term20328, term20328.getClass(), "last", null);
        setField(term20328, term20328.getClass(), "propListHead", null);
        setIntField(term20328, term20328.getClass(), "sourcePosition", 0);
        setField(term20328, term20328.getClass(), "jsType", null);
        setField(term20328, term20328.getClass(), "parent", null);
        setField(term20326, term20326.getClass(), "first", term20328);
        setIntField(term20329, term20329.getClass(), "type", 0);
        setField(term20329, term20329.getClass(), "next", null);
        setField(term20329, term20329.getClass(), "first", null);
        setField(term20329, term20329.getClass(), "last", null);
        setField(term20329, term20329.getClass(), "propListHead", null);
        setIntField(term20329, term20329.getClass(), "sourcePosition", 0);
        setField(term20329, term20329.getClass(), "jsType", null);
        setField(term20329, term20329.getClass(), "parent", null);
        setField(term20326, term20326.getClass(), "last", term20329);
        setField(term20330, term20330.getClass(), "next", null);
        setIntField(term20330, term20330.getClass(), "type", 0);
        setIntField(term20330, term20330.getClass(), "intValue", 0);
        setField(term20330, term20330.getClass(), "objectValue", null);
        setField(term20326, term20326.getClass(), "propListHead", term20330);
        setIntField(term20326, term20326.getClass(), "sourcePosition", 1253334988);
        setField(term20326, term20326.getClass(), "jsType", null);
        setField(term20326, term20326.getClass(), "parent", null);
        setField(term20325, term20325.getClass(), "next", term20326);
        setIntField(term20331, term20331.getClass(), "type", 0);
        setField(term20331, term20331.getClass(), "next", null);
        setField(term20331, term20331.getClass(), "first", null);
        setField(term20331, term20331.getClass(), "last", null);
        setField(term20331, term20331.getClass(), "propListHead", null);
        setIntField(term20331, term20331.getClass(), "sourcePosition", 0);
        setField(term20331, term20331.getClass(), "jsType", null);
        setField(term20331, term20331.getClass(), "parent", null);
        setField(term20325, term20325.getClass(), "first", term20331);
        setIntField(term20332, term20332.getClass(), "type", 0);
        setField(term20332, term20332.getClass(), "next", null);
        setField(term20332, term20332.getClass(), "first", null);
        setField(term20332, term20332.getClass(), "last", null);
        setField(term20332, term20332.getClass(), "propListHead", null);
        setIntField(term20332, term20332.getClass(), "sourcePosition", 0);
        setField(term20332, term20332.getClass(), "jsType", null);
        setField(term20332, term20332.getClass(), "parent", null);
        setField(term20325, term20325.getClass(), "last", term20332);
        setField(term20333, term20333.getClass(), "next", null);
        setIntField(term20333, term20333.getClass(), "type", 0);
        setIntField(term20333, term20333.getClass(), "intValue", 0);
        setField(term20333, term20333.getClass(), "objectValue", null);
        setField(term20325, term20325.getClass(), "propListHead", term20333);
        setIntField(term20325, term20325.getClass(), "sourcePosition", 1086709736);
        setField(term20325, term20325.getClass(), "jsType", null);
        setField(term20325, term20325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3517;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term3517, term20325));
    }

};


