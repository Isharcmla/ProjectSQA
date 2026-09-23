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

public class TypeInference_traverseHook_7360896969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6481;
     Object term6523;

    public TypeInference_traverseHook_7360896969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36319 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term36318 = ((Class) term36319).getDeclaredField((String) "PROTECTED");
        ((Field) term36318).setAccessible(true);
        Object enum90 = ((Field) term36318).get((Object) null);
        term6481 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term6483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6497 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6498 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6501 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6508 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6509 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term6516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term6481, term6481.getClass(), "compiler", null);
        setField(term6483, term6483.getClass(), "name", "vMsWjuPTnO");
        setField(term6483, term6483.getClass(), "referencedType", null);
        setField(term6483, term6483.getClass(), "referencedObjType", null);
        setBooleanField(term6483, term6483.getClass(), "visited", true);
        setField(term6498, term6498.getClass(), "baseType", null);
        setField(term6498, term6498.getClass(), "extendedInterfaces", null);
        setField(term6498, term6498.getClass(), "implementedInterfaces", null);
        setField(term6498, term6498.getClass(), "parameters", null);
        setField(term6498, term6498.getClass(), "thrownTypes", null);
        setField(term6498, term6498.getClass(), "templateTypeNames", null);
        setField(term6498, term6498.getClass(), "description", null);
        setField(term6498, term6498.getClass(), "meaning", null);
        setField(term6498, term6498.getClass(), "deprecated", null);
        setField(term6498, term6498.getClass(), "license", null);
        setField(term6498, term6498.getClass(), "suppressions", null);
        setField(term6498, term6498.getClass(), "modifies", null);
        setField(term6498, term6498.getClass(), "lendsName", null);
        setBooleanField(term6498, term6498.getClass(), "ngInject", false);
        setBooleanField(term6498, term6498.getClass(), "wizaction", false);
        setField(term6497, term6497.getClass(), "info", term6498);
        setField(term6501, term6501.getClass(), "sourceComment", null);
        setField(term6501, term6501.getClass(), "markers", null);
        setField(term6501, term6501.getClass(), "parameters", null);
        setField(term6501, term6501.getClass(), "throwsDescriptions", null);
        setField(term6501, term6501.getClass(), "blockDescription", null);
        setField(term6501, term6501.getClass(), "fileOverview", null);
        setField(term6501, term6501.getClass(), "returnDescription", null);
        setField(term6501, term6501.getClass(), "version", null);
        setField(term6501, term6501.getClass(), "authors", null);
        setField(term6501, term6501.getClass(), "sees", null);
        setField(term6497, term6497.getClass(), "documentation", term6501);
        setIntField(term6502, term6502.getClass(), "type", 0);
        setField(term6502, term6502.getClass(), "next", null);
        setField(term6502, term6502.getClass(), "first", null);
        setField(term6502, term6502.getClass(), "last", null);
        setField(term6502, term6502.getClass(), "propListHead", null);
        setIntField(term6502, term6502.getClass(), "sourcePosition", 0);
        setField(term6502, term6502.getClass(), "jsType", null);
        setField(term6502, term6502.getClass(), "parent", null);
        setField(term6497, term6497.getClass(), "associatedNode", term6502);
        setField(term6497, term6497.getClass(), "visibility", enum90);
        setIntField(term6497, term6497.getClass(), "bitset", 477625804);
        setField(term6508, term6508.getClass(), "root", null);
        setField(term6508, term6508.getClass(), "sourceName", null);
        setField(term6497, term6497.getClass(), "type", term6508);
        setField(term6509, term6509.getClass(), "root", null);
        setField(term6509, term6509.getClass(), "sourceName", null);
        setField(term6497, term6497.getClass(), "thisType", term6509);
        setBooleanField(term6497, term6497.getClass(), "includeDocumentation", true);
        setIntField(term6497, term6497.getClass(), "originalCommentPosition", 252575029);
        setField(term6483, term6483.getClass(), "docInfo", term6497);
        setBooleanField(term6483, term6483.getClass(), "unknown", false);
        setBooleanField(term6483, term6483.getClass(), "resolved", true);
        setField(term6483, term6483.getClass(), "resolveResult", null);
        setField(term6514, term6514.getClass(), "templateKeys", null);
        setField(term6514, term6514.getClass(), "templateValues", null);
        setField(term6514, term6514.getClass(), "resolvedTemplateValues", null);
        setField(term6514, term6514.getClass(), "registry", null);
        setField(term6483, term6483.getClass(), "templateTypeMap", term6514);
        setBooleanField(term6483, term6483.getClass(), "inTemplatedCheckVisit", false);
        setField(term6483, term6483.getClass(), "registry", null);
        setField(term6482, term6482.getClass(), "objectIndexTemplateKey", term6483);
        setField(term6516, term6516.getClass(), "name", null);
        setField(term6516, term6516.getClass(), "referencedType", null);
        setField(term6516, term6516.getClass(), "referencedObjType", null);
        setBooleanField(term6516, term6516.getClass(), "visited", false);
        setField(term6516, term6516.getClass(), "docInfo", null);
        setBooleanField(term6516, term6516.getClass(), "unknown", false);
        setBooleanField(term6516, term6516.getClass(), "resolved", false);
        setField(term6516, term6516.getClass(), "resolveResult", null);
        setField(term6516, term6516.getClass(), "templateTypeMap", null);
        setBooleanField(term6516, term6516.getClass(), "inTemplatedCheckVisit", false);
        setField(term6516, term6516.getClass(), "registry", null);
        setField(term6482, term6482.getClass(), "objectElementTemplateKey", term6516);
        setField(term6482, term6482.getClass(), "reporter", null);
        setField(term6482, term6482.getClass(), "nativeTypes", null);
        setField(term6482, term6482.getClass(), "namesToTypes", null);
        setField(term6482, term6482.getClass(), "namespaces", null);
        setField(term6482, term6482.getClass(), "nonNullableTypeNames", null);
        setField(term6482, term6482.getClass(), "forwardDeclaredTypes", null);
        setField(term6482, term6482.getClass(), "typesIndexedByProperty", null);
        setField(term6482, term6482.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term6482, term6482.getClass(), "greatestSubtypeByProperty", null);
        setField(term6482, term6482.getClass(), "interfaceToImplementors", null);
        setField(term6482, term6482.getClass(), "unresolvedNamedTypes", null);
        setField(term6482, term6482.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6482, term6482.getClass(), "lastGeneration", false);
        setField(term6482, term6482.getClass(), "templateTypes", null);
        setField(term6482, term6482.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term6482, term6482.getClass(), "tolerateUndefinedValues", false);
        setField(term6482, term6482.getClass(), "resolveMode", null);
        setField(term6481, term6481.getClass(), "registry", term6482);
        setField(term6481, term6481.getClass(), "reverseInterpreter", null);
        setField(term6481, term6481.getClass(), "syntacticScope", null);
        setField(term6481, term6481.getClass(), "functionScope", null);
        setField(term6481, term6481.getClass(), "bottomScope", null);
        setField(term6481, term6481.getClass(), "assertionFunctionsMap", null);
        setField(term6481, term6481.getClass(), "unknownType", null);
        setField(term6481, term6481.getClass(), "cfg", null);
        setField(term6481, term6481.getClass(), "joinOp", null);
        setField(term6481, term6481.getClass(), "orderedWorkSet", null);
        term6523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6523, term6523.getClass(), "type", 1460722225);
        setIntField(term6525, term6525.getClass(), "type", 1743224434);
        setIntField(term6527, term6527.getClass(), "type", 842904495);
        setIntField(term6529, term6529.getClass(), "type", 1008080511);
        setIntField(term6531, term6531.getClass(), "type", 1935707624);
        setField(term6531, term6531.getClass(), "next", null);
        setField(term6531, term6531.getClass(), "first", null);
        setField(term6531, term6531.getClass(), "last", null);
        setField(term6531, term6531.getClass(), "propListHead", null);
        setIntField(term6531, term6531.getClass(), "sourcePosition", 0);
        setField(term6531, term6531.getClass(), "jsType", null);
        setField(term6531, term6531.getClass(), "parent", null);
        setField(term6529, term6529.getClass(), "next", term6531);
        setIntField(term6534, term6534.getClass(), "type", 1507074215);
        setField(term6534, term6534.getClass(), "next", null);
        setField(term6534, term6534.getClass(), "first", null);
        setField(term6534, term6534.getClass(), "last", term6531);
        setField(term6534, term6534.getClass(), "propListHead", null);
        setIntField(term6534, term6534.getClass(), "sourcePosition", 0);
        setField(term6534, term6534.getClass(), "jsType", null);
        setField(term6534, term6534.getClass(), "parent", null);
        setField(term6529, term6529.getClass(), "first", term6534);
        setField(term6529, term6529.getClass(), "last", term6527);
        setField(term6529, term6529.getClass(), "propListHead", null);
        setIntField(term6529, term6529.getClass(), "sourcePosition", 0);
        setField(term6529, term6529.getClass(), "jsType", null);
        setField(term6529, term6529.getClass(), "parent", null);
        setField(term6527, term6527.getClass(), "next", term6529);
        setField(term6527, term6527.getClass(), "first", term6531);
        setIntField(term6538, term6538.getClass(), "type", -1183353915);
        setIntField(term6540, term6540.getClass(), "type", -420030135);
        setField(term6540, term6540.getClass(), "next", null);
        setField(term6540, term6540.getClass(), "first", term6534);
        setField(term6540, term6540.getClass(), "last", term6529);
        setField(term6540, term6540.getClass(), "propListHead", null);
        setIntField(term6540, term6540.getClass(), "sourcePosition", 0);
        setField(term6540, term6540.getClass(), "jsType", null);
        setField(term6540, term6540.getClass(), "parent", null);
        setField(term6538, term6538.getClass(), "next", term6540);
        setField(term6538, term6538.getClass(), "first", term6525);
        setField(term6538, term6538.getClass(), "last", term6525);
        setField(term6538, term6538.getClass(), "propListHead", null);
        setIntField(term6538, term6538.getClass(), "sourcePosition", 0);
        setField(term6538, term6538.getClass(), "jsType", null);
        setField(term6538, term6538.getClass(), "parent", null);
        setField(term6527, term6527.getClass(), "last", term6538);
        setField(term6527, term6527.getClass(), "propListHead", null);
        setIntField(term6527, term6527.getClass(), "sourcePosition", 0);
        setField(term6527, term6527.getClass(), "jsType", null);
        setField(term6527, term6527.getClass(), "parent", null);
        setField(term6525, term6525.getClass(), "next", term6527);
        setIntField(term6545, term6545.getClass(), "type", 267763294);
        setField(term6545, term6545.getClass(), "next", term6538);
        setField(term6545, term6545.getClass(), "first", term6540);
        setField(term6545, term6545.getClass(), "last", term6523);
        setField(term6545, term6545.getClass(), "propListHead", null);
        setIntField(term6545, term6545.getClass(), "sourcePosition", 0);
        setField(term6545, term6545.getClass(), "jsType", null);
        setField(term6545, term6545.getClass(), "parent", null);
        setField(term6525, term6525.getClass(), "first", term6545);
        setField(term6525, term6525.getClass(), "last", term6545);
        setField(term6525, term6525.getClass(), "propListHead", null);
        setIntField(term6525, term6525.getClass(), "sourcePosition", 0);
        setField(term6525, term6525.getClass(), "jsType", null);
        setField(term6525, term6525.getClass(), "parent", null);
        setField(term6523, term6523.getClass(), "next", term6525);
        setField(term6523, term6523.getClass(), "first", term6529);
        setField(term6523, term6523.getClass(), "last", term6531);
        setField(term6523, term6523.getClass(), "propListHead", null);
        setIntField(term6523, term6523.getClass(), "sourcePosition", 0);
        setField(term6523, term6523.getClass(), "jsType", null);
        setField(term6523, term6523.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term6523;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term6481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


