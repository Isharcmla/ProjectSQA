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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_toString_177164964490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11400;
     Object enum198;

    public JsDocInfoParser_toString_177164964490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11461 = new ArrayList();
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ((ArrayList) term11461).add((Object)null);
        ArrayList term11464 = new ArrayList();
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        HashMap term11467 = new HashMap();
        ArrayList term11472 = new ArrayList();
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        ((ArrayList) term11472).add((Object)null);
        HashSet term11475 = new HashSet();
        HashSet term11480 = new HashSet();
        HashSet term11481 = new HashSet();
        ArrayList term11490 = new ArrayList();
        ((ArrayList) term11490).add((Object)null);
        ((ArrayList) term11490).add((Object)null);
        ((ArrayList) term11490).add((Object)null);
        HashMap term11493 = new HashMap();
        Class<? extends Object> term131382 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term131381 = ((Class) term131382).getDeclaredField((String) "PUBLIC");
        ((Field) term131381).setAccessible(true);
        Object enum197 = ((Field) term131381).get((Object) null);
        term11400 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term11401 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term11414 = (char[]) newCharArray(7);
        int[] term11423 = (int[]) newIntArray(8);
        Object term11457 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term11458 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term11459 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term11460 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11488 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term11498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11505 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term11506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11514 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term11515 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term11520 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term11525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11401, term11401.getClass(), "string", "VePIumgrrU");
        setCharElement(term11414, 0, 'S');
        setCharElement(term11414, 1, 'M');
        setCharElement(term11414, 2, 'j');
        setCharElement(term11414, 3, 'G');
        setCharElement(term11414, 4, 'Y');
        setCharElement(term11414, 5, 'S');
        setCharElement(term11414, 6, 'R');
        setField(term11401, term11401.getClass(), "stringBuffer", term11414);
        setIntField(term11401, term11401.getClass(), "stringBufferTop", 794352120);
        setIntElement(term11423, 0, 340719678);
        setIntElement(term11423, 1, 299791142);
        setIntElement(term11423, 2, 1862191391);
        setIntElement(term11423, 3, 1131398807);
        setIntElement(term11423, 4, -344907703);
        setIntElement(term11423, 5, 824341437);
        setIntElement(term11423, 6, -1794965320);
        setIntElement(term11423, 7, 520504102);
        setField(term11401, term11401.getClass(), "ungetBuffer", term11423);
        setIntField(term11401, term11401.getClass(), "ungetCursor", -457396133);
        setBooleanField(term11401, term11401.getClass(), "hitEOF", true);
        setIntField(term11401, term11401.getClass(), "lineStart", -1793950607);
        setIntField(term11401, term11401.getClass(), "lineEndChar", 1091954101);
        setIntField(term11401, term11401.getClass(), "lineno", 1895143076);
        setIntField(term11401, term11401.getClass(), "charno", 1981860404);
        setIntField(term11401, term11401.getClass(), "initCharno", 732174235);
        setIntField(term11401, term11401.getClass(), "initLineno", 470895808);
        setField(term11401, term11401.getClass(), "sourceString", "DPwIqlszZo");
        setIntField(term11401, term11401.getClass(), "sourceEnd", 1787325291);
        setIntField(term11401, term11401.getClass(), "sourceCursor", 1470349147);
        setIntField(term11401, term11401.getClass(), "cursor", -255317272);
        setIntField(term11401, term11401.getClass(), "tokenBeg", -706253892);
        setIntField(term11401, term11401.getClass(), "tokenEnd", -1341439819);
        setField(term11400, term11400.getClass(), "stream", term11401);
        setField(term11460, term11460.getClass(), "root", null);
        setField(term11460, term11460.getClass(), "sourceName", null);
        setField(term11459, term11459.getClass(), "baseType", term11460);
        setField(term11459, term11459.getClass(), "extendedInterfaces", term11461);
        setField(term11459, term11459.getClass(), "implementedInterfaces", term11464);
        setField(term11459, term11459.getClass(), "parameters", term11467);
        setField(term11459, term11459.getClass(), "thrownTypes", term11472);
        setField(term11459, term11459.getClass(), "templateTypeNames", null);
        setField(term11459, term11459.getClass(), "disposedParameters", term11475);
        setField(term11459, term11459.getClass(), "description", "");
        setField(term11459, term11459.getClass(), "meaning", "");
        setField(term11459, term11459.getClass(), "deprecated", "");
        setField(term11459, term11459.getClass(), "license", "");
        setField(term11459, term11459.getClass(), "suppressions", term11480);
        setField(term11459, term11459.getClass(), "modifies", term11481);
        setField(term11459, term11459.getClass(), "lendsName", "");
        setBooleanField(term11459, term11459.getClass(), "ngInject", true);
        setBooleanField(term11459, term11459.getClass(), "wizaction", false);
        setBooleanField(term11459, term11459.getClass(), "jaggerInject", false);
        setBooleanField(term11459, term11459.getClass(), "jaggerProvide", true);
        setBooleanField(term11459, term11459.getClass(), "jaggerModule", false);
        setField(term11458, term11458.getClass(), "info", term11459);
        setField(term11488, term11488.getClass(), "sourceComment", "");
        setField(term11488, term11488.getClass(), "markers", term11490);
        setField(term11488, term11488.getClass(), "parameters", term11493);
        setField(term11488, term11488.getClass(), "throwsDescriptions", null);
        setField(term11488, term11488.getClass(), "blockDescription", null);
        setField(term11488, term11488.getClass(), "fileOverview", null);
        setField(term11488, term11488.getClass(), "returnDescription", null);
        setField(term11488, term11488.getClass(), "version", null);
        setField(term11488, term11488.getClass(), "authors", null);
        setField(term11488, term11488.getClass(), "sees", null);
        setField(term11458, term11458.getClass(), "documentation", term11488);
        setIntField(term11498, term11498.getClass(), "type", 0);
        setField(term11498, term11498.getClass(), "next", null);
        setField(term11498, term11498.getClass(), "first", null);
        setField(term11498, term11498.getClass(), "last", null);
        setField(term11498, term11498.getClass(), "propListHead", null);
        setIntField(term11498, term11498.getClass(), "sourcePosition", 0);
        setField(term11498, term11498.getClass(), "jsType", null);
        setField(term11498, term11498.getClass(), "parent", null);
        setField(term11458, term11458.getClass(), "associatedNode", term11498);
        setField(term11458, term11458.getClass(), "visibility", enum197);
        setIntField(term11458, term11458.getClass(), "bitset", -1551355284);
        setIntField(term11506, term11506.getClass(), "type", -865722613);
        setField(term11506, term11506.getClass(), "next", null);
        setField(term11506, term11506.getClass(), "first", null);
        setField(term11506, term11506.getClass(), "last", term11498);
        setField(term11506, term11506.getClass(), "propListHead", null);
        setIntField(term11506, term11506.getClass(), "sourcePosition", 0);
        setField(term11506, term11506.getClass(), "jsType", null);
        setField(term11506, term11506.getClass(), "parent", null);
        setField(term11505, term11505.getClass(), "root", term11506);
        setField(term11505, term11505.getClass(), "sourceName", "");
        setField(term11458, term11458.getClass(), "type", term11505);
        setField(term11458, term11458.getClass(), "thisType", term11505);
        setBooleanField(term11458, term11458.getClass(), "includeDocumentation", true);
        setIntField(term11458, term11458.getClass(), "originalCommentPosition", -1381970335);
        setField(term11457, term11457.getClass(), "currentInfo", term11458);
        setBooleanField(term11457, term11457.getClass(), "populated", false);
        setBooleanField(term11457, term11457.getClass(), "parseDocumentation", true);
        setField(term11515, term11515.getClass(), "item", null);
        setIntField(term11515, term11515.getClass(), "startLineno", 0);
        setIntField(term11515, term11515.getClass(), "startCharno", 0);
        setIntField(term11515, term11515.getClass(), "endLineno", 0);
        setIntField(term11515, term11515.getClass(), "endCharno", 0);
        setField(term11514, term11514.getClass(), "annotation", term11515);
        setField(term11520, term11520.getClass(), "item", null);
        setIntField(term11520, term11520.getClass(), "startLineno", 0);
        setIntField(term11520, term11520.getClass(), "startCharno", 0);
        setIntField(term11520, term11520.getClass(), "endLineno", 0);
        setIntField(term11520, term11520.getClass(), "endCharno", 0);
        setField(term11514, term11514.getClass(), "name", term11520);
        setField(term11514, term11514.getClass(), "nameNode", null);
        setField(term11514, term11514.getClass(), "description", null);
        setField(term11514, term11514.getClass(), "type", null);
        setField(term11457, term11457.getClass(), "currentMarker", term11514);
        setField(term11400, term11400.getClass(), "jsdocBuilder", term11457);
        setField(term11400, term11400.getClass(), "sourceFile", null);
        setIntField(term11525, term11525.getClass(), "type", 0);
        setField(term11525, term11525.getClass(), "next", null);
        setField(term11525, term11525.getClass(), "first", null);
        setField(term11525, term11525.getClass(), "last", null);
        setField(term11525, term11525.getClass(), "propListHead", null);
        setIntField(term11525, term11525.getClass(), "sourcePosition", 0);
        setField(term11525, term11525.getClass(), "jsType", null);
        setField(term11525, term11525.getClass(), "parent", null);
        setField(term11400, term11400.getClass(), "associatedNode", term11525);
        setField(term11400, term11400.getClass(), "errorReporter", null);
        setField(term11400, term11400.getClass(), "parser", null);
        setField(term11400, term11400.getClass(), "templateNode", null);
        setField(term11400, term11400.getClass(), "fileOverviewJSDocInfo", null);
        setField(term11400, term11400.getClass(), "state", null);
        setField(term11400, term11400.getClass(), "annotationNames", null);
        setField(term11400, term11400.getClass(), "suppressionNames", null);
        setField(term11400, term11400.getClass(), "fileLevelJsDocBuilder", null);
        setField(term11400, term11400.getClass(), "unreadToken", null);
        Class<? extends Object> term131671 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term131670 = ((Class) term131671).getDeclaredField((String) "EOC");
        ((Field) term131670).setAccessible(true);
        enum198 = ((Field) term131670).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum198;
        try {
            callMethod(klass, "toString", argTypes, term11400, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


