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

public class JsDocInfoParser_parse_198977473465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2507;

    public JsDocInfoParser_parse_198977473465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2557 = new ArrayList();
        ((ArrayList) term2557).add((Object)null);
        ArrayList term2560 = new ArrayList();
        HashMap term2563 = new HashMap();
        ArrayList term2568 = new ArrayList();
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        ((ArrayList) term2568).add((Object)null);
        HashSet term2576 = new HashSet();
        HashSet term2577 = new HashSet();
        ArrayList term2581 = new ArrayList();
        ((ArrayList) term2581).add((Object)null);
        HashMap term2584 = new HashMap();
        Class<? extends Object> term77358 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term77357 = ((Class) term77358).getDeclaredField((String) "PROTECTED");
        ((Field) term77357).setAccessible(true);
        Object enum149 = ((Field) term77357).get((Object) null);
        term2507 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term2508 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term2521 = (char[]) newCharArray(2);
        int[] term2525 = (int[]) newIntArray(2);
        Object term2553 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term2554 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2555 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2556 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2579 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2596 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2601 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2609 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term2610 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term2615 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term2620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2508, term2508.getClass(), "string", "AdxvLJhNLe");
        setCharElement(term2521, 0, 'L');
        setCharElement(term2521, 1, 'c');
        setField(term2508, term2508.getClass(), "stringBuffer", term2521);
        setIntField(term2508, term2508.getClass(), "stringBufferTop", -1963434938);
        setIntElement(term2525, 0, 906181092);
        setIntElement(term2525, 1, 1045657203);
        setField(term2508, term2508.getClass(), "ungetBuffer", term2525);
        setIntField(term2508, term2508.getClass(), "ungetCursor", 1386130016);
        setBooleanField(term2508, term2508.getClass(), "hitEOF", true);
        setIntField(term2508, term2508.getClass(), "lineStart", 1072005683);
        setIntField(term2508, term2508.getClass(), "lineEndChar", 1861318859);
        setIntField(term2508, term2508.getClass(), "lineno", 1474524152);
        setIntField(term2508, term2508.getClass(), "charno", 568954359);
        setIntField(term2508, term2508.getClass(), "initCharno", 53410913);
        setIntField(term2508, term2508.getClass(), "initLineno", -375014958);
        setField(term2508, term2508.getClass(), "sourceString", "lHfTrWKMPk");
        setIntField(term2508, term2508.getClass(), "sourceEnd", 1107176718);
        setIntField(term2508, term2508.getClass(), "sourceCursor", 480137250);
        setIntField(term2508, term2508.getClass(), "cursor", -341152642);
        setIntField(term2508, term2508.getClass(), "tokenBeg", -2015854073);
        setIntField(term2508, term2508.getClass(), "tokenEnd", 538259104);
        setField(term2507, term2507.getClass(), "stream", term2508);
        setField(term2556, term2556.getClass(), "root", null);
        setField(term2556, term2556.getClass(), "sourceName", null);
        setField(term2555, term2555.getClass(), "baseType", term2556);
        setField(term2555, term2555.getClass(), "extendedInterfaces", term2557);
        setField(term2555, term2555.getClass(), "implementedInterfaces", term2560);
        setField(term2555, term2555.getClass(), "parameters", term2563);
        setField(term2555, term2555.getClass(), "thrownTypes", term2568);
        setField(term2555, term2555.getClass(), "templateTypeName", "");
        setField(term2555, term2555.getClass(), "description", "");
        setField(term2555, term2555.getClass(), "meaning", "");
        setField(term2555, term2555.getClass(), "deprecated", "");
        setField(term2555, term2555.getClass(), "license", "");
        setField(term2555, term2555.getClass(), "suppressions", term2576);
        setField(term2555, term2555.getClass(), "modifies", term2577);
        setField(term2555, term2555.getClass(), "lendsName", "");
        setField(term2554, term2554.getClass(), "info", term2555);
        setField(term2579, term2579.getClass(), "sourceComment", "");
        setField(term2579, term2579.getClass(), "markers", term2581);
        setField(term2579, term2579.getClass(), "parameters", term2584);
        setField(term2579, term2579.getClass(), "throwsDescriptions", null);
        setField(term2579, term2579.getClass(), "blockDescription", null);
        setField(term2579, term2579.getClass(), "fileOverview", null);
        setField(term2579, term2579.getClass(), "returnDescription", null);
        setField(term2579, term2579.getClass(), "version", null);
        setField(term2579, term2579.getClass(), "authors", null);
        setField(term2579, term2579.getClass(), "sees", null);
        setField(term2554, term2554.getClass(), "documentation", term2579);
        setIntField(term2589, term2589.getClass(), "type", 0);
        setField(term2589, term2589.getClass(), "next", null);
        setField(term2589, term2589.getClass(), "first", null);
        setField(term2589, term2589.getClass(), "last", null);
        setField(term2589, term2589.getClass(), "propListHead", null);
        setIntField(term2589, term2589.getClass(), "sourcePosition", 0);
        setField(term2589, term2589.getClass(), "jsType", null);
        setField(term2589, term2589.getClass(), "parent", null);
        setField(term2554, term2554.getClass(), "associatedNode", term2589);
        setField(term2554, term2554.getClass(), "visibility", enum149);
        setIntField(term2554, term2554.getClass(), "bitset", 1202361360);
        setIntField(term2597, term2597.getClass(), "type", 107945604);
        setField(term2597, term2597.getClass(), "next", null);
        setField(term2597, term2597.getClass(), "first", null);
        setField(term2597, term2597.getClass(), "last", null);
        setField(term2597, term2597.getClass(), "propListHead", null);
        setIntField(term2597, term2597.getClass(), "sourcePosition", 0);
        setField(term2597, term2597.getClass(), "jsType", null);
        setField(term2597, term2597.getClass(), "parent", null);
        setField(term2596, term2596.getClass(), "root", term2597);
        setField(term2596, term2596.getClass(), "sourceName", "");
        setField(term2554, term2554.getClass(), "type", term2596);
        setIntField(term2602, term2602.getClass(), "type", 0);
        setField(term2602, term2602.getClass(), "next", null);
        setField(term2602, term2602.getClass(), "first", null);
        setField(term2602, term2602.getClass(), "last", null);
        setField(term2602, term2602.getClass(), "propListHead", null);
        setIntField(term2602, term2602.getClass(), "sourcePosition", 0);
        setField(term2602, term2602.getClass(), "jsType", null);
        setField(term2602, term2602.getClass(), "parent", null);
        setField(term2601, term2601.getClass(), "root", term2602);
        setField(term2601, term2601.getClass(), "sourceName", "");
        setField(term2554, term2554.getClass(), "thisType", term2601);
        setBooleanField(term2554, term2554.getClass(), "includeDocumentation", false);
        setField(term2553, term2553.getClass(), "currentInfo", term2554);
        setBooleanField(term2553, term2553.getClass(), "populated", false);
        setBooleanField(term2553, term2553.getClass(), "parseDocumentation", true);
        setField(term2610, term2610.getClass(), "item", null);
        setIntField(term2610, term2610.getClass(), "startLineno", 0);
        setIntField(term2610, term2610.getClass(), "startCharno", 0);
        setIntField(term2610, term2610.getClass(), "endLineno", 0);
        setIntField(term2610, term2610.getClass(), "endCharno", 0);
        setField(term2609, term2609.getClass(), "annotation", term2610);
        setField(term2615, term2615.getClass(), "item", null);
        setIntField(term2615, term2615.getClass(), "startLineno", 0);
        setIntField(term2615, term2615.getClass(), "startCharno", 0);
        setIntField(term2615, term2615.getClass(), "endLineno", 0);
        setIntField(term2615, term2615.getClass(), "endCharno", 0);
        setField(term2609, term2609.getClass(), "name", term2615);
        setField(term2609, term2609.getClass(), "nameNode", null);
        setField(term2609, term2609.getClass(), "description", null);
        setField(term2609, term2609.getClass(), "type", null);
        setField(term2553, term2553.getClass(), "currentMarker", term2609);
        setField(term2507, term2507.getClass(), "jsdocBuilder", term2553);
        setField(term2507, term2507.getClass(), "sourceFile", null);
        setIntField(term2620, term2620.getClass(), "type", 71190297);
        setIntField(term2622, term2622.getClass(), "type", 0);
        setField(term2622, term2622.getClass(), "next", null);
        setField(term2622, term2622.getClass(), "first", null);
        setField(term2622, term2622.getClass(), "last", null);
        setField(term2622, term2622.getClass(), "propListHead", null);
        setIntField(term2622, term2622.getClass(), "sourcePosition", 0);
        setField(term2622, term2622.getClass(), "jsType", null);
        setField(term2622, term2622.getClass(), "parent", null);
        setField(term2620, term2620.getClass(), "next", term2622);
        setIntField(term2625, term2625.getClass(), "type", 0);
        setField(term2625, term2625.getClass(), "next", null);
        setField(term2625, term2625.getClass(), "first", null);
        setField(term2625, term2625.getClass(), "last", null);
        setField(term2625, term2625.getClass(), "propListHead", null);
        setIntField(term2625, term2625.getClass(), "sourcePosition", 0);
        setField(term2625, term2625.getClass(), "jsType", null);
        setField(term2625, term2625.getClass(), "parent", null);
        setField(term2620, term2620.getClass(), "first", term2625);
        setField(term2620, term2620.getClass(), "last", term2602);
        setField(term2620, term2620.getClass(), "propListHead", null);
        setIntField(term2620, term2620.getClass(), "sourcePosition", 0);
        setField(term2620, term2620.getClass(), "jsType", null);
        setField(term2620, term2620.getClass(), "parent", null);
        setField(term2507, term2507.getClass(), "associatedNode", term2620);
        setField(term2507, term2507.getClass(), "errorReporter", null);
        setField(term2507, term2507.getClass(), "parser", null);
        setField(term2507, term2507.getClass(), "templateNode", null);
        setField(term2507, term2507.getClass(), "fileOverviewJSDocInfo", null);
        setField(term2507, term2507.getClass(), "state", null);
        setField(term2507, term2507.getClass(), "annotationNames", null);
        setField(term2507, term2507.getClass(), "suppressionNames", null);
        setField(term2507, term2507.getClass(), "fileLevelJsDocBuilder", null);
        setField(term2507, term2507.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term2507, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


