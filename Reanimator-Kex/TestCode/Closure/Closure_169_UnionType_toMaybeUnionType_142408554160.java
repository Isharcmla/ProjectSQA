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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_toMaybeUnionType_142408554160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;
     Object term7712;

    public UnionType_toMaybeUnionType_142408554160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1409 = new ArrayList();
        ((ArrayList) term1409).add((Object)null);
        ((ArrayList) term1409).add((Object)null);
        ((ArrayList) term1409).add((Object)null);
        ((ArrayList) term1409).add((Object)null);
        HashMap term1418 = new HashMap();
        HashMap term1427 = new HashMap();
        Set<Object> term7727 =  ((Map) term1427).keySet();
        HashSet term1426 = new HashSet((Collection<? extends Object>) term7727);
        HashMap term1434 = new HashMap();
        Set<Object> term7728 =  ((Map) term1434).keySet();
        HashSet term1433 = new HashSet((Collection<? extends Object>) term7728);
        HashMap term1441 = new HashMap();
        Set<Object> term7729 =  ((Map) term1441).keySet();
        HashSet term1440 = new HashSet((Collection<? extends Object>) term7729);
        HashMap term1447 = new HashMap();
        HashMap term1455 = new HashMap();
        HashMap term1460 = new HashMap();
        term1408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1417 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term1408, term1408.getClass(), "alternates", term1409);
        setIntField(term1408, term1408.getClass(), "hashcode", 96566506);
        setBooleanField(term1408, term1408.getClass(), "resolved", true);
        setField(term1408, term1408.getClass(), "resolveResult", null);
        setBooleanField(term1408, term1408.getClass(), "inTemplatedCheckVisit", false);
        setField(term1416, term1416.getClass(), "reporter", null);
        setField(term1416, term1416.getClass(), "nativeTypes", term1417);
        setField(term1416, term1416.getClass(), "namesToTypes", term1418);
        setField(term1416, term1416.getClass(), "namespaces", term1426);
        setField(term1416, term1416.getClass(), "nonNullableTypeNames", term1433);
        setField(term1416, term1416.getClass(), "forwardDeclaredTypes", term1440);
        setField(term1416, term1416.getClass(), "typesIndexedByProperty", term1447);
        setField(term1416, term1416.getClass(), "eachRefTypeIndexedByProperty", term1455);
        setField(term1416, term1416.getClass(), "greatestSubtypeByProperty", term1460);
        setField(term1416, term1416.getClass(), "interfaceToImplementors", null);
        setField(term1416, term1416.getClass(), "unresolvedNamedTypes", null);
        setField(term1416, term1416.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1416, term1416.getClass(), "lastGeneration", false);
        setField(term1416, term1416.getClass(), "templateTypes", null);
        setBooleanField(term1416, term1416.getClass(), "tolerateUndefinedValues", false);
        setField(term1416, term1416.getClass(), "resolveMode", null);
        setField(term1408, term1408.getClass(), "registry", term1416);
        ArrayList term7713 = new ArrayList();
        ((ArrayList) term7713).add((Object)null);
        ((ArrayList) term7713).add((Object)null);
        ((ArrayList) term7713).add((Object)null);
        ((ArrayList) term7713).add((Object)null);
        HashMap term7717 = new HashMap();
        HashMap term7719 = new HashMap();
        Set<Object> term7730 =  ((Map) term7719).keySet();
        HashSet term7718 = new HashSet((Collection<? extends Object>) term7730);
        HashMap term7721 = new HashMap();
        Set<Object> term7731 =  ((Map) term7721).keySet();
        HashSet term7720 = new HashSet((Collection<? extends Object>) term7731);
        HashMap term7723 = new HashMap();
        Set<Object> term7732 =  ((Map) term7723).keySet();
        HashSet term7722 = new HashSet((Collection<? extends Object>) term7732);
        HashMap term7724 = new HashMap();
        HashMap term7725 = new HashMap();
        HashMap term7726 = new HashMap();
        term7712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term7715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7716 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term7712, term7712.getClass(), "alternates", term7713);
        setIntField(term7712, term7712.getClass(), "hashcode", 96566506);
        setBooleanField(term7712, term7712.getClass(), "resolved", true);
        setField(term7712, term7712.getClass(), "resolveResult", null);
        setBooleanField(term7712, term7712.getClass(), "inTemplatedCheckVisit", false);
        setField(term7715, term7715.getClass(), "reporter", null);
        setField(term7715, term7715.getClass(), "nativeTypes", term7716);
        setField(term7715, term7715.getClass(), "namesToTypes", term7717);
        setField(term7715, term7715.getClass(), "namespaces", term7718);
        setField(term7715, term7715.getClass(), "nonNullableTypeNames", term7720);
        setField(term7715, term7715.getClass(), "forwardDeclaredTypes", term7722);
        setField(term7715, term7715.getClass(), "typesIndexedByProperty", term7724);
        setField(term7715, term7715.getClass(), "eachRefTypeIndexedByProperty", term7725);
        setField(term7715, term7715.getClass(), "greatestSubtypeByProperty", term7726);
        setField(term7715, term7715.getClass(), "interfaceToImplementors", null);
        setField(term7715, term7715.getClass(), "unresolvedNamedTypes", null);
        setField(term7715, term7715.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7715, term7715.getClass(), "lastGeneration", false);
        setField(term7715, term7715.getClass(), "templateTypes", null);
        setBooleanField(term7715, term7715.getClass(), "tolerateUndefinedValues", false);
        setField(term7715, term7715.getClass(), "resolveMode", null);
        setField(term7712, term7712.getClass(), "registry", term7715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMaybeUnionType", argTypes, term1408, args);
        assertTrue(recursiveEquals(term1408, term7712));
    }

};


