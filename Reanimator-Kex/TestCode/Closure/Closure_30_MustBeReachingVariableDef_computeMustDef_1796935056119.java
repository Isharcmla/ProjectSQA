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

public class MustBeReachingVariableDef_computeMustDef_1796935056119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31909;
     Object term32001;
     Object term33328;
     Object term33329;

    public MustBeReachingVariableDef_computeMustDef_1796935056119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31909 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term32001 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32093 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term32369 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term32001, term32001.getClass(), "type", 1265463001);
        setIntField(term32093, term32093.getClass(), "type", -2027534003);
        setIntField(term32185, term32185.getClass(), "type", 1375330971);
        setField(term32185, term32185.getClass(), "first", null);
        setField(term32185, term32185.getClass(), "next", null);
        setField(term32093, term32093.getClass(), "first", term32185);
        setIntField(term32277, term32277.getClass(), "type", 0);
        setField(term32277, term32277.getClass(), "first", null);
        setField(term32277, term32277.getClass(), "next", term32369);
        setField(term32093, term32093.getClass(), "next", term32277);
        setField(term32001, term32001.getClass(), "first", term32093);
        term33328 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term33328, term33328.getClass(), "jsScope", null);
        setField(term33328, term33328.getClass(), "compiler", null);
        setField(term33328, term33328.getClass(), "escaped", null);
        setField(term33328, term33328.getClass(), "cfg", null);
        setField(term33328, term33328.getClass(), "joinOp", null);
        setField(term33328, term33328.getClass(), "orderedWorkSet", null);
        term33329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33330 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33331 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term33329, term33329.getClass(), "str", null);
        setIntField(term33329, term33329.getClass(), "type", 1265463001);
        setField(term33329, term33329.getClass(), "next", null);
        setField(term33330, term33330.getClass(), "str", null);
        setIntField(term33330, term33330.getClass(), "type", -2027534003);
        setField(term33331, term33331.getClass(), "str", null);
        setIntField(term33331, term33331.getClass(), "type", 0);
        setField(term33332, term33332.getClass(), "str", null);
        setIntField(term33332, term33332.getClass(), "type", 0);
        setField(term33332, term33332.getClass(), "next", null);
        setField(term33332, term33332.getClass(), "first", null);
        setField(term33332, term33332.getClass(), "last", null);
        setField(term33332, term33332.getClass(), "propListHead", null);
        setIntField(term33332, term33332.getClass(), "sourcePosition", 0);
        setField(term33332, term33332.getClass(), "jsType", null);
        setField(term33332, term33332.getClass(), "parent", null);
        setField(term33331, term33331.getClass(), "next", term33332);
        setField(term33331, term33331.getClass(), "first", null);
        setField(term33331, term33331.getClass(), "last", null);
        setField(term33331, term33331.getClass(), "propListHead", null);
        setIntField(term33331, term33331.getClass(), "sourcePosition", 0);
        setField(term33331, term33331.getClass(), "jsType", null);
        setField(term33331, term33331.getClass(), "parent", null);
        setField(term33330, term33330.getClass(), "next", term33331);
        setField(term33333, term33333.getClass(), "str", null);
        setIntField(term33333, term33333.getClass(), "type", 1375330971);
        setField(term33333, term33333.getClass(), "next", null);
        setField(term33333, term33333.getClass(), "first", null);
        setField(term33333, term33333.getClass(), "last", null);
        setField(term33333, term33333.getClass(), "propListHead", null);
        setIntField(term33333, term33333.getClass(), "sourcePosition", 0);
        setField(term33333, term33333.getClass(), "jsType", null);
        setField(term33333, term33333.getClass(), "parent", null);
        setField(term33330, term33330.getClass(), "first", term33333);
        setField(term33330, term33330.getClass(), "last", null);
        setField(term33330, term33330.getClass(), "propListHead", null);
        setIntField(term33330, term33330.getClass(), "sourcePosition", 0);
        setField(term33330, term33330.getClass(), "jsType", null);
        setField(term33330, term33330.getClass(), "parent", null);
        setField(term33329, term33329.getClass(), "first", term33330);
        setField(term33329, term33329.getClass(), "last", null);
        setField(term33329, term33329.getClass(), "propListHead", null);
        setIntField(term33329, term33329.getClass(), "sourcePosition", 0);
        setField(term33329, term33329.getClass(), "jsType", null);
        setField(term33329, term33329.getClass(), "parent", null);
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
        args[0] = term32001;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term31909, args);
        assertTrue(recursiveEquals(term31909, term33328));
        assertTrue(recursiveEquals(term32001, term33329));
    }

};


