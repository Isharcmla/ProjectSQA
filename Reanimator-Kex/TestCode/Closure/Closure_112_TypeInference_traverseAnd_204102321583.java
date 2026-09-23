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
     Object term14332;
     Object term14376;

    public TypeInference_traverseAnd_204102321583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50431 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term50430 = ((Class) term50431).getDeclaredField((String) "INHERITED");
        ((Field) term50430).setAccessible(true);
        Object enum123 = ((Field) term50430).get((Object) null);
        term14332 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term14333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term14334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14348 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14349 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14355 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14362 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term14369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term14332, term14332.getClass(), "compiler", null);
        setField(term14334, term14334.getClass(), "name", "KIXGeHXdwi");
        setField(term14334, term14334.getClass(), "referencedType", null);
        setField(term14334, term14334.getClass(), "referencedObjType", null);
        setBooleanField(term14334, term14334.getClass(), "visited", false);
        setField(term14349, term14349.getClass(), "baseType", null);
        setField(term14349, term14349.getClass(), "extendedInterfaces", null);
        setField(term14349, term14349.getClass(), "implementedInterfaces", null);
        setField(term14349, term14349.getClass(), "parameters", null);
        setField(term14349, term14349.getClass(), "thrownTypes", null);
        setField(term14349, term14349.getClass(), "templateTypeNames", null);
        setField(term14349, term14349.getClass(), "disposedParameters", null);
        setField(term14349, term14349.getClass(), "description", null);
        setField(term14349, term14349.getClass(), "meaning", null);
        setField(term14349, term14349.getClass(), "deprecated", null);
        setField(term14349, term14349.getClass(), "license", null);
        setField(term14349, term14349.getClass(), "suppressions", null);
        setField(term14349, term14349.getClass(), "modifies", null);
        setField(term14349, term14349.getClass(), "lendsName", null);
        setBooleanField(term14349, term14349.getClass(), "ngInject", false);
        setBooleanField(term14349, term14349.getClass(), "wizaction", false);
        setBooleanField(term14349, term14349.getClass(), "jaggerInject", false);
        setBooleanField(term14349, term14349.getClass(), "jaggerProvide", false);
        setBooleanField(term14349, term14349.getClass(), "jaggerModule", false);
        setField(term14348, term14348.getClass(), "info", term14349);
        setField(term14355, term14355.getClass(), "sourceComment", null);
        setField(term14355, term14355.getClass(), "markers", null);
        setField(term14355, term14355.getClass(), "parameters", null);
        setField(term14355, term14355.getClass(), "throwsDescriptions", null);
        setField(term14355, term14355.getClass(), "blockDescription", null);
        setField(term14355, term14355.getClass(), "fileOverview", null);
        setField(term14355, term14355.getClass(), "returnDescription", null);
        setField(term14355, term14355.getClass(), "version", null);
        setField(term14355, term14355.getClass(), "authors", null);
        setField(term14355, term14355.getClass(), "sees", null);
        setField(term14348, term14348.getClass(), "documentation", term14355);
        setIntField(term14356, term14356.getClass(), "type", 0);
        setField(term14356, term14356.getClass(), "next", null);
        setField(term14356, term14356.getClass(), "first", null);
        setField(term14356, term14356.getClass(), "last", null);
        setField(term14356, term14356.getClass(), "propListHead", null);
        setIntField(term14356, term14356.getClass(), "sourcePosition", 0);
        setField(term14356, term14356.getClass(), "jsType", null);
        setField(term14356, term14356.getClass(), "parent", null);
        setField(term14348, term14348.getClass(), "associatedNode", term14356);
        setField(term14348, term14348.getClass(), "visibility", enum123);
        setIntField(term14348, term14348.getClass(), "bitset", -197820800);
        setField(term14362, term14362.getClass(), "root", null);
        setField(term14362, term14362.getClass(), "sourceName", null);
        setField(term14348, term14348.getClass(), "type", term14362);
        setField(term14348, term14348.getClass(), "thisType", term14362);
        setBooleanField(term14348, term14348.getClass(), "includeDocumentation", true);
        setIntField(term14348, term14348.getClass(), "originalCommentPosition", 723812297);
        setField(term14334, term14334.getClass(), "docInfo", term14348);
        setBooleanField(term14334, term14334.getClass(), "unknown", true);
        setBooleanField(term14334, term14334.getClass(), "resolved", true);
        setField(term14334, term14334.getClass(), "resolveResult", null);
        setField(term14367, term14367.getClass(), "templateKeys", null);
        setField(term14367, term14367.getClass(), "templateValues", null);
        setField(term14367, term14367.getClass(), "resolvedTemplateValues", null);
        setField(term14367, term14367.getClass(), "registry", null);
        setField(term14334, term14334.getClass(), "templateTypeMap", term14367);
        setBooleanField(term14334, term14334.getClass(), "inTemplatedCheckVisit", true);
        setField(term14334, term14334.getClass(), "registry", null);
        setField(term14333, term14333.getClass(), "objectIndexTemplateKey", term14334);
        setField(term14369, term14369.getClass(), "name", null);
        setField(term14369, term14369.getClass(), "referencedType", null);
        setField(term14369, term14369.getClass(), "referencedObjType", null);
        setBooleanField(term14369, term14369.getClass(), "visited", false);
        setField(term14369, term14369.getClass(), "docInfo", null);
        setBooleanField(term14369, term14369.getClass(), "unknown", false);
        setBooleanField(term14369, term14369.getClass(), "resolved", false);
        setField(term14369, term14369.getClass(), "resolveResult", null);
        setField(term14369, term14369.getClass(), "templateTypeMap", null);
        setBooleanField(term14369, term14369.getClass(), "inTemplatedCheckVisit", false);
        setField(term14369, term14369.getClass(), "registry", null);
        setField(term14333, term14333.getClass(), "objectElementTemplateKey", term14369);
        setField(term14333, term14333.getClass(), "reporter", null);
        setField(term14333, term14333.getClass(), "nativeTypes", null);
        setField(term14333, term14333.getClass(), "namesToTypes", null);
        setField(term14333, term14333.getClass(), "namespaces", null);
        setField(term14333, term14333.getClass(), "nonNullableTypeNames", null);
        setField(term14333, term14333.getClass(), "forwardDeclaredTypes", null);
        setField(term14333, term14333.getClass(), "typesIndexedByProperty", null);
        setField(term14333, term14333.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term14333, term14333.getClass(), "greatestSubtypeByProperty", null);
        setField(term14333, term14333.getClass(), "interfaceToImplementors", null);
        setField(term14333, term14333.getClass(), "unresolvedNamedTypes", null);
        setField(term14333, term14333.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14333, term14333.getClass(), "lastGeneration", false);
        setField(term14333, term14333.getClass(), "templateTypes", null);
        setField(term14333, term14333.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term14333, term14333.getClass(), "tolerateUndefinedValues", false);
        setField(term14332, term14332.getClass(), "registry", term14333);
        setField(term14332, term14332.getClass(), "reverseInterpreter", null);
        setField(term14332, term14332.getClass(), "syntacticScope", null);
        setField(term14332, term14332.getClass(), "functionScope", null);
        setField(term14332, term14332.getClass(), "bottomScope", null);
        setField(term14332, term14332.getClass(), "assertionFunctionsMap", null);
        setField(term14332, term14332.getClass(), "unknownType", null);
        setField(term14332, term14332.getClass(), "cfg", null);
        setField(term14332, term14332.getClass(), "joinOp", null);
        setField(term14332, term14332.getClass(), "orderedWorkSet", null);
        term14376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14376, term14376.getClass(), "type", 873659088);
        setIntField(term14378, term14378.getClass(), "type", -975748721);
        setIntField(term14380, term14380.getClass(), "type", 433248783);
        setIntField(term14382, term14382.getClass(), "type", -507944154);
        setIntField(term14384, term14384.getClass(), "type", -1736183862);
        setField(term14384, term14384.getClass(), "next", null);
        setField(term14384, term14384.getClass(), "first", null);
        setField(term14384, term14384.getClass(), "last", null);
        setField(term14384, term14384.getClass(), "propListHead", null);
        setIntField(term14384, term14384.getClass(), "sourcePosition", 0);
        setField(term14384, term14384.getClass(), "jsType", null);
        setField(term14384, term14384.getClass(), "parent", null);
        setField(term14382, term14382.getClass(), "next", term14384);
        setIntField(term14387, term14387.getClass(), "type", 897010381);
        setField(term14387, term14387.getClass(), "next", null);
        setField(term14387, term14387.getClass(), "first", null);
        setField(term14387, term14387.getClass(), "last", term14384);
        setField(term14387, term14387.getClass(), "propListHead", null);
        setIntField(term14387, term14387.getClass(), "sourcePosition", 0);
        setField(term14387, term14387.getClass(), "jsType", null);
        setField(term14387, term14387.getClass(), "parent", null);
        setField(term14382, term14382.getClass(), "first", term14387);
        setField(term14382, term14382.getClass(), "last", term14380);
        setField(term14382, term14382.getClass(), "propListHead", null);
        setIntField(term14382, term14382.getClass(), "sourcePosition", 0);
        setField(term14382, term14382.getClass(), "jsType", null);
        setField(term14382, term14382.getClass(), "parent", null);
        setField(term14380, term14380.getClass(), "next", term14382);
        setField(term14380, term14380.getClass(), "first", term14384);
        setIntField(term14391, term14391.getClass(), "type", 1964967720);
        setIntField(term14393, term14393.getClass(), "type", 1351900243);
        setField(term14393, term14393.getClass(), "next", null);
        setField(term14393, term14393.getClass(), "first", term14387);
        setField(term14393, term14393.getClass(), "last", term14382);
        setField(term14393, term14393.getClass(), "propListHead", null);
        setIntField(term14393, term14393.getClass(), "sourcePosition", 0);
        setField(term14393, term14393.getClass(), "jsType", null);
        setField(term14393, term14393.getClass(), "parent", null);
        setField(term14391, term14391.getClass(), "next", term14393);
        setField(term14391, term14391.getClass(), "first", term14378);
        setField(term14391, term14391.getClass(), "last", term14378);
        setField(term14391, term14391.getClass(), "propListHead", null);
        setIntField(term14391, term14391.getClass(), "sourcePosition", 0);
        setField(term14391, term14391.getClass(), "jsType", null);
        setField(term14391, term14391.getClass(), "parent", null);
        setField(term14380, term14380.getClass(), "last", term14391);
        setField(term14380, term14380.getClass(), "propListHead", null);
        setIntField(term14380, term14380.getClass(), "sourcePosition", 0);
        setField(term14380, term14380.getClass(), "jsType", null);
        setField(term14380, term14380.getClass(), "parent", null);
        setField(term14378, term14378.getClass(), "next", term14380);
        setIntField(term14398, term14398.getClass(), "type", -330897705);
        setField(term14398, term14398.getClass(), "next", term14391);
        setField(term14398, term14398.getClass(), "first", term14393);
        setField(term14398, term14398.getClass(), "last", term14376);
        setField(term14398, term14398.getClass(), "propListHead", null);
        setIntField(term14398, term14398.getClass(), "sourcePosition", 0);
        setField(term14398, term14398.getClass(), "jsType", null);
        setField(term14398, term14398.getClass(), "parent", null);
        setField(term14378, term14378.getClass(), "first", term14398);
        setField(term14378, term14378.getClass(), "last", term14398);
        setField(term14378, term14378.getClass(), "propListHead", null);
        setIntField(term14378, term14378.getClass(), "sourcePosition", 0);
        setField(term14378, term14378.getClass(), "jsType", null);
        setField(term14378, term14378.getClass(), "parent", null);
        setField(term14376, term14376.getClass(), "next", term14378);
        setField(term14376, term14376.getClass(), "first", term14382);
        setField(term14376, term14376.getClass(), "last", term14384);
        setField(term14376, term14376.getClass(), "propListHead", null);
        setIntField(term14376, term14376.getClass(), "sourcePosition", 0);
        setField(term14376, term14376.getClass(), "jsType", null);
        setField(term14376, term14376.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term14376;
        args[1] = null;
        try {
            callMethod(klass, "traverseAnd", argTypes, term14332, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


