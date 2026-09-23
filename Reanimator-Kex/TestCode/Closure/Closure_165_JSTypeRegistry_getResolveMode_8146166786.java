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

public class JSTypeRegistry_getResolveMode_8146166786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;
     Object term479159;

    public JSTypeRegistry_getResolveMode_8146166786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term494 = new HashMap();
        HashMap term504 = new HashMap();
        Set<Object> term479171 =  ((Map) term504).keySet();
        HashSet term503 = new HashSet((Collection<? extends Object>) term479171);
        HashMap term510 = new HashMap();
        Set<Object> term479172 =  ((Map) term510).keySet();
        HashSet term509 = new HashSet((Collection<? extends Object>) term479172);
        HashMap term521 = new HashMap();
        Set<Object> term479173 =  ((Map) term521).keySet();
        HashSet term520 = new HashSet((Collection<? extends Object>) term479173);
        HashMap term543 = new HashMap();
        HashMap term558 = new HashMap();
        HashMap term563 = new HashMap();
        term492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term493 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term492, term492.getClass(), "reporter", null);
        setField(term492, term492.getClass(), "nativeTypes", term493);
        setField(term492, term492.getClass(), "namesToTypes", term494);
        setField(term492, term492.getClass(), "namespaces", term503);
        setField(term492, term492.getClass(), "nonNullableTypeNames", term509);
        setField(term492, term492.getClass(), "forwardDeclaredTypes", term520);
        setField(term492, term492.getClass(), "typesIndexedByProperty", term543);
        setField(term492, term492.getClass(), "eachRefTypeIndexedByProperty", term558);
        setField(term492, term492.getClass(), "greatestSubtypeByProperty", term563);
        setField(term492, term492.getClass(), "interfaceToImplementors", null);
        setField(term492, term492.getClass(), "unresolvedNamedTypes", null);
        setField(term492, term492.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term492, term492.getClass(), "lastGeneration", false);
        setField(term492, term492.getClass(), "templateTypeName", null);
        setField(term492, term492.getClass(), "templateType", null);
        setBooleanField(term492, term492.getClass(), "tolerateUndefinedValues", false);
        setField(term492, term492.getClass(), "resolveMode", null);
        HashMap term479161 = new HashMap();
        HashMap term479163 = new HashMap();
        Set<Object> term479174 =  ((Map) term479163).keySet();
        HashSet term479162 = new HashSet((Collection<? extends Object>) term479174);
        HashMap term479165 = new HashMap();
        Set<Object> term479175 =  ((Map) term479165).keySet();
        HashSet term479164 = new HashSet((Collection<? extends Object>) term479175);
        HashMap term479167 = new HashMap();
        Set<Object> term479176 =  ((Map) term479167).keySet();
        HashSet term479166 = new HashSet((Collection<? extends Object>) term479176);
        HashMap term479168 = new HashMap();
        HashMap term479169 = new HashMap();
        HashMap term479170 = new HashMap();
        term479159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term479160 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term479159, term479159.getClass(), "reporter", null);
        setField(term479159, term479159.getClass(), "nativeTypes", term479160);
        setField(term479159, term479159.getClass(), "namesToTypes", term479161);
        setField(term479159, term479159.getClass(), "namespaces", term479162);
        setField(term479159, term479159.getClass(), "nonNullableTypeNames", term479164);
        setField(term479159, term479159.getClass(), "forwardDeclaredTypes", term479166);
        setField(term479159, term479159.getClass(), "typesIndexedByProperty", term479168);
        setField(term479159, term479159.getClass(), "eachRefTypeIndexedByProperty", term479169);
        setField(term479159, term479159.getClass(), "greatestSubtypeByProperty", term479170);
        setField(term479159, term479159.getClass(), "interfaceToImplementors", null);
        setField(term479159, term479159.getClass(), "unresolvedNamedTypes", null);
        setField(term479159, term479159.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term479159, term479159.getClass(), "lastGeneration", false);
        setField(term479159, term479159.getClass(), "templateTypeName", null);
        setField(term479159, term479159.getClass(), "templateType", null);
        setBooleanField(term479159, term479159.getClass(), "tolerateUndefinedValues", false);
        setField(term479159, term479159.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getResolveMode", argTypes, term492, args);
        assertTrue(recursiveEquals(term492, term479159));
        assertTrue(recursiveEquals(retValue, null));
    }

};


