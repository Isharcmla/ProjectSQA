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

public class JsDocInfoParser_extractSingleLineBlock_146000636076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10390;

    public JsDocInfoParser_extractSingleLineBlock_146000636076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10444 = new ArrayList();
        ArrayList term10447 = new ArrayList();
        ((ArrayList) term10447).add((Object)null);
        HashMap term10450 = new HashMap();
        ArrayList term10455 = new ArrayList();
        ((ArrayList) term10455).add((Object)null);
        ((ArrayList) term10455).add((Object)null);
        ((ArrayList) term10455).add((Object)null);
        HashSet term10463 = new HashSet();
        HashSet term10464 = new HashSet();
        ArrayList term10468 = new ArrayList();
        ((ArrayList) term10468).add((Object)null);
        ((ArrayList) term10468).add((Object)null);
        ((ArrayList) term10468).add((Object)null);
        HashMap term10471 = new HashMap();
        Class<? extends Object> term86669 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term86668 = ((Class) term86669).getDeclaredField((String) "PUBLIC");
        ((Field) term86668).setAccessible(true);
        Object enum171 = ((Field) term86668).get((Object) null);
        term10390 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term10391 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term10404 = (char[]) newCharArray(5);
        int[] term10411 = (int[]) newIntArray(3);
        Object term10440 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term10441 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10442 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10443 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10466 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10483 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10484 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10488 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term10489 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term10494 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term10499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10391, term10391.getClass(), "string", "LrqwfrKKtS");
        setCharElement(term10404, 0, 'O');
        setCharElement(term10404, 1, 'Q');
        setCharElement(term10404, 2, 'T');
        setCharElement(term10404, 3, 'y');
        setCharElement(term10404, 4, 'S');
        setField(term10391, term10391.getClass(), "stringBuffer", term10404);
        setIntField(term10391, term10391.getClass(), "stringBufferTop", 1496340209);
        setIntElement(term10411, 0, -1748391876);
        setIntElement(term10411, 1, 43258317);
        setIntElement(term10411, 2, 1707220033);
        setField(term10391, term10391.getClass(), "ungetBuffer", term10411);
        setIntField(term10391, term10391.getClass(), "ungetCursor", -1792504217);
        setBooleanField(term10391, term10391.getClass(), "hitEOF", false);
        setIntField(term10391, term10391.getClass(), "lineStart", 1824538861);
        setIntField(term10391, term10391.getClass(), "lineEndChar", 499519708);
        setIntField(term10391, term10391.getClass(), "lineno", 1501165033);
        setIntField(term10391, term10391.getClass(), "charno", 510162332);
        setIntField(term10391, term10391.getClass(), "initCharno", 888506903);
        setIntField(term10391, term10391.getClass(), "initLineno", 200252898);
        setField(term10391, term10391.getClass(), "sourceString", "ZUdnQXfzCI");
        setIntField(term10391, term10391.getClass(), "sourceEnd", -1831826725);
        setIntField(term10391, term10391.getClass(), "sourceCursor", 752152965);
        setIntField(term10391, term10391.getClass(), "cursor", -1577069773);
        setIntField(term10391, term10391.getClass(), "tokenBeg", -266625190);
        setIntField(term10391, term10391.getClass(), "tokenEnd", 489201218);
        setField(term10390, term10390.getClass(), "stream", term10391);
        setField(term10443, term10443.getClass(), "root", null);
        setField(term10443, term10443.getClass(), "sourceName", null);
        setField(term10442, term10442.getClass(), "baseType", term10443);
        setField(term10442, term10442.getClass(), "extendedInterfaces", term10444);
        setField(term10442, term10442.getClass(), "implementedInterfaces", term10447);
        setField(term10442, term10442.getClass(), "parameters", term10450);
        setField(term10442, term10442.getClass(), "thrownTypes", term10455);
        setField(term10442, term10442.getClass(), "templateTypeName", "");
        setField(term10442, term10442.getClass(), "description", "");
        setField(term10442, term10442.getClass(), "meaning", "");
        setField(term10442, term10442.getClass(), "deprecated", "");
        setField(term10442, term10442.getClass(), "license", "");
        setField(term10442, term10442.getClass(), "suppressions", term10463);
        setField(term10442, term10442.getClass(), "modifies", term10464);
        setField(term10442, term10442.getClass(), "lendsName", "");
        setField(term10441, term10441.getClass(), "info", term10442);
        setField(term10466, term10466.getClass(), "sourceComment", "");
        setField(term10466, term10466.getClass(), "markers", term10468);
        setField(term10466, term10466.getClass(), "parameters", term10471);
        setField(term10466, term10466.getClass(), "throwsDescriptions", null);
        setField(term10466, term10466.getClass(), "blockDescription", null);
        setField(term10466, term10466.getClass(), "fileOverview", null);
        setField(term10466, term10466.getClass(), "returnDescription", null);
        setField(term10466, term10466.getClass(), "version", null);
        setField(term10466, term10466.getClass(), "authors", null);
        setField(term10466, term10466.getClass(), "sees", null);
        setField(term10441, term10441.getClass(), "documentation", term10466);
        setIntField(term10476, term10476.getClass(), "type", 0);
        setField(term10476, term10476.getClass(), "next", null);
        setField(term10476, term10476.getClass(), "first", null);
        setField(term10476, term10476.getClass(), "last", null);
        setField(term10476, term10476.getClass(), "propListHead", null);
        setIntField(term10476, term10476.getClass(), "sourcePosition", 0);
        setField(term10476, term10476.getClass(), "jsType", null);
        setField(term10476, term10476.getClass(), "parent", null);
        setField(term10441, term10441.getClass(), "associatedNode", term10476);
        setField(term10441, term10441.getClass(), "visibility", enum171);
        setIntField(term10441, term10441.getClass(), "bitset", 1638851942);
        setField(term10483, term10483.getClass(), "root", null);
        setField(term10483, term10483.getClass(), "sourceName", null);
        setField(term10441, term10441.getClass(), "type", term10483);
        setField(term10484, term10484.getClass(), "root", null);
        setField(term10484, term10484.getClass(), "sourceName", null);
        setField(term10441, term10441.getClass(), "thisType", term10484);
        setBooleanField(term10441, term10441.getClass(), "includeDocumentation", true);
        setField(term10440, term10440.getClass(), "currentInfo", term10441);
        setBooleanField(term10440, term10440.getClass(), "populated", true);
        setBooleanField(term10440, term10440.getClass(), "parseDocumentation", true);
        setField(term10489, term10489.getClass(), "item", null);
        setIntField(term10489, term10489.getClass(), "startLineno", 0);
        setIntField(term10489, term10489.getClass(), "startCharno", 0);
        setIntField(term10489, term10489.getClass(), "endLineno", 0);
        setIntField(term10489, term10489.getClass(), "endCharno", 0);
        setField(term10488, term10488.getClass(), "annotation", term10489);
        setField(term10494, term10494.getClass(), "item", null);
        setIntField(term10494, term10494.getClass(), "startLineno", 0);
        setIntField(term10494, term10494.getClass(), "startCharno", 0);
        setIntField(term10494, term10494.getClass(), "endLineno", 0);
        setIntField(term10494, term10494.getClass(), "endCharno", 0);
        setField(term10488, term10488.getClass(), "name", term10494);
        setField(term10488, term10488.getClass(), "nameNode", null);
        setField(term10488, term10488.getClass(), "description", null);
        setField(term10488, term10488.getClass(), "type", null);
        setField(term10440, term10440.getClass(), "currentMarker", term10488);
        setField(term10390, term10390.getClass(), "jsdocBuilder", term10440);
        setField(term10390, term10390.getClass(), "sourceFile", null);
        setIntField(term10499, term10499.getClass(), "type", 0);
        setField(term10499, term10499.getClass(), "next", null);
        setField(term10499, term10499.getClass(), "first", null);
        setField(term10499, term10499.getClass(), "last", null);
        setField(term10499, term10499.getClass(), "propListHead", null);
        setIntField(term10499, term10499.getClass(), "sourcePosition", 0);
        setField(term10499, term10499.getClass(), "jsType", null);
        setField(term10499, term10499.getClass(), "parent", null);
        setField(term10390, term10390.getClass(), "associatedNode", term10499);
        setField(term10390, term10390.getClass(), "errorReporter", null);
        setField(term10390, term10390.getClass(), "parser", null);
        setField(term10390, term10390.getClass(), "templateNode", null);
        setField(term10390, term10390.getClass(), "fileOverviewJSDocInfo", null);
        setField(term10390, term10390.getClass(), "state", null);
        setField(term10390, term10390.getClass(), "annotationNames", null);
        setField(term10390, term10390.getClass(), "suppressionNames", null);
        setField(term10390, term10390.getClass(), "fileLevelJsDocBuilder", null);
        setField(term10390, term10390.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "extractSingleLineBlock", argTypes, term10390, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


