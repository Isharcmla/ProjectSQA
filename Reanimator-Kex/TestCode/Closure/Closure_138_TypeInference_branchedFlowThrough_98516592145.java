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
import java.lang.String;

public class TypeInference_branchedFlowThrough_98516592145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1657;
     Object term1742;

    public TypeInference_branchedFlowThrough_98516592145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1660 = new HashMap();
        HashMap term1669 = new HashMap();
        Set<Object> term22053 =  ((Map) term1669).keySet();
        HashSet term1668 = new HashSet((Collection<? extends Object>) term22053);
        HashMap term1676 = new HashMap();
        Set<Object> term22054 =  ((Map) term1676).keySet();
        HashSet term1675 = new HashSet((Collection<? extends Object>) term22054);
        HashMap term1683 = new HashMap();
        Set<Object> term22055 =  ((Map) term1683).keySet();
        HashSet term1682 = new HashSet((Collection<? extends Object>) term22055);
        HashMap term1688 = new HashMap();
        HashMap term1693 = new HashMap();
        Class<? extends Object> term22077 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term22076 = ((Class) term22077).getDeclaredField((String) "PUBLIC");
        ((Field) term22076).setAccessible(true);
        Object enum51 = ((Field) term22076).get((Object) null);
        term1657 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1659 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term1714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1728 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1729 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1730 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1735 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term1657, term1657.getClass(), "compiler", null);
        setField(term1658, term1658.getClass(), "reporter", null);
        setField(term1658, term1658.getClass(), "nativeTypes", term1659);
        setField(term1658, term1658.getClass(), "namesToTypes", term1660);
        setField(term1658, term1658.getClass(), "namespaces", term1668);
        setField(term1658, term1658.getClass(), "enumTypeNames", term1675);
        setField(term1658, term1658.getClass(), "forwardDeclaredTypes", term1682);
        setField(term1658, term1658.getClass(), "typesIndexedByProperty", term1688);
        setField(term1658, term1658.getClass(), "greatestSubtypeByProperty", term1693);
        setField(term1658, term1658.getClass(), "interfaceToImplementors", null);
        setField(term1658, term1658.getClass(), "unresolvedNamedTypes", null);
        setField(term1658, term1658.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1658, term1658.getClass(), "lastGeneration", true);
        setField(term1658, term1658.getClass(), "templateTypeName", "cAPeiZHKGJ");
        setField(term1714, term1714.getClass(), "name", "LvJFtLBaxj");
        setField(term1714, term1714.getClass(), "referencedType", null);
        setBooleanField(term1714, term1714.getClass(), "visited", true);
        setField(term1729, term1729.getClass(), "baseType", null);
        setField(term1729, term1729.getClass(), "implementedInterfaces", null);
        setField(term1729, term1729.getClass(), "parameters", null);
        setField(term1729, term1729.getClass(), "thrownTypes", null);
        setField(term1729, term1729.getClass(), "templateTypeName", null);
        setField(term1729, term1729.getClass(), "description", null);
        setField(term1729, term1729.getClass(), "deprecated", null);
        setField(term1729, term1729.getClass(), "license", null);
        setField(term1729, term1729.getClass(), "suppressions", null);
        setField(term1728, term1728.getClass(), "info", term1729);
        setField(term1730, term1730.getClass(), "markers", null);
        setField(term1730, term1730.getClass(), "parameters", null);
        setField(term1730, term1730.getClass(), "throwsDescriptions", null);
        setField(term1730, term1730.getClass(), "blockDescription", null);
        setField(term1730, term1730.getClass(), "fileOverview", null);
        setField(term1730, term1730.getClass(), "returnDescription", null);
        setField(term1730, term1730.getClass(), "version", null);
        setField(term1730, term1730.getClass(), "authors", null);
        setField(term1730, term1730.getClass(), "sees", null);
        setField(term1728, term1728.getClass(), "documentation", term1730);
        setField(term1728, term1728.getClass(), "sourceName", "");
        setField(term1728, term1728.getClass(), "visibility", enum51);
        setIntField(term1728, term1728.getClass(), "bitset", -1588772968);
        setField(term1735, term1735.getClass(), "root", null);
        setField(term1735, term1735.getClass(), "sourceName", null);
        setField(term1735, term1735.getClass(), "registry", null);
        setField(term1728, term1728.getClass(), "type", term1735);
        setField(term1736, term1736.getClass(), "root", null);
        setField(term1736, term1736.getClass(), "sourceName", null);
        setField(term1736, term1736.getClass(), "registry", null);
        setField(term1728, term1728.getClass(), "thisType", term1736);
        setBooleanField(term1728, term1728.getClass(), "includeDocumentation", true);
        setField(term1714, term1714.getClass(), "docInfo", term1728);
        setBooleanField(term1714, term1714.getClass(), "unknown", true);
        setBooleanField(term1714, term1714.getClass(), "resolved", true);
        setField(term1714, term1714.getClass(), "resolveResult", null);
        setField(term1714, term1714.getClass(), "registry", null);
        setField(term1658, term1658.getClass(), "templateType", term1714);
        setField(term1657, term1657.getClass(), "registry", term1658);
        setField(term1657, term1657.getClass(), "reverseInterpreter", null);
        setField(term1740, term1740.getClass(), "vars", null);
        setField(term1740, term1740.getClass(), "parent", null);
        setField(term1740, term1740.getClass(), "rootNode", null);
        setField(term1740, term1740.getClass(), "thisType", null);
        setBooleanField(term1740, term1740.getClass(), "isBottom", false);
        setField(term1657, term1657.getClass(), "syntacticScope", term1740);
        setField(term1657, term1657.getClass(), "functionScope", null);
        setField(term1657, term1657.getClass(), "bottomScope", null);
        setField(term1657, term1657.getClass(), "assignedOuterLocalVars", null);
        setField(term1657, term1657.getClass(), "unflowableVarNames", null);
        setField(term1657, term1657.getClass(), "cfg", null);
        setField(term1657, term1657.getClass(), "joinOp", null);
        setField(term1657, term1657.getClass(), "orderedWorkSet", null);
        term1742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1755 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1742, term1742.getClass(), "type", 962840079);
        setIntField(term1744, term1744.getClass(), "type", 1551099402);
        setIntField(term1746, term1746.getClass(), "type", 0);
        setField(term1746, term1746.getClass(), "next", null);
        setField(term1746, term1746.getClass(), "first", null);
        setField(term1746, term1746.getClass(), "last", null);
        setField(term1746, term1746.getClass(), "propListHead", null);
        setIntField(term1746, term1746.getClass(), "sourcePosition", 0);
        setField(term1746, term1746.getClass(), "jsType", null);
        setField(term1746, term1746.getClass(), "parent", null);
        setField(term1744, term1744.getClass(), "next", term1746);
        setIntField(term1749, term1749.getClass(), "type", 0);
        setField(term1749, term1749.getClass(), "next", null);
        setField(term1749, term1749.getClass(), "first", null);
        setField(term1749, term1749.getClass(), "last", null);
        setField(term1749, term1749.getClass(), "propListHead", null);
        setIntField(term1749, term1749.getClass(), "sourcePosition", 0);
        setField(term1749, term1749.getClass(), "jsType", null);
        setField(term1749, term1749.getClass(), "parent", null);
        setField(term1744, term1744.getClass(), "first", term1749);
        setIntField(term1752, term1752.getClass(), "type", 0);
        setField(term1752, term1752.getClass(), "next", null);
        setField(term1752, term1752.getClass(), "first", null);
        setField(term1752, term1752.getClass(), "last", null);
        setField(term1752, term1752.getClass(), "propListHead", null);
        setIntField(term1752, term1752.getClass(), "sourcePosition", 0);
        setField(term1752, term1752.getClass(), "jsType", null);
        setField(term1752, term1752.getClass(), "parent", null);
        setField(term1744, term1744.getClass(), "last", term1752);
        setField(term1755, term1755.getClass(), "next", null);
        setIntField(term1755, term1755.getClass(), "type", 0);
        setIntField(term1755, term1755.getClass(), "intValue", 0);
        setField(term1755, term1755.getClass(), "objectValue", null);
        setField(term1744, term1744.getClass(), "propListHead", term1755);
        setIntField(term1744, term1744.getClass(), "sourcePosition", 1375330971);
        setField(term1744, term1744.getClass(), "jsType", null);
        setField(term1744, term1744.getClass(), "parent", null);
        setField(term1742, term1742.getClass(), "next", term1744);
        setIntField(term1759, term1759.getClass(), "type", 0);
        setField(term1759, term1759.getClass(), "next", null);
        setField(term1759, term1759.getClass(), "first", null);
        setField(term1759, term1759.getClass(), "last", null);
        setField(term1759, term1759.getClass(), "propListHead", null);
        setIntField(term1759, term1759.getClass(), "sourcePosition", 0);
        setField(term1759, term1759.getClass(), "jsType", null);
        setField(term1759, term1759.getClass(), "parent", null);
        setField(term1742, term1742.getClass(), "first", term1759);
        setIntField(term1762, term1762.getClass(), "type", 0);
        setField(term1762, term1762.getClass(), "next", null);
        setField(term1762, term1762.getClass(), "first", null);
        setField(term1762, term1762.getClass(), "last", null);
        setField(term1762, term1762.getClass(), "propListHead", null);
        setIntField(term1762, term1762.getClass(), "sourcePosition", 0);
        setField(term1762, term1762.getClass(), "jsType", null);
        setField(term1762, term1762.getClass(), "parent", null);
        setField(term1742, term1742.getClass(), "last", term1762);
        setField(term1765, term1765.getClass(), "next", null);
        setIntField(term1765, term1765.getClass(), "type", 0);
        setIntField(term1765, term1765.getClass(), "intValue", 0);
        setField(term1765, term1765.getClass(), "objectValue", null);
        setField(term1742, term1742.getClass(), "propListHead", term1765);
        setIntField(term1742, term1742.getClass(), "sourcePosition", -478195677);
        setField(term1742, term1742.getClass(), "jsType", null);
        setField(term1742, term1742.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1742;
        args[1] = null;
        try {
            callMethod(klass, "branchedFlowThrough", argTypes, term1657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


