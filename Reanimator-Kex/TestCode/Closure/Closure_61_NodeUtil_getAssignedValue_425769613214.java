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

public class NodeUtil_getAssignedValue_425769613214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183;

    public NodeUtil_getAssignedValue_425769613214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1183, term1183.getClass(), "type", -509349195);
        setIntField(term1185, term1185.getClass(), "type", -695279311);
        setIntField(term1187, term1187.getClass(), "type", 0);
        setField(term1187, term1187.getClass(), "next", null);
        setField(term1187, term1187.getClass(), "first", null);
        setField(term1187, term1187.getClass(), "last", null);
        setField(term1187, term1187.getClass(), "propListHead", null);
        setIntField(term1187, term1187.getClass(), "sourcePosition", 0);
        setField(term1187, term1187.getClass(), "jsType", null);
        setField(term1187, term1187.getClass(), "parent", null);
        setField(term1185, term1185.getClass(), "next", term1187);
        setIntField(term1190, term1190.getClass(), "type", 0);
        setField(term1190, term1190.getClass(), "next", null);
        setField(term1190, term1190.getClass(), "first", null);
        setField(term1190, term1190.getClass(), "last", null);
        setField(term1190, term1190.getClass(), "propListHead", null);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 0);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        setField(term1185, term1185.getClass(), "first", term1190);
        setIntField(term1193, term1193.getClass(), "type", 0);
        setField(term1193, term1193.getClass(), "next", null);
        setField(term1193, term1193.getClass(), "first", null);
        setField(term1193, term1193.getClass(), "last", null);
        setField(term1193, term1193.getClass(), "propListHead", null);
        setIntField(term1193, term1193.getClass(), "sourcePosition", 0);
        setField(term1193, term1193.getClass(), "jsType", null);
        setField(term1193, term1193.getClass(), "parent", null);
        setField(term1185, term1185.getClass(), "last", term1193);
        setField(term1185, term1185.getClass(), "propListHead", null);
        setIntField(term1185, term1185.getClass(), "sourcePosition", 0);
        setField(term1185, term1185.getClass(), "jsType", null);
        setField(term1185, term1185.getClass(), "parent", null);
        setField(term1183, term1183.getClass(), "next", term1185);
        setIntField(term1197, term1197.getClass(), "type", 0);
        setField(term1197, term1197.getClass(), "next", null);
        setField(term1197, term1197.getClass(), "first", null);
        setField(term1197, term1197.getClass(), "last", null);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1183, term1183.getClass(), "first", term1197);
        setIntField(term1200, term1200.getClass(), "type", 0);
        setField(term1200, term1200.getClass(), "next", null);
        setField(term1200, term1200.getClass(), "first", null);
        setField(term1200, term1200.getClass(), "last", null);
        setField(term1200, term1200.getClass(), "propListHead", null);
        setIntField(term1200, term1200.getClass(), "sourcePosition", 0);
        setField(term1200, term1200.getClass(), "jsType", null);
        setField(term1200, term1200.getClass(), "parent", null);
        setField(term1183, term1183.getClass(), "last", term1200);
        setField(term1183, term1183.getClass(), "propListHead", null);
        setIntField(term1183, term1183.getClass(), "sourcePosition", 0);
        setField(term1183, term1183.getClass(), "jsType", null);
        setField(term1183, term1183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1183;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


