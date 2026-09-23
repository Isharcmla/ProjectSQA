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

public class TypeInference_traverseCatch_187513750747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2475;
     Object term2561;

    public TypeInference_traverseCatch_187513750747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2478 = new HashMap();
        HashMap term2487 = new HashMap();
        Set<Object> term23702 =  ((Map) term2487).keySet();
        HashSet term2486 = new HashSet((Collection<? extends Object>) term23702);
        HashMap term2494 = new HashMap();
        Set<Object> term23703 =  ((Map) term2494).keySet();
        HashSet term2493 = new HashSet((Collection<? extends Object>) term23703);
        HashMap term2501 = new HashMap();
        Set<Object> term23704 =  ((Map) term2501).keySet();
        HashSet term2500 = new HashSet((Collection<? extends Object>) term23704);
        HashMap term2507 = new HashMap();
        HashMap term2512 = new HashMap();
        Class<? extends Object> term23726 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term23725 = ((Class) term23726).getDeclaredField((String) "PROTECTED");
        ((Field) term23725).setAccessible(true);
        Object enum55 = ((Field) term23725).get((Object) null);
        term2475 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term2476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2477 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term2533 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2547 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2548 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2549 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2554 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2555 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2559 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2475, term2475.getClass(), "compiler", null);
        setField(term2476, term2476.getClass(), "reporter", null);
        setField(term2476, term2476.getClass(), "nativeTypes", term2477);
        setField(term2476, term2476.getClass(), "namesToTypes", term2478);
        setField(term2476, term2476.getClass(), "namespaces", term2486);
        setField(term2476, term2476.getClass(), "enumTypeNames", term2493);
        setField(term2476, term2476.getClass(), "forwardDeclaredTypes", term2500);
        setField(term2476, term2476.getClass(), "typesIndexedByProperty", term2507);
        setField(term2476, term2476.getClass(), "greatestSubtypeByProperty", term2512);
        setField(term2476, term2476.getClass(), "interfaceToImplementors", null);
        setField(term2476, term2476.getClass(), "unresolvedNamedTypes", null);
        setField(term2476, term2476.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2476, term2476.getClass(), "lastGeneration", true);
        setField(term2476, term2476.getClass(), "templateTypeName", "XylxrMBraH");
        setField(term2533, term2533.getClass(), "name", "pORebkoRdD");
        setField(term2533, term2533.getClass(), "referencedType", null);
        setBooleanField(term2533, term2533.getClass(), "visited", true);
        setField(term2548, term2548.getClass(), "baseType", null);
        setField(term2548, term2548.getClass(), "implementedInterfaces", null);
        setField(term2548, term2548.getClass(), "parameters", null);
        setField(term2548, term2548.getClass(), "thrownTypes", null);
        setField(term2548, term2548.getClass(), "templateTypeName", null);
        setField(term2548, term2548.getClass(), "description", null);
        setField(term2548, term2548.getClass(), "deprecated", null);
        setField(term2548, term2548.getClass(), "license", null);
        setField(term2548, term2548.getClass(), "suppressions", null);
        setField(term2547, term2547.getClass(), "info", term2548);
        setField(term2549, term2549.getClass(), "markers", null);
        setField(term2549, term2549.getClass(), "parameters", null);
        setField(term2549, term2549.getClass(), "throwsDescriptions", null);
        setField(term2549, term2549.getClass(), "blockDescription", null);
        setField(term2549, term2549.getClass(), "fileOverview", null);
        setField(term2549, term2549.getClass(), "returnDescription", null);
        setField(term2549, term2549.getClass(), "version", null);
        setField(term2549, term2549.getClass(), "authors", null);
        setField(term2549, term2549.getClass(), "sees", null);
        setField(term2547, term2547.getClass(), "documentation", term2549);
        setField(term2547, term2547.getClass(), "sourceName", "");
        setField(term2547, term2547.getClass(), "visibility", enum55);
        setIntField(term2547, term2547.getClass(), "bitset", 941650513);
        setField(term2554, term2554.getClass(), "root", null);
        setField(term2554, term2554.getClass(), "sourceName", null);
        setField(term2554, term2554.getClass(), "registry", null);
        setField(term2547, term2547.getClass(), "type", term2554);
        setField(term2555, term2555.getClass(), "root", null);
        setField(term2555, term2555.getClass(), "sourceName", null);
        setField(term2555, term2555.getClass(), "registry", null);
        setField(term2547, term2547.getClass(), "thisType", term2555);
        setBooleanField(term2547, term2547.getClass(), "includeDocumentation", true);
        setField(term2533, term2533.getClass(), "docInfo", term2547);
        setBooleanField(term2533, term2533.getClass(), "unknown", true);
        setBooleanField(term2533, term2533.getClass(), "resolved", false);
        setField(term2533, term2533.getClass(), "resolveResult", null);
        setField(term2533, term2533.getClass(), "registry", null);
        setField(term2476, term2476.getClass(), "templateType", term2533);
        setField(term2475, term2475.getClass(), "registry", term2476);
        setField(term2475, term2475.getClass(), "reverseInterpreter", null);
        setField(term2559, term2559.getClass(), "vars", null);
        setField(term2559, term2559.getClass(), "parent", null);
        setField(term2559, term2559.getClass(), "rootNode", null);
        setField(term2559, term2559.getClass(), "thisType", null);
        setBooleanField(term2559, term2559.getClass(), "isBottom", false);
        setField(term2475, term2475.getClass(), "syntacticScope", term2559);
        setField(term2475, term2475.getClass(), "functionScope", null);
        setField(term2475, term2475.getClass(), "bottomScope", null);
        setField(term2475, term2475.getClass(), "assignedOuterLocalVars", null);
        setField(term2475, term2475.getClass(), "unflowableVarNames", null);
        setField(term2475, term2475.getClass(), "cfg", null);
        setField(term2475, term2475.getClass(), "joinOp", null);
        setField(term2475, term2475.getClass(), "orderedWorkSet", null);
        term2561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2574 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2584 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2561, term2561.getClass(), "type", 304775596);
        setIntField(term2563, term2563.getClass(), "type", 1596213415);
        setIntField(term2565, term2565.getClass(), "type", 0);
        setField(term2565, term2565.getClass(), "next", null);
        setField(term2565, term2565.getClass(), "first", null);
        setField(term2565, term2565.getClass(), "last", null);
        setField(term2565, term2565.getClass(), "propListHead", null);
        setIntField(term2565, term2565.getClass(), "sourcePosition", 0);
        setField(term2565, term2565.getClass(), "jsType", null);
        setField(term2565, term2565.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "next", term2565);
        setIntField(term2568, term2568.getClass(), "type", 0);
        setField(term2568, term2568.getClass(), "next", null);
        setField(term2568, term2568.getClass(), "first", null);
        setField(term2568, term2568.getClass(), "last", null);
        setField(term2568, term2568.getClass(), "propListHead", null);
        setIntField(term2568, term2568.getClass(), "sourcePosition", 0);
        setField(term2568, term2568.getClass(), "jsType", null);
        setField(term2568, term2568.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "first", term2568);
        setIntField(term2571, term2571.getClass(), "type", 0);
        setField(term2571, term2571.getClass(), "next", null);
        setField(term2571, term2571.getClass(), "first", null);
        setField(term2571, term2571.getClass(), "last", null);
        setField(term2571, term2571.getClass(), "propListHead", null);
        setIntField(term2571, term2571.getClass(), "sourcePosition", 0);
        setField(term2571, term2571.getClass(), "jsType", null);
        setField(term2571, term2571.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "last", term2571);
        setField(term2574, term2574.getClass(), "next", null);
        setIntField(term2574, term2574.getClass(), "type", 0);
        setIntField(term2574, term2574.getClass(), "intValue", 0);
        setField(term2574, term2574.getClass(), "objectValue", null);
        setField(term2563, term2563.getClass(), "propListHead", term2574);
        setIntField(term2563, term2563.getClass(), "sourcePosition", -663691365);
        setField(term2563, term2563.getClass(), "jsType", null);
        setField(term2563, term2563.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "next", term2563);
        setIntField(term2578, term2578.getClass(), "type", 0);
        setField(term2578, term2578.getClass(), "next", null);
        setField(term2578, term2578.getClass(), "first", null);
        setField(term2578, term2578.getClass(), "last", null);
        setField(term2578, term2578.getClass(), "propListHead", null);
        setIntField(term2578, term2578.getClass(), "sourcePosition", 0);
        setField(term2578, term2578.getClass(), "jsType", null);
        setField(term2578, term2578.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "first", term2578);
        setIntField(term2581, term2581.getClass(), "type", 0);
        setField(term2581, term2581.getClass(), "next", null);
        setField(term2581, term2581.getClass(), "first", null);
        setField(term2581, term2581.getClass(), "last", null);
        setField(term2581, term2581.getClass(), "propListHead", null);
        setIntField(term2581, term2581.getClass(), "sourcePosition", 0);
        setField(term2581, term2581.getClass(), "jsType", null);
        setField(term2581, term2581.getClass(), "parent", null);
        setField(term2561, term2561.getClass(), "last", term2581);
        setField(term2584, term2584.getClass(), "next", null);
        setIntField(term2584, term2584.getClass(), "type", 0);
        setIntField(term2584, term2584.getClass(), "intValue", 0);
        setField(term2584, term2584.getClass(), "objectValue", null);
        setField(term2561, term2561.getClass(), "propListHead", term2584);
        setIntField(term2561, term2561.getClass(), "sourcePosition", 339854490);
        setField(term2561, term2561.getClass(), "jsType", null);
        setField(term2561, term2561.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2561;
        args[1] = null;
        try {
            callMethod(klass, "traverseCatch", argTypes, term2475, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


