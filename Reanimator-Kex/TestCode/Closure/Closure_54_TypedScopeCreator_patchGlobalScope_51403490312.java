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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypedScopeCreator_patchGlobalScope_51403490312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term145;
     Object term167;

    public TypedScopeCreator_patchGlobalScope_51403490312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term100 = new HashMap();
        HashMap term107 = new HashMap();
        Set<Object> term5160 =  ((Map) term107).keySet();
        HashSet term106 = new HashSet((Collection<? extends Object>) term5160);
        HashMap term113 = new HashMap();
        Set<Object> term5161 =  ((Map) term113).keySet();
        HashSet term112 = new HashSet((Collection<? extends Object>) term5161);
        HashMap term119 = new HashMap();
        Set<Object> term5162 =  ((Map) term119).keySet();
        HashSet term118 = new HashSet((Collection<? extends Object>) term5162);
        HashMap term124 = new HashMap();
        HashMap term130 = new HashMap();
        HashMap term135 = new HashMap();
        term96 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term97 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term99 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term96, term96.getClass(), "compiler", null);
        setField(term96, term96.getClass(), "typeParsingErrorReporter", null);
        setField(term97, term97.getClass(), "compiler", null);
        setField(term98, term98.getClass(), "reporter", null);
        setField(term98, term98.getClass(), "nativeTypes", term99);
        setField(term98, term98.getClass(), "namesToTypes", term100);
        setField(term98, term98.getClass(), "namespaces", term106);
        setField(term98, term98.getClass(), "nonNullableTypeNames", term112);
        setField(term98, term98.getClass(), "forwardDeclaredTypes", term118);
        setField(term98, term98.getClass(), "typesIndexedByProperty", term124);
        setField(term98, term98.getClass(), "eachRefTypeIndexedByProperty", term130);
        setField(term98, term98.getClass(), "greatestSubtypeByProperty", term135);
        setField(term98, term98.getClass(), "interfaceToImplementors", null);
        setField(term98, term98.getClass(), "unresolvedNamedTypes", null);
        setField(term98, term98.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term98, term98.getClass(), "lastGeneration", false);
        setField(term98, term98.getClass(), "templateTypeName", null);
        setField(term98, term98.getClass(), "templateType", null);
        setBooleanField(term98, term98.getClass(), "tolerateUndefinedValues", false);
        setField(term98, term98.getClass(), "resolveMode", null);
        setField(term97, term97.getClass(), "typeRegistry", term98);
        setField(term97, term97.getClass(), "allValueTypes", null);
        setBooleanField(term97, term97.getClass(), "shouldReport", false);
        setBooleanField(term97, term97.getClass(), "recordErrors", false);
        setField(term97, term97.getClass(), "nullOrUndefined", null);
        setField(term97, term97.getClass(), "mismatches", null);
        setField(term96, term96.getClass(), "validator", term97);
        setField(term96, term96.getClass(), "codingConvention", null);
        setField(term96, term96.getClass(), "typeRegistry", null);
        setField(term96, term96.getClass(), "delegateProxyPrototypes", null);
        setField(term96, term96.getClass(), "delegateCallingConventions", null);
        HashMap term146 = new HashMap();
        term145 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term159 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term145, term145.getClass(), "vars", term146);
        setField(term159, term159.getClass(), "vars", null);
        setField(term159, term159.getClass(), "parent", null);
        setIntField(term159, term159.getClass(), "depth", 0);
        setField(term159, term159.getClass(), "rootNode", null);
        setField(term159, term159.getClass(), "thisType", null);
        setBooleanField(term159, term159.getClass(), "isBottom", false);
        setField(term159, term159.getClass(), "arguments", null);
        setField(term145, term145.getClass(), "parent", term159);
        setIntField(term145, term145.getClass(), "depth", -244121226);
        setIntField(term163, term163.getClass(), "type", 0);
        setField(term163, term163.getClass(), "next", null);
        setField(term163, term163.getClass(), "first", null);
        setField(term163, term163.getClass(), "last", null);
        setField(term163, term163.getClass(), "propListHead", null);
        setIntField(term163, term163.getClass(), "sourcePosition", 0);
        setField(term163, term163.getClass(), "jsType", null);
        setField(term163, term163.getClass(), "parent", null);
        setField(term145, term145.getClass(), "rootNode", term163);
        setField(term145, term145.getClass(), "thisType", null);
        setBooleanField(term145, term145.getClass(), "isBottom", false);
        setField(term145, term145.getClass(), "arguments", null);
        term167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term167, term167.getClass(), "type", -226514366);
        setIntField(term169, term169.getClass(), "type", -469968304);
        setIntField(term171, term171.getClass(), "type", 0);
        setField(term171, term171.getClass(), "next", null);
        setField(term171, term171.getClass(), "first", null);
        setField(term171, term171.getClass(), "last", null);
        setField(term171, term171.getClass(), "propListHead", null);
        setIntField(term171, term171.getClass(), "sourcePosition", 0);
        setField(term171, term171.getClass(), "jsType", null);
        setField(term171, term171.getClass(), "parent", null);
        setField(term169, term169.getClass(), "next", term171);
        setIntField(term174, term174.getClass(), "type", 0);
        setField(term174, term174.getClass(), "next", null);
        setField(term174, term174.getClass(), "first", null);
        setField(term174, term174.getClass(), "last", null);
        setField(term174, term174.getClass(), "propListHead", null);
        setIntField(term174, term174.getClass(), "sourcePosition", 0);
        setField(term174, term174.getClass(), "jsType", null);
        setField(term174, term174.getClass(), "parent", null);
        setField(term169, term169.getClass(), "first", term174);
        setIntField(term177, term177.getClass(), "type", 0);
        setField(term177, term177.getClass(), "next", null);
        setField(term177, term177.getClass(), "first", null);
        setField(term177, term177.getClass(), "last", null);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
        setField(term169, term169.getClass(), "last", term177);
        setField(term169, term169.getClass(), "propListHead", null);
        setIntField(term169, term169.getClass(), "sourcePosition", 0);
        setField(term169, term169.getClass(), "jsType", null);
        setField(term169, term169.getClass(), "parent", null);
        setField(term167, term167.getClass(), "next", term169);
        setIntField(term181, term181.getClass(), "type", 0);
        setField(term181, term181.getClass(), "next", null);
        setField(term181, term181.getClass(), "first", null);
        setField(term181, term181.getClass(), "last", null);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        setField(term167, term167.getClass(), "first", term181);
        setIntField(term184, term184.getClass(), "type", 0);
        setField(term184, term184.getClass(), "next", null);
        setField(term184, term184.getClass(), "first", null);
        setField(term184, term184.getClass(), "last", null);
        setField(term184, term184.getClass(), "propListHead", null);
        setIntField(term184, term184.getClass(), "sourcePosition", 0);
        setField(term184, term184.getClass(), "jsType", null);
        setField(term184, term184.getClass(), "parent", null);
        setField(term167, term167.getClass(), "last", term184);
        setField(term167, term167.getClass(), "propListHead", null);
        setIntField(term167, term167.getClass(), "sourcePosition", 0);
        setField(term167, term167.getClass(), "jsType", null);
        setField(term167, term167.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term145;
        args[1] = term167;
        try {
            callMethod(klass, "patchGlobalScope", argTypes, term96, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


