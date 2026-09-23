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

public class NodeUtil_isName_1555326690210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;
     Object term10724;

    public NodeUtil_isName_1555326690210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1099, term1099.getClass(), "type", 202214133);
        setIntField(term1101, term1101.getClass(), "type", 291864719);
        setIntField(term1103, term1103.getClass(), "type", 0);
        setField(term1103, term1103.getClass(), "next", null);
        setField(term1103, term1103.getClass(), "first", null);
        setField(term1103, term1103.getClass(), "last", null);
        setField(term1103, term1103.getClass(), "propListHead", null);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 0);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "next", term1103);
        setIntField(term1106, term1106.getClass(), "type", 0);
        setField(term1106, term1106.getClass(), "next", null);
        setField(term1106, term1106.getClass(), "first", null);
        setField(term1106, term1106.getClass(), "last", null);
        setField(term1106, term1106.getClass(), "propListHead", null);
        setIntField(term1106, term1106.getClass(), "sourcePosition", 0);
        setField(term1106, term1106.getClass(), "jsType", null);
        setField(term1106, term1106.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "first", term1106);
        setIntField(term1109, term1109.getClass(), "type", 0);
        setField(term1109, term1109.getClass(), "next", null);
        setField(term1109, term1109.getClass(), "first", null);
        setField(term1109, term1109.getClass(), "last", null);
        setField(term1109, term1109.getClass(), "propListHead", null);
        setIntField(term1109, term1109.getClass(), "sourcePosition", 0);
        setField(term1109, term1109.getClass(), "jsType", null);
        setField(term1109, term1109.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "last", term1109);
        setField(term1101, term1101.getClass(), "propListHead", null);
        setIntField(term1101, term1101.getClass(), "sourcePosition", 0);
        setField(term1101, term1101.getClass(), "jsType", null);
        setField(term1101, term1101.getClass(), "parent", null);
        setField(term1099, term1099.getClass(), "next", term1101);
        setIntField(term1113, term1113.getClass(), "type", 0);
        setField(term1113, term1113.getClass(), "next", null);
        setField(term1113, term1113.getClass(), "first", null);
        setField(term1113, term1113.getClass(), "last", null);
        setField(term1113, term1113.getClass(), "propListHead", null);
        setIntField(term1113, term1113.getClass(), "sourcePosition", 0);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        setField(term1099, term1099.getClass(), "first", term1113);
        setIntField(term1116, term1116.getClass(), "type", 0);
        setField(term1116, term1116.getClass(), "next", null);
        setField(term1116, term1116.getClass(), "first", null);
        setField(term1116, term1116.getClass(), "last", null);
        setField(term1116, term1116.getClass(), "propListHead", null);
        setIntField(term1116, term1116.getClass(), "sourcePosition", 0);
        setField(term1116, term1116.getClass(), "jsType", null);
        setField(term1116, term1116.getClass(), "parent", null);
        setField(term1099, term1099.getClass(), "last", term1116);
        setField(term1099, term1099.getClass(), "propListHead", null);
        setIntField(term1099, term1099.getClass(), "sourcePosition", 0);
        setField(term1099, term1099.getClass(), "jsType", null);
        setField(term1099, term1099.getClass(), "parent", null);
        term10724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10724, term10724.getClass(), "type", 202214133);
        setIntField(term10725, term10725.getClass(), "type", 291864719);
        setIntField(term10726, term10726.getClass(), "type", 0);
        setField(term10726, term10726.getClass(), "next", null);
        setField(term10726, term10726.getClass(), "first", null);
        setField(term10726, term10726.getClass(), "last", null);
        setField(term10726, term10726.getClass(), "propListHead", null);
        setIntField(term10726, term10726.getClass(), "sourcePosition", 0);
        setField(term10726, term10726.getClass(), "jsType", null);
        setField(term10726, term10726.getClass(), "parent", null);
        setField(term10725, term10725.getClass(), "next", term10726);
        setIntField(term10727, term10727.getClass(), "type", 0);
        setField(term10727, term10727.getClass(), "next", null);
        setField(term10727, term10727.getClass(), "first", null);
        setField(term10727, term10727.getClass(), "last", null);
        setField(term10727, term10727.getClass(), "propListHead", null);
        setIntField(term10727, term10727.getClass(), "sourcePosition", 0);
        setField(term10727, term10727.getClass(), "jsType", null);
        setField(term10727, term10727.getClass(), "parent", null);
        setField(term10725, term10725.getClass(), "first", term10727);
        setIntField(term10728, term10728.getClass(), "type", 0);
        setField(term10728, term10728.getClass(), "next", null);
        setField(term10728, term10728.getClass(), "first", null);
        setField(term10728, term10728.getClass(), "last", null);
        setField(term10728, term10728.getClass(), "propListHead", null);
        setIntField(term10728, term10728.getClass(), "sourcePosition", 0);
        setField(term10728, term10728.getClass(), "jsType", null);
        setField(term10728, term10728.getClass(), "parent", null);
        setField(term10725, term10725.getClass(), "last", term10728);
        setField(term10725, term10725.getClass(), "propListHead", null);
        setIntField(term10725, term10725.getClass(), "sourcePosition", 0);
        setField(term10725, term10725.getClass(), "jsType", null);
        setField(term10725, term10725.getClass(), "parent", null);
        setField(term10724, term10724.getClass(), "next", term10725);
        setIntField(term10729, term10729.getClass(), "type", 0);
        setField(term10729, term10729.getClass(), "next", null);
        setField(term10729, term10729.getClass(), "first", null);
        setField(term10729, term10729.getClass(), "last", null);
        setField(term10729, term10729.getClass(), "propListHead", null);
        setIntField(term10729, term10729.getClass(), "sourcePosition", 0);
        setField(term10729, term10729.getClass(), "jsType", null);
        setField(term10729, term10729.getClass(), "parent", null);
        setField(term10724, term10724.getClass(), "first", term10729);
        setIntField(term10730, term10730.getClass(), "type", 0);
        setField(term10730, term10730.getClass(), "next", null);
        setField(term10730, term10730.getClass(), "first", null);
        setField(term10730, term10730.getClass(), "last", null);
        setField(term10730, term10730.getClass(), "propListHead", null);
        setIntField(term10730, term10730.getClass(), "sourcePosition", 0);
        setField(term10730, term10730.getClass(), "jsType", null);
        setField(term10730, term10730.getClass(), "parent", null);
        setField(term10724, term10724.getClass(), "last", term10730);
        setField(term10724, term10724.getClass(), "propListHead", null);
        setIntField(term10724, term10724.getClass(), "sourcePosition", 0);
        setField(term10724, term10724.getClass(), "jsType", null);
        setField(term10724, term10724.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1099;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term1099, term10724));
        assertTrue(recursiveEquals(retValue, false));
    }

};


