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

public class JsDocInfoParser_match_1374275456112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29022;
     Object enum230;

    public JsDocInfoParser_match_1374275456112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29078 = new ArrayList();
        ((ArrayList) term29078).add((Object)null);
        ((ArrayList) term29078).add((Object)null);
        ((ArrayList) term29078).add((Object)null);
        ((ArrayList) term29078).add((Object)null);
        ((ArrayList) term29078).add((Object)null);
        ArrayList term29081 = new ArrayList();
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        ((ArrayList) term29081).add((Object)null);
        HashMap term29084 = new HashMap();
        ArrayList term29089 = new ArrayList();
        ((ArrayList) term29089).add((Object)null);
        ((ArrayList) term29089).add((Object)null);
        ((ArrayList) term29089).add((Object)null);
        Class<? extends Object> term124099 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term124098 = ((Class) term124099).getDeclaredField((String) "PUBLIC");
        ((Field) term124098).setAccessible(true);
        Object enum229 = ((Field) term124098).get((Object) null);
        term29022 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term29023 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term29036 = (char[]) newCharArray(8);
        int[] term29046 = (int[]) newIntArray(2);
        Object term29074 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term29075 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29076 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term29077 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term29094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29110 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29118 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term29119 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29124 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29023, term29023.getClass(), "string", "wmVoFoUVmU");
        setCharElement(term29036, 0, 'b');
        setCharElement(term29036, 1, 'U');
        setCharElement(term29036, 2, 'x');
        setCharElement(term29036, 3, 'O');
        setCharElement(term29036, 4, 'E');
        setCharElement(term29036, 5, 'q');
        setCharElement(term29036, 6, 'z');
        setCharElement(term29036, 7, 'G');
        setField(term29023, term29023.getClass(), "stringBuffer", term29036);
        setIntField(term29023, term29023.getClass(), "stringBufferTop", -1631415805);
        setIntElement(term29046, 0, 1073400519);
        setIntElement(term29046, 1, -2025555268);
        setField(term29023, term29023.getClass(), "ungetBuffer", term29046);
        setIntField(term29023, term29023.getClass(), "ungetCursor", -746950289);
        setBooleanField(term29023, term29023.getClass(), "hitEOF", true);
        setIntField(term29023, term29023.getClass(), "lineStart", -137577510);
        setIntField(term29023, term29023.getClass(), "lineEndChar", 719185716);
        setIntField(term29023, term29023.getClass(), "lineno", 1624820010);
        setIntField(term29023, term29023.getClass(), "charno", -831921156);
        setIntField(term29023, term29023.getClass(), "initCharno", -2085566906);
        setIntField(term29023, term29023.getClass(), "initLineno", 1773193728);
        setField(term29023, term29023.getClass(), "sourceString", "lLiSiPCciB");
        setIntField(term29023, term29023.getClass(), "sourceEnd", -1341357647);
        setIntField(term29023, term29023.getClass(), "sourceCursor", 138447019);
        setIntField(term29023, term29023.getClass(), "cursor", 114915275);
        setIntField(term29023, term29023.getClass(), "tokenBeg", 338519695);
        setIntField(term29023, term29023.getClass(), "tokenEnd", 2025566580);
        setField(term29022, term29022.getClass(), "stream", term29023);
        setField(term29077, term29077.getClass(), "root", null);
        setField(term29077, term29077.getClass(), "sourceName", null);
        setField(term29076, term29076.getClass(), "baseType", term29077);
        setField(term29076, term29076.getClass(), "extendedInterfaces", term29078);
        setField(term29076, term29076.getClass(), "implementedInterfaces", term29081);
        setField(term29076, term29076.getClass(), "parameters", term29084);
        setField(term29076, term29076.getClass(), "thrownTypes", term29089);
        setField(term29076, term29076.getClass(), "templateTypeNames", null);
        setField(term29076, term29076.getClass(), "classTemplateTypeNames", null);
        setField(term29076, term29076.getClass(), "description", null);
        setField(term29076, term29076.getClass(), "meaning", null);
        setField(term29076, term29076.getClass(), "deprecated", null);
        setField(term29076, term29076.getClass(), "license", null);
        setField(term29076, term29076.getClass(), "suppressions", null);
        setField(term29076, term29076.getClass(), "modifies", null);
        setField(term29076, term29076.getClass(), "lendsName", null);
        setBooleanField(term29076, term29076.getClass(), "ngInject", false);
        setField(term29075, term29075.getClass(), "info", term29076);
        setField(term29093, term29093.getClass(), "sourceComment", null);
        setField(term29093, term29093.getClass(), "markers", null);
        setField(term29093, term29093.getClass(), "parameters", null);
        setField(term29093, term29093.getClass(), "throwsDescriptions", null);
        setField(term29093, term29093.getClass(), "blockDescription", null);
        setField(term29093, term29093.getClass(), "fileOverview", null);
        setField(term29093, term29093.getClass(), "returnDescription", null);
        setField(term29093, term29093.getClass(), "version", null);
        setField(term29093, term29093.getClass(), "authors", null);
        setField(term29093, term29093.getClass(), "sees", null);
        setField(term29075, term29075.getClass(), "documentation", term29093);
        setIntField(term29094, term29094.getClass(), "type", 1923558221);
        setIntField(term29096, term29096.getClass(), "type", 1762934060);
        setField(term29096, term29096.getClass(), "next", null);
        setField(term29096, term29096.getClass(), "first", null);
        setField(term29096, term29096.getClass(), "last", null);
        setField(term29096, term29096.getClass(), "propListHead", null);
        setIntField(term29096, term29096.getClass(), "sourcePosition", 0);
        setField(term29096, term29096.getClass(), "jsType", null);
        setField(term29096, term29096.getClass(), "parent", null);
        setField(term29094, term29094.getClass(), "next", term29096);
        setIntField(term29099, term29099.getClass(), "type", -1231122778);
        setField(term29099, term29099.getClass(), "next", term29094);
        setField(term29099, term29099.getClass(), "first", null);
        setField(term29099, term29099.getClass(), "last", term29094);
        setField(term29099, term29099.getClass(), "propListHead", null);
        setIntField(term29099, term29099.getClass(), "sourcePosition", 0);
        setField(term29099, term29099.getClass(), "jsType", null);
        setField(term29099, term29099.getClass(), "parent", null);
        setField(term29094, term29094.getClass(), "first", term29099);
        setIntField(term29102, term29102.getClass(), "type", 0);
        setField(term29102, term29102.getClass(), "next", null);
        setField(term29102, term29102.getClass(), "first", null);
        setField(term29102, term29102.getClass(), "last", null);
        setField(term29102, term29102.getClass(), "propListHead", null);
        setIntField(term29102, term29102.getClass(), "sourcePosition", 0);
        setField(term29102, term29102.getClass(), "jsType", null);
        setField(term29102, term29102.getClass(), "parent", null);
        setField(term29094, term29094.getClass(), "last", term29102);
        setField(term29094, term29094.getClass(), "propListHead", null);
        setIntField(term29094, term29094.getClass(), "sourcePosition", 0);
        setField(term29094, term29094.getClass(), "jsType", null);
        setField(term29094, term29094.getClass(), "parent", null);
        setField(term29075, term29075.getClass(), "associatedNode", term29094);
        setField(term29075, term29075.getClass(), "visibility", enum229);
        setIntField(term29075, term29075.getClass(), "bitset", 1280322790);
        setIntField(term29111, term29111.getClass(), "type", 0);
        setField(term29111, term29111.getClass(), "next", null);
        setField(term29111, term29111.getClass(), "first", null);
        setField(term29111, term29111.getClass(), "last", null);
        setField(term29111, term29111.getClass(), "propListHead", null);
        setIntField(term29111, term29111.getClass(), "sourcePosition", 0);
        setField(term29111, term29111.getClass(), "jsType", null);
        setField(term29111, term29111.getClass(), "parent", null);
        setField(term29110, term29110.getClass(), "root", term29111);
        setField(term29110, term29110.getClass(), "sourceName", "");
        setField(term29075, term29075.getClass(), "type", term29110);
        setField(term29075, term29075.getClass(), "thisType", term29110);
        setBooleanField(term29075, term29075.getClass(), "includeDocumentation", false);
        setField(term29074, term29074.getClass(), "currentInfo", term29075);
        setBooleanField(term29074, term29074.getClass(), "populated", true);
        setBooleanField(term29074, term29074.getClass(), "parseDocumentation", true);
        setField(term29119, term29119.getClass(), "item", null);
        setIntField(term29119, term29119.getClass(), "startLineno", 0);
        setIntField(term29119, term29119.getClass(), "startCharno", 0);
        setIntField(term29119, term29119.getClass(), "endLineno", 0);
        setIntField(term29119, term29119.getClass(), "endCharno", 0);
        setField(term29118, term29118.getClass(), "annotation", term29119);
        setField(term29124, term29124.getClass(), "item", null);
        setIntField(term29124, term29124.getClass(), "startLineno", 0);
        setIntField(term29124, term29124.getClass(), "startCharno", 0);
        setIntField(term29124, term29124.getClass(), "endLineno", 0);
        setIntField(term29124, term29124.getClass(), "endCharno", 0);
        setField(term29118, term29118.getClass(), "name", term29124);
        setField(term29118, term29118.getClass(), "nameNode", null);
        setField(term29118, term29118.getClass(), "description", null);
        setField(term29118, term29118.getClass(), "type", null);
        setField(term29074, term29074.getClass(), "currentMarker", term29118);
        setField(term29022, term29022.getClass(), "jsdocBuilder", term29074);
        setField(term29022, term29022.getClass(), "sourceFile", null);
        setIntField(term29129, term29129.getClass(), "type", 0);
        setField(term29129, term29129.getClass(), "next", null);
        setField(term29129, term29129.getClass(), "first", null);
        setField(term29129, term29129.getClass(), "last", null);
        setField(term29129, term29129.getClass(), "propListHead", null);
        setIntField(term29129, term29129.getClass(), "sourcePosition", 0);
        setField(term29129, term29129.getClass(), "jsType", null);
        setField(term29129, term29129.getClass(), "parent", null);
        setField(term29022, term29022.getClass(), "associatedNode", term29129);
        setField(term29022, term29022.getClass(), "errorReporter", null);
        setField(term29022, term29022.getClass(), "parser", null);
        setField(term29022, term29022.getClass(), "templateNode", null);
        setField(term29022, term29022.getClass(), "fileOverviewJSDocInfo", null);
        setField(term29022, term29022.getClass(), "state", null);
        setField(term29022, term29022.getClass(), "annotationNames", null);
        setField(term29022, term29022.getClass(), "suppressionNames", null);
        setField(term29022, term29022.getClass(), "fileLevelJsDocBuilder", null);
        setField(term29022, term29022.getClass(), "unreadToken", null);
        Class<? extends Object> term124364 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term124363 = ((Class) term124364).getDeclaredField((String) "RP");
        ((Field) term124363).setAccessible(true);
        enum230 = ((Field) term124363).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum230;
        try {
            callMethod(klass, "match", argTypes, term29022, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


