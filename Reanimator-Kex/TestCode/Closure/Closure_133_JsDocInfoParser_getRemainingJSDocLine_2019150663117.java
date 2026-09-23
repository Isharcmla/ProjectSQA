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

public class JsDocInfoParser_getRemainingJSDocLine_2019150663117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31855;

    public JsDocInfoParser_getRemainingJSDocLine_2019150663117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31912 = new ArrayList();
        ((ArrayList) term31912).add((Object)null);
        ((ArrayList) term31912).add((Object)null);
        ArrayList term31915 = new ArrayList();
        ((ArrayList) term31915).add((Object)null);
        ((ArrayList) term31915).add((Object)null);
        ((ArrayList) term31915).add((Object)null);
        ((ArrayList) term31915).add((Object)null);
        HashMap term31918 = new HashMap();
        ArrayList term31923 = new ArrayList();
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        ((ArrayList) term31923).add((Object)null);
        Class<? extends Object> term126528 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term126527 = ((Class) term126528).getDeclaredField((String) "INHERITED");
        ((Field) term126527).setAccessible(true);
        Object enum237 = ((Field) term126527).get((Object) null);
        term31855 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term31856 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term31869 = (char[]) newCharArray(6);
        int[] term31877 = (int[]) newIntArray(5);
        Object term31908 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term31909 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term31910 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term31911 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31927 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term31928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31944 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term31945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31952 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term31953 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31958 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term31963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term31856, term31856.getClass(), "string", "BOvgwHfoHQ");
        setCharElement(term31869, 0, 'v');
        setCharElement(term31869, 1, 'r');
        setCharElement(term31869, 2, 'Q');
        setCharElement(term31869, 3, 'L');
        setCharElement(term31869, 4, 'u');
        setCharElement(term31869, 5, 'W');
        setField(term31856, term31856.getClass(), "stringBuffer", term31869);
        setIntField(term31856, term31856.getClass(), "stringBufferTop", 249657454);
        setIntElement(term31877, 0, 1734630901);
        setIntElement(term31877, 1, -703815246);
        setIntElement(term31877, 2, 157300746);
        setIntElement(term31877, 3, -1600748613);
        setIntElement(term31877, 4, -1509192782);
        setField(term31856, term31856.getClass(), "ungetBuffer", term31877);
        setIntField(term31856, term31856.getClass(), "ungetCursor", -867925573);
        setBooleanField(term31856, term31856.getClass(), "hitEOF", true);
        setIntField(term31856, term31856.getClass(), "lineStart", 478422495);
        setIntField(term31856, term31856.getClass(), "lineEndChar", 1727771237);
        setIntField(term31856, term31856.getClass(), "lineno", 2033663549);
        setIntField(term31856, term31856.getClass(), "charno", 1766479154);
        setIntField(term31856, term31856.getClass(), "initCharno", 533171496);
        setIntField(term31856, term31856.getClass(), "initLineno", 1369020869);
        setField(term31856, term31856.getClass(), "sourceString", "hPpFNeDBIb");
        setIntField(term31856, term31856.getClass(), "sourceEnd", -1428947021);
        setIntField(term31856, term31856.getClass(), "sourceCursor", -134324004);
        setIntField(term31856, term31856.getClass(), "cursor", -1813266173);
        setIntField(term31856, term31856.getClass(), "tokenBeg", -1201819537);
        setIntField(term31856, term31856.getClass(), "tokenEnd", 2135922049);
        setField(term31855, term31855.getClass(), "stream", term31856);
        setField(term31911, term31911.getClass(), "root", null);
        setField(term31911, term31911.getClass(), "sourceName", null);
        setField(term31910, term31910.getClass(), "baseType", term31911);
        setField(term31910, term31910.getClass(), "extendedInterfaces", term31912);
        setField(term31910, term31910.getClass(), "implementedInterfaces", term31915);
        setField(term31910, term31910.getClass(), "parameters", term31918);
        setField(term31910, term31910.getClass(), "thrownTypes", term31923);
        setField(term31910, term31910.getClass(), "templateTypeNames", null);
        setField(term31910, term31910.getClass(), "classTemplateTypeNames", null);
        setField(term31910, term31910.getClass(), "description", null);
        setField(term31910, term31910.getClass(), "meaning", null);
        setField(term31910, term31910.getClass(), "deprecated", null);
        setField(term31910, term31910.getClass(), "license", null);
        setField(term31910, term31910.getClass(), "suppressions", null);
        setField(term31910, term31910.getClass(), "modifies", null);
        setField(term31910, term31910.getClass(), "lendsName", null);
        setBooleanField(term31910, term31910.getClass(), "ngInject", false);
        setField(term31909, term31909.getClass(), "info", term31910);
        setField(term31927, term31927.getClass(), "sourceComment", null);
        setField(term31927, term31927.getClass(), "markers", null);
        setField(term31927, term31927.getClass(), "parameters", null);
        setField(term31927, term31927.getClass(), "throwsDescriptions", null);
        setField(term31927, term31927.getClass(), "blockDescription", null);
        setField(term31927, term31927.getClass(), "fileOverview", null);
        setField(term31927, term31927.getClass(), "returnDescription", null);
        setField(term31927, term31927.getClass(), "version", null);
        setField(term31927, term31927.getClass(), "authors", null);
        setField(term31927, term31927.getClass(), "sees", null);
        setField(term31909, term31909.getClass(), "documentation", term31927);
        setIntField(term31928, term31928.getClass(), "type", -755209283);
        setIntField(term31930, term31930.getClass(), "type", -616562794);
        setField(term31930, term31930.getClass(), "next", null);
        setField(term31930, term31930.getClass(), "first", null);
        setField(term31930, term31930.getClass(), "last", null);
        setField(term31930, term31930.getClass(), "propListHead", null);
        setIntField(term31930, term31930.getClass(), "sourcePosition", 0);
        setField(term31930, term31930.getClass(), "jsType", null);
        setField(term31930, term31930.getClass(), "parent", null);
        setField(term31928, term31928.getClass(), "next", term31930);
        setIntField(term31933, term31933.getClass(), "type", -263876378);
        setField(term31933, term31933.getClass(), "next", term31928);
        setField(term31933, term31933.getClass(), "first", null);
        setField(term31933, term31933.getClass(), "last", term31928);
        setField(term31933, term31933.getClass(), "propListHead", null);
        setIntField(term31933, term31933.getClass(), "sourcePosition", 0);
        setField(term31933, term31933.getClass(), "jsType", null);
        setField(term31933, term31933.getClass(), "parent", null);
        setField(term31928, term31928.getClass(), "first", term31933);
        setIntField(term31936, term31936.getClass(), "type", 0);
        setField(term31936, term31936.getClass(), "next", null);
        setField(term31936, term31936.getClass(), "first", null);
        setField(term31936, term31936.getClass(), "last", null);
        setField(term31936, term31936.getClass(), "propListHead", null);
        setIntField(term31936, term31936.getClass(), "sourcePosition", 0);
        setField(term31936, term31936.getClass(), "jsType", null);
        setField(term31936, term31936.getClass(), "parent", null);
        setField(term31928, term31928.getClass(), "last", term31936);
        setField(term31928, term31928.getClass(), "propListHead", null);
        setIntField(term31928, term31928.getClass(), "sourcePosition", 0);
        setField(term31928, term31928.getClass(), "jsType", null);
        setField(term31928, term31928.getClass(), "parent", null);
        setField(term31909, term31909.getClass(), "associatedNode", term31928);
        setField(term31909, term31909.getClass(), "visibility", enum237);
        setIntField(term31909, term31909.getClass(), "bitset", -298939768);
        setIntField(term31945, term31945.getClass(), "type", 0);
        setField(term31945, term31945.getClass(), "next", null);
        setField(term31945, term31945.getClass(), "first", null);
        setField(term31945, term31945.getClass(), "last", null);
        setField(term31945, term31945.getClass(), "propListHead", null);
        setIntField(term31945, term31945.getClass(), "sourcePosition", 0);
        setField(term31945, term31945.getClass(), "jsType", null);
        setField(term31945, term31945.getClass(), "parent", null);
        setField(term31944, term31944.getClass(), "root", term31945);
        setField(term31944, term31944.getClass(), "sourceName", "");
        setField(term31909, term31909.getClass(), "type", term31944);
        setField(term31909, term31909.getClass(), "thisType", term31944);
        setBooleanField(term31909, term31909.getClass(), "includeDocumentation", false);
        setField(term31908, term31908.getClass(), "currentInfo", term31909);
        setBooleanField(term31908, term31908.getClass(), "populated", false);
        setBooleanField(term31908, term31908.getClass(), "parseDocumentation", false);
        setField(term31953, term31953.getClass(), "item", null);
        setIntField(term31953, term31953.getClass(), "startLineno", 0);
        setIntField(term31953, term31953.getClass(), "startCharno", 0);
        setIntField(term31953, term31953.getClass(), "endLineno", 0);
        setIntField(term31953, term31953.getClass(), "endCharno", 0);
        setField(term31952, term31952.getClass(), "annotation", term31953);
        setField(term31958, term31958.getClass(), "item", null);
        setIntField(term31958, term31958.getClass(), "startLineno", 0);
        setIntField(term31958, term31958.getClass(), "startCharno", 0);
        setIntField(term31958, term31958.getClass(), "endLineno", 0);
        setIntField(term31958, term31958.getClass(), "endCharno", 0);
        setField(term31952, term31952.getClass(), "name", term31958);
        setField(term31952, term31952.getClass(), "nameNode", null);
        setField(term31952, term31952.getClass(), "description", null);
        setField(term31952, term31952.getClass(), "type", null);
        setField(term31908, term31908.getClass(), "currentMarker", term31952);
        setField(term31855, term31855.getClass(), "jsdocBuilder", term31908);
        setField(term31855, term31855.getClass(), "sourceFile", null);
        setIntField(term31963, term31963.getClass(), "type", 0);
        setField(term31963, term31963.getClass(), "next", null);
        setField(term31963, term31963.getClass(), "first", null);
        setField(term31963, term31963.getClass(), "last", null);
        setField(term31963, term31963.getClass(), "propListHead", null);
        setIntField(term31963, term31963.getClass(), "sourcePosition", 0);
        setField(term31963, term31963.getClass(), "jsType", null);
        setField(term31963, term31963.getClass(), "parent", null);
        setField(term31855, term31855.getClass(), "associatedNode", term31963);
        setField(term31855, term31855.getClass(), "errorReporter", null);
        setField(term31855, term31855.getClass(), "parser", null);
        setField(term31855, term31855.getClass(), "templateNode", null);
        setField(term31855, term31855.getClass(), "fileOverviewJSDocInfo", null);
        setField(term31855, term31855.getClass(), "state", null);
        setField(term31855, term31855.getClass(), "annotationNames", null);
        setField(term31855, term31855.getClass(), "suppressionNames", null);
        setField(term31855, term31855.getClass(), "fileLevelJsDocBuilder", null);
        setField(term31855, term31855.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRemainingJSDocLine", argTypes, term31855, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


