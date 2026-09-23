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
     Object term335;
     Object term383;
     Object enum3;

    public TypedScopeCreator_declareNativeFunctionType_123196205515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term339 = new HashMap();
        HashMap term346 = new HashMap();
        Set<Object> term6783 =  ((Map) term346).keySet();
        HashSet term345 = new HashSet((Collection<? extends Object>) term6783);
        HashMap term352 = new HashMap();
        Set<Object> term6784 =  ((Map) term352).keySet();
        HashSet term351 = new HashSet((Collection<? extends Object>) term6784);
        HashMap term358 = new HashMap();
        Set<Object> term6785 =  ((Map) term358).keySet();
        HashSet term357 = new HashSet((Collection<? extends Object>) term6785);
        HashMap term363 = new HashMap();
        HashMap term369 = new HashMap();
        HashMap term374 = new HashMap();
        term335 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term336 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term337 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term338 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term335, term335.getClass(), "compiler", null);
        setField(term335, term335.getClass(), "typeParsingErrorReporter", null);
        setField(term336, term336.getClass(), "compiler", null);
        setField(term337, term337.getClass(), "reporter", null);
        setField(term337, term337.getClass(), "nativeTypes", term338);
        setField(term337, term337.getClass(), "namesToTypes", term339);
        setField(term337, term337.getClass(), "namespaces", term345);
        setField(term337, term337.getClass(), "nonNullableTypeNames", term351);
        setField(term337, term337.getClass(), "forwardDeclaredTypes", term357);
        setField(term337, term337.getClass(), "typesIndexedByProperty", term363);
        setField(term337, term337.getClass(), "eachRefTypeIndexedByProperty", term369);
        setField(term337, term337.getClass(), "greatestSubtypeByProperty", term374);
        setField(term337, term337.getClass(), "interfaceToImplementors", null);
        setField(term337, term337.getClass(), "unresolvedNamedTypes", null);
        setField(term337, term337.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term337, term337.getClass(), "lastGeneration", false);
        setField(term337, term337.getClass(), "templateTypeName", null);
        setField(term337, term337.getClass(), "templateType", null);
        setBooleanField(term337, term337.getClass(), "tolerateUndefinedValues", false);
        setField(term337, term337.getClass(), "resolveMode", null);
        setField(term336, term336.getClass(), "typeRegistry", term337);
        setField(term336, term336.getClass(), "allValueTypes", null);
        setBooleanField(term336, term336.getClass(), "shouldReport", false);
        setField(term336, term336.getClass(), "nullOrUndefined", null);
        setField(term336, term336.getClass(), "mismatches", null);
        setField(term335, term335.getClass(), "validator", term336);
        setField(term335, term335.getClass(), "codingConvention", null);
        setField(term335, term335.getClass(), "typeRegistry", null);
        setField(term335, term335.getClass(), "delegateProxyPrototypes", null);
        setField(term335, term335.getClass(), "delegateCallingConventions", null);
        setField(term335, term335.getClass(), "functionAnalysisResults", null);
        HashMap term384 = new HashMap();
        term383 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term398 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term383, term383.getClass(), "vars", term384);
        setField(term398, term398.getClass(), "vars", null);
        setField(term398, term398.getClass(), "parent", null);
        setIntField(term398, term398.getClass(), "depth", 0);
        setField(term398, term398.getClass(), "rootNode", null);
        setField(term398, term398.getClass(), "thisType", null);
        setBooleanField(term398, term398.getClass(), "isBottom", false);
        setField(term398, term398.getClass(), "arguments", null);
        setField(term383, term383.getClass(), "parent", term398);
        setIntField(term383, term383.getClass(), "depth", 1225272962);
        setIntField(term402, term402.getClass(), "type", 1596070772);
        setIntField(term404, term404.getClass(), "type", 97029295);
        setIntField(term406, term406.getClass(), "type", -1371869594);
        setIntField(term408, term408.getClass(), "type", -2095575670);
        setField(term408, term408.getClass(), "next", null);
        setField(term408, term408.getClass(), "first", null);
        setField(term408, term408.getClass(), "last", term408);
        setField(term408, term408.getClass(), "propListHead", null);
        setIntField(term408, term408.getClass(), "sourcePosition", 0);
        setField(term408, term408.getClass(), "jsType", null);
        setField(term408, term408.getClass(), "parent", null);
        setField(term406, term406.getClass(), "next", term408);
        setIntField(term411, term411.getClass(), "type", 0);
        setField(term411, term411.getClass(), "next", null);
        setField(term411, term411.getClass(), "first", null);
        setField(term411, term411.getClass(), "last", null);
        setField(term411, term411.getClass(), "propListHead", null);
        setIntField(term411, term411.getClass(), "sourcePosition", 0);
        setField(term411, term411.getClass(), "jsType", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term406, term406.getClass(), "first", term411);
        setIntField(term414, term414.getClass(), "type", 458147407);
        setField(term414, term414.getClass(), "next", null);
        setField(term414, term414.getClass(), "first", term404);
        setField(term414, term414.getClass(), "last", null);
        setField(term414, term414.getClass(), "propListHead", null);
        setIntField(term414, term414.getClass(), "sourcePosition", 0);
        setField(term414, term414.getClass(), "jsType", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term406, term406.getClass(), "last", term414);
        setField(term406, term406.getClass(), "propListHead", null);
        setIntField(term406, term406.getClass(), "sourcePosition", 0);
        setField(term406, term406.getClass(), "jsType", null);
        setField(term406, term406.getClass(), "parent", null);
        setField(term404, term404.getClass(), "next", term406);
        setField(term404, term404.getClass(), "first", term404);
        setIntField(term418, term418.getClass(), "type", 1328271830);
        setField(term418, term418.getClass(), "next", term402);
        setIntField(term420, term420.getClass(), "type", 0);
        setField(term420, term420.getClass(), "next", null);
        setField(term420, term420.getClass(), "first", null);
        setField(term420, term420.getClass(), "last", null);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
        setField(term418, term418.getClass(), "first", term420);
        setField(term418, term418.getClass(), "last", term408);
        setField(term418, term418.getClass(), "propListHead", null);
        setIntField(term418, term418.getClass(), "sourcePosition", 0);
        setField(term418, term418.getClass(), "jsType", null);
        setField(term418, term418.getClass(), "parent", null);
        setField(term404, term404.getClass(), "last", term418);
        setField(term404, term404.getClass(), "propListHead", null);
        setIntField(term404, term404.getClass(), "sourcePosition", 0);
        setField(term404, term404.getClass(), "jsType", null);
        setField(term404, term404.getClass(), "parent", null);
        setField(term402, term402.getClass(), "next", term404);
        setIntField(term425, term425.getClass(), "type", -184153539);
        setIntField(term427, term427.getClass(), "type", 493620644);
        setField(term427, term427.getClass(), "next", term418);
        setField(term427, term427.getClass(), "first", term408);
        setField(term427, term427.getClass(), "last", term402);
        setField(term427, term427.getClass(), "propListHead", null);
        setIntField(term427, term427.getClass(), "sourcePosition", 0);
        setField(term427, term427.getClass(), "jsType", null);
        setField(term427, term427.getClass(), "parent", null);
        setField(term425, term425.getClass(), "next", term427);
        setField(term425, term425.getClass(), "first", term420);
        setField(term425, term425.getClass(), "last", term408);
        setField(term425, term425.getClass(), "propListHead", null);
        setIntField(term425, term425.getClass(), "sourcePosition", 0);
        setField(term425, term425.getClass(), "jsType", null);
        setField(term425, term425.getClass(), "parent", null);
        setField(term402, term402.getClass(), "first", term425);
        setField(term402, term402.getClass(), "last", term425);
        setField(term402, term402.getClass(), "propListHead", null);
        setIntField(term402, term402.getClass(), "sourcePosition", 0);
        setField(term402, term402.getClass(), "jsType", null);
        setField(term402, term402.getClass(), "parent", null);
        setField(term383, term383.getClass(), "rootNode", term402);
        setField(term383, term383.getClass(), "thisType", null);
        setBooleanField(term383, term383.getClass(), "isBottom", false);
        setField(term383, term383.getClass(), "arguments", null);
        Class<? extends Object> term6787 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6786 = ((Class) term6787).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term6786).setAccessible(true);
        enum3 = ((Field) term6786).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term383;
        args[1] = enum3;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


