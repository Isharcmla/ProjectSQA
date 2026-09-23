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

public class JsDocInfoParser_parseParametersType_283335113107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22365;
     Object enum231;

    public JsDocInfoParser_parseParametersType_283335113107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22426 = new ArrayList();
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ((ArrayList) term22426).add((Object)null);
        ArrayList term22429 = new ArrayList();
        ((ArrayList) term22429).add((Object)null);
        ((ArrayList) term22429).add((Object)null);
        HashMap term22432 = new HashMap();
        ArrayList term22437 = new ArrayList();
        ((ArrayList) term22437).add((Object)null);
        ((ArrayList) term22437).add((Object)null);
        ((ArrayList) term22437).add((Object)null);
        ((ArrayList) term22437).add((Object)null);
        ((ArrayList) term22437).add((Object)null);
        HashSet term22440 = new HashSet();
        HashSet term22445 = new HashSet();
        HashSet term22446 = new HashSet();
        ArrayList term22455 = new ArrayList();
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        ((ArrayList) term22455).add((Object)null);
        HashMap term22458 = new HashMap();
        Class<? extends Object> term153569 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term153568 = ((Class) term153569).getDeclaredField((String) "INHERITED");
        ((Field) term153568).setAccessible(true);
        Object enum230 = ((Field) term153568).get((Object) null);
        term22365 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term22366 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term22379 = (char[]) newCharArray(8);
        int[] term22389 = (int[]) newIntArray(7);
        Object term22422 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term22423 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term22424 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term22425 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22453 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term22463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22470 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22475 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22484 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term22485 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term22490 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term22366, term22366.getClass(), "string", "yGWXZDjnPS");
        setCharElement(term22379, 0, 'J');
        setCharElement(term22379, 1, 'l');
        setCharElement(term22379, 2, 'i');
        setCharElement(term22379, 3, 'e');
        setCharElement(term22379, 4, 'C');
        setCharElement(term22379, 5, 'F');
        setCharElement(term22379, 6, 'V');
        setCharElement(term22379, 7, 't');
        setField(term22366, term22366.getClass(), "stringBuffer", term22379);
        setIntField(term22366, term22366.getClass(), "stringBufferTop", 1425342686);
        setIntElement(term22389, 0, -1042470635);
        setIntElement(term22389, 1, -524352937);
        setIntElement(term22389, 2, 1472218987);
        setIntElement(term22389, 3, 805176809);
        setIntElement(term22389, 4, -82632953);
        setIntElement(term22389, 5, -1473876284);
        setIntElement(term22389, 6, -1389314671);
        setField(term22366, term22366.getClass(), "ungetBuffer", term22389);
        setIntField(term22366, term22366.getClass(), "ungetCursor", -499699841);
        setBooleanField(term22366, term22366.getClass(), "hitEOF", true);
        setIntField(term22366, term22366.getClass(), "lineStart", 360972386);
        setIntField(term22366, term22366.getClass(), "lineEndChar", -2063884849);
        setIntField(term22366, term22366.getClass(), "lineno", 1054887169);
        setIntField(term22366, term22366.getClass(), "charno", 692873905);
        setIntField(term22366, term22366.getClass(), "initCharno", 1734759369);
        setIntField(term22366, term22366.getClass(), "initLineno", 1841493736);
        setField(term22366, term22366.getClass(), "sourceString", "vZucxbGVyo");
        setIntField(term22366, term22366.getClass(), "sourceEnd", 320739944);
        setIntField(term22366, term22366.getClass(), "sourceCursor", 760218111);
        setIntField(term22366, term22366.getClass(), "cursor", -1986366126);
        setIntField(term22366, term22366.getClass(), "tokenBeg", -1963228619);
        setIntField(term22366, term22366.getClass(), "tokenEnd", -709868952);
        setField(term22365, term22365.getClass(), "stream", term22366);
        setField(term22425, term22425.getClass(), "root", null);
        setField(term22425, term22425.getClass(), "sourceName", null);
        setField(term22424, term22424.getClass(), "baseType", term22425);
        setField(term22424, term22424.getClass(), "extendedInterfaces", term22426);
        setField(term22424, term22424.getClass(), "implementedInterfaces", term22429);
        setField(term22424, term22424.getClass(), "parameters", term22432);
        setField(term22424, term22424.getClass(), "thrownTypes", term22437);
        setField(term22424, term22424.getClass(), "templateTypeNames", null);
        setField(term22424, term22424.getClass(), "disposedParameters", term22440);
        setField(term22424, term22424.getClass(), "description", "");
        setField(term22424, term22424.getClass(), "meaning", "");
        setField(term22424, term22424.getClass(), "deprecated", "");
        setField(term22424, term22424.getClass(), "license", "");
        setField(term22424, term22424.getClass(), "suppressions", term22445);
        setField(term22424, term22424.getClass(), "modifies", term22446);
        setField(term22424, term22424.getClass(), "lendsName", "");
        setBooleanField(term22424, term22424.getClass(), "ngInject", true);
        setBooleanField(term22424, term22424.getClass(), "wizaction", false);
        setBooleanField(term22424, term22424.getClass(), "jaggerInject", true);
        setBooleanField(term22424, term22424.getClass(), "jaggerProvide", false);
        setBooleanField(term22424, term22424.getClass(), "jaggerModule", true);
        setField(term22423, term22423.getClass(), "info", term22424);
        setField(term22453, term22453.getClass(), "sourceComment", "");
        setField(term22453, term22453.getClass(), "markers", term22455);
        setField(term22453, term22453.getClass(), "parameters", term22458);
        setField(term22453, term22453.getClass(), "throwsDescriptions", null);
        setField(term22453, term22453.getClass(), "blockDescription", null);
        setField(term22453, term22453.getClass(), "fileOverview", null);
        setField(term22453, term22453.getClass(), "returnDescription", null);
        setField(term22453, term22453.getClass(), "version", null);
        setField(term22453, term22453.getClass(), "authors", null);
        setField(term22453, term22453.getClass(), "sees", null);
        setField(term22423, term22423.getClass(), "documentation", term22453);
        setIntField(term22463, term22463.getClass(), "type", 0);
        setField(term22463, term22463.getClass(), "next", null);
        setField(term22463, term22463.getClass(), "first", null);
        setField(term22463, term22463.getClass(), "last", null);
        setField(term22463, term22463.getClass(), "propListHead", null);
        setIntField(term22463, term22463.getClass(), "sourcePosition", 0);
        setField(term22463, term22463.getClass(), "jsType", null);
        setField(term22463, term22463.getClass(), "parent", null);
        setField(term22423, term22423.getClass(), "associatedNode", term22463);
        setField(term22423, term22423.getClass(), "visibility", enum230);
        setIntField(term22423, term22423.getClass(), "bitset", 81427089);
        setIntField(term22471, term22471.getClass(), "type", 0);
        setField(term22471, term22471.getClass(), "next", null);
        setField(term22471, term22471.getClass(), "first", null);
        setField(term22471, term22471.getClass(), "last", null);
        setField(term22471, term22471.getClass(), "propListHead", null);
        setIntField(term22471, term22471.getClass(), "sourcePosition", 0);
        setField(term22471, term22471.getClass(), "jsType", null);
        setField(term22471, term22471.getClass(), "parent", null);
        setField(term22470, term22470.getClass(), "root", term22471);
        setField(term22470, term22470.getClass(), "sourceName", "");
        setField(term22423, term22423.getClass(), "type", term22470);
        setIntField(term22476, term22476.getClass(), "type", 0);
        setField(term22476, term22476.getClass(), "next", null);
        setField(term22476, term22476.getClass(), "first", null);
        setField(term22476, term22476.getClass(), "last", null);
        setField(term22476, term22476.getClass(), "propListHead", null);
        setIntField(term22476, term22476.getClass(), "sourcePosition", 0);
        setField(term22476, term22476.getClass(), "jsType", null);
        setField(term22476, term22476.getClass(), "parent", null);
        setField(term22475, term22475.getClass(), "root", term22476);
        setField(term22475, term22475.getClass(), "sourceName", "");
        setField(term22423, term22423.getClass(), "thisType", term22475);
        setBooleanField(term22423, term22423.getClass(), "includeDocumentation", false);
        setIntField(term22423, term22423.getClass(), "originalCommentPosition", 755951489);
        setField(term22422, term22422.getClass(), "currentInfo", term22423);
        setBooleanField(term22422, term22422.getClass(), "populated", false);
        setBooleanField(term22422, term22422.getClass(), "parseDocumentation", true);
        setField(term22485, term22485.getClass(), "item", null);
        setIntField(term22485, term22485.getClass(), "startLineno", 0);
        setIntField(term22485, term22485.getClass(), "startCharno", 0);
        setIntField(term22485, term22485.getClass(), "endLineno", 0);
        setIntField(term22485, term22485.getClass(), "endCharno", 0);
        setField(term22484, term22484.getClass(), "annotation", term22485);
        setField(term22490, term22490.getClass(), "item", null);
        setIntField(term22490, term22490.getClass(), "startLineno", 0);
        setIntField(term22490, term22490.getClass(), "startCharno", 0);
        setIntField(term22490, term22490.getClass(), "endLineno", 0);
        setIntField(term22490, term22490.getClass(), "endCharno", 0);
        setField(term22484, term22484.getClass(), "name", term22490);
        setField(term22484, term22484.getClass(), "nameNode", null);
        setField(term22484, term22484.getClass(), "description", null);
        setField(term22484, term22484.getClass(), "type", null);
        setField(term22422, term22422.getClass(), "currentMarker", term22484);
        setField(term22365, term22365.getClass(), "jsdocBuilder", term22422);
        setField(term22365, term22365.getClass(), "sourceFile", null);
        setField(term22365, term22365.getClass(), "associatedNode", term22471);
        setField(term22365, term22365.getClass(), "errorReporter", null);
        setField(term22365, term22365.getClass(), "parser", null);
        setField(term22365, term22365.getClass(), "templateNode", null);
        setField(term22365, term22365.getClass(), "fileOverviewJSDocInfo", null);
        setField(term22365, term22365.getClass(), "state", null);
        setField(term22365, term22365.getClass(), "annotationNames", null);
        setField(term22365, term22365.getClass(), "suppressionNames", null);
        setField(term22365, term22365.getClass(), "fileLevelJsDocBuilder", null);
        setField(term22365, term22365.getClass(), "unreadToken", null);
        Class<? extends Object> term153843 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term153842 = ((Class) term153843).getDeclaredField((String) "ANNOTATION");
        ((Field) term153842).setAccessible(true);
        enum231 = ((Field) term153842).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum231;
        try {
            callMethod(klass, "parseParametersType", argTypes, term22365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


