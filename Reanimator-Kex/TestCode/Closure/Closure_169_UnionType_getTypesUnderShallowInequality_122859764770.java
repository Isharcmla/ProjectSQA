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

public class UnionType_getTypesUnderShallowInequality_122859764770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2062;

    public UnionType_getTypesUnderShallowInequality_122859764770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2063 = new ArrayList();
        ((ArrayList) term2063).add((Object)null);
        HashMap term2072 = new HashMap();
        HashMap term2081 = new HashMap();
        Set<Object> term10578 =  ((Map) term2081).keySet();
        HashSet term2080 = new HashSet((Collection<? extends Object>) term10578);
        HashMap term2088 = new HashMap();
        Set<Object> term10579 =  ((Map) term2088).keySet();
        HashSet term2087 = new HashSet((Collection<? extends Object>) term10579);
        HashMap term2095 = new HashMap();
        Set<Object> term10580 =  ((Map) term2095).keySet();
        HashSet term2094 = new HashSet((Collection<? extends Object>) term10580);
        HashMap term2101 = new HashMap();
        HashMap term2109 = new HashMap();
        HashMap term2114 = new HashMap();
        term2062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2071 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        setField(term2062, term2062.getClass(), "alternates", term2063);
        setIntField(term2062, term2062.getClass(), "hashcode", 497269071);
        setBooleanField(term2062, term2062.getClass(), "resolved", false);
        setField(term2062, term2062.getClass(), "resolveResult", null);
        setBooleanField(term2062, term2062.getClass(), "inTemplatedCheckVisit", false);
        setField(term2070, term2070.getClass(), "reporter", null);
        setField(term2070, term2070.getClass(), "nativeTypes", term2071);
        setField(term2070, term2070.getClass(), "namesToTypes", term2072);
        setField(term2070, term2070.getClass(), "namespaces", term2080);
        setField(term2070, term2070.getClass(), "nonNullableTypeNames", term2087);
        setField(term2070, term2070.getClass(), "forwardDeclaredTypes", term2094);
        setField(term2070, term2070.getClass(), "typesIndexedByProperty", term2101);
        setField(term2070, term2070.getClass(), "eachRefTypeIndexedByProperty", term2109);
        setField(term2070, term2070.getClass(), "greatestSubtypeByProperty", term2114);
        setField(term2070, term2070.getClass(), "interfaceToImplementors", null);
        setField(term2070, term2070.getClass(), "unresolvedNamedTypes", null);
        setField(term2070, term2070.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2070, term2070.getClass(), "lastGeneration", false);
        setField(term2070, term2070.getClass(), "templateTypes", null);
        setBooleanField(term2070, term2070.getClass(), "tolerateUndefinedValues", false);
        setField(term2070, term2070.getClass(), "resolveMode", null);
        setField(term2062, term2062.getClass(), "registry", term2070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderShallowInequality", argTypes, term2062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


