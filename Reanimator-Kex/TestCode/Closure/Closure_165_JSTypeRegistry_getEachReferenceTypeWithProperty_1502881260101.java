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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_getEachReferenceTypeWithProperty_1502881260101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3490;
     Object term482837;
     Object term482458;

    public JSTypeRegistry_getEachReferenceTypeWithProperty_1502881260101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3492 = new HashMap();
        HashMap term3502 = new HashMap();
        Set<Object> term482851 =  ((Map) term3502).keySet();
        HashSet term3501 = new HashSet((Collection<? extends Object>) term482851);
        HashMap term3517 = new HashMap();
        Set<Object> term482852 =  ((Map) term3517).keySet();
        HashSet term3516 = new HashSet((Collection<? extends Object>) term482852);
        HashMap term3534 = new HashMap();
        Set<Object> term482853 =  ((Map) term3534).keySet();
        HashSet term3533 = new HashSet((Collection<? extends Object>) term482853);
        HashMap term3554 = new HashMap();
        HashMap term3569 = new HashMap();
        HashMap term3574 = new HashMap();
        term3490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3491 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term3490, term3490.getClass(), "reporter", null);
        setField(term3490, term3490.getClass(), "nativeTypes", term3491);
        setField(term3490, term3490.getClass(), "namesToTypes", term3492);
        setField(term3490, term3490.getClass(), "namespaces", term3501);
        setField(term3490, term3490.getClass(), "nonNullableTypeNames", term3516);
        setField(term3490, term3490.getClass(), "forwardDeclaredTypes", term3533);
        setField(term3490, term3490.getClass(), "typesIndexedByProperty", term3554);
        setField(term3490, term3490.getClass(), "eachRefTypeIndexedByProperty", term3569);
        setField(term3490, term3490.getClass(), "greatestSubtypeByProperty", term3574);
        setField(term3490, term3490.getClass(), "interfaceToImplementors", null);
        setField(term3490, term3490.getClass(), "unresolvedNamedTypes", null);
        setField(term3490, term3490.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3490, term3490.getClass(), "lastGeneration", false);
        setField(term3490, term3490.getClass(), "templateTypeName", null);
        setField(term3490, term3490.getClass(), "templateType", null);
        setBooleanField(term3490, term3490.getClass(), "tolerateUndefinedValues", false);
        setField(term3490, term3490.getClass(), "resolveMode", null);
        HashMap term482839 = new HashMap();
        HashMap term482841 = new HashMap();
        Set<Object> term482867 =  ((Map) term482841).keySet();
        HashSet term482840 = new HashSet((Collection<? extends Object>) term482867);
        HashMap term482843 = new HashMap();
        Set<Object> term482868 =  ((Map) term482843).keySet();
        HashSet term482842 = new HashSet((Collection<? extends Object>) term482868);
        HashMap term482845 = new HashMap();
        Set<Object> term482869 =  ((Map) term482845).keySet();
        HashSet term482844 = new HashSet((Collection<? extends Object>) term482869);
        HashMap term482846 = new HashMap();
        HashMap term482847 = new HashMap();
        HashMap term482848 = new HashMap();
        term482837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term482838 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term482837, term482837.getClass(), "reporter", null);
        setField(term482837, term482837.getClass(), "nativeTypes", term482838);
        setField(term482837, term482837.getClass(), "namesToTypes", term482839);
        setField(term482837, term482837.getClass(), "namespaces", term482840);
        setField(term482837, term482837.getClass(), "nonNullableTypeNames", term482842);
        setField(term482837, term482837.getClass(), "forwardDeclaredTypes", term482844);
        setField(term482837, term482837.getClass(), "typesIndexedByProperty", term482846);
        setField(term482837, term482837.getClass(), "eachRefTypeIndexedByProperty", term482847);
        setField(term482837, term482837.getClass(), "greatestSubtypeByProperty", term482848);
        setField(term482837, term482837.getClass(), "interfaceToImplementors", null);
        setField(term482837, term482837.getClass(), "unresolvedNamedTypes", null);
        setField(term482837, term482837.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term482837, term482837.getClass(), "lastGeneration", false);
        setField(term482837, term482837.getClass(), "templateTypeName", null);
        setField(term482837, term482837.getClass(), "templateType", null);
        setBooleanField(term482837, term482837.getClass(), "tolerateUndefinedValues", false);
        setField(term482837, term482837.getClass(), "resolveMode", null);
        term482458 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableList"));
        setField(term482458, term482458.getClass(), "asList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VZwkkQktrm";
        Object retValue = callMethod(klass, "getEachReferenceTypeWithProperty", argTypes, term3490, args);
        assertTrue(recursiveEquals(term3490, term482837));
        assertTrue(recursiveEquals(retValue, term482458));
    }

};


