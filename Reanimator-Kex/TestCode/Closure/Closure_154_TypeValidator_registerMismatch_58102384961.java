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

public class TypeValidator_registerMismatch_58102384961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6104;

    public TypeValidator_registerMismatch_58102384961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6107 = new HashMap();
        HashMap term6116 = new HashMap();
        Set<Object> term15179 =  ((Map) term6116).keySet();
        HashSet term6115 = new HashSet((Collection<? extends Object>) term15179);
        HashMap term6123 = new HashMap();
        Set<Object> term15180 =  ((Map) term6123).keySet();
        HashSet term6122 = new HashSet((Collection<? extends Object>) term15180);
        HashMap term6130 = new HashMap();
        Set<Object> term15181 =  ((Map) term6130).keySet();
        HashSet term6129 = new HashSet((Collection<? extends Object>) term15181);
        HashMap term6136 = new HashMap();
        HashMap term6144 = new HashMap();
        HashMap term6149 = new HashMap();
        term6104 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6106 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term6104, term6104.getClass(), "compiler", null);
        setField(term6105, term6105.getClass(), "reporter", null);
        setField(term6105, term6105.getClass(), "nativeTypes", term6106);
        setField(term6105, term6105.getClass(), "namesToTypes", term6107);
        setField(term6105, term6105.getClass(), "namespaces", term6115);
        setField(term6105, term6105.getClass(), "nonNullableTypeNames", term6122);
        setField(term6105, term6105.getClass(), "forwardDeclaredTypes", term6129);
        setField(term6105, term6105.getClass(), "typesIndexedByProperty", term6136);
        setField(term6105, term6105.getClass(), "eachRefTypeIndexedByProperty", term6144);
        setField(term6105, term6105.getClass(), "greatestSubtypeByProperty", term6149);
        setField(term6105, term6105.getClass(), "interfaceToImplementors", null);
        setField(term6105, term6105.getClass(), "unresolvedNamedTypes", null);
        setField(term6105, term6105.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6105, term6105.getClass(), "lastGeneration", false);
        setField(term6105, term6105.getClass(), "templateTypeName", null);
        setField(term6105, term6105.getClass(), "templateType", null);
        setBooleanField(term6105, term6105.getClass(), "tolerateUndefinedValues", false);
        setField(term6105, term6105.getClass(), "resolveMode", null);
        setField(term6104, term6104.getClass(), "typeRegistry", term6105);
        setField(term6104, term6104.getClass(), "allValueTypes", null);
        setBooleanField(term6104, term6104.getClass(), "shouldReport", false);
        setField(term6104, term6104.getClass(), "nullOrUndefined", null);
        setField(term6104, term6104.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "registerMismatch", argTypes, term6104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


