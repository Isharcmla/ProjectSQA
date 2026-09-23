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

public class FunctionTypeBuilder_getOrCreateConstructor_99203251146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7647;

    public FunctionTypeBuilder_getOrCreateConstructor_99203251146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7662 = new HashMap();
        HashMap term7671 = new HashMap();
        Set<Object> term14647 =  ((Map) term7671).keySet();
        HashSet term7670 = new HashSet((Collection<? extends Object>) term14647);
        HashMap term7678 = new HashMap();
        Set<Object> term14648 =  ((Map) term7678).keySet();
        HashSet term7677 = new HashSet((Collection<? extends Object>) term14648);
        HashMap term7685 = new HashMap();
        Set<Object> term14649 =  ((Map) term7685).keySet();
        HashSet term7684 = new HashSet((Collection<? extends Object>) term14649);
        HashMap term7691 = new HashMap();
        HashMap term7699 = new HashMap();
        HashMap term7704 = new HashMap();
        term7647 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term7660 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7661 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term7714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7729 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term7647, term7647.getClass(), "fnName", "vYMCjgnztg");
        setField(term7647, term7647.getClass(), "compiler", null);
        setField(term7647, term7647.getClass(), "codingConvention", null);
        setField(term7660, term7660.getClass(), "reporter", null);
        setField(term7660, term7660.getClass(), "nativeTypes", term7661);
        setField(term7660, term7660.getClass(), "namesToTypes", term7662);
        setField(term7660, term7660.getClass(), "namespaces", term7670);
        setField(term7660, term7660.getClass(), "nonNullableTypeNames", term7677);
        setField(term7660, term7660.getClass(), "forwardDeclaredTypes", term7684);
        setField(term7660, term7660.getClass(), "typesIndexedByProperty", term7691);
        setField(term7660, term7660.getClass(), "eachRefTypeIndexedByProperty", term7699);
        setField(term7660, term7660.getClass(), "greatestSubtypeByProperty", term7704);
        setField(term7660, term7660.getClass(), "interfaceToImplementors", null);
        setField(term7660, term7660.getClass(), "unresolvedNamedTypes", null);
        setField(term7660, term7660.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7660, term7660.getClass(), "lastGeneration", false);
        setField(term7660, term7660.getClass(), "templateTypeName", null);
        setField(term7660, term7660.getClass(), "templateType", null);
        setBooleanField(term7660, term7660.getClass(), "tolerateUndefinedValues", false);
        setField(term7660, term7660.getClass(), "resolveMode", null);
        setField(term7647, term7647.getClass(), "typeRegistry", term7660);
        setIntField(term7714, term7714.getClass(), "type", 0);
        setField(term7714, term7714.getClass(), "next", null);
        setField(term7714, term7714.getClass(), "first", null);
        setField(term7714, term7714.getClass(), "last", null);
        setField(term7714, term7714.getClass(), "propListHead", null);
        setIntField(term7714, term7714.getClass(), "sourcePosition", 0);
        setField(term7714, term7714.getClass(), "jsType", null);
        setField(term7714, term7714.getClass(), "parent", null);
        setField(term7647, term7647.getClass(), "errorRoot", term7714);
        setField(term7647, term7647.getClass(), "sourceName", "vuIJRrypuA");
        setField(term7729, term7729.getClass(), "vars", null);
        setField(term7729, term7729.getClass(), "parent", null);
        setIntField(term7729, term7729.getClass(), "depth", 0);
        setField(term7729, term7729.getClass(), "rootNode", null);
        setField(term7729, term7729.getClass(), "thisType", null);
        setBooleanField(term7729, term7729.getClass(), "isBottom", false);
        setField(term7729, term7729.getClass(), "arguments", null);
        setField(term7647, term7647.getClass(), "scope", term7729);
        setField(term7647, term7647.getClass(), "contents", null);
        setField(term7647, term7647.getClass(), "returnType", null);
        setBooleanField(term7647, term7647.getClass(), "returnTypeInferred", false);
        setField(term7647, term7647.getClass(), "implementedInterfaces", null);
        setField(term7647, term7647.getClass(), "extendedInterfaces", null);
        setField(term7647, term7647.getClass(), "baseType", null);
        setField(term7647, term7647.getClass(), "thisType", null);
        setBooleanField(term7647, term7647.getClass(), "isConstructor", false);
        setBooleanField(term7647, term7647.getClass(), "isInterface", false);
        setField(term7647, term7647.getClass(), "parametersNode", null);
        setField(term7647, term7647.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getOrCreateConstructor", argTypes, term7647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


