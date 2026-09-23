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

public class JsDocInfoParser_next_631041944130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36303;

    public JsDocInfoParser_next_631041944130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36354 = new ArrayList();
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ((ArrayList) term36354).add((Object)null);
        ArrayList term36357 = new ArrayList();
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        HashMap term36360 = new HashMap();
        ArrayList term36365 = new ArrayList();
        ((ArrayList) term36365).add((Object)null);
        ((ArrayList) term36365).add((Object)null);
        ((ArrayList) term36365).add((Object)null);
        ((ArrayList) term36365).add((Object)null);
        ((ArrayList) term36365).add((Object)null);
        ((ArrayList) term36365).add((Object)null);
        HashSet term36368 = new HashSet();
        HashSet term36373 = new HashSet();
        HashSet term36374 = new HashSet();
        ArrayList term36383 = new ArrayList();
        ((ArrayList) term36383).add((Object)null);
        ((ArrayList) term36383).add((Object)null);
        ((ArrayList) term36383).add((Object)null);
        ((ArrayList) term36383).add((Object)null);
        ((ArrayList) term36383).add((Object)null);
        HashMap term36386 = new HashMap();
        Class<? extends Object> term164930 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term164929 = ((Class) term164930).getDeclaredField((String) "PRIVATE");
        ((Field) term164929).setAccessible(true);
        Object enum268 = ((Field) term164929).get((Object) null);
        term36303 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term36304 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term36317 = (char[]) newCharArray(5);
        int[] term36324 = (int[]) newIntArray(0);
        Object term36350 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term36351 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term36352 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term36353 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36381 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term36391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36398 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36403 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36412 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term36413 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term36418 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term36423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term36304, term36304.getClass(), "string", "npPxKNoqdS");
        setCharElement(term36317, 0, 'I');
        setCharElement(term36317, 1, 'D');
        setCharElement(term36317, 2, 'J');
        setCharElement(term36317, 3, 'X');
        setCharElement(term36317, 4, 'f');
        setField(term36304, term36304.getClass(), "stringBuffer", term36317);
        setIntField(term36304, term36304.getClass(), "stringBufferTop", 338342107);
        setField(term36304, term36304.getClass(), "ungetBuffer", term36324);
        setIntField(term36304, term36304.getClass(), "ungetCursor", -650288950);
        setBooleanField(term36304, term36304.getClass(), "hitEOF", true);
        setIntField(term36304, term36304.getClass(), "lineStart", 433039357);
        setIntField(term36304, term36304.getClass(), "lineEndChar", 1469939797);
        setIntField(term36304, term36304.getClass(), "lineno", 252799294);
        setIntField(term36304, term36304.getClass(), "charno", -2072618022);
        setIntField(term36304, term36304.getClass(), "initCharno", -269909549);
        setIntField(term36304, term36304.getClass(), "initLineno", 686286032);
        setField(term36304, term36304.getClass(), "sourceString", "tGgCtmAQPu");
        setIntField(term36304, term36304.getClass(), "sourceEnd", -1277201854);
        setIntField(term36304, term36304.getClass(), "sourceCursor", 1691516034);
        setIntField(term36304, term36304.getClass(), "cursor", 335681723);
        setIntField(term36304, term36304.getClass(), "tokenBeg", -773707674);
        setIntField(term36304, term36304.getClass(), "tokenEnd", 383244929);
        setField(term36303, term36303.getClass(), "stream", term36304);
        setField(term36353, term36353.getClass(), "root", null);
        setField(term36353, term36353.getClass(), "sourceName", null);
        setField(term36352, term36352.getClass(), "baseType", term36353);
        setField(term36352, term36352.getClass(), "extendedInterfaces", term36354);
        setField(term36352, term36352.getClass(), "implementedInterfaces", term36357);
        setField(term36352, term36352.getClass(), "parameters", term36360);
        setField(term36352, term36352.getClass(), "thrownTypes", term36365);
        setField(term36352, term36352.getClass(), "templateTypeNames", null);
        setField(term36352, term36352.getClass(), "disposedParameters", term36368);
        setField(term36352, term36352.getClass(), "description", "");
        setField(term36352, term36352.getClass(), "meaning", "");
        setField(term36352, term36352.getClass(), "deprecated", "");
        setField(term36352, term36352.getClass(), "license", "");
        setField(term36352, term36352.getClass(), "suppressions", term36373);
        setField(term36352, term36352.getClass(), "modifies", term36374);
        setField(term36352, term36352.getClass(), "lendsName", "");
        setBooleanField(term36352, term36352.getClass(), "ngInject", true);
        setBooleanField(term36352, term36352.getClass(), "wizaction", false);
        setBooleanField(term36352, term36352.getClass(), "jaggerInject", true);
        setBooleanField(term36352, term36352.getClass(), "jaggerProvide", true);
        setBooleanField(term36352, term36352.getClass(), "jaggerModule", false);
        setField(term36351, term36351.getClass(), "info", term36352);
        setField(term36381, term36381.getClass(), "sourceComment", "");
        setField(term36381, term36381.getClass(), "markers", term36383);
        setField(term36381, term36381.getClass(), "parameters", term36386);
        setField(term36381, term36381.getClass(), "throwsDescriptions", null);
        setField(term36381, term36381.getClass(), "blockDescription", null);
        setField(term36381, term36381.getClass(), "fileOverview", null);
        setField(term36381, term36381.getClass(), "returnDescription", null);
        setField(term36381, term36381.getClass(), "version", null);
        setField(term36381, term36381.getClass(), "authors", null);
        setField(term36381, term36381.getClass(), "sees", null);
        setField(term36351, term36351.getClass(), "documentation", term36381);
        setIntField(term36391, term36391.getClass(), "type", 0);
        setField(term36391, term36391.getClass(), "next", null);
        setField(term36391, term36391.getClass(), "first", null);
        setField(term36391, term36391.getClass(), "last", null);
        setField(term36391, term36391.getClass(), "propListHead", null);
        setIntField(term36391, term36391.getClass(), "sourcePosition", 0);
        setField(term36391, term36391.getClass(), "jsType", null);
        setField(term36391, term36391.getClass(), "parent", null);
        setField(term36351, term36351.getClass(), "associatedNode", term36391);
        setField(term36351, term36351.getClass(), "visibility", enum268);
        setIntField(term36351, term36351.getClass(), "bitset", -970417907);
        setIntField(term36399, term36399.getClass(), "type", -484303394);
        setField(term36399, term36399.getClass(), "next", null);
        setField(term36399, term36399.getClass(), "first", null);
        setField(term36399, term36399.getClass(), "last", term36391);
        setField(term36399, term36399.getClass(), "propListHead", null);
        setIntField(term36399, term36399.getClass(), "sourcePosition", 0);
        setField(term36399, term36399.getClass(), "jsType", null);
        setField(term36399, term36399.getClass(), "parent", null);
        setField(term36398, term36398.getClass(), "root", term36399);
        setField(term36398, term36398.getClass(), "sourceName", "");
        setField(term36351, term36351.getClass(), "type", term36398);
        setIntField(term36404, term36404.getClass(), "type", 0);
        setField(term36404, term36404.getClass(), "next", null);
        setField(term36404, term36404.getClass(), "first", null);
        setField(term36404, term36404.getClass(), "last", null);
        setField(term36404, term36404.getClass(), "propListHead", null);
        setIntField(term36404, term36404.getClass(), "sourcePosition", 0);
        setField(term36404, term36404.getClass(), "jsType", null);
        setField(term36404, term36404.getClass(), "parent", null);
        setField(term36403, term36403.getClass(), "root", term36404);
        setField(term36403, term36403.getClass(), "sourceName", "");
        setField(term36351, term36351.getClass(), "thisType", term36403);
        setBooleanField(term36351, term36351.getClass(), "includeDocumentation", false);
        setIntField(term36351, term36351.getClass(), "originalCommentPosition", 1097894139);
        setField(term36350, term36350.getClass(), "currentInfo", term36351);
        setBooleanField(term36350, term36350.getClass(), "populated", false);
        setBooleanField(term36350, term36350.getClass(), "parseDocumentation", false);
        setField(term36413, term36413.getClass(), "item", null);
        setIntField(term36413, term36413.getClass(), "startLineno", 0);
        setIntField(term36413, term36413.getClass(), "startCharno", 0);
        setIntField(term36413, term36413.getClass(), "endLineno", 0);
        setIntField(term36413, term36413.getClass(), "endCharno", 0);
        setField(term36412, term36412.getClass(), "annotation", term36413);
        setField(term36418, term36418.getClass(), "item", null);
        setIntField(term36418, term36418.getClass(), "startLineno", 0);
        setIntField(term36418, term36418.getClass(), "startCharno", 0);
        setIntField(term36418, term36418.getClass(), "endLineno", 0);
        setIntField(term36418, term36418.getClass(), "endCharno", 0);
        setField(term36412, term36412.getClass(), "name", term36418);
        setField(term36412, term36412.getClass(), "nameNode", null);
        setField(term36412, term36412.getClass(), "description", null);
        setField(term36412, term36412.getClass(), "type", null);
        setField(term36350, term36350.getClass(), "currentMarker", term36412);
        setField(term36303, term36303.getClass(), "jsdocBuilder", term36350);
        setField(term36303, term36303.getClass(), "sourceFile", null);
        setIntField(term36423, term36423.getClass(), "type", 0);
        setField(term36423, term36423.getClass(), "next", null);
        setField(term36423, term36423.getClass(), "first", null);
        setField(term36423, term36423.getClass(), "last", null);
        setField(term36423, term36423.getClass(), "propListHead", null);
        setIntField(term36423, term36423.getClass(), "sourcePosition", 0);
        setField(term36423, term36423.getClass(), "jsType", null);
        setField(term36423, term36423.getClass(), "parent", null);
        setField(term36303, term36303.getClass(), "associatedNode", term36423);
        setField(term36303, term36303.getClass(), "errorReporter", null);
        setField(term36303, term36303.getClass(), "parser", null);
        setField(term36303, term36303.getClass(), "templateNode", null);
        setField(term36303, term36303.getClass(), "fileOverviewJSDocInfo", null);
        setField(term36303, term36303.getClass(), "state", null);
        setField(term36303, term36303.getClass(), "annotationNames", null);
        setField(term36303, term36303.getClass(), "suppressionNames", null);
        setField(term36303, term36303.getClass(), "fileLevelJsDocBuilder", null);
        setField(term36303, term36303.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "next", argTypes, term36303, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


