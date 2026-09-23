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

public class NodeUtil_isStatement_664352338148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1165;

    public NodeUtil_isStatement_664352338148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1178 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1188 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1165, term1165.getClass(), "type", 1065595802);
        setIntField(term1167, term1167.getClass(), "type", -1097563716);
        setIntField(term1169, term1169.getClass(), "type", 0);
        setField(term1169, term1169.getClass(), "next", null);
        setField(term1169, term1169.getClass(), "first", null);
        setField(term1169, term1169.getClass(), "last", null);
        setField(term1169, term1169.getClass(), "propListHead", null);
        setIntField(term1169, term1169.getClass(), "sourcePosition", 0);
        setField(term1169, term1169.getClass(), "jsType", null);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "next", term1169);
        setIntField(term1172, term1172.getClass(), "type", 0);
        setField(term1172, term1172.getClass(), "next", null);
        setField(term1172, term1172.getClass(), "first", null);
        setField(term1172, term1172.getClass(), "last", null);
        setField(term1172, term1172.getClass(), "propListHead", null);
        setIntField(term1172, term1172.getClass(), "sourcePosition", 0);
        setField(term1172, term1172.getClass(), "jsType", null);
        setField(term1172, term1172.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "first", term1172);
        setIntField(term1175, term1175.getClass(), "type", 0);
        setField(term1175, term1175.getClass(), "next", null);
        setField(term1175, term1175.getClass(), "first", null);
        setField(term1175, term1175.getClass(), "last", null);
        setField(term1175, term1175.getClass(), "propListHead", null);
        setIntField(term1175, term1175.getClass(), "sourcePosition", 0);
        setField(term1175, term1175.getClass(), "jsType", null);
        setField(term1175, term1175.getClass(), "parent", null);
        setField(term1167, term1167.getClass(), "last", term1175);
        setField(term1178, term1178.getClass(), "next", null);
        setIntField(term1178, term1178.getClass(), "type", 0);
        setIntField(term1178, term1178.getClass(), "intValue", 0);
        setField(term1178, term1178.getClass(), "objectValue", null);
        setField(term1167, term1167.getClass(), "propListHead", term1178);
        setIntField(term1167, term1167.getClass(), "sourcePosition", -516303035);
        setField(term1167, term1167.getClass(), "jsType", null);
        setField(term1167, term1167.getClass(), "parent", null);
        setField(term1165, term1165.getClass(), "next", term1167);
        setIntField(term1182, term1182.getClass(), "type", 0);
        setField(term1182, term1182.getClass(), "next", null);
        setField(term1182, term1182.getClass(), "first", null);
        setField(term1182, term1182.getClass(), "last", null);
        setField(term1182, term1182.getClass(), "propListHead", null);
        setIntField(term1182, term1182.getClass(), "sourcePosition", 0);
        setField(term1182, term1182.getClass(), "jsType", null);
        setField(term1182, term1182.getClass(), "parent", null);
        setField(term1165, term1165.getClass(), "first", term1182);
        setIntField(term1185, term1185.getClass(), "type", 0);
        setField(term1185, term1185.getClass(), "next", null);
        setField(term1185, term1185.getClass(), "first", null);
        setField(term1185, term1185.getClass(), "last", null);
        setField(term1185, term1185.getClass(), "propListHead", null);
        setIntField(term1185, term1185.getClass(), "sourcePosition", 0);
        setField(term1185, term1185.getClass(), "jsType", null);
        setField(term1185, term1185.getClass(), "parent", null);
        setField(term1165, term1165.getClass(), "last", term1185);
        setField(term1188, term1188.getClass(), "next", null);
        setIntField(term1188, term1188.getClass(), "type", 0);
        setIntField(term1188, term1188.getClass(), "intValue", 0);
        setField(term1188, term1188.getClass(), "objectValue", null);
        setField(term1165, term1165.getClass(), "propListHead", term1188);
        setIntField(term1165, term1165.getClass(), "sourcePosition", -2143043890);
        setField(term1165, term1165.getClass(), "jsType", null);
        setField(term1165, term1165.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1165;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


