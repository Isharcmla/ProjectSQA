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

public class TypedScopeCreator_declareNativeFunctionType_123196205515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;
     Object term385;
     Object enum3;

    public TypedScopeCreator_declareNativeFunctionType_123196205515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term341 = new HashMap();
        HashMap term348 = new HashMap();
        Set<Object> term6764 =  ((Map) term348).keySet();
        HashSet term347 = new HashSet((Collection<? extends Object>) term6764);
        HashMap term354 = new HashMap();
        Set<Object> term6765 =  ((Map) term354).keySet();
        HashSet term353 = new HashSet((Collection<? extends Object>) term6765);
        HashMap term360 = new HashMap();
        Set<Object> term6766 =  ((Map) term360).keySet();
        HashSet term359 = new HashSet((Collection<? extends Object>) term6766);
        HashMap term365 = new HashMap();
        HashMap term371 = new HashMap();
        HashMap term376 = new HashMap();
        term337 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term338 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term340 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term337, term337.getClass(), "compiler", null);
        setField(term337, term337.getClass(), "typeParsingErrorReporter", null);
        setField(term338, term338.getClass(), "compiler", null);
        setField(term339, term339.getClass(), "reporter", null);
        setField(term339, term339.getClass(), "nativeTypes", term340);
        setField(term339, term339.getClass(), "namesToTypes", term341);
        setField(term339, term339.getClass(), "namespaces", term347);
        setField(term339, term339.getClass(), "nonNullableTypeNames", term353);
        setField(term339, term339.getClass(), "forwardDeclaredTypes", term359);
        setField(term339, term339.getClass(), "typesIndexedByProperty", term365);
        setField(term339, term339.getClass(), "eachRefTypeIndexedByProperty", term371);
        setField(term339, term339.getClass(), "greatestSubtypeByProperty", term376);
        setField(term339, term339.getClass(), "interfaceToImplementors", null);
        setField(term339, term339.getClass(), "unresolvedNamedTypes", null);
        setField(term339, term339.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term339, term339.getClass(), "lastGeneration", false);
        setField(term339, term339.getClass(), "templateTypes", null);
        setBooleanField(term339, term339.getClass(), "tolerateUndefinedValues", false);
        setField(term339, term339.getClass(), "resolveMode", null);
        setField(term338, term338.getClass(), "typeRegistry", term339);
        setField(term338, term338.getClass(), "allValueTypes", null);
        setBooleanField(term338, term338.getClass(), "shouldReport", false);
        setField(term338, term338.getClass(), "nullOrUndefined", null);
        setField(term338, term338.getClass(), "mismatches", null);
        setField(term337, term337.getClass(), "validator", term338);
        setField(term337, term337.getClass(), "codingConvention", null);
        setField(term337, term337.getClass(), "typeRegistry", null);
        setField(term337, term337.getClass(), "delegateProxyPrototypes", null);
        setField(term337, term337.getClass(), "delegateCallingConventions", null);
        setField(term337, term337.getClass(), "functionAnalysisResults", null);
        HashMap term386 = new HashMap();
        term385 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term401 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term385, term385.getClass(), "vars", term386);
        setField(term401, term401.getClass(), "vars", null);
        setField(term401, term401.getClass(), "parent", null);
        setIntField(term401, term401.getClass(), "depth", 0);
        setField(term401, term401.getClass(), "rootNode", null);
        setField(term401, term401.getClass(), "thisType", null);
        setBooleanField(term401, term401.getClass(), "isBottom", false);
        setField(term401, term401.getClass(), "arguments", null);
        setField(term385, term385.getClass(), "parent", term401);
        setIntField(term385, term385.getClass(), "depth", 1225272962);
        setIntField(term405, term405.getClass(), "type", 1596070772);
        setIntField(term407, term407.getClass(), "type", 97029295);
        setIntField(term409, term409.getClass(), "type", -1371869594);
        setIntField(term411, term411.getClass(), "type", -2095575670);
        setField(term411, term411.getClass(), "next", null);
        setField(term411, term411.getClass(), "first", null);
        setField(term411, term411.getClass(), "last", term411);
        setField(term411, term411.getClass(), "propListHead", null);
        setIntField(term411, term411.getClass(), "sourcePosition", 0);
        setField(term411, term411.getClass(), "jsType", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term409, term409.getClass(), "next", term411);
        setIntField(term414, term414.getClass(), "type", 0);
        setField(term414, term414.getClass(), "next", null);
        setField(term414, term414.getClass(), "first", null);
        setField(term414, term414.getClass(), "last", null);
        setField(term414, term414.getClass(), "propListHead", null);
        setIntField(term414, term414.getClass(), "sourcePosition", 0);
        setField(term414, term414.getClass(), "jsType", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term409, term409.getClass(), "first", term414);
        setIntField(term417, term417.getClass(), "type", 458147407);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", term407);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term409, term409.getClass(), "last", term417);
        setField(term409, term409.getClass(), "propListHead", null);
        setIntField(term409, term409.getClass(), "sourcePosition", 0);
        setField(term409, term409.getClass(), "jsType", null);
        setField(term409, term409.getClass(), "parent", null);
        setField(term407, term407.getClass(), "next", term409);
        setField(term407, term407.getClass(), "first", term407);
        setIntField(term421, term421.getClass(), "type", 1328271830);
        setField(term421, term421.getClass(), "next", term405);
        setIntField(term423, term423.getClass(), "type", 0);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "first", null);
        setField(term423, term423.getClass(), "last", null);
        setField(term423, term423.getClass(), "propListHead", null);
        setIntField(term423, term423.getClass(), "sourcePosition", 0);
        setField(term423, term423.getClass(), "jsType", null);
        setField(term423, term423.getClass(), "parent", null);
        setField(term421, term421.getClass(), "first", term423);
        setField(term421, term421.getClass(), "last", term411);
        setField(term421, term421.getClass(), "propListHead", null);
        setIntField(term421, term421.getClass(), "sourcePosition", 0);
        setField(term421, term421.getClass(), "jsType", null);
        setField(term421, term421.getClass(), "parent", null);
        setField(term407, term407.getClass(), "last", term421);
        setField(term407, term407.getClass(), "propListHead", null);
        setIntField(term407, term407.getClass(), "sourcePosition", 0);
        setField(term407, term407.getClass(), "jsType", null);
        setField(term407, term407.getClass(), "parent", null);
        setField(term405, term405.getClass(), "next", term407);
        setIntField(term428, term428.getClass(), "type", -184153539);
        setIntField(term430, term430.getClass(), "type", 493620644);
        setField(term430, term430.getClass(), "next", term421);
        setField(term430, term430.getClass(), "first", term411);
        setField(term430, term430.getClass(), "last", term405);
        setField(term430, term430.getClass(), "propListHead", null);
        setIntField(term430, term430.getClass(), "sourcePosition", 0);
        setField(term430, term430.getClass(), "jsType", null);
        setField(term430, term430.getClass(), "parent", null);
        setField(term428, term428.getClass(), "next", term430);
        setField(term428, term428.getClass(), "first", term423);
        setField(term428, term428.getClass(), "last", term411);
        setField(term428, term428.getClass(), "propListHead", null);
        setIntField(term428, term428.getClass(), "sourcePosition", 0);
        setField(term428, term428.getClass(), "jsType", null);
        setField(term428, term428.getClass(), "parent", null);
        setField(term405, term405.getClass(), "first", term428);
        setField(term405, term405.getClass(), "last", term428);
        setField(term405, term405.getClass(), "propListHead", null);
        setIntField(term405, term405.getClass(), "sourcePosition", 0);
        setField(term405, term405.getClass(), "jsType", null);
        setField(term405, term405.getClass(), "parent", null);
        setField(term385, term385.getClass(), "rootNode", term405);
        setField(term385, term385.getClass(), "thisType", null);
        setBooleanField(term385, term385.getClass(), "isBottom", false);
        setField(term385, term385.getClass(), "arguments", null);
        Class<? extends Object> term6768 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6767 = ((Class) term6768).getDeclaredField((String) "RANGE_ERROR_TYPE");
        ((Field) term6767).setAccessible(true);
        enum3 = ((Field) term6767).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term385;
        args[1] = enum3;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term337, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


