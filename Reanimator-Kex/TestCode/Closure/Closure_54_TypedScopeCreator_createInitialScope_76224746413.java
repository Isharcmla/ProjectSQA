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

public class TypedScopeCreator_createInitialScope_76224746413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191;
     Object term240;

    public TypedScopeCreator_createInitialScope_76224746413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term195 = new HashMap();
        HashMap term202 = new HashMap();
        Set<Object> term5548 =  ((Map) term202).keySet();
        HashSet term201 = new HashSet((Collection<? extends Object>) term5548);
        HashMap term208 = new HashMap();
        Set<Object> term5549 =  ((Map) term208).keySet();
        HashSet term207 = new HashSet((Collection<? extends Object>) term5549);
        HashMap term214 = new HashMap();
        Set<Object> term5550 =  ((Map) term214).keySet();
        HashSet term213 = new HashSet((Collection<? extends Object>) term5550);
        HashMap term219 = new HashMap();
        HashMap term225 = new HashMap();
        HashMap term230 = new HashMap();
        term191 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term192 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term194 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term191, term191.getClass(), "compiler", null);
        setField(term191, term191.getClass(), "typeParsingErrorReporter", null);
        setField(term192, term192.getClass(), "compiler", null);
        setField(term193, term193.getClass(), "reporter", null);
        setField(term193, term193.getClass(), "nativeTypes", term194);
        setField(term193, term193.getClass(), "namesToTypes", term195);
        setField(term193, term193.getClass(), "namespaces", term201);
        setField(term193, term193.getClass(), "nonNullableTypeNames", term207);
        setField(term193, term193.getClass(), "forwardDeclaredTypes", term213);
        setField(term193, term193.getClass(), "typesIndexedByProperty", term219);
        setField(term193, term193.getClass(), "eachRefTypeIndexedByProperty", term225);
        setField(term193, term193.getClass(), "greatestSubtypeByProperty", term230);
        setField(term193, term193.getClass(), "interfaceToImplementors", null);
        setField(term193, term193.getClass(), "unresolvedNamedTypes", null);
        setField(term193, term193.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term193, term193.getClass(), "lastGeneration", false);
        setField(term193, term193.getClass(), "templateTypeName", null);
        setField(term193, term193.getClass(), "templateType", null);
        setBooleanField(term193, term193.getClass(), "tolerateUndefinedValues", false);
        setField(term193, term193.getClass(), "resolveMode", null);
        setField(term192, term192.getClass(), "typeRegistry", term193);
        setField(term192, term192.getClass(), "allValueTypes", null);
        setBooleanField(term192, term192.getClass(), "shouldReport", false);
        setBooleanField(term192, term192.getClass(), "recordErrors", false);
        setField(term192, term192.getClass(), "nullOrUndefined", null);
        setField(term192, term192.getClass(), "mismatches", null);
        setField(term191, term191.getClass(), "validator", term192);
        setField(term191, term191.getClass(), "codingConvention", null);
        setField(term191, term191.getClass(), "typeRegistry", null);
        setField(term191, term191.getClass(), "delegateProxyPrototypes", null);
        setField(term191, term191.getClass(), "delegateCallingConventions", null);
        term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term240, term240.getClass(), "type", 1876565163);
        setIntField(term242, term242.getClass(), "type", 579005622);
        setIntField(term244, term244.getClass(), "type", 0);
        setField(term244, term244.getClass(), "next", null);
        setField(term244, term244.getClass(), "first", null);
        setField(term244, term244.getClass(), "last", null);
        setField(term244, term244.getClass(), "propListHead", null);
        setIntField(term244, term244.getClass(), "sourcePosition", 0);
        setField(term244, term244.getClass(), "jsType", null);
        setField(term244, term244.getClass(), "parent", null);
        setField(term242, term242.getClass(), "next", term244);
        setIntField(term247, term247.getClass(), "type", 0);
        setField(term247, term247.getClass(), "next", null);
        setField(term247, term247.getClass(), "first", null);
        setField(term247, term247.getClass(), "last", null);
        setField(term247, term247.getClass(), "propListHead", null);
        setIntField(term247, term247.getClass(), "sourcePosition", 0);
        setField(term247, term247.getClass(), "jsType", null);
        setField(term247, term247.getClass(), "parent", null);
        setField(term242, term242.getClass(), "first", term247);
        setIntField(term250, term250.getClass(), "type", 0);
        setField(term250, term250.getClass(), "next", null);
        setField(term250, term250.getClass(), "first", null);
        setField(term250, term250.getClass(), "last", null);
        setField(term250, term250.getClass(), "propListHead", null);
        setIntField(term250, term250.getClass(), "sourcePosition", 0);
        setField(term250, term250.getClass(), "jsType", null);
        setField(term250, term250.getClass(), "parent", null);
        setField(term242, term242.getClass(), "last", term250);
        setField(term242, term242.getClass(), "propListHead", null);
        setIntField(term242, term242.getClass(), "sourcePosition", 0);
        setField(term242, term242.getClass(), "jsType", null);
        setField(term242, term242.getClass(), "parent", null);
        setField(term240, term240.getClass(), "next", term242);
        setIntField(term254, term254.getClass(), "type", 0);
        setField(term254, term254.getClass(), "next", null);
        setField(term254, term254.getClass(), "first", null);
        setField(term254, term254.getClass(), "last", null);
        setField(term254, term254.getClass(), "propListHead", null);
        setIntField(term254, term254.getClass(), "sourcePosition", 0);
        setField(term254, term254.getClass(), "jsType", null);
        setField(term254, term254.getClass(), "parent", null);
        setField(term240, term240.getClass(), "first", term254);
        setIntField(term257, term257.getClass(), "type", 0);
        setField(term257, term257.getClass(), "next", null);
        setField(term257, term257.getClass(), "first", null);
        setField(term257, term257.getClass(), "last", null);
        setField(term257, term257.getClass(), "propListHead", null);
        setIntField(term257, term257.getClass(), "sourcePosition", 0);
        setField(term257, term257.getClass(), "jsType", null);
        setField(term257, term257.getClass(), "parent", null);
        setField(term240, term240.getClass(), "last", term257);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term240;
        try {
            callMethod(klass, "createInitialScope", argTypes, term191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


