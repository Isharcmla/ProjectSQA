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

public class TypedScopeCreator_getNativeType_204163761217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2393 = new HashMap();
        HashMap term2400 = new HashMap();
        Set<Object> term7089 =  ((Map) term2400).keySet();
        HashSet term2399 = new HashSet((Collection<? extends Object>) term7089);
        HashMap term2406 = new HashMap();
        Set<Object> term7090 =  ((Map) term2406).keySet();
        HashSet term2405 = new HashSet((Collection<? extends Object>) term7090);
        HashMap term2412 = new HashMap();
        Set<Object> term7091 =  ((Map) term2412).keySet();
        HashSet term2411 = new HashSet((Collection<? extends Object>) term7091);
        HashMap term2417 = new HashMap();
        HashMap term2423 = new HashMap();
        HashMap term2428 = new HashMap();
        term2389 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2390 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2392 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2389, term2389.getClass(), "compiler", null);
        setField(term2389, term2389.getClass(), "typeParsingErrorReporter", null);
        setField(term2390, term2390.getClass(), "compiler", null);
        setField(term2391, term2391.getClass(), "reporter", null);
        setField(term2391, term2391.getClass(), "nativeTypes", term2392);
        setField(term2391, term2391.getClass(), "namesToTypes", term2393);
        setField(term2391, term2391.getClass(), "namespaces", term2399);
        setField(term2391, term2391.getClass(), "nonNullableTypeNames", term2405);
        setField(term2391, term2391.getClass(), "forwardDeclaredTypes", term2411);
        setField(term2391, term2391.getClass(), "typesIndexedByProperty", term2417);
        setField(term2391, term2391.getClass(), "eachRefTypeIndexedByProperty", term2423);
        setField(term2391, term2391.getClass(), "greatestSubtypeByProperty", term2428);
        setField(term2391, term2391.getClass(), "interfaceToImplementors", null);
        setField(term2391, term2391.getClass(), "unresolvedNamedTypes", null);
        setField(term2391, term2391.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2391, term2391.getClass(), "lastGeneration", false);
        setField(term2391, term2391.getClass(), "templateTypeName", null);
        setField(term2391, term2391.getClass(), "templateType", null);
        setBooleanField(term2391, term2391.getClass(), "tolerateUndefinedValues", false);
        setField(term2391, term2391.getClass(), "resolveMode", null);
        setField(term2390, term2390.getClass(), "typeRegistry", term2391);
        setField(term2390, term2390.getClass(), "allValueTypes", null);
        setBooleanField(term2390, term2390.getClass(), "shouldReport", false);
        setBooleanField(term2390, term2390.getClass(), "recordErrors", false);
        setField(term2390, term2390.getClass(), "nullOrUndefined", null);
        setField(term2390, term2390.getClass(), "mismatches", null);
        setField(term2389, term2389.getClass(), "validator", term2390);
        setField(term2389, term2389.getClass(), "codingConvention", null);
        setField(term2389, term2389.getClass(), "typeRegistry", null);
        setField(term2389, term2389.getClass(), "delegateProxyPrototypes", null);
        setField(term2389, term2389.getClass(), "delegateCallingConventions", null);
        Class<? extends Object> term7093 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term7092 = ((Class) term7093).getDeclaredField((String) "GREATEST_FUNCTION_TYPE");
        ((Field) term7092).setAccessible(true);
        enum5 = ((Field) term7092).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


