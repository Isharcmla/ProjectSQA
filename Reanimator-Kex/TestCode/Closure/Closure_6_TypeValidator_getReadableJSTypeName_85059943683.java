package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class TypeValidator_getReadableJSTypeName_85059943683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8386;
     Object term8442;
     Object term8469;

    public TypeValidator_getReadableJSTypeName_85059943683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8389 = new HashMap();
        HashMap term8398 = new HashMap();
        Set<Object> term19613 =  ((Map) term8398).keySet();
        HashSet term8397 = new HashSet((Collection<? extends Object>) term19613);
        HashMap term8405 = new HashMap();
        Set<Object> term19614 =  ((Map) term8405).keySet();
        HashSet term8404 = new HashSet((Collection<? extends Object>) term19614);
        HashMap term8412 = new HashMap();
        Set<Object> term19615 =  ((Map) term8412).keySet();
        HashSet term8411 = new HashSet((Collection<? extends Object>) term19615);
        HashMap term8418 = new HashMap();
        HashMap term8426 = new HashMap();
        HashMap term8431 = new HashMap();
        term8386 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term8387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8388 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term8386, term8386.getClass(), "compiler", null);
        setField(term8387, term8387.getClass(), "reporter", null);
        setField(term8387, term8387.getClass(), "nativeTypes", term8388);
        setField(term8387, term8387.getClass(), "namesToTypes", term8389);
        setField(term8387, term8387.getClass(), "namespaces", term8397);
        setField(term8387, term8387.getClass(), "nonNullableTypeNames", term8404);
        setField(term8387, term8387.getClass(), "forwardDeclaredTypes", term8411);
        setField(term8387, term8387.getClass(), "typesIndexedByProperty", term8418);
        setField(term8387, term8387.getClass(), "eachRefTypeIndexedByProperty", term8426);
        setField(term8387, term8387.getClass(), "greatestSubtypeByProperty", term8431);
        setField(term8387, term8387.getClass(), "interfaceToImplementors", null);
        setField(term8387, term8387.getClass(), "unresolvedNamedTypes", null);
        setField(term8387, term8387.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8387, term8387.getClass(), "lastGeneration", false);
        setField(term8387, term8387.getClass(), "templateTypes", null);
        setBooleanField(term8387, term8387.getClass(), "tolerateUndefinedValues", false);
        setField(term8387, term8387.getClass(), "resolveMode", null);
        setField(term8386, term8386.getClass(), "typeRegistry", term8387);
        setField(term8386, term8386.getClass(), "allValueTypes", null);
        setBooleanField(term8386, term8386.getClass(), "shouldReport", false);
        setField(term8386, term8386.getClass(), "nullOrUndefined", null);
        setField(term8386, term8386.getClass(), "mismatches", null);
        term8442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8442, term8442.getClass(), "type", 1131398807);
        setIntField(term8444, term8444.getClass(), "type", -344907703);
        setIntField(term8446, term8446.getClass(), "type", 824341437);
        setIntField(term8448, term8448.getClass(), "type", -1794965320);
        setIntField(term8450, term8450.getClass(), "type", 520504102);
        setField(term8450, term8450.getClass(), "next", null);
        setField(term8450, term8450.getClass(), "first", null);
        setField(term8450, term8450.getClass(), "last", null);
        setField(term8450, term8450.getClass(), "propListHead", null);
        setIntField(term8450, term8450.getClass(), "sourcePosition", 0);
        setField(term8450, term8450.getClass(), "jsType", null);
        setField(term8450, term8450.getClass(), "parent", null);
        setField(term8448, term8448.getClass(), "next", term8450);
        setIntField(term8453, term8453.getClass(), "type", -457396133);
        setField(term8453, term8453.getClass(), "next", null);
        setField(term8453, term8453.getClass(), "first", null);
        setField(term8453, term8453.getClass(), "last", term8450);
        setField(term8453, term8453.getClass(), "propListHead", null);
        setIntField(term8453, term8453.getClass(), "sourcePosition", 0);
        setField(term8453, term8453.getClass(), "jsType", null);
        setField(term8453, term8453.getClass(), "parent", null);
        setField(term8448, term8448.getClass(), "first", term8453);
        setField(term8448, term8448.getClass(), "last", term8446);
        setField(term8448, term8448.getClass(), "propListHead", null);
        setIntField(term8448, term8448.getClass(), "sourcePosition", 0);
        setField(term8448, term8448.getClass(), "jsType", null);
        setField(term8448, term8448.getClass(), "parent", null);
        setField(term8446, term8446.getClass(), "next", term8448);
        setField(term8446, term8446.getClass(), "first", term8450);
        setIntField(term8457, term8457.getClass(), "type", 1091954101);
        setIntField(term8459, term8459.getClass(), "type", 1895143076);
        setField(term8459, term8459.getClass(), "next", null);
        setField(term8459, term8459.getClass(), "first", term8453);
        setField(term8459, term8459.getClass(), "last", term8448);
        setField(term8459, term8459.getClass(), "propListHead", null);
        setIntField(term8459, term8459.getClass(), "sourcePosition", 0);
        setField(term8459, term8459.getClass(), "jsType", null);
        setField(term8459, term8459.getClass(), "parent", null);
        setField(term8457, term8457.getClass(), "next", term8459);
        setField(term8457, term8457.getClass(), "first", term8444);
        setField(term8457, term8457.getClass(), "last", term8444);
        setField(term8457, term8457.getClass(), "propListHead", null);
        setIntField(term8457, term8457.getClass(), "sourcePosition", 0);
        setField(term8457, term8457.getClass(), "jsType", null);
        setField(term8457, term8457.getClass(), "parent", null);
        setField(term8446, term8446.getClass(), "last", term8457);
        setField(term8446, term8446.getClass(), "propListHead", null);
        setIntField(term8446, term8446.getClass(), "sourcePosition", 0);
        setField(term8446, term8446.getClass(), "jsType", null);
        setField(term8446, term8446.getClass(), "parent", null);
        setField(term8444, term8444.getClass(), "next", term8446);
        setIntField(term8464, term8464.getClass(), "type", 1981860404);
        setField(term8464, term8464.getClass(), "next", term8457);
        setField(term8464, term8464.getClass(), "first", term8459);
        setField(term8464, term8464.getClass(), "last", term8442);
        setField(term8464, term8464.getClass(), "propListHead", null);
        setIntField(term8464, term8464.getClass(), "sourcePosition", 0);
        setField(term8464, term8464.getClass(), "jsType", null);
        setField(term8464, term8464.getClass(), "parent", null);
        setField(term8444, term8444.getClass(), "first", term8464);
        setField(term8444, term8444.getClass(), "last", term8464);
        setField(term8444, term8444.getClass(), "propListHead", null);
        setIntField(term8444, term8444.getClass(), "sourcePosition", 0);
        setField(term8444, term8444.getClass(), "jsType", null);
        setField(term8444, term8444.getClass(), "parent", null);
        setField(term8442, term8442.getClass(), "next", term8444);
        setField(term8442, term8442.getClass(), "first", term8448);
        setField(term8442, term8442.getClass(), "last", term8450);
        setField(term8442, term8442.getClass(), "propListHead", null);
        setIntField(term8442, term8442.getClass(), "sourcePosition", 0);
        setField(term8442, term8442.getClass(), "jsType", null);
        setField(term8442, term8442.getClass(), "parent", null);
        term8469 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term8442;
        args[1] = term8469;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term8386, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


