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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_addReferenceTypeIndexedByProperty_113651321696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2950;

    public JSTypeRegistry_addReferenceTypeIndexedByProperty_113651321696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2952 = new HashMap();
        HashMap term2962 = new HashMap();
        Set<Object> term481854 =  ((Map) term2962).keySet();
        HashSet term2961 = new HashSet((Collection<? extends Object>) term481854);
        HashMap term2973 = new HashMap();
        Set<Object> term481855 =  ((Map) term2973).keySet();
        HashSet term2972 = new HashSet((Collection<? extends Object>) term481855);
        HashMap term2979 = new HashMap();
        Set<Object> term481856 =  ((Map) term2979).keySet();
        HashSet term2978 = new HashSet((Collection<? extends Object>) term481856);
        HashMap term2995 = new HashMap();
        HashMap term3010 = new HashMap();
        HashMap term3015 = new HashMap();
        term2950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2951 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term2950, term2950.getClass(), "reporter", null);
        setField(term2950, term2950.getClass(), "nativeTypes", term2951);
        setField(term2950, term2950.getClass(), "namesToTypes", term2952);
        setField(term2950, term2950.getClass(), "namespaces", term2961);
        setField(term2950, term2950.getClass(), "nonNullableTypeNames", term2972);
        setField(term2950, term2950.getClass(), "forwardDeclaredTypes", term2978);
        setField(term2950, term2950.getClass(), "typesIndexedByProperty", term2995);
        setField(term2950, term2950.getClass(), "eachRefTypeIndexedByProperty", term3010);
        setField(term2950, term2950.getClass(), "greatestSubtypeByProperty", term3015);
        setField(term2950, term2950.getClass(), "interfaceToImplementors", null);
        setField(term2950, term2950.getClass(), "unresolvedNamedTypes", null);
        setField(term2950, term2950.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2950, term2950.getClass(), "lastGeneration", false);
        setField(term2950, term2950.getClass(), "templateTypeName", null);
        setField(term2950, term2950.getClass(), "templateType", null);
        setBooleanField(term2950, term2950.getClass(), "tolerateUndefinedValues", false);
        setField(term2950, term2950.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = "mnHyQbMyld";
        args[1] = null;
        try {
            callMethod(klass, "addReferenceTypeIndexedByProperty", argTypes, term2950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


