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

public class JsDocInfoParser_parseParametersType_28333511390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19840;
     Object enum201;

    public JsDocInfoParser_parseParametersType_28333511390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19901 = new ArrayList();
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ((ArrayList) term19901).add((Object)null);
        ArrayList term19904 = new ArrayList();
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        ((ArrayList) term19904).add((Object)null);
        HashMap term19907 = new HashMap();
        ArrayList term19912 = new ArrayList();
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        ((ArrayList) term19912).add((Object)null);
        HashSet term19920 = new HashSet();
        HashSet term19921 = new HashSet();
        ArrayList term19925 = new ArrayList();
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        ((ArrayList) term19925).add((Object)null);
        HashMap term19928 = new HashMap();
        Class<? extends Object> term105850 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term105849 = ((Class) term105850).getDeclaredField((String) "INHERITED");
        ((Field) term105849).setAccessible(true);
        Object enum200 = ((Field) term105849).get((Object) null);
        term19840 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term19841 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term19854 = (char[]) newCharArray(8);
        int[] term19864 = (int[]) newIntArray(7);
        Object term19897 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term19898 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19899 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19900 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19923 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19940 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19948 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19949 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19954 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term19959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19841, term19841.getClass(), "string", "CLHomjAqIM");
        setCharElement(term19854, 0, 'Y');
        setCharElement(term19854, 1, 'V');
        setCharElement(term19854, 2, 'z');
        setCharElement(term19854, 3, 'R');
        setCharElement(term19854, 4, 'f');
        setCharElement(term19854, 5, 'L');
        setCharElement(term19854, 6, 'Q');
        setCharElement(term19854, 7, 'F');
        setField(term19841, term19841.getClass(), "stringBuffer", term19854);
        setIntField(term19841, term19841.getClass(), "stringBufferTop", -1397251956);
        setIntElement(term19864, 0, -796934571);
        setIntElement(term19864, 1, 405295896);
        setIntElement(term19864, 2, -814977075);
        setIntElement(term19864, 3, 808614267);
        setIntElement(term19864, 4, 1611734632);
        setIntElement(term19864, 5, 868908117);
        setIntElement(term19864, 6, 1789351397);
        setField(term19841, term19841.getClass(), "ungetBuffer", term19864);
        setIntField(term19841, term19841.getClass(), "ungetCursor", 2145528170);
        setBooleanField(term19841, term19841.getClass(), "hitEOF", true);
        setIntField(term19841, term19841.getClass(), "lineStart", -585773976);
        setIntField(term19841, term19841.getClass(), "lineEndChar", 852806940);
        setIntField(term19841, term19841.getClass(), "lineno", 698551724);
        setIntField(term19841, term19841.getClass(), "charno", -1631048635);
        setIntField(term19841, term19841.getClass(), "initCharno", 1342808731);
        setIntField(term19841, term19841.getClass(), "initLineno", -64893740);
        setField(term19841, term19841.getClass(), "sourceString", "mzCFLzFuSj");
        setIntField(term19841, term19841.getClass(), "sourceEnd", -222012928);
        setIntField(term19841, term19841.getClass(), "sourceCursor", -146564963);
        setIntField(term19841, term19841.getClass(), "cursor", -83178716);
        setIntField(term19841, term19841.getClass(), "tokenBeg", -1292704466);
        setIntField(term19841, term19841.getClass(), "tokenEnd", 1991858584);
        setField(term19840, term19840.getClass(), "stream", term19841);
        setField(term19900, term19900.getClass(), "root", null);
        setField(term19900, term19900.getClass(), "sourceName", null);
        setField(term19899, term19899.getClass(), "baseType", term19900);
        setField(term19899, term19899.getClass(), "extendedInterfaces", term19901);
        setField(term19899, term19899.getClass(), "implementedInterfaces", term19904);
        setField(term19899, term19899.getClass(), "parameters", term19907);
        setField(term19899, term19899.getClass(), "thrownTypes", term19912);
        setField(term19899, term19899.getClass(), "templateTypeName", "");
        setField(term19899, term19899.getClass(), "description", "");
        setField(term19899, term19899.getClass(), "meaning", "");
        setField(term19899, term19899.getClass(), "deprecated", "");
        setField(term19899, term19899.getClass(), "license", "");
        setField(term19899, term19899.getClass(), "suppressions", term19920);
        setField(term19899, term19899.getClass(), "modifies", term19921);
        setField(term19899, term19899.getClass(), "lendsName", "");
        setField(term19898, term19898.getClass(), "info", term19899);
        setField(term19923, term19923.getClass(), "sourceComment", "");
        setField(term19923, term19923.getClass(), "markers", term19925);
        setField(term19923, term19923.getClass(), "parameters", term19928);
        setField(term19923, term19923.getClass(), "throwsDescriptions", null);
        setField(term19923, term19923.getClass(), "blockDescription", null);
        setField(term19923, term19923.getClass(), "fileOverview", null);
        setField(term19923, term19923.getClass(), "returnDescription", null);
        setField(term19923, term19923.getClass(), "version", null);
        setField(term19923, term19923.getClass(), "authors", null);
        setField(term19923, term19923.getClass(), "sees", null);
        setField(term19898, term19898.getClass(), "documentation", term19923);
        setIntField(term19933, term19933.getClass(), "type", 0);
        setField(term19933, term19933.getClass(), "next", null);
        setField(term19933, term19933.getClass(), "first", null);
        setField(term19933, term19933.getClass(), "last", null);
        setField(term19933, term19933.getClass(), "propListHead", null);
        setIntField(term19933, term19933.getClass(), "sourcePosition", 0);
        setField(term19933, term19933.getClass(), "jsType", null);
        setField(term19933, term19933.getClass(), "parent", null);
        setField(term19898, term19898.getClass(), "associatedNode", term19933);
        setField(term19898, term19898.getClass(), "visibility", enum200);
        setIntField(term19898, term19898.getClass(), "bitset", 1105016932);
        setIntField(term19941, term19941.getClass(), "type", 1815951606);
        setField(term19941, term19941.getClass(), "next", null);
        setField(term19941, term19941.getClass(), "first", null);
        setField(term19941, term19941.getClass(), "last", term19933);
        setField(term19941, term19941.getClass(), "propListHead", null);
        setIntField(term19941, term19941.getClass(), "sourcePosition", 0);
        setField(term19941, term19941.getClass(), "jsType", null);
        setField(term19941, term19941.getClass(), "parent", null);
        setField(term19940, term19940.getClass(), "root", term19941);
        setField(term19940, term19940.getClass(), "sourceName", "");
        setField(term19898, term19898.getClass(), "type", term19940);
        setField(term19898, term19898.getClass(), "thisType", term19940);
        setBooleanField(term19898, term19898.getClass(), "includeDocumentation", false);
        setField(term19897, term19897.getClass(), "currentInfo", term19898);
        setBooleanField(term19897, term19897.getClass(), "populated", false);
        setBooleanField(term19897, term19897.getClass(), "parseDocumentation", false);
        setField(term19949, term19949.getClass(), "item", null);
        setIntField(term19949, term19949.getClass(), "startLineno", 0);
        setIntField(term19949, term19949.getClass(), "startCharno", 0);
        setIntField(term19949, term19949.getClass(), "endLineno", 0);
        setIntField(term19949, term19949.getClass(), "endCharno", 0);
        setField(term19948, term19948.getClass(), "annotation", term19949);
        setField(term19954, term19954.getClass(), "item", null);
        setIntField(term19954, term19954.getClass(), "startLineno", 0);
        setIntField(term19954, term19954.getClass(), "startCharno", 0);
        setIntField(term19954, term19954.getClass(), "endLineno", 0);
        setIntField(term19954, term19954.getClass(), "endCharno", 0);
        setField(term19948, term19948.getClass(), "name", term19954);
        setField(term19948, term19948.getClass(), "nameNode", null);
        setField(term19948, term19948.getClass(), "description", null);
        setField(term19948, term19948.getClass(), "type", null);
        setField(term19897, term19897.getClass(), "currentMarker", term19948);
        setField(term19840, term19840.getClass(), "jsdocBuilder", term19897);
        setField(term19840, term19840.getClass(), "sourceFile", null);
        setIntField(term19959, term19959.getClass(), "type", 0);
        setField(term19959, term19959.getClass(), "next", null);
        setField(term19959, term19959.getClass(), "first", null);
        setField(term19959, term19959.getClass(), "last", null);
        setField(term19959, term19959.getClass(), "propListHead", null);
        setIntField(term19959, term19959.getClass(), "sourcePosition", 0);
        setField(term19959, term19959.getClass(), "jsType", null);
        setField(term19959, term19959.getClass(), "parent", null);
        setField(term19840, term19840.getClass(), "associatedNode", term19959);
        setField(term19840, term19840.getClass(), "errorReporter", null);
        setField(term19840, term19840.getClass(), "parser", null);
        setField(term19840, term19840.getClass(), "templateNode", null);
        setField(term19840, term19840.getClass(), "fileOverviewJSDocInfo", null);
        setField(term19840, term19840.getClass(), "state", null);
        setField(term19840, term19840.getClass(), "annotationNames", null);
        setField(term19840, term19840.getClass(), "suppressionNames", null);
        setField(term19840, term19840.getClass(), "fileLevelJsDocBuilder", null);
        setField(term19840, term19840.getClass(), "unreadToken", null);
        Class<? extends Object> term106124 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term106123 = ((Class) term106124).getDeclaredField((String) "RP");
        ((Field) term106123).setAccessible(true);
        enum201 = ((Field) term106123).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum201;
        try {
            callMethod(klass, "parseParametersType", argTypes, term19840, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


