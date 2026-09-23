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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInference_traverseGetProp_22055906786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15354;
     Object term15396;

    public TypeInference_traverseGetProp_22055906786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53145 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term53144 = ((Class) term53145).getDeclaredField((String) "PUBLIC");
        ((Field) term53144).setAccessible(true);
        Object enum129 = ((Field) term53144).get((Object) null);
        term15354 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term15355 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term15356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15370 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15371 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15374 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15381 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15382 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term15389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term15354, term15354.getClass(), "compiler", null);
        setField(term15356, term15356.getClass(), "name", "nhpssUKjpK");
        setField(term15356, term15356.getClass(), "referencedType", null);
        setField(term15356, term15356.getClass(), "referencedObjType", null);
        setBooleanField(term15356, term15356.getClass(), "visited", true);
        setField(term15371, term15371.getClass(), "baseType", null);
        setField(term15371, term15371.getClass(), "extendedInterfaces", null);
        setField(term15371, term15371.getClass(), "implementedInterfaces", null);
        setField(term15371, term15371.getClass(), "parameters", null);
        setField(term15371, term15371.getClass(), "thrownTypes", null);
        setField(term15371, term15371.getClass(), "templateTypeNames", null);
        setField(term15371, term15371.getClass(), "description", null);
        setField(term15371, term15371.getClass(), "meaning", null);
        setField(term15371, term15371.getClass(), "deprecated", null);
        setField(term15371, term15371.getClass(), "license", null);
        setField(term15371, term15371.getClass(), "suppressions", null);
        setField(term15371, term15371.getClass(), "modifies", null);
        setField(term15371, term15371.getClass(), "lendsName", null);
        setBooleanField(term15371, term15371.getClass(), "ngInject", true);
        setBooleanField(term15371, term15371.getClass(), "wizaction", true);
        setField(term15370, term15370.getClass(), "info", term15371);
        setField(term15374, term15374.getClass(), "sourceComment", null);
        setField(term15374, term15374.getClass(), "markers", null);
        setField(term15374, term15374.getClass(), "parameters", null);
        setField(term15374, term15374.getClass(), "throwsDescriptions", null);
        setField(term15374, term15374.getClass(), "blockDescription", null);
        setField(term15374, term15374.getClass(), "fileOverview", null);
        setField(term15374, term15374.getClass(), "returnDescription", null);
        setField(term15374, term15374.getClass(), "version", null);
        setField(term15374, term15374.getClass(), "authors", null);
        setField(term15374, term15374.getClass(), "sees", null);
        setField(term15370, term15370.getClass(), "documentation", term15374);
        setIntField(term15375, term15375.getClass(), "type", 0);
        setField(term15375, term15375.getClass(), "next", null);
        setField(term15375, term15375.getClass(), "first", null);
        setField(term15375, term15375.getClass(), "last", null);
        setField(term15375, term15375.getClass(), "propListHead", null);
        setIntField(term15375, term15375.getClass(), "sourcePosition", 0);
        setField(term15375, term15375.getClass(), "jsType", null);
        setField(term15375, term15375.getClass(), "parent", null);
        setField(term15370, term15370.getClass(), "associatedNode", term15375);
        setField(term15370, term15370.getClass(), "visibility", enum129);
        setIntField(term15370, term15370.getClass(), "bitset", -1367122405);
        setField(term15381, term15381.getClass(), "root", null);
        setField(term15381, term15381.getClass(), "sourceName", null);
        setField(term15370, term15370.getClass(), "type", term15381);
        setField(term15382, term15382.getClass(), "root", null);
        setField(term15382, term15382.getClass(), "sourceName", null);
        setField(term15370, term15370.getClass(), "thisType", term15382);
        setBooleanField(term15370, term15370.getClass(), "includeDocumentation", false);
        setIntField(term15370, term15370.getClass(), "originalCommentPosition", -1703625118);
        setField(term15356, term15356.getClass(), "docInfo", term15370);
        setBooleanField(term15356, term15356.getClass(), "unknown", false);
        setBooleanField(term15356, term15356.getClass(), "resolved", false);
        setField(term15356, term15356.getClass(), "resolveResult", null);
        setField(term15387, term15387.getClass(), "templateKeys", null);
        setField(term15387, term15387.getClass(), "templateValues", null);
        setField(term15387, term15387.getClass(), "resolvedTemplateValues", null);
        setField(term15387, term15387.getClass(), "registry", null);
        setField(term15356, term15356.getClass(), "templateTypeMap", term15387);
        setBooleanField(term15356, term15356.getClass(), "inTemplatedCheckVisit", true);
        setField(term15356, term15356.getClass(), "registry", null);
        setField(term15355, term15355.getClass(), "objectIndexTemplateKey", term15356);
        setField(term15389, term15389.getClass(), "name", null);
        setField(term15389, term15389.getClass(), "referencedType", null);
        setField(term15389, term15389.getClass(), "referencedObjType", null);
        setBooleanField(term15389, term15389.getClass(), "visited", false);
        setField(term15389, term15389.getClass(), "docInfo", null);
        setBooleanField(term15389, term15389.getClass(), "unknown", false);
        setBooleanField(term15389, term15389.getClass(), "resolved", false);
        setField(term15389, term15389.getClass(), "resolveResult", null);
        setField(term15389, term15389.getClass(), "templateTypeMap", null);
        setBooleanField(term15389, term15389.getClass(), "inTemplatedCheckVisit", false);
        setField(term15389, term15389.getClass(), "registry", null);
        setField(term15355, term15355.getClass(), "objectElementTemplateKey", term15389);
        setField(term15355, term15355.getClass(), "reporter", null);
        setField(term15355, term15355.getClass(), "nativeTypes", null);
        setField(term15355, term15355.getClass(), "namesToTypes", null);
        setField(term15355, term15355.getClass(), "namespaces", null);
        setField(term15355, term15355.getClass(), "nonNullableTypeNames", null);
        setField(term15355, term15355.getClass(), "forwardDeclaredTypes", null);
        setField(term15355, term15355.getClass(), "typesIndexedByProperty", null);
        setField(term15355, term15355.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term15355, term15355.getClass(), "greatestSubtypeByProperty", null);
        setField(term15355, term15355.getClass(), "interfaceToImplementors", null);
        setField(term15355, term15355.getClass(), "unresolvedNamedTypes", null);
        setField(term15355, term15355.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15355, term15355.getClass(), "lastGeneration", false);
        setField(term15355, term15355.getClass(), "templateTypes", null);
        setField(term15355, term15355.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term15355, term15355.getClass(), "tolerateUndefinedValues", false);
        setField(term15355, term15355.getClass(), "resolveMode", null);
        setField(term15354, term15354.getClass(), "registry", term15355);
        setField(term15354, term15354.getClass(), "reverseInterpreter", null);
        setField(term15354, term15354.getClass(), "syntacticScope", null);
        setField(term15354, term15354.getClass(), "functionScope", null);
        setField(term15354, term15354.getClass(), "bottomScope", null);
        setField(term15354, term15354.getClass(), "assertionFunctionsMap", null);
        setField(term15354, term15354.getClass(), "unknownType", null);
        setField(term15354, term15354.getClass(), "cfg", null);
        setField(term15354, term15354.getClass(), "joinOp", null);
        setField(term15354, term15354.getClass(), "orderedWorkSet", null);
        term15396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15396, term15396.getClass(), "type", 1648665618);
        setIntField(term15398, term15398.getClass(), "type", 633765954);
        setIntField(term15400, term15400.getClass(), "type", 269110087);
        setIntField(term15402, term15402.getClass(), "type", 1545119095);
        setIntField(term15404, term15404.getClass(), "type", 1671229683);
        setField(term15404, term15404.getClass(), "next", null);
        setField(term15404, term15404.getClass(), "first", null);
        setField(term15404, term15404.getClass(), "last", null);
        setField(term15404, term15404.getClass(), "propListHead", null);
        setIntField(term15404, term15404.getClass(), "sourcePosition", 0);
        setField(term15404, term15404.getClass(), "jsType", null);
        setField(term15404, term15404.getClass(), "parent", null);
        setField(term15402, term15402.getClass(), "next", term15404);
        setIntField(term15407, term15407.getClass(), "type", 34167717);
        setField(term15407, term15407.getClass(), "next", null);
        setField(term15407, term15407.getClass(), "first", null);
        setField(term15407, term15407.getClass(), "last", term15404);
        setField(term15407, term15407.getClass(), "propListHead", null);
        setIntField(term15407, term15407.getClass(), "sourcePosition", 0);
        setField(term15407, term15407.getClass(), "jsType", null);
        setField(term15407, term15407.getClass(), "parent", null);
        setField(term15402, term15402.getClass(), "first", term15407);
        setField(term15402, term15402.getClass(), "last", term15400);
        setField(term15402, term15402.getClass(), "propListHead", null);
        setIntField(term15402, term15402.getClass(), "sourcePosition", 0);
        setField(term15402, term15402.getClass(), "jsType", null);
        setField(term15402, term15402.getClass(), "parent", null);
        setField(term15400, term15400.getClass(), "next", term15402);
        setField(term15400, term15400.getClass(), "first", term15404);
        setIntField(term15411, term15411.getClass(), "type", -297946422);
        setIntField(term15413, term15413.getClass(), "type", 385463636);
        setField(term15413, term15413.getClass(), "next", null);
        setField(term15413, term15413.getClass(), "first", term15407);
        setField(term15413, term15413.getClass(), "last", term15402);
        setField(term15413, term15413.getClass(), "propListHead", null);
        setIntField(term15413, term15413.getClass(), "sourcePosition", 0);
        setField(term15413, term15413.getClass(), "jsType", null);
        setField(term15413, term15413.getClass(), "parent", null);
        setField(term15411, term15411.getClass(), "next", term15413);
        setField(term15411, term15411.getClass(), "first", term15398);
        setField(term15411, term15411.getClass(), "last", term15398);
        setField(term15411, term15411.getClass(), "propListHead", null);
        setIntField(term15411, term15411.getClass(), "sourcePosition", 0);
        setField(term15411, term15411.getClass(), "jsType", null);
        setField(term15411, term15411.getClass(), "parent", null);
        setField(term15400, term15400.getClass(), "last", term15411);
        setField(term15400, term15400.getClass(), "propListHead", null);
        setIntField(term15400, term15400.getClass(), "sourcePosition", 0);
        setField(term15400, term15400.getClass(), "jsType", null);
        setField(term15400, term15400.getClass(), "parent", null);
        setField(term15398, term15398.getClass(), "next", term15400);
        setIntField(term15418, term15418.getClass(), "type", -1677599962);
        setField(term15418, term15418.getClass(), "next", term15411);
        setField(term15418, term15418.getClass(), "first", term15413);
        setField(term15418, term15418.getClass(), "last", term15396);
        setField(term15418, term15418.getClass(), "propListHead", null);
        setIntField(term15418, term15418.getClass(), "sourcePosition", 0);
        setField(term15418, term15418.getClass(), "jsType", null);
        setField(term15418, term15418.getClass(), "parent", null);
        setField(term15398, term15398.getClass(), "first", term15418);
        setField(term15398, term15398.getClass(), "last", term15418);
        setField(term15398, term15398.getClass(), "propListHead", null);
        setIntField(term15398, term15398.getClass(), "sourcePosition", 0);
        setField(term15398, term15398.getClass(), "jsType", null);
        setField(term15398, term15398.getClass(), "parent", null);
        setField(term15396, term15396.getClass(), "next", term15398);
        setField(term15396, term15396.getClass(), "first", term15402);
        setField(term15396, term15396.getClass(), "last", term15404);
        setField(term15396, term15396.getClass(), "propListHead", null);
        setIntField(term15396, term15396.getClass(), "sourcePosition", 0);
        setField(term15396, term15396.getClass(), "jsType", null);
        setField(term15396, term15396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term15396;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term15354, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


