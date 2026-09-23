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

public class UnionType_collapseUnion_140470301775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2387;

    public UnionType_collapseUnion_140470301775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2388 = new ArrayList();
        ((ArrayList) term2388).add((Object)null);
        ((ArrayList) term2388).add((Object)null);
        HashMap term2397 = new HashMap();
        HashMap term2406 = new HashMap();
        Set<Object> term11913 =  ((Map) term2406).keySet();
        HashSet term2405 = new HashSet((Collection<? extends Object>) term11913);
        HashMap term2413 = new HashMap();
        Set<Object> term11914 =  ((Map) term2413).keySet();
        HashSet term2412 = new HashSet((Collection<? extends Object>) term11914);
        HashMap term2420 = new HashMap();
        Set<Object> term11915 =  ((Map) term2420).keySet();
        HashSet term2419 = new HashSet((Collection<? extends Object>) term11915);
        HashMap term2426 = new HashMap();
        HashMap term2434 = new HashMap();
        HashMap term2439 = new HashMap();
        term2387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2396 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term2387, term2387.getClass(), "alternates", term2388);
        setIntField(term2387, term2387.getClass(), "hashcode", -159494544);
        setBooleanField(term2387, term2387.getClass(), "resolved", true);
        setField(term2387, term2387.getClass(), "resolveResult", null);
        setBooleanField(term2387, term2387.getClass(), "inTemplatedCheckVisit", true);
        setField(term2395, term2395.getClass(), "reporter", null);
        setField(term2395, term2395.getClass(), "nativeTypes", term2396);
        setField(term2395, term2395.getClass(), "namesToTypes", term2397);
        setField(term2395, term2395.getClass(), "namespaces", term2405);
        setField(term2395, term2395.getClass(), "nonNullableTypeNames", term2412);
        setField(term2395, term2395.getClass(), "forwardDeclaredTypes", term2419);
        setField(term2395, term2395.getClass(), "typesIndexedByProperty", term2426);
        setField(term2395, term2395.getClass(), "eachRefTypeIndexedByProperty", term2434);
        setField(term2395, term2395.getClass(), "greatestSubtypeByProperty", term2439);
        setField(term2395, term2395.getClass(), "interfaceToImplementors", null);
        setField(term2395, term2395.getClass(), "unresolvedNamedTypes", null);
        setField(term2395, term2395.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2395, term2395.getClass(), "lastGeneration", false);
        setField(term2395, term2395.getClass(), "templateTypes", null);
        setBooleanField(term2395, term2395.getClass(), "tolerateUndefinedValues", false);
        setField(term2395, term2395.getClass(), "resolveMode", null);
        setField(term2387, term2387.getClass(), "registry", term2395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "collapseUnion", argTypes, term2387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


