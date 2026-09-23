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
     Object term2522;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2526 = new HashMap();
        HashMap term2533 = new HashMap();
        Set<Object> term8087 =  ((Map) term2533).keySet();
        HashSet term2532 = new HashSet((Collection<? extends Object>) term8087);
        HashMap term2539 = new HashMap();
        Set<Object> term8088 =  ((Map) term2539).keySet();
        HashSet term2538 = new HashSet((Collection<? extends Object>) term8088);
        HashMap term2545 = new HashMap();
        Set<Object> term8089 =  ((Map) term2545).keySet();
        HashSet term2544 = new HashSet((Collection<? extends Object>) term8089);
        HashMap term2550 = new HashMap();
        HashMap term2556 = new HashMap();
        HashMap term2561 = new HashMap();
        term2522 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2523 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2525 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2522, term2522.getClass(), "compiler", null);
        setField(term2522, term2522.getClass(), "typeParsingErrorReporter", null);
        setField(term2523, term2523.getClass(), "compiler", null);
        setField(term2524, term2524.getClass(), "reporter", null);
        setField(term2524, term2524.getClass(), "nativeTypes", term2525);
        setField(term2524, term2524.getClass(), "namesToTypes", term2526);
        setField(term2524, term2524.getClass(), "namespaces", term2532);
        setField(term2524, term2524.getClass(), "nonNullableTypeNames", term2538);
        setField(term2524, term2524.getClass(), "forwardDeclaredTypes", term2544);
        setField(term2524, term2524.getClass(), "typesIndexedByProperty", term2550);
        setField(term2524, term2524.getClass(), "eachRefTypeIndexedByProperty", term2556);
        setField(term2524, term2524.getClass(), "greatestSubtypeByProperty", term2561);
        setField(term2524, term2524.getClass(), "interfaceToImplementors", null);
        setField(term2524, term2524.getClass(), "unresolvedNamedTypes", null);
        setField(term2524, term2524.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2524, term2524.getClass(), "lastGeneration", false);
        setField(term2524, term2524.getClass(), "templateTypes", null);
        setBooleanField(term2524, term2524.getClass(), "tolerateUndefinedValues", false);
        setField(term2524, term2524.getClass(), "resolveMode", null);
        setField(term2523, term2523.getClass(), "typeRegistry", term2524);
        setField(term2523, term2523.getClass(), "allValueTypes", null);
        setBooleanField(term2523, term2523.getClass(), "shouldReport", false);
        setField(term2523, term2523.getClass(), "nullOrUndefined", null);
        setField(term2523, term2523.getClass(), "mismatches", null);
        setField(term2522, term2522.getClass(), "validator", term2523);
        setField(term2522, term2522.getClass(), "codingConvention", null);
        setField(term2522, term2522.getClass(), "typeRegistry", null);
        setField(term2522, term2522.getClass(), "delegateProxyPrototypes", null);
        setField(term2522, term2522.getClass(), "delegateCallingConventions", null);
        setField(term2522, term2522.getClass(), "functionAnalysisResults", null);
        Class<? extends Object> term8091 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term8090 = ((Class) term8091).getDeclaredField((String) "OBJECT_FUNCTION_TYPE");
        ((Field) term8090).setAccessible(true);
        enum5 = ((Field) term8090).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


