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

public class TypeInference_updateBind_113747613074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9033;
     Object term9078;

    public TypeInference_updateBind_113747613074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40843 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term40842 = ((Class) term40843).getDeclaredField((String) "PROTECTED");
        ((Field) term40842).setAccessible(true);
        Object enum100 = ((Field) term40842).get((Object) null);
        term9033 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term9034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term9035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term9049 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9050 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term9056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term9057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9063 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9064 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term9069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term9071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term9033, term9033.getClass(), "compiler", null);
        setField(term9035, term9035.getClass(), "name", "MAnhIPOtHL");
        setField(term9035, term9035.getClass(), "referencedType", null);
        setField(term9035, term9035.getClass(), "referencedObjType", null);
        setBooleanField(term9035, term9035.getClass(), "visited", true);
        setField(term9050, term9050.getClass(), "baseType", null);
        setField(term9050, term9050.getClass(), "extendedInterfaces", null);
        setField(term9050, term9050.getClass(), "implementedInterfaces", null);
        setField(term9050, term9050.getClass(), "parameters", null);
        setField(term9050, term9050.getClass(), "thrownTypes", null);
        setField(term9050, term9050.getClass(), "templateTypeNames", null);
        setField(term9050, term9050.getClass(), "disposedParameters", null);
        setField(term9050, term9050.getClass(), "description", null);
        setField(term9050, term9050.getClass(), "meaning", null);
        setField(term9050, term9050.getClass(), "deprecated", null);
        setField(term9050, term9050.getClass(), "license", null);
        setField(term9050, term9050.getClass(), "suppressions", null);
        setField(term9050, term9050.getClass(), "modifies", null);
        setField(term9050, term9050.getClass(), "lendsName", null);
        setBooleanField(term9050, term9050.getClass(), "ngInject", true);
        setBooleanField(term9050, term9050.getClass(), "wizaction", true);
        setBooleanField(term9050, term9050.getClass(), "jaggerInject", true);
        setBooleanField(term9050, term9050.getClass(), "jaggerProvide", true);
        setBooleanField(term9050, term9050.getClass(), "jaggerModule", false);
        setField(term9049, term9049.getClass(), "info", term9050);
        setField(term9056, term9056.getClass(), "sourceComment", null);
        setField(term9056, term9056.getClass(), "markers", null);
        setField(term9056, term9056.getClass(), "parameters", null);
        setField(term9056, term9056.getClass(), "throwsDescriptions", null);
        setField(term9056, term9056.getClass(), "blockDescription", null);
        setField(term9056, term9056.getClass(), "fileOverview", null);
        setField(term9056, term9056.getClass(), "returnDescription", null);
        setField(term9056, term9056.getClass(), "version", null);
        setField(term9056, term9056.getClass(), "authors", null);
        setField(term9056, term9056.getClass(), "sees", null);
        setField(term9049, term9049.getClass(), "documentation", term9056);
        setIntField(term9057, term9057.getClass(), "type", 0);
        setField(term9057, term9057.getClass(), "next", null);
        setField(term9057, term9057.getClass(), "first", null);
        setField(term9057, term9057.getClass(), "last", null);
        setField(term9057, term9057.getClass(), "propListHead", null);
        setIntField(term9057, term9057.getClass(), "sourcePosition", 0);
        setField(term9057, term9057.getClass(), "jsType", null);
        setField(term9057, term9057.getClass(), "parent", null);
        setField(term9049, term9049.getClass(), "associatedNode", term9057);
        setField(term9049, term9049.getClass(), "visibility", enum100);
        setIntField(term9049, term9049.getClass(), "bitset", 2007134147);
        setField(term9063, term9063.getClass(), "root", term9057);
        setField(term9063, term9063.getClass(), "sourceName", null);
        setField(term9049, term9049.getClass(), "type", term9063);
        setField(term9064, term9064.getClass(), "root", null);
        setField(term9064, term9064.getClass(), "sourceName", null);
        setField(term9049, term9049.getClass(), "thisType", term9064);
        setBooleanField(term9049, term9049.getClass(), "includeDocumentation", false);
        setIntField(term9049, term9049.getClass(), "originalCommentPosition", 993388358);
        setField(term9035, term9035.getClass(), "docInfo", term9049);
        setBooleanField(term9035, term9035.getClass(), "unknown", true);
        setBooleanField(term9035, term9035.getClass(), "resolved", false);
        setField(term9035, term9035.getClass(), "resolveResult", null);
        setField(term9069, term9069.getClass(), "templateKeys", null);
        setField(term9069, term9069.getClass(), "templateValues", null);
        setField(term9069, term9069.getClass(), "resolvedTemplateValues", null);
        setField(term9069, term9069.getClass(), "registry", null);
        setField(term9035, term9035.getClass(), "templateTypeMap", term9069);
        setBooleanField(term9035, term9035.getClass(), "inTemplatedCheckVisit", false);
        setField(term9035, term9035.getClass(), "registry", null);
        setField(term9034, term9034.getClass(), "objectIndexTemplateKey", term9035);
        setField(term9071, term9071.getClass(), "name", null);
        setField(term9071, term9071.getClass(), "referencedType", null);
        setField(term9071, term9071.getClass(), "referencedObjType", null);
        setBooleanField(term9071, term9071.getClass(), "visited", false);
        setField(term9071, term9071.getClass(), "docInfo", null);
        setBooleanField(term9071, term9071.getClass(), "unknown", false);
        setBooleanField(term9071, term9071.getClass(), "resolved", false);
        setField(term9071, term9071.getClass(), "resolveResult", null);
        setField(term9071, term9071.getClass(), "templateTypeMap", null);
        setBooleanField(term9071, term9071.getClass(), "inTemplatedCheckVisit", false);
        setField(term9071, term9071.getClass(), "registry", null);
        setField(term9034, term9034.getClass(), "objectElementTemplateKey", term9071);
        setField(term9034, term9034.getClass(), "reporter", null);
        setField(term9034, term9034.getClass(), "nativeTypes", null);
        setField(term9034, term9034.getClass(), "namesToTypes", null);
        setField(term9034, term9034.getClass(), "namespaces", null);
        setField(term9034, term9034.getClass(), "nonNullableTypeNames", null);
        setField(term9034, term9034.getClass(), "forwardDeclaredTypes", null);
        setField(term9034, term9034.getClass(), "typesIndexedByProperty", null);
        setField(term9034, term9034.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term9034, term9034.getClass(), "greatestSubtypeByProperty", null);
        setField(term9034, term9034.getClass(), "interfaceToImplementors", null);
        setField(term9034, term9034.getClass(), "unresolvedNamedTypes", null);
        setField(term9034, term9034.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9034, term9034.getClass(), "lastGeneration", false);
        setField(term9034, term9034.getClass(), "templateTypes", null);
        setField(term9034, term9034.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term9034, term9034.getClass(), "tolerateUndefinedValues", false);
        setField(term9033, term9033.getClass(), "registry", term9034);
        setField(term9033, term9033.getClass(), "reverseInterpreter", null);
        setField(term9033, term9033.getClass(), "syntacticScope", null);
        setField(term9033, term9033.getClass(), "functionScope", null);
        setField(term9033, term9033.getClass(), "bottomScope", null);
        setField(term9033, term9033.getClass(), "assertionFunctionsMap", null);
        setField(term9033, term9033.getClass(), "unknownType", null);
        setField(term9033, term9033.getClass(), "cfg", null);
        setField(term9033, term9033.getClass(), "joinOp", null);
        setField(term9033, term9033.getClass(), "orderedWorkSet", null);
        term9078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9078, term9078.getClass(), "type", -1697741155);
        setIntField(term9080, term9080.getClass(), "type", 1295839803);
        setIntField(term9082, term9082.getClass(), "type", -1891015523);
        setIntField(term9084, term9084.getClass(), "type", -1560631747);
        setIntField(term9086, term9086.getClass(), "type", 1215150180);
        setField(term9086, term9086.getClass(), "next", null);
        setField(term9086, term9086.getClass(), "first", null);
        setField(term9086, term9086.getClass(), "last", null);
        setField(term9086, term9086.getClass(), "propListHead", null);
        setIntField(term9086, term9086.getClass(), "sourcePosition", 0);
        setField(term9086, term9086.getClass(), "jsType", null);
        setField(term9086, term9086.getClass(), "parent", null);
        setField(term9084, term9084.getClass(), "next", term9086);
        setIntField(term9089, term9089.getClass(), "type", -1422859977);
        setField(term9089, term9089.getClass(), "next", null);
        setField(term9089, term9089.getClass(), "first", null);
        setField(term9089, term9089.getClass(), "last", term9086);
        setField(term9089, term9089.getClass(), "propListHead", null);
        setIntField(term9089, term9089.getClass(), "sourcePosition", 0);
        setField(term9089, term9089.getClass(), "jsType", null);
        setField(term9089, term9089.getClass(), "parent", null);
        setField(term9084, term9084.getClass(), "first", term9089);
        setField(term9084, term9084.getClass(), "last", term9082);
        setField(term9084, term9084.getClass(), "propListHead", null);
        setIntField(term9084, term9084.getClass(), "sourcePosition", 0);
        setField(term9084, term9084.getClass(), "jsType", null);
        setField(term9084, term9084.getClass(), "parent", null);
        setField(term9082, term9082.getClass(), "next", term9084);
        setField(term9082, term9082.getClass(), "first", term9086);
        setIntField(term9093, term9093.getClass(), "type", 68922753);
        setIntField(term9095, term9095.getClass(), "type", -220791533);
        setField(term9095, term9095.getClass(), "next", null);
        setField(term9095, term9095.getClass(), "first", term9089);
        setField(term9095, term9095.getClass(), "last", term9084);
        setField(term9095, term9095.getClass(), "propListHead", null);
        setIntField(term9095, term9095.getClass(), "sourcePosition", 0);
        setField(term9095, term9095.getClass(), "jsType", null);
        setField(term9095, term9095.getClass(), "parent", null);
        setField(term9093, term9093.getClass(), "next", term9095);
        setField(term9093, term9093.getClass(), "first", term9080);
        setField(term9093, term9093.getClass(), "last", term9080);
        setField(term9093, term9093.getClass(), "propListHead", null);
        setIntField(term9093, term9093.getClass(), "sourcePosition", 0);
        setField(term9093, term9093.getClass(), "jsType", null);
        setField(term9093, term9093.getClass(), "parent", null);
        setField(term9082, term9082.getClass(), "last", term9093);
        setField(term9082, term9082.getClass(), "propListHead", null);
        setIntField(term9082, term9082.getClass(), "sourcePosition", 0);
        setField(term9082, term9082.getClass(), "jsType", null);
        setField(term9082, term9082.getClass(), "parent", null);
        setField(term9080, term9080.getClass(), "next", term9082);
        setIntField(term9100, term9100.getClass(), "type", 1741500243);
        setField(term9100, term9100.getClass(), "next", term9093);
        setField(term9100, term9100.getClass(), "first", term9095);
        setField(term9100, term9100.getClass(), "last", term9078);
        setField(term9100, term9100.getClass(), "propListHead", null);
        setIntField(term9100, term9100.getClass(), "sourcePosition", 0);
        setField(term9100, term9100.getClass(), "jsType", null);
        setField(term9100, term9100.getClass(), "parent", null);
        setField(term9080, term9080.getClass(), "first", term9100);
        setField(term9080, term9080.getClass(), "last", term9100);
        setField(term9080, term9080.getClass(), "propListHead", null);
        setIntField(term9080, term9080.getClass(), "sourcePosition", 0);
        setField(term9080, term9080.getClass(), "jsType", null);
        setField(term9080, term9080.getClass(), "parent", null);
        setField(term9078, term9078.getClass(), "next", term9080);
        setField(term9078, term9078.getClass(), "first", term9084);
        setField(term9078, term9078.getClass(), "last", term9086);
        setField(term9078, term9078.getClass(), "propListHead", null);
        setIntField(term9078, term9078.getClass(), "sourcePosition", 0);
        setField(term9078, term9078.getClass(), "jsType", null);
        setField(term9078, term9078.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9078;
        try {
            callMethod(klass, "updateBind", argTypes, term9033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


