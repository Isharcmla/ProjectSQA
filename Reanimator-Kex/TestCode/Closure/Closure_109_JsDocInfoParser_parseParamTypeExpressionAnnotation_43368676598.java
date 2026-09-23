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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16181;
     Object enum213;

    public JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16230 = new ArrayList();
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ((ArrayList) term16230).add((Object)null);
        ArrayList term16233 = new ArrayList();
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        ((ArrayList) term16233).add((Object)null);
        HashMap term16236 = new HashMap();
        ArrayList term16241 = new ArrayList();
        ((ArrayList) term16241).add((Object)null);
        ((ArrayList) term16241).add((Object)null);
        ((ArrayList) term16241).add((Object)null);
        ((ArrayList) term16241).add((Object)null);
        ((ArrayList) term16241).add((Object)null);
        HashSet term16244 = new HashSet();
        HashSet term16249 = new HashSet();
        HashSet term16250 = new HashSet();
        ArrayList term16259 = new ArrayList();
        ((ArrayList) term16259).add((Object)null);
        ((ArrayList) term16259).add((Object)null);
        ((ArrayList) term16259).add((Object)null);
        HashMap term16262 = new HashMap();
        Class<? extends Object> term148313 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term148312 = ((Class) term148313).getDeclaredField((String) "PRIVATE");
        ((Field) term148312).setAccessible(true);
        Object enum212 = ((Field) term148312).get((Object) null);
        term16181 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term16182 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term16195 = (char[]) newCharArray(3);
        int[] term16200 = (int[]) newIntArray(0);
        Object term16226 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term16227 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16228 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16229 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16257 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16274 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16283 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term16284 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term16289 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term16294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16182, term16182.getClass(), "string", "zZxoNkohbw");
        setCharElement(term16195, 0, 'X');
        setCharElement(term16195, 1, 'u');
        setCharElement(term16195, 2, 'u');
        setField(term16182, term16182.getClass(), "stringBuffer", term16195);
        setIntField(term16182, term16182.getClass(), "stringBufferTop", 1630231519);
        setField(term16182, term16182.getClass(), "ungetBuffer", term16200);
        setIntField(term16182, term16182.getClass(), "ungetCursor", 1460702778);
        setBooleanField(term16182, term16182.getClass(), "hitEOF", true);
        setIntField(term16182, term16182.getClass(), "lineStart", -1398142433);
        setIntField(term16182, term16182.getClass(), "lineEndChar", -1112119058);
        setIntField(term16182, term16182.getClass(), "lineno", 2073858334);
        setIntField(term16182, term16182.getClass(), "charno", -1693535639);
        setIntField(term16182, term16182.getClass(), "initCharno", 1344744036);
        setIntField(term16182, term16182.getClass(), "initLineno", -98060427);
        setField(term16182, term16182.getClass(), "sourceString", "DQrjPcLysX");
        setIntField(term16182, term16182.getClass(), "sourceEnd", -1272268399);
        setIntField(term16182, term16182.getClass(), "sourceCursor", 1120271104);
        setIntField(term16182, term16182.getClass(), "cursor", -128435804);
        setIntField(term16182, term16182.getClass(), "tokenBeg", 2136158480);
        setIntField(term16182, term16182.getClass(), "tokenEnd", 2118747457);
        setField(term16181, term16181.getClass(), "stream", term16182);
        setField(term16229, term16229.getClass(), "root", null);
        setField(term16229, term16229.getClass(), "sourceName", null);
        setField(term16228, term16228.getClass(), "baseType", term16229);
        setField(term16228, term16228.getClass(), "extendedInterfaces", term16230);
        setField(term16228, term16228.getClass(), "implementedInterfaces", term16233);
        setField(term16228, term16228.getClass(), "parameters", term16236);
        setField(term16228, term16228.getClass(), "thrownTypes", term16241);
        setField(term16228, term16228.getClass(), "templateTypeNames", null);
        setField(term16228, term16228.getClass(), "disposedParameters", term16244);
        setField(term16228, term16228.getClass(), "description", "");
        setField(term16228, term16228.getClass(), "meaning", "");
        setField(term16228, term16228.getClass(), "deprecated", "");
        setField(term16228, term16228.getClass(), "license", "");
        setField(term16228, term16228.getClass(), "suppressions", term16249);
        setField(term16228, term16228.getClass(), "modifies", term16250);
        setField(term16228, term16228.getClass(), "lendsName", "");
        setBooleanField(term16228, term16228.getClass(), "ngInject", true);
        setBooleanField(term16228, term16228.getClass(), "wizaction", true);
        setBooleanField(term16228, term16228.getClass(), "jaggerInject", false);
        setBooleanField(term16228, term16228.getClass(), "jaggerProvide", true);
        setBooleanField(term16228, term16228.getClass(), "jaggerModule", true);
        setField(term16227, term16227.getClass(), "info", term16228);
        setField(term16257, term16257.getClass(), "sourceComment", "");
        setField(term16257, term16257.getClass(), "markers", term16259);
        setField(term16257, term16257.getClass(), "parameters", term16262);
        setField(term16257, term16257.getClass(), "throwsDescriptions", null);
        setField(term16257, term16257.getClass(), "blockDescription", null);
        setField(term16257, term16257.getClass(), "fileOverview", null);
        setField(term16257, term16257.getClass(), "returnDescription", null);
        setField(term16257, term16257.getClass(), "version", null);
        setField(term16257, term16257.getClass(), "authors", null);
        setField(term16257, term16257.getClass(), "sees", null);
        setField(term16227, term16227.getClass(), "documentation", term16257);
        setIntField(term16267, term16267.getClass(), "type", 0);
        setField(term16267, term16267.getClass(), "next", null);
        setField(term16267, term16267.getClass(), "first", null);
        setField(term16267, term16267.getClass(), "last", null);
        setField(term16267, term16267.getClass(), "propListHead", null);
        setIntField(term16267, term16267.getClass(), "sourcePosition", 0);
        setField(term16267, term16267.getClass(), "jsType", null);
        setField(term16267, term16267.getClass(), "parent", null);
        setField(term16227, term16227.getClass(), "associatedNode", term16267);
        setField(term16227, term16227.getClass(), "visibility", enum212);
        setIntField(term16227, term16227.getClass(), "bitset", 487369012);
        setIntField(term16275, term16275.getClass(), "type", -932147928);
        setField(term16275, term16275.getClass(), "next", null);
        setField(term16275, term16275.getClass(), "first", null);
        setField(term16275, term16275.getClass(), "last", term16267);
        setField(term16275, term16275.getClass(), "propListHead", null);
        setIntField(term16275, term16275.getClass(), "sourcePosition", 0);
        setField(term16275, term16275.getClass(), "jsType", null);
        setField(term16275, term16275.getClass(), "parent", null);
        setField(term16274, term16274.getClass(), "root", term16275);
        setField(term16274, term16274.getClass(), "sourceName", "");
        setField(term16227, term16227.getClass(), "type", term16274);
        setField(term16227, term16227.getClass(), "thisType", term16274);
        setBooleanField(term16227, term16227.getClass(), "includeDocumentation", true);
        setIntField(term16227, term16227.getClass(), "originalCommentPosition", -179238712);
        setField(term16226, term16226.getClass(), "currentInfo", term16227);
        setBooleanField(term16226, term16226.getClass(), "populated", true);
        setBooleanField(term16226, term16226.getClass(), "parseDocumentation", true);
        setField(term16284, term16284.getClass(), "item", null);
        setIntField(term16284, term16284.getClass(), "startLineno", 0);
        setIntField(term16284, term16284.getClass(), "startCharno", 0);
        setIntField(term16284, term16284.getClass(), "endLineno", 0);
        setIntField(term16284, term16284.getClass(), "endCharno", 0);
        setField(term16283, term16283.getClass(), "annotation", term16284);
        setField(term16289, term16289.getClass(), "item", null);
        setIntField(term16289, term16289.getClass(), "startLineno", 0);
        setIntField(term16289, term16289.getClass(), "startCharno", 0);
        setIntField(term16289, term16289.getClass(), "endLineno", 0);
        setIntField(term16289, term16289.getClass(), "endCharno", 0);
        setField(term16283, term16283.getClass(), "name", term16289);
        setField(term16283, term16283.getClass(), "nameNode", null);
        setField(term16283, term16283.getClass(), "description", null);
        setField(term16283, term16283.getClass(), "type", null);
        setField(term16226, term16226.getClass(), "currentMarker", term16283);
        setField(term16181, term16181.getClass(), "jsdocBuilder", term16226);
        setField(term16181, term16181.getClass(), "sourceFile", null);
        setIntField(term16294, term16294.getClass(), "type", 0);
        setField(term16294, term16294.getClass(), "next", null);
        setField(term16294, term16294.getClass(), "first", null);
        setField(term16294, term16294.getClass(), "last", null);
        setField(term16294, term16294.getClass(), "propListHead", null);
        setIntField(term16294, term16294.getClass(), "sourcePosition", 0);
        setField(term16294, term16294.getClass(), "jsType", null);
        setField(term16294, term16294.getClass(), "parent", null);
        setField(term16181, term16181.getClass(), "associatedNode", term16294);
        setField(term16181, term16181.getClass(), "errorReporter", null);
        setField(term16181, term16181.getClass(), "parser", null);
        setField(term16181, term16181.getClass(), "templateNode", null);
        setField(term16181, term16181.getClass(), "fileOverviewJSDocInfo", null);
        setField(term16181, term16181.getClass(), "state", null);
        setField(term16181, term16181.getClass(), "annotationNames", null);
        setField(term16181, term16181.getClass(), "suppressionNames", null);
        setField(term16181, term16181.getClass(), "fileLevelJsDocBuilder", null);
        setField(term16181, term16181.getClass(), "unreadToken", null);
        Class<? extends Object> term148581 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term148580 = ((Class) term148581).getDeclaredField((String) "EOL");
        ((Field) term148580).setAccessible(true);
        enum213 = ((Field) term148580).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum213;
        try {
            callMethod(klass, "parseParamTypeExpressionAnnotation", argTypes, term16181, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


