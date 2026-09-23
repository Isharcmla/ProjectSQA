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

public class TypeValidator_containsForwardDeclaredUnresolvedName_5404634465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1804;

    public TypeValidator_containsForwardDeclaredUnresolvedName_5404634465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1807 = new HashMap();
        HashMap term1816 = new HashMap();
        Set<Object> term12572 =  ((Map) term1816).keySet();
        HashSet term1815 = new HashSet((Collection<? extends Object>) term12572);
        HashMap term1823 = new HashMap();
        Set<Object> term12573 =  ((Map) term1823).keySet();
        HashSet term1822 = new HashSet((Collection<? extends Object>) term12573);
        HashMap term1830 = new HashMap();
        Set<Object> term12574 =  ((Map) term1830).keySet();
        HashSet term1829 = new HashSet((Collection<? extends Object>) term12574);
        HashMap term1836 = new HashMap();
        HashMap term1844 = new HashMap();
        HashMap term1849 = new HashMap();
        term1804 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1806 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term1804, term1804.getClass(), "compiler", null);
        setField(term1805, term1805.getClass(), "reporter", null);
        setField(term1805, term1805.getClass(), "nativeTypes", term1806);
        setField(term1805, term1805.getClass(), "namesToTypes", term1807);
        setField(term1805, term1805.getClass(), "namespaces", term1815);
        setField(term1805, term1805.getClass(), "nonNullableTypeNames", term1822);
        setField(term1805, term1805.getClass(), "forwardDeclaredTypes", term1829);
        setField(term1805, term1805.getClass(), "typesIndexedByProperty", term1836);
        setField(term1805, term1805.getClass(), "eachRefTypeIndexedByProperty", term1844);
        setField(term1805, term1805.getClass(), "greatestSubtypeByProperty", term1849);
        setField(term1805, term1805.getClass(), "interfaceToImplementors", null);
        setField(term1805, term1805.getClass(), "unresolvedNamedTypes", null);
        setField(term1805, term1805.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1805, term1805.getClass(), "lastGeneration", false);
        setField(term1805, term1805.getClass(), "templateTypes", null);
        setBooleanField(term1805, term1805.getClass(), "tolerateUndefinedValues", false);
        setField(term1805, term1805.getClass(), "resolveMode", null);
        setField(term1804, term1804.getClass(), "typeRegistry", term1805);
        setField(term1804, term1804.getClass(), "allValueTypes", null);
        setBooleanField(term1804, term1804.getClass(), "shouldReport", false);
        setField(term1804, term1804.getClass(), "nullOrUndefined", null);
        setField(term1804, term1804.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term1804, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


