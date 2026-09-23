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
import java.lang.Boolean;

public class TypeValidator_getReadableJSTypeName_85059943682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16088;
     Object term16131;
     Object term16158;

    public TypeValidator_getReadableJSTypeName_85059943682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33075 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term33074 = ((Class) term33075).getDeclaredField((String) "PROTECTED");
        ((Field) term33074).setAccessible(true);
        Object enum69 = ((Field) term33074).get((Object) null);
        term16088 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term16089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term16090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16104 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16105 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16108 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16115 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16116 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term16123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term16088, term16088.getClass(), "compiler", null);
        setField(term16090, term16090.getClass(), "name", "sbdLhVCRsw");
        setField(term16090, term16090.getClass(), "referencedType", null);
        setField(term16090, term16090.getClass(), "referencedObjType", null);
        setBooleanField(term16090, term16090.getClass(), "visited", true);
        setField(term16105, term16105.getClass(), "baseType", null);
        setField(term16105, term16105.getClass(), "extendedInterfaces", null);
        setField(term16105, term16105.getClass(), "implementedInterfaces", null);
        setField(term16105, term16105.getClass(), "parameters", null);
        setField(term16105, term16105.getClass(), "thrownTypes", null);
        setField(term16105, term16105.getClass(), "templateTypeNames", null);
        setField(term16105, term16105.getClass(), "disposedParameters", null);
        setField(term16105, term16105.getClass(), "description", null);
        setField(term16105, term16105.getClass(), "meaning", null);
        setField(term16105, term16105.getClass(), "deprecated", null);
        setField(term16105, term16105.getClass(), "license", null);
        setField(term16105, term16105.getClass(), "suppressions", null);
        setField(term16105, term16105.getClass(), "modifies", null);
        setField(term16105, term16105.getClass(), "lendsName", null);
        setBooleanField(term16105, term16105.getClass(), "ngInject", true);
        setBooleanField(term16105, term16105.getClass(), "wizaction", false);
        setField(term16104, term16104.getClass(), "info", term16105);
        setField(term16108, term16108.getClass(), "sourceComment", null);
        setField(term16108, term16108.getClass(), "markers", null);
        setField(term16108, term16108.getClass(), "parameters", null);
        setField(term16108, term16108.getClass(), "throwsDescriptions", null);
        setField(term16108, term16108.getClass(), "blockDescription", null);
        setField(term16108, term16108.getClass(), "fileOverview", null);
        setField(term16108, term16108.getClass(), "returnDescription", null);
        setField(term16108, term16108.getClass(), "version", null);
        setField(term16108, term16108.getClass(), "authors", null);
        setField(term16108, term16108.getClass(), "sees", null);
        setField(term16104, term16104.getClass(), "documentation", term16108);
        setIntField(term16109, term16109.getClass(), "type", 0);
        setField(term16109, term16109.getClass(), "next", null);
        setField(term16109, term16109.getClass(), "first", null);
        setField(term16109, term16109.getClass(), "last", null);
        setField(term16109, term16109.getClass(), "propListHead", null);
        setIntField(term16109, term16109.getClass(), "sourcePosition", 0);
        setField(term16109, term16109.getClass(), "jsType", null);
        setField(term16109, term16109.getClass(), "parent", null);
        setField(term16104, term16104.getClass(), "associatedNode", term16109);
        setField(term16104, term16104.getClass(), "visibility", enum69);
        setIntField(term16104, term16104.getClass(), "bitset", 794352120);
        setField(term16115, term16115.getClass(), "root", null);
        setField(term16115, term16115.getClass(), "sourceName", null);
        setField(term16104, term16104.getClass(), "type", term16115);
        setField(term16116, term16116.getClass(), "root", null);
        setField(term16116, term16116.getClass(), "sourceName", null);
        setField(term16104, term16104.getClass(), "thisType", term16116);
        setBooleanField(term16104, term16104.getClass(), "includeDocumentation", false);
        setIntField(term16104, term16104.getClass(), "originalCommentPosition", 340719678);
        setField(term16090, term16090.getClass(), "docInfo", term16104);
        setBooleanField(term16090, term16090.getClass(), "unknown", true);
        setBooleanField(term16090, term16090.getClass(), "resolved", false);
        setField(term16090, term16090.getClass(), "resolveResult", null);
        setField(term16121, term16121.getClass(), "templateKeys", null);
        setField(term16121, term16121.getClass(), "templateValues", null);
        setField(term16121, term16121.getClass(), "resolvedTemplateValues", null);
        setField(term16121, term16121.getClass(), "registry", null);
        setField(term16090, term16090.getClass(), "templateTypeMap", term16121);
        setBooleanField(term16090, term16090.getClass(), "inTemplatedCheckVisit", false);
        setField(term16090, term16090.getClass(), "registry", null);
        setField(term16089, term16089.getClass(), "objectIndexTemplateKey", term16090);
        setField(term16123, term16123.getClass(), "name", null);
        setField(term16123, term16123.getClass(), "referencedType", null);
        setField(term16123, term16123.getClass(), "referencedObjType", null);
        setBooleanField(term16123, term16123.getClass(), "visited", false);
        setField(term16123, term16123.getClass(), "docInfo", null);
        setBooleanField(term16123, term16123.getClass(), "unknown", false);
        setBooleanField(term16123, term16123.getClass(), "resolved", false);
        setField(term16123, term16123.getClass(), "resolveResult", null);
        setField(term16123, term16123.getClass(), "templateTypeMap", null);
        setBooleanField(term16123, term16123.getClass(), "inTemplatedCheckVisit", false);
        setField(term16123, term16123.getClass(), "registry", null);
        setField(term16089, term16089.getClass(), "objectElementTemplateKey", term16123);
        setField(term16089, term16089.getClass(), "reporter", null);
        setField(term16089, term16089.getClass(), "nativeTypes", null);
        setField(term16089, term16089.getClass(), "namesToTypes", null);
        setField(term16089, term16089.getClass(), "namespaces", null);
        setField(term16089, term16089.getClass(), "nonNullableTypeNames", null);
        setField(term16089, term16089.getClass(), "forwardDeclaredTypes", null);
        setField(term16089, term16089.getClass(), "typesIndexedByProperty", null);
        setField(term16089, term16089.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term16089, term16089.getClass(), "greatestSubtypeByProperty", null);
        setField(term16089, term16089.getClass(), "interfaceToImplementors", null);
        setField(term16089, term16089.getClass(), "unresolvedNamedTypes", null);
        setField(term16089, term16089.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16089, term16089.getClass(), "lastGeneration", false);
        setField(term16089, term16089.getClass(), "templateTypes", null);
        setField(term16089, term16089.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term16089, term16089.getClass(), "tolerateUndefinedValues", false);
        setField(term16088, term16088.getClass(), "typeRegistry", term16089);
        setField(term16088, term16088.getClass(), "allValueTypes", null);
        setBooleanField(term16088, term16088.getClass(), "shouldReport", false);
        setField(term16088, term16088.getClass(), "nullOrUndefined", null);
        setField(term16088, term16088.getClass(), "mismatches", null);
        term16131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16131, term16131.getClass(), "type", 1862191391);
        setIntField(term16133, term16133.getClass(), "type", 1131398807);
        setIntField(term16135, term16135.getClass(), "type", -344907703);
        setIntField(term16137, term16137.getClass(), "type", 824341437);
        setIntField(term16139, term16139.getClass(), "type", -1794965320);
        setField(term16139, term16139.getClass(), "next", null);
        setField(term16139, term16139.getClass(), "first", null);
        setField(term16139, term16139.getClass(), "last", null);
        setField(term16139, term16139.getClass(), "propListHead", null);
        setIntField(term16139, term16139.getClass(), "sourcePosition", 0);
        setField(term16139, term16139.getClass(), "jsType", null);
        setField(term16139, term16139.getClass(), "parent", null);
        setField(term16137, term16137.getClass(), "next", term16139);
        setIntField(term16142, term16142.getClass(), "type", 520504102);
        setField(term16142, term16142.getClass(), "next", null);
        setField(term16142, term16142.getClass(), "first", null);
        setField(term16142, term16142.getClass(), "last", term16139);
        setField(term16142, term16142.getClass(), "propListHead", null);
        setIntField(term16142, term16142.getClass(), "sourcePosition", 0);
        setField(term16142, term16142.getClass(), "jsType", null);
        setField(term16142, term16142.getClass(), "parent", null);
        setField(term16137, term16137.getClass(), "first", term16142);
        setField(term16137, term16137.getClass(), "last", term16135);
        setField(term16137, term16137.getClass(), "propListHead", null);
        setIntField(term16137, term16137.getClass(), "sourcePosition", 0);
        setField(term16137, term16137.getClass(), "jsType", null);
        setField(term16137, term16137.getClass(), "parent", null);
        setField(term16135, term16135.getClass(), "next", term16137);
        setField(term16135, term16135.getClass(), "first", term16139);
        setIntField(term16146, term16146.getClass(), "type", -1793950607);
        setIntField(term16148, term16148.getClass(), "type", 1091954101);
        setField(term16148, term16148.getClass(), "next", null);
        setField(term16148, term16148.getClass(), "first", term16142);
        setField(term16148, term16148.getClass(), "last", term16137);
        setField(term16148, term16148.getClass(), "propListHead", null);
        setIntField(term16148, term16148.getClass(), "sourcePosition", 0);
        setField(term16148, term16148.getClass(), "jsType", null);
        setField(term16148, term16148.getClass(), "parent", null);
        setField(term16146, term16146.getClass(), "next", term16148);
        setField(term16146, term16146.getClass(), "first", term16133);
        setField(term16146, term16146.getClass(), "last", term16133);
        setField(term16146, term16146.getClass(), "propListHead", null);
        setIntField(term16146, term16146.getClass(), "sourcePosition", 0);
        setField(term16146, term16146.getClass(), "jsType", null);
        setField(term16146, term16146.getClass(), "parent", null);
        setField(term16135, term16135.getClass(), "last", term16146);
        setField(term16135, term16135.getClass(), "propListHead", null);
        setIntField(term16135, term16135.getClass(), "sourcePosition", 0);
        setField(term16135, term16135.getClass(), "jsType", null);
        setField(term16135, term16135.getClass(), "parent", null);
        setField(term16133, term16133.getClass(), "next", term16135);
        setIntField(term16153, term16153.getClass(), "type", 1895143076);
        setField(term16153, term16153.getClass(), "next", term16146);
        setField(term16153, term16153.getClass(), "first", term16148);
        setField(term16153, term16153.getClass(), "last", term16131);
        setField(term16153, term16153.getClass(), "propListHead", null);
        setIntField(term16153, term16153.getClass(), "sourcePosition", 0);
        setField(term16153, term16153.getClass(), "jsType", null);
        setField(term16153, term16153.getClass(), "parent", null);
        setField(term16133, term16133.getClass(), "first", term16153);
        setField(term16133, term16133.getClass(), "last", term16153);
        setField(term16133, term16133.getClass(), "propListHead", null);
        setIntField(term16133, term16133.getClass(), "sourcePosition", 0);
        setField(term16133, term16133.getClass(), "jsType", null);
        setField(term16133, term16133.getClass(), "parent", null);
        setField(term16131, term16131.getClass(), "next", term16133);
        setField(term16131, term16131.getClass(), "first", term16137);
        setField(term16131, term16131.getClass(), "last", term16139);
        setField(term16131, term16131.getClass(), "propListHead", null);
        setIntField(term16131, term16131.getClass(), "sourcePosition", 0);
        setField(term16131, term16131.getClass(), "jsType", null);
        setField(term16131, term16131.getClass(), "parent", null);
        term16158 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term16131;
        args[1] = term16158;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term16088, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


