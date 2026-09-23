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

public class JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14363;
     Object enum185;

    public JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14411 = new ArrayList();
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ((ArrayList) term14411).add((Object)null);
        ArrayList term14414 = new ArrayList();
        ((ArrayList) term14414).add((Object)null);
        ((ArrayList) term14414).add((Object)null);
        ((ArrayList) term14414).add((Object)null);
        ((ArrayList) term14414).add((Object)null);
        ((ArrayList) term14414).add((Object)null);
        HashMap term14417 = new HashMap();
        ArrayList term14422 = new ArrayList();
        ((ArrayList) term14422).add((Object)null);
        HashSet term14430 = new HashSet();
        HashSet term14431 = new HashSet();
        ArrayList term14435 = new ArrayList();
        ((ArrayList) term14435).add((Object)null);
        HashMap term14438 = new HashMap();
        Class<? extends Object> term91737 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term91736 = ((Class) term91737).getDeclaredField((String) "PRIVATE");
        ((Field) term91736).setAccessible(true);
        Object enum184 = ((Field) term91736).get((Object) null);
        term14363 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term14364 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term14377 = (char[]) newCharArray(2);
        int[] term14381 = (int[]) newIntArray(0);
        Object term14407 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term14408 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14409 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14410 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14433 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14450 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14455 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14463 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term14464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term14469 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term14364, term14364.getClass(), "string", "TGiJfagfky");
        setCharElement(term14377, 0, 'z');
        setCharElement(term14377, 1, 'Y');
        setField(term14364, term14364.getClass(), "stringBuffer", term14377);
        setIntField(term14364, term14364.getClass(), "stringBufferTop", 2068435279);
        setField(term14364, term14364.getClass(), "ungetBuffer", term14381);
        setIntField(term14364, term14364.getClass(), "ungetCursor", -1556527718);
        setBooleanField(term14364, term14364.getClass(), "hitEOF", false);
        setIntField(term14364, term14364.getClass(), "lineStart", 895255351);
        setIntField(term14364, term14364.getClass(), "lineEndChar", -1317044799);
        setIntField(term14364, term14364.getClass(), "lineno", -1428063820);
        setIntField(term14364, term14364.getClass(), "charno", -1271375703);
        setIntField(term14364, term14364.getClass(), "initCharno", 1136208236);
        setIntField(term14364, term14364.getClass(), "initLineno", -1220630391);
        setField(term14364, term14364.getClass(), "sourceString", "BJklinBmhN");
        setIntField(term14364, term14364.getClass(), "sourceEnd", -995822131);
        setIntField(term14364, term14364.getClass(), "sourceCursor", -687282231);
        setIntField(term14364, term14364.getClass(), "cursor", 1200440315);
        setIntField(term14364, term14364.getClass(), "tokenBeg", 40571662);
        setIntField(term14364, term14364.getClass(), "tokenEnd", 1863910269);
        setField(term14363, term14363.getClass(), "stream", term14364);
        setField(term14410, term14410.getClass(), "root", null);
        setField(term14410, term14410.getClass(), "sourceName", null);
        setField(term14409, term14409.getClass(), "baseType", term14410);
        setField(term14409, term14409.getClass(), "extendedInterfaces", term14411);
        setField(term14409, term14409.getClass(), "implementedInterfaces", term14414);
        setField(term14409, term14409.getClass(), "parameters", term14417);
        setField(term14409, term14409.getClass(), "thrownTypes", term14422);
        setField(term14409, term14409.getClass(), "templateTypeName", "");
        setField(term14409, term14409.getClass(), "description", "");
        setField(term14409, term14409.getClass(), "meaning", "");
        setField(term14409, term14409.getClass(), "deprecated", "");
        setField(term14409, term14409.getClass(), "license", "");
        setField(term14409, term14409.getClass(), "suppressions", term14430);
        setField(term14409, term14409.getClass(), "modifies", term14431);
        setField(term14409, term14409.getClass(), "lendsName", "");
        setField(term14408, term14408.getClass(), "info", term14409);
        setField(term14433, term14433.getClass(), "sourceComment", "");
        setField(term14433, term14433.getClass(), "markers", term14435);
        setField(term14433, term14433.getClass(), "parameters", term14438);
        setField(term14433, term14433.getClass(), "throwsDescriptions", null);
        setField(term14433, term14433.getClass(), "blockDescription", null);
        setField(term14433, term14433.getClass(), "fileOverview", null);
        setField(term14433, term14433.getClass(), "returnDescription", null);
        setField(term14433, term14433.getClass(), "version", null);
        setField(term14433, term14433.getClass(), "authors", null);
        setField(term14433, term14433.getClass(), "sees", null);
        setField(term14408, term14408.getClass(), "documentation", term14433);
        setIntField(term14443, term14443.getClass(), "type", 0);
        setField(term14443, term14443.getClass(), "next", null);
        setField(term14443, term14443.getClass(), "first", null);
        setField(term14443, term14443.getClass(), "last", null);
        setField(term14443, term14443.getClass(), "propListHead", null);
        setIntField(term14443, term14443.getClass(), "sourcePosition", 0);
        setField(term14443, term14443.getClass(), "jsType", null);
        setField(term14443, term14443.getClass(), "parent", null);
        setField(term14408, term14408.getClass(), "associatedNode", term14443);
        setField(term14408, term14408.getClass(), "visibility", enum184);
        setIntField(term14408, term14408.getClass(), "bitset", 1973060703);
        setIntField(term14451, term14451.getClass(), "type", 0);
        setField(term14451, term14451.getClass(), "next", null);
        setField(term14451, term14451.getClass(), "first", null);
        setField(term14451, term14451.getClass(), "last", null);
        setField(term14451, term14451.getClass(), "propListHead", null);
        setIntField(term14451, term14451.getClass(), "sourcePosition", 0);
        setField(term14451, term14451.getClass(), "jsType", null);
        setField(term14451, term14451.getClass(), "parent", null);
        setField(term14450, term14450.getClass(), "root", term14451);
        setField(term14450, term14450.getClass(), "sourceName", "");
        setField(term14408, term14408.getClass(), "type", term14450);
        setIntField(term14456, term14456.getClass(), "type", 0);
        setField(term14456, term14456.getClass(), "next", null);
        setField(term14456, term14456.getClass(), "first", null);
        setField(term14456, term14456.getClass(), "last", null);
        setField(term14456, term14456.getClass(), "propListHead", null);
        setIntField(term14456, term14456.getClass(), "sourcePosition", 0);
        setField(term14456, term14456.getClass(), "jsType", null);
        setField(term14456, term14456.getClass(), "parent", null);
        setField(term14455, term14455.getClass(), "root", term14456);
        setField(term14455, term14455.getClass(), "sourceName", "");
        setField(term14408, term14408.getClass(), "thisType", term14455);
        setBooleanField(term14408, term14408.getClass(), "includeDocumentation", true);
        setField(term14407, term14407.getClass(), "currentInfo", term14408);
        setBooleanField(term14407, term14407.getClass(), "populated", false);
        setBooleanField(term14407, term14407.getClass(), "parseDocumentation", false);
        setField(term14464, term14464.getClass(), "item", null);
        setIntField(term14464, term14464.getClass(), "startLineno", 0);
        setIntField(term14464, term14464.getClass(), "startCharno", 0);
        setIntField(term14464, term14464.getClass(), "endLineno", 0);
        setIntField(term14464, term14464.getClass(), "endCharno", 0);
        setField(term14463, term14463.getClass(), "annotation", term14464);
        setField(term14469, term14469.getClass(), "item", null);
        setIntField(term14469, term14469.getClass(), "startLineno", 0);
        setIntField(term14469, term14469.getClass(), "startCharno", 0);
        setIntField(term14469, term14469.getClass(), "endLineno", 0);
        setIntField(term14469, term14469.getClass(), "endCharno", 0);
        setField(term14463, term14463.getClass(), "name", term14469);
        setField(term14463, term14463.getClass(), "nameNode", null);
        setField(term14463, term14463.getClass(), "description", null);
        setField(term14463, term14463.getClass(), "type", null);
        setField(term14407, term14407.getClass(), "currentMarker", term14463);
        setField(term14363, term14363.getClass(), "jsdocBuilder", term14407);
        setField(term14363, term14363.getClass(), "sourceFile", null);
        setField(term14363, term14363.getClass(), "associatedNode", term14451);
        setField(term14363, term14363.getClass(), "errorReporter", null);
        setField(term14363, term14363.getClass(), "parser", null);
        setField(term14363, term14363.getClass(), "templateNode", null);
        setField(term14363, term14363.getClass(), "fileOverviewJSDocInfo", null);
        setField(term14363, term14363.getClass(), "state", null);
        setField(term14363, term14363.getClass(), "annotationNames", null);
        setField(term14363, term14363.getClass(), "suppressionNames", null);
        setField(term14363, term14363.getClass(), "fileLevelJsDocBuilder", null);
        setField(term14363, term14363.getClass(), "unreadToken", null);
        Class<? extends Object> term92005 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term92004 = ((Class) term92005).getDeclaredField((String) "EOL");
        ((Field) term92004).setAccessible(true);
        enum185 = ((Field) term92004).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum185;
        try {
            callMethod(klass, "parseParamTypeExpressionAnnotation", argTypes, term14363, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


