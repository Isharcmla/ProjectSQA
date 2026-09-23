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
     Object term23483;

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
        term23483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23483, term23483.getClass(), "type", -355505521);
        setIntField(term23484, term23484.getClass(), "type", -1268483887);
        setIntField(term23485, term23485.getClass(), "type", 0);
        setField(term23485, term23485.getClass(), "next", null);
        setField(term23485, term23485.getClass(), "first", null);
        setField(term23485, term23485.getClass(), "last", null);
        setField(term23485, term23485.getClass(), "propListHead", null);
        setIntField(term23485, term23485.getClass(), "sourcePosition", 0);
        setField(term23485, term23485.getClass(), "jsType", null);
        setField(term23485, term23485.getClass(), "parent", null);
        setField(term23484, term23484.getClass(), "next", term23485);
        setIntField(term23486, term23486.getClass(), "type", 0);
        setField(term23486, term23486.getClass(), "next", null);
        setField(term23486, term23486.getClass(), "first", null);
        setField(term23486, term23486.getClass(), "last", null);
        setField(term23486, term23486.getClass(), "propListHead", null);
        setIntField(term23486, term23486.getClass(), "sourcePosition", 0);
        setField(term23486, term23486.getClass(), "jsType", null);
        setField(term23486, term23486.getClass(), "parent", null);
        setField(term23484, term23484.getClass(), "first", term23486);
        setIntField(term23487, term23487.getClass(), "type", 0);
        setField(term23487, term23487.getClass(), "next", null);
        setField(term23487, term23487.getClass(), "first", null);
        setField(term23487, term23487.getClass(), "last", null);
        setField(term23487, term23487.getClass(), "propListHead", null);
        setIntField(term23487, term23487.getClass(), "sourcePosition", 0);
        setField(term23487, term23487.getClass(), "jsType", null);
        setField(term23487, term23487.getClass(), "parent", null);
        setField(term23484, term23484.getClass(), "last", term23487);
        setField(term23484, term23484.getClass(), "propListHead", null);
        setIntField(term23484, term23484.getClass(), "sourcePosition", 0);
        setField(term23484, term23484.getClass(), "jsType", null);
        setField(term23484, term23484.getClass(), "parent", null);
        setField(term23483, term23483.getClass(), "next", term23484);
        setIntField(term23488, term23488.getClass(), "type", 0);
        setField(term23488, term23488.getClass(), "next", null);
        setField(term23488, term23488.getClass(), "first", null);
        setField(term23488, term23488.getClass(), "last", null);
        setField(term23488, term23488.getClass(), "propListHead", null);
        setIntField(term23488, term23488.getClass(), "sourcePosition", 0);
        setField(term23488, term23488.getClass(), "jsType", null);
        setField(term23488, term23488.getClass(), "parent", null);
        setField(term23483, term23483.getClass(), "first", term23488);
        setIntField(term23489, term23489.getClass(), "type", 0);
        setField(term23489, term23489.getClass(), "next", null);
        setField(term23489, term23489.getClass(), "first", null);
        setField(term23489, term23489.getClass(), "last", null);
        setField(term23489, term23489.getClass(), "propListHead", null);
        setIntField(term23489, term23489.getClass(), "sourcePosition", 0);
        setField(term23489, term23489.getClass(), "jsType", null);
        setField(term23489, term23489.getClass(), "parent", null);
        setField(term23483, term23483.getClass(), "last", term23489);
        setField(term23483, term23483.getClass(), "propListHead", null);
        setIntField(term23483, term23483.getClass(), "sourcePosition", 0);
        setField(term23483, term23483.getClass(), "jsType", null);
        setField(term23483, term23483.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3325;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term3325, term23483));
    }

};


