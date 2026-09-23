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

public class JsDocInfoParser_parseResultType_83191788494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18912;
     Object enum203;

    public JsDocInfoParser_parseResultType_83191788494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18970 = new ArrayList();
        ((ArrayList) term18970).add((Object)null);
        ((ArrayList) term18970).add((Object)null);
        ArrayList term18973 = new ArrayList();
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        ((ArrayList) term18973).add((Object)null);
        HashMap term18976 = new HashMap();
        ArrayList term18981 = new ArrayList();
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        ((ArrayList) term18981).add((Object)null);
        Class<? extends Object> term115689 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term115687 = ((Class) term115689).getDeclaredField((String) "PRIVATE");
        ((Field) term115687).setAccessible(true);
        Object enum201 = ((Field) term115687).get((Object) null);
        term18912 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term18913 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term18926 = (char[]) newCharArray(6);
        int[] term18934 = (int[]) newIntArray(6);
        Object term18966 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term18967 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term18968 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term18969 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term18986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18993 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18998 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term18999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19007 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19012 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18913, term18913.getClass(), "string", "oKwCDqywym");
        setCharElement(term18926, 0, 'V');
        setCharElement(term18926, 1, 'z');
        setCharElement(term18926, 2, 'R');
        setCharElement(term18926, 3, 'f');
        setCharElement(term18926, 4, 'L');
        setCharElement(term18926, 5, 'Q');
        setField(term18913, term18913.getClass(), "stringBuffer", term18926);
        setIntField(term18913, term18913.getClass(), "stringBufferTop", -83178716);
        setIntElement(term18934, 0, -1292704466);
        setIntElement(term18934, 1, 1991858584);
        setIntElement(term18934, 2, -1300947782);
        setIntElement(term18934, 3, 188512644);
        setIntElement(term18934, 4, 1851127634);
        setIntElement(term18934, 5, 783730213);
        setField(term18913, term18913.getClass(), "ungetBuffer", term18934);
        setIntField(term18913, term18913.getClass(), "ungetCursor", 1815951606);
        setBooleanField(term18913, term18913.getClass(), "hitEOF", false);
        setIntField(term18913, term18913.getClass(), "lineStart", 1105016932);
        setIntField(term18913, term18913.getClass(), "lineEndChar", -365784998);
        setIntField(term18913, term18913.getClass(), "lineno", -1893236300);
        setIntField(term18913, term18913.getClass(), "charno", -1858909368);
        setIntField(term18913, term18913.getClass(), "initCharno", -280113263);
        setIntField(term18913, term18913.getClass(), "initLineno", 529625347);
        setField(term18913, term18913.getClass(), "sourceString", "zjZYTddemL");
        setIntField(term18913, term18913.getClass(), "sourceEnd", 1409095253);
        setIntField(term18913, term18913.getClass(), "sourceCursor", 315179039);
        setIntField(term18913, term18913.getClass(), "cursor", -1835923897);
        setIntField(term18913, term18913.getClass(), "tokenBeg", -341287775);
        setIntField(term18913, term18913.getClass(), "tokenEnd", -1651110911);
        setField(term18912, term18912.getClass(), "stream", term18913);
        setField(term18969, term18969.getClass(), "root", null);
        setField(term18969, term18969.getClass(), "sourceName", null);
        setField(term18968, term18968.getClass(), "baseType", term18969);
        setField(term18968, term18968.getClass(), "extendedInterfaces", term18970);
        setField(term18968, term18968.getClass(), "implementedInterfaces", term18973);
        setField(term18968, term18968.getClass(), "parameters", term18976);
        setField(term18968, term18968.getClass(), "thrownTypes", term18981);
        setField(term18968, term18968.getClass(), "templateTypeNames", null);
        setField(term18968, term18968.getClass(), "classTemplateTypeNames", null);
        setField(term18968, term18968.getClass(), "description", null);
        setField(term18968, term18968.getClass(), "meaning", null);
        setField(term18968, term18968.getClass(), "deprecated", null);
        setField(term18968, term18968.getClass(), "license", null);
        setField(term18968, term18968.getClass(), "suppressions", null);
        setField(term18968, term18968.getClass(), "modifies", null);
        setField(term18968, term18968.getClass(), "lendsName", null);
        setBooleanField(term18968, term18968.getClass(), "ngInject", false);
        setField(term18967, term18967.getClass(), "info", term18968);
        setField(term18985, term18985.getClass(), "sourceComment", null);
        setField(term18985, term18985.getClass(), "markers", null);
        setField(term18985, term18985.getClass(), "parameters", null);
        setField(term18985, term18985.getClass(), "throwsDescriptions", null);
        setField(term18985, term18985.getClass(), "blockDescription", null);
        setField(term18985, term18985.getClass(), "fileOverview", null);
        setField(term18985, term18985.getClass(), "returnDescription", null);
        setField(term18985, term18985.getClass(), "version", null);
        setField(term18985, term18985.getClass(), "authors", null);
        setField(term18985, term18985.getClass(), "sees", null);
        setField(term18967, term18967.getClass(), "documentation", term18985);
        setIntField(term18986, term18986.getClass(), "type", 0);
        setField(term18986, term18986.getClass(), "next", null);
        setField(term18986, term18986.getClass(), "first", null);
        setField(term18986, term18986.getClass(), "last", null);
        setField(term18986, term18986.getClass(), "propListHead", null);
        setIntField(term18986, term18986.getClass(), "sourcePosition", 0);
        setField(term18986, term18986.getClass(), "jsType", null);
        setField(term18986, term18986.getClass(), "parent", null);
        setField(term18967, term18967.getClass(), "associatedNode", term18986);
        setField(term18967, term18967.getClass(), "visibility", enum201);
        setIntField(term18967, term18967.getClass(), "bitset", 1418551216);
        setIntField(term18994, term18994.getClass(), "type", -2023791789);
        setField(term18994, term18994.getClass(), "next", null);
        setField(term18994, term18994.getClass(), "first", null);
        setField(term18994, term18994.getClass(), "last", term18986);
        setField(term18994, term18994.getClass(), "propListHead", null);
        setIntField(term18994, term18994.getClass(), "sourcePosition", 0);
        setField(term18994, term18994.getClass(), "jsType", null);
        setField(term18994, term18994.getClass(), "parent", null);
        setField(term18993, term18993.getClass(), "root", term18994);
        setField(term18993, term18993.getClass(), "sourceName", "");
        setField(term18967, term18967.getClass(), "type", term18993);
        setIntField(term18999, term18999.getClass(), "type", 0);
        setField(term18999, term18999.getClass(), "next", null);
        setField(term18999, term18999.getClass(), "first", null);
        setField(term18999, term18999.getClass(), "last", null);
        setField(term18999, term18999.getClass(), "propListHead", null);
        setIntField(term18999, term18999.getClass(), "sourcePosition", 0);
        setField(term18999, term18999.getClass(), "jsType", null);
        setField(term18999, term18999.getClass(), "parent", null);
        setField(term18998, term18998.getClass(), "root", term18999);
        setField(term18998, term18998.getClass(), "sourceName", "");
        setField(term18967, term18967.getClass(), "thisType", term18998);
        setBooleanField(term18967, term18967.getClass(), "includeDocumentation", true);
        setField(term18966, term18966.getClass(), "currentInfo", term18967);
        setBooleanField(term18966, term18966.getClass(), "populated", false);
        setBooleanField(term18966, term18966.getClass(), "parseDocumentation", false);
        setField(term19007, term19007.getClass(), "item", null);
        setIntField(term19007, term19007.getClass(), "startLineno", 0);
        setIntField(term19007, term19007.getClass(), "startCharno", 0);
        setIntField(term19007, term19007.getClass(), "endLineno", 0);
        setIntField(term19007, term19007.getClass(), "endCharno", 0);
        setField(term19006, term19006.getClass(), "annotation", term19007);
        setField(term19012, term19012.getClass(), "item", null);
        setIntField(term19012, term19012.getClass(), "startLineno", 0);
        setIntField(term19012, term19012.getClass(), "startCharno", 0);
        setIntField(term19012, term19012.getClass(), "endLineno", 0);
        setIntField(term19012, term19012.getClass(), "endCharno", 0);
        setField(term19006, term19006.getClass(), "name", term19012);
        setField(term19006, term19006.getClass(), "nameNode", null);
        setField(term19006, term19006.getClass(), "description", null);
        setField(term19006, term19006.getClass(), "type", null);
        setField(term18966, term18966.getClass(), "currentMarker", term19006);
        setField(term18912, term18912.getClass(), "jsdocBuilder", term18966);
        setField(term18912, term18912.getClass(), "sourceFile", null);
        setIntField(term19017, term19017.getClass(), "type", 0);
        setField(term19017, term19017.getClass(), "next", null);
        setField(term19017, term19017.getClass(), "first", null);
        setField(term19017, term19017.getClass(), "last", null);
        setField(term19017, term19017.getClass(), "propListHead", null);
        setIntField(term19017, term19017.getClass(), "sourcePosition", 0);
        setField(term19017, term19017.getClass(), "jsType", null);
        setField(term19017, term19017.getClass(), "parent", null);
        setField(term18912, term18912.getClass(), "associatedNode", term19017);
        setField(term18912, term18912.getClass(), "errorReporter", null);
        setField(term18912, term18912.getClass(), "parser", null);
        setField(term18912, term18912.getClass(), "templateNode", null);
        setField(term18912, term18912.getClass(), "fileOverviewJSDocInfo", null);
        setField(term18912, term18912.getClass(), "state", null);
        setField(term18912, term18912.getClass(), "annotationNames", null);
        setField(term18912, term18912.getClass(), "suppressionNames", null);
        setField(term18912, term18912.getClass(), "fileLevelJsDocBuilder", null);
        setField(term18912, term18912.getClass(), "unreadToken", null);
        Class<? extends Object> term116192 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term116191 = ((Class) term116192).getDeclaredField((String) "COLON");
        ((Field) term116191).setAccessible(true);
        enum203 = ((Field) term116191).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum203;
        try {
            callMethod(klass, "parseResultType", argTypes, term18912, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


