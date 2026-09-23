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

public class JsDocInfoParser_parseAndRecordTypeNode_183593997172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5012;
     Object enum159;

    public JsDocInfoParser_parseAndRecordTypeNode_183593997172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5062 = new ArrayList();
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ((ArrayList) term5062).add((Object)null);
        ArrayList term5065 = new ArrayList();
        ((ArrayList) term5065).add((Object)null);
        ((ArrayList) term5065).add((Object)null);
        ((ArrayList) term5065).add((Object)null);
        HashMap term5068 = new HashMap();
        ArrayList term5073 = new ArrayList();
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        ((ArrayList) term5073).add((Object)null);
        Class<? extends Object> term90220 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term90219 = ((Class) term90220).getDeclaredField((String) "INHERITED");
        ((Field) term90219).setAccessible(true);
        Object enum158 = ((Field) term90219).get((Object) null);
        term5012 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term5013 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term5026 = (char[]) newCharArray(2);
        int[] term5030 = (int[]) newIntArray(2);
        Object term5058 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term5059 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5060 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5061 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5077 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5085 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5087 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5092 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term5093 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term5098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term5103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5013, term5013.getClass(), "string", "SdCKLMIYnX");
        setCharElement(term5026, 0, 'P');
        setCharElement(term5026, 1, 'w');
        setField(term5013, term5013.getClass(), "stringBuffer", term5026);
        setIntField(term5013, term5013.getClass(), "stringBufferTop", 57189932);
        setIntElement(term5030, 0, 1460722225);
        setIntElement(term5030, 1, 1743224434);
        setField(term5013, term5013.getClass(), "ungetBuffer", term5030);
        setIntField(term5013, term5013.getClass(), "ungetCursor", 842904495);
        setBooleanField(term5013, term5013.getClass(), "hitEOF", true);
        setIntField(term5013, term5013.getClass(), "lineStart", 1008080511);
        setIntField(term5013, term5013.getClass(), "lineEndChar", 1935707624);
        setIntField(term5013, term5013.getClass(), "lineno", 1507074215);
        setIntField(term5013, term5013.getClass(), "charno", -282881827);
        setIntField(term5013, term5013.getClass(), "initCharno", -1183353915);
        setIntField(term5013, term5013.getClass(), "initLineno", -420030135);
        setField(term5013, term5013.getClass(), "sourceString", "OJJtVNPyKZ");
        setIntField(term5013, term5013.getClass(), "sourceEnd", 267763294);
        setIntField(term5013, term5013.getClass(), "sourceCursor", -1497710478);
        setIntField(term5013, term5013.getClass(), "cursor", 49950830);
        setIntField(term5013, term5013.getClass(), "tokenBeg", -525257914);
        setIntField(term5013, term5013.getClass(), "tokenEnd", 147209682);
        setField(term5012, term5012.getClass(), "stream", term5013);
        setField(term5061, term5061.getClass(), "root", null);
        setField(term5061, term5061.getClass(), "sourceName", null);
        setField(term5060, term5060.getClass(), "baseType", term5061);
        setField(term5060, term5060.getClass(), "extendedInterfaces", term5062);
        setField(term5060, term5060.getClass(), "implementedInterfaces", term5065);
        setField(term5060, term5060.getClass(), "parameters", term5068);
        setField(term5060, term5060.getClass(), "thrownTypes", term5073);
        setField(term5060, term5060.getClass(), "templateTypeNames", null);
        setField(term5060, term5060.getClass(), "classTemplateTypeNames", null);
        setField(term5060, term5060.getClass(), "description", null);
        setField(term5060, term5060.getClass(), "meaning", null);
        setField(term5060, term5060.getClass(), "deprecated", null);
        setField(term5060, term5060.getClass(), "license", null);
        setField(term5060, term5060.getClass(), "suppressions", null);
        setField(term5060, term5060.getClass(), "modifies", null);
        setField(term5060, term5060.getClass(), "lendsName", null);
        setBooleanField(term5060, term5060.getClass(), "ngInject", false);
        setField(term5059, term5059.getClass(), "info", term5060);
        setField(term5077, term5077.getClass(), "sourceComment", null);
        setField(term5077, term5077.getClass(), "markers", null);
        setField(term5077, term5077.getClass(), "parameters", null);
        setField(term5077, term5077.getClass(), "throwsDescriptions", null);
        setField(term5077, term5077.getClass(), "blockDescription", null);
        setField(term5077, term5077.getClass(), "fileOverview", null);
        setField(term5077, term5077.getClass(), "returnDescription", null);
        setField(term5077, term5077.getClass(), "version", null);
        setField(term5077, term5077.getClass(), "authors", null);
        setField(term5077, term5077.getClass(), "sees", null);
        setField(term5059, term5059.getClass(), "documentation", term5077);
        setIntField(term5078, term5078.getClass(), "type", 0);
        setField(term5078, term5078.getClass(), "next", null);
        setField(term5078, term5078.getClass(), "first", null);
        setField(term5078, term5078.getClass(), "last", null);
        setField(term5078, term5078.getClass(), "propListHead", null);
        setIntField(term5078, term5078.getClass(), "sourcePosition", 0);
        setField(term5078, term5078.getClass(), "jsType", null);
        setField(term5078, term5078.getClass(), "parent", null);
        setField(term5059, term5059.getClass(), "associatedNode", term5078);
        setField(term5059, term5059.getClass(), "visibility", enum158);
        setIntField(term5059, term5059.getClass(), "bitset", 515182546);
        setField(term5085, term5085.getClass(), "root", term5078);
        setField(term5085, term5085.getClass(), "sourceName", "");
        setField(term5059, term5059.getClass(), "type", term5085);
        setField(term5087, term5087.getClass(), "root", term5078);
        setField(term5087, term5087.getClass(), "sourceName", "");
        setField(term5059, term5059.getClass(), "thisType", term5087);
        setBooleanField(term5059, term5059.getClass(), "includeDocumentation", true);
        setField(term5058, term5058.getClass(), "currentInfo", term5059);
        setBooleanField(term5058, term5058.getClass(), "populated", false);
        setBooleanField(term5058, term5058.getClass(), "parseDocumentation", false);
        setField(term5093, term5093.getClass(), "item", null);
        setIntField(term5093, term5093.getClass(), "startLineno", 0);
        setIntField(term5093, term5093.getClass(), "startCharno", 0);
        setIntField(term5093, term5093.getClass(), "endLineno", 0);
        setIntField(term5093, term5093.getClass(), "endCharno", 0);
        setField(term5092, term5092.getClass(), "annotation", term5093);
        setField(term5098, term5098.getClass(), "item", null);
        setIntField(term5098, term5098.getClass(), "startLineno", 0);
        setIntField(term5098, term5098.getClass(), "startCharno", 0);
        setIntField(term5098, term5098.getClass(), "endLineno", 0);
        setIntField(term5098, term5098.getClass(), "endCharno", 0);
        setField(term5092, term5092.getClass(), "name", term5098);
        setField(term5092, term5092.getClass(), "nameNode", null);
        setField(term5092, term5092.getClass(), "description", null);
        setField(term5092, term5092.getClass(), "type", null);
        setField(term5058, term5058.getClass(), "currentMarker", term5092);
        setField(term5012, term5012.getClass(), "jsdocBuilder", term5058);
        setField(term5012, term5012.getClass(), "sourceFile", null);
        setIntField(term5103, term5103.getClass(), "type", 0);
        setField(term5103, term5103.getClass(), "next", null);
        setField(term5103, term5103.getClass(), "first", null);
        setField(term5103, term5103.getClass(), "last", null);
        setField(term5103, term5103.getClass(), "propListHead", null);
        setIntField(term5103, term5103.getClass(), "sourcePosition", 0);
        setField(term5103, term5103.getClass(), "jsType", null);
        setField(term5103, term5103.getClass(), "parent", null);
        setField(term5012, term5012.getClass(), "associatedNode", term5103);
        setField(term5012, term5012.getClass(), "errorReporter", null);
        setField(term5012, term5012.getClass(), "parser", null);
        setField(term5012, term5012.getClass(), "templateNode", null);
        setField(term5012, term5012.getClass(), "fileOverviewJSDocInfo", null);
        setField(term5012, term5012.getClass(), "state", null);
        setField(term5012, term5012.getClass(), "annotationNames", null);
        setField(term5012, term5012.getClass(), "suppressionNames", null);
        setField(term5012, term5012.getClass(), "fileLevelJsDocBuilder", null);
        setField(term5012, term5012.getClass(), "unreadToken", null);
        Class<? extends Object> term90494 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term90493 = ((Class) term90494).getDeclaredField((String) "ANNOTATION");
        ((Field) term90493).setAccessible(true);
        enum159 = ((Field) term90493).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum159;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term5012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


