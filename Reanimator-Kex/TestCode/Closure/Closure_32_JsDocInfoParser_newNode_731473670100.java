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

public class JsDocInfoParser_newNode_731473670100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26488;
     Object term26602;

    public JsDocInfoParser_newNode_731473670100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26542 = new ArrayList();
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ((ArrayList) term26542).add((Object)null);
        ArrayList term26545 = new ArrayList();
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        ((ArrayList) term26545).add((Object)null);
        HashMap term26548 = new HashMap();
        ArrayList term26553 = new ArrayList();
        ((ArrayList) term26553).add((Object)null);
        ((ArrayList) term26553).add((Object)null);
        ((ArrayList) term26553).add((Object)null);
        HashSet term26561 = new HashSet();
        HashSet term26562 = new HashSet();
        ArrayList term26566 = new ArrayList();
        ((ArrayList) term26566).add((Object)null);
        ((ArrayList) term26566).add((Object)null);
        ((ArrayList) term26566).add((Object)null);
        ((ArrayList) term26566).add((Object)null);
        HashMap term26569 = new HashMap();
        Class<? extends Object> term111410 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term111409 = ((Class) term111410).getDeclaredField((String) "INHERITED");
        ((Field) term111409).setAccessible(true);
        Object enum219 = ((Field) term111409).get((Object) null);
        term26488 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term26489 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term26502 = (char[]) newCharArray(6);
        int[] term26510 = (int[]) newIntArray(2);
        Object term26538 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term26539 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26540 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term26541 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term26574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26581 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26583 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26588 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term26589 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term26594 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term26599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26489, term26489.getClass(), "string", "WfUmxdiHcU");
        setCharElement(term26502, 0, 'b');
        setCharElement(term26502, 1, 'c');
        setCharElement(term26502, 2, 'd');
        setCharElement(term26502, 3, 'z');
        setCharElement(term26502, 4, 'j');
        setCharElement(term26502, 5, 'I');
        setField(term26489, term26489.getClass(), "stringBuffer", term26502);
        setIntField(term26489, term26489.getClass(), "stringBufferTop", 1902784843);
        setIntElement(term26510, 0, 2021136615);
        setIntElement(term26510, 1, 1778570695);
        setField(term26489, term26489.getClass(), "ungetBuffer", term26510);
        setIntField(term26489, term26489.getClass(), "ungetCursor", -1142164411);
        setBooleanField(term26489, term26489.getClass(), "hitEOF", true);
        setIntField(term26489, term26489.getClass(), "lineStart", -1619435313);
        setIntField(term26489, term26489.getClass(), "lineEndChar", 1013801066);
        setIntField(term26489, term26489.getClass(), "lineno", 1512541853);
        setIntField(term26489, term26489.getClass(), "charno", -965421502);
        setIntField(term26489, term26489.getClass(), "initCharno", 1319026002);
        setIntField(term26489, term26489.getClass(), "initLineno", -1368173231);
        setField(term26489, term26489.getClass(), "sourceString", "BRrftvRvmF");
        setIntField(term26489, term26489.getClass(), "sourceEnd", 1956006038);
        setIntField(term26489, term26489.getClass(), "sourceCursor", -1062304878);
        setIntField(term26489, term26489.getClass(), "cursor", -1377876610);
        setIntField(term26489, term26489.getClass(), "tokenBeg", -1456184732);
        setIntField(term26489, term26489.getClass(), "tokenEnd", 1689228897);
        setField(term26488, term26488.getClass(), "stream", term26489);
        setField(term26541, term26541.getClass(), "root", null);
        setField(term26541, term26541.getClass(), "sourceName", null);
        setField(term26540, term26540.getClass(), "baseType", term26541);
        setField(term26540, term26540.getClass(), "extendedInterfaces", term26542);
        setField(term26540, term26540.getClass(), "implementedInterfaces", term26545);
        setField(term26540, term26540.getClass(), "parameters", term26548);
        setField(term26540, term26540.getClass(), "thrownTypes", term26553);
        setField(term26540, term26540.getClass(), "templateTypeName", "");
        setField(term26540, term26540.getClass(), "description", "");
        setField(term26540, term26540.getClass(), "meaning", "");
        setField(term26540, term26540.getClass(), "deprecated", "");
        setField(term26540, term26540.getClass(), "license", "");
        setField(term26540, term26540.getClass(), "suppressions", term26561);
        setField(term26540, term26540.getClass(), "modifies", term26562);
        setField(term26540, term26540.getClass(), "lendsName", "");
        setField(term26539, term26539.getClass(), "info", term26540);
        setField(term26564, term26564.getClass(), "sourceComment", "");
        setField(term26564, term26564.getClass(), "markers", term26566);
        setField(term26564, term26564.getClass(), "parameters", term26569);
        setField(term26564, term26564.getClass(), "throwsDescriptions", null);
        setField(term26564, term26564.getClass(), "blockDescription", null);
        setField(term26564, term26564.getClass(), "fileOverview", null);
        setField(term26564, term26564.getClass(), "returnDescription", null);
        setField(term26564, term26564.getClass(), "version", null);
        setField(term26564, term26564.getClass(), "authors", null);
        setField(term26564, term26564.getClass(), "sees", null);
        setField(term26539, term26539.getClass(), "documentation", term26564);
        setIntField(term26574, term26574.getClass(), "type", 0);
        setField(term26574, term26574.getClass(), "next", null);
        setField(term26574, term26574.getClass(), "first", null);
        setField(term26574, term26574.getClass(), "last", null);
        setField(term26574, term26574.getClass(), "propListHead", null);
        setIntField(term26574, term26574.getClass(), "sourcePosition", 0);
        setField(term26574, term26574.getClass(), "jsType", null);
        setField(term26574, term26574.getClass(), "parent", null);
        setField(term26539, term26539.getClass(), "associatedNode", term26574);
        setField(term26539, term26539.getClass(), "visibility", enum219);
        setIntField(term26539, term26539.getClass(), "bitset", 66817373);
        setField(term26581, term26581.getClass(), "root", term26574);
        setField(term26581, term26581.getClass(), "sourceName", "");
        setField(term26539, term26539.getClass(), "type", term26581);
        setField(term26583, term26583.getClass(), "root", term26574);
        setField(term26583, term26583.getClass(), "sourceName", "");
        setField(term26539, term26539.getClass(), "thisType", term26583);
        setBooleanField(term26539, term26539.getClass(), "includeDocumentation", false);
        setField(term26538, term26538.getClass(), "currentInfo", term26539);
        setBooleanField(term26538, term26538.getClass(), "populated", false);
        setBooleanField(term26538, term26538.getClass(), "parseDocumentation", false);
        setField(term26589, term26589.getClass(), "item", null);
        setIntField(term26589, term26589.getClass(), "startLineno", 0);
        setIntField(term26589, term26589.getClass(), "startCharno", 0);
        setIntField(term26589, term26589.getClass(), "endLineno", 0);
        setIntField(term26589, term26589.getClass(), "endCharno", 0);
        setField(term26588, term26588.getClass(), "annotation", term26589);
        setField(term26594, term26594.getClass(), "item", null);
        setIntField(term26594, term26594.getClass(), "startLineno", 0);
        setIntField(term26594, term26594.getClass(), "startCharno", 0);
        setIntField(term26594, term26594.getClass(), "endLineno", 0);
        setIntField(term26594, term26594.getClass(), "endCharno", 0);
        setField(term26588, term26588.getClass(), "name", term26594);
        setField(term26588, term26588.getClass(), "nameNode", null);
        setField(term26588, term26588.getClass(), "description", null);
        setField(term26588, term26588.getClass(), "type", null);
        setField(term26538, term26538.getClass(), "currentMarker", term26588);
        setField(term26488, term26488.getClass(), "jsdocBuilder", term26538);
        setField(term26488, term26488.getClass(), "sourceFile", null);
        setIntField(term26599, term26599.getClass(), "type", 0);
        setField(term26599, term26599.getClass(), "next", null);
        setField(term26599, term26599.getClass(), "first", null);
        setField(term26599, term26599.getClass(), "last", null);
        setField(term26599, term26599.getClass(), "propListHead", null);
        setIntField(term26599, term26599.getClass(), "sourcePosition", 0);
        setField(term26599, term26599.getClass(), "jsType", null);
        setField(term26599, term26599.getClass(), "parent", null);
        setField(term26488, term26488.getClass(), "associatedNode", term26599);
        setField(term26488, term26488.getClass(), "errorReporter", null);
        setField(term26488, term26488.getClass(), "parser", null);
        setField(term26488, term26488.getClass(), "templateNode", null);
        setField(term26488, term26488.getClass(), "fileOverviewJSDocInfo", null);
        setField(term26488, term26488.getClass(), "state", null);
        setField(term26488, term26488.getClass(), "annotationNames", null);
        setField(term26488, term26488.getClass(), "suppressionNames", null);
        setField(term26488, term26488.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26488, term26488.getClass(), "unreadToken", null);
        term26602 = new Integer(1459628013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term26602;
        try {
            callMethod(klass, "newNode", argTypes, term26488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


