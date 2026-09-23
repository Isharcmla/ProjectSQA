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

public class JsDocInfoParser_parseFunctionType_191283045589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19164;
     Object enum199;

    public JsDocInfoParser_parseFunctionType_191283045589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19216 = new ArrayList();
        ((ArrayList) term19216).add((Object)null);
        ArrayList term19219 = new ArrayList();
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        ((ArrayList) term19219).add((Object)null);
        HashMap term19222 = new HashMap();
        ArrayList term19227 = new ArrayList();
        ((ArrayList) term19227).add((Object)null);
        ((ArrayList) term19227).add((Object)null);
        ((ArrayList) term19227).add((Object)null);
        ((ArrayList) term19227).add((Object)null);
        ((ArrayList) term19227).add((Object)null);
        ((ArrayList) term19227).add((Object)null);
        HashSet term19235 = new HashSet();
        HashSet term19236 = new HashSet();
        ArrayList term19240 = new ArrayList();
        ((ArrayList) term19240).add((Object)null);
        ((ArrayList) term19240).add((Object)null);
        ((ArrayList) term19240).add((Object)null);
        HashMap term19243 = new HashMap();
        Class<? extends Object> term105269 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term105268 = ((Class) term105269).getDeclaredField((String) "PUBLIC");
        ((Field) term105268).setAccessible(true);
        Object enum198 = ((Field) term105268).get((Object) null);
        term19164 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term19165 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term19178 = (char[]) newCharArray(5);
        int[] term19185 = (int[]) newIntArray(1);
        Object term19212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term19213 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19214 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19215 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19238 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19264 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19273 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19278 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19165, term19165.getClass(), "string", "Yrvtdcltri");
        setCharElement(term19178, 0, 'M');
        setCharElement(term19178, 1, 'x');
        setCharElement(term19178, 2, 'l');
        setCharElement(term19178, 3, 's');
        setCharElement(term19178, 4, 'z');
        setField(term19165, term19165.getClass(), "stringBuffer", term19178);
        setIntField(term19165, term19165.getClass(), "stringBufferTop", -1511130237);
        setIntElement(term19185, 0, 452088587);
        setField(term19165, term19165.getClass(), "ungetBuffer", term19185);
        setIntField(term19165, term19165.getClass(), "ungetCursor", -1630069454);
        setBooleanField(term19165, term19165.getClass(), "hitEOF", false);
        setIntField(term19165, term19165.getClass(), "lineStart", 1499735894);
        setIntField(term19165, term19165.getClass(), "lineEndChar", 716486048);
        setIntField(term19165, term19165.getClass(), "lineno", -466708718);
        setIntField(term19165, term19165.getClass(), "charno", 1038029515);
        setIntField(term19165, term19165.getClass(), "initCharno", 1137154606);
        setIntField(term19165, term19165.getClass(), "initLineno", -100681578);
        setField(term19165, term19165.getClass(), "sourceString", "RxrsjXRVcT");
        setIntField(term19165, term19165.getClass(), "sourceEnd", 296568835);
        setIntField(term19165, term19165.getClass(), "sourceCursor", 1431951992);
        setIntField(term19165, term19165.getClass(), "cursor", -1608123016);
        setIntField(term19165, term19165.getClass(), "tokenBeg", -896473214);
        setIntField(term19165, term19165.getClass(), "tokenEnd", 401203924);
        setField(term19164, term19164.getClass(), "stream", term19165);
        setField(term19215, term19215.getClass(), "root", null);
        setField(term19215, term19215.getClass(), "sourceName", null);
        setField(term19214, term19214.getClass(), "baseType", term19215);
        setField(term19214, term19214.getClass(), "extendedInterfaces", term19216);
        setField(term19214, term19214.getClass(), "implementedInterfaces", term19219);
        setField(term19214, term19214.getClass(), "parameters", term19222);
        setField(term19214, term19214.getClass(), "thrownTypes", term19227);
        setField(term19214, term19214.getClass(), "templateTypeName", "");
        setField(term19214, term19214.getClass(), "description", "");
        setField(term19214, term19214.getClass(), "meaning", "");
        setField(term19214, term19214.getClass(), "deprecated", "");
        setField(term19214, term19214.getClass(), "license", "");
        setField(term19214, term19214.getClass(), "suppressions", term19235);
        setField(term19214, term19214.getClass(), "modifies", term19236);
        setField(term19214, term19214.getClass(), "lendsName", "");
        setField(term19213, term19213.getClass(), "info", term19214);
        setField(term19238, term19238.getClass(), "sourceComment", "");
        setField(term19238, term19238.getClass(), "markers", term19240);
        setField(term19238, term19238.getClass(), "parameters", term19243);
        setField(term19238, term19238.getClass(), "throwsDescriptions", null);
        setField(term19238, term19238.getClass(), "blockDescription", null);
        setField(term19238, term19238.getClass(), "fileOverview", null);
        setField(term19238, term19238.getClass(), "returnDescription", null);
        setField(term19238, term19238.getClass(), "version", null);
        setField(term19238, term19238.getClass(), "authors", null);
        setField(term19238, term19238.getClass(), "sees", null);
        setField(term19213, term19213.getClass(), "documentation", term19238);
        setIntField(term19248, term19248.getClass(), "type", 2107679041);
        setIntField(term19250, term19250.getClass(), "type", 2040965507);
        setField(term19250, term19250.getClass(), "next", null);
        setField(term19250, term19250.getClass(), "first", null);
        setField(term19250, term19250.getClass(), "last", null);
        setField(term19250, term19250.getClass(), "propListHead", null);
        setIntField(term19250, term19250.getClass(), "sourcePosition", 0);
        setField(term19250, term19250.getClass(), "jsType", null);
        setField(term19250, term19250.getClass(), "parent", null);
        setField(term19248, term19248.getClass(), "next", term19250);
        setIntField(term19253, term19253.getClass(), "type", -1212399479);
        setField(term19253, term19253.getClass(), "next", term19248);
        setField(term19253, term19253.getClass(), "first", null);
        setField(term19253, term19253.getClass(), "last", term19248);
        setField(term19253, term19253.getClass(), "propListHead", null);
        setIntField(term19253, term19253.getClass(), "sourcePosition", 0);
        setField(term19253, term19253.getClass(), "jsType", null);
        setField(term19253, term19253.getClass(), "parent", null);
        setField(term19248, term19248.getClass(), "first", term19253);
        setIntField(term19256, term19256.getClass(), "type", 0);
        setField(term19256, term19256.getClass(), "next", null);
        setField(term19256, term19256.getClass(), "first", null);
        setField(term19256, term19256.getClass(), "last", null);
        setField(term19256, term19256.getClass(), "propListHead", null);
        setIntField(term19256, term19256.getClass(), "sourcePosition", 0);
        setField(term19256, term19256.getClass(), "jsType", null);
        setField(term19256, term19256.getClass(), "parent", null);
        setField(term19248, term19248.getClass(), "last", term19256);
        setField(term19248, term19248.getClass(), "propListHead", null);
        setIntField(term19248, term19248.getClass(), "sourcePosition", 0);
        setField(term19248, term19248.getClass(), "jsType", null);
        setField(term19248, term19248.getClass(), "parent", null);
        setField(term19213, term19213.getClass(), "associatedNode", term19248);
        setField(term19213, term19213.getClass(), "visibility", enum198);
        setIntField(term19213, term19213.getClass(), "bitset", -1967153290);
        setIntField(term19265, term19265.getClass(), "type", 0);
        setField(term19265, term19265.getClass(), "next", null);
        setField(term19265, term19265.getClass(), "first", null);
        setField(term19265, term19265.getClass(), "last", null);
        setField(term19265, term19265.getClass(), "propListHead", null);
        setIntField(term19265, term19265.getClass(), "sourcePosition", 0);
        setField(term19265, term19265.getClass(), "jsType", null);
        setField(term19265, term19265.getClass(), "parent", null);
        setField(term19264, term19264.getClass(), "root", term19265);
        setField(term19264, term19264.getClass(), "sourceName", "");
        setField(term19213, term19213.getClass(), "type", term19264);
        setField(term19213, term19213.getClass(), "thisType", term19264);
        setBooleanField(term19213, term19213.getClass(), "includeDocumentation", false);
        setField(term19212, term19212.getClass(), "currentInfo", term19213);
        setBooleanField(term19212, term19212.getClass(), "populated", false);
        setBooleanField(term19212, term19212.getClass(), "parseDocumentation", true);
        setField(term19273, term19273.getClass(), "item", null);
        setIntField(term19273, term19273.getClass(), "startLineno", 0);
        setIntField(term19273, term19273.getClass(), "startCharno", 0);
        setIntField(term19273, term19273.getClass(), "endLineno", 0);
        setIntField(term19273, term19273.getClass(), "endCharno", 0);
        setField(term19272, term19272.getClass(), "annotation", term19273);
        setField(term19278, term19278.getClass(), "item", null);
        setIntField(term19278, term19278.getClass(), "startLineno", 0);
        setIntField(term19278, term19278.getClass(), "startCharno", 0);
        setIntField(term19278, term19278.getClass(), "endLineno", 0);
        setIntField(term19278, term19278.getClass(), "endCharno", 0);
        setField(term19272, term19272.getClass(), "name", term19278);
        setField(term19272, term19272.getClass(), "nameNode", null);
        setField(term19272, term19272.getClass(), "description", null);
        setField(term19272, term19272.getClass(), "type", null);
        setField(term19212, term19212.getClass(), "currentMarker", term19272);
        setField(term19164, term19164.getClass(), "jsdocBuilder", term19212);
        setField(term19164, term19164.getClass(), "sourceFile", null);
        setIntField(term19283, term19283.getClass(), "type", 0);
        setField(term19283, term19283.getClass(), "next", null);
        setField(term19283, term19283.getClass(), "first", null);
        setField(term19283, term19283.getClass(), "last", null);
        setField(term19283, term19283.getClass(), "propListHead", null);
        setIntField(term19283, term19283.getClass(), "sourcePosition", 0);
        setField(term19283, term19283.getClass(), "jsType", null);
        setField(term19283, term19283.getClass(), "parent", null);
        setField(term19164, term19164.getClass(), "associatedNode", term19283);
        setField(term19164, term19164.getClass(), "errorReporter", null);
        setField(term19164, term19164.getClass(), "parser", null);
        setField(term19164, term19164.getClass(), "templateNode", null);
        setField(term19164, term19164.getClass(), "fileOverviewJSDocInfo", null);
        setField(term19164, term19164.getClass(), "state", null);
        setField(term19164, term19164.getClass(), "annotationNames", null);
        setField(term19164, term19164.getClass(), "suppressionNames", null);
        setField(term19164, term19164.getClass(), "fileLevelJsDocBuilder", null);
        setField(term19164, term19164.getClass(), "unreadToken", null);
        Class<? extends Object> term105534 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term105533 = ((Class) term105534).getDeclaredField((String) "LP");
        ((Field) term105533).setAccessible(true);
        enum199 = ((Field) term105533).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum199;
        try {
            callMethod(klass, "parseFunctionType", argTypes, term19164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


