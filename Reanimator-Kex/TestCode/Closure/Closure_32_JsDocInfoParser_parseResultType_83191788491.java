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

public class JsDocInfoParser_parseResultType_83191788491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20519;
     Object enum203;

    public JsDocInfoParser_parseResultType_83191788491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20571 = new ArrayList();
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ((ArrayList) term20571).add((Object)null);
        ArrayList term20574 = new ArrayList();
        ((ArrayList) term20574).add((Object)null);
        ((ArrayList) term20574).add((Object)null);
        ((ArrayList) term20574).add((Object)null);
        ((ArrayList) term20574).add((Object)null);
        HashMap term20577 = new HashMap();
        ArrayList term20582 = new ArrayList();
        ((ArrayList) term20582).add((Object)null);
        ((ArrayList) term20582).add((Object)null);
        HashSet term20590 = new HashSet();
        HashSet term20591 = new HashSet();
        ArrayList term20595 = new ArrayList();
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        ((ArrayList) term20595).add((Object)null);
        HashMap term20598 = new HashMap();
        Class<? extends Object> term106440 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term106439 = ((Class) term106440).getDeclaredField((String) "INHERITED");
        ((Field) term106439).setAccessible(true);
        Object enum202 = ((Field) term106439).get((Object) null);
        term20519 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term20520 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term20533 = (char[]) newCharArray(4);
        int[] term20539 = (int[]) newIntArray(2);
        Object term20567 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term20568 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20569 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term20570 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20593 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term20603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20619 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20624 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20632 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term20633 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term20638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term20520, term20520.getClass(), "string", "laTITSWZuc");
        setCharElement(term20533, 0, 'p');
        setCharElement(term20533, 1, 'a');
        setCharElement(term20533, 2, 'H');
        setCharElement(term20533, 3, 'E');
        setField(term20520, term20520.getClass(), "stringBuffer", term20533);
        setIntField(term20520, term20520.getClass(), "stringBufferTop", -365784998);
        setIntElement(term20539, 0, -1893236300);
        setIntElement(term20539, 1, -1858909368);
        setField(term20520, term20520.getClass(), "ungetBuffer", term20539);
        setIntField(term20520, term20520.getClass(), "ungetCursor", -280113263);
        setBooleanField(term20520, term20520.getClass(), "hitEOF", false);
        setIntField(term20520, term20520.getClass(), "lineStart", 529625347);
        setIntField(term20520, term20520.getClass(), "lineEndChar", 1409095253);
        setIntField(term20520, term20520.getClass(), "lineno", 315179039);
        setIntField(term20520, term20520.getClass(), "charno", -1835923897);
        setIntField(term20520, term20520.getClass(), "initCharno", -341287775);
        setIntField(term20520, term20520.getClass(), "initLineno", -1651110911);
        setField(term20520, term20520.getClass(), "sourceString", "fkzRpxlAqS");
        setIntField(term20520, term20520.getClass(), "sourceEnd", -1934033808);
        setIntField(term20520, term20520.getClass(), "sourceCursor", 950322609);
        setIntField(term20520, term20520.getClass(), "cursor", -2023791789);
        setIntField(term20520, term20520.getClass(), "tokenBeg", 353974456);
        setIntField(term20520, term20520.getClass(), "tokenEnd", -485108462);
        setField(term20519, term20519.getClass(), "stream", term20520);
        setField(term20570, term20570.getClass(), "root", null);
        setField(term20570, term20570.getClass(), "sourceName", null);
        setField(term20569, term20569.getClass(), "baseType", term20570);
        setField(term20569, term20569.getClass(), "extendedInterfaces", term20571);
        setField(term20569, term20569.getClass(), "implementedInterfaces", term20574);
        setField(term20569, term20569.getClass(), "parameters", term20577);
        setField(term20569, term20569.getClass(), "thrownTypes", term20582);
        setField(term20569, term20569.getClass(), "templateTypeName", "");
        setField(term20569, term20569.getClass(), "description", "");
        setField(term20569, term20569.getClass(), "meaning", "");
        setField(term20569, term20569.getClass(), "deprecated", "");
        setField(term20569, term20569.getClass(), "license", "");
        setField(term20569, term20569.getClass(), "suppressions", term20590);
        setField(term20569, term20569.getClass(), "modifies", term20591);
        setField(term20569, term20569.getClass(), "lendsName", "");
        setField(term20568, term20568.getClass(), "info", term20569);
        setField(term20593, term20593.getClass(), "sourceComment", "");
        setField(term20593, term20593.getClass(), "markers", term20595);
        setField(term20593, term20593.getClass(), "parameters", term20598);
        setField(term20593, term20593.getClass(), "throwsDescriptions", null);
        setField(term20593, term20593.getClass(), "blockDescription", null);
        setField(term20593, term20593.getClass(), "fileOverview", null);
        setField(term20593, term20593.getClass(), "returnDescription", null);
        setField(term20593, term20593.getClass(), "version", null);
        setField(term20593, term20593.getClass(), "authors", null);
        setField(term20593, term20593.getClass(), "sees", null);
        setField(term20568, term20568.getClass(), "documentation", term20593);
        setIntField(term20603, term20603.getClass(), "type", 1136393691);
        setIntField(term20605, term20605.getClass(), "type", 0);
        setField(term20605, term20605.getClass(), "next", null);
        setField(term20605, term20605.getClass(), "first", null);
        setField(term20605, term20605.getClass(), "last", null);
        setField(term20605, term20605.getClass(), "propListHead", null);
        setIntField(term20605, term20605.getClass(), "sourcePosition", 0);
        setField(term20605, term20605.getClass(), "jsType", null);
        setField(term20605, term20605.getClass(), "parent", null);
        setField(term20603, term20603.getClass(), "next", term20605);
        setIntField(term20608, term20608.getClass(), "type", 0);
        setField(term20608, term20608.getClass(), "next", null);
        setField(term20608, term20608.getClass(), "first", null);
        setField(term20608, term20608.getClass(), "last", null);
        setField(term20608, term20608.getClass(), "propListHead", null);
        setIntField(term20608, term20608.getClass(), "sourcePosition", 0);
        setField(term20608, term20608.getClass(), "jsType", null);
        setField(term20608, term20608.getClass(), "parent", null);
        setField(term20603, term20603.getClass(), "first", term20608);
        setIntField(term20611, term20611.getClass(), "type", 0);
        setField(term20611, term20611.getClass(), "next", null);
        setField(term20611, term20611.getClass(), "first", null);
        setField(term20611, term20611.getClass(), "last", null);
        setField(term20611, term20611.getClass(), "propListHead", null);
        setIntField(term20611, term20611.getClass(), "sourcePosition", 0);
        setField(term20611, term20611.getClass(), "jsType", null);
        setField(term20611, term20611.getClass(), "parent", null);
        setField(term20603, term20603.getClass(), "last", term20611);
        setField(term20603, term20603.getClass(), "propListHead", null);
        setIntField(term20603, term20603.getClass(), "sourcePosition", 0);
        setField(term20603, term20603.getClass(), "jsType", null);
        setField(term20603, term20603.getClass(), "parent", null);
        setField(term20568, term20568.getClass(), "associatedNode", term20603);
        setField(term20568, term20568.getClass(), "visibility", enum202);
        setIntField(term20568, term20568.getClass(), "bitset", -1288536479);
        setIntField(term20620, term20620.getClass(), "type", -626779272);
        setField(term20620, term20620.getClass(), "next", null);
        setField(term20620, term20620.getClass(), "first", null);
        setField(term20620, term20620.getClass(), "last", term20605);
        setField(term20620, term20620.getClass(), "propListHead", null);
        setIntField(term20620, term20620.getClass(), "sourcePosition", 0);
        setField(term20620, term20620.getClass(), "jsType", null);
        setField(term20620, term20620.getClass(), "parent", null);
        setField(term20619, term20619.getClass(), "root", term20620);
        setField(term20619, term20619.getClass(), "sourceName", "");
        setField(term20568, term20568.getClass(), "type", term20619);
        setIntField(term20625, term20625.getClass(), "type", 0);
        setField(term20625, term20625.getClass(), "next", null);
        setField(term20625, term20625.getClass(), "first", null);
        setField(term20625, term20625.getClass(), "last", null);
        setField(term20625, term20625.getClass(), "propListHead", null);
        setIntField(term20625, term20625.getClass(), "sourcePosition", 0);
        setField(term20625, term20625.getClass(), "jsType", null);
        setField(term20625, term20625.getClass(), "parent", null);
        setField(term20624, term20624.getClass(), "root", term20625);
        setField(term20624, term20624.getClass(), "sourceName", "");
        setField(term20568, term20568.getClass(), "thisType", term20624);
        setBooleanField(term20568, term20568.getClass(), "includeDocumentation", false);
        setField(term20567, term20567.getClass(), "currentInfo", term20568);
        setBooleanField(term20567, term20567.getClass(), "populated", false);
        setBooleanField(term20567, term20567.getClass(), "parseDocumentation", false);
        setField(term20633, term20633.getClass(), "item", null);
        setIntField(term20633, term20633.getClass(), "startLineno", 0);
        setIntField(term20633, term20633.getClass(), "startCharno", 0);
        setIntField(term20633, term20633.getClass(), "endLineno", 0);
        setIntField(term20633, term20633.getClass(), "endCharno", 0);
        setField(term20632, term20632.getClass(), "annotation", term20633);
        setField(term20638, term20638.getClass(), "item", null);
        setIntField(term20638, term20638.getClass(), "startLineno", 0);
        setIntField(term20638, term20638.getClass(), "startCharno", 0);
        setIntField(term20638, term20638.getClass(), "endLineno", 0);
        setIntField(term20638, term20638.getClass(), "endCharno", 0);
        setField(term20632, term20632.getClass(), "name", term20638);
        setField(term20632, term20632.getClass(), "nameNode", null);
        setField(term20632, term20632.getClass(), "description", null);
        setField(term20632, term20632.getClass(), "type", null);
        setField(term20567, term20567.getClass(), "currentMarker", term20632);
        setField(term20519, term20519.getClass(), "jsdocBuilder", term20567);
        setField(term20519, term20519.getClass(), "sourceFile", null);
        setField(term20519, term20519.getClass(), "associatedNode", term20608);
        setField(term20519, term20519.getClass(), "errorReporter", null);
        setField(term20519, term20519.getClass(), "parser", null);
        setField(term20519, term20519.getClass(), "templateNode", null);
        setField(term20519, term20519.getClass(), "fileOverviewJSDocInfo", null);
        setField(term20519, term20519.getClass(), "state", null);
        setField(term20519, term20519.getClass(), "annotationNames", null);
        setField(term20519, term20519.getClass(), "suppressionNames", null);
        setField(term20519, term20519.getClass(), "fileLevelJsDocBuilder", null);
        setField(term20519, term20519.getClass(), "unreadToken", null);
        Class<? extends Object> term106714 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term106713 = ((Class) term106714).getDeclaredField((String) "ANNOTATION");
        ((Field) term106713).setAccessible(true);
        enum203 = ((Field) term106713).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum203;
        try {
            callMethod(klass, "parseResultType", argTypes, term20519, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


