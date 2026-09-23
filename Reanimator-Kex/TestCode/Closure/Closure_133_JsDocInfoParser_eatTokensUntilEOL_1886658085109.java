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
import java.lang.String;

public class JsDocInfoParser_eatTokensUntilEOL_1886658085109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27278;

    public JsDocInfoParser_eatTokensUntilEOL_1886658085109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27334 = new ArrayList();
        ((ArrayList) term27334).add((Object)null);
        ((ArrayList) term27334).add((Object)null);
        ((ArrayList) term27334).add((Object)null);
        ArrayList term27337 = new ArrayList();
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        ((ArrayList) term27337).add((Object)null);
        HashMap term27340 = new HashMap();
        ArrayList term27345 = new ArrayList();
        ((ArrayList) term27345).add((Object)null);
        ((ArrayList) term27345).add((Object)null);
        ((ArrayList) term27345).add((Object)null);
        ((ArrayList) term27345).add((Object)null);
        ((ArrayList) term27345).add((Object)null);
        ((ArrayList) term27345).add((Object)null);
        Class<? extends Object> term122634 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term122633 = ((Class) term122634).getDeclaredField((String) "PRIVATE");
        ((Field) term122633).setAccessible(true);
        Object enum224 = ((Field) term122633).get((Object) null);
        term27278 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term27279 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term27292 = (char[]) newCharArray(6);
        int[] term27300 = (int[]) newIntArray(4);
        Object term27330 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term27331 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term27333 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27349 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term27350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27357 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27362 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27370 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term27371 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term27376 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term27279, term27279.getClass(), "string", "FvUCZgTXhq");
        setCharElement(term27292, 0, 'x');
        setCharElement(term27292, 1, 'W');
        setCharElement(term27292, 2, 'a');
        setCharElement(term27292, 3, 'H');
        setCharElement(term27292, 4, 'c');
        setCharElement(term27292, 5, 'f');
        setField(term27279, term27279.getClass(), "stringBuffer", term27292);
        setIntField(term27279, term27279.getClass(), "stringBufferTop", 919994471);
        setIntElement(term27300, 0, 183531701);
        setIntElement(term27300, 1, -974923743);
        setIntElement(term27300, 2, 1876738932);
        setIntElement(term27300, 3, -1870339027);
        setField(term27279, term27279.getClass(), "ungetBuffer", term27300);
        setIntField(term27279, term27279.getClass(), "ungetCursor", -1549603566);
        setBooleanField(term27279, term27279.getClass(), "hitEOF", true);
        setIntField(term27279, term27279.getClass(), "lineStart", 1077223540);
        setIntField(term27279, term27279.getClass(), "lineEndChar", -1823813592);
        setIntField(term27279, term27279.getClass(), "lineno", -1644358555);
        setIntField(term27279, term27279.getClass(), "charno", -388591034);
        setIntField(term27279, term27279.getClass(), "initCharno", -1270258033);
        setIntField(term27279, term27279.getClass(), "initLineno", 1677994069);
        setField(term27279, term27279.getClass(), "sourceString", "wWWidPCHzx");
        setIntField(term27279, term27279.getClass(), "sourceEnd", -439999692);
        setIntField(term27279, term27279.getClass(), "sourceCursor", 924095007);
        setIntField(term27279, term27279.getClass(), "cursor", 1302110708);
        setIntField(term27279, term27279.getClass(), "tokenBeg", 594705497);
        setIntField(term27279, term27279.getClass(), "tokenEnd", -600102466);
        setField(term27278, term27278.getClass(), "stream", term27279);
        setField(term27333, term27333.getClass(), "root", null);
        setField(term27333, term27333.getClass(), "sourceName", null);
        setField(term27332, term27332.getClass(), "baseType", term27333);
        setField(term27332, term27332.getClass(), "extendedInterfaces", term27334);
        setField(term27332, term27332.getClass(), "implementedInterfaces", term27337);
        setField(term27332, term27332.getClass(), "parameters", term27340);
        setField(term27332, term27332.getClass(), "thrownTypes", term27345);
        setField(term27332, term27332.getClass(), "templateTypeNames", null);
        setField(term27332, term27332.getClass(), "classTemplateTypeNames", null);
        setField(term27332, term27332.getClass(), "description", null);
        setField(term27332, term27332.getClass(), "meaning", null);
        setField(term27332, term27332.getClass(), "deprecated", null);
        setField(term27332, term27332.getClass(), "license", null);
        setField(term27332, term27332.getClass(), "suppressions", null);
        setField(term27332, term27332.getClass(), "modifies", null);
        setField(term27332, term27332.getClass(), "lendsName", null);
        setBooleanField(term27332, term27332.getClass(), "ngInject", false);
        setField(term27331, term27331.getClass(), "info", term27332);
        setField(term27349, term27349.getClass(), "sourceComment", null);
        setField(term27349, term27349.getClass(), "markers", null);
        setField(term27349, term27349.getClass(), "parameters", null);
        setField(term27349, term27349.getClass(), "throwsDescriptions", null);
        setField(term27349, term27349.getClass(), "blockDescription", null);
        setField(term27349, term27349.getClass(), "fileOverview", null);
        setField(term27349, term27349.getClass(), "returnDescription", null);
        setField(term27349, term27349.getClass(), "version", null);
        setField(term27349, term27349.getClass(), "authors", null);
        setField(term27349, term27349.getClass(), "sees", null);
        setField(term27331, term27331.getClass(), "documentation", term27349);
        setIntField(term27350, term27350.getClass(), "type", 0);
        setField(term27350, term27350.getClass(), "next", null);
        setField(term27350, term27350.getClass(), "first", null);
        setField(term27350, term27350.getClass(), "last", null);
        setField(term27350, term27350.getClass(), "propListHead", null);
        setIntField(term27350, term27350.getClass(), "sourcePosition", 0);
        setField(term27350, term27350.getClass(), "jsType", null);
        setField(term27350, term27350.getClass(), "parent", null);
        setField(term27331, term27331.getClass(), "associatedNode", term27350);
        setField(term27331, term27331.getClass(), "visibility", enum224);
        setIntField(term27331, term27331.getClass(), "bitset", 2132934139);
        setIntField(term27358, term27358.getClass(), "type", 0);
        setField(term27358, term27358.getClass(), "next", null);
        setField(term27358, term27358.getClass(), "first", null);
        setField(term27358, term27358.getClass(), "last", null);
        setField(term27358, term27358.getClass(), "propListHead", null);
        setIntField(term27358, term27358.getClass(), "sourcePosition", 0);
        setField(term27358, term27358.getClass(), "jsType", null);
        setField(term27358, term27358.getClass(), "parent", null);
        setField(term27357, term27357.getClass(), "root", term27358);
        setField(term27357, term27357.getClass(), "sourceName", "");
        setField(term27331, term27331.getClass(), "type", term27357);
        setIntField(term27363, term27363.getClass(), "type", 0);
        setField(term27363, term27363.getClass(), "next", null);
        setField(term27363, term27363.getClass(), "first", null);
        setField(term27363, term27363.getClass(), "last", null);
        setField(term27363, term27363.getClass(), "propListHead", null);
        setIntField(term27363, term27363.getClass(), "sourcePosition", 0);
        setField(term27363, term27363.getClass(), "jsType", null);
        setField(term27363, term27363.getClass(), "parent", null);
        setField(term27362, term27362.getClass(), "root", term27363);
        setField(term27362, term27362.getClass(), "sourceName", "");
        setField(term27331, term27331.getClass(), "thisType", term27362);
        setBooleanField(term27331, term27331.getClass(), "includeDocumentation", true);
        setField(term27330, term27330.getClass(), "currentInfo", term27331);
        setBooleanField(term27330, term27330.getClass(), "populated", true);
        setBooleanField(term27330, term27330.getClass(), "parseDocumentation", false);
        setField(term27371, term27371.getClass(), "item", null);
        setIntField(term27371, term27371.getClass(), "startLineno", 0);
        setIntField(term27371, term27371.getClass(), "startCharno", 0);
        setIntField(term27371, term27371.getClass(), "endLineno", 0);
        setIntField(term27371, term27371.getClass(), "endCharno", 0);
        setField(term27370, term27370.getClass(), "annotation", term27371);
        setField(term27376, term27376.getClass(), "item", null);
        setIntField(term27376, term27376.getClass(), "startLineno", 0);
        setIntField(term27376, term27376.getClass(), "startCharno", 0);
        setIntField(term27376, term27376.getClass(), "endLineno", 0);
        setIntField(term27376, term27376.getClass(), "endCharno", 0);
        setField(term27370, term27370.getClass(), "name", term27376);
        setField(term27370, term27370.getClass(), "nameNode", null);
        setField(term27370, term27370.getClass(), "description", null);
        setField(term27370, term27370.getClass(), "type", null);
        setField(term27330, term27330.getClass(), "currentMarker", term27370);
        setField(term27278, term27278.getClass(), "jsdocBuilder", term27330);
        setField(term27278, term27278.getClass(), "sourceFile", null);
        setField(term27278, term27278.getClass(), "associatedNode", term27358);
        setField(term27278, term27278.getClass(), "errorReporter", null);
        setField(term27278, term27278.getClass(), "parser", null);
        setField(term27278, term27278.getClass(), "templateNode", null);
        setField(term27278, term27278.getClass(), "fileOverviewJSDocInfo", null);
        setField(term27278, term27278.getClass(), "state", null);
        setField(term27278, term27278.getClass(), "annotationNames", null);
        setField(term27278, term27278.getClass(), "suppressionNames", null);
        setField(term27278, term27278.getClass(), "fileLevelJsDocBuilder", null);
        setField(term27278, term27278.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term27278, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


