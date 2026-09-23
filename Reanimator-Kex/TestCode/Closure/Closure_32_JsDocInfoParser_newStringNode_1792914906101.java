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

public class JsDocInfoParser_newStringNode_1792914906101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26897;

    public JsDocInfoParser_newStringNode_1792914906101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26956 = new ArrayList();
        ArrayList term26959 = new ArrayList();
        ((ArrayList) term26959).add((Object)null);
        ((ArrayList) term26959).add((Object)null);
        ((ArrayList) term26959).add((Object)null);
        HashMap term26962 = new HashMap();
        ArrayList term26967 = new ArrayList();
        ((ArrayList) term26967).add((Object)null);
        HashSet term26975 = new HashSet();
        HashSet term26976 = new HashSet();
        ArrayList term26980 = new ArrayList();
        ((ArrayList) term26980).add((Object)null);
        ((ArrayList) term26980).add((Object)null);
        HashMap term26983 = new HashMap();
        Class<? extends Object> term111754 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term111753 = ((Class) term111754).getDeclaredField((String) "PRIVATE");
        ((Field) term111753).setAccessible(true);
        Object enum220 = ((Field) term111753).get((Object) null);
        term26897 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term26898 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term26911 = (char[]) newCharArray(7);
        int[] term26920 = (int[]) newIntArray(6);
        Object term26952 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term26953 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26954 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term26955 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26978 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term26988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26995 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26996 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term27001 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26898, term26898.getClass(), "string", "oTGxFdiaIW");
        setCharElement(term26911, 0, 'f');
        setCharElement(term26911, 1, 'E');
        setCharElement(term26911, 2, 'R');
        setCharElement(term26911, 3, 'H');
        setCharElement(term26911, 4, 'y');
        setCharElement(term26911, 5, 'x');
        setCharElement(term26911, 6, 'f');
        setField(term26898, term26898.getClass(), "stringBuffer", term26911);
        setIntField(term26898, term26898.getClass(), "stringBufferTop", -1641507499);
        setIntElement(term26920, 0, -33436796);
        setIntElement(term26920, 1, -1527326823);
        setIntElement(term26920, 2, 469871899);
        setIntElement(term26920, 3, -1348703436);
        setIntElement(term26920, 4, -2027012650);
        setIntElement(term26920, 5, 1343432022);
        setField(term26898, term26898.getClass(), "ungetBuffer", term26920);
        setIntField(term26898, term26898.getClass(), "ungetCursor", -1767079160);
        setBooleanField(term26898, term26898.getClass(), "hitEOF", true);
        setIntField(term26898, term26898.getClass(), "lineStart", -201010601);
        setIntField(term26898, term26898.getClass(), "lineEndChar", 2060027076);
        setIntField(term26898, term26898.getClass(), "lineno", 2084868811);
        setIntField(term26898, term26898.getClass(), "charno", 314478878);
        setIntField(term26898, term26898.getClass(), "initCharno", 1425342686);
        setIntField(term26898, term26898.getClass(), "initLineno", -1042470635);
        setField(term26898, term26898.getClass(), "sourceString", "jlyFvaZlmv");
        setIntField(term26898, term26898.getClass(), "sourceEnd", -524352937);
        setIntField(term26898, term26898.getClass(), "sourceCursor", 1472218987);
        setIntField(term26898, term26898.getClass(), "cursor", 805176809);
        setIntField(term26898, term26898.getClass(), "tokenBeg", -82632953);
        setIntField(term26898, term26898.getClass(), "tokenEnd", -1473876284);
        setField(term26897, term26897.getClass(), "stream", term26898);
        setField(term26955, term26955.getClass(), "root", null);
        setField(term26955, term26955.getClass(), "sourceName", null);
        setField(term26954, term26954.getClass(), "baseType", term26955);
        setField(term26954, term26954.getClass(), "extendedInterfaces", term26956);
        setField(term26954, term26954.getClass(), "implementedInterfaces", term26959);
        setField(term26954, term26954.getClass(), "parameters", term26962);
        setField(term26954, term26954.getClass(), "thrownTypes", term26967);
        setField(term26954, term26954.getClass(), "templateTypeName", "");
        setField(term26954, term26954.getClass(), "description", "");
        setField(term26954, term26954.getClass(), "meaning", "");
        setField(term26954, term26954.getClass(), "deprecated", "");
        setField(term26954, term26954.getClass(), "license", "");
        setField(term26954, term26954.getClass(), "suppressions", term26975);
        setField(term26954, term26954.getClass(), "modifies", term26976);
        setField(term26954, term26954.getClass(), "lendsName", "");
        setField(term26953, term26953.getClass(), "info", term26954);
        setField(term26978, term26978.getClass(), "sourceComment", "");
        setField(term26978, term26978.getClass(), "markers", term26980);
        setField(term26978, term26978.getClass(), "parameters", term26983);
        setField(term26978, term26978.getClass(), "throwsDescriptions", null);
        setField(term26978, term26978.getClass(), "blockDescription", null);
        setField(term26978, term26978.getClass(), "fileOverview", null);
        setField(term26978, term26978.getClass(), "returnDescription", null);
        setField(term26978, term26978.getClass(), "version", null);
        setField(term26978, term26978.getClass(), "authors", null);
        setField(term26978, term26978.getClass(), "sees", null);
        setField(term26953, term26953.getClass(), "documentation", term26978);
        setIntField(term26988, term26988.getClass(), "type", 0);
        setField(term26988, term26988.getClass(), "next", null);
        setField(term26988, term26988.getClass(), "first", null);
        setField(term26988, term26988.getClass(), "last", null);
        setField(term26988, term26988.getClass(), "propListHead", null);
        setIntField(term26988, term26988.getClass(), "sourcePosition", 0);
        setField(term26988, term26988.getClass(), "jsType", null);
        setField(term26988, term26988.getClass(), "parent", null);
        setField(term26953, term26953.getClass(), "associatedNode", term26988);
        setField(term26953, term26953.getClass(), "visibility", enum220);
        setIntField(term26953, term26953.getClass(), "bitset", 692873905);
        setField(term26995, term26995.getClass(), "root", null);
        setField(term26995, term26995.getClass(), "sourceName", null);
        setField(term26953, term26953.getClass(), "type", term26995);
        setField(term26996, term26996.getClass(), "root", null);
        setField(term26996, term26996.getClass(), "sourceName", null);
        setField(term26953, term26953.getClass(), "thisType", term26996);
        setBooleanField(term26953, term26953.getClass(), "includeDocumentation", false);
        setField(term26952, term26952.getClass(), "currentInfo", term26953);
        setBooleanField(term26952, term26952.getClass(), "populated", false);
        setBooleanField(term26952, term26952.getClass(), "parseDocumentation", true);
        setField(term27001, term27001.getClass(), "item", null);
        setIntField(term27001, term27001.getClass(), "startLineno", 0);
        setIntField(term27001, term27001.getClass(), "startCharno", 0);
        setIntField(term27001, term27001.getClass(), "endLineno", 0);
        setIntField(term27001, term27001.getClass(), "endCharno", 0);
        setField(term27000, term27000.getClass(), "annotation", term27001);
        setField(term27006, term27006.getClass(), "item", null);
        setIntField(term27006, term27006.getClass(), "startLineno", 0);
        setIntField(term27006, term27006.getClass(), "startCharno", 0);
        setIntField(term27006, term27006.getClass(), "endLineno", 0);
        setIntField(term27006, term27006.getClass(), "endCharno", 0);
        setField(term27000, term27000.getClass(), "name", term27006);
        setField(term27000, term27000.getClass(), "nameNode", null);
        setField(term27000, term27000.getClass(), "description", null);
        setField(term27000, term27000.getClass(), "type", null);
        setField(term26952, term26952.getClass(), "currentMarker", term27000);
        setField(term26897, term26897.getClass(), "jsdocBuilder", term26952);
        setField(term26897, term26897.getClass(), "sourceFile", null);
        setIntField(term27011, term27011.getClass(), "type", 0);
        setField(term27011, term27011.getClass(), "next", null);
        setField(term27011, term27011.getClass(), "first", null);
        setField(term27011, term27011.getClass(), "last", null);
        setField(term27011, term27011.getClass(), "propListHead", null);
        setIntField(term27011, term27011.getClass(), "sourcePosition", 0);
        setField(term27011, term27011.getClass(), "jsType", null);
        setField(term27011, term27011.getClass(), "parent", null);
        setField(term26897, term26897.getClass(), "associatedNode", term27011);
        setField(term26897, term26897.getClass(), "errorReporter", null);
        setField(term26897, term26897.getClass(), "parser", null);
        setField(term26897, term26897.getClass(), "templateNode", null);
        setField(term26897, term26897.getClass(), "fileOverviewJSDocInfo", null);
        setField(term26897, term26897.getClass(), "state", null);
        setField(term26897, term26897.getClass(), "annotationNames", null);
        setField(term26897, term26897.getClass(), "suppressionNames", null);
        setField(term26897, term26897.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26897, term26897.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FxXtdhhXyS";
        try {
            callMethod(klass, "newStringNode", argTypes, term26897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


