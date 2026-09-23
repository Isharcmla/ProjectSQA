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

public class JsDocInfoParser_parseTopLevelTypeExpression_204703391484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15692;
     Object enum189;

    public JsDocInfoParser_parseTopLevelTypeExpression_204703391484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15745 = new ArrayList();
        ((ArrayList) term15745).add((Object)null);
        ((ArrayList) term15745).add((Object)null);
        ((ArrayList) term15745).add((Object)null);
        ((ArrayList) term15745).add((Object)null);
        ((ArrayList) term15745).add((Object)null);
        ArrayList term15748 = new ArrayList();
        ((ArrayList) term15748).add((Object)null);
        ((ArrayList) term15748).add((Object)null);
        ((ArrayList) term15748).add((Object)null);
        HashMap term15751 = new HashMap();
        ArrayList term15756 = new ArrayList();
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        ((ArrayList) term15756).add((Object)null);
        HashSet term15764 = new HashSet();
        HashSet term15765 = new HashSet();
        ArrayList term15769 = new ArrayList();
        ((ArrayList) term15769).add((Object)null);
        ((ArrayList) term15769).add((Object)null);
        HashMap term15772 = new HashMap();
        Class<? extends Object> term93465 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term93464 = ((Class) term93465).getDeclaredField((String) "PUBLIC");
        ((Field) term93464).setAccessible(true);
        Object enum188 = ((Field) term93464).get((Object) null);
        term15692 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term15693 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term15706 = (char[]) newCharArray(6);
        int[] term15714 = (int[]) newIntArray(1);
        Object term15741 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term15742 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term15744 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15767 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term15777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15784 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15789 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term15790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term15798 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15803 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15693, term15693.getClass(), "string", "PSOttyUeqv");
        setCharElement(term15706, 0, 'R');
        setCharElement(term15706, 1, 'M');
        setCharElement(term15706, 2, 'F');
        setCharElement(term15706, 3, 'I');
        setCharElement(term15706, 4, 's');
        setCharElement(term15706, 5, 'Y');
        setField(term15693, term15693.getClass(), "stringBuffer", term15706);
        setIntField(term15693, term15693.getClass(), "stringBufferTop", -1972033388);
        setIntElement(term15714, 0, -1005024758);
        setField(term15693, term15693.getClass(), "ungetBuffer", term15714);
        setIntField(term15693, term15693.getClass(), "ungetCursor", 2634669);
        setBooleanField(term15693, term15693.getClass(), "hitEOF", true);
        setIntField(term15693, term15693.getClass(), "lineStart", -1912429941);
        setIntField(term15693, term15693.getClass(), "lineEndChar", 1801052257);
        setIntField(term15693, term15693.getClass(), "lineno", -2110556060);
        setIntField(term15693, term15693.getClass(), "charno", 313459791);
        setIntField(term15693, term15693.getClass(), "initCharno", 752615112);
        setIntField(term15693, term15693.getClass(), "initLineno", -1674430871);
        setField(term15693, term15693.getClass(), "sourceString", "HmEvTlmzXo");
        setIntField(term15693, term15693.getClass(), "sourceEnd", 794352120);
        setIntField(term15693, term15693.getClass(), "sourceCursor", 340719678);
        setIntField(term15693, term15693.getClass(), "cursor", 299791142);
        setIntField(term15693, term15693.getClass(), "tokenBeg", 1862191391);
        setIntField(term15693, term15693.getClass(), "tokenEnd", 1131398807);
        setField(term15692, term15692.getClass(), "stream", term15693);
        setField(term15744, term15744.getClass(), "root", null);
        setField(term15744, term15744.getClass(), "sourceName", null);
        setField(term15743, term15743.getClass(), "baseType", term15744);
        setField(term15743, term15743.getClass(), "extendedInterfaces", term15745);
        setField(term15743, term15743.getClass(), "implementedInterfaces", term15748);
        setField(term15743, term15743.getClass(), "parameters", term15751);
        setField(term15743, term15743.getClass(), "thrownTypes", term15756);
        setField(term15743, term15743.getClass(), "templateTypeName", "");
        setField(term15743, term15743.getClass(), "description", "");
        setField(term15743, term15743.getClass(), "meaning", "");
        setField(term15743, term15743.getClass(), "deprecated", "");
        setField(term15743, term15743.getClass(), "license", "");
        setField(term15743, term15743.getClass(), "suppressions", term15764);
        setField(term15743, term15743.getClass(), "modifies", term15765);
        setField(term15743, term15743.getClass(), "lendsName", "");
        setField(term15742, term15742.getClass(), "info", term15743);
        setField(term15767, term15767.getClass(), "sourceComment", "");
        setField(term15767, term15767.getClass(), "markers", term15769);
        setField(term15767, term15767.getClass(), "parameters", term15772);
        setField(term15767, term15767.getClass(), "throwsDescriptions", null);
        setField(term15767, term15767.getClass(), "blockDescription", null);
        setField(term15767, term15767.getClass(), "fileOverview", null);
        setField(term15767, term15767.getClass(), "returnDescription", null);
        setField(term15767, term15767.getClass(), "version", null);
        setField(term15767, term15767.getClass(), "authors", null);
        setField(term15767, term15767.getClass(), "sees", null);
        setField(term15742, term15742.getClass(), "documentation", term15767);
        setIntField(term15777, term15777.getClass(), "type", 0);
        setField(term15777, term15777.getClass(), "next", null);
        setField(term15777, term15777.getClass(), "first", null);
        setField(term15777, term15777.getClass(), "last", null);
        setField(term15777, term15777.getClass(), "propListHead", null);
        setIntField(term15777, term15777.getClass(), "sourcePosition", 0);
        setField(term15777, term15777.getClass(), "jsType", null);
        setField(term15777, term15777.getClass(), "parent", null);
        setField(term15742, term15742.getClass(), "associatedNode", term15777);
        setField(term15742, term15742.getClass(), "visibility", enum188);
        setIntField(term15742, term15742.getClass(), "bitset", -1793950607);
        setIntField(term15785, term15785.getClass(), "type", -1794965320);
        setField(term15785, term15785.getClass(), "next", null);
        setField(term15785, term15785.getClass(), "first", null);
        setField(term15785, term15785.getClass(), "last", term15777);
        setField(term15785, term15785.getClass(), "propListHead", null);
        setIntField(term15785, term15785.getClass(), "sourcePosition", 0);
        setField(term15785, term15785.getClass(), "jsType", null);
        setField(term15785, term15785.getClass(), "parent", null);
        setField(term15784, term15784.getClass(), "root", term15785);
        setField(term15784, term15784.getClass(), "sourceName", "");
        setField(term15742, term15742.getClass(), "type", term15784);
        setIntField(term15790, term15790.getClass(), "type", 0);
        setField(term15790, term15790.getClass(), "next", null);
        setField(term15790, term15790.getClass(), "first", null);
        setField(term15790, term15790.getClass(), "last", null);
        setField(term15790, term15790.getClass(), "propListHead", null);
        setIntField(term15790, term15790.getClass(), "sourcePosition", 0);
        setField(term15790, term15790.getClass(), "jsType", null);
        setField(term15790, term15790.getClass(), "parent", null);
        setField(term15789, term15789.getClass(), "root", term15790);
        setField(term15789, term15789.getClass(), "sourceName", "");
        setField(term15742, term15742.getClass(), "thisType", term15789);
        setBooleanField(term15742, term15742.getClass(), "includeDocumentation", false);
        setField(term15741, term15741.getClass(), "currentInfo", term15742);
        setBooleanField(term15741, term15741.getClass(), "populated", false);
        setBooleanField(term15741, term15741.getClass(), "parseDocumentation", true);
        setField(term15798, term15798.getClass(), "item", null);
        setIntField(term15798, term15798.getClass(), "startLineno", 0);
        setIntField(term15798, term15798.getClass(), "startCharno", 0);
        setIntField(term15798, term15798.getClass(), "endLineno", 0);
        setIntField(term15798, term15798.getClass(), "endCharno", 0);
        setField(term15797, term15797.getClass(), "annotation", term15798);
        setField(term15803, term15803.getClass(), "item", null);
        setIntField(term15803, term15803.getClass(), "startLineno", 0);
        setIntField(term15803, term15803.getClass(), "startCharno", 0);
        setIntField(term15803, term15803.getClass(), "endLineno", 0);
        setIntField(term15803, term15803.getClass(), "endCharno", 0);
        setField(term15797, term15797.getClass(), "name", term15803);
        setField(term15797, term15797.getClass(), "nameNode", null);
        setField(term15797, term15797.getClass(), "description", null);
        setField(term15797, term15797.getClass(), "type", null);
        setField(term15741, term15741.getClass(), "currentMarker", term15797);
        setField(term15692, term15692.getClass(), "jsdocBuilder", term15741);
        setField(term15692, term15692.getClass(), "sourceFile", null);
        setIntField(term15808, term15808.getClass(), "type", 0);
        setField(term15808, term15808.getClass(), "next", null);
        setField(term15808, term15808.getClass(), "first", null);
        setField(term15808, term15808.getClass(), "last", null);
        setField(term15808, term15808.getClass(), "propListHead", null);
        setIntField(term15808, term15808.getClass(), "sourcePosition", 0);
        setField(term15808, term15808.getClass(), "jsType", null);
        setField(term15808, term15808.getClass(), "parent", null);
        setField(term15692, term15692.getClass(), "associatedNode", term15808);
        setField(term15692, term15692.getClass(), "errorReporter", null);
        setField(term15692, term15692.getClass(), "parser", null);
        setField(term15692, term15692.getClass(), "templateNode", null);
        setField(term15692, term15692.getClass(), "fileOverviewJSDocInfo", null);
        setField(term15692, term15692.getClass(), "state", null);
        setField(term15692, term15692.getClass(), "annotationNames", null);
        setField(term15692, term15692.getClass(), "suppressionNames", null);
        setField(term15692, term15692.getClass(), "fileLevelJsDocBuilder", null);
        setField(term15692, term15692.getClass(), "unreadToken", null);
        Class<? extends Object> term93730 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term93729 = ((Class) term93730).getDeclaredField((String) "COLON");
        ((Field) term93729).setAccessible(true);
        enum189 = ((Field) term93729).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum189;
        try {
            callMethod(klass, "parseTopLevelTypeExpression", argTypes, term15692, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


