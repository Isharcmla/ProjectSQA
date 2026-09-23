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

public class TypeInference_traverseCall_96521443663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650;
     Object term1705;

    public TypeInference_traverseCall_96521443663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1653 = new HashMap();
        HashMap term1662 = new HashMap();
        Set<Object> term13993 =  ((Map) term1662).keySet();
        HashSet term1661 = new HashSet((Collection<? extends Object>) term13993);
        HashMap term1669 = new HashMap();
        Set<Object> term13994 =  ((Map) term1669).keySet();
        HashSet term1668 = new HashSet((Collection<? extends Object>) term13994);
        HashMap term1676 = new HashMap();
        Set<Object> term13995 =  ((Map) term1676).keySet();
        HashSet term1675 = new HashSet((Collection<? extends Object>) term13995);
        HashMap term1682 = new HashMap();
        HashMap term1690 = new HashMap();
        HashMap term1695 = new HashMap();
        term1650 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1652 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term1650, term1650.getClass(), "compiler", null);
        setField(term1651, term1651.getClass(), "reporter", null);
        setField(term1651, term1651.getClass(), "nativeTypes", term1652);
        setField(term1651, term1651.getClass(), "namesToTypes", term1653);
        setField(term1651, term1651.getClass(), "namespaces", term1661);
        setField(term1651, term1651.getClass(), "nonNullableTypeNames", term1668);
        setField(term1651, term1651.getClass(), "forwardDeclaredTypes", term1675);
        setField(term1651, term1651.getClass(), "typesIndexedByProperty", term1682);
        setField(term1651, term1651.getClass(), "eachRefTypeIndexedByProperty", term1690);
        setField(term1651, term1651.getClass(), "greatestSubtypeByProperty", term1695);
        setField(term1651, term1651.getClass(), "interfaceToImplementors", null);
        setField(term1651, term1651.getClass(), "unresolvedNamedTypes", null);
        setField(term1651, term1651.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1651, term1651.getClass(), "lastGeneration", false);
        setField(term1651, term1651.getClass(), "templateTypeName", null);
        setField(term1651, term1651.getClass(), "templateType", null);
        setBooleanField(term1651, term1651.getClass(), "tolerateUndefinedValues", false);
        setField(term1651, term1651.getClass(), "resolveMode", null);
        setField(term1650, term1650.getClass(), "registry", term1651);
        setField(term1650, term1650.getClass(), "reverseInterpreter", null);
        setField(term1650, term1650.getClass(), "syntacticScope", null);
        setField(term1650, term1650.getClass(), "functionScope", null);
        setField(term1650, term1650.getClass(), "bottomScope", null);
        setField(term1650, term1650.getClass(), "assertionFunctionsMap", null);
        setField(term1650, term1650.getClass(), "cfg", null);
        setField(term1650, term1650.getClass(), "joinOp", null);
        setField(term1650, term1650.getClass(), "orderedWorkSet", null);
        term1705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1705, term1705.getClass(), "type", 1743224434);
        setIntField(term1707, term1707.getClass(), "type", 842904495);
        setIntField(term1709, term1709.getClass(), "type", 1008080511);
        setIntField(term1711, term1711.getClass(), "type", 1935707624);
        setIntField(term1713, term1713.getClass(), "type", 1507074215);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", null);
        setField(term1713, term1713.getClass(), "last", null);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1711, term1711.getClass(), "next", term1713);
        setIntField(term1716, term1716.getClass(), "type", -282881827);
        setField(term1716, term1716.getClass(), "next", null);
        setField(term1716, term1716.getClass(), "first", null);
        setField(term1716, term1716.getClass(), "last", term1713);
        setField(term1716, term1716.getClass(), "propListHead", null);
        setIntField(term1716, term1716.getClass(), "sourcePosition", 0);
        setField(term1716, term1716.getClass(), "jsType", null);
        setField(term1716, term1716.getClass(), "parent", null);
        setField(term1711, term1711.getClass(), "first", term1716);
        setField(term1711, term1711.getClass(), "last", term1709);
        setField(term1711, term1711.getClass(), "propListHead", null);
        setIntField(term1711, term1711.getClass(), "sourcePosition", 0);
        setField(term1711, term1711.getClass(), "jsType", null);
        setField(term1711, term1711.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "next", term1711);
        setField(term1709, term1709.getClass(), "first", term1713);
        setIntField(term1720, term1720.getClass(), "type", -420030135);
        setIntField(term1722, term1722.getClass(), "type", 267763294);
        setField(term1722, term1722.getClass(), "next", null);
        setField(term1722, term1722.getClass(), "first", term1716);
        setField(term1722, term1722.getClass(), "last", term1711);
        setField(term1722, term1722.getClass(), "propListHead", null);
        setIntField(term1722, term1722.getClass(), "sourcePosition", 0);
        setField(term1722, term1722.getClass(), "jsType", null);
        setField(term1722, term1722.getClass(), "parent", null);
        setField(term1720, term1720.getClass(), "next", term1722);
        setField(term1720, term1720.getClass(), "first", term1707);
        setField(term1720, term1720.getClass(), "last", term1707);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "last", term1720);
        setField(term1709, term1709.getClass(), "propListHead", null);
        setIntField(term1709, term1709.getClass(), "sourcePosition", 0);
        setField(term1709, term1709.getClass(), "jsType", null);
        setField(term1709, term1709.getClass(), "parent", null);
        setField(term1707, term1707.getClass(), "next", term1709);
        setIntField(term1727, term1727.getClass(), "type", -1497710478);
        setField(term1727, term1727.getClass(), "next", term1720);
        setField(term1727, term1727.getClass(), "first", term1722);
        setField(term1727, term1727.getClass(), "last", term1705);
        setField(term1727, term1727.getClass(), "propListHead", null);
        setIntField(term1727, term1727.getClass(), "sourcePosition", 0);
        setField(term1727, term1727.getClass(), "jsType", null);
        setField(term1727, term1727.getClass(), "parent", null);
        setField(term1707, term1707.getClass(), "first", term1727);
        setField(term1707, term1707.getClass(), "last", term1727);
        setField(term1707, term1707.getClass(), "propListHead", null);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 0);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "next", term1707);
        setField(term1705, term1705.getClass(), "first", term1711);
        setField(term1705, term1705.getClass(), "last", term1713);
        setField(term1705, term1705.getClass(), "propListHead", null);
        setIntField(term1705, term1705.getClass(), "sourcePosition", 0);
        setField(term1705, term1705.getClass(), "jsType", null);
        setField(term1705, term1705.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1705;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term1650, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


