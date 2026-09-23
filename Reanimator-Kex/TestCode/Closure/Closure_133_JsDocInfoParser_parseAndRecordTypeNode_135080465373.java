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
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_135080465373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5684;
     Object enum161;
     Object term5799;

    public JsDocInfoParser_parseAndRecordTypeNode_135080465373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5737 = new ArrayList();
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ((ArrayList) term5737).add((Object)null);
        ArrayList term5740 = new ArrayList();
        HashMap term5743 = new HashMap();
        ArrayList term5748 = new ArrayList();
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        ((ArrayList) term5748).add((Object)null);
        Class<? extends Object> term91280 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term91279 = ((Class) term91280).getDeclaredField((String) "PUBLIC");
        ((Field) term91279).setAccessible(true);
        Object enum160 = ((Field) term91279).get((Object) null);
        term5684 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term5685 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term5698 = (char[]) newCharArray(1);
        int[] term5701 = (int[]) newIntArray(6);
        Object term5733 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term5734 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5735 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5736 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5752 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5769 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5774 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5782 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term5783 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term5788 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term5685, term5685.getClass(), "string", "mvrkADEgpp");
        setCharElement(term5698, 0, 'D');
        setField(term5685, term5685.getClass(), "stringBuffer", term5698);
        setIntField(term5685, term5685.getClass(), "stringBufferTop", -936895502);
        setIntElement(term5701, 0, -129547140);
        setIntElement(term5701, 1, 199287428);
        setIntElement(term5701, 2, -1195339592);
        setIntElement(term5701, 3, -376422566);
        setIntElement(term5701, 4, 306847454);
        setIntElement(term5701, 5, 1745276158);
        setField(term5685, term5685.getClass(), "ungetBuffer", term5701);
        setIntField(term5685, term5685.getClass(), "ungetCursor", 2009020256);
        setBooleanField(term5685, term5685.getClass(), "hitEOF", false);
        setIntField(term5685, term5685.getClass(), "lineStart", 2049577015);
        setIntField(term5685, term5685.getClass(), "lineEndChar", 1236004505);
        setIntField(term5685, term5685.getClass(), "lineno", 1050765721);
        setIntField(term5685, term5685.getClass(), "charno", 474518942);
        setIntField(term5685, term5685.getClass(), "initCharno", -1656687479);
        setIntField(term5685, term5685.getClass(), "initLineno", -249614216);
        setField(term5685, term5685.getClass(), "sourceString", "pXOkjyeIRb");
        setIntField(term5685, term5685.getClass(), "sourceEnd", 1870727665);
        setIntField(term5685, term5685.getClass(), "sourceCursor", -519881101);
        setIntField(term5685, term5685.getClass(), "cursor", -680920524);
        setIntField(term5685, term5685.getClass(), "tokenBeg", -916335264);
        setIntField(term5685, term5685.getClass(), "tokenEnd", -919416536);
        setField(term5684, term5684.getClass(), "stream", term5685);
        setField(term5736, term5736.getClass(), "root", null);
        setField(term5736, term5736.getClass(), "sourceName", null);
        setField(term5735, term5735.getClass(), "baseType", term5736);
        setField(term5735, term5735.getClass(), "extendedInterfaces", term5737);
        setField(term5735, term5735.getClass(), "implementedInterfaces", term5740);
        setField(term5735, term5735.getClass(), "parameters", term5743);
        setField(term5735, term5735.getClass(), "thrownTypes", term5748);
        setField(term5735, term5735.getClass(), "templateTypeNames", null);
        setField(term5735, term5735.getClass(), "classTemplateTypeNames", null);
        setField(term5735, term5735.getClass(), "description", null);
        setField(term5735, term5735.getClass(), "meaning", null);
        setField(term5735, term5735.getClass(), "deprecated", null);
        setField(term5735, term5735.getClass(), "license", null);
        setField(term5735, term5735.getClass(), "suppressions", null);
        setField(term5735, term5735.getClass(), "modifies", null);
        setField(term5735, term5735.getClass(), "lendsName", null);
        setBooleanField(term5735, term5735.getClass(), "ngInject", false);
        setField(term5734, term5734.getClass(), "info", term5735);
        setField(term5752, term5752.getClass(), "sourceComment", null);
        setField(term5752, term5752.getClass(), "markers", null);
        setField(term5752, term5752.getClass(), "parameters", null);
        setField(term5752, term5752.getClass(), "throwsDescriptions", null);
        setField(term5752, term5752.getClass(), "blockDescription", null);
        setField(term5752, term5752.getClass(), "fileOverview", null);
        setField(term5752, term5752.getClass(), "returnDescription", null);
        setField(term5752, term5752.getClass(), "version", null);
        setField(term5752, term5752.getClass(), "authors", null);
        setField(term5752, term5752.getClass(), "sees", null);
        setField(term5734, term5734.getClass(), "documentation", term5752);
        setIntField(term5753, term5753.getClass(), "type", 413548937);
        setIntField(term5755, term5755.getClass(), "type", 0);
        setField(term5755, term5755.getClass(), "next", null);
        setField(term5755, term5755.getClass(), "first", null);
        setField(term5755, term5755.getClass(), "last", null);
        setField(term5755, term5755.getClass(), "propListHead", null);
        setIntField(term5755, term5755.getClass(), "sourcePosition", 0);
        setField(term5755, term5755.getClass(), "jsType", null);
        setField(term5755, term5755.getClass(), "parent", null);
        setField(term5753, term5753.getClass(), "next", term5755);
        setIntField(term5758, term5758.getClass(), "type", 0);
        setField(term5758, term5758.getClass(), "next", null);
        setField(term5758, term5758.getClass(), "first", null);
        setField(term5758, term5758.getClass(), "last", null);
        setField(term5758, term5758.getClass(), "propListHead", null);
        setIntField(term5758, term5758.getClass(), "sourcePosition", 0);
        setField(term5758, term5758.getClass(), "jsType", null);
        setField(term5758, term5758.getClass(), "parent", null);
        setField(term5753, term5753.getClass(), "first", term5758);
        setIntField(term5761, term5761.getClass(), "type", 0);
        setField(term5761, term5761.getClass(), "next", null);
        setField(term5761, term5761.getClass(), "first", null);
        setField(term5761, term5761.getClass(), "last", null);
        setField(term5761, term5761.getClass(), "propListHead", null);
        setIntField(term5761, term5761.getClass(), "sourcePosition", 0);
        setField(term5761, term5761.getClass(), "jsType", null);
        setField(term5761, term5761.getClass(), "parent", null);
        setField(term5753, term5753.getClass(), "last", term5761);
        setField(term5753, term5753.getClass(), "propListHead", null);
        setIntField(term5753, term5753.getClass(), "sourcePosition", 0);
        setField(term5753, term5753.getClass(), "jsType", null);
        setField(term5753, term5753.getClass(), "parent", null);
        setField(term5734, term5734.getClass(), "associatedNode", term5753);
        setField(term5734, term5734.getClass(), "visibility", enum160);
        setIntField(term5734, term5734.getClass(), "bitset", 1901317214);
        setIntField(term5770, term5770.getClass(), "type", -1533843432);
        setField(term5770, term5770.getClass(), "next", null);
        setField(term5770, term5770.getClass(), "first", null);
        setField(term5770, term5770.getClass(), "last", term5755);
        setField(term5770, term5770.getClass(), "propListHead", null);
        setIntField(term5770, term5770.getClass(), "sourcePosition", 0);
        setField(term5770, term5770.getClass(), "jsType", null);
        setField(term5770, term5770.getClass(), "parent", null);
        setField(term5769, term5769.getClass(), "root", term5770);
        setField(term5769, term5769.getClass(), "sourceName", "");
        setField(term5734, term5734.getClass(), "type", term5769);
        setIntField(term5775, term5775.getClass(), "type", 0);
        setField(term5775, term5775.getClass(), "next", null);
        setField(term5775, term5775.getClass(), "first", null);
        setField(term5775, term5775.getClass(), "last", null);
        setField(term5775, term5775.getClass(), "propListHead", null);
        setIntField(term5775, term5775.getClass(), "sourcePosition", 0);
        setField(term5775, term5775.getClass(), "jsType", null);
        setField(term5775, term5775.getClass(), "parent", null);
        setField(term5774, term5774.getClass(), "root", term5775);
        setField(term5774, term5774.getClass(), "sourceName", "");
        setField(term5734, term5734.getClass(), "thisType", term5774);
        setBooleanField(term5734, term5734.getClass(), "includeDocumentation", true);
        setField(term5733, term5733.getClass(), "currentInfo", term5734);
        setBooleanField(term5733, term5733.getClass(), "populated", true);
        setBooleanField(term5733, term5733.getClass(), "parseDocumentation", false);
        setField(term5783, term5783.getClass(), "item", null);
        setIntField(term5783, term5783.getClass(), "startLineno", 0);
        setIntField(term5783, term5783.getClass(), "startCharno", 0);
        setIntField(term5783, term5783.getClass(), "endLineno", 0);
        setIntField(term5783, term5783.getClass(), "endCharno", 0);
        setField(term5782, term5782.getClass(), "annotation", term5783);
        setField(term5788, term5788.getClass(), "item", null);
        setIntField(term5788, term5788.getClass(), "startLineno", 0);
        setIntField(term5788, term5788.getClass(), "startCharno", 0);
        setIntField(term5788, term5788.getClass(), "endLineno", 0);
        setIntField(term5788, term5788.getClass(), "endCharno", 0);
        setField(term5782, term5782.getClass(), "name", term5788);
        setField(term5782, term5782.getClass(), "nameNode", null);
        setField(term5782, term5782.getClass(), "description", null);
        setField(term5782, term5782.getClass(), "type", null);
        setField(term5733, term5733.getClass(), "currentMarker", term5782);
        setField(term5684, term5684.getClass(), "jsdocBuilder", term5733);
        setField(term5684, term5684.getClass(), "sourceFile", null);
        setField(term5684, term5684.getClass(), "associatedNode", term5758);
        setField(term5684, term5684.getClass(), "errorReporter", null);
        setField(term5684, term5684.getClass(), "parser", null);
        setField(term5684, term5684.getClass(), "templateNode", null);
        setField(term5684, term5684.getClass(), "fileOverviewJSDocInfo", null);
        setField(term5684, term5684.getClass(), "state", null);
        setField(term5684, term5684.getClass(), "annotationNames", null);
        setField(term5684, term5684.getClass(), "suppressionNames", null);
        setField(term5684, term5684.getClass(), "fileLevelJsDocBuilder", null);
        setField(term5684, term5684.getClass(), "unreadToken", null);
        Class<? extends Object> term91545 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term91544 = ((Class) term91545).getDeclaredField((String) "LB");
        ((Field) term91544).setAccessible(true);
        enum161 = ((Field) term91544).get((Object) null);
        term5799 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum161;
        args[1] = term5799;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term5684, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


