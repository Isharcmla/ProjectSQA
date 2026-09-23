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

public class NodeUtil_containsFunction_1761016032206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1015;
     Object term10484;

    public NodeUtil_containsFunction_1761016032206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1015, term1015.getClass(), "type", -941356098);
        setIntField(term1017, term1017.getClass(), "type", 1374790203);
        setIntField(term1019, term1019.getClass(), "type", 0);
        setField(term1019, term1019.getClass(), "next", null);
        setField(term1019, term1019.getClass(), "first", null);
        setField(term1019, term1019.getClass(), "last", null);
        setField(term1019, term1019.getClass(), "propListHead", null);
        setIntField(term1019, term1019.getClass(), "sourcePosition", 0);
        setField(term1019, term1019.getClass(), "jsType", null);
        setField(term1019, term1019.getClass(), "parent", null);
        setField(term1017, term1017.getClass(), "next", term1019);
        setIntField(term1022, term1022.getClass(), "type", 0);
        setField(term1022, term1022.getClass(), "next", null);
        setField(term1022, term1022.getClass(), "first", null);
        setField(term1022, term1022.getClass(), "last", null);
        setField(term1022, term1022.getClass(), "propListHead", null);
        setIntField(term1022, term1022.getClass(), "sourcePosition", 0);
        setField(term1022, term1022.getClass(), "jsType", null);
        setField(term1022, term1022.getClass(), "parent", null);
        setField(term1017, term1017.getClass(), "first", term1022);
        setIntField(term1025, term1025.getClass(), "type", 0);
        setField(term1025, term1025.getClass(), "next", null);
        setField(term1025, term1025.getClass(), "first", null);
        setField(term1025, term1025.getClass(), "last", null);
        setField(term1025, term1025.getClass(), "propListHead", null);
        setIntField(term1025, term1025.getClass(), "sourcePosition", 0);
        setField(term1025, term1025.getClass(), "jsType", null);
        setField(term1025, term1025.getClass(), "parent", null);
        setField(term1017, term1017.getClass(), "last", term1025);
        setField(term1017, term1017.getClass(), "propListHead", null);
        setIntField(term1017, term1017.getClass(), "sourcePosition", 0);
        setField(term1017, term1017.getClass(), "jsType", null);
        setField(term1017, term1017.getClass(), "parent", null);
        setField(term1015, term1015.getClass(), "next", term1017);
        setIntField(term1029, term1029.getClass(), "type", 0);
        setField(term1029, term1029.getClass(), "next", null);
        setField(term1029, term1029.getClass(), "first", null);
        setField(term1029, term1029.getClass(), "last", null);
        setField(term1029, term1029.getClass(), "propListHead", null);
        setIntField(term1029, term1029.getClass(), "sourcePosition", 0);
        setField(term1029, term1029.getClass(), "jsType", null);
        setField(term1029, term1029.getClass(), "parent", null);
        setField(term1015, term1015.getClass(), "first", term1029);
        setIntField(term1032, term1032.getClass(), "type", 0);
        setField(term1032, term1032.getClass(), "next", null);
        setField(term1032, term1032.getClass(), "first", null);
        setField(term1032, term1032.getClass(), "last", null);
        setField(term1032, term1032.getClass(), "propListHead", null);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 0);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1015, term1015.getClass(), "last", term1032);
        setField(term1015, term1015.getClass(), "propListHead", null);
        setIntField(term1015, term1015.getClass(), "sourcePosition", 0);
        setField(term1015, term1015.getClass(), "jsType", null);
        setField(term1015, term1015.getClass(), "parent", null);
        term10484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10484, term10484.getClass(), "type", -941356098);
        setIntField(term10485, term10485.getClass(), "type", 1374790203);
        setIntField(term10486, term10486.getClass(), "type", 0);
        setField(term10486, term10486.getClass(), "next", null);
        setField(term10486, term10486.getClass(), "first", null);
        setField(term10486, term10486.getClass(), "last", null);
        setField(term10486, term10486.getClass(), "propListHead", null);
        setIntField(term10486, term10486.getClass(), "sourcePosition", 0);
        setField(term10486, term10486.getClass(), "jsType", null);
        setField(term10486, term10486.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "next", term10486);
        setIntField(term10487, term10487.getClass(), "type", 0);
        setField(term10487, term10487.getClass(), "next", null);
        setField(term10487, term10487.getClass(), "first", null);
        setField(term10487, term10487.getClass(), "last", null);
        setField(term10487, term10487.getClass(), "propListHead", null);
        setIntField(term10487, term10487.getClass(), "sourcePosition", 0);
        setField(term10487, term10487.getClass(), "jsType", null);
        setField(term10487, term10487.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "first", term10487);
        setIntField(term10488, term10488.getClass(), "type", 0);
        setField(term10488, term10488.getClass(), "next", null);
        setField(term10488, term10488.getClass(), "first", null);
        setField(term10488, term10488.getClass(), "last", null);
        setField(term10488, term10488.getClass(), "propListHead", null);
        setIntField(term10488, term10488.getClass(), "sourcePosition", 0);
        setField(term10488, term10488.getClass(), "jsType", null);
        setField(term10488, term10488.getClass(), "parent", null);
        setField(term10485, term10485.getClass(), "last", term10488);
        setField(term10485, term10485.getClass(), "propListHead", null);
        setIntField(term10485, term10485.getClass(), "sourcePosition", 0);
        setField(term10485, term10485.getClass(), "jsType", null);
        setField(term10485, term10485.getClass(), "parent", null);
        setField(term10484, term10484.getClass(), "next", term10485);
        setIntField(term10489, term10489.getClass(), "type", 0);
        setField(term10489, term10489.getClass(), "next", null);
        setField(term10489, term10489.getClass(), "first", null);
        setField(term10489, term10489.getClass(), "last", null);
        setField(term10489, term10489.getClass(), "propListHead", null);
        setIntField(term10489, term10489.getClass(), "sourcePosition", 0);
        setField(term10489, term10489.getClass(), "jsType", null);
        setField(term10489, term10489.getClass(), "parent", null);
        setField(term10484, term10484.getClass(), "first", term10489);
        setIntField(term10490, term10490.getClass(), "type", 0);
        setField(term10490, term10490.getClass(), "next", null);
        setField(term10490, term10490.getClass(), "first", null);
        setField(term10490, term10490.getClass(), "last", null);
        setField(term10490, term10490.getClass(), "propListHead", null);
        setIntField(term10490, term10490.getClass(), "sourcePosition", 0);
        setField(term10490, term10490.getClass(), "jsType", null);
        setField(term10490, term10490.getClass(), "parent", null);
        setField(term10484, term10484.getClass(), "last", term10490);
        setField(term10484, term10484.getClass(), "propListHead", null);
        setIntField(term10484, term10484.getClass(), "sourcePosition", 0);
        setField(term10484, term10484.getClass(), "jsType", null);
        setField(term10484, term10484.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1015;
        callMethod(klass, "containsFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1015, term10484));
    }

};


