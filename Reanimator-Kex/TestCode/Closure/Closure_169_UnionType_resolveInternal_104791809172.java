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

public class UnionType_resolveInternal_104791809172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;

    public UnionType_resolveInternal_104791809172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2193 = new ArrayList();
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        ((ArrayList) term2193).add((Object)null);
        HashMap term2202 = new HashMap();
        HashMap term2211 = new HashMap();
        Set<Object> term11150 =  ((Map) term2211).keySet();
        HashSet term2210 = new HashSet((Collection<? extends Object>) term11150);
        HashMap term2218 = new HashMap();
        Set<Object> term11151 =  ((Map) term2218).keySet();
        HashSet term2217 = new HashSet((Collection<? extends Object>) term11151);
        HashMap term2225 = new HashMap();
        Set<Object> term11152 =  ((Map) term2225).keySet();
        HashSet term2224 = new HashSet((Collection<? extends Object>) term11152);
        HashMap term2231 = new HashMap();
        HashMap term2239 = new HashMap();
        HashMap term2244 = new HashMap();
        term2192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2201 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term2192, term2192.getClass(), "alternates", term2193);
        setIntField(term2192, term2192.getClass(), "hashcode", -1870495012);
        setBooleanField(term2192, term2192.getClass(), "resolved", false);
        setField(term2192, term2192.getClass(), "resolveResult", null);
        setBooleanField(term2192, term2192.getClass(), "inTemplatedCheckVisit", false);
        setField(term2200, term2200.getClass(), "reporter", null);
        setField(term2200, term2200.getClass(), "nativeTypes", term2201);
        setField(term2200, term2200.getClass(), "namesToTypes", term2202);
        setField(term2200, term2200.getClass(), "namespaces", term2210);
        setField(term2200, term2200.getClass(), "nonNullableTypeNames", term2217);
        setField(term2200, term2200.getClass(), "forwardDeclaredTypes", term2224);
        setField(term2200, term2200.getClass(), "typesIndexedByProperty", term2231);
        setField(term2200, term2200.getClass(), "eachRefTypeIndexedByProperty", term2239);
        setField(term2200, term2200.getClass(), "greatestSubtypeByProperty", term2244);
        setField(term2200, term2200.getClass(), "interfaceToImplementors", null);
        setField(term2200, term2200.getClass(), "unresolvedNamedTypes", null);
        setField(term2200, term2200.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2200, term2200.getClass(), "lastGeneration", false);
        setField(term2200, term2200.getClass(), "templateTypes", null);
        setBooleanField(term2200, term2200.getClass(), "tolerateUndefinedValues", false);
        setField(term2200, term2200.getClass(), "resolveMode", null);
        setField(term2192, term2192.getClass(), "registry", term2200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term2192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


