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

public class JsDocInfoParser_skipEOLs_1463094301132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37158;

    public JsDocInfoParser_skipEOLs_1463094301132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37214 = new ArrayList();
        ((ArrayList) term37214).add((Object)null);
        ((ArrayList) term37214).add((Object)null);
        ((ArrayList) term37214).add((Object)null);
        ArrayList term37217 = new ArrayList();
        ((ArrayList) term37217).add((Object)null);
        ((ArrayList) term37217).add((Object)null);
        ((ArrayList) term37217).add((Object)null);
        ((ArrayList) term37217).add((Object)null);
        ((ArrayList) term37217).add((Object)null);
        ((ArrayList) term37217).add((Object)null);
        HashMap term37220 = new HashMap();
        ArrayList term37225 = new ArrayList();
        ((ArrayList) term37225).add((Object)null);
        ((ArrayList) term37225).add((Object)null);
        ((ArrayList) term37225).add((Object)null);
        HashSet term37228 = new HashSet();
        HashSet term37233 = new HashSet();
        HashSet term37234 = new HashSet();
        ArrayList term37243 = new ArrayList();
        HashMap term37246 = new HashMap();
        Class<? extends Object> term165561 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term165560 = ((Class) term165561).getDeclaredField((String) "PUBLIC");
        ((Field) term165560).setAccessible(true);
        Object enum270 = ((Field) term165560).get((Object) null);
        term37158 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term37159 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term37172 = (char[]) newCharArray(7);
        int[] term37181 = (int[]) newIntArray(3);
        Object term37210 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term37211 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term37212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term37213 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37241 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term37251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37267 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37269 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37278 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term37279 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term37284 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term37159, term37159.getClass(), "string", "UGMtNRjhnC");
        setCharElement(term37172, 0, 'x');
        setCharElement(term37172, 1, 'B');
        setCharElement(term37172, 2, 'R');
        setCharElement(term37172, 3, 't');
        setCharElement(term37172, 4, 'u');
        setCharElement(term37172, 5, 'O');
        setCharElement(term37172, 6, 'c');
        setField(term37159, term37159.getClass(), "stringBuffer", term37172);
        setIntField(term37159, term37159.getClass(), "stringBufferTop", 1703103733);
        setIntElement(term37181, 0, 1057562436);
        setIntElement(term37181, 1, 646610000);
        setIntElement(term37181, 2, 2003399396);
        setField(term37159, term37159.getClass(), "ungetBuffer", term37181);
        setIntField(term37159, term37159.getClass(), "ungetCursor", 1223703911);
        setBooleanField(term37159, term37159.getClass(), "hitEOF", true);
        setIntField(term37159, term37159.getClass(), "lineStart", -1824905298);
        setIntField(term37159, term37159.getClass(), "lineEndChar", -2062724184);
        setIntField(term37159, term37159.getClass(), "lineno", -716654499);
        setIntField(term37159, term37159.getClass(), "charno", 1641117123);
        setIntField(term37159, term37159.getClass(), "initCharno", -1084408453);
        setIntField(term37159, term37159.getClass(), "initLineno", -1466822773);
        setField(term37159, term37159.getClass(), "sourceString", "oTnPmmIphJ");
        setIntField(term37159, term37159.getClass(), "sourceEnd", -230022261);
        setIntField(term37159, term37159.getClass(), "sourceCursor", 831967494);
        setIntField(term37159, term37159.getClass(), "cursor", -1858635791);
        setIntField(term37159, term37159.getClass(), "tokenBeg", 1919079331);
        setIntField(term37159, term37159.getClass(), "tokenEnd", 144872711);
        setField(term37158, term37158.getClass(), "stream", term37159);
        setField(term37213, term37213.getClass(), "root", null);
        setField(term37213, term37213.getClass(), "sourceName", null);
        setField(term37212, term37212.getClass(), "baseType", term37213);
        setField(term37212, term37212.getClass(), "extendedInterfaces", term37214);
        setField(term37212, term37212.getClass(), "implementedInterfaces", term37217);
        setField(term37212, term37212.getClass(), "parameters", term37220);
        setField(term37212, term37212.getClass(), "thrownTypes", term37225);
        setField(term37212, term37212.getClass(), "templateTypeNames", null);
        setField(term37212, term37212.getClass(), "disposedParameters", term37228);
        setField(term37212, term37212.getClass(), "description", "");
        setField(term37212, term37212.getClass(), "meaning", "");
        setField(term37212, term37212.getClass(), "deprecated", "");
        setField(term37212, term37212.getClass(), "license", "");
        setField(term37212, term37212.getClass(), "suppressions", term37233);
        setField(term37212, term37212.getClass(), "modifies", term37234);
        setField(term37212, term37212.getClass(), "lendsName", "");
        setBooleanField(term37212, term37212.getClass(), "ngInject", false);
        setBooleanField(term37212, term37212.getClass(), "wizaction", false);
        setBooleanField(term37212, term37212.getClass(), "jaggerInject", true);
        setBooleanField(term37212, term37212.getClass(), "jaggerProvide", true);
        setBooleanField(term37212, term37212.getClass(), "jaggerModule", false);
        setField(term37211, term37211.getClass(), "info", term37212);
        setField(term37241, term37241.getClass(), "sourceComment", "");
        setField(term37241, term37241.getClass(), "markers", term37243);
        setField(term37241, term37241.getClass(), "parameters", term37246);
        setField(term37241, term37241.getClass(), "throwsDescriptions", null);
        setField(term37241, term37241.getClass(), "blockDescription", null);
        setField(term37241, term37241.getClass(), "fileOverview", null);
        setField(term37241, term37241.getClass(), "returnDescription", null);
        setField(term37241, term37241.getClass(), "version", null);
        setField(term37241, term37241.getClass(), "authors", null);
        setField(term37241, term37241.getClass(), "sees", null);
        setField(term37211, term37211.getClass(), "documentation", term37241);
        setIntField(term37251, term37251.getClass(), "type", -400720912);
        setIntField(term37253, term37253.getClass(), "type", 0);
        setField(term37253, term37253.getClass(), "next", null);
        setField(term37253, term37253.getClass(), "first", null);
        setField(term37253, term37253.getClass(), "last", null);
        setField(term37253, term37253.getClass(), "propListHead", null);
        setIntField(term37253, term37253.getClass(), "sourcePosition", 0);
        setField(term37253, term37253.getClass(), "jsType", null);
        setField(term37253, term37253.getClass(), "parent", null);
        setField(term37251, term37251.getClass(), "next", term37253);
        setIntField(term37256, term37256.getClass(), "type", 0);
        setField(term37256, term37256.getClass(), "next", null);
        setField(term37256, term37256.getClass(), "first", null);
        setField(term37256, term37256.getClass(), "last", null);
        setField(term37256, term37256.getClass(), "propListHead", null);
        setIntField(term37256, term37256.getClass(), "sourcePosition", 0);
        setField(term37256, term37256.getClass(), "jsType", null);
        setField(term37256, term37256.getClass(), "parent", null);
        setField(term37251, term37251.getClass(), "first", term37256);
        setIntField(term37259, term37259.getClass(), "type", 0);
        setField(term37259, term37259.getClass(), "next", null);
        setField(term37259, term37259.getClass(), "first", null);
        setField(term37259, term37259.getClass(), "last", null);
        setField(term37259, term37259.getClass(), "propListHead", null);
        setIntField(term37259, term37259.getClass(), "sourcePosition", 0);
        setField(term37259, term37259.getClass(), "jsType", null);
        setField(term37259, term37259.getClass(), "parent", null);
        setField(term37251, term37251.getClass(), "last", term37259);
        setField(term37251, term37251.getClass(), "propListHead", null);
        setIntField(term37251, term37251.getClass(), "sourcePosition", 0);
        setField(term37251, term37251.getClass(), "jsType", null);
        setField(term37251, term37251.getClass(), "parent", null);
        setField(term37211, term37211.getClass(), "associatedNode", term37251);
        setField(term37211, term37211.getClass(), "visibility", enum270);
        setIntField(term37211, term37211.getClass(), "bitset", 1266192397);
        setField(term37267, term37267.getClass(), "root", term37259);
        setField(term37267, term37267.getClass(), "sourceName", "");
        setField(term37211, term37211.getClass(), "type", term37267);
        setIntField(term37270, term37270.getClass(), "type", 1232105469);
        setField(term37270, term37270.getClass(), "next", null);
        setField(term37270, term37270.getClass(), "first", null);
        setField(term37270, term37270.getClass(), "last", term37253);
        setField(term37270, term37270.getClass(), "propListHead", null);
        setIntField(term37270, term37270.getClass(), "sourcePosition", 0);
        setField(term37270, term37270.getClass(), "jsType", null);
        setField(term37270, term37270.getClass(), "parent", null);
        setField(term37269, term37269.getClass(), "root", term37270);
        setField(term37269, term37269.getClass(), "sourceName", "");
        setField(term37211, term37211.getClass(), "thisType", term37269);
        setBooleanField(term37211, term37211.getClass(), "includeDocumentation", true);
        setIntField(term37211, term37211.getClass(), "originalCommentPosition", 218346781);
        setField(term37210, term37210.getClass(), "currentInfo", term37211);
        setBooleanField(term37210, term37210.getClass(), "populated", false);
        setBooleanField(term37210, term37210.getClass(), "parseDocumentation", true);
        setField(term37279, term37279.getClass(), "item", null);
        setIntField(term37279, term37279.getClass(), "startLineno", 0);
        setIntField(term37279, term37279.getClass(), "startCharno", 0);
        setIntField(term37279, term37279.getClass(), "endLineno", 0);
        setIntField(term37279, term37279.getClass(), "endCharno", 0);
        setField(term37278, term37278.getClass(), "annotation", term37279);
        setField(term37284, term37284.getClass(), "item", null);
        setIntField(term37284, term37284.getClass(), "startLineno", 0);
        setIntField(term37284, term37284.getClass(), "startCharno", 0);
        setIntField(term37284, term37284.getClass(), "endLineno", 0);
        setIntField(term37284, term37284.getClass(), "endCharno", 0);
        setField(term37278, term37278.getClass(), "name", term37284);
        setField(term37278, term37278.getClass(), "nameNode", null);
        setField(term37278, term37278.getClass(), "description", null);
        setField(term37278, term37278.getClass(), "type", null);
        setField(term37210, term37210.getClass(), "currentMarker", term37278);
        setField(term37158, term37158.getClass(), "jsdocBuilder", term37210);
        setField(term37158, term37158.getClass(), "sourceFile", null);
        setField(term37158, term37158.getClass(), "associatedNode", term37256);
        setField(term37158, term37158.getClass(), "errorReporter", null);
        setField(term37158, term37158.getClass(), "parser", null);
        setField(term37158, term37158.getClass(), "templateNode", null);
        setField(term37158, term37158.getClass(), "fileOverviewJSDocInfo", null);
        setField(term37158, term37158.getClass(), "state", null);
        setField(term37158, term37158.getClass(), "annotationNames", null);
        setField(term37158, term37158.getClass(), "suppressionNames", null);
        setField(term37158, term37158.getClass(), "fileLevelJsDocBuilder", null);
        setField(term37158, term37158.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipEOLs", argTypes, term37158, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


