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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypedScopeCreator_createScope_26573221511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term50;
     Object term71;

    public TypedScopeCreator_createScope_26573221511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5 = new HashMap();
        HashMap term12 = new HashMap();
        Set<Object> term4876 =  ((Map) term12).keySet();
        HashSet term11 = new HashSet((Collection<? extends Object>) term4876);
        HashMap term18 = new HashMap();
        Set<Object> term4877 =  ((Map) term18).keySet();
        HashSet term17 = new HashSet((Collection<? extends Object>) term4877);
        HashMap term24 = new HashMap();
        Set<Object> term4878 =  ((Map) term24).keySet();
        HashSet term23 = new HashSet((Collection<? extends Object>) term4878);
        HashMap term29 = new HashMap();
        HashMap term35 = new HashMap();
        HashMap term40 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "typeParsingErrorReporter", null);
        setField(term2, term2.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "reporter", null);
        setField(term3, term3.getClass(), "nativeTypes", term4);
        setField(term3, term3.getClass(), "namesToTypes", term5);
        setField(term3, term3.getClass(), "namespaces", term11);
        setField(term3, term3.getClass(), "nonNullableTypeNames", term17);
        setField(term3, term3.getClass(), "forwardDeclaredTypes", term23);
        setField(term3, term3.getClass(), "typesIndexedByProperty", term29);
        setField(term3, term3.getClass(), "eachRefTypeIndexedByProperty", term35);
        setField(term3, term3.getClass(), "greatestSubtypeByProperty", term40);
        setField(term3, term3.getClass(), "interfaceToImplementors", null);
        setField(term3, term3.getClass(), "unresolvedNamedTypes", null);
        setField(term3, term3.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3, term3.getClass(), "lastGeneration", false);
        setField(term3, term3.getClass(), "templateTypeName", null);
        setField(term3, term3.getClass(), "templateType", null);
        setBooleanField(term3, term3.getClass(), "tolerateUndefinedValues", false);
        setField(term3, term3.getClass(), "resolveMode", null);
        setField(term2, term2.getClass(), "typeRegistry", term3);
        setField(term2, term2.getClass(), "allValueTypes", null);
        setBooleanField(term2, term2.getClass(), "shouldReport", false);
        setBooleanField(term2, term2.getClass(), "recordErrors", false);
        setField(term2, term2.getClass(), "nullOrUndefined", null);
        setField(term2, term2.getClass(), "mismatches", null);
        setField(term1, term1.getClass(), "validator", term2);
        setField(term1, term1.getClass(), "codingConvention", null);
        setField(term1, term1.getClass(), "typeRegistry", null);
        setField(term1, term1.getClass(), "delegateProxyPrototypes", null);
        setField(term1, term1.getClass(), "delegateCallingConventions", null);
        term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50, term50.getClass(), "type", -1922583790);
        setIntField(term52, term52.getClass(), "type", 1227103734);
        setIntField(term54, term54.getClass(), "type", 0);
        setField(term54, term54.getClass(), "next", null);
        setField(term54, term54.getClass(), "first", null);
        setField(term54, term54.getClass(), "last", null);
        setField(term54, term54.getClass(), "propListHead", null);
        setIntField(term54, term54.getClass(), "sourcePosition", 0);
        setField(term54, term54.getClass(), "jsType", null);
        setField(term54, term54.getClass(), "parent", null);
        setField(term52, term52.getClass(), "next", term54);
        setIntField(term57, term57.getClass(), "type", 0);
        setField(term57, term57.getClass(), "next", null);
        setField(term57, term57.getClass(), "first", null);
        setField(term57, term57.getClass(), "last", null);
        setField(term57, term57.getClass(), "propListHead", null);
        setIntField(term57, term57.getClass(), "sourcePosition", 0);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term52, term52.getClass(), "first", term57);
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term52, term52.getClass(), "last", term60);
        setField(term52, term52.getClass(), "propListHead", null);
        setIntField(term52, term52.getClass(), "sourcePosition", 0);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term50, term50.getClass(), "next", term52);
        setIntField(term64, term64.getClass(), "type", 0);
        setField(term64, term64.getClass(), "next", null);
        setField(term64, term64.getClass(), "first", null);
        setField(term64, term64.getClass(), "last", null);
        setField(term64, term64.getClass(), "propListHead", null);
        setIntField(term64, term64.getClass(), "sourcePosition", 0);
        setField(term64, term64.getClass(), "jsType", null);
        setField(term64, term64.getClass(), "parent", null);
        setField(term50, term50.getClass(), "first", term64);
        setIntField(term67, term67.getClass(), "type", 0);
        setField(term67, term67.getClass(), "next", null);
        setField(term67, term67.getClass(), "first", null);
        setField(term67, term67.getClass(), "last", null);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term50, term50.getClass(), "last", term67);
        setField(term50, term50.getClass(), "propListHead", null);
        setIntField(term50, term50.getClass(), "sourcePosition", 0);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        HashMap term72 = new HashMap();
        term71 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term85 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71, term71.getClass(), "vars", term72);
        setField(term85, term85.getClass(), "vars", null);
        setField(term85, term85.getClass(), "parent", null);
        setIntField(term85, term85.getClass(), "depth", 0);
        setField(term85, term85.getClass(), "rootNode", null);
        setField(term85, term85.getClass(), "thisType", null);
        setBooleanField(term85, term85.getClass(), "isBottom", false);
        setField(term85, term85.getClass(), "arguments", null);
        setField(term71, term71.getClass(), "parent", term85);
        setIntField(term71, term71.getClass(), "depth", 1048535127);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term71, term71.getClass(), "rootNode", term89);
        setField(term71, term71.getClass(), "thisType", null);
        setBooleanField(term71, term71.getClass(), "isBottom", false);
        setField(term71, term71.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term50;
        args[1] = term71;
        try {
            callMethod(klass, "createScope", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


