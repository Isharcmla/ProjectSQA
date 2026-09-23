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

public class TypeInference_traverseCall_96521443659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7299;
     Object term7385;

    public TypeInference_traverseCall_96521443659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7302 = new HashMap();
        HashMap term7311 = new HashMap();
        Set<Object> term32724 =  ((Map) term7311).keySet();
        HashSet term7310 = new HashSet((Collection<? extends Object>) term32724);
        HashMap term7318 = new HashMap();
        Set<Object> term32725 =  ((Map) term7318).keySet();
        HashSet term7317 = new HashSet((Collection<? extends Object>) term32725);
        HashMap term7325 = new HashMap();
        Set<Object> term32726 =  ((Map) term7325).keySet();
        HashSet term7324 = new HashSet((Collection<? extends Object>) term32726);
        HashMap term7331 = new HashMap();
        HashMap term7336 = new HashMap();
        Class<? extends Object> term32748 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term32747 = ((Class) term32748).getDeclaredField((String) "PRIVATE");
        ((Field) term32747).setAccessible(true);
        Object enum71 = ((Field) term32747).get((Object) null);
        term7299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term7300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7301 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term7357 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7371 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7372 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7373 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7378 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7379 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7383 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term7299, term7299.getClass(), "compiler", null);
        setField(term7300, term7300.getClass(), "reporter", null);
        setField(term7300, term7300.getClass(), "nativeTypes", term7301);
        setField(term7300, term7300.getClass(), "namesToTypes", term7302);
        setField(term7300, term7300.getClass(), "namespaces", term7310);
        setField(term7300, term7300.getClass(), "enumTypeNames", term7317);
        setField(term7300, term7300.getClass(), "forwardDeclaredTypes", term7324);
        setField(term7300, term7300.getClass(), "typesIndexedByProperty", term7331);
        setField(term7300, term7300.getClass(), "greatestSubtypeByProperty", term7336);
        setField(term7300, term7300.getClass(), "interfaceToImplementors", null);
        setField(term7300, term7300.getClass(), "unresolvedNamedTypes", null);
        setField(term7300, term7300.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7300, term7300.getClass(), "lastGeneration", true);
        setField(term7300, term7300.getClass(), "templateTypeName", "aanyiAOJCl");
        setField(term7357, term7357.getClass(), "name", "VDokbsCuqq");
        setField(term7357, term7357.getClass(), "referencedType", null);
        setBooleanField(term7357, term7357.getClass(), "visited", true);
        setField(term7372, term7372.getClass(), "baseType", null);
        setField(term7372, term7372.getClass(), "implementedInterfaces", null);
        setField(term7372, term7372.getClass(), "parameters", null);
        setField(term7372, term7372.getClass(), "thrownTypes", null);
        setField(term7372, term7372.getClass(), "templateTypeName", null);
        setField(term7372, term7372.getClass(), "description", null);
        setField(term7372, term7372.getClass(), "deprecated", null);
        setField(term7372, term7372.getClass(), "license", null);
        setField(term7372, term7372.getClass(), "suppressions", null);
        setField(term7371, term7371.getClass(), "info", term7372);
        setField(term7373, term7373.getClass(), "markers", null);
        setField(term7373, term7373.getClass(), "parameters", null);
        setField(term7373, term7373.getClass(), "throwsDescriptions", null);
        setField(term7373, term7373.getClass(), "blockDescription", null);
        setField(term7373, term7373.getClass(), "fileOverview", null);
        setField(term7373, term7373.getClass(), "returnDescription", null);
        setField(term7373, term7373.getClass(), "version", null);
        setField(term7373, term7373.getClass(), "authors", null);
        setField(term7373, term7373.getClass(), "sees", null);
        setField(term7371, term7371.getClass(), "documentation", term7373);
        setField(term7371, term7371.getClass(), "sourceName", "");
        setField(term7371, term7371.getClass(), "visibility", enum71);
        setIntField(term7371, term7371.getClass(), "bitset", 842904495);
        setField(term7378, term7378.getClass(), "root", null);
        setField(term7378, term7378.getClass(), "sourceName", null);
        setField(term7378, term7378.getClass(), "registry", null);
        setField(term7371, term7371.getClass(), "type", term7378);
        setField(term7379, term7379.getClass(), "root", null);
        setField(term7379, term7379.getClass(), "sourceName", null);
        setField(term7379, term7379.getClass(), "registry", null);
        setField(term7371, term7371.getClass(), "thisType", term7379);
        setBooleanField(term7371, term7371.getClass(), "includeDocumentation", true);
        setField(term7357, term7357.getClass(), "docInfo", term7371);
        setBooleanField(term7357, term7357.getClass(), "unknown", true);
        setBooleanField(term7357, term7357.getClass(), "resolved", false);
        setField(term7357, term7357.getClass(), "resolveResult", null);
        setField(term7357, term7357.getClass(), "registry", null);
        setField(term7300, term7300.getClass(), "templateType", term7357);
        setField(term7299, term7299.getClass(), "registry", term7300);
        setField(term7299, term7299.getClass(), "reverseInterpreter", null);
        setField(term7383, term7383.getClass(), "vars", null);
        setField(term7383, term7383.getClass(), "parent", null);
        setField(term7383, term7383.getClass(), "rootNode", null);
        setField(term7383, term7383.getClass(), "thisType", null);
        setBooleanField(term7383, term7383.getClass(), "isBottom", false);
        setField(term7299, term7299.getClass(), "syntacticScope", term7383);
        setField(term7299, term7299.getClass(), "functionScope", null);
        setField(term7299, term7299.getClass(), "bottomScope", null);
        setField(term7299, term7299.getClass(), "assignedOuterLocalVars", null);
        setField(term7299, term7299.getClass(), "unflowableVarNames", null);
        setField(term7299, term7299.getClass(), "cfg", null);
        setField(term7299, term7299.getClass(), "joinOp", null);
        setField(term7299, term7299.getClass(), "orderedWorkSet", null);
        term7385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7398 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7408 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7385, term7385.getClass(), "type", -1183353915);
        setIntField(term7387, term7387.getClass(), "type", 49950830);
        setIntField(term7389, term7389.getClass(), "type", 0);
        setField(term7389, term7389.getClass(), "next", null);
        setField(term7389, term7389.getClass(), "first", null);
        setField(term7389, term7389.getClass(), "last", null);
        setField(term7389, term7389.getClass(), "propListHead", null);
        setIntField(term7389, term7389.getClass(), "sourcePosition", 0);
        setField(term7389, term7389.getClass(), "jsType", null);
        setField(term7389, term7389.getClass(), "parent", null);
        setField(term7387, term7387.getClass(), "next", term7389);
        setIntField(term7392, term7392.getClass(), "type", 0);
        setField(term7392, term7392.getClass(), "next", null);
        setField(term7392, term7392.getClass(), "first", null);
        setField(term7392, term7392.getClass(), "last", null);
        setField(term7392, term7392.getClass(), "propListHead", null);
        setIntField(term7392, term7392.getClass(), "sourcePosition", 0);
        setField(term7392, term7392.getClass(), "jsType", null);
        setField(term7392, term7392.getClass(), "parent", null);
        setField(term7387, term7387.getClass(), "first", term7392);
        setIntField(term7395, term7395.getClass(), "type", 0);
        setField(term7395, term7395.getClass(), "next", null);
        setField(term7395, term7395.getClass(), "first", null);
        setField(term7395, term7395.getClass(), "last", null);
        setField(term7395, term7395.getClass(), "propListHead", null);
        setIntField(term7395, term7395.getClass(), "sourcePosition", 0);
        setField(term7395, term7395.getClass(), "jsType", null);
        setField(term7395, term7395.getClass(), "parent", null);
        setField(term7387, term7387.getClass(), "last", term7395);
        setField(term7398, term7398.getClass(), "next", null);
        setIntField(term7398, term7398.getClass(), "type", 0);
        setIntField(term7398, term7398.getClass(), "intValue", 0);
        setField(term7398, term7398.getClass(), "objectValue", null);
        setField(term7387, term7387.getClass(), "propListHead", term7398);
        setIntField(term7387, term7387.getClass(), "sourcePosition", 34470066);
        setField(term7387, term7387.getClass(), "jsType", null);
        setField(term7387, term7387.getClass(), "parent", null);
        setField(term7385, term7385.getClass(), "next", term7387);
        setIntField(term7402, term7402.getClass(), "type", 0);
        setField(term7402, term7402.getClass(), "next", null);
        setField(term7402, term7402.getClass(), "first", null);
        setField(term7402, term7402.getClass(), "last", null);
        setField(term7402, term7402.getClass(), "propListHead", null);
        setIntField(term7402, term7402.getClass(), "sourcePosition", 0);
        setField(term7402, term7402.getClass(), "jsType", null);
        setField(term7402, term7402.getClass(), "parent", null);
        setField(term7385, term7385.getClass(), "first", term7402);
        setIntField(term7405, term7405.getClass(), "type", 0);
        setField(term7405, term7405.getClass(), "next", null);
        setField(term7405, term7405.getClass(), "first", null);
        setField(term7405, term7405.getClass(), "last", null);
        setField(term7405, term7405.getClass(), "propListHead", null);
        setIntField(term7405, term7405.getClass(), "sourcePosition", 0);
        setField(term7405, term7405.getClass(), "jsType", null);
        setField(term7405, term7405.getClass(), "parent", null);
        setField(term7385, term7385.getClass(), "last", term7405);
        setField(term7408, term7408.getClass(), "next", null);
        setIntField(term7408, term7408.getClass(), "type", 0);
        setIntField(term7408, term7408.getClass(), "intValue", 0);
        setField(term7408, term7408.getClass(), "objectValue", null);
        setField(term7385, term7385.getClass(), "propListHead", term7408);
        setIntField(term7385, term7385.getClass(), "sourcePosition", 2058711405);
        setField(term7385, term7385.getClass(), "jsType", null);
        setField(term7385, term7385.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term7385;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term7299, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


