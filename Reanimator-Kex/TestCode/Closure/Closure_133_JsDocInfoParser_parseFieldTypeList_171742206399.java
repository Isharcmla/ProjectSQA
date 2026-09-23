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

public class JsDocInfoParser_parseFieldTypeList_171742206399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22309;
     Object enum212;

    public JsDocInfoParser_parseFieldTypeList_171742206399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22365 = new ArrayList();
        ArrayList term22368 = new ArrayList();
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        ((ArrayList) term22368).add((Object)null);
        HashMap term22371 = new HashMap();
        ArrayList term22376 = new ArrayList();
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        ((ArrayList) term22376).add((Object)null);
        Class<? extends Object> term118557 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term118556 = ((Class) term118557).getDeclaredField((String) "PRIVATE");
        ((Field) term118556).setAccessible(true);
        Object enum211 = ((Field) term118556).get((Object) null);
        term22309 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term22310 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term22323 = (char[]) newCharArray(7);
        int[] term22332 = (int[]) newIntArray(3);
        Object term22361 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term22362 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term22363 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term22364 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term22381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22388 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22393 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term22394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22401 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term22402 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term22407 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term22412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22310, term22310.getClass(), "string", "bxyfeicqrK");
        setCharElement(term22323, 0, 'V');
        setCharElement(term22323, 1, 't');
        setCharElement(term22323, 2, 'F');
        setCharElement(term22323, 3, 'Z');
        setCharElement(term22323, 4, 'i');
        setCharElement(term22323, 5, 'a');
        setCharElement(term22323, 6, 'G');
        setField(term22310, term22310.getClass(), "stringBuffer", term22323);
        setIntField(term22310, term22310.getClass(), "stringBufferTop", 2074130991);
        setIntElement(term22332, 0, 532588266);
        setIntElement(term22332, 1, -1286686332);
        setIntElement(term22332, 2, -284885486);
        setField(term22310, term22310.getClass(), "ungetBuffer", term22332);
        setIntField(term22310, term22310.getClass(), "ungetCursor", 1791984446);
        setBooleanField(term22310, term22310.getClass(), "hitEOF", true);
        setIntField(term22310, term22310.getClass(), "lineStart", 804070622);
        setIntField(term22310, term22310.getClass(), "lineEndChar", 1850364894);
        setIntField(term22310, term22310.getClass(), "lineno", 915367534);
        setIntField(term22310, term22310.getClass(), "charno", 1949983666);
        setIntField(term22310, term22310.getClass(), "initCharno", 154111854);
        setIntField(term22310, term22310.getClass(), "initLineno", 710986341);
        setField(term22310, term22310.getClass(), "sourceString", "vBnWPlsZMk");
        setIntField(term22310, term22310.getClass(), "sourceEnd", -873958002);
        setIntField(term22310, term22310.getClass(), "sourceCursor", -1780848958);
        setIntField(term22310, term22310.getClass(), "cursor", 1235045850);
        setIntField(term22310, term22310.getClass(), "tokenBeg", -75143033);
        setIntField(term22310, term22310.getClass(), "tokenEnd", 797015478);
        setField(term22309, term22309.getClass(), "stream", term22310);
        setField(term22364, term22364.getClass(), "root", null);
        setField(term22364, term22364.getClass(), "sourceName", null);
        setField(term22363, term22363.getClass(), "baseType", term22364);
        setField(term22363, term22363.getClass(), "extendedInterfaces", term22365);
        setField(term22363, term22363.getClass(), "implementedInterfaces", term22368);
        setField(term22363, term22363.getClass(), "parameters", term22371);
        setField(term22363, term22363.getClass(), "thrownTypes", term22376);
        setField(term22363, term22363.getClass(), "templateTypeNames", null);
        setField(term22363, term22363.getClass(), "classTemplateTypeNames", null);
        setField(term22363, term22363.getClass(), "description", null);
        setField(term22363, term22363.getClass(), "meaning", null);
        setField(term22363, term22363.getClass(), "deprecated", null);
        setField(term22363, term22363.getClass(), "license", null);
        setField(term22363, term22363.getClass(), "suppressions", null);
        setField(term22363, term22363.getClass(), "modifies", null);
        setField(term22363, term22363.getClass(), "lendsName", null);
        setBooleanField(term22363, term22363.getClass(), "ngInject", false);
        setField(term22362, term22362.getClass(), "info", term22363);
        setField(term22380, term22380.getClass(), "sourceComment", null);
        setField(term22380, term22380.getClass(), "markers", null);
        setField(term22380, term22380.getClass(), "parameters", null);
        setField(term22380, term22380.getClass(), "throwsDescriptions", null);
        setField(term22380, term22380.getClass(), "blockDescription", null);
        setField(term22380, term22380.getClass(), "fileOverview", null);
        setField(term22380, term22380.getClass(), "returnDescription", null);
        setField(term22380, term22380.getClass(), "version", null);
        setField(term22380, term22380.getClass(), "authors", null);
        setField(term22380, term22380.getClass(), "sees", null);
        setField(term22362, term22362.getClass(), "documentation", term22380);
        setIntField(term22381, term22381.getClass(), "type", 0);
        setField(term22381, term22381.getClass(), "next", null);
        setField(term22381, term22381.getClass(), "first", null);
        setField(term22381, term22381.getClass(), "last", null);
        setField(term22381, term22381.getClass(), "propListHead", null);
        setIntField(term22381, term22381.getClass(), "sourcePosition", 0);
        setField(term22381, term22381.getClass(), "jsType", null);
        setField(term22381, term22381.getClass(), "parent", null);
        setField(term22362, term22362.getClass(), "associatedNode", term22381);
        setField(term22362, term22362.getClass(), "visibility", enum211);
        setIntField(term22362, term22362.getClass(), "bitset", 953741504);
        setIntField(term22389, term22389.getClass(), "type", -570164389);
        setField(term22389, term22389.getClass(), "next", null);
        setField(term22389, term22389.getClass(), "first", null);
        setField(term22389, term22389.getClass(), "last", term22381);
        setField(term22389, term22389.getClass(), "propListHead", null);
        setIntField(term22389, term22389.getClass(), "sourcePosition", 0);
        setField(term22389, term22389.getClass(), "jsType", null);
        setField(term22389, term22389.getClass(), "parent", null);
        setField(term22388, term22388.getClass(), "root", term22389);
        setField(term22388, term22388.getClass(), "sourceName", "");
        setField(term22362, term22362.getClass(), "type", term22388);
        setIntField(term22394, term22394.getClass(), "type", 0);
        setField(term22394, term22394.getClass(), "next", null);
        setField(term22394, term22394.getClass(), "first", null);
        setField(term22394, term22394.getClass(), "last", null);
        setField(term22394, term22394.getClass(), "propListHead", null);
        setIntField(term22394, term22394.getClass(), "sourcePosition", 0);
        setField(term22394, term22394.getClass(), "jsType", null);
        setField(term22394, term22394.getClass(), "parent", null);
        setField(term22393, term22393.getClass(), "root", term22394);
        setField(term22393, term22393.getClass(), "sourceName", "");
        setField(term22362, term22362.getClass(), "thisType", term22393);
        setBooleanField(term22362, term22362.getClass(), "includeDocumentation", false);
        setField(term22361, term22361.getClass(), "currentInfo", term22362);
        setBooleanField(term22361, term22361.getClass(), "populated", false);
        setBooleanField(term22361, term22361.getClass(), "parseDocumentation", false);
        setField(term22402, term22402.getClass(), "item", null);
        setIntField(term22402, term22402.getClass(), "startLineno", 0);
        setIntField(term22402, term22402.getClass(), "startCharno", 0);
        setIntField(term22402, term22402.getClass(), "endLineno", 0);
        setIntField(term22402, term22402.getClass(), "endCharno", 0);
        setField(term22401, term22401.getClass(), "annotation", term22402);
        setField(term22407, term22407.getClass(), "item", null);
        setIntField(term22407, term22407.getClass(), "startLineno", 0);
        setIntField(term22407, term22407.getClass(), "startCharno", 0);
        setIntField(term22407, term22407.getClass(), "endLineno", 0);
        setIntField(term22407, term22407.getClass(), "endCharno", 0);
        setField(term22401, term22401.getClass(), "name", term22407);
        setField(term22401, term22401.getClass(), "nameNode", null);
        setField(term22401, term22401.getClass(), "description", null);
        setField(term22401, term22401.getClass(), "type", null);
        setField(term22361, term22361.getClass(), "currentMarker", term22401);
        setField(term22309, term22309.getClass(), "jsdocBuilder", term22361);
        setField(term22309, term22309.getClass(), "sourceFile", null);
        setIntField(term22412, term22412.getClass(), "type", 0);
        setField(term22412, term22412.getClass(), "next", null);
        setField(term22412, term22412.getClass(), "first", null);
        setField(term22412, term22412.getClass(), "last", null);
        setField(term22412, term22412.getClass(), "propListHead", null);
        setIntField(term22412, term22412.getClass(), "sourcePosition", 0);
        setField(term22412, term22412.getClass(), "jsType", null);
        setField(term22412, term22412.getClass(), "parent", null);
        setField(term22309, term22309.getClass(), "associatedNode", term22412);
        setField(term22309, term22309.getClass(), "errorReporter", null);
        setField(term22309, term22309.getClass(), "parser", null);
        setField(term22309, term22309.getClass(), "templateNode", null);
        setField(term22309, term22309.getClass(), "fileOverviewJSDocInfo", null);
        setField(term22309, term22309.getClass(), "state", null);
        setField(term22309, term22309.getClass(), "annotationNames", null);
        setField(term22309, term22309.getClass(), "suppressionNames", null);
        setField(term22309, term22309.getClass(), "fileLevelJsDocBuilder", null);
        setField(term22309, term22309.getClass(), "unreadToken", null);
        Class<? extends Object> term118825 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term118824 = ((Class) term118825).getDeclaredField((String) "GT");
        ((Field) term118824).setAccessible(true);
        enum212 = ((Field) term118824).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum212;
        try {
            callMethod(klass, "parseFieldTypeList", argTypes, term22309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


