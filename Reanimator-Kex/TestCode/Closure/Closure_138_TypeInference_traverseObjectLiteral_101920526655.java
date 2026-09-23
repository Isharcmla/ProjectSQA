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

public class TypeInference_traverseObjectLiteral_101920526655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5722;
     Object term5808;

    public TypeInference_traverseObjectLiteral_101920526655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5725 = new HashMap();
        HashMap term5734 = new HashMap();
        Set<Object> term29333 =  ((Map) term5734).keySet();
        HashSet term5733 = new HashSet((Collection<? extends Object>) term29333);
        HashMap term5741 = new HashMap();
        Set<Object> term29334 =  ((Map) term5741).keySet();
        HashSet term5740 = new HashSet((Collection<? extends Object>) term29334);
        HashMap term5748 = new HashMap();
        Set<Object> term29335 =  ((Map) term5748).keySet();
        HashSet term5747 = new HashSet((Collection<? extends Object>) term29335);
        HashMap term5754 = new HashMap();
        HashMap term5759 = new HashMap();
        Class<? extends Object> term29357 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term29356 = ((Class) term29357).getDeclaredField((String) "PRIVATE");
        ((Field) term29356).setAccessible(true);
        Object enum65 = ((Field) term29356).get((Object) null);
        term5722 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5724 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term5780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5794 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5795 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5796 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5801 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5802 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5806 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5722, term5722.getClass(), "compiler", null);
        setField(term5723, term5723.getClass(), "reporter", null);
        setField(term5723, term5723.getClass(), "nativeTypes", term5724);
        setField(term5723, term5723.getClass(), "namesToTypes", term5725);
        setField(term5723, term5723.getClass(), "namespaces", term5733);
        setField(term5723, term5723.getClass(), "enumTypeNames", term5740);
        setField(term5723, term5723.getClass(), "forwardDeclaredTypes", term5747);
        setField(term5723, term5723.getClass(), "typesIndexedByProperty", term5754);
        setField(term5723, term5723.getClass(), "greatestSubtypeByProperty", term5759);
        setField(term5723, term5723.getClass(), "interfaceToImplementors", null);
        setField(term5723, term5723.getClass(), "unresolvedNamedTypes", null);
        setField(term5723, term5723.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5723, term5723.getClass(), "lastGeneration", false);
        setField(term5723, term5723.getClass(), "templateTypeName", "CKWpJaaaxX");
        setField(term5780, term5780.getClass(), "name", "UBRmXJmfrt");
        setField(term5780, term5780.getClass(), "referencedType", null);
        setBooleanField(term5780, term5780.getClass(), "visited", false);
        setField(term5795, term5795.getClass(), "baseType", null);
        setField(term5795, term5795.getClass(), "implementedInterfaces", null);
        setField(term5795, term5795.getClass(), "parameters", null);
        setField(term5795, term5795.getClass(), "thrownTypes", null);
        setField(term5795, term5795.getClass(), "templateTypeName", null);
        setField(term5795, term5795.getClass(), "description", null);
        setField(term5795, term5795.getClass(), "deprecated", null);
        setField(term5795, term5795.getClass(), "license", null);
        setField(term5795, term5795.getClass(), "suppressions", null);
        setField(term5794, term5794.getClass(), "info", term5795);
        setField(term5796, term5796.getClass(), "markers", null);
        setField(term5796, term5796.getClass(), "parameters", null);
        setField(term5796, term5796.getClass(), "throwsDescriptions", null);
        setField(term5796, term5796.getClass(), "blockDescription", null);
        setField(term5796, term5796.getClass(), "fileOverview", null);
        setField(term5796, term5796.getClass(), "returnDescription", null);
        setField(term5796, term5796.getClass(), "version", null);
        setField(term5796, term5796.getClass(), "authors", null);
        setField(term5796, term5796.getClass(), "sees", null);
        setField(term5794, term5794.getClass(), "documentation", term5796);
        setField(term5794, term5794.getClass(), "sourceName", "");
        setField(term5794, term5794.getClass(), "visibility", enum65);
        setIntField(term5794, term5794.getClass(), "bitset", -2104981311);
        setField(term5801, term5801.getClass(), "root", null);
        setField(term5801, term5801.getClass(), "sourceName", null);
        setField(term5801, term5801.getClass(), "registry", null);
        setField(term5794, term5794.getClass(), "type", term5801);
        setField(term5802, term5802.getClass(), "root", null);
        setField(term5802, term5802.getClass(), "sourceName", null);
        setField(term5802, term5802.getClass(), "registry", null);
        setField(term5794, term5794.getClass(), "thisType", term5802);
        setBooleanField(term5794, term5794.getClass(), "includeDocumentation", false);
        setField(term5780, term5780.getClass(), "docInfo", term5794);
        setBooleanField(term5780, term5780.getClass(), "unknown", false);
        setBooleanField(term5780, term5780.getClass(), "resolved", false);
        setField(term5780, term5780.getClass(), "resolveResult", null);
        setField(term5780, term5780.getClass(), "registry", null);
        setField(term5723, term5723.getClass(), "templateType", term5780);
        setField(term5722, term5722.getClass(), "registry", term5723);
        setField(term5722, term5722.getClass(), "reverseInterpreter", null);
        setField(term5806, term5806.getClass(), "vars", null);
        setField(term5806, term5806.getClass(), "parent", null);
        setField(term5806, term5806.getClass(), "rootNode", null);
        setField(term5806, term5806.getClass(), "thisType", null);
        setBooleanField(term5806, term5806.getClass(), "isBottom", false);
        setField(term5722, term5722.getClass(), "syntacticScope", term5806);
        setField(term5722, term5722.getClass(), "functionScope", null);
        setField(term5722, term5722.getClass(), "bottomScope", null);
        setField(term5722, term5722.getClass(), "assignedOuterLocalVars", null);
        setField(term5722, term5722.getClass(), "unflowableVarNames", null);
        setField(term5722, term5722.getClass(), "cfg", null);
        setField(term5722, term5722.getClass(), "joinOp", null);
        setField(term5722, term5722.getClass(), "orderedWorkSet", null);
        term5808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5821 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5831 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5808, term5808.getClass(), "type", 806595993);
        setIntField(term5810, term5810.getClass(), "type", 937859191);
        setIntField(term5812, term5812.getClass(), "type", 0);
        setField(term5812, term5812.getClass(), "next", null);
        setField(term5812, term5812.getClass(), "first", null);
        setField(term5812, term5812.getClass(), "last", null);
        setField(term5812, term5812.getClass(), "propListHead", null);
        setIntField(term5812, term5812.getClass(), "sourcePosition", 0);
        setField(term5812, term5812.getClass(), "jsType", null);
        setField(term5812, term5812.getClass(), "parent", null);
        setField(term5810, term5810.getClass(), "next", term5812);
        setIntField(term5815, term5815.getClass(), "type", 0);
        setField(term5815, term5815.getClass(), "next", null);
        setField(term5815, term5815.getClass(), "first", null);
        setField(term5815, term5815.getClass(), "last", null);
        setField(term5815, term5815.getClass(), "propListHead", null);
        setIntField(term5815, term5815.getClass(), "sourcePosition", 0);
        setField(term5815, term5815.getClass(), "jsType", null);
        setField(term5815, term5815.getClass(), "parent", null);
        setField(term5810, term5810.getClass(), "first", term5815);
        setIntField(term5818, term5818.getClass(), "type", 0);
        setField(term5818, term5818.getClass(), "next", null);
        setField(term5818, term5818.getClass(), "first", null);
        setField(term5818, term5818.getClass(), "last", null);
        setField(term5818, term5818.getClass(), "propListHead", null);
        setIntField(term5818, term5818.getClass(), "sourcePosition", 0);
        setField(term5818, term5818.getClass(), "jsType", null);
        setField(term5818, term5818.getClass(), "parent", null);
        setField(term5810, term5810.getClass(), "last", term5818);
        setField(term5821, term5821.getClass(), "next", null);
        setIntField(term5821, term5821.getClass(), "type", 0);
        setIntField(term5821, term5821.getClass(), "intValue", 0);
        setField(term5821, term5821.getClass(), "objectValue", null);
        setField(term5810, term5810.getClass(), "propListHead", term5821);
        setIntField(term5810, term5810.getClass(), "sourcePosition", 282916351);
        setField(term5810, term5810.getClass(), "jsType", null);
        setField(term5810, term5810.getClass(), "parent", null);
        setField(term5808, term5808.getClass(), "next", term5810);
        setIntField(term5825, term5825.getClass(), "type", 0);
        setField(term5825, term5825.getClass(), "next", null);
        setField(term5825, term5825.getClass(), "first", null);
        setField(term5825, term5825.getClass(), "last", null);
        setField(term5825, term5825.getClass(), "propListHead", null);
        setIntField(term5825, term5825.getClass(), "sourcePosition", 0);
        setField(term5825, term5825.getClass(), "jsType", null);
        setField(term5825, term5825.getClass(), "parent", null);
        setField(term5808, term5808.getClass(), "first", term5825);
        setIntField(term5828, term5828.getClass(), "type", 0);
        setField(term5828, term5828.getClass(), "next", null);
        setField(term5828, term5828.getClass(), "first", null);
        setField(term5828, term5828.getClass(), "last", null);
        setField(term5828, term5828.getClass(), "propListHead", null);
        setIntField(term5828, term5828.getClass(), "sourcePosition", 0);
        setField(term5828, term5828.getClass(), "jsType", null);
        setField(term5828, term5828.getClass(), "parent", null);
        setField(term5808, term5808.getClass(), "last", term5828);
        setField(term5831, term5831.getClass(), "next", null);
        setIntField(term5831, term5831.getClass(), "type", 0);
        setIntField(term5831, term5831.getClass(), "intValue", 0);
        setField(term5831, term5831.getClass(), "objectValue", null);
        setField(term5808, term5808.getClass(), "propListHead", term5831);
        setIntField(term5808, term5808.getClass(), "sourcePosition", 880977281);
        setField(term5808, term5808.getClass(), "jsType", null);
        setField(term5808, term5808.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term5808;
        args[1] = null;
        try {
            callMethod(klass, "traverseObjectLiteral", argTypes, term5722, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


