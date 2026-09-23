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
import java.lang.String;

public class JsDocInfoParser_skipEOLs_1463094301116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31449;

    public JsDocInfoParser_skipEOLs_1463094301116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31503 = new ArrayList();
        ((ArrayList) term31503).add((Object)null);
        ((ArrayList) term31503).add((Object)null);
        ((ArrayList) term31503).add((Object)null);
        ArrayList term31506 = new ArrayList();
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        ((ArrayList) term31506).add((Object)null);
        HashMap term31509 = new HashMap();
        ArrayList term31514 = new ArrayList();
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        ((ArrayList) term31514).add((Object)null);
        Class<? extends Object> term126201 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term126200 = ((Class) term126201).getDeclaredField((String) "PRIVATE");
        ((Field) term126200).setAccessible(true);
        Object enum236 = ((Field) term126200).get((Object) null);
        term31449 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31450 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31463 = (char[]) newCharArray(2);
        int[] term31467 = (int[]) newIntArray(6);
        Object term31499 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31500 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term31501 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term31502 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31518 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term31519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31526 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31531 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31539 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term31540 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31545 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31450, term31450.getClass(), "string", "TVxGTjeDcu");
        setCharElement(term31463, 0, 'A');
        setCharElement(term31463, 1, 'V');
        setField(term31450, term31450.getClass(), "stringBuffer", term31463);
        setIntField(term31450, term31450.getClass(), "stringBufferTop", 765680355);
        setIntElement(term31467, 0, -1012090049);
        setIntElement(term31467, 1, -2025214553);
        setIntElement(term31467, 2, -154750730);
        setIntElement(term31467, 3, -2047179134);
        setIntElement(term31467, 4, 44908093);
        setIntElement(term31467, 5, 887198203);
        setField(term31450, term31450.getClass(), "ungetBuffer", term31467);
        setIntField(term31450, term31450.getClass(), "ungetCursor", 12581312);
        setBooleanField(term31450, term31450.getClass(), "hitEOF", true);
        setIntField(term31450, term31450.getClass(), "lineStart", 2087383644);
        setIntField(term31450, term31450.getClass(), "lineEndChar", 405527523);
        setIntField(term31450, term31450.getClass(), "lineno", -1123526433);
        setIntField(term31450, term31450.getClass(), "charno", 910269225);
        setIntField(term31450, term31450.getClass(), "initCharno", -298852874);
        setIntField(term31450, term31450.getClass(), "initLineno", 1094297953);
        setField(term31450, term31450.getClass(), "sourceString", "ABPtcyCzkR");
        setIntField(term31450, term31450.getClass(), "sourceEnd", -329141819);
        setIntField(term31450, term31450.getClass(), "sourceCursor", -963204620);
        setIntField(term31450, term31450.getClass(), "cursor", 172898580);
        setIntField(term31450, term31450.getClass(), "tokenBeg", -777833461);
        setIntField(term31450, term31450.getClass(), "tokenEnd", 1583691829);
        setField(term31449, term31449.getClass(), "stream", term31450);
        setField(term31502, term31502.getClass(), "root", null);
        setField(term31502, term31502.getClass(), "sourceName", null);
        setField(term31501, term31501.getClass(), "baseType", term31502);
        setField(term31501, term31501.getClass(), "extendedInterfaces", term31503);
        setField(term31501, term31501.getClass(), "implementedInterfaces", term31506);
        setField(term31501, term31501.getClass(), "parameters", term31509);
        setField(term31501, term31501.getClass(), "thrownTypes", term31514);
        setField(term31501, term31501.getClass(), "templateTypeNames", null);
        setField(term31501, term31501.getClass(), "classTemplateTypeNames", null);
        setField(term31501, term31501.getClass(), "description", null);
        setField(term31501, term31501.getClass(), "meaning", null);
        setField(term31501, term31501.getClass(), "deprecated", null);
        setField(term31501, term31501.getClass(), "license", null);
        setField(term31501, term31501.getClass(), "suppressions", null);
        setField(term31501, term31501.getClass(), "modifies", null);
        setField(term31501, term31501.getClass(), "lendsName", null);
        setBooleanField(term31501, term31501.getClass(), "ngInject", false);
        setField(term31500, term31500.getClass(), "info", term31501);
        setField(term31518, term31518.getClass(), "sourceComment", null);
        setField(term31518, term31518.getClass(), "markers", null);
        setField(term31518, term31518.getClass(), "parameters", null);
        setField(term31518, term31518.getClass(), "throwsDescriptions", null);
        setField(term31518, term31518.getClass(), "blockDescription", null);
        setField(term31518, term31518.getClass(), "fileOverview", null);
        setField(term31518, term31518.getClass(), "returnDescription", null);
        setField(term31518, term31518.getClass(), "version", null);
        setField(term31518, term31518.getClass(), "authors", null);
        setField(term31518, term31518.getClass(), "sees", null);
        setField(term31500, term31500.getClass(), "documentation", term31518);
        setIntField(term31519, term31519.getClass(), "type", 0);
        setField(term31519, term31519.getClass(), "next", null);
        setField(term31519, term31519.getClass(), "first", null);
        setField(term31519, term31519.getClass(), "last", null);
        setField(term31519, term31519.getClass(), "propListHead", null);
        setIntField(term31519, term31519.getClass(), "sourcePosition", 0);
        setField(term31519, term31519.getClass(), "jsType", null);
        setField(term31519, term31519.getClass(), "parent", null);
        setField(term31500, term31500.getClass(), "associatedNode", term31519);
        setField(term31500, term31500.getClass(), "visibility", enum236);
        setIntField(term31500, term31500.getClass(), "bitset", 1611620166);
        setIntField(term31527, term31527.getClass(), "type", -2099267271);
        setField(term31527, term31527.getClass(), "next", null);
        setField(term31527, term31527.getClass(), "first", null);
        setField(term31527, term31527.getClass(), "last", term31519);
        setField(term31527, term31527.getClass(), "propListHead", null);
        setIntField(term31527, term31527.getClass(), "sourcePosition", 0);
        setField(term31527, term31527.getClass(), "jsType", null);
        setField(term31527, term31527.getClass(), "parent", null);
        setField(term31526, term31526.getClass(), "root", term31527);
        setField(term31526, term31526.getClass(), "sourceName", "");
        setField(term31500, term31500.getClass(), "type", term31526);
        setIntField(term31532, term31532.getClass(), "type", 0);
        setField(term31532, term31532.getClass(), "next", null);
        setField(term31532, term31532.getClass(), "first", null);
        setField(term31532, term31532.getClass(), "last", null);
        setField(term31532, term31532.getClass(), "propListHead", null);
        setIntField(term31532, term31532.getClass(), "sourcePosition", 0);
        setField(term31532, term31532.getClass(), "jsType", null);
        setField(term31532, term31532.getClass(), "parent", null);
        setField(term31531, term31531.getClass(), "root", term31532);
        setField(term31531, term31531.getClass(), "sourceName", "");
        setField(term31500, term31500.getClass(), "thisType", term31531);
        setBooleanField(term31500, term31500.getClass(), "includeDocumentation", false);
        setField(term31499, term31499.getClass(), "currentInfo", term31500);
        setBooleanField(term31499, term31499.getClass(), "populated", false);
        setBooleanField(term31499, term31499.getClass(), "parseDocumentation", true);
        setField(term31540, term31540.getClass(), "item", null);
        setIntField(term31540, term31540.getClass(), "startLineno", 0);
        setIntField(term31540, term31540.getClass(), "startCharno", 0);
        setIntField(term31540, term31540.getClass(), "endLineno", 0);
        setIntField(term31540, term31540.getClass(), "endCharno", 0);
        setField(term31539, term31539.getClass(), "annotation", term31540);
        setField(term31545, term31545.getClass(), "item", null);
        setIntField(term31545, term31545.getClass(), "startLineno", 0);
        setIntField(term31545, term31545.getClass(), "startCharno", 0);
        setIntField(term31545, term31545.getClass(), "endLineno", 0);
        setIntField(term31545, term31545.getClass(), "endCharno", 0);
        setField(term31539, term31539.getClass(), "name", term31545);
        setField(term31539, term31539.getClass(), "nameNode", null);
        setField(term31539, term31539.getClass(), "description", null);
        setField(term31539, term31539.getClass(), "type", null);
        setField(term31499, term31499.getClass(), "currentMarker", term31539);
        setField(term31449, term31449.getClass(), "jsdocBuilder", term31499);
        setField(term31449, term31449.getClass(), "sourceFile", null);
        setIntField(term31550, term31550.getClass(), "type", 0);
        setField(term31550, term31550.getClass(), "next", null);
        setField(term31550, term31550.getClass(), "first", null);
        setField(term31550, term31550.getClass(), "last", null);
        setField(term31550, term31550.getClass(), "propListHead", null);
        setIntField(term31550, term31550.getClass(), "sourcePosition", 0);
        setField(term31550, term31550.getClass(), "jsType", null);
        setField(term31550, term31550.getClass(), "parent", null);
        setField(term31449, term31449.getClass(), "associatedNode", term31550);
        setField(term31449, term31449.getClass(), "errorReporter", null);
        setField(term31449, term31449.getClass(), "parser", null);
        setField(term31449, term31449.getClass(), "templateNode", null);
        setField(term31449, term31449.getClass(), "fileOverviewJSDocInfo", null);
        setField(term31449, term31449.getClass(), "state", null);
        setField(term31449, term31449.getClass(), "annotationNames", null);
        setField(term31449, term31449.getClass(), "suppressionNames", null);
        setField(term31449, term31449.getClass(), "fileLevelJsDocBuilder", null);
        setField(term31449, term31449.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipEOLs", argTypes, term31449, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


