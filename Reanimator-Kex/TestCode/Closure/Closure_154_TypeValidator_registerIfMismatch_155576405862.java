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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeValidator_registerIfMismatch_155576405862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6163;
     Object term15227;

    public TypeValidator_registerIfMismatch_155576405862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6166 = new HashMap();
        HashMap term6175 = new HashMap();
        Set<Object> term15240 =  ((Map) term6175).keySet();
        HashSet term6174 = new HashSet((Collection<? extends Object>) term15240);
        HashMap term6182 = new HashMap();
        Set<Object> term15241 =  ((Map) term6182).keySet();
        HashSet term6181 = new HashSet((Collection<? extends Object>) term15241);
        HashMap term6189 = new HashMap();
        Set<Object> term15242 =  ((Map) term6189).keySet();
        HashSet term6188 = new HashSet((Collection<? extends Object>) term15242);
        HashMap term6195 = new HashMap();
        HashMap term6203 = new HashMap();
        HashMap term6208 = new HashMap();
        term6163 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6165 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term6163, term6163.getClass(), "compiler", null);
        setField(term6164, term6164.getClass(), "reporter", null);
        setField(term6164, term6164.getClass(), "nativeTypes", term6165);
        setField(term6164, term6164.getClass(), "namesToTypes", term6166);
        setField(term6164, term6164.getClass(), "namespaces", term6174);
        setField(term6164, term6164.getClass(), "nonNullableTypeNames", term6181);
        setField(term6164, term6164.getClass(), "forwardDeclaredTypes", term6188);
        setField(term6164, term6164.getClass(), "typesIndexedByProperty", term6195);
        setField(term6164, term6164.getClass(), "eachRefTypeIndexedByProperty", term6203);
        setField(term6164, term6164.getClass(), "greatestSubtypeByProperty", term6208);
        setField(term6164, term6164.getClass(), "interfaceToImplementors", null);
        setField(term6164, term6164.getClass(), "unresolvedNamedTypes", null);
        setField(term6164, term6164.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6164, term6164.getClass(), "lastGeneration", false);
        setField(term6164, term6164.getClass(), "templateTypeName", null);
        setField(term6164, term6164.getClass(), "templateType", null);
        setBooleanField(term6164, term6164.getClass(), "tolerateUndefinedValues", false);
        setField(term6164, term6164.getClass(), "resolveMode", null);
        setField(term6163, term6163.getClass(), "typeRegistry", term6164);
        setField(term6163, term6163.getClass(), "allValueTypes", null);
        setBooleanField(term6163, term6163.getClass(), "shouldReport", false);
        setField(term6163, term6163.getClass(), "nullOrUndefined", null);
        setField(term6163, term6163.getClass(), "mismatches", null);
        HashMap term15230 = new HashMap();
        HashMap term15232 = new HashMap();
        Set<Object> term15243 =  ((Map) term15232).keySet();
        HashSet term15231 = new HashSet((Collection<? extends Object>) term15243);
        HashMap term15234 = new HashMap();
        Set<Object> term15244 =  ((Map) term15234).keySet();
        HashSet term15233 = new HashSet((Collection<? extends Object>) term15244);
        HashMap term15236 = new HashMap();
        Set<Object> term15245 =  ((Map) term15236).keySet();
        HashSet term15235 = new HashSet((Collection<? extends Object>) term15245);
        HashMap term15237 = new HashMap();
        HashMap term15238 = new HashMap();
        HashMap term15239 = new HashMap();
        term15227 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term15228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15229 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term15227, term15227.getClass(), "compiler", null);
        setField(term15228, term15228.getClass(), "reporter", null);
        setField(term15228, term15228.getClass(), "nativeTypes", term15229);
        setField(term15228, term15228.getClass(), "namesToTypes", term15230);
        setField(term15228, term15228.getClass(), "namespaces", term15231);
        setField(term15228, term15228.getClass(), "nonNullableTypeNames", term15233);
        setField(term15228, term15228.getClass(), "forwardDeclaredTypes", term15235);
        setField(term15228, term15228.getClass(), "typesIndexedByProperty", term15237);
        setField(term15228, term15228.getClass(), "eachRefTypeIndexedByProperty", term15238);
        setField(term15228, term15228.getClass(), "greatestSubtypeByProperty", term15239);
        setField(term15228, term15228.getClass(), "interfaceToImplementors", null);
        setField(term15228, term15228.getClass(), "unresolvedNamedTypes", null);
        setField(term15228, term15228.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15228, term15228.getClass(), "lastGeneration", false);
        setField(term15228, term15228.getClass(), "templateTypeName", null);
        setField(term15228, term15228.getClass(), "templateType", null);
        setBooleanField(term15228, term15228.getClass(), "tolerateUndefinedValues", false);
        setField(term15228, term15228.getClass(), "resolveMode", null);
        setField(term15227, term15227.getClass(), "typeRegistry", term15228);
        setField(term15227, term15227.getClass(), "allValueTypes", null);
        setBooleanField(term15227, term15227.getClass(), "shouldReport", false);
        setField(term15227, term15227.getClass(), "nullOrUndefined", null);
        setField(term15227, term15227.getClass(), "mismatches", null);
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
        callMethod(klass, "registerIfMismatch", argTypes, term6163, args);
        assertTrue(recursiveEquals(term6163, term15227));
    }

};


