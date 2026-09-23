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

public class TypedScopeCreator_getNativeType_204163761218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2545 = new HashMap();
        HashMap term2552 = new HashMap();
        Set<Object> term8135 =  ((Map) term2552).keySet();
        HashSet term2551 = new HashSet((Collection<? extends Object>) term8135);
        HashMap term2558 = new HashMap();
        Set<Object> term8136 =  ((Map) term2558).keySet();
        HashSet term2557 = new HashSet((Collection<? extends Object>) term8136);
        HashMap term2564 = new HashMap();
        Set<Object> term8137 =  ((Map) term2564).keySet();
        HashSet term2563 = new HashSet((Collection<? extends Object>) term8137);
        HashMap term2569 = new HashMap();
        HashMap term2575 = new HashMap();
        HashMap term2580 = new HashMap();
        term2541 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2542 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2544 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2541, term2541.getClass(), "compiler", null);
        setField(term2541, term2541.getClass(), "typeParsingErrorReporter", null);
        setField(term2542, term2542.getClass(), "compiler", null);
        setField(term2543, term2543.getClass(), "reporter", null);
        setField(term2543, term2543.getClass(), "nativeTypes", term2544);
        setField(term2543, term2543.getClass(), "namesToTypes", term2545);
        setField(term2543, term2543.getClass(), "namespaces", term2551);
        setField(term2543, term2543.getClass(), "nonNullableTypeNames", term2557);
        setField(term2543, term2543.getClass(), "forwardDeclaredTypes", term2563);
        setField(term2543, term2543.getClass(), "typesIndexedByProperty", term2569);
        setField(term2543, term2543.getClass(), "eachRefTypeIndexedByProperty", term2575);
        setField(term2543, term2543.getClass(), "greatestSubtypeByProperty", term2580);
        setField(term2543, term2543.getClass(), "interfaceToImplementors", null);
        setField(term2543, term2543.getClass(), "unresolvedNamedTypes", null);
        setField(term2543, term2543.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2543, term2543.getClass(), "lastGeneration", false);
        setField(term2543, term2543.getClass(), "templateTypeName", null);
        setField(term2543, term2543.getClass(), "templateType", null);
        setBooleanField(term2543, term2543.getClass(), "tolerateUndefinedValues", false);
        setField(term2543, term2543.getClass(), "resolveMode", null);
        setField(term2542, term2542.getClass(), "typeRegistry", term2543);
        setField(term2542, term2542.getClass(), "allValueTypes", null);
        setBooleanField(term2542, term2542.getClass(), "shouldReport", false);
        setField(term2542, term2542.getClass(), "nullOrUndefined", null);
        setField(term2542, term2542.getClass(), "mismatches", null);
        setField(term2541, term2541.getClass(), "validator", term2542);
        setField(term2541, term2541.getClass(), "codingConvention", null);
        setField(term2541, term2541.getClass(), "typeRegistry", null);
        setField(term2541, term2541.getClass(), "delegateProxyPrototypes", null);
        setField(term2541, term2541.getClass(), "delegateCallingConventions", null);
        setField(term2541, term2541.getClass(), "functionAnalysisResults", null);
        Class<? extends Object> term8139 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term8138 = ((Class) term8139).getDeclaredField((String) "GREATEST_FUNCTION_TYPE");
        ((Field) term8138).setAccessible(true);
        enum5 = ((Field) term8138).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2541, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


