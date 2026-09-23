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

public class JsDocInfoParser_lookAheadForType_706854112138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39707;

    public JsDocInfoParser_lookAheadForType_706854112138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39763 = new ArrayList();
        ((ArrayList) term39763).add((Object)null);
        ((ArrayList) term39763).add((Object)null);
        ((ArrayList) term39763).add((Object)null);
        ((ArrayList) term39763).add((Object)null);
        ArrayList term39766 = new ArrayList();
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        ((ArrayList) term39766).add((Object)null);
        HashMap term39769 = new HashMap();
        ArrayList term39774 = new ArrayList();
        ((ArrayList) term39774).add((Object)null);
        ((ArrayList) term39774).add((Object)null);
        ((ArrayList) term39774).add((Object)null);
        ((ArrayList) term39774).add((Object)null);
        ((ArrayList) term39774).add((Object)null);
        HashSet term39777 = new HashSet();
        HashSet term39782 = new HashSet();
        HashSet term39783 = new HashSet();
        ArrayList term39792 = new ArrayList();
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        ((ArrayList) term39792).add((Object)null);
        HashMap term39795 = new HashMap();
        Class<? extends Object> term168346 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term168345 = ((Class) term168346).getDeclaredField((String) "PUBLIC");
        ((Field) term168345).setAccessible(true);
        Object enum279 = ((Field) term168345).get((Object) null);
        term39707 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term39708 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term39721 = (char[]) newCharArray(1);
        int[] term39724 = (int[]) newIntArray(9);
        Object term39759 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term39760 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term39761 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term39762 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term39790 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term39800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39807 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term39808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39812 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term39813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39821 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term39822 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term39827 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term39708, term39708.getClass(), "string", "WVPSokrFPV");
        setCharElement(term39721, 0, 'c');
        setField(term39708, term39708.getClass(), "stringBuffer", term39721);
        setIntField(term39708, term39708.getClass(), "stringBufferTop", -395396657);
        setIntElement(term39724, 0, 1677171453);
        setIntElement(term39724, 1, -2108979704);
        setIntElement(term39724, 2, 1629835601);
        setIntElement(term39724, 3, 1866184476);
        setIntElement(term39724, 4, -17998574);
        setIntElement(term39724, 5, 145080354);
        setIntElement(term39724, 6, -2087321012);
        setIntElement(term39724, 7, -1613074612);
        setIntElement(term39724, 8, 1054908502);
        setField(term39708, term39708.getClass(), "ungetBuffer", term39724);
        setIntField(term39708, term39708.getClass(), "ungetCursor", -1226802566);
        setBooleanField(term39708, term39708.getClass(), "hitEOF", false);
        setIntField(term39708, term39708.getClass(), "lineStart", 1162813858);
        setIntField(term39708, term39708.getClass(), "lineEndChar", 494596414);
        setIntField(term39708, term39708.getClass(), "lineno", 1226377461);
        setIntField(term39708, term39708.getClass(), "charno", -1540486514);
        setIntField(term39708, term39708.getClass(), "initCharno", 1471031478);
        setIntField(term39708, term39708.getClass(), "initLineno", -334716487);
        setField(term39708, term39708.getClass(), "sourceString", "jELmrpQCNf");
        setIntField(term39708, term39708.getClass(), "sourceEnd", -1739012814);
        setIntField(term39708, term39708.getClass(), "sourceCursor", 1989014880);
        setIntField(term39708, term39708.getClass(), "cursor", -330280702);
        setIntField(term39708, term39708.getClass(), "tokenBeg", -1858425735);
        setIntField(term39708, term39708.getClass(), "tokenEnd", 1818274550);
        setField(term39707, term39707.getClass(), "stream", term39708);
        setField(term39762, term39762.getClass(), "root", null);
        setField(term39762, term39762.getClass(), "sourceName", null);
        setField(term39761, term39761.getClass(), "baseType", term39762);
        setField(term39761, term39761.getClass(), "extendedInterfaces", term39763);
        setField(term39761, term39761.getClass(), "implementedInterfaces", term39766);
        setField(term39761, term39761.getClass(), "parameters", term39769);
        setField(term39761, term39761.getClass(), "thrownTypes", term39774);
        setField(term39761, term39761.getClass(), "templateTypeNames", null);
        setField(term39761, term39761.getClass(), "disposedParameters", term39777);
        setField(term39761, term39761.getClass(), "description", "");
        setField(term39761, term39761.getClass(), "meaning", "");
        setField(term39761, term39761.getClass(), "deprecated", "");
        setField(term39761, term39761.getClass(), "license", "");
        setField(term39761, term39761.getClass(), "suppressions", term39782);
        setField(term39761, term39761.getClass(), "modifies", term39783);
        setField(term39761, term39761.getClass(), "lendsName", "");
        setBooleanField(term39761, term39761.getClass(), "ngInject", false);
        setBooleanField(term39761, term39761.getClass(), "wizaction", false);
        setBooleanField(term39761, term39761.getClass(), "jaggerInject", false);
        setBooleanField(term39761, term39761.getClass(), "jaggerProvide", true);
        setBooleanField(term39761, term39761.getClass(), "jaggerModule", false);
        setField(term39760, term39760.getClass(), "info", term39761);
        setField(term39790, term39790.getClass(), "sourceComment", "");
        setField(term39790, term39790.getClass(), "markers", term39792);
        setField(term39790, term39790.getClass(), "parameters", term39795);
        setField(term39790, term39790.getClass(), "throwsDescriptions", null);
        setField(term39790, term39790.getClass(), "blockDescription", null);
        setField(term39790, term39790.getClass(), "fileOverview", null);
        setField(term39790, term39790.getClass(), "returnDescription", null);
        setField(term39790, term39790.getClass(), "version", null);
        setField(term39790, term39790.getClass(), "authors", null);
        setField(term39790, term39790.getClass(), "sees", null);
        setField(term39760, term39760.getClass(), "documentation", term39790);
        setIntField(term39800, term39800.getClass(), "type", 0);
        setField(term39800, term39800.getClass(), "next", null);
        setField(term39800, term39800.getClass(), "first", null);
        setField(term39800, term39800.getClass(), "last", null);
        setField(term39800, term39800.getClass(), "propListHead", null);
        setIntField(term39800, term39800.getClass(), "sourcePosition", 0);
        setField(term39800, term39800.getClass(), "jsType", null);
        setField(term39800, term39800.getClass(), "parent", null);
        setField(term39760, term39760.getClass(), "associatedNode", term39800);
        setField(term39760, term39760.getClass(), "visibility", enum279);
        setIntField(term39760, term39760.getClass(), "bitset", 950783153);
        setIntField(term39808, term39808.getClass(), "type", 0);
        setField(term39808, term39808.getClass(), "next", null);
        setField(term39808, term39808.getClass(), "first", null);
        setField(term39808, term39808.getClass(), "last", null);
        setField(term39808, term39808.getClass(), "propListHead", null);
        setIntField(term39808, term39808.getClass(), "sourcePosition", 0);
        setField(term39808, term39808.getClass(), "jsType", null);
        setField(term39808, term39808.getClass(), "parent", null);
        setField(term39807, term39807.getClass(), "root", term39808);
        setField(term39807, term39807.getClass(), "sourceName", "");
        setField(term39760, term39760.getClass(), "type", term39807);
        setIntField(term39813, term39813.getClass(), "type", -1365904757);
        setField(term39813, term39813.getClass(), "next", null);
        setField(term39813, term39813.getClass(), "first", null);
        setField(term39813, term39813.getClass(), "last", null);
        setField(term39813, term39813.getClass(), "propListHead", null);
        setIntField(term39813, term39813.getClass(), "sourcePosition", 0);
        setField(term39813, term39813.getClass(), "jsType", null);
        setField(term39813, term39813.getClass(), "parent", null);
        setField(term39812, term39812.getClass(), "root", term39813);
        setField(term39812, term39812.getClass(), "sourceName", "");
        setField(term39760, term39760.getClass(), "thisType", term39812);
        setBooleanField(term39760, term39760.getClass(), "includeDocumentation", true);
        setIntField(term39760, term39760.getClass(), "originalCommentPosition", -801175078);
        setField(term39759, term39759.getClass(), "currentInfo", term39760);
        setBooleanField(term39759, term39759.getClass(), "populated", false);
        setBooleanField(term39759, term39759.getClass(), "parseDocumentation", true);
        setField(term39822, term39822.getClass(), "item", null);
        setIntField(term39822, term39822.getClass(), "startLineno", 0);
        setIntField(term39822, term39822.getClass(), "startCharno", 0);
        setIntField(term39822, term39822.getClass(), "endLineno", 0);
        setIntField(term39822, term39822.getClass(), "endCharno", 0);
        setField(term39821, term39821.getClass(), "annotation", term39822);
        setField(term39827, term39827.getClass(), "item", null);
        setIntField(term39827, term39827.getClass(), "startLineno", 0);
        setIntField(term39827, term39827.getClass(), "startCharno", 0);
        setIntField(term39827, term39827.getClass(), "endLineno", 0);
        setIntField(term39827, term39827.getClass(), "endCharno", 0);
        setField(term39821, term39821.getClass(), "name", term39827);
        setField(term39821, term39821.getClass(), "nameNode", null);
        setField(term39821, term39821.getClass(), "description", null);
        setField(term39821, term39821.getClass(), "type", null);
        setField(term39759, term39759.getClass(), "currentMarker", term39821);
        setField(term39707, term39707.getClass(), "jsdocBuilder", term39759);
        setField(term39707, term39707.getClass(), "sourceFile", null);
        setField(term39707, term39707.getClass(), "associatedNode", term39813);
        setField(term39707, term39707.getClass(), "errorReporter", null);
        setField(term39707, term39707.getClass(), "parser", null);
        setField(term39707, term39707.getClass(), "templateNode", null);
        setField(term39707, term39707.getClass(), "fileOverviewJSDocInfo", null);
        setField(term39707, term39707.getClass(), "state", null);
        setField(term39707, term39707.getClass(), "annotationNames", null);
        setField(term39707, term39707.getClass(), "suppressionNames", null);
        setField(term39707, term39707.getClass(), "fileLevelJsDocBuilder", null);
        setField(term39707, term39707.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lookAheadForType", argTypes, term39707, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


