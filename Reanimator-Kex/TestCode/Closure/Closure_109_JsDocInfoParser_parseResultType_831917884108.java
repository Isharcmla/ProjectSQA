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

public class JsDocInfoParser_parseResultType_831917884108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23090;
     Object enum233;

    public JsDocInfoParser_parseResultType_831917884108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23153 = new ArrayList();
        ArrayList term23156 = new ArrayList();
        ((ArrayList) term23156).add((Object)null);
        ((ArrayList) term23156).add((Object)null);
        HashMap term23159 = new HashMap();
        ArrayList term23164 = new ArrayList();
        ((ArrayList) term23164).add((Object)null);
        HashSet term23167 = new HashSet();
        HashSet term23172 = new HashSet();
        HashSet term23173 = new HashSet();
        ArrayList term23182 = new ArrayList();
        ((ArrayList) term23182).add((Object)null);
        ((ArrayList) term23182).add((Object)null);
        ((ArrayList) term23182).add((Object)null);
        ((ArrayList) term23182).add((Object)null);
        ((ArrayList) term23182).add((Object)null);
        ((ArrayList) term23182).add((Object)null);
        HashMap term23185 = new HashMap();
        Class<? extends Object> term154194 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term154193 = ((Class) term154194).getDeclaredField((String) "PUBLIC");
        ((Field) term154193).setAccessible(true);
        Object enum232 = ((Field) term154193).get((Object) null);
        term23090 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23091 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23104 = (char[]) newCharArray(9);
        int[] term23115 = (int[]) newIntArray(8);
        Object term23149 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term23150 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term23151 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term23152 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23180 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term23190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23206 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23207 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term23213 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23218 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23091, term23091.getClass(), "string", "BrWqhEIUUj");
        setCharElement(term23104, 0, 'F');
        setCharElement(term23104, 1, 'Z');
        setCharElement(term23104, 2, 'i');
        setCharElement(term23104, 3, 'a');
        setCharElement(term23104, 4, 'G');
        setCharElement(term23104, 5, 'I');
        setCharElement(term23104, 6, 'b');
        setCharElement(term23104, 7, 'n');
        setCharElement(term23104, 8, 'z');
        setField(term23091, term23091.getClass(), "stringBuffer", term23104);
        setIntField(term23091, term23091.getClass(), "stringBufferTop", 1175146356);
        setIntElement(term23115, 0, -2137419728);
        setIntElement(term23115, 1, 1558810715);
        setIntElement(term23115, 2, -382652403);
        setIntElement(term23115, 3, -2126539433);
        setIntElement(term23115, 4, 196952878);
        setIntElement(term23115, 5, 802673242);
        setIntElement(term23115, 6, -1808638031);
        setIntElement(term23115, 7, -1514240086);
        setField(term23091, term23091.getClass(), "ungetBuffer", term23115);
        setIntField(term23091, term23091.getClass(), "ungetCursor", 2052244839);
        setBooleanField(term23091, term23091.getClass(), "hitEOF", false);
        setIntField(term23091, term23091.getClass(), "lineStart", -1763480506);
        setIntField(term23091, term23091.getClass(), "lineEndChar", -1541297110);
        setIntField(term23091, term23091.getClass(), "lineno", -1581464804);
        setIntField(term23091, term23091.getClass(), "charno", -1954937310);
        setIntField(term23091, term23091.getClass(), "initCharno", -460657407);
        setIntField(term23091, term23091.getClass(), "initLineno", 941003590);
        setField(term23091, term23091.getClass(), "sourceString", "WfUmxdiHcU");
        setIntField(term23091, term23091.getClass(), "sourceEnd", -1825624890);
        setIntField(term23091, term23091.getClass(), "sourceCursor", 413214164);
        setIntField(term23091, term23091.getClass(), "cursor", 355911655);
        setIntField(term23091, term23091.getClass(), "tokenBeg", 1811833766);
        setIntField(term23091, term23091.getClass(), "tokenEnd", 735987104);
        setField(term23090, term23090.getClass(), "stream", term23091);
        setField(term23152, term23152.getClass(), "root", null);
        setField(term23152, term23152.getClass(), "sourceName", null);
        setField(term23151, term23151.getClass(), "baseType", term23152);
        setField(term23151, term23151.getClass(), "extendedInterfaces", term23153);
        setField(term23151, term23151.getClass(), "implementedInterfaces", term23156);
        setField(term23151, term23151.getClass(), "parameters", term23159);
        setField(term23151, term23151.getClass(), "thrownTypes", term23164);
        setField(term23151, term23151.getClass(), "templateTypeNames", null);
        setField(term23151, term23151.getClass(), "disposedParameters", term23167);
        setField(term23151, term23151.getClass(), "description", "");
        setField(term23151, term23151.getClass(), "meaning", "");
        setField(term23151, term23151.getClass(), "deprecated", "");
        setField(term23151, term23151.getClass(), "license", "");
        setField(term23151, term23151.getClass(), "suppressions", term23172);
        setField(term23151, term23151.getClass(), "modifies", term23173);
        setField(term23151, term23151.getClass(), "lendsName", "");
        setBooleanField(term23151, term23151.getClass(), "ngInject", true);
        setBooleanField(term23151, term23151.getClass(), "wizaction", true);
        setBooleanField(term23151, term23151.getClass(), "jaggerInject", false);
        setBooleanField(term23151, term23151.getClass(), "jaggerProvide", false);
        setBooleanField(term23151, term23151.getClass(), "jaggerModule", true);
        setField(term23150, term23150.getClass(), "info", term23151);
        setField(term23180, term23180.getClass(), "sourceComment", "");
        setField(term23180, term23180.getClass(), "markers", term23182);
        setField(term23180, term23180.getClass(), "parameters", term23185);
        setField(term23180, term23180.getClass(), "throwsDescriptions", null);
        setField(term23180, term23180.getClass(), "blockDescription", null);
        setField(term23180, term23180.getClass(), "fileOverview", null);
        setField(term23180, term23180.getClass(), "returnDescription", null);
        setField(term23180, term23180.getClass(), "version", null);
        setField(term23180, term23180.getClass(), "authors", null);
        setField(term23180, term23180.getClass(), "sees", null);
        setField(term23150, term23150.getClass(), "documentation", term23180);
        setIntField(term23190, term23190.getClass(), "type", -1007935918);
        setIntField(term23192, term23192.getClass(), "type", 0);
        setField(term23192, term23192.getClass(), "next", null);
        setField(term23192, term23192.getClass(), "first", null);
        setField(term23192, term23192.getClass(), "last", null);
        setField(term23192, term23192.getClass(), "propListHead", null);
        setIntField(term23192, term23192.getClass(), "sourcePosition", 0);
        setField(term23192, term23192.getClass(), "jsType", null);
        setField(term23192, term23192.getClass(), "parent", null);
        setField(term23190, term23190.getClass(), "next", term23192);
        setIntField(term23195, term23195.getClass(), "type", 0);
        setField(term23195, term23195.getClass(), "next", null);
        setField(term23195, term23195.getClass(), "first", null);
        setField(term23195, term23195.getClass(), "last", null);
        setField(term23195, term23195.getClass(), "propListHead", null);
        setIntField(term23195, term23195.getClass(), "sourcePosition", 0);
        setField(term23195, term23195.getClass(), "jsType", null);
        setField(term23195, term23195.getClass(), "parent", null);
        setField(term23190, term23190.getClass(), "first", term23195);
        setIntField(term23198, term23198.getClass(), "type", 0);
        setField(term23198, term23198.getClass(), "next", null);
        setField(term23198, term23198.getClass(), "first", null);
        setField(term23198, term23198.getClass(), "last", null);
        setField(term23198, term23198.getClass(), "propListHead", null);
        setIntField(term23198, term23198.getClass(), "sourcePosition", 0);
        setField(term23198, term23198.getClass(), "jsType", null);
        setField(term23198, term23198.getClass(), "parent", null);
        setField(term23190, term23190.getClass(), "last", term23198);
        setField(term23190, term23190.getClass(), "propListHead", null);
        setIntField(term23190, term23190.getClass(), "sourcePosition", 0);
        setField(term23190, term23190.getClass(), "jsType", null);
        setField(term23190, term23190.getClass(), "parent", null);
        setField(term23150, term23150.getClass(), "associatedNode", term23190);
        setField(term23150, term23150.getClass(), "visibility", enum232);
        setIntField(term23150, term23150.getClass(), "bitset", 1485731037);
        setField(term23206, term23206.getClass(), "root", null);
        setField(term23206, term23206.getClass(), "sourceName", null);
        setField(term23150, term23150.getClass(), "type", term23206);
        setField(term23207, term23207.getClass(), "root", null);
        setField(term23207, term23207.getClass(), "sourceName", null);
        setField(term23150, term23150.getClass(), "thisType", term23207);
        setBooleanField(term23150, term23150.getClass(), "includeDocumentation", true);
        setIntField(term23150, term23150.getClass(), "originalCommentPosition", 1304396087);
        setField(term23149, term23149.getClass(), "currentInfo", term23150);
        setBooleanField(term23149, term23149.getClass(), "populated", false);
        setBooleanField(term23149, term23149.getClass(), "parseDocumentation", true);
        setField(term23213, term23213.getClass(), "item", null);
        setIntField(term23213, term23213.getClass(), "startLineno", 0);
        setIntField(term23213, term23213.getClass(), "startCharno", 0);
        setIntField(term23213, term23213.getClass(), "endLineno", 0);
        setIntField(term23213, term23213.getClass(), "endCharno", 0);
        setField(term23212, term23212.getClass(), "annotation", term23213);
        setField(term23218, term23218.getClass(), "item", null);
        setIntField(term23218, term23218.getClass(), "startLineno", 0);
        setIntField(term23218, term23218.getClass(), "startCharno", 0);
        setIntField(term23218, term23218.getClass(), "endLineno", 0);
        setIntField(term23218, term23218.getClass(), "endCharno", 0);
        setField(term23212, term23212.getClass(), "name", term23218);
        setField(term23212, term23212.getClass(), "nameNode", null);
        setField(term23212, term23212.getClass(), "description", null);
        setField(term23212, term23212.getClass(), "type", null);
        setField(term23149, term23149.getClass(), "currentMarker", term23212);
        setField(term23090, term23090.getClass(), "jsdocBuilder", term23149);
        setField(term23090, term23090.getClass(), "sourceFile", null);
        setIntField(term23223, term23223.getClass(), "type", 0);
        setField(term23223, term23223.getClass(), "next", null);
        setField(term23223, term23223.getClass(), "first", null);
        setField(term23223, term23223.getClass(), "last", null);
        setField(term23223, term23223.getClass(), "propListHead", null);
        setIntField(term23223, term23223.getClass(), "sourcePosition", 0);
        setField(term23223, term23223.getClass(), "jsType", null);
        setField(term23223, term23223.getClass(), "parent", null);
        setField(term23090, term23090.getClass(), "associatedNode", term23223);
        setField(term23090, term23090.getClass(), "errorReporter", null);
        setField(term23090, term23090.getClass(), "parser", null);
        setField(term23090, term23090.getClass(), "templateNode", null);
        setField(term23090, term23090.getClass(), "fileOverviewJSDocInfo", null);
        setField(term23090, term23090.getClass(), "state", null);
        setField(term23090, term23090.getClass(), "annotationNames", null);
        setField(term23090, term23090.getClass(), "suppressionNames", null);
        setField(term23090, term23090.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23090, term23090.getClass(), "unreadToken", null);
        Class<? extends Object> term154459 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term154458 = ((Class) term154459).getDeclaredField((String) "LP");
        ((Field) term154458).setAccessible(true);
        enum233 = ((Field) term154458).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum233;
        try {
            callMethod(klass, "parseResultType", argTypes, term23090, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


