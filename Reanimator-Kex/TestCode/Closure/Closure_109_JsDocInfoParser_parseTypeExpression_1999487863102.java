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

public class JsDocInfoParser_parseTypeExpression_1999487863102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18892;
     Object enum221;

    public JsDocInfoParser_parseTypeExpression_1999487863102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18953 = new ArrayList();
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ((ArrayList) term18953).add((Object)null);
        ArrayList term18956 = new ArrayList();
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        ((ArrayList) term18956).add((Object)null);
        HashMap term18959 = new HashMap();
        ArrayList term18964 = new ArrayList();
        ((ArrayList) term18964).add((Object)null);
        ((ArrayList) term18964).add((Object)null);
        HashSet term18967 = new HashSet();
        HashSet term18972 = new HashSet();
        HashSet term18973 = new HashSet();
        ArrayList term18982 = new ArrayList();
        ((ArrayList) term18982).add((Object)null);
        ((ArrayList) term18982).add((Object)null);
        ((ArrayList) term18982).add((Object)null);
        HashMap term18985 = new HashMap();
        Class<? extends Object> term150616 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term150615 = ((Class) term150616).getDeclaredField((String) "PROTECTED");
        ((Field) term150615).setAccessible(true);
        Object enum220 = ((Field) term150615).get((Object) null);
        term18892 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term18893 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term18906 = (char[]) newCharArray(7);
        int[] term18915 = (int[]) newIntArray(8);
        Object term18949 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term18950 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18951 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18952 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18980 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term18990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18997 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18999 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19005 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19011 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18893, term18893.getClass(), "string", "pZbbwCURge");
        setCharElement(term18906, 0, 'R');
        setCharElement(term18906, 1, 'f');
        setCharElement(term18906, 2, 'L');
        setCharElement(term18906, 3, 'Q');
        setCharElement(term18906, 4, 'F');
        setCharElement(term18906, 5, 'p');
        setCharElement(term18906, 6, 'a');
        setField(term18893, term18893.getClass(), "stringBuffer", term18906);
        setIntField(term18893, term18893.getClass(), "stringBufferTop", 717574276);
        setIntElement(term18915, 0, 1795369860);
        setIntElement(term18915, 1, -570164389);
        setIntElement(term18915, 2, 43200329);
        setIntElement(term18915, 3, 998679955);
        setIntElement(term18915, 4, 953741504);
        setIntElement(term18915, 5, 1389452261);
        setIntElement(term18915, 6, 1615957955);
        setIntElement(term18915, 7, 1779370220);
        setField(term18893, term18893.getClass(), "ungetBuffer", term18915);
        setIntField(term18893, term18893.getClass(), "ungetCursor", -1716046610);
        setBooleanField(term18893, term18893.getClass(), "hitEOF", false);
        setIntField(term18893, term18893.getClass(), "lineStart", 65264024);
        setIntField(term18893, term18893.getClass(), "lineEndChar", -252449812);
        setIntField(term18893, term18893.getClass(), "lineno", -1885268968);
        setIntField(term18893, term18893.getClass(), "charno", 277855691);
        setIntField(term18893, term18893.getClass(), "initCharno", 675891483);
        setIntField(term18893, term18893.getClass(), "initLineno", -317900470);
        setField(term18893, term18893.getClass(), "sourceString", "RsOfgdMCMv");
        setIntField(term18893, term18893.getClass(), "sourceEnd", -979568);
        setIntField(term18893, term18893.getClass(), "sourceCursor", -1422131197);
        setIntField(term18893, term18893.getClass(), "cursor", -20399281);
        setIntField(term18893, term18893.getClass(), "tokenBeg", -830170410);
        setIntField(term18893, term18893.getClass(), "tokenEnd", -1742790308);
        setField(term18892, term18892.getClass(), "stream", term18893);
        setField(term18952, term18952.getClass(), "root", null);
        setField(term18952, term18952.getClass(), "sourceName", null);
        setField(term18951, term18951.getClass(), "baseType", term18952);
        setField(term18951, term18951.getClass(), "extendedInterfaces", term18953);
        setField(term18951, term18951.getClass(), "implementedInterfaces", term18956);
        setField(term18951, term18951.getClass(), "parameters", term18959);
        setField(term18951, term18951.getClass(), "thrownTypes", term18964);
        setField(term18951, term18951.getClass(), "templateTypeNames", null);
        setField(term18951, term18951.getClass(), "disposedParameters", term18967);
        setField(term18951, term18951.getClass(), "description", "");
        setField(term18951, term18951.getClass(), "meaning", "");
        setField(term18951, term18951.getClass(), "deprecated", "");
        setField(term18951, term18951.getClass(), "license", "");
        setField(term18951, term18951.getClass(), "suppressions", term18972);
        setField(term18951, term18951.getClass(), "modifies", term18973);
        setField(term18951, term18951.getClass(), "lendsName", "");
        setBooleanField(term18951, term18951.getClass(), "ngInject", false);
        setBooleanField(term18951, term18951.getClass(), "wizaction", true);
        setBooleanField(term18951, term18951.getClass(), "jaggerInject", true);
        setBooleanField(term18951, term18951.getClass(), "jaggerProvide", false);
        setBooleanField(term18951, term18951.getClass(), "jaggerModule", true);
        setField(term18950, term18950.getClass(), "info", term18951);
        setField(term18980, term18980.getClass(), "sourceComment", "");
        setField(term18980, term18980.getClass(), "markers", term18982);
        setField(term18980, term18980.getClass(), "parameters", term18985);
        setField(term18980, term18980.getClass(), "throwsDescriptions", null);
        setField(term18980, term18980.getClass(), "blockDescription", null);
        setField(term18980, term18980.getClass(), "fileOverview", null);
        setField(term18980, term18980.getClass(), "returnDescription", null);
        setField(term18980, term18980.getClass(), "version", null);
        setField(term18980, term18980.getClass(), "authors", null);
        setField(term18980, term18980.getClass(), "sees", null);
        setField(term18950, term18950.getClass(), "documentation", term18980);
        setIntField(term18990, term18990.getClass(), "type", 0);
        setField(term18990, term18990.getClass(), "next", null);
        setField(term18990, term18990.getClass(), "first", null);
        setField(term18990, term18990.getClass(), "last", null);
        setField(term18990, term18990.getClass(), "propListHead", null);
        setIntField(term18990, term18990.getClass(), "sourcePosition", 0);
        setField(term18990, term18990.getClass(), "jsType", null);
        setField(term18990, term18990.getClass(), "parent", null);
        setField(term18950, term18950.getClass(), "associatedNode", term18990);
        setField(term18950, term18950.getClass(), "visibility", enum220);
        setIntField(term18950, term18950.getClass(), "bitset", 1822317628);
        setField(term18997, term18997.getClass(), "root", term18990);
        setField(term18997, term18997.getClass(), "sourceName", "");
        setField(term18950, term18950.getClass(), "type", term18997);
        setField(term18999, term18999.getClass(), "root", term18990);
        setField(term18999, term18999.getClass(), "sourceName", "");
        setField(term18950, term18950.getClass(), "thisType", term18999);
        setBooleanField(term18950, term18950.getClass(), "includeDocumentation", true);
        setIntField(term18950, term18950.getClass(), "originalCommentPosition", -608830309);
        setField(term18949, term18949.getClass(), "currentInfo", term18950);
        setBooleanField(term18949, term18949.getClass(), "populated", false);
        setBooleanField(term18949, term18949.getClass(), "parseDocumentation", false);
        setField(term19006, term19006.getClass(), "item", null);
        setIntField(term19006, term19006.getClass(), "startLineno", 0);
        setIntField(term19006, term19006.getClass(), "startCharno", 0);
        setIntField(term19006, term19006.getClass(), "endLineno", 0);
        setIntField(term19006, term19006.getClass(), "endCharno", 0);
        setField(term19005, term19005.getClass(), "annotation", term19006);
        setField(term19011, term19011.getClass(), "item", null);
        setIntField(term19011, term19011.getClass(), "startLineno", 0);
        setIntField(term19011, term19011.getClass(), "startCharno", 0);
        setIntField(term19011, term19011.getClass(), "endLineno", 0);
        setIntField(term19011, term19011.getClass(), "endCharno", 0);
        setField(term19005, term19005.getClass(), "name", term19011);
        setField(term19005, term19005.getClass(), "nameNode", null);
        setField(term19005, term19005.getClass(), "description", null);
        setField(term19005, term19005.getClass(), "type", null);
        setField(term18949, term18949.getClass(), "currentMarker", term19005);
        setField(term18892, term18892.getClass(), "jsdocBuilder", term18949);
        setField(term18892, term18892.getClass(), "sourceFile", null);
        setIntField(term19016, term19016.getClass(), "type", 0);
        setField(term19016, term19016.getClass(), "next", null);
        setField(term19016, term19016.getClass(), "first", null);
        setField(term19016, term19016.getClass(), "last", null);
        setField(term19016, term19016.getClass(), "propListHead", null);
        setIntField(term19016, term19016.getClass(), "sourcePosition", 0);
        setField(term19016, term19016.getClass(), "jsType", null);
        setField(term19016, term19016.getClass(), "parent", null);
        setField(term18892, term18892.getClass(), "associatedNode", term19016);
        setField(term18892, term18892.getClass(), "errorReporter", null);
        setField(term18892, term18892.getClass(), "parser", null);
        setField(term18892, term18892.getClass(), "templateNode", null);
        setField(term18892, term18892.getClass(), "fileOverviewJSDocInfo", null);
        setField(term18892, term18892.getClass(), "state", null);
        setField(term18892, term18892.getClass(), "annotationNames", null);
        setField(term18892, term18892.getClass(), "suppressionNames", null);
        setField(term18892, term18892.getClass(), "fileLevelJsDocBuilder", null);
        setField(term18892, term18892.getClass(), "unreadToken", null);
        Class<? extends Object> term150890 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term150889 = ((Class) term150890).getDeclaredField((String) "EOL");
        ((Field) term150889).setAccessible(true);
        enum221 = ((Field) term150889).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum221;
        try {
            callMethod(klass, "parseTypeExpression", argTypes, term18892, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


