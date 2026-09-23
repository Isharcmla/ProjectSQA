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
     Object term4071;
     Object term4113;

    public TypeInference_ensurePropertyDeclared_180733304762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31309 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term31308 = ((Class) term31309).getDeclaredField((String) "PROTECTED");
        ((Field) term31308).setAccessible(true);
        Object enum80 = ((Field) term31308).get((Object) null);
        term4071 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term4073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4087 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4088 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4091 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4098 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4099 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4104 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term4106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term4071, term4071.getClass(), "compiler", null);
        setField(term4073, term4073.getClass(), "name", "hePqROaplw");
        setField(term4073, term4073.getClass(), "referencedType", null);
        setField(term4073, term4073.getClass(), "referencedObjType", null);
        setBooleanField(term4073, term4073.getClass(), "visited", false);
        setField(term4088, term4088.getClass(), "baseType", null);
        setField(term4088, term4088.getClass(), "extendedInterfaces", null);
        setField(term4088, term4088.getClass(), "implementedInterfaces", null);
        setField(term4088, term4088.getClass(), "parameters", null);
        setField(term4088, term4088.getClass(), "thrownTypes", null);
        setField(term4088, term4088.getClass(), "templateTypeNames", null);
        setField(term4088, term4088.getClass(), "description", null);
        setField(term4088, term4088.getClass(), "meaning", null);
        setField(term4088, term4088.getClass(), "deprecated", null);
        setField(term4088, term4088.getClass(), "license", null);
        setField(term4088, term4088.getClass(), "suppressions", null);
        setField(term4088, term4088.getClass(), "modifies", null);
        setField(term4088, term4088.getClass(), "lendsName", null);
        setBooleanField(term4088, term4088.getClass(), "ngInject", true);
        setBooleanField(term4088, term4088.getClass(), "wizaction", false);
        setField(term4087, term4087.getClass(), "info", term4088);
        setField(term4091, term4091.getClass(), "sourceComment", null);
        setField(term4091, term4091.getClass(), "markers", null);
        setField(term4091, term4091.getClass(), "parameters", null);
        setField(term4091, term4091.getClass(), "throwsDescriptions", null);
        setField(term4091, term4091.getClass(), "blockDescription", null);
        setField(term4091, term4091.getClass(), "fileOverview", null);
        setField(term4091, term4091.getClass(), "returnDescription", null);
        setField(term4091, term4091.getClass(), "version", null);
        setField(term4091, term4091.getClass(), "authors", null);
        setField(term4091, term4091.getClass(), "sees", null);
        setField(term4087, term4087.getClass(), "documentation", term4091);
        setIntField(term4092, term4092.getClass(), "type", 0);
        setField(term4092, term4092.getClass(), "next", null);
        setField(term4092, term4092.getClass(), "first", null);
        setField(term4092, term4092.getClass(), "last", null);
        setField(term4092, term4092.getClass(), "propListHead", null);
        setIntField(term4092, term4092.getClass(), "sourcePosition", 0);
        setField(term4092, term4092.getClass(), "jsType", null);
        setField(term4092, term4092.getClass(), "parent", null);
        setField(term4087, term4087.getClass(), "associatedNode", term4092);
        setField(term4087, term4087.getClass(), "visibility", enum80);
        setIntField(term4087, term4087.getClass(), "bitset", -227365013);
        setField(term4098, term4098.getClass(), "root", null);
        setField(term4098, term4098.getClass(), "sourceName", null);
        setField(term4087, term4087.getClass(), "type", term4098);
        setField(term4099, term4099.getClass(), "root", null);
        setField(term4099, term4099.getClass(), "sourceName", null);
        setField(term4087, term4087.getClass(), "thisType", term4099);
        setBooleanField(term4087, term4087.getClass(), "includeDocumentation", true);
        setIntField(term4087, term4087.getClass(), "originalCommentPosition", 11724947);
        setField(term4073, term4073.getClass(), "docInfo", term4087);
        setBooleanField(term4073, term4073.getClass(), "unknown", false);
        setBooleanField(term4073, term4073.getClass(), "resolved", true);
        setField(term4073, term4073.getClass(), "resolveResult", null);
        setField(term4104, term4104.getClass(), "templateKeys", null);
        setField(term4104, term4104.getClass(), "templateValues", null);
        setField(term4104, term4104.getClass(), "resolvedTemplateValues", null);
        setField(term4104, term4104.getClass(), "registry", null);
        setField(term4073, term4073.getClass(), "templateTypeMap", term4104);
        setBooleanField(term4073, term4073.getClass(), "inTemplatedCheckVisit", false);
        setField(term4073, term4073.getClass(), "registry", null);
        setField(term4072, term4072.getClass(), "objectIndexTemplateKey", term4073);
        setField(term4106, term4106.getClass(), "name", null);
        setField(term4106, term4106.getClass(), "referencedType", null);
        setField(term4106, term4106.getClass(), "referencedObjType", null);
        setBooleanField(term4106, term4106.getClass(), "visited", false);
        setField(term4106, term4106.getClass(), "docInfo", null);
        setBooleanField(term4106, term4106.getClass(), "unknown", false);
        setBooleanField(term4106, term4106.getClass(), "resolved", false);
        setField(term4106, term4106.getClass(), "resolveResult", null);
        setField(term4106, term4106.getClass(), "templateTypeMap", null);
        setBooleanField(term4106, term4106.getClass(), "inTemplatedCheckVisit", false);
        setField(term4106, term4106.getClass(), "registry", null);
        setField(term4072, term4072.getClass(), "objectElementTemplateKey", term4106);
        setField(term4072, term4072.getClass(), "reporter", null);
        setField(term4072, term4072.getClass(), "nativeTypes", null);
        setField(term4072, term4072.getClass(), "namesToTypes", null);
        setField(term4072, term4072.getClass(), "namespaces", null);
        setField(term4072, term4072.getClass(), "nonNullableTypeNames", null);
        setField(term4072, term4072.getClass(), "forwardDeclaredTypes", null);
        setField(term4072, term4072.getClass(), "typesIndexedByProperty", null);
        setField(term4072, term4072.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term4072, term4072.getClass(), "greatestSubtypeByProperty", null);
        setField(term4072, term4072.getClass(), "interfaceToImplementors", null);
        setField(term4072, term4072.getClass(), "unresolvedNamedTypes", null);
        setField(term4072, term4072.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4072, term4072.getClass(), "lastGeneration", false);
        setField(term4072, term4072.getClass(), "templateTypes", null);
        setField(term4072, term4072.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term4072, term4072.getClass(), "tolerateUndefinedValues", false);
        setField(term4072, term4072.getClass(), "resolveMode", null);
        setField(term4071, term4071.getClass(), "registry", term4072);
        setField(term4071, term4071.getClass(), "reverseInterpreter", null);
        setField(term4071, term4071.getClass(), "syntacticScope", null);
        setField(term4071, term4071.getClass(), "functionScope", null);
        setField(term4071, term4071.getClass(), "bottomScope", null);
        setField(term4071, term4071.getClass(), "assertionFunctionsMap", null);
        setField(term4071, term4071.getClass(), "unknownType", null);
        setField(term4071, term4071.getClass(), "cfg", null);
        setField(term4071, term4071.getClass(), "joinOp", null);
        setField(term4071, term4071.getClass(), "orderedWorkSet", null);
        term4113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4113, term4113.getClass(), "type", 1283079251);
        setIntField(term4115, term4115.getClass(), "type", -523949691);
        setIntField(term4117, term4117.getClass(), "type", 1398204340);
        setIntField(term4119, term4119.getClass(), "type", 229204365);
        setIntField(term4121, term4121.getClass(), "type", -461771056);
        setField(term4121, term4121.getClass(), "next", null);
        setField(term4121, term4121.getClass(), "first", null);
        setField(term4121, term4121.getClass(), "last", null);
        setField(term4121, term4121.getClass(), "propListHead", null);
        setIntField(term4121, term4121.getClass(), "sourcePosition", 0);
        setField(term4121, term4121.getClass(), "jsType", null);
        setField(term4121, term4121.getClass(), "parent", null);
        setField(term4119, term4119.getClass(), "next", term4121);
        setIntField(term4124, term4124.getClass(), "type", -243422082);
        setField(term4124, term4124.getClass(), "next", null);
        setField(term4124, term4124.getClass(), "first", null);
        setField(term4124, term4124.getClass(), "last", term4121);
        setField(term4124, term4124.getClass(), "propListHead", null);
        setIntField(term4124, term4124.getClass(), "sourcePosition", 0);
        setField(term4124, term4124.getClass(), "jsType", null);
        setField(term4124, term4124.getClass(), "parent", null);
        setField(term4119, term4119.getClass(), "first", term4124);
        setField(term4119, term4119.getClass(), "last", term4117);
        setField(term4119, term4119.getClass(), "propListHead", null);
        setIntField(term4119, term4119.getClass(), "sourcePosition", 0);
        setField(term4119, term4119.getClass(), "jsType", null);
        setField(term4119, term4119.getClass(), "parent", null);
        setField(term4117, term4117.getClass(), "next", term4119);
        setField(term4117, term4117.getClass(), "first", term4121);
        setIntField(term4128, term4128.getClass(), "type", -1002370457);
        setIntField(term4130, term4130.getClass(), "type", -2014576105);
        setField(term4130, term4130.getClass(), "next", null);
        setField(term4130, term4130.getClass(), "first", term4124);
        setField(term4130, term4130.getClass(), "last", term4119);
        setField(term4130, term4130.getClass(), "propListHead", null);
        setIntField(term4130, term4130.getClass(), "sourcePosition", 0);
        setField(term4130, term4130.getClass(), "jsType", null);
        setField(term4130, term4130.getClass(), "parent", null);
        setField(term4128, term4128.getClass(), "next", term4130);
        setField(term4128, term4128.getClass(), "first", term4115);
        setField(term4128, term4128.getClass(), "last", term4115);
        setField(term4128, term4128.getClass(), "propListHead", null);
        setIntField(term4128, term4128.getClass(), "sourcePosition", 0);
        setField(term4128, term4128.getClass(), "jsType", null);
        setField(term4128, term4128.getClass(), "parent", null);
        setField(term4117, term4117.getClass(), "last", term4128);
        setField(term4117, term4117.getClass(), "propListHead", null);
        setIntField(term4117, term4117.getClass(), "sourcePosition", 0);
        setField(term4117, term4117.getClass(), "jsType", null);
        setField(term4117, term4117.getClass(), "parent", null);
        setField(term4115, term4115.getClass(), "next", term4117);
        setIntField(term4135, term4135.getClass(), "type", 1296895584);
        setField(term4135, term4135.getClass(), "next", term4128);
        setField(term4135, term4135.getClass(), "first", term4130);
        setField(term4135, term4135.getClass(), "last", term4113);
        setField(term4135, term4135.getClass(), "propListHead", null);
        setIntField(term4135, term4135.getClass(), "sourcePosition", 0);
        setField(term4135, term4135.getClass(), "jsType", null);
        setField(term4135, term4135.getClass(), "parent", null);
        setField(term4115, term4115.getClass(), "first", term4135);
        setField(term4115, term4115.getClass(), "last", term4135);
        setField(term4115, term4115.getClass(), "propListHead", null);
        setIntField(term4115, term4115.getClass(), "sourcePosition", 0);
        setField(term4115, term4115.getClass(), "jsType", null);
        setField(term4115, term4115.getClass(), "parent", null);
        setField(term4113, term4113.getClass(), "next", term4115);
        setField(term4113, term4113.getClass(), "first", term4119);
        setField(term4113, term4113.getClass(), "last", term4121);
        setField(term4113, term4113.getClass(), "propListHead", null);
        setIntField(term4113, term4113.getClass(), "sourcePosition", 0);
        setField(term4113, term4113.getClass(), "jsType", null);
        setField(term4113, term4113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4113;
        try {
            callMethod(klass, "ensurePropertyDeclared", argTypes, term4071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


