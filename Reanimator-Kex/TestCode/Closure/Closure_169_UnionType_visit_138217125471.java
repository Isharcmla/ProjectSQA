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

public class UnionType_visit_138217125471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;

    public UnionType_visit_138217125471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2128 = new ArrayList();
        HashMap term2137 = new HashMap();
        HashMap term2146 = new HashMap();
        Set<Object> term10829 =  ((Map) term2146).keySet();
        HashSet term2145 = new HashSet((Collection<? extends Object>) term10829);
        HashMap term2153 = new HashMap();
        Set<Object> term10830 =  ((Map) term2153).keySet();
        HashSet term2152 = new HashSet((Collection<? extends Object>) term10830);
        HashMap term2160 = new HashMap();
        Set<Object> term10831 =  ((Map) term2160).keySet();
        HashSet term2159 = new HashSet((Collection<? extends Object>) term10831);
        HashMap term2166 = new HashMap();
        HashMap term2174 = new HashMap();
        HashMap term2179 = new HashMap();
        term2127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term2135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2136 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term2127, term2127.getClass(), "alternates", term2128);
        setIntField(term2127, term2127.getClass(), "hashcode", 1152356969);
        setBooleanField(term2127, term2127.getClass(), "resolved", true);
        setField(term2127, term2127.getClass(), "resolveResult", null);
        setBooleanField(term2127, term2127.getClass(), "inTemplatedCheckVisit", false);
        setField(term2135, term2135.getClass(), "reporter", null);
        setField(term2135, term2135.getClass(), "nativeTypes", term2136);
        setField(term2135, term2135.getClass(), "namesToTypes", term2137);
        setField(term2135, term2135.getClass(), "namespaces", term2145);
        setField(term2135, term2135.getClass(), "nonNullableTypeNames", term2152);
        setField(term2135, term2135.getClass(), "forwardDeclaredTypes", term2159);
        setField(term2135, term2135.getClass(), "typesIndexedByProperty", term2166);
        setField(term2135, term2135.getClass(), "eachRefTypeIndexedByProperty", term2174);
        setField(term2135, term2135.getClass(), "greatestSubtypeByProperty", term2179);
        setField(term2135, term2135.getClass(), "interfaceToImplementors", null);
        setField(term2135, term2135.getClass(), "unresolvedNamedTypes", null);
        setField(term2135, term2135.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2135, term2135.getClass(), "lastGeneration", false);
        setField(term2135, term2135.getClass(), "templateTypes", null);
        setBooleanField(term2135, term2135.getClass(), "tolerateUndefinedValues", false);
        setField(term2135, term2135.getClass(), "resolveMode", null);
        setField(term2127, term2127.getClass(), "registry", term2135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "visit", argTypes, term2127, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


