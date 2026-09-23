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
     Object term21312;

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
        term21312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21312, term21312.getClass(), "type", 44908093);
        setIntField(term21313, term21313.getClass(), "type", 405527523);
        setIntField(term21314, term21314.getClass(), "type", 0);
        setField(term21314, term21314.getClass(), "next", null);
        setField(term21314, term21314.getClass(), "first", null);
        setField(term21314, term21314.getClass(), "last", null);
        setField(term21314, term21314.getClass(), "propListHead", null);
        setIntField(term21314, term21314.getClass(), "sourcePosition", 0);
        setField(term21314, term21314.getClass(), "jsType", null);
        setField(term21314, term21314.getClass(), "parent", null);
        setField(term21313, term21313.getClass(), "next", term21314);
        setIntField(term21315, term21315.getClass(), "type", 0);
        setField(term21315, term21315.getClass(), "next", null);
        setField(term21315, term21315.getClass(), "first", null);
        setField(term21315, term21315.getClass(), "last", null);
        setField(term21315, term21315.getClass(), "propListHead", null);
        setIntField(term21315, term21315.getClass(), "sourcePosition", 0);
        setField(term21315, term21315.getClass(), "jsType", null);
        setField(term21315, term21315.getClass(), "parent", null);
        setField(term21313, term21313.getClass(), "first", term21315);
        setIntField(term21316, term21316.getClass(), "type", 0);
        setField(term21316, term21316.getClass(), "next", null);
        setField(term21316, term21316.getClass(), "first", null);
        setField(term21316, term21316.getClass(), "last", null);
        setField(term21316, term21316.getClass(), "propListHead", null);
        setIntField(term21316, term21316.getClass(), "sourcePosition", 0);
        setField(term21316, term21316.getClass(), "jsType", null);
        setField(term21316, term21316.getClass(), "parent", null);
        setField(term21313, term21313.getClass(), "last", term21316);
        setField(term21313, term21313.getClass(), "propListHead", null);
        setIntField(term21313, term21313.getClass(), "sourcePosition", 0);
        setField(term21313, term21313.getClass(), "jsType", null);
        setField(term21313, term21313.getClass(), "parent", null);
        setField(term21312, term21312.getClass(), "next", term21313);
        setIntField(term21317, term21317.getClass(), "type", 0);
        setField(term21317, term21317.getClass(), "next", null);
        setField(term21317, term21317.getClass(), "first", null);
        setField(term21317, term21317.getClass(), "last", null);
        setField(term21317, term21317.getClass(), "propListHead", null);
        setIntField(term21317, term21317.getClass(), "sourcePosition", 0);
        setField(term21317, term21317.getClass(), "jsType", null);
        setField(term21317, term21317.getClass(), "parent", null);
        setField(term21312, term21312.getClass(), "first", term21317);
        setIntField(term21318, term21318.getClass(), "type", 0);
        setField(term21318, term21318.getClass(), "next", null);
        setField(term21318, term21318.getClass(), "first", null);
        setField(term21318, term21318.getClass(), "last", null);
        setField(term21318, term21318.getClass(), "propListHead", null);
        setIntField(term21318, term21318.getClass(), "sourcePosition", 0);
        setField(term21318, term21318.getClass(), "jsType", null);
        setField(term21318, term21318.getClass(), "parent", null);
        setField(term21312, term21312.getClass(), "last", term21318);
        setField(term21312, term21312.getClass(), "propListHead", null);
        setIntField(term21312, term21312.getClass(), "sourcePosition", 0);
        setField(term21312, term21312.getClass(), "jsType", null);
        setField(term21312, term21312.getClass(), "parent", null);
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


