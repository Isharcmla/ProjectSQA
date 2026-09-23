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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_getLeastSupertype_2082831967342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52363;
     Object term52563;
     Object term53507;
     Object term53509;
     Object term53499;

    public JSType_getLeastSupertype_2082831967342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term52467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term52363, term52363.getClass(), "registry", term52467);
        term52563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term53507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term53508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term53507, term53507.getClass(), "resolved", false);
        setField(term53507, term53507.getClass(), "resolveResult", null);
        setBooleanField(term53507, term53507.getClass(), "inTemplatedCheckVisit", false);
        setField(term53508, term53508.getClass(), "reporter", null);
        setField(term53508, term53508.getClass(), "nativeTypes", null);
        setField(term53508, term53508.getClass(), "namesToTypes", null);
        setField(term53508, term53508.getClass(), "namespaces", null);
        setField(term53508, term53508.getClass(), "nonNullableTypeNames", null);
        setField(term53508, term53508.getClass(), "forwardDeclaredTypes", null);
        setField(term53508, term53508.getClass(), "typesIndexedByProperty", null);
        setField(term53508, term53508.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term53508, term53508.getClass(), "greatestSubtypeByProperty", null);
        setField(term53508, term53508.getClass(), "interfaceToImplementors", null);
        setField(term53508, term53508.getClass(), "unresolvedNamedTypes", null);
        setField(term53508, term53508.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term53508, term53508.getClass(), "lastGeneration", false);
        setField(term53508, term53508.getClass(), "templateTypes", null);
        setBooleanField(term53508, term53508.getClass(), "tolerateUndefinedValues", false);
        setField(term53508, term53508.getClass(), "resolveMode", null);
        setField(term53507, term53507.getClass(), "registry", term53508);
        term53509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term53509, term53509.getClass(), "resolved", false);
        setField(term53509, term53509.getClass(), "resolveResult", null);
        setBooleanField(term53509, term53509.getClass(), "inTemplatedCheckVisit", false);
        setField(term53509, term53509.getClass(), "registry", null);
        term53499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term53500 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term53503 = (Object[]) newArray("java.lang.Object", 2);
        Object term52801 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        Object term52804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term52807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setIntField(term53500, term53500.getClass(), "offset", 0);
        setIntField(term53500, term53500.getClass(), "size", 2);
        setBooleanField(term52801, term52801.getClass(), "resolved", false);
        setField(term52801, term52801.getClass(), "resolveResult", null);
        setBooleanField(term52801, term52801.getClass(), "inTemplatedCheckVisit", false);
        setField(term52804, term52804.getClass(), "reporter", null);
        setField(term52804, term52804.getClass(), "nativeTypes", null);
        setField(term52804, term52804.getClass(), "namesToTypes", null);
        setField(term52804, term52804.getClass(), "namespaces", null);
        setField(term52804, term52804.getClass(), "nonNullableTypeNames", null);
        setField(term52804, term52804.getClass(), "forwardDeclaredTypes", null);
        setField(term52804, term52804.getClass(), "typesIndexedByProperty", null);
        setField(term52804, term52804.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term52804, term52804.getClass(), "greatestSubtypeByProperty", null);
        setField(term52804, term52804.getClass(), "interfaceToImplementors", null);
        setField(term52804, term52804.getClass(), "unresolvedNamedTypes", null);
        setField(term52804, term52804.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term52804, term52804.getClass(), "lastGeneration", false);
        setField(term52804, term52804.getClass(), "templateTypes", null);
        setBooleanField(term52804, term52804.getClass(), "tolerateUndefinedValues", false);
        setField(term52804, term52804.getClass(), "resolveMode", null);
        setField(term52801, term52801.getClass(), "registry", term52804);
        setElement(term53503, 0, term52801);
        setBooleanField(term52807, term52807.getClass(), "resolved", false);
        setField(term52807, term52807.getClass(), "resolveResult", null);
        setBooleanField(term52807, term52807.getClass(), "inTemplatedCheckVisit", false);
        setField(term52807, term52807.getClass(), "registry", null);
        setElement(term53503, 1, term52807);
        setField(term53500, term53500.getClass(), "array", term53503);
        setField(term53500, term53500.getClass(), "asList", null);
        setField(term53499, term53499.getClass(), "alternates", term53500);
        setIntField(term53499, term53499.getClass(), "hashcode", -1202151925);
        setBooleanField(term53499, term53499.getClass(), "resolved", false);
        setField(term53499, term53499.getClass(), "resolveResult", null);
        setBooleanField(term53499, term53499.getClass(), "inTemplatedCheckVisit", false);
        setField(term53499, term53499.getClass(), "registry", term52804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term52363;
        args[1] = term52563;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term52363, term53507));
        assertTrue(recursiveEquals(term52563, term53509));
        assertTrue(recursiveEquals(retValue, term53499));
    }

};


