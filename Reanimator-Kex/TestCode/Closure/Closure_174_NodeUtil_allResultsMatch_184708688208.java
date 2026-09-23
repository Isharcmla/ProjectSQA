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

public class NodeUtil_allResultsMatch_184708688208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;

    public NodeUtil_allResultsMatch_184708688208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1055, term1055.getClass(), "type", 1209799204);
        setIntField(term1057, term1057.getClass(), "type", 1094107751);
        setIntField(term1059, term1059.getClass(), "type", 844222656);
        setIntField(term1061, term1061.getClass(), "type", -18216811);
        setIntField(term1063, term1063.getClass(), "type", -1813280137);
        setField(term1063, term1063.getClass(), "next", null);
        setField(term1063, term1063.getClass(), "first", null);
        setField(term1063, term1063.getClass(), "last", null);
        setField(term1063, term1063.getClass(), "propListHead", null);
        setIntField(term1063, term1063.getClass(), "sourcePosition", 0);
        setField(term1063, term1063.getClass(), "jsType", null);
        setField(term1063, term1063.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "next", term1063);
        setIntField(term1066, term1066.getClass(), "type", 719656595);
        setField(term1066, term1066.getClass(), "next", null);
        setField(term1066, term1066.getClass(), "first", null);
        setField(term1066, term1066.getClass(), "last", term1063);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "first", term1066);
        setField(term1061, term1061.getClass(), "last", term1059);
        setField(term1061, term1061.getClass(), "propListHead", null);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 0);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "next", term1061);
        setField(term1059, term1059.getClass(), "first", term1063);
        setIntField(term1070, term1070.getClass(), "type", -390501023);
        setIntField(term1072, term1072.getClass(), "type", -1667482829);
        setField(term1072, term1072.getClass(), "next", null);
        setField(term1072, term1072.getClass(), "first", term1066);
        setField(term1072, term1072.getClass(), "last", term1061);
        setField(term1072, term1072.getClass(), "propListHead", null);
        setIntField(term1072, term1072.getClass(), "sourcePosition", 0);
        setField(term1072, term1072.getClass(), "jsType", null);
        setField(term1072, term1072.getClass(), "parent", null);
        setField(term1070, term1070.getClass(), "next", term1072);
        setField(term1070, term1070.getClass(), "first", term1057);
        setField(term1070, term1070.getClass(), "last", term1057);
        setField(term1070, term1070.getClass(), "propListHead", null);
        setIntField(term1070, term1070.getClass(), "sourcePosition", 0);
        setField(term1070, term1070.getClass(), "jsType", null);
        setField(term1070, term1070.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "last", term1070);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "next", term1059);
        setIntField(term1077, term1077.getClass(), "type", 1116576792);
        setField(term1077, term1077.getClass(), "next", term1070);
        setField(term1077, term1077.getClass(), "first", term1072);
        setField(term1077, term1077.getClass(), "last", term1055);
        setField(term1077, term1077.getClass(), "propListHead", null);
        setIntField(term1077, term1077.getClass(), "sourcePosition", 0);
        setField(term1077, term1077.getClass(), "jsType", null);
        setField(term1077, term1077.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "first", term1077);
        setField(term1057, term1057.getClass(), "last", term1077);
        setField(term1057, term1057.getClass(), "propListHead", null);
        setIntField(term1057, term1057.getClass(), "sourcePosition", 0);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
        setField(term1055, term1055.getClass(), "next", term1057);
        setField(term1055, term1055.getClass(), "first", term1061);
        setField(term1055, term1055.getClass(), "last", term1063);
        setField(term1055, term1055.getClass(), "propListHead", null);
        setIntField(term1055, term1055.getClass(), "sourcePosition", 0);
        setField(term1055, term1055.getClass(), "jsType", null);
        setField(term1055, term1055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term1055;
        args[1] = null;
        try {
            callMethod(klass, "allResultsMatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


