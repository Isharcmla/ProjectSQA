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

public class TypeCheck_getNativeType_1252666304108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13197;
     Object enum25;

    public TypeCheck_getNativeType_1252666304108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13201 = new HashMap();
        HashMap term13208 = new HashMap();
        Set<Object> term26032 =  ((Map) term13208).keySet();
        HashSet term13207 = new HashSet((Collection<? extends Object>) term26032);
        HashMap term13214 = new HashMap();
        Set<Object> term26033 =  ((Map) term13214).keySet();
        HashSet term13213 = new HashSet((Collection<? extends Object>) term26033);
        HashMap term13220 = new HashMap();
        Set<Object> term26034 =  ((Map) term13220).keySet();
        HashSet term13219 = new HashSet((Collection<? extends Object>) term26034);
        HashMap term13225 = new HashMap();
        HashMap term13231 = new HashMap();
        HashMap term13236 = new HashMap();
        term13197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term13198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term13199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13200 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term13197, term13197.getClass(), "compiler", null);
        setField(term13198, term13198.getClass(), "compiler", null);
        setField(term13199, term13199.getClass(), "reporter", null);
        setField(term13199, term13199.getClass(), "nativeTypes", term13200);
        setField(term13199, term13199.getClass(), "namesToTypes", term13201);
        setField(term13199, term13199.getClass(), "namespaces", term13207);
        setField(term13199, term13199.getClass(), "nonNullableTypeNames", term13213);
        setField(term13199, term13199.getClass(), "forwardDeclaredTypes", term13219);
        setField(term13199, term13199.getClass(), "typesIndexedByProperty", term13225);
        setField(term13199, term13199.getClass(), "eachRefTypeIndexedByProperty", term13231);
        setField(term13199, term13199.getClass(), "greatestSubtypeByProperty", term13236);
        setField(term13199, term13199.getClass(), "interfaceToImplementors", null);
        setField(term13199, term13199.getClass(), "unresolvedNamedTypes", null);
        setField(term13199, term13199.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13199, term13199.getClass(), "lastGeneration", false);
        setField(term13199, term13199.getClass(), "templateTypes", null);
        setBooleanField(term13199, term13199.getClass(), "tolerateUndefinedValues", false);
        setField(term13199, term13199.getClass(), "resolveMode", null);
        setField(term13198, term13198.getClass(), "typeRegistry", term13199);
        setField(term13198, term13198.getClass(), "allValueTypes", null);
        setBooleanField(term13198, term13198.getClass(), "shouldReport", false);
        setField(term13198, term13198.getClass(), "nullOrUndefined", null);
        setField(term13198, term13198.getClass(), "mismatches", null);
        setField(term13197, term13197.getClass(), "validator", term13198);
        setField(term13197, term13197.getClass(), "reverseInterpreter", null);
        setField(term13197, term13197.getClass(), "typeRegistry", null);
        setField(term13197, term13197.getClass(), "topScope", null);
        setField(term13197, term13197.getClass(), "scopeCreator", null);
        setField(term13197, term13197.getClass(), "reportMissingOverride", null);
        setField(term13197, term13197.getClass(), "reportUnknownTypes", null);
        setBooleanField(term13197, term13197.getClass(), "reportMissingProperties", false);
        setField(term13197, term13197.getClass(), "inferJSDocInfo", null);
        setIntField(term13197, term13197.getClass(), "typedCount", 0);
        setIntField(term13197, term13197.getClass(), "nullCount", 0);
        setIntField(term13197, term13197.getClass(), "unknownCount", 0);
        setBooleanField(term13197, term13197.getClass(), "inExterns", false);
        setIntField(term13197, term13197.getClass(), "noTypeCheckSection", 0);
        Class<? extends Object> term26036 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term26035 = ((Class) term26036).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term26035).setAccessible(true);
        enum25 = ((Field) term26035).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum25;
        try {
            callMethod(klass, "getNativeType", argTypes, term13197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


