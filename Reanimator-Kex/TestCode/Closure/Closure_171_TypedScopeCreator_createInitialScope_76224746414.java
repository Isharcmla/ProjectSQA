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

public class TypedScopeCreator_createInitialScope_76224746414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term231;

    public TypedScopeCreator_createInitialScope_76224746414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term209, term209.getClass(), "compiler", null);
        setField(term209, term209.getClass(), "typeParsingErrorReporter", null);
        setField(term210, term210.getClass(), "compiler", null);
        setField(term212, term212.getClass(), "name", "");
        setField(term212, term212.getClass(), "referencedType", null);
        setField(term212, term212.getClass(), "referencedObjType", null);
        setBooleanField(term212, term212.getClass(), "visited", false);
        setField(term215, term215.getClass(), "info", null);
        setField(term215, term215.getClass(), "documentation", null);
        setField(term215, term215.getClass(), "associatedNode", null);
        setField(term215, term215.getClass(), "visibility", null);
        setIntField(term215, term215.getClass(), "bitset", 1876565163);
        setField(term215, term215.getClass(), "type", null);
        setField(term215, term215.getClass(), "thisType", null);
        setBooleanField(term215, term215.getClass(), "includeDocumentation", true);
        setIntField(term215, term215.getClass(), "originalCommentPosition", -817164822);
        setField(term212, term212.getClass(), "docInfo", term215);
        setBooleanField(term212, term212.getClass(), "unknown", false);
        setBooleanField(term212, term212.getClass(), "resolved", false);
        setField(term212, term212.getClass(), "resolveResult", null);
        setField(term221, term221.getClass(), "templateKeys", null);
        setField(term221, term221.getClass(), "templateValues", null);
        setField(term221, term221.getClass(), "resolvedTemplateValues", null);
        setField(term221, term221.getClass(), "registry", null);
        setField(term212, term212.getClass(), "templateTypeMap", term221);
        setBooleanField(term212, term212.getClass(), "inTemplatedCheckVisit", true);
        setField(term212, term212.getClass(), "registry", null);
        setField(term211, term211.getClass(), "objectIndexTemplateKey", term212);
        setField(term223, term223.getClass(), "name", null);
        setField(term223, term223.getClass(), "referencedType", null);
        setField(term223, term223.getClass(), "referencedObjType", null);
        setBooleanField(term223, term223.getClass(), "visited", false);
        setField(term223, term223.getClass(), "docInfo", null);
        setBooleanField(term223, term223.getClass(), "unknown", false);
        setBooleanField(term223, term223.getClass(), "resolved", false);
        setField(term223, term223.getClass(), "resolveResult", null);
        setField(term223, term223.getClass(), "templateTypeMap", null);
        setBooleanField(term223, term223.getClass(), "inTemplatedCheckVisit", false);
        setField(term223, term223.getClass(), "registry", null);
        setField(term211, term211.getClass(), "objectElementTemplateKey", term223);
        setField(term211, term211.getClass(), "reporter", null);
        setField(term211, term211.getClass(), "nativeTypes", null);
        setField(term211, term211.getClass(), "namesToTypes", null);
        setField(term211, term211.getClass(), "namespaces", null);
        setField(term211, term211.getClass(), "nonNullableTypeNames", null);
        setField(term211, term211.getClass(), "forwardDeclaredTypes", null);
        setField(term211, term211.getClass(), "typesIndexedByProperty", null);
        setField(term211, term211.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term211, term211.getClass(), "greatestSubtypeByProperty", null);
        setField(term211, term211.getClass(), "interfaceToImplementors", null);
        setField(term211, term211.getClass(), "unresolvedNamedTypes", null);
        setField(term211, term211.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term211, term211.getClass(), "lastGeneration", false);
        setField(term211, term211.getClass(), "templateTypes", null);
        setField(term211, term211.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term211, term211.getClass(), "tolerateUndefinedValues", false);
        setField(term211, term211.getClass(), "resolveMode", null);
        setField(term210, term210.getClass(), "typeRegistry", term211);
        setField(term210, term210.getClass(), "allValueTypes", null);
        setBooleanField(term210, term210.getClass(), "shouldReport", false);
        setField(term210, term210.getClass(), "nullOrUndefined", null);
        setField(term210, term210.getClass(), "mismatches", null);
        setField(term209, term209.getClass(), "validator", term210);
        setField(term209, term209.getClass(), "codingConvention", null);
        setField(term209, term209.getClass(), "typeRegistry", null);
        setField(term209, term209.getClass(), "delegateProxyPrototypes", null);
        setField(term209, term209.getClass(), "delegateCallingConventions", null);
        setField(term209, term209.getClass(), "functionAnalysisResults", null);
        setField(term209, term209.getClass(), "unknownType", null);
        term231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term231, term231.getClass(), "type", -1968847291);
        setIntField(term233, term233.getClass(), "type", 579005622);
        setIntField(term235, term235.getClass(), "type", -14890619);
        setIntField(term237, term237.getClass(), "type", 1632125673);
        setIntField(term239, term239.getClass(), "type", 454281060);
        setField(term239, term239.getClass(), "next", null);
        setField(term239, term239.getClass(), "first", null);
        setField(term239, term239.getClass(), "last", null);
        setField(term239, term239.getClass(), "propListHead", null);
        setIntField(term239, term239.getClass(), "sourcePosition", 0);
        setField(term239, term239.getClass(), "jsType", null);
        setField(term239, term239.getClass(), "parent", null);
        setField(term237, term237.getClass(), "next", term239);
        setIntField(term242, term242.getClass(), "type", -1786399638);
        setField(term242, term242.getClass(), "next", null);
        setField(term242, term242.getClass(), "first", null);
        setField(term242, term242.getClass(), "last", term239);
        setField(term242, term242.getClass(), "propListHead", null);
        setIntField(term242, term242.getClass(), "sourcePosition", 0);
        setField(term242, term242.getClass(), "jsType", null);
        setField(term242, term242.getClass(), "parent", null);
        setField(term237, term237.getClass(), "first", term242);
        setField(term237, term237.getClass(), "last", term235);
        setField(term237, term237.getClass(), "propListHead", null);
        setIntField(term237, term237.getClass(), "sourcePosition", 0);
        setField(term237, term237.getClass(), "jsType", null);
        setField(term237, term237.getClass(), "parent", null);
        setField(term235, term235.getClass(), "next", term237);
        setField(term235, term235.getClass(), "first", term239);
        setIntField(term246, term246.getClass(), "type", -1048298087);
        setIntField(term248, term248.getClass(), "type", 292681826);
        setField(term248, term248.getClass(), "next", null);
        setField(term248, term248.getClass(), "first", term242);
        setField(term248, term248.getClass(), "last", term237);
        setField(term248, term248.getClass(), "propListHead", null);
        setIntField(term248, term248.getClass(), "sourcePosition", 0);
        setField(term248, term248.getClass(), "jsType", null);
        setField(term248, term248.getClass(), "parent", null);
        setField(term246, term246.getClass(), "next", term248);
        setField(term246, term246.getClass(), "first", term233);
        setField(term246, term246.getClass(), "last", term233);
        setField(term246, term246.getClass(), "propListHead", null);
        setIntField(term246, term246.getClass(), "sourcePosition", 0);
        setField(term246, term246.getClass(), "jsType", null);
        setField(term246, term246.getClass(), "parent", null);
        setField(term235, term235.getClass(), "last", term246);
        setField(term235, term235.getClass(), "propListHead", null);
        setIntField(term235, term235.getClass(), "sourcePosition", 0);
        setField(term235, term235.getClass(), "jsType", null);
        setField(term235, term235.getClass(), "parent", null);
        setField(term233, term233.getClass(), "next", term235);
        setIntField(term253, term253.getClass(), "type", 458147407);
        setField(term253, term253.getClass(), "next", term246);
        setField(term253, term253.getClass(), "first", term248);
        setField(term253, term253.getClass(), "last", term231);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term233, term233.getClass(), "first", term253);
        setField(term233, term233.getClass(), "last", term253);
        setField(term233, term233.getClass(), "propListHead", null);
        setIntField(term233, term233.getClass(), "sourcePosition", 0);
        setField(term233, term233.getClass(), "jsType", null);
        setField(term233, term233.getClass(), "parent", null);
        setField(term231, term231.getClass(), "next", term233);
        setField(term231, term231.getClass(), "first", term237);
        setField(term231, term231.getClass(), "last", term239);
        setField(term231, term231.getClass(), "propListHead", null);
        setIntField(term231, term231.getClass(), "sourcePosition", 0);
        setField(term231, term231.getClass(), "jsType", null);
        setField(term231, term231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term231;
        try {
            callMethod(klass, "createInitialScope", argTypes, term209, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


