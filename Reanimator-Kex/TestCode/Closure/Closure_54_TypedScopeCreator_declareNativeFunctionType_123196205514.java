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

public class TypedScopeCreator_declareNativeFunctionType_123196205514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;
     Object term313;
     Object enum3;

    public TypedScopeCreator_declareNativeFunctionType_123196205514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term268 = new HashMap();
        HashMap term275 = new HashMap();
        Set<Object> term5799 =  ((Map) term275).keySet();
        HashSet term274 = new HashSet((Collection<? extends Object>) term5799);
        HashMap term281 = new HashMap();
        Set<Object> term5800 =  ((Map) term281).keySet();
        HashSet term280 = new HashSet((Collection<? extends Object>) term5800);
        HashMap term287 = new HashMap();
        Set<Object> term5801 =  ((Map) term287).keySet();
        HashSet term286 = new HashSet((Collection<? extends Object>) term5801);
        HashMap term292 = new HashMap();
        HashMap term298 = new HashMap();
        HashMap term303 = new HashMap();
        term264 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term265 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term267 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term264, term264.getClass(), "compiler", null);
        setField(term264, term264.getClass(), "typeParsingErrorReporter", null);
        setField(term265, term265.getClass(), "compiler", null);
        setField(term266, term266.getClass(), "reporter", null);
        setField(term266, term266.getClass(), "nativeTypes", term267);
        setField(term266, term266.getClass(), "namesToTypes", term268);
        setField(term266, term266.getClass(), "namespaces", term274);
        setField(term266, term266.getClass(), "nonNullableTypeNames", term280);
        setField(term266, term266.getClass(), "forwardDeclaredTypes", term286);
        setField(term266, term266.getClass(), "typesIndexedByProperty", term292);
        setField(term266, term266.getClass(), "eachRefTypeIndexedByProperty", term298);
        setField(term266, term266.getClass(), "greatestSubtypeByProperty", term303);
        setField(term266, term266.getClass(), "interfaceToImplementors", null);
        setField(term266, term266.getClass(), "unresolvedNamedTypes", null);
        setField(term266, term266.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term266, term266.getClass(), "lastGeneration", false);
        setField(term266, term266.getClass(), "templateTypeName", null);
        setField(term266, term266.getClass(), "templateType", null);
        setBooleanField(term266, term266.getClass(), "tolerateUndefinedValues", false);
        setField(term266, term266.getClass(), "resolveMode", null);
        setField(term265, term265.getClass(), "typeRegistry", term266);
        setField(term265, term265.getClass(), "allValueTypes", null);
        setBooleanField(term265, term265.getClass(), "shouldReport", false);
        setBooleanField(term265, term265.getClass(), "recordErrors", false);
        setField(term265, term265.getClass(), "nullOrUndefined", null);
        setField(term265, term265.getClass(), "mismatches", null);
        setField(term264, term264.getClass(), "validator", term265);
        setField(term264, term264.getClass(), "codingConvention", null);
        setField(term264, term264.getClass(), "typeRegistry", null);
        setField(term264, term264.getClass(), "delegateProxyPrototypes", null);
        setField(term264, term264.getClass(), "delegateCallingConventions", null);
        HashMap term314 = new HashMap();
        term313 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term327 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term313, term313.getClass(), "vars", term314);
        setField(term327, term327.getClass(), "vars", null);
        setField(term327, term327.getClass(), "parent", null);
        setIntField(term327, term327.getClass(), "depth", 0);
        setField(term327, term327.getClass(), "rootNode", null);
        setField(term327, term327.getClass(), "thisType", null);
        setBooleanField(term327, term327.getClass(), "isBottom", false);
        setField(term327, term327.getClass(), "arguments", null);
        setField(term313, term313.getClass(), "parent", term327);
        setIntField(term313, term313.getClass(), "depth", 1596070772);
        setIntField(term331, term331.getClass(), "type", 0);
        setField(term331, term331.getClass(), "next", null);
        setField(term331, term331.getClass(), "first", null);
        setField(term331, term331.getClass(), "last", null);
        setField(term331, term331.getClass(), "propListHead", null);
        setIntField(term331, term331.getClass(), "sourcePosition", 0);
        setField(term331, term331.getClass(), "jsType", null);
        setField(term331, term331.getClass(), "parent", null);
        setField(term313, term313.getClass(), "rootNode", term331);
        setField(term313, term313.getClass(), "thisType", null);
        setBooleanField(term313, term313.getClass(), "isBottom", false);
        setField(term313, term313.getClass(), "arguments", null);
        Class<? extends Object> term5803 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term5802 = ((Class) term5803).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term5802).setAccessible(true);
        enum3 = ((Field) term5802).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term313;
        args[1] = enum3;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


