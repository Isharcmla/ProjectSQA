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

public class TypeCheck_getNativeType_125266630482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10566;
     Object enum23;

    public TypeCheck_getNativeType_125266630482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10570 = new HashMap();
        HashMap term10577 = new HashMap();
        Set<Object> term25481 =  ((Map) term10577).keySet();
        HashSet term10576 = new HashSet((Collection<? extends Object>) term25481);
        HashMap term10583 = new HashMap();
        Set<Object> term25482 =  ((Map) term10583).keySet();
        HashSet term10582 = new HashSet((Collection<? extends Object>) term25482);
        HashMap term10589 = new HashMap();
        Set<Object> term25483 =  ((Map) term10589).keySet();
        HashSet term10588 = new HashSet((Collection<? extends Object>) term25483);
        HashMap term10594 = new HashMap();
        HashMap term10600 = new HashMap();
        HashMap term10605 = new HashMap();
        term10566 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10567 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10569 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term10566, term10566.getClass(), "compiler", null);
        setField(term10567, term10567.getClass(), "compiler", null);
        setField(term10568, term10568.getClass(), "reporter", null);
        setField(term10568, term10568.getClass(), "nativeTypes", term10569);
        setField(term10568, term10568.getClass(), "namesToTypes", term10570);
        setField(term10568, term10568.getClass(), "namespaces", term10576);
        setField(term10568, term10568.getClass(), "nonNullableTypeNames", term10582);
        setField(term10568, term10568.getClass(), "forwardDeclaredTypes", term10588);
        setField(term10568, term10568.getClass(), "typesIndexedByProperty", term10594);
        setField(term10568, term10568.getClass(), "eachRefTypeIndexedByProperty", term10600);
        setField(term10568, term10568.getClass(), "greatestSubtypeByProperty", term10605);
        setField(term10568, term10568.getClass(), "interfaceToImplementors", null);
        setField(term10568, term10568.getClass(), "unresolvedNamedTypes", null);
        setField(term10568, term10568.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10568, term10568.getClass(), "lastGeneration", false);
        setField(term10568, term10568.getClass(), "templateTypeName", null);
        setField(term10568, term10568.getClass(), "templateType", null);
        setBooleanField(term10568, term10568.getClass(), "tolerateUndefinedValues", false);
        setField(term10568, term10568.getClass(), "resolveMode", null);
        setField(term10567, term10567.getClass(), "typeRegistry", term10568);
        setField(term10567, term10567.getClass(), "allValueTypes", null);
        setBooleanField(term10567, term10567.getClass(), "shouldReport", false);
        setField(term10567, term10567.getClass(), "nullOrUndefined", null);
        setField(term10567, term10567.getClass(), "mismatches", null);
        setField(term10566, term10566.getClass(), "validator", term10567);
        setField(term10566, term10566.getClass(), "reverseInterpreter", null);
        setField(term10566, term10566.getClass(), "typeRegistry", null);
        setField(term10566, term10566.getClass(), "topScope", null);
        setField(term10566, term10566.getClass(), "scopeCreator", null);
        setField(term10566, term10566.getClass(), "reportMissingOverride", null);
        setField(term10566, term10566.getClass(), "reportUnknownTypes", null);
        setBooleanField(term10566, term10566.getClass(), "reportMissingProperties", false);
        setField(term10566, term10566.getClass(), "inferJSDocInfo", null);
        setIntField(term10566, term10566.getClass(), "typedCount", 0);
        setIntField(term10566, term10566.getClass(), "nullCount", 0);
        setIntField(term10566, term10566.getClass(), "unknownCount", 0);
        setBooleanField(term10566, term10566.getClass(), "inExterns", false);
        setIntField(term10566, term10566.getClass(), "noTypeCheckSection", 0);
        Class<? extends Object> term25485 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term25484 = ((Class) term25485).getDeclaredField((String) "TYPE_ERROR_FUNCTION_TYPE");
        ((Field) term25484).setAccessible(true);
        enum23 = ((Field) term25484).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum23;
        try {
            callMethod(klass, "getNativeType", argTypes, term10566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


