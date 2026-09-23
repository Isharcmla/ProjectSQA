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

public class NodeUtil_isVarDeclaration_1285218278213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162;
     Object term10820;

    public NodeUtil_isVarDeclaration_1285218278213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1162, term1162.getClass(), "type", 1454781562);
        setIntField(term1164, term1164.getClass(), "type", 947449400);
        setIntField(term1166, term1166.getClass(), "type", 0);
        setField(term1166, term1166.getClass(), "next", null);
        setField(term1166, term1166.getClass(), "first", null);
        setField(term1166, term1166.getClass(), "last", null);
        setField(term1166, term1166.getClass(), "propListHead", null);
        setIntField(term1166, term1166.getClass(), "sourcePosition", 0);
        setField(term1166, term1166.getClass(), "jsType", null);
        setField(term1166, term1166.getClass(), "parent", null);
        setField(term1164, term1164.getClass(), "next", term1166);
        setIntField(term1169, term1169.getClass(), "type", 0);
        setField(term1169, term1169.getClass(), "next", null);
        setField(term1169, term1169.getClass(), "first", null);
        setField(term1169, term1169.getClass(), "last", null);
        setField(term1169, term1169.getClass(), "propListHead", null);
        setIntField(term1169, term1169.getClass(), "sourcePosition", 0);
        setField(term1169, term1169.getClass(), "jsType", null);
        setField(term1169, term1169.getClass(), "parent", null);
        setField(term1164, term1164.getClass(), "first", term1169);
        setIntField(term1172, term1172.getClass(), "type", 0);
        setField(term1172, term1172.getClass(), "next", null);
        setField(term1172, term1172.getClass(), "first", null);
        setField(term1172, term1172.getClass(), "last", null);
        setField(term1172, term1172.getClass(), "propListHead", null);
        setIntField(term1172, term1172.getClass(), "sourcePosition", 0);
        setField(term1172, term1172.getClass(), "jsType", null);
        setField(term1172, term1172.getClass(), "parent", null);
        setField(term1164, term1164.getClass(), "last", term1172);
        setField(term1164, term1164.getClass(), "propListHead", null);
        setIntField(term1164, term1164.getClass(), "sourcePosition", 0);
        setField(term1164, term1164.getClass(), "jsType", null);
        setField(term1164, term1164.getClass(), "parent", null);
        setField(term1162, term1162.getClass(), "next", term1164);
        setIntField(term1176, term1176.getClass(), "type", 0);
        setField(term1176, term1176.getClass(), "next", null);
        setField(term1176, term1176.getClass(), "first", null);
        setField(term1176, term1176.getClass(), "last", null);
        setField(term1176, term1176.getClass(), "propListHead", null);
        setIntField(term1176, term1176.getClass(), "sourcePosition", 0);
        setField(term1176, term1176.getClass(), "jsType", null);
        setField(term1176, term1176.getClass(), "parent", null);
        setField(term1162, term1162.getClass(), "first", term1176);
        setIntField(term1179, term1179.getClass(), "type", 0);
        setField(term1179, term1179.getClass(), "next", null);
        setField(term1179, term1179.getClass(), "first", null);
        setField(term1179, term1179.getClass(), "last", null);
        setField(term1179, term1179.getClass(), "propListHead", null);
        setIntField(term1179, term1179.getClass(), "sourcePosition", 0);
        setField(term1179, term1179.getClass(), "jsType", null);
        setField(term1179, term1179.getClass(), "parent", null);
        setField(term1162, term1162.getClass(), "last", term1179);
        setField(term1162, term1162.getClass(), "propListHead", null);
        setIntField(term1162, term1162.getClass(), "sourcePosition", 0);
        setField(term1162, term1162.getClass(), "jsType", null);
        setField(term1162, term1162.getClass(), "parent", null);
        term10820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10820, term10820.getClass(), "type", 1454781562);
        setIntField(term10821, term10821.getClass(), "type", 947449400);
        setIntField(term10822, term10822.getClass(), "type", 0);
        setField(term10822, term10822.getClass(), "next", null);
        setField(term10822, term10822.getClass(), "first", null);
        setField(term10822, term10822.getClass(), "last", null);
        setField(term10822, term10822.getClass(), "propListHead", null);
        setIntField(term10822, term10822.getClass(), "sourcePosition", 0);
        setField(term10822, term10822.getClass(), "jsType", null);
        setField(term10822, term10822.getClass(), "parent", null);
        setField(term10821, term10821.getClass(), "next", term10822);
        setIntField(term10823, term10823.getClass(), "type", 0);
        setField(term10823, term10823.getClass(), "next", null);
        setField(term10823, term10823.getClass(), "first", null);
        setField(term10823, term10823.getClass(), "last", null);
        setField(term10823, term10823.getClass(), "propListHead", null);
        setIntField(term10823, term10823.getClass(), "sourcePosition", 0);
        setField(term10823, term10823.getClass(), "jsType", null);
        setField(term10823, term10823.getClass(), "parent", null);
        setField(term10821, term10821.getClass(), "first", term10823);
        setIntField(term10824, term10824.getClass(), "type", 0);
        setField(term10824, term10824.getClass(), "next", null);
        setField(term10824, term10824.getClass(), "first", null);
        setField(term10824, term10824.getClass(), "last", null);
        setField(term10824, term10824.getClass(), "propListHead", null);
        setIntField(term10824, term10824.getClass(), "sourcePosition", 0);
        setField(term10824, term10824.getClass(), "jsType", null);
        setField(term10824, term10824.getClass(), "parent", null);
        setField(term10821, term10821.getClass(), "last", term10824);
        setField(term10821, term10821.getClass(), "propListHead", null);
        setIntField(term10821, term10821.getClass(), "sourcePosition", 0);
        setField(term10821, term10821.getClass(), "jsType", null);
        setField(term10821, term10821.getClass(), "parent", null);
        setField(term10820, term10820.getClass(), "next", term10821);
        setIntField(term10825, term10825.getClass(), "type", 0);
        setField(term10825, term10825.getClass(), "next", null);
        setField(term10825, term10825.getClass(), "first", null);
        setField(term10825, term10825.getClass(), "last", null);
        setField(term10825, term10825.getClass(), "propListHead", null);
        setIntField(term10825, term10825.getClass(), "sourcePosition", 0);
        setField(term10825, term10825.getClass(), "jsType", null);
        setField(term10825, term10825.getClass(), "parent", null);
        setField(term10820, term10820.getClass(), "first", term10825);
        setIntField(term10826, term10826.getClass(), "type", 0);
        setField(term10826, term10826.getClass(), "next", null);
        setField(term10826, term10826.getClass(), "first", null);
        setField(term10826, term10826.getClass(), "last", null);
        setField(term10826, term10826.getClass(), "propListHead", null);
        setIntField(term10826, term10826.getClass(), "sourcePosition", 0);
        setField(term10826, term10826.getClass(), "jsType", null);
        setField(term10826, term10826.getClass(), "parent", null);
        setField(term10820, term10820.getClass(), "last", term10826);
        setField(term10820, term10820.getClass(), "propListHead", null);
        setIntField(term10820, term10820.getClass(), "sourcePosition", 0);
        setField(term10820, term10820.getClass(), "jsType", null);
        setField(term10820, term10820.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1162;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1162, term10820));
        assertTrue(recursiveEquals(retValue, false));
    }

};


