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

public class NodeUtil_isNullOrUndefined_1654184101194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;
     Object term10485;

    public NodeUtil_isNullOrUndefined_1654184101194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1076, term1076.getClass(), "type", -941356098);
        setIntField(term1078, term1078.getClass(), "type", 1374790203);
        setIntField(term1080, term1080.getClass(), "type", 0);
        setField(term1080, term1080.getClass(), "next", null);
        setField(term1080, term1080.getClass(), "first", null);
        setField(term1080, term1080.getClass(), "last", null);
        setField(term1080, term1080.getClass(), "propListHead", null);
        setIntField(term1080, term1080.getClass(), "sourcePosition", 0);
        setField(term1080, term1080.getClass(), "jsType", null);
        setField(term1080, term1080.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "next", term1080);
        setIntField(term1083, term1083.getClass(), "type", 0);
        setField(term1083, term1083.getClass(), "next", null);
        setField(term1083, term1083.getClass(), "first", null);
        setField(term1083, term1083.getClass(), "last", null);
        setField(term1083, term1083.getClass(), "propListHead", null);
        setIntField(term1083, term1083.getClass(), "sourcePosition", 0);
        setField(term1083, term1083.getClass(), "jsType", null);
        setField(term1083, term1083.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "first", term1083);
        setIntField(term1086, term1086.getClass(), "type", 0);
        setField(term1086, term1086.getClass(), "next", null);
        setField(term1086, term1086.getClass(), "first", null);
        setField(term1086, term1086.getClass(), "last", null);
        setField(term1086, term1086.getClass(), "propListHead", null);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 0);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "last", term1086);
        setField(term1089, term1089.getClass(), "next", null);
        setIntField(term1089, term1089.getClass(), "type", 0);
        setIntField(term1089, term1089.getClass(), "intValue", 0);
        setField(term1089, term1089.getClass(), "objectValue", null);
        setField(term1078, term1078.getClass(), "propListHead", term1089);
        setIntField(term1078, term1078.getClass(), "sourcePosition", -525570815);
        setField(term1078, term1078.getClass(), "jsType", null);
        setField(term1078, term1078.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "next", term1078);
        setIntField(term1093, term1093.getClass(), "type", 0);
        setField(term1093, term1093.getClass(), "next", null);
        setField(term1093, term1093.getClass(), "first", null);
        setField(term1093, term1093.getClass(), "last", null);
        setField(term1093, term1093.getClass(), "propListHead", null);
        setIntField(term1093, term1093.getClass(), "sourcePosition", 0);
        setField(term1093, term1093.getClass(), "jsType", null);
        setField(term1093, term1093.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "first", term1093);
        setIntField(term1096, term1096.getClass(), "type", 0);
        setField(term1096, term1096.getClass(), "next", null);
        setField(term1096, term1096.getClass(), "first", null);
        setField(term1096, term1096.getClass(), "last", null);
        setField(term1096, term1096.getClass(), "propListHead", null);
        setIntField(term1096, term1096.getClass(), "sourcePosition", 0);
        setField(term1096, term1096.getClass(), "jsType", null);
        setField(term1096, term1096.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "last", term1096);
        setField(term1099, term1099.getClass(), "next", null);
        setIntField(term1099, term1099.getClass(), "type", 0);
        setIntField(term1099, term1099.getClass(), "intValue", 0);
        setField(term1099, term1099.getClass(), "objectValue", null);
        setField(term1076, term1076.getClass(), "propListHead", term1099);
        setIntField(term1076, term1076.getClass(), "sourcePosition", 754055848);
        setField(term1076, term1076.getClass(), "jsType", null);
        setField(term1076, term1076.getClass(), "parent", null);
        term10485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10490 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10485, term10485.getClass(), "type", -941356098);
        setIntField(term10486, term10486.getClass(), "type", 1374790203);
        setIntField(term10487, term10487.getClass(), "type", 0);
        setField(term10487, term10487.getClass(), "next", null);
        setField(term10487, term10487.getClass(), "first", null);
        setField(term10487, term10487.getClass(), "last", null);
        setField(term10487, term10487.getClass(), "propListHead", null);
        setIntField(term10487, term10487.getClass(), "sourcePosition", 0);
        setField(term10487, term10487.getClass(), "jsType", null);
        setField(term10487, term10487.getClass(), "parent", null);
        setField(term10486, term10486.getClass(), "next", term10487);
        setIntField(term10488, term10488.getClass(), "type", 0);
        setField(term10488, term10488.getClass(), "next", null);
        setField(term10488, term10488.getClass(), "first", null);
        setField(term10488, term10488.getClass(), "last", null);
        setField(term10488, term10488.getClass(), "propListHead", null);
        setIntField(term10488, term10488.getClass(), "sourcePosition", 0);
        setField(term10488, term10488.getClass(), "jsType", null);
        setField(term10488, term10488.getClass(), "parent", null);
        setField(term10486, term10486.getClass(), "first", term10488);
        setIntField(term10489, term10489.getClass(), "type", 0);
        setField(term10489, term10489.getClass(), "next", null);
        setField(term10489, term10489.getClass(), "first", null);
        setField(term10489, term10489.getClass(), "last", null);
        setField(term10489, term10489.getClass(), "propListHead", null);
        setIntField(term10489, term10489.getClass(), "sourcePosition", 0);
        setField(term10489, term10489.getClass(), "jsType", null);
        setField(term10489, term10489.getClass(), "parent", null);
        setField(term10486, term10486.getClass(), "last", term10489);
        setField(term10490, term10490.getClass(), "next", null);
        setIntField(term10490, term10490.getClass(), "type", 0);
        setIntField(term10490, term10490.getClass(), "intValue", 0);
        setField(term10490, term10490.getClass(), "objectValue", null);
        setField(term10486, term10486.getClass(), "propListHead", term10490);
        setIntField(term10486, term10486.getClass(), "sourcePosition", -525570815);
        setField(term10486, term10486.getClass(), "jsType", null);
        setField(term10486, term10486.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "next", term10486);
        setIntField(term10491, term10491.getClass(), "type", 0);
        setField(term10491, term10491.getClass(), "next", null);
        setField(term10491, term10491.getClass(), "first", null);
        setField(term10491, term10491.getClass(), "last", null);
        setField(term10491, term10491.getClass(), "propListHead", null);
        setIntField(term10491, term10491.getClass(), "sourcePosition", 0);
        setField(term10491, term10491.getClass(), "jsType", null);
        setField(term10491, term10491.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "first", term10491);
        setIntField(term10492, term10492.getClass(), "type", 0);
        setField(term10492, term10492.getClass(), "next", null);
        setField(term10492, term10492.getClass(), "first", null);
        setField(term10492, term10492.getClass(), "last", null);
        setField(term10492, term10492.getClass(), "propListHead", null);
        setIntField(term10492, term10492.getClass(), "sourcePosition", 0);
        setField(term10492, term10492.getClass(), "jsType", null);
        setField(term10492, term10492.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "last", term10492);
        setField(term10493, term10493.getClass(), "next", null);
        setIntField(term10493, term10493.getClass(), "type", 0);
        setIntField(term10493, term10493.getClass(), "intValue", 0);
        setField(term10493, term10493.getClass(), "objectValue", null);
        setField(term10485, term10485.getClass(), "propListHead", term10493);
        setIntField(term10485, term10485.getClass(), "sourcePosition", 754055848);
        setField(term10485, term10485.getClass(), "jsType", null);
        setField(term10485, term10485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1076;
        Object retValue = callMethod(klass, "isNullOrUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term1076, term10485));
        assertTrue(recursiveEquals(retValue, false));
    }

};


