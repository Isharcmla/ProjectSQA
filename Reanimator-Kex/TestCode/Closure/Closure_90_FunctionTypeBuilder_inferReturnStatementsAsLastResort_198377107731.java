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

public class FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2784;
     Object term2904;

    public FunctionTypeBuilder_inferReturnStatementsAsLastResort_198377107731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2799 = new HashMap();
        HashMap term2808 = new HashMap();
        Set<Object> term25757 =  ((Map) term2808).keySet();
        HashSet term2807 = new HashSet((Collection<? extends Object>) term25757);
        HashMap term2815 = new HashMap();
        Set<Object> term25758 =  ((Map) term2815).keySet();
        HashSet term2814 = new HashSet((Collection<? extends Object>) term25758);
        HashMap term2822 = new HashMap();
        Set<Object> term25759 =  ((Map) term2822).keySet();
        HashSet term2821 = new HashSet((Collection<? extends Object>) term25759);
        HashMap term2828 = new HashMap();
        HashMap term2833 = new HashMap();
        Class<? extends Object> term25781 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term25780 = ((Class) term25781).getDeclaredField((String) "IMMEDIATE");
        ((Field) term25780).setAccessible(true);
        Object enum49 = ((Field) term25780).get((Object) null);
        term2784 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term2797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2798 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term2854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2899 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2784, term2784.getClass(), "fnName", "XPKmummaqg");
        setField(term2784, term2784.getClass(), "compiler", null);
        setField(term2784, term2784.getClass(), "codingConvention", null);
        setField(term2797, term2797.getClass(), "reporter", null);
        setField(term2797, term2797.getClass(), "nativeTypes", term2798);
        setField(term2797, term2797.getClass(), "namesToTypes", term2799);
        setField(term2797, term2797.getClass(), "namespaces", term2807);
        setField(term2797, term2797.getClass(), "nonNullableTypeNames", term2814);
        setField(term2797, term2797.getClass(), "forwardDeclaredTypes", term2821);
        setField(term2797, term2797.getClass(), "typesIndexedByProperty", term2828);
        setField(term2797, term2797.getClass(), "greatestSubtypeByProperty", term2833);
        setField(term2797, term2797.getClass(), "interfaceToImplementors", null);
        setField(term2797, term2797.getClass(), "unresolvedNamedTypes", null);
        setField(term2797, term2797.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2797, term2797.getClass(), "lastGeneration", true);
        setField(term2797, term2797.getClass(), "templateTypeName", "RYdKCNNMBR");
        setField(term2854, term2854.getClass(), "name", "yGtHPyvYiQ");
        setField(term2854, term2854.getClass(), "referencedType", null);
        setField(term2854, term2854.getClass(), "referencedObjType", null);
        setBooleanField(term2854, term2854.getClass(), "visited", false);
        setField(term2854, term2854.getClass(), "docInfo", null);
        setBooleanField(term2854, term2854.getClass(), "unknown", false);
        setBooleanField(term2854, term2854.getClass(), "resolved", false);
        setField(term2854, term2854.getClass(), "resolveResult", null);
        setField(term2854, term2854.getClass(), "registry", null);
        setField(term2797, term2797.getClass(), "templateType", term2854);
        setBooleanField(term2797, term2797.getClass(), "tolerateUndefinedValues", false);
        setField(term2797, term2797.getClass(), "resolveMode", enum49);
        setField(term2784, term2784.getClass(), "typeRegistry", term2797);
        setIntField(term2884, term2884.getClass(), "type", 0);
        setField(term2884, term2884.getClass(), "next", null);
        setField(term2884, term2884.getClass(), "first", null);
        setField(term2884, term2884.getClass(), "last", null);
        setField(term2884, term2884.getClass(), "propListHead", null);
        setIntField(term2884, term2884.getClass(), "sourcePosition", 0);
        setField(term2884, term2884.getClass(), "jsType", null);
        setField(term2884, term2884.getClass(), "parent", null);
        setField(term2784, term2784.getClass(), "errorRoot", term2884);
        setField(term2784, term2784.getClass(), "sourceName", "MvRIxilFMJ");
        setField(term2899, term2899.getClass(), "vars", null);
        setField(term2899, term2899.getClass(), "parent", null);
        setField(term2899, term2899.getClass(), "rootNode", null);
        setField(term2899, term2899.getClass(), "thisType", null);
        setBooleanField(term2899, term2899.getClass(), "isBottom", false);
        setField(term2784, term2784.getClass(), "scope", term2899);
        setField(term2784, term2784.getClass(), "returnType", null);
        setBooleanField(term2784, term2784.getClass(), "returnTypeInferred", false);
        setField(term2784, term2784.getClass(), "implementedInterfaces", null);
        setField(term2784, term2784.getClass(), "baseType", null);
        setField(term2784, term2784.getClass(), "thisType", null);
        setBooleanField(term2784, term2784.getClass(), "isConstructor", false);
        setBooleanField(term2784, term2784.getClass(), "isInterface", false);
        setField(term2784, term2784.getClass(), "parametersNode", null);
        setField(term2784, term2784.getClass(), "sourceNode", null);
        setField(term2784, term2784.getClass(), "templateTypeName", null);
        term2904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2917 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2927 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2904, term2904.getClass(), "type", 1540719661);
        setIntField(term2906, term2906.getClass(), "type", -2027534003);
        setIntField(term2908, term2908.getClass(), "type", 0);
        setField(term2908, term2908.getClass(), "next", null);
        setField(term2908, term2908.getClass(), "first", null);
        setField(term2908, term2908.getClass(), "last", null);
        setField(term2908, term2908.getClass(), "propListHead", null);
        setIntField(term2908, term2908.getClass(), "sourcePosition", 0);
        setField(term2908, term2908.getClass(), "jsType", null);
        setField(term2908, term2908.getClass(), "parent", null);
        setField(term2906, term2906.getClass(), "next", term2908);
        setIntField(term2911, term2911.getClass(), "type", 0);
        setField(term2911, term2911.getClass(), "next", null);
        setField(term2911, term2911.getClass(), "first", null);
        setField(term2911, term2911.getClass(), "last", null);
        setField(term2911, term2911.getClass(), "propListHead", null);
        setIntField(term2911, term2911.getClass(), "sourcePosition", 0);
        setField(term2911, term2911.getClass(), "jsType", null);
        setField(term2911, term2911.getClass(), "parent", null);
        setField(term2906, term2906.getClass(), "first", term2911);
        setIntField(term2914, term2914.getClass(), "type", 0);
        setField(term2914, term2914.getClass(), "next", null);
        setField(term2914, term2914.getClass(), "first", null);
        setField(term2914, term2914.getClass(), "last", null);
        setField(term2914, term2914.getClass(), "propListHead", null);
        setIntField(term2914, term2914.getClass(), "sourcePosition", 0);
        setField(term2914, term2914.getClass(), "jsType", null);
        setField(term2914, term2914.getClass(), "parent", null);
        setField(term2906, term2906.getClass(), "last", term2914);
        setField(term2917, term2917.getClass(), "next", null);
        setIntField(term2917, term2917.getClass(), "type", 0);
        setIntField(term2917, term2917.getClass(), "intValue", 0);
        setField(term2917, term2917.getClass(), "objectValue", null);
        setField(term2906, term2906.getClass(), "propListHead", term2917);
        setIntField(term2906, term2906.getClass(), "sourcePosition", -478195677);
        setField(term2906, term2906.getClass(), "jsType", null);
        setField(term2906, term2906.getClass(), "parent", null);
        setField(term2904, term2904.getClass(), "next", term2906);
        setIntField(term2921, term2921.getClass(), "type", 0);
        setField(term2921, term2921.getClass(), "next", null);
        setField(term2921, term2921.getClass(), "first", null);
        setField(term2921, term2921.getClass(), "last", null);
        setField(term2921, term2921.getClass(), "propListHead", null);
        setIntField(term2921, term2921.getClass(), "sourcePosition", 0);
        setField(term2921, term2921.getClass(), "jsType", null);
        setField(term2921, term2921.getClass(), "parent", null);
        setField(term2904, term2904.getClass(), "first", term2921);
        setIntField(term2924, term2924.getClass(), "type", 0);
        setField(term2924, term2924.getClass(), "next", null);
        setField(term2924, term2924.getClass(), "first", null);
        setField(term2924, term2924.getClass(), "last", null);
        setField(term2924, term2924.getClass(), "propListHead", null);
        setIntField(term2924, term2924.getClass(), "sourcePosition", 0);
        setField(term2924, term2924.getClass(), "jsType", null);
        setField(term2924, term2924.getClass(), "parent", null);
        setField(term2904, term2904.getClass(), "last", term2924);
        setField(term2927, term2927.getClass(), "next", null);
        setIntField(term2927, term2927.getClass(), "type", 0);
        setIntField(term2927, term2927.getClass(), "intValue", 0);
        setField(term2927, term2927.getClass(), "objectValue", null);
        setField(term2904, term2904.getClass(), "propListHead", term2927);
        setIntField(term2904, term2904.getClass(), "sourcePosition", 972867650);
        setField(term2904, term2904.getClass(), "jsType", null);
        setField(term2904, term2904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2904;
        try {
            callMethod(klass, "inferReturnStatementsAsLastResort", argTypes, term2784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


