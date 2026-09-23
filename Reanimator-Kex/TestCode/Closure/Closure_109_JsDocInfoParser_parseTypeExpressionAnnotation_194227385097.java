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

public class JsDocInfoParser_parseTypeExpressionAnnotation_194227385097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15500;
     Object enum211;

    public JsDocInfoParser_parseTypeExpressionAnnotation_194227385097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15558 = new ArrayList();
        ((ArrayList) term15558).add((Object)null);
        ((ArrayList) term15558).add((Object)null);
        ((ArrayList) term15558).add((Object)null);
        ((ArrayList) term15558).add((Object)null);
        ((ArrayList) term15558).add((Object)null);
        ArrayList term15561 = new ArrayList();
        ((ArrayList) term15561).add((Object)null);
        ((ArrayList) term15561).add((Object)null);
        ((ArrayList) term15561).add((Object)null);
        ((ArrayList) term15561).add((Object)null);
        ((ArrayList) term15561).add((Object)null);
        HashMap term15564 = new HashMap();
        ArrayList term15569 = new ArrayList();
        ((ArrayList) term15569).add((Object)null);
        ((ArrayList) term15569).add((Object)null);
        ((ArrayList) term15569).add((Object)null);
        ((ArrayList) term15569).add((Object)null);
        ((ArrayList) term15569).add((Object)null);
        HashSet term15572 = new HashSet();
        HashSet term15577 = new HashSet();
        HashSet term15578 = new HashSet();
        ArrayList term15587 = new ArrayList();
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        ((ArrayList) term15587).add((Object)null);
        HashMap term15590 = new HashMap();
        Class<? extends Object> term147742 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term147741 = ((Class) term147742).getDeclaredField((String) "PRIVATE");
        ((Field) term147741).setAccessible(true);
        Object enum210 = ((Field) term147741).get((Object) null);
        term15500 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term15501 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term15514 = (char[]) newCharArray(3);
        int[] term15519 = (int[]) newIntArray(9);
        Object term15554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term15555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15556 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15557 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15585 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15602 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15607 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15616 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term15617 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15622 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term15501, term15501.getClass(), "string", "MAnhIPOtHL");
        setCharElement(term15514, 0, 'l');
        setCharElement(term15514, 1, 'h');
        setCharElement(term15514, 2, 'k');
        setField(term15501, term15501.getClass(), "stringBuffer", term15514);
        setIntField(term15501, term15501.getClass(), "stringBufferTop", -485108462);
        setIntElement(term15519, 0, 1418551216);
        setIntElement(term15519, 1, -626779272);
        setIntElement(term15519, 2, -1150062870);
        setIntElement(term15519, 3, -886200503);
        setIntElement(term15519, 4, 1136393691);
        setIntElement(term15519, 5, -1288536479);
        setIntElement(term15519, 6, 1092038167);
        setIntElement(term15519, 7, 1879729823);
        setIntElement(term15519, 8, 1443855558);
        setField(term15501, term15501.getClass(), "ungetBuffer", term15519);
        setIntField(term15501, term15501.getClass(), "ungetCursor", -1933419449);
        setBooleanField(term15501, term15501.getClass(), "hitEOF", false);
        setIntField(term15501, term15501.getClass(), "lineStart", -1804322375);
        setIntField(term15501, term15501.getClass(), "lineEndChar", 1595814906);
        setIntField(term15501, term15501.getClass(), "lineno", -834193529);
        setIntField(term15501, term15501.getClass(), "charno", 335780735);
        setIntField(term15501, term15501.getClass(), "initCharno", -1541981599);
        setIntField(term15501, term15501.getClass(), "initLineno", 1605456363);
        setField(term15501, term15501.getClass(), "sourceString", "dikKjYjmRO");
        setIntField(term15501, term15501.getClass(), "sourceEnd", 2059896693);
        setIntField(term15501, term15501.getClass(), "sourceCursor", 2109912812);
        setIntField(term15501, term15501.getClass(), "cursor", 1841286431);
        setIntField(term15501, term15501.getClass(), "tokenBeg", -1723168189);
        setIntField(term15501, term15501.getClass(), "tokenEnd", -675283917);
        setField(term15500, term15500.getClass(), "stream", term15501);
        setField(term15557, term15557.getClass(), "root", null);
        setField(term15557, term15557.getClass(), "sourceName", null);
        setField(term15556, term15556.getClass(), "baseType", term15557);
        setField(term15556, term15556.getClass(), "extendedInterfaces", term15558);
        setField(term15556, term15556.getClass(), "implementedInterfaces", term15561);
        setField(term15556, term15556.getClass(), "parameters", term15564);
        setField(term15556, term15556.getClass(), "thrownTypes", term15569);
        setField(term15556, term15556.getClass(), "templateTypeNames", null);
        setField(term15556, term15556.getClass(), "disposedParameters", term15572);
        setField(term15556, term15556.getClass(), "description", "");
        setField(term15556, term15556.getClass(), "meaning", "");
        setField(term15556, term15556.getClass(), "deprecated", "");
        setField(term15556, term15556.getClass(), "license", "");
        setField(term15556, term15556.getClass(), "suppressions", term15577);
        setField(term15556, term15556.getClass(), "modifies", term15578);
        setField(term15556, term15556.getClass(), "lendsName", "");
        setBooleanField(term15556, term15556.getClass(), "ngInject", true);
        setBooleanField(term15556, term15556.getClass(), "wizaction", true);
        setBooleanField(term15556, term15556.getClass(), "jaggerInject", true);
        setBooleanField(term15556, term15556.getClass(), "jaggerProvide", true);
        setBooleanField(term15556, term15556.getClass(), "jaggerModule", false);
        setField(term15555, term15555.getClass(), "info", term15556);
        setField(term15585, term15585.getClass(), "sourceComment", "");
        setField(term15585, term15585.getClass(), "markers", term15587);
        setField(term15585, term15585.getClass(), "parameters", term15590);
        setField(term15585, term15585.getClass(), "throwsDescriptions", null);
        setField(term15585, term15585.getClass(), "blockDescription", null);
        setField(term15585, term15585.getClass(), "fileOverview", null);
        setField(term15585, term15585.getClass(), "returnDescription", null);
        setField(term15585, term15585.getClass(), "version", null);
        setField(term15585, term15585.getClass(), "authors", null);
        setField(term15585, term15585.getClass(), "sees", null);
        setField(term15555, term15555.getClass(), "documentation", term15585);
        setIntField(term15595, term15595.getClass(), "type", 0);
        setField(term15595, term15595.getClass(), "next", null);
        setField(term15595, term15595.getClass(), "first", null);
        setField(term15595, term15595.getClass(), "last", null);
        setField(term15595, term15595.getClass(), "propListHead", null);
        setIntField(term15595, term15595.getClass(), "sourcePosition", 0);
        setField(term15595, term15595.getClass(), "jsType", null);
        setField(term15595, term15595.getClass(), "parent", null);
        setField(term15555, term15555.getClass(), "associatedNode", term15595);
        setField(term15555, term15555.getClass(), "visibility", enum210);
        setIntField(term15555, term15555.getClass(), "bitset", 63677360);
        setIntField(term15603, term15603.getClass(), "type", 0);
        setField(term15603, term15603.getClass(), "next", null);
        setField(term15603, term15603.getClass(), "first", null);
        setField(term15603, term15603.getClass(), "last", null);
        setField(term15603, term15603.getClass(), "propListHead", null);
        setIntField(term15603, term15603.getClass(), "sourcePosition", 0);
        setField(term15603, term15603.getClass(), "jsType", null);
        setField(term15603, term15603.getClass(), "parent", null);
        setField(term15602, term15602.getClass(), "root", term15603);
        setField(term15602, term15602.getClass(), "sourceName", "");
        setField(term15555, term15555.getClass(), "type", term15602);
        setIntField(term15608, term15608.getClass(), "type", 0);
        setField(term15608, term15608.getClass(), "next", null);
        setField(term15608, term15608.getClass(), "first", null);
        setField(term15608, term15608.getClass(), "last", null);
        setField(term15608, term15608.getClass(), "propListHead", null);
        setIntField(term15608, term15608.getClass(), "sourcePosition", 0);
        setField(term15608, term15608.getClass(), "jsType", null);
        setField(term15608, term15608.getClass(), "parent", null);
        setField(term15607, term15607.getClass(), "root", term15608);
        setField(term15607, term15607.getClass(), "sourceName", "");
        setField(term15555, term15555.getClass(), "thisType", term15607);
        setBooleanField(term15555, term15555.getClass(), "includeDocumentation", false);
        setIntField(term15555, term15555.getClass(), "originalCommentPosition", 1478914037);
        setField(term15554, term15554.getClass(), "currentInfo", term15555);
        setBooleanField(term15554, term15554.getClass(), "populated", true);
        setBooleanField(term15554, term15554.getClass(), "parseDocumentation", false);
        setField(term15617, term15617.getClass(), "item", null);
        setIntField(term15617, term15617.getClass(), "startLineno", 0);
        setIntField(term15617, term15617.getClass(), "startCharno", 0);
        setIntField(term15617, term15617.getClass(), "endLineno", 0);
        setIntField(term15617, term15617.getClass(), "endCharno", 0);
        setField(term15616, term15616.getClass(), "annotation", term15617);
        setField(term15622, term15622.getClass(), "item", null);
        setIntField(term15622, term15622.getClass(), "startLineno", 0);
        setIntField(term15622, term15622.getClass(), "startCharno", 0);
        setIntField(term15622, term15622.getClass(), "endLineno", 0);
        setIntField(term15622, term15622.getClass(), "endCharno", 0);
        setField(term15616, term15616.getClass(), "name", term15622);
        setField(term15616, term15616.getClass(), "nameNode", null);
        setField(term15616, term15616.getClass(), "description", null);
        setField(term15616, term15616.getClass(), "type", null);
        setField(term15554, term15554.getClass(), "currentMarker", term15616);
        setField(term15500, term15500.getClass(), "jsdocBuilder", term15554);
        setField(term15500, term15500.getClass(), "sourceFile", null);
        setField(term15500, term15500.getClass(), "associatedNode", term15603);
        setField(term15500, term15500.getClass(), "errorReporter", null);
        setField(term15500, term15500.getClass(), "parser", null);
        setField(term15500, term15500.getClass(), "templateNode", null);
        setField(term15500, term15500.getClass(), "fileOverviewJSDocInfo", null);
        setField(term15500, term15500.getClass(), "state", null);
        setField(term15500, term15500.getClass(), "annotationNames", null);
        setField(term15500, term15500.getClass(), "suppressionNames", null);
        setField(term15500, term15500.getClass(), "fileLevelJsDocBuilder", null);
        setField(term15500, term15500.getClass(), "unreadToken", null);
        Class<? extends Object> term148010 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term148009 = ((Class) term148010).getDeclaredField((String) "LB");
        ((Field) term148009).setAccessible(true);
        enum211 = ((Field) term148009).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum211;
        try {
            callMethod(klass, "parseTypeExpressionAnnotation", argTypes, term15500, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


