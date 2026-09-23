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

public class TypeInference_traverseAnd_48912615463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9670;
     Object term9755;

    public TypeInference_traverseAnd_48912615463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9673 = new HashMap();
        HashMap term9682 = new HashMap();
        Set<Object> term37214 =  ((Map) term9682).keySet();
        HashSet term9681 = new HashSet((Collection<? extends Object>) term37214);
        HashMap term9689 = new HashMap();
        Set<Object> term37215 =  ((Map) term9689).keySet();
        HashSet term9688 = new HashSet((Collection<? extends Object>) term37215);
        HashMap term9695 = new HashMap();
        Set<Object> term37216 =  ((Map) term9695).keySet();
        HashSet term9694 = new HashSet((Collection<? extends Object>) term37216);
        HashMap term9701 = new HashMap();
        HashMap term9706 = new HashMap();
        Class<? extends Object> term37238 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term37237 = ((Class) term37238).getDeclaredField((String) "PRIVATE");
        ((Field) term37237).setAccessible(true);
        Object enum83 = ((Field) term37237).get((Object) null);
        term9670 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term9671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9672 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term9727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term9741 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9742 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term9743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term9748 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9749 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9753 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term9670, term9670.getClass(), "compiler", null);
        setField(term9671, term9671.getClass(), "reporter", null);
        setField(term9671, term9671.getClass(), "nativeTypes", term9672);
        setField(term9671, term9671.getClass(), "namesToTypes", term9673);
        setField(term9671, term9671.getClass(), "namespaces", term9681);
        setField(term9671, term9671.getClass(), "enumTypeNames", term9688);
        setField(term9671, term9671.getClass(), "forwardDeclaredTypes", term9694);
        setField(term9671, term9671.getClass(), "typesIndexedByProperty", term9701);
        setField(term9671, term9671.getClass(), "greatestSubtypeByProperty", term9706);
        setField(term9671, term9671.getClass(), "interfaceToImplementors", null);
        setField(term9671, term9671.getClass(), "unresolvedNamedTypes", null);
        setField(term9671, term9671.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9671, term9671.getClass(), "lastGeneration", true);
        setField(term9671, term9671.getClass(), "templateTypeName", "oKwCDqywym");
        setField(term9727, term9727.getClass(), "name", "zjZYTddemL");
        setField(term9727, term9727.getClass(), "referencedType", null);
        setBooleanField(term9727, term9727.getClass(), "visited", false);
        setField(term9742, term9742.getClass(), "baseType", null);
        setField(term9742, term9742.getClass(), "implementedInterfaces", null);
        setField(term9742, term9742.getClass(), "parameters", null);
        setField(term9742, term9742.getClass(), "thrownTypes", null);
        setField(term9742, term9742.getClass(), "templateTypeName", null);
        setField(term9742, term9742.getClass(), "description", null);
        setField(term9742, term9742.getClass(), "deprecated", null);
        setField(term9742, term9742.getClass(), "license", null);
        setField(term9742, term9742.getClass(), "suppressions", null);
        setField(term9741, term9741.getClass(), "info", term9742);
        setField(term9743, term9743.getClass(), "markers", null);
        setField(term9743, term9743.getClass(), "parameters", null);
        setField(term9743, term9743.getClass(), "throwsDescriptions", null);
        setField(term9743, term9743.getClass(), "blockDescription", null);
        setField(term9743, term9743.getClass(), "fileOverview", null);
        setField(term9743, term9743.getClass(), "returnDescription", null);
        setField(term9743, term9743.getClass(), "version", null);
        setField(term9743, term9743.getClass(), "authors", null);
        setField(term9743, term9743.getClass(), "sees", null);
        setField(term9741, term9741.getClass(), "documentation", term9743);
        setField(term9741, term9741.getClass(), "sourceName", "");
        setField(term9741, term9741.getClass(), "visibility", enum83);
        setIntField(term9741, term9741.getClass(), "bitset", -1697741155);
        setField(term9748, term9748.getClass(), "root", null);
        setField(term9748, term9748.getClass(), "sourceName", null);
        setField(term9748, term9748.getClass(), "registry", null);
        setField(term9741, term9741.getClass(), "type", term9748);
        setField(term9749, term9749.getClass(), "root", null);
        setField(term9749, term9749.getClass(), "sourceName", null);
        setField(term9749, term9749.getClass(), "registry", null);
        setField(term9741, term9741.getClass(), "thisType", term9749);
        setBooleanField(term9741, term9741.getClass(), "includeDocumentation", true);
        setField(term9727, term9727.getClass(), "docInfo", term9741);
        setBooleanField(term9727, term9727.getClass(), "unknown", false);
        setBooleanField(term9727, term9727.getClass(), "resolved", false);
        setField(term9727, term9727.getClass(), "resolveResult", null);
        setField(term9727, term9727.getClass(), "registry", null);
        setField(term9671, term9671.getClass(), "templateType", term9727);
        setField(term9670, term9670.getClass(), "registry", term9671);
        setField(term9670, term9670.getClass(), "reverseInterpreter", null);
        setField(term9753, term9753.getClass(), "vars", null);
        setField(term9753, term9753.getClass(), "parent", null);
        setField(term9753, term9753.getClass(), "rootNode", null);
        setField(term9753, term9753.getClass(), "thisType", null);
        setBooleanField(term9753, term9753.getClass(), "isBottom", false);
        setField(term9670, term9670.getClass(), "syntacticScope", term9753);
        setField(term9670, term9670.getClass(), "functionScope", null);
        setField(term9670, term9670.getClass(), "bottomScope", null);
        setField(term9670, term9670.getClass(), "assignedOuterLocalVars", null);
        setField(term9670, term9670.getClass(), "unflowableVarNames", null);
        setField(term9670, term9670.getClass(), "cfg", null);
        setField(term9670, term9670.getClass(), "joinOp", null);
        setField(term9670, term9670.getClass(), "orderedWorkSet", null);
        term9755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9768 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9778 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9755, term9755.getClass(), "type", -1422859977);
        setIntField(term9757, term9757.getClass(), "type", 1741500243);
        setIntField(term9759, term9759.getClass(), "type", 0);
        setField(term9759, term9759.getClass(), "next", null);
        setField(term9759, term9759.getClass(), "first", null);
        setField(term9759, term9759.getClass(), "last", null);
        setField(term9759, term9759.getClass(), "propListHead", null);
        setIntField(term9759, term9759.getClass(), "sourcePosition", 0);
        setField(term9759, term9759.getClass(), "jsType", null);
        setField(term9759, term9759.getClass(), "parent", null);
        setField(term9757, term9757.getClass(), "next", term9759);
        setIntField(term9762, term9762.getClass(), "type", 0);
        setField(term9762, term9762.getClass(), "next", null);
        setField(term9762, term9762.getClass(), "first", null);
        setField(term9762, term9762.getClass(), "last", null);
        setField(term9762, term9762.getClass(), "propListHead", null);
        setIntField(term9762, term9762.getClass(), "sourcePosition", 0);
        setField(term9762, term9762.getClass(), "jsType", null);
        setField(term9762, term9762.getClass(), "parent", null);
        setField(term9757, term9757.getClass(), "first", term9762);
        setIntField(term9765, term9765.getClass(), "type", 0);
        setField(term9765, term9765.getClass(), "next", null);
        setField(term9765, term9765.getClass(), "first", null);
        setField(term9765, term9765.getClass(), "last", null);
        setField(term9765, term9765.getClass(), "propListHead", null);
        setIntField(term9765, term9765.getClass(), "sourcePosition", 0);
        setField(term9765, term9765.getClass(), "jsType", null);
        setField(term9765, term9765.getClass(), "parent", null);
        setField(term9757, term9757.getClass(), "last", term9765);
        setField(term9768, term9768.getClass(), "next", null);
        setIntField(term9768, term9768.getClass(), "type", 0);
        setIntField(term9768, term9768.getClass(), "intValue", 0);
        setField(term9768, term9768.getClass(), "objectValue", null);
        setField(term9757, term9757.getClass(), "propListHead", term9768);
        setIntField(term9757, term9757.getClass(), "sourcePosition", 1074848808);
        setField(term9757, term9757.getClass(), "jsType", null);
        setField(term9757, term9757.getClass(), "parent", null);
        setField(term9755, term9755.getClass(), "next", term9757);
        setIntField(term9772, term9772.getClass(), "type", 0);
        setField(term9772, term9772.getClass(), "next", null);
        setField(term9772, term9772.getClass(), "first", null);
        setField(term9772, term9772.getClass(), "last", null);
        setField(term9772, term9772.getClass(), "propListHead", null);
        setIntField(term9772, term9772.getClass(), "sourcePosition", 0);
        setField(term9772, term9772.getClass(), "jsType", null);
        setField(term9772, term9772.getClass(), "parent", null);
        setField(term9755, term9755.getClass(), "first", term9772);
        setIntField(term9775, term9775.getClass(), "type", 0);
        setField(term9775, term9775.getClass(), "next", null);
        setField(term9775, term9775.getClass(), "first", null);
        setField(term9775, term9775.getClass(), "last", null);
        setField(term9775, term9775.getClass(), "propListHead", null);
        setIntField(term9775, term9775.getClass(), "sourcePosition", 0);
        setField(term9775, term9775.getClass(), "jsType", null);
        setField(term9775, term9775.getClass(), "parent", null);
        setField(term9755, term9755.getClass(), "last", term9775);
        setField(term9778, term9778.getClass(), "next", null);
        setIntField(term9778, term9778.getClass(), "type", 0);
        setIntField(term9778, term9778.getClass(), "intValue", 0);
        setField(term9778, term9778.getClass(), "objectValue", null);
        setField(term9755, term9755.getClass(), "propListHead", term9778);
        setIntField(term9755, term9755.getClass(), "sourcePosition", -146054762);
        setField(term9755, term9755.getClass(), "jsType", null);
        setField(term9755, term9755.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term9755;
        args[1] = null;
        try {
            callMethod(klass, "traverseAnd", argTypes, term9670, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


