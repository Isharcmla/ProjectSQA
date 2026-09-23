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

public class TypedScopeCreator_declareNativeFunctionType_123196205516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term227;
     Object enum3;

    public TypedScopeCreator_declareNativeFunctionType_123196205516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term183 = new HashMap();
        HashMap term190 = new HashMap();
        Set<Object> term5564 =  ((Map) term190).keySet();
        HashSet term189 = new HashSet((Collection<? extends Object>) term5564);
        HashMap term196 = new HashMap();
        Set<Object> term5565 =  ((Map) term196).keySet();
        HashSet term195 = new HashSet((Collection<? extends Object>) term5565);
        HashMap term202 = new HashMap();
        Set<Object> term5566 =  ((Map) term202).keySet();
        HashSet term201 = new HashSet((Collection<? extends Object>) term5566);
        HashMap term207 = new HashMap();
        HashMap term213 = new HashMap();
        HashMap term218 = new HashMap();
        term179 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term180 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term182 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term179, term179.getClass(), "compiler", null);
        setField(term179, term179.getClass(), "typeParsingErrorReporter", null);
        setField(term180, term180.getClass(), "compiler", null);
        setField(term181, term181.getClass(), "reporter", null);
        setField(term181, term181.getClass(), "nativeTypes", term182);
        setField(term181, term181.getClass(), "namesToTypes", term183);
        setField(term181, term181.getClass(), "namespaces", term189);
        setField(term181, term181.getClass(), "nonNullableTypeNames", term195);
        setField(term181, term181.getClass(), "forwardDeclaredTypes", term201);
        setField(term181, term181.getClass(), "typesIndexedByProperty", term207);
        setField(term181, term181.getClass(), "eachRefTypeIndexedByProperty", term213);
        setField(term181, term181.getClass(), "greatestSubtypeByProperty", term218);
        setField(term181, term181.getClass(), "interfaceToImplementors", null);
        setField(term181, term181.getClass(), "unresolvedNamedTypes", null);
        setField(term181, term181.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term181, term181.getClass(), "lastGeneration", false);
        setField(term181, term181.getClass(), "templateTypeName", null);
        setField(term181, term181.getClass(), "templateType", null);
        setBooleanField(term181, term181.getClass(), "tolerateUndefinedValues", false);
        setField(term181, term181.getClass(), "resolveMode", null);
        setField(term180, term180.getClass(), "typeRegistry", term181);
        setField(term180, term180.getClass(), "allValueTypes", null);
        setBooleanField(term180, term180.getClass(), "shouldReport", false);
        setField(term180, term180.getClass(), "nullOrUndefined", null);
        setField(term180, term180.getClass(), "mismatches", null);
        setField(term179, term179.getClass(), "validator", term180);
        setField(term179, term179.getClass(), "codingConvention", null);
        setField(term179, term179.getClass(), "typeRegistry", null);
        setField(term179, term179.getClass(), "delegateProxyPrototypes", null);
        HashMap term228 = new HashMap();
        term227 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term241 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term227, term227.getClass(), "vars", term228);
        setField(term241, term241.getClass(), "vars", null);
        setField(term241, term241.getClass(), "parent", null);
        setIntField(term241, term241.getClass(), "depth", 0);
        setField(term241, term241.getClass(), "rootNode", null);
        setField(term241, term241.getClass(), "thisType", null);
        setBooleanField(term241, term241.getClass(), "isBottom", false);
        setField(term241, term241.getClass(), "arguments", null);
        setField(term227, term227.getClass(), "parent", term241);
        setIntField(term227, term227.getClass(), "depth", -817164822);
        setIntField(term245, term245.getClass(), "type", 0);
        setField(term245, term245.getClass(), "next", null);
        setField(term245, term245.getClass(), "first", null);
        setField(term245, term245.getClass(), "last", null);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term227, term227.getClass(), "rootNode", term245);
        setField(term227, term227.getClass(), "thisType", null);
        setBooleanField(term227, term227.getClass(), "isBottom", false);
        setField(term227, term227.getClass(), "arguments", null);
        Class<? extends Object> term5568 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term5567 = ((Class) term5568).getDeclaredField((String) "SYNTAX_ERROR_TYPE");
        ((Field) term5567).setAccessible(true);
        enum3 = ((Field) term5567).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term227;
        args[1] = enum3;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term179, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


