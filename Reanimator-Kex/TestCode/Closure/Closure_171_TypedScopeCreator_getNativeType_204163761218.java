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
     Object term2373;
     Object enum5;

    public TypedScopeCreator_getNativeType_204163761218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2373 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term2374 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term2375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term2376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term2387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term2373, term2373.getClass(), "compiler", null);
        setField(term2373, term2373.getClass(), "typeParsingErrorReporter", null);
        setField(term2374, term2374.getClass(), "compiler", null);
        setField(term2376, term2376.getClass(), "name", "");
        setField(term2376, term2376.getClass(), "referencedType", null);
        setField(term2376, term2376.getClass(), "referencedObjType", null);
        setBooleanField(term2376, term2376.getClass(), "visited", true);
        setField(term2379, term2379.getClass(), "info", null);
        setField(term2379, term2379.getClass(), "documentation", null);
        setField(term2379, term2379.getClass(), "associatedNode", null);
        setField(term2379, term2379.getClass(), "visibility", null);
        setIntField(term2379, term2379.getClass(), "bitset", -344842608);
        setField(term2379, term2379.getClass(), "type", null);
        setField(term2379, term2379.getClass(), "thisType", null);
        setBooleanField(term2379, term2379.getClass(), "includeDocumentation", true);
        setIntField(term2379, term2379.getClass(), "originalCommentPosition", 941650513);
        setField(term2376, term2376.getClass(), "docInfo", term2379);
        setBooleanField(term2376, term2376.getClass(), "unknown", true);
        setBooleanField(term2376, term2376.getClass(), "resolved", true);
        setField(term2376, term2376.getClass(), "resolveResult", null);
        setField(term2385, term2385.getClass(), "templateKeys", null);
        setField(term2385, term2385.getClass(), "templateValues", null);
        setField(term2385, term2385.getClass(), "resolvedTemplateValues", null);
        setField(term2385, term2385.getClass(), "registry", null);
        setField(term2376, term2376.getClass(), "templateTypeMap", term2385);
        setBooleanField(term2376, term2376.getClass(), "inTemplatedCheckVisit", false);
        setField(term2376, term2376.getClass(), "registry", null);
        setField(term2375, term2375.getClass(), "objectIndexTemplateKey", term2376);
        setField(term2387, term2387.getClass(), "name", null);
        setField(term2387, term2387.getClass(), "referencedType", null);
        setField(term2387, term2387.getClass(), "referencedObjType", null);
        setBooleanField(term2387, term2387.getClass(), "visited", false);
        setField(term2387, term2387.getClass(), "docInfo", null);
        setBooleanField(term2387, term2387.getClass(), "unknown", false);
        setBooleanField(term2387, term2387.getClass(), "resolved", false);
        setField(term2387, term2387.getClass(), "resolveResult", null);
        setField(term2387, term2387.getClass(), "templateTypeMap", null);
        setBooleanField(term2387, term2387.getClass(), "inTemplatedCheckVisit", false);
        setField(term2387, term2387.getClass(), "registry", null);
        setField(term2375, term2375.getClass(), "objectElementTemplateKey", term2387);
        setField(term2375, term2375.getClass(), "reporter", null);
        setField(term2375, term2375.getClass(), "nativeTypes", null);
        setField(term2375, term2375.getClass(), "namesToTypes", null);
        setField(term2375, term2375.getClass(), "namespaces", null);
        setField(term2375, term2375.getClass(), "nonNullableTypeNames", null);
        setField(term2375, term2375.getClass(), "forwardDeclaredTypes", null);
        setField(term2375, term2375.getClass(), "typesIndexedByProperty", null);
        setField(term2375, term2375.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term2375, term2375.getClass(), "greatestSubtypeByProperty", null);
        setField(term2375, term2375.getClass(), "interfaceToImplementors", null);
        setField(term2375, term2375.getClass(), "unresolvedNamedTypes", null);
        setField(term2375, term2375.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2375, term2375.getClass(), "lastGeneration", false);
        setField(term2375, term2375.getClass(), "templateTypes", null);
        setField(term2375, term2375.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term2375, term2375.getClass(), "tolerateUndefinedValues", false);
        setField(term2375, term2375.getClass(), "resolveMode", null);
        setField(term2374, term2374.getClass(), "typeRegistry", term2375);
        setField(term2374, term2374.getClass(), "allValueTypes", null);
        setBooleanField(term2374, term2374.getClass(), "shouldReport", false);
        setField(term2374, term2374.getClass(), "nullOrUndefined", null);
        setField(term2374, term2374.getClass(), "mismatches", null);
        setField(term2373, term2373.getClass(), "validator", term2374);
        setField(term2373, term2373.getClass(), "codingConvention", null);
        setField(term2373, term2373.getClass(), "typeRegistry", null);
        setField(term2373, term2373.getClass(), "delegateProxyPrototypes", null);
        setField(term2373, term2373.getClass(), "delegateCallingConventions", null);
        setField(term2373, term2373.getClass(), "functionAnalysisResults", null);
        setField(term2373, term2373.getClass(), "unknownType", null);
        Class<? extends Object> term6712 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term6711 = ((Class) term6712).getDeclaredField((String) "OBJECT_FUNCTION_TYPE");
        ((Field) term6711).setAccessible(true);
        enum5 = ((Field) term6711).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[1];
        args[0] = enum5;
        try {
            callMethod(klass, "getNativeType", argTypes, term2373, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


