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

public class TypeValidator_getJSType_36397408283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16438;
     Object term16481;

    public TypeValidator_getJSType_36397408283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33646 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term33645 = ((Class) term33646).getDeclaredField((String) "PUBLIC");
        ((Field) term33645).setAccessible(true);
        Object enum70 = ((Field) term33645).get((Object) null);
        term16438 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term16439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term16440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16454 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16455 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16458 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16465 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16466 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16471 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term16473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term16438, term16438.getClass(), "compiler", null);
        setField(term16440, term16440.getClass(), "name", "YJhnPtWtJR");
        setField(term16440, term16440.getClass(), "referencedType", null);
        setField(term16440, term16440.getClass(), "referencedObjType", null);
        setBooleanField(term16440, term16440.getClass(), "visited", true);
        setField(term16455, term16455.getClass(), "baseType", null);
        setField(term16455, term16455.getClass(), "extendedInterfaces", null);
        setField(term16455, term16455.getClass(), "implementedInterfaces", null);
        setField(term16455, term16455.getClass(), "parameters", null);
        setField(term16455, term16455.getClass(), "thrownTypes", null);
        setField(term16455, term16455.getClass(), "templateTypeNames", null);
        setField(term16455, term16455.getClass(), "disposedParameters", null);
        setField(term16455, term16455.getClass(), "description", null);
        setField(term16455, term16455.getClass(), "meaning", null);
        setField(term16455, term16455.getClass(), "deprecated", null);
        setField(term16455, term16455.getClass(), "license", null);
        setField(term16455, term16455.getClass(), "suppressions", null);
        setField(term16455, term16455.getClass(), "modifies", null);
        setField(term16455, term16455.getClass(), "lendsName", null);
        setBooleanField(term16455, term16455.getClass(), "ngInject", false);
        setBooleanField(term16455, term16455.getClass(), "wizaction", false);
        setField(term16454, term16454.getClass(), "info", term16455);
        setField(term16458, term16458.getClass(), "sourceComment", null);
        setField(term16458, term16458.getClass(), "markers", null);
        setField(term16458, term16458.getClass(), "parameters", null);
        setField(term16458, term16458.getClass(), "throwsDescriptions", null);
        setField(term16458, term16458.getClass(), "blockDescription", null);
        setField(term16458, term16458.getClass(), "fileOverview", null);
        setField(term16458, term16458.getClass(), "returnDescription", null);
        setField(term16458, term16458.getClass(), "version", null);
        setField(term16458, term16458.getClass(), "authors", null);
        setField(term16458, term16458.getClass(), "sees", null);
        setField(term16454, term16454.getClass(), "documentation", term16458);
        setIntField(term16459, term16459.getClass(), "type", 0);
        setField(term16459, term16459.getClass(), "next", null);
        setField(term16459, term16459.getClass(), "first", null);
        setField(term16459, term16459.getClass(), "last", null);
        setField(term16459, term16459.getClass(), "propListHead", null);
        setIntField(term16459, term16459.getClass(), "sourcePosition", 0);
        setField(term16459, term16459.getClass(), "jsType", null);
        setField(term16459, term16459.getClass(), "parent", null);
        setField(term16454, term16454.getClass(), "associatedNode", term16459);
        setField(term16454, term16454.getClass(), "visibility", enum70);
        setIntField(term16454, term16454.getClass(), "bitset", 732174235);
        setField(term16465, term16465.getClass(), "root", null);
        setField(term16465, term16465.getClass(), "sourceName", null);
        setField(term16454, term16454.getClass(), "type", term16465);
        setField(term16466, term16466.getClass(), "root", null);
        setField(term16466, term16466.getClass(), "sourceName", null);
        setField(term16454, term16454.getClass(), "thisType", term16466);
        setBooleanField(term16454, term16454.getClass(), "includeDocumentation", false);
        setIntField(term16454, term16454.getClass(), "originalCommentPosition", 470895808);
        setField(term16440, term16440.getClass(), "docInfo", term16454);
        setBooleanField(term16440, term16440.getClass(), "unknown", false);
        setBooleanField(term16440, term16440.getClass(), "resolved", true);
        setField(term16440, term16440.getClass(), "resolveResult", null);
        setField(term16471, term16471.getClass(), "templateKeys", null);
        setField(term16471, term16471.getClass(), "templateValues", null);
        setField(term16471, term16471.getClass(), "resolvedTemplateValues", null);
        setField(term16471, term16471.getClass(), "registry", null);
        setField(term16440, term16440.getClass(), "templateTypeMap", term16471);
        setBooleanField(term16440, term16440.getClass(), "inTemplatedCheckVisit", true);
        setField(term16440, term16440.getClass(), "registry", null);
        setField(term16439, term16439.getClass(), "objectIndexTemplateKey", term16440);
        setField(term16473, term16473.getClass(), "name", null);
        setField(term16473, term16473.getClass(), "referencedType", null);
        setField(term16473, term16473.getClass(), "referencedObjType", null);
        setBooleanField(term16473, term16473.getClass(), "visited", false);
        setField(term16473, term16473.getClass(), "docInfo", null);
        setBooleanField(term16473, term16473.getClass(), "unknown", false);
        setBooleanField(term16473, term16473.getClass(), "resolved", false);
        setField(term16473, term16473.getClass(), "resolveResult", null);
        setField(term16473, term16473.getClass(), "templateTypeMap", null);
        setBooleanField(term16473, term16473.getClass(), "inTemplatedCheckVisit", false);
        setField(term16473, term16473.getClass(), "registry", null);
        setField(term16439, term16439.getClass(), "objectElementTemplateKey", term16473);
        setField(term16439, term16439.getClass(), "reporter", null);
        setField(term16439, term16439.getClass(), "nativeTypes", null);
        setField(term16439, term16439.getClass(), "namesToTypes", null);
        setField(term16439, term16439.getClass(), "namespaces", null);
        setField(term16439, term16439.getClass(), "nonNullableTypeNames", null);
        setField(term16439, term16439.getClass(), "forwardDeclaredTypes", null);
        setField(term16439, term16439.getClass(), "typesIndexedByProperty", null);
        setField(term16439, term16439.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term16439, term16439.getClass(), "greatestSubtypeByProperty", null);
        setField(term16439, term16439.getClass(), "interfaceToImplementors", null);
        setField(term16439, term16439.getClass(), "unresolvedNamedTypes", null);
        setField(term16439, term16439.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16439, term16439.getClass(), "lastGeneration", false);
        setField(term16439, term16439.getClass(), "templateTypes", null);
        setField(term16439, term16439.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term16439, term16439.getClass(), "tolerateUndefinedValues", false);
        setField(term16438, term16438.getClass(), "typeRegistry", term16439);
        setField(term16438, term16438.getClass(), "allValueTypes", null);
        setBooleanField(term16438, term16438.getClass(), "shouldReport", false);
        setField(term16438, term16438.getClass(), "nullOrUndefined", null);
        setField(term16438, term16438.getClass(), "mismatches", null);
        term16481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16481, term16481.getClass(), "type", 1470349147);
        setIntField(term16483, term16483.getClass(), "type", -255317272);
        setIntField(term16485, term16485.getClass(), "type", -706253892);
        setIntField(term16487, term16487.getClass(), "type", -1341439819);
        setIntField(term16489, term16489.getClass(), "type", -728760750);
        setField(term16489, term16489.getClass(), "next", null);
        setField(term16489, term16489.getClass(), "first", null);
        setField(term16489, term16489.getClass(), "last", null);
        setField(term16489, term16489.getClass(), "propListHead", null);
        setIntField(term16489, term16489.getClass(), "sourcePosition", 0);
        setField(term16489, term16489.getClass(), "jsType", null);
        setField(term16489, term16489.getClass(), "parent", null);
        setField(term16487, term16487.getClass(), "next", term16489);
        setIntField(term16492, term16492.getClass(), "type", -1617383807);
        setField(term16492, term16492.getClass(), "next", null);
        setField(term16492, term16492.getClass(), "first", null);
        setField(term16492, term16492.getClass(), "last", term16489);
        setField(term16492, term16492.getClass(), "propListHead", null);
        setIntField(term16492, term16492.getClass(), "sourcePosition", 0);
        setField(term16492, term16492.getClass(), "jsType", null);
        setField(term16492, term16492.getClass(), "parent", null);
        setField(term16487, term16487.getClass(), "first", term16492);
        setField(term16487, term16487.getClass(), "last", term16485);
        setField(term16487, term16487.getClass(), "propListHead", null);
        setIntField(term16487, term16487.getClass(), "sourcePosition", 0);
        setField(term16487, term16487.getClass(), "jsType", null);
        setField(term16487, term16487.getClass(), "parent", null);
        setField(term16485, term16485.getClass(), "next", term16487);
        setField(term16485, term16485.getClass(), "first", term16489);
        setIntField(term16496, term16496.getClass(), "type", -885788574);
        setIntField(term16498, term16498.getClass(), "type", -865722613);
        setField(term16498, term16498.getClass(), "next", null);
        setField(term16498, term16498.getClass(), "first", term16492);
        setField(term16498, term16498.getClass(), "last", term16487);
        setField(term16498, term16498.getClass(), "propListHead", null);
        setIntField(term16498, term16498.getClass(), "sourcePosition", 0);
        setField(term16498, term16498.getClass(), "jsType", null);
        setField(term16498, term16498.getClass(), "parent", null);
        setField(term16496, term16496.getClass(), "next", term16498);
        setField(term16496, term16496.getClass(), "first", term16483);
        setField(term16496, term16496.getClass(), "last", term16483);
        setField(term16496, term16496.getClass(), "propListHead", null);
        setIntField(term16496, term16496.getClass(), "sourcePosition", 0);
        setField(term16496, term16496.getClass(), "jsType", null);
        setField(term16496, term16496.getClass(), "parent", null);
        setField(term16485, term16485.getClass(), "last", term16496);
        setField(term16485, term16485.getClass(), "propListHead", null);
        setIntField(term16485, term16485.getClass(), "sourcePosition", 0);
        setField(term16485, term16485.getClass(), "jsType", null);
        setField(term16485, term16485.getClass(), "parent", null);
        setField(term16483, term16483.getClass(), "next", term16485);
        setIntField(term16503, term16503.getClass(), "type", -1551355284);
        setField(term16503, term16503.getClass(), "next", term16496);
        setField(term16503, term16503.getClass(), "first", term16498);
        setField(term16503, term16503.getClass(), "last", term16481);
        setField(term16503, term16503.getClass(), "propListHead", null);
        setIntField(term16503, term16503.getClass(), "sourcePosition", 0);
        setField(term16503, term16503.getClass(), "jsType", null);
        setField(term16503, term16503.getClass(), "parent", null);
        setField(term16483, term16483.getClass(), "first", term16503);
        setField(term16483, term16483.getClass(), "last", term16503);
        setField(term16483, term16483.getClass(), "propListHead", null);
        setIntField(term16483, term16483.getClass(), "sourcePosition", 0);
        setField(term16483, term16483.getClass(), "jsType", null);
        setField(term16483, term16483.getClass(), "parent", null);
        setField(term16481, term16481.getClass(), "next", term16483);
        setField(term16481, term16481.getClass(), "first", term16487);
        setField(term16481, term16481.getClass(), "last", term16489);
        setField(term16481, term16481.getClass(), "propListHead", null);
        setIntField(term16481, term16481.getClass(), "sourcePosition", 0);
        setField(term16481, term16481.getClass(), "jsType", null);
        setField(term16481, term16481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16481;
        try {
            callMethod(klass, "getJSType", argTypes, term16438, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


