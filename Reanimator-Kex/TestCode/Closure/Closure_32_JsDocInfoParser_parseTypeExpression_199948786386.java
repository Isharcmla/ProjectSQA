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

public class JsDocInfoParser_parseTypeExpression_199948786386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17071;
     Object enum193;

    public JsDocInfoParser_parseTypeExpression_199948786386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17121 = new ArrayList();
        ArrayList term17124 = new ArrayList();
        HashMap term17127 = new HashMap();
        ArrayList term17132 = new ArrayList();
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        ((ArrayList) term17132).add((Object)null);
        HashSet term17140 = new HashSet();
        HashSet term17141 = new HashSet();
        ArrayList term17145 = new ArrayList();
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        ((ArrayList) term17145).add((Object)null);
        HashMap term17148 = new HashMap();
        Class<? extends Object> term98669 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term98668 = ((Class) term98669).getDeclaredField((String) "PROTECTED");
        ((Field) term98668).setAccessible(true);
        Object enum192 = ((Field) term98668).get((Object) null);
        term17071 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term17072 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term17085 = (char[]) newCharArray(3);
        int[] term17090 = (int[]) newIntArray(1);
        Object term17117 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term17118 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term17119 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term17120 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17143 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term17153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17160 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17165 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17173 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term17174 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term17179 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term17184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17072, term17072.getClass(), "string", "KbwxawvYsw");
        setCharElement(term17085, 0, 'g');
        setCharElement(term17085, 1, 'J');
        setCharElement(term17085, 2, 'l');
        setField(term17072, term17072.getClass(), "stringBuffer", term17085);
        setIntField(term17072, term17072.getClass(), "stringBufferTop", -752870423);
        setIntElement(term17090, 0, -1698809299);
        setField(term17072, term17072.getClass(), "ungetBuffer", term17090);
        setIntField(term17072, term17072.getClass(), "ungetCursor", 401512128);
        setBooleanField(term17072, term17072.getClass(), "hitEOF", true);
        setIntField(term17072, term17072.getClass(), "lineStart", -2069930777);
        setIntField(term17072, term17072.getClass(), "lineEndChar", 1543696412);
        setIntField(term17072, term17072.getClass(), "lineno", -1385748168);
        setIntField(term17072, term17072.getClass(), "charno", -270592367);
        setIntField(term17072, term17072.getClass(), "initCharno", 178847646);
        setIntField(term17072, term17072.getClass(), "initLineno", 273590437);
        setField(term17072, term17072.getClass(), "sourceString", "gvjdfHNzOa");
        setIntField(term17072, term17072.getClass(), "sourceEnd", -348612876);
        setIntField(term17072, term17072.getClass(), "sourceCursor", 1302807565);
        setIntField(term17072, term17072.getClass(), "cursor", -838848221);
        setIntField(term17072, term17072.getClass(), "tokenBeg", 1163761623);
        setIntField(term17072, term17072.getClass(), "tokenEnd", 718742281);
        setField(term17071, term17071.getClass(), "stream", term17072);
        setField(term17120, term17120.getClass(), "root", null);
        setField(term17120, term17120.getClass(), "sourceName", null);
        setField(term17119, term17119.getClass(), "baseType", term17120);
        setField(term17119, term17119.getClass(), "extendedInterfaces", term17121);
        setField(term17119, term17119.getClass(), "implementedInterfaces", term17124);
        setField(term17119, term17119.getClass(), "parameters", term17127);
        setField(term17119, term17119.getClass(), "thrownTypes", term17132);
        setField(term17119, term17119.getClass(), "templateTypeName", "");
        setField(term17119, term17119.getClass(), "description", "");
        setField(term17119, term17119.getClass(), "meaning", "");
        setField(term17119, term17119.getClass(), "deprecated", "");
        setField(term17119, term17119.getClass(), "license", "");
        setField(term17119, term17119.getClass(), "suppressions", term17140);
        setField(term17119, term17119.getClass(), "modifies", term17141);
        setField(term17119, term17119.getClass(), "lendsName", "");
        setField(term17118, term17118.getClass(), "info", term17119);
        setField(term17143, term17143.getClass(), "sourceComment", "");
        setField(term17143, term17143.getClass(), "markers", term17145);
        setField(term17143, term17143.getClass(), "parameters", term17148);
        setField(term17143, term17143.getClass(), "throwsDescriptions", null);
        setField(term17143, term17143.getClass(), "blockDescription", null);
        setField(term17143, term17143.getClass(), "fileOverview", null);
        setField(term17143, term17143.getClass(), "returnDescription", null);
        setField(term17143, term17143.getClass(), "version", null);
        setField(term17143, term17143.getClass(), "authors", null);
        setField(term17143, term17143.getClass(), "sees", null);
        setField(term17118, term17118.getClass(), "documentation", term17143);
        setIntField(term17153, term17153.getClass(), "type", 0);
        setField(term17153, term17153.getClass(), "next", null);
        setField(term17153, term17153.getClass(), "first", null);
        setField(term17153, term17153.getClass(), "last", null);
        setField(term17153, term17153.getClass(), "propListHead", null);
        setIntField(term17153, term17153.getClass(), "sourcePosition", 0);
        setField(term17153, term17153.getClass(), "jsType", null);
        setField(term17153, term17153.getClass(), "parent", null);
        setField(term17118, term17118.getClass(), "associatedNode", term17153);
        setField(term17118, term17118.getClass(), "visibility", enum192);
        setIntField(term17118, term17118.getClass(), "bitset", -573608449);
        setIntField(term17161, term17161.getClass(), "type", 777492093);
        setField(term17161, term17161.getClass(), "next", null);
        setField(term17161, term17161.getClass(), "first", null);
        setField(term17161, term17161.getClass(), "last", null);
        setField(term17161, term17161.getClass(), "propListHead", null);
        setIntField(term17161, term17161.getClass(), "sourcePosition", 0);
        setField(term17161, term17161.getClass(), "jsType", null);
        setField(term17161, term17161.getClass(), "parent", null);
        setField(term17160, term17160.getClass(), "root", term17161);
        setField(term17160, term17160.getClass(), "sourceName", "");
        setField(term17118, term17118.getClass(), "type", term17160);
        setIntField(term17166, term17166.getClass(), "type", 0);
        setField(term17166, term17166.getClass(), "next", null);
        setField(term17166, term17166.getClass(), "first", null);
        setField(term17166, term17166.getClass(), "last", null);
        setField(term17166, term17166.getClass(), "propListHead", null);
        setIntField(term17166, term17166.getClass(), "sourcePosition", 0);
        setField(term17166, term17166.getClass(), "jsType", null);
        setField(term17166, term17166.getClass(), "parent", null);
        setField(term17165, term17165.getClass(), "root", term17166);
        setField(term17165, term17165.getClass(), "sourceName", "");
        setField(term17118, term17118.getClass(), "thisType", term17165);
        setBooleanField(term17118, term17118.getClass(), "includeDocumentation", false);
        setField(term17117, term17117.getClass(), "currentInfo", term17118);
        setBooleanField(term17117, term17117.getClass(), "populated", false);
        setBooleanField(term17117, term17117.getClass(), "parseDocumentation", true);
        setField(term17174, term17174.getClass(), "item", null);
        setIntField(term17174, term17174.getClass(), "startLineno", 0);
        setIntField(term17174, term17174.getClass(), "startCharno", 0);
        setIntField(term17174, term17174.getClass(), "endLineno", 0);
        setIntField(term17174, term17174.getClass(), "endCharno", 0);
        setField(term17173, term17173.getClass(), "annotation", term17174);
        setField(term17179, term17179.getClass(), "item", null);
        setIntField(term17179, term17179.getClass(), "startLineno", 0);
        setIntField(term17179, term17179.getClass(), "startCharno", 0);
        setIntField(term17179, term17179.getClass(), "endLineno", 0);
        setIntField(term17179, term17179.getClass(), "endCharno", 0);
        setField(term17173, term17173.getClass(), "name", term17179);
        setField(term17173, term17173.getClass(), "nameNode", null);
        setField(term17173, term17173.getClass(), "description", null);
        setField(term17173, term17173.getClass(), "type", null);
        setField(term17117, term17117.getClass(), "currentMarker", term17173);
        setField(term17071, term17071.getClass(), "jsdocBuilder", term17117);
        setField(term17071, term17071.getClass(), "sourceFile", null);
        setIntField(term17184, term17184.getClass(), "type", 255145822);
        setIntField(term17186, term17186.getClass(), "type", 0);
        setField(term17186, term17186.getClass(), "next", null);
        setField(term17186, term17186.getClass(), "first", null);
        setField(term17186, term17186.getClass(), "last", null);
        setField(term17186, term17186.getClass(), "propListHead", null);
        setIntField(term17186, term17186.getClass(), "sourcePosition", 0);
        setField(term17186, term17186.getClass(), "jsType", null);
        setField(term17186, term17186.getClass(), "parent", null);
        setField(term17184, term17184.getClass(), "next", term17186);
        setIntField(term17189, term17189.getClass(), "type", 0);
        setField(term17189, term17189.getClass(), "next", null);
        setField(term17189, term17189.getClass(), "first", null);
        setField(term17189, term17189.getClass(), "last", null);
        setField(term17189, term17189.getClass(), "propListHead", null);
        setIntField(term17189, term17189.getClass(), "sourcePosition", 0);
        setField(term17189, term17189.getClass(), "jsType", null);
        setField(term17189, term17189.getClass(), "parent", null);
        setField(term17184, term17184.getClass(), "first", term17189);
        setField(term17184, term17184.getClass(), "last", term17166);
        setField(term17184, term17184.getClass(), "propListHead", null);
        setIntField(term17184, term17184.getClass(), "sourcePosition", 0);
        setField(term17184, term17184.getClass(), "jsType", null);
        setField(term17184, term17184.getClass(), "parent", null);
        setField(term17071, term17071.getClass(), "associatedNode", term17184);
        setField(term17071, term17071.getClass(), "errorReporter", null);
        setField(term17071, term17071.getClass(), "parser", null);
        setField(term17071, term17071.getClass(), "templateNode", null);
        setField(term17071, term17071.getClass(), "fileOverviewJSDocInfo", null);
        setField(term17071, term17071.getClass(), "state", null);
        setField(term17071, term17071.getClass(), "annotationNames", null);
        setField(term17071, term17071.getClass(), "suppressionNames", null);
        setField(term17071, term17071.getClass(), "fileLevelJsDocBuilder", null);
        setField(term17071, term17071.getClass(), "unreadToken", null);
        Class<? extends Object> term98943 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term98942 = ((Class) term98943).getDeclaredField((String) "EOL");
        ((Field) term98942).setAccessible(true);
        enum193 = ((Field) term98942).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum193;
        try {
            callMethod(klass, "parseTypeExpression", argTypes, term17071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


