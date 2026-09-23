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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_135080465361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6052;
     Object enum156;
     Object term6243;

    public JsDocInfoParser_parseAndRecordTypeNode_135080465361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6097 = new HashMap();
        HashMap term6106 = new HashMap();
        Set<Object> term291756 =  ((Map) term6106).keySet();
        HashSet term6105 = new HashSet((Collection<? extends Object>) term291756);
        HashMap term6113 = new HashMap();
        Set<Object> term291757 =  ((Map) term6113).keySet();
        HashSet term6112 = new HashSet((Collection<? extends Object>) term291757);
        HashMap term6120 = new HashMap();
        Set<Object> term291758 =  ((Map) term6120).keySet();
        HashSet term6119 = new HashSet((Collection<? extends Object>) term291758);
        HashMap term6126 = new HashMap();
        HashMap term6131 = new HashMap();
        Class<? extends Object> term291780 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term291779 = ((Class) term291780).getDeclaredField((String) "PROTECTED");
        ((Field) term291779).setAccessible(true);
        Object enum154 = ((Field) term291779).get((Object) null);
        Class<? extends Object> term292064 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term292063 = ((Class) term292064).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term292063).setAccessible(true);
        Object enum155 = ((Field) term292063).get((Object) null);
        HashMap term6222 = new HashMap();
        term6052 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term6053 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term6066 = (char[]) newCharArray(1);
        int[] term6069 = (int[]) newIntArray(0);
        Object term6095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6096 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term6152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6166 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6167 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6168 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6173 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6174 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6178 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term6179 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6184 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term6197 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term6198 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6233 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term6053, term6053.getClass(), "string", "gUvcueTURF");
        setCharElement(term6066, 0, 'q');
        setField(term6053, term6053.getClass(), "stringBuffer", term6066);
        setIntField(term6053, term6053.getClass(), "stringBufferTop", -375014958);
        setField(term6053, term6053.getClass(), "ungetBuffer", term6069);
        setIntField(term6053, term6053.getClass(), "ungetCursor", 1107176718);
        setBooleanField(term6053, term6053.getClass(), "hitEOF", true);
        setIntField(term6053, term6053.getClass(), "lineStart", 480137250);
        setIntField(term6053, term6053.getClass(), "lineEndChar", -341152642);
        setIntField(term6053, term6053.getClass(), "lineno", -2015854073);
        setIntField(term6053, term6053.getClass(), "charno", 538259104);
        setIntField(term6053, term6053.getClass(), "initCharno", 96566506);
        setIntField(term6053, term6053.getClass(), "initLineno", -343325701);
        setField(term6053, term6053.getClass(), "sourceString", "EwQBhZjCIT");
        setIntField(term6053, term6053.getClass(), "sourceEnd", 107945604);
        setIntField(term6053, term6053.getClass(), "sourceCursor", -1963464809);
        setIntField(term6053, term6053.getClass(), "cursor", 71190297);
        setIntField(term6053, term6053.getClass(), "tokenBeg", 1202361360);
        setIntField(term6053, term6053.getClass(), "tokenEnd", -2015048153);
        setField(term6052, term6052.getClass(), "stream", term6053);
        setField(term6095, term6095.getClass(), "reporter", null);
        setField(term6095, term6095.getClass(), "nativeTypes", term6096);
        setField(term6095, term6095.getClass(), "namesToTypes", term6097);
        setField(term6095, term6095.getClass(), "namespaces", term6105);
        setField(term6095, term6095.getClass(), "enumTypeNames", term6112);
        setField(term6095, term6095.getClass(), "forwardDeclaredTypes", term6119);
        setField(term6095, term6095.getClass(), "typesIndexedByProperty", term6126);
        setField(term6095, term6095.getClass(), "greatestSubtypeByProperty", term6131);
        setField(term6095, term6095.getClass(), "interfaceToImplementors", null);
        setField(term6095, term6095.getClass(), "unresolvedNamedTypes", null);
        setField(term6095, term6095.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6095, term6095.getClass(), "lastGeneration", false);
        setField(term6095, term6095.getClass(), "templateTypeName", "WBAOTqErtm");
        setField(term6152, term6152.getClass(), "name", "PqtVXXZMqK");
        setField(term6152, term6152.getClass(), "referencedType", null);
        setBooleanField(term6152, term6152.getClass(), "visited", false);
        setField(term6167, term6167.getClass(), "baseType", null);
        setField(term6167, term6167.getClass(), "implementedInterfaces", null);
        setField(term6167, term6167.getClass(), "parameters", null);
        setField(term6167, term6167.getClass(), "thrownTypes", null);
        setField(term6167, term6167.getClass(), "templateTypeName", null);
        setField(term6167, term6167.getClass(), "description", null);
        setField(term6167, term6167.getClass(), "deprecated", null);
        setField(term6167, term6167.getClass(), "license", null);
        setField(term6167, term6167.getClass(), "suppressions", null);
        setField(term6166, term6166.getClass(), "info", term6167);
        setField(term6168, term6168.getClass(), "markers", null);
        setField(term6168, term6168.getClass(), "parameters", null);
        setField(term6168, term6168.getClass(), "throwsDescriptions", null);
        setField(term6168, term6168.getClass(), "blockDescription", null);
        setField(term6168, term6168.getClass(), "fileOverview", null);
        setField(term6168, term6168.getClass(), "returnDescription", null);
        setField(term6168, term6168.getClass(), "version", null);
        setField(term6168, term6168.getClass(), "authors", null);
        setField(term6168, term6168.getClass(), "sees", null);
        setField(term6166, term6166.getClass(), "documentation", term6168);
        setField(term6166, term6166.getClass(), "sourceName", "");
        setField(term6166, term6166.getClass(), "visibility", enum154);
        setIntField(term6166, term6166.getClass(), "bitset", -2063457669);
        setField(term6173, term6173.getClass(), "root", null);
        setField(term6173, term6173.getClass(), "sourceName", null);
        setField(term6173, term6173.getClass(), "registry", null);
        setField(term6166, term6166.getClass(), "type", term6173);
        setField(term6174, term6174.getClass(), "root", null);
        setField(term6174, term6174.getClass(), "sourceName", null);
        setField(term6174, term6174.getClass(), "registry", null);
        setField(term6166, term6166.getClass(), "thisType", term6174);
        setBooleanField(term6166, term6166.getClass(), "includeDocumentation", true);
        setField(term6152, term6152.getClass(), "docInfo", term6166);
        setBooleanField(term6152, term6152.getClass(), "unknown", false);
        setBooleanField(term6152, term6152.getClass(), "resolved", true);
        setField(term6152, term6152.getClass(), "resolveResult", null);
        setField(term6152, term6152.getClass(), "registry", null);
        setField(term6095, term6095.getClass(), "templateType", term6152);
        setField(term6052, term6052.getClass(), "typeRegistry", term6095);
        setField(term6179, term6179.getClass(), "info", null);
        setField(term6179, term6179.getClass(), "documentation", null);
        setField(term6179, term6179.getClass(), "sourceName", null);
        setField(term6179, term6179.getClass(), "visibility", null);
        setIntField(term6179, term6179.getClass(), "bitset", 0);
        setField(term6179, term6179.getClass(), "type", null);
        setField(term6179, term6179.getClass(), "thisType", null);
        setBooleanField(term6179, term6179.getClass(), "includeDocumentation", false);
        setField(term6178, term6178.getClass(), "currentInfo", term6179);
        setBooleanField(term6178, term6178.getClass(), "populated", false);
        setBooleanField(term6178, term6178.getClass(), "parseDocumentation", false);
        setField(term6184, term6184.getClass(), "annotation", null);
        setField(term6184, term6184.getClass(), "name", null);
        setField(term6184, term6184.getClass(), "description", null);
        setField(term6184, term6184.getClass(), "type", null);
        setField(term6178, term6178.getClass(), "currentMarker", term6184);
        setField(term6052, term6052.getClass(), "jsdocBuilder", term6178);
        setField(term6052, term6052.getClass(), "sourceName", "sNQFlATEeQ");
        setField(term6052, term6052.getClass(), "errorReporter", null);
        setField(term6197, term6197.getClass(), "this$0", null);
        setField(term6052, term6052.getClass(), "parser", term6197);
        setField(term6198, term6198.getClass(), "info", null);
        setField(term6198, term6198.getClass(), "documentation", null);
        setField(term6198, term6198.getClass(), "sourceName", null);
        setField(term6198, term6198.getClass(), "visibility", null);
        setIntField(term6198, term6198.getClass(), "bitset", 0);
        setField(term6198, term6198.getClass(), "type", null);
        setField(term6198, term6198.getClass(), "thisType", null);
        setBooleanField(term6198, term6198.getClass(), "includeDocumentation", false);
        setField(term6052, term6052.getClass(), "fileOverviewJSDocInfo", term6198);
        setField(term6052, term6052.getClass(), "state", enum155);
        setField(term6052, term6052.getClass(), "annotationNames", term6222);
        setField(term6233, term6233.getClass(), "this$0", null);
        setField(term6052, term6052.getClass(), "fileLevelJsDocBuilder", term6233);
        setField(term6052, term6052.getClass(), "unreadToken", null);
        Class<? extends Object> term292412 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term292411 = ((Class) term292412).getDeclaredField((String) "COLON");
        ((Field) term292411).setAccessible(true);
        enum156 = ((Field) term292411).get((Object) null);
        term6243 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = enum156;
        args[1] = term6243;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term6052, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


