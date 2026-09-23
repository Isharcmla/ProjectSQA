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

public class TypeInference_maybeResolveTemplatedType_126670519377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11349;
     Object term11391;

    public TypeInference_maybeResolveTemplatedType_126670519377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45848 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term45847 = ((Class) term45848).getDeclaredField((String) "INHERITED");
        ((Field) term45847).setAccessible(true);
        Object enum113 = ((Field) term45847).get((Object) null);
        term11349 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11350 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11365 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11366 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11369 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11376 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11377 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term11384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11349, term11349.getClass(), "compiler", null);
        setField(term11351, term11351.getClass(), "name", "DddqUYfomL");
        setField(term11351, term11351.getClass(), "referencedType", null);
        setField(term11351, term11351.getClass(), "referencedObjType", null);
        setBooleanField(term11351, term11351.getClass(), "visited", true);
        setField(term11366, term11366.getClass(), "baseType", null);
        setField(term11366, term11366.getClass(), "extendedInterfaces", null);
        setField(term11366, term11366.getClass(), "implementedInterfaces", null);
        setField(term11366, term11366.getClass(), "parameters", null);
        setField(term11366, term11366.getClass(), "thrownTypes", null);
        setField(term11366, term11366.getClass(), "templateTypeNames", null);
        setField(term11366, term11366.getClass(), "description", null);
        setField(term11366, term11366.getClass(), "meaning", null);
        setField(term11366, term11366.getClass(), "deprecated", null);
        setField(term11366, term11366.getClass(), "license", null);
        setField(term11366, term11366.getClass(), "suppressions", null);
        setField(term11366, term11366.getClass(), "modifies", null);
        setField(term11366, term11366.getClass(), "lendsName", null);
        setBooleanField(term11366, term11366.getClass(), "ngInject", true);
        setBooleanField(term11366, term11366.getClass(), "wizaction", false);
        setField(term11365, term11365.getClass(), "info", term11366);
        setField(term11369, term11369.getClass(), "sourceComment", null);
        setField(term11369, term11369.getClass(), "markers", null);
        setField(term11369, term11369.getClass(), "parameters", null);
        setField(term11369, term11369.getClass(), "throwsDescriptions", null);
        setField(term11369, term11369.getClass(), "blockDescription", null);
        setField(term11369, term11369.getClass(), "fileOverview", null);
        setField(term11369, term11369.getClass(), "returnDescription", null);
        setField(term11369, term11369.getClass(), "version", null);
        setField(term11369, term11369.getClass(), "authors", null);
        setField(term11369, term11369.getClass(), "sees", null);
        setField(term11365, term11365.getClass(), "documentation", term11369);
        setIntField(term11370, term11370.getClass(), "type", 0);
        setField(term11370, term11370.getClass(), "next", null);
        setField(term11370, term11370.getClass(), "first", null);
        setField(term11370, term11370.getClass(), "last", null);
        setField(term11370, term11370.getClass(), "propListHead", null);
        setIntField(term11370, term11370.getClass(), "sourcePosition", 0);
        setField(term11370, term11370.getClass(), "jsType", null);
        setField(term11370, term11370.getClass(), "parent", null);
        setField(term11365, term11365.getClass(), "associatedNode", term11370);
        setField(term11365, term11365.getClass(), "visibility", enum113);
        setIntField(term11365, term11365.getClass(), "bitset", -1148142995);
        setField(term11376, term11376.getClass(), "root", term11370);
        setField(term11376, term11376.getClass(), "sourceName", null);
        setField(term11365, term11365.getClass(), "type", term11376);
        setField(term11377, term11377.getClass(), "root", null);
        setField(term11377, term11377.getClass(), "sourceName", null);
        setField(term11365, term11365.getClass(), "thisType", term11377);
        setBooleanField(term11365, term11365.getClass(), "includeDocumentation", false);
        setIntField(term11365, term11365.getClass(), "originalCommentPosition", -233024044);
        setField(term11351, term11351.getClass(), "docInfo", term11365);
        setBooleanField(term11351, term11351.getClass(), "unknown", false);
        setBooleanField(term11351, term11351.getClass(), "resolved", false);
        setField(term11351, term11351.getClass(), "resolveResult", null);
        setField(term11382, term11382.getClass(), "templateKeys", null);
        setField(term11382, term11382.getClass(), "templateValues", null);
        setField(term11382, term11382.getClass(), "resolvedTemplateValues", null);
        setField(term11382, term11382.getClass(), "registry", null);
        setField(term11351, term11351.getClass(), "templateTypeMap", term11382);
        setBooleanField(term11351, term11351.getClass(), "inTemplatedCheckVisit", false);
        setField(term11351, term11351.getClass(), "registry", null);
        setField(term11350, term11350.getClass(), "objectIndexTemplateKey", term11351);
        setField(term11384, term11384.getClass(), "name", null);
        setField(term11384, term11384.getClass(), "referencedType", null);
        setField(term11384, term11384.getClass(), "referencedObjType", null);
        setBooleanField(term11384, term11384.getClass(), "visited", false);
        setField(term11384, term11384.getClass(), "docInfo", null);
        setBooleanField(term11384, term11384.getClass(), "unknown", false);
        setBooleanField(term11384, term11384.getClass(), "resolved", false);
        setField(term11384, term11384.getClass(), "resolveResult", null);
        setField(term11384, term11384.getClass(), "templateTypeMap", null);
        setBooleanField(term11384, term11384.getClass(), "inTemplatedCheckVisit", false);
        setField(term11384, term11384.getClass(), "registry", null);
        setField(term11350, term11350.getClass(), "objectElementTemplateKey", term11384);
        setField(term11350, term11350.getClass(), "reporter", null);
        setField(term11350, term11350.getClass(), "nativeTypes", null);
        setField(term11350, term11350.getClass(), "namesToTypes", null);
        setField(term11350, term11350.getClass(), "namespaces", null);
        setField(term11350, term11350.getClass(), "nonNullableTypeNames", null);
        setField(term11350, term11350.getClass(), "forwardDeclaredTypes", null);
        setField(term11350, term11350.getClass(), "typesIndexedByProperty", null);
        setField(term11350, term11350.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11350, term11350.getClass(), "greatestSubtypeByProperty", null);
        setField(term11350, term11350.getClass(), "interfaceToImplementors", null);
        setField(term11350, term11350.getClass(), "unresolvedNamedTypes", null);
        setField(term11350, term11350.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11350, term11350.getClass(), "lastGeneration", false);
        setField(term11350, term11350.getClass(), "templateTypes", null);
        setField(term11350, term11350.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11350, term11350.getClass(), "tolerateUndefinedValues", false);
        setField(term11350, term11350.getClass(), "resolveMode", null);
        setField(term11349, term11349.getClass(), "registry", term11350);
        setField(term11349, term11349.getClass(), "reverseInterpreter", null);
        setField(term11349, term11349.getClass(), "syntacticScope", null);
        setField(term11349, term11349.getClass(), "functionScope", null);
        setField(term11349, term11349.getClass(), "bottomScope", null);
        setField(term11349, term11349.getClass(), "assertionFunctionsMap", null);
        setField(term11349, term11349.getClass(), "unknownType", null);
        setField(term11349, term11349.getClass(), "cfg", null);
        setField(term11349, term11349.getClass(), "joinOp", null);
        setField(term11349, term11349.getClass(), "orderedWorkSet", null);
        term11391 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term11391;
        try {
            callMethod(klass, "maybeResolveTemplatedType", argTypes, term11349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


