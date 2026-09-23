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

public class NodeUtil_getConditionExpression_1686829277147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public NodeUtil_getConditionExpression_1686829277147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1124 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1111, term1111.getClass(), "type", 243280944);
        setIntField(term1113, term1113.getClass(), "type", 202214133);
        setIntField(term1115, term1115.getClass(), "type", 0);
        setField(term1115, term1115.getClass(), "next", null);
        setField(term1115, term1115.getClass(), "first", null);
        setField(term1115, term1115.getClass(), "last", null);
        setField(term1115, term1115.getClass(), "propListHead", null);
        setIntField(term1115, term1115.getClass(), "sourcePosition", 0);
        setField(term1115, term1115.getClass(), "jsType", null);
        setField(term1115, term1115.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "next", term1115);
        setIntField(term1118, term1118.getClass(), "type", 0);
        setField(term1118, term1118.getClass(), "next", null);
        setField(term1118, term1118.getClass(), "first", null);
        setField(term1118, term1118.getClass(), "last", null);
        setField(term1118, term1118.getClass(), "propListHead", null);
        setIntField(term1118, term1118.getClass(), "sourcePosition", 0);
        setField(term1118, term1118.getClass(), "jsType", null);
        setField(term1118, term1118.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "first", term1118);
        setIntField(term1121, term1121.getClass(), "type", 0);
        setField(term1121, term1121.getClass(), "next", null);
        setField(term1121, term1121.getClass(), "first", null);
        setField(term1121, term1121.getClass(), "last", null);
        setField(term1121, term1121.getClass(), "propListHead", null);
        setIntField(term1121, term1121.getClass(), "sourcePosition", 0);
        setField(term1121, term1121.getClass(), "jsType", null);
        setField(term1121, term1121.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "last", term1121);
        setField(term1124, term1124.getClass(), "next", null);
        setIntField(term1124, term1124.getClass(), "type", 0);
        setIntField(term1124, term1124.getClass(), "intValue", 0);
        setField(term1124, term1124.getClass(), "objectValue", null);
        setField(term1113, term1113.getClass(), "propListHead", term1124);
        setIntField(term1113, term1113.getClass(), "sourcePosition", -222941705);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        setField(term1111, term1111.getClass(), "next", term1113);
        setIntField(term1128, term1128.getClass(), "type", 0);
        setField(term1128, term1128.getClass(), "next", null);
        setField(term1128, term1128.getClass(), "first", null);
        setField(term1128, term1128.getClass(), "last", null);
        setField(term1128, term1128.getClass(), "propListHead", null);
        setIntField(term1128, term1128.getClass(), "sourcePosition", 0);
        setField(term1128, term1128.getClass(), "jsType", null);
        setField(term1128, term1128.getClass(), "parent", null);
        setField(term1111, term1111.getClass(), "first", term1128);
        setIntField(term1131, term1131.getClass(), "type", 0);
        setField(term1131, term1131.getClass(), "next", null);
        setField(term1131, term1131.getClass(), "first", null);
        setField(term1131, term1131.getClass(), "last", null);
        setField(term1131, term1131.getClass(), "propListHead", null);
        setIntField(term1131, term1131.getClass(), "sourcePosition", 0);
        setField(term1131, term1131.getClass(), "jsType", null);
        setField(term1131, term1131.getClass(), "parent", null);
        setField(term1111, term1111.getClass(), "last", term1131);
        setField(term1134, term1134.getClass(), "next", null);
        setIntField(term1134, term1134.getClass(), "type", 0);
        setIntField(term1134, term1134.getClass(), "intValue", 0);
        setField(term1134, term1134.getClass(), "objectValue", null);
        setField(term1111, term1111.getClass(), "propListHead", term1134);
        setIntField(term1111, term1111.getClass(), "sourcePosition", 291864719);
        setField(term1111, term1111.getClass(), "jsType", null);
        setField(term1111, term1111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1111;
        try {
            callMethod(klass, "getConditionExpression", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


