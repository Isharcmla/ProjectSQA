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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class TypedScopeCreator_declareNativeType_19876356476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2299;
     Object term2371;

    public TypedScopeCreator_declareNativeType_19876356476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2303 = new HashMap();
        HashMap term2310 = new HashMap();
        Set<Object> term2403 =  ((Map) term2310).keySet();
        HashSet term2309 = new HashSet((Collection<? extends Object>) term2403);
        HashMap term2316 = new HashMap();
        Set<Object> term2404 =  ((Map) term2316).keySet();
        HashSet term2315 = new HashSet((Collection<? extends Object>) term2404);
        HashMap term2322 = new HashMap();
        Set<Object> term2405 =  ((Map) term2322).keySet();
        HashSet term2321 = new HashSet((Collection<? extends Object>) term2405);
        HashMap term2327 = new HashMap();
        HashMap term2332 = new HashMap();
        Object term2357 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term2357, term2357.getClass(), "first", null);
        setField(term2357, term2357.getClass(), "second", null);
        Object term2358 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term2358, term2358.getClass(), "first", null);
        setField(term2358, term2358.getClass(), "second", null);
        Object term2359 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term2359, term2359.getClass(), "first", null);
        setField(term2359, term2359.getClass(), "second", null);
        Object term2360 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term2360, term2360.getClass(), "first", null);
        setField(term2360, term2360.getClass(), "second", null);
        Object term2361 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term2361, term2361.getClass(), "first", null);
        setField(term2361, term2361.getClass(), "second", null);
        ArrayList term2355 = new ArrayList();
        ((ArrayList) term2355).add(term2357);
        ((ArrayList) term2355).add(term2358);
        ((ArrayList) term2355).add(term2359);
        ((ArrayList) term2355).add(term2360);
        ((ArrayList) term2355).add(term2361);
        HashMap term2366 = new HashMap();
        term2299 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2300 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2302 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term2351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term2299, term2299.getClass(), "compiler", null);
        setField(term2300, term2300.getClass(), "compiler", null);
        setField(term2301, term2301.getClass(), "reporter", null);
        setField(term2301, term2301.getClass(), "nativeTypes", term2302);
        setField(term2301, term2301.getClass(), "namesToTypes", term2303);
        setField(term2301, term2301.getClass(), "namespaces", term2309);
        setField(term2301, term2301.getClass(), "enumTypeNames", term2315);
        setField(term2301, term2301.getClass(), "forwardDeclaredTypes", term2321);
        setField(term2301, term2301.getClass(), "typesIndexedByProperty", term2327);
        setField(term2301, term2301.getClass(), "greatestSubtypeByProperty", term2332);
        setField(term2301, term2301.getClass(), "interfaceToImplementors", null);
        setField(term2301, term2301.getClass(), "unresolvedNamedTypes", null);
        setField(term2301, term2301.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2301, term2301.getClass(), "lastGeneration", true);
        setField(term2301, term2301.getClass(), "templateTypeName", "PHvxnGHptP");
        setField(term2351, term2351.getClass(), "name", "");
        setField(term2351, term2351.getClass(), "referencedType", null);
        setBooleanField(term2351, term2351.getClass(), "visited", false);
        setField(term2351, term2351.getClass(), "docInfo", null);
        setBooleanField(term2351, term2351.getClass(), "unknown", false);
        setField(term2351, term2351.getClass(), "registry", null);
        setField(term2301, term2301.getClass(), "templateType", term2351);
        setField(term2300, term2300.getClass(), "typeRegistry", term2301);
        setField(term2300, term2300.getClass(), "allValueTypes", null);
        setField(term2300, term2300.getClass(), "mismatches", term2355);
        setField(term2299, term2299.getClass(), "validator", term2300);
        setField(term2299, term2299.getClass(), "codingConvention", null);
        setField(term2364, term2364.getClass(), "reporter", null);
        setField(term2364, term2364.getClass(), "nativeTypes", null);
        setField(term2364, term2364.getClass(), "namesToTypes", null);
        setField(term2364, term2364.getClass(), "namespaces", null);
        setField(term2364, term2364.getClass(), "enumTypeNames", null);
        setField(term2364, term2364.getClass(), "forwardDeclaredTypes", null);
        setField(term2364, term2364.getClass(), "typesIndexedByProperty", null);
        setField(term2364, term2364.getClass(), "greatestSubtypeByProperty", null);
        setField(term2364, term2364.getClass(), "interfaceToImplementors", null);
        setField(term2364, term2364.getClass(), "unresolvedNamedTypes", null);
        setField(term2364, term2364.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2364, term2364.getClass(), "lastGeneration", false);
        setField(term2364, term2364.getClass(), "templateTypeName", null);
        setField(term2364, term2364.getClass(), "templateType", null);
        setField(term2299, term2299.getClass(), "typeRegistry", term2364);
        setField(term2299, term2299.getClass(), "delegateProxyMap", term2366);
        HashMap term2372 = new HashMap();
        term2371 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2385 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2371, term2371.getClass(), "vars", term2372);
        setField(term2385, term2385.getClass(), "vars", null);
        setField(term2385, term2385.getClass(), "parent", null);
        setField(term2385, term2385.getClass(), "rootNode", null);
        setField(term2385, term2385.getClass(), "thisType", null);
        setBooleanField(term2385, term2385.getClass(), "isBottom", false);
        setField(term2371, term2371.getClass(), "parent", term2385);
        setIntField(term2387, term2387.getClass(), "type", 0);
        setField(term2387, term2387.getClass(), "next", null);
        setField(term2387, term2387.getClass(), "first", null);
        setField(term2387, term2387.getClass(), "last", null);
        setField(term2387, term2387.getClass(), "propListHead", null);
        setIntField(term2387, term2387.getClass(), "sourcePosition", 0);
        setField(term2387, term2387.getClass(), "jsType", null);
        setField(term2387, term2387.getClass(), "parent", null);
        setField(term2371, term2371.getClass(), "rootNode", term2387);
        setField(term2371, term2371.getClass(), "thisType", null);
        setBooleanField(term2371, term2371.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term2371;
        args[1] = "swZVeJAxjt";
        args[2] = null;
        callMethod(klass, "declareNativeType", argTypes, term2299, args);
    }

};


