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

public class TypeInference_ensurePropertyDeclared_180733304762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4093;
     Object term4138;

    public TypeInference_ensurePropertyDeclared_180733304762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31073 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term31072 = ((Class) term31073).getDeclaredField((String) "PUBLIC");
        ((Field) term31072).setAccessible(true);
        Object enum79 = ((Field) term31072).get((Object) null);
        term4093 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term4095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4109 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4110 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4116 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4123 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4124 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term4131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term4093, term4093.getClass(), "compiler", null);
        setField(term4095, term4095.getClass(), "name", "oKwCDqywym");
        setField(term4095, term4095.getClass(), "referencedType", null);
        setField(term4095, term4095.getClass(), "referencedObjType", null);
        setBooleanField(term4095, term4095.getClass(), "visited", false);
        setField(term4110, term4110.getClass(), "baseType", null);
        setField(term4110, term4110.getClass(), "extendedInterfaces", null);
        setField(term4110, term4110.getClass(), "implementedInterfaces", null);
        setField(term4110, term4110.getClass(), "parameters", null);
        setField(term4110, term4110.getClass(), "thrownTypes", null);
        setField(term4110, term4110.getClass(), "templateTypeNames", null);
        setField(term4110, term4110.getClass(), "disposedParameters", null);
        setField(term4110, term4110.getClass(), "description", null);
        setField(term4110, term4110.getClass(), "meaning", null);
        setField(term4110, term4110.getClass(), "deprecated", null);
        setField(term4110, term4110.getClass(), "license", null);
        setField(term4110, term4110.getClass(), "suppressions", null);
        setField(term4110, term4110.getClass(), "modifies", null);
        setField(term4110, term4110.getClass(), "lendsName", null);
        setBooleanField(term4110, term4110.getClass(), "ngInject", false);
        setBooleanField(term4110, term4110.getClass(), "wizaction", true);
        setBooleanField(term4110, term4110.getClass(), "jaggerInject", true);
        setBooleanField(term4110, term4110.getClass(), "jaggerProvide", false);
        setBooleanField(term4110, term4110.getClass(), "jaggerModule", false);
        setField(term4109, term4109.getClass(), "info", term4110);
        setField(term4116, term4116.getClass(), "sourceComment", null);
        setField(term4116, term4116.getClass(), "markers", null);
        setField(term4116, term4116.getClass(), "parameters", null);
        setField(term4116, term4116.getClass(), "throwsDescriptions", null);
        setField(term4116, term4116.getClass(), "blockDescription", null);
        setField(term4116, term4116.getClass(), "fileOverview", null);
        setField(term4116, term4116.getClass(), "returnDescription", null);
        setField(term4116, term4116.getClass(), "version", null);
        setField(term4116, term4116.getClass(), "authors", null);
        setField(term4116, term4116.getClass(), "sees", null);
        setField(term4109, term4109.getClass(), "documentation", term4116);
        setIntField(term4117, term4117.getClass(), "type", 0);
        setField(term4117, term4117.getClass(), "next", null);
        setField(term4117, term4117.getClass(), "first", null);
        setField(term4117, term4117.getClass(), "last", null);
        setField(term4117, term4117.getClass(), "propListHead", null);
        setIntField(term4117, term4117.getClass(), "sourcePosition", 0);
        setField(term4117, term4117.getClass(), "jsType", null);
        setField(term4117, term4117.getClass(), "parent", null);
        setField(term4109, term4109.getClass(), "associatedNode", term4117);
        setField(term4109, term4109.getClass(), "visibility", enum79);
        setIntField(term4109, term4109.getClass(), "bitset", -227365013);
        setField(term4123, term4123.getClass(), "root", null);
        setField(term4123, term4123.getClass(), "sourceName", null);
        setField(term4109, term4109.getClass(), "type", term4123);
        setField(term4124, term4124.getClass(), "root", null);
        setField(term4124, term4124.getClass(), "sourceName", null);
        setField(term4109, term4109.getClass(), "thisType", term4124);
        setBooleanField(term4109, term4109.getClass(), "includeDocumentation", false);
        setIntField(term4109, term4109.getClass(), "originalCommentPosition", 11724947);
        setField(term4095, term4095.getClass(), "docInfo", term4109);
        setBooleanField(term4095, term4095.getClass(), "unknown", false);
        setBooleanField(term4095, term4095.getClass(), "resolved", false);
        setField(term4095, term4095.getClass(), "resolveResult", null);
        setField(term4129, term4129.getClass(), "templateKeys", null);
        setField(term4129, term4129.getClass(), "templateValues", null);
        setField(term4129, term4129.getClass(), "resolvedTemplateValues", null);
        setField(term4129, term4129.getClass(), "registry", null);
        setField(term4095, term4095.getClass(), "templateTypeMap", term4129);
        setBooleanField(term4095, term4095.getClass(), "inTemplatedCheckVisit", false);
        setField(term4095, term4095.getClass(), "registry", null);
        setField(term4094, term4094.getClass(), "objectIndexTemplateKey", term4095);
        setField(term4131, term4131.getClass(), "name", null);
        setField(term4131, term4131.getClass(), "referencedType", null);
        setField(term4131, term4131.getClass(), "referencedObjType", null);
        setBooleanField(term4131, term4131.getClass(), "visited", false);
        setField(term4131, term4131.getClass(), "docInfo", null);
        setBooleanField(term4131, term4131.getClass(), "unknown", false);
        setBooleanField(term4131, term4131.getClass(), "resolved", false);
        setField(term4131, term4131.getClass(), "resolveResult", null);
        setField(term4131, term4131.getClass(), "templateTypeMap", null);
        setBooleanField(term4131, term4131.getClass(), "inTemplatedCheckVisit", false);
        setField(term4131, term4131.getClass(), "registry", null);
        setField(term4094, term4094.getClass(), "objectElementTemplateKey", term4131);
        setField(term4094, term4094.getClass(), "reporter", null);
        setField(term4094, term4094.getClass(), "nativeTypes", null);
        setField(term4094, term4094.getClass(), "namesToTypes", null);
        setField(term4094, term4094.getClass(), "namespaces", null);
        setField(term4094, term4094.getClass(), "nonNullableTypeNames", null);
        setField(term4094, term4094.getClass(), "forwardDeclaredTypes", null);
        setField(term4094, term4094.getClass(), "typesIndexedByProperty", null);
        setField(term4094, term4094.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term4094, term4094.getClass(), "greatestSubtypeByProperty", null);
        setField(term4094, term4094.getClass(), "interfaceToImplementors", null);
        setField(term4094, term4094.getClass(), "unresolvedNamedTypes", null);
        setField(term4094, term4094.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4094, term4094.getClass(), "lastGeneration", false);
        setField(term4094, term4094.getClass(), "templateTypes", null);
        setField(term4094, term4094.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term4094, term4094.getClass(), "tolerateUndefinedValues", false);
        setField(term4093, term4093.getClass(), "registry", term4094);
        setField(term4093, term4093.getClass(), "reverseInterpreter", null);
        setField(term4093, term4093.getClass(), "syntacticScope", null);
        setField(term4093, term4093.getClass(), "functionScope", null);
        setField(term4093, term4093.getClass(), "bottomScope", null);
        setField(term4093, term4093.getClass(), "assertionFunctionsMap", null);
        setField(term4093, term4093.getClass(), "unknownType", null);
        setField(term4093, term4093.getClass(), "cfg", null);
        setField(term4093, term4093.getClass(), "joinOp", null);
        setField(term4093, term4093.getClass(), "orderedWorkSet", null);
        term4138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4138, term4138.getClass(), "type", 1283079251);
        setIntField(term4140, term4140.getClass(), "type", -523949691);
        setIntField(term4142, term4142.getClass(), "type", 1398204340);
        setIntField(term4144, term4144.getClass(), "type", 229204365);
        setIntField(term4146, term4146.getClass(), "type", -461771056);
        setField(term4146, term4146.getClass(), "next", null);
        setField(term4146, term4146.getClass(), "first", null);
        setField(term4146, term4146.getClass(), "last", null);
        setField(term4146, term4146.getClass(), "propListHead", null);
        setIntField(term4146, term4146.getClass(), "sourcePosition", 0);
        setField(term4146, term4146.getClass(), "jsType", null);
        setField(term4146, term4146.getClass(), "parent", null);
        setField(term4144, term4144.getClass(), "next", term4146);
        setIntField(term4149, term4149.getClass(), "type", -243422082);
        setField(term4149, term4149.getClass(), "next", null);
        setField(term4149, term4149.getClass(), "first", null);
        setField(term4149, term4149.getClass(), "last", term4146);
        setField(term4149, term4149.getClass(), "propListHead", null);
        setIntField(term4149, term4149.getClass(), "sourcePosition", 0);
        setField(term4149, term4149.getClass(), "jsType", null);
        setField(term4149, term4149.getClass(), "parent", null);
        setField(term4144, term4144.getClass(), "first", term4149);
        setField(term4144, term4144.getClass(), "last", term4142);
        setField(term4144, term4144.getClass(), "propListHead", null);
        setIntField(term4144, term4144.getClass(), "sourcePosition", 0);
        setField(term4144, term4144.getClass(), "jsType", null);
        setField(term4144, term4144.getClass(), "parent", null);
        setField(term4142, term4142.getClass(), "next", term4144);
        setField(term4142, term4142.getClass(), "first", term4146);
        setIntField(term4153, term4153.getClass(), "type", -1002370457);
        setIntField(term4155, term4155.getClass(), "type", -2014576105);
        setField(term4155, term4155.getClass(), "next", null);
        setField(term4155, term4155.getClass(), "first", term4149);
        setField(term4155, term4155.getClass(), "last", term4144);
        setField(term4155, term4155.getClass(), "propListHead", null);
        setIntField(term4155, term4155.getClass(), "sourcePosition", 0);
        setField(term4155, term4155.getClass(), "jsType", null);
        setField(term4155, term4155.getClass(), "parent", null);
        setField(term4153, term4153.getClass(), "next", term4155);
        setField(term4153, term4153.getClass(), "first", term4140);
        setField(term4153, term4153.getClass(), "last", term4140);
        setField(term4153, term4153.getClass(), "propListHead", null);
        setIntField(term4153, term4153.getClass(), "sourcePosition", 0);
        setField(term4153, term4153.getClass(), "jsType", null);
        setField(term4153, term4153.getClass(), "parent", null);
        setField(term4142, term4142.getClass(), "last", term4153);
        setField(term4142, term4142.getClass(), "propListHead", null);
        setIntField(term4142, term4142.getClass(), "sourcePosition", 0);
        setField(term4142, term4142.getClass(), "jsType", null);
        setField(term4142, term4142.getClass(), "parent", null);
        setField(term4140, term4140.getClass(), "next", term4142);
        setIntField(term4160, term4160.getClass(), "type", 1296895584);
        setField(term4160, term4160.getClass(), "next", term4153);
        setField(term4160, term4160.getClass(), "first", term4155);
        setField(term4160, term4160.getClass(), "last", term4138);
        setField(term4160, term4160.getClass(), "propListHead", null);
        setIntField(term4160, term4160.getClass(), "sourcePosition", 0);
        setField(term4160, term4160.getClass(), "jsType", null);
        setField(term4160, term4160.getClass(), "parent", null);
        setField(term4140, term4140.getClass(), "first", term4160);
        setField(term4140, term4140.getClass(), "last", term4160);
        setField(term4140, term4140.getClass(), "propListHead", null);
        setIntField(term4140, term4140.getClass(), "sourcePosition", 0);
        setField(term4140, term4140.getClass(), "jsType", null);
        setField(term4140, term4140.getClass(), "parent", null);
        setField(term4138, term4138.getClass(), "next", term4140);
        setField(term4138, term4138.getClass(), "first", term4144);
        setField(term4138, term4138.getClass(), "last", term4146);
        setField(term4138, term4138.getClass(), "propListHead", null);
        setIntField(term4138, term4138.getClass(), "sourcePosition", 0);
        setField(term4138, term4138.getClass(), "jsType", null);
        setField(term4138, term4138.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4138;
        try {
            callMethod(klass, "ensurePropertyDeclared", argTypes, term4093, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


