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

public class JsDocInfoParser_reportTypeSyntaxWarning_608670462107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26467;

    public JsDocInfoParser_reportTypeSyntaxWarning_608670462107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26523 = new ArrayList();
        ((ArrayList) term26523).add((Object)null);
        ((ArrayList) term26523).add((Object)null);
        ((ArrayList) term26523).add((Object)null);
        ((ArrayList) term26523).add((Object)null);
        ArrayList term26526 = new ArrayList();
        ((ArrayList) term26526).add((Object)null);
        ((ArrayList) term26526).add((Object)null);
        ((ArrayList) term26526).add((Object)null);
        ((ArrayList) term26526).add((Object)null);
        HashMap term26529 = new HashMap();
        ArrayList term26534 = new ArrayList();
        ((ArrayList) term26534).add((Object)null);
        ((ArrayList) term26534).add((Object)null);
        ((ArrayList) term26534).add((Object)null);
        Class<? extends Object> term121967 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term121966 = ((Class) term121967).getDeclaredField((String) "PUBLIC");
        ((Field) term121966).setAccessible(true);
        Object enum222 = ((Field) term121966).get((Object) null);
        term26467 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term26468 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term26481 = (char[]) newCharArray(8);
        int[] term26491 = (int[]) newIntArray(2);
        Object term26519 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term26520 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term26521 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term26522 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26538 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term26539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26546 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26551 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term26556 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term26557 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term26562 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term26567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26468, term26468.getClass(), "string", "lJoltmsadS");
        setCharElement(term26481, 0, 'm');
        setCharElement(term26481, 1, 'M');
        setCharElement(term26481, 2, 'b');
        setCharElement(term26481, 3, 'l');
        setCharElement(term26481, 4, 'Y');
        setCharElement(term26481, 5, 'c');
        setCharElement(term26481, 6, 'h');
        setCharElement(term26481, 7, 'N');
        setField(term26468, term26468.getClass(), "stringBuffer", term26481);
        setIntField(term26468, term26468.getClass(), "stringBufferTop", 157967613);
        setIntElement(term26491, 0, 811839399);
        setIntElement(term26491, 1, 593962063);
        setField(term26468, term26468.getClass(), "ungetBuffer", term26491);
        setIntField(term26468, term26468.getClass(), "ungetCursor", -1485826786);
        setBooleanField(term26468, term26468.getClass(), "hitEOF", true);
        setIntField(term26468, term26468.getClass(), "lineStart", -1549952664);
        setIntField(term26468, term26468.getClass(), "lineEndChar", 148394188);
        setIntField(term26468, term26468.getClass(), "lineno", 504525721);
        setIntField(term26468, term26468.getClass(), "charno", 1835568392);
        setIntField(term26468, term26468.getClass(), "initCharno", 457470807);
        setIntField(term26468, term26468.getClass(), "initLineno", -994742871);
        setField(term26468, term26468.getClass(), "sourceString", "mvfDtZNEHr");
        setIntField(term26468, term26468.getClass(), "sourceEnd", -222412326);
        setIntField(term26468, term26468.getClass(), "sourceCursor", -299497261);
        setIntField(term26468, term26468.getClass(), "cursor", -23054366);
        setIntField(term26468, term26468.getClass(), "tokenBeg", 153009426);
        setIntField(term26468, term26468.getClass(), "tokenEnd", 185751892);
        setField(term26467, term26467.getClass(), "stream", term26468);
        setField(term26522, term26522.getClass(), "root", null);
        setField(term26522, term26522.getClass(), "sourceName", null);
        setField(term26521, term26521.getClass(), "baseType", term26522);
        setField(term26521, term26521.getClass(), "extendedInterfaces", term26523);
        setField(term26521, term26521.getClass(), "implementedInterfaces", term26526);
        setField(term26521, term26521.getClass(), "parameters", term26529);
        setField(term26521, term26521.getClass(), "thrownTypes", term26534);
        setField(term26521, term26521.getClass(), "templateTypeNames", null);
        setField(term26521, term26521.getClass(), "classTemplateTypeNames", null);
        setField(term26521, term26521.getClass(), "description", null);
        setField(term26521, term26521.getClass(), "meaning", null);
        setField(term26521, term26521.getClass(), "deprecated", null);
        setField(term26521, term26521.getClass(), "license", null);
        setField(term26521, term26521.getClass(), "suppressions", null);
        setField(term26521, term26521.getClass(), "modifies", null);
        setField(term26521, term26521.getClass(), "lendsName", null);
        setBooleanField(term26521, term26521.getClass(), "ngInject", false);
        setField(term26520, term26520.getClass(), "info", term26521);
        setField(term26538, term26538.getClass(), "sourceComment", null);
        setField(term26538, term26538.getClass(), "markers", null);
        setField(term26538, term26538.getClass(), "parameters", null);
        setField(term26538, term26538.getClass(), "throwsDescriptions", null);
        setField(term26538, term26538.getClass(), "blockDescription", null);
        setField(term26538, term26538.getClass(), "fileOverview", null);
        setField(term26538, term26538.getClass(), "returnDescription", null);
        setField(term26538, term26538.getClass(), "version", null);
        setField(term26538, term26538.getClass(), "authors", null);
        setField(term26538, term26538.getClass(), "sees", null);
        setField(term26520, term26520.getClass(), "documentation", term26538);
        setIntField(term26539, term26539.getClass(), "type", 0);
        setField(term26539, term26539.getClass(), "next", null);
        setField(term26539, term26539.getClass(), "first", null);
        setField(term26539, term26539.getClass(), "last", null);
        setField(term26539, term26539.getClass(), "propListHead", null);
        setIntField(term26539, term26539.getClass(), "sourcePosition", 0);
        setField(term26539, term26539.getClass(), "jsType", null);
        setField(term26539, term26539.getClass(), "parent", null);
        setField(term26520, term26520.getClass(), "associatedNode", term26539);
        setField(term26520, term26520.getClass(), "visibility", enum222);
        setIntField(term26520, term26520.getClass(), "bitset", -2078879114);
        setIntField(term26547, term26547.getClass(), "type", 0);
        setField(term26547, term26547.getClass(), "next", null);
        setField(term26547, term26547.getClass(), "first", null);
        setField(term26547, term26547.getClass(), "last", null);
        setField(term26547, term26547.getClass(), "propListHead", null);
        setIntField(term26547, term26547.getClass(), "sourcePosition", 0);
        setField(term26547, term26547.getClass(), "jsType", null);
        setField(term26547, term26547.getClass(), "parent", null);
        setField(term26546, term26546.getClass(), "root", term26547);
        setField(term26546, term26546.getClass(), "sourceName", "");
        setField(term26520, term26520.getClass(), "type", term26546);
        setField(term26551, term26551.getClass(), "root", term26547);
        setField(term26551, term26551.getClass(), "sourceName", "");
        setField(term26520, term26520.getClass(), "thisType", term26551);
        setBooleanField(term26520, term26520.getClass(), "includeDocumentation", false);
        setField(term26519, term26519.getClass(), "currentInfo", term26520);
        setBooleanField(term26519, term26519.getClass(), "populated", true);
        setBooleanField(term26519, term26519.getClass(), "parseDocumentation", false);
        setField(term26557, term26557.getClass(), "item", null);
        setIntField(term26557, term26557.getClass(), "startLineno", 0);
        setIntField(term26557, term26557.getClass(), "startCharno", 0);
        setIntField(term26557, term26557.getClass(), "endLineno", 0);
        setIntField(term26557, term26557.getClass(), "endCharno", 0);
        setField(term26556, term26556.getClass(), "annotation", term26557);
        setField(term26562, term26562.getClass(), "item", null);
        setIntField(term26562, term26562.getClass(), "startLineno", 0);
        setIntField(term26562, term26562.getClass(), "startCharno", 0);
        setIntField(term26562, term26562.getClass(), "endLineno", 0);
        setIntField(term26562, term26562.getClass(), "endCharno", 0);
        setField(term26556, term26556.getClass(), "name", term26562);
        setField(term26556, term26556.getClass(), "nameNode", null);
        setField(term26556, term26556.getClass(), "description", null);
        setField(term26556, term26556.getClass(), "type", null);
        setField(term26519, term26519.getClass(), "currentMarker", term26556);
        setField(term26467, term26467.getClass(), "jsdocBuilder", term26519);
        setField(term26467, term26467.getClass(), "sourceFile", null);
        setIntField(term26567, term26567.getClass(), "type", -1954860951);
        setIntField(term26569, term26569.getClass(), "type", 0);
        setField(term26569, term26569.getClass(), "next", null);
        setField(term26569, term26569.getClass(), "first", null);
        setField(term26569, term26569.getClass(), "last", null);
        setField(term26569, term26569.getClass(), "propListHead", null);
        setIntField(term26569, term26569.getClass(), "sourcePosition", 0);
        setField(term26569, term26569.getClass(), "jsType", null);
        setField(term26569, term26569.getClass(), "parent", null);
        setField(term26567, term26567.getClass(), "next", term26569);
        setIntField(term26572, term26572.getClass(), "type", 0);
        setField(term26572, term26572.getClass(), "next", null);
        setField(term26572, term26572.getClass(), "first", null);
        setField(term26572, term26572.getClass(), "last", null);
        setField(term26572, term26572.getClass(), "propListHead", null);
        setIntField(term26572, term26572.getClass(), "sourcePosition", 0);
        setField(term26572, term26572.getClass(), "jsType", null);
        setField(term26572, term26572.getClass(), "parent", null);
        setField(term26567, term26567.getClass(), "first", term26572);
        setField(term26567, term26567.getClass(), "last", term26547);
        setField(term26567, term26567.getClass(), "propListHead", null);
        setIntField(term26567, term26567.getClass(), "sourcePosition", 0);
        setField(term26567, term26567.getClass(), "jsType", null);
        setField(term26567, term26567.getClass(), "parent", null);
        setField(term26467, term26467.getClass(), "associatedNode", term26567);
        setField(term26467, term26467.getClass(), "errorReporter", null);
        setField(term26467, term26467.getClass(), "parser", null);
        setField(term26467, term26467.getClass(), "templateNode", null);
        setField(term26467, term26467.getClass(), "fileOverviewJSDocInfo", null);
        setField(term26467, term26467.getClass(), "state", null);
        setField(term26467, term26467.getClass(), "annotationNames", null);
        setField(term26467, term26467.getClass(), "suppressionNames", null);
        setField(term26467, term26467.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26467, term26467.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mRBtFTxVdE";
        try {
            callMethod(klass, "reportTypeSyntaxWarning", argTypes, term26467, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


