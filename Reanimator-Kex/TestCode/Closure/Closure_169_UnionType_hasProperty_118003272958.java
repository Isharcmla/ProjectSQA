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

public class UnionType_hasProperty_118003272958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1257;

    public UnionType_hasProperty_118003272958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1258 = new ArrayList();
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        ((ArrayList) term1258).add((Object)null);
        HashMap term1267 = new HashMap();
        HashMap term1276 = new HashMap();
        Set<Object> term7577 =  ((Map) term1276).keySet();
        HashSet term1275 = new HashSet((Collection<? extends Object>) term7577);
        HashMap term1283 = new HashMap();
        Set<Object> term7578 =  ((Map) term1283).keySet();
        HashSet term1282 = new HashSet((Collection<? extends Object>) term7578);
        HashMap term1290 = new HashMap();
        Set<Object> term7579 =  ((Map) term1290).keySet();
        HashSet term1289 = new HashSet((Collection<? extends Object>) term7579);
        HashMap term1296 = new HashMap();
        HashMap term1304 = new HashMap();
        HashMap term1309 = new HashMap();
        term1257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1266 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1257, term1257.getClass(), "alternates", term1258);
        setIntField(term1257, term1257.getClass(), "hashcode", 1386130016);
        setBooleanField(term1257, term1257.getClass(), "resolved", false);
        setField(term1257, term1257.getClass(), "resolveResult", null);
        setBooleanField(term1257, term1257.getClass(), "inTemplatedCheckVisit", true);
        setField(term1265, term1265.getClass(), "reporter", null);
        setField(term1265, term1265.getClass(), "nativeTypes", term1266);
        setField(term1265, term1265.getClass(), "namesToTypes", term1267);
        setField(term1265, term1265.getClass(), "namespaces", term1275);
        setField(term1265, term1265.getClass(), "nonNullableTypeNames", term1282);
        setField(term1265, term1265.getClass(), "forwardDeclaredTypes", term1289);
        setField(term1265, term1265.getClass(), "typesIndexedByProperty", term1296);
        setField(term1265, term1265.getClass(), "eachRefTypeIndexedByProperty", term1304);
        setField(term1265, term1265.getClass(), "greatestSubtypeByProperty", term1309);
        setField(term1265, term1265.getClass(), "interfaceToImplementors", null);
        setField(term1265, term1265.getClass(), "unresolvedNamedTypes", null);
        setField(term1265, term1265.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1265, term1265.getClass(), "lastGeneration", false);
        setField(term1265, term1265.getClass(), "templateTypes", null);
        setBooleanField(term1265, term1265.getClass(), "tolerateUndefinedValues", false);
        setField(term1265, term1265.getClass(), "resolveMode", null);
        setField(term1257, term1257.getClass(), "registry", term1265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PTEndmPMzk";
        try {
            callMethod(klass, "hasProperty", argTypes, term1257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


