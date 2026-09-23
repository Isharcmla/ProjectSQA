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

public class JsDocInfoParser_next_631041944114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30632;

    public JsDocInfoParser_next_631041944114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30695 = new ArrayList();
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ((ArrayList) term30695).add((Object)null);
        ArrayList term30698 = new ArrayList();
        ((ArrayList) term30698).add((Object)null);
        HashMap term30701 = new HashMap();
        ArrayList term30706 = new ArrayList();
        ((ArrayList) term30706).add((Object)null);
        Class<? extends Object> term125554 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term125553 = ((Class) term125554).getDeclaredField((String) "PROTECTED");
        ((Field) term125553).setAccessible(true);
        Object enum234 = ((Field) term125553).get((Object) null);
        term30632 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term30633 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term30646 = (char[]) newCharArray(9);
        int[] term30657 = (int[]) newIntArray(8);
        Object term30691 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term30692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term30693 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term30694 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30710 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term30711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30718 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30723 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30731 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term30732 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term30737 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term30742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30633, term30633.getClass(), "string", "YSrFKQQwXE");
        setCharElement(term30646, 0, 'l');
        setCharElement(term30646, 1, 'x');
        setCharElement(term30646, 2, 'v');
        setCharElement(term30646, 3, 'G');
        setCharElement(term30646, 4, 'V');
        setCharElement(term30646, 5, 'B');
        setCharElement(term30646, 6, 'Y');
        setCharElement(term30646, 7, 'q');
        setCharElement(term30646, 8, 'F');
        setField(term30633, term30633.getClass(), "stringBuffer", term30646);
        setIntField(term30633, term30633.getClass(), "stringBufferTop", 270928865);
        setIntElement(term30657, 0, -308526089);
        setIntElement(term30657, 1, -359675864);
        setIntElement(term30657, 2, -1671982964);
        setIntElement(term30657, 3, 776218451);
        setIntElement(term30657, 4, -1362132929);
        setIntElement(term30657, 5, 1267740164);
        setIntElement(term30657, 6, 1363887997);
        setIntElement(term30657, 7, -1744763945);
        setField(term30633, term30633.getClass(), "ungetBuffer", term30657);
        setIntField(term30633, term30633.getClass(), "ungetCursor", 852281447);
        setBooleanField(term30633, term30633.getClass(), "hitEOF", true);
        setIntField(term30633, term30633.getClass(), "lineStart", 1248430530);
        setIntField(term30633, term30633.getClass(), "lineEndChar", -1911828505);
        setIntField(term30633, term30633.getClass(), "lineno", 241725499);
        setIntField(term30633, term30633.getClass(), "charno", 823179298);
        setIntField(term30633, term30633.getClass(), "initCharno", 1174484848);
        setIntField(term30633, term30633.getClass(), "initLineno", 939889496);
        setField(term30633, term30633.getClass(), "sourceString", "qxhOsmyyjm");
        setIntField(term30633, term30633.getClass(), "sourceEnd", -495242269);
        setIntField(term30633, term30633.getClass(), "sourceCursor", 932810106);
        setIntField(term30633, term30633.getClass(), "cursor", -2138801137);
        setIntField(term30633, term30633.getClass(), "tokenBeg", -1470115841);
        setIntField(term30633, term30633.getClass(), "tokenEnd", 480909331);
        setField(term30632, term30632.getClass(), "stream", term30633);
        setField(term30694, term30694.getClass(), "root", null);
        setField(term30694, term30694.getClass(), "sourceName", null);
        setField(term30693, term30693.getClass(), "baseType", term30694);
        setField(term30693, term30693.getClass(), "extendedInterfaces", term30695);
        setField(term30693, term30693.getClass(), "implementedInterfaces", term30698);
        setField(term30693, term30693.getClass(), "parameters", term30701);
        setField(term30693, term30693.getClass(), "thrownTypes", term30706);
        setField(term30693, term30693.getClass(), "templateTypeNames", null);
        setField(term30693, term30693.getClass(), "classTemplateTypeNames", null);
        setField(term30693, term30693.getClass(), "description", null);
        setField(term30693, term30693.getClass(), "meaning", null);
        setField(term30693, term30693.getClass(), "deprecated", null);
        setField(term30693, term30693.getClass(), "license", null);
        setField(term30693, term30693.getClass(), "suppressions", null);
        setField(term30693, term30693.getClass(), "modifies", null);
        setField(term30693, term30693.getClass(), "lendsName", null);
        setBooleanField(term30693, term30693.getClass(), "ngInject", false);
        setField(term30692, term30692.getClass(), "info", term30693);
        setField(term30710, term30710.getClass(), "sourceComment", null);
        setField(term30710, term30710.getClass(), "markers", null);
        setField(term30710, term30710.getClass(), "parameters", null);
        setField(term30710, term30710.getClass(), "throwsDescriptions", null);
        setField(term30710, term30710.getClass(), "blockDescription", null);
        setField(term30710, term30710.getClass(), "fileOverview", null);
        setField(term30710, term30710.getClass(), "returnDescription", null);
        setField(term30710, term30710.getClass(), "version", null);
        setField(term30710, term30710.getClass(), "authors", null);
        setField(term30710, term30710.getClass(), "sees", null);
        setField(term30692, term30692.getClass(), "documentation", term30710);
        setIntField(term30711, term30711.getClass(), "type", 0);
        setField(term30711, term30711.getClass(), "next", null);
        setField(term30711, term30711.getClass(), "first", null);
        setField(term30711, term30711.getClass(), "last", null);
        setField(term30711, term30711.getClass(), "propListHead", null);
        setIntField(term30711, term30711.getClass(), "sourcePosition", 0);
        setField(term30711, term30711.getClass(), "jsType", null);
        setField(term30711, term30711.getClass(), "parent", null);
        setField(term30692, term30692.getClass(), "associatedNode", term30711);
        setField(term30692, term30692.getClass(), "visibility", enum234);
        setIntField(term30692, term30692.getClass(), "bitset", -2077814162);
        setIntField(term30719, term30719.getClass(), "type", 1505375686);
        setField(term30719, term30719.getClass(), "next", null);
        setField(term30719, term30719.getClass(), "first", null);
        setField(term30719, term30719.getClass(), "last", null);
        setField(term30719, term30719.getClass(), "propListHead", null);
        setIntField(term30719, term30719.getClass(), "sourcePosition", 0);
        setField(term30719, term30719.getClass(), "jsType", null);
        setField(term30719, term30719.getClass(), "parent", null);
        setField(term30718, term30718.getClass(), "root", term30719);
        setField(term30718, term30718.getClass(), "sourceName", "");
        setField(term30692, term30692.getClass(), "type", term30718);
        setIntField(term30724, term30724.getClass(), "type", 0);
        setField(term30724, term30724.getClass(), "next", null);
        setField(term30724, term30724.getClass(), "first", null);
        setField(term30724, term30724.getClass(), "last", null);
        setField(term30724, term30724.getClass(), "propListHead", null);
        setIntField(term30724, term30724.getClass(), "sourcePosition", 0);
        setField(term30724, term30724.getClass(), "jsType", null);
        setField(term30724, term30724.getClass(), "parent", null);
        setField(term30723, term30723.getClass(), "root", term30724);
        setField(term30723, term30723.getClass(), "sourceName", "");
        setField(term30692, term30692.getClass(), "thisType", term30723);
        setBooleanField(term30692, term30692.getClass(), "includeDocumentation", true);
        setField(term30691, term30691.getClass(), "currentInfo", term30692);
        setBooleanField(term30691, term30691.getClass(), "populated", true);
        setBooleanField(term30691, term30691.getClass(), "parseDocumentation", false);
        setField(term30732, term30732.getClass(), "item", null);
        setIntField(term30732, term30732.getClass(), "startLineno", 0);
        setIntField(term30732, term30732.getClass(), "startCharno", 0);
        setIntField(term30732, term30732.getClass(), "endLineno", 0);
        setIntField(term30732, term30732.getClass(), "endCharno", 0);
        setField(term30731, term30731.getClass(), "annotation", term30732);
        setField(term30737, term30737.getClass(), "item", null);
        setIntField(term30737, term30737.getClass(), "startLineno", 0);
        setIntField(term30737, term30737.getClass(), "startCharno", 0);
        setIntField(term30737, term30737.getClass(), "endLineno", 0);
        setIntField(term30737, term30737.getClass(), "endCharno", 0);
        setField(term30731, term30731.getClass(), "name", term30737);
        setField(term30731, term30731.getClass(), "nameNode", null);
        setField(term30731, term30731.getClass(), "description", null);
        setField(term30731, term30731.getClass(), "type", null);
        setField(term30691, term30691.getClass(), "currentMarker", term30731);
        setField(term30632, term30632.getClass(), "jsdocBuilder", term30691);
        setField(term30632, term30632.getClass(), "sourceFile", null);
        setIntField(term30742, term30742.getClass(), "type", -1235127374);
        setIntField(term30744, term30744.getClass(), "type", 0);
        setField(term30744, term30744.getClass(), "next", null);
        setField(term30744, term30744.getClass(), "first", null);
        setField(term30744, term30744.getClass(), "last", null);
        setField(term30744, term30744.getClass(), "propListHead", null);
        setIntField(term30744, term30744.getClass(), "sourcePosition", 0);
        setField(term30744, term30744.getClass(), "jsType", null);
        setField(term30744, term30744.getClass(), "parent", null);
        setField(term30742, term30742.getClass(), "next", term30744);
        setIntField(term30747, term30747.getClass(), "type", 0);
        setField(term30747, term30747.getClass(), "next", null);
        setField(term30747, term30747.getClass(), "first", null);
        setField(term30747, term30747.getClass(), "last", null);
        setField(term30747, term30747.getClass(), "propListHead", null);
        setIntField(term30747, term30747.getClass(), "sourcePosition", 0);
        setField(term30747, term30747.getClass(), "jsType", null);
        setField(term30747, term30747.getClass(), "parent", null);
        setField(term30742, term30742.getClass(), "first", term30747);
        setField(term30742, term30742.getClass(), "last", term30724);
        setField(term30742, term30742.getClass(), "propListHead", null);
        setIntField(term30742, term30742.getClass(), "sourcePosition", 0);
        setField(term30742, term30742.getClass(), "jsType", null);
        setField(term30742, term30742.getClass(), "parent", null);
        setField(term30632, term30632.getClass(), "associatedNode", term30742);
        setField(term30632, term30632.getClass(), "errorReporter", null);
        setField(term30632, term30632.getClass(), "parser", null);
        setField(term30632, term30632.getClass(), "templateNode", null);
        setField(term30632, term30632.getClass(), "fileOverviewJSDocInfo", null);
        setField(term30632, term30632.getClass(), "state", null);
        setField(term30632, term30632.getClass(), "annotationNames", null);
        setField(term30632, term30632.getClass(), "suppressionNames", null);
        setField(term30632, term30632.getClass(), "fileLevelJsDocBuilder", null);
        setField(term30632, term30632.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "next", argTypes, term30632, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


