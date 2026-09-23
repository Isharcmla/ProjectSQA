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

public class TypedScopeCreator_createInitialScope_76224746415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term149;

    public TypedScopeCreator_createInitialScope_76224746415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term105 = new HashMap();
        HashMap term112 = new HashMap();
        Set<Object> term5313 =  ((Map) term112).keySet();
        HashSet term111 = new HashSet((Collection<? extends Object>) term5313);
        HashMap term118 = new HashMap();
        Set<Object> term5314 =  ((Map) term118).keySet();
        HashSet term117 = new HashSet((Collection<? extends Object>) term5314);
        HashMap term124 = new HashMap();
        Set<Object> term5315 =  ((Map) term124).keySet();
        HashSet term123 = new HashSet((Collection<? extends Object>) term5315);
        HashMap term129 = new HashMap();
        HashMap term135 = new HashMap();
        HashMap term140 = new HashMap();
        term101 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term102 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term104 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term101, term101.getClass(), "compiler", null);
        setField(term101, term101.getClass(), "typeParsingErrorReporter", null);
        setField(term102, term102.getClass(), "compiler", null);
        setField(term103, term103.getClass(), "reporter", null);
        setField(term103, term103.getClass(), "nativeTypes", term104);
        setField(term103, term103.getClass(), "namesToTypes", term105);
        setField(term103, term103.getClass(), "namespaces", term111);
        setField(term103, term103.getClass(), "nonNullableTypeNames", term117);
        setField(term103, term103.getClass(), "forwardDeclaredTypes", term123);
        setField(term103, term103.getClass(), "typesIndexedByProperty", term129);
        setField(term103, term103.getClass(), "eachRefTypeIndexedByProperty", term135);
        setField(term103, term103.getClass(), "greatestSubtypeByProperty", term140);
        setField(term103, term103.getClass(), "interfaceToImplementors", null);
        setField(term103, term103.getClass(), "unresolvedNamedTypes", null);
        setField(term103, term103.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term103, term103.getClass(), "lastGeneration", false);
        setField(term103, term103.getClass(), "templateTypeName", null);
        setField(term103, term103.getClass(), "templateType", null);
        setBooleanField(term103, term103.getClass(), "tolerateUndefinedValues", false);
        setField(term103, term103.getClass(), "resolveMode", null);
        setField(term102, term102.getClass(), "typeRegistry", term103);
        setField(term102, term102.getClass(), "allValueTypes", null);
        setBooleanField(term102, term102.getClass(), "shouldReport", false);
        setField(term102, term102.getClass(), "nullOrUndefined", null);
        setField(term102, term102.getClass(), "mismatches", null);
        setField(term101, term101.getClass(), "validator", term102);
        setField(term101, term101.getClass(), "codingConvention", null);
        setField(term101, term101.getClass(), "typeRegistry", null);
        setField(term101, term101.getClass(), "delegateProxyPrototypes", null);
        term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term149, term149.getClass(), "type", 590364439);
        setIntField(term151, term151.getClass(), "type", -203030934);
        setIntField(term153, term153.getClass(), "type", 0);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", null);
        setField(term153, term153.getClass(), "last", null);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term151, term151.getClass(), "next", term153);
        setIntField(term156, term156.getClass(), "type", 0);
        setField(term156, term156.getClass(), "next", null);
        setField(term156, term156.getClass(), "first", null);
        setField(term156, term156.getClass(), "last", null);
        setField(term156, term156.getClass(), "propListHead", null);
        setIntField(term156, term156.getClass(), "sourcePosition", 0);
        setField(term156, term156.getClass(), "jsType", null);
        setField(term156, term156.getClass(), "parent", null);
        setField(term151, term151.getClass(), "first", term156);
        setIntField(term159, term159.getClass(), "type", 0);
        setField(term159, term159.getClass(), "next", null);
        setField(term159, term159.getClass(), "first", null);
        setField(term159, term159.getClass(), "last", null);
        setField(term159, term159.getClass(), "propListHead", null);
        setIntField(term159, term159.getClass(), "sourcePosition", 0);
        setField(term159, term159.getClass(), "jsType", null);
        setField(term159, term159.getClass(), "parent", null);
        setField(term151, term151.getClass(), "last", term159);
        setField(term162, term162.getClass(), "next", null);
        setIntField(term162, term162.getClass(), "type", 0);
        setIntField(term162, term162.getClass(), "intValue", 0);
        setField(term162, term162.getClass(), "objectValue", null);
        setField(term151, term151.getClass(), "propListHead", term162);
        setIntField(term151, term151.getClass(), "sourcePosition", -226514366);
        setField(term151, term151.getClass(), "jsType", null);
        setField(term151, term151.getClass(), "parent", null);
        setField(term149, term149.getClass(), "next", term151);
        setIntField(term166, term166.getClass(), "type", 0);
        setField(term166, term166.getClass(), "next", null);
        setField(term166, term166.getClass(), "first", null);
        setField(term166, term166.getClass(), "last", null);
        setField(term166, term166.getClass(), "propListHead", null);
        setIntField(term166, term166.getClass(), "sourcePosition", 0);
        setField(term166, term166.getClass(), "jsType", null);
        setField(term166, term166.getClass(), "parent", null);
        setField(term149, term149.getClass(), "first", term166);
        setIntField(term169, term169.getClass(), "type", 0);
        setField(term169, term169.getClass(), "next", null);
        setField(term169, term169.getClass(), "first", null);
        setField(term169, term169.getClass(), "last", null);
        setField(term169, term169.getClass(), "propListHead", null);
        setIntField(term169, term169.getClass(), "sourcePosition", 0);
        setField(term169, term169.getClass(), "jsType", null);
        setField(term169, term169.getClass(), "parent", null);
        setField(term149, term149.getClass(), "last", term169);
        setField(term172, term172.getClass(), "next", null);
        setIntField(term172, term172.getClass(), "type", 0);
        setIntField(term172, term172.getClass(), "intValue", 0);
        setField(term172, term172.getClass(), "objectValue", null);
        setField(term149, term149.getClass(), "propListHead", term172);
        setIntField(term149, term149.getClass(), "sourcePosition", 1193880199);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149;
        try {
            callMethod(klass, "createInitialScope", argTypes, term101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


