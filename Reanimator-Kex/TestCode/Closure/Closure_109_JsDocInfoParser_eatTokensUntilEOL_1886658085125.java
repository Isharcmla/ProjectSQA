package com.google.javascript.jscomp.parsing;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_eatTokensUntilEOL_1886658085125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32853;

    public JsDocInfoParser_eatTokensUntilEOL_1886658085125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term32916 = new ArrayList();
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ((ArrayList) term32916).add((Object)null);
        ArrayList term32919 = new ArrayList();
        ((ArrayList) term32919).add((Object)null);
        HashMap term32922 = new HashMap();
        ArrayList term32927 = new ArrayList();
        HashSet term32930 = new HashSet();
        HashSet term32935 = new HashSet();
        HashSet term32936 = new HashSet();
        ArrayList term32945 = new ArrayList();
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        ((ArrayList) term32945).add((Object)null);
        HashMap term32948 = new HashMap();
        Class<? extends Object> term162067 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term162066 = ((Class) term162067).getDeclaredField((String) "PRIVATE");
        ((Field) term162066).setAccessible(true);
        Object enum258 = ((Field) term162066).get((Object) null);
        term32853 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term32854 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term32867 = (char[]) newCharArray(9);
        int[] term32878 = (int[]) newIntArray(8);
        Object term32912 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term32913 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term32914 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term32915 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term32943 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term32953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32969 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term32971 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term32977 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term32978 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term32983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term32988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32854, term32854.getClass(), "string", "govbBrRstA");
        setCharElement(term32867, 0, 'e');
        setCharElement(term32867, 1, 'Z');
        setCharElement(term32867, 2, 'F');
        setCharElement(term32867, 3, 'U');
        setCharElement(term32867, 4, 'v');
        setCharElement(term32867, 5, 'l');
        setCharElement(term32867, 6, 'x');
        setCharElement(term32867, 7, 'v');
        setCharElement(term32867, 8, 'G');
        setField(term32854, term32854.getClass(), "stringBuffer", term32867);
        setIntField(term32854, term32854.getClass(), "stringBufferTop", 229989439);
        setIntElement(term32878, 0, -1620126913);
        setIntElement(term32878, 1, -1095121979);
        setIntElement(term32878, 2, -1674851914);
        setIntElement(term32878, 3, -1891353352);
        setIntElement(term32878, 4, 113007640);
        setIntElement(term32878, 5, 1782226794);
        setIntElement(term32878, 6, 1115327577);
        setIntElement(term32878, 7, 840704993);
        setField(term32854, term32854.getClass(), "ungetBuffer", term32878);
        setIntField(term32854, term32854.getClass(), "ungetCursor", 1297035285);
        setBooleanField(term32854, term32854.getClass(), "hitEOF", false);
        setIntField(term32854, term32854.getClass(), "lineStart", -826239685);
        setIntField(term32854, term32854.getClass(), "lineEndChar", -845551243);
        setIntField(term32854, term32854.getClass(), "lineno", 370671198);
        setIntField(term32854, term32854.getClass(), "charno", 1426800646);
        setIntField(term32854, term32854.getClass(), "initCharno", 954234820);
        setIntField(term32854, term32854.getClass(), "initLineno", 1047346538);
        setField(term32854, term32854.getClass(), "sourceString", "zSMUNzRRyM");
        setIntField(term32854, term32854.getClass(), "sourceEnd", 728436340);
        setIntField(term32854, term32854.getClass(), "sourceCursor", 1841731593);
        setIntField(term32854, term32854.getClass(), "cursor", -1854929057);
        setIntField(term32854, term32854.getClass(), "tokenBeg", 1703814701);
        setIntField(term32854, term32854.getClass(), "tokenEnd", 1370246522);
        setField(term32853, term32853.getClass(), "stream", term32854);
        setField(term32915, term32915.getClass(), "root", null);
        setField(term32915, term32915.getClass(), "sourceName", null);
        setField(term32914, term32914.getClass(), "baseType", term32915);
        setField(term32914, term32914.getClass(), "extendedInterfaces", term32916);
        setField(term32914, term32914.getClass(), "implementedInterfaces", term32919);
        setField(term32914, term32914.getClass(), "parameters", term32922);
        setField(term32914, term32914.getClass(), "thrownTypes", term32927);
        setField(term32914, term32914.getClass(), "templateTypeNames", null);
        setField(term32914, term32914.getClass(), "disposedParameters", term32930);
        setField(term32914, term32914.getClass(), "description", "");
        setField(term32914, term32914.getClass(), "meaning", "");
        setField(term32914, term32914.getClass(), "deprecated", "");
        setField(term32914, term32914.getClass(), "license", "");
        setField(term32914, term32914.getClass(), "suppressions", term32935);
        setField(term32914, term32914.getClass(), "modifies", term32936);
        setField(term32914, term32914.getClass(), "lendsName", "");
        setBooleanField(term32914, term32914.getClass(), "ngInject", false);
        setBooleanField(term32914, term32914.getClass(), "wizaction", true);
        setBooleanField(term32914, term32914.getClass(), "jaggerInject", true);
        setBooleanField(term32914, term32914.getClass(), "jaggerProvide", true);
        setBooleanField(term32914, term32914.getClass(), "jaggerModule", false);
        setField(term32913, term32913.getClass(), "info", term32914);
        setField(term32943, term32943.getClass(), "sourceComment", "");
        setField(term32943, term32943.getClass(), "markers", term32945);
        setField(term32943, term32943.getClass(), "parameters", term32948);
        setField(term32943, term32943.getClass(), "throwsDescriptions", null);
        setField(term32943, term32943.getClass(), "blockDescription", null);
        setField(term32943, term32943.getClass(), "fileOverview", null);
        setField(term32943, term32943.getClass(), "returnDescription", null);
        setField(term32943, term32943.getClass(), "version", null);
        setField(term32943, term32943.getClass(), "authors", null);
        setField(term32943, term32943.getClass(), "sees", null);
        setField(term32913, term32913.getClass(), "documentation", term32943);
        setIntField(term32953, term32953.getClass(), "type", 1291000976);
        setIntField(term32955, term32955.getClass(), "type", 1143522832);
        setField(term32955, term32955.getClass(), "next", null);
        setField(term32955, term32955.getClass(), "first", null);
        setField(term32955, term32955.getClass(), "last", null);
        setField(term32955, term32955.getClass(), "propListHead", null);
        setIntField(term32955, term32955.getClass(), "sourcePosition", 0);
        setField(term32955, term32955.getClass(), "jsType", null);
        setField(term32955, term32955.getClass(), "parent", null);
        setField(term32953, term32953.getClass(), "next", term32955);
        setIntField(term32958, term32958.getClass(), "type", 0);
        setField(term32958, term32958.getClass(), "next", null);
        setField(term32958, term32958.getClass(), "first", null);
        setField(term32958, term32958.getClass(), "last", null);
        setField(term32958, term32958.getClass(), "propListHead", null);
        setIntField(term32958, term32958.getClass(), "sourcePosition", 0);
        setField(term32958, term32958.getClass(), "jsType", null);
        setField(term32958, term32958.getClass(), "parent", null);
        setField(term32953, term32953.getClass(), "first", term32958);
        setIntField(term32961, term32961.getClass(), "type", 0);
        setField(term32961, term32961.getClass(), "next", null);
        setField(term32961, term32961.getClass(), "first", null);
        setField(term32961, term32961.getClass(), "last", null);
        setField(term32961, term32961.getClass(), "propListHead", null);
        setIntField(term32961, term32961.getClass(), "sourcePosition", 0);
        setField(term32961, term32961.getClass(), "jsType", null);
        setField(term32961, term32961.getClass(), "parent", null);
        setField(term32953, term32953.getClass(), "last", term32961);
        setField(term32953, term32953.getClass(), "propListHead", null);
        setIntField(term32953, term32953.getClass(), "sourcePosition", 0);
        setField(term32953, term32953.getClass(), "jsType", null);
        setField(term32953, term32953.getClass(), "parent", null);
        setField(term32913, term32913.getClass(), "associatedNode", term32953);
        setField(term32913, term32913.getClass(), "visibility", enum258);
        setIntField(term32913, term32913.getClass(), "bitset", -194718582);
        setField(term32969, term32969.getClass(), "root", term32958);
        setField(term32969, term32969.getClass(), "sourceName", "");
        setField(term32913, term32913.getClass(), "type", term32969);
        setField(term32971, term32971.getClass(), "root", term32958);
        setField(term32971, term32971.getClass(), "sourceName", "");
        setField(term32913, term32913.getClass(), "thisType", term32971);
        setBooleanField(term32913, term32913.getClass(), "includeDocumentation", false);
        setIntField(term32913, term32913.getClass(), "originalCommentPosition", 42982854);
        setField(term32912, term32912.getClass(), "currentInfo", term32913);
        setBooleanField(term32912, term32912.getClass(), "populated", true);
        setBooleanField(term32912, term32912.getClass(), "parseDocumentation", true);
        setField(term32978, term32978.getClass(), "item", null);
        setIntField(term32978, term32978.getClass(), "startLineno", 0);
        setIntField(term32978, term32978.getClass(), "startCharno", 0);
        setIntField(term32978, term32978.getClass(), "endLineno", 0);
        setIntField(term32978, term32978.getClass(), "endCharno", 0);
        setField(term32977, term32977.getClass(), "annotation", term32978);
        setField(term32983, term32983.getClass(), "item", null);
        setIntField(term32983, term32983.getClass(), "startLineno", 0);
        setIntField(term32983, term32983.getClass(), "startCharno", 0);
        setIntField(term32983, term32983.getClass(), "endLineno", 0);
        setIntField(term32983, term32983.getClass(), "endCharno", 0);
        setField(term32977, term32977.getClass(), "name", term32983);
        setField(term32977, term32977.getClass(), "nameNode", null);
        setField(term32977, term32977.getClass(), "description", null);
        setField(term32977, term32977.getClass(), "type", null);
        setField(term32912, term32912.getClass(), "currentMarker", term32977);
        setField(term32853, term32853.getClass(), "jsdocBuilder", term32912);
        setField(term32853, term32853.getClass(), "sourceFile", null);
        setIntField(term32988, term32988.getClass(), "type", 0);
        setField(term32988, term32988.getClass(), "next", null);
        setField(term32988, term32988.getClass(), "first", null);
        setField(term32988, term32988.getClass(), "last", null);
        setField(term32988, term32988.getClass(), "propListHead", null);
        setIntField(term32988, term32988.getClass(), "sourcePosition", 0);
        setField(term32988, term32988.getClass(), "jsType", null);
        setField(term32988, term32988.getClass(), "parent", null);
        setField(term32853, term32853.getClass(), "associatedNode", term32988);
        setField(term32853, term32853.getClass(), "errorReporter", null);
        setField(term32853, term32853.getClass(), "parser", null);
        setField(term32853, term32853.getClass(), "templateNode", null);
        setField(term32853, term32853.getClass(), "fileOverviewJSDocInfo", null);
        setField(term32853, term32853.getClass(), "state", null);
        setField(term32853, term32853.getClass(), "annotationNames", null);
        setField(term32853, term32853.getClass(), "suppressionNames", null);
        setField(term32853, term32853.getClass(), "fileLevelJsDocBuilder", null);
        setField(term32853, term32853.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term32853, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


