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

public class JsDocInfoParser_match_1417225348129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35339;
     Object enum266;
     Object enum267;

    public JsDocInfoParser_match_1417225348129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term35402 = new ArrayList();
        ArrayList term35405 = new ArrayList();
        ((ArrayList) term35405).add((Object)null);
        ((ArrayList) term35405).add((Object)null);
        HashMap term35408 = new HashMap();
        ArrayList term35413 = new ArrayList();
        HashSet term35416 = new HashSet();
        HashSet term35421 = new HashSet();
        HashSet term35422 = new HashSet();
        ArrayList term35431 = new ArrayList();
        ((ArrayList) term35431).add((Object)null);
        HashMap term35434 = new HashMap();
        Class<? extends Object> term164088 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term164087 = ((Class) term164088).getDeclaredField((String) "PRIVATE");
        ((Field) term164087).setAccessible(true);
        Object enum265 = ((Field) term164087).get((Object) null);
        term35339 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term35340 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term35353 = (char[]) newCharArray(8);
        int[] term35363 = (int[]) newIntArray(9);
        Object term35398 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term35399 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term35400 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term35401 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term35429 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term35439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35446 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term35447 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term35452 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term35453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term35458 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term35463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term35340, term35340.getClass(), "string", "lzZIObOJmC");
        setCharElement(term35353, 0, 'A');
        setCharElement(term35353, 1, 'V');
        setCharElement(term35353, 2, 'v');
        setCharElement(term35353, 3, 'r');
        setCharElement(term35353, 4, 'Q');
        setCharElement(term35353, 5, 'L');
        setCharElement(term35353, 6, 'u');
        setCharElement(term35353, 7, 'W');
        setField(term35340, term35340.getClass(), "stringBuffer", term35353);
        setIntField(term35340, term35340.getClass(), "stringBufferTop", 752858379);
        setIntElement(term35363, 0, -370819357);
        setIntElement(term35363, 1, -71819242);
        setIntElement(term35363, 2, 1268893136);
        setIntElement(term35363, 3, -1472700822);
        setIntElement(term35363, 4, 1626670889);
        setIntElement(term35363, 5, -2117361140);
        setIntElement(term35363, 6, 407708341);
        setIntElement(term35363, 7, -287519200);
        setIntElement(term35363, 8, -1490696181);
        setField(term35340, term35340.getClass(), "ungetBuffer", term35363);
        setIntField(term35340, term35340.getClass(), "ungetCursor", 623717232);
        setBooleanField(term35340, term35340.getClass(), "hitEOF", true);
        setIntField(term35340, term35340.getClass(), "lineStart", -1413291732);
        setIntField(term35340, term35340.getClass(), "lineEndChar", 203264365);
        setIntField(term35340, term35340.getClass(), "lineno", -1066281036);
        setIntField(term35340, term35340.getClass(), "charno", 30837706);
        setIntField(term35340, term35340.getClass(), "initCharno", 379523101);
        setIntField(term35340, term35340.getClass(), "initLineno", 1017354215);
        setField(term35340, term35340.getClass(), "sourceString", "RFmGKwvSgz");
        setIntField(term35340, term35340.getClass(), "sourceEnd", 695330987);
        setIntField(term35340, term35340.getClass(), "sourceCursor", -267289967);
        setIntField(term35340, term35340.getClass(), "cursor", 773432822);
        setIntField(term35340, term35340.getClass(), "tokenBeg", -488294922);
        setIntField(term35340, term35340.getClass(), "tokenEnd", -397161164);
        setField(term35339, term35339.getClass(), "stream", term35340);
        setField(term35401, term35401.getClass(), "root", null);
        setField(term35401, term35401.getClass(), "sourceName", null);
        setField(term35400, term35400.getClass(), "baseType", term35401);
        setField(term35400, term35400.getClass(), "extendedInterfaces", term35402);
        setField(term35400, term35400.getClass(), "implementedInterfaces", term35405);
        setField(term35400, term35400.getClass(), "parameters", term35408);
        setField(term35400, term35400.getClass(), "thrownTypes", term35413);
        setField(term35400, term35400.getClass(), "templateTypeNames", null);
        setField(term35400, term35400.getClass(), "disposedParameters", term35416);
        setField(term35400, term35400.getClass(), "description", "");
        setField(term35400, term35400.getClass(), "meaning", "");
        setField(term35400, term35400.getClass(), "deprecated", "");
        setField(term35400, term35400.getClass(), "license", "");
        setField(term35400, term35400.getClass(), "suppressions", term35421);
        setField(term35400, term35400.getClass(), "modifies", term35422);
        setField(term35400, term35400.getClass(), "lendsName", "");
        setBooleanField(term35400, term35400.getClass(), "ngInject", true);
        setBooleanField(term35400, term35400.getClass(), "wizaction", false);
        setBooleanField(term35400, term35400.getClass(), "jaggerInject", false);
        setBooleanField(term35400, term35400.getClass(), "jaggerProvide", true);
        setBooleanField(term35400, term35400.getClass(), "jaggerModule", false);
        setField(term35399, term35399.getClass(), "info", term35400);
        setField(term35429, term35429.getClass(), "sourceComment", "");
        setField(term35429, term35429.getClass(), "markers", term35431);
        setField(term35429, term35429.getClass(), "parameters", term35434);
        setField(term35429, term35429.getClass(), "throwsDescriptions", null);
        setField(term35429, term35429.getClass(), "blockDescription", null);
        setField(term35429, term35429.getClass(), "fileOverview", null);
        setField(term35429, term35429.getClass(), "returnDescription", null);
        setField(term35429, term35429.getClass(), "version", null);
        setField(term35429, term35429.getClass(), "authors", null);
        setField(term35429, term35429.getClass(), "sees", null);
        setField(term35399, term35399.getClass(), "documentation", term35429);
        setIntField(term35439, term35439.getClass(), "type", 0);
        setField(term35439, term35439.getClass(), "next", null);
        setField(term35439, term35439.getClass(), "first", null);
        setField(term35439, term35439.getClass(), "last", null);
        setField(term35439, term35439.getClass(), "propListHead", null);
        setIntField(term35439, term35439.getClass(), "sourcePosition", 0);
        setField(term35439, term35439.getClass(), "jsType", null);
        setField(term35439, term35439.getClass(), "parent", null);
        setField(term35399, term35399.getClass(), "associatedNode", term35439);
        setField(term35399, term35399.getClass(), "visibility", enum265);
        setIntField(term35399, term35399.getClass(), "bitset", 898165245);
        setField(term35446, term35446.getClass(), "root", null);
        setField(term35446, term35446.getClass(), "sourceName", null);
        setField(term35399, term35399.getClass(), "type", term35446);
        setField(term35447, term35447.getClass(), "root", null);
        setField(term35447, term35447.getClass(), "sourceName", null);
        setField(term35399, term35399.getClass(), "thisType", term35447);
        setBooleanField(term35399, term35399.getClass(), "includeDocumentation", true);
        setIntField(term35399, term35399.getClass(), "originalCommentPosition", 1810754549);
        setField(term35398, term35398.getClass(), "currentInfo", term35399);
        setBooleanField(term35398, term35398.getClass(), "populated", false);
        setBooleanField(term35398, term35398.getClass(), "parseDocumentation", false);
        setField(term35453, term35453.getClass(), "item", null);
        setIntField(term35453, term35453.getClass(), "startLineno", 0);
        setIntField(term35453, term35453.getClass(), "startCharno", 0);
        setIntField(term35453, term35453.getClass(), "endLineno", 0);
        setIntField(term35453, term35453.getClass(), "endCharno", 0);
        setField(term35452, term35452.getClass(), "annotation", term35453);
        setField(term35458, term35458.getClass(), "item", null);
        setIntField(term35458, term35458.getClass(), "startLineno", 0);
        setIntField(term35458, term35458.getClass(), "startCharno", 0);
        setIntField(term35458, term35458.getClass(), "endLineno", 0);
        setIntField(term35458, term35458.getClass(), "endCharno", 0);
        setField(term35452, term35452.getClass(), "name", term35458);
        setField(term35452, term35452.getClass(), "nameNode", null);
        setField(term35452, term35452.getClass(), "description", null);
        setField(term35452, term35452.getClass(), "type", null);
        setField(term35398, term35398.getClass(), "currentMarker", term35452);
        setField(term35339, term35339.getClass(), "jsdocBuilder", term35398);
        setField(term35339, term35339.getClass(), "sourceFile", null);
        setIntField(term35463, term35463.getClass(), "type", 1633691536);
        setIntField(term35465, term35465.getClass(), "type", 0);
        setField(term35465, term35465.getClass(), "next", null);
        setField(term35465, term35465.getClass(), "first", null);
        setField(term35465, term35465.getClass(), "last", null);
        setField(term35465, term35465.getClass(), "propListHead", null);
        setIntField(term35465, term35465.getClass(), "sourcePosition", 0);
        setField(term35465, term35465.getClass(), "jsType", null);
        setField(term35465, term35465.getClass(), "parent", null);
        setField(term35463, term35463.getClass(), "next", term35465);
        setIntField(term35468, term35468.getClass(), "type", 0);
        setField(term35468, term35468.getClass(), "next", null);
        setField(term35468, term35468.getClass(), "first", null);
        setField(term35468, term35468.getClass(), "last", null);
        setField(term35468, term35468.getClass(), "propListHead", null);
        setIntField(term35468, term35468.getClass(), "sourcePosition", 0);
        setField(term35468, term35468.getClass(), "jsType", null);
        setField(term35468, term35468.getClass(), "parent", null);
        setField(term35463, term35463.getClass(), "first", term35468);
        setField(term35463, term35463.getClass(), "last", term35439);
        setField(term35463, term35463.getClass(), "propListHead", null);
        setIntField(term35463, term35463.getClass(), "sourcePosition", 0);
        setField(term35463, term35463.getClass(), "jsType", null);
        setField(term35463, term35463.getClass(), "parent", null);
        setField(term35339, term35339.getClass(), "associatedNode", term35463);
        setField(term35339, term35339.getClass(), "errorReporter", null);
        setField(term35339, term35339.getClass(), "parser", null);
        setField(term35339, term35339.getClass(), "templateNode", null);
        setField(term35339, term35339.getClass(), "fileOverviewJSDocInfo", null);
        setField(term35339, term35339.getClass(), "state", null);
        setField(term35339, term35339.getClass(), "annotationNames", null);
        setField(term35339, term35339.getClass(), "suppressionNames", null);
        setField(term35339, term35339.getClass(), "fileLevelJsDocBuilder", null);
        setField(term35339, term35339.getClass(), "unreadToken", null);
        Class<? extends Object> term164356 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term164355 = ((Class) term164356).getDeclaredField((String) "COLON");
        ((Field) term164355).setAccessible(true);
        enum266 = ((Field) term164355).get((Object) null);
        Class<? extends Object> term164613 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term164612 = ((Class) term164613).getDeclaredField((String) "LP");
        ((Field) term164612).setAccessible(true);
        enum267 = ((Field) term164612).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[2];
        args[0] = enum266;
        args[1] = enum267;
        try {
            callMethod(klass, "match", argTypes, term35339, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


