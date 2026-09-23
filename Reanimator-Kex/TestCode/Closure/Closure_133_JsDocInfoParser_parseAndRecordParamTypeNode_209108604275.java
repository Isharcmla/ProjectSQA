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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_parseAndRecordParamTypeNode_209108604275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7016;
     Object enum165;

    public JsDocInfoParser_parseAndRecordParamTypeNode_209108604275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7065 = new ArrayList();
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        ((ArrayList) term7065).add((Object)null);
        ArrayList term7068 = new ArrayList();
        ((ArrayList) term7068).add((Object)null);
        ((ArrayList) term7068).add((Object)null);
        ((ArrayList) term7068).add((Object)null);
        HashMap term7071 = new HashMap();
        ArrayList term7076 = new ArrayList();
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        ((ArrayList) term7076).add((Object)null);
        Class<? extends Object> term92985 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term92984 = ((Class) term92985).getDeclaredField((String) "PRIVATE");
        ((Field) term92984).setAccessible(true);
        Object enum164 = ((Field) term92984).get((Object) null);
        term7016 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term7017 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term7030 = (char[]) newCharArray(2);
        int[] term7034 = (int[]) newIntArray(1);
        Object term7061 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term7062 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7064 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7080 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7088 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7093 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7101 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term7102 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term7107 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term7017, term7017.getClass(), "string", "OYbzXylRWW");
        setCharElement(term7030, 0, 'm');
        setCharElement(term7030, 1, 'a');
        setField(term7017, term7017.getClass(), "stringBuffer", term7030);
        setIntField(term7017, term7017.getClass(), "stringBufferTop", -1694747156);
        setIntElement(term7034, 0, 1466373988);
        setField(term7017, term7017.getClass(), "ungetBuffer", term7034);
        setIntField(term7017, term7017.getClass(), "ungetCursor", -358526505);
        setBooleanField(term7017, term7017.getClass(), "hitEOF", false);
        setIntField(term7017, term7017.getClass(), "lineStart", 1843268026);
        setIntField(term7017, term7017.getClass(), "lineEndChar", 954660603);
        setIntField(term7017, term7017.getClass(), "lineno", -1351605385);
        setIntField(term7017, term7017.getClass(), "charno", 278355793);
        setIntField(term7017, term7017.getClass(), "initCharno", -310648604);
        setIntField(term7017, term7017.getClass(), "initLineno", -648200466);
        setField(term7017, term7017.getClass(), "sourceString", "DSNsTGYXDF");
        setIntField(term7017, term7017.getClass(), "sourceEnd", 2007134147);
        setIntField(term7017, term7017.getClass(), "sourceCursor", 993388358);
        setIntField(term7017, term7017.getClass(), "cursor", -765191335);
        setIntField(term7017, term7017.getClass(), "tokenBeg", -1697741155);
        setIntField(term7017, term7017.getClass(), "tokenEnd", 1295839803);
        setField(term7016, term7016.getClass(), "stream", term7017);
        setField(term7064, term7064.getClass(), "root", null);
        setField(term7064, term7064.getClass(), "sourceName", null);
        setField(term7063, term7063.getClass(), "baseType", term7064);
        setField(term7063, term7063.getClass(), "extendedInterfaces", term7065);
        setField(term7063, term7063.getClass(), "implementedInterfaces", term7068);
        setField(term7063, term7063.getClass(), "parameters", term7071);
        setField(term7063, term7063.getClass(), "thrownTypes", term7076);
        setField(term7063, term7063.getClass(), "templateTypeNames", null);
        setField(term7063, term7063.getClass(), "classTemplateTypeNames", null);
        setField(term7063, term7063.getClass(), "description", null);
        setField(term7063, term7063.getClass(), "meaning", null);
        setField(term7063, term7063.getClass(), "deprecated", null);
        setField(term7063, term7063.getClass(), "license", null);
        setField(term7063, term7063.getClass(), "suppressions", null);
        setField(term7063, term7063.getClass(), "modifies", null);
        setField(term7063, term7063.getClass(), "lendsName", null);
        setBooleanField(term7063, term7063.getClass(), "ngInject", false);
        setField(term7062, term7062.getClass(), "info", term7063);
        setField(term7080, term7080.getClass(), "sourceComment", null);
        setField(term7080, term7080.getClass(), "markers", null);
        setField(term7080, term7080.getClass(), "parameters", null);
        setField(term7080, term7080.getClass(), "throwsDescriptions", null);
        setField(term7080, term7080.getClass(), "blockDescription", null);
        setField(term7080, term7080.getClass(), "fileOverview", null);
        setField(term7080, term7080.getClass(), "returnDescription", null);
        setField(term7080, term7080.getClass(), "version", null);
        setField(term7080, term7080.getClass(), "authors", null);
        setField(term7080, term7080.getClass(), "sees", null);
        setField(term7062, term7062.getClass(), "documentation", term7080);
        setIntField(term7081, term7081.getClass(), "type", 0);
        setField(term7081, term7081.getClass(), "next", null);
        setField(term7081, term7081.getClass(), "first", null);
        setField(term7081, term7081.getClass(), "last", null);
        setField(term7081, term7081.getClass(), "propListHead", null);
        setIntField(term7081, term7081.getClass(), "sourcePosition", 0);
        setField(term7081, term7081.getClass(), "jsType", null);
        setField(term7081, term7081.getClass(), "parent", null);
        setField(term7062, term7062.getClass(), "associatedNode", term7081);
        setField(term7062, term7062.getClass(), "visibility", enum164);
        setIntField(term7062, term7062.getClass(), "bitset", 68922753);
        setIntField(term7089, term7089.getClass(), "type", 0);
        setField(term7089, term7089.getClass(), "next", null);
        setField(term7089, term7089.getClass(), "first", null);
        setField(term7089, term7089.getClass(), "last", null);
        setField(term7089, term7089.getClass(), "propListHead", null);
        setIntField(term7089, term7089.getClass(), "sourcePosition", 0);
        setField(term7089, term7089.getClass(), "jsType", null);
        setField(term7089, term7089.getClass(), "parent", null);
        setField(term7088, term7088.getClass(), "root", term7089);
        setField(term7088, term7088.getClass(), "sourceName", "");
        setField(term7062, term7062.getClass(), "type", term7088);
        setIntField(term7094, term7094.getClass(), "type", 1215150180);
        setField(term7094, term7094.getClass(), "next", null);
        setField(term7094, term7094.getClass(), "first", null);
        setField(term7094, term7094.getClass(), "last", null);
        setField(term7094, term7094.getClass(), "propListHead", null);
        setIntField(term7094, term7094.getClass(), "sourcePosition", 0);
        setField(term7094, term7094.getClass(), "jsType", null);
        setField(term7094, term7094.getClass(), "parent", null);
        setField(term7093, term7093.getClass(), "root", term7094);
        setField(term7093, term7093.getClass(), "sourceName", "");
        setField(term7062, term7062.getClass(), "thisType", term7093);
        setBooleanField(term7062, term7062.getClass(), "includeDocumentation", true);
        setField(term7061, term7061.getClass(), "currentInfo", term7062);
        setBooleanField(term7061, term7061.getClass(), "populated", false);
        setBooleanField(term7061, term7061.getClass(), "parseDocumentation", true);
        setField(term7102, term7102.getClass(), "item", null);
        setIntField(term7102, term7102.getClass(), "startLineno", 0);
        setIntField(term7102, term7102.getClass(), "startCharno", 0);
        setIntField(term7102, term7102.getClass(), "endLineno", 0);
        setIntField(term7102, term7102.getClass(), "endCharno", 0);
        setField(term7101, term7101.getClass(), "annotation", term7102);
        setField(term7107, term7107.getClass(), "item", null);
        setIntField(term7107, term7107.getClass(), "startLineno", 0);
        setIntField(term7107, term7107.getClass(), "startCharno", 0);
        setIntField(term7107, term7107.getClass(), "endLineno", 0);
        setIntField(term7107, term7107.getClass(), "endCharno", 0);
        setField(term7101, term7101.getClass(), "name", term7107);
        setField(term7101, term7101.getClass(), "nameNode", null);
        setField(term7101, term7101.getClass(), "description", null);
        setField(term7101, term7101.getClass(), "type", null);
        setField(term7061, term7061.getClass(), "currentMarker", term7101);
        setField(term7016, term7016.getClass(), "jsdocBuilder", term7061);
        setField(term7016, term7016.getClass(), "sourceFile", null);
        setField(term7016, term7016.getClass(), "associatedNode", term7094);
        setField(term7016, term7016.getClass(), "errorReporter", null);
        setField(term7016, term7016.getClass(), "parser", null);
        setField(term7016, term7016.getClass(), "templateNode", null);
        setField(term7016, term7016.getClass(), "fileOverviewJSDocInfo", null);
        setField(term7016, term7016.getClass(), "state", null);
        setField(term7016, term7016.getClass(), "annotationNames", null);
        setField(term7016, term7016.getClass(), "suppressionNames", null);
        setField(term7016, term7016.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7016, term7016.getClass(), "unreadToken", null);
        Class<? extends Object> term93253 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term93252 = ((Class) term93253).getDeclaredField((String) "RP");
        ((Field) term93252).setAccessible(true);
        enum165 = ((Field) term93252).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum165;
        try {
            callMethod(klass, "parseAndRecordParamTypeNode", argTypes, term7016, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


