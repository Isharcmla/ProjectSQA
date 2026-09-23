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
import java.util.HashMap;
import java.lang.String;

public class TypedScopeCreator_declareNativeFunctionType_123196205515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258;
     Object term280;
     Object enum3;

    public TypedScopeCreator_declareNativeFunctionType_123196205515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term261 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term264 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term258, term258.getClass(), "compiler", null);
        setField(term258, term258.getClass(), "typeParsingErrorReporter", null);
        setField(term259, term259.getClass(), "compiler", null);
        setField(term261, term261.getClass(), "name", "");
        setField(term261, term261.getClass(), "referencedType", null);
        setField(term261, term261.getClass(), "referencedObjType", null);
        setBooleanField(term261, term261.getClass(), "visited", true);
        setField(term264, term264.getClass(), "info", null);
        setField(term264, term264.getClass(), "documentation", null);
        setField(term264, term264.getClass(), "associatedNode", null);
        setField(term264, term264.getClass(), "visibility", null);
        setIntField(term264, term264.getClass(), "bitset", -184153539);
        setField(term264, term264.getClass(), "type", null);
        setField(term264, term264.getClass(), "thisType", null);
        setBooleanField(term264, term264.getClass(), "includeDocumentation", false);
        setIntField(term264, term264.getClass(), "originalCommentPosition", 493620644);
        setField(term261, term261.getClass(), "docInfo", term264);
        setBooleanField(term261, term261.getClass(), "unknown", false);
        setBooleanField(term261, term261.getClass(), "resolved", true);
        setField(term261, term261.getClass(), "resolveResult", null);
        setField(term270, term270.getClass(), "templateKeys", null);
        setField(term270, term270.getClass(), "templateValues", null);
        setField(term270, term270.getClass(), "resolvedTemplateValues", null);
        setField(term270, term270.getClass(), "registry", null);
        setField(term261, term261.getClass(), "templateTypeMap", term270);
        setBooleanField(term261, term261.getClass(), "inTemplatedCheckVisit", true);
        setField(term261, term261.getClass(), "registry", null);
        setField(term260, term260.getClass(), "objectIndexTemplateKey", term261);
        setField(term272, term272.getClass(), "name", null);
        setField(term272, term272.getClass(), "referencedType", null);
        setField(term272, term272.getClass(), "referencedObjType", null);
        setBooleanField(term272, term272.getClass(), "visited", false);
        setField(term272, term272.getClass(), "docInfo", null);
        setBooleanField(term272, term272.getClass(), "unknown", false);
        setBooleanField(term272, term272.getClass(), "resolved", false);
        setField(term272, term272.getClass(), "resolveResult", null);
        setField(term272, term272.getClass(), "templateTypeMap", null);
        setBooleanField(term272, term272.getClass(), "inTemplatedCheckVisit", false);
        setField(term272, term272.getClass(), "registry", null);
        setField(term260, term260.getClass(), "objectElementTemplateKey", term272);
        setField(term260, term260.getClass(), "reporter", null);
        setField(term260, term260.getClass(), "nativeTypes", null);
        setField(term260, term260.getClass(), "namesToTypes", null);
        setField(term260, term260.getClass(), "namespaces", null);
        setField(term260, term260.getClass(), "nonNullableTypeNames", null);
        setField(term260, term260.getClass(), "forwardDeclaredTypes", null);
        setField(term260, term260.getClass(), "typesIndexedByProperty", null);
        setField(term260, term260.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term260, term260.getClass(), "greatestSubtypeByProperty", null);
        setField(term260, term260.getClass(), "interfaceToImplementors", null);
        setField(term260, term260.getClass(), "unresolvedNamedTypes", null);
        setField(term260, term260.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term260, term260.getClass(), "lastGeneration", false);
        setField(term260, term260.getClass(), "templateTypes", null);
        setField(term260, term260.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term260, term260.getClass(), "tolerateUndefinedValues", false);
        setField(term260, term260.getClass(), "resolveMode", null);
        setField(term259, term259.getClass(), "typeRegistry", term260);
        setField(term259, term259.getClass(), "allValueTypes", null);
        setBooleanField(term259, term259.getClass(), "shouldReport", false);
        setField(term259, term259.getClass(), "nullOrUndefined", null);
        setField(term259, term259.getClass(), "mismatches", null);
        setField(term258, term258.getClass(), "validator", term259);
        setField(term258, term258.getClass(), "codingConvention", null);
        setField(term258, term258.getClass(), "typeRegistry", null);
        setField(term258, term258.getClass(), "delegateProxyPrototypes", null);
        setField(term258, term258.getClass(), "delegateCallingConventions", null);
        setField(term258, term258.getClass(), "functionAnalysisResults", null);
        setField(term258, term258.getClass(), "unknownType", null);
        HashMap term281 = new HashMap();
        term280 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term295 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term330 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term280, term280.getClass(), "vars", term281);
        setField(term295, term295.getClass(), "vars", null);
        setField(term295, term295.getClass(), "parent", null);
        setIntField(term295, term295.getClass(), "depth", 0);
        setField(term295, term295.getClass(), "rootNode", null);
        setBooleanField(term295, term295.getClass(), "isBottom", false);
        setField(term295, term295.getClass(), "arguments", null);
        setField(term295, term295.getClass(), "typeResolver", null);
        setField(term280, term280.getClass(), "parent", term295);
        setIntField(term280, term280.getClass(), "depth", -112921587);
        setIntField(term299, term299.getClass(), "type", 1225272962);
        setIntField(term301, term301.getClass(), "type", 1324040357);
        setIntField(term303, term303.getClass(), "type", -1588772968);
        setIntField(term305, term305.getClass(), "type", -93135961);
        setField(term305, term305.getClass(), "next", null);
        setField(term305, term305.getClass(), "first", null);
        setField(term305, term305.getClass(), "last", term305);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
        setField(term303, term303.getClass(), "next", term305);
        setIntField(term308, term308.getClass(), "type", 0);
        setField(term308, term308.getClass(), "next", null);
        setField(term308, term308.getClass(), "first", null);
        setField(term308, term308.getClass(), "last", null);
        setField(term308, term308.getClass(), "propListHead", null);
        setIntField(term308, term308.getClass(), "sourcePosition", 0);
        setField(term308, term308.getClass(), "jsType", null);
        setField(term308, term308.getClass(), "parent", null);
        setField(term303, term303.getClass(), "first", term308);
        setIntField(term311, term311.getClass(), "type", 1596070772);
        setField(term311, term311.getClass(), "next", null);
        setField(term311, term311.getClass(), "first", term301);
        setField(term311, term311.getClass(), "last", null);
        setField(term311, term311.getClass(), "propListHead", null);
        setIntField(term311, term311.getClass(), "sourcePosition", 0);
        setField(term311, term311.getClass(), "jsType", null);
        setField(term311, term311.getClass(), "parent", null);
        setField(term303, term303.getClass(), "last", term311);
        setField(term303, term303.getClass(), "propListHead", null);
        setIntField(term303, term303.getClass(), "sourcePosition", 0);
        setField(term303, term303.getClass(), "jsType", null);
        setField(term303, term303.getClass(), "parent", null);
        setField(term301, term301.getClass(), "next", term303);
        setField(term301, term301.getClass(), "first", term301);
        setIntField(term315, term315.getClass(), "type", -2095575670);
        setField(term315, term315.getClass(), "next", term299);
        setIntField(term317, term317.getClass(), "type", 0);
        setField(term317, term317.getClass(), "next", null);
        setField(term317, term317.getClass(), "first", null);
        setField(term317, term317.getClass(), "last", null);
        setField(term317, term317.getClass(), "propListHead", null);
        setIntField(term317, term317.getClass(), "sourcePosition", 0);
        setField(term317, term317.getClass(), "jsType", null);
        setField(term317, term317.getClass(), "parent", null);
        setField(term315, term315.getClass(), "first", term317);
        setField(term315, term315.getClass(), "last", term305);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        setField(term301, term301.getClass(), "last", term315);
        setField(term301, term301.getClass(), "propListHead", null);
        setIntField(term301, term301.getClass(), "sourcePosition", 0);
        setField(term301, term301.getClass(), "jsType", null);
        setField(term301, term301.getClass(), "parent", null);
        setField(term299, term299.getClass(), "next", term301);
        setIntField(term322, term322.getClass(), "type", 97029295);
        setIntField(term324, term324.getClass(), "type", -1371869594);
        setField(term324, term324.getClass(), "next", term315);
        setField(term324, term324.getClass(), "first", term305);
        setField(term324, term324.getClass(), "last", term299);
        setField(term324, term324.getClass(), "propListHead", null);
        setIntField(term324, term324.getClass(), "sourcePosition", 0);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        setField(term322, term322.getClass(), "next", term324);
        setField(term322, term322.getClass(), "first", term317);
        setField(term322, term322.getClass(), "last", term305);
        setField(term322, term322.getClass(), "propListHead", null);
        setIntField(term322, term322.getClass(), "sourcePosition", 0);
        setField(term322, term322.getClass(), "jsType", null);
        setField(term322, term322.getClass(), "parent", null);
        setField(term299, term299.getClass(), "first", term322);
        setField(term299, term299.getClass(), "last", term322);
        setField(term299, term299.getClass(), "propListHead", null);
        setIntField(term299, term299.getClass(), "sourcePosition", 0);
        setField(term299, term299.getClass(), "jsType", null);
        setField(term299, term299.getClass(), "parent", null);
        setField(term280, term280.getClass(), "rootNode", term299);
        setBooleanField(term280, term280.getClass(), "isBottom", true);
        setField(term330, term330.getClass(), "name", null);
        setField(term330, term330.getClass(), "nameNode", null);
        setField(term330, term330.getClass(), "type", null);
        setBooleanField(term330, term330.getClass(), "typeInferred", false);
        setField(term330, term330.getClass(), "input", null);
        setIntField(term330, term330.getClass(), "index", 0);
        setField(term330, term330.getClass(), "scope", null);
        setBooleanField(term330, term330.getClass(), "markedEscaped", false);
        setBooleanField(term330, term330.getClass(), "markedAssignedExactlyOnce", false);
        setField(term280, term280.getClass(), "arguments", term330);
        setField(term280, term280.getClass(), "typeResolver", null);
        Class<? extends Object> term5409 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeNative");
        Field term5408 = ((Class) term5409).getDeclaredField((String) "RANGE_ERROR_TYPE");
        ((Field) term5408).setAccessible(true);
        enum3 = ((Field) term5408).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Object[] args = new Object[2];
        args[0] = term280;
        args[1] = enum3;
        try {
            callMethod(klass, "declareNativeFunctionType", argTypes, term258, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


