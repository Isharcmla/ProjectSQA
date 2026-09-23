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

public class TypedScopeCreator_getNativeType_204163761220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2328;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2332 = new HashMap();
        HashMap term2339 = new HashMap();
        Set<Object> term6897 =  ((Map) term2339).keySet();
        HashSet term2338 = new HashSet((Collection<? extends Object>) term6897);
        HashMap term2345 = new HashMap();
        Set<Object> term6898 =  ((Map) term2345).keySet();
        HashSet term2344 = new HashSet((Collection<? extends Object>) term6898);
        HashMap term2351 = new HashMap();
        Set<Object> term6899 =  ((Map) term2351).keySet();
        HashSet term2350 = new HashSet((Collection<? extends Object>) term6899);
        HashMap term2356 = new HashMap();
        HashMap term2362 = new HashMap();
        HashMap term2367 = new HashMap();
        term2328 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2329 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2331 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term2328, term2328.getClass(), "compiler", null);
        setField(term2328, term2328.getClass(), "typeParsingErrorReporter", null);
        setField(term2329, term2329.getClass(), "compiler", null);
        setField(term2330, term2330.getClass(), "reporter", null);
        setField(term2330, term2330.getClass(), "nativeTypes", term2331);
        setField(term2330, term2330.getClass(), "namesToTypes", term2332);
        setField(term2330, term2330.getClass(), "namespaces", term2338);
        setField(term2330, term2330.getClass(), "nonNullableTypeNames", term2344);
        setField(term2330, term2330.getClass(), "forwardDeclaredTypes", term2350);
        setField(term2330, term2330.getClass(), "typesIndexedByProperty", term2356);
        setField(term2330, term2330.getClass(), "eachRefTypeIndexedByProperty", term2362);
        setField(term2330, term2330.getClass(), "greatestSubtypeByProperty", term2367);
        setField(term2330, term2330.getClass(), "interfaceToImplementors", null);
        setField(term2330, term2330.getClass(), "unresolvedNamedTypes", null);
        setField(term2330, term2330.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2330, term2330.getClass(), "lastGeneration", false);
        setField(term2330, term2330.getClass(), "templateTypeName", null);
        setField(term2330, term2330.getClass(), "templateType", null);
        setBooleanField(term2330, term2330.getClass(), "tolerateUndefinedValues", false);
        setField(term2330, term2330.getClass(), "resolveMode", null);
        setField(term2329, term2329.getClass(), "typeRegistry", term2330);
        setField(term2329, term2329.getClass(), "allValueTypes", null);
        setBooleanField(term2329, term2329.getClass(), "shouldReport", false);
        setField(term2329, term2329.getClass(), "nullOrUndefined", null);
        setField(term2329, term2329.getClass(), "mismatches", null);
        setField(term2328, term2328.getClass(), "validator", term2329);
        setField(term2328, term2328.getClass(), "codingConvention", null);
        setField(term2328, term2328.getClass(), "typeRegistry", null);
        setField(term2328, term2328.getClass(), "delegateProxyPrototypes", null);
        Class<? extends Object> term6901 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6900 = ((Class) term6901).getDeclaredField((String) "GREATEST_FUNCTION_TYPE");
        ((Field) term6900).setAccessible(true);
        enum5 = ((Field) term6900).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


