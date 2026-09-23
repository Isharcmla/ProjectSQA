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
import java.lang.String;

public class JsDocInfoParser_parseUnionType_70403548095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19586;
     Object enum204;

    public JsDocInfoParser_parseUnionType_70403548095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19640 = new ArrayList();
        ((ArrayList) term19640).add((Object)null);
        ((ArrayList) term19640).add((Object)null);
        ((ArrayList) term19640).add((Object)null);
        ArrayList term19643 = new ArrayList();
        ((ArrayList) term19643).add((Object)null);
        ((ArrayList) term19643).add((Object)null);
        ((ArrayList) term19643).add((Object)null);
        HashMap term19646 = new HashMap();
        ArrayList term19651 = new ArrayList();
        ((ArrayList) term19651).add((Object)null);
        ((ArrayList) term19651).add((Object)null);
        ((ArrayList) term19651).add((Object)null);
        ((ArrayList) term19651).add((Object)null);
        ((ArrayList) term19651).add((Object)null);
        Class<? extends Object> term115688 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term115686 = ((Class) term115688).getDeclaredField((String) "INHERITED");
        ((Field) term115686).setAccessible(true);
        Object enum202 = ((Field) term115686).get((Object) null);
        term19586 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term19587 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term19600 = (char[]) newCharArray(8);
        int[] term19610 = (int[]) newIntArray(0);
        Object term19636 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term19637 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19639 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19655 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19663 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19668 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19673 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19674 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19679 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19587, term19587.getClass(), "string", "uXYcXVYJZM");
        setCharElement(term19600, 0, 'F');
        setCharElement(term19600, 1, 'p');
        setCharElement(term19600, 2, 'a');
        setCharElement(term19600, 3, 'H');
        setCharElement(term19600, 4, 'E');
        setCharElement(term19600, 5, 'w');
        setCharElement(term19600, 6, 'X');
        setCharElement(term19600, 7, 'R');
        setField(term19587, term19587.getClass(), "stringBuffer", term19600);
        setIntField(term19587, term19587.getClass(), "stringBufferTop", -626779272);
        setField(term19587, term19587.getClass(), "ungetBuffer", term19610);
        setIntField(term19587, term19587.getClass(), "ungetCursor", -1150062870);
        setBooleanField(term19587, term19587.getClass(), "hitEOF", true);
        setIntField(term19587, term19587.getClass(), "lineStart", -886200503);
        setIntField(term19587, term19587.getClass(), "lineEndChar", 1136393691);
        setIntField(term19587, term19587.getClass(), "lineno", -1288536479);
        setIntField(term19587, term19587.getClass(), "charno", 1092038167);
        setIntField(term19587, term19587.getClass(), "initCharno", 1879729823);
        setIntField(term19587, term19587.getClass(), "initLineno", 1443855558);
        setField(term19587, term19587.getClass(), "sourceString", "BJhjdJUhkz");
        setIntField(term19587, term19587.getClass(), "sourceEnd", -1933419449);
        setIntField(term19587, term19587.getClass(), "sourceCursor", -1804322375);
        setIntField(term19587, term19587.getClass(), "cursor", 1595814906);
        setIntField(term19587, term19587.getClass(), "tokenBeg", -834193529);
        setIntField(term19587, term19587.getClass(), "tokenEnd", 335780735);
        setField(term19586, term19586.getClass(), "stream", term19587);
        setField(term19639, term19639.getClass(), "root", null);
        setField(term19639, term19639.getClass(), "sourceName", null);
        setField(term19638, term19638.getClass(), "baseType", term19639);
        setField(term19638, term19638.getClass(), "extendedInterfaces", term19640);
        setField(term19638, term19638.getClass(), "implementedInterfaces", term19643);
        setField(term19638, term19638.getClass(), "parameters", term19646);
        setField(term19638, term19638.getClass(), "thrownTypes", term19651);
        setField(term19638, term19638.getClass(), "templateTypeNames", null);
        setField(term19638, term19638.getClass(), "classTemplateTypeNames", null);
        setField(term19638, term19638.getClass(), "description", null);
        setField(term19638, term19638.getClass(), "meaning", null);
        setField(term19638, term19638.getClass(), "deprecated", null);
        setField(term19638, term19638.getClass(), "license", null);
        setField(term19638, term19638.getClass(), "suppressions", null);
        setField(term19638, term19638.getClass(), "modifies", null);
        setField(term19638, term19638.getClass(), "lendsName", null);
        setBooleanField(term19638, term19638.getClass(), "ngInject", false);
        setField(term19637, term19637.getClass(), "info", term19638);
        setField(term19655, term19655.getClass(), "sourceComment", null);
        setField(term19655, term19655.getClass(), "markers", null);
        setField(term19655, term19655.getClass(), "parameters", null);
        setField(term19655, term19655.getClass(), "throwsDescriptions", null);
        setField(term19655, term19655.getClass(), "blockDescription", null);
        setField(term19655, term19655.getClass(), "fileOverview", null);
        setField(term19655, term19655.getClass(), "returnDescription", null);
        setField(term19655, term19655.getClass(), "version", null);
        setField(term19655, term19655.getClass(), "authors", null);
        setField(term19655, term19655.getClass(), "sees", null);
        setField(term19637, term19637.getClass(), "documentation", term19655);
        setIntField(term19656, term19656.getClass(), "type", 0);
        setField(term19656, term19656.getClass(), "next", null);
        setField(term19656, term19656.getClass(), "first", null);
        setField(term19656, term19656.getClass(), "last", null);
        setField(term19656, term19656.getClass(), "propListHead", null);
        setIntField(term19656, term19656.getClass(), "sourcePosition", 0);
        setField(term19656, term19656.getClass(), "jsType", null);
        setField(term19656, term19656.getClass(), "parent", null);
        setField(term19637, term19637.getClass(), "associatedNode", term19656);
        setField(term19637, term19637.getClass(), "visibility", enum202);
        setIntField(term19637, term19637.getClass(), "bitset", -1723168189);
        setIntField(term19664, term19664.getClass(), "type", 0);
        setField(term19664, term19664.getClass(), "next", null);
        setField(term19664, term19664.getClass(), "first", null);
        setField(term19664, term19664.getClass(), "last", null);
        setField(term19664, term19664.getClass(), "propListHead", null);
        setIntField(term19664, term19664.getClass(), "sourcePosition", 0);
        setField(term19664, term19664.getClass(), "jsType", null);
        setField(term19664, term19664.getClass(), "parent", null);
        setField(term19663, term19663.getClass(), "root", term19664);
        setField(term19663, term19663.getClass(), "sourceName", "");
        setField(term19637, term19637.getClass(), "type", term19663);
        setField(term19668, term19668.getClass(), "root", term19664);
        setField(term19668, term19668.getClass(), "sourceName", "");
        setField(term19637, term19637.getClass(), "thisType", term19668);
        setBooleanField(term19637, term19637.getClass(), "includeDocumentation", true);
        setField(term19636, term19636.getClass(), "currentInfo", term19637);
        setBooleanField(term19636, term19636.getClass(), "populated", false);
        setBooleanField(term19636, term19636.getClass(), "parseDocumentation", false);
        setField(term19674, term19674.getClass(), "item", null);
        setIntField(term19674, term19674.getClass(), "startLineno", 0);
        setIntField(term19674, term19674.getClass(), "startCharno", 0);
        setIntField(term19674, term19674.getClass(), "endLineno", 0);
        setIntField(term19674, term19674.getClass(), "endCharno", 0);
        setField(term19673, term19673.getClass(), "annotation", term19674);
        setField(term19679, term19679.getClass(), "item", null);
        setIntField(term19679, term19679.getClass(), "startLineno", 0);
        setIntField(term19679, term19679.getClass(), "startCharno", 0);
        setIntField(term19679, term19679.getClass(), "endLineno", 0);
        setIntField(term19679, term19679.getClass(), "endCharno", 0);
        setField(term19673, term19673.getClass(), "name", term19679);
        setField(term19673, term19673.getClass(), "nameNode", null);
        setField(term19673, term19673.getClass(), "description", null);
        setField(term19673, term19673.getClass(), "type", null);
        setField(term19636, term19636.getClass(), "currentMarker", term19673);
        setField(term19586, term19586.getClass(), "jsdocBuilder", term19636);
        setField(term19586, term19586.getClass(), "sourceFile", null);
        setIntField(term19684, term19684.getClass(), "type", 1841286431);
        setIntField(term19686, term19686.getClass(), "type", 0);
        setField(term19686, term19686.getClass(), "next", null);
        setField(term19686, term19686.getClass(), "first", null);
        setField(term19686, term19686.getClass(), "last", null);
        setField(term19686, term19686.getClass(), "propListHead", null);
        setIntField(term19686, term19686.getClass(), "sourcePosition", 0);
        setField(term19686, term19686.getClass(), "jsType", null);
        setField(term19686, term19686.getClass(), "parent", null);
        setField(term19684, term19684.getClass(), "next", term19686);
        setIntField(term19689, term19689.getClass(), "type", 0);
        setField(term19689, term19689.getClass(), "next", null);
        setField(term19689, term19689.getClass(), "first", null);
        setField(term19689, term19689.getClass(), "last", null);
        setField(term19689, term19689.getClass(), "propListHead", null);
        setIntField(term19689, term19689.getClass(), "sourcePosition", 0);
        setField(term19689, term19689.getClass(), "jsType", null);
        setField(term19689, term19689.getClass(), "parent", null);
        setField(term19684, term19684.getClass(), "first", term19689);
        setField(term19684, term19684.getClass(), "last", term19664);
        setField(term19684, term19684.getClass(), "propListHead", null);
        setIntField(term19684, term19684.getClass(), "sourcePosition", 0);
        setField(term19684, term19684.getClass(), "jsType", null);
        setField(term19684, term19684.getClass(), "parent", null);
        setField(term19586, term19586.getClass(), "associatedNode", term19684);
        setField(term19586, term19586.getClass(), "errorReporter", null);
        setField(term19586, term19586.getClass(), "parser", null);
        setField(term19586, term19586.getClass(), "templateNode", null);
        setField(term19586, term19586.getClass(), "fileOverviewJSDocInfo", null);
        setField(term19586, term19586.getClass(), "state", null);
        setField(term19586, term19586.getClass(), "annotationNames", null);
        setField(term19586, term19586.getClass(), "suppressionNames", null);
        setField(term19586, term19586.getClass(), "fileLevelJsDocBuilder", null);
        setField(term19586, term19586.getClass(), "unreadToken", null);
        Class<? extends Object> term116244 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term116243 = ((Class) term116244).getDeclaredField((String) "LP");
        ((Field) term116243).setAccessible(true);
        enum204 = ((Field) term116243).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum204;
        try {
            callMethod(klass, "parseUnionType", argTypes, term19586, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


