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

public class JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31282;

    public JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31344 = new ArrayList();
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ((ArrayList) term31344).add((Object)null);
        ArrayList term31347 = new ArrayList();
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        ((ArrayList) term31347).add((Object)null);
        HashMap term31350 = new HashMap();
        ArrayList term31355 = new ArrayList();
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        ((ArrayList) term31355).add((Object)null);
        HashSet term31358 = new HashSet();
        HashSet term31363 = new HashSet();
        HashSet term31364 = new HashSet();
        ArrayList term31373 = new ArrayList();
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        ((ArrayList) term31373).add((Object)null);
        HashMap term31376 = new HashMap();
        Class<? extends Object> term160875 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term160871 = ((Class) term160875).getDeclaredField((String) "PRIVATE");
        ((Field) term160871).setAccessible(true);
        Object enum255 = ((Field) term160871).get((Object) null);
        term31282 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31283 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31296 = (char[]) newCharArray(8);
        int[] term31306 = (int[]) newIntArray(8);
        Object term31340 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31341 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term31342 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term31343 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31371 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term31381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31388 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31393 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31402 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term31403 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31408 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term31283, term31283.getClass(), "string", "WmVcapKAeJ");
        setCharElement(term31296, 0, 'y');
        setCharElement(term31296, 1, 'b');
        setCharElement(term31296, 2, 'U');
        setCharElement(term31296, 3, 'x');
        setCharElement(term31296, 4, 'O');
        setCharElement(term31296, 5, 'E');
        setCharElement(term31296, 6, 'q');
        setCharElement(term31296, 7, 'z');
        setField(term31283, term31283.getClass(), "stringBuffer", term31296);
        setIntField(term31283, term31283.getClass(), "stringBufferTop", -1030167086);
        setIntElement(term31306, 0, -434230943);
        setIntElement(term31306, 1, 698633875);
        setIntElement(term31306, 2, 548468113);
        setIntElement(term31306, 3, 1701819905);
        setIntElement(term31306, 4, 1721418943);
        setIntElement(term31306, 5, -111082612);
        setIntElement(term31306, 6, 1253334988);
        setIntElement(term31306, 7, 1086709736);
        setField(term31283, term31283.getClass(), "ungetBuffer", term31306);
        setIntField(term31283, term31283.getClass(), "ungetCursor", -1606698075);
        setBooleanField(term31283, term31283.getClass(), "hitEOF", false);
        setIntField(term31283, term31283.getClass(), "lineStart", 90996421);
        setIntField(term31283, term31283.getClass(), "lineEndChar", -1805802783);
        setIntField(term31283, term31283.getClass(), "lineno", -529831900);
        setIntField(term31283, term31283.getClass(), "charno", 1574493440);
        setIntField(term31283, term31283.getClass(), "initCharno", 1854694585);
        setIntField(term31283, term31283.getClass(), "initLineno", -1260562836);
        setField(term31283, term31283.getClass(), "sourceString", "jevOVdQdpc");
        setIntField(term31283, term31283.getClass(), "sourceEnd", 694100722);
        setIntField(term31283, term31283.getClass(), "sourceCursor", -680529431);
        setIntField(term31283, term31283.getClass(), "cursor", 212698793);
        setIntField(term31283, term31283.getClass(), "tokenBeg", 1169519385);
        setIntField(term31283, term31283.getClass(), "tokenEnd", 1846078344);
        setField(term31282, term31282.getClass(), "stream", term31283);
        setField(term31343, term31343.getClass(), "root", null);
        setField(term31343, term31343.getClass(), "sourceName", null);
        setField(term31342, term31342.getClass(), "baseType", term31343);
        setField(term31342, term31342.getClass(), "extendedInterfaces", term31344);
        setField(term31342, term31342.getClass(), "implementedInterfaces", term31347);
        setField(term31342, term31342.getClass(), "parameters", term31350);
        setField(term31342, term31342.getClass(), "thrownTypes", term31355);
        setField(term31342, term31342.getClass(), "templateTypeNames", null);
        setField(term31342, term31342.getClass(), "disposedParameters", term31358);
        setField(term31342, term31342.getClass(), "description", "");
        setField(term31342, term31342.getClass(), "meaning", "");
        setField(term31342, term31342.getClass(), "deprecated", "");
        setField(term31342, term31342.getClass(), "license", "");
        setField(term31342, term31342.getClass(), "suppressions", term31363);
        setField(term31342, term31342.getClass(), "modifies", term31364);
        setField(term31342, term31342.getClass(), "lendsName", "");
        setBooleanField(term31342, term31342.getClass(), "ngInject", true);
        setBooleanField(term31342, term31342.getClass(), "wizaction", true);
        setBooleanField(term31342, term31342.getClass(), "jaggerInject", false);
        setBooleanField(term31342, term31342.getClass(), "jaggerProvide", false);
        setBooleanField(term31342, term31342.getClass(), "jaggerModule", false);
        setField(term31341, term31341.getClass(), "info", term31342);
        setField(term31371, term31371.getClass(), "sourceComment", "");
        setField(term31371, term31371.getClass(), "markers", term31373);
        setField(term31371, term31371.getClass(), "parameters", term31376);
        setField(term31371, term31371.getClass(), "throwsDescriptions", null);
        setField(term31371, term31371.getClass(), "blockDescription", null);
        setField(term31371, term31371.getClass(), "fileOverview", null);
        setField(term31371, term31371.getClass(), "returnDescription", null);
        setField(term31371, term31371.getClass(), "version", null);
        setField(term31371, term31371.getClass(), "authors", null);
        setField(term31371, term31371.getClass(), "sees", null);
        setField(term31341, term31341.getClass(), "documentation", term31371);
        setIntField(term31381, term31381.getClass(), "type", 0);
        setField(term31381, term31381.getClass(), "next", null);
        setField(term31381, term31381.getClass(), "first", null);
        setField(term31381, term31381.getClass(), "last", null);
        setField(term31381, term31381.getClass(), "propListHead", null);
        setIntField(term31381, term31381.getClass(), "sourcePosition", 0);
        setField(term31381, term31381.getClass(), "jsType", null);
        setField(term31381, term31381.getClass(), "parent", null);
        setField(term31341, term31341.getClass(), "associatedNode", term31381);
        setField(term31341, term31341.getClass(), "visibility", enum255);
        setIntField(term31341, term31341.getClass(), "bitset", 258334639);
        setIntField(term31389, term31389.getClass(), "type", 1235375204);
        setField(term31389, term31389.getClass(), "next", term31381);
        setField(term31389, term31389.getClass(), "first", null);
        setField(term31389, term31389.getClass(), "last", null);
        setField(term31389, term31389.getClass(), "propListHead", null);
        setIntField(term31389, term31389.getClass(), "sourcePosition", 0);
        setField(term31389, term31389.getClass(), "jsType", null);
        setField(term31389, term31389.getClass(), "parent", null);
        setField(term31388, term31388.getClass(), "root", term31389);
        setField(term31388, term31388.getClass(), "sourceName", "");
        setField(term31341, term31341.getClass(), "type", term31388);
        setIntField(term31394, term31394.getClass(), "type", -1607267243);
        setField(term31394, term31394.getClass(), "next", null);
        setField(term31394, term31394.getClass(), "first", null);
        setField(term31394, term31394.getClass(), "last", null);
        setField(term31394, term31394.getClass(), "propListHead", null);
        setIntField(term31394, term31394.getClass(), "sourcePosition", 0);
        setField(term31394, term31394.getClass(), "jsType", null);
        setField(term31394, term31394.getClass(), "parent", null);
        setField(term31393, term31393.getClass(), "root", term31394);
        setField(term31393, term31393.getClass(), "sourceName", "");
        setField(term31341, term31341.getClass(), "thisType", term31393);
        setBooleanField(term31341, term31341.getClass(), "includeDocumentation", true);
        setIntField(term31341, term31341.getClass(), "originalCommentPosition", 1432187207);
        setField(term31340, term31340.getClass(), "currentInfo", term31341);
        setBooleanField(term31340, term31340.getClass(), "populated", false);
        setBooleanField(term31340, term31340.getClass(), "parseDocumentation", false);
        setField(term31403, term31403.getClass(), "item", null);
        setIntField(term31403, term31403.getClass(), "startLineno", 0);
        setIntField(term31403, term31403.getClass(), "startCharno", 0);
        setIntField(term31403, term31403.getClass(), "endLineno", 0);
        setIntField(term31403, term31403.getClass(), "endCharno", 0);
        setField(term31402, term31402.getClass(), "annotation", term31403);
        setField(term31408, term31408.getClass(), "item", null);
        setIntField(term31408, term31408.getClass(), "startLineno", 0);
        setIntField(term31408, term31408.getClass(), "startCharno", 0);
        setIntField(term31408, term31408.getClass(), "endLineno", 0);
        setIntField(term31408, term31408.getClass(), "endCharno", 0);
        setField(term31402, term31402.getClass(), "name", term31408);
        setField(term31402, term31402.getClass(), "nameNode", null);
        setField(term31402, term31402.getClass(), "description", null);
        setField(term31402, term31402.getClass(), "type", null);
        setField(term31340, term31340.getClass(), "currentMarker", term31402);
        setField(term31282, term31282.getClass(), "jsdocBuilder", term31340);
        setField(term31282, term31282.getClass(), "sourceFile", null);
        setField(term31282, term31282.getClass(), "associatedNode", term31389);
        setField(term31282, term31282.getClass(), "errorReporter", null);
        setField(term31282, term31282.getClass(), "parser", null);
        setField(term31282, term31282.getClass(), "templateNode", null);
        setField(term31282, term31282.getClass(), "fileOverviewJSDocInfo", null);
        setField(term31282, term31282.getClass(), "state", null);
        setField(term31282, term31282.getClass(), "annotationNames", null);
        setField(term31282, term31282.getClass(), "suppressionNames", null);
        setField(term31282, term31282.getClass(), "fileLevelJsDocBuilder", null);
        setField(term31282, term31282.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportGenericTypeSyntaxWarning", argTypes, term31282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


