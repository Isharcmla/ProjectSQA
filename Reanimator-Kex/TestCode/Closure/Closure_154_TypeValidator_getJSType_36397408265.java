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

public class TypeValidator_getJSType_36397408265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6390;
     Object term6446;

    public TypeValidator_getJSType_36397408265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6393 = new HashMap();
        HashMap term6402 = new HashMap();
        Set<Object> term16078 =  ((Map) term6402).keySet();
        HashSet term6401 = new HashSet((Collection<? extends Object>) term16078);
        HashMap term6409 = new HashMap();
        Set<Object> term16079 =  ((Map) term6409).keySet();
        HashSet term6408 = new HashSet((Collection<? extends Object>) term16079);
        HashMap term6416 = new HashMap();
        Set<Object> term16080 =  ((Map) term6416).keySet();
        HashSet term6415 = new HashSet((Collection<? extends Object>) term16080);
        HashMap term6422 = new HashMap();
        HashMap term6430 = new HashMap();
        HashMap term6435 = new HashMap();
        term6390 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6392 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term6390, term6390.getClass(), "compiler", null);
        setField(term6391, term6391.getClass(), "reporter", null);
        setField(term6391, term6391.getClass(), "nativeTypes", term6392);
        setField(term6391, term6391.getClass(), "namesToTypes", term6393);
        setField(term6391, term6391.getClass(), "namespaces", term6401);
        setField(term6391, term6391.getClass(), "nonNullableTypeNames", term6408);
        setField(term6391, term6391.getClass(), "forwardDeclaredTypes", term6415);
        setField(term6391, term6391.getClass(), "typesIndexedByProperty", term6422);
        setField(term6391, term6391.getClass(), "eachRefTypeIndexedByProperty", term6430);
        setField(term6391, term6391.getClass(), "greatestSubtypeByProperty", term6435);
        setField(term6391, term6391.getClass(), "interfaceToImplementors", null);
        setField(term6391, term6391.getClass(), "unresolvedNamedTypes", null);
        setField(term6391, term6391.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6391, term6391.getClass(), "lastGeneration", false);
        setField(term6391, term6391.getClass(), "templateTypeName", null);
        setField(term6391, term6391.getClass(), "templateType", null);
        setBooleanField(term6391, term6391.getClass(), "tolerateUndefinedValues", false);
        setField(term6391, term6391.getClass(), "resolveMode", null);
        setField(term6390, term6390.getClass(), "typeRegistry", term6391);
        setField(term6390, term6390.getClass(), "allValueTypes", null);
        setBooleanField(term6390, term6390.getClass(), "shouldReport", false);
        setField(term6390, term6390.getClass(), "nullOrUndefined", null);
        setField(term6390, term6390.getClass(), "mismatches", null);
        term6446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6459 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6469 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6446, term6446.getClass(), "type", -330897705);
        setIntField(term6448, term6448.getClass(), "type", 319853052);
        setIntField(term6450, term6450.getClass(), "type", 0);
        setField(term6450, term6450.getClass(), "next", null);
        setField(term6450, term6450.getClass(), "first", null);
        setField(term6450, term6450.getClass(), "last", null);
        setField(term6450, term6450.getClass(), "propListHead", null);
        setIntField(term6450, term6450.getClass(), "sourcePosition", 0);
        setField(term6450, term6450.getClass(), "jsType", null);
        setField(term6450, term6450.getClass(), "parent", null);
        setField(term6448, term6448.getClass(), "next", term6450);
        setIntField(term6453, term6453.getClass(), "type", 0);
        setField(term6453, term6453.getClass(), "next", null);
        setField(term6453, term6453.getClass(), "first", null);
        setField(term6453, term6453.getClass(), "last", null);
        setField(term6453, term6453.getClass(), "propListHead", null);
        setIntField(term6453, term6453.getClass(), "sourcePosition", 0);
        setField(term6453, term6453.getClass(), "jsType", null);
        setField(term6453, term6453.getClass(), "parent", null);
        setField(term6448, term6448.getClass(), "first", term6453);
        setIntField(term6456, term6456.getClass(), "type", 0);
        setField(term6456, term6456.getClass(), "next", null);
        setField(term6456, term6456.getClass(), "first", null);
        setField(term6456, term6456.getClass(), "last", null);
        setField(term6456, term6456.getClass(), "propListHead", null);
        setIntField(term6456, term6456.getClass(), "sourcePosition", 0);
        setField(term6456, term6456.getClass(), "jsType", null);
        setField(term6456, term6456.getClass(), "parent", null);
        setField(term6448, term6448.getClass(), "last", term6456);
        setField(term6459, term6459.getClass(), "next", null);
        setIntField(term6459, term6459.getClass(), "type", 0);
        setIntField(term6459, term6459.getClass(), "intValue", 0);
        setField(term6459, term6459.getClass(), "objectValue", null);
        setField(term6448, term6448.getClass(), "propListHead", term6459);
        setIntField(term6448, term6448.getClass(), "sourcePosition", 1608016787);
        setField(term6448, term6448.getClass(), "jsType", null);
        setField(term6448, term6448.getClass(), "parent", null);
        setField(term6446, term6446.getClass(), "next", term6448);
        setIntField(term6463, term6463.getClass(), "type", 0);
        setField(term6463, term6463.getClass(), "next", null);
        setField(term6463, term6463.getClass(), "first", null);
        setField(term6463, term6463.getClass(), "last", null);
        setField(term6463, term6463.getClass(), "propListHead", null);
        setIntField(term6463, term6463.getClass(), "sourcePosition", 0);
        setField(term6463, term6463.getClass(), "jsType", null);
        setField(term6463, term6463.getClass(), "parent", null);
        setField(term6446, term6446.getClass(), "first", term6463);
        setIntField(term6466, term6466.getClass(), "type", 0);
        setField(term6466, term6466.getClass(), "next", null);
        setField(term6466, term6466.getClass(), "first", null);
        setField(term6466, term6466.getClass(), "last", null);
        setField(term6466, term6466.getClass(), "propListHead", null);
        setIntField(term6466, term6466.getClass(), "sourcePosition", 0);
        setField(term6466, term6466.getClass(), "jsType", null);
        setField(term6466, term6466.getClass(), "parent", null);
        setField(term6446, term6446.getClass(), "last", term6466);
        setField(term6469, term6469.getClass(), "next", null);
        setIntField(term6469, term6469.getClass(), "type", 0);
        setIntField(term6469, term6469.getClass(), "intValue", 0);
        setField(term6469, term6469.getClass(), "objectValue", null);
        setField(term6446, term6446.getClass(), "propListHead", term6469);
        setIntField(term6446, term6446.getClass(), "sourcePosition", -516303035);
        setField(term6446, term6446.getClass(), "jsType", null);
        setField(term6446, term6446.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6446;
        try {
            callMethod(klass, "getJSType", argTypes, term6390, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


