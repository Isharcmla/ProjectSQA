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
import java.lang.Boolean;

public class TypeInference_traverseShortCircuitingBinOp_82025538870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12544;
     Object term12630;
     Object term12657;

    public TypeInference_traverseShortCircuitingBinOp_82025538870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12547 = new HashMap();
        HashMap term12556 = new HashMap();
        Set<Object> term42551 =  ((Map) term12556).keySet();
        HashSet term12555 = new HashSet((Collection<? extends Object>) term42551);
        HashMap term12563 = new HashMap();
        Set<Object> term42552 =  ((Map) term12563).keySet();
        HashSet term12562 = new HashSet((Collection<? extends Object>) term42552);
        HashMap term12570 = new HashMap();
        Set<Object> term42553 =  ((Map) term12570).keySet();
        HashSet term12569 = new HashSet((Collection<? extends Object>) term42553);
        HashMap term12576 = new HashMap();
        HashMap term12581 = new HashMap();
        Class<? extends Object> term42575 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term42574 = ((Class) term42575).getDeclaredField((String) "PROTECTED");
        ((Field) term42574).setAccessible(true);
        Object enum94 = ((Field) term42574).get((Object) null);
        term12544 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term12545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12546 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        Object term12602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12616 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12617 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12618 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12623 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12624 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12628 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term12544, term12544.getClass(), "compiler", null);
        setField(term12545, term12545.getClass(), "reporter", null);
        setField(term12545, term12545.getClass(), "nativeTypes", term12546);
        setField(term12545, term12545.getClass(), "namesToTypes", term12547);
        setField(term12545, term12545.getClass(), "namespaces", term12555);
        setField(term12545, term12545.getClass(), "enumTypeNames", term12562);
        setField(term12545, term12545.getClass(), "forwardDeclaredTypes", term12569);
        setField(term12545, term12545.getClass(), "typesIndexedByProperty", term12576);
        setField(term12545, term12545.getClass(), "greatestSubtypeByProperty", term12581);
        setField(term12545, term12545.getClass(), "interfaceToImplementors", null);
        setField(term12545, term12545.getClass(), "unresolvedNamedTypes", null);
        setField(term12545, term12545.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12545, term12545.getClass(), "lastGeneration", true);
        setField(term12545, term12545.getClass(), "templateTypeName", "cmuaUiHMVL");
        setField(term12602, term12602.getClass(), "name", "xjoSGPWUgu");
        setField(term12602, term12602.getClass(), "referencedType", null);
        setBooleanField(term12602, term12602.getClass(), "visited", false);
        setField(term12617, term12617.getClass(), "baseType", null);
        setField(term12617, term12617.getClass(), "implementedInterfaces", null);
        setField(term12617, term12617.getClass(), "parameters", null);
        setField(term12617, term12617.getClass(), "thrownTypes", null);
        setField(term12617, term12617.getClass(), "templateTypeName", null);
        setField(term12617, term12617.getClass(), "description", null);
        setField(term12617, term12617.getClass(), "deprecated", null);
        setField(term12617, term12617.getClass(), "license", null);
        setField(term12617, term12617.getClass(), "suppressions", null);
        setField(term12616, term12616.getClass(), "info", term12617);
        setField(term12618, term12618.getClass(), "markers", null);
        setField(term12618, term12618.getClass(), "parameters", null);
        setField(term12618, term12618.getClass(), "throwsDescriptions", null);
        setField(term12618, term12618.getClass(), "blockDescription", null);
        setField(term12618, term12618.getClass(), "fileOverview", null);
        setField(term12618, term12618.getClass(), "returnDescription", null);
        setField(term12618, term12618.getClass(), "version", null);
        setField(term12618, term12618.getClass(), "authors", null);
        setField(term12618, term12618.getClass(), "sees", null);
        setField(term12616, term12616.getClass(), "documentation", term12618);
        setField(term12616, term12616.getClass(), "sourceName", "");
        setField(term12616, term12616.getClass(), "visibility", enum94);
        setIntField(term12616, term12616.getClass(), "bitset", -1792504217);
        setField(term12623, term12623.getClass(), "root", null);
        setField(term12623, term12623.getClass(), "sourceName", null);
        setField(term12623, term12623.getClass(), "registry", null);
        setField(term12616, term12616.getClass(), "type", term12623);
        setField(term12624, term12624.getClass(), "root", null);
        setField(term12624, term12624.getClass(), "sourceName", null);
        setField(term12624, term12624.getClass(), "registry", null);
        setField(term12616, term12616.getClass(), "thisType", term12624);
        setBooleanField(term12616, term12616.getClass(), "includeDocumentation", false);
        setField(term12602, term12602.getClass(), "docInfo", term12616);
        setBooleanField(term12602, term12602.getClass(), "unknown", false);
        setBooleanField(term12602, term12602.getClass(), "resolved", true);
        setField(term12602, term12602.getClass(), "resolveResult", null);
        setField(term12602, term12602.getClass(), "registry", null);
        setField(term12545, term12545.getClass(), "templateType", term12602);
        setField(term12544, term12544.getClass(), "registry", term12545);
        setField(term12544, term12544.getClass(), "reverseInterpreter", null);
        setField(term12628, term12628.getClass(), "vars", null);
        setField(term12628, term12628.getClass(), "parent", null);
        setField(term12628, term12628.getClass(), "rootNode", null);
        setField(term12628, term12628.getClass(), "thisType", null);
        setBooleanField(term12628, term12628.getClass(), "isBottom", false);
        setField(term12544, term12544.getClass(), "syntacticScope", term12628);
        setField(term12544, term12544.getClass(), "functionScope", null);
        setField(term12544, term12544.getClass(), "bottomScope", null);
        setField(term12544, term12544.getClass(), "assignedOuterLocalVars", null);
        setField(term12544, term12544.getClass(), "unflowableVarNames", null);
        setField(term12544, term12544.getClass(), "cfg", null);
        setField(term12544, term12544.getClass(), "joinOp", null);
        setField(term12544, term12544.getClass(), "orderedWorkSet", null);
        term12630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12643 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12653 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12630, term12630.getClass(), "type", 888506903);
        setIntField(term12632, term12632.getClass(), "type", -1577069773);
        setIntField(term12634, term12634.getClass(), "type", 0);
        setField(term12634, term12634.getClass(), "next", null);
        setField(term12634, term12634.getClass(), "first", null);
        setField(term12634, term12634.getClass(), "last", null);
        setField(term12634, term12634.getClass(), "propListHead", null);
        setIntField(term12634, term12634.getClass(), "sourcePosition", 0);
        setField(term12634, term12634.getClass(), "jsType", null);
        setField(term12634, term12634.getClass(), "parent", null);
        setField(term12632, term12632.getClass(), "next", term12634);
        setIntField(term12637, term12637.getClass(), "type", 0);
        setField(term12637, term12637.getClass(), "next", null);
        setField(term12637, term12637.getClass(), "first", null);
        setField(term12637, term12637.getClass(), "last", null);
        setField(term12637, term12637.getClass(), "propListHead", null);
        setIntField(term12637, term12637.getClass(), "sourcePosition", 0);
        setField(term12637, term12637.getClass(), "jsType", null);
        setField(term12637, term12637.getClass(), "parent", null);
        setField(term12632, term12632.getClass(), "first", term12637);
        setIntField(term12640, term12640.getClass(), "type", 0);
        setField(term12640, term12640.getClass(), "next", null);
        setField(term12640, term12640.getClass(), "first", null);
        setField(term12640, term12640.getClass(), "last", null);
        setField(term12640, term12640.getClass(), "propListHead", null);
        setIntField(term12640, term12640.getClass(), "sourcePosition", 0);
        setField(term12640, term12640.getClass(), "jsType", null);
        setField(term12640, term12640.getClass(), "parent", null);
        setField(term12632, term12632.getClass(), "last", term12640);
        setField(term12643, term12643.getClass(), "next", null);
        setIntField(term12643, term12643.getClass(), "type", 0);
        setIntField(term12643, term12643.getClass(), "intValue", 0);
        setField(term12643, term12643.getClass(), "objectValue", null);
        setField(term12632, term12632.getClass(), "propListHead", term12643);
        setIntField(term12632, term12632.getClass(), "sourcePosition", 464181937);
        setField(term12632, term12632.getClass(), "jsType", null);
        setField(term12632, term12632.getClass(), "parent", null);
        setField(term12630, term12630.getClass(), "next", term12632);
        setIntField(term12647, term12647.getClass(), "type", 0);
        setField(term12647, term12647.getClass(), "next", null);
        setField(term12647, term12647.getClass(), "first", null);
        setField(term12647, term12647.getClass(), "last", null);
        setField(term12647, term12647.getClass(), "propListHead", null);
        setIntField(term12647, term12647.getClass(), "sourcePosition", 0);
        setField(term12647, term12647.getClass(), "jsType", null);
        setField(term12647, term12647.getClass(), "parent", null);
        setField(term12630, term12630.getClass(), "first", term12647);
        setIntField(term12650, term12650.getClass(), "type", 0);
        setField(term12650, term12650.getClass(), "next", null);
        setField(term12650, term12650.getClass(), "first", null);
        setField(term12650, term12650.getClass(), "last", null);
        setField(term12650, term12650.getClass(), "propListHead", null);
        setIntField(term12650, term12650.getClass(), "sourcePosition", 0);
        setField(term12650, term12650.getClass(), "jsType", null);
        setField(term12650, term12650.getClass(), "parent", null);
        setField(term12630, term12630.getClass(), "last", term12650);
        setField(term12653, term12653.getClass(), "next", null);
        setIntField(term12653, term12653.getClass(), "type", 0);
        setIntField(term12653, term12653.getClass(), "intValue", 0);
        setField(term12653, term12653.getClass(), "objectValue", null);
        setField(term12630, term12630.getClass(), "propListHead", term12653);
        setIntField(term12630, term12630.getClass(), "sourcePosition", -1455526612);
        setField(term12630, term12630.getClass(), "jsType", null);
        setField(term12630, term12630.getClass(), "parent", null);
        term12657 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term12630;
        args[1] = null;
        args[2] = term12657;
        try {
            callMethod(klass, "traverseShortCircuitingBinOp", argTypes, term12544, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


