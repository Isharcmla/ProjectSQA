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

public class NodeUtil_getSourceName_466164534300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3430;
     Object term23966;

    public NodeUtil_getSourceName_466164534300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3430, term3430.getClass(), "type", 1641377218);
        setIntField(term3432, term3432.getClass(), "type", -91068927);
        setIntField(term3434, term3434.getClass(), "type", 0);
        setField(term3434, term3434.getClass(), "next", null);
        setField(term3434, term3434.getClass(), "first", null);
        setField(term3434, term3434.getClass(), "last", null);
        setField(term3434, term3434.getClass(), "propListHead", null);
        setIntField(term3434, term3434.getClass(), "sourcePosition", 0);
        setField(term3434, term3434.getClass(), "jsType", null);
        setField(term3434, term3434.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "next", term3434);
        setIntField(term3437, term3437.getClass(), "type", 0);
        setField(term3437, term3437.getClass(), "next", null);
        setField(term3437, term3437.getClass(), "first", null);
        setField(term3437, term3437.getClass(), "last", null);
        setField(term3437, term3437.getClass(), "propListHead", null);
        setIntField(term3437, term3437.getClass(), "sourcePosition", 0);
        setField(term3437, term3437.getClass(), "jsType", null);
        setField(term3437, term3437.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "first", term3437);
        setIntField(term3440, term3440.getClass(), "type", 0);
        setField(term3440, term3440.getClass(), "next", null);
        setField(term3440, term3440.getClass(), "first", null);
        setField(term3440, term3440.getClass(), "last", null);
        setField(term3440, term3440.getClass(), "propListHead", null);
        setIntField(term3440, term3440.getClass(), "sourcePosition", 0);
        setField(term3440, term3440.getClass(), "jsType", null);
        setField(term3440, term3440.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "last", term3440);
        setField(term3432, term3432.getClass(), "propListHead", null);
        setIntField(term3432, term3432.getClass(), "sourcePosition", 0);
        setField(term3432, term3432.getClass(), "jsType", null);
        setField(term3432, term3432.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "next", term3432);
        setIntField(term3444, term3444.getClass(), "type", 0);
        setField(term3444, term3444.getClass(), "next", null);
        setField(term3444, term3444.getClass(), "first", null);
        setField(term3444, term3444.getClass(), "last", null);
        setField(term3444, term3444.getClass(), "propListHead", null);
        setIntField(term3444, term3444.getClass(), "sourcePosition", 0);
        setField(term3444, term3444.getClass(), "jsType", null);
        setField(term3444, term3444.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "first", term3444);
        setIntField(term3447, term3447.getClass(), "type", 0);
        setField(term3447, term3447.getClass(), "next", null);
        setField(term3447, term3447.getClass(), "first", null);
        setField(term3447, term3447.getClass(), "last", null);
        setField(term3447, term3447.getClass(), "propListHead", null);
        setIntField(term3447, term3447.getClass(), "sourcePosition", 0);
        setField(term3447, term3447.getClass(), "jsType", null);
        setField(term3447, term3447.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "last", term3447);
        setField(term3430, term3430.getClass(), "propListHead", null);
        setIntField(term3430, term3430.getClass(), "sourcePosition", 0);
        setField(term3430, term3430.getClass(), "jsType", null);
        setField(term3430, term3430.getClass(), "parent", null);
        term23966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term23966, term23966.getClass(), "type", 1641377218);
        setIntField(term23967, term23967.getClass(), "type", -91068927);
        setIntField(term23968, term23968.getClass(), "type", 0);
        setField(term23968, term23968.getClass(), "next", null);
        setField(term23968, term23968.getClass(), "first", null);
        setField(term23968, term23968.getClass(), "last", null);
        setField(term23968, term23968.getClass(), "propListHead", null);
        setIntField(term23968, term23968.getClass(), "sourcePosition", 0);
        setField(term23968, term23968.getClass(), "jsType", null);
        setField(term23968, term23968.getClass(), "parent", null);
        setField(term23967, term23967.getClass(), "next", term23968);
        setIntField(term23969, term23969.getClass(), "type", 0);
        setField(term23969, term23969.getClass(), "next", null);
        setField(term23969, term23969.getClass(), "first", null);
        setField(term23969, term23969.getClass(), "last", null);
        setField(term23969, term23969.getClass(), "propListHead", null);
        setIntField(term23969, term23969.getClass(), "sourcePosition", 0);
        setField(term23969, term23969.getClass(), "jsType", null);
        setField(term23969, term23969.getClass(), "parent", null);
        setField(term23967, term23967.getClass(), "first", term23969);
        setIntField(term23970, term23970.getClass(), "type", 0);
        setField(term23970, term23970.getClass(), "next", null);
        setField(term23970, term23970.getClass(), "first", null);
        setField(term23970, term23970.getClass(), "last", null);
        setField(term23970, term23970.getClass(), "propListHead", null);
        setIntField(term23970, term23970.getClass(), "sourcePosition", 0);
        setField(term23970, term23970.getClass(), "jsType", null);
        setField(term23970, term23970.getClass(), "parent", null);
        setField(term23967, term23967.getClass(), "last", term23970);
        setField(term23967, term23967.getClass(), "propListHead", null);
        setIntField(term23967, term23967.getClass(), "sourcePosition", 0);
        setField(term23967, term23967.getClass(), "jsType", null);
        setField(term23967, term23967.getClass(), "parent", null);
        setField(term23966, term23966.getClass(), "next", term23967);
        setIntField(term23971, term23971.getClass(), "type", 0);
        setField(term23971, term23971.getClass(), "next", null);
        setField(term23971, term23971.getClass(), "first", null);
        setField(term23971, term23971.getClass(), "last", null);
        setField(term23971, term23971.getClass(), "propListHead", null);
        setIntField(term23971, term23971.getClass(), "sourcePosition", 0);
        setField(term23971, term23971.getClass(), "jsType", null);
        setField(term23971, term23971.getClass(), "parent", null);
        setField(term23966, term23966.getClass(), "first", term23971);
        setIntField(term23972, term23972.getClass(), "type", 0);
        setField(term23972, term23972.getClass(), "next", null);
        setField(term23972, term23972.getClass(), "first", null);
        setField(term23972, term23972.getClass(), "last", null);
        setField(term23972, term23972.getClass(), "propListHead", null);
        setIntField(term23972, term23972.getClass(), "sourcePosition", 0);
        setField(term23972, term23972.getClass(), "jsType", null);
        setField(term23972, term23972.getClass(), "parent", null);
        setField(term23966, term23966.getClass(), "last", term23972);
        setField(term23966, term23966.getClass(), "propListHead", null);
        setIntField(term23966, term23966.getClass(), "sourcePosition", 0);
        setField(term23966, term23966.getClass(), "jsType", null);
        setField(term23966, term23966.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3430;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term3430, term23966));
    }

};


