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

public class TypeInference_tightenTypesAfterAssertions_99204947564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1735;
     Object term1790;

    public TypeInference_tightenTypesAfterAssertions_99204947564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1738 = new HashMap();
        HashMap term1747 = new HashMap();
        Set<Object> term14313 =  ((Map) term1747).keySet();
        HashSet term1746 = new HashSet((Collection<? extends Object>) term14313);
        HashMap term1754 = new HashMap();
        Set<Object> term14314 =  ((Map) term1754).keySet();
        HashSet term1753 = new HashSet((Collection<? extends Object>) term14314);
        HashMap term1761 = new HashMap();
        Set<Object> term14315 =  ((Map) term1761).keySet();
        HashSet term1760 = new HashSet((Collection<? extends Object>) term14315);
        HashMap term1767 = new HashMap();
        HashMap term1775 = new HashMap();
        HashMap term1780 = new HashMap();
        term1735 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1737 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term1735, term1735.getClass(), "compiler", null);
        setField(term1736, term1736.getClass(), "reporter", null);
        setField(term1736, term1736.getClass(), "nativeTypes", term1737);
        setField(term1736, term1736.getClass(), "namesToTypes", term1738);
        setField(term1736, term1736.getClass(), "namespaces", term1746);
        setField(term1736, term1736.getClass(), "nonNullableTypeNames", term1753);
        setField(term1736, term1736.getClass(), "forwardDeclaredTypes", term1760);
        setField(term1736, term1736.getClass(), "typesIndexedByProperty", term1767);
        setField(term1736, term1736.getClass(), "eachRefTypeIndexedByProperty", term1775);
        setField(term1736, term1736.getClass(), "greatestSubtypeByProperty", term1780);
        setField(term1736, term1736.getClass(), "interfaceToImplementors", null);
        setField(term1736, term1736.getClass(), "unresolvedNamedTypes", null);
        setField(term1736, term1736.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1736, term1736.getClass(), "lastGeneration", false);
        setField(term1736, term1736.getClass(), "templateTypeName", null);
        setField(term1736, term1736.getClass(), "templateType", null);
        setBooleanField(term1736, term1736.getClass(), "tolerateUndefinedValues", false);
        setField(term1736, term1736.getClass(), "resolveMode", null);
        setField(term1735, term1735.getClass(), "registry", term1736);
        setField(term1735, term1735.getClass(), "reverseInterpreter", null);
        setField(term1735, term1735.getClass(), "syntacticScope", null);
        setField(term1735, term1735.getClass(), "functionScope", null);
        setField(term1735, term1735.getClass(), "bottomScope", null);
        setField(term1735, term1735.getClass(), "assertionFunctionsMap", null);
        setField(term1735, term1735.getClass(), "cfg", null);
        setField(term1735, term1735.getClass(), "joinOp", null);
        setField(term1735, term1735.getClass(), "orderedWorkSet", null);
        term1790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1790, term1790.getClass(), "type", 2058711405);
        setIntField(term1792, term1792.getClass(), "type", 1743683601);
        setIntField(term1794, term1794.getClass(), "type", -945116798);
        setIntField(term1796, term1796.getClass(), "type", 1593461795);
        setIntField(term1798, term1798.getClass(), "type", 515182546);
        setField(term1798, term1798.getClass(), "next", null);
        setField(term1798, term1798.getClass(), "first", null);
        setField(term1798, term1798.getClass(), "last", null);
        setField(term1798, term1798.getClass(), "propListHead", null);
        setIntField(term1798, term1798.getClass(), "sourcePosition", 0);
        setField(term1798, term1798.getClass(), "jsType", null);
        setField(term1798, term1798.getClass(), "parent", null);
        setField(term1796, term1796.getClass(), "next", term1798);
        setIntField(term1801, term1801.getClass(), "type", -936895502);
        setField(term1801, term1801.getClass(), "next", null);
        setField(term1801, term1801.getClass(), "first", null);
        setField(term1801, term1801.getClass(), "last", term1798);
        setField(term1801, term1801.getClass(), "propListHead", null);
        setIntField(term1801, term1801.getClass(), "sourcePosition", 0);
        setField(term1801, term1801.getClass(), "jsType", null);
        setField(term1801, term1801.getClass(), "parent", null);
        setField(term1796, term1796.getClass(), "first", term1801);
        setField(term1796, term1796.getClass(), "last", term1794);
        setField(term1796, term1796.getClass(), "propListHead", null);
        setIntField(term1796, term1796.getClass(), "sourcePosition", 0);
        setField(term1796, term1796.getClass(), "jsType", null);
        setField(term1796, term1796.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "next", term1796);
        setField(term1794, term1794.getClass(), "first", term1798);
        setIntField(term1805, term1805.getClass(), "type", 199287428);
        setIntField(term1807, term1807.getClass(), "type", -1195339592);
        setField(term1807, term1807.getClass(), "next", null);
        setField(term1807, term1807.getClass(), "first", term1801);
        setField(term1807, term1807.getClass(), "last", term1796);
        setField(term1807, term1807.getClass(), "propListHead", null);
        setIntField(term1807, term1807.getClass(), "sourcePosition", 0);
        setField(term1807, term1807.getClass(), "jsType", null);
        setField(term1807, term1807.getClass(), "parent", null);
        setField(term1805, term1805.getClass(), "next", term1807);
        setField(term1805, term1805.getClass(), "first", term1792);
        setField(term1805, term1805.getClass(), "last", term1792);
        setField(term1805, term1805.getClass(), "propListHead", null);
        setIntField(term1805, term1805.getClass(), "sourcePosition", 0);
        setField(term1805, term1805.getClass(), "jsType", null);
        setField(term1805, term1805.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "last", term1805);
        setField(term1794, term1794.getClass(), "propListHead", null);
        setIntField(term1794, term1794.getClass(), "sourcePosition", 0);
        setField(term1794, term1794.getClass(), "jsType", null);
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "next", term1794);
        setIntField(term1812, term1812.getClass(), "type", -376422566);
        setField(term1812, term1812.getClass(), "next", term1805);
        setField(term1812, term1812.getClass(), "first", term1807);
        setField(term1812, term1812.getClass(), "last", term1790);
        setField(term1812, term1812.getClass(), "propListHead", null);
        setIntField(term1812, term1812.getClass(), "sourcePosition", 0);
        setField(term1812, term1812.getClass(), "jsType", null);
        setField(term1812, term1812.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "first", term1812);
        setField(term1792, term1792.getClass(), "last", term1812);
        setField(term1792, term1792.getClass(), "propListHead", null);
        setIntField(term1792, term1792.getClass(), "sourcePosition", 0);
        setField(term1792, term1792.getClass(), "jsType", null);
        setField(term1792, term1792.getClass(), "parent", null);
        setField(term1790, term1790.getClass(), "next", term1792);
        setField(term1790, term1790.getClass(), "first", term1796);
        setField(term1790, term1790.getClass(), "last", term1798);
        setField(term1790, term1790.getClass(), "propListHead", null);
        setIntField(term1790, term1790.getClass(), "sourcePosition", 0);
        setField(term1790, term1790.getClass(), "jsType", null);
        setField(term1790, term1790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1790;
        try {
            callMethod(klass, "tightenTypesAfterAssertions", argTypes, term1735, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


