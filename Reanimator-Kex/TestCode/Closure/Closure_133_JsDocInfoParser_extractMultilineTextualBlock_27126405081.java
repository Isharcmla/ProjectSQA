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

public class JsDocInfoParser_extractMultilineTextualBlock_27126405081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10484;
     Object enum175;
     Object enum176;

    public JsDocInfoParser_extractMultilineTextualBlock_27126405081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10535 = new ArrayList();
        ((ArrayList) term10535).add((Object)null);
        ((ArrayList) term10535).add((Object)null);
        ((ArrayList) term10535).add((Object)null);
        ((ArrayList) term10535).add((Object)null);
        ((ArrayList) term10535).add((Object)null);
        ArrayList term10538 = new ArrayList();
        ((ArrayList) term10538).add((Object)null);
        HashMap term10541 = new HashMap();
        ArrayList term10546 = new ArrayList();
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        ((ArrayList) term10546).add((Object)null);
        Class<? extends Object> term97277 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term97276 = ((Class) term97277).getDeclaredField((String) "INHERITED");
        ((Field) term97276).setAccessible(true);
        Object enum174 = ((Field) term97276).get((Object) null);
        term10484 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term10485 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term10498 = (char[]) newCharArray(3);
        int[] term10503 = (int[]) newIntArray(2);
        Object term10531 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term10532 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10533 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10534 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10550 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10567 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10572 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term10581 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term10586 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term10485, term10485.getClass(), "string", "rYbtIDVdnd");
        setCharElement(term10498, 0, 'Y');
        setCharElement(term10498, 1, 'S');
        setCharElement(term10498, 2, 'R');
        setField(term10485, term10485.getClass(), "stringBuffer", term10498);
        setIntField(term10485, term10485.getClass(), "stringBufferTop", -688213483);
        setIntElement(term10503, 0, 644154104);
        setIntElement(term10503, 1, 76650923);
        setField(term10485, term10485.getClass(), "ungetBuffer", term10503);
        setIntField(term10485, term10485.getClass(), "ungetCursor", 1003743923);
        setBooleanField(term10485, term10485.getClass(), "hitEOF", false);
        setIntField(term10485, term10485.getClass(), "lineStart", 1887772522);
        setIntField(term10485, term10485.getClass(), "lineEndChar", 354196060);
        setIntField(term10485, term10485.getClass(), "lineno", -1840305774);
        setIntField(term10485, term10485.getClass(), "charno", 1365087144);
        setIntField(term10485, term10485.getClass(), "initCharno", -1537255112);
        setIntField(term10485, term10485.getClass(), "initLineno", 934477462);
        setField(term10485, term10485.getClass(), "sourceString", "UKAReurpHG");
        setIntField(term10485, term10485.getClass(), "sourceEnd", 4900410);
        setIntField(term10485, term10485.getClass(), "sourceCursor", -1252345779);
        setIntField(term10485, term10485.getClass(), "cursor", -2063365430);
        setIntField(term10485, term10485.getClass(), "tokenBeg", 812570053);
        setIntField(term10485, term10485.getClass(), "tokenEnd", -1488938905);
        setField(term10484, term10484.getClass(), "stream", term10485);
        setField(term10534, term10534.getClass(), "root", null);
        setField(term10534, term10534.getClass(), "sourceName", null);
        setField(term10533, term10533.getClass(), "baseType", term10534);
        setField(term10533, term10533.getClass(), "extendedInterfaces", term10535);
        setField(term10533, term10533.getClass(), "implementedInterfaces", term10538);
        setField(term10533, term10533.getClass(), "parameters", term10541);
        setField(term10533, term10533.getClass(), "thrownTypes", term10546);
        setField(term10533, term10533.getClass(), "templateTypeNames", null);
        setField(term10533, term10533.getClass(), "classTemplateTypeNames", null);
        setField(term10533, term10533.getClass(), "description", null);
        setField(term10533, term10533.getClass(), "meaning", null);
        setField(term10533, term10533.getClass(), "deprecated", null);
        setField(term10533, term10533.getClass(), "license", null);
        setField(term10533, term10533.getClass(), "suppressions", null);
        setField(term10533, term10533.getClass(), "modifies", null);
        setField(term10533, term10533.getClass(), "lendsName", null);
        setBooleanField(term10533, term10533.getClass(), "ngInject", false);
        setField(term10532, term10532.getClass(), "info", term10533);
        setField(term10550, term10550.getClass(), "sourceComment", null);
        setField(term10550, term10550.getClass(), "markers", null);
        setField(term10550, term10550.getClass(), "parameters", null);
        setField(term10550, term10550.getClass(), "throwsDescriptions", null);
        setField(term10550, term10550.getClass(), "blockDescription", null);
        setField(term10550, term10550.getClass(), "fileOverview", null);
        setField(term10550, term10550.getClass(), "returnDescription", null);
        setField(term10550, term10550.getClass(), "version", null);
        setField(term10550, term10550.getClass(), "authors", null);
        setField(term10550, term10550.getClass(), "sees", null);
        setField(term10532, term10532.getClass(), "documentation", term10550);
        setIntField(term10551, term10551.getClass(), "type", -726681073);
        setIntField(term10553, term10553.getClass(), "type", 0);
        setField(term10553, term10553.getClass(), "next", null);
        setField(term10553, term10553.getClass(), "first", null);
        setField(term10553, term10553.getClass(), "last", null);
        setField(term10553, term10553.getClass(), "propListHead", null);
        setIntField(term10553, term10553.getClass(), "sourcePosition", 0);
        setField(term10553, term10553.getClass(), "jsType", null);
        setField(term10553, term10553.getClass(), "parent", null);
        setField(term10551, term10551.getClass(), "next", term10553);
        setIntField(term10556, term10556.getClass(), "type", 0);
        setField(term10556, term10556.getClass(), "next", null);
        setField(term10556, term10556.getClass(), "first", null);
        setField(term10556, term10556.getClass(), "last", null);
        setField(term10556, term10556.getClass(), "propListHead", null);
        setIntField(term10556, term10556.getClass(), "sourcePosition", 0);
        setField(term10556, term10556.getClass(), "jsType", null);
        setField(term10556, term10556.getClass(), "parent", null);
        setField(term10551, term10551.getClass(), "first", term10556);
        setIntField(term10559, term10559.getClass(), "type", 0);
        setField(term10559, term10559.getClass(), "next", null);
        setField(term10559, term10559.getClass(), "first", null);
        setField(term10559, term10559.getClass(), "last", null);
        setField(term10559, term10559.getClass(), "propListHead", null);
        setIntField(term10559, term10559.getClass(), "sourcePosition", 0);
        setField(term10559, term10559.getClass(), "jsType", null);
        setField(term10559, term10559.getClass(), "parent", null);
        setField(term10551, term10551.getClass(), "last", term10559);
        setField(term10551, term10551.getClass(), "propListHead", null);
        setIntField(term10551, term10551.getClass(), "sourcePosition", 0);
        setField(term10551, term10551.getClass(), "jsType", null);
        setField(term10551, term10551.getClass(), "parent", null);
        setField(term10532, term10532.getClass(), "associatedNode", term10551);
        setField(term10532, term10532.getClass(), "visibility", enum174);
        setIntField(term10532, term10532.getClass(), "bitset", -1724487863);
        setIntField(term10568, term10568.getClass(), "type", -1133405894);
        setField(term10568, term10568.getClass(), "next", null);
        setField(term10568, term10568.getClass(), "first", null);
        setField(term10568, term10568.getClass(), "last", term10553);
        setField(term10568, term10568.getClass(), "propListHead", null);
        setIntField(term10568, term10568.getClass(), "sourcePosition", 0);
        setField(term10568, term10568.getClass(), "jsType", null);
        setField(term10568, term10568.getClass(), "parent", null);
        setField(term10567, term10567.getClass(), "root", term10568);
        setField(term10567, term10567.getClass(), "sourceName", "");
        setField(term10532, term10532.getClass(), "type", term10567);
        setIntField(term10573, term10573.getClass(), "type", 0);
        setField(term10573, term10573.getClass(), "next", null);
        setField(term10573, term10573.getClass(), "first", null);
        setField(term10573, term10573.getClass(), "last", null);
        setField(term10573, term10573.getClass(), "propListHead", null);
        setIntField(term10573, term10573.getClass(), "sourcePosition", 0);
        setField(term10573, term10573.getClass(), "jsType", null);
        setField(term10573, term10573.getClass(), "parent", null);
        setField(term10572, term10572.getClass(), "root", term10573);
        setField(term10572, term10572.getClass(), "sourceName", "");
        setField(term10532, term10532.getClass(), "thisType", term10572);
        setBooleanField(term10532, term10532.getClass(), "includeDocumentation", false);
        setField(term10531, term10531.getClass(), "currentInfo", term10532);
        setBooleanField(term10531, term10531.getClass(), "populated", true);
        setBooleanField(term10531, term10531.getClass(), "parseDocumentation", false);
        setField(term10581, term10581.getClass(), "item", null);
        setIntField(term10581, term10581.getClass(), "startLineno", 0);
        setIntField(term10581, term10581.getClass(), "startCharno", 0);
        setIntField(term10581, term10581.getClass(), "endLineno", 0);
        setIntField(term10581, term10581.getClass(), "endCharno", 0);
        setField(term10580, term10580.getClass(), "annotation", term10581);
        setField(term10586, term10586.getClass(), "item", null);
        setIntField(term10586, term10586.getClass(), "startLineno", 0);
        setIntField(term10586, term10586.getClass(), "startCharno", 0);
        setIntField(term10586, term10586.getClass(), "endLineno", 0);
        setIntField(term10586, term10586.getClass(), "endCharno", 0);
        setField(term10580, term10580.getClass(), "name", term10586);
        setField(term10580, term10580.getClass(), "nameNode", null);
        setField(term10580, term10580.getClass(), "description", null);
        setField(term10580, term10580.getClass(), "type", null);
        setField(term10531, term10531.getClass(), "currentMarker", term10580);
        setField(term10484, term10484.getClass(), "jsdocBuilder", term10531);
        setField(term10484, term10484.getClass(), "sourceFile", null);
        setField(term10484, term10484.getClass(), "associatedNode", term10556);
        setField(term10484, term10484.getClass(), "errorReporter", null);
        setField(term10484, term10484.getClass(), "parser", null);
        setField(term10484, term10484.getClass(), "templateNode", null);
        setField(term10484, term10484.getClass(), "fileOverviewJSDocInfo", null);
        setField(term10484, term10484.getClass(), "state", null);
        setField(term10484, term10484.getClass(), "annotationNames", null);
        setField(term10484, term10484.getClass(), "suppressionNames", null);
        setField(term10484, term10484.getClass(), "fileLevelJsDocBuilder", null);
        setField(term10484, term10484.getClass(), "unreadToken", null);
        Class<? extends Object> term97551 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term97550 = ((Class) term97551).getDeclaredField((String) "LP");
        ((Field) term97550).setAccessible(true);
        enum175 = ((Field) term97550).get((Object) null);
        Class<? extends Object> term97799 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Field term97798 = ((Class) term97799).getDeclaredField((String) "TRIM");
        ((Field) term97798).setAccessible(true);
        enum176 = ((Field) term97798).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Object[] args = new Object[2];
        args[0] = enum175;
        args[1] = enum176;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term10484, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


