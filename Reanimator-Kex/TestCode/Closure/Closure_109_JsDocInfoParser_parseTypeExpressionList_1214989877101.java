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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseTypeExpressionList_1214989877101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18227;
     Object enum219;

    public JsDocInfoParser_parseTypeExpressionList_1214989877101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18274 = new ArrayList();
        ((ArrayList) term18274).add((Object)null);
        ((ArrayList) term18274).add((Object)null);
        ArrayList term18277 = new ArrayList();
        ((ArrayList) term18277).add((Object)null);
        ((ArrayList) term18277).add((Object)null);
        ((ArrayList) term18277).add((Object)null);
        ((ArrayList) term18277).add((Object)null);
        ((ArrayList) term18277).add((Object)null);
        HashMap term18280 = new HashMap();
        ArrayList term18285 = new ArrayList();
        ((ArrayList) term18285).add((Object)null);
        ((ArrayList) term18285).add((Object)null);
        HashSet term18288 = new HashSet();
        HashSet term18293 = new HashSet();
        HashSet term18294 = new HashSet();
        ArrayList term18303 = new ArrayList();
        ((ArrayList) term18303).add((Object)null);
        ((ArrayList) term18303).add((Object)null);
        ((ArrayList) term18303).add((Object)null);
        ((ArrayList) term18303).add((Object)null);
        ((ArrayList) term18303).add((Object)null);
        HashMap term18306 = new HashMap();
        Class<? extends Object> term150040 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term150039 = ((Class) term150040).getDeclaredField((String) "PUBLIC");
        ((Field) term150039).setAccessible(true);
        Object enum218 = ((Field) term150039).get((Object) null);
        term18227 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term18228 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term18241 = (char[]) newCharArray(1);
        int[] term18244 = (int[]) newIntArray(0);
        Object term18270 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term18271 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18273 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18301 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term18311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18318 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18323 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term18333 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term18338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term18343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18228, term18228.getClass(), "string", "iTxNduwSjE");
        setCharElement(term18241, 0, 'z');
        setField(term18228, term18228.getClass(), "stringBuffer", term18241);
        setIntField(term18228, term18228.getClass(), "stringBufferTop", 588390599);
        setField(term18228, term18228.getClass(), "ungetBuffer", term18244);
        setIntField(term18228, term18228.getClass(), "ungetCursor", -95969566);
        setBooleanField(term18228, term18228.getClass(), "hitEOF", false);
        setIntField(term18228, term18228.getClass(), "lineStart", -68615285);
        setIntField(term18228, term18228.getClass(), "lineEndChar", -337504086);
        setIntField(term18228, term18228.getClass(), "lineno", 2074130991);
        setIntField(term18228, term18228.getClass(), "charno", 532588266);
        setIntField(term18228, term18228.getClass(), "initCharno", -1286686332);
        setIntField(term18228, term18228.getClass(), "initLineno", -284885486);
        setField(term18228, term18228.getClass(), "sourceString", "MQUTfIiFnh");
        setIntField(term18228, term18228.getClass(), "sourceEnd", 1791984446);
        setIntField(term18228, term18228.getClass(), "sourceCursor", 804070622);
        setIntField(term18228, term18228.getClass(), "cursor", 1850364894);
        setIntField(term18228, term18228.getClass(), "tokenBeg", 915367534);
        setIntField(term18228, term18228.getClass(), "tokenEnd", 1949983666);
        setField(term18227, term18227.getClass(), "stream", term18228);
        setField(term18273, term18273.getClass(), "root", null);
        setField(term18273, term18273.getClass(), "sourceName", null);
        setField(term18272, term18272.getClass(), "baseType", term18273);
        setField(term18272, term18272.getClass(), "extendedInterfaces", term18274);
        setField(term18272, term18272.getClass(), "implementedInterfaces", term18277);
        setField(term18272, term18272.getClass(), "parameters", term18280);
        setField(term18272, term18272.getClass(), "thrownTypes", term18285);
        setField(term18272, term18272.getClass(), "templateTypeNames", null);
        setField(term18272, term18272.getClass(), "disposedParameters", term18288);
        setField(term18272, term18272.getClass(), "description", "");
        setField(term18272, term18272.getClass(), "meaning", "");
        setField(term18272, term18272.getClass(), "deprecated", "");
        setField(term18272, term18272.getClass(), "license", "");
        setField(term18272, term18272.getClass(), "suppressions", term18293);
        setField(term18272, term18272.getClass(), "modifies", term18294);
        setField(term18272, term18272.getClass(), "lendsName", "");
        setBooleanField(term18272, term18272.getClass(), "ngInject", true);
        setBooleanField(term18272, term18272.getClass(), "wizaction", false);
        setBooleanField(term18272, term18272.getClass(), "jaggerInject", true);
        setBooleanField(term18272, term18272.getClass(), "jaggerProvide", false);
        setBooleanField(term18272, term18272.getClass(), "jaggerModule", false);
        setField(term18271, term18271.getClass(), "info", term18272);
        setField(term18301, term18301.getClass(), "sourceComment", "");
        setField(term18301, term18301.getClass(), "markers", term18303);
        setField(term18301, term18301.getClass(), "parameters", term18306);
        setField(term18301, term18301.getClass(), "throwsDescriptions", null);
        setField(term18301, term18301.getClass(), "blockDescription", null);
        setField(term18301, term18301.getClass(), "fileOverview", null);
        setField(term18301, term18301.getClass(), "returnDescription", null);
        setField(term18301, term18301.getClass(), "version", null);
        setField(term18301, term18301.getClass(), "authors", null);
        setField(term18301, term18301.getClass(), "sees", null);
        setField(term18271, term18271.getClass(), "documentation", term18301);
        setIntField(term18311, term18311.getClass(), "type", 0);
        setField(term18311, term18311.getClass(), "next", null);
        setField(term18311, term18311.getClass(), "first", null);
        setField(term18311, term18311.getClass(), "last", null);
        setField(term18311, term18311.getClass(), "propListHead", null);
        setIntField(term18311, term18311.getClass(), "sourcePosition", 0);
        setField(term18311, term18311.getClass(), "jsType", null);
        setField(term18311, term18311.getClass(), "parent", null);
        setField(term18271, term18271.getClass(), "associatedNode", term18311);
        setField(term18271, term18271.getClass(), "visibility", enum218);
        setIntField(term18271, term18271.getClass(), "bitset", -75143033);
        setIntField(term18319, term18319.getClass(), "type", -873958002);
        setField(term18319, term18319.getClass(), "next", null);
        setField(term18319, term18319.getClass(), "first", null);
        setField(term18319, term18319.getClass(), "last", null);
        setField(term18319, term18319.getClass(), "propListHead", null);
        setIntField(term18319, term18319.getClass(), "sourcePosition", 0);
        setField(term18319, term18319.getClass(), "jsType", null);
        setField(term18319, term18319.getClass(), "parent", null);
        setField(term18318, term18318.getClass(), "root", term18319);
        setField(term18318, term18318.getClass(), "sourceName", "");
        setField(term18271, term18271.getClass(), "type", term18318);
        setIntField(term18324, term18324.getClass(), "type", 0);
        setField(term18324, term18324.getClass(), "next", null);
        setField(term18324, term18324.getClass(), "first", null);
        setField(term18324, term18324.getClass(), "last", null);
        setField(term18324, term18324.getClass(), "propListHead", null);
        setIntField(term18324, term18324.getClass(), "sourcePosition", 0);
        setField(term18324, term18324.getClass(), "jsType", null);
        setField(term18324, term18324.getClass(), "parent", null);
        setField(term18323, term18323.getClass(), "root", term18324);
        setField(term18323, term18323.getClass(), "sourceName", "");
        setField(term18271, term18271.getClass(), "thisType", term18323);
        setBooleanField(term18271, term18271.getClass(), "includeDocumentation", false);
        setIntField(term18271, term18271.getClass(), "originalCommentPosition", 797015478);
        setField(term18270, term18270.getClass(), "currentInfo", term18271);
        setBooleanField(term18270, term18270.getClass(), "populated", false);
        setBooleanField(term18270, term18270.getClass(), "parseDocumentation", true);
        setField(term18333, term18333.getClass(), "item", null);
        setIntField(term18333, term18333.getClass(), "startLineno", 0);
        setIntField(term18333, term18333.getClass(), "startCharno", 0);
        setIntField(term18333, term18333.getClass(), "endLineno", 0);
        setIntField(term18333, term18333.getClass(), "endCharno", 0);
        setField(term18332, term18332.getClass(), "annotation", term18333);
        setField(term18338, term18338.getClass(), "item", null);
        setIntField(term18338, term18338.getClass(), "startLineno", 0);
        setIntField(term18338, term18338.getClass(), "startCharno", 0);
        setIntField(term18338, term18338.getClass(), "endLineno", 0);
        setIntField(term18338, term18338.getClass(), "endCharno", 0);
        setField(term18332, term18332.getClass(), "name", term18338);
        setField(term18332, term18332.getClass(), "nameNode", null);
        setField(term18332, term18332.getClass(), "description", null);
        setField(term18332, term18332.getClass(), "type", null);
        setField(term18270, term18270.getClass(), "currentMarker", term18332);
        setField(term18227, term18227.getClass(), "jsdocBuilder", term18270);
        setField(term18227, term18227.getClass(), "sourceFile", null);
        setIntField(term18343, term18343.getClass(), "type", 1235045850);
        setIntField(term18345, term18345.getClass(), "type", 0);
        setField(term18345, term18345.getClass(), "next", null);
        setField(term18345, term18345.getClass(), "first", null);
        setField(term18345, term18345.getClass(), "last", null);
        setField(term18345, term18345.getClass(), "propListHead", null);
        setIntField(term18345, term18345.getClass(), "sourcePosition", 0);
        setField(term18345, term18345.getClass(), "jsType", null);
        setField(term18345, term18345.getClass(), "parent", null);
        setField(term18343, term18343.getClass(), "next", term18345);
        setIntField(term18348, term18348.getClass(), "type", 0);
        setField(term18348, term18348.getClass(), "next", null);
        setField(term18348, term18348.getClass(), "first", null);
        setField(term18348, term18348.getClass(), "last", null);
        setField(term18348, term18348.getClass(), "propListHead", null);
        setIntField(term18348, term18348.getClass(), "sourcePosition", 0);
        setField(term18348, term18348.getClass(), "jsType", null);
        setField(term18348, term18348.getClass(), "parent", null);
        setField(term18343, term18343.getClass(), "first", term18348);
        setField(term18343, term18343.getClass(), "last", term18324);
        setField(term18343, term18343.getClass(), "propListHead", null);
        setIntField(term18343, term18343.getClass(), "sourcePosition", 0);
        setField(term18343, term18343.getClass(), "jsType", null);
        setField(term18343, term18343.getClass(), "parent", null);
        setField(term18227, term18227.getClass(), "associatedNode", term18343);
        setField(term18227, term18227.getClass(), "errorReporter", null);
        setField(term18227, term18227.getClass(), "parser", null);
        setField(term18227, term18227.getClass(), "templateNode", null);
        setField(term18227, term18227.getClass(), "fileOverviewJSDocInfo", null);
        setField(term18227, term18227.getClass(), "state", null);
        setField(term18227, term18227.getClass(), "annotationNames", null);
        setField(term18227, term18227.getClass(), "suppressionNames", null);
        setField(term18227, term18227.getClass(), "fileLevelJsDocBuilder", null);
        setField(term18227, term18227.getClass(), "unreadToken", null);
        Class<? extends Object> term150305 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term150304 = ((Class) term150305).getDeclaredField((String) "RB");
        ((Field) term150304).setAccessible(true);
        enum219 = ((Field) term150304).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum219;
        try {
            callMethod(klass, "parseTypeExpressionList", argTypes, term18227, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


