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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_canAssignTo_140138721745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;
     Object term4151;

    public UnionType_canAssignTo_140138721745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term349 = new ArrayList();
        HashMap term358 = new HashMap();
        HashMap term367 = new HashMap();
        Set<Object> term4167 =  ((Map) term367).keySet();
        HashSet term366 = new HashSet((Collection<? extends Object>) term4167);
        HashMap term374 = new HashMap();
        Set<Object> term4168 =  ((Map) term374).keySet();
        HashSet term373 = new HashSet((Collection<? extends Object>) term4168);
        HashMap term381 = new HashMap();
        Set<Object> term4169 =  ((Map) term381).keySet();
        HashSet term380 = new HashSet((Collection<? extends Object>) term4169);
        HashMap term387 = new HashMap();
        HashMap term395 = new HashMap();
        HashMap term400 = new HashMap();
        term348 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term357 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term348, term348.getClass(), "alternates", term349);
        setIntField(term348, term348.getClass(), "hashcode", -1530420153);
        setBooleanField(term348, term348.getClass(), "resolved", true);
        setField(term348, term348.getClass(), "resolveResult", null);
        setBooleanField(term348, term348.getClass(), "inTemplatedCheckVisit", false);
        setField(term356, term356.getClass(), "reporter", null);
        setField(term356, term356.getClass(), "nativeTypes", term357);
        setField(term356, term356.getClass(), "namesToTypes", term358);
        setField(term356, term356.getClass(), "namespaces", term366);
        setField(term356, term356.getClass(), "nonNullableTypeNames", term373);
        setField(term356, term356.getClass(), "forwardDeclaredTypes", term380);
        setField(term356, term356.getClass(), "typesIndexedByProperty", term387);
        setField(term356, term356.getClass(), "eachRefTypeIndexedByProperty", term395);
        setField(term356, term356.getClass(), "greatestSubtypeByProperty", term400);
        setField(term356, term356.getClass(), "interfaceToImplementors", null);
        setField(term356, term356.getClass(), "unresolvedNamedTypes", null);
        setField(term356, term356.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term356, term356.getClass(), "lastGeneration", false);
        setField(term356, term356.getClass(), "templateTypes", null);
        setBooleanField(term356, term356.getClass(), "tolerateUndefinedValues", false);
        setField(term356, term356.getClass(), "resolveMode", null);
        setField(term348, term348.getClass(), "registry", term356);
        ArrayList term4152 = new ArrayList();
        HashMap term4156 = new HashMap();
        HashMap term4158 = new HashMap();
        Set<Object> term4170 =  ((Map) term4158).keySet();
        HashSet term4157 = new HashSet((Collection<? extends Object>) term4170);
        HashMap term4160 = new HashMap();
        Set<Object> term4171 =  ((Map) term4160).keySet();
        HashSet term4159 = new HashSet((Collection<? extends Object>) term4171);
        HashMap term4162 = new HashMap();
        Set<Object> term4172 =  ((Map) term4162).keySet();
        HashSet term4161 = new HashSet((Collection<? extends Object>) term4172);
        HashMap term4163 = new HashMap();
        HashMap term4164 = new HashMap();
        HashMap term4165 = new HashMap();
        term4151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term4154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4155 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term4151, term4151.getClass(), "alternates", term4152);
        setIntField(term4151, term4151.getClass(), "hashcode", -1530420153);
        setBooleanField(term4151, term4151.getClass(), "resolved", true);
        setField(term4151, term4151.getClass(), "resolveResult", null);
        setBooleanField(term4151, term4151.getClass(), "inTemplatedCheckVisit", false);
        setField(term4154, term4154.getClass(), "reporter", null);
        setField(term4154, term4154.getClass(), "nativeTypes", term4155);
        setField(term4154, term4154.getClass(), "namesToTypes", term4156);
        setField(term4154, term4154.getClass(), "namespaces", term4157);
        setField(term4154, term4154.getClass(), "nonNullableTypeNames", term4159);
        setField(term4154, term4154.getClass(), "forwardDeclaredTypes", term4161);
        setField(term4154, term4154.getClass(), "typesIndexedByProperty", term4163);
        setField(term4154, term4154.getClass(), "eachRefTypeIndexedByProperty", term4164);
        setField(term4154, term4154.getClass(), "greatestSubtypeByProperty", term4165);
        setField(term4154, term4154.getClass(), "interfaceToImplementors", null);
        setField(term4154, term4154.getClass(), "unresolvedNamedTypes", null);
        setField(term4154, term4154.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4154, term4154.getClass(), "lastGeneration", false);
        setField(term4154, term4154.getClass(), "templateTypes", null);
        setBooleanField(term4154, term4154.getClass(), "tolerateUndefinedValues", false);
        setField(term4154, term4154.getClass(), "resolveMode", null);
        setField(term4151, term4151.getClass(), "registry", term4154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "canAssignTo", argTypes, term348, args);
        assertTrue(recursiveEquals(term348, term4151));
        assertTrue(recursiveEquals(retValue, true));
    }

};


