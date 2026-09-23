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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isNameReferenced_1680890329289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4059;

    public NodeUtil_isNameReferenced_1680890329289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4059, term4059.getClass(), "type", 1761540885);
        setIntField(term4061, term4061.getClass(), "type", -168498989);
        setIntField(term4063, term4063.getClass(), "type", 388247095);
        setIntField(term4065, term4065.getClass(), "type", -1320402633);
        setIntField(term4067, term4067.getClass(), "type", 919602316);
        setField(term4067, term4067.getClass(), "next", null);
        setField(term4067, term4067.getClass(), "first", null);
        setField(term4067, term4067.getClass(), "last", null);
        setField(term4067, term4067.getClass(), "propListHead", null);
        setIntField(term4067, term4067.getClass(), "sourcePosition", 0);
        setField(term4067, term4067.getClass(), "jsType", null);
        setField(term4067, term4067.getClass(), "parent", null);
        setField(term4065, term4065.getClass(), "next", term4067);
        setIntField(term4070, term4070.getClass(), "type", 1833713431);
        setField(term4070, term4070.getClass(), "next", null);
        setField(term4070, term4070.getClass(), "first", null);
        setField(term4070, term4070.getClass(), "last", term4067);
        setField(term4070, term4070.getClass(), "propListHead", null);
        setIntField(term4070, term4070.getClass(), "sourcePosition", 0);
        setField(term4070, term4070.getClass(), "jsType", null);
        setField(term4070, term4070.getClass(), "parent", null);
        setField(term4065, term4065.getClass(), "first", term4070);
        setField(term4065, term4065.getClass(), "last", term4063);
        setField(term4065, term4065.getClass(), "propListHead", null);
        setIntField(term4065, term4065.getClass(), "sourcePosition", 0);
        setField(term4065, term4065.getClass(), "jsType", null);
        setField(term4065, term4065.getClass(), "parent", null);
        setField(term4063, term4063.getClass(), "next", term4065);
        setField(term4063, term4063.getClass(), "first", term4067);
        setIntField(term4074, term4074.getClass(), "type", -2003607923);
        setIntField(term4076, term4076.getClass(), "type", 1378805929);
        setField(term4076, term4076.getClass(), "next", null);
        setField(term4076, term4076.getClass(), "first", term4070);
        setField(term4076, term4076.getClass(), "last", term4065);
        setField(term4076, term4076.getClass(), "propListHead", null);
        setIntField(term4076, term4076.getClass(), "sourcePosition", 0);
        setField(term4076, term4076.getClass(), "jsType", null);
        setField(term4076, term4076.getClass(), "parent", null);
        setField(term4074, term4074.getClass(), "next", term4076);
        setField(term4074, term4074.getClass(), "first", term4061);
        setField(term4074, term4074.getClass(), "last", term4061);
        setField(term4074, term4074.getClass(), "propListHead", null);
        setIntField(term4074, term4074.getClass(), "sourcePosition", 0);
        setField(term4074, term4074.getClass(), "jsType", null);
        setField(term4074, term4074.getClass(), "parent", null);
        setField(term4063, term4063.getClass(), "last", term4074);
        setField(term4063, term4063.getClass(), "propListHead", null);
        setIntField(term4063, term4063.getClass(), "sourcePosition", 0);
        setField(term4063, term4063.getClass(), "jsType", null);
        setField(term4063, term4063.getClass(), "parent", null);
        setField(term4061, term4061.getClass(), "next", term4063);
        setIntField(term4081, term4081.getClass(), "type", 695052304);
        setField(term4081, term4081.getClass(), "next", term4074);
        setField(term4081, term4081.getClass(), "first", term4076);
        setField(term4081, term4081.getClass(), "last", term4059);
        setField(term4081, term4081.getClass(), "propListHead", null);
        setIntField(term4081, term4081.getClass(), "sourcePosition", 0);
        setField(term4081, term4081.getClass(), "jsType", null);
        setField(term4081, term4081.getClass(), "parent", null);
        setField(term4061, term4061.getClass(), "first", term4081);
        setField(term4061, term4061.getClass(), "last", term4081);
        setField(term4061, term4061.getClass(), "propListHead", null);
        setIntField(term4061, term4061.getClass(), "sourcePosition", 0);
        setField(term4061, term4061.getClass(), "jsType", null);
        setField(term4061, term4061.getClass(), "parent", null);
        setField(term4059, term4059.getClass(), "next", term4061);
        setField(term4059, term4059.getClass(), "first", term4065);
        setField(term4059, term4059.getClass(), "last", term4067);
        setField(term4059, term4059.getClass(), "propListHead", null);
        setIntField(term4059, term4059.getClass(), "sourcePosition", 0);
        setField(term4059, term4059.getClass(), "jsType", null);
        setField(term4059, term4059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4059;
        args[1] = "hoicvmsovO";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


