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

public class TypeCheck_isPropertyTest_65727588264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6120;
     Object term6174;

    public TypeCheck_isPropertyTest_65727588264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6124 = new HashMap();
        HashMap term6131 = new HashMap();
        Set<Object> term19393 =  ((Map) term6131).keySet();
        HashSet term6130 = new HashSet((Collection<? extends Object>) term19393);
        HashMap term6137 = new HashMap();
        Set<Object> term19394 =  ((Map) term6137).keySet();
        HashSet term6136 = new HashSet((Collection<? extends Object>) term19394);
        HashMap term6143 = new HashMap();
        Set<Object> term19395 =  ((Map) term6143).keySet();
        HashSet term6142 = new HashSet((Collection<? extends Object>) term19395);
        HashMap term6148 = new HashMap();
        HashMap term6154 = new HashMap();
        HashMap term6159 = new HashMap();
        term6120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term6121 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6123 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term6120, term6120.getClass(), "compiler", null);
        setField(term6121, term6121.getClass(), "compiler", null);
        setField(term6122, term6122.getClass(), "reporter", null);
        setField(term6122, term6122.getClass(), "nativeTypes", term6123);
        setField(term6122, term6122.getClass(), "namesToTypes", term6124);
        setField(term6122, term6122.getClass(), "namespaces", term6130);
        setField(term6122, term6122.getClass(), "nonNullableTypeNames", term6136);
        setField(term6122, term6122.getClass(), "forwardDeclaredTypes", term6142);
        setField(term6122, term6122.getClass(), "typesIndexedByProperty", term6148);
        setField(term6122, term6122.getClass(), "eachRefTypeIndexedByProperty", term6154);
        setField(term6122, term6122.getClass(), "greatestSubtypeByProperty", term6159);
        setField(term6122, term6122.getClass(), "interfaceToImplementors", null);
        setField(term6122, term6122.getClass(), "unresolvedNamedTypes", null);
        setField(term6122, term6122.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6122, term6122.getClass(), "lastGeneration", false);
        setField(term6122, term6122.getClass(), "templateTypeName", null);
        setField(term6122, term6122.getClass(), "templateType", null);
        setBooleanField(term6122, term6122.getClass(), "tolerateUndefinedValues", false);
        setField(term6122, term6122.getClass(), "resolveMode", null);
        setField(term6121, term6121.getClass(), "typeRegistry", term6122);
        setField(term6121, term6121.getClass(), "allValueTypes", null);
        setBooleanField(term6121, term6121.getClass(), "shouldReport", false);
        setField(term6121, term6121.getClass(), "nullOrUndefined", null);
        setField(term6121, term6121.getClass(), "mismatches", null);
        setField(term6120, term6120.getClass(), "validator", term6121);
        setField(term6120, term6120.getClass(), "reverseInterpreter", null);
        setField(term6120, term6120.getClass(), "typeRegistry", null);
        setField(term6120, term6120.getClass(), "topScope", null);
        setField(term6120, term6120.getClass(), "scopeCreator", null);
        setField(term6120, term6120.getClass(), "reportMissingOverride", null);
        setField(term6120, term6120.getClass(), "reportUnknownTypes", null);
        setBooleanField(term6120, term6120.getClass(), "reportMissingProperties", false);
        setField(term6120, term6120.getClass(), "inferJSDocInfo", null);
        setIntField(term6120, term6120.getClass(), "typedCount", 0);
        setIntField(term6120, term6120.getClass(), "nullCount", 0);
        setIntField(term6120, term6120.getClass(), "unknownCount", 0);
        setBooleanField(term6120, term6120.getClass(), "inExterns", false);
        setIntField(term6120, term6120.getClass(), "noTypeCheckSection", 0);
        term6174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6187 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6197 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6174, term6174.getClass(), "type", -1549607466);
        setIntField(term6176, term6176.getClass(), "type", 1639448749);
        setIntField(term6178, term6178.getClass(), "type", 0);
        setField(term6178, term6178.getClass(), "next", null);
        setField(term6178, term6178.getClass(), "first", null);
        setField(term6178, term6178.getClass(), "last", null);
        setField(term6178, term6178.getClass(), "propListHead", null);
        setIntField(term6178, term6178.getClass(), "sourcePosition", 0);
        setField(term6178, term6178.getClass(), "jsType", null);
        setField(term6178, term6178.getClass(), "parent", null);
        setField(term6176, term6176.getClass(), "next", term6178);
        setIntField(term6181, term6181.getClass(), "type", 0);
        setField(term6181, term6181.getClass(), "next", null);
        setField(term6181, term6181.getClass(), "first", null);
        setField(term6181, term6181.getClass(), "last", null);
        setField(term6181, term6181.getClass(), "propListHead", null);
        setIntField(term6181, term6181.getClass(), "sourcePosition", 0);
        setField(term6181, term6181.getClass(), "jsType", null);
        setField(term6181, term6181.getClass(), "parent", null);
        setField(term6176, term6176.getClass(), "first", term6181);
        setIntField(term6184, term6184.getClass(), "type", 0);
        setField(term6184, term6184.getClass(), "next", null);
        setField(term6184, term6184.getClass(), "first", null);
        setField(term6184, term6184.getClass(), "last", null);
        setField(term6184, term6184.getClass(), "propListHead", null);
        setIntField(term6184, term6184.getClass(), "sourcePosition", 0);
        setField(term6184, term6184.getClass(), "jsType", null);
        setField(term6184, term6184.getClass(), "parent", null);
        setField(term6176, term6176.getClass(), "last", term6184);
        setField(term6187, term6187.getClass(), "next", null);
        setIntField(term6187, term6187.getClass(), "type", 0);
        setIntField(term6187, term6187.getClass(), "intValue", 0);
        setField(term6187, term6187.getClass(), "objectValue", null);
        setField(term6176, term6176.getClass(), "propListHead", term6187);
        setIntField(term6176, term6176.getClass(), "sourcePosition", 433248783);
        setField(term6176, term6176.getClass(), "jsType", null);
        setField(term6176, term6176.getClass(), "parent", null);
        setField(term6174, term6174.getClass(), "next", term6176);
        setIntField(term6191, term6191.getClass(), "type", 0);
        setField(term6191, term6191.getClass(), "next", null);
        setField(term6191, term6191.getClass(), "first", null);
        setField(term6191, term6191.getClass(), "last", null);
        setField(term6191, term6191.getClass(), "propListHead", null);
        setIntField(term6191, term6191.getClass(), "sourcePosition", 0);
        setField(term6191, term6191.getClass(), "jsType", null);
        setField(term6191, term6191.getClass(), "parent", null);
        setField(term6174, term6174.getClass(), "first", term6191);
        setIntField(term6194, term6194.getClass(), "type", 0);
        setField(term6194, term6194.getClass(), "next", null);
        setField(term6194, term6194.getClass(), "first", null);
        setField(term6194, term6194.getClass(), "last", null);
        setField(term6194, term6194.getClass(), "propListHead", null);
        setIntField(term6194, term6194.getClass(), "sourcePosition", 0);
        setField(term6194, term6194.getClass(), "jsType", null);
        setField(term6194, term6194.getClass(), "parent", null);
        setField(term6174, term6174.getClass(), "last", term6194);
        setField(term6197, term6197.getClass(), "next", null);
        setIntField(term6197, term6197.getClass(), "type", 0);
        setIntField(term6197, term6197.getClass(), "intValue", 0);
        setField(term6197, term6197.getClass(), "objectValue", null);
        setField(term6174, term6174.getClass(), "propListHead", term6197);
        setIntField(term6174, term6174.getClass(), "sourcePosition", -507944154);
        setField(term6174, term6174.getClass(), "jsType", null);
        setField(term6174, term6174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6174;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term6120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


