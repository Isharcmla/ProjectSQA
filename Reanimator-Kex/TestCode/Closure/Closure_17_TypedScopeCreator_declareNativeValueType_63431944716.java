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
     Object term1962;
     Object term2010;
     Object enum4;

    public TypedScopeCreator_declareNativeValueType_63431944716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1966 = new HashMap();
        HashMap term1973 = new HashMap();
        Set<Object> term7300 =  ((Map) term1973).keySet();
        HashSet term1972 = new HashSet((Collection<? extends Object>) term7300);
        HashMap term1979 = new HashMap();
        Set<Object> term7301 =  ((Map) term1979).keySet();
        HashSet term1978 = new HashSet((Collection<? extends Object>) term7301);
        HashMap term1985 = new HashMap();
        Set<Object> term7302 =  ((Map) term1985).keySet();
        HashSet term1984 = new HashSet((Collection<? extends Object>) term7302);
        HashMap term1990 = new HashMap();
        HashMap term1996 = new HashMap();
        HashMap term2001 = new HashMap();
        term1962 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term1963 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1965 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1962, term1962.getClass(), "compiler", null);
        setField(term1962, term1962.getClass(), "typeParsingErrorReporter", null);
        setField(term1963, term1963.getClass(), "compiler", null);
        setField(term1964, term1964.getClass(), "reporter", null);
        setField(term1964, term1964.getClass(), "nativeTypes", term1965);
        setField(term1964, term1964.getClass(), "namesToTypes", term1966);
        setField(term1964, term1964.getClass(), "namespaces", term1972);
        setField(term1964, term1964.getClass(), "nonNullableTypeNames", term1978);
        setField(term1964, term1964.getClass(), "forwardDeclaredTypes", term1984);
        setField(term1964, term1964.getClass(), "typesIndexedByProperty", term1990);
        setField(term1964, term1964.getClass(), "eachRefTypeIndexedByProperty", term1996);
        setField(term1964, term1964.getClass(), "greatestSubtypeByProperty", term2001);
        setField(term1964, term1964.getClass(), "interfaceToImplementors", null);
        setField(term1964, term1964.getClass(), "unresolvedNamedTypes", null);
        setField(term1964, term1964.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1964, term1964.getClass(), "lastGeneration", false);
        setField(term1964, term1964.getClass(), "templateTypes", null);
        setBooleanField(term1964, term1964.getClass(), "tolerateUndefinedValues", false);
        setField(term1964, term1964.getClass(), "resolveMode", null);
        setField(term1963, term1963.getClass(), "typeRegistry", term1964);
        setField(term1963, term1963.getClass(), "allValueTypes", null);
        setBooleanField(term1963, term1963.getClass(), "shouldReport", false);
        setField(term1963, term1963.getClass(), "nullOrUndefined", null);
        setField(term1963, term1963.getClass(), "mismatches", null);
        setField(term1962, term1962.getClass(), "validator", term1963);
        setField(term1962, term1962.getClass(), "codingConvention", null);
        setField(term1962, term1962.getClass(), "typeRegistry", null);
        setField(term1962, term1962.getClass(), "delegateProxyPrototypes", null);
        setField(term1962, term1962.getClass(), "delegateCallingConventions", null);
        setField(term1962, term1962.getClass(), "functionAnalysisResults", null);
        HashMap term2011 = new HashMap();
        term2010 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2025 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2010, term2010.getClass(), "vars", term2011);
        setField(term2025, term2025.getClass(), "vars", null);
        setField(term2025, term2025.getClass(), "parent", null);
        setIntField(term2025, term2025.getClass(), "depth", 0);
        setField(term2025, term2025.getClass(), "rootNode", null);
        setField(term2025, term2025.getClass(), "thisType", null);
        setBooleanField(term2025, term2025.getClass(), "isBottom", false);
        setField(term2025, term2025.getClass(), "arguments", null);
        setField(term2010, term2010.getClass(), "parent", term2025);
        setIntField(term2010, term2010.getClass(), "depth", 1551099402);
        setIntField(term2029, term2029.getClass(), "type", 962840079);
        setIntField(term2031, term2031.getClass(), "type", 1540719661);
        setIntField(term2033, term2033.getClass(), "type", 1265463001);
        setIntField(term2035, term2035.getClass(), "type", 335112684);
        setField(term2035, term2035.getClass(), "next", null);
        setField(term2035, term2035.getClass(), "first", null);
        setField(term2035, term2035.getClass(), "last", term2035);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "next", term2035);
        setIntField(term2038, term2038.getClass(), "type", 0);
        setField(term2038, term2038.getClass(), "next", null);
        setField(term2038, term2038.getClass(), "first", null);
        setField(term2038, term2038.getClass(), "last", null);
        setField(term2038, term2038.getClass(), "propListHead", null);
        setIntField(term2038, term2038.getClass(), "sourcePosition", 0);
        setField(term2038, term2038.getClass(), "jsType", null);
        setField(term2038, term2038.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "first", term2038);
        setIntField(term2041, term2041.getClass(), "type", -93135961);
        setField(term2041, term2041.getClass(), "next", null);
        setField(term2041, term2041.getClass(), "first", term2031);
        setField(term2041, term2041.getClass(), "last", null);
        setField(term2041, term2041.getClass(), "propListHead", null);
        setIntField(term2041, term2041.getClass(), "sourcePosition", 0);
        setField(term2041, term2041.getClass(), "jsType", null);
        setField(term2041, term2041.getClass(), "parent", null);
        setField(term2033, term2033.getClass(), "last", term2041);
        setField(term2033, term2033.getClass(), "propListHead", null);
        setIntField(term2033, term2033.getClass(), "sourcePosition", 0);
        setField(term2033, term2033.getClass(), "jsType", null);
        setField(term2033, term2033.getClass(), "parent", null);
        setField(term2031, term2031.getClass(), "next", term2033);
        setField(term2031, term2031.getClass(), "first", term2031);
        setIntField(term2045, term2045.getClass(), "type", 287287233);
        setField(term2045, term2045.getClass(), "next", term2029);
        setIntField(term2047, term2047.getClass(), "type", 0);
        setField(term2047, term2047.getClass(), "next", null);
        setField(term2047, term2047.getClass(), "first", null);
        setField(term2047, term2047.getClass(), "last", null);
        setField(term2047, term2047.getClass(), "propListHead", null);
        setIntField(term2047, term2047.getClass(), "sourcePosition", 0);
        setField(term2047, term2047.getClass(), "jsType", null);
        setField(term2047, term2047.getClass(), "parent", null);
        setField(term2045, term2045.getClass(), "first", term2047);
        setField(term2045, term2045.getClass(), "last", term2035);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2031, term2031.getClass(), "last", term2045);
        setField(term2031, term2031.getClass(), "propListHead", null);
        setIntField(term2031, term2031.getClass(), "sourcePosition", 0);
        setField(term2031, term2031.getClass(), "jsType", null);
        setField(term2031, term2031.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "next", term2031);
        setIntField(term2052, term2052.getClass(), "type", -112921587);
        setIntField(term2054, term2054.getClass(), "type", 933028652);
        setField(term2054, term2054.getClass(), "next", term2045);
        setField(term2054, term2054.getClass(), "first", term2035);
        setField(term2054, term2054.getClass(), "last", term2029);
        setField(term2054, term2054.getClass(), "propListHead", null);
        setIntField(term2054, term2054.getClass(), "sourcePosition", 0);
        setField(term2054, term2054.getClass(), "jsType", null);
        setField(term2054, term2054.getClass(), "parent", null);
        setField(term2052, term2052.getClass(), "next", term2054);
        setField(term2052, term2052.getClass(), "first", term2047);
        setField(term2052, term2052.getClass(), "last", term2035);
        setField(term2052, term2052.getClass(), "propListHead", null);
        setIntField(term2052, term2052.getClass(), "sourcePosition", 0);
        setField(term2052, term2052.getClass(), "jsType", null);
        setField(term2052, term2052.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "first", term2052);
        setField(term2029, term2029.getClass(), "last", term2052);
        setField(term2029, term2029.getClass(), "propListHead", null);
        setIntField(term2029, term2029.getClass(), "sourcePosition", 0);
        setField(term2029, term2029.getClass(), "jsType", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2010, term2010.getClass(), "rootNode", term2029);
        setField(term2010, term2010.getClass(), "thisType", null);
        setBooleanField(term2010, term2010.getClass(), "isBottom", false);
        setField(term2010, term2010.getClass(), "arguments", null);
        Class<? extends Object> term7314 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term7313 = ((Class) term7314).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term7313).setAccessible(true);
        enum4 = ((Field) term7313).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[3];
        args[0] = term2010;
        args[1] = "PtirvZmsGt";
        args[2] = enum4;
        try {
            callMethod(klass, "declareNativeValueType", argTypes, term1962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


