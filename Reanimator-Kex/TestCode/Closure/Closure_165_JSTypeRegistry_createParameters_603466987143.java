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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class JSTypeRegistry_createParameters_603466987143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10380;
     Object term10459;
     Object term10461;
     Object term501071;
     Object term501083;
     Object term501044;

    public JSTypeRegistry_createParameters_603466987143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10382 = new HashMap();
        HashMap term10392 = new HashMap();
        Set<Object> term501084 =  ((Map) term10392).keySet();
        HashSet term10391 = new HashSet((Collection<? extends Object>) term501084);
        HashMap term10405 = new HashMap();
        Set<Object> term501085 =  ((Map) term10405).keySet();
        HashSet term10404 = new HashSet((Collection<? extends Object>) term501085);
        HashMap term10414 = new HashMap();
        Set<Object> term501086 =  ((Map) term10414).keySet();
        HashSet term10413 = new HashSet((Collection<? extends Object>) term501086);
        HashMap term10428 = new HashMap();
        HashMap term10443 = new HashMap();
        HashMap term10448 = new HashMap();
        term10380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10381 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term10380, term10380.getClass(), "reporter", null);
        setField(term10380, term10380.getClass(), "nativeTypes", term10381);
        setField(term10380, term10380.getClass(), "namesToTypes", term10382);
        setField(term10380, term10380.getClass(), "namespaces", term10391);
        setField(term10380, term10380.getClass(), "nonNullableTypeNames", term10404);
        setField(term10380, term10380.getClass(), "forwardDeclaredTypes", term10413);
        setField(term10380, term10380.getClass(), "typesIndexedByProperty", term10428);
        setField(term10380, term10380.getClass(), "eachRefTypeIndexedByProperty", term10443);
        setField(term10380, term10380.getClass(), "greatestSubtypeByProperty", term10448);
        setField(term10380, term10380.getClass(), "interfaceToImplementors", null);
        setField(term10380, term10380.getClass(), "unresolvedNamedTypes", null);
        setField(term10380, term10380.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10380, term10380.getClass(), "lastGeneration", false);
        setField(term10380, term10380.getClass(), "templateTypeName", null);
        setField(term10380, term10380.getClass(), "templateType", null);
        setBooleanField(term10380, term10380.getClass(), "tolerateUndefinedValues", false);
        setField(term10380, term10380.getClass(), "resolveMode", null);
        term10459 = new Boolean(false);
        term10461 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        HashMap term501073 = new HashMap();
        HashMap term501075 = new HashMap();
        Set<Object> term501087 =  ((Map) term501075).keySet();
        HashSet term501074 = new HashSet((Collection<? extends Object>) term501087);
        HashMap term501077 = new HashMap();
        Set<Object> term501088 =  ((Map) term501077).keySet();
        HashSet term501076 = new HashSet((Collection<? extends Object>) term501088);
        HashMap term501079 = new HashMap();
        Set<Object> term501089 =  ((Map) term501079).keySet();
        HashSet term501078 = new HashSet((Collection<? extends Object>) term501089);
        HashMap term501080 = new HashMap();
        HashMap term501081 = new HashMap();
        HashMap term501082 = new HashMap();
        term501071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term501072 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term501071, term501071.getClass(), "reporter", null);
        setField(term501071, term501071.getClass(), "nativeTypes", term501072);
        setField(term501071, term501071.getClass(), "namesToTypes", term501073);
        setField(term501071, term501071.getClass(), "namespaces", term501074);
        setField(term501071, term501071.getClass(), "nonNullableTypeNames", term501076);
        setField(term501071, term501071.getClass(), "forwardDeclaredTypes", term501078);
        setField(term501071, term501071.getClass(), "typesIndexedByProperty", term501080);
        setField(term501071, term501071.getClass(), "eachRefTypeIndexedByProperty", term501081);
        setField(term501071, term501071.getClass(), "greatestSubtypeByProperty", term501082);
        setField(term501071, term501071.getClass(), "interfaceToImplementors", null);
        setField(term501071, term501071.getClass(), "unresolvedNamedTypes", null);
        setField(term501071, term501071.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term501071, term501071.getClass(), "lastGeneration", false);
        setField(term501071, term501071.getClass(), "templateTypeName", null);
        setField(term501071, term501071.getClass(), "templateType", null);
        setBooleanField(term501071, term501071.getClass(), "tolerateUndefinedValues", false);
        setField(term501071, term501071.getClass(), "resolveMode", null);
        term501083 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        term501044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501054 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501063 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term501044, term501044.getClass(), "type", 83);
        setField(term501044, term501044.getClass(), "next", null);
        setField(term501046, term501046.getClass(), "str", "");
        setIntField(term501046, term501046.getClass(), "type", 38);
        setField(term501050, term501050.getClass(), "str", "");
        setIntField(term501050, term501050.getClass(), "type", 38);
        setField(term501054, term501054.getClass(), "str", "");
        setIntField(term501054, term501054.getClass(), "type", 38);
        setField(term501057, term501057.getClass(), "str", null);
        setIntField(term501057, term501057.getClass(), "type", 38);
        setField(term501057, term501057.getClass(), "next", null);
        setField(term501057, term501057.getClass(), "first", null);
        setField(term501057, term501057.getClass(), "last", null);
        setField(term501057, term501057.getClass(), "propListHead", null);
        setIntField(term501057, term501057.getClass(), "sourcePosition", -1);
        setField(term501057, term501057.getClass(), "jsType", null);
        setField(term501057, term501057.getClass(), "parent", term501044);
        setField(term501054, term501054.getClass(), "next", term501057);
        setField(term501054, term501054.getClass(), "first", null);
        setField(term501054, term501054.getClass(), "last", null);
        setField(term501054, term501054.getClass(), "propListHead", null);
        setIntField(term501054, term501054.getClass(), "sourcePosition", -1);
        setField(term501054, term501054.getClass(), "jsType", null);
        setField(term501054, term501054.getClass(), "parent", term501044);
        setField(term501050, term501050.getClass(), "next", term501054);
        setField(term501050, term501050.getClass(), "first", null);
        setField(term501050, term501050.getClass(), "last", null);
        setField(term501050, term501050.getClass(), "propListHead", null);
        setIntField(term501050, term501050.getClass(), "sourcePosition", -1);
        setField(term501050, term501050.getClass(), "jsType", null);
        setField(term501050, term501050.getClass(), "parent", term501044);
        setField(term501046, term501046.getClass(), "next", term501050);
        setField(term501046, term501046.getClass(), "first", null);
        setField(term501046, term501046.getClass(), "last", null);
        setField(term501046, term501046.getClass(), "propListHead", null);
        setIntField(term501046, term501046.getClass(), "sourcePosition", -1);
        setField(term501046, term501046.getClass(), "jsType", null);
        setField(term501046, term501046.getClass(), "parent", term501044);
        setField(term501044, term501044.getClass(), "first", term501046);
        setField(term501063, term501063.getClass(), "str", "");
        setIntField(term501063, term501063.getClass(), "type", 38);
        setField(term501063, term501063.getClass(), "next", null);
        setField(term501063, term501063.getClass(), "first", null);
        setField(term501063, term501063.getClass(), "last", null);
        setField(term501063, term501063.getClass(), "propListHead", null);
        setIntField(term501063, term501063.getClass(), "sourcePosition", -1);
        setField(term501063, term501063.getClass(), "jsType", null);
        setField(term501063, term501063.getClass(), "parent", term501044);
        setField(term501044, term501044.getClass(), "last", term501063);
        setField(term501044, term501044.getClass(), "propListHead", null);
        setIntField(term501044, term501044.getClass(), "sourcePosition", -1);
        setField(term501044, term501044.getClass(), "jsType", null);
        setField(term501044, term501044.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term10459;
        args[1] = term10461;
        Object retValue = callMethod(klass, "createParameters", argTypes, term10380, args);
        assertTrue(recursiveEquals(term10380, term501071));
        assertTrue(recursiveEquals(term10459, false));
        assertTrue(recursiveEquals(term10461, term501083));
        assertTrue(recursiveEquals(retValue, term501044));
    }

};


