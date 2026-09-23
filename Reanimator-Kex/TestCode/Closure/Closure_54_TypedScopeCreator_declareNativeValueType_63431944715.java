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

public class TypedScopeCreator_declareNativeValueType_63431944715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1855;
     Object term1904;
     Object enum4;

    public TypedScopeCreator_declareNativeValueType_63431944715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1859 = new HashMap();
        HashMap term1866 = new HashMap();
        Set<Object> term6337 =  ((Map) term1866).keySet();
        HashSet term1865 = new HashSet((Collection<? extends Object>) term6337);
        HashMap term1872 = new HashMap();
        Set<Object> term6338 =  ((Map) term1872).keySet();
        HashSet term1871 = new HashSet((Collection<? extends Object>) term6338);
        HashMap term1878 = new HashMap();
        Set<Object> term6339 =  ((Map) term1878).keySet();
        HashSet term1877 = new HashSet((Collection<? extends Object>) term6339);
        HashMap term1883 = new HashMap();
        HashMap term1889 = new HashMap();
        HashMap term1894 = new HashMap();
        term1855 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1856 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1857 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1858 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1855, term1855.getClass(), "compiler", null);
        setField(term1855, term1855.getClass(), "typeParsingErrorReporter", null);
        setField(term1856, term1856.getClass(), "compiler", null);
        setField(term1857, term1857.getClass(), "reporter", null);
        setField(term1857, term1857.getClass(), "nativeTypes", term1858);
        setField(term1857, term1857.getClass(), "namesToTypes", term1859);
        setField(term1857, term1857.getClass(), "namespaces", term1865);
        setField(term1857, term1857.getClass(), "nonNullableTypeNames", term1871);
        setField(term1857, term1857.getClass(), "forwardDeclaredTypes", term1877);
        setField(term1857, term1857.getClass(), "typesIndexedByProperty", term1883);
        setField(term1857, term1857.getClass(), "eachRefTypeIndexedByProperty", term1889);
        setField(term1857, term1857.getClass(), "greatestSubtypeByProperty", term1894);
        setField(term1857, term1857.getClass(), "interfaceToImplementors", null);
        setField(term1857, term1857.getClass(), "unresolvedNamedTypes", null);
        setField(term1857, term1857.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1857, term1857.getClass(), "lastGeneration", false);
        setField(term1857, term1857.getClass(), "templateTypeName", null);
        setField(term1857, term1857.getClass(), "templateType", null);
        setBooleanField(term1857, term1857.getClass(), "tolerateUndefinedValues", false);
        setField(term1857, term1857.getClass(), "resolveMode", null);
        setField(term1856, term1856.getClass(), "typeRegistry", term1857);
        setField(term1856, term1856.getClass(), "allValueTypes", null);
        setBooleanField(term1856, term1856.getClass(), "shouldReport", false);
        setBooleanField(term1856, term1856.getClass(), "recordErrors", false);
        setField(term1856, term1856.getClass(), "nullOrUndefined", null);
        setField(term1856, term1856.getClass(), "mismatches", null);
        setField(term1855, term1855.getClass(), "validator", term1856);
        setField(term1855, term1855.getClass(), "codingConvention", null);
        setField(term1855, term1855.getClass(), "typeRegistry", null);
        setField(term1855, term1855.getClass(), "delegateProxyPrototypes", null);
        setField(term1855, term1855.getClass(), "delegateCallingConventions", null);
        HashMap term1905 = new HashMap();
        term1904 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1918 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1904, term1904.getClass(), "vars", term1905);
        setField(term1918, term1918.getClass(), "vars", null);
        setField(term1918, term1918.getClass(), "parent", null);
        setIntField(term1918, term1918.getClass(), "depth", 0);
        setField(term1918, term1918.getClass(), "rootNode", null);
        setField(term1918, term1918.getClass(), "thisType", null);
        setBooleanField(term1918, term1918.getClass(), "isBottom", false);
        setField(term1918, term1918.getClass(), "arguments", null);
        setField(term1904, term1904.getClass(), "parent", term1918);
        setIntField(term1904, term1904.getClass(), "depth", 287287233);
        setIntField(term1922, term1922.getClass(), "type", 0);
        setField(term1922, term1922.getClass(), "next", null);
        setField(term1922, term1922.getClass(), "first", null);
        setField(term1922, term1922.getClass(), "last", null);
        setField(term1922, term1922.getClass(), "propListHead", null);
        setIntField(term1922, term1922.getClass(), "sourcePosition", 0);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        setField(term1904, term1904.getClass(), "rootNode", term1922);
        setField(term1904, term1904.getClass(), "thisType", null);
        setBooleanField(term1904, term1904.getClass(), "isBottom", false);
        setField(term1904, term1904.getClass(), "arguments", null);
        Class<? extends Object> term6351 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6350 = ((Class) term6351).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term6350).setAccessible(true);
        enum4 = ((Field) term6350).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term1904;
        args[1] = "PtirvZmsGt";
        args[2] = enum4;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term1855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


