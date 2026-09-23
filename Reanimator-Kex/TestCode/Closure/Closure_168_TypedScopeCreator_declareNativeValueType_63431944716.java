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

public class TypedScopeCreator_declareNativeValueType_63431944716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1965;
     Object term2013;
     Object enum4;

    public TypedScopeCreator_declareNativeValueType_63431944716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1969 = new HashMap();
        HashMap term1976 = new HashMap();
        Set<Object> term7305 =  ((Map) term1976).keySet();
        HashSet term1975 = new HashSet((Collection<? extends Object>) term7305);
        HashMap term1982 = new HashMap();
        Set<Object> term7306 =  ((Map) term1982).keySet();
        HashSet term1981 = new HashSet((Collection<? extends Object>) term7306);
        HashMap term1988 = new HashMap();
        Set<Object> term7307 =  ((Map) term1988).keySet();
        HashSet term1987 = new HashSet((Collection<? extends Object>) term7307);
        HashMap term1993 = new HashMap();
        HashMap term1999 = new HashMap();
        HashMap term2004 = new HashMap();
        term1965 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1966 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1968 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1965, term1965.getClass(), "compiler", null);
        setField(term1965, term1965.getClass(), "typeParsingErrorReporter", null);
        setField(term1966, term1966.getClass(), "compiler", null);
        setField(term1967, term1967.getClass(), "reporter", null);
        setField(term1967, term1967.getClass(), "nativeTypes", term1968);
        setField(term1967, term1967.getClass(), "namesToTypes", term1969);
        setField(term1967, term1967.getClass(), "namespaces", term1975);
        setField(term1967, term1967.getClass(), "nonNullableTypeNames", term1981);
        setField(term1967, term1967.getClass(), "forwardDeclaredTypes", term1987);
        setField(term1967, term1967.getClass(), "typesIndexedByProperty", term1993);
        setField(term1967, term1967.getClass(), "eachRefTypeIndexedByProperty", term1999);
        setField(term1967, term1967.getClass(), "greatestSubtypeByProperty", term2004);
        setField(term1967, term1967.getClass(), "interfaceToImplementors", null);
        setField(term1967, term1967.getClass(), "unresolvedNamedTypes", null);
        setField(term1967, term1967.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1967, term1967.getClass(), "lastGeneration", false);
        setField(term1967, term1967.getClass(), "templateTypes", null);
        setBooleanField(term1967, term1967.getClass(), "tolerateUndefinedValues", false);
        setField(term1967, term1967.getClass(), "resolveMode", null);
        setField(term1966, term1966.getClass(), "typeRegistry", term1967);
        setField(term1966, term1966.getClass(), "allValueTypes", null);
        setBooleanField(term1966, term1966.getClass(), "shouldReport", false);
        setField(term1966, term1966.getClass(), "nullOrUndefined", null);
        setField(term1966, term1966.getClass(), "mismatches", null);
        setField(term1965, term1965.getClass(), "validator", term1966);
        setField(term1965, term1965.getClass(), "codingConvention", null);
        setField(term1965, term1965.getClass(), "typeRegistry", null);
        setField(term1965, term1965.getClass(), "delegateProxyPrototypes", null);
        setField(term1965, term1965.getClass(), "delegateCallingConventions", null);
        setField(term1965, term1965.getClass(), "functionAnalysisResults", null);
        HashMap term2014 = new HashMap();
        term2013 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2029 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2013, term2013.getClass(), "vars", term2014);
        setField(term2029, term2029.getClass(), "vars", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setIntField(term2029, term2029.getClass(), "depth", 0);
        setField(term2029, term2029.getClass(), "rootNode", null);
        setField(term2029, term2029.getClass(), "thisType", null);
        setBooleanField(term2029, term2029.getClass(), "isBottom", false);
        setField(term2029, term2029.getClass(), "arguments", null);
        setField(term2013, term2013.getClass(), "parent", term2029);
        setIntField(term2013, term2013.getClass(), "depth", 1551099402);
        setIntField(term2033, term2033.getClass(), "type", 962840079);
        setIntField(term2035, term2035.getClass(), "type", 1540719661);
        setIntField(term2037, term2037.getClass(), "type", 1265463001);
        setIntField(term2039, term2039.getClass(), "type", 335112684);
        setField(term2039, term2039.getClass(), "next", null);
        setField(term2039, term2039.getClass(), "first", null);
        setField(term2039, term2039.getClass(), "last", term2039);
        setField(term2039, term2039.getClass(), "propListHead", null);
        setIntField(term2039, term2039.getClass(), "sourcePosition", 0);
        setField(term2039, term2039.getClass(), "jsType", null);
        setField(term2039, term2039.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "next", term2039);
        setIntField(term2042, term2042.getClass(), "type", 0);
        setField(term2042, term2042.getClass(), "next", null);
        setField(term2042, term2042.getClass(), "first", null);
        setField(term2042, term2042.getClass(), "last", null);
        setField(term2042, term2042.getClass(), "propListHead", null);
        setIntField(term2042, term2042.getClass(), "sourcePosition", 0);
        setField(term2042, term2042.getClass(), "jsType", null);
        setField(term2042, term2042.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "first", term2042);
        setIntField(term2045, term2045.getClass(), "type", -93135961);
        setField(term2045, term2045.getClass(), "next", null);
        setField(term2045, term2045.getClass(), "first", term2035);
        setField(term2045, term2045.getClass(), "last", null);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "last", term2045);
        setField(term2037, term2037.getClass(), "propListHead", null);
        setIntField(term2037, term2037.getClass(), "sourcePosition", 0);
        setField(term2037, term2037.getClass(), "jsType", null);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2035, term2035.getClass(), "next", term2037);
        setField(term2035, term2035.getClass(), "first", term2035);
        setIntField(term2049, term2049.getClass(), "type", 287287233);
        setField(term2049, term2049.getClass(), "next", term2033);
        setIntField(term2051, term2051.getClass(), "type", 0);
        setField(term2051, term2051.getClass(), "next", null);
        setField(term2051, term2051.getClass(), "first", null);
        setField(term2051, term2051.getClass(), "last", null);
        setField(term2051, term2051.getClass(), "propListHead", null);
        setIntField(term2051, term2051.getClass(), "sourcePosition", 0);
        setField(term2051, term2051.getClass(), "jsType", null);
        setField(term2051, term2051.getClass(), "parent", null);
        setField(term2049, term2049.getClass(), "first", term2051);
        setField(term2049, term2049.getClass(), "last", term2039);
        setField(term2049, term2049.getClass(), "propListHead", null);
        setIntField(term2049, term2049.getClass(), "sourcePosition", 0);
        setField(term2049, term2049.getClass(), "jsType", null);
        setField(term2049, term2049.getClass(), "parent", null);
        setField(term2035, term2035.getClass(), "last", term2049);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "next", term2035);
        setIntField(term2056, term2056.getClass(), "type", -112921587);
        setIntField(term2058, term2058.getClass(), "type", 933028652);
        setField(term2058, term2058.getClass(), "next", term2049);
        setField(term2058, term2058.getClass(), "first", term2039);
        setField(term2058, term2058.getClass(), "last", term2033);
        setField(term2058, term2058.getClass(), "propListHead", null);
        setIntField(term2058, term2058.getClass(), "sourcePosition", 0);
        setField(term2058, term2058.getClass(), "jsType", null);
        setField(term2058, term2058.getClass(), "parent", null);
        setField(term2056, term2056.getClass(), "next", term2058);
        setField(term2056, term2056.getClass(), "first", term2051);
        setField(term2056, term2056.getClass(), "last", term2039);
        setField(term2056, term2056.getClass(), "propListHead", null);
        setIntField(term2056, term2056.getClass(), "sourcePosition", 0);
        setField(term2056, term2056.getClass(), "jsType", null);
        setField(term2056, term2056.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "first", term2056);
        setField(term2033, term2033.getClass(), "last", term2056);
        setField(term2033, term2033.getClass(), "propListHead", null);
        setIntField(term2033, term2033.getClass(), "sourcePosition", 0);
        setField(term2033, term2033.getClass(), "jsType", null);
        setField(term2033, term2033.getClass(), "parent", null);
        setField(term2013, term2013.getClass(), "rootNode", term2033);
        setField(term2013, term2013.getClass(), "thisType", null);
        setBooleanField(term2013, term2013.getClass(), "isBottom", false);
        setField(term2013, term2013.getClass(), "arguments", null);
        Class<? extends Object> term7319 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term7318 = ((Class) term7319).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term7318).setAccessible(true);
        enum4 = ((Field) term7318).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term2013;
        args[1] = "PtirvZmsGt";
        args[2] = enum4;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term1965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


