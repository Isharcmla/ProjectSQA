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

public class FunctionType_init_183823358962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term272;

    public FunctionType_init_183823358962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term181 = new HashMap();
        HashMap term191 = new HashMap();
        Set<Object> term22351 =  ((Map) term191).keySet();
        HashSet term190 = new HashSet((Collection<? extends Object>) term22351);
        HashMap term197 = new HashMap();
        Set<Object> term22352 =  ((Map) term197).keySet();
        HashSet term196 = new HashSet((Collection<? extends Object>) term22352);
        HashMap term208 = new HashMap();
        Set<Object> term22353 =  ((Map) term208).keySet();
        HashSet term207 = new HashSet((Collection<? extends Object>) term22353);
        HashMap term230 = new HashMap();
        HashMap term244 = new HashMap();
        HashMap term249 = new HashMap();
        term179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term180 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term179, term179.getClass(), "reporter", null);
        setField(term179, term179.getClass(), "nativeTypes", term180);
        setField(term179, term179.getClass(), "namesToTypes", term181);
        setField(term179, term179.getClass(), "namespaces", term190);
        setField(term179, term179.getClass(), "nonNullableTypeNames", term196);
        setField(term179, term179.getClass(), "forwardDeclaredTypes", term207);
        setField(term179, term179.getClass(), "typesIndexedByProperty", term230);
        setField(term179, term179.getClass(), "eachRefTypeIndexedByProperty", term244);
        setField(term179, term179.getClass(), "greatestSubtypeByProperty", term249);
        setField(term179, term179.getClass(), "interfaceToImplementors", null);
        setField(term179, term179.getClass(), "unresolvedNamedTypes", null);
        setField(term179, term179.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term179, term179.getClass(), "lastGeneration", false);
        setField(term179, term179.getClass(), "templateTypeName", null);
        setField(term179, term179.getClass(), "templateType", null);
        setBooleanField(term179, term179.getClass(), "tolerateUndefinedValues", false);
        setField(term179, term179.getClass(), "resolveMode", null);
        term272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term272, term272.getClass(), "type", -1275173084);
        setIntField(term274, term274.getClass(), "type", -73683645);
        setIntField(term276, term276.getClass(), "type", 0);
        setField(term276, term276.getClass(), "next", null);
        setField(term276, term276.getClass(), "first", null);
        setField(term276, term276.getClass(), "last", null);
        setField(term276, term276.getClass(), "propListHead", null);
        setIntField(term276, term276.getClass(), "sourcePosition", 0);
        setField(term276, term276.getClass(), "jsType", null);
        setField(term276, term276.getClass(), "parent", null);
        setField(term274, term274.getClass(), "next", term276);
        setIntField(term279, term279.getClass(), "type", 0);
        setField(term279, term279.getClass(), "next", null);
        setField(term279, term279.getClass(), "first", null);
        setField(term279, term279.getClass(), "last", null);
        setField(term279, term279.getClass(), "propListHead", null);
        setIntField(term279, term279.getClass(), "sourcePosition", 0);
        setField(term279, term279.getClass(), "jsType", null);
        setField(term279, term279.getClass(), "parent", null);
        setField(term274, term274.getClass(), "first", term279);
        setIntField(term282, term282.getClass(), "type", 0);
        setField(term282, term282.getClass(), "next", null);
        setField(term282, term282.getClass(), "first", null);
        setField(term282, term282.getClass(), "last", null);
        setField(term282, term282.getClass(), "propListHead", null);
        setIntField(term282, term282.getClass(), "sourcePosition", 0);
        setField(term282, term282.getClass(), "jsType", null);
        setField(term282, term282.getClass(), "parent", null);
        setField(term274, term274.getClass(), "last", term282);
        setField(term274, term274.getClass(), "propListHead", null);
        setIntField(term274, term274.getClass(), "sourcePosition", 0);
        setField(term274, term274.getClass(), "jsType", null);
        setField(term274, term274.getClass(), "parent", null);
        setField(term272, term272.getClass(), "next", term274);
        setIntField(term286, term286.getClass(), "type", 0);
        setField(term286, term286.getClass(), "next", null);
        setField(term286, term286.getClass(), "first", null);
        setField(term286, term286.getClass(), "last", null);
        setField(term286, term286.getClass(), "propListHead", null);
        setIntField(term286, term286.getClass(), "sourcePosition", 0);
        setField(term286, term286.getClass(), "jsType", null);
        setField(term286, term286.getClass(), "parent", null);
        setField(term272, term272.getClass(), "first", term286);
        setIntField(term289, term289.getClass(), "type", 0);
        setField(term289, term289.getClass(), "next", null);
        setField(term289, term289.getClass(), "first", null);
        setField(term289, term289.getClass(), "last", null);
        setField(term289, term289.getClass(), "propListHead", null);
        setIntField(term289, term289.getClass(), "sourcePosition", 0);
        setField(term289, term289.getClass(), "jsType", null);
        setField(term289, term289.getClass(), "parent", null);
        setField(term272, term272.getClass(), "last", term289);
        setField(term272, term272.getClass(), "propListHead", null);
        setIntField(term272, term272.getClass(), "sourcePosition", 0);
        setField(term272, term272.getClass(), "jsType", null);
        setField(term272, term272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term179;
        args[1] = "DfISiziTgG";
        args[2] = term272;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


