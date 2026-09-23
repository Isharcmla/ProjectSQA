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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class PureFunctionIdentifier_getDebugReport_21291150099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term1066;

    public PureFunctionIdentifier_getDebugReport_21291150099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term97 = new HashMap();
        Object term117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term117, term117.getClass(), "type", 0);
        setField(term117, term117.getClass(), "next", null);
        setField(term117, term117.getClass(), "first", null);
        setField(term117, term117.getClass(), "last", null);
        setField(term117, term117.getClass(), "propListHead", null);
        setIntField(term117, term117.getClass(), "sourcePosition", 0);
        setField(term117, term117.getClass(), "jsType", null);
        setField(term117, term117.getClass(), "parent", null);
        Object term120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term120, term120.getClass(), "type", 0);
        setField(term120, term120.getClass(), "next", null);
        setField(term120, term120.getClass(), "first", null);
        setField(term120, term120.getClass(), "last", null);
        setField(term120, term120.getClass(), "propListHead", null);
        setIntField(term120, term120.getClass(), "sourcePosition", 0);
        setField(term120, term120.getClass(), "jsType", null);
        setField(term120, term120.getClass(), "parent", null);
        Object term123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123, term123.getClass(), "type", 0);
        setField(term123, term123.getClass(), "next", null);
        setField(term123, term123.getClass(), "first", null);
        setField(term123, term123.getClass(), "last", null);
        setField(term123, term123.getClass(), "propListHead", null);
        setIntField(term123, term123.getClass(), "sourcePosition", 0);
        setField(term123, term123.getClass(), "jsType", null);
        setField(term123, term123.getClass(), "parent", null);
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126, term126.getClass(), "type", 0);
        setField(term126, term126.getClass(), "next", null);
        setField(term126, term126.getClass(), "first", null);
        setField(term126, term126.getClass(), "last", null);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        ArrayList term115 = new ArrayList();
        ((ArrayList) term115).add(term117);
        ((ArrayList) term115).add(term120);
        ((ArrayList) term115).add(term123);
        ((ArrayList) term115).add(term126);
        term96 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96, term96.getClass(), "compiler", null);
        setField(term96, term96.getClass(), "definitionProvider", null);
        setField(term96, term96.getClass(), "functionSideEffectMap", term97);
        setField(term96, term96.getClass(), "allFunctionCalls", term115);
        setIntField(term131, term131.getClass(), "type", 0);
        setField(term131, term131.getClass(), "next", null);
        setField(term131, term131.getClass(), "first", null);
        setField(term131, term131.getClass(), "last", null);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term96, term96.getClass(), "externs", term131);
        setIntField(term134, term134.getClass(), "type", 0);
        setField(term134, term134.getClass(), "next", null);
        setField(term134, term134.getClass(), "first", null);
        setField(term134, term134.getClass(), "last", null);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term96, term96.getClass(), "root", term134);
        HashMap term1067 = new HashMap();
        Object term1071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1071, term1071.getClass(), "type", 0);
        setField(term1071, term1071.getClass(), "next", null);
        setField(term1071, term1071.getClass(), "first", null);
        setField(term1071, term1071.getClass(), "last", null);
        setField(term1071, term1071.getClass(), "propListHead", null);
        setIntField(term1071, term1071.getClass(), "sourcePosition", 0);
        setField(term1071, term1071.getClass(), "jsType", null);
        setField(term1071, term1071.getClass(), "parent", null);
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1072, term1072.getClass(), "type", 0);
        setField(term1072, term1072.getClass(), "next", null);
        setField(term1072, term1072.getClass(), "first", null);
        setField(term1072, term1072.getClass(), "last", null);
        setField(term1072, term1072.getClass(), "propListHead", null);
        setIntField(term1072, term1072.getClass(), "sourcePosition", 0);
        setField(term1072, term1072.getClass(), "jsType", null);
        setField(term1072, term1072.getClass(), "parent", null);
        Object term1073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1073, term1073.getClass(), "type", 0);
        setField(term1073, term1073.getClass(), "next", null);
        setField(term1073, term1073.getClass(), "first", null);
        setField(term1073, term1073.getClass(), "last", null);
        setField(term1073, term1073.getClass(), "propListHead", null);
        setIntField(term1073, term1073.getClass(), "sourcePosition", 0);
        setField(term1073, term1073.getClass(), "jsType", null);
        setField(term1073, term1073.getClass(), "parent", null);
        Object term1074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1074, term1074.getClass(), "type", 0);
        setField(term1074, term1074.getClass(), "next", null);
        setField(term1074, term1074.getClass(), "first", null);
        setField(term1074, term1074.getClass(), "last", null);
        setField(term1074, term1074.getClass(), "propListHead", null);
        setIntField(term1074, term1074.getClass(), "sourcePosition", 0);
        setField(term1074, term1074.getClass(), "jsType", null);
        setField(term1074, term1074.getClass(), "parent", null);
        ArrayList term1069 = new ArrayList();
        ((ArrayList) term1069).add(term1071);
        ((ArrayList) term1069).add(term1072);
        ((ArrayList) term1069).add(term1073);
        ((ArrayList) term1069).add(term1074);
        term1066 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term1075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1066, term1066.getClass(), "compiler", null);
        setField(term1066, term1066.getClass(), "definitionProvider", null);
        setField(term1066, term1066.getClass(), "functionSideEffectMap", term1067);
        setField(term1066, term1066.getClass(), "allFunctionCalls", term1069);
        setIntField(term1075, term1075.getClass(), "type", 0);
        setField(term1075, term1075.getClass(), "next", null);
        setField(term1075, term1075.getClass(), "first", null);
        setField(term1075, term1075.getClass(), "last", null);
        setField(term1075, term1075.getClass(), "propListHead", null);
        setIntField(term1075, term1075.getClass(), "sourcePosition", 0);
        setField(term1075, term1075.getClass(), "jsType", null);
        setField(term1075, term1075.getClass(), "parent", null);
        setField(term1066, term1066.getClass(), "externs", term1075);
        setIntField(term1076, term1076.getClass(), "type", 0);
        setField(term1076, term1076.getClass(), "next", null);
        setField(term1076, term1076.getClass(), "first", null);
        setField(term1076, term1076.getClass(), "last", null);
        setField(term1076, term1076.getClass(), "propListHead", null);
        setIntField(term1076, term1076.getClass(), "sourcePosition", 0);
        setField(term1076, term1076.getClass(), "jsType", null);
        setField(term1076, term1076.getClass(), "parent", null);
        setField(term1066, term1066.getClass(), "root", term1076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDebugReport", argTypes, term96, args);
        assertTrue(recursiveEquals(term96, term1066));
        assertTrue(recursiveEquals(retValue, "Pure functions:\n\n"));
    }

};


