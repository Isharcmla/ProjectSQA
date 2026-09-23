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

public class JsDocInfoParser_parseInlineTypeDoc_128108624766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2269;

    public JsDocInfoParser_parseInlineTypeDoc_128108624766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2323 = new ArrayList();
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ((ArrayList) term2323).add((Object)null);
        ArrayList term2326 = new ArrayList();
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        ((ArrayList) term2326).add((Object)null);
        HashMap term2329 = new HashMap();
        ArrayList term2334 = new ArrayList();
        ((ArrayList) term2334).add((Object)null);
        ((ArrayList) term2334).add((Object)null);
        Class<? extends Object> term36060 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term36059 = ((Class) term36060).getDeclaredField((String) "INHERITED");
        ((Field) term36059).setAccessible(true);
        Object enum99 = ((Field) term36059).get((Object) null);
        term2269 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term2270 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term2283 = (char[]) newCharArray(7);
        int[] term2292 = (int[]) newIntArray(1);
        Object term2319 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term2320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2321 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2322 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2338 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2346 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2351 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2359 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term2360 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term2365 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term2270, term2270.getClass(), "string", "eqJfYWRaEL");
        setCharElement(term2283, 0, 'b');
        setCharElement(term2283, 1, 'M');
        setCharElement(term2283, 2, 'u');
        setCharElement(term2283, 3, 'L');
        setCharElement(term2283, 4, 'c');
        setCharElement(term2283, 5, 'g');
        setCharElement(term2283, 6, 'Q');
        setField(term2270, term2270.getClass(), "stringBuffer", term2283);
        setIntField(term2270, term2270.getClass(), "stringBufferTop", 1072005683);
        setIntElement(term2292, 0, 1861318859);
        setField(term2270, term2270.getClass(), "ungetBuffer", term2292);
        setIntField(term2270, term2270.getClass(), "ungetCursor", 1474524152);
        setBooleanField(term2270, term2270.getClass(), "hitEOF", true);
        setIntField(term2270, term2270.getClass(), "lineStart", 568954359);
        setIntField(term2270, term2270.getClass(), "lineEndChar", 53410913);
        setIntField(term2270, term2270.getClass(), "lineno", -375014958);
        setIntField(term2270, term2270.getClass(), "charno", 1107176718);
        setIntField(term2270, term2270.getClass(), "initCharno", 480137250);
        setIntField(term2270, term2270.getClass(), "initLineno", -341152642);
        setField(term2270, term2270.getClass(), "sourceString", "fhkbdRViHi");
        setIntField(term2270, term2270.getClass(), "sourceEnd", -2015854073);
        setIntField(term2270, term2270.getClass(), "sourceCursor", 538259104);
        setIntField(term2270, term2270.getClass(), "cursor", 96566506);
        setIntField(term2270, term2270.getClass(), "tokenBeg", -343325701);
        setIntField(term2270, term2270.getClass(), "tokenEnd", 107945604);
        setField(term2269, term2269.getClass(), "stream", term2270);
        setField(term2322, term2322.getClass(), "root", null);
        setField(term2322, term2322.getClass(), "sourceName", null);
        setField(term2321, term2321.getClass(), "baseType", term2322);
        setField(term2321, term2321.getClass(), "extendedInterfaces", term2323);
        setField(term2321, term2321.getClass(), "implementedInterfaces", term2326);
        setField(term2321, term2321.getClass(), "parameters", term2329);
        setField(term2321, term2321.getClass(), "thrownTypes", term2334);
        setField(term2321, term2321.getClass(), "templateTypeNames", null);
        setField(term2321, term2321.getClass(), "classTemplateTypeNames", null);
        setField(term2321, term2321.getClass(), "description", null);
        setField(term2321, term2321.getClass(), "meaning", null);
        setField(term2321, term2321.getClass(), "deprecated", null);
        setField(term2321, term2321.getClass(), "license", null);
        setField(term2321, term2321.getClass(), "suppressions", null);
        setField(term2321, term2321.getClass(), "modifies", null);
        setField(term2321, term2321.getClass(), "lendsName", null);
        setBooleanField(term2321, term2321.getClass(), "ngInject", false);
        setField(term2320, term2320.getClass(), "info", term2321);
        setField(term2338, term2338.getClass(), "sourceComment", null);
        setField(term2338, term2338.getClass(), "markers", null);
        setField(term2338, term2338.getClass(), "parameters", null);
        setField(term2338, term2338.getClass(), "throwsDescriptions", null);
        setField(term2338, term2338.getClass(), "blockDescription", null);
        setField(term2338, term2338.getClass(), "fileOverview", null);
        setField(term2338, term2338.getClass(), "returnDescription", null);
        setField(term2338, term2338.getClass(), "version", null);
        setField(term2338, term2338.getClass(), "authors", null);
        setField(term2338, term2338.getClass(), "sees", null);
        setField(term2320, term2320.getClass(), "documentation", term2338);
        setIntField(term2339, term2339.getClass(), "type", 0);
        setField(term2339, term2339.getClass(), "next", null);
        setField(term2339, term2339.getClass(), "first", null);
        setField(term2339, term2339.getClass(), "last", null);
        setField(term2339, term2339.getClass(), "propListHead", null);
        setIntField(term2339, term2339.getClass(), "sourcePosition", 0);
        setField(term2339, term2339.getClass(), "jsType", null);
        setField(term2339, term2339.getClass(), "parent", null);
        setField(term2320, term2320.getClass(), "associatedNode", term2339);
        setField(term2320, term2320.getClass(), "visibility", enum99);
        setIntField(term2320, term2320.getClass(), "bitset", -1222006000);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setField(term2347, term2347.getClass(), "next", null);
        setField(term2347, term2347.getClass(), "first", null);
        setField(term2347, term2347.getClass(), "last", null);
        setField(term2347, term2347.getClass(), "propListHead", null);
        setIntField(term2347, term2347.getClass(), "sourcePosition", 0);
        setField(term2347, term2347.getClass(), "jsType", null);
        setField(term2347, term2347.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "root", term2347);
        setField(term2346, term2346.getClass(), "sourceName", "");
        setField(term2320, term2320.getClass(), "type", term2346);
        setIntField(term2352, term2352.getClass(), "type", 1202361360);
        setField(term2352, term2352.getClass(), "next", null);
        setField(term2352, term2352.getClass(), "first", null);
        setField(term2352, term2352.getClass(), "last", null);
        setField(term2352, term2352.getClass(), "propListHead", null);
        setIntField(term2352, term2352.getClass(), "sourcePosition", 0);
        setField(term2352, term2352.getClass(), "jsType", null);
        setField(term2352, term2352.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "root", term2352);
        setField(term2351, term2351.getClass(), "sourceName", "");
        setField(term2320, term2320.getClass(), "thisType", term2351);
        setBooleanField(term2320, term2320.getClass(), "includeDocumentation", false);
        setField(term2319, term2319.getClass(), "currentInfo", term2320);
        setBooleanField(term2319, term2319.getClass(), "populated", false);
        setBooleanField(term2319, term2319.getClass(), "parseDocumentation", true);
        setField(term2360, term2360.getClass(), "item", null);
        setIntField(term2360, term2360.getClass(), "startLineno", 0);
        setIntField(term2360, term2360.getClass(), "startCharno", 0);
        setIntField(term2360, term2360.getClass(), "endLineno", 0);
        setIntField(term2360, term2360.getClass(), "endCharno", 0);
        setField(term2359, term2359.getClass(), "annotation", term2360);
        setField(term2365, term2365.getClass(), "item", null);
        setIntField(term2365, term2365.getClass(), "startLineno", 0);
        setIntField(term2365, term2365.getClass(), "startCharno", 0);
        setIntField(term2365, term2365.getClass(), "endLineno", 0);
        setIntField(term2365, term2365.getClass(), "endCharno", 0);
        setField(term2359, term2359.getClass(), "name", term2365);
        setField(term2359, term2359.getClass(), "nameNode", null);
        setField(term2359, term2359.getClass(), "description", null);
        setField(term2359, term2359.getClass(), "type", null);
        setField(term2319, term2319.getClass(), "currentMarker", term2359);
        setField(term2269, term2269.getClass(), "jsdocBuilder", term2319);
        setField(term2269, term2269.getClass(), "sourceFile", null);
        setField(term2269, term2269.getClass(), "associatedNode", term2352);
        setField(term2269, term2269.getClass(), "errorReporter", null);
        setField(term2269, term2269.getClass(), "parser", null);
        setField(term2269, term2269.getClass(), "templateNode", null);
        setField(term2269, term2269.getClass(), "fileOverviewJSDocInfo", null);
        setField(term2269, term2269.getClass(), "state", null);
        setField(term2269, term2269.getClass(), "annotationNames", null);
        setField(term2269, term2269.getClass(), "suppressionNames", null);
        setField(term2269, term2269.getClass(), "fileLevelJsDocBuilder", null);
        setField(term2269, term2269.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parseInlineTypeDoc", argTypes, term2269, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


