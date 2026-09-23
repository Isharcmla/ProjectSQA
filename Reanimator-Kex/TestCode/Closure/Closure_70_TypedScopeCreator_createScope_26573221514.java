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

public class TypedScopeCreator_createScope_26573221514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term49;
     Object term76;

    public TypedScopeCreator_createScope_26573221514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5 = new HashMap();
        HashMap term12 = new HashMap();
        Set<Object> term4937 =  ((Map) term12).keySet();
        HashSet term11 = new HashSet((Collection<? extends Object>) term4937);
        HashMap term18 = new HashMap();
        Set<Object> term4938 =  ((Map) term18).keySet();
        HashSet term17 = new HashSet((Collection<? extends Object>) term4938);
        HashMap term24 = new HashMap();
        Set<Object> term4939 =  ((Map) term24).keySet();
        HashSet term23 = new HashSet((Collection<? extends Object>) term4939);
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
        setField(term2, term2.getClass(), "nullOrUndefined", null);
        setField(term2, term2.getClass(), "mismatches", null);
        setField(term1, term1.getClass(), "validator", term2);
        setField(term1, term1.getClass(), "codingConvention", null);
        setField(term1, term1.getClass(), "typeRegistry", null);
        setField(term1, term1.getClass(), "delegateProxyPrototypes", null);
        term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term49, term49.getClass(), "type", 391863371);
        setIntField(term51, term51.getClass(), "type", -2038273078);
        setIntField(term53, term53.getClass(), "type", 0);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", null);
        setField(term53, term53.getClass(), "last", null);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term51, term51.getClass(), "next", term53);
        setIntField(term56, term56.getClass(), "type", 0);
        setField(term56, term56.getClass(), "next", null);
        setField(term56, term56.getClass(), "first", null);
        setField(term56, term56.getClass(), "last", null);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term51, term51.getClass(), "first", term56);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term51, term51.getClass(), "last", term59);
        setField(term62, term62.getClass(), "next", null);
        setIntField(term62, term62.getClass(), "type", 0);
        setIntField(term62, term62.getClass(), "intValue", 0);
        setField(term62, term62.getClass(), "objectValue", null);
        setField(term51, term51.getClass(), "propListHead", term62);
        setIntField(term51, term51.getClass(), "sourcePosition", 1725571209);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term49, term49.getClass(), "next", term51);
        setIntField(term66, term66.getClass(), "type", 0);
        setField(term66, term66.getClass(), "next", null);
        setField(term66, term66.getClass(), "first", null);
        setField(term66, term66.getClass(), "last", null);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term49, term49.getClass(), "first", term66);
        setIntField(term69, term69.getClass(), "type", 0);
        setField(term69, term69.getClass(), "next", null);
        setField(term69, term69.getClass(), "first", null);
        setField(term69, term69.getClass(), "last", null);
        setField(term69, term69.getClass(), "propListHead", null);
        setIntField(term69, term69.getClass(), "sourcePosition", 0);
        setField(term69, term69.getClass(), "jsType", null);
        setField(term69, term69.getClass(), "parent", null);
        setField(term49, term49.getClass(), "last", term69);
        setField(term72, term72.getClass(), "next", null);
        setIntField(term72, term72.getClass(), "type", 0);
        setIntField(term72, term72.getClass(), "intValue", 0);
        setField(term72, term72.getClass(), "objectValue", null);
        setField(term49, term49.getClass(), "propListHead", term72);
        setIntField(term49, term49.getClass(), "sourcePosition", -522618178);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        HashMap term77 = new HashMap();
        term76 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term90 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76, term76.getClass(), "vars", term77);
        setField(term90, term90.getClass(), "vars", null);
        setField(term90, term90.getClass(), "parent", null);
        setIntField(term90, term90.getClass(), "depth", 0);
        setField(term90, term90.getClass(), "rootNode", null);
        setField(term90, term90.getClass(), "thisType", null);
        setBooleanField(term90, term90.getClass(), "isBottom", false);
        setField(term90, term90.getClass(), "arguments", null);
        setField(term76, term76.getClass(), "parent", term90);
        setIntField(term76, term76.getClass(), "depth", -2068769794);
        setIntField(term94, term94.getClass(), "type", 0);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", null);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term76, term76.getClass(), "rootNode", term94);
        setField(term76, term76.getClass(), "thisType", null);
        setBooleanField(term76, term76.getClass(), "isBottom", false);
        setField(term76, term76.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term49;
        args[1] = term76;
        try {
            callMethod(klass, "createScope", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


