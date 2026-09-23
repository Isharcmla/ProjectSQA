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

public class TypeInference_maybeResolveTemplatedType_76286536577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11432;
     Object term11476;
     Object term11482;

    public TypeInference_maybeResolveTemplatedType_76286536577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45695 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term45694 = ((Class) term45695).getDeclaredField((String) "PRIVATE");
        ((Field) term45694).setAccessible(true);
        Object enum112 = ((Field) term45694).get((Object) null);
        term11432 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term11433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term11434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term11448 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11449 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11455 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11462 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term11469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11432, term11432.getClass(), "compiler", null);
        setField(term11434, term11434.getClass(), "name", "WQnMpDlSfA");
        setField(term11434, term11434.getClass(), "referencedType", null);
        setField(term11434, term11434.getClass(), "referencedObjType", null);
        setBooleanField(term11434, term11434.getClass(), "visited", false);
        setField(term11449, term11449.getClass(), "baseType", null);
        setField(term11449, term11449.getClass(), "extendedInterfaces", null);
        setField(term11449, term11449.getClass(), "implementedInterfaces", null);
        setField(term11449, term11449.getClass(), "parameters", null);
        setField(term11449, term11449.getClass(), "thrownTypes", null);
        setField(term11449, term11449.getClass(), "templateTypeNames", null);
        setField(term11449, term11449.getClass(), "disposedParameters", null);
        setField(term11449, term11449.getClass(), "description", null);
        setField(term11449, term11449.getClass(), "meaning", null);
        setField(term11449, term11449.getClass(), "deprecated", null);
        setField(term11449, term11449.getClass(), "license", null);
        setField(term11449, term11449.getClass(), "suppressions", null);
        setField(term11449, term11449.getClass(), "modifies", null);
        setField(term11449, term11449.getClass(), "lendsName", null);
        setBooleanField(term11449, term11449.getClass(), "ngInject", true);
        setBooleanField(term11449, term11449.getClass(), "wizaction", false);
        setBooleanField(term11449, term11449.getClass(), "jaggerInject", false);
        setBooleanField(term11449, term11449.getClass(), "jaggerProvide", true);
        setBooleanField(term11449, term11449.getClass(), "jaggerModule", true);
        setField(term11448, term11448.getClass(), "info", term11449);
        setField(term11455, term11455.getClass(), "sourceComment", null);
        setField(term11455, term11455.getClass(), "markers", null);
        setField(term11455, term11455.getClass(), "parameters", null);
        setField(term11455, term11455.getClass(), "throwsDescriptions", null);
        setField(term11455, term11455.getClass(), "blockDescription", null);
        setField(term11455, term11455.getClass(), "fileOverview", null);
        setField(term11455, term11455.getClass(), "returnDescription", null);
        setField(term11455, term11455.getClass(), "version", null);
        setField(term11455, term11455.getClass(), "authors", null);
        setField(term11455, term11455.getClass(), "sees", null);
        setField(term11448, term11448.getClass(), "documentation", term11455);
        setIntField(term11456, term11456.getClass(), "type", 0);
        setField(term11456, term11456.getClass(), "next", null);
        setField(term11456, term11456.getClass(), "first", null);
        setField(term11456, term11456.getClass(), "last", null);
        setField(term11456, term11456.getClass(), "propListHead", null);
        setIntField(term11456, term11456.getClass(), "sourcePosition", 0);
        setField(term11456, term11456.getClass(), "jsType", null);
        setField(term11456, term11456.getClass(), "parent", null);
        setField(term11448, term11448.getClass(), "associatedNode", term11456);
        setField(term11448, term11448.getClass(), "visibility", enum112);
        setIntField(term11448, term11448.getClass(), "bitset", -1148142995);
        setField(term11462, term11462.getClass(), "root", null);
        setField(term11462, term11462.getClass(), "sourceName", null);
        setField(term11448, term11448.getClass(), "type", term11462);
        setField(term11448, term11448.getClass(), "thisType", term11462);
        setBooleanField(term11448, term11448.getClass(), "includeDocumentation", false);
        setIntField(term11448, term11448.getClass(), "originalCommentPosition", -233024044);
        setField(term11434, term11434.getClass(), "docInfo", term11448);
        setBooleanField(term11434, term11434.getClass(), "unknown", true);
        setBooleanField(term11434, term11434.getClass(), "resolved", true);
        setField(term11434, term11434.getClass(), "resolveResult", null);
        setField(term11467, term11467.getClass(), "templateKeys", null);
        setField(term11467, term11467.getClass(), "templateValues", null);
        setField(term11467, term11467.getClass(), "resolvedTemplateValues", null);
        setField(term11467, term11467.getClass(), "registry", null);
        setField(term11434, term11434.getClass(), "templateTypeMap", term11467);
        setBooleanField(term11434, term11434.getClass(), "inTemplatedCheckVisit", false);
        setField(term11434, term11434.getClass(), "registry", null);
        setField(term11433, term11433.getClass(), "objectIndexTemplateKey", term11434);
        setField(term11469, term11469.getClass(), "name", null);
        setField(term11469, term11469.getClass(), "referencedType", null);
        setField(term11469, term11469.getClass(), "referencedObjType", null);
        setBooleanField(term11469, term11469.getClass(), "visited", false);
        setField(term11469, term11469.getClass(), "docInfo", null);
        setBooleanField(term11469, term11469.getClass(), "unknown", false);
        setBooleanField(term11469, term11469.getClass(), "resolved", false);
        setField(term11469, term11469.getClass(), "resolveResult", null);
        setField(term11469, term11469.getClass(), "templateTypeMap", null);
        setBooleanField(term11469, term11469.getClass(), "inTemplatedCheckVisit", false);
        setField(term11469, term11469.getClass(), "registry", null);
        setField(term11433, term11433.getClass(), "objectElementTemplateKey", term11469);
        setField(term11433, term11433.getClass(), "reporter", null);
        setField(term11433, term11433.getClass(), "nativeTypes", null);
        setField(term11433, term11433.getClass(), "namesToTypes", null);
        setField(term11433, term11433.getClass(), "namespaces", null);
        setField(term11433, term11433.getClass(), "nonNullableTypeNames", null);
        setField(term11433, term11433.getClass(), "forwardDeclaredTypes", null);
        setField(term11433, term11433.getClass(), "typesIndexedByProperty", null);
        setField(term11433, term11433.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term11433, term11433.getClass(), "greatestSubtypeByProperty", null);
        setField(term11433, term11433.getClass(), "interfaceToImplementors", null);
        setField(term11433, term11433.getClass(), "unresolvedNamedTypes", null);
        setField(term11433, term11433.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term11433, term11433.getClass(), "lastGeneration", false);
        setField(term11433, term11433.getClass(), "templateTypes", null);
        setField(term11433, term11433.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term11433, term11433.getClass(), "tolerateUndefinedValues", false);
        setField(term11432, term11432.getClass(), "registry", term11433);
        setField(term11432, term11432.getClass(), "reverseInterpreter", null);
        setField(term11432, term11432.getClass(), "syntacticScope", null);
        setField(term11432, term11432.getClass(), "functionScope", null);
        setField(term11432, term11432.getClass(), "bottomScope", null);
        setField(term11432, term11432.getClass(), "assertionFunctionsMap", null);
        setField(term11432, term11432.getClass(), "unknownType", null);
        setField(term11432, term11432.getClass(), "cfg", null);
        setField(term11432, term11432.getClass(), "joinOp", null);
        setField(term11432, term11432.getClass(), "orderedWorkSet", null);
        term11476 = new LinkedHashMap();
        HashMap term11483 = new HashMap();
        Set<Object> term45962 =  ((Map) term11483).keySet();
        term11482 = new HashSet((Collection<? extends Object>) term45962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term11476;
        args[3] = term11482;
        try {
            callMethod(klass, "maybeResolveTemplatedType", argTypes, term11432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


