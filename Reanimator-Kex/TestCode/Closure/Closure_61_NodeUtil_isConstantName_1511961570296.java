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

public class NodeUtil_isConstantName_1511961570296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;
     Object term23298;

    public NodeUtil_isConstantName_1511961570296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3325, term3325.getClass(), "type", -355505521);
        setIntField(term3327, term3327.getClass(), "type", -1268483887);
        setIntField(term3329, term3329.getClass(), "type", 0);
        setField(term3329, term3329.getClass(), "next", null);
        setField(term3329, term3329.getClass(), "first", null);
        setField(term3329, term3329.getClass(), "last", null);
        setField(term3329, term3329.getClass(), "propListHead", null);
        setIntField(term3329, term3329.getClass(), "sourcePosition", 0);
        setField(term3329, term3329.getClass(), "jsType", null);
        setField(term3329, term3329.getClass(), "parent", null);
        setField(term3327, term3327.getClass(), "next", term3329);
        setIntField(term3332, term3332.getClass(), "type", 0);
        setField(term3332, term3332.getClass(), "next", null);
        setField(term3332, term3332.getClass(), "first", null);
        setField(term3332, term3332.getClass(), "last", null);
        setField(term3332, term3332.getClass(), "propListHead", null);
        setIntField(term3332, term3332.getClass(), "sourcePosition", 0);
        setField(term3332, term3332.getClass(), "jsType", null);
        setField(term3332, term3332.getClass(), "parent", null);
        setField(term3327, term3327.getClass(), "first", term3332);
        setIntField(term3335, term3335.getClass(), "type", 0);
        setField(term3335, term3335.getClass(), "next", null);
        setField(term3335, term3335.getClass(), "first", null);
        setField(term3335, term3335.getClass(), "last", null);
        setField(term3335, term3335.getClass(), "propListHead", null);
        setIntField(term3335, term3335.getClass(), "sourcePosition", 0);
        setField(term3335, term3335.getClass(), "jsType", null);
        setField(term3335, term3335.getClass(), "parent", null);
        setField(term3327, term3327.getClass(), "last", term3335);
        setField(term3327, term3327.getClass(), "propListHead", null);
        setIntField(term3327, term3327.getClass(), "sourcePosition", 0);
        setField(term3327, term3327.getClass(), "jsType", null);
        setField(term3327, term3327.getClass(), "parent", null);
        setField(term3325, term3325.getClass(), "next", term3327);
        setIntField(term3339, term3339.getClass(), "type", 0);
        setField(term3339, term3339.getClass(), "next", null);
        setField(term3339, term3339.getClass(), "first", null);
        setField(term3339, term3339.getClass(), "last", null);
        setField(term3339, term3339.getClass(), "propListHead", null);
        setIntField(term3339, term3339.getClass(), "sourcePosition", 0);
        setField(term3339, term3339.getClass(), "jsType", null);
        setField(term3339, term3339.getClass(), "parent", null);
        setField(term3325, term3325.getClass(), "first", term3339);
        setIntField(term3342, term3342.getClass(), "type", 0);
        setField(term3342, term3342.getClass(), "next", null);
        setField(term3342, term3342.getClass(), "first", null);
        setField(term3342, term3342.getClass(), "last", null);
        setField(term3342, term3342.getClass(), "propListHead", null);
        setIntField(term3342, term3342.getClass(), "sourcePosition", 0);
        setField(term3342, term3342.getClass(), "jsType", null);
        setField(term3342, term3342.getClass(), "parent", null);
        setField(term3325, term3325.getClass(), "last", term3342);
        setField(term3325, term3325.getClass(), "propListHead", null);
        setIntField(term3325, term3325.getClass(), "sourcePosition", 0);
        setField(term3325, term3325.getClass(), "jsType", null);
        setField(term3325, term3325.getClass(), "parent", null);
        term23298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23298, term23298.getClass(), "type", -355505521);
        setIntField(term23299, term23299.getClass(), "type", -1268483887);
        setIntField(term23300, term23300.getClass(), "type", 0);
        setField(term23300, term23300.getClass(), "next", null);
        setField(term23300, term23300.getClass(), "first", null);
        setField(term23300, term23300.getClass(), "last", null);
        setField(term23300, term23300.getClass(), "propListHead", null);
        setIntField(term23300, term23300.getClass(), "sourcePosition", 0);
        setField(term23300, term23300.getClass(), "jsType", null);
        setField(term23300, term23300.getClass(), "parent", null);
        setField(term23299, term23299.getClass(), "next", term23300);
        setIntField(term23301, term23301.getClass(), "type", 0);
        setField(term23301, term23301.getClass(), "next", null);
        setField(term23301, term23301.getClass(), "first", null);
        setField(term23301, term23301.getClass(), "last", null);
        setField(term23301, term23301.getClass(), "propListHead", null);
        setIntField(term23301, term23301.getClass(), "sourcePosition", 0);
        setField(term23301, term23301.getClass(), "jsType", null);
        setField(term23301, term23301.getClass(), "parent", null);
        setField(term23299, term23299.getClass(), "first", term23301);
        setIntField(term23302, term23302.getClass(), "type", 0);
        setField(term23302, term23302.getClass(), "next", null);
        setField(term23302, term23302.getClass(), "first", null);
        setField(term23302, term23302.getClass(), "last", null);
        setField(term23302, term23302.getClass(), "propListHead", null);
        setIntField(term23302, term23302.getClass(), "sourcePosition", 0);
        setField(term23302, term23302.getClass(), "jsType", null);
        setField(term23302, term23302.getClass(), "parent", null);
        setField(term23299, term23299.getClass(), "last", term23302);
        setField(term23299, term23299.getClass(), "propListHead", null);
        setIntField(term23299, term23299.getClass(), "sourcePosition", 0);
        setField(term23299, term23299.getClass(), "jsType", null);
        setField(term23299, term23299.getClass(), "parent", null);
        setField(term23298, term23298.getClass(), "next", term23299);
        setIntField(term23303, term23303.getClass(), "type", 0);
        setField(term23303, term23303.getClass(), "next", null);
        setField(term23303, term23303.getClass(), "first", null);
        setField(term23303, term23303.getClass(), "last", null);
        setField(term23303, term23303.getClass(), "propListHead", null);
        setIntField(term23303, term23303.getClass(), "sourcePosition", 0);
        setField(term23303, term23303.getClass(), "jsType", null);
        setField(term23303, term23303.getClass(), "parent", null);
        setField(term23298, term23298.getClass(), "first", term23303);
        setIntField(term23304, term23304.getClass(), "type", 0);
        setField(term23304, term23304.getClass(), "next", null);
        setField(term23304, term23304.getClass(), "first", null);
        setField(term23304, term23304.getClass(), "last", null);
        setField(term23304, term23304.getClass(), "propListHead", null);
        setIntField(term23304, term23304.getClass(), "sourcePosition", 0);
        setField(term23304, term23304.getClass(), "jsType", null);
        setField(term23304, term23304.getClass(), "parent", null);
        setField(term23298, term23298.getClass(), "last", term23304);
        setField(term23298, term23298.getClass(), "propListHead", null);
        setIntField(term23298, term23298.getClass(), "sourcePosition", 0);
        setField(term23298, term23298.getClass(), "jsType", null);
        setField(term23298, term23298.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3325;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term3325, term23298));
    }

};


