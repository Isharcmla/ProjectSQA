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

public class FunctionType_forInterface_212681844074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term236;

    public FunctionType_forInterface_212681844074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term139 = new HashMap();
        HashMap term149 = new HashMap();
        Set<Object> term50343 =  ((Map) term149).keySet();
        HashSet term148 = new HashSet((Collection<? extends Object>) term50343);
        HashMap term168 = new HashMap();
        Set<Object> term50344 =  ((Map) term168).keySet();
        HashSet term167 = new HashSet((Collection<? extends Object>) term50344);
        HashMap term177 = new HashMap();
        Set<Object> term50345 =  ((Map) term177).keySet();
        HashSet term176 = new HashSet((Collection<? extends Object>) term50345);
        HashMap term193 = new HashMap();
        HashMap term208 = new HashMap();
        HashMap term213 = new HashMap();
        term137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term138 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term137, term137.getClass(), "reporter", null);
        setField(term137, term137.getClass(), "nativeTypes", term138);
        setField(term137, term137.getClass(), "namesToTypes", term139);
        setField(term137, term137.getClass(), "namespaces", term148);
        setField(term137, term137.getClass(), "nonNullableTypeNames", term167);
        setField(term137, term137.getClass(), "forwardDeclaredTypes", term176);
        setField(term137, term137.getClass(), "typesIndexedByProperty", term193);
        setField(term137, term137.getClass(), "eachRefTypeIndexedByProperty", term208);
        setField(term137, term137.getClass(), "greatestSubtypeByProperty", term213);
        setField(term137, term137.getClass(), "interfaceToImplementors", null);
        setField(term137, term137.getClass(), "unresolvedNamedTypes", null);
        setField(term137, term137.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term137, term137.getClass(), "lastGeneration", false);
        setField(term137, term137.getClass(), "templateTypes", null);
        setBooleanField(term137, term137.getClass(), "tolerateUndefinedValues", false);
        setField(term137, term137.getClass(), "resolveMode", null);
        term236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term236, term236.getClass(), "type", -1968847291);
        setIntField(term238, term238.getClass(), "type", 579005622);
        setIntField(term240, term240.getClass(), "type", -14890619);
        setIntField(term242, term242.getClass(), "type", 1632125673);
        setIntField(term244, term244.getClass(), "type", 454281060);
        setField(term244, term244.getClass(), "next", null);
        setField(term244, term244.getClass(), "first", null);
        setField(term244, term244.getClass(), "last", null);
        setField(term244, term244.getClass(), "propListHead", null);
        setIntField(term244, term244.getClass(), "sourcePosition", 0);
        setField(term244, term244.getClass(), "jsType", null);
        setField(term244, term244.getClass(), "parent", null);
        setField(term242, term242.getClass(), "next", term244);
        setIntField(term247, term247.getClass(), "type", -1786399638);
        setField(term247, term247.getClass(), "next", null);
        setField(term247, term247.getClass(), "first", null);
        setField(term247, term247.getClass(), "last", term244);
        setField(term247, term247.getClass(), "propListHead", null);
        setIntField(term247, term247.getClass(), "sourcePosition", 0);
        setField(term247, term247.getClass(), "jsType", null);
        setField(term247, term247.getClass(), "parent", null);
        setField(term242, term242.getClass(), "first", term247);
        setField(term242, term242.getClass(), "last", term240);
        setField(term242, term242.getClass(), "propListHead", null);
        setIntField(term242, term242.getClass(), "sourcePosition", 0);
        setField(term242, term242.getClass(), "jsType", null);
        setField(term242, term242.getClass(), "parent", null);
        setField(term240, term240.getClass(), "next", term242);
        setField(term240, term240.getClass(), "first", term244);
        setIntField(term251, term251.getClass(), "type", -1048298087);
        setIntField(term253, term253.getClass(), "type", 292681826);
        setField(term253, term253.getClass(), "next", null);
        setField(term253, term253.getClass(), "first", term247);
        setField(term253, term253.getClass(), "last", term242);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term251, term251.getClass(), "next", term253);
        setField(term251, term251.getClass(), "first", term238);
        setField(term251, term251.getClass(), "last", term238);
        setField(term251, term251.getClass(), "propListHead", null);
        setIntField(term251, term251.getClass(), "sourcePosition", 0);
        setField(term251, term251.getClass(), "jsType", null);
        setField(term251, term251.getClass(), "parent", null);
        setField(term240, term240.getClass(), "last", term251);
        setField(term240, term240.getClass(), "propListHead", null);
        setIntField(term240, term240.getClass(), "sourcePosition", 0);
        setField(term240, term240.getClass(), "jsType", null);
        setField(term240, term240.getClass(), "parent", null);
        setField(term238, term238.getClass(), "next", term240);
        setIntField(term258, term258.getClass(), "type", 458147407);
        setField(term258, term258.getClass(), "next", term251);
        setField(term258, term258.getClass(), "first", term253);
        setField(term258, term258.getClass(), "last", term236);
        setField(term258, term258.getClass(), "propListHead", null);
        setIntField(term258, term258.getClass(), "sourcePosition", 0);
        setField(term258, term258.getClass(), "jsType", null);
        setField(term258, term258.getClass(), "parent", null);
        setField(term238, term238.getClass(), "first", term258);
        setField(term238, term238.getClass(), "last", term258);
        setField(term238, term238.getClass(), "propListHead", null);
        setIntField(term238, term238.getClass(), "sourcePosition", 0);
        setField(term238, term238.getClass(), "jsType", null);
        setField(term238, term238.getClass(), "parent", null);
        setField(term236, term236.getClass(), "next", term238);
        setField(term236, term236.getClass(), "first", term242);
        setField(term236, term236.getClass(), "last", term244);
        setField(term236, term236.getClass(), "propListHead", null);
        setIntField(term236, term236.getClass(), "sourcePosition", 0);
        setField(term236, term236.getClass(), "jsType", null);
        setField(term236, term236.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term137;
        args[1] = "HzqpegHiRq";
        args[2] = term236;
        try {
            callMethod(klass, "forInterface", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


