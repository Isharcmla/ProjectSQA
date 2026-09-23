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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createOptionalParameters_33001523142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10292;
     Object term10376;

    public JSTypeRegistry_createOptionalParameters_33001523142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10294 = new HashMap();
        HashMap term10304 = new HashMap();
        Set<Object> term500109 =  ((Map) term10304).keySet();
        HashSet term10303 = new HashSet((Collection<? extends Object>) term500109);
        HashMap term10310 = new HashMap();
        Set<Object> term500110 =  ((Map) term10310).keySet();
        HashSet term10309 = new HashSet((Collection<? extends Object>) term500110);
        HashMap term10327 = new HashMap();
        Set<Object> term500111 =  ((Map) term10327).keySet();
        HashSet term10326 = new HashSet((Collection<? extends Object>) term500111);
        HashMap term10345 = new HashMap();
        HashMap term10360 = new HashMap();
        HashMap term10365 = new HashMap();
        term10292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10293 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term10292, term10292.getClass(), "reporter", null);
        setField(term10292, term10292.getClass(), "nativeTypes", term10293);
        setField(term10292, term10292.getClass(), "namesToTypes", term10294);
        setField(term10292, term10292.getClass(), "namespaces", term10303);
        setField(term10292, term10292.getClass(), "nonNullableTypeNames", term10309);
        setField(term10292, term10292.getClass(), "forwardDeclaredTypes", term10326);
        setField(term10292, term10292.getClass(), "typesIndexedByProperty", term10345);
        setField(term10292, term10292.getClass(), "eachRefTypeIndexedByProperty", term10360);
        setField(term10292, term10292.getClass(), "greatestSubtypeByProperty", term10365);
        setField(term10292, term10292.getClass(), "interfaceToImplementors", null);
        setField(term10292, term10292.getClass(), "unresolvedNamedTypes", null);
        setField(term10292, term10292.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10292, term10292.getClass(), "lastGeneration", false);
        setField(term10292, term10292.getClass(), "templateTypeName", null);
        setField(term10292, term10292.getClass(), "templateType", null);
        setBooleanField(term10292, term10292.getClass(), "tolerateUndefinedValues", false);
        setField(term10292, term10292.getClass(), "resolveMode", null);
        term10376 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10376;
        try {
            callMethod(klass, "createOptionalParameters", argTypes, term10292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


