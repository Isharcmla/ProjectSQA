package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_getPossibleToBooleanOutcomes_130621132067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1867;

    public UnionType_getPossibleToBooleanOutcomes_130621132067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1868 = new ArrayList();
        ((ArrayList) term1868).add((Object)null);
        ((ArrayList) term1868).add((Object)null);
        ((ArrayList) term1868).add((Object)null);
        ((ArrayList) term1868).add((Object)null);
        HashMap term1877 = new HashMap();
        HashMap term1886 = new HashMap();
        Set<Object> term9483 =  ((Map) term1886).keySet();
        HashSet term1885 = new HashSet((Collection<? extends Object>) term9483);
        HashMap term1893 = new HashMap();
        Set<Object> term9484 =  ((Map) term1893).keySet();
        HashSet term1892 = new HashSet((Collection<? extends Object>) term9484);
        HashMap term1900 = new HashMap();
        Set<Object> term9485 =  ((Map) term1900).keySet();
        HashSet term1899 = new HashSet((Collection<? extends Object>) term9485);
        HashMap term1906 = new HashMap();
        HashMap term1914 = new HashMap();
        HashMap term1919 = new HashMap();
        term1867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1876 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term1867, term1867.getClass(), "alternates", term1868);
        setIntField(term1867, term1867.getClass(), "hashcode", 663292551);
        setBooleanField(term1867, term1867.getClass(), "resolved", true);
        setField(term1867, term1867.getClass(), "resolveResult", null);
        setBooleanField(term1867, term1867.getClass(), "inTemplatedCheckVisit", true);
        setField(term1875, term1875.getClass(), "reporter", null);
        setField(term1875, term1875.getClass(), "nativeTypes", term1876);
        setField(term1875, term1875.getClass(), "namesToTypes", term1877);
        setField(term1875, term1875.getClass(), "namespaces", term1885);
        setField(term1875, term1875.getClass(), "nonNullableTypeNames", term1892);
        setField(term1875, term1875.getClass(), "forwardDeclaredTypes", term1899);
        setField(term1875, term1875.getClass(), "typesIndexedByProperty", term1906);
        setField(term1875, term1875.getClass(), "eachRefTypeIndexedByProperty", term1914);
        setField(term1875, term1875.getClass(), "greatestSubtypeByProperty", term1919);
        setField(term1875, term1875.getClass(), "interfaceToImplementors", null);
        setField(term1875, term1875.getClass(), "unresolvedNamedTypes", null);
        setField(term1875, term1875.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1875, term1875.getClass(), "lastGeneration", false);
        setField(term1875, term1875.getClass(), "templateTypes", null);
        setBooleanField(term1875, term1875.getClass(), "tolerateUndefinedValues", false);
        setField(term1875, term1875.getClass(), "resolveMode", null);
        setField(term1867, term1867.getClass(), "registry", term1875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getPossibleToBooleanOutcomes", argTypes, term1867, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


