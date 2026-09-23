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

public class TypeInference_traverseArrayLiteral_6709023665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5121;
     Object term5163;

    public TypeInference_traverseArrayLiteral_6709023665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33438 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term33437 = ((Class) term33438).getDeclaredField((String) "PUBLIC");
        ((Field) term33437).setAccessible(true);
        Object enum84 = ((Field) term33437).get((Object) null);
        term5121 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term5123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5137 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5138 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5141 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5148 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5149 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term5156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term5121, term5121.getClass(), "compiler", null);
        setField(term5123, term5123.getClass(), "name", "nQhIgWXdRc");
        setField(term5123, term5123.getClass(), "referencedType", null);
        setField(term5123, term5123.getClass(), "referencedObjType", null);
        setBooleanField(term5123, term5123.getClass(), "visited", false);
        setField(term5138, term5138.getClass(), "baseType", null);
        setField(term5138, term5138.getClass(), "extendedInterfaces", null);
        setField(term5138, term5138.getClass(), "implementedInterfaces", null);
        setField(term5138, term5138.getClass(), "parameters", null);
        setField(term5138, term5138.getClass(), "thrownTypes", null);
        setField(term5138, term5138.getClass(), "templateTypeNames", null);
        setField(term5138, term5138.getClass(), "description", null);
        setField(term5138, term5138.getClass(), "meaning", null);
        setField(term5138, term5138.getClass(), "deprecated", null);
        setField(term5138, term5138.getClass(), "license", null);
        setField(term5138, term5138.getClass(), "suppressions", null);
        setField(term5138, term5138.getClass(), "modifies", null);
        setField(term5138, term5138.getClass(), "lendsName", null);
        setBooleanField(term5138, term5138.getClass(), "ngInject", false);
        setBooleanField(term5138, term5138.getClass(), "wizaction", true);
        setField(term5137, term5137.getClass(), "info", term5138);
        setField(term5141, term5141.getClass(), "sourceComment", null);
        setField(term5141, term5141.getClass(), "markers", null);
        setField(term5141, term5141.getClass(), "parameters", null);
        setField(term5141, term5141.getClass(), "throwsDescriptions", null);
        setField(term5141, term5141.getClass(), "blockDescription", null);
        setField(term5141, term5141.getClass(), "fileOverview", null);
        setField(term5141, term5141.getClass(), "returnDescription", null);
        setField(term5141, term5141.getClass(), "version", null);
        setField(term5141, term5141.getClass(), "authors", null);
        setField(term5141, term5141.getClass(), "sees", null);
        setField(term5137, term5137.getClass(), "documentation", term5141);
        setIntField(term5142, term5142.getClass(), "type", 0);
        setField(term5142, term5142.getClass(), "next", null);
        setField(term5142, term5142.getClass(), "first", null);
        setField(term5142, term5142.getClass(), "last", null);
        setField(term5142, term5142.getClass(), "propListHead", null);
        setIntField(term5142, term5142.getClass(), "sourcePosition", 0);
        setField(term5142, term5142.getClass(), "jsType", null);
        setField(term5142, term5142.getClass(), "parent", null);
        setField(term5137, term5137.getClass(), "associatedNode", term5142);
        setField(term5137, term5137.getClass(), "visibility", enum84);
        setIntField(term5137, term5137.getClass(), "bitset", -1667990367);
        setField(term5148, term5148.getClass(), "root", null);
        setField(term5148, term5148.getClass(), "sourceName", null);
        setField(term5137, term5137.getClass(), "type", term5148);
        setField(term5149, term5149.getClass(), "root", null);
        setField(term5149, term5149.getClass(), "sourceName", null);
        setField(term5137, term5137.getClass(), "thisType", term5149);
        setBooleanField(term5137, term5137.getClass(), "includeDocumentation", true);
        setIntField(term5137, term5137.getClass(), "originalCommentPosition", -1214628358);
        setField(term5123, term5123.getClass(), "docInfo", term5137);
        setBooleanField(term5123, term5123.getClass(), "unknown", true);
        setBooleanField(term5123, term5123.getClass(), "resolved", false);
        setField(term5123, term5123.getClass(), "resolveResult", null);
        setField(term5154, term5154.getClass(), "templateKeys", null);
        setField(term5154, term5154.getClass(), "templateValues", null);
        setField(term5154, term5154.getClass(), "resolvedTemplateValues", null);
        setField(term5154, term5154.getClass(), "registry", null);
        setField(term5123, term5123.getClass(), "templateTypeMap", term5154);
        setBooleanField(term5123, term5123.getClass(), "inTemplatedCheckVisit", true);
        setField(term5123, term5123.getClass(), "registry", null);
        setField(term5122, term5122.getClass(), "objectIndexTemplateKey", term5123);
        setField(term5156, term5156.getClass(), "name", null);
        setField(term5156, term5156.getClass(), "referencedType", null);
        setField(term5156, term5156.getClass(), "referencedObjType", null);
        setBooleanField(term5156, term5156.getClass(), "visited", false);
        setField(term5156, term5156.getClass(), "docInfo", null);
        setBooleanField(term5156, term5156.getClass(), "unknown", false);
        setBooleanField(term5156, term5156.getClass(), "resolved", false);
        setField(term5156, term5156.getClass(), "resolveResult", null);
        setField(term5156, term5156.getClass(), "templateTypeMap", null);
        setBooleanField(term5156, term5156.getClass(), "inTemplatedCheckVisit", false);
        setField(term5156, term5156.getClass(), "registry", null);
        setField(term5122, term5122.getClass(), "objectElementTemplateKey", term5156);
        setField(term5122, term5122.getClass(), "reporter", null);
        setField(term5122, term5122.getClass(), "nativeTypes", null);
        setField(term5122, term5122.getClass(), "namesToTypes", null);
        setField(term5122, term5122.getClass(), "namespaces", null);
        setField(term5122, term5122.getClass(), "nonNullableTypeNames", null);
        setField(term5122, term5122.getClass(), "forwardDeclaredTypes", null);
        setField(term5122, term5122.getClass(), "typesIndexedByProperty", null);
        setField(term5122, term5122.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term5122, term5122.getClass(), "greatestSubtypeByProperty", null);
        setField(term5122, term5122.getClass(), "interfaceToImplementors", null);
        setField(term5122, term5122.getClass(), "unresolvedNamedTypes", null);
        setField(term5122, term5122.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5122, term5122.getClass(), "lastGeneration", false);
        setField(term5122, term5122.getClass(), "templateTypes", null);
        setField(term5122, term5122.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term5122, term5122.getClass(), "tolerateUndefinedValues", false);
        setField(term5122, term5122.getClass(), "resolveMode", null);
        setField(term5121, term5121.getClass(), "registry", term5122);
        setField(term5121, term5121.getClass(), "reverseInterpreter", null);
        setField(term5121, term5121.getClass(), "syntacticScope", null);
        setField(term5121, term5121.getClass(), "functionScope", null);
        setField(term5121, term5121.getClass(), "bottomScope", null);
        setField(term5121, term5121.getClass(), "assertionFunctionsMap", null);
        setField(term5121, term5121.getClass(), "unknownType", null);
        setField(term5121, term5121.getClass(), "cfg", null);
        setField(term5121, term5121.getClass(), "joinOp", null);
        setField(term5121, term5121.getClass(), "orderedWorkSet", null);
        term5163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5163, term5163.getClass(), "type", -426764678);
        setIntField(term5165, term5165.getClass(), "type", -1222614956);
        setIntField(term5167, term5167.getClass(), "type", -1870495012);
        setIntField(term5169, term5169.getClass(), "type", -1310015129);
        setIntField(term5171, term5171.getClass(), "type", -2104981311);
        setField(term5171, term5171.getClass(), "next", null);
        setField(term5171, term5171.getClass(), "first", null);
        setField(term5171, term5171.getClass(), "last", null);
        setField(term5171, term5171.getClass(), "propListHead", null);
        setIntField(term5171, term5171.getClass(), "sourcePosition", 0);
        setField(term5171, term5171.getClass(), "jsType", null);
        setField(term5171, term5171.getClass(), "parent", null);
        setField(term5169, term5169.getClass(), "next", term5171);
        setIntField(term5174, term5174.getClass(), "type", -571169753);
        setField(term5174, term5174.getClass(), "next", null);
        setField(term5174, term5174.getClass(), "first", null);
        setField(term5174, term5174.getClass(), "last", term5171);
        setField(term5174, term5174.getClass(), "propListHead", null);
        setIntField(term5174, term5174.getClass(), "sourcePosition", 0);
        setField(term5174, term5174.getClass(), "jsType", null);
        setField(term5174, term5174.getClass(), "parent", null);
        setField(term5169, term5169.getClass(), "first", term5174);
        setField(term5169, term5169.getClass(), "last", term5167);
        setField(term5169, term5169.getClass(), "propListHead", null);
        setIntField(term5169, term5169.getClass(), "sourcePosition", 0);
        setField(term5169, term5169.getClass(), "jsType", null);
        setField(term5169, term5169.getClass(), "parent", null);
        setField(term5167, term5167.getClass(), "next", term5169);
        setField(term5167, term5167.getClass(), "first", term5171);
        setIntField(term5178, term5178.getClass(), "type", -165587447);
        setIntField(term5180, term5180.getClass(), "type", -1347358701);
        setField(term5180, term5180.getClass(), "next", null);
        setField(term5180, term5180.getClass(), "first", term5174);
        setField(term5180, term5180.getClass(), "last", term5169);
        setField(term5180, term5180.getClass(), "propListHead", null);
        setIntField(term5180, term5180.getClass(), "sourcePosition", 0);
        setField(term5180, term5180.getClass(), "jsType", null);
        setField(term5180, term5180.getClass(), "parent", null);
        setField(term5178, term5178.getClass(), "next", term5180);
        setField(term5178, term5178.getClass(), "first", term5165);
        setField(term5178, term5178.getClass(), "last", term5165);
        setField(term5178, term5178.getClass(), "propListHead", null);
        setIntField(term5178, term5178.getClass(), "sourcePosition", 0);
        setField(term5178, term5178.getClass(), "jsType", null);
        setField(term5178, term5178.getClass(), "parent", null);
        setField(term5167, term5167.getClass(), "last", term5178);
        setField(term5167, term5167.getClass(), "propListHead", null);
        setIntField(term5167, term5167.getClass(), "sourcePosition", 0);
        setField(term5167, term5167.getClass(), "jsType", null);
        setField(term5167, term5167.getClass(), "parent", null);
        setField(term5165, term5165.getClass(), "next", term5167);
        setIntField(term5185, term5185.getClass(), "type", 806595993);
        setField(term5185, term5185.getClass(), "next", term5178);
        setField(term5185, term5185.getClass(), "first", term5180);
        setField(term5185, term5185.getClass(), "last", term5163);
        setField(term5185, term5185.getClass(), "propListHead", null);
        setIntField(term5185, term5185.getClass(), "sourcePosition", 0);
        setField(term5185, term5185.getClass(), "jsType", null);
        setField(term5185, term5185.getClass(), "parent", null);
        setField(term5165, term5165.getClass(), "first", term5185);
        setField(term5165, term5165.getClass(), "last", term5185);
        setField(term5165, term5165.getClass(), "propListHead", null);
        setIntField(term5165, term5165.getClass(), "sourcePosition", 0);
        setField(term5165, term5165.getClass(), "jsType", null);
        setField(term5165, term5165.getClass(), "parent", null);
        setField(term5163, term5163.getClass(), "next", term5165);
        setField(term5163, term5163.getClass(), "first", term5169);
        setField(term5163, term5163.getClass(), "last", term5171);
        setField(term5163, term5163.getClass(), "propListHead", null);
        setIntField(term5163, term5163.getClass(), "sourcePosition", 0);
        setField(term5163, term5163.getClass(), "jsType", null);
        setField(term5163, term5163.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term5163;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term5121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


