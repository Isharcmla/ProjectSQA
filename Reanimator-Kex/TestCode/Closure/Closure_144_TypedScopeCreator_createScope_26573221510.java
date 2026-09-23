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
import java.lang.String;
import java.util.ArrayList;

public class TypedScopeCreator_createScope_26573221510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term74;
     Object term101;

    public TypedScopeCreator_createScope_26573221510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5 = new HashMap();
        HashMap term12 = new HashMap();
        Set<Object> term6382 =  ((Map) term12).keySet();
        HashSet term11 = new HashSet((Collection<? extends Object>) term6382);
        HashMap term18 = new HashMap();
        Set<Object> term6383 =  ((Map) term18).keySet();
        HashSet term17 = new HashSet((Collection<? extends Object>) term6383);
        HashMap term24 = new HashMap();
        Set<Object> term6384 =  ((Map) term24).keySet();
        HashSet term23 = new HashSet((Collection<? extends Object>) term6384);
        HashMap term29 = new HashMap();
        HashMap term34 = new HashMap();
        Class<? extends Object> term6396 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term6395 = ((Class) term6396).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term6395).setAccessible(true);
        Object enum7 = ((Field) term6395).get((Object) null);
        Object term64 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term64, term64.getClass(), "typeA", null);
        setField(term64, term64.getClass(), "typeB", null);
        ArrayList term62 = new ArrayList();
        ((ArrayList) term62).add(term64);
        ArrayList term70 = new ArrayList();
        ((ArrayList) term70).add((Object)null);
        ((ArrayList) term70).add((Object)null);
        ((ArrayList) term70).add((Object)null);
        ((ArrayList) term70).add((Object)null);
        ((ArrayList) term70).add((Object)null);
        ((ArrayList) term70).add((Object)null);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "typeParsingErrorReporter", null);
        setField(term2, term2.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "reporter", null);
        setField(term3, term3.getClass(), "nativeTypes", term4);
        setField(term3, term3.getClass(), "namesToTypes", term5);
        setField(term3, term3.getClass(), "namespaces", term11);
        setField(term3, term3.getClass(), "enumTypeNames", term17);
        setField(term3, term3.getClass(), "forwardDeclaredTypes", term23);
        setField(term3, term3.getClass(), "typesIndexedByProperty", term29);
        setField(term3, term3.getClass(), "greatestSubtypeByProperty", term34);
        setField(term3, term3.getClass(), "interfaceToImplementors", null);
        setField(term3, term3.getClass(), "unresolvedNamedTypes", null);
        setField(term3, term3.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3, term3.getClass(), "lastGeneration", false);
        setField(term3, term3.getClass(), "templateTypeName", "LQFpaHEwXR");
        setField(term53, term53.getClass(), "name", null);
        setField(term53, term53.getClass(), "referencedType", null);
        setBooleanField(term53, term53.getClass(), "visited", false);
        setField(term53, term53.getClass(), "docInfo", null);
        setBooleanField(term53, term53.getClass(), "unknown", false);
        setBooleanField(term53, term53.getClass(), "resolved", false);
        setField(term53, term53.getClass(), "resolveResult", null);
        setField(term53, term53.getClass(), "registry", null);
        setField(term3, term3.getClass(), "templateType", term53);
        setBooleanField(term3, term3.getClass(), "tolerateUndefinedValues", false);
        setField(term3, term3.getClass(), "resolveMode", enum7);
        setField(term2, term2.getClass(), "typeRegistry", term3);
        setField(term2, term2.getClass(), "allValueTypes", null);
        setBooleanField(term2, term2.getClass(), "shouldReport", false);
        setField(term2, term2.getClass(), "mismatches", term62);
        setField(term1, term1.getClass(), "validator", term2);
        setField(term1, term1.getClass(), "codingConvention", null);
        setField(term67, term67.getClass(), "reporter", null);
        setField(term67, term67.getClass(), "nativeTypes", null);
        setField(term67, term67.getClass(), "namesToTypes", null);
        setField(term67, term67.getClass(), "namespaces", null);
        setField(term67, term67.getClass(), "enumTypeNames", null);
        setField(term67, term67.getClass(), "forwardDeclaredTypes", null);
        setField(term67, term67.getClass(), "typesIndexedByProperty", null);
        setField(term67, term67.getClass(), "greatestSubtypeByProperty", null);
        setField(term67, term67.getClass(), "interfaceToImplementors", null);
        setField(term67, term67.getClass(), "unresolvedNamedTypes", null);
        setField(term67, term67.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term67, term67.getClass(), "lastGeneration", false);
        setField(term67, term67.getClass(), "templateTypeName", null);
        setField(term67, term67.getClass(), "templateType", null);
        setBooleanField(term67, term67.getClass(), "tolerateUndefinedValues", false);
        setField(term67, term67.getClass(), "resolveMode", null);
        setField(term1, term1.getClass(), "typeRegistry", term67);
        setField(term1, term1.getClass(), "delegateProxyPrototypes", term70);
        term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term74, term74.getClass(), "type", 391863371);
        setIntField(term76, term76.getClass(), "type", -2038273078);
        setIntField(term78, term78.getClass(), "type", 0);
        setField(term78, term78.getClass(), "next", null);
        setField(term78, term78.getClass(), "first", null);
        setField(term78, term78.getClass(), "last", null);
        setField(term78, term78.getClass(), "propListHead", null);
        setIntField(term78, term78.getClass(), "sourcePosition", 0);
        setField(term78, term78.getClass(), "jsType", null);
        setField(term78, term78.getClass(), "parent", null);
        setField(term76, term76.getClass(), "next", term78);
        setIntField(term81, term81.getClass(), "type", 0);
        setField(term81, term81.getClass(), "next", null);
        setField(term81, term81.getClass(), "first", null);
        setField(term81, term81.getClass(), "last", null);
        setField(term81, term81.getClass(), "propListHead", null);
        setIntField(term81, term81.getClass(), "sourcePosition", 0);
        setField(term81, term81.getClass(), "jsType", null);
        setField(term81, term81.getClass(), "parent", null);
        setField(term76, term76.getClass(), "first", term81);
        setIntField(term84, term84.getClass(), "type", 0);
        setField(term84, term84.getClass(), "next", null);
        setField(term84, term84.getClass(), "first", null);
        setField(term84, term84.getClass(), "last", null);
        setField(term84, term84.getClass(), "propListHead", null);
        setIntField(term84, term84.getClass(), "sourcePosition", 0);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term76, term76.getClass(), "last", term84);
        setField(term87, term87.getClass(), "next", null);
        setIntField(term87, term87.getClass(), "type", 0);
        setIntField(term87, term87.getClass(), "intValue", 0);
        setField(term87, term87.getClass(), "objectValue", null);
        setField(term76, term76.getClass(), "propListHead", term87);
        setIntField(term76, term76.getClass(), "sourcePosition", 1725571209);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term74, term74.getClass(), "next", term76);
        setIntField(term91, term91.getClass(), "type", 0);
        setField(term91, term91.getClass(), "next", null);
        setField(term91, term91.getClass(), "first", null);
        setField(term91, term91.getClass(), "last", null);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term74, term74.getClass(), "first", term91);
        setIntField(term94, term94.getClass(), "type", 0);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", null);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term74, term74.getClass(), "last", term94);
        setField(term97, term97.getClass(), "next", null);
        setIntField(term97, term97.getClass(), "type", 0);
        setIntField(term97, term97.getClass(), "intValue", 0);
        setField(term97, term97.getClass(), "objectValue", null);
        setField(term74, term74.getClass(), "propListHead", term97);
        setIntField(term74, term74.getClass(), "sourcePosition", -522618178);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        HashMap term102 = new HashMap();
        term101 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term115 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101, term101.getClass(), "vars", term102);
        setField(term115, term115.getClass(), "vars", null);
        setField(term115, term115.getClass(), "parent", null);
        setField(term115, term115.getClass(), "rootNode", null);
        setField(term115, term115.getClass(), "thisType", null);
        setBooleanField(term115, term115.getClass(), "isBottom", false);
        setField(term101, term101.getClass(), "parent", term115);
        setIntField(term117, term117.getClass(), "type", 0);
        setField(term117, term117.getClass(), "next", null);
        setField(term117, term117.getClass(), "first", null);
        setField(term117, term117.getClass(), "last", null);
        setField(term117, term117.getClass(), "propListHead", null);
        setIntField(term117, term117.getClass(), "sourcePosition", 0);
        setField(term117, term117.getClass(), "jsType", null);
        setField(term117, term117.getClass(), "parent", null);
        setField(term101, term101.getClass(), "rootNode", term117);
        setField(term101, term101.getClass(), "thisType", null);
        setBooleanField(term101, term101.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74;
        args[1] = term101;
        try {
            callMethod(klass, "createScope", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


