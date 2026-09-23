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

public class TypeCheck_getJSType_1628208716107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10476;
     Object term10505;

    public TypeCheck_getJSType_1628208716107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10476 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term10477 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term10478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term10479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term10482 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term10490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term10476, term10476.getClass(), "compiler", null);
        setField(term10477, term10477.getClass(), "compiler", null);
        setField(term10479, term10479.getClass(), "name", "");
        setField(term10479, term10479.getClass(), "referencedType", null);
        setField(term10479, term10479.getClass(), "referencedObjType", null);
        setBooleanField(term10479, term10479.getClass(), "visited", true);
        setField(term10482, term10482.getClass(), "info", null);
        setField(term10482, term10482.getClass(), "documentation", null);
        setField(term10482, term10482.getClass(), "associatedNode", null);
        setField(term10482, term10482.getClass(), "visibility", null);
        setIntField(term10482, term10482.getClass(), "bitset", -13725716);
        setField(term10482, term10482.getClass(), "type", null);
        setField(term10482, term10482.getClass(), "thisType", null);
        setBooleanField(term10482, term10482.getClass(), "includeDocumentation", true);
        setIntField(term10482, term10482.getClass(), "originalCommentPosition", -1695750603);
        setField(term10479, term10479.getClass(), "docInfo", term10482);
        setBooleanField(term10479, term10479.getClass(), "unknown", false);
        setBooleanField(term10479, term10479.getClass(), "resolved", true);
        setField(term10479, term10479.getClass(), "resolveResult", null);
        setField(term10488, term10488.getClass(), "templateKeys", null);
        setField(term10488, term10488.getClass(), "templateValues", null);
        setField(term10488, term10488.getClass(), "resolvedTemplateValues", null);
        setField(term10488, term10488.getClass(), "registry", null);
        setField(term10479, term10479.getClass(), "templateTypeMap", term10488);
        setBooleanField(term10479, term10479.getClass(), "inTemplatedCheckVisit", false);
        setField(term10479, term10479.getClass(), "registry", null);
        setField(term10478, term10478.getClass(), "objectIndexTemplateKey", term10479);
        setField(term10490, term10490.getClass(), "name", null);
        setField(term10490, term10490.getClass(), "referencedType", null);
        setField(term10490, term10490.getClass(), "referencedObjType", null);
        setBooleanField(term10490, term10490.getClass(), "visited", false);
        setField(term10490, term10490.getClass(), "docInfo", null);
        setBooleanField(term10490, term10490.getClass(), "unknown", false);
        setBooleanField(term10490, term10490.getClass(), "resolved", false);
        setField(term10490, term10490.getClass(), "resolveResult", null);
        setField(term10490, term10490.getClass(), "templateTypeMap", null);
        setBooleanField(term10490, term10490.getClass(), "inTemplatedCheckVisit", false);
        setField(term10490, term10490.getClass(), "registry", null);
        setField(term10478, term10478.getClass(), "objectElementTemplateKey", term10490);
        setField(term10478, term10478.getClass(), "reporter", null);
        setField(term10478, term10478.getClass(), "nativeTypes", null);
        setField(term10478, term10478.getClass(), "namesToTypes", null);
        setField(term10478, term10478.getClass(), "namespaces", null);
        setField(term10478, term10478.getClass(), "nonNullableTypeNames", null);
        setField(term10478, term10478.getClass(), "forwardDeclaredTypes", null);
        setField(term10478, term10478.getClass(), "typesIndexedByProperty", null);
        setField(term10478, term10478.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term10478, term10478.getClass(), "greatestSubtypeByProperty", null);
        setField(term10478, term10478.getClass(), "interfaceToImplementors", null);
        setField(term10478, term10478.getClass(), "unresolvedNamedTypes", null);
        setField(term10478, term10478.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10478, term10478.getClass(), "lastGeneration", false);
        setField(term10478, term10478.getClass(), "templateTypes", null);
        setField(term10478, term10478.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term10478, term10478.getClass(), "tolerateUndefinedValues", false);
        setField(term10478, term10478.getClass(), "resolveMode", null);
        setField(term10477, term10477.getClass(), "typeRegistry", term10478);
        setField(term10477, term10477.getClass(), "allValueTypes", null);
        setBooleanField(term10477, term10477.getClass(), "shouldReport", false);
        setField(term10477, term10477.getClass(), "nullOrUndefined", null);
        setField(term10477, term10477.getClass(), "mismatches", null);
        setField(term10476, term10476.getClass(), "validator", term10477);
        setField(term10476, term10476.getClass(), "reverseInterpreter", null);
        setField(term10476, term10476.getClass(), "typeRegistry", null);
        setField(term10476, term10476.getClass(), "topScope", null);
        setField(term10476, term10476.getClass(), "scopeCreator", null);
        setField(term10476, term10476.getClass(), "reportMissingOverride", null);
        setBooleanField(term10476, term10476.getClass(), "reportUnknownTypes", false);
        setBooleanField(term10476, term10476.getClass(), "reportMissingProperties", false);
        setField(term10476, term10476.getClass(), "inferJSDocInfo", null);
        setIntField(term10476, term10476.getClass(), "typedCount", 0);
        setIntField(term10476, term10476.getClass(), "nullCount", 0);
        setIntField(term10476, term10476.getClass(), "unknownCount", 0);
        setBooleanField(term10476, term10476.getClass(), "inExterns", false);
        setIntField(term10476, term10476.getClass(), "noTypeCheckSection", 0);
        setField(term10476, term10476.getClass(), "editDistance", null);
        term10505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10505, term10505.getClass(), "type", 1478914037);
        setIntField(term10507, term10507.getClass(), "type", 1630231519);
        setIntField(term10509, term10509.getClass(), "type", 1460702778);
        setIntField(term10511, term10511.getClass(), "type", -1398142433);
        setIntField(term10513, term10513.getClass(), "type", -1112119058);
        setField(term10513, term10513.getClass(), "next", null);
        setField(term10513, term10513.getClass(), "first", null);
        setField(term10513, term10513.getClass(), "last", null);
        setField(term10513, term10513.getClass(), "propListHead", null);
        setIntField(term10513, term10513.getClass(), "sourcePosition", 0);
        setField(term10513, term10513.getClass(), "jsType", null);
        setField(term10513, term10513.getClass(), "parent", null);
        setField(term10511, term10511.getClass(), "next", term10513);
        setIntField(term10516, term10516.getClass(), "type", 2073858334);
        setField(term10516, term10516.getClass(), "next", null);
        setField(term10516, term10516.getClass(), "first", null);
        setField(term10516, term10516.getClass(), "last", term10513);
        setField(term10516, term10516.getClass(), "propListHead", null);
        setIntField(term10516, term10516.getClass(), "sourcePosition", 0);
        setField(term10516, term10516.getClass(), "jsType", null);
        setField(term10516, term10516.getClass(), "parent", null);
        setField(term10511, term10511.getClass(), "first", term10516);
        setField(term10511, term10511.getClass(), "last", term10509);
        setField(term10511, term10511.getClass(), "propListHead", null);
        setIntField(term10511, term10511.getClass(), "sourcePosition", 0);
        setField(term10511, term10511.getClass(), "jsType", null);
        setField(term10511, term10511.getClass(), "parent", null);
        setField(term10509, term10509.getClass(), "next", term10511);
        setField(term10509, term10509.getClass(), "first", term10513);
        setIntField(term10520, term10520.getClass(), "type", 1344744036);
        setIntField(term10522, term10522.getClass(), "type", -98060427);
        setField(term10522, term10522.getClass(), "next", null);
        setField(term10522, term10522.getClass(), "first", term10516);
        setField(term10522, term10522.getClass(), "last", term10511);
        setField(term10522, term10522.getClass(), "propListHead", null);
        setIntField(term10522, term10522.getClass(), "sourcePosition", 0);
        setField(term10522, term10522.getClass(), "jsType", null);
        setField(term10522, term10522.getClass(), "parent", null);
        setField(term10520, term10520.getClass(), "next", term10522);
        setField(term10520, term10520.getClass(), "first", term10507);
        setField(term10520, term10520.getClass(), "last", term10507);
        setField(term10520, term10520.getClass(), "propListHead", null);
        setIntField(term10520, term10520.getClass(), "sourcePosition", 0);
        setField(term10520, term10520.getClass(), "jsType", null);
        setField(term10520, term10520.getClass(), "parent", null);
        setField(term10509, term10509.getClass(), "last", term10520);
        setField(term10509, term10509.getClass(), "propListHead", null);
        setIntField(term10509, term10509.getClass(), "sourcePosition", 0);
        setField(term10509, term10509.getClass(), "jsType", null);
        setField(term10509, term10509.getClass(), "parent", null);
        setField(term10507, term10507.getClass(), "next", term10509);
        setIntField(term10527, term10527.getClass(), "type", -1272268399);
        setField(term10527, term10527.getClass(), "next", term10520);
        setField(term10527, term10527.getClass(), "first", term10522);
        setField(term10527, term10527.getClass(), "last", term10505);
        setField(term10527, term10527.getClass(), "propListHead", null);
        setIntField(term10527, term10527.getClass(), "sourcePosition", 0);
        setField(term10527, term10527.getClass(), "jsType", null);
        setField(term10527, term10527.getClass(), "parent", null);
        setField(term10507, term10507.getClass(), "first", term10527);
        setField(term10507, term10507.getClass(), "last", term10527);
        setField(term10507, term10507.getClass(), "propListHead", null);
        setIntField(term10507, term10507.getClass(), "sourcePosition", 0);
        setField(term10507, term10507.getClass(), "jsType", null);
        setField(term10507, term10507.getClass(), "parent", null);
        setField(term10505, term10505.getClass(), "next", term10507);
        setField(term10505, term10505.getClass(), "first", term10511);
        setField(term10505, term10505.getClass(), "last", term10513);
        setField(term10505, term10505.getClass(), "propListHead", null);
        setIntField(term10505, term10505.getClass(), "sourcePosition", 0);
        setField(term10505, term10505.getClass(), "jsType", null);
        setField(term10505, term10505.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10505;
        try {
            callMethod(klass, "getJSType", argTypes, term10476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


