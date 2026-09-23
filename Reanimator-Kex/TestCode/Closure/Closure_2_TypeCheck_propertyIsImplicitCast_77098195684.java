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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeCheck_propertyIsImplicitCast_77098195684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4592;
     Object term18898;

    public TypeCheck_propertyIsImplicitCast_77098195684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4596 = new HashMap();
        HashMap term4603 = new HashMap();
        Set<Object> term18915 =  ((Map) term4603).keySet();
        HashSet term4602 = new HashSet((Collection<? extends Object>) term18915);
        HashMap term4609 = new HashMap();
        Set<Object> term18916 =  ((Map) term4609).keySet();
        HashSet term4608 = new HashSet((Collection<? extends Object>) term18916);
        HashMap term4615 = new HashMap();
        Set<Object> term18917 =  ((Map) term4615).keySet();
        HashSet term4614 = new HashSet((Collection<? extends Object>) term18917);
        HashMap term4620 = new HashMap();
        HashMap term4626 = new HashMap();
        HashMap term4631 = new HashMap();
        term4592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term4593 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4595 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term4592, term4592.getClass(), "compiler", null);
        setField(term4593, term4593.getClass(), "compiler", null);
        setField(term4594, term4594.getClass(), "reporter", null);
        setField(term4594, term4594.getClass(), "nativeTypes", term4595);
        setField(term4594, term4594.getClass(), "namesToTypes", term4596);
        setField(term4594, term4594.getClass(), "namespaces", term4602);
        setField(term4594, term4594.getClass(), "nonNullableTypeNames", term4608);
        setField(term4594, term4594.getClass(), "forwardDeclaredTypes", term4614);
        setField(term4594, term4594.getClass(), "typesIndexedByProperty", term4620);
        setField(term4594, term4594.getClass(), "eachRefTypeIndexedByProperty", term4626);
        setField(term4594, term4594.getClass(), "greatestSubtypeByProperty", term4631);
        setField(term4594, term4594.getClass(), "interfaceToImplementors", null);
        setField(term4594, term4594.getClass(), "unresolvedNamedTypes", null);
        setField(term4594, term4594.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4594, term4594.getClass(), "lastGeneration", false);
        setField(term4594, term4594.getClass(), "templateTypes", null);
        setBooleanField(term4594, term4594.getClass(), "tolerateUndefinedValues", false);
        setField(term4594, term4594.getClass(), "resolveMode", null);
        setField(term4593, term4593.getClass(), "typeRegistry", term4594);
        setField(term4593, term4593.getClass(), "allValueTypes", null);
        setBooleanField(term4593, term4593.getClass(), "shouldReport", false);
        setField(term4593, term4593.getClass(), "nullOrUndefined", null);
        setField(term4593, term4593.getClass(), "mismatches", null);
        setField(term4592, term4592.getClass(), "validator", term4593);
        setField(term4592, term4592.getClass(), "reverseInterpreter", null);
        setField(term4592, term4592.getClass(), "typeRegistry", null);
        setField(term4592, term4592.getClass(), "topScope", null);
        setField(term4592, term4592.getClass(), "scopeCreator", null);
        setField(term4592, term4592.getClass(), "reportMissingOverride", null);
        setField(term4592, term4592.getClass(), "reportUnknownTypes", null);
        setBooleanField(term4592, term4592.getClass(), "reportMissingProperties", false);
        setField(term4592, term4592.getClass(), "inferJSDocInfo", null);
        setIntField(term4592, term4592.getClass(), "typedCount", 0);
        setIntField(term4592, term4592.getClass(), "nullCount", 0);
        setIntField(term4592, term4592.getClass(), "unknownCount", 0);
        setBooleanField(term4592, term4592.getClass(), "inExterns", false);
        setIntField(term4592, term4592.getClass(), "noTypeCheckSection", 0);
        HashMap term18902 = new HashMap();
        HashMap term18904 = new HashMap();
        Set<Object> term18928 =  ((Map) term18904).keySet();
        HashSet term18903 = new HashSet((Collection<? extends Object>) term18928);
        HashMap term18906 = new HashMap();
        Set<Object> term18929 =  ((Map) term18906).keySet();
        HashSet term18905 = new HashSet((Collection<? extends Object>) term18929);
        HashMap term18908 = new HashMap();
        Set<Object> term18930 =  ((Map) term18908).keySet();
        HashSet term18907 = new HashSet((Collection<? extends Object>) term18930);
        HashMap term18909 = new HashMap();
        HashMap term18910 = new HashMap();
        HashMap term18911 = new HashMap();
        term18898 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term18899 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term18900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term18901 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term18898, term18898.getClass(), "compiler", null);
        setField(term18899, term18899.getClass(), "compiler", null);
        setField(term18900, term18900.getClass(), "reporter", null);
        setField(term18900, term18900.getClass(), "nativeTypes", term18901);
        setField(term18900, term18900.getClass(), "namesToTypes", term18902);
        setField(term18900, term18900.getClass(), "namespaces", term18903);
        setField(term18900, term18900.getClass(), "nonNullableTypeNames", term18905);
        setField(term18900, term18900.getClass(), "forwardDeclaredTypes", term18907);
        setField(term18900, term18900.getClass(), "typesIndexedByProperty", term18909);
        setField(term18900, term18900.getClass(), "eachRefTypeIndexedByProperty", term18910);
        setField(term18900, term18900.getClass(), "greatestSubtypeByProperty", term18911);
        setField(term18900, term18900.getClass(), "interfaceToImplementors", null);
        setField(term18900, term18900.getClass(), "unresolvedNamedTypes", null);
        setField(term18900, term18900.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term18900, term18900.getClass(), "lastGeneration", false);
        setField(term18900, term18900.getClass(), "templateTypes", null);
        setBooleanField(term18900, term18900.getClass(), "tolerateUndefinedValues", false);
        setField(term18900, term18900.getClass(), "resolveMode", null);
        setField(term18899, term18899.getClass(), "typeRegistry", term18900);
        setField(term18899, term18899.getClass(), "allValueTypes", null);
        setBooleanField(term18899, term18899.getClass(), "shouldReport", false);
        setField(term18899, term18899.getClass(), "nullOrUndefined", null);
        setField(term18899, term18899.getClass(), "mismatches", null);
        setField(term18898, term18898.getClass(), "validator", term18899);
        setField(term18898, term18898.getClass(), "reverseInterpreter", null);
        setField(term18898, term18898.getClass(), "typeRegistry", null);
        setField(term18898, term18898.getClass(), "topScope", null);
        setField(term18898, term18898.getClass(), "scopeCreator", null);
        setField(term18898, term18898.getClass(), "reportMissingOverride", null);
        setField(term18898, term18898.getClass(), "reportUnknownTypes", null);
        setBooleanField(term18898, term18898.getClass(), "reportMissingProperties", false);
        setField(term18898, term18898.getClass(), "inferJSDocInfo", null);
        setIntField(term18898, term18898.getClass(), "typedCount", 0);
        setIntField(term18898, term18898.getClass(), "nullCount", 0);
        setIntField(term18898, term18898.getClass(), "unknownCount", 0);
        setBooleanField(term18898, term18898.getClass(), "inExterns", false);
        setIntField(term18898, term18898.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "UEdzEKEEEV";
        Object retValue = callMethod(klass, "propertyIsImplicitCast", argTypes, term4592, args);
        assertTrue(recursiveEquals(term4592, term18898));
        assertTrue(recursiveEquals(retValue, false));
    }

};


