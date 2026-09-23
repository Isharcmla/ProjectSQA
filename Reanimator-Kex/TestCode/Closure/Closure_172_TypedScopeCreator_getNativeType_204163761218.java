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

public class TypedScopeCreator_getNativeType_204163761218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2352 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2351, term2351.getClass(), "compiler", null);
        setField(term2351, term2351.getClass(), "typeParsingErrorReporter", null);
        setField(term2352, term2352.getClass(), "compiler", null);
        setField(term2354, term2354.getClass(), "name", "");
        setField(term2354, term2354.getClass(), "referencedType", null);
        setField(term2354, term2354.getClass(), "referencedObjType", null);
        setBooleanField(term2354, term2354.getClass(), "visited", true);
        setField(term2357, term2357.getClass(), "info", null);
        setField(term2357, term2357.getClass(), "documentation", null);
        setField(term2357, term2357.getClass(), "associatedNode", null);
        setField(term2357, term2357.getClass(), "visibility", null);
        setIntField(term2357, term2357.getClass(), "bitset", -1772434990);
        setField(term2357, term2357.getClass(), "type", null);
        setField(term2357, term2357.getClass(), "thisType", null);
        setBooleanField(term2357, term2357.getClass(), "includeDocumentation", true);
        setIntField(term2357, term2357.getClass(), "originalCommentPosition", -1845499264);
        setField(term2354, term2354.getClass(), "docInfo", term2357);
        setBooleanField(term2354, term2354.getClass(), "unknown", true);
        setBooleanField(term2354, term2354.getClass(), "resolved", true);
        setField(term2354, term2354.getClass(), "resolveResult", null);
        setField(term2363, term2363.getClass(), "templateKeys", null);
        setField(term2363, term2363.getClass(), "templateValues", null);
        setField(term2363, term2363.getClass(), "resolvedTemplateValues", null);
        setField(term2363, term2363.getClass(), "registry", null);
        setField(term2354, term2354.getClass(), "templateTypeMap", term2363);
        setBooleanField(term2354, term2354.getClass(), "inTemplatedCheckVisit", false);
        setField(term2354, term2354.getClass(), "registry", null);
        setField(term2353, term2353.getClass(), "objectIndexTemplateKey", term2354);
        setField(term2365, term2365.getClass(), "name", null);
        setField(term2365, term2365.getClass(), "referencedType", null);
        setField(term2365, term2365.getClass(), "referencedObjType", null);
        setBooleanField(term2365, term2365.getClass(), "visited", false);
        setField(term2365, term2365.getClass(), "docInfo", null);
        setBooleanField(term2365, term2365.getClass(), "unknown", false);
        setBooleanField(term2365, term2365.getClass(), "resolved", false);
        setField(term2365, term2365.getClass(), "resolveResult", null);
        setField(term2365, term2365.getClass(), "templateTypeMap", null);
        setBooleanField(term2365, term2365.getClass(), "inTemplatedCheckVisit", false);
        setField(term2365, term2365.getClass(), "registry", null);
        setField(term2353, term2353.getClass(), "objectElementTemplateKey", term2365);
        setField(term2353, term2353.getClass(), "reporter", null);
        setField(term2353, term2353.getClass(), "nativeTypes", null);
        setField(term2353, term2353.getClass(), "namesToTypes", null);
        setField(term2353, term2353.getClass(), "namespaces", null);
        setField(term2353, term2353.getClass(), "nonNullableTypeNames", null);
        setField(term2353, term2353.getClass(), "forwardDeclaredTypes", null);
        setField(term2353, term2353.getClass(), "typesIndexedByProperty", null);
        setField(term2353, term2353.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2353, term2353.getClass(), "greatestSubtypeByProperty", null);
        setField(term2353, term2353.getClass(), "interfaceToImplementors", null);
        setField(term2353, term2353.getClass(), "unresolvedNamedTypes", null);
        setField(term2353, term2353.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2353, term2353.getClass(), "lastGeneration", false);
        setField(term2353, term2353.getClass(), "templateTypes", null);
        setField(term2353, term2353.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2353, term2353.getClass(), "tolerateUndefinedValues", false);
        setField(term2353, term2353.getClass(), "resolveMode", null);
        setField(term2352, term2352.getClass(), "typeRegistry", term2353);
        setField(term2352, term2352.getClass(), "allValueTypes", null);
        setBooleanField(term2352, term2352.getClass(), "shouldReport", false);
        setField(term2352, term2352.getClass(), "nullOrUndefined", null);
        setField(term2352, term2352.getClass(), "mismatches", null);
        setField(term2351, term2351.getClass(), "validator", term2352);
        setField(term2351, term2351.getClass(), "codingConvention", null);
        setField(term2351, term2351.getClass(), "typeRegistry", null);
        setField(term2351, term2351.getClass(), "delegateProxyPrototypes", null);
        setField(term2351, term2351.getClass(), "delegateCallingConventions", null);
        setField(term2351, term2351.getClass(), "functionAnalysisResults", null);
        setField(term2351, term2351.getClass(), "unknownType", null);
        Class<? extends Object> term6674 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6673 = ((Class) term6674).getDeclaredField((String) "OBJECT_FUNCTION_TYPE");
        ((Field) term6673).setAccessible(true);
        enum5 = ((Field) term6673).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


