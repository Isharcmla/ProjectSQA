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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeValidator_mismatch_193134349960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5974;
     Object term6042;

    public TypeValidator_mismatch_193134349960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5977 = new HashMap();
        HashMap term5986 = new HashMap();
        Set<Object> term14908 =  ((Map) term5986).keySet();
        HashSet term5985 = new HashSet((Collection<? extends Object>) term14908);
        HashMap term5993 = new HashMap();
        Set<Object> term14909 =  ((Map) term5993).keySet();
        HashSet term5992 = new HashSet((Collection<? extends Object>) term14909);
        HashMap term6000 = new HashMap();
        Set<Object> term14910 =  ((Map) term6000).keySet();
        HashSet term5999 = new HashSet((Collection<? extends Object>) term14910);
        HashMap term6006 = new HashMap();
        HashMap term6014 = new HashMap();
        HashMap term6019 = new HashMap();
        term5974 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term5975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5976 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term5974, term5974.getClass(), "compiler", null);
        setField(term5975, term5975.getClass(), "reporter", null);
        setField(term5975, term5975.getClass(), "nativeTypes", term5976);
        setField(term5975, term5975.getClass(), "namesToTypes", term5977);
        setField(term5975, term5975.getClass(), "namespaces", term5985);
        setField(term5975, term5975.getClass(), "nonNullableTypeNames", term5992);
        setField(term5975, term5975.getClass(), "forwardDeclaredTypes", term5999);
        setField(term5975, term5975.getClass(), "typesIndexedByProperty", term6006);
        setField(term5975, term5975.getClass(), "eachRefTypeIndexedByProperty", term6014);
        setField(term5975, term5975.getClass(), "greatestSubtypeByProperty", term6019);
        setField(term5975, term5975.getClass(), "interfaceToImplementors", null);
        setField(term5975, term5975.getClass(), "unresolvedNamedTypes", null);
        setField(term5975, term5975.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5975, term5975.getClass(), "lastGeneration", false);
        setField(term5975, term5975.getClass(), "templateTypeName", null);
        setField(term5975, term5975.getClass(), "templateType", null);
        setBooleanField(term5975, term5975.getClass(), "tolerateUndefinedValues", false);
        setField(term5975, term5975.getClass(), "resolveMode", null);
        setField(term5974, term5974.getClass(), "typeRegistry", term5975);
        setField(term5974, term5974.getClass(), "allValueTypes", null);
        setBooleanField(term5974, term5974.getClass(), "shouldReport", false);
        setField(term5974, term5974.getClass(), "nullOrUndefined", null);
        setField(term5974, term5974.getClass(), "mismatches", null);
        term6042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6055 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6065 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6042, term6042.getClass(), "type", 1289741214);
        setIntField(term6044, term6044.getClass(), "type", -128490829);
        setIntField(term6046, term6046.getClass(), "type", 0);
        setField(term6046, term6046.getClass(), "next", null);
        setField(term6046, term6046.getClass(), "first", null);
        setField(term6046, term6046.getClass(), "last", null);
        setField(term6046, term6046.getClass(), "propListHead", null);
        setIntField(term6046, term6046.getClass(), "sourcePosition", 0);
        setField(term6046, term6046.getClass(), "jsType", null);
        setField(term6046, term6046.getClass(), "parent", null);
        setField(term6044, term6044.getClass(), "next", term6046);
        setIntField(term6049, term6049.getClass(), "type", 0);
        setField(term6049, term6049.getClass(), "next", null);
        setField(term6049, term6049.getClass(), "first", null);
        setField(term6049, term6049.getClass(), "last", null);
        setField(term6049, term6049.getClass(), "propListHead", null);
        setIntField(term6049, term6049.getClass(), "sourcePosition", 0);
        setField(term6049, term6049.getClass(), "jsType", null);
        setField(term6049, term6049.getClass(), "parent", null);
        setField(term6044, term6044.getClass(), "first", term6049);
        setIntField(term6052, term6052.getClass(), "type", 0);
        setField(term6052, term6052.getClass(), "next", null);
        setField(term6052, term6052.getClass(), "first", null);
        setField(term6052, term6052.getClass(), "last", null);
        setField(term6052, term6052.getClass(), "propListHead", null);
        setIntField(term6052, term6052.getClass(), "sourcePosition", 0);
        setField(term6052, term6052.getClass(), "jsType", null);
        setField(term6052, term6052.getClass(), "parent", null);
        setField(term6044, term6044.getClass(), "last", term6052);
        setField(term6055, term6055.getClass(), "next", null);
        setIntField(term6055, term6055.getClass(), "type", 0);
        setIntField(term6055, term6055.getClass(), "intValue", 0);
        setField(term6055, term6055.getClass(), "objectValue", null);
        setField(term6044, term6044.getClass(), "propListHead", term6055);
        setIntField(term6044, term6044.getClass(), "sourcePosition", -763166094);
        setField(term6044, term6044.getClass(), "jsType", null);
        setField(term6044, term6044.getClass(), "parent", null);
        setField(term6042, term6042.getClass(), "next", term6044);
        setIntField(term6059, term6059.getClass(), "type", 0);
        setField(term6059, term6059.getClass(), "next", null);
        setField(term6059, term6059.getClass(), "first", null);
        setField(term6059, term6059.getClass(), "last", null);
        setField(term6059, term6059.getClass(), "propListHead", null);
        setIntField(term6059, term6059.getClass(), "sourcePosition", 0);
        setField(term6059, term6059.getClass(), "jsType", null);
        setField(term6059, term6059.getClass(), "parent", null);
        setField(term6042, term6042.getClass(), "first", term6059);
        setIntField(term6062, term6062.getClass(), "type", 0);
        setField(term6062, term6062.getClass(), "next", null);
        setField(term6062, term6062.getClass(), "first", null);
        setField(term6062, term6062.getClass(), "last", null);
        setField(term6062, term6062.getClass(), "propListHead", null);
        setIntField(term6062, term6062.getClass(), "sourcePosition", 0);
        setField(term6062, term6062.getClass(), "jsType", null);
        setField(term6062, term6062.getClass(), "parent", null);
        setField(term6042, term6042.getClass(), "last", term6062);
        setField(term6065, term6065.getClass(), "next", null);
        setIntField(term6065, term6065.getClass(), "type", 0);
        setIntField(term6065, term6065.getClass(), "intValue", 0);
        setField(term6065, term6065.getClass(), "objectValue", null);
        setField(term6042, term6042.getClass(), "propListHead", term6065);
        setIntField(term6042, term6042.getClass(), "sourcePosition", -222941705);
        setField(term6042, term6042.getClass(), "jsType", null);
        setField(term6042, term6042.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "OWglDUWQYb";
        args[1] = term6042;
        args[2] = "FiqETbKjpv";
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "mismatch", argTypes, term5974, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


