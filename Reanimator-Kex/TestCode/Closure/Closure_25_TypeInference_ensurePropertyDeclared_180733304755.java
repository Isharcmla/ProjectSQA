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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_ensurePropertyDeclared_180733304755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term1055;

    public TypeInference_ensurePropertyDeclared_180733304755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1004 = new HashMap();
        HashMap term1013 = new HashMap();
        Set<Object> term11107 =  ((Map) term1013).keySet();
        HashSet term1012 = new HashSet((Collection<? extends Object>) term11107);
        HashMap term1020 = new HashMap();
        Set<Object> term11108 =  ((Map) term1020).keySet();
        HashSet term1019 = new HashSet((Collection<? extends Object>) term11108);
        HashMap term1027 = new HashMap();
        Set<Object> term11109 =  ((Map) term1027).keySet();
        HashSet term1026 = new HashSet((Collection<? extends Object>) term11109);
        HashMap term1032 = new HashMap();
        HashMap term1040 = new HashMap();
        HashMap term1045 = new HashMap();
        term1001 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1003 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term1001, term1001.getClass(), "compiler", null);
        setField(term1002, term1002.getClass(), "reporter", null);
        setField(term1002, term1002.getClass(), "nativeTypes", term1003);
        setField(term1002, term1002.getClass(), "namesToTypes", term1004);
        setField(term1002, term1002.getClass(), "namespaces", term1012);
        setField(term1002, term1002.getClass(), "nonNullableTypeNames", term1019);
        setField(term1002, term1002.getClass(), "forwardDeclaredTypes", term1026);
        setField(term1002, term1002.getClass(), "typesIndexedByProperty", term1032);
        setField(term1002, term1002.getClass(), "eachRefTypeIndexedByProperty", term1040);
        setField(term1002, term1002.getClass(), "greatestSubtypeByProperty", term1045);
        setField(term1002, term1002.getClass(), "interfaceToImplementors", null);
        setField(term1002, term1002.getClass(), "unresolvedNamedTypes", null);
        setField(term1002, term1002.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1002, term1002.getClass(), "lastGeneration", false);
        setField(term1002, term1002.getClass(), "templateTypeName", null);
        setField(term1002, term1002.getClass(), "templateType", null);
        setBooleanField(term1002, term1002.getClass(), "tolerateUndefinedValues", false);
        setField(term1002, term1002.getClass(), "resolveMode", null);
        setField(term1001, term1001.getClass(), "registry", term1002);
        setField(term1001, term1001.getClass(), "reverseInterpreter", null);
        setField(term1001, term1001.getClass(), "syntacticScope", null);
        setField(term1001, term1001.getClass(), "functionScope", null);
        setField(term1001, term1001.getClass(), "bottomScope", null);
        setField(term1001, term1001.getClass(), "assertionFunctionsMap", null);
        setField(term1001, term1001.getClass(), "cfg", null);
        setField(term1001, term1001.getClass(), "joinOp", null);
        setField(term1001, term1001.getClass(), "orderedWorkSet", null);
        term1055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1055, term1055.getClass(), "type", 202001407);
        setIntField(term1057, term1057.getClass(), "type", 158873461);
        setIntField(term1059, term1059.getClass(), "type", -430151637);
        setIntField(term1061, term1061.getClass(), "type", -1697741339);
        setIntField(term1063, term1063.getClass(), "type", 98922530);
        setField(term1063, term1063.getClass(), "next", null);
        setField(term1063, term1063.getClass(), "first", null);
        setField(term1063, term1063.getClass(), "last", null);
        setField(term1063, term1063.getClass(), "propListHead", null);
        setIntField(term1063, term1063.getClass(), "sourcePosition", 0);
        setField(term1063, term1063.getClass(), "jsType", null);
        setField(term1063, term1063.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "next", term1063);
        setIntField(term1066, term1066.getClass(), "type", -1388471422);
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
        setIntField(term1070, term1070.getClass(), "type", 2098647989);
        setIntField(term1072, term1072.getClass(), "type", 1598895173);
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
        setIntField(term1077, term1077.getClass(), "type", 1830648570);
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
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1055;
        try {
            callMethod(klass, "ensurePropertyDeclared", argTypes, term1001, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


