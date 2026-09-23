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

public class TypeInference_traverseObjectLiteral_2856366266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5474;
     Object term5516;

    public TypeInference_traverseObjectLiteral_2856366266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34284 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term34283 = ((Class) term34284).getDeclaredField((String) "PROTECTED");
        ((Field) term34283).setAccessible(true);
        Object enum86 = ((Field) term34283).get((Object) null);
        term5474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term5476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5490 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5491 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5494 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5501 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5502 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5507 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term5509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term5474, term5474.getClass(), "compiler", null);
        setField(term5476, term5476.getClass(), "name", "McpzErOcYb");
        setField(term5476, term5476.getClass(), "referencedType", null);
        setField(term5476, term5476.getClass(), "referencedObjType", null);
        setBooleanField(term5476, term5476.getClass(), "visited", true);
        setField(term5491, term5491.getClass(), "baseType", null);
        setField(term5491, term5491.getClass(), "extendedInterfaces", null);
        setField(term5491, term5491.getClass(), "implementedInterfaces", null);
        setField(term5491, term5491.getClass(), "parameters", null);
        setField(term5491, term5491.getClass(), "thrownTypes", null);
        setField(term5491, term5491.getClass(), "templateTypeNames", null);
        setField(term5491, term5491.getClass(), "description", null);
        setField(term5491, term5491.getClass(), "meaning", null);
        setField(term5491, term5491.getClass(), "deprecated", null);
        setField(term5491, term5491.getClass(), "license", null);
        setField(term5491, term5491.getClass(), "suppressions", null);
        setField(term5491, term5491.getClass(), "modifies", null);
        setField(term5491, term5491.getClass(), "lendsName", null);
        setBooleanField(term5491, term5491.getClass(), "ngInject", true);
        setBooleanField(term5491, term5491.getClass(), "wizaction", false);
        setField(term5490, term5490.getClass(), "info", term5491);
        setField(term5494, term5494.getClass(), "sourceComment", null);
        setField(term5494, term5494.getClass(), "markers", null);
        setField(term5494, term5494.getClass(), "parameters", null);
        setField(term5494, term5494.getClass(), "throwsDescriptions", null);
        setField(term5494, term5494.getClass(), "blockDescription", null);
        setField(term5494, term5494.getClass(), "fileOverview", null);
        setField(term5494, term5494.getClass(), "returnDescription", null);
        setField(term5494, term5494.getClass(), "version", null);
        setField(term5494, term5494.getClass(), "authors", null);
        setField(term5494, term5494.getClass(), "sees", null);
        setField(term5490, term5490.getClass(), "documentation", term5494);
        setIntField(term5495, term5495.getClass(), "type", 0);
        setField(term5495, term5495.getClass(), "next", null);
        setField(term5495, term5495.getClass(), "first", null);
        setField(term5495, term5495.getClass(), "last", null);
        setField(term5495, term5495.getClass(), "propListHead", null);
        setIntField(term5495, term5495.getClass(), "sourcePosition", 0);
        setField(term5495, term5495.getClass(), "jsType", null);
        setField(term5495, term5495.getClass(), "parent", null);
        setField(term5490, term5490.getClass(), "associatedNode", term5495);
        setField(term5490, term5490.getClass(), "visibility", enum86);
        setIntField(term5490, term5490.getClass(), "bitset", -749861210);
        setField(term5501, term5501.getClass(), "root", null);
        setField(term5501, term5501.getClass(), "sourceName", null);
        setField(term5490, term5490.getClass(), "type", term5501);
        setField(term5502, term5502.getClass(), "root", null);
        setField(term5502, term5502.getClass(), "sourceName", null);
        setField(term5490, term5490.getClass(), "thisType", term5502);
        setBooleanField(term5490, term5490.getClass(), "includeDocumentation", true);
        setIntField(term5490, term5490.getClass(), "originalCommentPosition", 1694224101);
        setField(term5476, term5476.getClass(), "docInfo", term5490);
        setBooleanField(term5476, term5476.getClass(), "unknown", false);
        setBooleanField(term5476, term5476.getClass(), "resolved", false);
        setField(term5476, term5476.getClass(), "resolveResult", null);
        setField(term5507, term5507.getClass(), "templateKeys", null);
        setField(term5507, term5507.getClass(), "templateValues", null);
        setField(term5507, term5507.getClass(), "resolvedTemplateValues", null);
        setField(term5507, term5507.getClass(), "registry", null);
        setField(term5476, term5476.getClass(), "templateTypeMap", term5507);
        setBooleanField(term5476, term5476.getClass(), "inTemplatedCheckVisit", false);
        setField(term5476, term5476.getClass(), "registry", null);
        setField(term5475, term5475.getClass(), "objectIndexTemplateKey", term5476);
        setField(term5509, term5509.getClass(), "name", null);
        setField(term5509, term5509.getClass(), "referencedType", null);
        setField(term5509, term5509.getClass(), "referencedObjType", null);
        setBooleanField(term5509, term5509.getClass(), "visited", false);
        setField(term5509, term5509.getClass(), "docInfo", null);
        setBooleanField(term5509, term5509.getClass(), "unknown", false);
        setBooleanField(term5509, term5509.getClass(), "resolved", false);
        setField(term5509, term5509.getClass(), "resolveResult", null);
        setField(term5509, term5509.getClass(), "templateTypeMap", null);
        setBooleanField(term5509, term5509.getClass(), "inTemplatedCheckVisit", false);
        setField(term5509, term5509.getClass(), "registry", null);
        setField(term5475, term5475.getClass(), "objectElementTemplateKey", term5509);
        setField(term5475, term5475.getClass(), "reporter", null);
        setField(term5475, term5475.getClass(), "nativeTypes", null);
        setField(term5475, term5475.getClass(), "namesToTypes", null);
        setField(term5475, term5475.getClass(), "namespaces", null);
        setField(term5475, term5475.getClass(), "nonNullableTypeNames", null);
        setField(term5475, term5475.getClass(), "forwardDeclaredTypes", null);
        setField(term5475, term5475.getClass(), "typesIndexedByProperty", null);
        setField(term5475, term5475.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term5475, term5475.getClass(), "greatestSubtypeByProperty", null);
        setField(term5475, term5475.getClass(), "interfaceToImplementors", null);
        setField(term5475, term5475.getClass(), "unresolvedNamedTypes", null);
        setField(term5475, term5475.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5475, term5475.getClass(), "lastGeneration", false);
        setField(term5475, term5475.getClass(), "templateTypes", null);
        setField(term5475, term5475.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term5475, term5475.getClass(), "tolerateUndefinedValues", false);
        setField(term5475, term5475.getClass(), "resolveMode", null);
        setField(term5474, term5474.getClass(), "registry", term5475);
        setField(term5474, term5474.getClass(), "reverseInterpreter", null);
        setField(term5474, term5474.getClass(), "syntacticScope", null);
        setField(term5474, term5474.getClass(), "functionScope", null);
        setField(term5474, term5474.getClass(), "bottomScope", null);
        setField(term5474, term5474.getClass(), "assertionFunctionsMap", null);
        setField(term5474, term5474.getClass(), "unknownType", null);
        setField(term5474, term5474.getClass(), "cfg", null);
        setField(term5474, term5474.getClass(), "joinOp", null);
        setField(term5474, term5474.getClass(), "orderedWorkSet", null);
        term5516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5516, term5516.getClass(), "type", -916584829);
        setIntField(term5518, term5518.getClass(), "type", -2131181468);
        setIntField(term5520, term5520.getClass(), "type", 282916351);
        setIntField(term5522, term5522.getClass(), "type", 880977281);
        setIntField(term5524, term5524.getClass(), "type", 371943306);
        setField(term5524, term5524.getClass(), "next", null);
        setField(term5524, term5524.getClass(), "first", null);
        setField(term5524, term5524.getClass(), "last", null);
        setField(term5524, term5524.getClass(), "propListHead", null);
        setIntField(term5524, term5524.getClass(), "sourcePosition", 0);
        setField(term5524, term5524.getClass(), "jsType", null);
        setField(term5524, term5524.getClass(), "parent", null);
        setField(term5522, term5522.getClass(), "next", term5524);
        setIntField(term5527, term5527.getClass(), "type", 982388293);
        setField(term5527, term5527.getClass(), "next", null);
        setField(term5527, term5527.getClass(), "first", null);
        setField(term5527, term5527.getClass(), "last", term5524);
        setField(term5527, term5527.getClass(), "propListHead", null);
        setIntField(term5527, term5527.getClass(), "sourcePosition", 0);
        setField(term5527, term5527.getClass(), "jsType", null);
        setField(term5527, term5527.getClass(), "parent", null);
        setField(term5522, term5522.getClass(), "first", term5527);
        setField(term5522, term5522.getClass(), "last", term5520);
        setField(term5522, term5522.getClass(), "propListHead", null);
        setIntField(term5522, term5522.getClass(), "sourcePosition", 0);
        setField(term5522, term5522.getClass(), "jsType", null);
        setField(term5522, term5522.getClass(), "parent", null);
        setField(term5520, term5520.getClass(), "next", term5522);
        setField(term5520, term5520.getClass(), "first", term5524);
        setIntField(term5531, term5531.getClass(), "type", -75206835);
        setIntField(term5533, term5533.getClass(), "type", -1618206977);
        setField(term5533, term5533.getClass(), "next", null);
        setField(term5533, term5533.getClass(), "first", term5527);
        setField(term5533, term5533.getClass(), "last", term5522);
        setField(term5533, term5533.getClass(), "propListHead", null);
        setIntField(term5533, term5533.getClass(), "sourcePosition", 0);
        setField(term5533, term5533.getClass(), "jsType", null);
        setField(term5533, term5533.getClass(), "parent", null);
        setField(term5531, term5531.getClass(), "next", term5533);
        setField(term5531, term5531.getClass(), "first", term5518);
        setField(term5531, term5531.getClass(), "last", term5518);
        setField(term5531, term5531.getClass(), "propListHead", null);
        setIntField(term5531, term5531.getClass(), "sourcePosition", 0);
        setField(term5531, term5531.getClass(), "jsType", null);
        setField(term5531, term5531.getClass(), "parent", null);
        setField(term5520, term5520.getClass(), "last", term5531);
        setField(term5520, term5520.getClass(), "propListHead", null);
        setIntField(term5520, term5520.getClass(), "sourcePosition", 0);
        setField(term5520, term5520.getClass(), "jsType", null);
        setField(term5520, term5520.getClass(), "parent", null);
        setField(term5518, term5518.getClass(), "next", term5520);
        setIntField(term5538, term5538.getClass(), "type", -1747406163);
        setField(term5538, term5538.getClass(), "next", term5531);
        setField(term5538, term5538.getClass(), "first", term5533);
        setField(term5538, term5538.getClass(), "last", term5516);
        setField(term5538, term5538.getClass(), "propListHead", null);
        setIntField(term5538, term5538.getClass(), "sourcePosition", 0);
        setField(term5538, term5538.getClass(), "jsType", null);
        setField(term5538, term5538.getClass(), "parent", null);
        setField(term5518, term5518.getClass(), "first", term5538);
        setField(term5518, term5518.getClass(), "last", term5538);
        setField(term5518, term5518.getClass(), "propListHead", null);
        setIntField(term5518, term5518.getClass(), "sourcePosition", 0);
        setField(term5518, term5518.getClass(), "jsType", null);
        setField(term5518, term5518.getClass(), "parent", null);
        setField(term5516, term5516.getClass(), "next", term5518);
        setField(term5516, term5516.getClass(), "first", term5522);
        setField(term5516, term5516.getClass(), "last", term5524);
        setField(term5516, term5516.getClass(), "propListHead", null);
        setIntField(term5516, term5516.getClass(), "sourcePosition", 0);
        setField(term5516, term5516.getClass(), "jsType", null);
        setField(term5516, term5516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term5516;
        args[1] = null;
        try {
            callMethod(klass, "traverseObjectLiteral", argTypes, term5474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


