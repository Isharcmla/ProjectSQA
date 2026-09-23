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

public class TypeValidator_containsForwardDeclaredUnresolvedName_5404634445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;

    public TypeValidator_containsForwardDeclaredUnresolvedName_5404634445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1580 = new HashMap();
        HashMap term1589 = new HashMap();
        Set<Object> term9820 =  ((Map) term1589).keySet();
        HashSet term1588 = new HashSet((Collection<? extends Object>) term9820);
        HashMap term1596 = new HashMap();
        Set<Object> term9821 =  ((Map) term1596).keySet();
        HashSet term1595 = new HashSet((Collection<? extends Object>) term9821);
        HashMap term1603 = new HashMap();
        Set<Object> term9822 =  ((Map) term1603).keySet();
        HashSet term1602 = new HashSet((Collection<? extends Object>) term9822);
        HashMap term1608 = new HashMap();
        HashMap term1616 = new HashMap();
        HashMap term1621 = new HashMap();
        term1577 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1579 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1577, term1577.getClass(), "compiler", null);
        setField(term1578, term1578.getClass(), "reporter", null);
        setField(term1578, term1578.getClass(), "nativeTypes", term1579);
        setField(term1578, term1578.getClass(), "namesToTypes", term1580);
        setField(term1578, term1578.getClass(), "namespaces", term1588);
        setField(term1578, term1578.getClass(), "nonNullableTypeNames", term1595);
        setField(term1578, term1578.getClass(), "forwardDeclaredTypes", term1602);
        setField(term1578, term1578.getClass(), "typesIndexedByProperty", term1608);
        setField(term1578, term1578.getClass(), "eachRefTypeIndexedByProperty", term1616);
        setField(term1578, term1578.getClass(), "greatestSubtypeByProperty", term1621);
        setField(term1578, term1578.getClass(), "interfaceToImplementors", null);
        setField(term1578, term1578.getClass(), "unresolvedNamedTypes", null);
        setField(term1578, term1578.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1578, term1578.getClass(), "lastGeneration", false);
        setField(term1578, term1578.getClass(), "templateTypeName", null);
        setField(term1578, term1578.getClass(), "templateType", null);
        setBooleanField(term1578, term1578.getClass(), "tolerateUndefinedValues", false);
        setField(term1578, term1578.getClass(), "resolveMode", null);
        setField(term1577, term1577.getClass(), "typeRegistry", term1578);
        setField(term1577, term1577.getClass(), "allValueTypes", null);
        setBooleanField(term1577, term1577.getClass(), "shouldReport", false);
        setField(term1577, term1577.getClass(), "nullOrUndefined", null);
        setField(term1577, term1577.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term1577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


