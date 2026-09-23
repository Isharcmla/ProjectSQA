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
import java.lang.String;

public class TypeInference_getJSType_17891477976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15724;
     Object term15810;

    public TypeInference_getJSType_17891477976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15727 = new HashMap();
        HashMap term15736 = new HashMap();
        Set<Object> term50018 =  ((Map) term15736).keySet();
        HashSet term15735 = new HashSet((Collection<? extends Object>) term50018);
        HashMap term15743 = new HashMap();
        Set<Object> term50019 =  ((Map) term15743).keySet();
        HashSet term15742 = new HashSet((Collection<? extends Object>) term50019);
        HashMap term15750 = new HashMap();
        Set<Object> term50020 =  ((Map) term15750).keySet();
        HashSet term15749 = new HashSet((Collection<? extends Object>) term50020);
        HashMap term15756 = new HashMap();
        HashMap term15761 = new HashMap();
        Class<? extends Object> term50042 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term50041 = ((Class) term50042).getDeclaredField((String) "PROTECTED");
        ((Field) term50041).setAccessible(true);
        Object enum114 = ((Field) term50041).get((Object) null);
        term15724 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term15725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15726 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term15782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15796 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15798 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15803 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15804 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15808 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15724, term15724.getClass(), "compiler", null);
        setField(term15725, term15725.getClass(), "reporter", null);
        setField(term15725, term15725.getClass(), "nativeTypes", term15726);
        setField(term15725, term15725.getClass(), "namesToTypes", term15727);
        setField(term15725, term15725.getClass(), "namespaces", term15735);
        setField(term15725, term15725.getClass(), "enumTypeNames", term15742);
        setField(term15725, term15725.getClass(), "forwardDeclaredTypes", term15749);
        setField(term15725, term15725.getClass(), "typesIndexedByProperty", term15756);
        setField(term15725, term15725.getClass(), "greatestSubtypeByProperty", term15761);
        setField(term15725, term15725.getClass(), "interfaceToImplementors", null);
        setField(term15725, term15725.getClass(), "unresolvedNamedTypes", null);
        setField(term15725, term15725.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15725, term15725.getClass(), "lastGeneration", true);
        setField(term15725, term15725.getClass(), "templateTypeName", "pDqgDbJoFw");
        setField(term15782, term15782.getClass(), "name", "iVOvTzOxwt");
        setField(term15782, term15782.getClass(), "referencedType", null);
        setBooleanField(term15782, term15782.getClass(), "visited", false);
        setField(term15797, term15797.getClass(), "baseType", null);
        setField(term15797, term15797.getClass(), "implementedInterfaces", null);
        setField(term15797, term15797.getClass(), "parameters", null);
        setField(term15797, term15797.getClass(), "thrownTypes", null);
        setField(term15797, term15797.getClass(), "templateTypeName", null);
        setField(term15797, term15797.getClass(), "description", null);
        setField(term15797, term15797.getClass(), "deprecated", null);
        setField(term15797, term15797.getClass(), "license", null);
        setField(term15797, term15797.getClass(), "suppressions", null);
        setField(term15796, term15796.getClass(), "info", term15797);
        setField(term15798, term15798.getClass(), "markers", null);
        setField(term15798, term15798.getClass(), "parameters", null);
        setField(term15798, term15798.getClass(), "throwsDescriptions", null);
        setField(term15798, term15798.getClass(), "blockDescription", null);
        setField(term15798, term15798.getClass(), "fileOverview", null);
        setField(term15798, term15798.getClass(), "returnDescription", null);
        setField(term15798, term15798.getClass(), "version", null);
        setField(term15798, term15798.getClass(), "authors", null);
        setField(term15798, term15798.getClass(), "sees", null);
        setField(term15796, term15796.getClass(), "documentation", term15798);
        setField(term15796, term15796.getClass(), "sourceName", "");
        setField(term15796, term15796.getClass(), "visibility", enum114);
        setIntField(term15796, term15796.getClass(), "bitset", 76650923);
        setField(term15803, term15803.getClass(), "root", null);
        setField(term15803, term15803.getClass(), "sourceName", null);
        setField(term15803, term15803.getClass(), "registry", null);
        setField(term15796, term15796.getClass(), "type", term15803);
        setField(term15804, term15804.getClass(), "root", null);
        setField(term15804, term15804.getClass(), "sourceName", null);
        setField(term15804, term15804.getClass(), "registry", null);
        setField(term15796, term15796.getClass(), "thisType", term15804);
        setBooleanField(term15796, term15796.getClass(), "includeDocumentation", true);
        setField(term15782, term15782.getClass(), "docInfo", term15796);
        setBooleanField(term15782, term15782.getClass(), "unknown", true);
        setBooleanField(term15782, term15782.getClass(), "resolved", true);
        setField(term15782, term15782.getClass(), "resolveResult", null);
        setField(term15782, term15782.getClass(), "registry", null);
        setField(term15725, term15725.getClass(), "templateType", term15782);
        setField(term15724, term15724.getClass(), "registry", term15725);
        setField(term15724, term15724.getClass(), "reverseInterpreter", null);
        setField(term15808, term15808.getClass(), "vars", null);
        setField(term15808, term15808.getClass(), "parent", null);
        setField(term15808, term15808.getClass(), "rootNode", null);
        setField(term15808, term15808.getClass(), "thisType", null);
        setBooleanField(term15808, term15808.getClass(), "isBottom", false);
        setField(term15724, term15724.getClass(), "syntacticScope", term15808);
        setField(term15724, term15724.getClass(), "functionScope", null);
        setField(term15724, term15724.getClass(), "bottomScope", null);
        setField(term15724, term15724.getClass(), "assignedOuterLocalVars", null);
        setField(term15724, term15724.getClass(), "unflowableVarNames", null);
        setField(term15724, term15724.getClass(), "cfg", null);
        setField(term15724, term15724.getClass(), "joinOp", null);
        setField(term15724, term15724.getClass(), "orderedWorkSet", null);
        term15810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15823 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15833 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15810, term15810.getClass(), "type", 1365087144);
        setIntField(term15812, term15812.getClass(), "type", -1252345779);
        setIntField(term15814, term15814.getClass(), "type", 0);
        setField(term15814, term15814.getClass(), "next", null);
        setField(term15814, term15814.getClass(), "first", null);
        setField(term15814, term15814.getClass(), "last", null);
        setField(term15814, term15814.getClass(), "propListHead", null);
        setIntField(term15814, term15814.getClass(), "sourcePosition", 0);
        setField(term15814, term15814.getClass(), "jsType", null);
        setField(term15814, term15814.getClass(), "parent", null);
        setField(term15812, term15812.getClass(), "next", term15814);
        setIntField(term15817, term15817.getClass(), "type", 0);
        setField(term15817, term15817.getClass(), "next", null);
        setField(term15817, term15817.getClass(), "first", null);
        setField(term15817, term15817.getClass(), "last", null);
        setField(term15817, term15817.getClass(), "propListHead", null);
        setIntField(term15817, term15817.getClass(), "sourcePosition", 0);
        setField(term15817, term15817.getClass(), "jsType", null);
        setField(term15817, term15817.getClass(), "parent", null);
        setField(term15812, term15812.getClass(), "first", term15817);
        setIntField(term15820, term15820.getClass(), "type", 0);
        setField(term15820, term15820.getClass(), "next", null);
        setField(term15820, term15820.getClass(), "first", null);
        setField(term15820, term15820.getClass(), "last", null);
        setField(term15820, term15820.getClass(), "propListHead", null);
        setIntField(term15820, term15820.getClass(), "sourcePosition", 0);
        setField(term15820, term15820.getClass(), "jsType", null);
        setField(term15820, term15820.getClass(), "parent", null);
        setField(term15812, term15812.getClass(), "last", term15820);
        setField(term15823, term15823.getClass(), "next", null);
        setIntField(term15823, term15823.getClass(), "type", 0);
        setIntField(term15823, term15823.getClass(), "intValue", 0);
        setField(term15823, term15823.getClass(), "objectValue", null);
        setField(term15812, term15812.getClass(), "propListHead", term15823);
        setIntField(term15812, term15812.getClass(), "sourcePosition", -1488938905);
        setField(term15812, term15812.getClass(), "jsType", null);
        setField(term15812, term15812.getClass(), "parent", null);
        setField(term15810, term15810.getClass(), "next", term15812);
        setIntField(term15827, term15827.getClass(), "type", 0);
        setField(term15827, term15827.getClass(), "next", null);
        setField(term15827, term15827.getClass(), "first", null);
        setField(term15827, term15827.getClass(), "last", null);
        setField(term15827, term15827.getClass(), "propListHead", null);
        setIntField(term15827, term15827.getClass(), "sourcePosition", 0);
        setField(term15827, term15827.getClass(), "jsType", null);
        setField(term15827, term15827.getClass(), "parent", null);
        setField(term15810, term15810.getClass(), "first", term15827);
        setIntField(term15830, term15830.getClass(), "type", 0);
        setField(term15830, term15830.getClass(), "next", null);
        setField(term15830, term15830.getClass(), "first", null);
        setField(term15830, term15830.getClass(), "last", null);
        setField(term15830, term15830.getClass(), "propListHead", null);
        setIntField(term15830, term15830.getClass(), "sourcePosition", 0);
        setField(term15830, term15830.getClass(), "jsType", null);
        setField(term15830, term15830.getClass(), "parent", null);
        setField(term15810, term15810.getClass(), "last", term15830);
        setField(term15833, term15833.getClass(), "next", null);
        setIntField(term15833, term15833.getClass(), "type", 0);
        setIntField(term15833, term15833.getClass(), "intValue", 0);
        setField(term15833, term15833.getClass(), "objectValue", null);
        setField(term15810, term15810.getClass(), "propListHead", term15833);
        setIntField(term15810, term15810.getClass(), "sourcePosition", 1916544127);
        setField(term15810, term15810.getClass(), "jsType", null);
        setField(term15810, term15810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15810;
        try {
            callMethod(klass, "getJSType", argTypes, term15724, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


