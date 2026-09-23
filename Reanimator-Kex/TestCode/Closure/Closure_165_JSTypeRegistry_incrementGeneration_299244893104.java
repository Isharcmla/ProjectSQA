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

public class JSTypeRegistry_incrementGeneration_299244893104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3706;

    public JSTypeRegistry_incrementGeneration_299244893104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3708 = new HashMap();
        HashMap term3718 = new HashMap();
        Set<Object> term483730 =  ((Map) term3718).keySet();
        HashSet term3717 = new HashSet((Collection<? extends Object>) term483730);
        HashMap term3733 = new HashMap();
        Set<Object> term483731 =  ((Map) term3733).keySet();
        HashSet term3732 = new HashSet((Collection<? extends Object>) term483731);
        HashMap term3752 = new HashMap();
        Set<Object> term483732 =  ((Map) term3752).keySet();
        HashSet term3751 = new HashSet((Collection<? extends Object>) term483732);
        HashMap term3764 = new HashMap();
        HashMap term3779 = new HashMap();
        HashMap term3784 = new HashMap();
        term3706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3707 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term3706, term3706.getClass(), "reporter", null);
        setField(term3706, term3706.getClass(), "nativeTypes", term3707);
        setField(term3706, term3706.getClass(), "namesToTypes", term3708);
        setField(term3706, term3706.getClass(), "namespaces", term3717);
        setField(term3706, term3706.getClass(), "nonNullableTypeNames", term3732);
        setField(term3706, term3706.getClass(), "forwardDeclaredTypes", term3751);
        setField(term3706, term3706.getClass(), "typesIndexedByProperty", term3764);
        setField(term3706, term3706.getClass(), "eachRefTypeIndexedByProperty", term3779);
        setField(term3706, term3706.getClass(), "greatestSubtypeByProperty", term3784);
        setField(term3706, term3706.getClass(), "interfaceToImplementors", null);
        setField(term3706, term3706.getClass(), "unresolvedNamedTypes", null);
        setField(term3706, term3706.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3706, term3706.getClass(), "lastGeneration", false);
        setField(term3706, term3706.getClass(), "templateTypeName", null);
        setField(term3706, term3706.getClass(), "templateType", null);
        setBooleanField(term3706, term3706.getClass(), "tolerateUndefinedValues", false);
        setField(term3706, term3706.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "incrementGeneration", argTypes, term3706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


