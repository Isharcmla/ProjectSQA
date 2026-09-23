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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_setValidator_46351893474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2322;

    public UnionType_setValidator_46351893474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2323 = new ArrayList();
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        HashMap term2332 = new HashMap();
        HashMap term2341 = new HashMap();
        Set<Object> term11661 =  ((Map) term2341).keySet();
        HashSet term2340 = new HashSet((Collection<? extends Object>) term11661);
        HashMap term2348 = new HashMap();
        Set<Object> term11662 =  ((Map) term2348).keySet();
        HashSet term2347 = new HashSet((Collection<? extends Object>) term11662);
        HashMap term2355 = new HashMap();
        Set<Object> term11663 =  ((Map) term2355).keySet();
        HashSet term2354 = new HashSet((Collection<? extends Object>) term11663);
        HashMap term2361 = new HashMap();
        HashMap term2369 = new HashMap();
        HashMap term2374 = new HashMap();
        term2322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2331 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term2322, term2322.getClass(), "alternates", term2323);
        setIntField(term2322, term2322.getClass(), "hashcode", -916584829);
        setBooleanField(term2322, term2322.getClass(), "resolved", false);
        setField(term2322, term2322.getClass(), "resolveResult", null);
        setBooleanField(term2322, term2322.getClass(), "inTemplatedCheckVisit", true);
        setField(term2330, term2330.getClass(), "reporter", null);
        setField(term2330, term2330.getClass(), "nativeTypes", term2331);
        setField(term2330, term2330.getClass(), "namesToTypes", term2332);
        setField(term2330, term2330.getClass(), "namespaces", term2340);
        setField(term2330, term2330.getClass(), "nonNullableTypeNames", term2347);
        setField(term2330, term2330.getClass(), "forwardDeclaredTypes", term2354);
        setField(term2330, term2330.getClass(), "typesIndexedByProperty", term2361);
        setField(term2330, term2330.getClass(), "eachRefTypeIndexedByProperty", term2369);
        setField(term2330, term2330.getClass(), "greatestSubtypeByProperty", term2374);
        setField(term2330, term2330.getClass(), "interfaceToImplementors", null);
        setField(term2330, term2330.getClass(), "unresolvedNamedTypes", null);
        setField(term2330, term2330.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2330, term2330.getClass(), "lastGeneration", false);
        setField(term2330, term2330.getClass(), "templateTypes", null);
        setBooleanField(term2330, term2330.getClass(), "tolerateUndefinedValues", false);
        setField(term2330, term2330.getClass(), "resolveMode", null);
        setField(term2322, term2322.getClass(), "registry", term2330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setValidator", argTypes, term2322, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


