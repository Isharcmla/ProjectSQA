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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isExpressionResultUsed_27795707304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312;

    public NodeUtil_isExpressionResultUsed_27795707304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4312, term4312.getClass(), "type", 680714112);
        setIntField(term4314, term4314.getClass(), "type", 385297023);
        setIntField(term4316, term4316.getClass(), "type", -134092543);
        setIntField(term4318, term4318.getClass(), "type", -1703642288);
        setIntField(term4320, term4320.getClass(), "type", 2075139747);
        setField(term4320, term4320.getClass(), "next", null);
        setField(term4320, term4320.getClass(), "first", null);
        setField(term4320, term4320.getClass(), "last", null);
        setField(term4320, term4320.getClass(), "propListHead", null);
        setIntField(term4320, term4320.getClass(), "sourcePosition", 0);
        setField(term4320, term4320.getClass(), "jsType", null);
        setField(term4320, term4320.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "next", term4320);
        setIntField(term4323, term4323.getClass(), "type", 2092881418);
        setField(term4323, term4323.getClass(), "next", null);
        setField(term4323, term4323.getClass(), "first", null);
        setField(term4323, term4323.getClass(), "last", term4320);
        setField(term4323, term4323.getClass(), "propListHead", null);
        setIntField(term4323, term4323.getClass(), "sourcePosition", 0);
        setField(term4323, term4323.getClass(), "jsType", null);
        setField(term4323, term4323.getClass(), "parent", null);
        setField(term4318, term4318.getClass(), "first", term4323);
        setField(term4318, term4318.getClass(), "last", term4316);
        setField(term4318, term4318.getClass(), "propListHead", null);
        setIntField(term4318, term4318.getClass(), "sourcePosition", 0);
        setField(term4318, term4318.getClass(), "jsType", null);
        setField(term4318, term4318.getClass(), "parent", null);
        setField(term4316, term4316.getClass(), "next", term4318);
        setField(term4316, term4316.getClass(), "first", term4320);
        setIntField(term4327, term4327.getClass(), "type", 1084102599);
        setIntField(term4329, term4329.getClass(), "type", -1743503755);
        setField(term4329, term4329.getClass(), "next", null);
        setField(term4329, term4329.getClass(), "first", term4323);
        setField(term4329, term4329.getClass(), "last", term4318);
        setField(term4329, term4329.getClass(), "propListHead", null);
        setIntField(term4329, term4329.getClass(), "sourcePosition", 0);
        setField(term4329, term4329.getClass(), "jsType", null);
        setField(term4329, term4329.getClass(), "parent", null);
        setField(term4327, term4327.getClass(), "next", term4329);
        setField(term4327, term4327.getClass(), "first", term4314);
        setField(term4327, term4327.getClass(), "last", term4314);
        setField(term4327, term4327.getClass(), "propListHead", null);
        setIntField(term4327, term4327.getClass(), "sourcePosition", 0);
        setField(term4327, term4327.getClass(), "jsType", null);
        setField(term4327, term4327.getClass(), "parent", null);
        setField(term4316, term4316.getClass(), "last", term4327);
        setField(term4316, term4316.getClass(), "propListHead", null);
        setIntField(term4316, term4316.getClass(), "sourcePosition", 0);
        setField(term4316, term4316.getClass(), "jsType", null);
        setField(term4316, term4316.getClass(), "parent", null);
        setField(term4314, term4314.getClass(), "next", term4316);
        setIntField(term4334, term4334.getClass(), "type", 1641342112);
        setField(term4334, term4334.getClass(), "next", term4327);
        setField(term4334, term4334.getClass(), "first", term4329);
        setField(term4334, term4334.getClass(), "last", term4312);
        setField(term4334, term4334.getClass(), "propListHead", null);
        setIntField(term4334, term4334.getClass(), "sourcePosition", 0);
        setField(term4334, term4334.getClass(), "jsType", null);
        setField(term4334, term4334.getClass(), "parent", null);
        setField(term4314, term4314.getClass(), "first", term4334);
        setField(term4314, term4314.getClass(), "last", term4334);
        setField(term4314, term4314.getClass(), "propListHead", null);
        setIntField(term4314, term4314.getClass(), "sourcePosition", 0);
        setField(term4314, term4314.getClass(), "jsType", null);
        setField(term4314, term4314.getClass(), "parent", null);
        setField(term4312, term4312.getClass(), "next", term4314);
        setField(term4312, term4312.getClass(), "first", term4318);
        setField(term4312, term4312.getClass(), "last", term4320);
        setField(term4312, term4312.getClass(), "propListHead", null);
        setIntField(term4312, term4312.getClass(), "sourcePosition", 0);
        setField(term4312, term4312.getClass(), "jsType", null);
        setField(term4312, term4312.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4312;
        try {
            callMethod(klass, "isExpressionResultUsed", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


