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
import java.lang.Object;
import java.lang.Integer;

public class NodeUtil_getArgumentForCallOrNew_856557483297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4121;
     Object term4148;

    public NodeUtil_getArgumentForCallOrNew_856557483297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4121, term4121.getClass(), "type", -1443680397);
        setIntField(term4123, term4123.getClass(), "type", -1331169079);
        setIntField(term4125, term4125.getClass(), "type", 1109050836);
        setIntField(term4127, term4127.getClass(), "type", 1978065000);
        setIntField(term4129, term4129.getClass(), "type", -2121133707);
        setField(term4129, term4129.getClass(), "next", null);
        setField(term4129, term4129.getClass(), "first", null);
        setField(term4129, term4129.getClass(), "last", null);
        setField(term4129, term4129.getClass(), "propListHead", null);
        setIntField(term4129, term4129.getClass(), "sourcePosition", 0);
        setField(term4129, term4129.getClass(), "jsType", null);
        setField(term4129, term4129.getClass(), "parent", null);
        setField(term4127, term4127.getClass(), "next", term4129);
        setIntField(term4132, term4132.getClass(), "type", -1005498887);
        setField(term4132, term4132.getClass(), "next", null);
        setField(term4132, term4132.getClass(), "first", null);
        setField(term4132, term4132.getClass(), "last", term4129);
        setField(term4132, term4132.getClass(), "propListHead", null);
        setIntField(term4132, term4132.getClass(), "sourcePosition", 0);
        setField(term4132, term4132.getClass(), "jsType", null);
        setField(term4132, term4132.getClass(), "parent", null);
        setField(term4127, term4127.getClass(), "first", term4132);
        setField(term4127, term4127.getClass(), "last", term4125);
        setField(term4127, term4127.getClass(), "propListHead", null);
        setIntField(term4127, term4127.getClass(), "sourcePosition", 0);
        setField(term4127, term4127.getClass(), "jsType", null);
        setField(term4127, term4127.getClass(), "parent", null);
        setField(term4125, term4125.getClass(), "next", term4127);
        setField(term4125, term4125.getClass(), "first", term4129);
        setIntField(term4136, term4136.getClass(), "type", -1825382367);
        setIntField(term4138, term4138.getClass(), "type", -1791371074);
        setField(term4138, term4138.getClass(), "next", null);
        setField(term4138, term4138.getClass(), "first", term4132);
        setField(term4138, term4138.getClass(), "last", term4127);
        setField(term4138, term4138.getClass(), "propListHead", null);
        setIntField(term4138, term4138.getClass(), "sourcePosition", 0);
        setField(term4138, term4138.getClass(), "jsType", null);
        setField(term4138, term4138.getClass(), "parent", null);
        setField(term4136, term4136.getClass(), "next", term4138);
        setField(term4136, term4136.getClass(), "first", term4123);
        setField(term4136, term4136.getClass(), "last", term4123);
        setField(term4136, term4136.getClass(), "propListHead", null);
        setIntField(term4136, term4136.getClass(), "sourcePosition", 0);
        setField(term4136, term4136.getClass(), "jsType", null);
        setField(term4136, term4136.getClass(), "parent", null);
        setField(term4125, term4125.getClass(), "last", term4136);
        setField(term4125, term4125.getClass(), "propListHead", null);
        setIntField(term4125, term4125.getClass(), "sourcePosition", 0);
        setField(term4125, term4125.getClass(), "jsType", null);
        setField(term4125, term4125.getClass(), "parent", null);
        setField(term4123, term4123.getClass(), "next", term4125);
        setIntField(term4143, term4143.getClass(), "type", -1151122332);
        setField(term4143, term4143.getClass(), "next", term4136);
        setField(term4143, term4143.getClass(), "first", term4138);
        setField(term4143, term4143.getClass(), "last", term4121);
        setField(term4143, term4143.getClass(), "propListHead", null);
        setIntField(term4143, term4143.getClass(), "sourcePosition", 0);
        setField(term4143, term4143.getClass(), "jsType", null);
        setField(term4143, term4143.getClass(), "parent", null);
        setField(term4123, term4123.getClass(), "first", term4143);
        setField(term4123, term4123.getClass(), "last", term4143);
        setField(term4123, term4123.getClass(), "propListHead", null);
        setIntField(term4123, term4123.getClass(), "sourcePosition", 0);
        setField(term4123, term4123.getClass(), "jsType", null);
        setField(term4123, term4123.getClass(), "parent", null);
        setField(term4121, term4121.getClass(), "next", term4123);
        setField(term4121, term4121.getClass(), "first", term4127);
        setField(term4121, term4121.getClass(), "last", term4129);
        setField(term4121, term4121.getClass(), "propListHead", null);
        setIntField(term4121, term4121.getClass(), "sourcePosition", 0);
        setField(term4121, term4121.getClass(), "jsType", null);
        setField(term4121, term4121.getClass(), "parent", null);
        term4148 = new Integer(953387911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4121;
        args[1] = term4148;
        try {
            callMethod(klass, "getArgumentForCallOrNew", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


