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
import java.lang.String;

public class TypeInference_traverseAnd_204102321583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14295;
     Object term14337;

    public TypeInference_traverseAnd_204102321583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50690 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term50689 = ((Class) term50690).getDeclaredField((String) "PROTECTED");
        ((Field) term50689).setAccessible(true);
        Object enum124 = ((Field) term50689).get((Object) null);
        term14295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term14296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term14297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14311 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14312 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14315 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14322 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14323 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term14330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term14295, term14295.getClass(), "compiler", null);
        setField(term14297, term14297.getClass(), "name", "PqduvNFXXw");
        setField(term14297, term14297.getClass(), "referencedType", null);
        setField(term14297, term14297.getClass(), "referencedObjType", null);
        setBooleanField(term14297, term14297.getClass(), "visited", true);
        setField(term14312, term14312.getClass(), "baseType", null);
        setField(term14312, term14312.getClass(), "extendedInterfaces", null);
        setField(term14312, term14312.getClass(), "implementedInterfaces", null);
        setField(term14312, term14312.getClass(), "parameters", null);
        setField(term14312, term14312.getClass(), "thrownTypes", null);
        setField(term14312, term14312.getClass(), "templateTypeNames", null);
        setField(term14312, term14312.getClass(), "description", null);
        setField(term14312, term14312.getClass(), "meaning", null);
        setField(term14312, term14312.getClass(), "deprecated", null);
        setField(term14312, term14312.getClass(), "license", null);
        setField(term14312, term14312.getClass(), "suppressions", null);
        setField(term14312, term14312.getClass(), "modifies", null);
        setField(term14312, term14312.getClass(), "lendsName", null);
        setBooleanField(term14312, term14312.getClass(), "ngInject", true);
        setBooleanField(term14312, term14312.getClass(), "wizaction", false);
        setField(term14311, term14311.getClass(), "info", term14312);
        setField(term14315, term14315.getClass(), "sourceComment", null);
        setField(term14315, term14315.getClass(), "markers", null);
        setField(term14315, term14315.getClass(), "parameters", null);
        setField(term14315, term14315.getClass(), "throwsDescriptions", null);
        setField(term14315, term14315.getClass(), "blockDescription", null);
        setField(term14315, term14315.getClass(), "fileOverview", null);
        setField(term14315, term14315.getClass(), "returnDescription", null);
        setField(term14315, term14315.getClass(), "version", null);
        setField(term14315, term14315.getClass(), "authors", null);
        setField(term14315, term14315.getClass(), "sees", null);
        setField(term14311, term14311.getClass(), "documentation", term14315);
        setIntField(term14316, term14316.getClass(), "type", 0);
        setField(term14316, term14316.getClass(), "next", null);
        setField(term14316, term14316.getClass(), "first", null);
        setField(term14316, term14316.getClass(), "last", null);
        setField(term14316, term14316.getClass(), "propListHead", null);
        setIntField(term14316, term14316.getClass(), "sourcePosition", 0);
        setField(term14316, term14316.getClass(), "jsType", null);
        setField(term14316, term14316.getClass(), "parent", null);
        setField(term14311, term14311.getClass(), "associatedNode", term14316);
        setField(term14311, term14311.getClass(), "visibility", enum124);
        setIntField(term14311, term14311.getClass(), "bitset", -1698809299);
        setField(term14322, term14322.getClass(), "root", term14316);
        setField(term14322, term14322.getClass(), "sourceName", null);
        setField(term14311, term14311.getClass(), "type", term14322);
        setField(term14323, term14323.getClass(), "root", null);
        setField(term14323, term14323.getClass(), "sourceName", null);
        setField(term14311, term14311.getClass(), "thisType", term14323);
        setBooleanField(term14311, term14311.getClass(), "includeDocumentation", false);
        setIntField(term14311, term14311.getClass(), "originalCommentPosition", 401512128);
        setField(term14297, term14297.getClass(), "docInfo", term14311);
        setBooleanField(term14297, term14297.getClass(), "unknown", true);
        setBooleanField(term14297, term14297.getClass(), "resolved", false);
        setField(term14297, term14297.getClass(), "resolveResult", null);
        setField(term14328, term14328.getClass(), "templateKeys", null);
        setField(term14328, term14328.getClass(), "templateValues", null);
        setField(term14328, term14328.getClass(), "resolvedTemplateValues", null);
        setField(term14328, term14328.getClass(), "registry", null);
        setField(term14297, term14297.getClass(), "templateTypeMap", term14328);
        setBooleanField(term14297, term14297.getClass(), "inTemplatedCheckVisit", false);
        setField(term14297, term14297.getClass(), "registry", null);
        setField(term14296, term14296.getClass(), "objectIndexTemplateKey", term14297);
        setField(term14330, term14330.getClass(), "name", null);
        setField(term14330, term14330.getClass(), "referencedType", null);
        setField(term14330, term14330.getClass(), "referencedObjType", null);
        setBooleanField(term14330, term14330.getClass(), "visited", false);
        setField(term14330, term14330.getClass(), "docInfo", null);
        setBooleanField(term14330, term14330.getClass(), "unknown", false);
        setBooleanField(term14330, term14330.getClass(), "resolved", false);
        setField(term14330, term14330.getClass(), "resolveResult", null);
        setField(term14330, term14330.getClass(), "templateTypeMap", null);
        setBooleanField(term14330, term14330.getClass(), "inTemplatedCheckVisit", false);
        setField(term14330, term14330.getClass(), "registry", null);
        setField(term14296, term14296.getClass(), "objectElementTemplateKey", term14330);
        setField(term14296, term14296.getClass(), "reporter", null);
        setField(term14296, term14296.getClass(), "nativeTypes", null);
        setField(term14296, term14296.getClass(), "namesToTypes", null);
        setField(term14296, term14296.getClass(), "namespaces", null);
        setField(term14296, term14296.getClass(), "nonNullableTypeNames", null);
        setField(term14296, term14296.getClass(), "forwardDeclaredTypes", null);
        setField(term14296, term14296.getClass(), "typesIndexedByProperty", null);
        setField(term14296, term14296.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term14296, term14296.getClass(), "greatestSubtypeByProperty", null);
        setField(term14296, term14296.getClass(), "interfaceToImplementors", null);
        setField(term14296, term14296.getClass(), "unresolvedNamedTypes", null);
        setField(term14296, term14296.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14296, term14296.getClass(), "lastGeneration", false);
        setField(term14296, term14296.getClass(), "templateTypes", null);
        setField(term14296, term14296.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term14296, term14296.getClass(), "tolerateUndefinedValues", false);
        setField(term14296, term14296.getClass(), "resolveMode", null);
        setField(term14295, term14295.getClass(), "registry", term14296);
        setField(term14295, term14295.getClass(), "reverseInterpreter", null);
        setField(term14295, term14295.getClass(), "syntacticScope", null);
        setField(term14295, term14295.getClass(), "functionScope", null);
        setField(term14295, term14295.getClass(), "bottomScope", null);
        setField(term14295, term14295.getClass(), "assertionFunctionsMap", null);
        setField(term14295, term14295.getClass(), "unknownType", null);
        setField(term14295, term14295.getClass(), "cfg", null);
        setField(term14295, term14295.getClass(), "joinOp", null);
        setField(term14295, term14295.getClass(), "orderedWorkSet", null);
        term14337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14337, term14337.getClass(), "type", 1543696412);
        setIntField(term14339, term14339.getClass(), "type", -1385748168);
        setIntField(term14341, term14341.getClass(), "type", -270592367);
        setIntField(term14343, term14343.getClass(), "type", 178847646);
        setIntField(term14345, term14345.getClass(), "type", 273590437);
        setField(term14345, term14345.getClass(), "next", null);
        setField(term14345, term14345.getClass(), "first", null);
        setField(term14345, term14345.getClass(), "last", null);
        setField(term14345, term14345.getClass(), "propListHead", null);
        setIntField(term14345, term14345.getClass(), "sourcePosition", 0);
        setField(term14345, term14345.getClass(), "jsType", null);
        setField(term14345, term14345.getClass(), "parent", null);
        setField(term14343, term14343.getClass(), "next", term14345);
        setIntField(term14348, term14348.getClass(), "type", -348612876);
        setField(term14348, term14348.getClass(), "next", null);
        setField(term14348, term14348.getClass(), "first", null);
        setField(term14348, term14348.getClass(), "last", term14345);
        setField(term14348, term14348.getClass(), "propListHead", null);
        setIntField(term14348, term14348.getClass(), "sourcePosition", 0);
        setField(term14348, term14348.getClass(), "jsType", null);
        setField(term14348, term14348.getClass(), "parent", null);
        setField(term14343, term14343.getClass(), "first", term14348);
        setField(term14343, term14343.getClass(), "last", term14341);
        setField(term14343, term14343.getClass(), "propListHead", null);
        setIntField(term14343, term14343.getClass(), "sourcePosition", 0);
        setField(term14343, term14343.getClass(), "jsType", null);
        setField(term14343, term14343.getClass(), "parent", null);
        setField(term14341, term14341.getClass(), "next", term14343);
        setField(term14341, term14341.getClass(), "first", term14345);
        setIntField(term14352, term14352.getClass(), "type", -838848221);
        setIntField(term14354, term14354.getClass(), "type", 1163761623);
        setField(term14354, term14354.getClass(), "next", null);
        setField(term14354, term14354.getClass(), "first", term14348);
        setField(term14354, term14354.getClass(), "last", term14343);
        setField(term14354, term14354.getClass(), "propListHead", null);
        setIntField(term14354, term14354.getClass(), "sourcePosition", 0);
        setField(term14354, term14354.getClass(), "jsType", null);
        setField(term14354, term14354.getClass(), "parent", null);
        setField(term14352, term14352.getClass(), "next", term14354);
        setField(term14352, term14352.getClass(), "first", term14339);
        setField(term14352, term14352.getClass(), "last", term14339);
        setField(term14352, term14352.getClass(), "propListHead", null);
        setIntField(term14352, term14352.getClass(), "sourcePosition", 0);
        setField(term14352, term14352.getClass(), "jsType", null);
        setField(term14352, term14352.getClass(), "parent", null);
        setField(term14341, term14341.getClass(), "last", term14352);
        setField(term14341, term14341.getClass(), "propListHead", null);
        setIntField(term14341, term14341.getClass(), "sourcePosition", 0);
        setField(term14341, term14341.getClass(), "jsType", null);
        setField(term14341, term14341.getClass(), "parent", null);
        setField(term14339, term14339.getClass(), "next", term14341);
        setIntField(term14359, term14359.getClass(), "type", 718742281);
        setField(term14359, term14359.getClass(), "next", term14352);
        setField(term14359, term14359.getClass(), "first", term14354);
        setField(term14359, term14359.getClass(), "last", term14337);
        setField(term14359, term14359.getClass(), "propListHead", null);
        setIntField(term14359, term14359.getClass(), "sourcePosition", 0);
        setField(term14359, term14359.getClass(), "jsType", null);
        setField(term14359, term14359.getClass(), "parent", null);
        setField(term14339, term14339.getClass(), "first", term14359);
        setField(term14339, term14339.getClass(), "last", term14359);
        setField(term14339, term14339.getClass(), "propListHead", null);
        setIntField(term14339, term14339.getClass(), "sourcePosition", 0);
        setField(term14339, term14339.getClass(), "jsType", null);
        setField(term14339, term14339.getClass(), "parent", null);
        setField(term14337, term14337.getClass(), "next", term14339);
        setField(term14337, term14337.getClass(), "first", term14343);
        setField(term14337, term14337.getClass(), "last", term14345);
        setField(term14337, term14337.getClass(), "propListHead", null);
        setIntField(term14337, term14337.getClass(), "sourcePosition", 0);
        setField(term14337, term14337.getClass(), "jsType", null);
        setField(term14337, term14337.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term14337;
        args[1] = null;
        try {
            callMethod(klass, "traverseAnd", argTypes, term14295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


