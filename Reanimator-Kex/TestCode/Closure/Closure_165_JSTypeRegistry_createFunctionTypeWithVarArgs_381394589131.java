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
import java.util.LinkedList;

public class JSTypeRegistry_createFunctionTypeWithVarArgs_381394589131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9299;
     Object term9373;

    public JSTypeRegistry_createFunctionTypeWithVarArgs_381394589131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9301 = new HashMap();
        HashMap term9311 = new HashMap();
        Set<Object> term493632 =  ((Map) term9311).keySet();
        HashSet term9310 = new HashSet((Collection<? extends Object>) term493632);
        HashMap term9322 = new HashMap();
        Set<Object> term493633 =  ((Map) term9322).keySet();
        HashSet term9321 = new HashSet((Collection<? extends Object>) term493633);
        HashMap term9328 = new HashMap();
        Set<Object> term493634 =  ((Map) term9328).keySet();
        HashSet term9327 = new HashSet((Collection<? extends Object>) term493634);
        HashMap term9342 = new HashMap();
        HashMap term9357 = new HashMap();
        HashMap term9362 = new HashMap();
        term9299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9300 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term9299, term9299.getClass(), "reporter", null);
        setField(term9299, term9299.getClass(), "nativeTypes", term9300);
        setField(term9299, term9299.getClass(), "namesToTypes", term9301);
        setField(term9299, term9299.getClass(), "namespaces", term9310);
        setField(term9299, term9299.getClass(), "nonNullableTypeNames", term9321);
        setField(term9299, term9299.getClass(), "forwardDeclaredTypes", term9327);
        setField(term9299, term9299.getClass(), "typesIndexedByProperty", term9342);
        setField(term9299, term9299.getClass(), "eachRefTypeIndexedByProperty", term9357);
        setField(term9299, term9299.getClass(), "greatestSubtypeByProperty", term9362);
        setField(term9299, term9299.getClass(), "interfaceToImplementors", null);
        setField(term9299, term9299.getClass(), "unresolvedNamedTypes", null);
        setField(term9299, term9299.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9299, term9299.getClass(), "lastGeneration", false);
        setField(term9299, term9299.getClass(), "templateTypeName", null);
        setField(term9299, term9299.getClass(), "templateType", null);
        setBooleanField(term9299, term9299.getClass(), "tolerateUndefinedValues", false);
        setField(term9299, term9299.getClass(), "resolveMode", null);
        term9373 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9373;
        try {
            callMethod(klass, "createFunctionTypeWithVarArgs", argTypes, term9299, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


