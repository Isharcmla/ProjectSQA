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

public class UnionType_meet_86406138655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;

    public UnionType_meet_86406138655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term996 = new ArrayList();
        ((ArrayList) term996).add((Object)null);
        ((ArrayList) term996).add((Object)null);
        HashMap term1005 = new HashMap();
        HashMap term1014 = new HashMap();
        Set<Object> term6816 =  ((Map) term1014).keySet();
        HashSet term1013 = new HashSet((Collection<? extends Object>) term6816);
        HashMap term1021 = new HashMap();
        Set<Object> term6817 =  ((Map) term1021).keySet();
        HashSet term1020 = new HashSet((Collection<? extends Object>) term6817);
        HashMap term1028 = new HashMap();
        Set<Object> term6818 =  ((Map) term1028).keySet();
        HashSet term1027 = new HashSet((Collection<? extends Object>) term6818);
        HashMap term1034 = new HashMap();
        HashMap term1042 = new HashMap();
        HashMap term1047 = new HashMap();
        term995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1004 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term995, term995.getClass(), "alternates", term996);
        setIntField(term995, term995.getClass(), "hashcode", -1034506028);
        setBooleanField(term995, term995.getClass(), "resolved", true);
        setField(term995, term995.getClass(), "resolveResult", null);
        setBooleanField(term995, term995.getClass(), "inTemplatedCheckVisit", true);
        setField(term1003, term1003.getClass(), "reporter", null);
        setField(term1003, term1003.getClass(), "nativeTypes", term1004);
        setField(term1003, term1003.getClass(), "namesToTypes", term1005);
        setField(term1003, term1003.getClass(), "namespaces", term1013);
        setField(term1003, term1003.getClass(), "nonNullableTypeNames", term1020);
        setField(term1003, term1003.getClass(), "forwardDeclaredTypes", term1027);
        setField(term1003, term1003.getClass(), "typesIndexedByProperty", term1034);
        setField(term1003, term1003.getClass(), "eachRefTypeIndexedByProperty", term1042);
        setField(term1003, term1003.getClass(), "greatestSubtypeByProperty", term1047);
        setField(term1003, term1003.getClass(), "interfaceToImplementors", null);
        setField(term1003, term1003.getClass(), "unresolvedNamedTypes", null);
        setField(term1003, term1003.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1003, term1003.getClass(), "lastGeneration", false);
        setField(term1003, term1003.getClass(), "templateTypes", null);
        setBooleanField(term1003, term1003.getClass(), "tolerateUndefinedValues", false);
        setField(term1003, term1003.getClass(), "resolveMode", null);
        setField(term995, term995.getClass(), "registry", term1003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "meet", argTypes, term995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


