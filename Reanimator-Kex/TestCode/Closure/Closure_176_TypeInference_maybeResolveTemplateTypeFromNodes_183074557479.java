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
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_maybeResolveTemplateTypeFromNodes_183074557479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12110;
     Object term12155;
     Object term12161;

    public TypeInference_maybeResolveTemplateTypeFromNodes_183074557479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46746 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46745 = ((Class) term46746).getDeclaredField((String) "PUBLIC");
        ((Field) term46745).setAccessible(true);
        Object enum114 = ((Field) term46745).get((Object) null);
        term12110 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term12111 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term12112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12126 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12127 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12133 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12140 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12141 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term12148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term12110, term12110.getClass(), "compiler", null);
        setField(term12112, term12112.getClass(), "name", "EfSUvjuZAA");
        setField(term12112, term12112.getClass(), "referencedType", null);
        setField(term12112, term12112.getClass(), "referencedObjType", null);
        setBooleanField(term12112, term12112.getClass(), "visited", false);
        setField(term12127, term12127.getClass(), "baseType", null);
        setField(term12127, term12127.getClass(), "extendedInterfaces", null);
        setField(term12127, term12127.getClass(), "implementedInterfaces", null);
        setField(term12127, term12127.getClass(), "parameters", null);
        setField(term12127, term12127.getClass(), "thrownTypes", null);
        setField(term12127, term12127.getClass(), "templateTypeNames", null);
        setField(term12127, term12127.getClass(), "disposedParameters", null);
        setField(term12127, term12127.getClass(), "description", null);
        setField(term12127, term12127.getClass(), "meaning", null);
        setField(term12127, term12127.getClass(), "deprecated", null);
        setField(term12127, term12127.getClass(), "license", null);
        setField(term12127, term12127.getClass(), "suppressions", null);
        setField(term12127, term12127.getClass(), "modifies", null);
        setField(term12127, term12127.getClass(), "lendsName", null);
        setBooleanField(term12127, term12127.getClass(), "ngInject", true);
        setBooleanField(term12127, term12127.getClass(), "wizaction", true);
        setBooleanField(term12127, term12127.getClass(), "jaggerInject", false);
        setBooleanField(term12127, term12127.getClass(), "jaggerProvide", true);
        setBooleanField(term12127, term12127.getClass(), "jaggerModule", true);
        setField(term12126, term12126.getClass(), "info", term12127);
        setField(term12133, term12133.getClass(), "sourceComment", null);
        setField(term12133, term12133.getClass(), "markers", null);
        setField(term12133, term12133.getClass(), "parameters", null);
        setField(term12133, term12133.getClass(), "throwsDescriptions", null);
        setField(term12133, term12133.getClass(), "blockDescription", null);
        setField(term12133, term12133.getClass(), "fileOverview", null);
        setField(term12133, term12133.getClass(), "returnDescription", null);
        setField(term12133, term12133.getClass(), "version", null);
        setField(term12133, term12133.getClass(), "authors", null);
        setField(term12133, term12133.getClass(), "sees", null);
        setField(term12126, term12126.getClass(), "documentation", term12133);
        setIntField(term12134, term12134.getClass(), "type", 0);
        setField(term12134, term12134.getClass(), "next", null);
        setField(term12134, term12134.getClass(), "first", null);
        setField(term12134, term12134.getClass(), "last", null);
        setField(term12134, term12134.getClass(), "propListHead", null);
        setIntField(term12134, term12134.getClass(), "sourcePosition", 0);
        setField(term12134, term12134.getClass(), "jsType", null);
        setField(term12134, term12134.getClass(), "parent", null);
        setField(term12126, term12126.getClass(), "associatedNode", term12134);
        setField(term12126, term12126.getClass(), "visibility", enum114);
        setIntField(term12126, term12126.getClass(), "bitset", -1284825282);
        setField(term12140, term12140.getClass(), "root", term12134);
        setField(term12140, term12140.getClass(), "sourceName", null);
        setField(term12126, term12126.getClass(), "type", term12140);
        setField(term12141, term12141.getClass(), "root", term12134);
        setField(term12141, term12141.getClass(), "sourceName", null);
        setField(term12126, term12126.getClass(), "thisType", term12141);
        setBooleanField(term12126, term12126.getClass(), "includeDocumentation", false);
        setIntField(term12126, term12126.getClass(), "originalCommentPosition", -1941343035);
        setField(term12112, term12112.getClass(), "docInfo", term12126);
        setBooleanField(term12112, term12112.getClass(), "unknown", true);
        setBooleanField(term12112, term12112.getClass(), "resolved", true);
        setField(term12112, term12112.getClass(), "resolveResult", null);
        setField(term12146, term12146.getClass(), "templateKeys", null);
        setField(term12146, term12146.getClass(), "templateValues", null);
        setField(term12146, term12146.getClass(), "resolvedTemplateValues", null);
        setField(term12146, term12146.getClass(), "registry", null);
        setField(term12112, term12112.getClass(), "templateTypeMap", term12146);
        setBooleanField(term12112, term12112.getClass(), "inTemplatedCheckVisit", false);
        setField(term12112, term12112.getClass(), "registry", null);
        setField(term12111, term12111.getClass(), "objectIndexTemplateKey", term12112);
        setField(term12148, term12148.getClass(), "name", null);
        setField(term12148, term12148.getClass(), "referencedType", null);
        setField(term12148, term12148.getClass(), "referencedObjType", null);
        setBooleanField(term12148, term12148.getClass(), "visited", false);
        setField(term12148, term12148.getClass(), "docInfo", null);
        setBooleanField(term12148, term12148.getClass(), "unknown", false);
        setBooleanField(term12148, term12148.getClass(), "resolved", false);
        setField(term12148, term12148.getClass(), "resolveResult", null);
        setField(term12148, term12148.getClass(), "templateTypeMap", null);
        setBooleanField(term12148, term12148.getClass(), "inTemplatedCheckVisit", false);
        setField(term12148, term12148.getClass(), "registry", null);
        setField(term12111, term12111.getClass(), "objectElementTemplateKey", term12148);
        setField(term12111, term12111.getClass(), "reporter", null);
        setField(term12111, term12111.getClass(), "nativeTypes", null);
        setField(term12111, term12111.getClass(), "namesToTypes", null);
        setField(term12111, term12111.getClass(), "namespaces", null);
        setField(term12111, term12111.getClass(), "nonNullableTypeNames", null);
        setField(term12111, term12111.getClass(), "forwardDeclaredTypes", null);
        setField(term12111, term12111.getClass(), "typesIndexedByProperty", null);
        setField(term12111, term12111.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term12111, term12111.getClass(), "greatestSubtypeByProperty", null);
        setField(term12111, term12111.getClass(), "interfaceToImplementors", null);
        setField(term12111, term12111.getClass(), "unresolvedNamedTypes", null);
        setField(term12111, term12111.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12111, term12111.getClass(), "lastGeneration", false);
        setField(term12111, term12111.getClass(), "templateTypes", null);
        setField(term12111, term12111.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term12111, term12111.getClass(), "tolerateUndefinedValues", false);
        setField(term12110, term12110.getClass(), "registry", term12111);
        setField(term12110, term12110.getClass(), "reverseInterpreter", null);
        setField(term12110, term12110.getClass(), "syntacticScope", null);
        setField(term12110, term12110.getClass(), "functionScope", null);
        setField(term12110, term12110.getClass(), "bottomScope", null);
        setField(term12110, term12110.getClass(), "assertionFunctionsMap", null);
        setField(term12110, term12110.getClass(), "unknownType", null);
        setField(term12110, term12110.getClass(), "cfg", null);
        setField(term12110, term12110.getClass(), "joinOp", null);
        setField(term12110, term12110.getClass(), "orderedWorkSet", null);
        term12155 = new LinkedHashMap();
        HashMap term12162 = new HashMap();
        Set<Object> term47010 =  ((Map) term12162).keySet();
        term12161 = new HashSet((Collection<? extends Object>) term47010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term12155;
        args[3] = term12161;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term12110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


