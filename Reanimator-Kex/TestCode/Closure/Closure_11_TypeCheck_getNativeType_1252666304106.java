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

public class TypeCheck_getNativeType_1252666304106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12944;
     Object enum25;

    public TypeCheck_getNativeType_1252666304106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12948 = new HashMap();
        HashMap term12955 = new HashMap();
        Set<Object> term25563 =  ((Map) term12955).keySet();
        HashSet term12954 = new HashSet((Collection<? extends Object>) term25563);
        HashMap term12961 = new HashMap();
        Set<Object> term25564 =  ((Map) term12961).keySet();
        HashSet term12960 = new HashSet((Collection<? extends Object>) term25564);
        HashMap term12967 = new HashMap();
        Set<Object> term25565 =  ((Map) term12967).keySet();
        HashSet term12966 = new HashSet((Collection<? extends Object>) term25565);
        HashMap term12972 = new HashMap();
        HashMap term12978 = new HashMap();
        HashMap term12983 = new HashMap();
        term12944 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term12945 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term12946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12947 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term12944, term12944.getClass(), "compiler", null);
        setField(term12945, term12945.getClass(), "compiler", null);
        setField(term12946, term12946.getClass(), "reporter", null);
        setField(term12946, term12946.getClass(), "nativeTypes", term12947);
        setField(term12946, term12946.getClass(), "namesToTypes", term12948);
        setField(term12946, term12946.getClass(), "namespaces", term12954);
        setField(term12946, term12946.getClass(), "nonNullableTypeNames", term12960);
        setField(term12946, term12946.getClass(), "forwardDeclaredTypes", term12966);
        setField(term12946, term12946.getClass(), "typesIndexedByProperty", term12972);
        setField(term12946, term12946.getClass(), "eachRefTypeIndexedByProperty", term12978);
        setField(term12946, term12946.getClass(), "greatestSubtypeByProperty", term12983);
        setField(term12946, term12946.getClass(), "interfaceToImplementors", null);
        setField(term12946, term12946.getClass(), "unresolvedNamedTypes", null);
        setField(term12946, term12946.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12946, term12946.getClass(), "lastGeneration", false);
        setField(term12946, term12946.getClass(), "templateTypes", null);
        setBooleanField(term12946, term12946.getClass(), "tolerateUndefinedValues", false);
        setField(term12946, term12946.getClass(), "resolveMode", null);
        setField(term12945, term12945.getClass(), "typeRegistry", term12946);
        setField(term12945, term12945.getClass(), "allValueTypes", null);
        setBooleanField(term12945, term12945.getClass(), "shouldReport", false);
        setField(term12945, term12945.getClass(), "nullOrUndefined", null);
        setField(term12945, term12945.getClass(), "mismatches", null);
        setField(term12944, term12944.getClass(), "validator", term12945);
        setField(term12944, term12944.getClass(), "reverseInterpreter", null);
        setField(term12944, term12944.getClass(), "typeRegistry", null);
        setField(term12944, term12944.getClass(), "topScope", null);
        setField(term12944, term12944.getClass(), "scopeCreator", null);
        setField(term12944, term12944.getClass(), "reportMissingOverride", null);
        setField(term12944, term12944.getClass(), "reportUnknownTypes", null);
        setBooleanField(term12944, term12944.getClass(), "reportMissingProperties", false);
        setField(term12944, term12944.getClass(), "inferJSDocInfo", null);
        setIntField(term12944, term12944.getClass(), "typedCount", 0);
        setIntField(term12944, term12944.getClass(), "nullCount", 0);
        setIntField(term12944, term12944.getClass(), "unknownCount", 0);
        setBooleanField(term12944, term12944.getClass(), "inExterns", false);
        setIntField(term12944, term12944.getClass(), "noTypeCheckSection", 0);
        Class<? extends Object> term25567 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term25566 = ((Class) term25567).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term25566).setAccessible(true);
        enum25 = ((Field) term25566).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum25;
        try {
            callMethod(klass, "getNativeType", argTypes, term12944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


