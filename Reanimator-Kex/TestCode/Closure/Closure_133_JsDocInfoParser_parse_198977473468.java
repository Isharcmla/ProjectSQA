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
import java.lang.String;

public class JsDocInfoParser_parse_198977473468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;

    public JsDocInfoParser_parse_198977473468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2749 = new ArrayList();
        ((ArrayList) term2749).add((Object)null);
        ((ArrayList) term2749).add((Object)null);
        ((ArrayList) term2749).add((Object)null);
        ((ArrayList) term2749).add((Object)null);
        ArrayList term2752 = new ArrayList();
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        ((ArrayList) term2752).add((Object)null);
        HashMap term2755 = new HashMap();
        ArrayList term2760 = new ArrayList();
        ((ArrayList) term2760).add((Object)null);
        ((ArrayList) term2760).add((Object)null);
        ((ArrayList) term2760).add((Object)null);
        ((ArrayList) term2760).add((Object)null);
        ((ArrayList) term2760).add((Object)null);
        ((ArrayList) term2760).add((Object)null);
        Class<? extends Object> term88174 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term88173 = ((Class) term88174).getDeclaredField((String) "INHERITED");
        ((Field) term88173).setAccessible(true);
        Object enum152 = ((Field) term88173).get((Object) null);
        term2694 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term2695 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term2708 = (char[]) newCharArray(0);
        int[] term2710 = (int[]) newIntArray(9);
        Object term2745 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term2746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2748 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2764 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2772 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2777 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term2786 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term2791 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term2796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2695, term2695.getClass(), "string", "vQVyKLdtaz");
        setField(term2695, term2695.getClass(), "stringBuffer", term2708);
        setIntField(term2695, term2695.getClass(), "stringBufferTop", 2095798786);
        setIntElement(term2710, 0, -1565502840);
        setIntElement(term2710, 1, 344323424);
        setIntElement(term2710, 2, 9726679);
        setIntElement(term2710, 3, -25637976);
        setIntElement(term2710, 4, 1555897383);
        setIntElement(term2710, 5, 202001407);
        setIntElement(term2710, 6, 158873461);
        setIntElement(term2710, 7, -430151637);
        setIntElement(term2710, 8, -1697741339);
        setField(term2695, term2695.getClass(), "ungetBuffer", term2710);
        setIntField(term2695, term2695.getClass(), "ungetCursor", 98922530);
        setBooleanField(term2695, term2695.getClass(), "hitEOF", true);
        setIntField(term2695, term2695.getClass(), "lineStart", -1388471422);
        setIntField(term2695, term2695.getClass(), "lineEndChar", -1498296052);
        setIntField(term2695, term2695.getClass(), "lineno", 2098647989);
        setIntField(term2695, term2695.getClass(), "charno", 1598895173);
        setIntField(term2695, term2695.getClass(), "initCharno", 1830648570);
        setIntField(term2695, term2695.getClass(), "initLineno", -227365013);
        setField(term2695, term2695.getClass(), "sourceString", "OWKQODBLzb");
        setIntField(term2695, term2695.getClass(), "sourceEnd", 11724947);
        setIntField(term2695, term2695.getClass(), "sourceCursor", 1953277050);
        setIntField(term2695, term2695.getClass(), "cursor", 1283079251);
        setIntField(term2695, term2695.getClass(), "tokenBeg", -523949691);
        setIntField(term2695, term2695.getClass(), "tokenEnd", 1398204340);
        setField(term2694, term2694.getClass(), "stream", term2695);
        setField(term2748, term2748.getClass(), "root", null);
        setField(term2748, term2748.getClass(), "sourceName", null);
        setField(term2747, term2747.getClass(), "baseType", term2748);
        setField(term2747, term2747.getClass(), "extendedInterfaces", term2749);
        setField(term2747, term2747.getClass(), "implementedInterfaces", term2752);
        setField(term2747, term2747.getClass(), "parameters", term2755);
        setField(term2747, term2747.getClass(), "thrownTypes", term2760);
        setField(term2747, term2747.getClass(), "templateTypeNames", null);
        setField(term2747, term2747.getClass(), "classTemplateTypeNames", null);
        setField(term2747, term2747.getClass(), "description", null);
        setField(term2747, term2747.getClass(), "meaning", null);
        setField(term2747, term2747.getClass(), "deprecated", null);
        setField(term2747, term2747.getClass(), "license", null);
        setField(term2747, term2747.getClass(), "suppressions", null);
        setField(term2747, term2747.getClass(), "modifies", null);
        setField(term2747, term2747.getClass(), "lendsName", null);
        setBooleanField(term2747, term2747.getClass(), "ngInject", false);
        setField(term2746, term2746.getClass(), "info", term2747);
        setField(term2764, term2764.getClass(), "sourceComment", null);
        setField(term2764, term2764.getClass(), "markers", null);
        setField(term2764, term2764.getClass(), "parameters", null);
        setField(term2764, term2764.getClass(), "throwsDescriptions", null);
        setField(term2764, term2764.getClass(), "blockDescription", null);
        setField(term2764, term2764.getClass(), "fileOverview", null);
        setField(term2764, term2764.getClass(), "returnDescription", null);
        setField(term2764, term2764.getClass(), "version", null);
        setField(term2764, term2764.getClass(), "authors", null);
        setField(term2764, term2764.getClass(), "sees", null);
        setField(term2746, term2746.getClass(), "documentation", term2764);
        setIntField(term2765, term2765.getClass(), "type", 0);
        setField(term2765, term2765.getClass(), "next", null);
        setField(term2765, term2765.getClass(), "first", null);
        setField(term2765, term2765.getClass(), "last", null);
        setField(term2765, term2765.getClass(), "propListHead", null);
        setIntField(term2765, term2765.getClass(), "sourcePosition", 0);
        setField(term2765, term2765.getClass(), "jsType", null);
        setField(term2765, term2765.getClass(), "parent", null);
        setField(term2746, term2746.getClass(), "associatedNode", term2765);
        setField(term2746, term2746.getClass(), "visibility", enum152);
        setIntField(term2746, term2746.getClass(), "bitset", -2014576105);
        setIntField(term2773, term2773.getClass(), "type", -243422082);
        setField(term2773, term2773.getClass(), "next", null);
        setField(term2773, term2773.getClass(), "first", null);
        setField(term2773, term2773.getClass(), "last", term2765);
        setField(term2773, term2773.getClass(), "propListHead", null);
        setIntField(term2773, term2773.getClass(), "sourcePosition", 0);
        setField(term2773, term2773.getClass(), "jsType", null);
        setField(term2773, term2773.getClass(), "parent", null);
        setField(term2772, term2772.getClass(), "root", term2773);
        setField(term2772, term2772.getClass(), "sourceName", "");
        setField(term2746, term2746.getClass(), "type", term2772);
        setIntField(term2778, term2778.getClass(), "type", 0);
        setField(term2778, term2778.getClass(), "next", null);
        setField(term2778, term2778.getClass(), "first", null);
        setField(term2778, term2778.getClass(), "last", null);
        setField(term2778, term2778.getClass(), "propListHead", null);
        setIntField(term2778, term2778.getClass(), "sourcePosition", 0);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
        setField(term2777, term2777.getClass(), "root", term2778);
        setField(term2777, term2777.getClass(), "sourceName", "");
        setField(term2746, term2746.getClass(), "thisType", term2777);
        setBooleanField(term2746, term2746.getClass(), "includeDocumentation", true);
        setField(term2745, term2745.getClass(), "currentInfo", term2746);
        setBooleanField(term2745, term2745.getClass(), "populated", true);
        setBooleanField(term2745, term2745.getClass(), "parseDocumentation", true);
        setField(term2786, term2786.getClass(), "item", null);
        setIntField(term2786, term2786.getClass(), "startLineno", 0);
        setIntField(term2786, term2786.getClass(), "startCharno", 0);
        setIntField(term2786, term2786.getClass(), "endLineno", 0);
        setIntField(term2786, term2786.getClass(), "endCharno", 0);
        setField(term2785, term2785.getClass(), "annotation", term2786);
        setField(term2791, term2791.getClass(), "item", null);
        setIntField(term2791, term2791.getClass(), "startLineno", 0);
        setIntField(term2791, term2791.getClass(), "startCharno", 0);
        setIntField(term2791, term2791.getClass(), "endLineno", 0);
        setIntField(term2791, term2791.getClass(), "endCharno", 0);
        setField(term2785, term2785.getClass(), "name", term2791);
        setField(term2785, term2785.getClass(), "nameNode", null);
        setField(term2785, term2785.getClass(), "description", null);
        setField(term2785, term2785.getClass(), "type", null);
        setField(term2745, term2745.getClass(), "currentMarker", term2785);
        setField(term2694, term2694.getClass(), "jsdocBuilder", term2745);
        setField(term2694, term2694.getClass(), "sourceFile", null);
        setIntField(term2796, term2796.getClass(), "type", 0);
        setField(term2796, term2796.getClass(), "next", null);
        setField(term2796, term2796.getClass(), "first", null);
        setField(term2796, term2796.getClass(), "last", null);
        setField(term2796, term2796.getClass(), "propListHead", null);
        setIntField(term2796, term2796.getClass(), "sourcePosition", 0);
        setField(term2796, term2796.getClass(), "jsType", null);
        setField(term2796, term2796.getClass(), "parent", null);
        setField(term2694, term2694.getClass(), "associatedNode", term2796);
        setField(term2694, term2694.getClass(), "errorReporter", null);
        setField(term2694, term2694.getClass(), "parser", null);
        setField(term2694, term2694.getClass(), "templateNode", null);
        setField(term2694, term2694.getClass(), "fileOverviewJSDocInfo", null);
        setField(term2694, term2694.getClass(), "state", null);
        setField(term2694, term2694.getClass(), "annotationNames", null);
        setField(term2694, term2694.getClass(), "suppressionNames", null);
        setField(term2694, term2694.getClass(), "fileLevelJsDocBuilder", null);
        setField(term2694, term2694.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term2694, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


