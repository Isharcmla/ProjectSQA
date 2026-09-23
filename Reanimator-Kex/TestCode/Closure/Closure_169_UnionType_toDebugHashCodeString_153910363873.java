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

public class UnionType_toDebugHashCodeString_153910363873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2257;

    public UnionType_toDebugHashCodeString_153910363873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2258 = new ArrayList();
        ((ArrayList) term2258).add((Object)null);
        ((ArrayList) term2258).add((Object)null);
        ((ArrayList) term2258).add((Object)null);
        ((ArrayList) term2258).add((Object)null);
        ((ArrayList) term2258).add((Object)null);
        HashMap term2267 = new HashMap();
        HashMap term2276 = new HashMap();
        Set<Object> term11409 =  ((Map) term2276).keySet();
        HashSet term2275 = new HashSet((Collection<? extends Object>) term11409);
        HashMap term2283 = new HashMap();
        Set<Object> term11410 =  ((Map) term2283).keySet();
        HashSet term2282 = new HashSet((Collection<? extends Object>) term11410);
        HashMap term2290 = new HashMap();
        Set<Object> term11411 =  ((Map) term2290).keySet();
        HashSet term2289 = new HashSet((Collection<? extends Object>) term11411);
        HashMap term2296 = new HashMap();
        HashMap term2304 = new HashMap();
        HashMap term2309 = new HashMap();
        term2257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2266 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term2257, term2257.getClass(), "alternates", term2258);
        setIntField(term2257, term2257.getClass(), "hashcode", -1347358701);
        setBooleanField(term2257, term2257.getClass(), "resolved", true);
        setField(term2257, term2257.getClass(), "resolveResult", null);
        setBooleanField(term2257, term2257.getClass(), "inTemplatedCheckVisit", true);
        setField(term2265, term2265.getClass(), "reporter", null);
        setField(term2265, term2265.getClass(), "nativeTypes", term2266);
        setField(term2265, term2265.getClass(), "namesToTypes", term2267);
        setField(term2265, term2265.getClass(), "namespaces", term2275);
        setField(term2265, term2265.getClass(), "nonNullableTypeNames", term2282);
        setField(term2265, term2265.getClass(), "forwardDeclaredTypes", term2289);
        setField(term2265, term2265.getClass(), "typesIndexedByProperty", term2296);
        setField(term2265, term2265.getClass(), "eachRefTypeIndexedByProperty", term2304);
        setField(term2265, term2265.getClass(), "greatestSubtypeByProperty", term2309);
        setField(term2265, term2265.getClass(), "interfaceToImplementors", null);
        setField(term2265, term2265.getClass(), "unresolvedNamedTypes", null);
        setField(term2265, term2265.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2265, term2265.getClass(), "lastGeneration", false);
        setField(term2265, term2265.getClass(), "templateTypes", null);
        setBooleanField(term2265, term2265.getClass(), "tolerateUndefinedValues", false);
        setField(term2265, term2265.getClass(), "resolveMode", null);
        setField(term2257, term2257.getClass(), "registry", term2265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toDebugHashCodeString", argTypes, term2257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


