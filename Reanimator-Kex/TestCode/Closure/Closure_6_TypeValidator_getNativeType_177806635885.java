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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeValidator_getNativeType_177806635885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8560;
     Object enum19;

    public TypeValidator_getNativeType_177806635885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8563 = new HashMap();
        HashMap term8572 = new HashMap();
        Set<Object> term20230 =  ((Map) term8572).keySet();
        HashSet term8571 = new HashSet((Collection<? extends Object>) term20230);
        HashMap term8579 = new HashMap();
        Set<Object> term20231 =  ((Map) term8579).keySet();
        HashSet term8578 = new HashSet((Collection<? extends Object>) term20231);
        HashMap term8586 = new HashMap();
        Set<Object> term20232 =  ((Map) term8586).keySet();
        HashSet term8585 = new HashSet((Collection<? extends Object>) term20232);
        HashMap term8592 = new HashMap();
        HashMap term8600 = new HashMap();
        HashMap term8605 = new HashMap();
        term8560 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8562 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term8560, term8560.getClass(), "compiler", null);
        setField(term8561, term8561.getClass(), "reporter", null);
        setField(term8561, term8561.getClass(), "nativeTypes", term8562);
        setField(term8561, term8561.getClass(), "namesToTypes", term8563);
        setField(term8561, term8561.getClass(), "namespaces", term8571);
        setField(term8561, term8561.getClass(), "nonNullableTypeNames", term8578);
        setField(term8561, term8561.getClass(), "forwardDeclaredTypes", term8585);
        setField(term8561, term8561.getClass(), "typesIndexedByProperty", term8592);
        setField(term8561, term8561.getClass(), "eachRefTypeIndexedByProperty", term8600);
        setField(term8561, term8561.getClass(), "greatestSubtypeByProperty", term8605);
        setField(term8561, term8561.getClass(), "interfaceToImplementors", null);
        setField(term8561, term8561.getClass(), "unresolvedNamedTypes", null);
        setField(term8561, term8561.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8561, term8561.getClass(), "lastGeneration", false);
        setField(term8561, term8561.getClass(), "templateTypes", null);
        setBooleanField(term8561, term8561.getClass(), "tolerateUndefinedValues", false);
        setField(term8561, term8561.getClass(), "resolveMode", null);
        setField(term8560, term8560.getClass(), "typeRegistry", term8561);
        setField(term8560, term8560.getClass(), "allValueTypes", null);
        setBooleanField(term8560, term8560.getClass(), "shouldReport", false);
        setField(term8560, term8560.getClass(), "nullOrUndefined", null);
        setField(term8560, term8560.getClass(), "mismatches", null);
        Class<? extends Object> term20234 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term20233 = ((Class) term20234).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term20233).setAccessible(true);
        enum19 = ((Field) term20233).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum19;
        try {
            callMethod(klass, "getNativeType", argTypes, term8560, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


