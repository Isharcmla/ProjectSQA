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

public class TypeInference_redeclareSimpleVar_130332640096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19616;
     Object term19658;

    public TypeInference_redeclareSimpleVar_130332640096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62846 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term62845 = ((Class) term62846).getDeclaredField((String) "INHERITED");
        ((Field) term62845).setAccessible(true);
        Object enum155 = ((Field) term62845).get((Object) null);
        term19616 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term19617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term19618 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term19632 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19636 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19643 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19644 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19649 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term19651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term19616, term19616.getClass(), "compiler", null);
        setField(term19618, term19618.getClass(), "name", "KyUmXHRrED");
        setField(term19618, term19618.getClass(), "referencedType", null);
        setField(term19618, term19618.getClass(), "referencedObjType", null);
        setBooleanField(term19618, term19618.getClass(), "visited", false);
        setField(term19633, term19633.getClass(), "baseType", null);
        setField(term19633, term19633.getClass(), "extendedInterfaces", null);
        setField(term19633, term19633.getClass(), "implementedInterfaces", null);
        setField(term19633, term19633.getClass(), "parameters", null);
        setField(term19633, term19633.getClass(), "thrownTypes", null);
        setField(term19633, term19633.getClass(), "templateTypeNames", null);
        setField(term19633, term19633.getClass(), "description", null);
        setField(term19633, term19633.getClass(), "meaning", null);
        setField(term19633, term19633.getClass(), "deprecated", null);
        setField(term19633, term19633.getClass(), "license", null);
        setField(term19633, term19633.getClass(), "suppressions", null);
        setField(term19633, term19633.getClass(), "modifies", null);
        setField(term19633, term19633.getClass(), "lendsName", null);
        setBooleanField(term19633, term19633.getClass(), "ngInject", true);
        setBooleanField(term19633, term19633.getClass(), "wizaction", true);
        setField(term19632, term19632.getClass(), "info", term19633);
        setField(term19636, term19636.getClass(), "sourceComment", null);
        setField(term19636, term19636.getClass(), "markers", null);
        setField(term19636, term19636.getClass(), "parameters", null);
        setField(term19636, term19636.getClass(), "throwsDescriptions", null);
        setField(term19636, term19636.getClass(), "blockDescription", null);
        setField(term19636, term19636.getClass(), "fileOverview", null);
        setField(term19636, term19636.getClass(), "returnDescription", null);
        setField(term19636, term19636.getClass(), "version", null);
        setField(term19636, term19636.getClass(), "authors", null);
        setField(term19636, term19636.getClass(), "sees", null);
        setField(term19632, term19632.getClass(), "documentation", term19636);
        setIntField(term19637, term19637.getClass(), "type", 0);
        setField(term19637, term19637.getClass(), "next", null);
        setField(term19637, term19637.getClass(), "first", null);
        setField(term19637, term19637.getClass(), "last", null);
        setField(term19637, term19637.getClass(), "propListHead", null);
        setIntField(term19637, term19637.getClass(), "sourcePosition", 0);
        setField(term19637, term19637.getClass(), "jsType", null);
        setField(term19637, term19637.getClass(), "parent", null);
        setField(term19632, term19632.getClass(), "associatedNode", term19637);
        setField(term19632, term19632.getClass(), "visibility", enum155);
        setIntField(term19632, term19632.getClass(), "bitset", -886200503);
        setField(term19643, term19643.getClass(), "root", null);
        setField(term19643, term19643.getClass(), "sourceName", null);
        setField(term19632, term19632.getClass(), "type", term19643);
        setField(term19644, term19644.getClass(), "root", null);
        setField(term19644, term19644.getClass(), "sourceName", null);
        setField(term19632, term19632.getClass(), "thisType", term19644);
        setBooleanField(term19632, term19632.getClass(), "includeDocumentation", true);
        setIntField(term19632, term19632.getClass(), "originalCommentPosition", 1136393691);
        setField(term19618, term19618.getClass(), "docInfo", term19632);
        setBooleanField(term19618, term19618.getClass(), "unknown", false);
        setBooleanField(term19618, term19618.getClass(), "resolved", true);
        setField(term19618, term19618.getClass(), "resolveResult", null);
        setField(term19649, term19649.getClass(), "templateKeys", null);
        setField(term19649, term19649.getClass(), "templateValues", null);
        setField(term19649, term19649.getClass(), "resolvedTemplateValues", null);
        setField(term19649, term19649.getClass(), "registry", null);
        setField(term19618, term19618.getClass(), "templateTypeMap", term19649);
        setBooleanField(term19618, term19618.getClass(), "inTemplatedCheckVisit", true);
        setField(term19618, term19618.getClass(), "registry", null);
        setField(term19617, term19617.getClass(), "objectIndexTemplateKey", term19618);
        setField(term19651, term19651.getClass(), "name", null);
        setField(term19651, term19651.getClass(), "referencedType", null);
        setField(term19651, term19651.getClass(), "referencedObjType", null);
        setBooleanField(term19651, term19651.getClass(), "visited", false);
        setField(term19651, term19651.getClass(), "docInfo", null);
        setBooleanField(term19651, term19651.getClass(), "unknown", false);
        setBooleanField(term19651, term19651.getClass(), "resolved", false);
        setField(term19651, term19651.getClass(), "resolveResult", null);
        setField(term19651, term19651.getClass(), "templateTypeMap", null);
        setBooleanField(term19651, term19651.getClass(), "inTemplatedCheckVisit", false);
        setField(term19651, term19651.getClass(), "registry", null);
        setField(term19617, term19617.getClass(), "objectElementTemplateKey", term19651);
        setField(term19617, term19617.getClass(), "reporter", null);
        setField(term19617, term19617.getClass(), "nativeTypes", null);
        setField(term19617, term19617.getClass(), "namesToTypes", null);
        setField(term19617, term19617.getClass(), "namespaces", null);
        setField(term19617, term19617.getClass(), "nonNullableTypeNames", null);
        setField(term19617, term19617.getClass(), "forwardDeclaredTypes", null);
        setField(term19617, term19617.getClass(), "typesIndexedByProperty", null);
        setField(term19617, term19617.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term19617, term19617.getClass(), "greatestSubtypeByProperty", null);
        setField(term19617, term19617.getClass(), "interfaceToImplementors", null);
        setField(term19617, term19617.getClass(), "unresolvedNamedTypes", null);
        setField(term19617, term19617.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19617, term19617.getClass(), "lastGeneration", false);
        setField(term19617, term19617.getClass(), "templateTypes", null);
        setField(term19617, term19617.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term19617, term19617.getClass(), "tolerateUndefinedValues", false);
        setField(term19617, term19617.getClass(), "resolveMode", null);
        setField(term19616, term19616.getClass(), "registry", term19617);
        setField(term19616, term19616.getClass(), "reverseInterpreter", null);
        setField(term19616, term19616.getClass(), "syntacticScope", null);
        setField(term19616, term19616.getClass(), "functionScope", null);
        setField(term19616, term19616.getClass(), "bottomScope", null);
        setField(term19616, term19616.getClass(), "assertionFunctionsMap", null);
        setField(term19616, term19616.getClass(), "unknownType", null);
        setField(term19616, term19616.getClass(), "cfg", null);
        setField(term19616, term19616.getClass(), "joinOp", null);
        setField(term19616, term19616.getClass(), "orderedWorkSet", null);
        term19658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19658, term19658.getClass(), "type", 1092038167);
        setIntField(term19660, term19660.getClass(), "type", 1879729823);
        setIntField(term19662, term19662.getClass(), "type", 1443855558);
        setIntField(term19664, term19664.getClass(), "type", -1933419449);
        setIntField(term19666, term19666.getClass(), "type", -1804322375);
        setField(term19666, term19666.getClass(), "next", null);
        setField(term19666, term19666.getClass(), "first", null);
        setField(term19666, term19666.getClass(), "last", null);
        setField(term19666, term19666.getClass(), "propListHead", null);
        setIntField(term19666, term19666.getClass(), "sourcePosition", 0);
        setField(term19666, term19666.getClass(), "jsType", null);
        setField(term19666, term19666.getClass(), "parent", null);
        setField(term19664, term19664.getClass(), "next", term19666);
        setIntField(term19669, term19669.getClass(), "type", 1595814906);
        setField(term19669, term19669.getClass(), "next", null);
        setField(term19669, term19669.getClass(), "first", null);
        setField(term19669, term19669.getClass(), "last", term19666);
        setField(term19669, term19669.getClass(), "propListHead", null);
        setIntField(term19669, term19669.getClass(), "sourcePosition", 0);
        setField(term19669, term19669.getClass(), "jsType", null);
        setField(term19669, term19669.getClass(), "parent", null);
        setField(term19664, term19664.getClass(), "first", term19669);
        setField(term19664, term19664.getClass(), "last", term19662);
        setField(term19664, term19664.getClass(), "propListHead", null);
        setIntField(term19664, term19664.getClass(), "sourcePosition", 0);
        setField(term19664, term19664.getClass(), "jsType", null);
        setField(term19664, term19664.getClass(), "parent", null);
        setField(term19662, term19662.getClass(), "next", term19664);
        setField(term19662, term19662.getClass(), "first", term19666);
        setIntField(term19673, term19673.getClass(), "type", 335780735);
        setIntField(term19675, term19675.getClass(), "type", -1541981599);
        setField(term19675, term19675.getClass(), "next", null);
        setField(term19675, term19675.getClass(), "first", term19669);
        setField(term19675, term19675.getClass(), "last", term19664);
        setField(term19675, term19675.getClass(), "propListHead", null);
        setIntField(term19675, term19675.getClass(), "sourcePosition", 0);
        setField(term19675, term19675.getClass(), "jsType", null);
        setField(term19675, term19675.getClass(), "parent", null);
        setField(term19673, term19673.getClass(), "next", term19675);
        setField(term19673, term19673.getClass(), "first", term19660);
        setField(term19673, term19673.getClass(), "last", term19660);
        setField(term19673, term19673.getClass(), "propListHead", null);
        setIntField(term19673, term19673.getClass(), "sourcePosition", 0);
        setField(term19673, term19673.getClass(), "jsType", null);
        setField(term19673, term19673.getClass(), "parent", null);
        setField(term19662, term19662.getClass(), "last", term19673);
        setField(term19662, term19662.getClass(), "propListHead", null);
        setIntField(term19662, term19662.getClass(), "sourcePosition", 0);
        setField(term19662, term19662.getClass(), "jsType", null);
        setField(term19662, term19662.getClass(), "parent", null);
        setField(term19660, term19660.getClass(), "next", term19662);
        setIntField(term19680, term19680.getClass(), "type", 1605456363);
        setField(term19680, term19680.getClass(), "next", term19673);
        setField(term19680, term19680.getClass(), "first", term19675);
        setField(term19680, term19680.getClass(), "last", term19658);
        setField(term19680, term19680.getClass(), "propListHead", null);
        setIntField(term19680, term19680.getClass(), "sourcePosition", 0);
        setField(term19680, term19680.getClass(), "jsType", null);
        setField(term19680, term19680.getClass(), "parent", null);
        setField(term19660, term19660.getClass(), "first", term19680);
        setField(term19660, term19660.getClass(), "last", term19680);
        setField(term19660, term19660.getClass(), "propListHead", null);
        setIntField(term19660, term19660.getClass(), "sourcePosition", 0);
        setField(term19660, term19660.getClass(), "jsType", null);
        setField(term19660, term19660.getClass(), "parent", null);
        setField(term19658, term19658.getClass(), "next", term19660);
        setField(term19658, term19658.getClass(), "first", term19664);
        setField(term19658, term19658.getClass(), "last", term19666);
        setField(term19658, term19658.getClass(), "propListHead", null);
        setIntField(term19658, term19658.getClass(), "sourcePosition", 0);
        setField(term19658, term19658.getClass(), "jsType", null);
        setField(term19658, term19658.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19658;
        args[2] = null;
        try {
            callMethod(klass, "redeclareSimpleVar", argTypes, term19616, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


