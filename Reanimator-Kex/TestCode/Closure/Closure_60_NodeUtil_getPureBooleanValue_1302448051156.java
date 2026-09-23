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
import java.lang.String;

public class NodeUtil_getPureBooleanValue_1302448051156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22;
     Object term3983;
     Object enum1;

    public NodeUtil_getPureBooleanValue_1302448051156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22, term22.getClass(), "type", -883034806);
        setIntField(term24, term24.getClass(), "type", -1456670397);
        setIntField(term26, term26.getClass(), "type", 0);
        setField(term26, term26.getClass(), "next", null);
        setField(term26, term26.getClass(), "first", null);
        setField(term26, term26.getClass(), "last", null);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term24, term24.getClass(), "next", term26);
        setIntField(term29, term29.getClass(), "type", 0);
        setField(term29, term29.getClass(), "next", null);
        setField(term29, term29.getClass(), "first", null);
        setField(term29, term29.getClass(), "last", null);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        setField(term24, term24.getClass(), "first", term29);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term24, term24.getClass(), "last", term32);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term22, term22.getClass(), "next", term24);
        setIntField(term36, term36.getClass(), "type", 0);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term22, term22.getClass(), "first", term36);
        setIntField(term39, term39.getClass(), "type", 0);
        setField(term39, term39.getClass(), "next", null);
        setField(term39, term39.getClass(), "first", null);
        setField(term39, term39.getClass(), "last", null);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term22, term22.getClass(), "last", term39);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        term3983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3983, term3983.getClass(), "type", -883034806);
        setIntField(term3984, term3984.getClass(), "type", -1456670397);
        setIntField(term3985, term3985.getClass(), "type", 0);
        setField(term3985, term3985.getClass(), "next", null);
        setField(term3985, term3985.getClass(), "first", null);
        setField(term3985, term3985.getClass(), "last", null);
        setField(term3985, term3985.getClass(), "propListHead", null);
        setIntField(term3985, term3985.getClass(), "sourcePosition", 0);
        setField(term3985, term3985.getClass(), "jsType", null);
        setField(term3985, term3985.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "next", term3985);
        setIntField(term3986, term3986.getClass(), "type", 0);
        setField(term3986, term3986.getClass(), "next", null);
        setField(term3986, term3986.getClass(), "first", null);
        setField(term3986, term3986.getClass(), "last", null);
        setField(term3986, term3986.getClass(), "propListHead", null);
        setIntField(term3986, term3986.getClass(), "sourcePosition", 0);
        setField(term3986, term3986.getClass(), "jsType", null);
        setField(term3986, term3986.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "first", term3986);
        setIntField(term3987, term3987.getClass(), "type", 0);
        setField(term3987, term3987.getClass(), "next", null);
        setField(term3987, term3987.getClass(), "first", null);
        setField(term3987, term3987.getClass(), "last", null);
        setField(term3987, term3987.getClass(), "propListHead", null);
        setIntField(term3987, term3987.getClass(), "sourcePosition", 0);
        setField(term3987, term3987.getClass(), "jsType", null);
        setField(term3987, term3987.getClass(), "parent", null);
        setField(term3984, term3984.getClass(), "last", term3987);
        setField(term3984, term3984.getClass(), "propListHead", null);
        setIntField(term3984, term3984.getClass(), "sourcePosition", 0);
        setField(term3984, term3984.getClass(), "jsType", null);
        setField(term3984, term3984.getClass(), "parent", null);
        setField(term3983, term3983.getClass(), "next", term3984);
        setIntField(term3988, term3988.getClass(), "type", 0);
        setField(term3988, term3988.getClass(), "next", null);
        setField(term3988, term3988.getClass(), "first", null);
        setField(term3988, term3988.getClass(), "last", null);
        setField(term3988, term3988.getClass(), "propListHead", null);
        setIntField(term3988, term3988.getClass(), "sourcePosition", 0);
        setField(term3988, term3988.getClass(), "jsType", null);
        setField(term3988, term3988.getClass(), "parent", null);
        setField(term3983, term3983.getClass(), "first", term3988);
        setIntField(term3989, term3989.getClass(), "type", 0);
        setField(term3989, term3989.getClass(), "next", null);
        setField(term3989, term3989.getClass(), "first", null);
        setField(term3989, term3989.getClass(), "last", null);
        setField(term3989, term3989.getClass(), "propListHead", null);
        setIntField(term3989, term3989.getClass(), "sourcePosition", 0);
        setField(term3989, term3989.getClass(), "jsType", null);
        setField(term3989, term3989.getClass(), "parent", null);
        setField(term3983, term3983.getClass(), "last", term3989);
        setField(term3983, term3983.getClass(), "propListHead", null);
        setIntField(term3983, term3983.getClass(), "sourcePosition", 0);
        setField(term3983, term3983.getClass(), "jsType", null);
        setField(term3983, term3983.getClass(), "parent", null);
        Class<? extends Object> term3991 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term3990 = ((Class) term3991).getDeclaredField((String) "UNKNOWN");
        ((Field) term3990).setAccessible(true);
        enum1 = ((Field) term3990).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22;
        Object retValue = callMethod(klass, "getPureBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term22, term3983));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


