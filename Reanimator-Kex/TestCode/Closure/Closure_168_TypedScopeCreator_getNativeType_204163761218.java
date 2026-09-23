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
     Object term2527;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2531 = new HashMap();
        HashMap term2538 = new HashMap();
        Set<Object> term8094 =  ((Map) term2538).keySet();
        HashSet term2537 = new HashSet((Collection<? extends Object>) term8094);
        HashMap term2544 = new HashMap();
        Set<Object> term8095 =  ((Map) term2544).keySet();
        HashSet term2543 = new HashSet((Collection<? extends Object>) term8095);
        HashMap term2550 = new HashMap();
        Set<Object> term8096 =  ((Map) term2550).keySet();
        HashSet term2549 = new HashSet((Collection<? extends Object>) term8096);
        HashMap term2555 = new HashMap();
        HashMap term2561 = new HashMap();
        HashMap term2566 = new HashMap();
        term2527 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2528 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2530 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2527, term2527.getClass(), "compiler", null);
        setField(term2527, term2527.getClass(), "typeParsingErrorReporter", null);
        setField(term2528, term2528.getClass(), "compiler", null);
        setField(term2529, term2529.getClass(), "reporter", null);
        setField(term2529, term2529.getClass(), "nativeTypes", term2530);
        setField(term2529, term2529.getClass(), "namesToTypes", term2531);
        setField(term2529, term2529.getClass(), "namespaces", term2537);
        setField(term2529, term2529.getClass(), "nonNullableTypeNames", term2543);
        setField(term2529, term2529.getClass(), "forwardDeclaredTypes", term2549);
        setField(term2529, term2529.getClass(), "typesIndexedByProperty", term2555);
        setField(term2529, term2529.getClass(), "eachRefTypeIndexedByProperty", term2561);
        setField(term2529, term2529.getClass(), "greatestSubtypeByProperty", term2566);
        setField(term2529, term2529.getClass(), "interfaceToImplementors", null);
        setField(term2529, term2529.getClass(), "unresolvedNamedTypes", null);
        setField(term2529, term2529.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2529, term2529.getClass(), "lastGeneration", false);
        setField(term2529, term2529.getClass(), "templateTypes", null);
        setBooleanField(term2529, term2529.getClass(), "tolerateUndefinedValues", false);
        setField(term2529, term2529.getClass(), "resolveMode", null);
        setField(term2528, term2528.getClass(), "typeRegistry", term2529);
        setField(term2528, term2528.getClass(), "allValueTypes", null);
        setBooleanField(term2528, term2528.getClass(), "shouldReport", false);
        setField(term2528, term2528.getClass(), "nullOrUndefined", null);
        setField(term2528, term2528.getClass(), "mismatches", null);
        setField(term2527, term2527.getClass(), "validator", term2528);
        setField(term2527, term2527.getClass(), "codingConvention", null);
        setField(term2527, term2527.getClass(), "typeRegistry", null);
        setField(term2527, term2527.getClass(), "delegateProxyPrototypes", null);
        setField(term2527, term2527.getClass(), "delegateCallingConventions", null);
        setField(term2527, term2527.getClass(), "functionAnalysisResults", null);
        Class<? extends Object> term8098 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term8097 = ((Class) term8098).getDeclaredField((String) "OBJECT_FUNCTION_TYPE");
        ((Field) term8097).setAccessible(true);
        enum5 = ((Field) term8097).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


