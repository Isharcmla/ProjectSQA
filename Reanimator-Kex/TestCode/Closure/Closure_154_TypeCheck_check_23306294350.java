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
import java.lang.Boolean;

public class TypeCheck_check_23306294350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;
     Object term1544;
     Object term1571;

    public TypeCheck_check_23306294350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1494 = new HashMap();
        HashMap term1501 = new HashMap();
        Set<Object> term13536 =  ((Map) term1501).keySet();
        HashSet term1500 = new HashSet((Collection<? extends Object>) term13536);
        HashMap term1507 = new HashMap();
        Set<Object> term13537 =  ((Map) term1507).keySet();
        HashSet term1506 = new HashSet((Collection<? extends Object>) term13537);
        HashMap term1513 = new HashMap();
        Set<Object> term13538 =  ((Map) term1513).keySet();
        HashSet term1512 = new HashSet((Collection<? extends Object>) term13538);
        HashMap term1518 = new HashMap();
        HashMap term1524 = new HashMap();
        HashMap term1529 = new HashMap();
        term1490 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1493 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term1490, term1490.getClass(), "compiler", null);
        setField(term1491, term1491.getClass(), "compiler", null);
        setField(term1492, term1492.getClass(), "reporter", null);
        setField(term1492, term1492.getClass(), "nativeTypes", term1493);
        setField(term1492, term1492.getClass(), "namesToTypes", term1494);
        setField(term1492, term1492.getClass(), "namespaces", term1500);
        setField(term1492, term1492.getClass(), "nonNullableTypeNames", term1506);
        setField(term1492, term1492.getClass(), "forwardDeclaredTypes", term1512);
        setField(term1492, term1492.getClass(), "typesIndexedByProperty", term1518);
        setField(term1492, term1492.getClass(), "eachRefTypeIndexedByProperty", term1524);
        setField(term1492, term1492.getClass(), "greatestSubtypeByProperty", term1529);
        setField(term1492, term1492.getClass(), "interfaceToImplementors", null);
        setField(term1492, term1492.getClass(), "unresolvedNamedTypes", null);
        setField(term1492, term1492.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1492, term1492.getClass(), "lastGeneration", false);
        setField(term1492, term1492.getClass(), "templateTypeName", null);
        setField(term1492, term1492.getClass(), "templateType", null);
        setBooleanField(term1492, term1492.getClass(), "tolerateUndefinedValues", false);
        setField(term1492, term1492.getClass(), "resolveMode", null);
        setField(term1491, term1491.getClass(), "typeRegistry", term1492);
        setField(term1491, term1491.getClass(), "allValueTypes", null);
        setBooleanField(term1491, term1491.getClass(), "shouldReport", false);
        setField(term1491, term1491.getClass(), "nullOrUndefined", null);
        setField(term1491, term1491.getClass(), "mismatches", null);
        setField(term1490, term1490.getClass(), "validator", term1491);
        setField(term1490, term1490.getClass(), "reverseInterpreter", null);
        setField(term1490, term1490.getClass(), "typeRegistry", null);
        setField(term1490, term1490.getClass(), "topScope", null);
        setField(term1490, term1490.getClass(), "scopeCreator", null);
        setField(term1490, term1490.getClass(), "reportMissingOverride", null);
        setField(term1490, term1490.getClass(), "reportUnknownTypes", null);
        setBooleanField(term1490, term1490.getClass(), "reportMissingProperties", false);
        setField(term1490, term1490.getClass(), "inferJSDocInfo", null);
        setIntField(term1490, term1490.getClass(), "typedCount", 0);
        setIntField(term1490, term1490.getClass(), "nullCount", 0);
        setIntField(term1490, term1490.getClass(), "unknownCount", 0);
        setBooleanField(term1490, term1490.getClass(), "inExterns", false);
        setIntField(term1490, term1490.getClass(), "noTypeCheckSection", 0);
        term1544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1567 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1544, term1544.getClass(), "type", -1371869594);
        setIntField(term1546, term1546.getClass(), "type", -1588772968);
        setIntField(term1548, term1548.getClass(), "type", 0);
        setField(term1548, term1548.getClass(), "next", null);
        setField(term1548, term1548.getClass(), "first", null);
        setField(term1548, term1548.getClass(), "last", null);
        setField(term1548, term1548.getClass(), "propListHead", null);
        setIntField(term1548, term1548.getClass(), "sourcePosition", 0);
        setField(term1548, term1548.getClass(), "jsType", null);
        setField(term1548, term1548.getClass(), "parent", null);
        setField(term1546, term1546.getClass(), "next", term1548);
        setIntField(term1551, term1551.getClass(), "type", 0);
        setField(term1551, term1551.getClass(), "next", null);
        setField(term1551, term1551.getClass(), "first", null);
        setField(term1551, term1551.getClass(), "last", null);
        setField(term1551, term1551.getClass(), "propListHead", null);
        setIntField(term1551, term1551.getClass(), "sourcePosition", 0);
        setField(term1551, term1551.getClass(), "jsType", null);
        setField(term1551, term1551.getClass(), "parent", null);
        setField(term1546, term1546.getClass(), "first", term1551);
        setIntField(term1554, term1554.getClass(), "type", 0);
        setField(term1554, term1554.getClass(), "next", null);
        setField(term1554, term1554.getClass(), "first", null);
        setField(term1554, term1554.getClass(), "last", null);
        setField(term1554, term1554.getClass(), "propListHead", null);
        setIntField(term1554, term1554.getClass(), "sourcePosition", 0);
        setField(term1554, term1554.getClass(), "jsType", null);
        setField(term1554, term1554.getClass(), "parent", null);
        setField(term1546, term1546.getClass(), "last", term1554);
        setField(term1557, term1557.getClass(), "next", null);
        setIntField(term1557, term1557.getClass(), "type", 0);
        setIntField(term1557, term1557.getClass(), "intValue", 0);
        setField(term1557, term1557.getClass(), "objectValue", null);
        setField(term1546, term1546.getClass(), "propListHead", term1557);
        setIntField(term1546, term1546.getClass(), "sourcePosition", 933028652);
        setField(term1546, term1546.getClass(), "jsType", null);
        setField(term1546, term1546.getClass(), "parent", null);
        setField(term1544, term1544.getClass(), "next", term1546);
        setIntField(term1561, term1561.getClass(), "type", 0);
        setField(term1561, term1561.getClass(), "next", null);
        setField(term1561, term1561.getClass(), "first", null);
        setField(term1561, term1561.getClass(), "last", null);
        setField(term1561, term1561.getClass(), "propListHead", null);
        setIntField(term1561, term1561.getClass(), "sourcePosition", 0);
        setField(term1561, term1561.getClass(), "jsType", null);
        setField(term1561, term1561.getClass(), "parent", null);
        setField(term1544, term1544.getClass(), "first", term1561);
        setIntField(term1564, term1564.getClass(), "type", 0);
        setField(term1564, term1564.getClass(), "next", null);
        setField(term1564, term1564.getClass(), "first", null);
        setField(term1564, term1564.getClass(), "last", null);
        setField(term1564, term1564.getClass(), "propListHead", null);
        setIntField(term1564, term1564.getClass(), "sourcePosition", 0);
        setField(term1564, term1564.getClass(), "jsType", null);
        setField(term1564, term1564.getClass(), "parent", null);
        setField(term1544, term1544.getClass(), "last", term1564);
        setField(term1567, term1567.getClass(), "next", null);
        setIntField(term1567, term1567.getClass(), "type", 0);
        setIntField(term1567, term1567.getClass(), "intValue", 0);
        setField(term1567, term1567.getClass(), "objectValue", null);
        setField(term1544, term1544.getClass(), "propListHead", term1567);
        setIntField(term1544, term1544.getClass(), "sourcePosition", 287287233);
        setField(term1544, term1544.getClass(), "jsType", null);
        setField(term1544, term1544.getClass(), "parent", null);
        term1571 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1544;
        args[1] = term1571;
        try {
            callMethod(klass, "check", argTypes, term1490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


