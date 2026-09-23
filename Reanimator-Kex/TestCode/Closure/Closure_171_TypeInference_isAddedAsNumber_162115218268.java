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

public class TypeInference_isAddedAsNumber_162115218268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6165;

    public TypeInference_isAddedAsNumber_162115218268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35649 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term35648 = ((Class) term35649).getDeclaredField((String) "PRIVATE");
        ((Field) term35648).setAccessible(true);
        Object enum89 = ((Field) term35648).get((Object) null);
        term6165 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term6167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6182 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6185 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6192 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term6199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term6165, term6165.getClass(), "compiler", null);
        setField(term6167, term6167.getClass(), "name", "rsumfoDNHa");
        setField(term6167, term6167.getClass(), "referencedType", null);
        setField(term6167, term6167.getClass(), "referencedObjType", null);
        setBooleanField(term6167, term6167.getClass(), "visited", false);
        setField(term6182, term6182.getClass(), "baseType", null);
        setField(term6182, term6182.getClass(), "extendedInterfaces", null);
        setField(term6182, term6182.getClass(), "implementedInterfaces", null);
        setField(term6182, term6182.getClass(), "parameters", null);
        setField(term6182, term6182.getClass(), "thrownTypes", null);
        setField(term6182, term6182.getClass(), "templateTypeNames", null);
        setField(term6182, term6182.getClass(), "description", null);
        setField(term6182, term6182.getClass(), "meaning", null);
        setField(term6182, term6182.getClass(), "deprecated", null);
        setField(term6182, term6182.getClass(), "license", null);
        setField(term6182, term6182.getClass(), "suppressions", null);
        setField(term6182, term6182.getClass(), "modifies", null);
        setField(term6182, term6182.getClass(), "lendsName", null);
        setBooleanField(term6182, term6182.getClass(), "ngInject", false);
        setBooleanField(term6182, term6182.getClass(), "wizaction", false);
        setField(term6181, term6181.getClass(), "info", term6182);
        setField(term6185, term6185.getClass(), "sourceComment", null);
        setField(term6185, term6185.getClass(), "markers", null);
        setField(term6185, term6185.getClass(), "parameters", null);
        setField(term6185, term6185.getClass(), "throwsDescriptions", null);
        setField(term6185, term6185.getClass(), "blockDescription", null);
        setField(term6185, term6185.getClass(), "fileOverview", null);
        setField(term6185, term6185.getClass(), "returnDescription", null);
        setField(term6185, term6185.getClass(), "version", null);
        setField(term6185, term6185.getClass(), "authors", null);
        setField(term6185, term6185.getClass(), "sees", null);
        setField(term6181, term6181.getClass(), "documentation", term6185);
        setIntField(term6186, term6186.getClass(), "type", 0);
        setField(term6186, term6186.getClass(), "next", null);
        setField(term6186, term6186.getClass(), "first", null);
        setField(term6186, term6186.getClass(), "last", null);
        setField(term6186, term6186.getClass(), "propListHead", null);
        setIntField(term6186, term6186.getClass(), "sourcePosition", 0);
        setField(term6186, term6186.getClass(), "jsType", null);
        setField(term6186, term6186.getClass(), "parent", null);
        setField(term6181, term6181.getClass(), "associatedNode", term6186);
        setField(term6181, term6181.getClass(), "visibility", enum89);
        setIntField(term6181, term6181.getClass(), "bitset", -130649791);
        setField(term6192, term6192.getClass(), "root", null);
        setField(term6192, term6192.getClass(), "sourceName", null);
        setField(term6181, term6181.getClass(), "type", term6192);
        setField(term6181, term6181.getClass(), "thisType", term6192);
        setBooleanField(term6181, term6181.getClass(), "includeDocumentation", true);
        setIntField(term6181, term6181.getClass(), "originalCommentPosition", 534834644);
        setField(term6167, term6167.getClass(), "docInfo", term6181);
        setBooleanField(term6167, term6167.getClass(), "unknown", false);
        setBooleanField(term6167, term6167.getClass(), "resolved", false);
        setField(term6167, term6167.getClass(), "resolveResult", null);
        setField(term6197, term6197.getClass(), "templateKeys", null);
        setField(term6197, term6197.getClass(), "templateValues", null);
        setField(term6197, term6197.getClass(), "resolvedTemplateValues", null);
        setField(term6197, term6197.getClass(), "registry", null);
        setField(term6167, term6167.getClass(), "templateTypeMap", term6197);
        setBooleanField(term6167, term6167.getClass(), "inTemplatedCheckVisit", true);
        setField(term6167, term6167.getClass(), "registry", null);
        setField(term6166, term6166.getClass(), "objectIndexTemplateKey", term6167);
        setField(term6199, term6199.getClass(), "name", null);
        setField(term6199, term6199.getClass(), "referencedType", null);
        setField(term6199, term6199.getClass(), "referencedObjType", null);
        setBooleanField(term6199, term6199.getClass(), "visited", false);
        setField(term6199, term6199.getClass(), "docInfo", null);
        setBooleanField(term6199, term6199.getClass(), "unknown", false);
        setBooleanField(term6199, term6199.getClass(), "resolved", false);
        setField(term6199, term6199.getClass(), "resolveResult", null);
        setField(term6199, term6199.getClass(), "templateTypeMap", null);
        setBooleanField(term6199, term6199.getClass(), "inTemplatedCheckVisit", false);
        setField(term6199, term6199.getClass(), "registry", null);
        setField(term6166, term6166.getClass(), "objectElementTemplateKey", term6199);
        setField(term6166, term6166.getClass(), "reporter", null);
        setField(term6166, term6166.getClass(), "nativeTypes", null);
        setField(term6166, term6166.getClass(), "namesToTypes", null);
        setField(term6166, term6166.getClass(), "namespaces", null);
        setField(term6166, term6166.getClass(), "nonNullableTypeNames", null);
        setField(term6166, term6166.getClass(), "forwardDeclaredTypes", null);
        setField(term6166, term6166.getClass(), "typesIndexedByProperty", null);
        setField(term6166, term6166.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term6166, term6166.getClass(), "greatestSubtypeByProperty", null);
        setField(term6166, term6166.getClass(), "interfaceToImplementors", null);
        setField(term6166, term6166.getClass(), "unresolvedNamedTypes", null);
        setField(term6166, term6166.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6166, term6166.getClass(), "lastGeneration", false);
        setField(term6166, term6166.getClass(), "templateTypes", null);
        setField(term6166, term6166.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term6166, term6166.getClass(), "tolerateUndefinedValues", false);
        setField(term6166, term6166.getClass(), "resolveMode", null);
        setField(term6165, term6165.getClass(), "registry", term6166);
        setField(term6165, term6165.getClass(), "reverseInterpreter", null);
        setField(term6165, term6165.getClass(), "syntacticScope", null);
        setField(term6165, term6165.getClass(), "functionScope", null);
        setField(term6165, term6165.getClass(), "bottomScope", null);
        setField(term6165, term6165.getClass(), "assertionFunctionsMap", null);
        setField(term6165, term6165.getClass(), "unknownType", null);
        setField(term6165, term6165.getClass(), "cfg", null);
        setField(term6165, term6165.getClass(), "joinOp", null);
        setField(term6165, term6165.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isAddedAsNumber", argTypes, term6165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


