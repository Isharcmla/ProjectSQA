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

public class JsDocInfoParser_parseArrayType_749923982111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25161;
     Object enum239;

    public JsDocInfoParser_parseArrayType_749923982111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25220 = new ArrayList();
        ((ArrayList) term25220).add((Object)null);
        ((ArrayList) term25220).add((Object)null);
        ((ArrayList) term25220).add((Object)null);
        ((ArrayList) term25220).add((Object)null);
        ((ArrayList) term25220).add((Object)null);
        ((ArrayList) term25220).add((Object)null);
        ArrayList term25223 = new ArrayList();
        ((ArrayList) term25223).add((Object)null);
        ((ArrayList) term25223).add((Object)null);
        ((ArrayList) term25223).add((Object)null);
        ((ArrayList) term25223).add((Object)null);
        ((ArrayList) term25223).add((Object)null);
        ((ArrayList) term25223).add((Object)null);
        HashMap term25226 = new HashMap();
        ArrayList term25231 = new ArrayList();
        ((ArrayList) term25231).add((Object)null);
        ((ArrayList) term25231).add((Object)null);
        ((ArrayList) term25231).add((Object)null);
        ((ArrayList) term25231).add((Object)null);
        ((ArrayList) term25231).add((Object)null);
        HashSet term25234 = new HashSet();
        HashSet term25239 = new HashSet();
        HashSet term25240 = new HashSet();
        ArrayList term25249 = new ArrayList();
        HashMap term25252 = new HashMap();
        Class<? extends Object> term155948 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term155947 = ((Class) term155948).getDeclaredField((String) "INHERITED");
        ((Field) term155947).setAccessible(true);
        Object enum238 = ((Field) term155947).get((Object) null);
        term25161 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term25162 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term25175 = (char[]) newCharArray(8);
        int[] term25185 = (int[]) newIntArray(5);
        Object term25216 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term25217 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term25218 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term25219 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term25247 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term25257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25264 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term25265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25269 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term25270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25278 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term25279 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term25284 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term25289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25162, term25162.getClass(), "string", "wiYGATEfmw");
        setCharElement(term25175, 0, 's');
        setCharElement(term25175, 1, 't');
        setCharElement(term25175, 2, 'b');
        setCharElement(term25175, 3, 'c');
        setCharElement(term25175, 4, 'd');
        setCharElement(term25175, 5, 'z');
        setCharElement(term25175, 6, 'j');
        setCharElement(term25175, 7, 'I');
        setField(term25162, term25162.getClass(), "stringBuffer", term25175);
        setIntField(term25162, term25162.getClass(), "stringBufferTop", -1270258033);
        setIntElement(term25185, 0, 1677994069);
        setIntElement(term25185, 1, -439999692);
        setIntElement(term25185, 2, 924095007);
        setIntElement(term25185, 3, 1302110708);
        setIntElement(term25185, 4, 594705497);
        setField(term25162, term25162.getClass(), "ungetBuffer", term25185);
        setIntField(term25162, term25162.getClass(), "ungetCursor", -600102466);
        setBooleanField(term25162, term25162.getClass(), "hitEOF", true);
        setIntField(term25162, term25162.getClass(), "lineStart", -899986714);
        setIntField(term25162, term25162.getClass(), "lineEndChar", 1307244466);
        setIntField(term25162, term25162.getClass(), "lineno", -252262096);
        setIntField(term25162, term25162.getClass(), "charno", -37129068);
        setIntField(term25162, term25162.getClass(), "initCharno", -861014847);
        setIntField(term25162, term25162.getClass(), "initLineno", 2132934139);
        setField(term25162, term25162.getClass(), "sourceString", "FiALSqneIg");
        setIntField(term25162, term25162.getClass(), "sourceEnd", -1261824381);
        setIntField(term25162, term25162.getClass(), "sourceCursor", 1594426218);
        setIntField(term25162, term25162.getClass(), "cursor", -2060535464);
        setIntField(term25162, term25162.getClass(), "tokenBeg", -1242946317);
        setIntField(term25162, term25162.getClass(), "tokenEnd", -1541566235);
        setField(term25161, term25161.getClass(), "stream", term25162);
        setField(term25219, term25219.getClass(), "root", null);
        setField(term25219, term25219.getClass(), "sourceName", null);
        setField(term25218, term25218.getClass(), "baseType", term25219);
        setField(term25218, term25218.getClass(), "extendedInterfaces", term25220);
        setField(term25218, term25218.getClass(), "implementedInterfaces", term25223);
        setField(term25218, term25218.getClass(), "parameters", term25226);
        setField(term25218, term25218.getClass(), "thrownTypes", term25231);
        setField(term25218, term25218.getClass(), "templateTypeNames", null);
        setField(term25218, term25218.getClass(), "disposedParameters", term25234);
        setField(term25218, term25218.getClass(), "description", "");
        setField(term25218, term25218.getClass(), "meaning", "");
        setField(term25218, term25218.getClass(), "deprecated", "");
        setField(term25218, term25218.getClass(), "license", "");
        setField(term25218, term25218.getClass(), "suppressions", term25239);
        setField(term25218, term25218.getClass(), "modifies", term25240);
        setField(term25218, term25218.getClass(), "lendsName", "");
        setBooleanField(term25218, term25218.getClass(), "ngInject", true);
        setBooleanField(term25218, term25218.getClass(), "wizaction", false);
        setBooleanField(term25218, term25218.getClass(), "jaggerInject", true);
        setBooleanField(term25218, term25218.getClass(), "jaggerProvide", false);
        setBooleanField(term25218, term25218.getClass(), "jaggerModule", true);
        setField(term25217, term25217.getClass(), "info", term25218);
        setField(term25247, term25247.getClass(), "sourceComment", "");
        setField(term25247, term25247.getClass(), "markers", term25249);
        setField(term25247, term25247.getClass(), "parameters", term25252);
        setField(term25247, term25247.getClass(), "throwsDescriptions", null);
        setField(term25247, term25247.getClass(), "blockDescription", null);
        setField(term25247, term25247.getClass(), "fileOverview", null);
        setField(term25247, term25247.getClass(), "returnDescription", null);
        setField(term25247, term25247.getClass(), "version", null);
        setField(term25247, term25247.getClass(), "authors", null);
        setField(term25247, term25247.getClass(), "sees", null);
        setField(term25217, term25217.getClass(), "documentation", term25247);
        setIntField(term25257, term25257.getClass(), "type", 0);
        setField(term25257, term25257.getClass(), "next", null);
        setField(term25257, term25257.getClass(), "first", null);
        setField(term25257, term25257.getClass(), "last", null);
        setField(term25257, term25257.getClass(), "propListHead", null);
        setIntField(term25257, term25257.getClass(), "sourcePosition", 0);
        setField(term25257, term25257.getClass(), "jsType", null);
        setField(term25257, term25257.getClass(), "parent", null);
        setField(term25217, term25217.getClass(), "associatedNode", term25257);
        setField(term25217, term25217.getClass(), "visibility", enum238);
        setIntField(term25217, term25217.getClass(), "bitset", -552272253);
        setIntField(term25265, term25265.getClass(), "type", 186472650);
        setField(term25265, term25265.getClass(), "next", null);
        setField(term25265, term25265.getClass(), "first", null);
        setField(term25265, term25265.getClass(), "last", term25257);
        setField(term25265, term25265.getClass(), "propListHead", null);
        setIntField(term25265, term25265.getClass(), "sourcePosition", 0);
        setField(term25265, term25265.getClass(), "jsType", null);
        setField(term25265, term25265.getClass(), "parent", null);
        setField(term25264, term25264.getClass(), "root", term25265);
        setField(term25264, term25264.getClass(), "sourceName", "");
        setField(term25217, term25217.getClass(), "type", term25264);
        setIntField(term25270, term25270.getClass(), "type", 0);
        setField(term25270, term25270.getClass(), "next", null);
        setField(term25270, term25270.getClass(), "first", null);
        setField(term25270, term25270.getClass(), "last", null);
        setField(term25270, term25270.getClass(), "propListHead", null);
        setIntField(term25270, term25270.getClass(), "sourcePosition", 0);
        setField(term25270, term25270.getClass(), "jsType", null);
        setField(term25270, term25270.getClass(), "parent", null);
        setField(term25269, term25269.getClass(), "root", term25270);
        setField(term25269, term25269.getClass(), "sourceName", "");
        setField(term25217, term25217.getClass(), "thisType", term25269);
        setBooleanField(term25217, term25217.getClass(), "includeDocumentation", true);
        setIntField(term25217, term25217.getClass(), "originalCommentPosition", -633523956);
        setField(term25216, term25216.getClass(), "currentInfo", term25217);
        setBooleanField(term25216, term25216.getClass(), "populated", false);
        setBooleanField(term25216, term25216.getClass(), "parseDocumentation", false);
        setField(term25279, term25279.getClass(), "item", null);
        setIntField(term25279, term25279.getClass(), "startLineno", 0);
        setIntField(term25279, term25279.getClass(), "startCharno", 0);
        setIntField(term25279, term25279.getClass(), "endLineno", 0);
        setIntField(term25279, term25279.getClass(), "endCharno", 0);
        setField(term25278, term25278.getClass(), "annotation", term25279);
        setField(term25284, term25284.getClass(), "item", null);
        setIntField(term25284, term25284.getClass(), "startLineno", 0);
        setIntField(term25284, term25284.getClass(), "startCharno", 0);
        setIntField(term25284, term25284.getClass(), "endLineno", 0);
        setIntField(term25284, term25284.getClass(), "endCharno", 0);
        setField(term25278, term25278.getClass(), "name", term25284);
        setField(term25278, term25278.getClass(), "nameNode", null);
        setField(term25278, term25278.getClass(), "description", null);
        setField(term25278, term25278.getClass(), "type", null);
        setField(term25216, term25216.getClass(), "currentMarker", term25278);
        setField(term25161, term25161.getClass(), "jsdocBuilder", term25216);
        setField(term25161, term25161.getClass(), "sourceFile", null);
        setIntField(term25289, term25289.getClass(), "type", 0);
        setField(term25289, term25289.getClass(), "next", null);
        setField(term25289, term25289.getClass(), "first", null);
        setField(term25289, term25289.getClass(), "last", null);
        setField(term25289, term25289.getClass(), "propListHead", null);
        setIntField(term25289, term25289.getClass(), "sourcePosition", 0);
        setField(term25289, term25289.getClass(), "jsType", null);
        setField(term25289, term25289.getClass(), "parent", null);
        setField(term25161, term25161.getClass(), "associatedNode", term25289);
        setField(term25161, term25161.getClass(), "errorReporter", null);
        setField(term25161, term25161.getClass(), "parser", null);
        setField(term25161, term25161.getClass(), "templateNode", null);
        setField(term25161, term25161.getClass(), "fileOverviewJSDocInfo", null);
        setField(term25161, term25161.getClass(), "state", null);
        setField(term25161, term25161.getClass(), "annotationNames", null);
        setField(term25161, term25161.getClass(), "suppressionNames", null);
        setField(term25161, term25161.getClass(), "fileLevelJsDocBuilder", null);
        setField(term25161, term25161.getClass(), "unreadToken", null);
        Class<? extends Object> term156222 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term156221 = ((Class) term156222).getDeclaredField((String) "STRING");
        ((Field) term156221).setAccessible(true);
        enum239 = ((Field) term156221).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum239;
        try {
            callMethod(klass, "parseArrayType", argTypes, term25161, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


