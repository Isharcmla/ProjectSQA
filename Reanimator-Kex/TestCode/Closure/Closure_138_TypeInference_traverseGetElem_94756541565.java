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

public class TypeInference_traverseGetElem_94756541565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10489;
     Object term10574;

    public TypeInference_traverseGetElem_94756541565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10492 = new HashMap();
        HashMap term10501 = new HashMap();
        Set<Object> term38696 =  ((Map) term10501).keySet();
        HashSet term10500 = new HashSet((Collection<? extends Object>) term38696);
        HashMap term10508 = new HashMap();
        Set<Object> term38697 =  ((Map) term10508).keySet();
        HashSet term10507 = new HashSet((Collection<? extends Object>) term38697);
        HashMap term10515 = new HashMap();
        Set<Object> term38698 =  ((Map) term10515).keySet();
        HashSet term10514 = new HashSet((Collection<? extends Object>) term38698);
        HashMap term10520 = new HashMap();
        HashMap term10525 = new HashMap();
        Class<? extends Object> term38720 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term38719 = ((Class) term38720).getDeclaredField((String) "INHERITED");
        ((Field) term38719).setAccessible(true);
        Object enum86 = ((Field) term38719).get((Object) null);
        term10489 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term10490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10491 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term10546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term10560 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10561 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10562 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10567 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10568 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10572 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term10489, term10489.getClass(), "compiler", null);
        setField(term10490, term10490.getClass(), "reporter", null);
        setField(term10490, term10490.getClass(), "nativeTypes", term10491);
        setField(term10490, term10490.getClass(), "namesToTypes", term10492);
        setField(term10490, term10490.getClass(), "namespaces", term10500);
        setField(term10490, term10490.getClass(), "enumTypeNames", term10507);
        setField(term10490, term10490.getClass(), "forwardDeclaredTypes", term10514);
        setField(term10490, term10490.getClass(), "typesIndexedByProperty", term10520);
        setField(term10490, term10490.getClass(), "greatestSubtypeByProperty", term10525);
        setField(term10490, term10490.getClass(), "interfaceToImplementors", null);
        setField(term10490, term10490.getClass(), "unresolvedNamedTypes", null);
        setField(term10490, term10490.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10490, term10490.getClass(), "lastGeneration", false);
        setField(term10490, term10490.getClass(), "templateTypeName", "YsUtbngnRO");
        setField(term10546, term10546.getClass(), "name", "JisaWUxcNb");
        setField(term10546, term10546.getClass(), "referencedType", null);
        setBooleanField(term10546, term10546.getClass(), "visited", false);
        setField(term10561, term10561.getClass(), "baseType", null);
        setField(term10561, term10561.getClass(), "implementedInterfaces", null);
        setField(term10561, term10561.getClass(), "parameters", null);
        setField(term10561, term10561.getClass(), "thrownTypes", null);
        setField(term10561, term10561.getClass(), "templateTypeName", null);
        setField(term10561, term10561.getClass(), "description", null);
        setField(term10561, term10561.getClass(), "deprecated", null);
        setField(term10561, term10561.getClass(), "license", null);
        setField(term10561, term10561.getClass(), "suppressions", null);
        setField(term10560, term10560.getClass(), "info", term10561);
        setField(term10562, term10562.getClass(), "markers", null);
        setField(term10562, term10562.getClass(), "parameters", null);
        setField(term10562, term10562.getClass(), "throwsDescriptions", null);
        setField(term10562, term10562.getClass(), "blockDescription", null);
        setField(term10562, term10562.getClass(), "fileOverview", null);
        setField(term10562, term10562.getClass(), "returnDescription", null);
        setField(term10562, term10562.getClass(), "version", null);
        setField(term10562, term10562.getClass(), "authors", null);
        setField(term10562, term10562.getClass(), "sees", null);
        setField(term10560, term10560.getClass(), "documentation", term10562);
        setField(term10560, term10560.getClass(), "sourceName", "");
        setField(term10560, term10560.getClass(), "visibility", enum86);
        setIntField(term10560, term10560.getClass(), "bitset", 1272542218);
        setField(term10567, term10567.getClass(), "root", null);
        setField(term10567, term10567.getClass(), "sourceName", null);
        setField(term10567, term10567.getClass(), "registry", null);
        setField(term10560, term10560.getClass(), "type", term10567);
        setField(term10568, term10568.getClass(), "root", null);
        setField(term10568, term10568.getClass(), "sourceName", null);
        setField(term10568, term10568.getClass(), "registry", null);
        setField(term10560, term10560.getClass(), "thisType", term10568);
        setBooleanField(term10560, term10560.getClass(), "includeDocumentation", false);
        setField(term10546, term10546.getClass(), "docInfo", term10560);
        setBooleanField(term10546, term10546.getClass(), "unknown", false);
        setBooleanField(term10546, term10546.getClass(), "resolved", false);
        setField(term10546, term10546.getClass(), "resolveResult", null);
        setField(term10546, term10546.getClass(), "registry", null);
        setField(term10490, term10490.getClass(), "templateType", term10546);
        setField(term10489, term10489.getClass(), "registry", term10490);
        setField(term10489, term10489.getClass(), "reverseInterpreter", null);
        setField(term10572, term10572.getClass(), "vars", null);
        setField(term10572, term10572.getClass(), "parent", null);
        setField(term10572, term10572.getClass(), "rootNode", null);
        setField(term10572, term10572.getClass(), "thisType", null);
        setBooleanField(term10572, term10572.getClass(), "isBottom", false);
        setField(term10489, term10489.getClass(), "syntacticScope", term10572);
        setField(term10489, term10489.getClass(), "functionScope", null);
        setField(term10489, term10489.getClass(), "bottomScope", null);
        setField(term10489, term10489.getClass(), "assignedOuterLocalVars", null);
        setField(term10489, term10489.getClass(), "unflowableVarNames", null);
        setField(term10489, term10489.getClass(), "cfg", null);
        setField(term10489, term10489.getClass(), "joinOp", null);
        setField(term10489, term10489.getClass(), "orderedWorkSet", null);
        term10574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10587 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10597 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10574, term10574.getClass(), "type", -1813280137);
        setIntField(term10576, term10576.getClass(), "type", -1667482829);
        setIntField(term10578, term10578.getClass(), "type", 0);
        setField(term10578, term10578.getClass(), "next", null);
        setField(term10578, term10578.getClass(), "first", null);
        setField(term10578, term10578.getClass(), "last", null);
        setField(term10578, term10578.getClass(), "propListHead", null);
        setIntField(term10578, term10578.getClass(), "sourcePosition", 0);
        setField(term10578, term10578.getClass(), "jsType", null);
        setField(term10578, term10578.getClass(), "parent", null);
        setField(term10576, term10576.getClass(), "next", term10578);
        setIntField(term10581, term10581.getClass(), "type", 0);
        setField(term10581, term10581.getClass(), "next", null);
        setField(term10581, term10581.getClass(), "first", null);
        setField(term10581, term10581.getClass(), "last", null);
        setField(term10581, term10581.getClass(), "propListHead", null);
        setIntField(term10581, term10581.getClass(), "sourcePosition", 0);
        setField(term10581, term10581.getClass(), "jsType", null);
        setField(term10581, term10581.getClass(), "parent", null);
        setField(term10576, term10576.getClass(), "first", term10581);
        setIntField(term10584, term10584.getClass(), "type", 0);
        setField(term10584, term10584.getClass(), "next", null);
        setField(term10584, term10584.getClass(), "first", null);
        setField(term10584, term10584.getClass(), "last", null);
        setField(term10584, term10584.getClass(), "propListHead", null);
        setIntField(term10584, term10584.getClass(), "sourcePosition", 0);
        setField(term10584, term10584.getClass(), "jsType", null);
        setField(term10584, term10584.getClass(), "parent", null);
        setField(term10576, term10576.getClass(), "last", term10584);
        setField(term10587, term10587.getClass(), "next", null);
        setIntField(term10587, term10587.getClass(), "type", 0);
        setIntField(term10587, term10587.getClass(), "intValue", 0);
        setField(term10587, term10587.getClass(), "objectValue", null);
        setField(term10576, term10576.getClass(), "propListHead", term10587);
        setIntField(term10576, term10576.getClass(), "sourcePosition", -938508470);
        setField(term10576, term10576.getClass(), "jsType", null);
        setField(term10576, term10576.getClass(), "parent", null);
        setField(term10574, term10574.getClass(), "next", term10576);
        setIntField(term10591, term10591.getClass(), "type", 0);
        setField(term10591, term10591.getClass(), "next", null);
        setField(term10591, term10591.getClass(), "first", null);
        setField(term10591, term10591.getClass(), "last", null);
        setField(term10591, term10591.getClass(), "propListHead", null);
        setIntField(term10591, term10591.getClass(), "sourcePosition", 0);
        setField(term10591, term10591.getClass(), "jsType", null);
        setField(term10591, term10591.getClass(), "parent", null);
        setField(term10574, term10574.getClass(), "first", term10591);
        setIntField(term10594, term10594.getClass(), "type", 0);
        setField(term10594, term10594.getClass(), "next", null);
        setField(term10594, term10594.getClass(), "first", null);
        setField(term10594, term10594.getClass(), "last", null);
        setField(term10594, term10594.getClass(), "propListHead", null);
        setIntField(term10594, term10594.getClass(), "sourcePosition", 0);
        setField(term10594, term10594.getClass(), "jsType", null);
        setField(term10594, term10594.getClass(), "parent", null);
        setField(term10574, term10574.getClass(), "last", term10594);
        setField(term10597, term10597.getClass(), "next", null);
        setIntField(term10597, term10597.getClass(), "type", 0);
        setIntField(term10597, term10597.getClass(), "intValue", 0);
        setField(term10597, term10597.getClass(), "objectValue", null);
        setField(term10574, term10574.getClass(), "propListHead", term10597);
        setIntField(term10574, term10574.getClass(), "sourcePosition", 1242676024);
        setField(term10574, term10574.getClass(), "jsType", null);
        setField(term10574, term10574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term10574;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term10489, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


