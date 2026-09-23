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

public class TypeValidator_formatFoundRequired_184199307263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6222;
     Object term15344;

    public TypeValidator_formatFoundRequired_184199307263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6225 = new HashMap();
        HashMap term6234 = new HashMap();
        Set<Object> term15359 =  ((Map) term6234).keySet();
        HashSet term6233 = new HashSet((Collection<? extends Object>) term15359);
        HashMap term6241 = new HashMap();
        Set<Object> term15360 =  ((Map) term6241).keySet();
        HashSet term6240 = new HashSet((Collection<? extends Object>) term15360);
        HashMap term6248 = new HashMap();
        Set<Object> term15361 =  ((Map) term6248).keySet();
        HashSet term6247 = new HashSet((Collection<? extends Object>) term15361);
        HashMap term6254 = new HashMap();
        HashMap term6262 = new HashMap();
        HashMap term6267 = new HashMap();
        term6222 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6224 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term6222, term6222.getClass(), "compiler", null);
        setField(term6223, term6223.getClass(), "reporter", null);
        setField(term6223, term6223.getClass(), "nativeTypes", term6224);
        setField(term6223, term6223.getClass(), "namesToTypes", term6225);
        setField(term6223, term6223.getClass(), "namespaces", term6233);
        setField(term6223, term6223.getClass(), "nonNullableTypeNames", term6240);
        setField(term6223, term6223.getClass(), "forwardDeclaredTypes", term6247);
        setField(term6223, term6223.getClass(), "typesIndexedByProperty", term6254);
        setField(term6223, term6223.getClass(), "eachRefTypeIndexedByProperty", term6262);
        setField(term6223, term6223.getClass(), "greatestSubtypeByProperty", term6267);
        setField(term6223, term6223.getClass(), "interfaceToImplementors", null);
        setField(term6223, term6223.getClass(), "unresolvedNamedTypes", null);
        setField(term6223, term6223.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6223, term6223.getClass(), "lastGeneration", false);
        setField(term6223, term6223.getClass(), "templateTypeName", null);
        setField(term6223, term6223.getClass(), "templateType", null);
        setBooleanField(term6223, term6223.getClass(), "tolerateUndefinedValues", false);
        setField(term6223, term6223.getClass(), "resolveMode", null);
        setField(term6222, term6222.getClass(), "typeRegistry", term6223);
        setField(term6222, term6222.getClass(), "allValueTypes", null);
        setBooleanField(term6222, term6222.getClass(), "shouldReport", false);
        setField(term6222, term6222.getClass(), "nullOrUndefined", null);
        setField(term6222, term6222.getClass(), "mismatches", null);
        HashMap term15347 = new HashMap();
        HashMap term15349 = new HashMap();
        Set<Object> term15372 =  ((Map) term15349).keySet();
        HashSet term15348 = new HashSet((Collection<? extends Object>) term15372);
        HashMap term15351 = new HashMap();
        Set<Object> term15373 =  ((Map) term15351).keySet();
        HashSet term15350 = new HashSet((Collection<? extends Object>) term15373);
        HashMap term15353 = new HashMap();
        Set<Object> term15374 =  ((Map) term15353).keySet();
        HashSet term15352 = new HashSet((Collection<? extends Object>) term15374);
        HashMap term15354 = new HashMap();
        HashMap term15355 = new HashMap();
        HashMap term15356 = new HashMap();
        term15344 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term15345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15346 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term15344, term15344.getClass(), "compiler", null);
        setField(term15345, term15345.getClass(), "reporter", null);
        setField(term15345, term15345.getClass(), "nativeTypes", term15346);
        setField(term15345, term15345.getClass(), "namesToTypes", term15347);
        setField(term15345, term15345.getClass(), "namespaces", term15348);
        setField(term15345, term15345.getClass(), "nonNullableTypeNames", term15350);
        setField(term15345, term15345.getClass(), "forwardDeclaredTypes", term15352);
        setField(term15345, term15345.getClass(), "typesIndexedByProperty", term15354);
        setField(term15345, term15345.getClass(), "eachRefTypeIndexedByProperty", term15355);
        setField(term15345, term15345.getClass(), "greatestSubtypeByProperty", term15356);
        setField(term15345, term15345.getClass(), "interfaceToImplementors", null);
        setField(term15345, term15345.getClass(), "unresolvedNamedTypes", null);
        setField(term15345, term15345.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15345, term15345.getClass(), "lastGeneration", false);
        setField(term15345, term15345.getClass(), "templateTypeName", null);
        setField(term15345, term15345.getClass(), "templateType", null);
        setBooleanField(term15345, term15345.getClass(), "tolerateUndefinedValues", false);
        setField(term15345, term15345.getClass(), "resolveMode", null);
        setField(term15344, term15344.getClass(), "typeRegistry", term15345);
        setField(term15344, term15344.getClass(), "allValueTypes", null);
        setBooleanField(term15344, term15344.getClass(), "shouldReport", false);
        setField(term15344, term15344.getClass(), "nullOrUndefined", null);
        setField(term15344, term15344.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = "rawiXxuyRn";
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "formatFoundRequired", argTypes, term6222, args);
        assertTrue(recursiveEquals(term6222, term15344));
        assertTrue(recursiveEquals(retValue, "rawiXxuyRn\nfound   : null\nrequired: null"));
    }

};


