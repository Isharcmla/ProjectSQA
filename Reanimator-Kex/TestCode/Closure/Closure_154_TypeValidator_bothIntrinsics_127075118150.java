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

public class TypeValidator_bothIntrinsics_127075118150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2410;

    public TypeValidator_bothIntrinsics_127075118150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2413 = new HashMap();
        HashMap term2422 = new HashMap();
        Set<Object> term11122 =  ((Map) term2422).keySet();
        HashSet term2421 = new HashSet((Collection<? extends Object>) term11122);
        HashMap term2429 = new HashMap();
        Set<Object> term11123 =  ((Map) term2429).keySet();
        HashSet term2428 = new HashSet((Collection<? extends Object>) term11123);
        HashMap term2436 = new HashMap();
        Set<Object> term11124 =  ((Map) term2436).keySet();
        HashSet term2435 = new HashSet((Collection<? extends Object>) term11124);
        HashMap term2442 = new HashMap();
        HashMap term2450 = new HashMap();
        HashMap term2455 = new HashMap();
        term2410 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2411 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2412 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term2410, term2410.getClass(), "compiler", null);
        setField(term2411, term2411.getClass(), "reporter", null);
        setField(term2411, term2411.getClass(), "nativeTypes", term2412);
        setField(term2411, term2411.getClass(), "namesToTypes", term2413);
        setField(term2411, term2411.getClass(), "namespaces", term2421);
        setField(term2411, term2411.getClass(), "nonNullableTypeNames", term2428);
        setField(term2411, term2411.getClass(), "forwardDeclaredTypes", term2435);
        setField(term2411, term2411.getClass(), "typesIndexedByProperty", term2442);
        setField(term2411, term2411.getClass(), "eachRefTypeIndexedByProperty", term2450);
        setField(term2411, term2411.getClass(), "greatestSubtypeByProperty", term2455);
        setField(term2411, term2411.getClass(), "interfaceToImplementors", null);
        setField(term2411, term2411.getClass(), "unresolvedNamedTypes", null);
        setField(term2411, term2411.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2411, term2411.getClass(), "lastGeneration", false);
        setField(term2411, term2411.getClass(), "templateTypeName", null);
        setField(term2411, term2411.getClass(), "templateType", null);
        setBooleanField(term2411, term2411.getClass(), "tolerateUndefinedValues", false);
        setField(term2411, term2411.getClass(), "resolveMode", null);
        setField(term2410, term2410.getClass(), "typeRegistry", term2411);
        setField(term2410, term2410.getClass(), "allValueTypes", null);
        setBooleanField(term2410, term2410.getClass(), "shouldReport", false);
        setField(term2410, term2410.getClass(), "nullOrUndefined", null);
        setField(term2410, term2410.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "bothIntrinsics", argTypes, term2410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


