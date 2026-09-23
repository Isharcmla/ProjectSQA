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

public class TypeValidator_setShouldReport_112809005155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term115;
     Object term10050;

    public TypeValidator_setShouldReport_112809005155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term63 = new HashMap();
        HashMap term72 = new HashMap();
        Set<Object> term10063 =  ((Map) term72).keySet();
        HashSet term71 = new HashSet((Collection<? extends Object>) term10063);
        HashMap term79 = new HashMap();
        Set<Object> term10064 =  ((Map) term79).keySet();
        HashSet term78 = new HashSet((Collection<? extends Object>) term10064);
        HashMap term85 = new HashMap();
        Set<Object> term10065 =  ((Map) term85).keySet();
        HashSet term84 = new HashSet((Collection<? extends Object>) term10065);
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
        setField(term61, term61.getClass(), "templateTypes", null);
        setBooleanField(term61, term61.getClass(), "tolerateUndefinedValues", false);
        setField(term61, term61.getClass(), "resolveMode", null);
        setField(term60, term60.getClass(), "typeRegistry", term61);
        setField(term60, term60.getClass(), "allValueTypes", null);
        setBooleanField(term60, term60.getClass(), "shouldReport", false);
        setField(term60, term60.getClass(), "nullOrUndefined", null);
        setField(term60, term60.getClass(), "mismatches", null);
        term115 = new Boolean(false);
        HashMap term10053 = new HashMap();
        HashMap term10055 = new HashMap();
        Set<Object> term10066 =  ((Map) term10055).keySet();
        HashSet term10054 = new HashSet((Collection<? extends Object>) term10066);
        HashMap term10057 = new HashMap();
        Set<Object> term10067 =  ((Map) term10057).keySet();
        HashSet term10056 = new HashSet((Collection<? extends Object>) term10067);
        HashMap term10059 = new HashMap();
        Set<Object> term10068 =  ((Map) term10059).keySet();
        HashSet term10058 = new HashSet((Collection<? extends Object>) term10068);
        HashMap term10060 = new HashMap();
        HashMap term10061 = new HashMap();
        HashMap term10062 = new HashMap();
        term10050 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10051 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10052 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term10050, term10050.getClass(), "compiler", null);
        setField(term10051, term10051.getClass(), "reporter", null);
        setField(term10051, term10051.getClass(), "nativeTypes", term10052);
        setField(term10051, term10051.getClass(), "namesToTypes", term10053);
        setField(term10051, term10051.getClass(), "namespaces", term10054);
        setField(term10051, term10051.getClass(), "nonNullableTypeNames", term10056);
        setField(term10051, term10051.getClass(), "forwardDeclaredTypes", term10058);
        setField(term10051, term10051.getClass(), "typesIndexedByProperty", term10060);
        setField(term10051, term10051.getClass(), "eachRefTypeIndexedByProperty", term10061);
        setField(term10051, term10051.getClass(), "greatestSubtypeByProperty", term10062);
        setField(term10051, term10051.getClass(), "interfaceToImplementors", null);
        setField(term10051, term10051.getClass(), "unresolvedNamedTypes", null);
        setField(term10051, term10051.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10051, term10051.getClass(), "lastGeneration", false);
        setField(term10051, term10051.getClass(), "templateTypes", null);
        setBooleanField(term10051, term10051.getClass(), "tolerateUndefinedValues", false);
        setField(term10051, term10051.getClass(), "resolveMode", null);
        setField(term10050, term10050.getClass(), "typeRegistry", term10051);
        setField(term10050, term10050.getClass(), "allValueTypes", null);
        setBooleanField(term10050, term10050.getClass(), "shouldReport", false);
        setField(term10050, term10050.getClass(), "nullOrUndefined", null);
        setField(term10050, term10050.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "setShouldReport", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term10050));
        assertTrue(recursiveEquals(term115, false));
    }

};


