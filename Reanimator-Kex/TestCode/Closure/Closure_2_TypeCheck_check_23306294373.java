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

public class TypeCheck_check_23306294373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1544;
     Object term1598;
     Object term1625;

    public TypeCheck_check_23306294373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1548 = new HashMap();
        HashMap term1555 = new HashMap();
        Set<Object> term16488 =  ((Map) term1555).keySet();
        HashSet term1554 = new HashSet((Collection<? extends Object>) term16488);
        HashMap term1561 = new HashMap();
        Set<Object> term16489 =  ((Map) term1561).keySet();
        HashSet term1560 = new HashSet((Collection<? extends Object>) term16489);
        HashMap term1567 = new HashMap();
        Set<Object> term16490 =  ((Map) term1567).keySet();
        HashSet term1566 = new HashSet((Collection<? extends Object>) term16490);
        HashMap term1572 = new HashMap();
        HashMap term1578 = new HashMap();
        HashMap term1583 = new HashMap();
        term1544 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term1545 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1547 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term1544, term1544.getClass(), "compiler", null);
        setField(term1545, term1545.getClass(), "compiler", null);
        setField(term1546, term1546.getClass(), "reporter", null);
        setField(term1546, term1546.getClass(), "nativeTypes", term1547);
        setField(term1546, term1546.getClass(), "namesToTypes", term1548);
        setField(term1546, term1546.getClass(), "namespaces", term1554);
        setField(term1546, term1546.getClass(), "nonNullableTypeNames", term1560);
        setField(term1546, term1546.getClass(), "forwardDeclaredTypes", term1566);
        setField(term1546, term1546.getClass(), "typesIndexedByProperty", term1572);
        setField(term1546, term1546.getClass(), "eachRefTypeIndexedByProperty", term1578);
        setField(term1546, term1546.getClass(), "greatestSubtypeByProperty", term1583);
        setField(term1546, term1546.getClass(), "interfaceToImplementors", null);
        setField(term1546, term1546.getClass(), "unresolvedNamedTypes", null);
        setField(term1546, term1546.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1546, term1546.getClass(), "lastGeneration", false);
        setField(term1546, term1546.getClass(), "templateTypes", null);
        setBooleanField(term1546, term1546.getClass(), "tolerateUndefinedValues", false);
        setField(term1546, term1546.getClass(), "resolveMode", null);
        setField(term1545, term1545.getClass(), "typeRegistry", term1546);
        setField(term1545, term1545.getClass(), "allValueTypes", null);
        setBooleanField(term1545, term1545.getClass(), "shouldReport", false);
        setField(term1545, term1545.getClass(), "nullOrUndefined", null);
        setField(term1545, term1545.getClass(), "mismatches", null);
        setField(term1544, term1544.getClass(), "validator", term1545);
        setField(term1544, term1544.getClass(), "reverseInterpreter", null);
        setField(term1544, term1544.getClass(), "typeRegistry", null);
        setField(term1544, term1544.getClass(), "topScope", null);
        setField(term1544, term1544.getClass(), "scopeCreator", null);
        setField(term1544, term1544.getClass(), "reportMissingOverride", null);
        setField(term1544, term1544.getClass(), "reportUnknownTypes", null);
        setBooleanField(term1544, term1544.getClass(), "reportMissingProperties", false);
        setField(term1544, term1544.getClass(), "inferJSDocInfo", null);
        setIntField(term1544, term1544.getClass(), "typedCount", 0);
        setIntField(term1544, term1544.getClass(), "nullCount", 0);
        setIntField(term1544, term1544.getClass(), "unknownCount", 0);
        setBooleanField(term1544, term1544.getClass(), "inExterns", false);
        setIntField(term1544, term1544.getClass(), "noTypeCheckSection", 0);
        term1598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1598, term1598.getClass(), "type", -505439934);
        setIntField(term1600, term1600.getClass(), "type", -344842608);
        setIntField(term1602, term1602.getClass(), "type", 941650513);
        setIntField(term1604, term1604.getClass(), "type", 444029505);
        setIntField(term1606, term1606.getClass(), "type", -1034506028);
        setField(term1606, term1606.getClass(), "next", null);
        setField(term1606, term1606.getClass(), "first", null);
        setField(term1606, term1606.getClass(), "last", null);
        setField(term1606, term1606.getClass(), "propListHead", null);
        setIntField(term1606, term1606.getClass(), "sourcePosition", 0);
        setField(term1606, term1606.getClass(), "jsType", null);
        setField(term1606, term1606.getClass(), "parent", null);
        setField(term1604, term1604.getClass(), "next", term1606);
        setIntField(term1609, term1609.getClass(), "type", -1263114719);
        setField(term1609, term1609.getClass(), "next", null);
        setField(term1609, term1609.getClass(), "first", null);
        setField(term1609, term1609.getClass(), "last", term1606);
        setField(term1609, term1609.getClass(), "propListHead", null);
        setIntField(term1609, term1609.getClass(), "sourcePosition", 0);
        setField(term1609, term1609.getClass(), "jsType", null);
        setField(term1609, term1609.getClass(), "parent", null);
        setField(term1604, term1604.getClass(), "first", term1609);
        setField(term1604, term1604.getClass(), "last", term1602);
        setField(term1604, term1604.getClass(), "propListHead", null);
        setIntField(term1604, term1604.getClass(), "sourcePosition", 0);
        setField(term1604, term1604.getClass(), "jsType", null);
        setField(term1604, term1604.getClass(), "parent", null);
        setField(term1602, term1602.getClass(), "next", term1604);
        setField(term1602, term1602.getClass(), "first", term1606);
        setIntField(term1613, term1613.getClass(), "type", 304775596);
        setIntField(term1615, term1615.getClass(), "type", -1347665717);
        setField(term1615, term1615.getClass(), "next", null);
        setField(term1615, term1615.getClass(), "first", term1609);
        setField(term1615, term1615.getClass(), "last", term1604);
        setField(term1615, term1615.getClass(), "propListHead", null);
        setIntField(term1615, term1615.getClass(), "sourcePosition", 0);
        setField(term1615, term1615.getClass(), "jsType", null);
        setField(term1615, term1615.getClass(), "parent", null);
        setField(term1613, term1613.getClass(), "next", term1615);
        setField(term1613, term1613.getClass(), "first", term1600);
        setField(term1613, term1613.getClass(), "last", term1600);
        setField(term1613, term1613.getClass(), "propListHead", null);
        setIntField(term1613, term1613.getClass(), "sourcePosition", 0);
        setField(term1613, term1613.getClass(), "jsType", null);
        setField(term1613, term1613.getClass(), "parent", null);
        setField(term1602, term1602.getClass(), "last", term1613);
        setField(term1602, term1602.getClass(), "propListHead", null);
        setIntField(term1602, term1602.getClass(), "sourcePosition", 0);
        setField(term1602, term1602.getClass(), "jsType", null);
        setField(term1602, term1602.getClass(), "parent", null);
        setField(term1600, term1600.getClass(), "next", term1602);
        setIntField(term1620, term1620.getClass(), "type", -1888585309);
        setField(term1620, term1620.getClass(), "next", term1613);
        setField(term1620, term1620.getClass(), "first", term1615);
        setField(term1620, term1620.getClass(), "last", term1598);
        setField(term1620, term1620.getClass(), "propListHead", null);
        setIntField(term1620, term1620.getClass(), "sourcePosition", 0);
        setField(term1620, term1620.getClass(), "jsType", null);
        setField(term1620, term1620.getClass(), "parent", null);
        setField(term1600, term1600.getClass(), "first", term1620);
        setField(term1600, term1600.getClass(), "last", term1620);
        setField(term1600, term1600.getClass(), "propListHead", null);
        setIntField(term1600, term1600.getClass(), "sourcePosition", 0);
        setField(term1600, term1600.getClass(), "jsType", null);
        setField(term1600, term1600.getClass(), "parent", null);
        setField(term1598, term1598.getClass(), "next", term1600);
        setField(term1598, term1598.getClass(), "first", term1604);
        setField(term1598, term1598.getClass(), "last", term1606);
        setField(term1598, term1598.getClass(), "propListHead", null);
        setIntField(term1598, term1598.getClass(), "sourcePosition", 0);
        setField(term1598, term1598.getClass(), "jsType", null);
        setField(term1598, term1598.getClass(), "parent", null);
        term1625 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1598;
        args[1] = term1625;
        try {
            callMethod(klass, "check", argTypes, term1544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


