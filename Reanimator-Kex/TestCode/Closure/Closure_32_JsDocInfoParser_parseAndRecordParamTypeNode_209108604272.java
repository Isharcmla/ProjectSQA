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
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseAndRecordParamTypeNode_209108604272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7893;
     Object enum165;

    public JsDocInfoParser_parseAndRecordParamTypeNode_209108604272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7946 = new ArrayList();
        ArrayList term7949 = new ArrayList();
        ((ArrayList) term7949).add((Object)null);
        HashMap term7952 = new HashMap();
        ArrayList term7957 = new ArrayList();
        ((ArrayList) term7957).add((Object)null);
        ((ArrayList) term7957).add((Object)null);
        ((ArrayList) term7957).add((Object)null);
        ((ArrayList) term7957).add((Object)null);
        ((ArrayList) term7957).add((Object)null);
        HashSet term7965 = new HashSet();
        HashSet term7966 = new HashSet();
        ArrayList term7970 = new ArrayList();
        ((ArrayList) term7970).add((Object)null);
        ((ArrayList) term7970).add((Object)null);
        ((ArrayList) term7970).add((Object)null);
        ((ArrayList) term7970).add((Object)null);
        ((ArrayList) term7970).add((Object)null);
        ((ArrayList) term7970).add((Object)null);
        HashMap term7973 = new HashMap();
        Class<? extends Object> term83979 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term83978 = ((Class) term83979).getDeclaredField((String) "INHERITED");
        ((Field) term83978).setAccessible(true);
        Object enum164 = ((Field) term83978).get((Object) null);
        term7893 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term7894 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term7907 = (char[]) newCharArray(2);
        int[] term7911 = (int[]) newIntArray(5);
        Object term7942 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term7943 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7944 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7945 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7968 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7985 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7986 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7994 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term7995 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term8000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term8005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7894, term7894.getClass(), "string", "orEuhCStGM");
        setCharElement(term7907, 0, 'E');
        setCharElement(term7907, 1, 'G');
        setField(term7894, term7894.getClass(), "stringBuffer", term7907);
        setIntField(term7894, term7894.getClass(), "stringBufferTop", 579006268);
        setIntElement(term7911, 0, -1694747156);
        setIntElement(term7911, 1, 1466373988);
        setIntElement(term7911, 2, -358526505);
        setIntElement(term7911, 3, 1843268026);
        setIntElement(term7911, 4, 954660603);
        setField(term7894, term7894.getClass(), "ungetBuffer", term7911);
        setIntField(term7894, term7894.getClass(), "ungetCursor", -1351605385);
        setBooleanField(term7894, term7894.getClass(), "hitEOF", true);
        setIntField(term7894, term7894.getClass(), "lineStart", 278355793);
        setIntField(term7894, term7894.getClass(), "lineEndChar", -310648604);
        setIntField(term7894, term7894.getClass(), "lineno", -648200466);
        setIntField(term7894, term7894.getClass(), "charno", 2007134147);
        setIntField(term7894, term7894.getClass(), "initCharno", 993388358);
        setIntField(term7894, term7894.getClass(), "initLineno", -765191335);
        setField(term7894, term7894.getClass(), "sourceString", "HhEaSXWvrY");
        setIntField(term7894, term7894.getClass(), "sourceEnd", -1697741155);
        setIntField(term7894, term7894.getClass(), "sourceCursor", 1295839803);
        setIntField(term7894, term7894.getClass(), "cursor", -1891015523);
        setIntField(term7894, term7894.getClass(), "tokenBeg", -1560631747);
        setIntField(term7894, term7894.getClass(), "tokenEnd", 1215150180);
        setField(term7893, term7893.getClass(), "stream", term7894);
        setField(term7945, term7945.getClass(), "root", null);
        setField(term7945, term7945.getClass(), "sourceName", null);
        setField(term7944, term7944.getClass(), "baseType", term7945);
        setField(term7944, term7944.getClass(), "extendedInterfaces", term7946);
        setField(term7944, term7944.getClass(), "implementedInterfaces", term7949);
        setField(term7944, term7944.getClass(), "parameters", term7952);
        setField(term7944, term7944.getClass(), "thrownTypes", term7957);
        setField(term7944, term7944.getClass(), "templateTypeName", "");
        setField(term7944, term7944.getClass(), "description", "");
        setField(term7944, term7944.getClass(), "meaning", "");
        setField(term7944, term7944.getClass(), "deprecated", "");
        setField(term7944, term7944.getClass(), "license", "");
        setField(term7944, term7944.getClass(), "suppressions", term7965);
        setField(term7944, term7944.getClass(), "modifies", term7966);
        setField(term7944, term7944.getClass(), "lendsName", "");
        setField(term7943, term7943.getClass(), "info", term7944);
        setField(term7968, term7968.getClass(), "sourceComment", "");
        setField(term7968, term7968.getClass(), "markers", term7970);
        setField(term7968, term7968.getClass(), "parameters", term7973);
        setField(term7968, term7968.getClass(), "throwsDescriptions", null);
        setField(term7968, term7968.getClass(), "blockDescription", null);
        setField(term7968, term7968.getClass(), "fileOverview", null);
        setField(term7968, term7968.getClass(), "returnDescription", null);
        setField(term7968, term7968.getClass(), "version", null);
        setField(term7968, term7968.getClass(), "authors", null);
        setField(term7968, term7968.getClass(), "sees", null);
        setField(term7943, term7943.getClass(), "documentation", term7968);
        setIntField(term7978, term7978.getClass(), "type", 0);
        setField(term7978, term7978.getClass(), "next", null);
        setField(term7978, term7978.getClass(), "first", null);
        setField(term7978, term7978.getClass(), "last", null);
        setField(term7978, term7978.getClass(), "propListHead", null);
        setIntField(term7978, term7978.getClass(), "sourcePosition", 0);
        setField(term7978, term7978.getClass(), "jsType", null);
        setField(term7978, term7978.getClass(), "parent", null);
        setField(term7943, term7943.getClass(), "associatedNode", term7978);
        setField(term7943, term7943.getClass(), "visibility", enum164);
        setIntField(term7943, term7943.getClass(), "bitset", -2070466617);
        setField(term7985, term7985.getClass(), "root", null);
        setField(term7985, term7985.getClass(), "sourceName", null);
        setField(term7943, term7943.getClass(), "type", term7985);
        setIntField(term7987, term7987.getClass(), "type", 0);
        setField(term7987, term7987.getClass(), "next", null);
        setField(term7987, term7987.getClass(), "first", null);
        setField(term7987, term7987.getClass(), "last", null);
        setField(term7987, term7987.getClass(), "propListHead", null);
        setIntField(term7987, term7987.getClass(), "sourcePosition", 0);
        setField(term7987, term7987.getClass(), "jsType", null);
        setField(term7987, term7987.getClass(), "parent", null);
        setField(term7986, term7986.getClass(), "root", term7987);
        setField(term7986, term7986.getClass(), "sourceName", "");
        setField(term7943, term7943.getClass(), "thisType", term7986);
        setBooleanField(term7943, term7943.getClass(), "includeDocumentation", false);
        setField(term7942, term7942.getClass(), "currentInfo", term7943);
        setBooleanField(term7942, term7942.getClass(), "populated", true);
        setBooleanField(term7942, term7942.getClass(), "parseDocumentation", false);
        setField(term7995, term7995.getClass(), "item", null);
        setIntField(term7995, term7995.getClass(), "startLineno", 0);
        setIntField(term7995, term7995.getClass(), "startCharno", 0);
        setIntField(term7995, term7995.getClass(), "endLineno", 0);
        setIntField(term7995, term7995.getClass(), "endCharno", 0);
        setField(term7994, term7994.getClass(), "annotation", term7995);
        setField(term8000, term8000.getClass(), "item", null);
        setIntField(term8000, term8000.getClass(), "startLineno", 0);
        setIntField(term8000, term8000.getClass(), "startCharno", 0);
        setIntField(term8000, term8000.getClass(), "endLineno", 0);
        setIntField(term8000, term8000.getClass(), "endCharno", 0);
        setField(term7994, term7994.getClass(), "name", term8000);
        setField(term7994, term7994.getClass(), "nameNode", null);
        setField(term7994, term7994.getClass(), "description", null);
        setField(term7994, term7994.getClass(), "type", null);
        setField(term7942, term7942.getClass(), "currentMarker", term7994);
        setField(term7893, term7893.getClass(), "jsdocBuilder", term7942);
        setField(term7893, term7893.getClass(), "sourceFile", null);
        setIntField(term8005, term8005.getClass(), "type", 1741500243);
        setField(term8005, term8005.getClass(), "next", term7978);
        setIntField(term8007, term8007.getClass(), "type", 0);
        setField(term8007, term8007.getClass(), "next", null);
        setField(term8007, term8007.getClass(), "first", null);
        setField(term8007, term8007.getClass(), "last", null);
        setField(term8007, term8007.getClass(), "propListHead", null);
        setIntField(term8007, term8007.getClass(), "sourcePosition", 0);
        setField(term8007, term8007.getClass(), "jsType", null);
        setField(term8007, term8007.getClass(), "parent", null);
        setField(term8005, term8005.getClass(), "first", term8007);
        setIntField(term8010, term8010.getClass(), "type", 0);
        setField(term8010, term8010.getClass(), "next", null);
        setField(term8010, term8010.getClass(), "first", null);
        setField(term8010, term8010.getClass(), "last", null);
        setField(term8010, term8010.getClass(), "propListHead", null);
        setIntField(term8010, term8010.getClass(), "sourcePosition", 0);
        setField(term8010, term8010.getClass(), "jsType", null);
        setField(term8010, term8010.getClass(), "parent", null);
        setField(term8005, term8005.getClass(), "last", term8010);
        setField(term8005, term8005.getClass(), "propListHead", null);
        setIntField(term8005, term8005.getClass(), "sourcePosition", 0);
        setField(term8005, term8005.getClass(), "jsType", null);
        setField(term8005, term8005.getClass(), "parent", null);
        setField(term7893, term7893.getClass(), "associatedNode", term8005);
        setField(term7893, term7893.getClass(), "errorReporter", null);
        setField(term7893, term7893.getClass(), "parser", null);
        setField(term7893, term7893.getClass(), "templateNode", null);
        setField(term7893, term7893.getClass(), "fileOverviewJSDocInfo", null);
        setField(term7893, term7893.getClass(), "state", null);
        setField(term7893, term7893.getClass(), "annotationNames", null);
        setField(term7893, term7893.getClass(), "suppressionNames", null);
        setField(term7893, term7893.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7893, term7893.getClass(), "unreadToken", null);
        Class<? extends Object> term84253 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term84252 = ((Class) term84253).getDeclaredField((String) "STAR");
        ((Field) term84252).setAccessible(true);
        enum165 = ((Field) term84252).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum165;
        try {
            callMethod(klass, "parseAndRecordParamTypeNode", argTypes, term7893, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


