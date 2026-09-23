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

public class TypeInference_traverseHook_7360896962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;
     Object term1620;

    public TypeInference_traverseHook_7360896962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1570 = new HashMap();
        HashMap term1579 = new HashMap();
        Set<Object> term13510 =  ((Map) term1579).keySet();
        HashSet term1578 = new HashSet((Collection<? extends Object>) term13510);
        HashMap term1586 = new HashMap();
        Set<Object> term13511 =  ((Map) term1586).keySet();
        HashSet term1585 = new HashSet((Collection<? extends Object>) term13511);
        HashMap term1592 = new HashMap();
        Set<Object> term13512 =  ((Map) term1592).keySet();
        HashSet term1591 = new HashSet((Collection<? extends Object>) term13512);
        HashMap term1597 = new HashMap();
        HashMap term1605 = new HashMap();
        HashMap term1610 = new HashMap();
        term1567 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1568 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1569 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        setField(term1567, term1567.getClass(), "compiler", null);
        setField(term1568, term1568.getClass(), "reporter", null);
        setField(term1568, term1568.getClass(), "nativeTypes", term1569);
        setField(term1568, term1568.getClass(), "namesToTypes", term1570);
        setField(term1568, term1568.getClass(), "namespaces", term1578);
        setField(term1568, term1568.getClass(), "nonNullableTypeNames", term1585);
        setField(term1568, term1568.getClass(), "forwardDeclaredTypes", term1591);
        setField(term1568, term1568.getClass(), "typesIndexedByProperty", term1597);
        setField(term1568, term1568.getClass(), "eachRefTypeIndexedByProperty", term1605);
        setField(term1568, term1568.getClass(), "greatestSubtypeByProperty", term1610);
        setField(term1568, term1568.getClass(), "interfaceToImplementors", null);
        setField(term1568, term1568.getClass(), "unresolvedNamedTypes", null);
        setField(term1568, term1568.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1568, term1568.getClass(), "lastGeneration", false);
        setField(term1568, term1568.getClass(), "templateTypeName", null);
        setField(term1568, term1568.getClass(), "templateType", null);
        setBooleanField(term1568, term1568.getClass(), "tolerateUndefinedValues", false);
        setField(term1568, term1568.getClass(), "resolveMode", null);
        setField(term1567, term1567.getClass(), "registry", term1568);
        setField(term1567, term1567.getClass(), "reverseInterpreter", null);
        setField(term1567, term1567.getClass(), "syntacticScope", null);
        setField(term1567, term1567.getClass(), "functionScope", null);
        setField(term1567, term1567.getClass(), "bottomScope", null);
        setField(term1567, term1567.getClass(), "assertionFunctionsMap", null);
        setField(term1567, term1567.getClass(), "cfg", null);
        setField(term1567, term1567.getClass(), "joinOp", null);
        setField(term1567, term1567.getClass(), "orderedWorkSet", null);
        term1620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1620, term1620.getClass(), "type", -542712742);
        setIntField(term1622, term1622.getClass(), "type", -1254072822);
        setIntField(term1624, term1624.getClass(), "type", -1111249833);
        setIntField(term1626, term1626.getClass(), "type", -1692331299);
        setIntField(term1628, term1628.getClass(), "type", 479531250);
        setField(term1628, term1628.getClass(), "next", null);
        setField(term1628, term1628.getClass(), "first", null);
        setField(term1628, term1628.getClass(), "last", null);
        setField(term1628, term1628.getClass(), "propListHead", null);
        setIntField(term1628, term1628.getClass(), "sourcePosition", 0);
        setField(term1628, term1628.getClass(), "jsType", null);
        setField(term1628, term1628.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "next", term1628);
        setIntField(term1631, term1631.getClass(), "type", 1320570890);
        setField(term1631, term1631.getClass(), "next", null);
        setField(term1631, term1631.getClass(), "first", null);
        setField(term1631, term1631.getClass(), "last", term1628);
        setField(term1631, term1631.getClass(), "propListHead", null);
        setIntField(term1631, term1631.getClass(), "sourcePosition", 0);
        setField(term1631, term1631.getClass(), "jsType", null);
        setField(term1631, term1631.getClass(), "parent", null);
        setField(term1626, term1626.getClass(), "first", term1631);
        setField(term1626, term1626.getClass(), "last", term1624);
        setField(term1626, term1626.getClass(), "propListHead", null);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 0);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "next", term1626);
        setField(term1624, term1624.getClass(), "first", term1628);
        setIntField(term1635, term1635.getClass(), "type", 534834644);
        setIntField(term1637, term1637.getClass(), "type", 1959097203);
        setField(term1637, term1637.getClass(), "next", null);
        setField(term1637, term1637.getClass(), "first", term1631);
        setField(term1637, term1637.getClass(), "last", term1626);
        setField(term1637, term1637.getClass(), "propListHead", null);
        setIntField(term1637, term1637.getClass(), "sourcePosition", 0);
        setField(term1637, term1637.getClass(), "jsType", null);
        setField(term1637, term1637.getClass(), "parent", null);
        setField(term1635, term1635.getClass(), "next", term1637);
        setField(term1635, term1635.getClass(), "first", term1622);
        setField(term1635, term1635.getClass(), "last", term1622);
        setField(term1635, term1635.getClass(), "propListHead", null);
        setIntField(term1635, term1635.getClass(), "sourcePosition", 0);
        setField(term1635, term1635.getClass(), "jsType", null);
        setField(term1635, term1635.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "last", term1635);
        setField(term1624, term1624.getClass(), "propListHead", null);
        setIntField(term1624, term1624.getClass(), "sourcePosition", 0);
        setField(term1624, term1624.getClass(), "jsType", null);
        setField(term1624, term1624.getClass(), "parent", null);
        setField(term1622, term1622.getClass(), "next", term1624);
        setIntField(term1642, term1642.getClass(), "type", -209654048);
        setField(term1642, term1642.getClass(), "next", term1635);
        setField(term1642, term1642.getClass(), "first", term1637);
        setField(term1642, term1642.getClass(), "last", term1620);
        setField(term1642, term1642.getClass(), "propListHead", null);
        setIntField(term1642, term1642.getClass(), "sourcePosition", 0);
        setField(term1642, term1642.getClass(), "jsType", null);
        setField(term1642, term1642.getClass(), "parent", null);
        setField(term1622, term1622.getClass(), "first", term1642);
        setField(term1622, term1622.getClass(), "last", term1642);
        setField(term1622, term1622.getClass(), "propListHead", null);
        setIntField(term1622, term1622.getClass(), "sourcePosition", 0);
        setField(term1622, term1622.getClass(), "jsType", null);
        setField(term1622, term1622.getClass(), "parent", null);
        setField(term1620, term1620.getClass(), "next", term1622);
        setField(term1620, term1620.getClass(), "first", term1626);
        setField(term1620, term1620.getClass(), "last", term1628);
        setField(term1620, term1620.getClass(), "propListHead", null);
        setIntField(term1620, term1620.getClass(), "sourcePosition", 0);
        setField(term1620, term1620.getClass(), "jsType", null);
        setField(term1620, term1620.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1620;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term1567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


