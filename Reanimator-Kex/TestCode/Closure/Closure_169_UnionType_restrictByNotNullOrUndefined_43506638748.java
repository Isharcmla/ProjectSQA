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

public class UnionType_restrictByNotNullOrUndefined_43506638748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public UnionType_restrictByNotNullOrUndefined_43506638748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term544 = new ArrayList();
        ((ArrayList) term544).add((Object)null);
        ((ArrayList) term544).add((Object)null);
        ((ArrayList) term544).add((Object)null);
        ((ArrayList) term544).add((Object)null);
        HashMap term553 = new HashMap();
        HashMap term562 = new HashMap();
        Set<Object> term5040 =  ((Map) term562).keySet();
        HashSet term561 = new HashSet((Collection<? extends Object>) term5040);
        HashMap term568 = new HashMap();
        Set<Object> term5041 =  ((Map) term568).keySet();
        HashSet term567 = new HashSet((Collection<? extends Object>) term5041);
        HashMap term575 = new HashMap();
        Set<Object> term5042 =  ((Map) term575).keySet();
        HashSet term574 = new HashSet((Collection<? extends Object>) term5042);
        HashMap term581 = new HashMap();
        HashMap term589 = new HashMap();
        HashMap term594 = new HashMap();
        term543 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term552 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term543, term543.getClass(), "alternates", term544);
        setIntField(term543, term543.getClass(), "hashcode", -1048298087);
        setBooleanField(term543, term543.getClass(), "resolved", false);
        setField(term543, term543.getClass(), "resolveResult", null);
        setBooleanField(term543, term543.getClass(), "inTemplatedCheckVisit", false);
        setField(term551, term551.getClass(), "reporter", null);
        setField(term551, term551.getClass(), "nativeTypes", term552);
        setField(term551, term551.getClass(), "namesToTypes", term553);
        setField(term551, term551.getClass(), "namespaces", term561);
        setField(term551, term551.getClass(), "nonNullableTypeNames", term567);
        setField(term551, term551.getClass(), "forwardDeclaredTypes", term574);
        setField(term551, term551.getClass(), "typesIndexedByProperty", term581);
        setField(term551, term551.getClass(), "eachRefTypeIndexedByProperty", term589);
        setField(term551, term551.getClass(), "greatestSubtypeByProperty", term594);
        setField(term551, term551.getClass(), "interfaceToImplementors", null);
        setField(term551, term551.getClass(), "unresolvedNamedTypes", null);
        setField(term551, term551.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term551, term551.getClass(), "lastGeneration", false);
        setField(term551, term551.getClass(), "templateTypes", null);
        setBooleanField(term551, term551.getClass(), "tolerateUndefinedValues", false);
        setField(term551, term551.getClass(), "resolveMode", null);
        setField(term543, term543.getClass(), "registry", term551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "restrictByNotNullOrUndefined", argTypes, term543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


