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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_resetForTypeCheck_130105867289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767;

    public JSTypeRegistry_resetForTypeCheck_130105867289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term769 = new HashMap();
        HashMap term779 = new HashMap();
        Set<Object> term479660 =  ((Map) term779).keySet();
        HashSet term778 = new HashSet((Collection<? extends Object>) term479660);
        HashMap term800 = new HashMap();
        Set<Object> term479661 =  ((Map) term800).keySet();
        HashSet term799 = new HashSet((Collection<? extends Object>) term479661);
        HashMap term821 = new HashMap();
        Set<Object> term479662 =  ((Map) term821).keySet();
        HashSet term820 = new HashSet((Collection<? extends Object>) term479662);
        HashMap term841 = new HashMap();
        HashMap term856 = new HashMap();
        HashMap term861 = new HashMap();
        term767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term768 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term767, term767.getClass(), "reporter", null);
        setField(term767, term767.getClass(), "nativeTypes", term768);
        setField(term767, term767.getClass(), "namesToTypes", term769);
        setField(term767, term767.getClass(), "namespaces", term778);
        setField(term767, term767.getClass(), "nonNullableTypeNames", term799);
        setField(term767, term767.getClass(), "forwardDeclaredTypes", term820);
        setField(term767, term767.getClass(), "typesIndexedByProperty", term841);
        setField(term767, term767.getClass(), "eachRefTypeIndexedByProperty", term856);
        setField(term767, term767.getClass(), "greatestSubtypeByProperty", term861);
        setField(term767, term767.getClass(), "interfaceToImplementors", null);
        setField(term767, term767.getClass(), "unresolvedNamedTypes", null);
        setField(term767, term767.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term767, term767.getClass(), "lastGeneration", false);
        setField(term767, term767.getClass(), "templateTypeName", null);
        setField(term767, term767.getClass(), "templateType", null);
        setBooleanField(term767, term767.getClass(), "tolerateUndefinedValues", false);
        setField(term767, term767.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetForTypeCheck", argTypes, term767, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


