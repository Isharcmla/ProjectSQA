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

public class TypeCheck_propertyIsImplicitCast_77098195658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3325;
     Object term16193;

    public TypeCheck_propertyIsImplicitCast_77098195658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3329 = new HashMap();
        HashMap term3336 = new HashMap();
        Set<Object> term16210 =  ((Map) term3336).keySet();
        HashSet term3335 = new HashSet((Collection<? extends Object>) term16210);
        HashMap term3342 = new HashMap();
        Set<Object> term16211 =  ((Map) term3342).keySet();
        HashSet term3341 = new HashSet((Collection<? extends Object>) term16211);
        HashMap term3348 = new HashMap();
        Set<Object> term16212 =  ((Map) term3348).keySet();
        HashSet term3347 = new HashSet((Collection<? extends Object>) term16212);
        HashMap term3353 = new HashMap();
        HashMap term3359 = new HashMap();
        HashMap term3364 = new HashMap();
        term3325 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term3326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term3327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3328 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term3325, term3325.getClass(), "compiler", null);
        setField(term3326, term3326.getClass(), "compiler", null);
        setField(term3327, term3327.getClass(), "reporter", null);
        setField(term3327, term3327.getClass(), "nativeTypes", term3328);
        setField(term3327, term3327.getClass(), "namesToTypes", term3329);
        setField(term3327, term3327.getClass(), "namespaces", term3335);
        setField(term3327, term3327.getClass(), "nonNullableTypeNames", term3341);
        setField(term3327, term3327.getClass(), "forwardDeclaredTypes", term3347);
        setField(term3327, term3327.getClass(), "typesIndexedByProperty", term3353);
        setField(term3327, term3327.getClass(), "eachRefTypeIndexedByProperty", term3359);
        setField(term3327, term3327.getClass(), "greatestSubtypeByProperty", term3364);
        setField(term3327, term3327.getClass(), "interfaceToImplementors", null);
        setField(term3327, term3327.getClass(), "unresolvedNamedTypes", null);
        setField(term3327, term3327.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3327, term3327.getClass(), "lastGeneration", false);
        setField(term3327, term3327.getClass(), "templateTypeName", null);
        setField(term3327, term3327.getClass(), "templateType", null);
        setBooleanField(term3327, term3327.getClass(), "tolerateUndefinedValues", false);
        setField(term3327, term3327.getClass(), "resolveMode", null);
        setField(term3326, term3326.getClass(), "typeRegistry", term3327);
        setField(term3326, term3326.getClass(), "allValueTypes", null);
        setBooleanField(term3326, term3326.getClass(), "shouldReport", false);
        setField(term3326, term3326.getClass(), "nullOrUndefined", null);
        setField(term3326, term3326.getClass(), "mismatches", null);
        setField(term3325, term3325.getClass(), "validator", term3326);
        setField(term3325, term3325.getClass(), "reverseInterpreter", null);
        setField(term3325, term3325.getClass(), "typeRegistry", null);
        setField(term3325, term3325.getClass(), "topScope", null);
        setField(term3325, term3325.getClass(), "scopeCreator", null);
        setField(term3325, term3325.getClass(), "reportMissingOverride", null);
        setField(term3325, term3325.getClass(), "reportUnknownTypes", null);
        setBooleanField(term3325, term3325.getClass(), "reportMissingProperties", false);
        setField(term3325, term3325.getClass(), "inferJSDocInfo", null);
        setIntField(term3325, term3325.getClass(), "typedCount", 0);
        setIntField(term3325, term3325.getClass(), "nullCount", 0);
        setIntField(term3325, term3325.getClass(), "unknownCount", 0);
        setBooleanField(term3325, term3325.getClass(), "inExterns", false);
        setIntField(term3325, term3325.getClass(), "noTypeCheckSection", 0);
        HashMap term16197 = new HashMap();
        HashMap term16199 = new HashMap();
        Set<Object> term16223 =  ((Map) term16199).keySet();
        HashSet term16198 = new HashSet((Collection<? extends Object>) term16223);
        HashMap term16201 = new HashMap();
        Set<Object> term16224 =  ((Map) term16201).keySet();
        HashSet term16200 = new HashSet((Collection<? extends Object>) term16224);
        HashMap term16203 = new HashMap();
        Set<Object> term16225 =  ((Map) term16203).keySet();
        HashSet term16202 = new HashSet((Collection<? extends Object>) term16225);
        HashMap term16204 = new HashMap();
        HashMap term16205 = new HashMap();
        HashMap term16206 = new HashMap();
        term16193 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term16194 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term16195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term16196 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term16193, term16193.getClass(), "compiler", null);
        setField(term16194, term16194.getClass(), "compiler", null);
        setField(term16195, term16195.getClass(), "reporter", null);
        setField(term16195, term16195.getClass(), "nativeTypes", term16196);
        setField(term16195, term16195.getClass(), "namesToTypes", term16197);
        setField(term16195, term16195.getClass(), "namespaces", term16198);
        setField(term16195, term16195.getClass(), "nonNullableTypeNames", term16200);
        setField(term16195, term16195.getClass(), "forwardDeclaredTypes", term16202);
        setField(term16195, term16195.getClass(), "typesIndexedByProperty", term16204);
        setField(term16195, term16195.getClass(), "eachRefTypeIndexedByProperty", term16205);
        setField(term16195, term16195.getClass(), "greatestSubtypeByProperty", term16206);
        setField(term16195, term16195.getClass(), "interfaceToImplementors", null);
        setField(term16195, term16195.getClass(), "unresolvedNamedTypes", null);
        setField(term16195, term16195.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16195, term16195.getClass(), "lastGeneration", false);
        setField(term16195, term16195.getClass(), "templateTypeName", null);
        setField(term16195, term16195.getClass(), "templateType", null);
        setBooleanField(term16195, term16195.getClass(), "tolerateUndefinedValues", false);
        setField(term16195, term16195.getClass(), "resolveMode", null);
        setField(term16194, term16194.getClass(), "typeRegistry", term16195);
        setField(term16194, term16194.getClass(), "allValueTypes", null);
        setBooleanField(term16194, term16194.getClass(), "shouldReport", false);
        setField(term16194, term16194.getClass(), "nullOrUndefined", null);
        setField(term16194, term16194.getClass(), "mismatches", null);
        setField(term16193, term16193.getClass(), "validator", term16194);
        setField(term16193, term16193.getClass(), "reverseInterpreter", null);
        setField(term16193, term16193.getClass(), "typeRegistry", null);
        setField(term16193, term16193.getClass(), "topScope", null);
        setField(term16193, term16193.getClass(), "scopeCreator", null);
        setField(term16193, term16193.getClass(), "reportMissingOverride", null);
        setField(term16193, term16193.getClass(), "reportUnknownTypes", null);
        setBooleanField(term16193, term16193.getClass(), "reportMissingProperties", false);
        setField(term16193, term16193.getClass(), "inferJSDocInfo", null);
        setIntField(term16193, term16193.getClass(), "typedCount", 0);
        setIntField(term16193, term16193.getClass(), "nullCount", 0);
        setIntField(term16193, term16193.getClass(), "unknownCount", 0);
        setBooleanField(term16193, term16193.getClass(), "inExterns", false);
        setIntField(term16193, term16193.getClass(), "noTypeCheckSection", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "qnYaYSpDwO";
        Object retValue = callMethod(klass, "propertyIsImplicitCast", argTypes, term3325, args);
        assertTrue(recursiveEquals(term3325, term16193));
        assertTrue(recursiveEquals(retValue, false));
    }

};


