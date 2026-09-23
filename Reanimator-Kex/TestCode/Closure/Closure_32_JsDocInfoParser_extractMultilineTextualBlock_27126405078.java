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

public class JsDocInfoParser_extractMultilineTextualBlock_27126405078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11488;
     Object enum177;
     Object enum178;

    public JsDocInfoParser_extractMultilineTextualBlock_27126405078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11536 = new ArrayList();
        ((ArrayList) term11536).add((Object)null);
        ((ArrayList) term11536).add((Object)null);
        ((ArrayList) term11536).add((Object)null);
        ArrayList term11539 = new ArrayList();
        HashMap term11542 = new HashMap();
        ArrayList term11547 = new ArrayList();
        HashSet term11555 = new HashSet();
        HashSet term11556 = new HashSet();
        ArrayList term11560 = new ArrayList();
        ((ArrayList) term11560).add((Object)null);
        ((ArrayList) term11560).add((Object)null);
        ((ArrayList) term11560).add((Object)null);
        ((ArrayList) term11560).add((Object)null);
        ((ArrayList) term11560).add((Object)null);
        ((ArrayList) term11560).add((Object)null);
        HashMap term11563 = new HashMap();
        Class<? extends Object> term88416 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term88415 = ((Class) term88416).getDeclaredField((String) "PROTECTED");
        ((Field) term88415).setAccessible(true);
        Object enum176 = ((Field) term88415).get((Object) null);
        term11488 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term11489 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term11502 = (char[]) newCharArray(2);
        int[] term11506 = (int[]) newIntArray(0);
        Object term11532 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term11533 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11534 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11535 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11558 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11584 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11585 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11589 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term11590 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term11595 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term11600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11489, term11489.getClass(), "string", "fbnKvthhOz");
        setCharElement(term11502, 0, 'G');
        setCharElement(term11502, 1, 'Y');
        setField(term11489, term11489.getClass(), "stringBuffer", term11502);
        setIntField(term11489, term11489.getClass(), "stringBufferTop", 812570053);
        setField(term11489, term11489.getClass(), "ungetBuffer", term11506);
        setIntField(term11489, term11489.getClass(), "ungetCursor", -1488938905);
        setBooleanField(term11489, term11489.getClass(), "hitEOF", false);
        setIntField(term11489, term11489.getClass(), "lineStart", 1916544127);
        setIntField(term11489, term11489.getClass(), "lineEndChar", -1133405894);
        setIntField(term11489, term11489.getClass(), "lineno", 1289741214);
        setIntField(term11489, term11489.getClass(), "charno", 243280944);
        setIntField(term11489, term11489.getClass(), "initCharno", -726681073);
        setIntField(term11489, term11489.getClass(), "initLineno", -1724487863);
        setField(term11489, term11489.getClass(), "sourceString", "PGfCDJTBek");
        setIntField(term11489, term11489.getClass(), "sourceEnd", -128490829);
        setIntField(term11489, term11489.getClass(), "sourceCursor", 202214133);
        setIntField(term11489, term11489.getClass(), "cursor", 1543091617);
        setIntField(term11489, term11489.getClass(), "tokenBeg", -763166094);
        setIntField(term11489, term11489.getClass(), "tokenEnd", -222941705);
        setField(term11488, term11488.getClass(), "stream", term11489);
        setField(term11535, term11535.getClass(), "root", null);
        setField(term11535, term11535.getClass(), "sourceName", null);
        setField(term11534, term11534.getClass(), "baseType", term11535);
        setField(term11534, term11534.getClass(), "extendedInterfaces", term11536);
        setField(term11534, term11534.getClass(), "implementedInterfaces", term11539);
        setField(term11534, term11534.getClass(), "parameters", term11542);
        setField(term11534, term11534.getClass(), "thrownTypes", term11547);
        setField(term11534, term11534.getClass(), "templateTypeName", "");
        setField(term11534, term11534.getClass(), "description", "");
        setField(term11534, term11534.getClass(), "meaning", "");
        setField(term11534, term11534.getClass(), "deprecated", "");
        setField(term11534, term11534.getClass(), "license", "");
        setField(term11534, term11534.getClass(), "suppressions", term11555);
        setField(term11534, term11534.getClass(), "modifies", term11556);
        setField(term11534, term11534.getClass(), "lendsName", "");
        setField(term11533, term11533.getClass(), "info", term11534);
        setField(term11558, term11558.getClass(), "sourceComment", "");
        setField(term11558, term11558.getClass(), "markers", term11560);
        setField(term11558, term11558.getClass(), "parameters", term11563);
        setField(term11558, term11558.getClass(), "throwsDescriptions", null);
        setField(term11558, term11558.getClass(), "blockDescription", null);
        setField(term11558, term11558.getClass(), "fileOverview", null);
        setField(term11558, term11558.getClass(), "returnDescription", null);
        setField(term11558, term11558.getClass(), "version", null);
        setField(term11558, term11558.getClass(), "authors", null);
        setField(term11558, term11558.getClass(), "sees", null);
        setField(term11533, term11533.getClass(), "documentation", term11558);
        setIntField(term11568, term11568.getClass(), "type", 723812297);
        setIntField(term11570, term11570.getClass(), "type", 0);
        setField(term11570, term11570.getClass(), "next", null);
        setField(term11570, term11570.getClass(), "first", null);
        setField(term11570, term11570.getClass(), "last", null);
        setField(term11570, term11570.getClass(), "propListHead", null);
        setIntField(term11570, term11570.getClass(), "sourcePosition", 0);
        setField(term11570, term11570.getClass(), "jsType", null);
        setField(term11570, term11570.getClass(), "parent", null);
        setField(term11568, term11568.getClass(), "next", term11570);
        setIntField(term11573, term11573.getClass(), "type", 0);
        setField(term11573, term11573.getClass(), "next", null);
        setField(term11573, term11573.getClass(), "first", null);
        setField(term11573, term11573.getClass(), "last", null);
        setField(term11573, term11573.getClass(), "propListHead", null);
        setIntField(term11573, term11573.getClass(), "sourcePosition", 0);
        setField(term11573, term11573.getClass(), "jsType", null);
        setField(term11573, term11573.getClass(), "parent", null);
        setField(term11568, term11568.getClass(), "first", term11573);
        setIntField(term11576, term11576.getClass(), "type", 0);
        setField(term11576, term11576.getClass(), "next", null);
        setField(term11576, term11576.getClass(), "first", null);
        setField(term11576, term11576.getClass(), "last", null);
        setField(term11576, term11576.getClass(), "propListHead", null);
        setIntField(term11576, term11576.getClass(), "sourcePosition", 0);
        setField(term11576, term11576.getClass(), "jsType", null);
        setField(term11576, term11576.getClass(), "parent", null);
        setField(term11568, term11568.getClass(), "last", term11576);
        setField(term11568, term11568.getClass(), "propListHead", null);
        setIntField(term11568, term11568.getClass(), "sourcePosition", 0);
        setField(term11568, term11568.getClass(), "jsType", null);
        setField(term11568, term11568.getClass(), "parent", null);
        setField(term11533, term11533.getClass(), "associatedNode", term11568);
        setField(term11533, term11533.getClass(), "visibility", enum176);
        setIntField(term11533, term11533.getClass(), "bitset", 1639448749);
        setField(term11584, term11584.getClass(), "root", null);
        setField(term11584, term11584.getClass(), "sourceName", null);
        setField(term11533, term11533.getClass(), "type", term11584);
        setField(term11585, term11585.getClass(), "root", null);
        setField(term11585, term11585.getClass(), "sourceName", null);
        setField(term11533, term11533.getClass(), "thisType", term11585);
        setBooleanField(term11533, term11533.getClass(), "includeDocumentation", false);
        setField(term11532, term11532.getClass(), "currentInfo", term11533);
        setBooleanField(term11532, term11532.getClass(), "populated", false);
        setBooleanField(term11532, term11532.getClass(), "parseDocumentation", true);
        setField(term11590, term11590.getClass(), "item", null);
        setIntField(term11590, term11590.getClass(), "startLineno", 0);
        setIntField(term11590, term11590.getClass(), "startCharno", 0);
        setIntField(term11590, term11590.getClass(), "endLineno", 0);
        setIntField(term11590, term11590.getClass(), "endCharno", 0);
        setField(term11589, term11589.getClass(), "annotation", term11590);
        setField(term11595, term11595.getClass(), "item", null);
        setIntField(term11595, term11595.getClass(), "startLineno", 0);
        setIntField(term11595, term11595.getClass(), "startCharno", 0);
        setIntField(term11595, term11595.getClass(), "endLineno", 0);
        setIntField(term11595, term11595.getClass(), "endCharno", 0);
        setField(term11589, term11589.getClass(), "name", term11595);
        setField(term11589, term11589.getClass(), "nameNode", null);
        setField(term11589, term11589.getClass(), "description", null);
        setField(term11589, term11589.getClass(), "type", null);
        setField(term11532, term11532.getClass(), "currentMarker", term11589);
        setField(term11488, term11488.getClass(), "jsdocBuilder", term11532);
        setField(term11488, term11488.getClass(), "sourceFile", null);
        setIntField(term11600, term11600.getClass(), "type", 0);
        setField(term11600, term11600.getClass(), "next", null);
        setField(term11600, term11600.getClass(), "first", null);
        setField(term11600, term11600.getClass(), "last", null);
        setField(term11600, term11600.getClass(), "propListHead", null);
        setIntField(term11600, term11600.getClass(), "sourcePosition", 0);
        setField(term11600, term11600.getClass(), "jsType", null);
        setField(term11600, term11600.getClass(), "parent", null);
        setField(term11488, term11488.getClass(), "associatedNode", term11600);
        setField(term11488, term11488.getClass(), "errorReporter", null);
        setField(term11488, term11488.getClass(), "parser", null);
        setField(term11488, term11488.getClass(), "templateNode", null);
        setField(term11488, term11488.getClass(), "fileOverviewJSDocInfo", null);
        setField(term11488, term11488.getClass(), "state", null);
        setField(term11488, term11488.getClass(), "annotationNames", null);
        setField(term11488, term11488.getClass(), "suppressionNames", null);
        setField(term11488, term11488.getClass(), "fileLevelJsDocBuilder", null);
        setField(term11488, term11488.getClass(), "unreadToken", null);
        Class<? extends Object> term88690 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term88689 = ((Class) term88690).getDeclaredField((String) "GT");
        ((Field) term88689).setAccessible(true);
        enum177 = ((Field) term88689).get((Object) null);
        Class<? extends Object> term88938 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Field term88937 = ((Class) term88938).getDeclaredField((String) "TRIM");
        ((Field) term88937).setAccessible(true);
        enum178 = ((Field) term88937).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Object[] args = new Object[2];
        args[0] = enum177;
        args[1] = enum178;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term11488, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


