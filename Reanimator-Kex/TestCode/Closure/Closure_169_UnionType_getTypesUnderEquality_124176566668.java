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

public class UnionType_getTypesUnderEquality_124176566668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1932;

    public UnionType_getTypesUnderEquality_124176566668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1933 = new ArrayList();
        ((ArrayList) term1933).add((Object)null);
        ((ArrayList) term1933).add((Object)null);
        HashMap term1942 = new HashMap();
        HashMap term1951 = new HashMap();
        Set<Object> term9848 =  ((Map) term1951).keySet();
        HashSet term1950 = new HashSet((Collection<? extends Object>) term9848);
        HashMap term1958 = new HashMap();
        Set<Object> term9849 =  ((Map) term1958).keySet();
        HashSet term1957 = new HashSet((Collection<? extends Object>) term9849);
        HashMap term1965 = new HashMap();
        Set<Object> term9850 =  ((Map) term1965).keySet();
        HashSet term1964 = new HashSet((Collection<? extends Object>) term9850);
        HashMap term1971 = new HashMap();
        HashMap term1979 = new HashMap();
        HashMap term1984 = new HashMap();
        term1932 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1941 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term1932, term1932.getClass(), "alternates", term1933);
        setIntField(term1932, term1932.getClass(), "hashcode", 1557431527);
        setBooleanField(term1932, term1932.getClass(), "resolved", false);
        setField(term1932, term1932.getClass(), "resolveResult", null);
        setBooleanField(term1932, term1932.getClass(), "inTemplatedCheckVisit", false);
        setField(term1940, term1940.getClass(), "reporter", null);
        setField(term1940, term1940.getClass(), "nativeTypes", term1941);
        setField(term1940, term1940.getClass(), "namesToTypes", term1942);
        setField(term1940, term1940.getClass(), "namespaces", term1950);
        setField(term1940, term1940.getClass(), "nonNullableTypeNames", term1957);
        setField(term1940, term1940.getClass(), "forwardDeclaredTypes", term1964);
        setField(term1940, term1940.getClass(), "typesIndexedByProperty", term1971);
        setField(term1940, term1940.getClass(), "eachRefTypeIndexedByProperty", term1979);
        setField(term1940, term1940.getClass(), "greatestSubtypeByProperty", term1984);
        setField(term1940, term1940.getClass(), "interfaceToImplementors", null);
        setField(term1940, term1940.getClass(), "unresolvedNamedTypes", null);
        setField(term1940, term1940.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1940, term1940.getClass(), "lastGeneration", false);
        setField(term1940, term1940.getClass(), "templateTypes", null);
        setBooleanField(term1940, term1940.getClass(), "tolerateUndefinedValues", false);
        setField(term1940, term1940.getClass(), "resolveMode", null);
        setField(term1932, term1932.getClass(), "registry", term1940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTypesUnderEquality", argTypes, term1932, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


