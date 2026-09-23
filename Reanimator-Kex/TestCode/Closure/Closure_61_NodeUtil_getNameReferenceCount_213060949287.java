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

public class NodeUtil_getNameReferenceCount_213060949287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3114;
     Object term21127;

    public NodeUtil_getNameReferenceCount_213060949287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3114, term3114.getClass(), "type", 44908093);
        setIntField(term3116, term3116.getClass(), "type", 405527523);
        setIntField(term3118, term3118.getClass(), "type", 0);
        setField(term3118, term3118.getClass(), "next", null);
        setField(term3118, term3118.getClass(), "first", null);
        setField(term3118, term3118.getClass(), "last", null);
        setField(term3118, term3118.getClass(), "propListHead", null);
        setIntField(term3118, term3118.getClass(), "sourcePosition", 0);
        setField(term3118, term3118.getClass(), "jsType", null);
        setField(term3118, term3118.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "next", term3118);
        setIntField(term3121, term3121.getClass(), "type", 0);
        setField(term3121, term3121.getClass(), "next", null);
        setField(term3121, term3121.getClass(), "first", null);
        setField(term3121, term3121.getClass(), "last", null);
        setField(term3121, term3121.getClass(), "propListHead", null);
        setIntField(term3121, term3121.getClass(), "sourcePosition", 0);
        setField(term3121, term3121.getClass(), "jsType", null);
        setField(term3121, term3121.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "first", term3121);
        setIntField(term3124, term3124.getClass(), "type", 0);
        setField(term3124, term3124.getClass(), "next", null);
        setField(term3124, term3124.getClass(), "first", null);
        setField(term3124, term3124.getClass(), "last", null);
        setField(term3124, term3124.getClass(), "propListHead", null);
        setIntField(term3124, term3124.getClass(), "sourcePosition", 0);
        setField(term3124, term3124.getClass(), "jsType", null);
        setField(term3124, term3124.getClass(), "parent", null);
        setField(term3116, term3116.getClass(), "last", term3124);
        setField(term3116, term3116.getClass(), "propListHead", null);
        setIntField(term3116, term3116.getClass(), "sourcePosition", 0);
        setField(term3116, term3116.getClass(), "jsType", null);
        setField(term3116, term3116.getClass(), "parent", null);
        setField(term3114, term3114.getClass(), "next", term3116);
        setIntField(term3128, term3128.getClass(), "type", 0);
        setField(term3128, term3128.getClass(), "next", null);
        setField(term3128, term3128.getClass(), "first", null);
        setField(term3128, term3128.getClass(), "last", null);
        setField(term3128, term3128.getClass(), "propListHead", null);
        setIntField(term3128, term3128.getClass(), "sourcePosition", 0);
        setField(term3128, term3128.getClass(), "jsType", null);
        setField(term3128, term3128.getClass(), "parent", null);
        setField(term3114, term3114.getClass(), "first", term3128);
        setIntField(term3131, term3131.getClass(), "type", 0);
        setField(term3131, term3131.getClass(), "next", null);
        setField(term3131, term3131.getClass(), "first", null);
        setField(term3131, term3131.getClass(), "last", null);
        setField(term3131, term3131.getClass(), "propListHead", null);
        setIntField(term3131, term3131.getClass(), "sourcePosition", 0);
        setField(term3131, term3131.getClass(), "jsType", null);
        setField(term3131, term3131.getClass(), "parent", null);
        setField(term3114, term3114.getClass(), "last", term3131);
        setField(term3114, term3114.getClass(), "propListHead", null);
        setIntField(term3114, term3114.getClass(), "sourcePosition", 0);
        setField(term3114, term3114.getClass(), "jsType", null);
        setField(term3114, term3114.getClass(), "parent", null);
        term21127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21127, term21127.getClass(), "type", 44908093);
        setIntField(term21128, term21128.getClass(), "type", 405527523);
        setIntField(term21129, term21129.getClass(), "type", 0);
        setField(term21129, term21129.getClass(), "next", null);
        setField(term21129, term21129.getClass(), "first", null);
        setField(term21129, term21129.getClass(), "last", null);
        setField(term21129, term21129.getClass(), "propListHead", null);
        setIntField(term21129, term21129.getClass(), "sourcePosition", 0);
        setField(term21129, term21129.getClass(), "jsType", null);
        setField(term21129, term21129.getClass(), "parent", null);
        setField(term21128, term21128.getClass(), "next", term21129);
        setIntField(term21130, term21130.getClass(), "type", 0);
        setField(term21130, term21130.getClass(), "next", null);
        setField(term21130, term21130.getClass(), "first", null);
        setField(term21130, term21130.getClass(), "last", null);
        setField(term21130, term21130.getClass(), "propListHead", null);
        setIntField(term21130, term21130.getClass(), "sourcePosition", 0);
        setField(term21130, term21130.getClass(), "jsType", null);
        setField(term21130, term21130.getClass(), "parent", null);
        setField(term21128, term21128.getClass(), "first", term21130);
        setIntField(term21131, term21131.getClass(), "type", 0);
        setField(term21131, term21131.getClass(), "next", null);
        setField(term21131, term21131.getClass(), "first", null);
        setField(term21131, term21131.getClass(), "last", null);
        setField(term21131, term21131.getClass(), "propListHead", null);
        setIntField(term21131, term21131.getClass(), "sourcePosition", 0);
        setField(term21131, term21131.getClass(), "jsType", null);
        setField(term21131, term21131.getClass(), "parent", null);
        setField(term21128, term21128.getClass(), "last", term21131);
        setField(term21128, term21128.getClass(), "propListHead", null);
        setIntField(term21128, term21128.getClass(), "sourcePosition", 0);
        setField(term21128, term21128.getClass(), "jsType", null);
        setField(term21128, term21128.getClass(), "parent", null);
        setField(term21127, term21127.getClass(), "next", term21128);
        setIntField(term21132, term21132.getClass(), "type", 0);
        setField(term21132, term21132.getClass(), "next", null);
        setField(term21132, term21132.getClass(), "first", null);
        setField(term21132, term21132.getClass(), "last", null);
        setField(term21132, term21132.getClass(), "propListHead", null);
        setIntField(term21132, term21132.getClass(), "sourcePosition", 0);
        setField(term21132, term21132.getClass(), "jsType", null);
        setField(term21132, term21132.getClass(), "parent", null);
        setField(term21127, term21127.getClass(), "first", term21132);
        setIntField(term21133, term21133.getClass(), "type", 0);
        setField(term21133, term21133.getClass(), "next", null);
        setField(term21133, term21133.getClass(), "first", null);
        setField(term21133, term21133.getClass(), "last", null);
        setField(term21133, term21133.getClass(), "propListHead", null);
        setIntField(term21133, term21133.getClass(), "sourcePosition", 0);
        setField(term21133, term21133.getClass(), "jsType", null);
        setField(term21133, term21133.getClass(), "parent", null);
        setField(term21127, term21127.getClass(), "last", term21133);
        setField(term21127, term21127.getClass(), "propListHead", null);
        setIntField(term21127, term21127.getClass(), "sourcePosition", 0);
        setField(term21127, term21127.getClass(), "jsType", null);
        setField(term21127, term21127.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3114;
        args[1] = "IoAlmYsBwc";
        Object retValue = callMethod(klass, "getNameReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term3114, "IoAlmYsBwc"));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


