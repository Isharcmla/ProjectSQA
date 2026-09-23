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

public class JsDocInfoParser_parseFieldTypeList_171742206396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23965;
     Object enum213;

    public JsDocInfoParser_parseFieldTypeList_171742206396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24018 = new ArrayList();
        ArrayList term24021 = new ArrayList();
        ((ArrayList) term24021).add((Object)null);
        ((ArrayList) term24021).add((Object)null);
        ((ArrayList) term24021).add((Object)null);
        ((ArrayList) term24021).add((Object)null);
        ((ArrayList) term24021).add((Object)null);
        HashMap term24024 = new HashMap();
        ArrayList term24029 = new ArrayList();
        ((ArrayList) term24029).add((Object)null);
        ((ArrayList) term24029).add((Object)null);
        ((ArrayList) term24029).add((Object)null);
        ((ArrayList) term24029).add((Object)null);
        HashSet term24037 = new HashSet();
        HashSet term24038 = new HashSet();
        ArrayList term24042 = new ArrayList();
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        ((ArrayList) term24042).add((Object)null);
        HashMap term24045 = new HashMap();
        Class<? extends Object> term109384 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term109383 = ((Class) term109384).getDeclaredField((String) "PROTECTED");
        ((Field) term109383).setAccessible(true);
        Object enum212 = ((Field) term109383).get((Object) null);
        term23965 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23966 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23979 = (char[]) newCharArray(5);
        int[] term23986 = (int[]) newIntArray(2);
        Object term24014 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term24015 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term24016 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term24017 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term24040 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term24050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24057 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term24058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24062 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term24063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24070 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term24071 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term24076 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term24081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23966, term23966.getClass(), "string", "zjfMxUERFZ");
        setCharElement(term23979, 0, 'e');
        setCharElement(term23979, 1, 'C');
        setCharElement(term23979, 2, 'F');
        setCharElement(term23979, 3, 'V');
        setCharElement(term23979, 4, 't');
        setField(term23966, term23966.getClass(), "stringBuffer", term23979);
        setIntField(term23966, term23966.getClass(), "stringBufferTop", 804070622);
        setIntElement(term23986, 0, 1850364894);
        setIntElement(term23986, 1, 915367534);
        setField(term23966, term23966.getClass(), "ungetBuffer", term23986);
        setIntField(term23966, term23966.getClass(), "ungetCursor", 1949983666);
        setBooleanField(term23966, term23966.getClass(), "hitEOF", false);
        setIntField(term23966, term23966.getClass(), "lineStart", 154111854);
        setIntField(term23966, term23966.getClass(), "lineEndChar", 710986341);
        setIntField(term23966, term23966.getClass(), "lineno", -873958002);
        setIntField(term23966, term23966.getClass(), "charno", -1780848958);
        setIntField(term23966, term23966.getClass(), "initCharno", 1235045850);
        setIntField(term23966, term23966.getClass(), "initLineno", -75143033);
        setField(term23966, term23966.getClass(), "sourceString", "ooVlhmiOff");
        setIntField(term23966, term23966.getClass(), "sourceEnd", 797015478);
        setIntField(term23966, term23966.getClass(), "sourceCursor", 717574276);
        setIntField(term23966, term23966.getClass(), "cursor", 1795369860);
        setIntField(term23966, term23966.getClass(), "tokenBeg", -570164389);
        setIntField(term23966, term23966.getClass(), "tokenEnd", 43200329);
        setField(term23965, term23965.getClass(), "stream", term23966);
        setField(term24017, term24017.getClass(), "root", null);
        setField(term24017, term24017.getClass(), "sourceName", null);
        setField(term24016, term24016.getClass(), "baseType", term24017);
        setField(term24016, term24016.getClass(), "extendedInterfaces", term24018);
        setField(term24016, term24016.getClass(), "implementedInterfaces", term24021);
        setField(term24016, term24016.getClass(), "parameters", term24024);
        setField(term24016, term24016.getClass(), "thrownTypes", term24029);
        setField(term24016, term24016.getClass(), "templateTypeName", "");
        setField(term24016, term24016.getClass(), "description", "");
        setField(term24016, term24016.getClass(), "meaning", "");
        setField(term24016, term24016.getClass(), "deprecated", "");
        setField(term24016, term24016.getClass(), "license", "");
        setField(term24016, term24016.getClass(), "suppressions", term24037);
        setField(term24016, term24016.getClass(), "modifies", term24038);
        setField(term24016, term24016.getClass(), "lendsName", "");
        setField(term24015, term24015.getClass(), "info", term24016);
        setField(term24040, term24040.getClass(), "sourceComment", "");
        setField(term24040, term24040.getClass(), "markers", term24042);
        setField(term24040, term24040.getClass(), "parameters", term24045);
        setField(term24040, term24040.getClass(), "throwsDescriptions", null);
        setField(term24040, term24040.getClass(), "blockDescription", null);
        setField(term24040, term24040.getClass(), "fileOverview", null);
        setField(term24040, term24040.getClass(), "returnDescription", null);
        setField(term24040, term24040.getClass(), "version", null);
        setField(term24040, term24040.getClass(), "authors", null);
        setField(term24040, term24040.getClass(), "sees", null);
        setField(term24015, term24015.getClass(), "documentation", term24040);
        setIntField(term24050, term24050.getClass(), "type", 0);
        setField(term24050, term24050.getClass(), "next", null);
        setField(term24050, term24050.getClass(), "first", null);
        setField(term24050, term24050.getClass(), "last", null);
        setField(term24050, term24050.getClass(), "propListHead", null);
        setIntField(term24050, term24050.getClass(), "sourcePosition", 0);
        setField(term24050, term24050.getClass(), "jsType", null);
        setField(term24050, term24050.getClass(), "parent", null);
        setField(term24015, term24015.getClass(), "associatedNode", term24050);
        setField(term24015, term24015.getClass(), "visibility", enum212);
        setIntField(term24015, term24015.getClass(), "bitset", -1716046610);
        setIntField(term24058, term24058.getClass(), "type", 1389452261);
        setField(term24058, term24058.getClass(), "next", null);
        setField(term24058, term24058.getClass(), "first", null);
        setField(term24058, term24058.getClass(), "last", null);
        setField(term24058, term24058.getClass(), "propListHead", null);
        setIntField(term24058, term24058.getClass(), "sourcePosition", 0);
        setField(term24058, term24058.getClass(), "jsType", null);
        setField(term24058, term24058.getClass(), "parent", null);
        setField(term24057, term24057.getClass(), "root", term24058);
        setField(term24057, term24057.getClass(), "sourceName", "");
        setField(term24015, term24015.getClass(), "type", term24057);
        setIntField(term24063, term24063.getClass(), "type", 0);
        setField(term24063, term24063.getClass(), "next", null);
        setField(term24063, term24063.getClass(), "first", null);
        setField(term24063, term24063.getClass(), "last", null);
        setField(term24063, term24063.getClass(), "propListHead", null);
        setIntField(term24063, term24063.getClass(), "sourcePosition", 0);
        setField(term24063, term24063.getClass(), "jsType", null);
        setField(term24063, term24063.getClass(), "parent", null);
        setField(term24062, term24062.getClass(), "root", term24063);
        setField(term24062, term24062.getClass(), "sourceName", "");
        setField(term24015, term24015.getClass(), "thisType", term24062);
        setBooleanField(term24015, term24015.getClass(), "includeDocumentation", true);
        setField(term24014, term24014.getClass(), "currentInfo", term24015);
        setBooleanField(term24014, term24014.getClass(), "populated", false);
        setBooleanField(term24014, term24014.getClass(), "parseDocumentation", false);
        setField(term24071, term24071.getClass(), "item", null);
        setIntField(term24071, term24071.getClass(), "startLineno", 0);
        setIntField(term24071, term24071.getClass(), "startCharno", 0);
        setIntField(term24071, term24071.getClass(), "endLineno", 0);
        setIntField(term24071, term24071.getClass(), "endCharno", 0);
        setField(term24070, term24070.getClass(), "annotation", term24071);
        setField(term24076, term24076.getClass(), "item", null);
        setIntField(term24076, term24076.getClass(), "startLineno", 0);
        setIntField(term24076, term24076.getClass(), "startCharno", 0);
        setIntField(term24076, term24076.getClass(), "endLineno", 0);
        setIntField(term24076, term24076.getClass(), "endCharno", 0);
        setField(term24070, term24070.getClass(), "name", term24076);
        setField(term24070, term24070.getClass(), "nameNode", null);
        setField(term24070, term24070.getClass(), "description", null);
        setField(term24070, term24070.getClass(), "type", null);
        setField(term24014, term24014.getClass(), "currentMarker", term24070);
        setField(term23965, term23965.getClass(), "jsdocBuilder", term24014);
        setField(term23965, term23965.getClass(), "sourceFile", null);
        setIntField(term24081, term24081.getClass(), "type", 1779370220);
        setIntField(term24083, term24083.getClass(), "type", 0);
        setField(term24083, term24083.getClass(), "next", null);
        setField(term24083, term24083.getClass(), "first", null);
        setField(term24083, term24083.getClass(), "last", null);
        setField(term24083, term24083.getClass(), "propListHead", null);
        setIntField(term24083, term24083.getClass(), "sourcePosition", 0);
        setField(term24083, term24083.getClass(), "jsType", null);
        setField(term24083, term24083.getClass(), "parent", null);
        setField(term24081, term24081.getClass(), "next", term24083);
        setIntField(term24086, term24086.getClass(), "type", 0);
        setField(term24086, term24086.getClass(), "next", null);
        setField(term24086, term24086.getClass(), "first", null);
        setField(term24086, term24086.getClass(), "last", null);
        setField(term24086, term24086.getClass(), "propListHead", null);
        setIntField(term24086, term24086.getClass(), "sourcePosition", 0);
        setField(term24086, term24086.getClass(), "jsType", null);
        setField(term24086, term24086.getClass(), "parent", null);
        setField(term24081, term24081.getClass(), "first", term24086);
        setField(term24081, term24081.getClass(), "last", term24063);
        setField(term24081, term24081.getClass(), "propListHead", null);
        setIntField(term24081, term24081.getClass(), "sourcePosition", 0);
        setField(term24081, term24081.getClass(), "jsType", null);
        setField(term24081, term24081.getClass(), "parent", null);
        setField(term23965, term23965.getClass(), "associatedNode", term24081);
        setField(term23965, term23965.getClass(), "errorReporter", null);
        setField(term23965, term23965.getClass(), "parser", null);
        setField(term23965, term23965.getClass(), "templateNode", null);
        setField(term23965, term23965.getClass(), "fileOverviewJSDocInfo", null);
        setField(term23965, term23965.getClass(), "state", null);
        setField(term23965, term23965.getClass(), "annotationNames", null);
        setField(term23965, term23965.getClass(), "suppressionNames", null);
        setField(term23965, term23965.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23965, term23965.getClass(), "unreadToken", null);
        Class<? extends Object> term109658 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term109657 = ((Class) term109658).getDeclaredField((String) "EQUALS");
        ((Field) term109657).setAccessible(true);
        enum213 = ((Field) term109657).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum213;
        try {
            callMethod(klass, "parseFieldTypeList", argTypes, term23965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


