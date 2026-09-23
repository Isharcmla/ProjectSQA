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

public class TypeCheck_isPropertyTest_65727588266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6119;
     Object term6173;

    public TypeCheck_isPropertyTest_65727588266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6123 = new HashMap();
        HashMap term6130 = new HashMap();
        Set<Object> term18975 =  ((Map) term6130).keySet();
        HashSet term6129 = new HashSet((Collection<? extends Object>) term18975);
        HashMap term6136 = new HashMap();
        Set<Object> term18976 =  ((Map) term6136).keySet();
        HashSet term6135 = new HashSet((Collection<? extends Object>) term18976);
        HashMap term6142 = new HashMap();
        Set<Object> term18977 =  ((Map) term6142).keySet();
        HashSet term6141 = new HashSet((Collection<? extends Object>) term18977);
        HashMap term6147 = new HashMap();
        HashMap term6153 = new HashMap();
        HashMap term6158 = new HashMap();
        term6119 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term6120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6122 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        setField(term6119, term6119.getClass(), "compiler", null);
        setField(term6120, term6120.getClass(), "compiler", null);
        setField(term6121, term6121.getClass(), "reporter", null);
        setField(term6121, term6121.getClass(), "nativeTypes", term6122);
        setField(term6121, term6121.getClass(), "namesToTypes", term6123);
        setField(term6121, term6121.getClass(), "namespaces", term6129);
        setField(term6121, term6121.getClass(), "nonNullableTypeNames", term6135);
        setField(term6121, term6121.getClass(), "forwardDeclaredTypes", term6141);
        setField(term6121, term6121.getClass(), "typesIndexedByProperty", term6147);
        setField(term6121, term6121.getClass(), "eachRefTypeIndexedByProperty", term6153);
        setField(term6121, term6121.getClass(), "greatestSubtypeByProperty", term6158);
        setField(term6121, term6121.getClass(), "interfaceToImplementors", null);
        setField(term6121, term6121.getClass(), "unresolvedNamedTypes", null);
        setField(term6121, term6121.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6121, term6121.getClass(), "lastGeneration", false);
        setField(term6121, term6121.getClass(), "templateTypeName", null);
        setField(term6121, term6121.getClass(), "templateType", null);
        setBooleanField(term6121, term6121.getClass(), "tolerateUndefinedValues", false);
        setField(term6121, term6121.getClass(), "resolveMode", null);
        setField(term6120, term6120.getClass(), "typeRegistry", term6121);
        setField(term6120, term6120.getClass(), "allValueTypes", null);
        setBooleanField(term6120, term6120.getClass(), "shouldReport", false);
        setField(term6120, term6120.getClass(), "nullOrUndefined", null);
        setField(term6120, term6120.getClass(), "mismatches", null);
        setField(term6119, term6119.getClass(), "validator", term6120);
        setField(term6119, term6119.getClass(), "reverseInterpreter", null);
        setField(term6119, term6119.getClass(), "typeRegistry", null);
        setField(term6119, term6119.getClass(), "topScope", null);
        setField(term6119, term6119.getClass(), "scopeCreator", null);
        setField(term6119, term6119.getClass(), "reportMissingOverride", null);
        setField(term6119, term6119.getClass(), "reportUnknownTypes", null);
        setBooleanField(term6119, term6119.getClass(), "reportMissingProperties", false);
        setField(term6119, term6119.getClass(), "inferJSDocInfo", null);
        setIntField(term6119, term6119.getClass(), "typedCount", 0);
        setIntField(term6119, term6119.getClass(), "nullCount", 0);
        setIntField(term6119, term6119.getClass(), "unknownCount", 0);
        setBooleanField(term6119, term6119.getClass(), "inExterns", false);
        setIntField(term6119, term6119.getClass(), "noTypeCheckSection", 0);
        term6173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6186 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6196 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6173, term6173.getClass(), "type", -1549607466);
        setIntField(term6175, term6175.getClass(), "type", 1639448749);
        setIntField(term6177, term6177.getClass(), "type", 0);
        setField(term6177, term6177.getClass(), "next", null);
        setField(term6177, term6177.getClass(), "first", null);
        setField(term6177, term6177.getClass(), "last", null);
        setField(term6177, term6177.getClass(), "propListHead", null);
        setIntField(term6177, term6177.getClass(), "sourcePosition", 0);
        setField(term6177, term6177.getClass(), "jsType", null);
        setField(term6177, term6177.getClass(), "parent", null);
        setField(term6175, term6175.getClass(), "next", term6177);
        setIntField(term6180, term6180.getClass(), "type", 0);
        setField(term6180, term6180.getClass(), "next", null);
        setField(term6180, term6180.getClass(), "first", null);
        setField(term6180, term6180.getClass(), "last", null);
        setField(term6180, term6180.getClass(), "propListHead", null);
        setIntField(term6180, term6180.getClass(), "sourcePosition", 0);
        setField(term6180, term6180.getClass(), "jsType", null);
        setField(term6180, term6180.getClass(), "parent", null);
        setField(term6175, term6175.getClass(), "first", term6180);
        setIntField(term6183, term6183.getClass(), "type", 0);
        setField(term6183, term6183.getClass(), "next", null);
        setField(term6183, term6183.getClass(), "first", null);
        setField(term6183, term6183.getClass(), "last", null);
        setField(term6183, term6183.getClass(), "propListHead", null);
        setIntField(term6183, term6183.getClass(), "sourcePosition", 0);
        setField(term6183, term6183.getClass(), "jsType", null);
        setField(term6183, term6183.getClass(), "parent", null);
        setField(term6175, term6175.getClass(), "last", term6183);
        setField(term6186, term6186.getClass(), "next", null);
        setIntField(term6186, term6186.getClass(), "type", 0);
        setIntField(term6186, term6186.getClass(), "intValue", 0);
        setField(term6186, term6186.getClass(), "objectValue", null);
        setField(term6175, term6175.getClass(), "propListHead", term6186);
        setIntField(term6175, term6175.getClass(), "sourcePosition", 433248783);
        setField(term6175, term6175.getClass(), "jsType", null);
        setField(term6175, term6175.getClass(), "parent", null);
        setField(term6173, term6173.getClass(), "next", term6175);
        setIntField(term6190, term6190.getClass(), "type", 0);
        setField(term6190, term6190.getClass(), "next", null);
        setField(term6190, term6190.getClass(), "first", null);
        setField(term6190, term6190.getClass(), "last", null);
        setField(term6190, term6190.getClass(), "propListHead", null);
        setIntField(term6190, term6190.getClass(), "sourcePosition", 0);
        setField(term6190, term6190.getClass(), "jsType", null);
        setField(term6190, term6190.getClass(), "parent", null);
        setField(term6173, term6173.getClass(), "first", term6190);
        setIntField(term6193, term6193.getClass(), "type", 0);
        setField(term6193, term6193.getClass(), "next", null);
        setField(term6193, term6193.getClass(), "first", null);
        setField(term6193, term6193.getClass(), "last", null);
        setField(term6193, term6193.getClass(), "propListHead", null);
        setIntField(term6193, term6193.getClass(), "sourcePosition", 0);
        setField(term6193, term6193.getClass(), "jsType", null);
        setField(term6193, term6193.getClass(), "parent", null);
        setField(term6173, term6173.getClass(), "last", term6193);
        setField(term6196, term6196.getClass(), "next", null);
        setIntField(term6196, term6196.getClass(), "type", 0);
        setIntField(term6196, term6196.getClass(), "intValue", 0);
        setField(term6196, term6196.getClass(), "objectValue", null);
        setField(term6173, term6173.getClass(), "propListHead", term6196);
        setIntField(term6173, term6173.getClass(), "sourcePosition", -507944154);
        setField(term6173, term6173.getClass(), "jsType", null);
        setField(term6173, term6173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term6173;
        try {
            callMethod(klass, "isPropertyTest", argTypes, term6119, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


