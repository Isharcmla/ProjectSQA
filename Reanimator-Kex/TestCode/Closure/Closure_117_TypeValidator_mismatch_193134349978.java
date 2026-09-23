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

public class TypeValidator_mismatch_193134349978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13250;
     Object term13305;

    public TypeValidator_mismatch_193134349978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28274 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term28273 = ((Class) term28274).getDeclaredField((String) "INHERITED");
        ((Field) term28273).setAccessible(true);
        Object enum54 = ((Field) term28273).get((Object) null);
        term13250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term13251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term13252 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term13266 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term13267 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term13270 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term13271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13277 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13278 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term13285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term13250, term13250.getClass(), "compiler", null);
        setField(term13252, term13252.getClass(), "name", "IyjDiknqhA");
        setField(term13252, term13252.getClass(), "referencedType", null);
        setField(term13252, term13252.getClass(), "referencedObjType", null);
        setBooleanField(term13252, term13252.getClass(), "visited", true);
        setField(term13267, term13267.getClass(), "baseType", null);
        setField(term13267, term13267.getClass(), "extendedInterfaces", null);
        setField(term13267, term13267.getClass(), "implementedInterfaces", null);
        setField(term13267, term13267.getClass(), "parameters", null);
        setField(term13267, term13267.getClass(), "thrownTypes", null);
        setField(term13267, term13267.getClass(), "templateTypeNames", null);
        setField(term13267, term13267.getClass(), "disposedParameters", null);
        setField(term13267, term13267.getClass(), "description", null);
        setField(term13267, term13267.getClass(), "meaning", null);
        setField(term13267, term13267.getClass(), "deprecated", null);
        setField(term13267, term13267.getClass(), "license", null);
        setField(term13267, term13267.getClass(), "suppressions", null);
        setField(term13267, term13267.getClass(), "modifies", null);
        setField(term13267, term13267.getClass(), "lendsName", null);
        setBooleanField(term13267, term13267.getClass(), "ngInject", false);
        setBooleanField(term13267, term13267.getClass(), "wizaction", false);
        setField(term13266, term13266.getClass(), "info", term13267);
        setField(term13270, term13270.getClass(), "sourceComment", null);
        setField(term13270, term13270.getClass(), "markers", null);
        setField(term13270, term13270.getClass(), "parameters", null);
        setField(term13270, term13270.getClass(), "throwsDescriptions", null);
        setField(term13270, term13270.getClass(), "blockDescription", null);
        setField(term13270, term13270.getClass(), "fileOverview", null);
        setField(term13270, term13270.getClass(), "returnDescription", null);
        setField(term13270, term13270.getClass(), "version", null);
        setField(term13270, term13270.getClass(), "authors", null);
        setField(term13270, term13270.getClass(), "sees", null);
        setField(term13266, term13266.getClass(), "documentation", term13270);
        setIntField(term13271, term13271.getClass(), "type", 0);
        setField(term13271, term13271.getClass(), "next", null);
        setField(term13271, term13271.getClass(), "first", null);
        setField(term13271, term13271.getClass(), "last", null);
        setField(term13271, term13271.getClass(), "propListHead", null);
        setIntField(term13271, term13271.getClass(), "sourcePosition", 0);
        setField(term13271, term13271.getClass(), "jsType", null);
        setField(term13271, term13271.getClass(), "parent", null);
        setField(term13266, term13266.getClass(), "associatedNode", term13271);
        setField(term13266, term13266.getClass(), "visibility", enum54);
        setIntField(term13266, term13266.getClass(), "bitset", -1494356104);
        setField(term13277, term13277.getClass(), "root", term13271);
        setField(term13277, term13277.getClass(), "sourceName", null);
        setField(term13266, term13266.getClass(), "type", term13277);
        setField(term13278, term13278.getClass(), "root", term13271);
        setField(term13278, term13278.getClass(), "sourceName", null);
        setField(term13266, term13266.getClass(), "thisType", term13278);
        setBooleanField(term13266, term13266.getClass(), "includeDocumentation", true);
        setIntField(term13266, term13266.getClass(), "originalCommentPosition", -695279311);
        setField(term13252, term13252.getClass(), "docInfo", term13266);
        setBooleanField(term13252, term13252.getClass(), "unknown", true);
        setBooleanField(term13252, term13252.getClass(), "resolved", true);
        setField(term13252, term13252.getClass(), "resolveResult", null);
        setField(term13283, term13283.getClass(), "templateKeys", null);
        setField(term13283, term13283.getClass(), "templateValues", null);
        setField(term13283, term13283.getClass(), "resolvedTemplateValues", null);
        setField(term13283, term13283.getClass(), "registry", null);
        setField(term13252, term13252.getClass(), "templateTypeMap", term13283);
        setBooleanField(term13252, term13252.getClass(), "inTemplatedCheckVisit", true);
        setField(term13252, term13252.getClass(), "registry", null);
        setField(term13251, term13251.getClass(), "objectIndexTemplateKey", term13252);
        setField(term13285, term13285.getClass(), "name", null);
        setField(term13285, term13285.getClass(), "referencedType", null);
        setField(term13285, term13285.getClass(), "referencedObjType", null);
        setBooleanField(term13285, term13285.getClass(), "visited", false);
        setField(term13285, term13285.getClass(), "docInfo", null);
        setBooleanField(term13285, term13285.getClass(), "unknown", false);
        setBooleanField(term13285, term13285.getClass(), "resolved", false);
        setField(term13285, term13285.getClass(), "resolveResult", null);
        setField(term13285, term13285.getClass(), "templateTypeMap", null);
        setBooleanField(term13285, term13285.getClass(), "inTemplatedCheckVisit", false);
        setField(term13285, term13285.getClass(), "registry", null);
        setField(term13251, term13251.getClass(), "objectElementTemplateKey", term13285);
        setField(term13251, term13251.getClass(), "reporter", null);
        setField(term13251, term13251.getClass(), "nativeTypes", null);
        setField(term13251, term13251.getClass(), "namesToTypes", null);
        setField(term13251, term13251.getClass(), "namespaces", null);
        setField(term13251, term13251.getClass(), "nonNullableTypeNames", null);
        setField(term13251, term13251.getClass(), "forwardDeclaredTypes", null);
        setField(term13251, term13251.getClass(), "typesIndexedByProperty", null);
        setField(term13251, term13251.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term13251, term13251.getClass(), "greatestSubtypeByProperty", null);
        setField(term13251, term13251.getClass(), "interfaceToImplementors", null);
        setField(term13251, term13251.getClass(), "unresolvedNamedTypes", null);
        setField(term13251, term13251.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13251, term13251.getClass(), "lastGeneration", false);
        setField(term13251, term13251.getClass(), "templateTypes", null);
        setField(term13251, term13251.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term13251, term13251.getClass(), "tolerateUndefinedValues", false);
        setField(term13250, term13250.getClass(), "typeRegistry", term13251);
        setField(term13250, term13250.getClass(), "allValueTypes", null);
        setBooleanField(term13250, term13250.getClass(), "shouldReport", false);
        setField(term13250, term13250.getClass(), "nullOrUndefined", null);
        setField(term13250, term13250.getClass(), "mismatches", null);
        term13305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13305, term13305.getClass(), "type", 990883365);
        setIntField(term13307, term13307.getClass(), "type", 633598642);
        setIntField(term13309, term13309.getClass(), "type", 1862841859);
        setIntField(term13311, term13311.getClass(), "type", -1114668574);
        setIntField(term13313, term13313.getClass(), "type", 514511037);
        setField(term13313, term13313.getClass(), "next", null);
        setField(term13313, term13313.getClass(), "first", null);
        setField(term13313, term13313.getClass(), "last", null);
        setField(term13313, term13313.getClass(), "propListHead", null);
        setIntField(term13313, term13313.getClass(), "sourcePosition", 0);
        setField(term13313, term13313.getClass(), "jsType", null);
        setField(term13313, term13313.getClass(), "parent", null);
        setField(term13311, term13311.getClass(), "next", term13313);
        setIntField(term13316, term13316.getClass(), "type", 1713573821);
        setField(term13316, term13316.getClass(), "next", null);
        setField(term13316, term13316.getClass(), "first", null);
        setField(term13316, term13316.getClass(), "last", term13313);
        setField(term13316, term13316.getClass(), "propListHead", null);
        setIntField(term13316, term13316.getClass(), "sourcePosition", 0);
        setField(term13316, term13316.getClass(), "jsType", null);
        setField(term13316, term13316.getClass(), "parent", null);
        setField(term13311, term13311.getClass(), "first", term13316);
        setField(term13311, term13311.getClass(), "last", term13309);
        setField(term13311, term13311.getClass(), "propListHead", null);
        setIntField(term13311, term13311.getClass(), "sourcePosition", 0);
        setField(term13311, term13311.getClass(), "jsType", null);
        setField(term13311, term13311.getClass(), "parent", null);
        setField(term13309, term13309.getClass(), "next", term13311);
        setField(term13309, term13309.getClass(), "first", term13313);
        setIntField(term13320, term13320.getClass(), "type", 1467356494);
        setIntField(term13322, term13322.getClass(), "type", -26316536);
        setField(term13322, term13322.getClass(), "next", null);
        setField(term13322, term13322.getClass(), "first", term13316);
        setField(term13322, term13322.getClass(), "last", term13311);
        setField(term13322, term13322.getClass(), "propListHead", null);
        setIntField(term13322, term13322.getClass(), "sourcePosition", 0);
        setField(term13322, term13322.getClass(), "jsType", null);
        setField(term13322, term13322.getClass(), "parent", null);
        setField(term13320, term13320.getClass(), "next", term13322);
        setField(term13320, term13320.getClass(), "first", term13307);
        setField(term13320, term13320.getClass(), "last", term13307);
        setField(term13320, term13320.getClass(), "propListHead", null);
        setIntField(term13320, term13320.getClass(), "sourcePosition", 0);
        setField(term13320, term13320.getClass(), "jsType", null);
        setField(term13320, term13320.getClass(), "parent", null);
        setField(term13309, term13309.getClass(), "last", term13320);
        setField(term13309, term13309.getClass(), "propListHead", null);
        setIntField(term13309, term13309.getClass(), "sourcePosition", 0);
        setField(term13309, term13309.getClass(), "jsType", null);
        setField(term13309, term13309.getClass(), "parent", null);
        setField(term13307, term13307.getClass(), "next", term13309);
        setIntField(term13327, term13327.getClass(), "type", 1716165145);
        setField(term13327, term13327.getClass(), "next", term13320);
        setField(term13327, term13327.getClass(), "first", term13322);
        setField(term13327, term13327.getClass(), "last", term13305);
        setField(term13327, term13327.getClass(), "propListHead", null);
        setIntField(term13327, term13327.getClass(), "sourcePosition", 0);
        setField(term13327, term13327.getClass(), "jsType", null);
        setField(term13327, term13327.getClass(), "parent", null);
        setField(term13307, term13307.getClass(), "first", term13327);
        setField(term13307, term13307.getClass(), "last", term13327);
        setField(term13307, term13307.getClass(), "propListHead", null);
        setIntField(term13307, term13307.getClass(), "sourcePosition", 0);
        setField(term13307, term13307.getClass(), "jsType", null);
        setField(term13307, term13307.getClass(), "parent", null);
        setField(term13305, term13305.getClass(), "next", term13307);
        setField(term13305, term13305.getClass(), "first", term13311);
        setField(term13305, term13305.getClass(), "last", term13313);
        setField(term13305, term13305.getClass(), "propListHead", null);
        setIntField(term13305, term13305.getClass(), "sourcePosition", 0);
        setField(term13305, term13305.getClass(), "jsType", null);
        setField(term13305, term13305.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = "eRYlSLwtvV";
        args[1] = term13305;
        args[2] = "duOyJsARTD";
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "mismatch", argTypes, term13250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


