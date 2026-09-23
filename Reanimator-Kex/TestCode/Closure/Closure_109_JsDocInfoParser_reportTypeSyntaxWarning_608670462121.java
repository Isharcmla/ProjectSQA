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

public class JsDocInfoParser_reportTypeSyntaxWarning_608670462121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30857;

    public JsDocInfoParser_reportTypeSyntaxWarning_608670462121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30903 = new ArrayList();
        ((ArrayList) term30903).add((Object)null);
        ((ArrayList) term30903).add((Object)null);
        ((ArrayList) term30903).add((Object)null);
        ((ArrayList) term30903).add((Object)null);
        ArrayList term30906 = new ArrayList();
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        HashMap term30909 = new HashMap();
        ArrayList term30914 = new ArrayList();
        ((ArrayList) term30914).add((Object)null);
        ((ArrayList) term30914).add((Object)null);
        ((ArrayList) term30914).add((Object)null);
        HashSet term30917 = new HashSet();
        HashSet term30922 = new HashSet();
        HashSet term30923 = new HashSet();
        ArrayList term30932 = new ArrayList();
        ((ArrayList) term30932).add((Object)null);
        ((ArrayList) term30932).add((Object)null);
        ((ArrayList) term30932).add((Object)null);
        ((ArrayList) term30932).add((Object)null);
        ((ArrayList) term30932).add((Object)null);
        ((ArrayList) term30932).add((Object)null);
        HashMap term30935 = new HashMap();
        Class<? extends Object> term160464 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term160463 = ((Class) term160464).getDeclaredField((String) "PRIVATE");
        ((Field) term160463).setAccessible(true);
        Object enum253 = ((Field) term160463).get((Object) null);
        term30857 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term30858 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term30871 = (char[]) newCharArray(0);
        int[] term30873 = (int[]) newIntArray(0);
        Object term30899 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term30900 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term30901 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term30902 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30930 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term30940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30947 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30952 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term30953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30961 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term30962 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term30967 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term30858, term30858.getClass(), "string", "ZWJgSttNjg");
        setField(term30858, term30858.getClass(), "stringBuffer", term30871);
        setIntField(term30858, term30858.getClass(), "stringBufferTop", -91240911);
        setField(term30858, term30858.getClass(), "ungetBuffer", term30873);
        setIntField(term30858, term30858.getClass(), "ungetCursor", -321227954);
        setBooleanField(term30858, term30858.getClass(), "hitEOF", true);
        setIntField(term30858, term30858.getClass(), "lineStart", 373810833);
        setIntField(term30858, term30858.getClass(), "lineEndChar", -215979293);
        setIntField(term30858, term30858.getClass(), "lineno", -19567889);
        setIntField(term30858, term30858.getClass(), "charno", 693500318);
        setIntField(term30858, term30858.getClass(), "initCharno", 1702404702);
        setIntField(term30858, term30858.getClass(), "initLineno", 1141592999);
        setField(term30858, term30858.getClass(), "sourceString", "LQTIjJLkXH");
        setIntField(term30858, term30858.getClass(), "sourceEnd", 848113442);
        setIntField(term30858, term30858.getClass(), "sourceCursor", 793974213);
        setIntField(term30858, term30858.getClass(), "cursor", 722546287);
        setIntField(term30858, term30858.getClass(), "tokenBeg", -2060284160);
        setIntField(term30858, term30858.getClass(), "tokenEnd", -568450686);
        setField(term30857, term30857.getClass(), "stream", term30858);
        setField(term30902, term30902.getClass(), "root", null);
        setField(term30902, term30902.getClass(), "sourceName", null);
        setField(term30901, term30901.getClass(), "baseType", term30902);
        setField(term30901, term30901.getClass(), "extendedInterfaces", term30903);
        setField(term30901, term30901.getClass(), "implementedInterfaces", term30906);
        setField(term30901, term30901.getClass(), "parameters", term30909);
        setField(term30901, term30901.getClass(), "thrownTypes", term30914);
        setField(term30901, term30901.getClass(), "templateTypeNames", null);
        setField(term30901, term30901.getClass(), "disposedParameters", term30917);
        setField(term30901, term30901.getClass(), "description", "");
        setField(term30901, term30901.getClass(), "meaning", "");
        setField(term30901, term30901.getClass(), "deprecated", "");
        setField(term30901, term30901.getClass(), "license", "");
        setField(term30901, term30901.getClass(), "suppressions", term30922);
        setField(term30901, term30901.getClass(), "modifies", term30923);
        setField(term30901, term30901.getClass(), "lendsName", "");
        setBooleanField(term30901, term30901.getClass(), "ngInject", true);
        setBooleanField(term30901, term30901.getClass(), "wizaction", true);
        setBooleanField(term30901, term30901.getClass(), "jaggerInject", true);
        setBooleanField(term30901, term30901.getClass(), "jaggerProvide", false);
        setBooleanField(term30901, term30901.getClass(), "jaggerModule", false);
        setField(term30900, term30900.getClass(), "info", term30901);
        setField(term30930, term30930.getClass(), "sourceComment", "");
        setField(term30930, term30930.getClass(), "markers", term30932);
        setField(term30930, term30930.getClass(), "parameters", term30935);
        setField(term30930, term30930.getClass(), "throwsDescriptions", null);
        setField(term30930, term30930.getClass(), "blockDescription", null);
        setField(term30930, term30930.getClass(), "fileOverview", null);
        setField(term30930, term30930.getClass(), "returnDescription", null);
        setField(term30930, term30930.getClass(), "version", null);
        setField(term30930, term30930.getClass(), "authors", null);
        setField(term30930, term30930.getClass(), "sees", null);
        setField(term30900, term30900.getClass(), "documentation", term30930);
        setIntField(term30940, term30940.getClass(), "type", 0);
        setField(term30940, term30940.getClass(), "next", null);
        setField(term30940, term30940.getClass(), "first", null);
        setField(term30940, term30940.getClass(), "last", null);
        setField(term30940, term30940.getClass(), "propListHead", null);
        setIntField(term30940, term30940.getClass(), "sourcePosition", 0);
        setField(term30940, term30940.getClass(), "jsType", null);
        setField(term30940, term30940.getClass(), "parent", null);
        setField(term30900, term30900.getClass(), "associatedNode", term30940);
        setField(term30900, term30900.getClass(), "visibility", enum253);
        setIntField(term30900, term30900.getClass(), "bitset", 241533020);
        setIntField(term30948, term30948.getClass(), "type", 0);
        setField(term30948, term30948.getClass(), "next", null);
        setField(term30948, term30948.getClass(), "first", null);
        setField(term30948, term30948.getClass(), "last", null);
        setField(term30948, term30948.getClass(), "propListHead", null);
        setIntField(term30948, term30948.getClass(), "sourcePosition", 0);
        setField(term30948, term30948.getClass(), "jsType", null);
        setField(term30948, term30948.getClass(), "parent", null);
        setField(term30947, term30947.getClass(), "root", term30948);
        setField(term30947, term30947.getClass(), "sourceName", "");
        setField(term30900, term30900.getClass(), "type", term30947);
        setIntField(term30953, term30953.getClass(), "type", 318982923);
        setField(term30953, term30953.getClass(), "next", null);
        setField(term30953, term30953.getClass(), "first", null);
        setField(term30953, term30953.getClass(), "last", null);
        setField(term30953, term30953.getClass(), "propListHead", null);
        setIntField(term30953, term30953.getClass(), "sourcePosition", 0);
        setField(term30953, term30953.getClass(), "jsType", null);
        setField(term30953, term30953.getClass(), "parent", null);
        setField(term30952, term30952.getClass(), "root", term30953);
        setField(term30952, term30952.getClass(), "sourceName", "");
        setField(term30900, term30900.getClass(), "thisType", term30952);
        setBooleanField(term30900, term30900.getClass(), "includeDocumentation", false);
        setIntField(term30900, term30900.getClass(), "originalCommentPosition", 2081679151);
        setField(term30899, term30899.getClass(), "currentInfo", term30900);
        setBooleanField(term30899, term30899.getClass(), "populated", true);
        setBooleanField(term30899, term30899.getClass(), "parseDocumentation", true);
        setField(term30962, term30962.getClass(), "item", null);
        setIntField(term30962, term30962.getClass(), "startLineno", 0);
        setIntField(term30962, term30962.getClass(), "startCharno", 0);
        setIntField(term30962, term30962.getClass(), "endLineno", 0);
        setIntField(term30962, term30962.getClass(), "endCharno", 0);
        setField(term30961, term30961.getClass(), "annotation", term30962);
        setField(term30967, term30967.getClass(), "item", null);
        setIntField(term30967, term30967.getClass(), "startLineno", 0);
        setIntField(term30967, term30967.getClass(), "startCharno", 0);
        setIntField(term30967, term30967.getClass(), "endLineno", 0);
        setIntField(term30967, term30967.getClass(), "endCharno", 0);
        setField(term30961, term30961.getClass(), "name", term30967);
        setField(term30961, term30961.getClass(), "nameNode", null);
        setField(term30961, term30961.getClass(), "description", null);
        setField(term30961, term30961.getClass(), "type", null);
        setField(term30899, term30899.getClass(), "currentMarker", term30961);
        setField(term30857, term30857.getClass(), "jsdocBuilder", term30899);
        setField(term30857, term30857.getClass(), "sourceFile", null);
        setField(term30857, term30857.getClass(), "associatedNode", term30953);
        setField(term30857, term30857.getClass(), "errorReporter", null);
        setField(term30857, term30857.getClass(), "parser", null);
        setField(term30857, term30857.getClass(), "templateNode", null);
        setField(term30857, term30857.getClass(), "fileOverviewJSDocInfo", null);
        setField(term30857, term30857.getClass(), "state", null);
        setField(term30857, term30857.getClass(), "annotationNames", null);
        setField(term30857, term30857.getClass(), "suppressionNames", null);
        setField(term30857, term30857.getClass(), "fileLevelJsDocBuilder", null);
        setField(term30857, term30857.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxrRUnjshF";
        try {
            callMethod(klass, "reportTypeSyntaxWarning", argTypes, term30857, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


