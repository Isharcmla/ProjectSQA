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
import java.util.LinkedList;

public class JSTypeRegistry_createParametersWithVarArgs_1102384667139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10013;
     Object term10086;
     Object term497843;
     Object term497855;
     Object term497837;

    public JSTypeRegistry_createParametersWithVarArgs_1102384667139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10015 = new HashMap();
        HashMap term10025 = new HashMap();
        Set<Object> term497856 =  ((Map) term10025).keySet();
        HashSet term10024 = new HashSet((Collection<? extends Object>) term497856);
        HashMap term10036 = new HashMap();
        Set<Object> term497857 =  ((Map) term10036).keySet();
        HashSet term10035 = new HashSet((Collection<? extends Object>) term497857);
        HashMap term10047 = new HashMap();
        Set<Object> term497858 =  ((Map) term10047).keySet();
        HashSet term10046 = new HashSet((Collection<? extends Object>) term497858);
        HashMap term10055 = new HashMap();
        HashMap term10070 = new HashMap();
        HashMap term10075 = new HashMap();
        term10013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10014 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term10013, term10013.getClass(), "reporter", null);
        setField(term10013, term10013.getClass(), "nativeTypes", term10014);
        setField(term10013, term10013.getClass(), "namesToTypes", term10015);
        setField(term10013, term10013.getClass(), "namespaces", term10024);
        setField(term10013, term10013.getClass(), "nonNullableTypeNames", term10035);
        setField(term10013, term10013.getClass(), "forwardDeclaredTypes", term10046);
        setField(term10013, term10013.getClass(), "typesIndexedByProperty", term10055);
        setField(term10013, term10013.getClass(), "eachRefTypeIndexedByProperty", term10070);
        setField(term10013, term10013.getClass(), "greatestSubtypeByProperty", term10075);
        setField(term10013, term10013.getClass(), "interfaceToImplementors", null);
        setField(term10013, term10013.getClass(), "unresolvedNamedTypes", null);
        setField(term10013, term10013.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10013, term10013.getClass(), "lastGeneration", false);
        setField(term10013, term10013.getClass(), "templateTypeName", null);
        setField(term10013, term10013.getClass(), "templateType", null);
        setBooleanField(term10013, term10013.getClass(), "tolerateUndefinedValues", false);
        setField(term10013, term10013.getClass(), "resolveMode", null);
        term10086 = new LinkedList();
        HashMap term497845 = new HashMap();
        HashMap term497847 = new HashMap();
        Set<Object> term497859 =  ((Map) term497847).keySet();
        HashSet term497846 = new HashSet((Collection<? extends Object>) term497859);
        HashMap term497849 = new HashMap();
        Set<Object> term497860 =  ((Map) term497849).keySet();
        HashSet term497848 = new HashSet((Collection<? extends Object>) term497860);
        HashMap term497851 = new HashMap();
        Set<Object> term497861 =  ((Map) term497851).keySet();
        HashSet term497850 = new HashSet((Collection<? extends Object>) term497861);
        HashMap term497852 = new HashMap();
        HashMap term497853 = new HashMap();
        HashMap term497854 = new HashMap();
        term497843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term497844 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term497843, term497843.getClass(), "reporter", null);
        setField(term497843, term497843.getClass(), "nativeTypes", term497844);
        setField(term497843, term497843.getClass(), "namesToTypes", term497845);
        setField(term497843, term497843.getClass(), "namespaces", term497846);
        setField(term497843, term497843.getClass(), "nonNullableTypeNames", term497848);
        setField(term497843, term497843.getClass(), "forwardDeclaredTypes", term497850);
        setField(term497843, term497843.getClass(), "typesIndexedByProperty", term497852);
        setField(term497843, term497843.getClass(), "eachRefTypeIndexedByProperty", term497853);
        setField(term497843, term497843.getClass(), "greatestSubtypeByProperty", term497854);
        setField(term497843, term497843.getClass(), "interfaceToImplementors", null);
        setField(term497843, term497843.getClass(), "unresolvedNamedTypes", null);
        setField(term497843, term497843.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term497843, term497843.getClass(), "lastGeneration", false);
        setField(term497843, term497843.getClass(), "templateTypeName", null);
        setField(term497843, term497843.getClass(), "templateType", null);
        setBooleanField(term497843, term497843.getClass(), "tolerateUndefinedValues", false);
        setField(term497843, term497843.getClass(), "resolveMode", null);
        term497855 = new LinkedList();
        term497837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term497837, term497837.getClass(), "type", 83);
        setField(term497837, term497837.getClass(), "next", null);
        setField(term497837, term497837.getClass(), "first", null);
        setField(term497837, term497837.getClass(), "last", null);
        setField(term497837, term497837.getClass(), "propListHead", null);
        setIntField(term497837, term497837.getClass(), "sourcePosition", -1);
        setField(term497837, term497837.getClass(), "jsType", null);
        setField(term497837, term497837.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10086;
        Object retValue = callMethod(klass, "createParametersWithVarArgs", argTypes, term10013, args);
        assertTrue(recursiveEquals(term10013, term497843));
        assertTrue(recursiveEquals(term10086, term497855));
        assertTrue(recursiveEquals(retValue, term497837));
    }

};


