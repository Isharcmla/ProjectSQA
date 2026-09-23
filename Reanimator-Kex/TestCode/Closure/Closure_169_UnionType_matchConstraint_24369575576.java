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

public class UnionType_matchConstraint_24369575576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2452;

    public UnionType_matchConstraint_24369575576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2453 = new ArrayList();
        ((ArrayList) term2453).add((Object)null);
        ((ArrayList) term2453).add((Object)null);
        ((ArrayList) term2453).add((Object)null);
        ((ArrayList) term2453).add((Object)null);
        HashMap term2462 = new HashMap();
        HashMap term2471 = new HashMap();
        Set<Object> term12165 =  ((Map) term2471).keySet();
        HashSet term2470 = new HashSet((Collection<? extends Object>) term12165);
        HashMap term2478 = new HashMap();
        Set<Object> term12166 =  ((Map) term2478).keySet();
        HashSet term2477 = new HashSet((Collection<? extends Object>) term12166);
        HashMap term2485 = new HashMap();
        Set<Object> term12167 =  ((Map) term2485).keySet();
        HashSet term2484 = new HashSet((Collection<? extends Object>) term12167);
        HashMap term2491 = new HashMap();
        HashMap term2499 = new HashMap();
        HashMap term2504 = new HashMap();
        term2452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2461 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2452, term2452.getClass(), "alternates", term2453);
        setIntField(term2452, term2452.getClass(), "hashcode", -1476644457);
        setBooleanField(term2452, term2452.getClass(), "resolved", true);
        setField(term2452, term2452.getClass(), "resolveResult", null);
        setBooleanField(term2452, term2452.getClass(), "inTemplatedCheckVisit", true);
        setField(term2460, term2460.getClass(), "reporter", null);
        setField(term2460, term2460.getClass(), "nativeTypes", term2461);
        setField(term2460, term2460.getClass(), "namesToTypes", term2462);
        setField(term2460, term2460.getClass(), "namespaces", term2470);
        setField(term2460, term2460.getClass(), "nonNullableTypeNames", term2477);
        setField(term2460, term2460.getClass(), "forwardDeclaredTypes", term2484);
        setField(term2460, term2460.getClass(), "typesIndexedByProperty", term2491);
        setField(term2460, term2460.getClass(), "eachRefTypeIndexedByProperty", term2499);
        setField(term2460, term2460.getClass(), "greatestSubtypeByProperty", term2504);
        setField(term2460, term2460.getClass(), "interfaceToImplementors", null);
        setField(term2460, term2460.getClass(), "unresolvedNamedTypes", null);
        setField(term2460, term2460.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2460, term2460.getClass(), "lastGeneration", false);
        setField(term2460, term2460.getClass(), "templateTypes", null);
        setBooleanField(term2460, term2460.getClass(), "tolerateUndefinedValues", false);
        setField(term2460, term2460.getClass(), "resolveMode", null);
        setField(term2452, term2452.getClass(), "registry", term2460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConstraint", argTypes, term2452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


