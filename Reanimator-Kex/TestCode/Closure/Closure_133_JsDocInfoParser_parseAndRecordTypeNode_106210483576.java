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
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_106210483576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7657;
     Object enum167;
     Object term7764;
     Object term7766;
     Object term7768;
     Object term7770;

    public JsDocInfoParser_parseAndRecordTypeNode_106210483576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7709 = new ArrayList();
        ((ArrayList) term7709).add((Object)null);
        ((ArrayList) term7709).add((Object)null);
        ArrayList term7712 = new ArrayList();
        ((ArrayList) term7712).add((Object)null);
        ((ArrayList) term7712).add((Object)null);
        ((ArrayList) term7712).add((Object)null);
        ((ArrayList) term7712).add((Object)null);
        ((ArrayList) term7712).add((Object)null);
        HashMap term7715 = new HashMap();
        ArrayList term7720 = new ArrayList();
        Class<? extends Object> term93832 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term93831 = ((Class) term93832).getDeclaredField((String) "PRIVATE");
        ((Field) term93831).setAccessible(true);
        Object enum166 = ((Field) term93831).get((Object) null);
        term7657 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term7658 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term7671 = (char[]) newCharArray(4);
        int[] term7677 = (int[]) newIntArray(2);
        Object term7705 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term7706 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7707 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7708 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7741 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7742 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term7748 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term7753 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term7658, term7658.getClass(), "string", "VGizxZnyHX");
        setCharElement(term7671, 0, 'n');
        setCharElement(term7671, 1, 'W');
        setCharElement(term7671, 2, 'E');
        setCharElement(term7671, 3, 'G');
        setField(term7658, term7658.getClass(), "stringBuffer", term7671);
        setIntField(term7658, term7658.getClass(), "stringBufferTop", -220791533);
        setIntElement(term7677, 0, 1741500243);
        setIntElement(term7677, 1, -2070466617);
        setField(term7658, term7658.getClass(), "ungetBuffer", term7677);
        setIntField(term7658, term7658.getClass(), "ungetCursor", -1127721881);
        setBooleanField(term7658, term7658.getClass(), "hitEOF", false);
        setIntField(term7658, term7658.getClass(), "lineStart", 1074848808);
        setIntField(term7658, term7658.getClass(), "lineEndChar", -146054762);
        setIntField(term7658, term7658.getClass(), "lineno", 798043553);
        setIntField(term7658, term7658.getClass(), "charno", 533197381);
        setIntField(term7658, term7658.getClass(), "initCharno", 1048271679);
        setIntField(term7658, term7658.getClass(), "initLineno", -1529797673);
        setField(term7658, term7658.getClass(), "sourceString", "kVEZMHmRtR");
        setIntField(term7658, term7658.getClass(), "sourceEnd", -868676396);
        setIntField(term7658, term7658.getClass(), "sourceCursor", 1922684808);
        setIntField(term7658, term7658.getClass(), "cursor", -2005784375);
        setIntField(term7658, term7658.getClass(), "tokenBeg", -288604325);
        setIntField(term7658, term7658.getClass(), "tokenEnd", -1268314569);
        setField(term7657, term7657.getClass(), "stream", term7658);
        setField(term7708, term7708.getClass(), "root", null);
        setField(term7708, term7708.getClass(), "sourceName", null);
        setField(term7707, term7707.getClass(), "baseType", term7708);
        setField(term7707, term7707.getClass(), "extendedInterfaces", term7709);
        setField(term7707, term7707.getClass(), "implementedInterfaces", term7712);
        setField(term7707, term7707.getClass(), "parameters", term7715);
        setField(term7707, term7707.getClass(), "thrownTypes", term7720);
        setField(term7707, term7707.getClass(), "templateTypeNames", null);
        setField(term7707, term7707.getClass(), "classTemplateTypeNames", null);
        setField(term7707, term7707.getClass(), "description", null);
        setField(term7707, term7707.getClass(), "meaning", null);
        setField(term7707, term7707.getClass(), "deprecated", null);
        setField(term7707, term7707.getClass(), "license", null);
        setField(term7707, term7707.getClass(), "suppressions", null);
        setField(term7707, term7707.getClass(), "modifies", null);
        setField(term7707, term7707.getClass(), "lendsName", null);
        setBooleanField(term7707, term7707.getClass(), "ngInject", false);
        setField(term7706, term7706.getClass(), "info", term7707);
        setField(term7724, term7724.getClass(), "sourceComment", null);
        setField(term7724, term7724.getClass(), "markers", null);
        setField(term7724, term7724.getClass(), "parameters", null);
        setField(term7724, term7724.getClass(), "throwsDescriptions", null);
        setField(term7724, term7724.getClass(), "blockDescription", null);
        setField(term7724, term7724.getClass(), "fileOverview", null);
        setField(term7724, term7724.getClass(), "returnDescription", null);
        setField(term7724, term7724.getClass(), "version", null);
        setField(term7724, term7724.getClass(), "authors", null);
        setField(term7724, term7724.getClass(), "sees", null);
        setField(term7706, term7706.getClass(), "documentation", term7724);
        setIntField(term7725, term7725.getClass(), "type", 1774507971);
        setIntField(term7727, term7727.getClass(), "type", -1420269858);
        setField(term7727, term7727.getClass(), "next", null);
        setField(term7727, term7727.getClass(), "first", null);
        setField(term7727, term7727.getClass(), "last", null);
        setField(term7727, term7727.getClass(), "propListHead", null);
        setIntField(term7727, term7727.getClass(), "sourcePosition", 0);
        setField(term7727, term7727.getClass(), "jsType", null);
        setField(term7727, term7727.getClass(), "parent", null);
        setField(term7725, term7725.getClass(), "next", term7727);
        setIntField(term7730, term7730.getClass(), "type", 0);
        setField(term7730, term7730.getClass(), "next", null);
        setField(term7730, term7730.getClass(), "first", null);
        setField(term7730, term7730.getClass(), "last", null);
        setField(term7730, term7730.getClass(), "propListHead", null);
        setIntField(term7730, term7730.getClass(), "sourcePosition", 0);
        setField(term7730, term7730.getClass(), "jsType", null);
        setField(term7730, term7730.getClass(), "parent", null);
        setField(term7725, term7725.getClass(), "first", term7730);
        setIntField(term7733, term7733.getClass(), "type", 0);
        setField(term7733, term7733.getClass(), "next", null);
        setField(term7733, term7733.getClass(), "first", null);
        setField(term7733, term7733.getClass(), "last", null);
        setField(term7733, term7733.getClass(), "propListHead", null);
        setIntField(term7733, term7733.getClass(), "sourcePosition", 0);
        setField(term7733, term7733.getClass(), "jsType", null);
        setField(term7733, term7733.getClass(), "parent", null);
        setField(term7725, term7725.getClass(), "last", term7733);
        setField(term7725, term7725.getClass(), "propListHead", null);
        setIntField(term7725, term7725.getClass(), "sourcePosition", 0);
        setField(term7725, term7725.getClass(), "jsType", null);
        setField(term7725, term7725.getClass(), "parent", null);
        setField(term7706, term7706.getClass(), "associatedNode", term7725);
        setField(term7706, term7706.getClass(), "visibility", enum166);
        setIntField(term7706, term7706.getClass(), "bitset", 1272542218);
        setField(term7741, term7741.getClass(), "root", null);
        setField(term7741, term7741.getClass(), "sourceName", null);
        setField(term7706, term7706.getClass(), "type", term7741);
        setField(term7742, term7742.getClass(), "root", term7730);
        setField(term7742, term7742.getClass(), "sourceName", "");
        setField(term7706, term7706.getClass(), "thisType", term7742);
        setBooleanField(term7706, term7706.getClass(), "includeDocumentation", false);
        setField(term7705, term7705.getClass(), "currentInfo", term7706);
        setBooleanField(term7705, term7705.getClass(), "populated", true);
        setBooleanField(term7705, term7705.getClass(), "parseDocumentation", false);
        setField(term7748, term7748.getClass(), "item", null);
        setIntField(term7748, term7748.getClass(), "startLineno", 0);
        setIntField(term7748, term7748.getClass(), "startCharno", 0);
        setIntField(term7748, term7748.getClass(), "endLineno", 0);
        setIntField(term7748, term7748.getClass(), "endCharno", 0);
        setField(term7747, term7747.getClass(), "annotation", term7748);
        setField(term7753, term7753.getClass(), "item", null);
        setIntField(term7753, term7753.getClass(), "startLineno", 0);
        setIntField(term7753, term7753.getClass(), "startCharno", 0);
        setIntField(term7753, term7753.getClass(), "endLineno", 0);
        setIntField(term7753, term7753.getClass(), "endCharno", 0);
        setField(term7747, term7747.getClass(), "name", term7753);
        setField(term7747, term7747.getClass(), "nameNode", null);
        setField(term7747, term7747.getClass(), "description", null);
        setField(term7747, term7747.getClass(), "type", null);
        setField(term7705, term7705.getClass(), "currentMarker", term7747);
        setField(term7657, term7657.getClass(), "jsdocBuilder", term7705);
        setField(term7657, term7657.getClass(), "sourceFile", null);
        setField(term7657, term7657.getClass(), "associatedNode", term7730);
        setField(term7657, term7657.getClass(), "errorReporter", null);
        setField(term7657, term7657.getClass(), "parser", null);
        setField(term7657, term7657.getClass(), "templateNode", null);
        setField(term7657, term7657.getClass(), "fileOverviewJSDocInfo", null);
        setField(term7657, term7657.getClass(), "state", null);
        setField(term7657, term7657.getClass(), "annotationNames", null);
        setField(term7657, term7657.getClass(), "suppressionNames", null);
        setField(term7657, term7657.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7657, term7657.getClass(), "unreadToken", null);
        Class<? extends Object> term94100 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term94099 = ((Class) term94100).getDeclaredField((String) "RC");
        ((Field) term94099).setAccessible(true);
        enum167 = ((Field) term94099).get((Object) null);
        term7764 = new Integer(1209799204);
        term7766 = new Integer(1094107751);
        term7768 = new Boolean(false);
        term7770 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = enum167;
        args[1] = term7764;
        args[2] = term7766;
        args[3] = term7768;
        args[4] = term7770;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term7657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


