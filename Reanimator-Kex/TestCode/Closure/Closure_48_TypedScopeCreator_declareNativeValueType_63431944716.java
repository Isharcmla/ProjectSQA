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
     Object term1953;
     Object term2001;
     Object enum4;

    public TypedScopeCreator_declareNativeValueType_63431944716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1957 = new HashMap();
        HashMap term1964 = new HashMap();
        Set<Object> term7319 =  ((Map) term1964).keySet();
        HashSet term1963 = new HashSet((Collection<? extends Object>) term7319);
        HashMap term1970 = new HashMap();
        Set<Object> term7320 =  ((Map) term1970).keySet();
        HashSet term1969 = new HashSet((Collection<? extends Object>) term7320);
        HashMap term1976 = new HashMap();
        Set<Object> term7321 =  ((Map) term1976).keySet();
        HashSet term1975 = new HashSet((Collection<? extends Object>) term7321);
        HashMap term1981 = new HashMap();
        HashMap term1987 = new HashMap();
        HashMap term1992 = new HashMap();
        term1953 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1954 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1956 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1953, term1953.getClass(), "compiler", null);
        setField(term1953, term1953.getClass(), "typeParsingErrorReporter", null);
        setField(term1954, term1954.getClass(), "compiler", null);
        setField(term1955, term1955.getClass(), "reporter", null);
        setField(term1955, term1955.getClass(), "nativeTypes", term1956);
        setField(term1955, term1955.getClass(), "namesToTypes", term1957);
        setField(term1955, term1955.getClass(), "namespaces", term1963);
        setField(term1955, term1955.getClass(), "nonNullableTypeNames", term1969);
        setField(term1955, term1955.getClass(), "forwardDeclaredTypes", term1975);
        setField(term1955, term1955.getClass(), "typesIndexedByProperty", term1981);
        setField(term1955, term1955.getClass(), "eachRefTypeIndexedByProperty", term1987);
        setField(term1955, term1955.getClass(), "greatestSubtypeByProperty", term1992);
        setField(term1955, term1955.getClass(), "interfaceToImplementors", null);
        setField(term1955, term1955.getClass(), "unresolvedNamedTypes", null);
        setField(term1955, term1955.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1955, term1955.getClass(), "lastGeneration", false);
        setField(term1955, term1955.getClass(), "templateTypeName", null);
        setField(term1955, term1955.getClass(), "templateType", null);
        setBooleanField(term1955, term1955.getClass(), "tolerateUndefinedValues", false);
        setField(term1955, term1955.getClass(), "resolveMode", null);
        setField(term1954, term1954.getClass(), "typeRegistry", term1955);
        setField(term1954, term1954.getClass(), "allValueTypes", null);
        setBooleanField(term1954, term1954.getClass(), "shouldReport", false);
        setField(term1954, term1954.getClass(), "nullOrUndefined", null);
        setField(term1954, term1954.getClass(), "mismatches", null);
        setField(term1953, term1953.getClass(), "validator", term1954);
        setField(term1953, term1953.getClass(), "codingConvention", null);
        setField(term1953, term1953.getClass(), "typeRegistry", null);
        setField(term1953, term1953.getClass(), "delegateProxyPrototypes", null);
        setField(term1953, term1953.getClass(), "delegateCallingConventions", null);
        setField(term1953, term1953.getClass(), "functionAnalysisResults", null);
        HashMap term2002 = new HashMap();
        term2001 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2016 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2001, term2001.getClass(), "vars", term2002);
        setField(term2016, term2016.getClass(), "vars", null);
        setField(term2016, term2016.getClass(), "parent", null);
        setIntField(term2016, term2016.getClass(), "depth", 0);
        setField(term2016, term2016.getClass(), "rootNode", null);
        setField(term2016, term2016.getClass(), "thisType", null);
        setBooleanField(term2016, term2016.getClass(), "isBottom", false);
        setField(term2016, term2016.getClass(), "arguments", null);
        setField(term2001, term2001.getClass(), "parent", term2016);
        setIntField(term2001, term2001.getClass(), "depth", 1551099402);
        setIntField(term2020, term2020.getClass(), "type", 962840079);
        setIntField(term2022, term2022.getClass(), "type", 1540719661);
        setIntField(term2024, term2024.getClass(), "type", 1265463001);
        setIntField(term2026, term2026.getClass(), "type", 335112684);
        setField(term2026, term2026.getClass(), "next", null);
        setField(term2026, term2026.getClass(), "first", null);
        setField(term2026, term2026.getClass(), "last", term2026);
        setField(term2026, term2026.getClass(), "propListHead", null);
        setIntField(term2026, term2026.getClass(), "sourcePosition", 0);
        setField(term2026, term2026.getClass(), "jsType", null);
        setField(term2026, term2026.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "next", term2026);
        setIntField(term2029, term2029.getClass(), "type", 0);
        setField(term2029, term2029.getClass(), "next", null);
        setField(term2029, term2029.getClass(), "first", null);
        setField(term2029, term2029.getClass(), "last", null);
        setField(term2029, term2029.getClass(), "propListHead", null);
        setIntField(term2029, term2029.getClass(), "sourcePosition", 0);
        setField(term2029, term2029.getClass(), "jsType", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "first", term2029);
        setIntField(term2032, term2032.getClass(), "type", -93135961);
        setField(term2032, term2032.getClass(), "next", null);
        setField(term2032, term2032.getClass(), "first", term2022);
        setField(term2032, term2032.getClass(), "last", null);
        setField(term2032, term2032.getClass(), "propListHead", null);
        setIntField(term2032, term2032.getClass(), "sourcePosition", 0);
        setField(term2032, term2032.getClass(), "jsType", null);
        setField(term2032, term2032.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "last", term2032);
        setField(term2024, term2024.getClass(), "propListHead", null);
        setIntField(term2024, term2024.getClass(), "sourcePosition", 0);
        setField(term2024, term2024.getClass(), "jsType", null);
        setField(term2024, term2024.getClass(), "parent", null);
        setField(term2022, term2022.getClass(), "next", term2024);
        setField(term2022, term2022.getClass(), "first", term2022);
        setIntField(term2036, term2036.getClass(), "type", 287287233);
        setField(term2036, term2036.getClass(), "next", term2020);
        setIntField(term2038, term2038.getClass(), "type", 0);
        setField(term2038, term2038.getClass(), "next", null);
        setField(term2038, term2038.getClass(), "first", null);
        setField(term2038, term2038.getClass(), "last", null);
        setField(term2038, term2038.getClass(), "propListHead", null);
        setIntField(term2038, term2038.getClass(), "sourcePosition", 0);
        setField(term2038, term2038.getClass(), "jsType", null);
        setField(term2038, term2038.getClass(), "parent", null);
        setField(term2036, term2036.getClass(), "first", term2038);
        setField(term2036, term2036.getClass(), "last", term2026);
        setField(term2036, term2036.getClass(), "propListHead", null);
        setIntField(term2036, term2036.getClass(), "sourcePosition", 0);
        setField(term2036, term2036.getClass(), "jsType", null);
        setField(term2036, term2036.getClass(), "parent", null);
        setField(term2022, term2022.getClass(), "last", term2036);
        setField(term2022, term2022.getClass(), "propListHead", null);
        setIntField(term2022, term2022.getClass(), "sourcePosition", 0);
        setField(term2022, term2022.getClass(), "jsType", null);
        setField(term2022, term2022.getClass(), "parent", null);
        setField(term2020, term2020.getClass(), "next", term2022);
        setIntField(term2043, term2043.getClass(), "type", -112921587);
        setIntField(term2045, term2045.getClass(), "type", 933028652);
        setField(term2045, term2045.getClass(), "next", term2036);
        setField(term2045, term2045.getClass(), "first", term2026);
        setField(term2045, term2045.getClass(), "last", term2020);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2043, term2043.getClass(), "next", term2045);
        setField(term2043, term2043.getClass(), "first", term2038);
        setField(term2043, term2043.getClass(), "last", term2026);
        setField(term2043, term2043.getClass(), "propListHead", null);
        setIntField(term2043, term2043.getClass(), "sourcePosition", 0);
        setField(term2043, term2043.getClass(), "jsType", null);
        setField(term2043, term2043.getClass(), "parent", null);
        setField(term2020, term2020.getClass(), "first", term2043);
        setField(term2020, term2020.getClass(), "last", term2043);
        setField(term2020, term2020.getClass(), "propListHead", null);
        setIntField(term2020, term2020.getClass(), "sourcePosition", 0);
        setField(term2020, term2020.getClass(), "jsType", null);
        setField(term2020, term2020.getClass(), "parent", null);
        setField(term2001, term2001.getClass(), "rootNode", term2020);
        setField(term2001, term2001.getClass(), "thisType", null);
        setBooleanField(term2001, term2001.getClass(), "isBottom", false);
        setField(term2001, term2001.getClass(), "arguments", null);
        Class<? extends Object> term7333 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term7332 = ((Class) term7333).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term7332).setAccessible(true);
        enum4 = ((Field) term7332).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term2001;
        args[1] = "PtirvZmsGt";
        args[2] = enum4;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term1953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


