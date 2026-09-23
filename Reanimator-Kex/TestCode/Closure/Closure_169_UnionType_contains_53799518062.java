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

public class UnionType_contains_53799518062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;

    public UnionType_contains_53799518062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1539 = new ArrayList();
        ((ArrayList) term1539).add((Object)null);
        ((ArrayList) term1539).add((Object)null);
        ((ArrayList) term1539).add((Object)null);
        HashMap term1548 = new HashMap();
        HashMap term1557 = new HashMap();
        Set<Object> term8234 =  ((Map) term1557).keySet();
        HashSet term1556 = new HashSet((Collection<? extends Object>) term8234);
        HashMap term1564 = new HashMap();
        Set<Object> term8235 =  ((Map) term1564).keySet();
        HashSet term1563 = new HashSet((Collection<? extends Object>) term8235);
        HashMap term1571 = new HashMap();
        Set<Object> term8236 =  ((Map) term1571).keySet();
        HashSet term1570 = new HashSet((Collection<? extends Object>) term8236);
        HashMap term1577 = new HashMap();
        HashMap term1585 = new HashMap();
        HashMap term1590 = new HashMap();
        term1538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1547 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term1538, term1538.getClass(), "alternates", term1539);
        setIntField(term1538, term1538.getClass(), "hashcode", 9726679);
        setBooleanField(term1538, term1538.getClass(), "resolved", true);
        setField(term1538, term1538.getClass(), "resolveResult", null);
        setBooleanField(term1538, term1538.getClass(), "inTemplatedCheckVisit", false);
        setField(term1546, term1546.getClass(), "reporter", null);
        setField(term1546, term1546.getClass(), "nativeTypes", term1547);
        setField(term1546, term1546.getClass(), "namesToTypes", term1548);
        setField(term1546, term1546.getClass(), "namespaces", term1556);
        setField(term1546, term1546.getClass(), "nonNullableTypeNames", term1563);
        setField(term1546, term1546.getClass(), "forwardDeclaredTypes", term1570);
        setField(term1546, term1546.getClass(), "typesIndexedByProperty", term1577);
        setField(term1546, term1546.getClass(), "eachRefTypeIndexedByProperty", term1585);
        setField(term1546, term1546.getClass(), "greatestSubtypeByProperty", term1590);
        setField(term1546, term1546.getClass(), "interfaceToImplementors", null);
        setField(term1546, term1546.getClass(), "unresolvedNamedTypes", null);
        setField(term1546, term1546.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1546, term1546.getClass(), "lastGeneration", false);
        setField(term1546, term1546.getClass(), "templateTypes", null);
        setBooleanField(term1546, term1546.getClass(), "tolerateUndefinedValues", false);
        setField(term1546, term1546.getClass(), "resolveMode", null);
        setField(term1538, term1538.getClass(), "registry", term1546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "contains", argTypes, term1538, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


