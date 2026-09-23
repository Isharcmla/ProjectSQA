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

public class JsDocInfoParser_getRemainingJSDocLine_2019150663133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37584;

    public JsDocInfoParser_getRemainingJSDocLine_2019150663133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37642 = new ArrayList();
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ((ArrayList) term37642).add((Object)null);
        ArrayList term37645 = new ArrayList();
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        ((ArrayList) term37645).add((Object)null);
        HashMap term37648 = new HashMap();
        ArrayList term37653 = new ArrayList();
        HashSet term37656 = new HashSet();
        HashSet term37661 = new HashSet();
        HashSet term37662 = new HashSet();
        ArrayList term37671 = new ArrayList();
        HashMap term37674 = new HashMap();
        Class<? extends Object> term165888 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term165887 = ((Class) term165888).getDeclaredField((String) "PRIVATE");
        ((Field) term165887).setAccessible(true);
        Object enum271 = ((Field) term165887).get((Object) null);
        term37584 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term37585 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term37598 = (char[]) newCharArray(6);
        int[] term37606 = (int[]) newIntArray(6);
        Object term37638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term37639 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term37640 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term37641 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term37679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37686 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37691 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term37692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37700 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term37701 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term37706 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term37585, term37585.getClass(), "string", "EltrILhEwT");
        setCharElement(term37598, 0, 'l');
        setCharElement(term37598, 1, 'P');
        setCharElement(term37598, 2, 'b');
        setCharElement(term37598, 3, 'Y');
        setCharElement(term37598, 4, 'P');
        setCharElement(term37598, 5, 'k');
        setField(term37585, term37585.getClass(), "stringBuffer", term37598);
        setIntField(term37585, term37585.getClass(), "stringBufferTop", -984660976);
        setIntElement(term37606, 0, -1419341969);
        setIntElement(term37606, 1, -89522625);
        setIntElement(term37606, 2, 1475906894);
        setIntElement(term37606, 3, -2004794532);
        setIntElement(term37606, 4, 1232958763);
        setIntElement(term37606, 5, -1702132549);
        setField(term37585, term37585.getClass(), "ungetBuffer", term37606);
        setIntField(term37585, term37585.getClass(), "ungetCursor", -1786136772);
        setBooleanField(term37585, term37585.getClass(), "hitEOF", true);
        setIntField(term37585, term37585.getClass(), "lineStart", -1510967747);
        setIntField(term37585, term37585.getClass(), "lineEndChar", -2014792457);
        setIntField(term37585, term37585.getClass(), "lineno", 1957633116);
        setIntField(term37585, term37585.getClass(), "charno", 1428598210);
        setIntField(term37585, term37585.getClass(), "initCharno", 1071776561);
        setIntField(term37585, term37585.getClass(), "initLineno", 1846399918);
        setField(term37585, term37585.getClass(), "sourceString", "wCcSeUJzhg");
        setIntField(term37585, term37585.getClass(), "sourceEnd", 35388821);
        setIntField(term37585, term37585.getClass(), "sourceCursor", -598803400);
        setIntField(term37585, term37585.getClass(), "cursor", 25560022);
        setIntField(term37585, term37585.getClass(), "tokenBeg", -1090136985);
        setIntField(term37585, term37585.getClass(), "tokenEnd", -355574894);
        setField(term37584, term37584.getClass(), "stream", term37585);
        setField(term37641, term37641.getClass(), "root", null);
        setField(term37641, term37641.getClass(), "sourceName", null);
        setField(term37640, term37640.getClass(), "baseType", term37641);
        setField(term37640, term37640.getClass(), "extendedInterfaces", term37642);
        setField(term37640, term37640.getClass(), "implementedInterfaces", term37645);
        setField(term37640, term37640.getClass(), "parameters", term37648);
        setField(term37640, term37640.getClass(), "thrownTypes", term37653);
        setField(term37640, term37640.getClass(), "templateTypeNames", null);
        setField(term37640, term37640.getClass(), "disposedParameters", term37656);
        setField(term37640, term37640.getClass(), "description", "");
        setField(term37640, term37640.getClass(), "meaning", "");
        setField(term37640, term37640.getClass(), "deprecated", "");
        setField(term37640, term37640.getClass(), "license", "");
        setField(term37640, term37640.getClass(), "suppressions", term37661);
        setField(term37640, term37640.getClass(), "modifies", term37662);
        setField(term37640, term37640.getClass(), "lendsName", "");
        setBooleanField(term37640, term37640.getClass(), "ngInject", true);
        setBooleanField(term37640, term37640.getClass(), "wizaction", false);
        setBooleanField(term37640, term37640.getClass(), "jaggerInject", true);
        setBooleanField(term37640, term37640.getClass(), "jaggerProvide", true);
        setBooleanField(term37640, term37640.getClass(), "jaggerModule", true);
        setField(term37639, term37639.getClass(), "info", term37640);
        setField(term37669, term37669.getClass(), "sourceComment", "");
        setField(term37669, term37669.getClass(), "markers", term37671);
        setField(term37669, term37669.getClass(), "parameters", term37674);
        setField(term37669, term37669.getClass(), "throwsDescriptions", null);
        setField(term37669, term37669.getClass(), "blockDescription", null);
        setField(term37669, term37669.getClass(), "fileOverview", null);
        setField(term37669, term37669.getClass(), "returnDescription", null);
        setField(term37669, term37669.getClass(), "version", null);
        setField(term37669, term37669.getClass(), "authors", null);
        setField(term37669, term37669.getClass(), "sees", null);
        setField(term37639, term37639.getClass(), "documentation", term37669);
        setIntField(term37679, term37679.getClass(), "type", 0);
        setField(term37679, term37679.getClass(), "next", null);
        setField(term37679, term37679.getClass(), "first", null);
        setField(term37679, term37679.getClass(), "last", null);
        setField(term37679, term37679.getClass(), "propListHead", null);
        setIntField(term37679, term37679.getClass(), "sourcePosition", 0);
        setField(term37679, term37679.getClass(), "jsType", null);
        setField(term37679, term37679.getClass(), "parent", null);
        setField(term37639, term37639.getClass(), "associatedNode", term37679);
        setField(term37639, term37639.getClass(), "visibility", enum271);
        setIntField(term37639, term37639.getClass(), "bitset", -1546528470);
        setIntField(term37687, term37687.getClass(), "type", 0);
        setField(term37687, term37687.getClass(), "next", null);
        setField(term37687, term37687.getClass(), "first", null);
        setField(term37687, term37687.getClass(), "last", null);
        setField(term37687, term37687.getClass(), "propListHead", null);
        setIntField(term37687, term37687.getClass(), "sourcePosition", 0);
        setField(term37687, term37687.getClass(), "jsType", null);
        setField(term37687, term37687.getClass(), "parent", null);
        setField(term37686, term37686.getClass(), "root", term37687);
        setField(term37686, term37686.getClass(), "sourceName", "");
        setField(term37639, term37639.getClass(), "type", term37686);
        setIntField(term37692, term37692.getClass(), "type", 1302075623);
        setField(term37692, term37692.getClass(), "next", null);
        setField(term37692, term37692.getClass(), "first", null);
        setField(term37692, term37692.getClass(), "last", null);
        setField(term37692, term37692.getClass(), "propListHead", null);
        setIntField(term37692, term37692.getClass(), "sourcePosition", 0);
        setField(term37692, term37692.getClass(), "jsType", null);
        setField(term37692, term37692.getClass(), "parent", null);
        setField(term37691, term37691.getClass(), "root", term37692);
        setField(term37691, term37691.getClass(), "sourceName", "");
        setField(term37639, term37639.getClass(), "thisType", term37691);
        setBooleanField(term37639, term37639.getClass(), "includeDocumentation", false);
        setIntField(term37639, term37639.getClass(), "originalCommentPosition", -1518971561);
        setField(term37638, term37638.getClass(), "currentInfo", term37639);
        setBooleanField(term37638, term37638.getClass(), "populated", false);
        setBooleanField(term37638, term37638.getClass(), "parseDocumentation", false);
        setField(term37701, term37701.getClass(), "item", null);
        setIntField(term37701, term37701.getClass(), "startLineno", 0);
        setIntField(term37701, term37701.getClass(), "startCharno", 0);
        setIntField(term37701, term37701.getClass(), "endLineno", 0);
        setIntField(term37701, term37701.getClass(), "endCharno", 0);
        setField(term37700, term37700.getClass(), "annotation", term37701);
        setField(term37706, term37706.getClass(), "item", null);
        setIntField(term37706, term37706.getClass(), "startLineno", 0);
        setIntField(term37706, term37706.getClass(), "startCharno", 0);
        setIntField(term37706, term37706.getClass(), "endLineno", 0);
        setIntField(term37706, term37706.getClass(), "endCharno", 0);
        setField(term37700, term37700.getClass(), "name", term37706);
        setField(term37700, term37700.getClass(), "nameNode", null);
        setField(term37700, term37700.getClass(), "description", null);
        setField(term37700, term37700.getClass(), "type", null);
        setField(term37638, term37638.getClass(), "currentMarker", term37700);
        setField(term37584, term37584.getClass(), "jsdocBuilder", term37638);
        setField(term37584, term37584.getClass(), "sourceFile", null);
        setField(term37584, term37584.getClass(), "associatedNode", term37692);
        setField(term37584, term37584.getClass(), "errorReporter", null);
        setField(term37584, term37584.getClass(), "parser", null);
        setField(term37584, term37584.getClass(), "templateNode", null);
        setField(term37584, term37584.getClass(), "fileOverviewJSDocInfo", null);
        setField(term37584, term37584.getClass(), "state", null);
        setField(term37584, term37584.getClass(), "annotationNames", null);
        setField(term37584, term37584.getClass(), "suppressionNames", null);
        setField(term37584, term37584.getClass(), "fileLevelJsDocBuilder", null);
        setField(term37584, term37584.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRemainingJSDocLine", argTypes, term37584, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


