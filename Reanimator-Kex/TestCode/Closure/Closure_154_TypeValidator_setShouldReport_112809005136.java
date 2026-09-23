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
import java.lang.Boolean;

public class TypeValidator_setShouldReport_112809005136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term115;
     Object term7345;

    public TypeValidator_setShouldReport_112809005136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term63 = new HashMap();
        HashMap term72 = new HashMap();
        Set<Object> term7358 =  ((Map) term72).keySet();
        HashSet term71 = new HashSet((Collection<? extends Object>) term7358);
        HashMap term79 = new HashMap();
        Set<Object> term7359 =  ((Map) term79).keySet();
        HashSet term78 = new HashSet((Collection<? extends Object>) term7359);
        HashMap term85 = new HashMap();
        Set<Object> term7360 =  ((Map) term85).keySet();
        HashSet term84 = new HashSet((Collection<? extends Object>) term7360);
        HashMap term91 = new HashMap();
        HashMap term99 = new HashMap();
        HashMap term104 = new HashMap();
        term60 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term62 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term60, term60.getClass(), "compiler", null);
        setField(term61, term61.getClass(), "reporter", null);
        setField(term61, term61.getClass(), "nativeTypes", term62);
        setField(term61, term61.getClass(), "namesToTypes", term63);
        setField(term61, term61.getClass(), "namespaces", term71);
        setField(term61, term61.getClass(), "nonNullableTypeNames", term78);
        setField(term61, term61.getClass(), "forwardDeclaredTypes", term84);
        setField(term61, term61.getClass(), "typesIndexedByProperty", term91);
        setField(term61, term61.getClass(), "eachRefTypeIndexedByProperty", term99);
        setField(term61, term61.getClass(), "greatestSubtypeByProperty", term104);
        setField(term61, term61.getClass(), "interfaceToImplementors", null);
        setField(term61, term61.getClass(), "unresolvedNamedTypes", null);
        setField(term61, term61.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term61, term61.getClass(), "lastGeneration", false);
        setField(term61, term61.getClass(), "templateTypeName", null);
        setField(term61, term61.getClass(), "templateType", null);
        setBooleanField(term61, term61.getClass(), "tolerateUndefinedValues", false);
        setField(term61, term61.getClass(), "resolveMode", null);
        setField(term60, term60.getClass(), "typeRegistry", term61);
        setField(term60, term60.getClass(), "allValueTypes", null);
        setBooleanField(term60, term60.getClass(), "shouldReport", false);
        setField(term60, term60.getClass(), "nullOrUndefined", null);
        setField(term60, term60.getClass(), "mismatches", null);
        term115 = new Boolean(false);
        HashMap term7348 = new HashMap();
        HashMap term7350 = new HashMap();
        Set<Object> term7361 =  ((Map) term7350).keySet();
        HashSet term7349 = new HashSet((Collection<? extends Object>) term7361);
        HashMap term7352 = new HashMap();
        Set<Object> term7362 =  ((Map) term7352).keySet();
        HashSet term7351 = new HashSet((Collection<? extends Object>) term7362);
        HashMap term7354 = new HashMap();
        Set<Object> term7363 =  ((Map) term7354).keySet();
        HashSet term7353 = new HashSet((Collection<? extends Object>) term7363);
        HashMap term7355 = new HashMap();
        HashMap term7356 = new HashMap();
        HashMap term7357 = new HashMap();
        term7345 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term7346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7347 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term7345, term7345.getClass(), "compiler", null);
        setField(term7346, term7346.getClass(), "reporter", null);
        setField(term7346, term7346.getClass(), "nativeTypes", term7347);
        setField(term7346, term7346.getClass(), "namesToTypes", term7348);
        setField(term7346, term7346.getClass(), "namespaces", term7349);
        setField(term7346, term7346.getClass(), "nonNullableTypeNames", term7351);
        setField(term7346, term7346.getClass(), "forwardDeclaredTypes", term7353);
        setField(term7346, term7346.getClass(), "typesIndexedByProperty", term7355);
        setField(term7346, term7346.getClass(), "eachRefTypeIndexedByProperty", term7356);
        setField(term7346, term7346.getClass(), "greatestSubtypeByProperty", term7357);
        setField(term7346, term7346.getClass(), "interfaceToImplementors", null);
        setField(term7346, term7346.getClass(), "unresolvedNamedTypes", null);
        setField(term7346, term7346.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7346, term7346.getClass(), "lastGeneration", false);
        setField(term7346, term7346.getClass(), "templateTypeName", null);
        setField(term7346, term7346.getClass(), "templateType", null);
        setBooleanField(term7346, term7346.getClass(), "tolerateUndefinedValues", false);
        setField(term7346, term7346.getClass(), "resolveMode", null);
        setField(term7345, term7345.getClass(), "typeRegistry", term7346);
        setField(term7345, term7345.getClass(), "allValueTypes", null);
        setBooleanField(term7345, term7345.getClass(), "shouldReport", false);
        setField(term7345, term7345.getClass(), "nullOrUndefined", null);
        setField(term7345, term7345.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "setShouldReport", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term7345));
        assertTrue(recursiveEquals(term115, false));
    }

};


