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

public class ArrowType_init_197700127916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term84;

    public ArrowType_init_197700127916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term13 = new HashMap();
        Set<Object> term1148 =  ((Map) term13).keySet();
        HashSet term12 = new HashSet((Collection<? extends Object>) term1148);
        HashMap term26 = new HashMap();
        Set<Object> term1149 =  ((Map) term26).keySet();
        HashSet term25 = new HashSet((Collection<? extends Object>) term1149);
        HashMap term39 = new HashMap();
        Set<Object> term1150 =  ((Map) term39).keySet();
        HashSet term38 = new HashSet((Collection<? extends Object>) term1150);
        HashMap term53 = new HashMap();
        HashMap term68 = new HashMap();
        HashMap term73 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        setField(term1, term1.getClass(), "reporter", null);
        setField(term1, term1.getClass(), "nativeTypes", term2);
        setField(term1, term1.getClass(), "namesToTypes", term3);
        setField(term1, term1.getClass(), "namespaces", term12);
        setField(term1, term1.getClass(), "nonNullableTypeNames", term25);
        setField(term1, term1.getClass(), "forwardDeclaredTypes", term38);
        setField(term1, term1.getClass(), "typesIndexedByProperty", term53);
        setField(term1, term1.getClass(), "eachRefTypeIndexedByProperty", term68);
        setField(term1, term1.getClass(), "greatestSubtypeByProperty", term73);
        setField(term1, term1.getClass(), "interfaceToImplementors", null);
        setField(term1, term1.getClass(), "unresolvedNamedTypes", null);
        setField(term1, term1.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1, term1.getClass(), "lastGeneration", false);
        setField(term1, term1.getClass(), "templateTypes", null);
        setBooleanField(term1, term1.getClass(), "tolerateUndefinedValues", false);
        setField(term1, term1.getClass(), "resolveMode", null);
        term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84, term84.getClass(), "type", -1955890973);
        setIntField(term86, term86.getClass(), "type", -2038273078);
        setIntField(term88, term88.getClass(), "type", 1227103734);
        setIntField(term90, term90.getClass(), "type", -1339778481);
        setIntField(term92, term92.getClass(), "type", 1725571209);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term90, term90.getClass(), "next", term92);
        setIntField(term95, term95.getClass(), "type", -522618178);
        setField(term95, term95.getClass(), "next", null);
        setField(term95, term95.getClass(), "first", null);
        setField(term95, term95.getClass(), "last", term92);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term90, term90.getClass(), "first", term95);
        setField(term90, term90.getClass(), "last", term88);
        setField(term90, term90.getClass(), "propListHead", null);
        setIntField(term90, term90.getClass(), "sourcePosition", 0);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term88, term88.getClass(), "next", term90);
        setField(term88, term88.getClass(), "first", term92);
        setIntField(term99, term99.getClass(), "type", -883034806);
        setIntField(term101, term101.getClass(), "type", 1585847225);
        setField(term101, term101.getClass(), "next", null);
        setField(term101, term101.getClass(), "first", term95);
        setField(term101, term101.getClass(), "last", term90);
        setField(term101, term101.getClass(), "propListHead", null);
        setIntField(term101, term101.getClass(), "sourcePosition", 0);
        setField(term101, term101.getClass(), "jsType", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term99, term99.getClass(), "next", term101);
        setField(term99, term99.getClass(), "first", term86);
        setField(term99, term99.getClass(), "last", term86);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term88, term88.getClass(), "last", term99);
        setField(term88, term88.getClass(), "propListHead", null);
        setIntField(term88, term88.getClass(), "sourcePosition", 0);
        setField(term88, term88.getClass(), "jsType", null);
        setField(term88, term88.getClass(), "parent", null);
        setField(term86, term86.getClass(), "next", term88);
        setIntField(term106, term106.getClass(), "type", 597278769);
        setField(term106, term106.getClass(), "next", term99);
        setField(term106, term106.getClass(), "first", term101);
        setField(term106, term106.getClass(), "last", term84);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        setField(term86, term86.getClass(), "first", term106);
        setField(term86, term86.getClass(), "last", term106);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term84, term84.getClass(), "next", term86);
        setField(term84, term84.getClass(), "first", term90);
        setField(term84, term84.getClass(), "last", term92);
        setField(term84, term84.getClass(), "propListHead", null);
        setIntField(term84, term84.getClass(), "sourcePosition", 0);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term84;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


