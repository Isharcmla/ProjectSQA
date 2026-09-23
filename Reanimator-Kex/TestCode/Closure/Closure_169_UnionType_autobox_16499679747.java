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

public class UnionType_autobox_16499679747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478;

    public UnionType_autobox_16499679747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term479 = new ArrayList();
        ((ArrayList) term479).add((Object)null);
        HashMap term488 = new HashMap();
        HashMap term497 = new HashMap();
        Set<Object> term4731 =  ((Map) term497).keySet();
        HashSet term496 = new HashSet((Collection<? extends Object>) term4731);
        HashMap term504 = new HashMap();
        Set<Object> term4732 =  ((Map) term504).keySet();
        HashSet term503 = new HashSet((Collection<? extends Object>) term4732);
        HashMap term511 = new HashMap();
        Set<Object> term4733 =  ((Map) term511).keySet();
        HashSet term510 = new HashSet((Collection<? extends Object>) term4733);
        HashMap term517 = new HashMap();
        HashMap term525 = new HashMap();
        HashMap term530 = new HashMap();
        term478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term487 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term478, term478.getClass(), "alternates", term479);
        setIntField(term478, term478.getClass(), "hashcode", 579005622);
        setBooleanField(term478, term478.getClass(), "resolved", false);
        setField(term478, term478.getClass(), "resolveResult", null);
        setBooleanField(term478, term478.getClass(), "inTemplatedCheckVisit", true);
        setField(term486, term486.getClass(), "reporter", null);
        setField(term486, term486.getClass(), "nativeTypes", term487);
        setField(term486, term486.getClass(), "namesToTypes", term488);
        setField(term486, term486.getClass(), "namespaces", term496);
        setField(term486, term486.getClass(), "nonNullableTypeNames", term503);
        setField(term486, term486.getClass(), "forwardDeclaredTypes", term510);
        setField(term486, term486.getClass(), "typesIndexedByProperty", term517);
        setField(term486, term486.getClass(), "eachRefTypeIndexedByProperty", term525);
        setField(term486, term486.getClass(), "greatestSubtypeByProperty", term530);
        setField(term486, term486.getClass(), "interfaceToImplementors", null);
        setField(term486, term486.getClass(), "unresolvedNamedTypes", null);
        setField(term486, term486.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term486, term486.getClass(), "lastGeneration", false);
        setField(term486, term486.getClass(), "templateTypes", null);
        setBooleanField(term486, term486.getClass(), "tolerateUndefinedValues", false);
        setField(term486, term486.getClass(), "resolveMode", null);
        setField(term478, term478.getClass(), "registry", term486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "autobox", argTypes, term478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


