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

public class JsDocInfoParser_parseTopLevelTypeExpression_204703391487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14243;
     Object enum188;

    public JsDocInfoParser_parseTopLevelTypeExpression_204703391487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14300 = new ArrayList();
        ((ArrayList) term14300).add((Object)null);
        ((ArrayList) term14300).add((Object)null);
        ((ArrayList) term14300).add((Object)null);
        ((ArrayList) term14300).add((Object)null);
        ((ArrayList) term14300).add((Object)null);
        ((ArrayList) term14300).add((Object)null);
        ArrayList term14303 = new ArrayList();
        ((ArrayList) term14303).add((Object)null);
        ((ArrayList) term14303).add((Object)null);
        ((ArrayList) term14303).add((Object)null);
        ((ArrayList) term14303).add((Object)null);
        HashMap term14306 = new HashMap();
        ArrayList term14311 = new ArrayList();
        ((ArrayList) term14311).add((Object)null);
        Class<? extends Object> term110000 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term109998 = ((Class) term110000).getDeclaredField((String) "PRIVATE");
        ((Field) term109998).setAccessible(true);
        Object enum187 = ((Field) term109998).get((Object) null);
        term14243 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term14244 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term14257 = (char[]) newCharArray(7);
        int[] term14266 = (int[]) newIntArray(4);
        Object term14296 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term14297 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14298 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14299 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14315 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14323 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14328 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14333 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term14334 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term14339 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term14344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14244, term14244.getClass(), "string", "WxYUTuqmIq");
        setCharElement(term14257, 0, 'e');
        setCharElement(term14257, 1, 'N');
        setCharElement(term14257, 2, 'R');
        setCharElement(term14257, 3, 'd');
        setCharElement(term14257, 4, 'v');
        setCharElement(term14257, 5, 'g');
        setCharElement(term14257, 6, 'J');
        setField(term14244, term14244.getClass(), "stringBuffer", term14257);
        setIntField(term14244, term14244.getClass(), "stringBufferTop", -1224443634);
        setIntElement(term14266, 0, 1048451946);
        setIntElement(term14266, 1, 5603560);
        setIntElement(term14266, 2, -1079020032);
        setIntElement(term14266, 3, -1973791064);
        setField(term14244, term14244.getClass(), "ungetBuffer", term14266);
        setIntField(term14244, term14244.getClass(), "ungetCursor", -2072158633);
        setBooleanField(term14244, term14244.getClass(), "hitEOF", true);
        setIntField(term14244, term14244.getClass(), "lineStart", -355469363);
        setIntField(term14244, term14244.getClass(), "lineEndChar", 1465188553);
        setIntField(term14244, term14244.getClass(), "lineno", 1633913667);
        setIntField(term14244, term14244.getClass(), "charno", 1292332296);
        setIntField(term14244, term14244.getClass(), "initCharno", -1415256843);
        setIntField(term14244, term14244.getClass(), "initLineno", 612177768);
        setField(term14244, term14244.getClass(), "sourceString", "OeQLvhVERT");
        setIntField(term14244, term14244.getClass(), "sourceEnd", -1626451656);
        setIntField(term14244, term14244.getClass(), "sourceCursor", 173952451);
        setIntField(term14244, term14244.getClass(), "cursor", -1972033388);
        setIntField(term14244, term14244.getClass(), "tokenBeg", -1005024758);
        setIntField(term14244, term14244.getClass(), "tokenEnd", 2634669);
        setField(term14243, term14243.getClass(), "stream", term14244);
        setField(term14299, term14299.getClass(), "root", null);
        setField(term14299, term14299.getClass(), "sourceName", null);
        setField(term14298, term14298.getClass(), "baseType", term14299);
        setField(term14298, term14298.getClass(), "extendedInterfaces", term14300);
        setField(term14298, term14298.getClass(), "implementedInterfaces", term14303);
        setField(term14298, term14298.getClass(), "parameters", term14306);
        setField(term14298, term14298.getClass(), "thrownTypes", term14311);
        setField(term14298, term14298.getClass(), "templateTypeNames", null);
        setField(term14298, term14298.getClass(), "classTemplateTypeNames", null);
        setField(term14298, term14298.getClass(), "description", null);
        setField(term14298, term14298.getClass(), "meaning", null);
        setField(term14298, term14298.getClass(), "deprecated", null);
        setField(term14298, term14298.getClass(), "license", null);
        setField(term14298, term14298.getClass(), "suppressions", null);
        setField(term14298, term14298.getClass(), "modifies", null);
        setField(term14298, term14298.getClass(), "lendsName", null);
        setBooleanField(term14298, term14298.getClass(), "ngInject", false);
        setField(term14297, term14297.getClass(), "info", term14298);
        setField(term14315, term14315.getClass(), "sourceComment", null);
        setField(term14315, term14315.getClass(), "markers", null);
        setField(term14315, term14315.getClass(), "parameters", null);
        setField(term14315, term14315.getClass(), "throwsDescriptions", null);
        setField(term14315, term14315.getClass(), "blockDescription", null);
        setField(term14315, term14315.getClass(), "fileOverview", null);
        setField(term14315, term14315.getClass(), "returnDescription", null);
        setField(term14315, term14315.getClass(), "version", null);
        setField(term14315, term14315.getClass(), "authors", null);
        setField(term14315, term14315.getClass(), "sees", null);
        setField(term14297, term14297.getClass(), "documentation", term14315);
        setIntField(term14316, term14316.getClass(), "type", 0);
        setField(term14316, term14316.getClass(), "next", null);
        setField(term14316, term14316.getClass(), "first", null);
        setField(term14316, term14316.getClass(), "last", null);
        setField(term14316, term14316.getClass(), "propListHead", null);
        setIntField(term14316, term14316.getClass(), "sourcePosition", 0);
        setField(term14316, term14316.getClass(), "jsType", null);
        setField(term14316, term14316.getClass(), "parent", null);
        setField(term14297, term14297.getClass(), "associatedNode", term14316);
        setField(term14297, term14297.getClass(), "visibility", enum187);
        setIntField(term14297, term14297.getClass(), "bitset", -1674430871);
        setIntField(term14324, term14324.getClass(), "type", 0);
        setField(term14324, term14324.getClass(), "next", null);
        setField(term14324, term14324.getClass(), "first", null);
        setField(term14324, term14324.getClass(), "last", null);
        setField(term14324, term14324.getClass(), "propListHead", null);
        setIntField(term14324, term14324.getClass(), "sourcePosition", 0);
        setField(term14324, term14324.getClass(), "jsType", null);
        setField(term14324, term14324.getClass(), "parent", null);
        setField(term14323, term14323.getClass(), "root", term14324);
        setField(term14323, term14323.getClass(), "sourceName", "");
        setField(term14297, term14297.getClass(), "type", term14323);
        setField(term14328, term14328.getClass(), "root", term14324);
        setField(term14328, term14328.getClass(), "sourceName", "");
        setField(term14297, term14297.getClass(), "thisType", term14328);
        setBooleanField(term14297, term14297.getClass(), "includeDocumentation", true);
        setField(term14296, term14296.getClass(), "currentInfo", term14297);
        setBooleanField(term14296, term14296.getClass(), "populated", false);
        setBooleanField(term14296, term14296.getClass(), "parseDocumentation", true);
        setField(term14334, term14334.getClass(), "item", null);
        setIntField(term14334, term14334.getClass(), "startLineno", 0);
        setIntField(term14334, term14334.getClass(), "startCharno", 0);
        setIntField(term14334, term14334.getClass(), "endLineno", 0);
        setIntField(term14334, term14334.getClass(), "endCharno", 0);
        setField(term14333, term14333.getClass(), "annotation", term14334);
        setField(term14339, term14339.getClass(), "item", null);
        setIntField(term14339, term14339.getClass(), "startLineno", 0);
        setIntField(term14339, term14339.getClass(), "startCharno", 0);
        setIntField(term14339, term14339.getClass(), "endLineno", 0);
        setIntField(term14339, term14339.getClass(), "endCharno", 0);
        setField(term14333, term14333.getClass(), "name", term14339);
        setField(term14333, term14333.getClass(), "nameNode", null);
        setField(term14333, term14333.getClass(), "description", null);
        setField(term14333, term14333.getClass(), "type", null);
        setField(term14296, term14296.getClass(), "currentMarker", term14333);
        setField(term14243, term14243.getClass(), "jsdocBuilder", term14296);
        setField(term14243, term14243.getClass(), "sourceFile", null);
        setIntField(term14344, term14344.getClass(), "type", 752615112);
        setIntField(term14346, term14346.getClass(), "type", 0);
        setField(term14346, term14346.getClass(), "next", null);
        setField(term14346, term14346.getClass(), "first", null);
        setField(term14346, term14346.getClass(), "last", null);
        setField(term14346, term14346.getClass(), "propListHead", null);
        setIntField(term14346, term14346.getClass(), "sourcePosition", 0);
        setField(term14346, term14346.getClass(), "jsType", null);
        setField(term14346, term14346.getClass(), "parent", null);
        setField(term14344, term14344.getClass(), "next", term14346);
        setIntField(term14349, term14349.getClass(), "type", 0);
        setField(term14349, term14349.getClass(), "next", null);
        setField(term14349, term14349.getClass(), "first", null);
        setField(term14349, term14349.getClass(), "last", null);
        setField(term14349, term14349.getClass(), "propListHead", null);
        setIntField(term14349, term14349.getClass(), "sourcePosition", 0);
        setField(term14349, term14349.getClass(), "jsType", null);
        setField(term14349, term14349.getClass(), "parent", null);
        setField(term14344, term14344.getClass(), "first", term14349);
        setField(term14344, term14344.getClass(), "last", term14324);
        setField(term14344, term14344.getClass(), "propListHead", null);
        setIntField(term14344, term14344.getClass(), "sourcePosition", 0);
        setField(term14344, term14344.getClass(), "jsType", null);
        setField(term14344, term14344.getClass(), "parent", null);
        setField(term14243, term14243.getClass(), "associatedNode", term14344);
        setField(term14243, term14243.getClass(), "errorReporter", null);
        setField(term14243, term14243.getClass(), "parser", null);
        setField(term14243, term14243.getClass(), "templateNode", null);
        setField(term14243, term14243.getClass(), "fileOverviewJSDocInfo", null);
        setField(term14243, term14243.getClass(), "state", null);
        setField(term14243, term14243.getClass(), "annotationNames", null);
        setField(term14243, term14243.getClass(), "suppressionNames", null);
        setField(term14243, term14243.getClass(), "fileLevelJsDocBuilder", null);
        setField(term14243, term14243.getClass(), "unreadToken", null);
        Class<? extends Object> term110304 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term110303 = ((Class) term110304).getDeclaredField((String) "LB");
        ((Field) term110303).setAccessible(true);
        enum188 = ((Field) term110303).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum188;
        try {
            callMethod(klass, "parseTopLevelTypeExpression", argTypes, term14243, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


