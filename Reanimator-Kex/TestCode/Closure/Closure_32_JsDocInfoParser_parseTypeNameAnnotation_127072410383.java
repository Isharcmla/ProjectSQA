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

public class JsDocInfoParser_parseTypeNameAnnotation_127072410383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15019;
     Object enum187;

    public JsDocInfoParser_parseTypeNameAnnotation_127072410383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15070 = new ArrayList();
        ((ArrayList) term15070).add((Object)null);
        ((ArrayList) term15070).add((Object)null);
        ((ArrayList) term15070).add((Object)null);
        ((ArrayList) term15070).add((Object)null);
        ((ArrayList) term15070).add((Object)null);
        ArrayList term15073 = new ArrayList();
        ((ArrayList) term15073).add((Object)null);
        ((ArrayList) term15073).add((Object)null);
        ((ArrayList) term15073).add((Object)null);
        HashMap term15076 = new HashMap();
        ArrayList term15081 = new ArrayList();
        ((ArrayList) term15081).add((Object)null);
        ((ArrayList) term15081).add((Object)null);
        ((ArrayList) term15081).add((Object)null);
        ((ArrayList) term15081).add((Object)null);
        HashSet term15089 = new HashSet();
        HashSet term15090 = new HashSet();
        ArrayList term15094 = new ArrayList();
        ((ArrayList) term15094).add((Object)null);
        ((ArrayList) term15094).add((Object)null);
        ((ArrayList) term15094).add((Object)null);
        ((ArrayList) term15094).add((Object)null);
        ((ArrayList) term15094).add((Object)null);
        HashMap term15097 = new HashMap();
        Class<? extends Object> term92585 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term92584 = ((Class) term92585).getDeclaredField((String) "INHERITED");
        ((Field) term92584).setAccessible(true);
        Object enum186 = ((Field) term92584).get((Object) null);
        term15019 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term15020 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term15033 = (char[]) newCharArray(4);
        int[] term15039 = (int[]) newIntArray(1);
        Object term15066 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term15067 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15068 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15069 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15118 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15120 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15128 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term15129 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15134 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term15020, term15020.getClass(), "string", "SvGTualQPa");
        setCharElement(term15033, 0, 'Y');
        setCharElement(term15033, 1, 'I');
        setCharElement(term15033, 2, 'r');
        setCharElement(term15033, 3, 'c');
        setField(term15020, term15020.getClass(), "stringBuffer", term15033);
        setIntField(term15020, term15020.getClass(), "stringBufferTop", -138239905);
        setIntElement(term15039, 0, 1709474063);
        setField(term15020, term15020.getClass(), "ungetBuffer", term15039);
        setIntField(term15020, term15020.getClass(), "ungetCursor", 1406617209);
        setBooleanField(term15020, term15020.getClass(), "hitEOF", true);
        setIntField(term15020, term15020.getClass(), "lineStart", 1706047059);
        setIntField(term15020, term15020.getClass(), "lineEndChar", 590451710);
        setIntField(term15020, term15020.getClass(), "lineno", -1999787419);
        setIntField(term15020, term15020.getClass(), "charno", -1224443634);
        setIntField(term15020, term15020.getClass(), "initCharno", 1048451946);
        setIntField(term15020, term15020.getClass(), "initLineno", 5603560);
        setField(term15020, term15020.getClass(), "sourceString", "mdxcgZwsaP");
        setIntField(term15020, term15020.getClass(), "sourceEnd", -1079020032);
        setIntField(term15020, term15020.getClass(), "sourceCursor", -1973791064);
        setIntField(term15020, term15020.getClass(), "cursor", -2072158633);
        setIntField(term15020, term15020.getClass(), "tokenBeg", -355469363);
        setIntField(term15020, term15020.getClass(), "tokenEnd", 1465188553);
        setField(term15019, term15019.getClass(), "stream", term15020);
        setField(term15069, term15069.getClass(), "root", null);
        setField(term15069, term15069.getClass(), "sourceName", null);
        setField(term15068, term15068.getClass(), "baseType", term15069);
        setField(term15068, term15068.getClass(), "extendedInterfaces", term15070);
        setField(term15068, term15068.getClass(), "implementedInterfaces", term15073);
        setField(term15068, term15068.getClass(), "parameters", term15076);
        setField(term15068, term15068.getClass(), "thrownTypes", term15081);
        setField(term15068, term15068.getClass(), "templateTypeName", "");
        setField(term15068, term15068.getClass(), "description", "");
        setField(term15068, term15068.getClass(), "meaning", "");
        setField(term15068, term15068.getClass(), "deprecated", "");
        setField(term15068, term15068.getClass(), "license", "");
        setField(term15068, term15068.getClass(), "suppressions", term15089);
        setField(term15068, term15068.getClass(), "modifies", term15090);
        setField(term15068, term15068.getClass(), "lendsName", "");
        setField(term15067, term15067.getClass(), "info", term15068);
        setField(term15092, term15092.getClass(), "sourceComment", "");
        setField(term15092, term15092.getClass(), "markers", term15094);
        setField(term15092, term15092.getClass(), "parameters", term15097);
        setField(term15092, term15092.getClass(), "throwsDescriptions", null);
        setField(term15092, term15092.getClass(), "blockDescription", null);
        setField(term15092, term15092.getClass(), "fileOverview", null);
        setField(term15092, term15092.getClass(), "returnDescription", null);
        setField(term15092, term15092.getClass(), "version", null);
        setField(term15092, term15092.getClass(), "authors", null);
        setField(term15092, term15092.getClass(), "sees", null);
        setField(term15067, term15067.getClass(), "documentation", term15092);
        setIntField(term15102, term15102.getClass(), "type", -1626451656);
        setIntField(term15104, term15104.getClass(), "type", 0);
        setField(term15104, term15104.getClass(), "next", null);
        setField(term15104, term15104.getClass(), "first", null);
        setField(term15104, term15104.getClass(), "last", null);
        setField(term15104, term15104.getClass(), "propListHead", null);
        setIntField(term15104, term15104.getClass(), "sourcePosition", 0);
        setField(term15104, term15104.getClass(), "jsType", null);
        setField(term15104, term15104.getClass(), "parent", null);
        setField(term15102, term15102.getClass(), "next", term15104);
        setIntField(term15107, term15107.getClass(), "type", 0);
        setField(term15107, term15107.getClass(), "next", null);
        setField(term15107, term15107.getClass(), "first", null);
        setField(term15107, term15107.getClass(), "last", null);
        setField(term15107, term15107.getClass(), "propListHead", null);
        setIntField(term15107, term15107.getClass(), "sourcePosition", 0);
        setField(term15107, term15107.getClass(), "jsType", null);
        setField(term15107, term15107.getClass(), "parent", null);
        setField(term15102, term15102.getClass(), "first", term15107);
        setIntField(term15110, term15110.getClass(), "type", 0);
        setField(term15110, term15110.getClass(), "next", null);
        setField(term15110, term15110.getClass(), "first", null);
        setField(term15110, term15110.getClass(), "last", null);
        setField(term15110, term15110.getClass(), "propListHead", null);
        setIntField(term15110, term15110.getClass(), "sourcePosition", 0);
        setField(term15110, term15110.getClass(), "jsType", null);
        setField(term15110, term15110.getClass(), "parent", null);
        setField(term15102, term15102.getClass(), "last", term15110);
        setField(term15102, term15102.getClass(), "propListHead", null);
        setIntField(term15102, term15102.getClass(), "sourcePosition", 0);
        setField(term15102, term15102.getClass(), "jsType", null);
        setField(term15102, term15102.getClass(), "parent", null);
        setField(term15067, term15067.getClass(), "associatedNode", term15102);
        setField(term15067, term15067.getClass(), "visibility", enum186);
        setIntField(term15067, term15067.getClass(), "bitset", 173952451);
        setField(term15118, term15118.getClass(), "root", term15110);
        setField(term15118, term15118.getClass(), "sourceName", "");
        setField(term15067, term15067.getClass(), "type", term15118);
        setIntField(term15121, term15121.getClass(), "type", 1292332296);
        setField(term15121, term15121.getClass(), "next", null);
        setField(term15121, term15121.getClass(), "first", null);
        setField(term15121, term15121.getClass(), "last", term15104);
        setField(term15121, term15121.getClass(), "propListHead", null);
        setIntField(term15121, term15121.getClass(), "sourcePosition", 0);
        setField(term15121, term15121.getClass(), "jsType", null);
        setField(term15121, term15121.getClass(), "parent", null);
        setField(term15120, term15120.getClass(), "root", term15121);
        setField(term15120, term15120.getClass(), "sourceName", "");
        setField(term15067, term15067.getClass(), "thisType", term15120);
        setBooleanField(term15067, term15067.getClass(), "includeDocumentation", true);
        setField(term15066, term15066.getClass(), "currentInfo", term15067);
        setBooleanField(term15066, term15066.getClass(), "populated", true);
        setBooleanField(term15066, term15066.getClass(), "parseDocumentation", true);
        setField(term15129, term15129.getClass(), "item", null);
        setIntField(term15129, term15129.getClass(), "startLineno", 0);
        setIntField(term15129, term15129.getClass(), "startCharno", 0);
        setIntField(term15129, term15129.getClass(), "endLineno", 0);
        setIntField(term15129, term15129.getClass(), "endCharno", 0);
        setField(term15128, term15128.getClass(), "annotation", term15129);
        setField(term15134, term15134.getClass(), "item", null);
        setIntField(term15134, term15134.getClass(), "startLineno", 0);
        setIntField(term15134, term15134.getClass(), "startCharno", 0);
        setIntField(term15134, term15134.getClass(), "endLineno", 0);
        setIntField(term15134, term15134.getClass(), "endCharno", 0);
        setField(term15128, term15128.getClass(), "name", term15134);
        setField(term15128, term15128.getClass(), "nameNode", null);
        setField(term15128, term15128.getClass(), "description", null);
        setField(term15128, term15128.getClass(), "type", null);
        setField(term15066, term15066.getClass(), "currentMarker", term15128);
        setField(term15019, term15019.getClass(), "jsdocBuilder", term15066);
        setField(term15019, term15019.getClass(), "sourceFile", null);
        setField(term15019, term15019.getClass(), "associatedNode", term15107);
        setField(term15019, term15019.getClass(), "errorReporter", null);
        setField(term15019, term15019.getClass(), "parser", null);
        setField(term15019, term15019.getClass(), "templateNode", null);
        setField(term15019, term15019.getClass(), "fileOverviewJSDocInfo", null);
        setField(term15019, term15019.getClass(), "state", null);
        setField(term15019, term15019.getClass(), "annotationNames", null);
        setField(term15019, term15019.getClass(), "suppressionNames", null);
        setField(term15019, term15019.getClass(), "fileLevelJsDocBuilder", null);
        setField(term15019, term15019.getClass(), "unreadToken", null);
        Class<? extends Object> term92859 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term92858 = ((Class) term92859).getDeclaredField((String) "RP");
        ((Field) term92858).setAccessible(true);
        enum187 = ((Field) term92858).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum187;
        try {
            callMethod(klass, "parseTypeNameAnnotation", argTypes, term15019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


