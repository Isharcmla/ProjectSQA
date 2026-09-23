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

public class JsDocInfoParser_parseFieldName_1309712796101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23648;
     Object enum216;

    public JsDocInfoParser_parseFieldName_1309712796101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23704 = new ArrayList();
        ((ArrayList) term23704).add((Object)null);
        ((ArrayList) term23704).add((Object)null);
        ((ArrayList) term23704).add((Object)null);
        ((ArrayList) term23704).add((Object)null);
        ArrayList term23707 = new ArrayList();
        ((ArrayList) term23707).add((Object)null);
        ((ArrayList) term23707).add((Object)null);
        ((ArrayList) term23707).add((Object)null);
        ((ArrayList) term23707).add((Object)null);
        ((ArrayList) term23707).add((Object)null);
        ((ArrayList) term23707).add((Object)null);
        HashMap term23710 = new HashMap();
        ArrayList term23715 = new ArrayList();
        ((ArrayList) term23715).add((Object)null);
        ((ArrayList) term23715).add((Object)null);
        ((ArrayList) term23715).add((Object)null);
        ((ArrayList) term23715).add((Object)null);
        ((ArrayList) term23715).add((Object)null);
        Class<? extends Object> term119703 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term119702 = ((Class) term119703).getDeclaredField((String) "PRIVATE");
        ((Field) term119702).setAccessible(true);
        Object enum215 = ((Field) term119702).get((Object) null);
        term23648 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term23649 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term23662 = (char[]) newCharArray(3);
        int[] term23667 = (int[]) newIntArray(7);
        Object term23700 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term23701 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term23702 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term23703 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23719 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term23720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23736 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term23737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23744 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term23745 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23750 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term23755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23649, term23649.getClass(), "string", "BYrGukTyof");
        setCharElement(term23662, 0, 's');
        setCharElement(term23662, 1, 't');
        setCharElement(term23662, 2, 'b');
        setField(term23649, term23649.getClass(), "stringBuffer", term23662);
        setIntField(term23649, term23649.getClass(), "stringBufferTop", -511248284);
        setIntElement(term23667, 0, 788630042);
        setIntElement(term23667, 1, 1430066560);
        setIntElement(term23667, 2, 836734074);
        setIntElement(term23667, 3, -1747711865);
        setIntElement(term23667, 4, 682812715);
        setIntElement(term23667, 5, -1092883950);
        setIntElement(term23667, 6, 950385621);
        setField(term23649, term23649.getClass(), "ungetBuffer", term23667);
        setIntField(term23649, term23649.getClass(), "ungetCursor", -232352320);
        setBooleanField(term23649, term23649.getClass(), "hitEOF", true);
        setIntField(term23649, term23649.getClass(), "lineStart", -232333014);
        setIntField(term23649, term23649.getClass(), "lineEndChar", -139694079);
        setIntField(term23649, term23649.getClass(), "lineno", -1602072035);
        setIntField(term23649, term23649.getClass(), "charno", 1902624392);
        setIntField(term23649, term23649.getClass(), "initCharno", 904607217);
        setIntField(term23649, term23649.getClass(), "initLineno", 434914590);
        setField(term23649, term23649.getClass(), "sourceString", "jiCGTTzKGB");
        setIntField(term23649, term23649.getClass(), "sourceEnd", 1983756621);
        setIntField(term23649, term23649.getClass(), "sourceCursor", -2134711835);
        setIntField(term23649, term23649.getClass(), "cursor", -1641244494);
        setIntField(term23649, term23649.getClass(), "tokenBeg", 1124282188);
        setIntField(term23649, term23649.getClass(), "tokenEnd", -489441521);
        setField(term23648, term23648.getClass(), "stream", term23649);
        setField(term23703, term23703.getClass(), "root", null);
        setField(term23703, term23703.getClass(), "sourceName", null);
        setField(term23702, term23702.getClass(), "baseType", term23703);
        setField(term23702, term23702.getClass(), "extendedInterfaces", term23704);
        setField(term23702, term23702.getClass(), "implementedInterfaces", term23707);
        setField(term23702, term23702.getClass(), "parameters", term23710);
        setField(term23702, term23702.getClass(), "thrownTypes", term23715);
        setField(term23702, term23702.getClass(), "templateTypeNames", null);
        setField(term23702, term23702.getClass(), "classTemplateTypeNames", null);
        setField(term23702, term23702.getClass(), "description", null);
        setField(term23702, term23702.getClass(), "meaning", null);
        setField(term23702, term23702.getClass(), "deprecated", null);
        setField(term23702, term23702.getClass(), "license", null);
        setField(term23702, term23702.getClass(), "suppressions", null);
        setField(term23702, term23702.getClass(), "modifies", null);
        setField(term23702, term23702.getClass(), "lendsName", null);
        setBooleanField(term23702, term23702.getClass(), "ngInject", false);
        setField(term23701, term23701.getClass(), "info", term23702);
        setField(term23719, term23719.getClass(), "sourceComment", null);
        setField(term23719, term23719.getClass(), "markers", null);
        setField(term23719, term23719.getClass(), "parameters", null);
        setField(term23719, term23719.getClass(), "throwsDescriptions", null);
        setField(term23719, term23719.getClass(), "blockDescription", null);
        setField(term23719, term23719.getClass(), "fileOverview", null);
        setField(term23719, term23719.getClass(), "returnDescription", null);
        setField(term23719, term23719.getClass(), "version", null);
        setField(term23719, term23719.getClass(), "authors", null);
        setField(term23719, term23719.getClass(), "sees", null);
        setField(term23701, term23701.getClass(), "documentation", term23719);
        setIntField(term23720, term23720.getClass(), "type", 529879356);
        setIntField(term23722, term23722.getClass(), "type", 18072182);
        setField(term23722, term23722.getClass(), "next", null);
        setField(term23722, term23722.getClass(), "first", null);
        setField(term23722, term23722.getClass(), "last", null);
        setField(term23722, term23722.getClass(), "propListHead", null);
        setIntField(term23722, term23722.getClass(), "sourcePosition", 0);
        setField(term23722, term23722.getClass(), "jsType", null);
        setField(term23722, term23722.getClass(), "parent", null);
        setField(term23720, term23720.getClass(), "next", term23722);
        setIntField(term23725, term23725.getClass(), "type", 225873732);
        setField(term23725, term23725.getClass(), "next", term23720);
        setField(term23725, term23725.getClass(), "first", null);
        setField(term23725, term23725.getClass(), "last", term23720);
        setField(term23725, term23725.getClass(), "propListHead", null);
        setIntField(term23725, term23725.getClass(), "sourcePosition", 0);
        setField(term23725, term23725.getClass(), "jsType", null);
        setField(term23725, term23725.getClass(), "parent", null);
        setField(term23720, term23720.getClass(), "first", term23725);
        setIntField(term23728, term23728.getClass(), "type", 0);
        setField(term23728, term23728.getClass(), "next", null);
        setField(term23728, term23728.getClass(), "first", null);
        setField(term23728, term23728.getClass(), "last", null);
        setField(term23728, term23728.getClass(), "propListHead", null);
        setIntField(term23728, term23728.getClass(), "sourcePosition", 0);
        setField(term23728, term23728.getClass(), "jsType", null);
        setField(term23728, term23728.getClass(), "parent", null);
        setField(term23720, term23720.getClass(), "last", term23728);
        setField(term23720, term23720.getClass(), "propListHead", null);
        setIntField(term23720, term23720.getClass(), "sourcePosition", 0);
        setField(term23720, term23720.getClass(), "jsType", null);
        setField(term23720, term23720.getClass(), "parent", null);
        setField(term23701, term23701.getClass(), "associatedNode", term23720);
        setField(term23701, term23701.getClass(), "visibility", enum215);
        setIntField(term23701, term23701.getClass(), "bitset", -819372164);
        setIntField(term23737, term23737.getClass(), "type", 0);
        setField(term23737, term23737.getClass(), "next", null);
        setField(term23737, term23737.getClass(), "first", null);
        setField(term23737, term23737.getClass(), "last", null);
        setField(term23737, term23737.getClass(), "propListHead", null);
        setIntField(term23737, term23737.getClass(), "sourcePosition", 0);
        setField(term23737, term23737.getClass(), "jsType", null);
        setField(term23737, term23737.getClass(), "parent", null);
        setField(term23736, term23736.getClass(), "root", term23737);
        setField(term23736, term23736.getClass(), "sourceName", "");
        setField(term23701, term23701.getClass(), "type", term23736);
        setField(term23701, term23701.getClass(), "thisType", term23736);
        setBooleanField(term23701, term23701.getClass(), "includeDocumentation", false);
        setField(term23700, term23700.getClass(), "currentInfo", term23701);
        setBooleanField(term23700, term23700.getClass(), "populated", false);
        setBooleanField(term23700, term23700.getClass(), "parseDocumentation", false);
        setField(term23745, term23745.getClass(), "item", null);
        setIntField(term23745, term23745.getClass(), "startLineno", 0);
        setIntField(term23745, term23745.getClass(), "startCharno", 0);
        setIntField(term23745, term23745.getClass(), "endLineno", 0);
        setIntField(term23745, term23745.getClass(), "endCharno", 0);
        setField(term23744, term23744.getClass(), "annotation", term23745);
        setField(term23750, term23750.getClass(), "item", null);
        setIntField(term23750, term23750.getClass(), "startLineno", 0);
        setIntField(term23750, term23750.getClass(), "startCharno", 0);
        setIntField(term23750, term23750.getClass(), "endLineno", 0);
        setIntField(term23750, term23750.getClass(), "endCharno", 0);
        setField(term23744, term23744.getClass(), "name", term23750);
        setField(term23744, term23744.getClass(), "nameNode", null);
        setField(term23744, term23744.getClass(), "description", null);
        setField(term23744, term23744.getClass(), "type", null);
        setField(term23700, term23700.getClass(), "currentMarker", term23744);
        setField(term23648, term23648.getClass(), "jsdocBuilder", term23700);
        setField(term23648, term23648.getClass(), "sourceFile", null);
        setIntField(term23755, term23755.getClass(), "type", 0);
        setField(term23755, term23755.getClass(), "next", null);
        setField(term23755, term23755.getClass(), "first", null);
        setField(term23755, term23755.getClass(), "last", null);
        setField(term23755, term23755.getClass(), "propListHead", null);
        setIntField(term23755, term23755.getClass(), "sourcePosition", 0);
        setField(term23755, term23755.getClass(), "jsType", null);
        setField(term23755, term23755.getClass(), "parent", null);
        setField(term23648, term23648.getClass(), "associatedNode", term23755);
        setField(term23648, term23648.getClass(), "errorReporter", null);
        setField(term23648, term23648.getClass(), "parser", null);
        setField(term23648, term23648.getClass(), "templateNode", null);
        setField(term23648, term23648.getClass(), "fileOverviewJSDocInfo", null);
        setField(term23648, term23648.getClass(), "state", null);
        setField(term23648, term23648.getClass(), "annotationNames", null);
        setField(term23648, term23648.getClass(), "suppressionNames", null);
        setField(term23648, term23648.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23648, term23648.getClass(), "unreadToken", null);
        Class<? extends Object> term119971 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term119970 = ((Class) term119971).getDeclaredField((String) "STRING");
        ((Field) term119970).setAccessible(true);
        enum216 = ((Field) term119970).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum216;
        try {
            callMethod(klass, "parseFieldName", argTypes, term23648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


