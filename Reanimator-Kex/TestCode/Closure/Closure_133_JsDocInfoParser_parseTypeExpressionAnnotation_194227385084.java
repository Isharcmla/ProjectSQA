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

public class JsDocInfoParser_parseTypeExpressionAnnotation_194227385084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12257;
     Object enum182;

    public JsDocInfoParser_parseTypeExpressionAnnotation_194227385084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12310 = new ArrayList();
        ((ArrayList) term12310).add((Object)null);
        ((ArrayList) term12310).add((Object)null);
        ((ArrayList) term12310).add((Object)null);
        ((ArrayList) term12310).add((Object)null);
        ((ArrayList) term12310).add((Object)null);
        ((ArrayList) term12310).add((Object)null);
        ArrayList term12313 = new ArrayList();
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        ((ArrayList) term12313).add((Object)null);
        HashMap term12316 = new HashMap();
        ArrayList term12321 = new ArrayList();
        ((ArrayList) term12321).add((Object)null);
        ((ArrayList) term12321).add((Object)null);
        ((ArrayList) term12321).add((Object)null);
        ((ArrayList) term12321).add((Object)null);
        ((ArrayList) term12321).add((Object)null);
        Class<? extends Object> term102653 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term102652 = ((Class) term102653).getDeclaredField((String) "PUBLIC");
        ((Field) term102652).setAccessible(true);
        Object enum181 = ((Field) term102652).get((Object) null);
        term12257 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term12258 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term12271 = (char[]) newCharArray(6);
        int[] term12279 = (int[]) newIntArray(1);
        Object term12306 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term12307 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12308 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12309 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12333 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12335 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term12341 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term12346 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term12351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12258, term12258.getClass(), "string", "ywmcuThdfL");
        setCharElement(term12271, 0, 'Y');
        setCharElement(term12271, 1, 'Y');
        setCharElement(term12271, 2, 'I');
        setCharElement(term12271, 3, 'r');
        setCharElement(term12271, 4, 'c');
        setCharElement(term12271, 5, 'R');
        setField(term12258, term12258.getClass(), "stringBuffer", term12271);
        setIntField(term12258, term12258.getClass(), "stringBufferTop", 1572907769);
        setIntElement(term12279, 0, 1608016787);
        setField(term12258, term12258.getClass(), "ungetBuffer", term12279);
        setIntField(term12258, term12258.getClass(), "ungetCursor", -516303035);
        setBooleanField(term12258, term12258.getClass(), "hitEOF", false);
        setIntField(term12258, term12258.getClass(), "lineStart", -2143043890);
        setIntField(term12258, term12258.getClass(), "lineEndChar", -2138825831);
        setIntField(term12258, term12258.getClass(), "lineno", 1454781562);
        setIntField(term12258, term12258.getClass(), "charno", -27944011);
        setIntField(term12258, term12258.getClass(), "initCharno", -20614472);
        setIntField(term12258, term12258.getClass(), "initLineno", 1126618861);
        setField(term12258, term12258.getClass(), "sourceString", "GBOEuByOfr");
        setIntField(term12258, term12258.getClass(), "sourceEnd", 947449400);
        setIntField(term12258, term12258.getClass(), "sourceCursor", -763799087);
        setIntField(term12258, term12258.getClass(), "cursor", 1207142014);
        setIntField(term12258, term12258.getClass(), "tokenBeg", -876426634);
        setIntField(term12258, term12258.getClass(), "tokenEnd", 213831054);
        setField(term12257, term12257.getClass(), "stream", term12258);
        setField(term12309, term12309.getClass(), "root", null);
        setField(term12309, term12309.getClass(), "sourceName", null);
        setField(term12308, term12308.getClass(), "baseType", term12309);
        setField(term12308, term12308.getClass(), "extendedInterfaces", term12310);
        setField(term12308, term12308.getClass(), "implementedInterfaces", term12313);
        setField(term12308, term12308.getClass(), "parameters", term12316);
        setField(term12308, term12308.getClass(), "thrownTypes", term12321);
        setField(term12308, term12308.getClass(), "templateTypeNames", null);
        setField(term12308, term12308.getClass(), "classTemplateTypeNames", null);
        setField(term12308, term12308.getClass(), "description", null);
        setField(term12308, term12308.getClass(), "meaning", null);
        setField(term12308, term12308.getClass(), "deprecated", null);
        setField(term12308, term12308.getClass(), "license", null);
        setField(term12308, term12308.getClass(), "suppressions", null);
        setField(term12308, term12308.getClass(), "modifies", null);
        setField(term12308, term12308.getClass(), "lendsName", null);
        setBooleanField(term12308, term12308.getClass(), "ngInject", false);
        setField(term12307, term12307.getClass(), "info", term12308);
        setField(term12325, term12325.getClass(), "sourceComment", null);
        setField(term12325, term12325.getClass(), "markers", null);
        setField(term12325, term12325.getClass(), "parameters", null);
        setField(term12325, term12325.getClass(), "throwsDescriptions", null);
        setField(term12325, term12325.getClass(), "blockDescription", null);
        setField(term12325, term12325.getClass(), "fileOverview", null);
        setField(term12325, term12325.getClass(), "returnDescription", null);
        setField(term12325, term12325.getClass(), "version", null);
        setField(term12325, term12325.getClass(), "authors", null);
        setField(term12325, term12325.getClass(), "sees", null);
        setField(term12307, term12307.getClass(), "documentation", term12325);
        setIntField(term12326, term12326.getClass(), "type", 0);
        setField(term12326, term12326.getClass(), "next", null);
        setField(term12326, term12326.getClass(), "first", null);
        setField(term12326, term12326.getClass(), "last", null);
        setField(term12326, term12326.getClass(), "propListHead", null);
        setIntField(term12326, term12326.getClass(), "sourcePosition", 0);
        setField(term12326, term12326.getClass(), "jsType", null);
        setField(term12326, term12326.getClass(), "parent", null);
        setField(term12307, term12307.getClass(), "associatedNode", term12326);
        setField(term12307, term12307.getClass(), "visibility", enum181);
        setIntField(term12307, term12307.getClass(), "bitset", -695279311);
        setField(term12333, term12333.getClass(), "root", term12326);
        setField(term12333, term12333.getClass(), "sourceName", "");
        setField(term12307, term12307.getClass(), "type", term12333);
        setField(term12335, term12335.getClass(), "root", term12326);
        setField(term12335, term12335.getClass(), "sourceName", "");
        setField(term12307, term12307.getClass(), "thisType", term12335);
        setBooleanField(term12307, term12307.getClass(), "includeDocumentation", true);
        setField(term12306, term12306.getClass(), "currentInfo", term12307);
        setBooleanField(term12306, term12306.getClass(), "populated", false);
        setBooleanField(term12306, term12306.getClass(), "parseDocumentation", false);
        setField(term12341, term12341.getClass(), "item", null);
        setIntField(term12341, term12341.getClass(), "startLineno", 0);
        setIntField(term12341, term12341.getClass(), "startCharno", 0);
        setIntField(term12341, term12341.getClass(), "endLineno", 0);
        setIntField(term12341, term12341.getClass(), "endCharno", 0);
        setField(term12340, term12340.getClass(), "annotation", term12341);
        setField(term12346, term12346.getClass(), "item", null);
        setIntField(term12346, term12346.getClass(), "startLineno", 0);
        setIntField(term12346, term12346.getClass(), "startCharno", 0);
        setIntField(term12346, term12346.getClass(), "endLineno", 0);
        setIntField(term12346, term12346.getClass(), "endCharno", 0);
        setField(term12340, term12340.getClass(), "name", term12346);
        setField(term12340, term12340.getClass(), "nameNode", null);
        setField(term12340, term12340.getClass(), "description", null);
        setField(term12340, term12340.getClass(), "type", null);
        setField(term12306, term12306.getClass(), "currentMarker", term12340);
        setField(term12257, term12257.getClass(), "jsdocBuilder", term12306);
        setField(term12257, term12257.getClass(), "sourceFile", null);
        setIntField(term12351, term12351.getClass(), "type", 0);
        setField(term12351, term12351.getClass(), "next", null);
        setField(term12351, term12351.getClass(), "first", null);
        setField(term12351, term12351.getClass(), "last", null);
        setField(term12351, term12351.getClass(), "propListHead", null);
        setIntField(term12351, term12351.getClass(), "sourcePosition", 0);
        setField(term12351, term12351.getClass(), "jsType", null);
        setField(term12351, term12351.getClass(), "parent", null);
        setField(term12257, term12257.getClass(), "associatedNode", term12351);
        setField(term12257, term12257.getClass(), "errorReporter", null);
        setField(term12257, term12257.getClass(), "parser", null);
        setField(term12257, term12257.getClass(), "templateNode", null);
        setField(term12257, term12257.getClass(), "fileOverviewJSDocInfo", null);
        setField(term12257, term12257.getClass(), "state", null);
        setField(term12257, term12257.getClass(), "annotationNames", null);
        setField(term12257, term12257.getClass(), "suppressionNames", null);
        setField(term12257, term12257.getClass(), "fileLevelJsDocBuilder", null);
        setField(term12257, term12257.getClass(), "unreadToken", null);
        Class<? extends Object> term102918 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term102917 = ((Class) term102918).getDeclaredField((String) "GT");
        ((Field) term102917).setAccessible(true);
        enum182 = ((Field) term102917).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum182;
        try {
            callMethod(klass, "parseTypeExpressionAnnotation", argTypes, term12257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


