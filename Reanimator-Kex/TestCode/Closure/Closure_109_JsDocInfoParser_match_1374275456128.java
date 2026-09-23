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

public class JsDocInfoParser_match_1374275456128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34656;
     Object enum264;

    public JsDocInfoParser_match_1374275456128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term34710 = new ArrayList();
        ((ArrayList) term34710).add((Object)null);
        ((ArrayList) term34710).add((Object)null);
        ((ArrayList) term34710).add((Object)null);
        ((ArrayList) term34710).add((Object)null);
        ArrayList term34713 = new ArrayList();
        ((ArrayList) term34713).add((Object)null);
        ((ArrayList) term34713).add((Object)null);
        HashMap term34716 = new HashMap();
        ArrayList term34721 = new ArrayList();
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        HashSet term34724 = new HashSet();
        HashSet term34729 = new HashSet();
        HashSet term34730 = new HashSet();
        ArrayList term34739 = new ArrayList();
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        ((ArrayList) term34739).add((Object)null);
        HashMap term34742 = new HashMap();
        Class<? extends Object> term163500 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term163499 = ((Class) term163500).getDeclaredField((String) "PUBLIC");
        ((Field) term163499).setAccessible(true);
        Object enum263 = ((Field) term163499).get((Object) null);
        term34656 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term34657 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term34670 = (char[]) newCharArray(2);
        int[] term34674 = (int[]) newIntArray(6);
        Object term34706 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term34707 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term34708 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term34709 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term34737 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term34747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34754 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term34755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34759 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term34760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34768 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term34769 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term34774 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term34657, term34657.getClass(), "string", "MrVdoUYAdO");
        setCharElement(term34670, 0, 'C');
        setCharElement(term34670, 1, 'K');
        setField(term34657, term34657.getClass(), "stringBuffer", term34670);
        setIntField(term34657, term34657.getClass(), "stringBufferTop", 1086383182);
        setIntElement(term34674, 0, 1425319286);
        setIntElement(term34674, 1, 1729919228);
        setIntElement(term34674, 2, 872351195);
        setIntElement(term34674, 3, -1664328399);
        setIntElement(term34674, 4, 1422430512);
        setIntElement(term34674, 5, 1796581482);
        setField(term34657, term34657.getClass(), "ungetBuffer", term34674);
        setIntField(term34657, term34657.getClass(), "ungetCursor", 1286440081);
        setBooleanField(term34657, term34657.getClass(), "hitEOF", true);
        setIntField(term34657, term34657.getClass(), "lineStart", -928538452);
        setIntField(term34657, term34657.getClass(), "lineEndChar", -1313207353);
        setIntField(term34657, term34657.getClass(), "lineno", 402612318);
        setIntField(term34657, term34657.getClass(), "charno", -1628481565);
        setIntField(term34657, term34657.getClass(), "initCharno", -217226756);
        setIntField(term34657, term34657.getClass(), "initLineno", 1608000247);
        setField(term34657, term34657.getClass(), "sourceString", "schPUnVfDW");
        setIntField(term34657, term34657.getClass(), "sourceEnd", 1354560887);
        setIntField(term34657, term34657.getClass(), "sourceCursor", -749474542);
        setIntField(term34657, term34657.getClass(), "cursor", -47907780);
        setIntField(term34657, term34657.getClass(), "tokenBeg", 1131462369);
        setIntField(term34657, term34657.getClass(), "tokenEnd", -1161206731);
        setField(term34656, term34656.getClass(), "stream", term34657);
        setField(term34709, term34709.getClass(), "root", null);
        setField(term34709, term34709.getClass(), "sourceName", null);
        setField(term34708, term34708.getClass(), "baseType", term34709);
        setField(term34708, term34708.getClass(), "extendedInterfaces", term34710);
        setField(term34708, term34708.getClass(), "implementedInterfaces", term34713);
        setField(term34708, term34708.getClass(), "parameters", term34716);
        setField(term34708, term34708.getClass(), "thrownTypes", term34721);
        setField(term34708, term34708.getClass(), "templateTypeNames", null);
        setField(term34708, term34708.getClass(), "disposedParameters", term34724);
        setField(term34708, term34708.getClass(), "description", "");
        setField(term34708, term34708.getClass(), "meaning", "");
        setField(term34708, term34708.getClass(), "deprecated", "");
        setField(term34708, term34708.getClass(), "license", "");
        setField(term34708, term34708.getClass(), "suppressions", term34729);
        setField(term34708, term34708.getClass(), "modifies", term34730);
        setField(term34708, term34708.getClass(), "lendsName", "");
        setBooleanField(term34708, term34708.getClass(), "ngInject", false);
        setBooleanField(term34708, term34708.getClass(), "wizaction", true);
        setBooleanField(term34708, term34708.getClass(), "jaggerInject", false);
        setBooleanField(term34708, term34708.getClass(), "jaggerProvide", false);
        setBooleanField(term34708, term34708.getClass(), "jaggerModule", true);
        setField(term34707, term34707.getClass(), "info", term34708);
        setField(term34737, term34737.getClass(), "sourceComment", "");
        setField(term34737, term34737.getClass(), "markers", term34739);
        setField(term34737, term34737.getClass(), "parameters", term34742);
        setField(term34737, term34737.getClass(), "throwsDescriptions", null);
        setField(term34737, term34737.getClass(), "blockDescription", null);
        setField(term34737, term34737.getClass(), "fileOverview", null);
        setField(term34737, term34737.getClass(), "returnDescription", null);
        setField(term34737, term34737.getClass(), "version", null);
        setField(term34737, term34737.getClass(), "authors", null);
        setField(term34737, term34737.getClass(), "sees", null);
        setField(term34707, term34707.getClass(), "documentation", term34737);
        setIntField(term34747, term34747.getClass(), "type", 0);
        setField(term34747, term34747.getClass(), "next", null);
        setField(term34747, term34747.getClass(), "first", null);
        setField(term34747, term34747.getClass(), "last", null);
        setField(term34747, term34747.getClass(), "propListHead", null);
        setIntField(term34747, term34747.getClass(), "sourcePosition", 0);
        setField(term34747, term34747.getClass(), "jsType", null);
        setField(term34747, term34747.getClass(), "parent", null);
        setField(term34707, term34707.getClass(), "associatedNode", term34747);
        setField(term34707, term34707.getClass(), "visibility", enum263);
        setIntField(term34707, term34707.getClass(), "bitset", -947460705);
        setIntField(term34755, term34755.getClass(), "type", 0);
        setField(term34755, term34755.getClass(), "next", null);
        setField(term34755, term34755.getClass(), "first", null);
        setField(term34755, term34755.getClass(), "last", null);
        setField(term34755, term34755.getClass(), "propListHead", null);
        setIntField(term34755, term34755.getClass(), "sourcePosition", 0);
        setField(term34755, term34755.getClass(), "jsType", null);
        setField(term34755, term34755.getClass(), "parent", null);
        setField(term34754, term34754.getClass(), "root", term34755);
        setField(term34754, term34754.getClass(), "sourceName", "");
        setField(term34707, term34707.getClass(), "type", term34754);
        setIntField(term34760, term34760.getClass(), "type", 0);
        setField(term34760, term34760.getClass(), "next", null);
        setField(term34760, term34760.getClass(), "first", null);
        setField(term34760, term34760.getClass(), "last", null);
        setField(term34760, term34760.getClass(), "propListHead", null);
        setIntField(term34760, term34760.getClass(), "sourcePosition", 0);
        setField(term34760, term34760.getClass(), "jsType", null);
        setField(term34760, term34760.getClass(), "parent", null);
        setField(term34759, term34759.getClass(), "root", term34760);
        setField(term34759, term34759.getClass(), "sourceName", "");
        setField(term34707, term34707.getClass(), "thisType", term34759);
        setBooleanField(term34707, term34707.getClass(), "includeDocumentation", true);
        setIntField(term34707, term34707.getClass(), "originalCommentPosition", -1435758764);
        setField(term34706, term34706.getClass(), "currentInfo", term34707);
        setBooleanField(term34706, term34706.getClass(), "populated", true);
        setBooleanField(term34706, term34706.getClass(), "parseDocumentation", false);
        setField(term34769, term34769.getClass(), "item", null);
        setIntField(term34769, term34769.getClass(), "startLineno", 0);
        setIntField(term34769, term34769.getClass(), "startCharno", 0);
        setIntField(term34769, term34769.getClass(), "endLineno", 0);
        setIntField(term34769, term34769.getClass(), "endCharno", 0);
        setField(term34768, term34768.getClass(), "annotation", term34769);
        setField(term34774, term34774.getClass(), "item", null);
        setIntField(term34774, term34774.getClass(), "startLineno", 0);
        setIntField(term34774, term34774.getClass(), "startCharno", 0);
        setIntField(term34774, term34774.getClass(), "endLineno", 0);
        setIntField(term34774, term34774.getClass(), "endCharno", 0);
        setField(term34768, term34768.getClass(), "name", term34774);
        setField(term34768, term34768.getClass(), "nameNode", null);
        setField(term34768, term34768.getClass(), "description", null);
        setField(term34768, term34768.getClass(), "type", null);
        setField(term34706, term34706.getClass(), "currentMarker", term34768);
        setField(term34656, term34656.getClass(), "jsdocBuilder", term34706);
        setField(term34656, term34656.getClass(), "sourceFile", null);
        setField(term34656, term34656.getClass(), "associatedNode", term34755);
        setField(term34656, term34656.getClass(), "errorReporter", null);
        setField(term34656, term34656.getClass(), "parser", null);
        setField(term34656, term34656.getClass(), "templateNode", null);
        setField(term34656, term34656.getClass(), "fileOverviewJSDocInfo", null);
        setField(term34656, term34656.getClass(), "state", null);
        setField(term34656, term34656.getClass(), "annotationNames", null);
        setField(term34656, term34656.getClass(), "suppressionNames", null);
        setField(term34656, term34656.getClass(), "fileLevelJsDocBuilder", null);
        setField(term34656, term34656.getClass(), "unreadToken", null);
        Class<? extends Object> term163765 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term163764 = ((Class) term163765).getDeclaredField((String) "EOF");
        ((Field) term163764).setAccessible(true);
        enum264 = ((Field) term163764).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum264;
        try {
            callMethod(klass, "match", argTypes, term34656, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


