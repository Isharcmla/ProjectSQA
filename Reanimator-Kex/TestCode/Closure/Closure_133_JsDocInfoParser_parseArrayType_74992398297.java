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
import java.lang.String;

public class JsDocInfoParser_parseArrayType_74992398297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20955;
     Object enum208;

    public JsDocInfoParser_parseArrayType_74992398297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21008 = new ArrayList();
        ArrayList term21011 = new ArrayList();
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        ((ArrayList) term21011).add((Object)null);
        HashMap term21014 = new HashMap();
        ArrayList term21019 = new ArrayList();
        ((ArrayList) term21019).add((Object)null);
        ((ArrayList) term21019).add((Object)null);
        ((ArrayList) term21019).add((Object)null);
        ((ArrayList) term21019).add((Object)null);
        Class<? extends Object> term117364 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term117363 = ((Class) term117364).getDeclaredField((String) "INHERITED");
        ((Field) term117363).setAccessible(true);
        Object enum207 = ((Field) term117363).get((Object) null);
        term20955 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term20956 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term20969 = (char[]) newCharArray(7);
        int[] term20978 = (int[]) newIntArray(0);
        Object term21004 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term21005 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term21006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term21007 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21023 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term21024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21040 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21042 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term21043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21050 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term21051 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term21056 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term20956, term20956.getClass(), "string", "XjDhvToxJy");
        setCharElement(term20969, 0, 'Y');
        setCharElement(term20969, 1, 'n');
        setCharElement(term20969, 2, 'L');
        setCharElement(term20969, 3, 'W');
        setCharElement(term20969, 4, 'B');
        setCharElement(term20969, 5, 'a');
        setCharElement(term20969, 6, 'J');
        setField(term20956, term20956.getClass(), "stringBuffer", term20969);
        setIntField(term20956, term20956.getClass(), "stringBufferTop", -944986533);
        setField(term20956, term20956.getClass(), "ungetBuffer", term20978);
        setIntField(term20956, term20956.getClass(), "ungetCursor", 1894454926);
        setBooleanField(term20956, term20956.getClass(), "hitEOF", false);
        setIntField(term20956, term20956.getClass(), "lineStart", 1415142780);
        setIntField(term20956, term20956.getClass(), "lineEndChar", -574105759);
        setIntField(term20956, term20956.getClass(), "lineno", -1165271567);
        setIntField(term20956, term20956.getClass(), "charno", 376834234);
        setIntField(term20956, term20956.getClass(), "initCharno", -1911972560);
        setIntField(term20956, term20956.getClass(), "initLineno", -642716895);
        setField(term20956, term20956.getClass(), "sourceString", "nxSTJflLQy");
        setIntField(term20956, term20956.getClass(), "sourceEnd", 1743398246);
        setIntField(term20956, term20956.getClass(), "sourceCursor", -934658823);
        setIntField(term20956, term20956.getClass(), "cursor", 1632177303);
        setIntField(term20956, term20956.getClass(), "tokenBeg", -802592348);
        setIntField(term20956, term20956.getClass(), "tokenEnd", -1576584269);
        setField(term20955, term20955.getClass(), "stream", term20956);
        setField(term21007, term21007.getClass(), "root", null);
        setField(term21007, term21007.getClass(), "sourceName", null);
        setField(term21006, term21006.getClass(), "baseType", term21007);
        setField(term21006, term21006.getClass(), "extendedInterfaces", term21008);
        setField(term21006, term21006.getClass(), "implementedInterfaces", term21011);
        setField(term21006, term21006.getClass(), "parameters", term21014);
        setField(term21006, term21006.getClass(), "thrownTypes", term21019);
        setField(term21006, term21006.getClass(), "templateTypeNames", null);
        setField(term21006, term21006.getClass(), "classTemplateTypeNames", null);
        setField(term21006, term21006.getClass(), "description", null);
        setField(term21006, term21006.getClass(), "meaning", null);
        setField(term21006, term21006.getClass(), "deprecated", null);
        setField(term21006, term21006.getClass(), "license", null);
        setField(term21006, term21006.getClass(), "suppressions", null);
        setField(term21006, term21006.getClass(), "modifies", null);
        setField(term21006, term21006.getClass(), "lendsName", null);
        setBooleanField(term21006, term21006.getClass(), "ngInject", false);
        setField(term21005, term21005.getClass(), "info", term21006);
        setField(term21023, term21023.getClass(), "sourceComment", null);
        setField(term21023, term21023.getClass(), "markers", null);
        setField(term21023, term21023.getClass(), "parameters", null);
        setField(term21023, term21023.getClass(), "throwsDescriptions", null);
        setField(term21023, term21023.getClass(), "blockDescription", null);
        setField(term21023, term21023.getClass(), "fileOverview", null);
        setField(term21023, term21023.getClass(), "returnDescription", null);
        setField(term21023, term21023.getClass(), "version", null);
        setField(term21023, term21023.getClass(), "authors", null);
        setField(term21023, term21023.getClass(), "sees", null);
        setField(term21005, term21005.getClass(), "documentation", term21023);
        setIntField(term21024, term21024.getClass(), "type", 2077491675);
        setIntField(term21026, term21026.getClass(), "type", 0);
        setField(term21026, term21026.getClass(), "next", null);
        setField(term21026, term21026.getClass(), "first", null);
        setField(term21026, term21026.getClass(), "last", null);
        setField(term21026, term21026.getClass(), "propListHead", null);
        setIntField(term21026, term21026.getClass(), "sourcePosition", 0);
        setField(term21026, term21026.getClass(), "jsType", null);
        setField(term21026, term21026.getClass(), "parent", null);
        setField(term21024, term21024.getClass(), "next", term21026);
        setIntField(term21029, term21029.getClass(), "type", 0);
        setField(term21029, term21029.getClass(), "next", null);
        setField(term21029, term21029.getClass(), "first", null);
        setField(term21029, term21029.getClass(), "last", null);
        setField(term21029, term21029.getClass(), "propListHead", null);
        setIntField(term21029, term21029.getClass(), "sourcePosition", 0);
        setField(term21029, term21029.getClass(), "jsType", null);
        setField(term21029, term21029.getClass(), "parent", null);
        setField(term21024, term21024.getClass(), "first", term21029);
        setIntField(term21032, term21032.getClass(), "type", 0);
        setField(term21032, term21032.getClass(), "next", null);
        setField(term21032, term21032.getClass(), "first", null);
        setField(term21032, term21032.getClass(), "last", null);
        setField(term21032, term21032.getClass(), "propListHead", null);
        setIntField(term21032, term21032.getClass(), "sourcePosition", 0);
        setField(term21032, term21032.getClass(), "jsType", null);
        setField(term21032, term21032.getClass(), "parent", null);
        setField(term21024, term21024.getClass(), "last", term21032);
        setField(term21024, term21024.getClass(), "propListHead", null);
        setIntField(term21024, term21024.getClass(), "sourcePosition", 0);
        setField(term21024, term21024.getClass(), "jsType", null);
        setField(term21024, term21024.getClass(), "parent", null);
        setField(term21005, term21005.getClass(), "associatedNode", term21024);
        setField(term21005, term21005.getClass(), "visibility", enum207);
        setIntField(term21005, term21005.getClass(), "bitset", -1728316609);
        setField(term21040, term21040.getClass(), "root", term21032);
        setField(term21040, term21040.getClass(), "sourceName", "");
        setField(term21005, term21005.getClass(), "type", term21040);
        setIntField(term21043, term21043.getClass(), "type", 297582552);
        setField(term21043, term21043.getClass(), "next", null);
        setField(term21043, term21043.getClass(), "first", null);
        setField(term21043, term21043.getClass(), "last", term21026);
        setField(term21043, term21043.getClass(), "propListHead", null);
        setIntField(term21043, term21043.getClass(), "sourcePosition", 0);
        setField(term21043, term21043.getClass(), "jsType", null);
        setField(term21043, term21043.getClass(), "parent", null);
        setField(term21042, term21042.getClass(), "root", term21043);
        setField(term21042, term21042.getClass(), "sourceName", "");
        setField(term21005, term21005.getClass(), "thisType", term21042);
        setBooleanField(term21005, term21005.getClass(), "includeDocumentation", true);
        setField(term21004, term21004.getClass(), "currentInfo", term21005);
        setBooleanField(term21004, term21004.getClass(), "populated", true);
        setBooleanField(term21004, term21004.getClass(), "parseDocumentation", true);
        setField(term21051, term21051.getClass(), "item", null);
        setIntField(term21051, term21051.getClass(), "startLineno", 0);
        setIntField(term21051, term21051.getClass(), "startCharno", 0);
        setIntField(term21051, term21051.getClass(), "endLineno", 0);
        setIntField(term21051, term21051.getClass(), "endCharno", 0);
        setField(term21050, term21050.getClass(), "annotation", term21051);
        setField(term21056, term21056.getClass(), "item", null);
        setIntField(term21056, term21056.getClass(), "startLineno", 0);
        setIntField(term21056, term21056.getClass(), "startCharno", 0);
        setIntField(term21056, term21056.getClass(), "endLineno", 0);
        setIntField(term21056, term21056.getClass(), "endCharno", 0);
        setField(term21050, term21050.getClass(), "name", term21056);
        setField(term21050, term21050.getClass(), "nameNode", null);
        setField(term21050, term21050.getClass(), "description", null);
        setField(term21050, term21050.getClass(), "type", null);
        setField(term21004, term21004.getClass(), "currentMarker", term21050);
        setField(term20955, term20955.getClass(), "jsdocBuilder", term21004);
        setField(term20955, term20955.getClass(), "sourceFile", null);
        setField(term20955, term20955.getClass(), "associatedNode", term21029);
        setField(term20955, term20955.getClass(), "errorReporter", null);
        setField(term20955, term20955.getClass(), "parser", null);
        setField(term20955, term20955.getClass(), "templateNode", null);
        setField(term20955, term20955.getClass(), "fileOverviewJSDocInfo", null);
        setField(term20955, term20955.getClass(), "state", null);
        setField(term20955, term20955.getClass(), "annotationNames", null);
        setField(term20955, term20955.getClass(), "suppressionNames", null);
        setField(term20955, term20955.getClass(), "fileLevelJsDocBuilder", null);
        setField(term20955, term20955.getClass(), "unreadToken", null);
        Class<? extends Object> term117638 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term117637 = ((Class) term117638).getDeclaredField((String) "ANNOTATION");
        ((Field) term117637).setAccessible(true);
        enum208 = ((Field) term117637).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum208;
        try {
            callMethod(klass, "parseArrayType", argTypes, term20955, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


