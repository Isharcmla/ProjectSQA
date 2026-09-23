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

public class UnionType_isObject_86608015061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1473;

    public UnionType_isObject_86608015061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1474 = new ArrayList();
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        HashMap term1483 = new HashMap();
        HashMap term1492 = new HashMap();
        Set<Object> term7982 =  ((Map) term1492).keySet();
        HashSet term1491 = new HashSet((Collection<? extends Object>) term7982);
        HashMap term1499 = new HashMap();
        Set<Object> term7983 =  ((Map) term1499).keySet();
        HashSet term1498 = new HashSet((Collection<? extends Object>) term7983);
        HashMap term1506 = new HashMap();
        Set<Object> term7984 =  ((Map) term1506).keySet();
        HashSet term1505 = new HashSet((Collection<? extends Object>) term7984);
        HashMap term1512 = new HashMap();
        HashMap term1520 = new HashMap();
        HashMap term1525 = new HashMap();
        term1473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1482 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1473, term1473.getClass(), "alternates", term1474);
        setIntField(term1473, term1473.getClass(), "hashcode", -2015048153);
        setBooleanField(term1473, term1473.getClass(), "resolved", true);
        setField(term1473, term1473.getClass(), "resolveResult", null);
        setBooleanField(term1473, term1473.getClass(), "inTemplatedCheckVisit", false);
        setField(term1481, term1481.getClass(), "reporter", null);
        setField(term1481, term1481.getClass(), "nativeTypes", term1482);
        setField(term1481, term1481.getClass(), "namesToTypes", term1483);
        setField(term1481, term1481.getClass(), "namespaces", term1491);
        setField(term1481, term1481.getClass(), "nonNullableTypeNames", term1498);
        setField(term1481, term1481.getClass(), "forwardDeclaredTypes", term1505);
        setField(term1481, term1481.getClass(), "typesIndexedByProperty", term1512);
        setField(term1481, term1481.getClass(), "eachRefTypeIndexedByProperty", term1520);
        setField(term1481, term1481.getClass(), "greatestSubtypeByProperty", term1525);
        setField(term1481, term1481.getClass(), "interfaceToImplementors", null);
        setField(term1481, term1481.getClass(), "unresolvedNamedTypes", null);
        setField(term1481, term1481.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1481, term1481.getClass(), "lastGeneration", false);
        setField(term1481, term1481.getClass(), "templateTypes", null);
        setBooleanField(term1481, term1481.getClass(), "tolerateUndefinedValues", false);
        setField(term1481, term1481.getClass(), "resolveMode", null);
        setField(term1473, term1473.getClass(), "registry", term1481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isObject", argTypes, term1473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


