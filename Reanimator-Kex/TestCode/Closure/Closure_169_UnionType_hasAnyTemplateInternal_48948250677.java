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

public class UnionType_hasAnyTemplateInternal_48948250677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;

    public UnionType_hasAnyTemplateInternal_48948250677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2518 = new ArrayList();
        ((ArrayList) term2518).add((Object)null);
        ((ArrayList) term2518).add((Object)null);
        ((ArrayList) term2518).add((Object)null);
        ((ArrayList) term2518).add((Object)null);
        ((ArrayList) term2518).add((Object)null);
        ((ArrayList) term2518).add((Object)null);
        HashMap term2527 = new HashMap();
        HashMap term2536 = new HashMap();
        Set<Object> term12417 =  ((Map) term2536).keySet();
        HashSet term2535 = new HashSet((Collection<? extends Object>) term12417);
        HashMap term2542 = new HashMap();
        Set<Object> term12418 =  ((Map) term2542).keySet();
        HashSet term2541 = new HashSet((Collection<? extends Object>) term12418);
        HashMap term2549 = new HashMap();
        Set<Object> term12419 =  ((Map) term2549).keySet();
        HashSet term2548 = new HashSet((Collection<? extends Object>) term12419);
        HashMap term2555 = new HashMap();
        HashMap term2563 = new HashMap();
        HashMap term2568 = new HashMap();
        term2517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2526 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term2517, term2517.getClass(), "alternates", term2518);
        setIntField(term2517, term2517.getClass(), "hashcode", -1122880881);
        setBooleanField(term2517, term2517.getClass(), "resolved", false);
        setField(term2517, term2517.getClass(), "resolveResult", null);
        setBooleanField(term2517, term2517.getClass(), "inTemplatedCheckVisit", false);
        setField(term2525, term2525.getClass(), "reporter", null);
        setField(term2525, term2525.getClass(), "nativeTypes", term2526);
        setField(term2525, term2525.getClass(), "namesToTypes", term2527);
        setField(term2525, term2525.getClass(), "namespaces", term2535);
        setField(term2525, term2525.getClass(), "nonNullableTypeNames", term2541);
        setField(term2525, term2525.getClass(), "forwardDeclaredTypes", term2548);
        setField(term2525, term2525.getClass(), "typesIndexedByProperty", term2555);
        setField(term2525, term2525.getClass(), "eachRefTypeIndexedByProperty", term2563);
        setField(term2525, term2525.getClass(), "greatestSubtypeByProperty", term2568);
        setField(term2525, term2525.getClass(), "interfaceToImplementors", null);
        setField(term2525, term2525.getClass(), "unresolvedNamedTypes", null);
        setField(term2525, term2525.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2525, term2525.getClass(), "lastGeneration", false);
        setField(term2525, term2525.getClass(), "templateTypes", null);
        setBooleanField(term2525, term2525.getClass(), "tolerateUndefinedValues", false);
        setField(term2525, term2525.getClass(), "resolveMode", null);
        setField(term2517, term2517.getClass(), "registry", term2525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasAnyTemplateInternal", argTypes, term2517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


