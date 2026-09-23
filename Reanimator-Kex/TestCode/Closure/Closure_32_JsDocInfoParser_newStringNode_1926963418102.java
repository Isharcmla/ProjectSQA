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
import java.lang.Integer;

public class JsDocInfoParser_newStringNode_1926963418102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27343;
     Object term27481;
     Object term27483;

    public JsDocInfoParser_newStringNode_1926963418102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27403 = new ArrayList();
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ((ArrayList) term27403).add((Object)null);
        ArrayList term27406 = new ArrayList();
        ((ArrayList) term27406).add((Object)null);
        ((ArrayList) term27406).add((Object)null);
        ((ArrayList) term27406).add((Object)null);
        ((ArrayList) term27406).add((Object)null);
        ((ArrayList) term27406).add((Object)null);
        ((ArrayList) term27406).add((Object)null);
        HashMap term27409 = new HashMap();
        ArrayList term27414 = new ArrayList();
        ((ArrayList) term27414).add((Object)null);
        ((ArrayList) term27414).add((Object)null);
        ((ArrayList) term27414).add((Object)null);
        HashSet term27422 = new HashSet();
        HashSet term27423 = new HashSet();
        ArrayList term27427 = new ArrayList();
        ((ArrayList) term27427).add((Object)null);
        ((ArrayList) term27427).add((Object)null);
        ((ArrayList) term27427).add((Object)null);
        ((ArrayList) term27427).add((Object)null);
        HashMap term27430 = new HashMap();
        Class<? extends Object> term112111 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term112110 = ((Class) term112111).getDeclaredField((String) "INHERITED");
        ((Field) term112110).setAccessible(true);
        Object enum221 = ((Field) term112110).get((Object) null);
        term27343 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term27344 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term27357 = (char[]) newCharArray(8);
        int[] term27367 = (int[]) newIntArray(6);
        Object term27399 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term27400 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27401 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term27402 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27425 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term27435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27442 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27447 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27455 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term27456 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27461 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27344, term27344.getClass(), "string", "HxCEzaCcgj");
        setCharElement(term27357, 0, 'b');
        setCharElement(term27357, 1, 'S');
        setCharElement(term27357, 2, 'Q');
        setCharElement(term27357, 3, 'Y');
        setCharElement(term27357, 4, 'B');
        setCharElement(term27357, 5, 'e');
        setCharElement(term27357, 6, 'p');
        setCharElement(term27357, 7, 'C');
        setField(term27344, term27344.getClass(), "stringBuffer", term27357);
        setIntField(term27344, term27344.getClass(), "stringBufferTop", 1734759369);
        setIntElement(term27367, 0, 1841493736);
        setIntElement(term27367, 1, 320739944);
        setIntElement(term27367, 2, 760218111);
        setIntElement(term27367, 3, -1986366126);
        setIntElement(term27367, 4, -1963228619);
        setIntElement(term27367, 5, -709868952);
        setField(term27344, term27344.getClass(), "ungetBuffer", term27367);
        setIntField(term27344, term27344.getClass(), "ungetCursor", 847207929);
        setBooleanField(term27344, term27344.getClass(), "hitEOF", true);
        setIntField(term27344, term27344.getClass(), "lineStart", -1665928103);
        setIntField(term27344, term27344.getClass(), "lineEndChar", 1574458332);
        setIntField(term27344, term27344.getClass(), "lineno", -975856245);
        setIntField(term27344, term27344.getClass(), "charno", -1023366103);
        setIntField(term27344, term27344.getClass(), "initCharno", 81427089);
        setIntField(term27344, term27344.getClass(), "initLineno", 755951489);
        setField(term27344, term27344.getClass(), "sourceString", "PDYPOQncAB");
        setIntField(term27344, term27344.getClass(), "sourceEnd", 1175146356);
        setIntField(term27344, term27344.getClass(), "sourceCursor", -2137419728);
        setIntField(term27344, term27344.getClass(), "cursor", 1558810715);
        setIntField(term27344, term27344.getClass(), "tokenBeg", -382652403);
        setIntField(term27344, term27344.getClass(), "tokenEnd", -2126539433);
        setField(term27343, term27343.getClass(), "stream", term27344);
        setField(term27402, term27402.getClass(), "root", null);
        setField(term27402, term27402.getClass(), "sourceName", null);
        setField(term27401, term27401.getClass(), "baseType", term27402);
        setField(term27401, term27401.getClass(), "extendedInterfaces", term27403);
        setField(term27401, term27401.getClass(), "implementedInterfaces", term27406);
        setField(term27401, term27401.getClass(), "parameters", term27409);
        setField(term27401, term27401.getClass(), "thrownTypes", term27414);
        setField(term27401, term27401.getClass(), "templateTypeName", "");
        setField(term27401, term27401.getClass(), "description", "");
        setField(term27401, term27401.getClass(), "meaning", "");
        setField(term27401, term27401.getClass(), "deprecated", "");
        setField(term27401, term27401.getClass(), "license", "");
        setField(term27401, term27401.getClass(), "suppressions", term27422);
        setField(term27401, term27401.getClass(), "modifies", term27423);
        setField(term27401, term27401.getClass(), "lendsName", "");
        setField(term27400, term27400.getClass(), "info", term27401);
        setField(term27425, term27425.getClass(), "sourceComment", "");
        setField(term27425, term27425.getClass(), "markers", term27427);
        setField(term27425, term27425.getClass(), "parameters", term27430);
        setField(term27425, term27425.getClass(), "throwsDescriptions", null);
        setField(term27425, term27425.getClass(), "blockDescription", null);
        setField(term27425, term27425.getClass(), "fileOverview", null);
        setField(term27425, term27425.getClass(), "returnDescription", null);
        setField(term27425, term27425.getClass(), "version", null);
        setField(term27425, term27425.getClass(), "authors", null);
        setField(term27425, term27425.getClass(), "sees", null);
        setField(term27400, term27400.getClass(), "documentation", term27425);
        setIntField(term27435, term27435.getClass(), "type", 0);
        setField(term27435, term27435.getClass(), "next", null);
        setField(term27435, term27435.getClass(), "first", null);
        setField(term27435, term27435.getClass(), "last", null);
        setField(term27435, term27435.getClass(), "propListHead", null);
        setIntField(term27435, term27435.getClass(), "sourcePosition", 0);
        setField(term27435, term27435.getClass(), "jsType", null);
        setField(term27435, term27435.getClass(), "parent", null);
        setField(term27400, term27400.getClass(), "associatedNode", term27435);
        setField(term27400, term27400.getClass(), "visibility", enum221);
        setIntField(term27400, term27400.getClass(), "bitset", -1763480506);
        setIntField(term27443, term27443.getClass(), "type", -1808638031);
        setField(term27443, term27443.getClass(), "next", null);
        setField(term27443, term27443.getClass(), "first", null);
        setField(term27443, term27443.getClass(), "last", term27435);
        setField(term27443, term27443.getClass(), "propListHead", null);
        setIntField(term27443, term27443.getClass(), "sourcePosition", 0);
        setField(term27443, term27443.getClass(), "jsType", null);
        setField(term27443, term27443.getClass(), "parent", null);
        setField(term27442, term27442.getClass(), "root", term27443);
        setField(term27442, term27442.getClass(), "sourceName", "");
        setField(term27400, term27400.getClass(), "type", term27442);
        setIntField(term27448, term27448.getClass(), "type", 0);
        setField(term27448, term27448.getClass(), "next", null);
        setField(term27448, term27448.getClass(), "first", null);
        setField(term27448, term27448.getClass(), "last", null);
        setField(term27448, term27448.getClass(), "propListHead", null);
        setIntField(term27448, term27448.getClass(), "sourcePosition", 0);
        setField(term27448, term27448.getClass(), "jsType", null);
        setField(term27448, term27448.getClass(), "parent", null);
        setField(term27447, term27447.getClass(), "root", term27448);
        setField(term27447, term27447.getClass(), "sourceName", "");
        setField(term27400, term27400.getClass(), "thisType", term27447);
        setBooleanField(term27400, term27400.getClass(), "includeDocumentation", false);
        setField(term27399, term27399.getClass(), "currentInfo", term27400);
        setBooleanField(term27399, term27399.getClass(), "populated", true);
        setBooleanField(term27399, term27399.getClass(), "parseDocumentation", true);
        setField(term27456, term27456.getClass(), "item", null);
        setIntField(term27456, term27456.getClass(), "startLineno", 0);
        setIntField(term27456, term27456.getClass(), "startCharno", 0);
        setIntField(term27456, term27456.getClass(), "endLineno", 0);
        setIntField(term27456, term27456.getClass(), "endCharno", 0);
        setField(term27455, term27455.getClass(), "annotation", term27456);
        setField(term27461, term27461.getClass(), "item", null);
        setIntField(term27461, term27461.getClass(), "startLineno", 0);
        setIntField(term27461, term27461.getClass(), "startCharno", 0);
        setIntField(term27461, term27461.getClass(), "endLineno", 0);
        setIntField(term27461, term27461.getClass(), "endCharno", 0);
        setField(term27455, term27455.getClass(), "name", term27461);
        setField(term27455, term27455.getClass(), "nameNode", null);
        setField(term27455, term27455.getClass(), "description", null);
        setField(term27455, term27455.getClass(), "type", null);
        setField(term27399, term27399.getClass(), "currentMarker", term27455);
        setField(term27343, term27343.getClass(), "jsdocBuilder", term27399);
        setField(term27343, term27343.getClass(), "sourceFile", null);
        setIntField(term27466, term27466.getClass(), "type", 0);
        setField(term27466, term27466.getClass(), "next", null);
        setField(term27466, term27466.getClass(), "first", null);
        setField(term27466, term27466.getClass(), "last", null);
        setField(term27466, term27466.getClass(), "propListHead", null);
        setIntField(term27466, term27466.getClass(), "sourcePosition", 0);
        setField(term27466, term27466.getClass(), "jsType", null);
        setField(term27466, term27466.getClass(), "parent", null);
        setField(term27343, term27343.getClass(), "associatedNode", term27466);
        setField(term27343, term27343.getClass(), "errorReporter", null);
        setField(term27343, term27343.getClass(), "parser", null);
        setField(term27343, term27343.getClass(), "templateNode", null);
        setField(term27343, term27343.getClass(), "fileOverviewJSDocInfo", null);
        setField(term27343, term27343.getClass(), "state", null);
        setField(term27343, term27343.getClass(), "annotationNames", null);
        setField(term27343, term27343.getClass(), "suppressionNames", null);
        setField(term27343, term27343.getClass(), "fileLevelJsDocBuilder", null);
        setField(term27343, term27343.getClass(), "unreadToken", null);
        term27481 = new Integer(-1541297110);
        term27483 = new Integer(-1581464804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "hrFtgdcZKS";
        args[1] = term27481;
        args[2] = term27483;
        try {
            callMethod(klass, "newStringNode", argTypes, term27343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


