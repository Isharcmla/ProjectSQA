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
import java.lang.Boolean;

public class UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1800;
     Object term1862;

    public UnionType_getRestrictedTypeGivenToBooleanOutcome_192008012866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1801 = new ArrayList();
        ((ArrayList) term1801).add((Object)null);
        ((ArrayList) term1801).add((Object)null);
        ((ArrayList) term1801).add((Object)null);
        ((ArrayList) term1801).add((Object)null);
        ((ArrayList) term1801).add((Object)null);
        ((ArrayList) term1801).add((Object)null);
        HashMap term1810 = new HashMap();
        HashMap term1819 = new HashMap();
        Set<Object> term9231 =  ((Map) term1819).keySet();
        HashSet term1818 = new HashSet((Collection<? extends Object>) term9231);
        HashMap term1826 = new HashMap();
        Set<Object> term9232 =  ((Map) term1826).keySet();
        HashSet term1825 = new HashSet((Collection<? extends Object>) term9232);
        HashMap term1833 = new HashMap();
        Set<Object> term9233 =  ((Map) term1833).keySet();
        HashSet term1832 = new HashSet((Collection<? extends Object>) term9233);
        HashMap term1839 = new HashMap();
        HashMap term1847 = new HashMap();
        HashMap term1852 = new HashMap();
        term1800 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1809 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term1800, term1800.getClass(), "alternates", term1801);
        setIntField(term1800, term1800.getClass(), "hashcode", -2014576105);
        setBooleanField(term1800, term1800.getClass(), "resolved", true);
        setField(term1800, term1800.getClass(), "resolveResult", null);
        setBooleanField(term1800, term1800.getClass(), "inTemplatedCheckVisit", false);
        setField(term1808, term1808.getClass(), "reporter", null);
        setField(term1808, term1808.getClass(), "nativeTypes", term1809);
        setField(term1808, term1808.getClass(), "namesToTypes", term1810);
        setField(term1808, term1808.getClass(), "namespaces", term1818);
        setField(term1808, term1808.getClass(), "nonNullableTypeNames", term1825);
        setField(term1808, term1808.getClass(), "forwardDeclaredTypes", term1832);
        setField(term1808, term1808.getClass(), "typesIndexedByProperty", term1839);
        setField(term1808, term1808.getClass(), "eachRefTypeIndexedByProperty", term1847);
        setField(term1808, term1808.getClass(), "greatestSubtypeByProperty", term1852);
        setField(term1808, term1808.getClass(), "interfaceToImplementors", null);
        setField(term1808, term1808.getClass(), "unresolvedNamedTypes", null);
        setField(term1808, term1808.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1808, term1808.getClass(), "lastGeneration", false);
        setField(term1808, term1808.getClass(), "templateTypes", null);
        setBooleanField(term1808, term1808.getClass(), "tolerateUndefinedValues", false);
        setField(term1808, term1808.getClass(), "resolveMode", null);
        setField(term1800, term1800.getClass(), "registry", term1808);
        term1862 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1862;
        try {
            callMethod(klass, "getRestrictedTypeGivenToBooleanOutcome", argTypes, term1800, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


