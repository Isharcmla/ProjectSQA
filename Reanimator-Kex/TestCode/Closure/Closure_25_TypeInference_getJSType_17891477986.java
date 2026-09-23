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

public class TypeInference_getJSType_17891477986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6097;
     Object term6152;

    public TypeInference_getJSType_17891477986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6100 = new HashMap();
        HashMap term6109 = new HashMap();
        Set<Object> term27120 =  ((Map) term6109).keySet();
        HashSet term6108 = new HashSet((Collection<? extends Object>) term27120);
        HashMap term6116 = new HashMap();
        Set<Object> term27121 =  ((Map) term6116).keySet();
        HashSet term6115 = new HashSet((Collection<? extends Object>) term27121);
        HashMap term6123 = new HashMap();
        Set<Object> term27122 =  ((Map) term6123).keySet();
        HashSet term6122 = new HashSet((Collection<? extends Object>) term27122);
        HashMap term6129 = new HashMap();
        HashMap term6137 = new HashMap();
        HashMap term6142 = new HashMap();
        term6097 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6098 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6099 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term6097, term6097.getClass(), "compiler", null);
        setField(term6098, term6098.getClass(), "reporter", null);
        setField(term6098, term6098.getClass(), "nativeTypes", term6099);
        setField(term6098, term6098.getClass(), "namesToTypes", term6100);
        setField(term6098, term6098.getClass(), "namespaces", term6108);
        setField(term6098, term6098.getClass(), "nonNullableTypeNames", term6115);
        setField(term6098, term6098.getClass(), "forwardDeclaredTypes", term6122);
        setField(term6098, term6098.getClass(), "typesIndexedByProperty", term6129);
        setField(term6098, term6098.getClass(), "eachRefTypeIndexedByProperty", term6137);
        setField(term6098, term6098.getClass(), "greatestSubtypeByProperty", term6142);
        setField(term6098, term6098.getClass(), "interfaceToImplementors", null);
        setField(term6098, term6098.getClass(), "unresolvedNamedTypes", null);
        setField(term6098, term6098.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6098, term6098.getClass(), "lastGeneration", false);
        setField(term6098, term6098.getClass(), "templateTypeName", null);
        setField(term6098, term6098.getClass(), "templateType", null);
        setBooleanField(term6098, term6098.getClass(), "tolerateUndefinedValues", false);
        setField(term6098, term6098.getClass(), "resolveMode", null);
        setField(term6097, term6097.getClass(), "registry", term6098);
        setField(term6097, term6097.getClass(), "reverseInterpreter", null);
        setField(term6097, term6097.getClass(), "syntacticScope", null);
        setField(term6097, term6097.getClass(), "functionScope", null);
        setField(term6097, term6097.getClass(), "bottomScope", null);
        setField(term6097, term6097.getClass(), "assertionFunctionsMap", null);
        setField(term6097, term6097.getClass(), "cfg", null);
        setField(term6097, term6097.getClass(), "joinOp", null);
        setField(term6097, term6097.getClass(), "orderedWorkSet", null);
        term6152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6152, term6152.getClass(), "type", 797203987);
        setIntField(term6154, term6154.getClass(), "type", 1973060703);
        setIntField(term6156, term6156.getClass(), "type", -138239905);
        setIntField(term6158, term6158.getClass(), "type", 1709474063);
        setIntField(term6160, term6160.getClass(), "type", 1406617209);
        setField(term6160, term6160.getClass(), "next", null);
        setField(term6160, term6160.getClass(), "first", null);
        setField(term6160, term6160.getClass(), "last", null);
        setField(term6160, term6160.getClass(), "propListHead", null);
        setIntField(term6160, term6160.getClass(), "sourcePosition", 0);
        setField(term6160, term6160.getClass(), "jsType", null);
        setField(term6160, term6160.getClass(), "parent", null);
        setField(term6158, term6158.getClass(), "next", term6160);
        setIntField(term6163, term6163.getClass(), "type", 1706047059);
        setField(term6163, term6163.getClass(), "next", null);
        setField(term6163, term6163.getClass(), "first", null);
        setField(term6163, term6163.getClass(), "last", term6160);
        setField(term6163, term6163.getClass(), "propListHead", null);
        setIntField(term6163, term6163.getClass(), "sourcePosition", 0);
        setField(term6163, term6163.getClass(), "jsType", null);
        setField(term6163, term6163.getClass(), "parent", null);
        setField(term6158, term6158.getClass(), "first", term6163);
        setField(term6158, term6158.getClass(), "last", term6156);
        setField(term6158, term6158.getClass(), "propListHead", null);
        setIntField(term6158, term6158.getClass(), "sourcePosition", 0);
        setField(term6158, term6158.getClass(), "jsType", null);
        setField(term6158, term6158.getClass(), "parent", null);
        setField(term6156, term6156.getClass(), "next", term6158);
        setField(term6156, term6156.getClass(), "first", term6160);
        setIntField(term6167, term6167.getClass(), "type", -1999787419);
        setIntField(term6169, term6169.getClass(), "type", -1224443634);
        setField(term6169, term6169.getClass(), "next", null);
        setField(term6169, term6169.getClass(), "first", term6163);
        setField(term6169, term6169.getClass(), "last", term6158);
        setField(term6169, term6169.getClass(), "propListHead", null);
        setIntField(term6169, term6169.getClass(), "sourcePosition", 0);
        setField(term6169, term6169.getClass(), "jsType", null);
        setField(term6169, term6169.getClass(), "parent", null);
        setField(term6167, term6167.getClass(), "next", term6169);
        setField(term6167, term6167.getClass(), "first", term6154);
        setField(term6167, term6167.getClass(), "last", term6154);
        setField(term6167, term6167.getClass(), "propListHead", null);
        setIntField(term6167, term6167.getClass(), "sourcePosition", 0);
        setField(term6167, term6167.getClass(), "jsType", null);
        setField(term6167, term6167.getClass(), "parent", null);
        setField(term6156, term6156.getClass(), "last", term6167);
        setField(term6156, term6156.getClass(), "propListHead", null);
        setIntField(term6156, term6156.getClass(), "sourcePosition", 0);
        setField(term6156, term6156.getClass(), "jsType", null);
        setField(term6156, term6156.getClass(), "parent", null);
        setField(term6154, term6154.getClass(), "next", term6156);
        setIntField(term6174, term6174.getClass(), "type", 1048451946);
        setField(term6174, term6174.getClass(), "next", term6167);
        setField(term6174, term6174.getClass(), "first", term6169);
        setField(term6174, term6174.getClass(), "last", term6152);
        setField(term6174, term6174.getClass(), "propListHead", null);
        setIntField(term6174, term6174.getClass(), "sourcePosition", 0);
        setField(term6174, term6174.getClass(), "jsType", null);
        setField(term6174, term6174.getClass(), "parent", null);
        setField(term6154, term6154.getClass(), "first", term6174);
        setField(term6154, term6154.getClass(), "last", term6174);
        setField(term6154, term6154.getClass(), "propListHead", null);
        setIntField(term6154, term6154.getClass(), "sourcePosition", 0);
        setField(term6154, term6154.getClass(), "jsType", null);
        setField(term6154, term6154.getClass(), "parent", null);
        setField(term6152, term6152.getClass(), "next", term6154);
        setField(term6152, term6152.getClass(), "first", term6158);
        setField(term6152, term6152.getClass(), "last", term6160);
        setField(term6152, term6152.getClass(), "propListHead", null);
        setIntField(term6152, term6152.getClass(), "sourcePosition", 0);
        setField(term6152, term6152.getClass(), "jsType", null);
        setField(term6152, term6152.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6152;
        try {
            callMethod(klass, "getJSType", argTypes, term6097, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


