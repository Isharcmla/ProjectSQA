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
import java.lang.Boolean;

public class TypeCheck_check_23306294376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1887;
     Object term1916;
     Object term1943;

    public TypeCheck_check_23306294376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1887 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term1888 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term1890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1893 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term1887, term1887.getClass(), "compiler", null);
        setField(term1888, term1888.getClass(), "compiler", null);
        setField(term1890, term1890.getClass(), "name", "");
        setField(term1890, term1890.getClass(), "referencedType", null);
        setField(term1890, term1890.getClass(), "referencedObjType", null);
        setBooleanField(term1890, term1890.getClass(), "visited", true);
        setField(term1893, term1893.getClass(), "info", null);
        setField(term1893, term1893.getClass(), "documentation", null);
        setField(term1893, term1893.getClass(), "associatedNode", null);
        setField(term1893, term1893.getClass(), "visibility", null);
        setIntField(term1893, term1893.getClass(), "bitset", 1090617576);
        setField(term1893, term1893.getClass(), "type", null);
        setField(term1893, term1893.getClass(), "thisType", null);
        setBooleanField(term1893, term1893.getClass(), "includeDocumentation", false);
        setIntField(term1893, term1893.getClass(), "originalCommentPosition", -1547384488);
        setField(term1890, term1890.getClass(), "docInfo", term1893);
        setBooleanField(term1890, term1890.getClass(), "unknown", false);
        setBooleanField(term1890, term1890.getClass(), "resolved", false);
        setField(term1890, term1890.getClass(), "resolveResult", null);
        setField(term1899, term1899.getClass(), "templateKeys", null);
        setField(term1899, term1899.getClass(), "templateValues", null);
        setField(term1899, term1899.getClass(), "resolvedTemplateValues", null);
        setField(term1899, term1899.getClass(), "registry", null);
        setField(term1890, term1890.getClass(), "templateTypeMap", term1899);
        setBooleanField(term1890, term1890.getClass(), "inTemplatedCheckVisit", true);
        setField(term1890, term1890.getClass(), "registry", null);
        setField(term1889, term1889.getClass(), "objectIndexTemplateKey", term1890);
        setField(term1901, term1901.getClass(), "name", null);
        setField(term1901, term1901.getClass(), "referencedType", null);
        setField(term1901, term1901.getClass(), "referencedObjType", null);
        setBooleanField(term1901, term1901.getClass(), "visited", false);
        setField(term1901, term1901.getClass(), "docInfo", null);
        setBooleanField(term1901, term1901.getClass(), "unknown", false);
        setBooleanField(term1901, term1901.getClass(), "resolved", false);
        setField(term1901, term1901.getClass(), "resolveResult", null);
        setField(term1901, term1901.getClass(), "templateTypeMap", null);
        setBooleanField(term1901, term1901.getClass(), "inTemplatedCheckVisit", false);
        setField(term1901, term1901.getClass(), "registry", null);
        setField(term1889, term1889.getClass(), "objectElementTemplateKey", term1901);
        setField(term1889, term1889.getClass(), "reporter", null);
        setField(term1889, term1889.getClass(), "nativeTypes", null);
        setField(term1889, term1889.getClass(), "namesToTypes", null);
        setField(term1889, term1889.getClass(), "namespaces", null);
        setField(term1889, term1889.getClass(), "nonNullableTypeNames", null);
        setField(term1889, term1889.getClass(), "forwardDeclaredTypes", null);
        setField(term1889, term1889.getClass(), "typesIndexedByProperty", null);
        setField(term1889, term1889.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term1889, term1889.getClass(), "greatestSubtypeByProperty", null);
        setField(term1889, term1889.getClass(), "interfaceToImplementors", null);
        setField(term1889, term1889.getClass(), "unresolvedNamedTypes", null);
        setField(term1889, term1889.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1889, term1889.getClass(), "lastGeneration", false);
        setField(term1889, term1889.getClass(), "templateTypes", null);
        setField(term1889, term1889.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term1889, term1889.getClass(), "tolerateUndefinedValues", false);
        setField(term1889, term1889.getClass(), "resolveMode", null);
        setField(term1888, term1888.getClass(), "typeRegistry", term1889);
        setField(term1888, term1888.getClass(), "allValueTypes", null);
        setBooleanField(term1888, term1888.getClass(), "shouldReport", false);
        setField(term1888, term1888.getClass(), "nullOrUndefined", null);
        setField(term1888, term1888.getClass(), "mismatches", null);
        setField(term1887, term1887.getClass(), "validator", term1888);
        setField(term1887, term1887.getClass(), "reverseInterpreter", null);
        setField(term1887, term1887.getClass(), "typeRegistry", null);
        setField(term1887, term1887.getClass(), "topScope", null);
        setField(term1887, term1887.getClass(), "scopeCreator", null);
        setField(term1887, term1887.getClass(), "reportMissingOverride", null);
        setBooleanField(term1887, term1887.getClass(), "reportUnknownTypes", false);
        setBooleanField(term1887, term1887.getClass(), "reportMissingProperties", false);
        setField(term1887, term1887.getClass(), "inferJSDocInfo", null);
        setIntField(term1887, term1887.getClass(), "typedCount", 0);
        setIntField(term1887, term1887.getClass(), "nullCount", 0);
        setIntField(term1887, term1887.getClass(), "unknownCount", 0);
        setBooleanField(term1887, term1887.getClass(), "inExterns", false);
        setIntField(term1887, term1887.getClass(), "noTypeCheckSection", 0);
        setField(term1887, term1887.getClass(), "editDistance", null);
        term1916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1916, term1916.getClass(), "type", 1114000454);
        setIntField(term1918, term1918.getClass(), "type", -556405712);
        setIntField(term1920, term1920.getClass(), "type", -1772434990);
        setIntField(term1922, term1922.getClass(), "type", -1845499264);
        setIntField(term1924, term1924.getClass(), "type", -505439934);
        setField(term1924, term1924.getClass(), "next", null);
        setField(term1924, term1924.getClass(), "first", null);
        setField(term1924, term1924.getClass(), "last", null);
        setField(term1924, term1924.getClass(), "propListHead", null);
        setIntField(term1924, term1924.getClass(), "sourcePosition", 0);
        setField(term1924, term1924.getClass(), "jsType", null);
        setField(term1924, term1924.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "next", term1924);
        setIntField(term1927, term1927.getClass(), "type", -344842608);
        setField(term1927, term1927.getClass(), "next", null);
        setField(term1927, term1927.getClass(), "first", null);
        setField(term1927, term1927.getClass(), "last", term1924);
        setField(term1927, term1927.getClass(), "propListHead", null);
        setIntField(term1927, term1927.getClass(), "sourcePosition", 0);
        setField(term1927, term1927.getClass(), "jsType", null);
        setField(term1927, term1927.getClass(), "parent", null);
        setField(term1922, term1922.getClass(), "first", term1927);
        setField(term1922, term1922.getClass(), "last", term1920);
        setField(term1922, term1922.getClass(), "propListHead", null);
        setIntField(term1922, term1922.getClass(), "sourcePosition", 0);
        setField(term1922, term1922.getClass(), "jsType", null);
        setField(term1922, term1922.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "next", term1922);
        setField(term1920, term1920.getClass(), "first", term1924);
        setIntField(term1931, term1931.getClass(), "type", 444029505);
        setIntField(term1933, term1933.getClass(), "type", -1034506028);
        setField(term1933, term1933.getClass(), "next", null);
        setField(term1933, term1933.getClass(), "first", term1927);
        setField(term1933, term1933.getClass(), "last", term1922);
        setField(term1933, term1933.getClass(), "propListHead", null);
        setIntField(term1933, term1933.getClass(), "sourcePosition", 0);
        setField(term1933, term1933.getClass(), "jsType", null);
        setField(term1933, term1933.getClass(), "parent", null);
        setField(term1931, term1931.getClass(), "next", term1933);
        setField(term1931, term1931.getClass(), "first", term1918);
        setField(term1931, term1931.getClass(), "last", term1918);
        setField(term1931, term1931.getClass(), "propListHead", null);
        setIntField(term1931, term1931.getClass(), "sourcePosition", 0);
        setField(term1931, term1931.getClass(), "jsType", null);
        setField(term1931, term1931.getClass(), "parent", null);
        setField(term1920, term1920.getClass(), "last", term1931);
        setField(term1920, term1920.getClass(), "propListHead", null);
        setIntField(term1920, term1920.getClass(), "sourcePosition", 0);
        setField(term1920, term1920.getClass(), "jsType", null);
        setField(term1920, term1920.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "next", term1920);
        setIntField(term1938, term1938.getClass(), "type", -1263114719);
        setField(term1938, term1938.getClass(), "next", term1931);
        setField(term1938, term1938.getClass(), "first", term1933);
        setField(term1938, term1938.getClass(), "last", term1916);
        setField(term1938, term1938.getClass(), "propListHead", null);
        setIntField(term1938, term1938.getClass(), "sourcePosition", 0);
        setField(term1938, term1938.getClass(), "jsType", null);
        setField(term1938, term1938.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "first", term1938);
        setField(term1918, term1918.getClass(), "last", term1938);
        setField(term1918, term1918.getClass(), "propListHead", null);
        setIntField(term1918, term1918.getClass(), "sourcePosition", 0);
        setField(term1918, term1918.getClass(), "jsType", null);
        setField(term1918, term1918.getClass(), "parent", null);
        setField(term1916, term1916.getClass(), "next", term1918);
        setField(term1916, term1916.getClass(), "first", term1922);
        setField(term1916, term1916.getClass(), "last", term1924);
        setField(term1916, term1916.getClass(), "propListHead", null);
        setIntField(term1916, term1916.getClass(), "sourcePosition", 0);
        setField(term1916, term1916.getClass(), "jsType", null);
        setField(term1916, term1916.getClass(), "parent", null);
        term1943 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1916;
        args[1] = term1943;
        try {
            callMethod(klass, "check", argTypes, term1887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


