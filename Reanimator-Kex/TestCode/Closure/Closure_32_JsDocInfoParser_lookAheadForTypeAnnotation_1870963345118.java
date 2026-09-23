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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_lookAheadForTypeAnnotation_1870963345118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36294;

    public JsDocInfoParser_lookAheadForTypeAnnotation_1870963345118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36357 = new ArrayList();
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ((ArrayList) term36357).add((Object)null);
        ArrayList term36360 = new ArrayList();
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        ((ArrayList) term36360).add((Object)null);
        HashMap term36363 = new HashMap();
        ArrayList term36368 = new ArrayList();
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        ((ArrayList) term36368).add((Object)null);
        HashSet term36376 = new HashSet();
        HashSet term36377 = new HashSet();
        ArrayList term36381 = new ArrayList();
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        ((ArrayList) term36381).add((Object)null);
        HashMap term36384 = new HashMap();
        Class<? extends Object> term119831 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term119830 = ((Class) term119831).getDeclaredField((String) "PUBLIC");
        ((Field) term119830).setAccessible(true);
        Object enum246 = ((Field) term119830).get((Object) null);
        term36294 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term36295 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term36308 = (char[]) newCharArray(9);
        int[] term36319 = (int[]) newIntArray(8);
        Object term36353 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term36354 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term36355 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term36356 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36379 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term36389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36396 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36401 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term36402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36409 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term36410 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term36415 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term36295, term36295.getClass(), "string", "lsQrIFMkgZ");
        setCharElement(term36308, 0, 'r');
        setCharElement(term36308, 1, 'Q');
        setCharElement(term36308, 2, 'L');
        setCharElement(term36308, 3, 'u');
        setCharElement(term36308, 4, 'W');
        setCharElement(term36308, 5, 'I');
        setCharElement(term36308, 6, 'D');
        setCharElement(term36308, 7, 'J');
        setCharElement(term36308, 8, 'X');
        setField(term36295, term36295.getClass(), "stringBuffer", term36308);
        setIntField(term36295, term36295.getClass(), "stringBufferTop", -111082612);
        setIntElement(term36319, 0, 1253334988);
        setIntElement(term36319, 1, 1086709736);
        setIntElement(term36319, 2, -1606698075);
        setIntElement(term36319, 3, 90996421);
        setIntElement(term36319, 4, -1805802783);
        setIntElement(term36319, 5, -529831900);
        setIntElement(term36319, 6, 1574493440);
        setIntElement(term36319, 7, 1854694585);
        setField(term36295, term36295.getClass(), "ungetBuffer", term36319);
        setIntField(term36295, term36295.getClass(), "ungetCursor", -1260562836);
        setBooleanField(term36295, term36295.getClass(), "hitEOF", false);
        setIntField(term36295, term36295.getClass(), "lineStart", 694100722);
        setIntField(term36295, term36295.getClass(), "lineEndChar", -680529431);
        setIntField(term36295, term36295.getClass(), "lineno", 212698793);
        setIntField(term36295, term36295.getClass(), "charno", 1169519385);
        setIntField(term36295, term36295.getClass(), "initCharno", 1846078344);
        setIntField(term36295, term36295.getClass(), "initLineno", 1692543802);
        setField(term36295, term36295.getClass(), "sourceString", "VgAyBhgBhq");
        setIntField(term36295, term36295.getClass(), "sourceEnd", 376341151);
        setIntField(term36295, term36295.getClass(), "sourceCursor", -1607267243);
        setIntField(term36295, term36295.getClass(), "cursor", 1641377218);
        setIntField(term36295, term36295.getClass(), "tokenBeg", 1235375204);
        setIntField(term36295, term36295.getClass(), "tokenEnd", 258334639);
        setField(term36294, term36294.getClass(), "stream", term36295);
        setField(term36356, term36356.getClass(), "root", null);
        setField(term36356, term36356.getClass(), "sourceName", null);
        setField(term36355, term36355.getClass(), "baseType", term36356);
        setField(term36355, term36355.getClass(), "extendedInterfaces", term36357);
        setField(term36355, term36355.getClass(), "implementedInterfaces", term36360);
        setField(term36355, term36355.getClass(), "parameters", term36363);
        setField(term36355, term36355.getClass(), "thrownTypes", term36368);
        setField(term36355, term36355.getClass(), "templateTypeName", "");
        setField(term36355, term36355.getClass(), "description", "");
        setField(term36355, term36355.getClass(), "meaning", "");
        setField(term36355, term36355.getClass(), "deprecated", "");
        setField(term36355, term36355.getClass(), "license", "");
        setField(term36355, term36355.getClass(), "suppressions", term36376);
        setField(term36355, term36355.getClass(), "modifies", term36377);
        setField(term36355, term36355.getClass(), "lendsName", "");
        setField(term36354, term36354.getClass(), "info", term36355);
        setField(term36379, term36379.getClass(), "sourceComment", "");
        setField(term36379, term36379.getClass(), "markers", term36381);
        setField(term36379, term36379.getClass(), "parameters", term36384);
        setField(term36379, term36379.getClass(), "throwsDescriptions", null);
        setField(term36379, term36379.getClass(), "blockDescription", null);
        setField(term36379, term36379.getClass(), "fileOverview", null);
        setField(term36379, term36379.getClass(), "returnDescription", null);
        setField(term36379, term36379.getClass(), "version", null);
        setField(term36379, term36379.getClass(), "authors", null);
        setField(term36379, term36379.getClass(), "sees", null);
        setField(term36354, term36354.getClass(), "documentation", term36379);
        setIntField(term36389, term36389.getClass(), "type", 0);
        setField(term36389, term36389.getClass(), "next", null);
        setField(term36389, term36389.getClass(), "first", null);
        setField(term36389, term36389.getClass(), "last", null);
        setField(term36389, term36389.getClass(), "propListHead", null);
        setIntField(term36389, term36389.getClass(), "sourcePosition", 0);
        setField(term36389, term36389.getClass(), "jsType", null);
        setField(term36389, term36389.getClass(), "parent", null);
        setField(term36354, term36354.getClass(), "associatedNode", term36389);
        setField(term36354, term36354.getClass(), "visibility", enum246);
        setIntField(term36354, term36354.getClass(), "bitset", -1703642288);
        setIntField(term36397, term36397.getClass(), "type", -134092543);
        setField(term36397, term36397.getClass(), "next", term36389);
        setField(term36397, term36397.getClass(), "first", null);
        setField(term36397, term36397.getClass(), "last", null);
        setField(term36397, term36397.getClass(), "propListHead", null);
        setIntField(term36397, term36397.getClass(), "sourcePosition", 0);
        setField(term36397, term36397.getClass(), "jsType", null);
        setField(term36397, term36397.getClass(), "parent", null);
        setField(term36396, term36396.getClass(), "root", term36397);
        setField(term36396, term36396.getClass(), "sourceName", "");
        setField(term36354, term36354.getClass(), "type", term36396);
        setIntField(term36402, term36402.getClass(), "type", 680714112);
        setField(term36402, term36402.getClass(), "next", null);
        setField(term36402, term36402.getClass(), "first", null);
        setField(term36402, term36402.getClass(), "last", null);
        setField(term36402, term36402.getClass(), "propListHead", null);
        setIntField(term36402, term36402.getClass(), "sourcePosition", 0);
        setField(term36402, term36402.getClass(), "jsType", null);
        setField(term36402, term36402.getClass(), "parent", null);
        setField(term36401, term36401.getClass(), "root", term36402);
        setField(term36401, term36401.getClass(), "sourceName", "");
        setField(term36354, term36354.getClass(), "thisType", term36401);
        setBooleanField(term36354, term36354.getClass(), "includeDocumentation", true);
        setField(term36353, term36353.getClass(), "currentInfo", term36354);
        setBooleanField(term36353, term36353.getClass(), "populated", true);
        setBooleanField(term36353, term36353.getClass(), "parseDocumentation", true);
        setField(term36410, term36410.getClass(), "item", null);
        setIntField(term36410, term36410.getClass(), "startLineno", 0);
        setIntField(term36410, term36410.getClass(), "startCharno", 0);
        setIntField(term36410, term36410.getClass(), "endLineno", 0);
        setIntField(term36410, term36410.getClass(), "endCharno", 0);
        setField(term36409, term36409.getClass(), "annotation", term36410);
        setField(term36415, term36415.getClass(), "item", null);
        setIntField(term36415, term36415.getClass(), "startLineno", 0);
        setIntField(term36415, term36415.getClass(), "startCharno", 0);
        setIntField(term36415, term36415.getClass(), "endLineno", 0);
        setIntField(term36415, term36415.getClass(), "endCharno", 0);
        setField(term36409, term36409.getClass(), "name", term36415);
        setField(term36409, term36409.getClass(), "nameNode", null);
        setField(term36409, term36409.getClass(), "description", null);
        setField(term36409, term36409.getClass(), "type", null);
        setField(term36353, term36353.getClass(), "currentMarker", term36409);
        setField(term36294, term36294.getClass(), "jsdocBuilder", term36353);
        setField(term36294, term36294.getClass(), "sourceFile", null);
        setField(term36294, term36294.getClass(), "associatedNode", term36397);
        setField(term36294, term36294.getClass(), "errorReporter", null);
        setField(term36294, term36294.getClass(), "parser", null);
        setField(term36294, term36294.getClass(), "templateNode", null);
        setField(term36294, term36294.getClass(), "fileOverviewJSDocInfo", null);
        setField(term36294, term36294.getClass(), "state", null);
        setField(term36294, term36294.getClass(), "annotationNames", null);
        setField(term36294, term36294.getClass(), "suppressionNames", null);
        setField(term36294, term36294.getClass(), "fileLevelJsDocBuilder", null);
        setField(term36294, term36294.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lookAheadForTypeAnnotation", argTypes, term36294, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


