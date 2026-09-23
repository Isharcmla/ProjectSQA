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

public class TypeInference_traverseGetElem_10020351385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15001;
     Object term15043;

    public TypeInference_traverseGetElem_10020351385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52105 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term52104 = ((Class) term52105).getDeclaredField((String) "INHERITED");
        ((Field) term52104).setAccessible(true);
        Object enum127 = ((Field) term52104).get((Object) null);
        term15001 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term15002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term15003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15017 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15018 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15021 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15028 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15029 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15034 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term15036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term15001, term15001.getClass(), "compiler", null);
        setField(term15003, term15003.getClass(), "name", "ALRSeULyWV");
        setField(term15003, term15003.getClass(), "referencedType", null);
        setField(term15003, term15003.getClass(), "referencedObjType", null);
        setBooleanField(term15003, term15003.getClass(), "visited", true);
        setField(term15018, term15018.getClass(), "baseType", null);
        setField(term15018, term15018.getClass(), "extendedInterfaces", null);
        setField(term15018, term15018.getClass(), "implementedInterfaces", null);
        setField(term15018, term15018.getClass(), "parameters", null);
        setField(term15018, term15018.getClass(), "thrownTypes", null);
        setField(term15018, term15018.getClass(), "templateTypeNames", null);
        setField(term15018, term15018.getClass(), "description", null);
        setField(term15018, term15018.getClass(), "meaning", null);
        setField(term15018, term15018.getClass(), "deprecated", null);
        setField(term15018, term15018.getClass(), "license", null);
        setField(term15018, term15018.getClass(), "suppressions", null);
        setField(term15018, term15018.getClass(), "modifies", null);
        setField(term15018, term15018.getClass(), "lendsName", null);
        setBooleanField(term15018, term15018.getClass(), "ngInject", false);
        setBooleanField(term15018, term15018.getClass(), "wizaction", true);
        setField(term15017, term15017.getClass(), "info", term15018);
        setField(term15021, term15021.getClass(), "sourceComment", null);
        setField(term15021, term15021.getClass(), "markers", null);
        setField(term15021, term15021.getClass(), "parameters", null);
        setField(term15021, term15021.getClass(), "throwsDescriptions", null);
        setField(term15021, term15021.getClass(), "blockDescription", null);
        setField(term15021, term15021.getClass(), "fileOverview", null);
        setField(term15021, term15021.getClass(), "returnDescription", null);
        setField(term15021, term15021.getClass(), "version", null);
        setField(term15021, term15021.getClass(), "authors", null);
        setField(term15021, term15021.getClass(), "sees", null);
        setField(term15017, term15017.getClass(), "documentation", term15021);
        setIntField(term15022, term15022.getClass(), "type", 0);
        setField(term15022, term15022.getClass(), "next", null);
        setField(term15022, term15022.getClass(), "first", null);
        setField(term15022, term15022.getClass(), "last", null);
        setField(term15022, term15022.getClass(), "propListHead", null);
        setIntField(term15022, term15022.getClass(), "sourcePosition", 0);
        setField(term15022, term15022.getClass(), "jsType", null);
        setField(term15022, term15022.getClass(), "parent", null);
        setField(term15017, term15017.getClass(), "associatedNode", term15022);
        setField(term15017, term15017.getClass(), "visibility", enum127);
        setIntField(term15017, term15017.getClass(), "bitset", 1349815364);
        setField(term15028, term15028.getClass(), "root", null);
        setField(term15028, term15028.getClass(), "sourceName", null);
        setField(term15017, term15017.getClass(), "type", term15028);
        setField(term15029, term15029.getClass(), "root", null);
        setField(term15029, term15029.getClass(), "sourceName", null);
        setField(term15017, term15017.getClass(), "thisType", term15029);
        setBooleanField(term15017, term15017.getClass(), "includeDocumentation", true);
        setIntField(term15017, term15017.getClass(), "originalCommentPosition", 2128383340);
        setField(term15003, term15003.getClass(), "docInfo", term15017);
        setBooleanField(term15003, term15003.getClass(), "unknown", false);
        setBooleanField(term15003, term15003.getClass(), "resolved", false);
        setField(term15003, term15003.getClass(), "resolveResult", null);
        setField(term15034, term15034.getClass(), "templateKeys", null);
        setField(term15034, term15034.getClass(), "templateValues", null);
        setField(term15034, term15034.getClass(), "resolvedTemplateValues", null);
        setField(term15034, term15034.getClass(), "registry", null);
        setField(term15003, term15003.getClass(), "templateTypeMap", term15034);
        setBooleanField(term15003, term15003.getClass(), "inTemplatedCheckVisit", true);
        setField(term15003, term15003.getClass(), "registry", null);
        setField(term15002, term15002.getClass(), "objectIndexTemplateKey", term15003);
        setField(term15036, term15036.getClass(), "name", null);
        setField(term15036, term15036.getClass(), "referencedType", null);
        setField(term15036, term15036.getClass(), "referencedObjType", null);
        setBooleanField(term15036, term15036.getClass(), "visited", false);
        setField(term15036, term15036.getClass(), "docInfo", null);
        setBooleanField(term15036, term15036.getClass(), "unknown", false);
        setBooleanField(term15036, term15036.getClass(), "resolved", false);
        setField(term15036, term15036.getClass(), "resolveResult", null);
        setField(term15036, term15036.getClass(), "templateTypeMap", null);
        setBooleanField(term15036, term15036.getClass(), "inTemplatedCheckVisit", false);
        setField(term15036, term15036.getClass(), "registry", null);
        setField(term15002, term15002.getClass(), "objectElementTemplateKey", term15036);
        setField(term15002, term15002.getClass(), "reporter", null);
        setField(term15002, term15002.getClass(), "nativeTypes", null);
        setField(term15002, term15002.getClass(), "namesToTypes", null);
        setField(term15002, term15002.getClass(), "namespaces", null);
        setField(term15002, term15002.getClass(), "nonNullableTypeNames", null);
        setField(term15002, term15002.getClass(), "forwardDeclaredTypes", null);
        setField(term15002, term15002.getClass(), "typesIndexedByProperty", null);
        setField(term15002, term15002.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term15002, term15002.getClass(), "greatestSubtypeByProperty", null);
        setField(term15002, term15002.getClass(), "interfaceToImplementors", null);
        setField(term15002, term15002.getClass(), "unresolvedNamedTypes", null);
        setField(term15002, term15002.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15002, term15002.getClass(), "lastGeneration", false);
        setField(term15002, term15002.getClass(), "templateTypes", null);
        setField(term15002, term15002.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term15002, term15002.getClass(), "tolerateUndefinedValues", false);
        setField(term15002, term15002.getClass(), "resolveMode", null);
        setField(term15001, term15001.getClass(), "registry", term15002);
        setField(term15001, term15001.getClass(), "reverseInterpreter", null);
        setField(term15001, term15001.getClass(), "syntacticScope", null);
        setField(term15001, term15001.getClass(), "functionScope", null);
        setField(term15001, term15001.getClass(), "bottomScope", null);
        setField(term15001, term15001.getClass(), "assertionFunctionsMap", null);
        setField(term15001, term15001.getClass(), "unknownType", null);
        setField(term15001, term15001.getClass(), "cfg", null);
        setField(term15001, term15001.getClass(), "joinOp", null);
        setField(term15001, term15001.getClass(), "orderedWorkSet", null);
        term15043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15043, term15043.getClass(), "type", -558146961);
        setIntField(term15045, term15045.getClass(), "type", 1505480070);
        setIntField(term15047, term15047.getClass(), "type", -829088844);
        setIntField(term15049, term15049.getClass(), "type", -31751777);
        setIntField(term15051, term15051.getClass(), "type", -246967963);
        setField(term15051, term15051.getClass(), "next", null);
        setField(term15051, term15051.getClass(), "first", null);
        setField(term15051, term15051.getClass(), "last", null);
        setField(term15051, term15051.getClass(), "propListHead", null);
        setIntField(term15051, term15051.getClass(), "sourcePosition", 0);
        setField(term15051, term15051.getClass(), "jsType", null);
        setField(term15051, term15051.getClass(), "parent", null);
        setField(term15049, term15049.getClass(), "next", term15051);
        setIntField(term15054, term15054.getClass(), "type", -1777140369);
        setField(term15054, term15054.getClass(), "next", null);
        setField(term15054, term15054.getClass(), "first", null);
        setField(term15054, term15054.getClass(), "last", term15051);
        setField(term15054, term15054.getClass(), "propListHead", null);
        setIntField(term15054, term15054.getClass(), "sourcePosition", 0);
        setField(term15054, term15054.getClass(), "jsType", null);
        setField(term15054, term15054.getClass(), "parent", null);
        setField(term15049, term15049.getClass(), "first", term15054);
        setField(term15049, term15049.getClass(), "last", term15047);
        setField(term15049, term15049.getClass(), "propListHead", null);
        setIntField(term15049, term15049.getClass(), "sourcePosition", 0);
        setField(term15049, term15049.getClass(), "jsType", null);
        setField(term15049, term15049.getClass(), "parent", null);
        setField(term15047, term15047.getClass(), "next", term15049);
        setField(term15047, term15047.getClass(), "first", term15051);
        setIntField(term15058, term15058.getClass(), "type", 872295704);
        setIntField(term15060, term15060.getClass(), "type", 86041387);
        setField(term15060, term15060.getClass(), "next", null);
        setField(term15060, term15060.getClass(), "first", term15054);
        setField(term15060, term15060.getClass(), "last", term15049);
        setField(term15060, term15060.getClass(), "propListHead", null);
        setIntField(term15060, term15060.getClass(), "sourcePosition", 0);
        setField(term15060, term15060.getClass(), "jsType", null);
        setField(term15060, term15060.getClass(), "parent", null);
        setField(term15058, term15058.getClass(), "next", term15060);
        setField(term15058, term15058.getClass(), "first", term15045);
        setField(term15058, term15058.getClass(), "last", term15045);
        setField(term15058, term15058.getClass(), "propListHead", null);
        setIntField(term15058, term15058.getClass(), "sourcePosition", 0);
        setField(term15058, term15058.getClass(), "jsType", null);
        setField(term15058, term15058.getClass(), "parent", null);
        setField(term15047, term15047.getClass(), "last", term15058);
        setField(term15047, term15047.getClass(), "propListHead", null);
        setIntField(term15047, term15047.getClass(), "sourcePosition", 0);
        setField(term15047, term15047.getClass(), "jsType", null);
        setField(term15047, term15047.getClass(), "parent", null);
        setField(term15045, term15045.getClass(), "next", term15047);
        setIntField(term15065, term15065.getClass(), "type", 1010721666);
        setField(term15065, term15065.getClass(), "next", term15058);
        setField(term15065, term15065.getClass(), "first", term15060);
        setField(term15065, term15065.getClass(), "last", term15043);
        setField(term15065, term15065.getClass(), "propListHead", null);
        setIntField(term15065, term15065.getClass(), "sourcePosition", 0);
        setField(term15065, term15065.getClass(), "jsType", null);
        setField(term15065, term15065.getClass(), "parent", null);
        setField(term15045, term15045.getClass(), "first", term15065);
        setField(term15045, term15045.getClass(), "last", term15065);
        setField(term15045, term15045.getClass(), "propListHead", null);
        setIntField(term15045, term15045.getClass(), "sourcePosition", 0);
        setField(term15045, term15045.getClass(), "jsType", null);
        setField(term15045, term15045.getClass(), "parent", null);
        setField(term15043, term15043.getClass(), "next", term15045);
        setField(term15043, term15043.getClass(), "first", term15049);
        setField(term15043, term15043.getClass(), "last", term15051);
        setField(term15043, term15043.getClass(), "propListHead", null);
        setIntField(term15043, term15043.getClass(), "sourcePosition", 0);
        setField(term15043, term15043.getClass(), "jsType", null);
        setField(term15043, term15043.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term15043;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term15001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


