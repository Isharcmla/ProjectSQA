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

public class TypeInference_maybeResolveTemplateTypeFromNodes_161239930279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12092;
     Object term12137;

    public TypeInference_maybeResolveTemplateTypeFromNodes_161239930279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46660 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term46659 = ((Class) term46660).getDeclaredField((String) "PRIVATE");
        ((Field) term46659).setAccessible(true);
        Object enum114 = ((Field) term46659).get((Object) null);
        term12092 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term12093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term12094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term12108 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12109 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12115 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12122 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12123 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term12130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term12092, term12092.getClass(), "compiler", null);
        setField(term12094, term12094.getClass(), "name", "aSYOhFwzSm");
        setField(term12094, term12094.getClass(), "referencedType", null);
        setField(term12094, term12094.getClass(), "referencedObjType", null);
        setBooleanField(term12094, term12094.getClass(), "visited", false);
        setField(term12109, term12109.getClass(), "baseType", null);
        setField(term12109, term12109.getClass(), "extendedInterfaces", null);
        setField(term12109, term12109.getClass(), "implementedInterfaces", null);
        setField(term12109, term12109.getClass(), "parameters", null);
        setField(term12109, term12109.getClass(), "thrownTypes", null);
        setField(term12109, term12109.getClass(), "templateTypeNames", null);
        setField(term12109, term12109.getClass(), "disposedParameters", null);
        setField(term12109, term12109.getClass(), "description", null);
        setField(term12109, term12109.getClass(), "meaning", null);
        setField(term12109, term12109.getClass(), "deprecated", null);
        setField(term12109, term12109.getClass(), "license", null);
        setField(term12109, term12109.getClass(), "suppressions", null);
        setField(term12109, term12109.getClass(), "modifies", null);
        setField(term12109, term12109.getClass(), "lendsName", null);
        setBooleanField(term12109, term12109.getClass(), "ngInject", true);
        setBooleanField(term12109, term12109.getClass(), "wizaction", true);
        setBooleanField(term12109, term12109.getClass(), "jaggerInject", false);
        setBooleanField(term12109, term12109.getClass(), "jaggerProvide", true);
        setBooleanField(term12109, term12109.getClass(), "jaggerModule", true);
        setField(term12108, term12108.getClass(), "info", term12109);
        setField(term12115, term12115.getClass(), "sourceComment", null);
        setField(term12115, term12115.getClass(), "markers", null);
        setField(term12115, term12115.getClass(), "parameters", null);
        setField(term12115, term12115.getClass(), "throwsDescriptions", null);
        setField(term12115, term12115.getClass(), "blockDescription", null);
        setField(term12115, term12115.getClass(), "fileOverview", null);
        setField(term12115, term12115.getClass(), "returnDescription", null);
        setField(term12115, term12115.getClass(), "version", null);
        setField(term12115, term12115.getClass(), "authors", null);
        setField(term12115, term12115.getClass(), "sees", null);
        setField(term12108, term12108.getClass(), "documentation", term12115);
        setIntField(term12116, term12116.getClass(), "type", 0);
        setField(term12116, term12116.getClass(), "next", null);
        setField(term12116, term12116.getClass(), "first", null);
        setField(term12116, term12116.getClass(), "last", null);
        setField(term12116, term12116.getClass(), "propListHead", null);
        setIntField(term12116, term12116.getClass(), "sourcePosition", 0);
        setField(term12116, term12116.getClass(), "jsType", null);
        setField(term12116, term12116.getClass(), "parent", null);
        setField(term12108, term12108.getClass(), "associatedNode", term12116);
        setField(term12108, term12108.getClass(), "visibility", enum114);
        setIntField(term12108, term12108.getClass(), "bitset", -1284825282);
        setField(term12122, term12122.getClass(), "root", null);
        setField(term12122, term12122.getClass(), "sourceName", null);
        setField(term12108, term12108.getClass(), "type", term12122);
        setField(term12123, term12123.getClass(), "root", null);
        setField(term12123, term12123.getClass(), "sourceName", null);
        setField(term12108, term12108.getClass(), "thisType", term12123);
        setBooleanField(term12108, term12108.getClass(), "includeDocumentation", false);
        setIntField(term12108, term12108.getClass(), "originalCommentPosition", -1941343035);
        setField(term12094, term12094.getClass(), "docInfo", term12108);
        setBooleanField(term12094, term12094.getClass(), "unknown", true);
        setBooleanField(term12094, term12094.getClass(), "resolved", true);
        setField(term12094, term12094.getClass(), "resolveResult", null);
        setField(term12128, term12128.getClass(), "templateKeys", null);
        setField(term12128, term12128.getClass(), "templateValues", null);
        setField(term12128, term12128.getClass(), "resolvedTemplateValues", null);
        setField(term12128, term12128.getClass(), "registry", null);
        setField(term12094, term12094.getClass(), "templateTypeMap", term12128);
        setBooleanField(term12094, term12094.getClass(), "inTemplatedCheckVisit", false);
        setField(term12094, term12094.getClass(), "registry", null);
        setField(term12093, term12093.getClass(), "objectIndexTemplateKey", term12094);
        setField(term12130, term12130.getClass(), "name", null);
        setField(term12130, term12130.getClass(), "referencedType", null);
        setField(term12130, term12130.getClass(), "referencedObjType", null);
        setBooleanField(term12130, term12130.getClass(), "visited", false);
        setField(term12130, term12130.getClass(), "docInfo", null);
        setBooleanField(term12130, term12130.getClass(), "unknown", false);
        setBooleanField(term12130, term12130.getClass(), "resolved", false);
        setField(term12130, term12130.getClass(), "resolveResult", null);
        setField(term12130, term12130.getClass(), "templateTypeMap", null);
        setBooleanField(term12130, term12130.getClass(), "inTemplatedCheckVisit", false);
        setField(term12130, term12130.getClass(), "registry", null);
        setField(term12093, term12093.getClass(), "objectElementTemplateKey", term12130);
        setField(term12093, term12093.getClass(), "reporter", null);
        setField(term12093, term12093.getClass(), "nativeTypes", null);
        setField(term12093, term12093.getClass(), "namesToTypes", null);
        setField(term12093, term12093.getClass(), "namespaces", null);
        setField(term12093, term12093.getClass(), "nonNullableTypeNames", null);
        setField(term12093, term12093.getClass(), "forwardDeclaredTypes", null);
        setField(term12093, term12093.getClass(), "typesIndexedByProperty", null);
        setField(term12093, term12093.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term12093, term12093.getClass(), "greatestSubtypeByProperty", null);
        setField(term12093, term12093.getClass(), "interfaceToImplementors", null);
        setField(term12093, term12093.getClass(), "unresolvedNamedTypes", null);
        setField(term12093, term12093.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12093, term12093.getClass(), "lastGeneration", false);
        setField(term12093, term12093.getClass(), "templateTypes", null);
        setField(term12093, term12093.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term12093, term12093.getClass(), "tolerateUndefinedValues", false);
        setField(term12092, term12092.getClass(), "registry", term12093);
        setField(term12092, term12092.getClass(), "reverseInterpreter", null);
        setField(term12092, term12092.getClass(), "syntacticScope", null);
        setField(term12092, term12092.getClass(), "functionScope", null);
        setField(term12092, term12092.getClass(), "bottomScope", null);
        setField(term12092, term12092.getClass(), "assertionFunctionsMap", null);
        setField(term12092, term12092.getClass(), "unknownType", null);
        setField(term12092, term12092.getClass(), "cfg", null);
        setField(term12092, term12092.getClass(), "joinOp", null);
        setField(term12092, term12092.getClass(), "orderedWorkSet", null);
        term12137 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Iterator");
        argTypes[1] = Class.forName("java.util.Iterator");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term12137;
        try {
            callMethod(klass, "maybeResolveTemplateTypeFromNodes", argTypes, term12092, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


