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

public class NodeUtil_isNameReferenced_1518412862286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3071;
     Object term21143;

    public NodeUtil_isNameReferenced_1518412862286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3071, term3071.getClass(), "type", -2017073245);
        setIntField(term3073, term3073.getClass(), "type", -758778797);
        setIntField(term3075, term3075.getClass(), "type", 0);
        setField(term3075, term3075.getClass(), "next", null);
        setField(term3075, term3075.getClass(), "first", null);
        setField(term3075, term3075.getClass(), "last", null);
        setField(term3075, term3075.getClass(), "propListHead", null);
        setIntField(term3075, term3075.getClass(), "sourcePosition", 0);
        setField(term3075, term3075.getClass(), "jsType", null);
        setField(term3075, term3075.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "next", term3075);
        setIntField(term3078, term3078.getClass(), "type", 0);
        setField(term3078, term3078.getClass(), "next", null);
        setField(term3078, term3078.getClass(), "first", null);
        setField(term3078, term3078.getClass(), "last", null);
        setField(term3078, term3078.getClass(), "propListHead", null);
        setIntField(term3078, term3078.getClass(), "sourcePosition", 0);
        setField(term3078, term3078.getClass(), "jsType", null);
        setField(term3078, term3078.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "first", term3078);
        setIntField(term3081, term3081.getClass(), "type", 0);
        setField(term3081, term3081.getClass(), "next", null);
        setField(term3081, term3081.getClass(), "first", null);
        setField(term3081, term3081.getClass(), "last", null);
        setField(term3081, term3081.getClass(), "propListHead", null);
        setIntField(term3081, term3081.getClass(), "sourcePosition", 0);
        setField(term3081, term3081.getClass(), "jsType", null);
        setField(term3081, term3081.getClass(), "parent", null);
        setField(term3073, term3073.getClass(), "last", term3081);
        setField(term3073, term3073.getClass(), "propListHead", null);
        setIntField(term3073, term3073.getClass(), "sourcePosition", 0);
        setField(term3073, term3073.getClass(), "jsType", null);
        setField(term3073, term3073.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "next", term3073);
        setIntField(term3085, term3085.getClass(), "type", 0);
        setField(term3085, term3085.getClass(), "next", null);
        setField(term3085, term3085.getClass(), "first", null);
        setField(term3085, term3085.getClass(), "last", null);
        setField(term3085, term3085.getClass(), "propListHead", null);
        setIntField(term3085, term3085.getClass(), "sourcePosition", 0);
        setField(term3085, term3085.getClass(), "jsType", null);
        setField(term3085, term3085.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "first", term3085);
        setIntField(term3088, term3088.getClass(), "type", 0);
        setField(term3088, term3088.getClass(), "next", null);
        setField(term3088, term3088.getClass(), "first", null);
        setField(term3088, term3088.getClass(), "last", null);
        setField(term3088, term3088.getClass(), "propListHead", null);
        setIntField(term3088, term3088.getClass(), "sourcePosition", 0);
        setField(term3088, term3088.getClass(), "jsType", null);
        setField(term3088, term3088.getClass(), "parent", null);
        setField(term3071, term3071.getClass(), "last", term3088);
        setField(term3071, term3071.getClass(), "propListHead", null);
        setIntField(term3071, term3071.getClass(), "sourcePosition", 0);
        setField(term3071, term3071.getClass(), "jsType", null);
        setField(term3071, term3071.getClass(), "parent", null);
        term21143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21143, term21143.getClass(), "type", -2017073245);
        setIntField(term21144, term21144.getClass(), "type", -758778797);
        setIntField(term21145, term21145.getClass(), "type", 0);
        setField(term21145, term21145.getClass(), "next", null);
        setField(term21145, term21145.getClass(), "first", null);
        setField(term21145, term21145.getClass(), "last", null);
        setField(term21145, term21145.getClass(), "propListHead", null);
        setIntField(term21145, term21145.getClass(), "sourcePosition", 0);
        setField(term21145, term21145.getClass(), "jsType", null);
        setField(term21145, term21145.getClass(), "parent", null);
        setField(term21144, term21144.getClass(), "next", term21145);
        setIntField(term21146, term21146.getClass(), "type", 0);
        setField(term21146, term21146.getClass(), "next", null);
        setField(term21146, term21146.getClass(), "first", null);
        setField(term21146, term21146.getClass(), "last", null);
        setField(term21146, term21146.getClass(), "propListHead", null);
        setIntField(term21146, term21146.getClass(), "sourcePosition", 0);
        setField(term21146, term21146.getClass(), "jsType", null);
        setField(term21146, term21146.getClass(), "parent", null);
        setField(term21144, term21144.getClass(), "first", term21146);
        setIntField(term21147, term21147.getClass(), "type", 0);
        setField(term21147, term21147.getClass(), "next", null);
        setField(term21147, term21147.getClass(), "first", null);
        setField(term21147, term21147.getClass(), "last", null);
        setField(term21147, term21147.getClass(), "propListHead", null);
        setIntField(term21147, term21147.getClass(), "sourcePosition", 0);
        setField(term21147, term21147.getClass(), "jsType", null);
        setField(term21147, term21147.getClass(), "parent", null);
        setField(term21144, term21144.getClass(), "last", term21147);
        setField(term21144, term21144.getClass(), "propListHead", null);
        setIntField(term21144, term21144.getClass(), "sourcePosition", 0);
        setField(term21144, term21144.getClass(), "jsType", null);
        setField(term21144, term21144.getClass(), "parent", null);
        setField(term21143, term21143.getClass(), "next", term21144);
        setIntField(term21148, term21148.getClass(), "type", 0);
        setField(term21148, term21148.getClass(), "next", null);
        setField(term21148, term21148.getClass(), "first", null);
        setField(term21148, term21148.getClass(), "last", null);
        setField(term21148, term21148.getClass(), "propListHead", null);
        setIntField(term21148, term21148.getClass(), "sourcePosition", 0);
        setField(term21148, term21148.getClass(), "jsType", null);
        setField(term21148, term21148.getClass(), "parent", null);
        setField(term21143, term21143.getClass(), "first", term21148);
        setIntField(term21149, term21149.getClass(), "type", 0);
        setField(term21149, term21149.getClass(), "next", null);
        setField(term21149, term21149.getClass(), "first", null);
        setField(term21149, term21149.getClass(), "last", null);
        setField(term21149, term21149.getClass(), "propListHead", null);
        setIntField(term21149, term21149.getClass(), "sourcePosition", 0);
        setField(term21149, term21149.getClass(), "jsType", null);
        setField(term21149, term21149.getClass(), "parent", null);
        setField(term21143, term21143.getClass(), "last", term21149);
        setField(term21143, term21143.getClass(), "propListHead", null);
        setIntField(term21143, term21143.getClass(), "sourcePosition", 0);
        setField(term21143, term21143.getClass(), "jsType", null);
        setField(term21143, term21143.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3071;
        args[1] = "OclPbYPkcH";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term3071, "OclPbYPkcH"));
    }

};


