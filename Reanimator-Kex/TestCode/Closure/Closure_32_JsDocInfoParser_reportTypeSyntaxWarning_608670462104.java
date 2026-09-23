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
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_reportTypeSyntaxWarning_608670462104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28223;

    public JsDocInfoParser_reportTypeSyntaxWarning_608670462104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28276 = new ArrayList();
        ((ArrayList) term28276).add((Object)null);
        ((ArrayList) term28276).add((Object)null);
        ((ArrayList) term28276).add((Object)null);
        ((ArrayList) term28276).add((Object)null);
        ((ArrayList) term28276).add((Object)null);
        ((ArrayList) term28276).add((Object)null);
        ArrayList term28279 = new ArrayList();
        ((ArrayList) term28279).add((Object)null);
        ((ArrayList) term28279).add((Object)null);
        ((ArrayList) term28279).add((Object)null);
        ((ArrayList) term28279).add((Object)null);
        HashMap term28282 = new HashMap();
        ArrayList term28287 = new ArrayList();
        ((ArrayList) term28287).add((Object)null);
        ((ArrayList) term28287).add((Object)null);
        HashSet term28295 = new HashSet();
        HashSet term28296 = new HashSet();
        ArrayList term28300 = new ArrayList();
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        ((ArrayList) term28300).add((Object)null);
        HashMap term28303 = new HashMap();
        Class<? extends Object> term112739 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term112738 = ((Class) term112739).getDeclaredField((String) "PRIVATE");
        ((Field) term112738).setAccessible(true);
        Object enum223 = ((Field) term112738).get((Object) null);
        term28223 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term28224 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term28237 = (char[]) newCharArray(0);
        int[] term28239 = (int[]) newIntArray(7);
        Object term28272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term28273 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term28274 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term28275 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28298 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term28308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28324 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28326 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term28327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28334 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term28335 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term28340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term28224, term28224.getClass(), "string", "wKIBUlfNCx");
        setField(term28224, term28224.getClass(), "stringBuffer", term28237);
        setIntField(term28224, term28224.getClass(), "stringBufferTop", -1793997256);
        setIntElement(term28239, 0, -1271598018);
        setIntElement(term28239, 1, 157967613);
        setIntElement(term28239, 2, 811839399);
        setIntElement(term28239, 3, 593962063);
        setIntElement(term28239, 4, -1485826786);
        setIntElement(term28239, 5, -1549952664);
        setIntElement(term28239, 6, 148394188);
        setField(term28224, term28224.getClass(), "ungetBuffer", term28239);
        setIntField(term28224, term28224.getClass(), "ungetCursor", 504525721);
        setBooleanField(term28224, term28224.getClass(), "hitEOF", true);
        setIntField(term28224, term28224.getClass(), "lineStart", 1835568392);
        setIntField(term28224, term28224.getClass(), "lineEndChar", 457470807);
        setIntField(term28224, term28224.getClass(), "lineno", -994742871);
        setIntField(term28224, term28224.getClass(), "charno", -222412326);
        setIntField(term28224, term28224.getClass(), "initCharno", -299497261);
        setIntField(term28224, term28224.getClass(), "initLineno", -23054366);
        setField(term28224, term28224.getClass(), "sourceString", "iGfMUWRvod");
        setIntField(term28224, term28224.getClass(), "sourceEnd", 153009426);
        setIntField(term28224, term28224.getClass(), "sourceCursor", 185751892);
        setIntField(term28224, term28224.getClass(), "cursor", 1068256001);
        setIntField(term28224, term28224.getClass(), "tokenBeg", 1139078354);
        setIntField(term28224, term28224.getClass(), "tokenEnd", -691164974);
        setField(term28223, term28223.getClass(), "stream", term28224);
        setField(term28275, term28275.getClass(), "root", null);
        setField(term28275, term28275.getClass(), "sourceName", null);
        setField(term28274, term28274.getClass(), "baseType", term28275);
        setField(term28274, term28274.getClass(), "extendedInterfaces", term28276);
        setField(term28274, term28274.getClass(), "implementedInterfaces", term28279);
        setField(term28274, term28274.getClass(), "parameters", term28282);
        setField(term28274, term28274.getClass(), "thrownTypes", term28287);
        setField(term28274, term28274.getClass(), "templateTypeName", "");
        setField(term28274, term28274.getClass(), "description", "");
        setField(term28274, term28274.getClass(), "meaning", "");
        setField(term28274, term28274.getClass(), "deprecated", "");
        setField(term28274, term28274.getClass(), "license", "");
        setField(term28274, term28274.getClass(), "suppressions", term28295);
        setField(term28274, term28274.getClass(), "modifies", term28296);
        setField(term28274, term28274.getClass(), "lendsName", "");
        setField(term28273, term28273.getClass(), "info", term28274);
        setField(term28298, term28298.getClass(), "sourceComment", "");
        setField(term28298, term28298.getClass(), "markers", term28300);
        setField(term28298, term28298.getClass(), "parameters", term28303);
        setField(term28298, term28298.getClass(), "throwsDescriptions", null);
        setField(term28298, term28298.getClass(), "blockDescription", null);
        setField(term28298, term28298.getClass(), "fileOverview", null);
        setField(term28298, term28298.getClass(), "returnDescription", null);
        setField(term28298, term28298.getClass(), "version", null);
        setField(term28298, term28298.getClass(), "authors", null);
        setField(term28298, term28298.getClass(), "sees", null);
        setField(term28273, term28273.getClass(), "documentation", term28298);
        setIntField(term28308, term28308.getClass(), "type", 1077647088);
        setIntField(term28310, term28310.getClass(), "type", 0);
        setField(term28310, term28310.getClass(), "next", null);
        setField(term28310, term28310.getClass(), "first", null);
        setField(term28310, term28310.getClass(), "last", null);
        setField(term28310, term28310.getClass(), "propListHead", null);
        setIntField(term28310, term28310.getClass(), "sourcePosition", 0);
        setField(term28310, term28310.getClass(), "jsType", null);
        setField(term28310, term28310.getClass(), "parent", null);
        setField(term28308, term28308.getClass(), "next", term28310);
        setIntField(term28313, term28313.getClass(), "type", 0);
        setField(term28313, term28313.getClass(), "next", null);
        setField(term28313, term28313.getClass(), "first", null);
        setField(term28313, term28313.getClass(), "last", null);
        setField(term28313, term28313.getClass(), "propListHead", null);
        setIntField(term28313, term28313.getClass(), "sourcePosition", 0);
        setField(term28313, term28313.getClass(), "jsType", null);
        setField(term28313, term28313.getClass(), "parent", null);
        setField(term28308, term28308.getClass(), "first", term28313);
        setIntField(term28316, term28316.getClass(), "type", 0);
        setField(term28316, term28316.getClass(), "next", null);
        setField(term28316, term28316.getClass(), "first", null);
        setField(term28316, term28316.getClass(), "last", null);
        setField(term28316, term28316.getClass(), "propListHead", null);
        setIntField(term28316, term28316.getClass(), "sourcePosition", 0);
        setField(term28316, term28316.getClass(), "jsType", null);
        setField(term28316, term28316.getClass(), "parent", null);
        setField(term28308, term28308.getClass(), "last", term28316);
        setField(term28308, term28308.getClass(), "propListHead", null);
        setIntField(term28308, term28308.getClass(), "sourcePosition", 0);
        setField(term28308, term28308.getClass(), "jsType", null);
        setField(term28308, term28308.getClass(), "parent", null);
        setField(term28273, term28273.getClass(), "associatedNode", term28308);
        setField(term28273, term28273.getClass(), "visibility", enum223);
        setIntField(term28273, term28273.getClass(), "bitset", -705176810);
        setField(term28324, term28324.getClass(), "root", term28316);
        setField(term28324, term28324.getClass(), "sourceName", "");
        setField(term28273, term28273.getClass(), "type", term28324);
        setIntField(term28327, term28327.getClass(), "type", -1954860951);
        setField(term28327, term28327.getClass(), "next", null);
        setField(term28327, term28327.getClass(), "first", null);
        setField(term28327, term28327.getClass(), "last", term28310);
        setField(term28327, term28327.getClass(), "propListHead", null);
        setIntField(term28327, term28327.getClass(), "sourcePosition", 0);
        setField(term28327, term28327.getClass(), "jsType", null);
        setField(term28327, term28327.getClass(), "parent", null);
        setField(term28326, term28326.getClass(), "root", term28327);
        setField(term28326, term28326.getClass(), "sourceName", "");
        setField(term28273, term28273.getClass(), "thisType", term28326);
        setBooleanField(term28273, term28273.getClass(), "includeDocumentation", false);
        setField(term28272, term28272.getClass(), "currentInfo", term28273);
        setBooleanField(term28272, term28272.getClass(), "populated", true);
        setBooleanField(term28272, term28272.getClass(), "parseDocumentation", true);
        setField(term28335, term28335.getClass(), "item", null);
        setIntField(term28335, term28335.getClass(), "startLineno", 0);
        setIntField(term28335, term28335.getClass(), "startCharno", 0);
        setIntField(term28335, term28335.getClass(), "endLineno", 0);
        setIntField(term28335, term28335.getClass(), "endCharno", 0);
        setField(term28334, term28334.getClass(), "annotation", term28335);
        setField(term28340, term28340.getClass(), "item", null);
        setIntField(term28340, term28340.getClass(), "startLineno", 0);
        setIntField(term28340, term28340.getClass(), "startCharno", 0);
        setIntField(term28340, term28340.getClass(), "endLineno", 0);
        setIntField(term28340, term28340.getClass(), "endCharno", 0);
        setField(term28334, term28334.getClass(), "name", term28340);
        setField(term28334, term28334.getClass(), "nameNode", null);
        setField(term28334, term28334.getClass(), "description", null);
        setField(term28334, term28334.getClass(), "type", null);
        setField(term28272, term28272.getClass(), "currentMarker", term28334);
        setField(term28223, term28223.getClass(), "jsdocBuilder", term28272);
        setField(term28223, term28223.getClass(), "sourceFile", null);
        setField(term28223, term28223.getClass(), "associatedNode", term28313);
        setField(term28223, term28223.getClass(), "errorReporter", null);
        setField(term28223, term28223.getClass(), "parser", null);
        setField(term28223, term28223.getClass(), "templateNode", null);
        setField(term28223, term28223.getClass(), "fileOverviewJSDocInfo", null);
        setField(term28223, term28223.getClass(), "state", null);
        setField(term28223, term28223.getClass(), "annotationNames", null);
        setField(term28223, term28223.getClass(), "suppressionNames", null);
        setField(term28223, term28223.getClass(), "fileLevelJsDocBuilder", null);
        setField(term28223, term28223.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tViQSKUCLE";
        try {
            callMethod(klass, "reportTypeSyntaxWarning", argTypes, term28223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


