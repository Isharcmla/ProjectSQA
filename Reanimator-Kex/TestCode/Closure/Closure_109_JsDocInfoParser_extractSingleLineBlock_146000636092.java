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

public class JsDocInfoParser_extractSingleLineBlock_146000636092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12546;

    public JsDocInfoParser_extractSingleLineBlock_146000636092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12599 = new ArrayList();
        ((ArrayList) term12599).add((Object)null);
        ((ArrayList) term12599).add((Object)null);
        ((ArrayList) term12599).add((Object)null);
        ArrayList term12602 = new ArrayList();
        ((ArrayList) term12602).add((Object)null);
        HashMap term12605 = new HashMap();
        ArrayList term12610 = new ArrayList();
        HashSet term12613 = new HashSet();
        HashSet term12618 = new HashSet();
        HashSet term12619 = new HashSet();
        ArrayList term12628 = new ArrayList();
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        ((ArrayList) term12628).add((Object)null);
        HashMap term12631 = new HashMap();
        Class<? extends Object> term132625 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term132624 = ((Class) term132625).getDeclaredField((String) "PROTECTED");
        ((Field) term132624).setAccessible(true);
        Object enum200 = ((Field) term132624).get((Object) null);
        term12546 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term12547 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term12560 = (char[]) newCharArray(5);
        int[] term12567 = (int[]) newIntArray(2);
        Object term12595 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term12596 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12597 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term12598 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12626 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term12636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12643 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12644 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term12649 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term12650 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term12655 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term12660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12547, term12547.getClass(), "string", "pxokrVaeMd");
        setCharElement(term12560, 0, 'N');
        setCharElement(term12560, 1, 'F');
        setCharElement(term12560, 2, 'h');
        setCharElement(term12560, 3, 'R');
        setCharElement(term12560, 4, 'N');
        setField(term12547, term12547.getClass(), "stringBuffer", term12560);
        setIntField(term12547, term12547.getClass(), "stringBufferTop", 1505480070);
        setIntElement(term12567, 0, -829088844);
        setIntElement(term12567, 1, -31751777);
        setField(term12547, term12547.getClass(), "ungetBuffer", term12567);
        setIntField(term12547, term12547.getClass(), "ungetCursor", -246967963);
        setBooleanField(term12547, term12547.getClass(), "hitEOF", true);
        setIntField(term12547, term12547.getClass(), "lineStart", -1777140369);
        setIntField(term12547, term12547.getClass(), "lineEndChar", 993627098);
        setIntField(term12547, term12547.getClass(), "lineno", 872295704);
        setIntField(term12547, term12547.getClass(), "charno", 86041387);
        setIntField(term12547, term12547.getClass(), "initCharno", 1010721666);
        setIntField(term12547, term12547.getClass(), "initLineno", 27043781);
        setField(term12547, term12547.getClass(), "sourceString", "ujxmmZZcbT");
        setIntField(term12547, term12547.getClass(), "sourceEnd", -1367122405);
        setIntField(term12547, term12547.getClass(), "sourceCursor", -1703625118);
        setIntField(term12547, term12547.getClass(), "cursor", 1104108112);
        setIntField(term12547, term12547.getClass(), "tokenBeg", 1648665618);
        setIntField(term12547, term12547.getClass(), "tokenEnd", 633765954);
        setField(term12546, term12546.getClass(), "stream", term12547);
        setField(term12598, term12598.getClass(), "root", null);
        setField(term12598, term12598.getClass(), "sourceName", null);
        setField(term12597, term12597.getClass(), "baseType", term12598);
        setField(term12597, term12597.getClass(), "extendedInterfaces", term12599);
        setField(term12597, term12597.getClass(), "implementedInterfaces", term12602);
        setField(term12597, term12597.getClass(), "parameters", term12605);
        setField(term12597, term12597.getClass(), "thrownTypes", term12610);
        setField(term12597, term12597.getClass(), "templateTypeNames", null);
        setField(term12597, term12597.getClass(), "disposedParameters", term12613);
        setField(term12597, term12597.getClass(), "description", "");
        setField(term12597, term12597.getClass(), "meaning", "");
        setField(term12597, term12597.getClass(), "deprecated", "");
        setField(term12597, term12597.getClass(), "license", "");
        setField(term12597, term12597.getClass(), "suppressions", term12618);
        setField(term12597, term12597.getClass(), "modifies", term12619);
        setField(term12597, term12597.getClass(), "lendsName", "");
        setBooleanField(term12597, term12597.getClass(), "ngInject", true);
        setBooleanField(term12597, term12597.getClass(), "wizaction", true);
        setBooleanField(term12597, term12597.getClass(), "jaggerInject", false);
        setBooleanField(term12597, term12597.getClass(), "jaggerProvide", false);
        setBooleanField(term12597, term12597.getClass(), "jaggerModule", false);
        setField(term12596, term12596.getClass(), "info", term12597);
        setField(term12626, term12626.getClass(), "sourceComment", "");
        setField(term12626, term12626.getClass(), "markers", term12628);
        setField(term12626, term12626.getClass(), "parameters", term12631);
        setField(term12626, term12626.getClass(), "throwsDescriptions", null);
        setField(term12626, term12626.getClass(), "blockDescription", null);
        setField(term12626, term12626.getClass(), "fileOverview", null);
        setField(term12626, term12626.getClass(), "returnDescription", null);
        setField(term12626, term12626.getClass(), "version", null);
        setField(term12626, term12626.getClass(), "authors", null);
        setField(term12626, term12626.getClass(), "sees", null);
        setField(term12596, term12596.getClass(), "documentation", term12626);
        setIntField(term12636, term12636.getClass(), "type", 0);
        setField(term12636, term12636.getClass(), "next", null);
        setField(term12636, term12636.getClass(), "first", null);
        setField(term12636, term12636.getClass(), "last", null);
        setField(term12636, term12636.getClass(), "propListHead", null);
        setIntField(term12636, term12636.getClass(), "sourcePosition", 0);
        setField(term12636, term12636.getClass(), "jsType", null);
        setField(term12636, term12636.getClass(), "parent", null);
        setField(term12596, term12596.getClass(), "associatedNode", term12636);
        setField(term12596, term12596.getClass(), "visibility", enum200);
        setIntField(term12596, term12596.getClass(), "bitset", -297946422);
        setField(term12643, term12643.getClass(), "root", null);
        setField(term12643, term12643.getClass(), "sourceName", null);
        setField(term12596, term12596.getClass(), "type", term12643);
        setField(term12644, term12644.getClass(), "root", null);
        setField(term12644, term12644.getClass(), "sourceName", null);
        setField(term12596, term12596.getClass(), "thisType", term12644);
        setBooleanField(term12596, term12596.getClass(), "includeDocumentation", false);
        setIntField(term12596, term12596.getClass(), "originalCommentPosition", 385463636);
        setField(term12595, term12595.getClass(), "currentInfo", term12596);
        setBooleanField(term12595, term12595.getClass(), "populated", false);
        setBooleanField(term12595, term12595.getClass(), "parseDocumentation", true);
        setField(term12650, term12650.getClass(), "item", null);
        setIntField(term12650, term12650.getClass(), "startLineno", 0);
        setIntField(term12650, term12650.getClass(), "startCharno", 0);
        setIntField(term12650, term12650.getClass(), "endLineno", 0);
        setIntField(term12650, term12650.getClass(), "endCharno", 0);
        setField(term12649, term12649.getClass(), "annotation", term12650);
        setField(term12655, term12655.getClass(), "item", null);
        setIntField(term12655, term12655.getClass(), "startLineno", 0);
        setIntField(term12655, term12655.getClass(), "startCharno", 0);
        setIntField(term12655, term12655.getClass(), "endLineno", 0);
        setIntField(term12655, term12655.getClass(), "endCharno", 0);
        setField(term12649, term12649.getClass(), "name", term12655);
        setField(term12649, term12649.getClass(), "nameNode", null);
        setField(term12649, term12649.getClass(), "description", null);
        setField(term12649, term12649.getClass(), "type", null);
        setField(term12595, term12595.getClass(), "currentMarker", term12649);
        setField(term12546, term12546.getClass(), "jsdocBuilder", term12595);
        setField(term12546, term12546.getClass(), "sourceFile", null);
        setIntField(term12660, term12660.getClass(), "type", 0);
        setField(term12660, term12660.getClass(), "next", null);
        setField(term12660, term12660.getClass(), "first", null);
        setField(term12660, term12660.getClass(), "last", null);
        setField(term12660, term12660.getClass(), "propListHead", null);
        setIntField(term12660, term12660.getClass(), "sourcePosition", 0);
        setField(term12660, term12660.getClass(), "jsType", null);
        setField(term12660, term12660.getClass(), "parent", null);
        setField(term12546, term12546.getClass(), "associatedNode", term12660);
        setField(term12546, term12546.getClass(), "errorReporter", null);
        setField(term12546, term12546.getClass(), "parser", null);
        setField(term12546, term12546.getClass(), "templateNode", null);
        setField(term12546, term12546.getClass(), "fileOverviewJSDocInfo", null);
        setField(term12546, term12546.getClass(), "state", null);
        setField(term12546, term12546.getClass(), "annotationNames", null);
        setField(term12546, term12546.getClass(), "suppressionNames", null);
        setField(term12546, term12546.getClass(), "fileLevelJsDocBuilder", null);
        setField(term12546, term12546.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "extractSingleLineBlock", argTypes, term12546, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


