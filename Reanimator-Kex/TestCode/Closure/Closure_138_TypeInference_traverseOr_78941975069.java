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

public class TypeInference_traverseOr_78941975069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12134;
     Object term12220;

    public TypeInference_traverseOr_78941975069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12137 = new HashMap();
        HashMap term12146 = new HashMap();
        Set<Object> term41967 =  ((Map) term12146).keySet();
        HashSet term12145 = new HashSet((Collection<? extends Object>) term41967);
        HashMap term12153 = new HashMap();
        Set<Object> term41968 =  ((Map) term12153).keySet();
        HashSet term12152 = new HashSet((Collection<? extends Object>) term41968);
        HashMap term12160 = new HashMap();
        Set<Object> term41969 =  ((Map) term12160).keySet();
        HashSet term12159 = new HashSet((Collection<? extends Object>) term41969);
        HashMap term12166 = new HashMap();
        HashMap term12171 = new HashMap();
        Class<? extends Object> term41991 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term41990 = ((Class) term41991).getDeclaredField((String) "PROTECTED");
        ((Field) term41990).setAccessible(true);
        Object enum93 = ((Field) term41990).get((Object) null);
        term12134 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term12135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12136 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term12192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12206 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12207 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12208 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12213 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12214 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12218 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term12134, term12134.getClass(), "compiler", null);
        setField(term12135, term12135.getClass(), "reporter", null);
        setField(term12135, term12135.getClass(), "nativeTypes", term12136);
        setField(term12135, term12135.getClass(), "namesToTypes", term12137);
        setField(term12135, term12135.getClass(), "namespaces", term12145);
        setField(term12135, term12135.getClass(), "enumTypeNames", term12152);
        setField(term12135, term12135.getClass(), "forwardDeclaredTypes", term12159);
        setField(term12135, term12135.getClass(), "typesIndexedByProperty", term12166);
        setField(term12135, term12135.getClass(), "greatestSubtypeByProperty", term12171);
        setField(term12135, term12135.getClass(), "interfaceToImplementors", null);
        setField(term12135, term12135.getClass(), "unresolvedNamedTypes", null);
        setField(term12135, term12135.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12135, term12135.getClass(), "lastGeneration", true);
        setField(term12135, term12135.getClass(), "templateTypeName", "GLbyDfbNZI");
        setField(term12192, term12192.getClass(), "name", "oNLcCYDAsO");
        setField(term12192, term12192.getClass(), "referencedType", null);
        setBooleanField(term12192, term12192.getClass(), "visited", false);
        setField(term12207, term12207.getClass(), "baseType", null);
        setField(term12207, term12207.getClass(), "implementedInterfaces", null);
        setField(term12207, term12207.getClass(), "parameters", null);
        setField(term12207, term12207.getClass(), "thrownTypes", null);
        setField(term12207, term12207.getClass(), "templateTypeName", null);
        setField(term12207, term12207.getClass(), "description", null);
        setField(term12207, term12207.getClass(), "deprecated", null);
        setField(term12207, term12207.getClass(), "license", null);
        setField(term12207, term12207.getClass(), "suppressions", null);
        setField(term12206, term12206.getClass(), "info", term12207);
        setField(term12208, term12208.getClass(), "markers", null);
        setField(term12208, term12208.getClass(), "parameters", null);
        setField(term12208, term12208.getClass(), "throwsDescriptions", null);
        setField(term12208, term12208.getClass(), "blockDescription", null);
        setField(term12208, term12208.getClass(), "fileOverview", null);
        setField(term12208, term12208.getClass(), "returnDescription", null);
        setField(term12208, term12208.getClass(), "version", null);
        setField(term12208, term12208.getClass(), "authors", null);
        setField(term12208, term12208.getClass(), "sees", null);
        setField(term12206, term12206.getClass(), "documentation", term12208);
        setField(term12206, term12206.getClass(), "sourceName", "");
        setField(term12206, term12206.getClass(), "visibility", enum93);
        setIntField(term12206, term12206.getClass(), "bitset", 1241164745);
        setField(term12213, term12213.getClass(), "root", null);
        setField(term12213, term12213.getClass(), "sourceName", null);
        setField(term12213, term12213.getClass(), "registry", null);
        setField(term12206, term12206.getClass(), "type", term12213);
        setField(term12214, term12214.getClass(), "root", null);
        setField(term12214, term12214.getClass(), "sourceName", null);
        setField(term12214, term12214.getClass(), "registry", null);
        setField(term12206, term12206.getClass(), "thisType", term12214);
        setBooleanField(term12206, term12206.getClass(), "includeDocumentation", true);
        setField(term12192, term12192.getClass(), "docInfo", term12206);
        setBooleanField(term12192, term12192.getClass(), "unknown", false);
        setBooleanField(term12192, term12192.getClass(), "resolved", false);
        setField(term12192, term12192.getClass(), "resolveResult", null);
        setField(term12192, term12192.getClass(), "registry", null);
        setField(term12135, term12135.getClass(), "templateType", term12192);
        setField(term12134, term12134.getClass(), "registry", term12135);
        setField(term12134, term12134.getClass(), "reverseInterpreter", null);
        setField(term12218, term12218.getClass(), "vars", null);
        setField(term12218, term12218.getClass(), "parent", null);
        setField(term12218, term12218.getClass(), "rootNode", null);
        setField(term12218, term12218.getClass(), "thisType", null);
        setBooleanField(term12218, term12218.getClass(), "isBottom", false);
        setField(term12134, term12134.getClass(), "syntacticScope", term12218);
        setField(term12134, term12134.getClass(), "functionScope", null);
        setField(term12134, term12134.getClass(), "bottomScope", null);
        setField(term12134, term12134.getClass(), "assignedOuterLocalVars", null);
        setField(term12134, term12134.getClass(), "unflowableVarNames", null);
        setField(term12134, term12134.getClass(), "cfg", null);
        setField(term12134, term12134.getClass(), "joinOp", null);
        setField(term12134, term12134.getClass(), "orderedWorkSet", null);
        term12220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12243 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12220, term12220.getClass(), "type", -1703035419);
        setIntField(term12222, term12222.getClass(), "type", 947897214);
        setIntField(term12224, term12224.getClass(), "type", 0);
        setField(term12224, term12224.getClass(), "next", null);
        setField(term12224, term12224.getClass(), "first", null);
        setField(term12224, term12224.getClass(), "last", null);
        setField(term12224, term12224.getClass(), "propListHead", null);
        setIntField(term12224, term12224.getClass(), "sourcePosition", 0);
        setField(term12224, term12224.getClass(), "jsType", null);
        setField(term12224, term12224.getClass(), "parent", null);
        setField(term12222, term12222.getClass(), "next", term12224);
        setIntField(term12227, term12227.getClass(), "type", 0);
        setField(term12227, term12227.getClass(), "next", null);
        setField(term12227, term12227.getClass(), "first", null);
        setField(term12227, term12227.getClass(), "last", null);
        setField(term12227, term12227.getClass(), "propListHead", null);
        setIntField(term12227, term12227.getClass(), "sourcePosition", 0);
        setField(term12227, term12227.getClass(), "jsType", null);
        setField(term12227, term12227.getClass(), "parent", null);
        setField(term12222, term12222.getClass(), "first", term12227);
        setIntField(term12230, term12230.getClass(), "type", 0);
        setField(term12230, term12230.getClass(), "next", null);
        setField(term12230, term12230.getClass(), "first", null);
        setField(term12230, term12230.getClass(), "last", null);
        setField(term12230, term12230.getClass(), "propListHead", null);
        setIntField(term12230, term12230.getClass(), "sourcePosition", 0);
        setField(term12230, term12230.getClass(), "jsType", null);
        setField(term12230, term12230.getClass(), "parent", null);
        setField(term12222, term12222.getClass(), "last", term12230);
        setField(term12233, term12233.getClass(), "next", null);
        setIntField(term12233, term12233.getClass(), "type", 0);
        setIntField(term12233, term12233.getClass(), "intValue", 0);
        setField(term12233, term12233.getClass(), "objectValue", null);
        setField(term12222, term12222.getClass(), "propListHead", term12233);
        setIntField(term12222, term12222.getClass(), "sourcePosition", 43258317);
        setField(term12222, term12222.getClass(), "jsType", null);
        setField(term12222, term12222.getClass(), "parent", null);
        setField(term12220, term12220.getClass(), "next", term12222);
        setIntField(term12237, term12237.getClass(), "type", 0);
        setField(term12237, term12237.getClass(), "next", null);
        setField(term12237, term12237.getClass(), "first", null);
        setField(term12237, term12237.getClass(), "last", null);
        setField(term12237, term12237.getClass(), "propListHead", null);
        setIntField(term12237, term12237.getClass(), "sourcePosition", 0);
        setField(term12237, term12237.getClass(), "jsType", null);
        setField(term12237, term12237.getClass(), "parent", null);
        setField(term12220, term12220.getClass(), "first", term12237);
        setIntField(term12240, term12240.getClass(), "type", 0);
        setField(term12240, term12240.getClass(), "next", null);
        setField(term12240, term12240.getClass(), "first", null);
        setField(term12240, term12240.getClass(), "last", null);
        setField(term12240, term12240.getClass(), "propListHead", null);
        setIntField(term12240, term12240.getClass(), "sourcePosition", 0);
        setField(term12240, term12240.getClass(), "jsType", null);
        setField(term12240, term12240.getClass(), "parent", null);
        setField(term12220, term12220.getClass(), "last", term12240);
        setField(term12243, term12243.getClass(), "next", null);
        setIntField(term12243, term12243.getClass(), "type", 0);
        setIntField(term12243, term12243.getClass(), "intValue", 0);
        setField(term12243, term12243.getClass(), "objectValue", null);
        setField(term12220, term12220.getClass(), "propListHead", term12243);
        setIntField(term12220, term12220.getClass(), "sourcePosition", 1707220033);
        setField(term12220, term12220.getClass(), "jsType", null);
        setField(term12220, term12220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term12220;
        args[1] = null;
        try {
            callMethod(klass, "traverseOr", argTypes, term12134, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


