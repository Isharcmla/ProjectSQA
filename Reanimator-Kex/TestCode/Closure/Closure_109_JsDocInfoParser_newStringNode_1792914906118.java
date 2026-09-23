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

public class JsDocInfoParser_newStringNode_1792914906118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29520;

    public JsDocInfoParser_newStringNode_1792914906118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29578 = new ArrayList();
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ((ArrayList) term29578).add((Object)null);
        ArrayList term29581 = new ArrayList();
        HashMap term29584 = new HashMap();
        ArrayList term29589 = new ArrayList();
        ((ArrayList) term29589).add((Object)null);
        HashSet term29592 = new HashSet();
        HashSet term29597 = new HashSet();
        HashSet term29598 = new HashSet();
        ArrayList term29607 = new ArrayList();
        ((ArrayList) term29607).add((Object)null);
        HashMap term29610 = new HashMap();
        Class<? extends Object> term159506 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term159505 = ((Class) term159506).getDeclaredField((String) "PUBLIC");
        ((Field) term159505).setAccessible(true);
        Object enum250 = ((Field) term159505).get((Object) null);
        term29520 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term29521 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term29534 = (char[]) newCharArray(8);
        int[] term29544 = (int[]) newIntArray(4);
        Object term29574 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term29575 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term29576 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term29577 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29605 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term29615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29622 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29627 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term29628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29636 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term29637 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29642 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term29647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29521, term29521.getClass(), "string", "FTuOcSieav");
        setCharElement(term29534, 0, 'a');
        setCharElement(term29534, 1, 'H');
        setCharElement(term29534, 2, 'c');
        setCharElement(term29534, 3, 'f');
        setCharElement(term29534, 4, 'h');
        setCharElement(term29534, 5, 'Y');
        setCharElement(term29534, 6, 'R');
        setCharElement(term29534, 7, 'k');
        setField(term29521, term29521.getClass(), "stringBuffer", term29534);
        setIntField(term29521, term29521.getClass(), "stringBufferTop", 249657454);
        setIntElement(term29544, 0, 1734630901);
        setIntElement(term29544, 1, -703815246);
        setIntElement(term29544, 2, 157300746);
        setIntElement(term29544, 3, -1600748613);
        setField(term29521, term29521.getClass(), "ungetBuffer", term29544);
        setIntField(term29521, term29521.getClass(), "ungetCursor", -1509192782);
        setBooleanField(term29521, term29521.getClass(), "hitEOF", false);
        setIntField(term29521, term29521.getClass(), "lineStart", -867925573);
        setIntField(term29521, term29521.getClass(), "lineEndChar", 478422495);
        setIntField(term29521, term29521.getClass(), "lineno", 1727771237);
        setIntField(term29521, term29521.getClass(), "charno", 2033663549);
        setIntField(term29521, term29521.getClass(), "initCharno", 1766479154);
        setIntField(term29521, term29521.getClass(), "initLineno", 533171496);
        setField(term29521, term29521.getClass(), "sourceString", "qSnwPXRuzC");
        setIntField(term29521, term29521.getClass(), "sourceEnd", 1369020869);
        setIntField(term29521, term29521.getClass(), "sourceCursor", -1428947021);
        setIntField(term29521, term29521.getClass(), "cursor", -134324004);
        setIntField(term29521, term29521.getClass(), "tokenBeg", -1813266173);
        setIntField(term29521, term29521.getClass(), "tokenEnd", -1201819537);
        setField(term29520, term29520.getClass(), "stream", term29521);
        setField(term29577, term29577.getClass(), "root", null);
        setField(term29577, term29577.getClass(), "sourceName", null);
        setField(term29576, term29576.getClass(), "baseType", term29577);
        setField(term29576, term29576.getClass(), "extendedInterfaces", term29578);
        setField(term29576, term29576.getClass(), "implementedInterfaces", term29581);
        setField(term29576, term29576.getClass(), "parameters", term29584);
        setField(term29576, term29576.getClass(), "thrownTypes", term29589);
        setField(term29576, term29576.getClass(), "templateTypeNames", null);
        setField(term29576, term29576.getClass(), "disposedParameters", term29592);
        setField(term29576, term29576.getClass(), "description", "");
        setField(term29576, term29576.getClass(), "meaning", "");
        setField(term29576, term29576.getClass(), "deprecated", "");
        setField(term29576, term29576.getClass(), "license", "");
        setField(term29576, term29576.getClass(), "suppressions", term29597);
        setField(term29576, term29576.getClass(), "modifies", term29598);
        setField(term29576, term29576.getClass(), "lendsName", "");
        setBooleanField(term29576, term29576.getClass(), "ngInject", false);
        setBooleanField(term29576, term29576.getClass(), "wizaction", true);
        setBooleanField(term29576, term29576.getClass(), "jaggerInject", true);
        setBooleanField(term29576, term29576.getClass(), "jaggerProvide", false);
        setBooleanField(term29576, term29576.getClass(), "jaggerModule", true);
        setField(term29575, term29575.getClass(), "info", term29576);
        setField(term29605, term29605.getClass(), "sourceComment", "");
        setField(term29605, term29605.getClass(), "markers", term29607);
        setField(term29605, term29605.getClass(), "parameters", term29610);
        setField(term29605, term29605.getClass(), "throwsDescriptions", null);
        setField(term29605, term29605.getClass(), "blockDescription", null);
        setField(term29605, term29605.getClass(), "fileOverview", null);
        setField(term29605, term29605.getClass(), "returnDescription", null);
        setField(term29605, term29605.getClass(), "version", null);
        setField(term29605, term29605.getClass(), "authors", null);
        setField(term29605, term29605.getClass(), "sees", null);
        setField(term29575, term29575.getClass(), "documentation", term29605);
        setIntField(term29615, term29615.getClass(), "type", 0);
        setField(term29615, term29615.getClass(), "next", null);
        setField(term29615, term29615.getClass(), "first", null);
        setField(term29615, term29615.getClass(), "last", null);
        setField(term29615, term29615.getClass(), "propListHead", null);
        setIntField(term29615, term29615.getClass(), "sourcePosition", 0);
        setField(term29615, term29615.getClass(), "jsType", null);
        setField(term29615, term29615.getClass(), "parent", null);
        setField(term29575, term29575.getClass(), "associatedNode", term29615);
        setField(term29575, term29575.getClass(), "visibility", enum250);
        setIntField(term29575, term29575.getClass(), "bitset", -1603460382);
        setIntField(term29623, term29623.getClass(), "type", -755209283);
        setField(term29623, term29623.getClass(), "next", null);
        setField(term29623, term29623.getClass(), "first", null);
        setField(term29623, term29623.getClass(), "last", null);
        setField(term29623, term29623.getClass(), "propListHead", null);
        setIntField(term29623, term29623.getClass(), "sourcePosition", 0);
        setField(term29623, term29623.getClass(), "jsType", null);
        setField(term29623, term29623.getClass(), "parent", null);
        setField(term29622, term29622.getClass(), "root", term29623);
        setField(term29622, term29622.getClass(), "sourceName", "");
        setField(term29575, term29575.getClass(), "type", term29622);
        setIntField(term29628, term29628.getClass(), "type", 0);
        setField(term29628, term29628.getClass(), "next", null);
        setField(term29628, term29628.getClass(), "first", null);
        setField(term29628, term29628.getClass(), "last", null);
        setField(term29628, term29628.getClass(), "propListHead", null);
        setIntField(term29628, term29628.getClass(), "sourcePosition", 0);
        setField(term29628, term29628.getClass(), "jsType", null);
        setField(term29628, term29628.getClass(), "parent", null);
        setField(term29627, term29627.getClass(), "root", term29628);
        setField(term29627, term29627.getClass(), "sourceName", "");
        setField(term29575, term29575.getClass(), "thisType", term29627);
        setBooleanField(term29575, term29575.getClass(), "includeDocumentation", false);
        setIntField(term29575, term29575.getClass(), "originalCommentPosition", -298939768);
        setField(term29574, term29574.getClass(), "currentInfo", term29575);
        setBooleanField(term29574, term29574.getClass(), "populated", true);
        setBooleanField(term29574, term29574.getClass(), "parseDocumentation", true);
        setField(term29637, term29637.getClass(), "item", null);
        setIntField(term29637, term29637.getClass(), "startLineno", 0);
        setIntField(term29637, term29637.getClass(), "startCharno", 0);
        setIntField(term29637, term29637.getClass(), "endLineno", 0);
        setIntField(term29637, term29637.getClass(), "endCharno", 0);
        setField(term29636, term29636.getClass(), "annotation", term29637);
        setField(term29642, term29642.getClass(), "item", null);
        setIntField(term29642, term29642.getClass(), "startLineno", 0);
        setIntField(term29642, term29642.getClass(), "startCharno", 0);
        setIntField(term29642, term29642.getClass(), "endLineno", 0);
        setIntField(term29642, term29642.getClass(), "endCharno", 0);
        setField(term29636, term29636.getClass(), "name", term29642);
        setField(term29636, term29636.getClass(), "nameNode", null);
        setField(term29636, term29636.getClass(), "description", null);
        setField(term29636, term29636.getClass(), "type", null);
        setField(term29574, term29574.getClass(), "currentMarker", term29636);
        setField(term29520, term29520.getClass(), "jsdocBuilder", term29574);
        setField(term29520, term29520.getClass(), "sourceFile", null);
        setIntField(term29647, term29647.getClass(), "type", 750084083);
        setIntField(term29649, term29649.getClass(), "type", 0);
        setField(term29649, term29649.getClass(), "next", null);
        setField(term29649, term29649.getClass(), "first", null);
        setField(term29649, term29649.getClass(), "last", null);
        setField(term29649, term29649.getClass(), "propListHead", null);
        setIntField(term29649, term29649.getClass(), "sourcePosition", 0);
        setField(term29649, term29649.getClass(), "jsType", null);
        setField(term29649, term29649.getClass(), "parent", null);
        setField(term29647, term29647.getClass(), "next", term29649);
        setIntField(term29652, term29652.getClass(), "type", 0);
        setField(term29652, term29652.getClass(), "next", null);
        setField(term29652, term29652.getClass(), "first", null);
        setField(term29652, term29652.getClass(), "last", null);
        setField(term29652, term29652.getClass(), "propListHead", null);
        setIntField(term29652, term29652.getClass(), "sourcePosition", 0);
        setField(term29652, term29652.getClass(), "jsType", null);
        setField(term29652, term29652.getClass(), "parent", null);
        setField(term29647, term29647.getClass(), "first", term29652);
        setField(term29647, term29647.getClass(), "last", term29628);
        setField(term29647, term29647.getClass(), "propListHead", null);
        setIntField(term29647, term29647.getClass(), "sourcePosition", 0);
        setField(term29647, term29647.getClass(), "jsType", null);
        setField(term29647, term29647.getClass(), "parent", null);
        setField(term29520, term29520.getClass(), "associatedNode", term29647);
        setField(term29520, term29520.getClass(), "errorReporter", null);
        setField(term29520, term29520.getClass(), "parser", null);
        setField(term29520, term29520.getClass(), "templateNode", null);
        setField(term29520, term29520.getClass(), "fileOverviewJSDocInfo", null);
        setField(term29520, term29520.getClass(), "state", null);
        setField(term29520, term29520.getClass(), "annotationNames", null);
        setField(term29520, term29520.getClass(), "suppressionNames", null);
        setField(term29520, term29520.getClass(), "fileLevelJsDocBuilder", null);
        setField(term29520, term29520.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ziYEsRkZmD";
        try {
            callMethod(klass, "newStringNode", argTypes, term29520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


