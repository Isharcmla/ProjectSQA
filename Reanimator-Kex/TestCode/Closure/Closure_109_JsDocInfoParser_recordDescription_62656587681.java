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

public class JsDocInfoParser_recordDescription_62656587681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5392;
     Object enum178;

    public JsDocInfoParser_recordDescription_62656587681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5451 = new ArrayList();
        ((ArrayList) term5451).add((Object)null);
        ((ArrayList) term5451).add((Object)null);
        ((ArrayList) term5451).add((Object)null);
        ((ArrayList) term5451).add((Object)null);
        ((ArrayList) term5451).add((Object)null);
        ArrayList term5454 = new ArrayList();
        ((ArrayList) term5454).add((Object)null);
        ((ArrayList) term5454).add((Object)null);
        ((ArrayList) term5454).add((Object)null);
        HashMap term5457 = new HashMap();
        ArrayList term5462 = new ArrayList();
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        ((ArrayList) term5462).add((Object)null);
        HashSet term5465 = new HashSet();
        HashSet term5470 = new HashSet();
        HashSet term5471 = new HashSet();
        ArrayList term5480 = new ArrayList();
        HashMap term5483 = new HashMap();
        Class<? extends Object> term122996 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term122995 = ((Class) term122996).getDeclaredField((String) "PUBLIC");
        ((Field) term122995).setAccessible(true);
        Object enum177 = ((Field) term122995).get((Object) null);
        term5392 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term5393 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term5406 = (char[]) newCharArray(7);
        int[] term5415 = (int[]) newIntArray(6);
        Object term5447 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term5448 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5449 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5450 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5478 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5504 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5506 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5515 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term5516 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term5521 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term5393, term5393.getClass(), "string", "GEJABPlHSI");
        setCharElement(term5406, 0, 'Y');
        setCharElement(term5406, 1, 'F');
        setCharElement(term5406, 2, 's');
        setCharElement(term5406, 3, 'j');
        setCharElement(term5406, 4, 'J');
        setCharElement(term5406, 5, 'C');
        setCharElement(term5406, 6, 'Z');
        setField(term5393, term5393.getClass(), "stringBuffer", term5406);
        setIntField(term5393, term5393.getClass(), "stringBufferTop", 515182546);
        setIntElement(term5415, 0, -936895502);
        setIntElement(term5415, 1, -129547140);
        setIntElement(term5415, 2, 199287428);
        setIntElement(term5415, 3, -1195339592);
        setIntElement(term5415, 4, -376422566);
        setIntElement(term5415, 5, 306847454);
        setField(term5393, term5393.getClass(), "ungetBuffer", term5415);
        setIntField(term5393, term5393.getClass(), "ungetCursor", 1745276158);
        setBooleanField(term5393, term5393.getClass(), "hitEOF", false);
        setIntField(term5393, term5393.getClass(), "lineStart", 2009020256);
        setIntField(term5393, term5393.getClass(), "lineEndChar", 2049577015);
        setIntField(term5393, term5393.getClass(), "lineno", 1236004505);
        setIntField(term5393, term5393.getClass(), "charno", 1050765721);
        setIntField(term5393, term5393.getClass(), "initCharno", 474518942);
        setIntField(term5393, term5393.getClass(), "initLineno", -1656687479);
        setField(term5393, term5393.getClass(), "sourceString", "aQFUvuaYxd");
        setIntField(term5393, term5393.getClass(), "sourceEnd", -249614216);
        setIntField(term5393, term5393.getClass(), "sourceCursor", 1870727665);
        setIntField(term5393, term5393.getClass(), "cursor", -519881101);
        setIntField(term5393, term5393.getClass(), "tokenBeg", -680920524);
        setIntField(term5393, term5393.getClass(), "tokenEnd", -916335264);
        setField(term5392, term5392.getClass(), "stream", term5393);
        setField(term5450, term5450.getClass(), "root", null);
        setField(term5450, term5450.getClass(), "sourceName", null);
        setField(term5449, term5449.getClass(), "baseType", term5450);
        setField(term5449, term5449.getClass(), "extendedInterfaces", term5451);
        setField(term5449, term5449.getClass(), "implementedInterfaces", term5454);
        setField(term5449, term5449.getClass(), "parameters", term5457);
        setField(term5449, term5449.getClass(), "thrownTypes", term5462);
        setField(term5449, term5449.getClass(), "templateTypeNames", null);
        setField(term5449, term5449.getClass(), "disposedParameters", term5465);
        setField(term5449, term5449.getClass(), "description", "");
        setField(term5449, term5449.getClass(), "meaning", "");
        setField(term5449, term5449.getClass(), "deprecated", "");
        setField(term5449, term5449.getClass(), "license", "");
        setField(term5449, term5449.getClass(), "suppressions", term5470);
        setField(term5449, term5449.getClass(), "modifies", term5471);
        setField(term5449, term5449.getClass(), "lendsName", "");
        setBooleanField(term5449, term5449.getClass(), "ngInject", true);
        setBooleanField(term5449, term5449.getClass(), "wizaction", false);
        setBooleanField(term5449, term5449.getClass(), "jaggerInject", true);
        setBooleanField(term5449, term5449.getClass(), "jaggerProvide", false);
        setBooleanField(term5449, term5449.getClass(), "jaggerModule", false);
        setField(term5448, term5448.getClass(), "info", term5449);
        setField(term5478, term5478.getClass(), "sourceComment", "");
        setField(term5478, term5478.getClass(), "markers", term5480);
        setField(term5478, term5478.getClass(), "parameters", term5483);
        setField(term5478, term5478.getClass(), "throwsDescriptions", null);
        setField(term5478, term5478.getClass(), "blockDescription", null);
        setField(term5478, term5478.getClass(), "fileOverview", null);
        setField(term5478, term5478.getClass(), "returnDescription", null);
        setField(term5478, term5478.getClass(), "version", null);
        setField(term5478, term5478.getClass(), "authors", null);
        setField(term5478, term5478.getClass(), "sees", null);
        setField(term5448, term5448.getClass(), "documentation", term5478);
        setIntField(term5488, term5488.getClass(), "type", -1467089634);
        setIntField(term5490, term5490.getClass(), "type", 0);
        setField(term5490, term5490.getClass(), "next", null);
        setField(term5490, term5490.getClass(), "first", null);
        setField(term5490, term5490.getClass(), "last", null);
        setField(term5490, term5490.getClass(), "propListHead", null);
        setIntField(term5490, term5490.getClass(), "sourcePosition", 0);
        setField(term5490, term5490.getClass(), "jsType", null);
        setField(term5490, term5490.getClass(), "parent", null);
        setField(term5488, term5488.getClass(), "next", term5490);
        setIntField(term5493, term5493.getClass(), "type", 0);
        setField(term5493, term5493.getClass(), "next", null);
        setField(term5493, term5493.getClass(), "first", null);
        setField(term5493, term5493.getClass(), "last", null);
        setField(term5493, term5493.getClass(), "propListHead", null);
        setIntField(term5493, term5493.getClass(), "sourcePosition", 0);
        setField(term5493, term5493.getClass(), "jsType", null);
        setField(term5493, term5493.getClass(), "parent", null);
        setField(term5488, term5488.getClass(), "first", term5493);
        setIntField(term5496, term5496.getClass(), "type", 0);
        setField(term5496, term5496.getClass(), "next", null);
        setField(term5496, term5496.getClass(), "first", null);
        setField(term5496, term5496.getClass(), "last", null);
        setField(term5496, term5496.getClass(), "propListHead", null);
        setIntField(term5496, term5496.getClass(), "sourcePosition", 0);
        setField(term5496, term5496.getClass(), "jsType", null);
        setField(term5496, term5496.getClass(), "parent", null);
        setField(term5488, term5488.getClass(), "last", term5496);
        setField(term5488, term5488.getClass(), "propListHead", null);
        setIntField(term5488, term5488.getClass(), "sourcePosition", 0);
        setField(term5488, term5488.getClass(), "jsType", null);
        setField(term5488, term5488.getClass(), "parent", null);
        setField(term5448, term5448.getClass(), "associatedNode", term5488);
        setField(term5448, term5448.getClass(), "visibility", enum177);
        setIntField(term5448, term5448.getClass(), "bitset", 413548937);
        setField(term5504, term5504.getClass(), "root", term5496);
        setField(term5504, term5504.getClass(), "sourceName", "");
        setField(term5448, term5448.getClass(), "type", term5504);
        setIntField(term5507, term5507.getClass(), "type", -43417861);
        setField(term5507, term5507.getClass(), "next", null);
        setField(term5507, term5507.getClass(), "first", null);
        setField(term5507, term5507.getClass(), "last", term5490);
        setField(term5507, term5507.getClass(), "propListHead", null);
        setIntField(term5507, term5507.getClass(), "sourcePosition", 0);
        setField(term5507, term5507.getClass(), "jsType", null);
        setField(term5507, term5507.getClass(), "parent", null);
        setField(term5506, term5506.getClass(), "root", term5507);
        setField(term5506, term5506.getClass(), "sourceName", "");
        setField(term5448, term5448.getClass(), "thisType", term5506);
        setBooleanField(term5448, term5448.getClass(), "includeDocumentation", true);
        setIntField(term5448, term5448.getClass(), "originalCommentPosition", 1901317214);
        setField(term5447, term5447.getClass(), "currentInfo", term5448);
        setBooleanField(term5447, term5447.getClass(), "populated", true);
        setBooleanField(term5447, term5447.getClass(), "parseDocumentation", true);
        setField(term5516, term5516.getClass(), "item", null);
        setIntField(term5516, term5516.getClass(), "startLineno", 0);
        setIntField(term5516, term5516.getClass(), "startCharno", 0);
        setIntField(term5516, term5516.getClass(), "endLineno", 0);
        setIntField(term5516, term5516.getClass(), "endCharno", 0);
        setField(term5515, term5515.getClass(), "annotation", term5516);
        setField(term5521, term5521.getClass(), "item", null);
        setIntField(term5521, term5521.getClass(), "startLineno", 0);
        setIntField(term5521, term5521.getClass(), "startCharno", 0);
        setIntField(term5521, term5521.getClass(), "endLineno", 0);
        setIntField(term5521, term5521.getClass(), "endCharno", 0);
        setField(term5515, term5515.getClass(), "name", term5521);
        setField(term5515, term5515.getClass(), "nameNode", null);
        setField(term5515, term5515.getClass(), "description", null);
        setField(term5515, term5515.getClass(), "type", null);
        setField(term5447, term5447.getClass(), "currentMarker", term5515);
        setField(term5392, term5392.getClass(), "jsdocBuilder", term5447);
        setField(term5392, term5392.getClass(), "sourceFile", null);
        setField(term5392, term5392.getClass(), "associatedNode", term5493);
        setField(term5392, term5392.getClass(), "errorReporter", null);
        setField(term5392, term5392.getClass(), "parser", null);
        setField(term5392, term5392.getClass(), "templateNode", null);
        setField(term5392, term5392.getClass(), "fileOverviewJSDocInfo", null);
        setField(term5392, term5392.getClass(), "state", null);
        setField(term5392, term5392.getClass(), "annotationNames", null);
        setField(term5392, term5392.getClass(), "suppressionNames", null);
        setField(term5392, term5392.getClass(), "fileLevelJsDocBuilder", null);
        setField(term5392, term5392.getClass(), "unreadToken", null);
        Class<? extends Object> term123261 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term123260 = ((Class) term123261).getDeclaredField((String) "ANNOTATION");
        ((Field) term123260).setAccessible(true);
        enum178 = ((Field) term123260).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum178;
        try {
            callMethod(klass, "recordDescription", argTypes, term5392, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


