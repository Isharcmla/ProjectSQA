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

public class JSTypeRegistry_createFunctionType_590137951130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9210;
     Object term9295;

    public JSTypeRegistry_createFunctionType_590137951130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9212 = new HashMap();
        HashMap term9222 = new HashMap();
        Set<Object> term493070 =  ((Map) term9222).keySet();
        HashSet term9221 = new HashSet((Collection<? extends Object>) term493070);
        HashMap term9233 = new HashMap();
        Set<Object> term493071 =  ((Map) term9233).keySet();
        HashSet term9232 = new HashSet((Collection<? extends Object>) term493071);
        HashMap term9250 = new HashMap();
        Set<Object> term493072 =  ((Map) term9250).keySet();
        HashSet term9249 = new HashSet((Collection<? extends Object>) term493072);
        HashMap term9264 = new HashMap();
        HashMap term9279 = new HashMap();
        HashMap term9284 = new HashMap();
        term9210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9211 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term9210, term9210.getClass(), "reporter", null);
        setField(term9210, term9210.getClass(), "nativeTypes", term9211);
        setField(term9210, term9210.getClass(), "namesToTypes", term9212);
        setField(term9210, term9210.getClass(), "namespaces", term9221);
        setField(term9210, term9210.getClass(), "nonNullableTypeNames", term9232);
        setField(term9210, term9210.getClass(), "forwardDeclaredTypes", term9249);
        setField(term9210, term9210.getClass(), "typesIndexedByProperty", term9264);
        setField(term9210, term9210.getClass(), "eachRefTypeIndexedByProperty", term9279);
        setField(term9210, term9210.getClass(), "greatestSubtypeByProperty", term9284);
        setField(term9210, term9210.getClass(), "interfaceToImplementors", null);
        setField(term9210, term9210.getClass(), "unresolvedNamedTypes", null);
        setField(term9210, term9210.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9210, term9210.getClass(), "lastGeneration", false);
        setField(term9210, term9210.getClass(), "templateTypeName", null);
        setField(term9210, term9210.getClass(), "templateType", null);
        setBooleanField(term9210, term9210.getClass(), "tolerateUndefinedValues", false);
        setField(term9210, term9210.getClass(), "resolveMode", null);
        term9295 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9295;
        try {
            callMethod(klass, "createFunctionType", argTypes, term9210, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


