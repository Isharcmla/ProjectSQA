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

public class JsDocInfoParser_lookAheadForAnnotation_893594773139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40136;

    public JsDocInfoParser_lookAheadForAnnotation_893594773139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term40191 = new ArrayList();
        ArrayList term40194 = new ArrayList();
        ((ArrayList) term40194).add((Object)null);
        ((ArrayList) term40194).add((Object)null);
        ((ArrayList) term40194).add((Object)null);
        ((ArrayList) term40194).add((Object)null);
        ((ArrayList) term40194).add((Object)null);
        ((ArrayList) term40194).add((Object)null);
        HashMap term40197 = new HashMap();
        ArrayList term40202 = new ArrayList();
        ((ArrayList) term40202).add((Object)null);
        ((ArrayList) term40202).add((Object)null);
        ((ArrayList) term40202).add((Object)null);
        ((ArrayList) term40202).add((Object)null);
        HashSet term40205 = new HashSet();
        HashSet term40210 = new HashSet();
        HashSet term40211 = new HashSet();
        ArrayList term40220 = new ArrayList();
        HashMap term40223 = new HashMap();
        Class<? extends Object> term168640 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term168639 = ((Class) term168640).getDeclaredField((String) "PUBLIC");
        ((Field) term168639).setAccessible(true);
        Object enum280 = ((Field) term168639).get((Object) null);
        term40136 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term40137 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term40150 = (char[]) newCharArray(5);
        int[] term40157 = (int[]) newIntArray(4);
        Object term40187 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term40188 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term40189 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term40190 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term40218 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term40228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40235 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term40236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40240 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term40246 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term40247 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term40252 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term40257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40137, term40137.getClass(), "string", "cBMdxJirJj");
        setCharElement(term40150, 0, 'T');
        setCharElement(term40150, 1, 'E');
        setCharElement(term40150, 2, 'P');
        setCharElement(term40150, 3, 'a');
        setCharElement(term40150, 4, 'r');
        setField(term40137, term40137.getClass(), "stringBuffer", term40150);
        setIntField(term40137, term40137.getClass(), "stringBufferTop", 2085098404);
        setIntElement(term40157, 0, -684064427);
        setIntElement(term40157, 1, -1981080836);
        setIntElement(term40157, 2, -176676344);
        setIntElement(term40157, 3, 1949009312);
        setField(term40137, term40137.getClass(), "ungetBuffer", term40157);
        setIntField(term40137, term40137.getClass(), "ungetCursor", -432054743);
        setBooleanField(term40137, term40137.getClass(), "hitEOF", true);
        setIntField(term40137, term40137.getClass(), "lineStart", -859726380);
        setIntField(term40137, term40137.getClass(), "lineEndChar", -1498422654);
        setIntField(term40137, term40137.getClass(), "lineno", -1499829233);
        setIntField(term40137, term40137.getClass(), "charno", -888855662);
        setIntField(term40137, term40137.getClass(), "initCharno", -1483966656);
        setIntField(term40137, term40137.getClass(), "initLineno", -334260786);
        setField(term40137, term40137.getClass(), "sourceString", "kVnxgkemHF");
        setIntField(term40137, term40137.getClass(), "sourceEnd", -765890956);
        setIntField(term40137, term40137.getClass(), "sourceCursor", -214452542);
        setIntField(term40137, term40137.getClass(), "cursor", -21429773);
        setIntField(term40137, term40137.getClass(), "tokenBeg", 1774728742);
        setIntField(term40137, term40137.getClass(), "tokenEnd", -1822211508);
        setField(term40136, term40136.getClass(), "stream", term40137);
        setField(term40190, term40190.getClass(), "root", null);
        setField(term40190, term40190.getClass(), "sourceName", null);
        setField(term40189, term40189.getClass(), "baseType", term40190);
        setField(term40189, term40189.getClass(), "extendedInterfaces", term40191);
        setField(term40189, term40189.getClass(), "implementedInterfaces", term40194);
        setField(term40189, term40189.getClass(), "parameters", term40197);
        setField(term40189, term40189.getClass(), "thrownTypes", term40202);
        setField(term40189, term40189.getClass(), "templateTypeNames", null);
        setField(term40189, term40189.getClass(), "disposedParameters", term40205);
        setField(term40189, term40189.getClass(), "description", "");
        setField(term40189, term40189.getClass(), "meaning", "");
        setField(term40189, term40189.getClass(), "deprecated", "");
        setField(term40189, term40189.getClass(), "license", "");
        setField(term40189, term40189.getClass(), "suppressions", term40210);
        setField(term40189, term40189.getClass(), "modifies", term40211);
        setField(term40189, term40189.getClass(), "lendsName", "");
        setBooleanField(term40189, term40189.getClass(), "ngInject", false);
        setBooleanField(term40189, term40189.getClass(), "wizaction", false);
        setBooleanField(term40189, term40189.getClass(), "jaggerInject", false);
        setBooleanField(term40189, term40189.getClass(), "jaggerProvide", false);
        setBooleanField(term40189, term40189.getClass(), "jaggerModule", false);
        setField(term40188, term40188.getClass(), "info", term40189);
        setField(term40218, term40218.getClass(), "sourceComment", "");
        setField(term40218, term40218.getClass(), "markers", term40220);
        setField(term40218, term40218.getClass(), "parameters", term40223);
        setField(term40218, term40218.getClass(), "throwsDescriptions", null);
        setField(term40218, term40218.getClass(), "blockDescription", null);
        setField(term40218, term40218.getClass(), "fileOverview", null);
        setField(term40218, term40218.getClass(), "returnDescription", null);
        setField(term40218, term40218.getClass(), "version", null);
        setField(term40218, term40218.getClass(), "authors", null);
        setField(term40218, term40218.getClass(), "sees", null);
        setField(term40188, term40188.getClass(), "documentation", term40218);
        setIntField(term40228, term40228.getClass(), "type", 0);
        setField(term40228, term40228.getClass(), "next", null);
        setField(term40228, term40228.getClass(), "first", null);
        setField(term40228, term40228.getClass(), "last", null);
        setField(term40228, term40228.getClass(), "propListHead", null);
        setIntField(term40228, term40228.getClass(), "sourcePosition", 0);
        setField(term40228, term40228.getClass(), "jsType", null);
        setField(term40228, term40228.getClass(), "parent", null);
        setField(term40188, term40188.getClass(), "associatedNode", term40228);
        setField(term40188, term40188.getClass(), "visibility", enum280);
        setIntField(term40188, term40188.getClass(), "bitset", -1184558215);
        setIntField(term40236, term40236.getClass(), "type", 0);
        setField(term40236, term40236.getClass(), "next", null);
        setField(term40236, term40236.getClass(), "first", null);
        setField(term40236, term40236.getClass(), "last", null);
        setField(term40236, term40236.getClass(), "propListHead", null);
        setIntField(term40236, term40236.getClass(), "sourcePosition", 0);
        setField(term40236, term40236.getClass(), "jsType", null);
        setField(term40236, term40236.getClass(), "parent", null);
        setField(term40235, term40235.getClass(), "root", term40236);
        setField(term40235, term40235.getClass(), "sourceName", "");
        setField(term40188, term40188.getClass(), "type", term40235);
        setField(term40240, term40240.getClass(), "root", term40236);
        setField(term40240, term40240.getClass(), "sourceName", "");
        setField(term40188, term40188.getClass(), "thisType", term40240);
        setBooleanField(term40188, term40188.getClass(), "includeDocumentation", false);
        setIntField(term40188, term40188.getClass(), "originalCommentPosition", 2123688338);
        setField(term40187, term40187.getClass(), "currentInfo", term40188);
        setBooleanField(term40187, term40187.getClass(), "populated", false);
        setBooleanField(term40187, term40187.getClass(), "parseDocumentation", true);
        setField(term40247, term40247.getClass(), "item", null);
        setIntField(term40247, term40247.getClass(), "startLineno", 0);
        setIntField(term40247, term40247.getClass(), "startCharno", 0);
        setIntField(term40247, term40247.getClass(), "endLineno", 0);
        setIntField(term40247, term40247.getClass(), "endCharno", 0);
        setField(term40246, term40246.getClass(), "annotation", term40247);
        setField(term40252, term40252.getClass(), "item", null);
        setIntField(term40252, term40252.getClass(), "startLineno", 0);
        setIntField(term40252, term40252.getClass(), "startCharno", 0);
        setIntField(term40252, term40252.getClass(), "endLineno", 0);
        setIntField(term40252, term40252.getClass(), "endCharno", 0);
        setField(term40246, term40246.getClass(), "name", term40252);
        setField(term40246, term40246.getClass(), "nameNode", null);
        setField(term40246, term40246.getClass(), "description", null);
        setField(term40246, term40246.getClass(), "type", null);
        setField(term40187, term40187.getClass(), "currentMarker", term40246);
        setField(term40136, term40136.getClass(), "jsdocBuilder", term40187);
        setField(term40136, term40136.getClass(), "sourceFile", null);
        setIntField(term40257, term40257.getClass(), "type", -1642688455);
        setIntField(term40259, term40259.getClass(), "type", 0);
        setField(term40259, term40259.getClass(), "next", null);
        setField(term40259, term40259.getClass(), "first", null);
        setField(term40259, term40259.getClass(), "last", null);
        setField(term40259, term40259.getClass(), "propListHead", null);
        setIntField(term40259, term40259.getClass(), "sourcePosition", 0);
        setField(term40259, term40259.getClass(), "jsType", null);
        setField(term40259, term40259.getClass(), "parent", null);
        setField(term40257, term40257.getClass(), "next", term40259);
        setIntField(term40262, term40262.getClass(), "type", 0);
        setField(term40262, term40262.getClass(), "next", null);
        setField(term40262, term40262.getClass(), "first", null);
        setField(term40262, term40262.getClass(), "last", null);
        setField(term40262, term40262.getClass(), "propListHead", null);
        setIntField(term40262, term40262.getClass(), "sourcePosition", 0);
        setField(term40262, term40262.getClass(), "jsType", null);
        setField(term40262, term40262.getClass(), "parent", null);
        setField(term40257, term40257.getClass(), "first", term40262);
        setField(term40257, term40257.getClass(), "last", term40236);
        setField(term40257, term40257.getClass(), "propListHead", null);
        setIntField(term40257, term40257.getClass(), "sourcePosition", 0);
        setField(term40257, term40257.getClass(), "jsType", null);
        setField(term40257, term40257.getClass(), "parent", null);
        setField(term40136, term40136.getClass(), "associatedNode", term40257);
        setField(term40136, term40136.getClass(), "errorReporter", null);
        setField(term40136, term40136.getClass(), "parser", null);
        setField(term40136, term40136.getClass(), "templateNode", null);
        setField(term40136, term40136.getClass(), "fileOverviewJSDocInfo", null);
        setField(term40136, term40136.getClass(), "state", null);
        setField(term40136, term40136.getClass(), "annotationNames", null);
        setField(term40136, term40136.getClass(), "suppressionNames", null);
        setField(term40136, term40136.getClass(), "fileLevelJsDocBuilder", null);
        setField(term40136, term40136.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lookAheadForAnnotation", argTypes, term40136, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


